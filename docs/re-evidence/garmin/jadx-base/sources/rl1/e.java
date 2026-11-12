package rl1;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.Chart;
import com.github.mikephil.chartingv2.data.ChartData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u001a\b\u0000\u0010\u0004*\u0014\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrl1/e;", "Lcom/github/mikephil/chartingv2/data/ChartData;", "Lcom/github/mikephil/chartingv2/interfaces/datasets/IDataSet;", "Lcom/github/mikephil/chartingv2/data/Entry;", "T", "Lrl1/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/github/mikephil/chartingv2/charts/Chart;", "chart", "<init>", "(Landroid/content/Context;Lcom/github/mikephil/chartingv2/charts/Chart;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e<T extends ChartData<? extends IDataSet<? extends Entry>>> extends f<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Chart<T> chart) {
        super(context, chart);
        context.getClass();
        chart.getClass();
    }

    @SuppressLint({"WrongConstant"})
    public final void a() {
        mz.c cVar = this.f153413c;
        if (cVar != null) {
            String[] strArr = {"line"};
            Context context = this.f153411a;
            List<Integer> listC = w.c(Integer.valueOf(a7.b.getColor(context, R.color.transparent)));
            List<String> listC2 = w.c(context.getString(R.string.activities_respiration_rate));
            gz.d dVar = this.f153412b;
            dVar.setCustom(listC, listC2);
            boolean[] zArr = {false};
            String[] labels = dVar.getLabels();
            if (labels == null || labels.length == 1) {
                dVar.f80382e = zArr;
            }
            cVar.f121614b = strArr;
        }
    }
}
