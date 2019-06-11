import java.util.ArrayList;
import java.util.List;

public class Menu {
  private List<MenuItem> menuItems;

  public Menu() {
    this.menuItems = new ArrayList<MenuItem>();
  }

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void addMenuItem(MenuItem menuItem) {
    menuItems.add(menuItem);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    int counter = 1;
    for(MenuItem item : menuItems) {
      sb.append(counter);
      sb.append(". ");
      sb.append(item.getDisplayText());
      sb.append("\n");

      counter++;
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Menu mainMenu = new Menu();
    MenuItem addBookItem = new MenuItem("Add a book to the reading list");
    MenuItem listBooksItem = new MenuItem("Output the reading list");
    mainMenu.addMenuItem(addBookItem);
    mainMenu.addMenuItem(listBooksItem);
    System.out.println(mainMenu.toString());
  }
}
