package rl1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.Chart;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.data.ChartData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u001a\b\u0000\u0010\u0004*\u0014\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u00020\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrl1/f;", "Lcom/github/mikephil/chartingv2/data/ChartData;", "Lcom/github/mikephil/chartingv2/interfaces/datasets/IDataSet;", "Lcom/github/mikephil/chartingv2/data/Entry;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/github/mikephil/chartingv2/charts/Chart;", "chart", "<init>", "(Landroid/content/Context;Lcom/github/mikephil/chartingv2/charts/Chart;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f<T extends ChartData<? extends IDataSet<? extends Entry>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gz.d f153412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mz.c f153413c;

    public f(Context context, Chart<T> chart) {
        context.getClass();
        chart.getClass();
        this.f153411a = context;
        gz.d dVar = new gz.d();
        this.f153412b = dVar;
        dVar.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
        dVar.setWordWrapEnabled(true);
        dVar.setFormSize(11.0f);
        dVar.setTextSize(12.0f);
        dVar.setFormToTextSpace(3.0f);
        dVar.setXEntrySpace(25.0f);
        dVar.setYOffset(10.0f);
        dVar.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
        dVar.setTypeface(h22.a.a(h22.b.a(dVar.getTypeface()), context));
        this.f153413c = new mz.c(chart.getViewPortHandler(), dVar, context);
    }
}
