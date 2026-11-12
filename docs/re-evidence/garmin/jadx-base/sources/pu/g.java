package pu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.GCMAuthRemoteConfigImpl", f = "GCMAuthRemoteConfigImpl.kt", l = {22}, m = "fetchAuthRemoteConfig", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f141069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f141071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f141071c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141070b = obj;
        this.f141072d |= Integer.MIN_VALUE;
        return this.f141071c.b(this);
    }
}
