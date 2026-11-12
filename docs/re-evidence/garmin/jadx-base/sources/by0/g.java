package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {342, 356}, m = "fetchCyclingAbilityInChunks", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f21812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f21812b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21811a = obj;
        this.f21813c |= Integer.MIN_VALUE;
        return a.a(this.f21812b, null, null, this);
    }
}
