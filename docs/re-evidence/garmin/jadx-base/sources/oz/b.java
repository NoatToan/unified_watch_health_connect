package oz;

import android.content.Context;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.ChartHighlighter;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import com.github.mikephil.chartingv2.listener.OnChartValueSelectedListener;
import e23.l;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loz/b;", "Loz/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l<? super Highlight, Unit> f134437e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oz/b$a", "Lcom/github/mikephil/chartingv2/listener/OnChartValueSelectedListener;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements OnChartValueSelectedListener {
        public a() {
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartValueSelectedListener
        public final void onNothingSelected() {
            l<? super Highlight, Unit> lVar = b.this.f134437e;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }

        @Override // com.github.mikephil.chartingv2.listener.OnChartValueSelectedListener
        public final void onValueSelected(Entry entry, int i14, Highlight highlight) {
            l<? super Highlight, Unit> lVar = b.this.f134437e;
            if (lVar != null) {
                lVar.invoke(highlight);
            }
        }
    }

    /* JADX INFO: renamed from: oz.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oz/b$b", "Llz/a;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2552b extends lz.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LineChart f134439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f134440b;

        public C2552b(LineChart lineChart, b bVar) {
            this.f134439a = lineChart;
            this.f134440b = bVar;
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            motionEvent.getClass();
            chartGesture.getClass();
            LineChart lineChart = this.f134439a;
            lineChart.setHighlightPerDragEnabled(false);
            lineChart.highlightValue(null);
            lineChart.getParent().requestDisallowInterceptTouchEvent(false);
            l<? super Highlight, Unit> lVar = this.f134440b.f134437e;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartLongPressed(MotionEvent motionEvent) {
            motionEvent.getClass();
            LineChart lineChart = this.f134439a;
            lineChart.setHighlightPerDragEnabled(true);
            lineChart.highlightValue(lineChart.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), true);
            lineChart.getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
    }

    @Override // oz.c
    public void l(LineChart lineChart) {
        super.l(lineChart);
        LineChart lineChart2 = this.f134442b;
        if (lineChart2 != null) {
            lineChart2.setTouchEnabled(true);
            lineChart2.setPinchZoom(false);
            lineChart2.setScaleEnabled(false);
            lineChart2.setDoubleTapToZoomEnabled(false);
            lineChart2.setScaleYEnabled(false);
            lineChart2.setScaleXEnabled(false);
            lineChart2.setHighlightPerDragEnabled(false);
            lineChart2.setHighlightPerTapEnabled(false);
            lineChart2.setHighlighter(m(lineChart2));
            lineChart2.setOnChartValueSelectedListener(new a());
            lineChart2.setOnChartGestureListener(new C2552b(lineChart2, this));
        }
    }

    public abstract ChartHighlighter<? super LineChart> m(LineChart lineChart);
}
