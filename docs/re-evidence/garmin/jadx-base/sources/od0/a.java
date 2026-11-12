package od0;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.di.device.setup.inreach.InReachSubscriptionDelegateImpl", f = "InReachSubscriptionDelegateImpl.kt", l = {26}, m = "isEligibleForFreeTrial", v = 2)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(dVar);
        this.f131175b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131174a = obj;
        this.f131176c |= Integer.MIN_VALUE;
        return this.f131175b.c(0L, this);
    }
}
