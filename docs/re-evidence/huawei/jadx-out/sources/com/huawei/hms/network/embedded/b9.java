package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class b9 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IOException f14648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f14649b;

    public IOException b() {
        return this.f14649b;
    }

    public void a(IOException iOException) {
        f8.a(this.f14648a, iOException);
        this.f14649b = iOException;
    }

    public IOException a() {
        return this.f14648a;
    }

    public b9(IOException iOException) {
        super(iOException);
        this.f14648a = iOException;
        this.f14649b = iOException;
    }
}
