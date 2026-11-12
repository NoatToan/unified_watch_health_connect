package org.cybergarage.upnp.std.av.server.object.item.file;

import com.huami.devicerecorder.UriGetter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;
import org.cybergarage.util.Debug;
import org.cybergarage.util.FileUtil;

/* JADX INFO: loaded from: classes23.dex */
public class FileItemNode extends ItemNode {
    private File itemFile;

    public FileItemNode() {
        setFile(null);
    }

    public boolean equals(File file) {
        File file2 = this.itemFile;
        if (file2 == null) {
            return false;
        }
        return file2.equals(file);
    }

    public byte[] getContent() {
        byte[] bArr = new byte[0];
        try {
            return FileUtil.load(this.itemFile);
        } catch (Exception unused) {
            return bArr;
        }
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public InputStream getContentInputStream() {
        try {
            return new FileInputStream(this.itemFile);
        } catch (Exception e) {
            Debug.warning(e);
            return null;
        }
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public long getContentLength() {
        return this.itemFile.length();
    }

    public File getFile() {
        return this.itemFile;
    }

    public long getFileTimeStamp() {
        File file = this.itemFile;
        if (file != null) {
            try {
                return file.lastModified();
            } catch (Exception e) {
                Debug.warning(e);
            }
        }
        return 0L;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public String getMimeType() {
        Format format = getContentDirectory().getFormat(getFile());
        return format == null ? UriGetter.ShareContentType.File : format.getMimeType();
    }

    public void setFile(File file) {
        this.itemFile = file;
    }
}
