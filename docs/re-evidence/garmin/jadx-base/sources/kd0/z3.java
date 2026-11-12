package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.LiveActivityAppNotificationsProviderImpl", f = "LiveActivityAppNotificationsProviderImpl.kt", l = {35, 40}, m = "tryShowingLiveActivityStartNotification", v = 2)
public final class z3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public am.x0 f104479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3 f104481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(x3 x3Var, t13.d<? super z3> dVar) {
        super(dVar);
        this.f104481c = x3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104480b = obj;
        this.f104482d |= Integer.MIN_VALUE;
        return this.f104481c.b(null, this);
    }
}
