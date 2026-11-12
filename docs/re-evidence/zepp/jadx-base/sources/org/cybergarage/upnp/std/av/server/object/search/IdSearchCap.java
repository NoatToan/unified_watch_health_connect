package org.cybergarage.upnp.std.av.server.object.search;

import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.SearchCap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes23.dex */
public class IdSearchCap implements SearchCap {
    @Override // org.cybergarage.upnp.std.av.server.object.SearchCap
    public boolean compare(SearchCriteria searchCriteria, ContentNode contentNode) {
        String value = searchCriteria.getValue();
        String id = contentNode.getID();
        return value != null && id != null && searchCriteria.isEQ() && value.compareTo(id) == 0;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.SearchCap
    public String getPropertyName() {
        return SearchCriteria.ID;
    }
}
