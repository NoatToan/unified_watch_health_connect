package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {426}, m = "getEnduranceScoreData", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f22011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f22011b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22010a = obj;
        this.f22012c |= Integer.MIN_VALUE;
        return this.f22011b.k(null, null, null, null, this);
    }
}
