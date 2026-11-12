package f32;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.view.summary.data.SummarySafeResultRequester", f = "SummarySafeResultRequester.kt", l = {9}, m = "requestSummary$suspendImpl", v = 2)
public final class o<SummaryData> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f68693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<SummaryData> f68694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p<SummaryData> pVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f68694b = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f68693a = obj;
        this.f68695c |= Integer.MIN_VALUE;
        return p.c(this.f68694b, null, null, this);
    }
}
