package aq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksUseCase", f = "StartupChecksUseCase.kt", l = {16, 28, 36}, m = "invoke", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f12445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w wVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f12445c = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12444b = obj;
        this.f12446d |= Integer.MIN_VALUE;
        return this.f12445c.a(this);
    }
}
