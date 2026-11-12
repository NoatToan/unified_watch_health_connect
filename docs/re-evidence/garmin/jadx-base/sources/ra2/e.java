package ra2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.exportablereports.model.network.ReportsApiHelper", f = "ReportsApiHelper.kt", l = {45, 48}, m = "getReportID", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f151489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f151490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f151490b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f151489a = obj;
        this.f151491c |= Integer.MIN_VALUE;
        return this.f151490b.c(null, null, null, null, null, this);
    }
}
