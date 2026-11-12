package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {469}, m = "getHealthStats", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f22044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a aVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f22044b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22043a = obj;
        this.f22045c |= Integer.MIN_VALUE;
        return this.f22044b.l(null, null, null, this);
    }
}
