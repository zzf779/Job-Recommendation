package entity;

import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Purify the Info
 */

public class Item {
	
	private String itemid;
	private String name;
	private String address;
	private Set<String> keywords;
	private String imageUrl;
	private String url;
	
	public String getItemid() {
		return itemid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Set<String> getKeywords() {
		return keywords;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getUrl() {
		return url;
	}
	
	public JSONObject toJSONObject() {
		JSONObject obj = new JSONObject();
		obj.put("item_id", itemid).put("name", name).put("address", address)
		.put("keywords", new JSONArray(keywords)).put("image_url", imageUrl)
		.put("url", url);
		return obj;
	}

	private Item (ItemBuilder builder) {
		this.itemid = builder.itemid;
		this.name = builder.name;
		this.address = builder.address;
		this.imageUrl = builder.imageUrl;
		this.url = builder.url;
		this.keywords = builder.keywords;
	}

	//static inner class
	public static class ItemBuilder {
		
		private String itemid;
		private String name;
		private String address;
		private String imageUrl;
		private String url;
		private Set<String> keywords;
		
		public void setItemid(String itemid) {
			this.itemid = itemid;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		
		public void setUrl(String url) {
			this.url = url;
		}
		
		public void setKeywords(Set<String> keywords) {
			this.keywords = keywords;
		}
		
		public Item build() {
			return new Item(this);
		}
	}
}
