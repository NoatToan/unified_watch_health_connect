package sl1;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsl1/f;", "Lcom/github/mikephil/charting/renderer/DataRenderer;", "T", "Lqz/h;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/components/YAxis;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f<T extends DataRenderer> implements qz.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f159986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f159987b;

    public f(BarLineChartBase<?> barLineChartBase, YAxis yAxis) {
        barLineChartBase.getClass();
        yAxis.getClass();
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        Transformer transformer = barLineChartBase.getTransformer(yAxis.getAxisDependency());
        viewPortHandler.getClass();
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        this.f159986a = new l(viewPortHandler, xAxis, transformer);
        m mVar = new m(viewPortHandler, yAxis, transformer, false, false, false, 48, null);
        mVar.f86714d = e(yAxis);
        this.f159987b = mVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        return this.f159986a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public i00.b getF101352b() {
        return this.f159987b;
    }

    public abstract ValueFormatter e(YAxis yAxis);
}
