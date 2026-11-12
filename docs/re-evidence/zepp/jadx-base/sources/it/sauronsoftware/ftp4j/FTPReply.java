package it.sauronsoftware.ftp4j;

/* JADX INFO: loaded from: classes22.dex */
public class FTPReply {
    private int a;
    private String[] b;

    public FTPReply(int i, String[] strArr) {
        this.a = 0;
        this.a = i;
        this.b = strArr;
    }

    public int getCode() {
        return this.a;
    }

    public String[] getMessages() {
        return this.b;
    }

    public boolean isSuccessCode() {
        int i = this.a - 200;
        return i >= 0 && i < 100;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [code=");
        stringBuffer.append(this.a);
        stringBuffer.append(", message=");
        for (int i = 0; i < this.b.length; i++) {
            if (i > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(this.b[i]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
