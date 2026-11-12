package iy0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Liy0/o;", "Lqz/h;", "Lf00/c;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements qz.h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f95814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i00.c f95815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.c f95816c;

    static {
        new a(null);
    }

    public o(CustomLineChart customLineChart) {
        customLineChart.getClass();
        Context context = customLineChart.getContext();
        ViewPortHandler viewPortHandler = customLineChart.getViewPortHandler();
        Transformer transformer = customLineChart.getTransformer(YAxis.AxisDependency.LEFT);
        context.getClass();
        m00.a aVar = new m00.a(context, null, 2, null);
        viewPortHandler.getClass();
        XAxis xAxis = customLineChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        p pVar = new p(viewPortHandler, xAxis, transformer);
        pVar.f80601e = new yz.j();
        pVar.f80603g = true;
        this.f95814a = pVar;
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.getClass();
        i00.c cVar = new i00.c(viewPortHandler, axisLeft, transformer);
        cVar.f86714d = new m00.e(aVar);
        this.f95815b = cVar;
        ChartAnimator animator = customLineChart.getAnimator();
        animator.getClass();
        f00.c cVar2 = new f00.c(customLineChart, animator, viewPortHandler);
        cVar2.f67656g = Float.valueOf(16.0f);
        this.f95816c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF159999a() {
        return this.f95814a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f95816c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF160000b() {
        return this.f95815b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liy0/o$a;", "", "<init>", "()V", "", "CHART_EXTRA_RIGHT_OFFSET", "F", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
