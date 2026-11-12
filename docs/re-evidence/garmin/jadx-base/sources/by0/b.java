package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100}, m = "clearCacheForEpic", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f21711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f21711c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21710b = obj;
        this.f21712d |= Integer.MIN_VALUE;
        return this.f21711c.c(null, this);
    }
}
