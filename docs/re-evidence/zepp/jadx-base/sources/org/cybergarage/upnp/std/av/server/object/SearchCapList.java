package org.cybergarage.upnp.std.av.server.object;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class SearchCapList extends Vector {
    public SearchCap getSearchCap(int i) {
        return (SearchCap) get(i);
    }

    public SearchCap getSearchCap(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            SearchCap searchCap = getSearchCap(i);
            if (str.compareTo(searchCap.getPropertyName()) == 0) {
                return searchCap;
            }
        }
        return null;
    }
}
