package de2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {287, 290}, m = "updateAutoStartState", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f59336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f59337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f59338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a aVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f59338c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59337b = obj;
        this.f59339d |= Integer.MIN_VALUE;
        int i14 = a.f59227j;
        return this.f59338c.p(0L, this, false);
    }
}
