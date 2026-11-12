package de2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {322}, m = "getMacAddress", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f59245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f59246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f59248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f59248d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59247c = obj;
        this.f59249e |= Integer.MIN_VALUE;
        int i14 = a.f59227j;
        return this.f59248d.i(0L, this);
    }
}
