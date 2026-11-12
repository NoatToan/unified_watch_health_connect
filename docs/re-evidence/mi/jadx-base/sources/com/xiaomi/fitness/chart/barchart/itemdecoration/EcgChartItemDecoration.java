package com.xiaomi.fitness.chart.barchart.itemdecoration;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.BarBoardRender;
import com.xiaomi.fitness.chart.render.XAxisRender;
import com.xiaomi.fitness.chart.render.YAxisRender;
import defpackage.gv5;
import defpackage.onq;
import defpackage.qb7;
import defpackage.rtr;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.yfe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/chart/barchart/itemdecoration/EcgChartItemDecoration;", "Lyfe;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "onDraw", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "mOrientation", "I", "Lqb7;", "mLineChartRender", "Lqb7;", "Lonq;", "mHighLightValueFormatter", "Lonq;", "Lrtr;", "yAxis", "Lvqr;", "xAxis", "Lvfe;", "barChartAttrs", "<init>", "(Lrtr;Lvqr;Lvfe;)V", "Companion", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class EcgChartItemDecoration extends yfe {
    public static final int HORIZONTAL_LIST = 0;
    public static final int VERTICAL_LIST = 1;

    @NotNull
    private onq mHighLightValueFormatter;

    @NotNull
    private final qb7 mLineChartRender;
    private final int mOrientation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgChartItemDecoration(@NotNull rtr yAxis, @NotNull vqr xAxis, @NotNull vfe mBarChartAttrs) {
        super(yAxis, xAxis, mBarChartAttrs);
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(mBarChartAttrs, "barChartAttrs");
        this.mOrientation = mBarChartAttrs.i;
        this.mYAxis = yAxis;
        this.mXAxis = xAxis;
        this.mBarChartAttrs = mBarChartAttrs;
        Intrinsics.checkNotNullExpressionValue(mBarChartAttrs, "mBarChartAttrs");
        this.yAxisRenderer = new YAxisRender(mBarChartAttrs);
        T mBarChartAttrs2 = this.mBarChartAttrs;
        Intrinsics.checkNotNullExpressionValue(mBarChartAttrs2, "mBarChartAttrs");
        this.xAxisRenderer = new XAxisRender(mBarChartAttrs2);
        T mBarChartAttrs3 = this.mBarChartAttrs;
        Intrinsics.checkNotNullExpressionValue(mBarChartAttrs3, "mBarChartAttrs");
        this.mBarBoardRender = new BarBoardRender(mBarChartAttrs3);
        gv5 gv5Var = new gv5(0);
        this.mHighLightValueFormatter = gv5Var;
        this.mLineChartRender = new qb7((vfe) this.mBarChartAttrs, gv5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.set(0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // defpackage.yfe, androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        if (this.mOrientation == 0) {
            this.mBarBoardRender.drawBarBorder(canvas, parent);
            YAxisRender yAxisRender = this.yAxisRenderer;
            Y mYAxis = this.mYAxis;
            Intrinsics.checkNotNullExpressionValue(mYAxis, "mYAxis");
            yAxisRender.drawEcgHorizontalLine(canvas, parent, mYAxis);
            XAxisRender xAxisRender = this.xAxisRenderer;
            vqr mXAxis = this.mXAxis;
            Intrinsics.checkNotNullExpressionValue(mXAxis, "mXAxis");
            xAxisRender.drawVerticalLine(canvas, parent, mXAxis);
            XAxisRender xAxisRender2 = this.xAxisRenderer;
            vqr mXAxis2 = this.mXAxis;
            Intrinsics.checkNotNullExpressionValue(mXAxis2, "mXAxis");
            xAxisRender2.drawEcgXAxis(canvas, parent, mXAxis2);
            this.mLineChartRender.drawEcgChart(canvas, parent, (rtr) this.mYAxis);
            this.mLineChartRender.a(canvas, parent, (rtr) this.mYAxis);
        }
    }
}
