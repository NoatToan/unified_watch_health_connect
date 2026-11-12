package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {325}, m = "getCyclingAbilityData", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f21907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f21907b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21906a = obj;
        this.f21908c |= Integer.MIN_VALUE;
        return this.f21907b.g(null, null, null, this);
    }
}
