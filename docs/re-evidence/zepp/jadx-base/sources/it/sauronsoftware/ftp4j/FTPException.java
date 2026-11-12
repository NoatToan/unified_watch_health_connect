package it.sauronsoftware.ftp4j;

/* JADX INFO: loaded from: classes22.dex */
public class FTPException extends Exception {
    private static final long serialVersionUID = 1;
    private int a;
    private String b;

    public FTPException(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + " [code=" + this.a + ", message= " + this.b + "]";
    }

    public FTPException(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public FTPException(FTPReply fTPReply) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] messages = fTPReply.getMessages();
        for (int i = 0; i < messages.length; i++) {
            if (i > 0) {
                stringBuffer.append(System.getProperty("line.separator"));
            }
            stringBuffer.append(messages[i]);
        }
        this.a = fTPReply.getCode();
        this.b = stringBuffer.toString();
    }
}
