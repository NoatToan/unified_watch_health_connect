package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.BroadcastHRDataSourceImpl", f = "BroadcastHRDataSourceImpl.kt", l = {30}, m = "updateStatus", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f33220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f33221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f33222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f33223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e0 e0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f33223e = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33222d = obj;
        this.f33224f |= Integer.MIN_VALUE;
        return this.f33223e.b(null, this, false);
    }
}
