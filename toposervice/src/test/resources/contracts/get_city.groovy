import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            description "should return landscape searching  by city=Barcelona"

            request {
                url "/api/topographicdetails/Barcelona"
                method GET()
            }

            response {
                status OK()
                headers {
                    contentType applicationJson()
                }
                body(
                        id: "Barcelona",
                        landscape: "Flat"
                )
            }
        },

        Contract.make {
            description "should return landscape searching by city=Madrid"

            request {
                url "/api/topographicdetails/Madrid"
                method GET()
            }

            response {
                status OK()
                headers {
                    contentType applicationJson()
                }
                body(
                        id: "Madrid",
                        landscape: "Flat"
                )
            }
        }
]
