package vu1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {554}, m = "getActivities", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f180262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f180263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f180264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f180263b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f180262a = obj;
        this.f180264c |= Integer.MIN_VALUE;
        return c.X4(this.f180263b, null, this);
    }
}
