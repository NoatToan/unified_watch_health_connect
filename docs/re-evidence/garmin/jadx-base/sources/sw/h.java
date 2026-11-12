package sw;

import android.view.MotionEvent;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsw/h;", "Llz/a;", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends lz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oz.a f161063a;

    public h(oz.a aVar) {
        this.f161063a = aVar;
    }

    @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
    public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        motionEvent.getClass();
        chartGesture.getClass();
        oz.a aVar = this.f161063a;
        aVar.setHighlightPerDragEnabled(false);
        aVar.setHighlightPerTapEnabled(false);
        aVar.highlightValue(null);
        aVar.getParent().requestDisallowInterceptTouchEvent(false);
    }

    @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
    public final void onChartLongPressed(MotionEvent motionEvent) {
        motionEvent.getClass();
        oz.a aVar = this.f161063a;
        aVar.setHighlightPerDragEnabled(true);
        aVar.setHighlightPerTapEnabled(true);
        aVar.highlightValue(aVar.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()));
        aVar.getParent().requestDisallowInterceptTouchEvent(true);
    }
}
