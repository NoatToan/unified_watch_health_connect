package org.cybergarage.upnp.std.av.server.object;

import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public interface Format {
    FormatObject createObject(File file);

    boolean equals(File file);

    String getMediaClass();

    String getMimeType();
}
