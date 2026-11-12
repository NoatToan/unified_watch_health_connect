package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.EventWeathersDataSourceImpl", f = "EventWeathersDataSourceImpl.kt", l = {110}, m = "getActivityWeather", v = 2)
public final class q1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f33329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(p1 p1Var, t13.d<? super q1> dVar) {
        super(dVar);
        this.f33329b = p1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33328a = obj;
        this.f33330c |= Integer.MIN_VALUE;
        int i14 = p1.f33313d;
        return this.f33329b.b(0L, this);
    }
}
