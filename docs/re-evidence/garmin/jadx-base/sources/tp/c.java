package tp;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.repository.ReportsRepoImpl", f = "ReportsRepoImpl.kt", l = {145}, m = "deleteActivity", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f165921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f165922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f165922b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165921a = obj;
        this.f165923c |= Integer.MIN_VALUE;
        return this.f165922b.d(0L, this);
    }
}
