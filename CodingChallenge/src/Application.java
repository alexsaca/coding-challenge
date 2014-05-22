import java.util.Vector;

public class Application {
	//This would become a vector in the case 
	//you have more than one portfolio
	static Portfolio mPortfolio;
	
	public static void main(String[] args) {
		CreateAssets();
		String strResult = mPortfolio.Rebalance();
		System.out.println(strResult);
	}

	private static void CreateAssets()
	{
		Asset goog = new Asset("GOOG", 98, 52, 60);
		Asset aapl =  new Asset("AAPL", 22, 136, 30);
		Asset TSLA = new Asset("TSLA", 8, 239, 10);
		
		Vector<Asset> vAssets =  new Vector<Asset>();
		
		vAssets.addElement(goog);
		vAssets.addElement(aapl);
		vAssets.addElement(TSLA);
		
		mPortfolio = new Portfolio(vAssets);
	}
}
