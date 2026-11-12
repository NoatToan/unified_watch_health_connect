package vp;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvp/i;", "Lcom/github/mikephil/charting/renderer/DataRenderer;", "T", "Lqz/h;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "", "intervalType", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lorg/joda/time/LocalDate;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i<T extends DataRenderer> implements qz.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f179303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f179304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f179305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewPortHandler f179306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Transformer f179307e;

    public i(BarLineChartBase<?> barLineChartBase, LocalDate localDate, int i14) {
        barLineChartBase.getClass();
        localDate.getClass();
        this.f179303a = barLineChartBase;
        this.f179304b = localDate;
        this.f179305c = i14;
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f179306d = viewPortHandler;
        Transformer transformer = barLineChartBase.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        this.f179307e = transformer;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        XAxis xAxis = this.f179303a.getXAxis();
        xAxis.getClass();
        h hVar = new h(this.f179306d, xAxis, this.f179307e);
        int i14 = this.f179305c;
        if (i14 == 3) {
            f(hVar);
            return hVar;
        }
        if (i14 == 4) {
            h(hVar);
            return hVar;
        }
        if (i14 == 5) {
            e(hVar);
            return hVar;
        }
        if (i14 != 6) {
            return hVar;
        }
        g(hVar);
        return hVar;
    }

    public abstract void e(h hVar);

    public abstract void f(h hVar);

    public abstract void g(h hVar);

    public abstract void h(h hVar);
}
