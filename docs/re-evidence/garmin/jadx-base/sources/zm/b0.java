package zm;

import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.highlight.Highlight;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class b0 extends p005kotlin.jvm.internal.q implements e23.p<Float, Float, Unit> {
    public b0(Object obj) {
        super(2, obj, z.class, "highlightValue", "highlightValue(FF)V", 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Unit invoke(Float f14, Float f15) {
        OverlayCombinedChart overlayCombinedChart;
        float fFloatValue = f14.floatValue();
        float fFloatValue2 = f15.floatValue();
        z zVar = (z) this.receiver;
        OverlayCombinedChart overlayCombinedChart2 = zVar.f205273f;
        if (overlayCombinedChart2 == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        Highlight highlightByTouchPoint = overlayCombinedChart2.getHighlightByTouchPoint(fFloatValue, fFloatValue2);
        if (highlightByTouchPoint != null) {
            Highlight highlightF = zVar.f(highlightByTouchPoint.getX(), 0);
            if (zVar.f205279l) {
                OverlayCombinedChart overlayCombinedChart3 = zVar.f205273f;
                if (overlayCombinedChart3 == null) {
                    p005kotlin.jvm.internal.s.m("chart");
                    throw null;
                }
                if (((CombinedData) overlayCombinedChart3.getData()).getDataSetCount() > 1) {
                    Highlight highlightF2 = zVar.f(highlightByTouchPoint.getX(), 1);
                    OverlayCombinedChart overlayCombinedChart4 = zVar.f205273f;
                    if (overlayCombinedChart4 == null) {
                        p005kotlin.jvm.internal.s.m("chart");
                        throw null;
                    }
                    overlayCombinedChart4.highlightValues((Highlight[]) p13.u.C(new Highlight[]{highlightF, highlightF2}).toArray(new Highlight[0]));
                } else {
                    overlayCombinedChart = zVar.f205273f;
                    if (overlayCombinedChart != null) {
                        p005kotlin.jvm.internal.s.m("chart");
                        throw null;
                    }
                    overlayCombinedChart.highlightValue(highlightByTouchPoint);
                }
            } else {
                overlayCombinedChart = zVar.f205273f;
                if (overlayCombinedChart != null) {
                    p005kotlin.jvm.internal.s.m("chart");
                    throw null;
                }
                overlayCombinedChart.highlightValue(highlightByTouchPoint);
            }
        }
        return Unit.INSTANCE;
    }
}
