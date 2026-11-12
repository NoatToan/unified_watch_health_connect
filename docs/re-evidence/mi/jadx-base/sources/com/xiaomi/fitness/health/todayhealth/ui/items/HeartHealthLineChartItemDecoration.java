package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.XAxisRender;
import com.xiaomi.fitness.chart.render.YAxisRender;
import defpackage.b52;
import defpackage.c5c;
import defpackage.gv5;
import defpackage.onq;
import defpackage.rtr;
import defpackage.vfe;
import defpackage.vqr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00105\u001a\u00020&¢\u0006\u0004\b6\u00107J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010)\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010(\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/HeartHealthLineChartItemDecoration;", "Lb52;", "Lvfe;", "Lrtr;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "", "listColor", "", "listValue", "setPointLineColor", "(Ljava/util/List;Ljava/util/List;)V", "topValue", "bottomValue", "setAGPAreaValue", "(FF)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawable", "(Ljava/util/List;)V", "Lonq;", "highLightValueFormatter", "setHighLightValueFormatter", "(Lonq;)V", "mHighLightValueFormatter", "Lonq;", "Lc5c;", "mLineChartRender", "Lc5c;", "F", "", "drawAGPLineChart", "Z", "drawSelectFill", "getDrawSelectFill", "()Z", "setDrawSelectFill", "(Z)V", "xAxisDrawBloodGlucoseDetail", "getXAxisDrawBloodGlucoseDetail", "setXAxisDrawBloodGlucoseDetail", "yAxis", "Lvqr;", "xAxis", "barChartAttrs", "drawAGPLinerChart", "<init>", "(Lrtr;Lvqr;Lvfe;Z)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HeartHealthLineChartItemDecoration extends b52<vfe, rtr> {
    private float bottomValue;
    private boolean drawAGPLineChart;
    private boolean drawSelectFill;

    @NotNull
    private onq mHighLightValueFormatter;

    @NotNull
    private final c5c mLineChartRender;
    private float topValue;
    private boolean xAxisDrawBloodGlucoseDetail;

    public /* synthetic */ HeartHealthLineChartItemDecoration(rtr rtrVar, vqr vqrVar, vfe vfeVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rtrVar, vqrVar, vfeVar, (i & 8) != 0 ? false : z);
    }

    public final boolean getDrawSelectFill() {
        return this.drawSelectFill;
    }

    public final boolean getXAxisDrawBloodGlucoseDetail() {
        return this.xAxisDrawBloodGlucoseDetail;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        YAxisRender yAxisRender = this.yAxisRenderer;
        Y mYAxis = this.mYAxis;
        Intrinsics.checkNotNullExpressionValue(mYAxis, "mYAxis");
        yAxisRender.drawYAxisLabel(canvas, parent, mYAxis);
        YAxisRender yAxisRender2 = this.yAxisRenderer;
        Y mYAxis2 = this.mYAxis;
        Intrinsics.checkNotNullExpressionValue(mYAxis2, "mYAxis");
        yAxisRender2.drawHorizontalLine(canvas, parent, mYAxis2);
        XAxisRender xAxisRender = this.xAxisRenderer;
        vqr mXAxis = this.mXAxis;
        Intrinsics.checkNotNullExpressionValue(mXAxis, "mXAxis");
        xAxisRender.drawVerticalLine(canvas, parent, mXAxis);
        if (this.xAxisDrawBloodGlucoseDetail) {
            XAxisRender xAxisRender2 = this.xAxisRenderer;
            vqr mXAxis2 = this.mXAxis;
            Intrinsics.checkNotNullExpressionValue(mXAxis2, "mXAxis");
            xAxisRender2.drawXAxisBloodGlucoseDetail(canvas, parent, mXAxis2);
        } else {
            XAxisRender xAxisRender3 = this.xAxisRenderer;
            vqr mXAxis3 = this.mXAxis;
            Intrinsics.checkNotNullExpressionValue(mXAxis3, "mXAxis");
            xAxisRender3.drawXAxisBloodGlucose(canvas, parent, mXAxis3);
        }
        this.xAxisRenderer.drawBackground(canvas, parent);
        this.mBarBoardRender.drawBarBorder(canvas, parent);
        if (this.drawAGPLineChart) {
            this.mLineChartRender.n(canvas, parent, (rtr) this.mYAxis);
            this.mLineChartRender.p(canvas, parent, ((rtr) this.mYAxis).getAxisMaximum(), this.topValue, this.bottomValue);
        } else {
            if (this.drawSelectFill) {
                this.mLineChartRender.q(canvas, parent, ((rtr) this.mYAxis).getAxisMaximum(), this.topValue, this.bottomValue);
            }
            this.mLineChartRender.o(canvas, parent, (rtr) this.mYAxis);
        }
        c5c c5cVar = this.mLineChartRender;
        c5cVar.f40867b = true;
        c5cVar.c(canvas, parent, this.mYAxis);
    }

    public final void setAGPAreaValue(float topValue, float bottomValue) {
        this.topValue = topValue;
        this.bottomValue = bottomValue;
    }

    public final void setDrawSelectFill(boolean z) {
        this.drawSelectFill = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setDrawable(@NotNull List<? extends Drawable> drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.mLineChartRender.f40866a = drawable;
    }

    public final void setHighLightValueFormatter(@Nullable onq highLightValueFormatter) {
        Intrinsics.checkNotNull(highLightValueFormatter);
        this.mHighLightValueFormatter = highLightValueFormatter;
        this.mLineChartRender.v(highLightValueFormatter);
    }

    public final void setPointLineColor(@Nullable List<Integer> listColor, @Nullable List<Float> listValue) {
        Float f;
        Float f2;
        if (listValue != null && listValue.size() > 1) {
            this.bottomValue = (listValue == null || (f2 = listValue.get(1)) == null) ? 3.9f : f2.floatValue();
            this.topValue = (listValue == null || (f = listValue.get(2)) == null) ? 10.0f : f.floatValue();
        }
        this.mLineChartRender.m(listColor, listValue, (rtr) this.mYAxis);
    }

    public final void setXAxisDrawBloodGlucoseDetail(boolean z) {
        this.xAxisDrawBloodGlucoseDetail = z;
    }

    public HeartHealthLineChartItemDecoration(@Nullable rtr rtrVar, @Nullable vqr vqrVar, @Nullable vfe vfeVar, boolean z) {
        super(rtrVar, vqrVar, vfeVar);
        gv5 gv5Var = new gv5(0);
        this.mHighLightValueFormatter = gv5Var;
        this.mLineChartRender = new c5c((vfe) this.mBarChartAttrs, gv5Var);
        this.topValue = 10.0f;
        this.bottomValue = 3.9f;
        this.drawAGPLineChart = z;
    }
}
