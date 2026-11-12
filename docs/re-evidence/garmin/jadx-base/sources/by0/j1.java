package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431, 151}, m = "getSleepDailySummary", v = 2)
public final class j1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f21900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f21901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f21903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2 f21904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21905g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(g2 g2Var, t13.d<? super j1> dVar) {
        super(dVar);
        this.f21904f = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21903e = obj;
        this.f21905g |= Integer.MIN_VALUE;
        return this.f21904f.m(null, null, this);
    }
}
