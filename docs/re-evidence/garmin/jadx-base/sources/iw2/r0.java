package iw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsGfdiDataHandler", f = "RealTimeSettingsGfdiDataHandler.kt", l = {197}, m = "getSettingsDataValue", v = 1)
public final class r0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nw2.c f95511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f95513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(i1 i1Var, t13.d<? super r0> dVar) {
        super(dVar);
        this.f95513c = i1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95512b = obj;
        this.f95514d |= Integer.MIN_VALUE;
        return this.f95513c.d(0, this);
    }
}
