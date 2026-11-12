package org.cybergarage.upnp.std.av.server.object.format;

import java.io.File;
import org.cybergarage.upnp.std.av.server.object.FormatObject;

/* JADX INFO: loaded from: classes23.dex */
public class PNGFormat extends ImageIOFormat {
    public PNGFormat() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public FormatObject createObject(File file) {
        return new PNGFormat(file);
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public boolean equals(File file) {
        return Header.getIDString(file, 1, 3).startsWith("PNG");
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public String getMimeType() {
        return "image/png";
    }

    public PNGFormat(File file) {
        super(file);
    }
}
