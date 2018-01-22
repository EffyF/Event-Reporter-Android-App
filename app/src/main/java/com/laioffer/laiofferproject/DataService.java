package com.laioffer.laiofferproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by effyfeng on 6/28/17.
 */

public class DataService {
    /**
     * Fake all the Event data for now. We will refine this and connect
     * to our backend later.
     */
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for (int i = 0; i < 10; ++i) {
            eventData.add(
                    new Event("Event", "1184 W valley Blvd, CA 90101",
                            "New American"));
        }
        return eventData;
    }

}
