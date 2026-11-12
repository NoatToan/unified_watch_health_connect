package org.cybergarage.upnp.std.av.server.object.search;

import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.SearchCap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes23.dex */
public class TitleSearchCap implements SearchCap {
    @Override // org.cybergarage.upnp.std.av.server.object.SearchCap
    public boolean compare(SearchCriteria searchCriteria, ContentNode contentNode) {
        String value = searchCriteria.getValue();
        String title = contentNode.getTitle();
        if (value != null && title != null) {
            int iCompareTo = title.compareTo(value);
            if (iCompareTo == 0 && (searchCriteria.isEQ() || searchCriteria.isLE() || searchCriteria.isGE())) {
                return true;
            }
            if (iCompareTo < 0 && searchCriteria.isLT()) {
                return true;
            }
            if (iCompareTo > 0 && searchCriteria.isGT()) {
                return true;
            }
            if ((title.indexOf(value) >= 0 && searchCriteria.isContains()) || searchCriteria.isDoesNotContain()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.SearchCap
    public String getPropertyName() {
        return "dc:title";
    }
}
