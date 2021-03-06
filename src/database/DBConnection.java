package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import entity.Item;
import external.ExternalAPI;
import external.ExternalAPIFactory;

public interface DBConnection {
	public void close();
	
	public void setFavoriteItems(String userId, List<String> itemIds);

	public void unsetFavoriteItems(String userId, List<String> itemIds);
	
	public Set<String> getFavoriteItemIds(String userId);

	public Set<Item> getFavoriteItems(String userId);

	public Set<String> getCategories(String itemId);
	
	public void saveItem(Item item);
	
	public List<Item> searchItems(String userId, double lat, double lon, String term);
}
