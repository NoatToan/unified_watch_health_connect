package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardConfigDataSourceImpl", f = "DashboardConfigDataSourceImpl.kt", l = {60}, m = "fetchDashboardConfig", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f33300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m0 m0Var, t13.d<? super n0> dVar) {
        super(dVar);
        this.f33300b = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33299a = obj;
        this.f33301c |= Integer.MIN_VALUE;
        return this.f33300b.y(this);
    }
}
