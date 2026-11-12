package wa0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionViewModel", f = "InReachSubscriptionViewModel.kt", l = {64}, m = "isInReachServicesCapable", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f183775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f183776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f183776b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f183775a = obj;
        this.f183777c |= Integer.MIN_VALUE;
        return c.x4(this.f183776b, 0L, this);
    }
}
