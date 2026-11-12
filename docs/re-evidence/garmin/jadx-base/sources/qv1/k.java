package qv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel", f = "FBTProgressReportViewModel.kt", l = {449}, m = "hasActiveATPPlan", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f148166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f148166b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148165a = obj;
        this.f148167c |= Integer.MIN_VALUE;
        return b.G4(this.f148166b, this);
    }
}
