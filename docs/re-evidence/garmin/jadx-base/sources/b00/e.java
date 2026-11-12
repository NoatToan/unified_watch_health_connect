package b00;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB;\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lb00/e;", "Lb00/b;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "toggleHighlight", "Lkotlin/Function0;", "onChartInteraction", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Le23/l;Le23/a;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements b00.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f14144h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BarLineChartBase<?> f14145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f14148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f14149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final d f14150g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b00/e$b", "Lb00/f;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f14152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<MotionEvent, Unit> f14153c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.a<Unit> aVar, l<? super MotionEvent, Unit> lVar) {
            this.f14152b = aVar;
            this.f14153c = lVar;
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartDoubleTapped(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            e eVar = e.this;
            if (eVar.f14145b.isFullyZoomedOut()) {
                eVar.f14145b.zoom(2.0f, 1.0f, motionEvent.getX(), motionEvent.getY());
                b00.b.f14135a.getClass();
                b00.b.a.f14137b.m(b00.a.b.f14134a);
            } else {
                eVar.f14145b.zoom(0.0f, 1.0f, motionEvent.getX(), motionEvent.getY());
                b00.b.f14135a.getClass();
                b00.b.a.f14137b.m(b00.a.C0197a.f14133a);
            }
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            e eVar = e.this;
            eVar.f14146c = false;
            BarLineChartBase<?> barLineChartBase = eVar.f14145b;
            barLineChartBase.setDragEnabled(true);
            barLineChartBase.setScaleXEnabled(true);
            this.f14153c.invoke(null);
            barLineChartBase.setOnTouchListener((View.OnTouchListener) null);
            if (eVar.f14145b.isFullyZoomedOut()) {
                b00.b.f14135a.getClass();
                b00.b.a.f14137b.m(b00.a.C0197a.f14133a);
            }
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartGestureStart(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            e23.a<Unit> aVar;
            if (e.this.f14145b.isEmpty() || (aVar = this.f14152b) == null) {
                return;
            }
            aVar.invoke();
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartLongPressed(MotionEvent motionEvent) {
            e23.a<Unit> aVar;
            e eVar = e.this;
            BarLineChartBase<?> barLineChartBase = eVar.f14145b;
            BarLineChartBase<?> barLineChartBase2 = eVar.f14145b;
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
            if (!eVar.f14146c) {
                barLineChartBase2.setOnTouchListener(eVar.f14150g);
            }
            if (barLineChartBase2.isEmpty() || (aVar = this.f14152b) == null) {
                return;
            }
            aVar.invoke();
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartScale(MotionEvent motionEvent, float f14, float f15) {
            e eVar = e.this;
            eVar.f14146c = ((double) Math.abs(eVar.f14147d - f14)) > 0.005d;
            eVar.f14147d = f14;
            b00.b.f14135a.getClass();
            b00.b.a.f14137b.m(b00.a.b.f14134a);
        }
    }

    static {
        new a(null);
    }

    public e(BarLineChartBase<?> barLineChartBase, l<? super MotionEvent, Unit> lVar, e23.a<Unit> aVar) {
        barLineChartBase.getClass();
        lVar.getClass();
        this.f14145b = barLineChartBase;
        this.f14148e = new b(aVar, lVar);
        this.f14149f = new c(0, this, aVar);
        this.f14150g = new d(0, this, lVar);
    }

    @Override // b00.b
    public final OnChartGestureListener a() {
        return this.f14148e;
    }

    @Override // b00.b
    public final View.OnLongClickListener b() {
        return this.f14149f;
    }

    @Override // b00.b
    public final View.OnTouchListener c() {
        return this.f14150g;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb00/e$a;", "", "<init>", "()V", "", "MINIM_SCALE_DELTA", "D", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(BarLineChartBase barLineChartBase, l lVar, e23.a aVar, int i14, j jVar) {
        this(barLineChartBase, lVar, (i14 & 4) != 0 ? null : aVar);
    }
}
