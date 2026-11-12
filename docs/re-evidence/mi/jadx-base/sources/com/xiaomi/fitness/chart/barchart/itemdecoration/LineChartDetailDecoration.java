package com.xiaomi.fitness.chart.barchart.itemdecoration;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.YAxisRender;
import defpackage.gv5;
import defpackage.rtr;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.yfe;
import defpackage.zfe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/chart/barchart/itemdecoration/LineChartDetailDecoration;", "Lyfe;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "str", "setLabelText", "(Ljava/lang/String;)V", "", "flag", "setBreakPointLine", "(Ljava/lang/Boolean;)V", "Lzfe;", "mLineChartRender", "Lzfe;", "labelText", "Ljava/lang/String;", "Lrtr;", "yAxis", "Lvqr;", "xAxis", "Lvfe;", "barChartAttrs", "<init>", "(Lrtr;Lvqr;Lvfe;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class LineChartDetailDecoration extends yfe {

    @Nullable
    private String labelText;

    @Nullable
    private zfe mLineChartRender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineChartDetailDecoration(@NotNull rtr yAxis, @NotNull vqr xAxis, @NotNull vfe barChartAttrs) {
        super(yAxis, xAxis, barChartAttrs);
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(barChartAttrs, "barChartAttrs");
        this.mLineChartRender = new zfe((vfe) this.mBarChartAttrs, new gv5(0));
    }

    @Override // defpackage.yfe, androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        zfe zfeVar = this.mLineChartRender;
        if (zfeVar != null) {
            zfeVar.drawLineChart(canvas, parent, this.mYAxis);
        }
        YAxisRender yAxisRender = this.yAxisRenderer;
        Y mYAxis = this.mYAxis;
        Intrinsics.checkNotNullExpressionValue(mYAxis, "mYAxis");
        yAxisRender.drawYAxisLabel(canvas, parent, mYAxis);
        if (this.labelText != null) {
            YAxisRender yAxisRender2 = this.yAxisRenderer;
            Y mYAxis2 = this.mYAxis;
            Intrinsics.checkNotNullExpressionValue(mYAxis2, "mYAxis");
            String str = this.labelText;
            Intrinsics.checkNotNull(str);
            yAxisRender2.drawYAxisLabelText(canvas, parent, mYAxis2, str);
        }
    }

    @Override // defpackage.yfe
    public void setBreakPointLine(@Nullable Boolean flag) {
        zfe zfeVar = this.mLineChartRender;
        if (zfeVar != null) {
            zfeVar.setBreakPointLine(flag);
        }
    }

    public final void setLabelText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        this.labelText = str;
    }
}
