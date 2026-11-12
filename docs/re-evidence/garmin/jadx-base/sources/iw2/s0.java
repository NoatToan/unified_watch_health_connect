package iw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsGfdiDataHandler", f = "RealTimeSettingsGfdiDataHandler.kt", l = {149}, m = "getStartUpData", v = 1)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f95517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f95518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(i1 i1Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f95518b = i1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95517a = obj;
        this.f95519c |= Integer.MIN_VALUE;
        return this.f95518b.l(null, this);
    }
}
