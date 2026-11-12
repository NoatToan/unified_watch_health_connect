package org.cybergarage.upnp.std.av.server;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class DirectoryList extends Vector {
    public Directory getDirectory(int i) {
        return (Directory) get(i);
    }

    public void update() {
        int size = size();
        for (int i = 0; i < size; i++) {
            getDirectory(i).updateContentList();
        }
    }

    public Directory getDirectory(String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            Directory directory = getDirectory(i);
            String friendlyName = directory.getFriendlyName();
            if (friendlyName != null && friendlyName.equals(str)) {
                return directory;
            }
        }
        return null;
    }
}
