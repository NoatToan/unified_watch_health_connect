package x82;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.ui.patterns.reports.page.state.fetch.ReportsPageCatchingDataFetcher", f = "ReportsPageCatchingDataFetcher.kt", l = {16}, m = "fetchData-IoAF18A", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f189571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e<Object> f189572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f189573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e<Object> eVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f189572b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f189571a = obj;
        this.f189573c |= Integer.MIN_VALUE;
        Object objA = this.f189572b.a(this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
