package zm;

import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.github.mikephil.charting.highlight.Highlight;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class a0 extends p005kotlin.jvm.internal.q implements e23.r<Float, Float, Float, Float, Unit> {
    public a0(Object obj) {
        super(4, obj, z.class, "highlightRange", "highlightRange(FFFF)V", 0);
    }

    @Override // e23.r
    public final Unit invoke(Float f14, Float f15, Float f16, Float f17) {
        Highlight highlightF;
        Highlight highlightF2;
        float fFloatValue = f14.floatValue();
        float fFloatValue2 = f15.floatValue();
        float fFloatValue3 = f16.floatValue();
        float fFloatValue4 = f17.floatValue();
        z zVar = (z) this.receiver;
        OverlayCombinedChart overlayCombinedChart = zVar.f205273f;
        if (overlayCombinedChart == null) {
            p005kotlin.jvm.internal.s.m("chart");
            throw null;
        }
        Highlight highlightByTouchPoint = overlayCombinedChart.getHighlightByTouchPoint(fFloatValue, fFloatValue2);
        if (highlightByTouchPoint != null && (highlightF = zVar.f(highlightByTouchPoint.getX(), 0)) != null) {
            OverlayCombinedChart overlayCombinedChart2 = zVar.f205273f;
            if (overlayCombinedChart2 == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw null;
            }
            Highlight highlightByTouchPoint2 = overlayCombinedChart2.getHighlightByTouchPoint(fFloatValue3, fFloatValue4);
            if (highlightByTouchPoint2 != null && (highlightF2 = zVar.f(highlightByTouchPoint2.getX(), 0)) != null) {
                Highlight[] highlightArr = fFloatValue < fFloatValue3 ? new Highlight[]{highlightF, highlightF2} : new Highlight[]{highlightF2, highlightF};
                float x14 = highlightF.getX();
                OverlayCombinedChart overlayCombinedChart3 = zVar.f205273f;
                if (overlayCombinedChart3 == null) {
                    p005kotlin.jvm.internal.s.m("chart");
                    throw null;
                }
                if (x14 >= overlayCombinedChart3.getLowestVisibleX()) {
                    float x15 = highlightF2.getX();
                    OverlayCombinedChart overlayCombinedChart4 = zVar.f205273f;
                    if (overlayCombinedChart4 == null) {
                        p005kotlin.jvm.internal.s.m("chart");
                        throw null;
                    }
                    if (x15 <= overlayCombinedChart4.getHighestVisibleX()) {
                        OverlayCombinedChart overlayCombinedChart5 = zVar.f205273f;
                        if (overlayCombinedChart5 == null) {
                            p005kotlin.jvm.internal.s.m("chart");
                            throw null;
                        }
                        overlayCombinedChart5.setRectMargins(highlightArr);
                        OverlayCombinedChart overlayCombinedChart6 = zVar.f205273f;
                        if (overlayCombinedChart6 == null) {
                            p005kotlin.jvm.internal.s.m("chart");
                            throw null;
                        }
                        overlayCombinedChart6.highlightValues(highlightArr);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
