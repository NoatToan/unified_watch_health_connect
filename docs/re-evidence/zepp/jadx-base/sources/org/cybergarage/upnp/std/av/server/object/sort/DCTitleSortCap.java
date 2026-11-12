package org.cybergarage.upnp.std.av.server.object.sort;

import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.SortCap;

/* JADX INFO: loaded from: classes23.dex */
public class DCTitleSortCap implements SortCap {
    @Override // org.cybergarage.upnp.std.av.server.object.SortCap
    public int compare(ContentNode contentNode, ContentNode contentNode2) {
        if (contentNode != null && contentNode2 != null) {
            String title = contentNode.getTitle();
            String title2 = contentNode2.getTitle();
            if (title != null && title2 != null) {
                return title.compareTo(title2);
            }
        }
        return 0;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.SortCap
    public String getType() {
        return "dc:title";
    }
}
