package b00;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.s;
import com.garmin.android.apps.connectmobile.connectiq.w;
import com.garmin.android.apps.connectmobile.connectiq.y;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import e23.l;
import zy.i;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14143c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f14141a = i14;
        this.f14142b = obj;
        this.f14143c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        s sVar;
        zy.g gVar;
        int i14 = this.f14141a;
        Object obj = this.f14143c;
        Object obj2 = this.f14142b;
        switch (i14) {
            case 0:
                e eVar = (e) obj2;
                l lVar = (l) obj;
                int i15 = e.f14144h;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1) {
                    eVar.f14148e.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                } else if (actionMasked == 2) {
                    BarLineChartBase<?> barLineChartBase = eVar.f14145b;
                    barLineChartBase.getParent().requestDisallowInterceptTouchEvent(true);
                    barLineChartBase.setDragEnabled(false);
                    barLineChartBase.setScaleXEnabled(false);
                    lVar.invoke(motionEvent);
                    b.f14135a.getClass();
                    b.a.f14137b.m(a.b.f14134a);
                } else if (actionMasked == 3) {
                    eVar.f14148e.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                } else if (actionMasked == 5) {
                    BarLineChartBase<?> barLineChartBase2 = eVar.f14145b;
                    barLineChartBase2.getParent().requestDisallowInterceptTouchEvent(true);
                    barLineChartBase2.setDragEnabled(false);
                    barLineChartBase2.setScaleXEnabled(false);
                    lVar.invoke(motionEvent);
                    b.f14135a.getClass();
                    b.a.f14137b.m(a.b.f14134a);
                } else if (actionMasked == 6) {
                    eVar.f14148e.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                }
                return false;
            case 1:
                w.a aVar = (w.a) obj2;
                y.a aVar2 = (y.a) obj;
                w.a.C0521a c0521a = w.a.f32049m;
                if (motionEvent.getActionMasked() == 0) {
                    aVar.f32054e.invoke(aVar2);
                    aVar.f32050a.H6(aVar);
                }
                return true;
            case 2:
                com.garmin.realtimesettings.app.baseviews.reorderable.b bVar = (com.garmin.realtimesettings.app.baseviews.reorderable.b) obj2;
                wv2.d dVar = (wv2.d) obj;
                int i16 = com.garmin.realtimesettings.app.baseviews.reorderable.b.f52547j;
                view2.getClass();
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 0 && (sVar = bVar.f52551d) != null) {
                    sVar.o(dVar);
                }
                return true;
            case 3:
                z40.c cVar = (z40.c) obj2;
                z40.c.b bVar2 = (z40.c.b) obj;
                int i17 = z40.c.b.f202329c;
                if (motionEvent.getActionMasked() == 0) {
                    cVar.f202327b.D(bVar2);
                }
                return false;
            default:
                i iVar = (i) obj2;
                i.a aVar3 = (i.a) obj;
                int i18 = i.a.f207391h;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() != 0 || (gVar = iVar.f207390b) == null) {
                    return false;
                }
                gVar.D(aVar3);
                return true;
        }
    }
}
