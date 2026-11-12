package tp;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.repository.ReportsRepoImpl", f = "ReportsRepoImpl.kt", l = {76, 88}, m = "getReports", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f165929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f165930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f165931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f165932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f165933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f165932d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165931c = obj;
        this.f165933e |= Integer.MIN_VALUE;
        List<String> list = b.f165919b;
        return this.f165932d.f(null, null, null, null, this);
    }
}
