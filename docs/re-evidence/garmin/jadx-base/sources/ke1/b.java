package ke1;

import android.content.Context;
import android.text.format.DateFormat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import f00.c;
import f00.d;
import i00.e;
import p005kotlin.Metadata;
import qz.h;
import yz.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lke1/b;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;)V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.h f104543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f104544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f104545c;

    public b(CombinedChart combinedChart) {
        combinedChart.getClass();
        Context context = combinedChart.getContext();
        ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
        Transformer transformer = combinedChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        XAxis xAxis = combinedChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.h hVar = new h00.h(viewPortHandler, xAxis, transformer);
        hVar.f80601e = new k(DateFormat.is24HourFormat(context));
        hVar.f80603g = true;
        this.f104543a = hVar;
        YAxis axisLeft = combinedChart.getAxisLeft();
        axisLeft.getClass();
        this.f104544b = new e(viewPortHandler, axisLeft, transformer);
        ChartAnimator animator = combinedChart.getAnimator();
        animator.getClass();
        this.f104545c = new d(combinedChart, animator, viewPortHandler);
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f104543a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f104545c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f104544b;
    }
}
