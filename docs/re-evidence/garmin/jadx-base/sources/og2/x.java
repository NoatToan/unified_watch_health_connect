package og2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider", f = "LiveActivityAnimatedChartDataProvider.kt", l = {120}, m = "registerOtherEventListener", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f132143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f132143b = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132142a = obj;
        this.f132144c |= Integer.MIN_VALUE;
        return v.b(this.f132143b, null, this);
    }
}
