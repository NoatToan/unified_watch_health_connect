package it.sauronsoftware.ftp4j;

import com.facebook.share.internal.ShareConstants;
import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
public class FTPFile {
    public static final int TYPE_DIRECTORY = 1;
    public static final int TYPE_FILE = 0;
    public static final int TYPE_LINK = 2;
    private String a = null;
    private String b = null;
    private Date c = null;
    private long d = -1;
    private int e;

    public String getLink() {
        return this.b;
    }

    public Date getModifiedDate() {
        return this.c;
    }

    public String getName() {
        return this.a;
    }

    public long getSize() {
        return this.d;
    }

    public int getType() {
        return this.e;
    }

    public void setLink(String str) {
        this.b = str;
    }

    public void setModifiedDate(Date date) {
        this.c = date;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setSize(long j) {
        this.d = j;
    }

    public void setType(int i) {
        this.e = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [name=");
        stringBuffer.append(this.a);
        stringBuffer.append(", type=");
        int i = this.e;
        if (i == 0) {
            stringBuffer.append("FILE");
        } else if (i == 1) {
            stringBuffer.append("DIRECTORY");
        } else if (i == 2) {
            stringBuffer.append(ShareConstants.CONTENT_URL);
            stringBuffer.append(", link=");
            stringBuffer.append(this.b);
        } else {
            stringBuffer.append("UNKNOWN");
        }
        stringBuffer.append(", size=");
        stringBuffer.append(this.d);
        stringBuffer.append(", modifiedDate=");
        stringBuffer.append(this.c);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
