import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuTest {
  @Test
  @DisplayName("Initializes an empty menu list")
  public void init_items_empty() {
    Menu menu = new Menu();
    assertEquals(0, menu.getMenuItems().size());
  }

  @Test
  public void addMenuItem_items_increase() {
    Menu menu = new Menu();
    MenuItem menuItem = new MenuItem("Add a book to the reading list");
    menu.addMenuItem(menuItem);
  }

}
