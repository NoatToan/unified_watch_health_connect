package ri1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel", f = "InReachSubscriptionManagerViewModel.kt", l = {265}, m = "getInreachSubscriptionForDevice", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f152934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f152935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s sVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f152935b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152934a = obj;
        this.f152936c |= Integer.MIN_VALUE;
        return s.x4(this.f152935b, this);
    }
}
