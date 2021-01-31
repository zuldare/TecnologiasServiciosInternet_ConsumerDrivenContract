package es.codeurjc.mastercloudapps.topo.controller;

import org.junit.jupiter.api.BeforeEach;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public abstract class BaseCDC {

    @Autowired
    private TopoController topoController;

    @BeforeEach
    public void setup(){
        RestAssuredMockMvc.standaloneSetup(this.topoController);
    }
}
