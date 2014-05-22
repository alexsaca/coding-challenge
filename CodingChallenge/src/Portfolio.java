import java.util.Vector;
public class Portfolio {
	Vector<Asset> Assets;
	
	public Portfolio ()
	{
		Assets = new Vector<Asset>();
	}
	
	public Portfolio(Vector<Asset> Assets)
	{
		this.Assets  = (Vector<Asset>) Assets.clone();
	}
	
	public String Rebalance()
	{
		double totalAmount = 0;
		StringBuilder ret = new StringBuilder();
		
		//Grab Total Amount of the Portfolio
		for(Asset asset : Assets)
		{
			totalAmount += asset.nPrice*asset.nShares;
		}
		
		for (Asset asset: Assets)
		{
			double dPercent =(asset.nPrice*asset.nShares/totalAmount)*100;
			double dDeltaPercent =  (asset.nPrice/totalAmount)*100;
			double difPercent = dPercent - asset.dPercentage;
			
			//Check if it is possible to get closer to the actual percentage
			if(Math.abs(difPercent) > dDeltaPercent)
			{
				double AmountNeeded = Math.abs(difPercent/100)*totalAmount;
				String str;
				if(difPercent > 0)
				{
					str = "Sell " + Math.floor(AmountNeeded/asset.nPrice)  + " shares of " + asset.strTicker + ", ";
					
				}
				else
				{
					str = "Buy " + Math.floor(AmountNeeded/asset.nPrice)  + " shares of " + asset.strTicker + ", ";
				}
				
				ret.append(str);
			}
		}

		ret.delete(ret.length()-2, ret.length());
		return ret.toString();
		
	}
	
}
