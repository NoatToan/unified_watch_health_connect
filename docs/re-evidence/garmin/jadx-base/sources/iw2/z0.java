package iw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsGfdiDataHandler", f = "RealTimeSettingsGfdiDataHandler.kt", l = {594}, m = "setMenuItemChange", v = 1)
public final class z0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ow2.c f95575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f95577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i1 i1Var, t13.d<? super z0> dVar) {
        super(dVar);
        this.f95577c = i1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95576b = obj;
        this.f95578d |= Integer.MIN_VALUE;
        return this.f95577c.v(0, 0, this);
    }
}
