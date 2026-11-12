package org.cybergarage.upnp.std.av.server.object.item.mythtv;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.cybergarage.upnp.std.av.server.UPnP;
import org.cybergarage.upnp.std.av.server.directory.mythtv.MythRecordedInfo;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;
import org.cybergarage.util.Debug;
import org.cybergarage.util.FileUtil;
import org.cybergarage.xml.Attribute;
import org.cybergarage.xml.AttributeList;

/* JADX INFO: loaded from: classes23.dex */
public class MythRecordedItemNode extends ItemNode {
    private static final String MIME_TYPE = "video/mpeg";
    private MythRecordedInfo recInfo;

    public MythRecordedItemNode() {
        setRecordedInfo(null);
    }

    public boolean equals(MythRecordedInfo mythRecordedInfo) {
        MythRecordedInfo recordedInfo = getRecordedInfo();
        return (mythRecordedInfo == null || recordedInfo == null || mythRecordedInfo.getChanID() != recordedInfo.getChanID()) ? false : true;
    }

    public byte[] getContent() {
        File file = getRecordedInfo().getFile();
        if (!file.exists()) {
            return new byte[0];
        }
        byte[] bArr = new byte[0];
        try {
            return FileUtil.load(file);
        } catch (Exception unused) {
            return bArr;
        }
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public InputStream getContentInputStream() {
        try {
            return new FileInputStream(getRecordedInfo().getFile());
        } catch (Exception e) {
            Debug.warning(e);
            return null;
        }
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public long getContentLength() {
        return getRecordedInfo().getFile().length();
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public String getMimeType() {
        return "video/mpeg";
    }

    public MythRecordedInfo getRecordedInfo() {
        return this.recInfo;
    }

    public void setRecordedInfo(MythRecordedInfo mythRecordedInfo) {
        this.recInfo = mythRecordedInfo;
        if (mythRecordedInfo == null) {
            return;
        }
        setTitle(mythRecordedInfo.getTitle());
        setCreator("");
        setUPnPClass(UPnP.OBJECT_ITEM_VIDEOITEM_MOVIE);
        setDate(mythRecordedInfo.getStartTime());
        setStorageUsed(mythRecordedInfo.getFileSize());
        String contentExportURL = getContentDirectory().getContentExportURL(getID());
        AttributeList attributeList = new AttributeList();
        attributeList.add(new Attribute("size", Long.toString(mythRecordedInfo.getFileSize())));
        setResource(contentExportURL, "http-get:*:video/mpeg:*", attributeList);
    }
}
