package og2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider", f = "LiveActivityAnimatedChartDataProvider.kt", l = {142}, m = "startListeningForActivityDisconnect", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f132005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(v vVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f132005b = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132004a = obj;
        this.f132006c |= Integer.MIN_VALUE;
        return v.c(this.f132005b, this);
    }
}
