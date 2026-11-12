package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachMessagingProtobufHandler", f = "InReachMessagingProtobufHandler.kt", l = {194}, m = "hasIrisServiceCapableDevice", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f171270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171271c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f171270b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171269a = obj;
        this.f171271c |= Integer.MIN_VALUE;
        return this.f171270b.c(this);
    }
}
