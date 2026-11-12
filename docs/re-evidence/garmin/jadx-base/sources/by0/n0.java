package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431, 202}, m = "getCyclingAbilityData", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f21963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f21964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f21966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2 f21967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21968g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(g2 g2Var, t13.d<? super n0> dVar) {
        super(dVar);
        this.f21967f = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21966e = obj;
        this.f21968g |= Integer.MIN_VALUE;
        return this.f21967f.b(null, null, this);
    }
}
