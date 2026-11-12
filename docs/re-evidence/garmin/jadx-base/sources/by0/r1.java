package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431}, m = "removeActivityList", v = 2)
public final class r1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f22039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f22041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(g2 g2Var, t13.d<? super r1> dVar) {
        super(dVar);
        this.f22041d = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22040c = obj;
        this.f22042e |= Integer.MIN_VALUE;
        return this.f22041d.q(null, this);
    }
}
