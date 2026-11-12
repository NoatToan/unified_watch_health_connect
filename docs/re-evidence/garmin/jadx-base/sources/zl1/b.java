package zl1;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import f00.c;
import p005kotlin.Metadata;
import sl1.f;
import sl1.m;
import yz.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzl1/b;", "Lsl1/f;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "lineDataProvider", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends f<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f205189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f205190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis) {
        super(barLineChartBase, yAxis);
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        ChartAnimator animator = barLineChartBase.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f205189c = new c(lineDataProvider, animator, viewPortHandler);
        ViewPortHandler viewPortHandler2 = barLineChartBase.getViewPortHandler();
        viewPortHandler2.getClass();
        Transformer transformer = barLineChartBase.getTransformer(yAxis.getAxisDependency());
        transformer.getClass();
        m mVar = new m(viewPortHandler2, yAxis, transformer, true, false, false, 48, null);
        mVar.f86714d = new h();
        this.f205190d = mVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f205189c;
    }

    @Override // sl1.f, qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f205190d;
    }

    @Override // sl1.f
    public final ValueFormatter e(YAxis yAxis) {
        return new h();
    }
}
