package au0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.LiveActivityPowerDataProviderImpl", f = "LiveActivityPowerDataProviderImpl.kt", l = {22}, m = "getPowerCurveData", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f12995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f12995b = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12994a = obj;
        this.f12996c |= Integer.MIN_VALUE;
        return this.f12995b.a(null, this);
    }
}
