package org.cybergarage.upnp.std.av.server.object.format;

import com.huami.devicerecorder.UriGetter;
import java.io.File;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatObject;
import org.cybergarage.xml.AttributeList;

/* JADX INFO: loaded from: classes23.dex */
public class DefaultFormat implements Format, FormatObject {
    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public FormatObject createObject(File file) {
        return new DefaultFormat();
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public boolean equals(File file) {
        return true;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public AttributeList getAttributeList() {
        return new AttributeList();
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getCreator() {
        return "";
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMediaClass() {
        return "object.item";
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMimeType() {
        return UriGetter.ShareContentType.File;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getTitle() {
        return "";
    }
}
