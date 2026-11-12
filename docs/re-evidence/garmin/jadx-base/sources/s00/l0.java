package s00;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.SubscriptionCommonPushNotificationHandler", f = "SubscriptionCommonPushNotificationHandler.kt", l = {229}, m = "getSMCIntent", v = 2)
public final class l0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f155313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f155314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var, t13.d<? super l0> dVar) {
        super(dVar);
        this.f155314b = k0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f155313a = obj;
        this.f155315c |= Integer.MIN_VALUE;
        int i14 = k0.f155303a;
        return this.f155314b.g(this);
    }
}
