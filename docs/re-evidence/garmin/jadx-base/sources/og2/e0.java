package og2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider", f = "LiveActivityAnimatedChartDataProvider.kt", l = {154}, m = "startListeningForChartTimescaleChange", v = 2)
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f132023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v vVar, t13.d<? super e0> dVar) {
        super(dVar);
        this.f132023b = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132022a = obj;
        this.f132024c |= Integer.MIN_VALUE;
        return v.e(this.f132023b, this);
    }
}
