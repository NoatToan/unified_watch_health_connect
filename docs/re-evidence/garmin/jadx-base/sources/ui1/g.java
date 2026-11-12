package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachMessagingProtobufHandler", f = "InReachMessagingProtobufHandler.kt", l = {120}, m = "isMessagingActivated", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f171275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f171275b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171274a = obj;
        this.f171276c |= Integer.MIN_VALUE;
        return this.f171275b.d(this);
    }
}
