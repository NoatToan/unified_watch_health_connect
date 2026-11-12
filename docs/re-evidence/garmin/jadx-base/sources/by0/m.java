package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {450}, m = "getDailyRacePredictorData", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f21941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a aVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f21941b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21940a = obj;
        this.f21942c |= Integer.MIN_VALUE;
        return this.f21941b.h(null, null, null, this);
    }
}
