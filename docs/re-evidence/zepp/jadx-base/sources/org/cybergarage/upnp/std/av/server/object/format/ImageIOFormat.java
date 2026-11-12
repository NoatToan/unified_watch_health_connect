package org.cybergarage.upnp.std.av.server.object.format;

import java.io.File;
import org.cybergarage.upnp.std.av.server.UPnP;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatObject;
import org.cybergarage.xml.AttributeList;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ImageIOFormat extends Header implements Format, FormatObject {
    private File imgFile;

    public ImageIOFormat() {
        this.imgFile = null;
    }

    public abstract FormatObject createObject(File file);

    public abstract boolean equals(File file);

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
        return UPnP.OBJECT_ITEM_IMAGEITEM_PHOTO;
    }

    public abstract String getMimeType();

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getTitle() {
        String name = this.imgFile.getName();
        int iLastIndexOf = name.lastIndexOf(".");
        return iLastIndexOf < 0 ? "" : name.substring(0, iLastIndexOf);
    }

    public void print() {
    }

    public ImageIOFormat(File file) {
        this.imgFile = file;
    }
}
