package ee.ttu.geodeesia.interop.api.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by 48707222248 on 18.02.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxonApiResponse {
    @JsonProperty("count")
    private int count;
    @JsonProperty("page")
    private String pageInfo;
    @JsonProperty("results")
    private List<Taxon> result;


}
