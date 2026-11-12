package org.cybergarage.upnp.std.av.server.object.format;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import org.cybergarage.upnp.std.av.server.object.FormatObject;

/* JADX INFO: loaded from: classes23.dex */
public class JPEGFormat extends ImageIOFormat {
    public JPEGFormat() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public FormatObject createObject(File file) {
        return new JPEGFormat(file);
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public boolean equals(File file) {
        byte[] id = Header.getID(file, 2);
        return (id[0] & 255) == 255 && (id[1] & 255) == 216;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.format.ImageIOFormat, org.cybergarage.upnp.std.av.server.object.Format
    public String getMimeType() {
        return MimeTypes.IMAGE_JPEG;
    }

    public JPEGFormat(File file) {
        super(file);
    }
}
