package pw1;

import p005kotlin.Metadata;
import tw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardViewModel", f = "ITPDashboardViewModel.kt", l = {145}, m = "getCompletedPlanActivities", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f141728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f141730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(dVar2);
        this.f141730c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141729b = obj;
        this.f141731d |= Integer.MIN_VALUE;
        return d.Y4(this.f141730c, null, this);
    }
}
