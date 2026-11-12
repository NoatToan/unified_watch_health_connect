package kd0;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.LiveActivityAppNotificationsProviderImpl", f = "LiveActivityAppNotificationsProviderImpl.kt", l = {61}, m = "updateVo2MaxValueEstimationCompletedNotification", v = 2)
public final class a4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f103978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f103980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f103981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f103982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(x3 x3Var, t13.d<? super a4> dVar) {
        super(dVar);
        this.f103981d = x3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103980c = obj;
        this.f103982e |= Integer.MIN_VALUE;
        return this.f103981d.a(this);
    }
}
