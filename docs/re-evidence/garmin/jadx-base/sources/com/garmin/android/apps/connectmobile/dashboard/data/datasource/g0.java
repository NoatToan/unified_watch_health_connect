package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import android.app.PendingIntent;
import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.BroadcastHRDataSourceImpl", f = "BroadcastHRDataSourceImpl.kt", l = {53}, m = "showNotification", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f33200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sz0.e f33201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PendingIntent f33202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f33204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f33205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f33206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f33209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e0 f33210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33211l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e0 e0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f33210k = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33209j = obj;
        this.f33211l |= Integer.MIN_VALUE;
        return this.f33210k.d(null, null, this);
    }
}
