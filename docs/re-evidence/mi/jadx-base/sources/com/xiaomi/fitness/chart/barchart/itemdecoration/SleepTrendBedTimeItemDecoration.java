package com.xiaomi.fitness.chart.barchart.itemdecoration;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.XAxisRender;
import defpackage.rtr;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.yfe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/chart/barchart/itemdecoration/SleepTrendBedTimeItemDecoration;", "Lyfe;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "Lrtr;", "yAxis", "Lvqr;", "xAxis", "Lvfe;", "barChartAttrs", "<init>", "(Lrtr;Lvqr;Lvfe;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class SleepTrendBedTimeItemDecoration extends yfe {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepTrendBedTimeItemDecoration(@NotNull rtr yAxis, @NotNull vqr xAxis, @NotNull vfe barChartAttrs) {
        super(yAxis, xAxis, barChartAttrs);
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(barChartAttrs, "barChartAttrs");
        T mBarChartAttrs = this.mBarChartAttrs;
        Intrinsics.checkNotNullExpressionValue(mBarChartAttrs, "mBarChartAttrs");
        this.xAxisRenderer = new XAxisRender(mBarChartAttrs);
    }

    @Override // defpackage.yfe, androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        XAxisRender xAxisRender = this.xAxisRenderer;
        vqr mXAxis = this.mXAxis;
        Intrinsics.checkNotNullExpressionValue(mXAxis, "mXAxis");
        xAxisRender.drawXAxis(canvas, parent, mXAxis);
    }
}
