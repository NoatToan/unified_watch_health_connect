package com.xiaomi.fitness.chart.mpchart.linechart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.mibi.sdk.component.Constants;
import defpackage.ae5;
import defpackage.bge;
import defpackage.fmq;
import defpackage.ic8;
import defpackage.ni4;
import defpackage.qzi;
import defpackage.wfe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\u0004J\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J3\u0010\u0012\u001a\u00020\u0002\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/chart/mpchart/linechart/DataCubicLineChart;", "Lcom/xiaomi/fitness/chart/mpchart/linechart/CustomLineChart;", "", "initLineChart", "()V", "setXY", "Lcom/github/mikephil/charting/data/LineDataSet;", "set1", "Lwfe;", "colorAttr", "setFill", "(Lcom/github/mikephil/charting/data/LineDataSet;Lwfe;)V", "onFinishInflate", "setEcgMaxAndMin", "Lcom/github/mikephil/charting/data/Entry;", "T", "", Constants.KEY_RECHARGE_VALUES, "bindData", "(Ljava/util/List;Lwfe;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "chart_release"}, k = 1, mv = {2, 0, 0})
public class DataCubicLineChart extends CustomLineChart {

    @NotNull
    private static final String TAG = "RateCubicLineChart";

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DataCubicLineChart(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private final void initLineChart() {
        setMinOffset(0.0f);
        setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        setDrawGridBackground(false);
        getDescription().setEnabled(false);
        setTouchEnabled(false);
        setDrawBorders(false);
        setDragEnabled(true);
        setScaleEnabled(true);
        setScaleYEnabled(false);
        setPinchZoom(true);
        setDrawMarkers(false);
        setNoDataText(getMContext().getString(qzi.common_data_empty));
        getLegend().setEnabled(false);
        setXY();
    }

    private final void setFill(LineDataSet set1, wfe colorAttr) {
        if (fmq.s() >= 18) {
            set1.r1(ni4.e(getMContext(), colorAttr.f37919b));
        } else {
            set1.q1(ni4.c(getMContext(), colorAttr.c));
        }
    }

    private final void setXY() {
        XAxis xAxis = getXAxis();
        this.mXAxis = xAxis;
        xAxis.setAxisMinimum(0.0f);
        this.mXAxis.setDrawAxisLine(false);
        this.mXAxis.setEnabled(false);
        YAxis axisRight = getAxisRight();
        this.mAxisRight = axisRight;
        axisRight.setAxisMinimum(0.0f);
        this.mAxisRight.v(0.0f);
        this.mAxisRight.setEnabled(false);
        YAxis axisLeft = getAxisLeft();
        this.mAxisLeft = axisLeft;
        axisLeft.setAxisMinimum(0.0f);
        this.mAxisLeft.setEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Entry> void bindData(@Nullable List<? extends T> values, @Nullable wfe colorAttr) {
        bge bgeVar = (bge) getData();
        Collections.sort(values, new ic8());
        if (bgeVar == null || bgeVar.j() <= 0) {
            ae5 ae5Var = new ae5(values, "DataSet 1");
            ae5Var.z1(0.2f);
            ae5Var.X0(false);
            if (colorAttr != null) {
                ae5Var.V0(ni4.c(getMContext(), colorAttr.f37918a));
                setFill(ae5Var, colorAttr);
                ae5Var.p1(255);
                ae5Var.o1(true);
            } else {
                ae5Var.o1(false);
            }
            ae5Var.m1(false);
            ae5Var.s1(1.0f);
            ae5Var.a1(4.0f);
            ae5Var.v1(-16711936);
            ae5Var.y1(1.0f);
            ae5Var.B1(false);
            ae5Var.Y0(false);
            ae5Var.t1();
            ae5Var.k1();
            ae5Var.Z0(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ae5Var);
            ae5Var.D1(LineDataSet.Mode.LINEAR);
            setData(new bge(arrayList));
        } else {
            T tI = bgeVar.i(0);
            Intrinsics.checkNotNull(tI, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.dataset.CustomLineDataSet<*>");
            ae5 ae5Var2 = (ae5) tI;
            ae5Var2.i1(values);
            ae5Var2.S0();
            if (colorAttr != null) {
                ae5Var2.V0(ni4.c(getMContext(), colorAttr.f37918a));
                setFill(ae5Var2, colorAttr);
                ae5Var2.p1(255);
            }
            bgeVar.x();
            notifyDataSetChanged();
        }
        invalidate();
    }

    @Override // com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        initLineChart();
    }

    public final void setEcgMaxAndMin() {
        this.mAxisLeft.setAxisMinimum(0.0f);
        this.mAxisLeft.mAxisMaximum = 4.0f;
        this.mAxisRight.setAxisMinimum(0.0f);
        this.mAxisRight.mAxisMaximum = 4.0f;
    }

    public /* synthetic */ DataCubicLineChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DataCubicLineChart(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
