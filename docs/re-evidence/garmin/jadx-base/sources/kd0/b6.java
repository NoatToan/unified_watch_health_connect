package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ThirdPartyDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {323, 325}, m = "fetchStravaBeaconOption", v = 2)
public final class b6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f104000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c6 f104002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(c6 c6Var, t13.d<? super b6> dVar) {
        super(dVar);
        this.f104002c = c6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104001b = obj;
        this.f104003d |= Integer.MIN_VALUE;
        return this.f104002c.a(false, this);
    }
}
