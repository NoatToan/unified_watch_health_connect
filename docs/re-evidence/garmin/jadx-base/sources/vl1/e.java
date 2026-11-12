package vl1;

import android.content.Context;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import sl1.f;
import sl1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvl1/e;", "Lsl1/f;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "lineDataProvider", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/components/YAxis;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends f<f00.c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b10.c f178708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f00.c f178709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f178710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarLineChartBase<?> barLineChartBase, LineDataProvider lineDataProvider, YAxis yAxis) {
        super(barLineChartBase, yAxis);
        barLineChartBase.getClass();
        lineDataProvider.getClass();
        yAxis.getClass();
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        Transformer transformer = barLineChartBase.getTransformer(yAxis.getAxisDependency());
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f178708c = new b10.c(new l22.a(context));
        ChartAnimator animator = barLineChartBase.getAnimator();
        animator.getClass();
        viewPortHandler.getClass();
        this.f178709d = new f00.c(lineDataProvider, animator, viewPortHandler);
        transformer.getClass();
        m mVar = new m(viewPortHandler, yAxis, transformer, true, false, false, 48, null);
        mVar.f86714d = e(yAxis);
        this.f178710e = mVar;
    }

    @Override // qz.h
    public final DataRenderer c() {
        return this.f178709d;
    }

    @Override // sl1.f, qz.h
    public final i00.b d() {
        return this.f178710e;
    }

    @Override // sl1.f
    public final ValueFormatter e(YAxis yAxis) {
        return new sl1.a(yAxis, new d(this));
    }
}
