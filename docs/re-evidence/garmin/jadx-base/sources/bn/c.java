package bn;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.data.HistoricalActivityTypesRepositoryImpl", f = "HistoricalActivityTypesRepositoryImpl.kt", l = {23}, m = "getHistoricalActivityTypes", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f18968b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18967a = obj;
        this.f18969c |= Integer.MIN_VALUE;
        return this.f18968b.a(0L, this, false);
    }
}
