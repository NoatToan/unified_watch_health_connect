package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {503}, m = "getLiveTrackDetails", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f22123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a aVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f22123b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22122a = obj;
        this.f22124c |= Integer.MIN_VALUE;
        return this.f22123b.n(null, this);
    }
}
