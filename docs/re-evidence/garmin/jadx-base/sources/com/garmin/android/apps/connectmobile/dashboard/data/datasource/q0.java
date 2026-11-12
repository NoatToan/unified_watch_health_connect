package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardConfigDataSourceImpl", f = "DashboardConfigDataSourceImpl.kt", l = {123, 149}, m = "updateDashboardConfig", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f33324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f33326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(m0 m0Var, t13.d<? super q0> dVar) {
        super(dVar);
        this.f33326c = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33325b = obj;
        this.f33327d |= Integer.MIN_VALUE;
        return this.f33326c.s(null, null, null, null, null, this);
    }
}
