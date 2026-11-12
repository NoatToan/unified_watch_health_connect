package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {125}, m = "updateEpicDetails", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cy0.k f21910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f21912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(a aVar, t13.d<? super k0> dVar) {
        super(dVar);
        this.f21912d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21911c = obj;
        this.f21913e |= Integer.MIN_VALUE;
        return this.f21912d.u(null, null, this);
    }
}
