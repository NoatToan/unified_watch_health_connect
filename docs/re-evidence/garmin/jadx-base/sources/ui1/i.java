package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachMessagingProtobufHandler", f = "InReachMessagingProtobufHandler.kt", l = {161}, m = "startDeviceActivation", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f171291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f171291b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171290a = obj;
        this.f171292c |= Integer.MIN_VALUE;
        return this.f171291b.m(null, this);
    }
}
