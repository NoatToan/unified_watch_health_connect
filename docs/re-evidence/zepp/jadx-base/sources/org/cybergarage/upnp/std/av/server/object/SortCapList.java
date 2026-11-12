package org.cybergarage.upnp.std.av.server.object;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class SortCapList extends Vector {
    public SortCap getSortCap(int i) {
        return (SortCap) get(i);
    }

    public SortCap getSortCap(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            SortCap sortCap = getSortCap(i);
            if (str.compareTo(sortCap.getType()) == 0) {
                return sortCap;
            }
        }
        return null;
    }
}
