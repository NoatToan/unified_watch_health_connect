package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class da extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9 f14711a;

    public da(r9 r9Var) {
        super("stream was reset: " + r9Var);
        this.f14711a = r9Var;
    }
}
