package s42;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls42/e;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "", "isDailyData", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.e f157095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f157096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.b f157097c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s42/e$a", "Li00/b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f157098i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f157099j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            transformer.getClass();
            this.f157098i = true;
            this.f157099j = true;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF157099j() {
            return this.f157099j;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF157098i() {
            return this.f157098i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: d */
        public final boolean getF160005j() {
            return false;
        }

        @Override // i00.b
        public final void g() {
            this.f157099j = false;
        }

        @Override // i00.b
        public final void h() {
            this.f157098i = false;
        }
    }

    public e(CombinedChart combinedChart, boolean z14) {
        combinedChart.getClass();
        ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = combinedChart.getTransformer(YAxis.AxisDependency.LEFT);
        XAxis xAxis = combinedChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.e eVar = new h00.e(viewPortHandler, xAxis, transformer, z14 ? pz.a.LARGE_LIMIT_DOT_PATTERN : pz.a.ALL_LARGE_DOT_PATTERN, z14 ? pz.b.BOUNDARY_LABEL_PATTERN : pz.b.DEFAULT_LABEL_PATTERN, z14);
        eVar.f80604h = z14 ? 0.0f : 270.0f;
        eVar.f80605i = 10.0f;
        this.f157095a = eVar;
        this.f157096b = new a(viewPortHandler, combinedChart.getAxisLeft(), transformer);
        ChartAnimator animator = combinedChart.getAnimator();
        animator.getClass();
        f00.b bVar = new f00.b(combinedChart, animator, viewPortHandler);
        bVar.f67652c = Paint.Cap.ROUND;
        this.f157097c = bVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f157095a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f157097c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f157096b;
    }
}
