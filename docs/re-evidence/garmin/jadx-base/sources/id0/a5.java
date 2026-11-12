package id0;

import android.graphics.Paint;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lid0/a5;", "Lq30/h;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a5 extends q30.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f00.c f92664d;

    public a5(CustomLineChart customLineChart, boolean z14) {
        super(customLineChart, false, 2, null);
        ChartAnimator animator = customLineChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = customLineChart.getViewPortHandler();
        viewPortHandler.getClass();
        f00.c cVar = new f00.c(customLineChart, animator, viewPortHandler);
        cVar.f67652c = Paint.Cap.ROUND;
        cVar.f67653d = Float.valueOf(z14 ? 40.0f : 0.0f);
        cVar.f67654e = Float.valueOf(20.0f);
        this.f92664d = cVar;
    }

    @Override // q30.h, qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f92664d;
    }

    @Override // q30.h
    /* JADX INFO: renamed from: e, reason: from getter */
    public final f00.c c() {
        return this.f92664d;
    }
}
