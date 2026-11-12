package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceSetupDelegateImpl", f = "DeviceSetupDelegateImpl.kt", l = {575}, m = "notifyDeviceOfLteTransfer", v = 2)
public final class v1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f104391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f104393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(q1 q1Var, t13.d<? super v1> dVar) {
        super(dVar);
        this.f104393c = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104392b = obj;
        this.f104394d |= Integer.MIN_VALUE;
        return this.f104393c.n(0L, this);
    }
}
