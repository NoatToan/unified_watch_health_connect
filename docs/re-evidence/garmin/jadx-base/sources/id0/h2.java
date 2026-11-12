package id0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.LiveActivityAppDI$module$1$7$1", f = "LiveActivityAppDI.kt", l = {162}, m = "getDeviceInfoMetadata", v = 2)
public final class h2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2.c f92780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(f2.c cVar, t13.d<? super h2> dVar) {
        super(dVar);
        this.f92780b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92779a = obj;
        this.f92781c |= Integer.MIN_VALUE;
        return this.f92780b.e(0L, this);
    }
}
