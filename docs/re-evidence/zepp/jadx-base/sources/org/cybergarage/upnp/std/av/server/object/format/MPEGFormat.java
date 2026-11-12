package org.cybergarage.upnp.std.av.server.object.format;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import org.cybergarage.upnp.std.av.server.UPnP;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatObject;
import org.cybergarage.util.Debug;
import org.cybergarage.xml.Attribute;
import org.cybergarage.xml.AttributeList;

/* JADX INFO: loaded from: classes23.dex */
public class MPEGFormat implements Format, FormatObject {
    private File mpegFile;

    public MPEGFormat() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public FormatObject createObject(File file) {
        return new MPEGFormat(file);
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public boolean equals(File file) {
        String suffix = Header.getSuffix(file);
        if (suffix == null) {
            return false;
        }
        return suffix.startsWith("mpeg") || suffix.startsWith("mpg");
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public AttributeList getAttributeList() {
        AttributeList attributeList = new AttributeList();
        try {
            attributeList.add(new Attribute("size", Long.toString(this.mpegFile.length())));
        } catch (Exception e) {
            Debug.warning(e);
        }
        return attributeList;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getCreator() {
        return "";
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMediaClass() {
        return UPnP.OBJECT_ITEM_VIDEOITEM_MOVIE;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMimeType() {
        return MimeTypes.VIDEO_MPEG;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getTitle() {
        String name = this.mpegFile.getName();
        int iLastIndexOf = name.lastIndexOf(".");
        return iLastIndexOf < 0 ? "" : name.substring(0, iLastIndexOf);
    }

    public MPEGFormat(File file) {
        this.mpegFile = file;
    }
}
