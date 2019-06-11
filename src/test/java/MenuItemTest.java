import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MenuItemTest {
  @Test
  public void init_message_present() {
    String displayText = "Add a book to the reading list";
    MenuItem item = new MenuItem(displayText);
    assertEquals(displayText, item.getDisplayText());
  }

}
