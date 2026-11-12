package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {290}, m = "getDailyVO2MaxData", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f21977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a aVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f21977b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21976a = obj;
        this.f21978c |= Integer.MIN_VALUE;
        return this.f21977b.i(null, null, null, this);
    }
}
