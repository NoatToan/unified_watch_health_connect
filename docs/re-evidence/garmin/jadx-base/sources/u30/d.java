package u30;

import android.content.Context;
import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.i;
import m00.e;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu30/d;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f168279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i00.c f168280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.c f168281c;

    public d(LineChart lineChart) {
        lineChart.getClass();
        Context context = lineChart.getContext();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        context.getClass();
        m00.a aVar = new m00.a(context, null, 2, null);
        viewPortHandler.getClass();
        i iVar = new i(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        iVar.f80601e = new m00.d(aVar);
        iVar.f80603g = true;
        iVar.f80605i = 8.0f;
        this.f168279a = iVar;
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.getClass();
        i00.c cVar = new i00.c(viewPortHandler, axisLeft, transformer);
        cVar.f86714d = new e(aVar);
        this.f168280b = cVar;
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        f00.c cVar2 = new f00.c(lineChart, animator, viewPortHandler);
        cVar2.f67652c = Paint.Cap.ROUND;
        cVar2.f67653d = Float.valueOf(0.0f);
        this.f168281c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f168279a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f168281c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f168280b;
    }
}
