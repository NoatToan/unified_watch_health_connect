package iw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RealTimeSettingsGfdiDataHandler", f = "RealTimeSettingsGfdiDataHandler.kt", l = {360}, m = "setIntegerPickerSettingsDataValue", v = 1)
public final class y0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lw2.b f95567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f95569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(i1 i1Var, t13.d<? super y0> dVar) {
        super(dVar);
        this.f95569c = i1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95568b = obj;
        this.f95570d |= Integer.MIN_VALUE;
        return this.f95569c.u(0, 0, 0, this);
    }
}
