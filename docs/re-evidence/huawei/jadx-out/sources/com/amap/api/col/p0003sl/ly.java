package com.amap.api.col.p0003sl;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class ly extends lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3082b;

    public ly(Context context, boolean z) {
        this.f3081a = context;
        this.f3082b = z;
    }

    @Override // com.amap.api.col.p0003sl.lx
    protected final boolean c() {
        return ip.j(this.f3081a) == 1 || this.f3082b;
    }
}
