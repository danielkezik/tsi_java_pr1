package lv.tsi.webshop.model;

public enum ProductCategory {
    COMPUTERS("Computers"),
    SMARTPHONES("Smartphones"),
    SMART_HOME_DEVICES("Smart home devices");

    private final String type;

    ProductCategory(String type) {
        this.type = type;
    }
}
