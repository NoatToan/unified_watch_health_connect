package s42;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.renderer.CandleStickChartRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls42/b;", "Lsz/b;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "", "isDailyData", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends sz.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f157067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f157068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h00.b f157069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i00.b f157070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i00.b f157071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c00.a f157072g;

    public b(CombinedChart combinedChart, boolean z14) {
        combinedChart.getClass();
        e eVar = new e(combinedChart, z14);
        this.f157067b = eVar;
        a aVar = new a(combinedChart, z14);
        this.f157068c = aVar;
        this.f157069d = eVar.f157095a;
        this.f157070e = eVar.f157096b;
        this.f157071f = aVar.f157063b;
        ChartAnimator animator = combinedChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
        viewPortHandler.getClass();
        c00.a aVar2 = new c00.a(combinedChart, animator, viewPortHandler);
        aVar2.f22349a = Float.valueOf(55.0f);
        aVar2.f22350b = Float.valueOf(25.0f);
        this.f157072g = aVar2;
    }

    @Override // sz.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final i00.b getF157071f() {
        return this.f157071f;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h00.b getF157069d() {
        return this.f157069d;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f157072g;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i00.b getF157070e() {
        return this.f157070e;
    }

    @Override // sz.b
    public final h<d00.a> e() {
        return null;
    }

    @Override // sz.b
    public final h<CandleStickChartRenderer> f() {
        return this.f157068c;
    }

    @Override // sz.b
    public final h<f00.c> g() {
        return this.f157067b;
    }
}
