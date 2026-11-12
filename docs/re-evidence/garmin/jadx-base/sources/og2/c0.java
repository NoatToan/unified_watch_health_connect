package og2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider", f = "LiveActivityAnimatedChartDataProvider.kt", l = {130}, m = "startListeningForActivityPause", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f132011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(v vVar, t13.d<? super c0> dVar) {
        super(dVar);
        this.f132011b = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132010a = obj;
        this.f132012c |= Integer.MIN_VALUE;
        return v.d(this.f132011b, this);
    }
}
