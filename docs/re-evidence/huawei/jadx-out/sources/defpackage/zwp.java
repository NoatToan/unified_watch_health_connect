package defpackage;

import org.eclipse.californium.core.coap.CoAP;

/* JADX INFO: loaded from: classes20.dex */
public class zwp extends Exception {
    private static final long serialVersionUID = 1357;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f54686a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoAP.ResponseCode f54687c;

    public zwp(String str) {
        super(str);
        this.f54686a = false;
        this.f54687c = null;
    }

    public zwp(String str, CoAP.ResponseCode responseCode) {
        super(str);
        this.f54686a = false;
        this.f54687c = responseCode;
    }

    public zwp(String str, boolean z) {
        super(str);
        this.f54686a = z;
        this.f54687c = null;
    }

    public boolean e() {
        return this.f54686a;
    }

    public CoAP.ResponseCode c() {
        return this.f54687c;
    }
}
