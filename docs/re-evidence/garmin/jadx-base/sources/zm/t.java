package zm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.n0;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.github.mikephil.charting.charts.BarLineChartBase;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class t {
    public static final void a(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        barLineChartBase.setDragEnabled(true);
        if (barLineChartBase instanceof OverlayCombinedChart) {
            ((OverlayCombinedChart) barLineChartBase).setBlockOverlay(false);
        }
        barLineChartBase.setScaleEnabled(true);
        barLineChartBase.setScaleYEnabled(false);
        barLineChartBase.highlightValues(null);
        barLineChartBase.setHighlightPerDragEnabled(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void b(final BarLineChartBase<?> barLineChartBase, e23.r<? super Float, ? super Float, ? super Float, ? super Float, Unit> rVar, e23.p<? super Float, ? super Float, Unit> pVar, boolean z14, um.a aVar) {
        barLineChartBase.getClass();
        final r0 r0Var = new r0();
        final Handler handler = new Handler();
        final n0 n0Var = new n0(barLineChartBase, r0Var, rVar, pVar, z14, aVar);
        barLineChartBase.setOnTouchListener(new View.OnTouchListener() { // from class: zm.r
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                r0Var.f105810a = motionEvent;
                int actionMasked = motionEvent.getActionMasked();
                Handler handler2 = handler;
                n0 n0Var2 = n0Var;
                if (actionMasked == 2 || actionMasked == 5) {
                    handler2.postDelayed(n0Var2, 500L);
                }
                if (actionMasked != 1 && actionMasked != 6) {
                    return false;
                }
                handler2.removeCallbacks(n0Var2);
                t.a(barLineChartBase);
                return false;
            }
        });
    }
}
