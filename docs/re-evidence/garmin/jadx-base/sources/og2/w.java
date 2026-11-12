package og2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider", f = "LiveActivityAnimatedChartDataProvider.kt", l = {756}, m = "onTimescaleChanged", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pg2.a f132137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f132138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f132139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f132140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f132141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f132140d = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132139c = obj;
        this.f132141e |= Integer.MIN_VALUE;
        return v.a(this.f132140d, null, this);
    }
}
