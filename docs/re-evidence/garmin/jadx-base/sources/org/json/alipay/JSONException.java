package org.json.alipay;

/* JADX INFO: loaded from: classes3.dex */
public class JSONException extends Exception {
    public Throwable cause;

    public JSONException(Throwable th3) {
        super(th3.getMessage());
        this.cause = th3;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public JSONException(String str) {
        super(str);
    }
}
