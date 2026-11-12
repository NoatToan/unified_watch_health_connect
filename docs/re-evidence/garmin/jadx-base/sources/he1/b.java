package he1;

import android.content.Context;
import android.text.format.DateFormat;
import c00.c;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import i00.e;
import p005kotlin.Metadata;
import qz.h;
import yz.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhe1/b;", "Lqz/h;", "Ld00/a;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "barDataProvider", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;)V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.h f83526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f83527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.a f83528c;

    public b(BarLineChartBase<?> barLineChartBase, BarDataProvider barDataProvider) {
        barLineChartBase.getClass();
        barDataProvider.getClass();
        Context context = barLineChartBase.getContext();
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        Transformer transformer = barLineChartBase.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.h hVar = new h00.h(viewPortHandler, xAxis, transformer);
        hVar.f80601e = new k(DateFormat.is24HourFormat(context));
        hVar.f80603g = true;
        this.f83526a = hVar;
        YAxis axisLeft = barLineChartBase.getAxisLeft();
        axisLeft.getClass();
        this.f83527b = new e(viewPortHandler, axisLeft, transformer);
        d00.a aVar = new d00.a(barDataProvider, barLineChartBase.getAnimator(), barLineChartBase.getViewPortHandler());
        ViewPortHandler viewPortHandler2 = barLineChartBase.getViewPortHandler();
        viewPortHandler2.getClass();
        aVar.f56992d = new c(viewPortHandler2);
        aVar.f56990b = 60.0f;
        this.f83528c = aVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF69204a() {
        return this.f83526a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f83528c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f83527b;
    }
}
