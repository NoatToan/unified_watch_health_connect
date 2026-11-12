package org.cybergarage.upnp.std.av.server.object.item.file;

import java.io.File;
import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class FileItemNodeList extends Vector {
    public FileItemNode getFileItemNode(int i) {
        return (FileItemNode) get(i);
    }

    public FileItemNode getFileItemNode(File file) {
        int size = size();
        for (int i = 0; i < size; i++) {
            FileItemNode fileItemNode = getFileItemNode(i);
            if (fileItemNode.getFile() != null && fileItemNode.equals(file)) {
                return fileItemNode;
            }
        }
        return null;
    }
}
