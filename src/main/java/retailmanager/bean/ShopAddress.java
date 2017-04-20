package retailmanager.bean;

public class ShopAddress {
	
	private long shopNumber;
	private int shopPostCode;
	private String shopPlace;
	
	public long getShopNumber() {
		return shopNumber;
	}

	public String getShopPlace() {
		return shopPlace;
	}

	public void setShopPlace(String shopPlace) {
		this.shopPlace = shopPlace;
	}

	public void setShopNumber(long shopNumber) {
		this.shopNumber = shopNumber;
	}

	public int getShopPostCode() {
		return shopPostCode;
	}

	public void setShopPostCode(int shopPostCode) {
		this.shopPostCode = shopPostCode;
	}

	@Override
	public String toString() {
		return "ShopAddress [shopNumber=" + shopNumber + ", shopPostCode=" + shopPostCode + ", shopPlace=" + shopPlace
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (shopNumber ^ (shopNumber >>> 32));
		result = prime * result + ((shopPlace == null) ? 0 : shopPlace.hashCode());
		result = prime * result + shopPostCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopAddress other = (ShopAddress) obj;
		if (shopNumber != other.shopNumber)
			return false;
		if (shopPlace == null) {
			if (other.shopPlace != null)
				return false;
		} else if (!shopPlace.equals(other.shopPlace))
			return false;
		if (shopPostCode != other.shopPostCode)
			return false;
		return true;
	}
	
	
}
