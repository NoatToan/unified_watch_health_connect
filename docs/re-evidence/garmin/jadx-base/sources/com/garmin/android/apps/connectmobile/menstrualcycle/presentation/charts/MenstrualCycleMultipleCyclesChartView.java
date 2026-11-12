package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import dx0.f;
import dx0.g;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/charts/MenstrualCycleMultipleCyclesChartView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MenstrualCycleMultipleCyclesChartView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f38771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CustomBarChart f38772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rz.a<List<a>, d00.a> f38773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f38774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f38775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenstrualCycleMultipleCyclesChartView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_menstrual_cycle_multiple_cycles_chart, (ViewGroup) this, true);
        setOrientation(1);
        View viewFindViewById = findViewById(R.id.mct_multiple_cycles_graph_bar_chart_no_data);
        viewFindViewById.getClass();
        this.f38770a = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.mct_multiple_cycles_graph_legend);
        viewFindViewById2.getClass();
        this.f38771b = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.mct_multiple_cycles_bar_chart);
        viewFindViewById3.getClass();
        CustomBarChart customBarChart = (CustomBarChart) viewFindViewById3;
        this.f38772c = customBarChart;
        this.f38773d = new rz.a<>(customBarChart, new f(context), new g(customBarChart), null, null, null, 56, null);
        View viewFindViewById4 = findViewById(R.id.mct_multiple_cycles_graph_legend_fertile_window);
        viewFindViewById4.getClass();
        this.f38774e = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.mct_multiple_cycles_graph_legend_pregnancy_window);
        viewFindViewById5.getClass();
        this.f38775f = viewFindViewById5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MenstrualCycleMultipleCyclesChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MenstrualCycleMultipleCyclesChartView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ MenstrualCycleMultipleCyclesChartView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
