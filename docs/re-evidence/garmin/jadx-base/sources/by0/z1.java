package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431}, m = "removeHeatAltitudeAcclimationData", v = 2)
public final class z1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f22165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f22167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(g2 g2Var, t13.d<? super z1> dVar) {
        super(dVar);
        this.f22167d = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22166c = obj;
        this.f22168e |= Integer.MIN_VALUE;
        return this.f22167d.y(null, this);
    }
}
