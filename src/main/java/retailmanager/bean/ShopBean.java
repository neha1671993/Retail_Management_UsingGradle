package retailmanager.bean;

public class ShopBean {

	private ShopAddress shopAddress;
	private String shopName;
	private double shopLongitude;
	private double shopLatitude;
	
	public ShopAddress getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(ShopAddress shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public double getShopLongitude() {
		return shopLongitude;
	}
	public void setShopLongitude(double shopLongitude) {
		this.shopLongitude = shopLongitude;
	}
	public double getShopLatitude() {
		return shopLatitude;
	}
	public void setShopLatitude(double shopLatitude) {
		this.shopLatitude = shopLatitude;
	}
	
	@Override
	public String toString() {
		return "ShopBean [shopAddress=" + shopAddress + ", shopName=" + shopName + ", shopLongitude=" + shopLongitude
				+ ", shopLatitude=" + shopLatitude + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shopAddress == null) ? 0 : shopAddress.hashCode());
		long temp;
		temp = Double.doubleToLongBits(shopLatitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(shopLongitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
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
		ShopBean other = (ShopBean) obj;
		if (shopAddress == null) {
			if (other.shopAddress != null)
				return false;
		} else if (!shopAddress.equals(other.shopAddress))
			return false;
		if (Double.doubleToLongBits(shopLatitude) != Double.doubleToLongBits(other.shopLatitude))
			return false;
		if (Double.doubleToLongBits(shopLongitude) != Double.doubleToLongBits(other.shopLongitude))
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		return true;
	}
	
	
}
