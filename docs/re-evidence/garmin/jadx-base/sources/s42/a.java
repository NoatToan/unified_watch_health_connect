package s42;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.CandleStickChartRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls42/a;", "Lqz/h;", "Lcom/github/mikephil/charting/renderer/CandleStickChartRenderer;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "", "isDailyData", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements h<CandleStickChartRenderer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.e f157062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2961a f157063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e00.a f157064c;

    /* JADX INFO: renamed from: s42.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s42/a$a", "Li00/b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2961a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f157065i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f157066j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2961a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            transformer.getClass();
            this.f157065i = true;
            this.f157066j = true;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF157066j() {
            return this.f157066j;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF157065i() {
            return this.f157065i;
        }

        @Override // i00.b
        public final void g() {
            this.f157066j = false;
        }

        @Override // i00.b
        public final void h() {
            this.f157065i = false;
        }
    }

    public a(CombinedChart combinedChart, boolean z14) {
        combinedChart.getClass();
        ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = combinedChart.getTransformer(YAxis.AxisDependency.RIGHT);
        XAxis xAxis = combinedChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.e eVar = new h00.e(viewPortHandler, xAxis, transformer, z14 ? pz.a.LARGE_LIMIT_DOT_PATTERN : pz.a.ALL_LARGE_DOT_PATTERN, z14 ? pz.b.BOUNDARY_LABEL_PATTERN : pz.b.DEFAULT_LABEL_PATTERN, z14);
        eVar.f80604h = z14 ? 0.0f : 270.0f;
        eVar.f80605i = 10.0f;
        this.f157062a = eVar;
        this.f157063b = new C2961a(viewPortHandler, combinedChart.getAxisRight(), transformer);
        this.f157064c = new e00.a(combinedChart, combinedChart.getAnimator(), viewPortHandler);
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f157062a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f157064c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f157063b;
    }
}
