package id0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.LiveActivityAppDI$module$1$7$1", f = "LiveActivityAppDI.kt", l = {153}, m = "getDeviceBatteryPercentage", v = 2)
public final class g2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u53.d f92763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f92764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2.c f92765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(f2.c cVar, t13.d<? super g2> dVar) {
        super(dVar);
        this.f92765c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92764b = obj;
        this.f92766d |= Integer.MIN_VALUE;
        return this.f92765c.b(0L, this);
    }
}
