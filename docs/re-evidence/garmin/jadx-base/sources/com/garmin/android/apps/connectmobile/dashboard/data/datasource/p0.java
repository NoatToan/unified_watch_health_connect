package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardConfigDataSourceImpl", f = "DashboardConfigDataSourceImpl.kt", l = {PsExtractor.PRIVATE_STREAM_1, 194}, m = "showSection", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f33311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(m0 m0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f33311b = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33310a = obj;
        this.f33312c |= Integer.MIN_VALUE;
        return this.f33311b.t(null, this);
    }
}
