package org.cybergarage.upnp.std.av.server.object;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class SearchCriteriaList extends Vector {
    public boolean compare(ContentNode contentNode, SearchCapList searchCapList) {
        int size = size();
        for (int i = 0; i < size; i++) {
            SearchCriteria searchCriteria = getSearchCriteria(i);
            String property = searchCriteria.getProperty();
            if (property == null) {
                searchCriteria.setResult(true);
            } else {
                SearchCap searchCap = searchCapList.getSearchCap(property);
                if (searchCap == null) {
                    searchCriteria.setResult(true);
                } else {
                    searchCriteria.setResult(searchCap.compare(searchCriteria, contentNode));
                }
            }
        }
        SearchCriteriaList searchCriteriaList = new SearchCriteriaList();
        for (int i2 = 0; i2 < size; i2++) {
            SearchCriteria searchCriteria2 = getSearchCriteria(i2);
            if (i2 >= size - 1 || !searchCriteria2.isLogicalAND()) {
                searchCriteriaList.add(new SearchCriteria(searchCriteria2));
            } else {
                SearchCriteria searchCriteria3 = getSearchCriteria(i2 + 1);
                searchCriteria3.setResult(searchCriteria2.getResult() & searchCriteria3.getResult());
            }
        }
        int size2 = searchCriteriaList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (getSearchCriteria(i3).getResult()) {
                return true;
            }
        }
        return false;
    }

    public SearchCriteria getSearchCriteria(int i) {
        return (SearchCriteria) get(i);
    }

    public SearchCriteria getSearchCriteria(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            SearchCriteria searchCriteria = getSearchCriteria(i);
            if (str.compareTo(searchCriteria.getProperty()) == 0) {
                return searchCriteria;
            }
        }
        return null;
    }
}
