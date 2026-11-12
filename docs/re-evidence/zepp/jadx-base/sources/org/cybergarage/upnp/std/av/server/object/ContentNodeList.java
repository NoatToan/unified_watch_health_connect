package org.cybergarage.upnp.std.av.server.object;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class ContentNodeList extends Vector {
    public ContentNode getContentNode(int i) {
        return (ContentNode) get(i);
    }

    public ContentNode getContentNode(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            ContentNode contentNode = getContentNode(i);
            if (str.compareTo(contentNode.getName()) == 0) {
                return contentNode;
            }
        }
        return null;
    }
}
