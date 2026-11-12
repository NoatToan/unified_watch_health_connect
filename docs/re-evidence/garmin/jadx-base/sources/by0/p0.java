package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431, 276}, m = "getDailyRacePredictorData", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f21997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f21998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2 f22001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22002g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(g2 g2Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f22001f = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22000e = obj;
        this.f22002g |= Integer.MIN_VALUE;
        return this.f22001f.c(null, null, this);
    }
}
