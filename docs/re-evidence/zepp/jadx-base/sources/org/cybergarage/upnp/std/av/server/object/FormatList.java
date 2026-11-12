package org.cybergarage.upnp.std.av.server.object;

import java.io.File;
import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class FormatList extends Vector {
    public Format getFormat(int i) {
        return (Format) get(i);
    }

    public Format getFormat(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            Format format = getFormat(i);
            if (str.compareTo(format.getMimeType()) == 0) {
                return format;
            }
        }
        return null;
    }

    public Format getFormat(File file) {
        if (file == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            Format format = getFormat(i);
            if (format.equals(file)) {
                return format;
            }
        }
        return null;
    }
}
