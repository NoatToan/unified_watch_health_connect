package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes3.dex */
public class NotImplementedException extends UnsupportedOperationException {
    private static final long serialVersionUID = 20131021;
    private final String code;

    public NotImplementedException() {
        this.code = null;
    }

    public String getCode() {
        return this.code;
    }

    public NotImplementedException(String str) {
        this(str, (String) null);
    }

    public NotImplementedException(Throwable th3) {
        this(th3, (String) null);
    }

    public NotImplementedException(String str, Throwable th3) {
        this(str, th3, null);
    }

    public NotImplementedException(String str, String str2) {
        super(str);
        this.code = str2;
    }

    public NotImplementedException(Throwable th3, String str) {
        super(th3);
        this.code = str;
    }

    public NotImplementedException(String str, Throwable th3, String str2) {
        super(str, th3);
        this.code = str2;
    }
}
