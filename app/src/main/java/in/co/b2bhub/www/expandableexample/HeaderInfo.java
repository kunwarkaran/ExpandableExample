package in.co.b2bhub.www.expandableexample;

import java.util.ArrayList;

/**
 * Created by B2B Android on 3/7/2017.
 */

public class HeaderInfo {

    private String name;
    private ArrayList<DetailInfo> productList = new ArrayList<DetailInfo>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<DetailInfo> getProductList() {
        return productList;
    }
    public void setProductList(ArrayList<DetailInfo> productList) {
        this.productList = productList;
    }
}
