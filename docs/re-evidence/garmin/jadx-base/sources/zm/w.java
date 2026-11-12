package zm;

import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import ps.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lzm/w;", "Lzm/c;", "Landroidx/fragment/app/m;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "activityChartData", "overlayChartData", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;", "comparisonTargetData", "", "fullScreen", "Lfz/c;", "xAxisType", "<init>", "(Landroidx/fragment/app/m;Lzm/p;Lzm/p;Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;ZLfz/c;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f205260z = 0;

    static {
        new a(null);
    }

    public /* synthetic */ w(androidx.fragment.app.m mVar, p pVar, p pVar2, com.garmin.android.apps.connectmobile.activities.newmodel.l lVar, boolean z14, fz.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(mVar, pVar, pVar2, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? true : z14, cVar);
    }

    @Override // zm.c
    public final void F(float f14, float f15) {
        Highlight highlightByTouchPoint = n().getHighlightByTouchPoint(f14, f15);
        if (highlightByTouchPoint == null) {
            return;
        }
        n().highlightValues((Highlight[]) p13.y.s(p13.u.C(new List[]{t(highlightByTouchPoint.getX(), "RUN_ACTIVE"), this.f205214m ? t(highlightByTouchPoint.getX(), "TARGET_TYPE_TAG") : null, this.f205213l ? t(highlightByTouchPoint.getX(), "OVERLAY_TYPE_TAG") : null})).toArray(new Highlight[0]));
    }

    @Override // zm.c
    public final List<Object> o() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zm.c
    public final IBarLineScatterCandleBubbleDataSet<Entry> q() {
        T dataSetByLabel = ((CombinedData) n().getData()).getDataSetByLabel("RUN_ACTIVE", true);
        dataSetByLabel.getClass();
        return (IBarLineScatterCandleBubbleDataSet) dataSetByLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zm.c
    public final List<Entry> s(float f14) {
        return ((ILineDataSet) ((CombinedData) n().getData()).getLineData().getDataSetByLabel("RUN_ACTIVE", true)).getEntriesForXValue(f14);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x016b  */
    @Override // zm.c
    public final o13.p<LineData, ScatterData> w() {
        double d14;
        double dDoubleValue;
        final float fC;
        double dDoubleValue2;
        List<o20.a> listP;
        double dDoubleValue3;
        List<o20.a> listP2;
        LineData lineData = new LineData();
        ScatterData scatterData = new ScatterData();
        p pVar = this.f205203b;
        List<o20.a> listP3 = pVar.P(0);
        ArrayList arrayList = new ArrayList(p13.y.r(listP3, 10));
        for (o20.a aVar : listP3) {
            List<x0> listO2 = pVar.O2();
            arrayList.add(new o20.a(aVar.C(), Math.min(aVar.D(), listO2 != null ? e0.c(listO2) : 0.0d)));
        }
        ArrayList arrayListC = ar.e.c(arrayList);
        arrayListC.getClass();
        xz.d dVar = new xz.d(arrayListC, "RUN_ACTIVE");
        int b14 = pVar.getB1();
        p pVar2 = this.f205204c;
        boolean zA = km.d.a(b14, pVar2 != null ? pVar2.getB1() : -1);
        if (pVar.D3() >= 1) {
            List<o20.a> listP4 = pVar.P(0);
            ArrayList arrayList2 = new ArrayList(p13.y.r(listP4, 10));
            Iterator<T> it = listP4.iterator();
            while (it.hasNext()) {
                arrayList2.add(Double.valueOf(((o20.a) it.next()).D()));
            }
            Double dU0 = h0.u0(arrayList2);
            double dDoubleValue4 = dU0 != null ? dU0.doubleValue() : 0.0d;
            if (zA) {
                if (pVar2 == null || (listP2 = pVar2.P(0)) == null) {
                    dDoubleValue3 = Double.MAX_VALUE;
                } else {
                    ArrayList arrayList3 = new ArrayList(p13.y.r(listP2, 10));
                    Iterator<T> it3 = listP2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Double.valueOf(((o20.a) it3.next()).D()));
                    }
                    Double dU1 = h0.u0(arrayList3);
                    if (dU1 != null) {
                        dDoubleValue3 = dU1.doubleValue();
                    } else {
                        dDoubleValue3 = Double.MAX_VALUE;
                    }
                }
                dDoubleValue4 = Math.min(dDoubleValue3, dDoubleValue4);
            }
            d14 = dDoubleValue4;
        } else {
            d14 = 0.0d;
        }
        if (pVar.D3() >= 1) {
            List<o20.a> listP5 = pVar.P(0);
            ArrayList arrayList4 = new ArrayList(p13.y.r(listP5, 10));
            Iterator<T> it4 = listP5.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Double.valueOf(((o20.a) it4.next()).D()));
            }
            Double dP0 = h0.p0(arrayList4);
            dDoubleValue = dP0 != null ? dP0.doubleValue() : 0.0d;
            if (zA) {
                if (pVar2 == null || (listP = pVar2.P(0)) == null) {
                    dDoubleValue2 = Double.MIN_VALUE;
                } else {
                    ArrayList arrayList5 = new ArrayList(p13.y.r(listP, 10));
                    Iterator<T> it5 = listP.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(Double.valueOf(((o20.a) it5.next()).D()));
                    }
                    Double dP1 = h0.p0(arrayList5);
                    if (dP1 != null) {
                        dDoubleValue2 = dP1.doubleValue();
                    } else {
                        dDoubleValue2 = Double.MIN_VALUE;
                    }
                }
                dDoubleValue = Math.max(dDoubleValue2, dDoubleValue);
            }
        } else {
            dDoubleValue = 1.0d;
        }
        if (zA) {
            fC = ((float) dDoubleValue) + 10;
        } else {
            List<x0> listO3 = pVar.O2();
            fC = listO3 != null ? (float) e0.c(listO3) : 0.0f;
        }
        dVar.setDrawValues(false);
        dVar.setDrawCircles(false);
        dVar.setAxisDependency(YAxis.AxisDependency.LEFT);
        dVar.setHighlightLineWidth(1.0f);
        dVar.setHighLightColor(this.f205212k);
        dVar.setHighlightEnabled(true);
        dVar.setDrawHorizontalHighlightIndicator(false);
        dVar.setFillFormatter(new IFillFormatter() { // from class: zm.v
            @Override // com.github.mikephil.charting.formatter.IFillFormatter
            public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
                int i14 = w.f205260z;
                return fC;
            }
        });
        dVar.setMode(LineDataSet.Mode.STEPPED);
        K(dVar, false);
        O(k.a(d14, dDoubleValue, this.f205203b, 6, n().getContext().getResources().getConfiguration().orientation == 2, false, 32), pVar);
        lineData.addDataSet(dVar);
        if (this.f205214m) {
            lineData.addDataSet(C(lineData.getYMin(), lineData.getYMax()));
        }
        if (this.f205213l) {
            if (pVar2 == null) {
                return new o13.p<>(lineData, scatterData);
            }
            if (im.a.g(Integer.valueOf(pVar2.getB1()))) {
                lineData.addDataSet(y());
            } else {
                scatterData = new ScatterData(z());
            }
        }
        return new o13.p<>(lineData, scatterData);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lzm/w$a;", "", "<init>", "()V", "", "RUN_ACTIVE_DATA_SET", "Ljava/lang/String;", "OVERLAY_TYPE_TAG", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.fragment.app.m mVar, p pVar, p pVar2, com.garmin.android.apps.connectmobile.activities.newmodel.l lVar, boolean z14, fz.c cVar) {
        super(mVar, pVar, pVar2, lVar, z14, cVar);
        mVar.getClass();
        pVar.getClass();
        cVar.getClass();
    }
}
