package u82;

import p005kotlin.Metadata;
import r53.o2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.ui.patterns.reports.page.ReportsPageCachedRepositoryState", f = "ReportsPageCachedRepositoryState.kt", l = {105}, m = "fetchPageData", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o2 f169484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a<Object, Object> f169486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a<Object, Object> aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f169486d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169485c = obj;
        this.f169487e |= Integer.MIN_VALUE;
        return a.d(this.f169486d, null, null, false, this);
    }
}
