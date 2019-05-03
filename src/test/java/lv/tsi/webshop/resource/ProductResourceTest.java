package lv.tsi.webshop.resource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class ProductResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @org.junit.jupiter.api.Test
    void getAllProducts() throws Exception {
        mockMvc.perform(get("/product/all")).andExpect(status().isOk())
                .andExpect(content()
                        .string("[{\"id\":1,\"name\":\"Lenovo V130-15 Full HD SSD i3\",\"description\":\"Skylake, Intel Core i3, 4 GB DDR4, 128GB SSD\",\"price\":329.0,\"pictureUrl\":\"https://www.1a.lv/images/products/001643/1201801_large.jpg\",\"productCategory\":\"COMPUTERS\"},{\"id\":2,\"name\":\"LENOVO THINKPAD P71 20HK0004MH\",\"description\":\"Kaby Lake, Intel Core i7, 16 GB DDR4, 512GB SSD\",\"price\":4619.0,\"pictureUrl\":\"https://www.1a.lv/images/products/001142/835452_large.jpg\",\"productCategory\":\"COMPUTERS\"},{\"id\":3,\"name\":\"MICROSOFT SURFACE BOOK 2 FVH-00030\",\"description\":\"Kaby Lake, Intel Core i7, 16 GB DDR4, 1000GB SSD\",\"price\":3939.0,\"pictureUrl\":\"https://www.1a.lv/images/products/001515/1107465_large.jpg\",\"productCategory\":\"COMPUTERS\"},{\"id\":4,\"name\":\"LG G7 ThinQ 4/\u200B64GB Black\",\"description\":\"Quad-core 2.8 GHz Kryo 385 Gold + Quad-core 1.7 GHz Kryo 385 Silver, 4 GB RAM, 512GB ROM\",\"price\":406.52,\"pictureUrl\":\"https://www.1a.lv/images/products/001627/1190040_large.jpg\",\"productCategory\":\"SMARTPHONES\"},{\"id\":5,\"name\":\"XIAOMI POCOPHONE F1 128GB DUAL BLACK\",\"description\":\"Quad-core 2.8 GHz Kryo 385 Gold + Quad-core 1.8 GHz Kryo 385 Silver, 6 GB RAM, 128GB ROM\",\"price\":335.0,\"pictureUrl\":\"https://www.1a.lv/images/products/001740/1272891_large.jpg\",\"productCategory\":\"SMARTPHONES\"},{\"id\":6,\"name\":\"TP-LINK HS100 SMART PLUG\",\"description\":\"Wi-Fi connection 802.11b/g/n\",\"price\":25.6,\"pictureUrl\":\"https://www.1a.lv/images/products/000834/610869_large.jpg\",\"productCategory\":\"SMART_HOME_DEVICES\"}]"));
    }

    @org.junit.jupiter.api.Test
    void getProductById() {
    }
}