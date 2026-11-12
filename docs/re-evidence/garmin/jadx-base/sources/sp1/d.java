package sp1;

import android.content.Context;
import android.text.format.DateFormat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import i00.e;
import p005kotlin.Metadata;
import qz.h;
import yz.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsp1/d;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;)V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.h f160511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f160512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.d f160513c;

    public d(LineChart lineChart) {
        lineChart.getClass();
        Context context = lineChart.getContext();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        h00.h hVar = new h00.h(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        hVar.f80601e = new k(DateFormat.is24HourFormat(context));
        hVar.f80603g = true;
        this.f160511a = hVar;
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.getClass();
        this.f160512b = new e(viewPortHandler, axisLeft, transformer);
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        this.f160513c = new f00.d(lineChart, animator, viewPortHandler);
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF157069d() {
        return this.f160511a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f160513c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF157070e() {
        return this.f160512b;
    }
}
