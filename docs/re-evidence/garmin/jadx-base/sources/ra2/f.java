package ra2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.exportablereports.model.network.ReportsApiHelper", f = "ReportsApiHelper.kt", l = {72}, m = "getReportPreparationStatus", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f151492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f151493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f151493b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f151492a = obj;
        this.f151494c |= Integer.MIN_VALUE;
        return this.f151493b.d(null, this);
    }
}
