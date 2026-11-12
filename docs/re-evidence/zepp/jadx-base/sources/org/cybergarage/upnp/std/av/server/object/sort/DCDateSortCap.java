package org.cybergarage.upnp.std.av.server.object.sort;

import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.SortCap;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;

/* JADX INFO: loaded from: classes23.dex */
public class DCDateSortCap implements SortCap {
    @Override // org.cybergarage.upnp.std.av.server.object.SortCap
    public int compare(ContentNode contentNode, ContentNode contentNode2) {
        if (contentNode == null || contentNode2 == null || !(contentNode instanceof ItemNode) || !(contentNode2 instanceof ItemNode)) {
            return 0;
        }
        long dateTime = ((ItemNode) contentNode).getDateTime();
        long dateTime2 = ((ItemNode) contentNode2).getDateTime();
        if (dateTime == dateTime2) {
            return 0;
        }
        return dateTime < dateTime2 ? -1 : 1;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.SortCap
    public String getType() {
        return "dc:date";
    }
}
