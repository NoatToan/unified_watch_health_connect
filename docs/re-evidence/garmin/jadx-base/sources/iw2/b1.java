package iw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsGfdiDataHandler", f = "RealTimeSettingsGfdiDataHandler.kt", l = {569}, m = "setOnActionClickListener", v = 1)
public final class b1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lw2.b f95371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f95373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(i1 i1Var, t13.d<? super b1> dVar) {
        super(dVar);
        this.f95373c = i1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95372b = obj;
        this.f95374d |= Integer.MIN_VALUE;
        return this.f95373c.x(0, 0, this);
    }
}
