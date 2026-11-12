package com.xiaomi.fitness.chart.barchart.itemdecoration;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b52;
import defpackage.gv5;
import defpackage.qt5;
import defpackage.r02;
import defpackage.rtr;
import defpackage.t02;
import defpackage.vqr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BarChartDetailDecoration;", "Lb52;", "Lr02;", "Lrtr;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "Lqt5;", "mBarChartValueFormatter", "Lqt5;", "Lgv5;", "mHighLightValueFormatter", "Lgv5;", "getMHighLightValueFormatter", "()Lgv5;", "Lt02;", "mBarChartRender", "Lt02;", "", "drawLineChart", "Z", "getDrawLineChart", "()Z", "setDrawLineChart", "(Z)V", "yAxis", "Lvqr;", "xAxis", "barChartAttrs", "<init>", "(Lrtr;Lvqr;Lr02;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class BarChartDetailDecoration extends b52<r02, rtr> {
    private boolean drawLineChart;

    @NotNull
    private final t02 mBarChartRender;

    @NotNull
    private final qt5 mBarChartValueFormatter;

    @NotNull
    private final gv5 mHighLightValueFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarChartDetailDecoration(@NotNull rtr yAxis, @NotNull vqr xAxis, @NotNull r02 barChartAttrs) {
        super(yAxis, xAxis, barChartAttrs);
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(barChartAttrs, "barChartAttrs");
        qt5 qt5Var = new qt5(0);
        this.mBarChartValueFormatter = qt5Var;
        gv5 gv5Var = new gv5(0);
        this.mHighLightValueFormatter = gv5Var;
        this.mBarChartRender = new t02((r02) this.mBarChartAttrs, qt5Var, gv5Var);
    }

    public final boolean getDrawLineChart() {
        return this.drawLineChart;
    }

    @NotNull
    public final gv5 getMHighLightValueFormatter() {
        return this.mHighLightValueFormatter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        this.mBarChartRender.b(canvas, parent, (rtr) this.mYAxis);
    }

    public final void setDrawLineChart(boolean z) {
        this.drawLineChart = z;
    }
}
