package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431}, m = "removeEnduranceScoreData", v = 2)
public final class w1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f22118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f22120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22121e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(g2 g2Var, t13.d<? super w1> dVar) {
        super(dVar);
        this.f22120d = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22119c = obj;
        this.f22121e |= Integer.MIN_VALUE;
        return this.f22120d.v(null, this);
    }
}
