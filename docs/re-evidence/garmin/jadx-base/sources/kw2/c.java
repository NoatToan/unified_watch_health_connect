package kw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.base.DeviceServiceCalls", f = "DeviceServiceCalls.kt", l = {69}, m = "getRealtimeSettingsRequestService", v = 1)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f106992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f106993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f106993b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f106992a = obj;
        this.f106994c |= Integer.MIN_VALUE;
        return this.f106993b.c(null, this);
    }
}
