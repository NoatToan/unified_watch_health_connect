package jw0;

import b63.o;
import c22.j0;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g22.l;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljw0/e;", "Lk00/e;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "lineDataProvider", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "yAxisValueFormatter", "Lj23/g;", "Lb63/o;", "dateInterval", "", "isDaily", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/formatter/ValueFormatter;Lj23/g;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends k00.e<f00.c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f00.d f101346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h00.c f101347j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis, ValueFormatter valueFormatter, j23.g<o> gVar, boolean z14) {
        super(barLineChartBase, yAxis, valueFormatter, l.h((o) gVar.getStart()), l.h((o) gVar.b()), z14);
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        valueFormatter.getClass();
        gVar.getClass();
        ChartAnimator animator = barLineChartBase.getAnimator();
        animator.getClass();
        this.f101346i = new f00.d(lineDataProvider, animator, this.f101970d);
        ViewPortHandler viewPortHandler = this.f101970d;
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.getClass();
        h00.c cVar = new h00.c(viewPortHandler, xAxis, this.f101972f);
        int iB = lw0.b.b(gVar, z14);
        ArrayList arrayList = new ArrayList(iB);
        for (int i14 = 0; i14 < iB; i14++) {
            arrayList.add("");
        }
        j0 j0Var = j0.f23099a;
        LocalDate localDateH = l.h((o) gVar.getStart());
        j0Var.getClass();
        arrayList.set(0, j0.l(localDateH));
        arrayList.set(arrayList.size() - 1, j0.l(l.h((o) gVar.b())));
        cVar.f80601e = new IndexAxisValueFormatter(arrayList);
        cVar.f80602f = iB;
        this.f101347j = cVar;
    }

    @Override // k00.e, qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        return this.f101347j;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f101346i;
    }
}
