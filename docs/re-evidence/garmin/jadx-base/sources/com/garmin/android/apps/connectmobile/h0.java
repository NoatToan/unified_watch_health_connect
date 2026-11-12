package com.garmin.android.apps.connectmobile;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.BaseRepository", f = "BaseRepository.kt", l = {76, 94, 96}, m = "safeApiResultWithRetry$suspendImpl", v = 2)
public final class h0<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f36508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f36509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p005kotlin.jvm.internal.p0 f36510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f36513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f36514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36515h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f0 f0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f36514g = f0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f36513f = obj;
        this.f36515h |= Integer.MIN_VALUE;
        return f0.R3(this.f36514g, 0, 0L, null, this);
    }
}
