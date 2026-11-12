package za1;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lza1/h;", "Lb00/b;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements b00.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BarLineChartBase<?> f203319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f203320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final b00.g f203321d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"za1/h$a", "Lb00/f;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends b00.f {
        public a() {
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            h hVar = h.this;
            pz.d.h(hVar.f203319b, null);
            hVar.f203319b.setOnTouchListener((View.OnTouchListener) null);
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartLongPressed(MotionEvent motionEvent) {
            h hVar = h.this;
            hVar.f203319b.setOnTouchListener(hVar.f203321d);
        }
    }

    public h(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f203319b = barLineChartBase;
        this.f203320c = new a();
        this.f203321d = new b00.g(this, 13);
    }

    @Override // b00.b
    public final OnChartGestureListener a() {
        return this.f203320c;
    }

    @Override // b00.b
    public final View.OnLongClickListener b() {
        return null;
    }

    @Override // b00.b
    public final View.OnTouchListener c() {
        return this.f203321d;
    }
}
