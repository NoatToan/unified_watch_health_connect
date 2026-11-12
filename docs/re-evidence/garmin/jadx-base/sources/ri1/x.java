package ri1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel", f = "InReachSubscriptionManagerViewModel.kt", l = {278}, m = "getSuspendedSosPlanChangeDescription", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f152937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f152938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s sVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f152938b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152937a = obj;
        this.f152939c |= Integer.MIN_VALUE;
        return s.y4(this.f152938b, this);
    }
}
