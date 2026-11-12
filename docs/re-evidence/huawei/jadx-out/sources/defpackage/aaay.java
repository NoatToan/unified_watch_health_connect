package defpackage;

import org.eclipse.californium.scandium.dtls.AlertMessage;

/* JADX INFO: loaded from: classes20.dex */
public class aaay extends Exception {
    private static final long serialVersionUID = 1123415935894222594L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AlertMessage f58c;

    public aaay(String str, AlertMessage alertMessage) {
        super(str);
        if (alertMessage == null) {
            throw new NullPointerException("Alert must not be null!");
        }
        this.f58c = alertMessage;
    }

    public aaay(String str, AlertMessage alertMessage, Throwable th) {
        super(str, th);
        if (alertMessage == null) {
            throw new NullPointerException("Alert must not be null!");
        }
        this.f58c = alertMessage;
    }

    public AlertMessage c() {
        return this.f58c;
    }
}
