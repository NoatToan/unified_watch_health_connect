package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.EventWeathersDataSourceImpl", f = "EventWeathersDataSourceImpl.kt", l = {50, 62, 69}, m = "getWeathers", v = 2)
public final class t1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f33356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f33357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f33363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f33364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f33365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f33366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f33367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f33368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p1 f33369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33370o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(p1 p1Var, t13.d<? super t1> dVar) {
        super(dVar);
        this.f33369n = p1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33368m = obj;
        this.f33370o |= Integer.MIN_VALUE;
        return this.f33369n.a(this);
    }
}
