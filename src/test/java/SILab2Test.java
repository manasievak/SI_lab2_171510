import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SILab2Test {
    private List<String> createList(String... list) {

        return new ArrayList<>(Arrays.asList(list));
    }

    @Test
    public void EveryBranchTest() {

        assertEquals(List.of("#", "#", "#", "#", "#"), SILab2.function(createList("#", "#", "#", "#", "#")));
        assertEquals(List.of("#", "2", "#", "2", "#"), SILab2.function(createList("#", "0", "#", "0", "#")));

    }


    @Test
    public void multipleConditionsTest() {
        //H

        assertEquals(List.of("0","0","1","#"), SILab2.function(createList("0","0","0","#")));
        assertEquals(List.of("0","0","1","#"), SILab2.function(createList("0","0","0","#")));

        //J

        assertEquals(List.of("#","1","0","0"), SILab2.function(createList("#","0","0","0")));
        assertEquals(List.of("#","1","0","0"), SILab2.function(createList("#","0","0","0")));
    }
}
