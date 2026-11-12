package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431, 391}, m = "getLiveTrackData", v = 2)
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f21759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f21760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f21762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2 f21763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21764g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(g2 g2Var, t13.d<? super d1> dVar) {
        super(dVar);
        this.f21763f = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21762e = obj;
        this.f21764g |= Integer.MIN_VALUE;
        return this.f21763f.j(null, null, this);
    }
}
