package org.cybergarage.upnp.std.av.server.object.format;

import java.io.File;
import org.cybergarage.upnp.std.av.server.object.FormatObject;

/* JADX INFO: loaded from: classes23.dex */
public class GIFFormat extends ImageIOFormat {
    public GIFFormat() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public FormatObject createObject(File file) {
        return new GIFFormat(file);
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public boolean equals(File file) {
        return Header.getIDString(file, 3).startsWith("GIF");
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public String getMimeType() {
        return "image/gif";
    }

    public GIFFormat(File file) {
        super(file);
    }
}
