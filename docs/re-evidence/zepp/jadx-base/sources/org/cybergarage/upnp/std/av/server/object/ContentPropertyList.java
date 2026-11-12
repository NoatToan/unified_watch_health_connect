package org.cybergarage.upnp.std.av.server.object;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class ContentPropertyList extends Vector {
    public ContentProperty getContentProperty(int i) {
        return (ContentProperty) get(i);
    }

    public ContentProperty getContentProperty(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            ContentProperty contentProperty = getContentProperty(i);
            if (str.compareTo(contentProperty.getName()) == 0) {
                return contentProperty;
            }
        }
        return null;
    }
}
