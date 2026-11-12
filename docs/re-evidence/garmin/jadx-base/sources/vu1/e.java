package vu1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {501}, m = "getCompletedActivityStatsDuringPlan", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f180265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f180266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f180267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f180268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f180267c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f180266b = obj;
        this.f180268d |= Integer.MIN_VALUE;
        return c.Y4(this.f180267c, null, this);
    }
}
