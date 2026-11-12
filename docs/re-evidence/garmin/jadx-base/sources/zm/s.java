package zm;

import android.view.MotionEvent;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/s;", "Lcom/github/mikephil/charting/listener/OnChartGestureListener;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements OnChartGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f205255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarLineChartBase<?> f205256b;

    public s(BarLineChartBase<?> barLineChartBase) {
        this.f205256b = barLineChartBase;
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public final void onChartDoubleTapped(MotionEvent motionEvent) {
        motionEvent.getClass();
        boolean z14 = this.f205255a;
        BarLineChartBase<?> barLineChartBase = this.f205256b;
        if (z14) {
            this.f205255a = false;
            barLineChartBase.fitScreen();
        } else {
            barLineChartBase.zoom(2.0f, 1.0f, motionEvent.getX(), motionEvent.getY());
            this.f205255a = true;
        }
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public final void onChartFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        motionEvent.getClass();
        chartGesture.getClass();
        t.a(this.f205256b);
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public final void onChartGestureStart(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public final void onChartLongPressed(MotionEvent motionEvent) {
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public final void onChartScale(MotionEvent motionEvent, float f14, float f15) {
        motionEvent.getClass();
        this.f205255a = true;
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public final void onChartSingleTapped(MotionEvent motionEvent) {
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public final void onChartTranslate(MotionEvent motionEvent, float f14, float f15) {
    }
}
