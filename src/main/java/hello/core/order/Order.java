package hello.core.order;

public class Order {
    private Long mermberId;
    private String itemName;
    private int itemPirce;
    private int disscountPrice;

    public Order(Long mermberId, String itemName, int itemPirce, int disscountPrice) {
        this.mermberId = mermberId;
        this.itemName = itemName;
        this.itemPirce = itemPirce;
        this.disscountPrice = disscountPrice;
    }

    public int calculatePrice() {
        return itemPirce  - disscountPrice;
    }

    public Long getMermberId() {
        return mermberId;
    }

    public void setMermberId(Long mermberId) {
        this.mermberId = mermberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPirce() {
        return itemPirce;
    }

    public void setItemPirce(int itemPirce) {
        this.itemPirce = itemPirce;
    }

    public int getDisscountPrice() {
        return disscountPrice;
    }

    public void setDisscountPrice(int disscountPrice) {
        this.disscountPrice = disscountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "mermberId=" + mermberId +
                ", itemName='" + itemName + '\'' +
                ", itemPirce=" + itemPirce +
                ", disscountPrice=" + disscountPrice +
                '}';
    }
}
