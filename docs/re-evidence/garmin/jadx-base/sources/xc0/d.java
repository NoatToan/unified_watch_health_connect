package xc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSFeatureSetupTransform", f = "RTSFeatureSetupTransform.kt", l = {31}, m = "getDeviceSetupIncompleteFeaturesCount", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f189910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f189911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f189912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f189911b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f189910a = obj;
        this.f189912c |= Integer.MIN_VALUE;
        int i14 = e.f189913c;
        return this.f189911b.m(this);
    }
}
