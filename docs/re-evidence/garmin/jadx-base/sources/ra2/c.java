package ra2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.exportablereports.model.network.ReportsApiHelper", f = "ReportsApiHelper.kt", l = {108}, m = "ackReportSuccess", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f151483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f151484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f151484b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f151483a = obj;
        this.f151485c |= Integer.MIN_VALUE;
        return this.f151484b.a(null, this);
    }
}
