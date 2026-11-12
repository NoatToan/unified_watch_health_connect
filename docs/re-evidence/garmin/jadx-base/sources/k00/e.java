package k00;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B;\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk00/e;", "Lcom/github/mikephil/charting/renderer/DataRenderer;", "T", "Lqz/h;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "yAxisValueFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/formatter/ValueFormatter;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e<T extends DataRenderer> implements qz.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f101967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f101968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f101969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewPortHandler f101970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final XAxis f101971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Transformer f101972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f101973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h00.b f101974h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k00/e$a", "Li00/b;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ValueFormatter f101975i;

        public a(ValueFormatter valueFormatter, YAxis yAxis, ViewPortHandler viewPortHandler, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            this.f101975i = valueFormatter;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public final ValueFormatter getF101975i() {
            return this.f101975i;
        }
    }

    public e(BarLineChartBase<?> barLineChartBase, YAxis yAxis, ValueFormatter valueFormatter, LocalDate localDate, LocalDate localDate2, boolean z14) {
        h00.b bVar;
        barLineChartBase.getClass();
        yAxis.getClass();
        valueFormatter.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f101967a = barLineChartBase;
        this.f101968b = localDate;
        this.f101969c = localDate2;
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f101970d = viewPortHandler;
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.getClass();
        this.f101971e = xAxis;
        Transformer transformer = barLineChartBase.getTransformer(yAxis.getAxisDependency());
        transformer.getClass();
        this.f101972f = transformer;
        a aVar = new a(valueFormatter, yAxis, viewPortHandler, transformer);
        aVar.f86717g = 8.0f;
        this.f101973g = aVar;
        if (z14) {
            h00.c cVar = new h00.c(viewPortHandler, xAxis, transformer);
            cVar.f80601e = new IndexAxisValueFormatter(pz.d.e(localDate, localDate2, 0));
            cVar.f80602f = u0.e(localDate, localDate2, 1);
            bVar = cVar;
        } else {
            h00.i iVar = new h00.i(viewPortHandler, xAxis, transformer);
            List<String> listE = pz.d.e(localDate, localDate2, 5);
            iVar.f80602f = listE.size();
            iVar.f80601e = new d(this, iVar, listE);
            iVar.f80603g = true;
            iVar.f80604h = 270.0f;
            bVar = iVar;
        }
        this.f101974h = bVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public h00.b getF101974h() {
        return this.f101974h;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public i00.b getF101352b() {
        return this.f101973g;
    }
}
