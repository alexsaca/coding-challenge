Two classes were needed for this project an Asset class and 
a Portfolio Class. One of the trade-offs I had was the totalAmount 
variable on the Portfolio class, I decided to calculate the totalAmount
everytime the rebalance function was called, instead of saving the totalAmount
as a member variable.
One thing that I would have done different if I were to spend more time was
to introduce tabu search into the rebalancing function to find the most 
optimal percentages combination for the portafolio
Also I would have cleaned up the Asset Class and # of shares and their price
private.