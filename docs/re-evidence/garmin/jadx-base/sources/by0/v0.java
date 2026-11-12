package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431, 117}, m = "getEntrySummaries", v = 2)
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f22095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f22096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2 f22099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22100g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(g2 g2Var, t13.d<? super v0> dVar) {
        super(dVar);
        this.f22099f = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22098e = obj;
        this.f22100g |= Integer.MIN_VALUE;
        return this.f22099f.f(null, null, this);
    }
}
