package fb1;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.chartingv2.charts.Chart;
import com.github.mikephil.chartingv2.data.ChartData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000*\u001a\b\u0000\u0010\u0004*\u0014\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0005BG\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfb1/z;", "Lcom/github/mikephil/chartingv2/data/ChartData;", "Lcom/github/mikephil/chartingv2/interfaces/datasets/IDataSet;", "Lcom/github/mikephil/chartingv2/data/Entry;", "T", "Lrl1/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/github/mikephil/chartingv2/charts/Chart;", "chart", "", "", "colors", "", "labels", "formsList", "<init>", "(Landroid/content/Context;Lcom/github/mikephil/chartingv2/charts/Chart;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z<T extends ChartData<? extends IDataSet<? extends Entry>>> extends rl1.f<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f70323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f70324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f70325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, Chart<T> chart, List<Integer> list, List<String> list2, List<String> list3) {
        super(context, chart);
        context.getClass();
        chart.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f70323d = list;
        this.f70324e = list2;
        this.f70325f = list3;
        this.f153412b.setFormToTextSpace(6.0f);
        this.f153412b.setXEntrySpace(8.0f);
        this.f153412b.setFormSize(14.0f);
        this.f153412b.setYOffset(3.0f);
    }

    @SuppressLint({"WrongConstant"})
    public final void a() {
        String[] strArr = (String[]) this.f70325f.toArray(new String[0]);
        gz.d dVar = this.f153412b;
        List<Integer> list = this.f70323d;
        List<String> list2 = this.f70324e;
        dVar.setCustom(list, list2);
        mz.c cVar = this.f153413c;
        if (cVar != null && strArr.length == list2.size() && strArr.length == list.size()) {
            dVar.setCustom(list, list2);
            int size = list2.size();
            boolean[] zArr = new boolean[size];
            for (int i14 = 0; i14 < size; i14++) {
                zArr[i14] = true;
            }
            String[] labels = dVar.getLabels();
            if (labels == null || labels.length == size) {
                dVar.f80382e = zArr;
            }
            cVar.f121614b = strArr;
        }
    }
}
