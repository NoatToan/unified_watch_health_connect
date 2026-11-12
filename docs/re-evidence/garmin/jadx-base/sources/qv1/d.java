package qv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel", f = "FBTProgressReportViewModel.kt", l = {343}, m = "getCourseDemands", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f148127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f148127b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148126a = obj;
        this.f148128c |= Integer.MIN_VALUE;
        return b.y4(this.f148127b, 0L, this);
    }
}
