package vw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.initialization.InitializerCoordinator", f = "InitializerCoordinator.kt", l = {84}, m = "isDeviceSettingsHomeCompositionCached", v = 1)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f180592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.realtimesettings.app.initialization.a f180593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f180594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.garmin.realtimesettings.app.initialization.a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f180593b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f180592a = obj;
        this.f180594c |= Integer.MIN_VALUE;
        return this.f180593b.a(this);
    }
}
