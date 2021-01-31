package es.codeurjc.mastercloudapps.planner.cdct;

import es.codeurjc.mastercloudapps.planner.models.LandscapeResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("TopoClient CDCT Tests")
@AutoConfigureStubRunner(ids={"jjhernandez2020:toposervice:+:stubs:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class TopoClientCDCTest {

    private static final String GET_TOPOGRAPHIC_DETAILS_URL = "http://localhost:8080/api/topographicdetails/";
    private static final String FLAT_LANDSCAPE = "Flat";
    private static final String MADRID = "Madrid";
    @Test
    @DisplayName("TopoService -> Get topography of an existing city")
    void testWhenTopoClientGetLandscapeWhenExistingCityThenReturnOk(){
        ResponseEntity<LandscapeResponse> landscapeResponseResponseEntity = (new RestTemplate())
                .getForEntity(GET_TOPOGRAPHIC_DETAILS_URL + MADRID, LandscapeResponse.class);

        assertEquals(HttpStatus.OK, landscapeResponseResponseEntity.getStatusCode());
        assertEquals(FLAT_LANDSCAPE, landscapeResponseResponseEntity.getBody().getLandscape());
        assertEquals(MADRID, landscapeResponseResponseEntity.getBody().getId());
    }
}
