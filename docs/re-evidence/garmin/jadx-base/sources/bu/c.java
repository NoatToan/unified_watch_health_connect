package bu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.remote_resource.AnnualReportRemoteResourceManager", f = "AnnualReportRemoteResourceManager.kt", l = {193}, m = "fetchResource", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f21167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f21167d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21166c = obj;
        this.f21168e |= Integer.MIN_VALUE;
        return f.a(this.f21167d, null, this);
    }
}
