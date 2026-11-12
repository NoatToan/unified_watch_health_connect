package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431}, m = "removeTrainingLoadData", v = 2)
public final class e2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f21785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f21787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(g2 g2Var, t13.d<? super e2> dVar) {
        super(dVar);
        this.f21787d = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21786c = obj;
        this.f21788e |= Integer.MIN_VALUE;
        return this.f21787d.D(null, this);
    }
}
