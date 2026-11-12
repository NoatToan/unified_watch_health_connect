package b00;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb00/h;", "Lb00/b;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lkotlin/Function0;", "", "onChartInteraction", "Lcom/github/mikephil/charting/listener/OnChartGestureListener;", "gestureObserver", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Le23/a;Lcom/github/mikephil/charting/listener/OnChartGestureListener;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BarLineChartBase<?> f14156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnChartGestureListener f14157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f14158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final g f14159e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b00/h$a", "Lb00/f;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f14160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f14161b;

        public a(e23.a<Unit> aVar, h hVar) {
            this.f14160a = aVar;
            this.f14161b = hVar;
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            h hVar = this.f14161b;
            pz.d.h(hVar.f14156b, null);
            BarLineChartBase<?> barLineChartBase = hVar.f14156b;
            barLineChartBase.getClass();
            barLineChartBase.setOnTouchListener((View.OnTouchListener) null);
            OnChartGestureListener onChartGestureListener = hVar.f14157c;
            if (onChartGestureListener != null) {
                onChartGestureListener.onChartGestureEnd(motionEvent, chartGesture);
            }
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartGestureStart(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            e23.a<Unit> aVar = this.f14160a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartLongPressed(MotionEvent motionEvent) {
            h hVar = this.f14161b;
            BarLineChartBase<?> barLineChartBase = hVar.f14156b;
            barLineChartBase.setHapticFeedbackEnabled(false);
            barLineChartBase.setHighlightPerDragEnabled(true);
            if (motionEvent != null) {
                Highlight highlightByTouchPoint = barLineChartBase.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
                if (highlightByTouchPoint != null) {
                    highlightByTouchPoint.setDataIndex(0);
                    barLineChartBase.highlightValue(highlightByTouchPoint);
                } else {
                    barLineChartBase.highlightValues(null);
                }
            }
            hVar.f14156b.setOnTouchListener(hVar.f14159e);
            OnChartGestureListener onChartGestureListener = hVar.f14157c;
            if (onChartGestureListener != null) {
                onChartGestureListener.onChartLongPressed(motionEvent);
            }
        }
    }

    public h(BarLineChartBase<?> barLineChartBase, e23.a<Unit> aVar, OnChartGestureListener onChartGestureListener) {
        barLineChartBase.getClass();
        this.f14156b = barLineChartBase;
        this.f14157c = onChartGestureListener;
        this.f14158d = new a(aVar, this);
        this.f14159e = new g(this, 0);
    }

    @Override // b00.b
    public final OnChartGestureListener a() {
        return this.f14158d;
    }

    @Override // b00.b
    public final /* bridge */ /* synthetic */ View.OnLongClickListener b() {
        return null;
    }

    @Override // b00.b
    public final View.OnTouchListener c() {
        return this.f14159e;
    }

    public /* synthetic */ h(BarLineChartBase barLineChartBase, e23.a aVar, OnChartGestureListener onChartGestureListener, int i14, j jVar) {
        this(barLineChartBase, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : onChartGestureListener);
    }
}
