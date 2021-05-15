package entities;



public class ImporteProduct extends Product{
	
	private Double customsFee;
	
	
	public ImporteProduct() {
		super();
	}

	public ImporteProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f", totalPrice()) 
		+ String.format("(Customs fee: $ %.2f)", customsFee);
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}


}
