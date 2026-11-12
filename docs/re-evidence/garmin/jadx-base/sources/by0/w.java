package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {271}, m = "getLimitedSleepDailySummary", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b63.o f22106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b63.o f22107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f22109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a aVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f22109d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22108c = obj;
        this.f22110e |= Integer.MIN_VALUE;
        return a.b(this.f22109d, null, null, this);
    }
}
