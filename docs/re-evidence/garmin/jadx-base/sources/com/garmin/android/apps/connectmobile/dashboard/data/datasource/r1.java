package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.EventWeathersDataSourceImpl", f = "EventWeathersDataSourceImpl.kt", l = {90}, m = "getForecastWeather", v = 2)
public final class r1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f33342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(p1 p1Var, t13.d<? super r1> dVar) {
        super(dVar);
        this.f33342b = p1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33341a = obj;
        this.f33343c |= Integer.MIN_VALUE;
        int i14 = p1.f33313d;
        return this.f33342b.c(0.0d, 0.0d, 0L, this);
    }
}
