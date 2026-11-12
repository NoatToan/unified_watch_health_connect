package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431}, m = "removeMultiDayActivityTimelineSummaries", v = 2)
public final class b2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f21724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f21726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(g2 g2Var, t13.d<? super b2> dVar) {
        super(dVar);
        this.f21726d = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21725c = obj;
        this.f21727e |= Integer.MIN_VALUE;
        return this.f21726d.A(null, this);
    }
}
