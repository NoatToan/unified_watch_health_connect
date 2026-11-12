package tp;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.repository.ReportsRepoImpl", f = "ReportsRepoImpl.kt", l = {122}, m = "getActivities", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f165924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f165925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f165926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f165927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f165928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f165927d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165926c = obj;
        this.f165928e |= Integer.MIN_VALUE;
        return this.f165927d.e(null, null, null, null, this);
    }
}
