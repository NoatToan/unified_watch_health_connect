package org.cybergarage.upnp.std.av.server.object.sort;

import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.SortCap;

/* JADX INFO: loaded from: classes23.dex */
public class UPnPClassSortCap implements SortCap {
    @Override // org.cybergarage.upnp.std.av.server.object.SortCap
    public int compare(ContentNode contentNode, ContentNode contentNode2) {
        if (contentNode != null && contentNode2 != null) {
            String uPnPClass = contentNode.getUPnPClass();
            String uPnPClass2 = contentNode2.getUPnPClass();
            if (uPnPClass != null && uPnPClass2 != null) {
                return uPnPClass.compareTo(uPnPClass2);
            }
        }
        return 0;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.SortCap
    public String getType() {
        return "upnp:class";
    }
}
