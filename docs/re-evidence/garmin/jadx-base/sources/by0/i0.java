package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {218}, m = "polylines", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f21877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(a aVar, t13.d<? super i0> dVar) {
        super(dVar);
        this.f21877b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21876a = obj;
        this.f21878c |= Integer.MIN_VALUE;
        return this.f21877b.t(null, this);
    }
}
