package qm;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import o53.s0;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public final class i {

    public static class a extends g22.c<Void, List<List<Float>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LineData f145385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f145386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f145387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f145388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f145389g;

        public a(LineData lineData, int i14, int i15, float f14, b bVar) {
            super(s0.f129406a);
            this.f145385c = lineData;
            this.f145386d = i14;
            this.f145387e = i15;
            this.f145388f = f14;
            this.f145389g = bVar;
        }

        @Override // g22.c
        public final List<List<Float>> b(Void[] voidArr) {
            ArrayList arrayList;
            Float fValueOf = Float.valueOf(0.0f);
            ArrayList arrayList2 = new ArrayList();
            int i14 = 0;
            while (true) {
                LineData lineData = this.f145385c;
                if (i14 >= lineData.getDataSetCount()) {
                    return arrayList2;
                }
                int i15 = t.f145451a;
                if (lineData.getDataSetCount() <= 0 || i14 >= lineData.getDataSetCount()) {
                    arrayList = new ArrayList(0);
                } else {
                    int i16 = this.f145387e;
                    int i17 = this.f145386d;
                    arrayList = new ArrayList(i16 - i17);
                    T dataSetByIndex = lineData.getDataSetByIndex(i14);
                    dataSetByIndex.getClass();
                    IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) dataSetByIndex;
                    while (i17 < i16) {
                        T entryForXIndex = iBarLineScatterCandleBubbleDataSet.getEntryForXIndex(i17);
                        if (entryForXIndex != 0) {
                            arrayList.add(entryForXIndex);
                        }
                        i17++;
                    }
                }
                if (!arrayList.isEmpty()) {
                    float val = ((Entry) arrayList.get(0)).getVal();
                    float f14 = this.f145388f;
                    float f15 = f14 - val;
                    float val2 = f14 - ((Entry) arrayList.get(arrayList.size() - 1)).getVal();
                    ArrayList arrayList3 = new ArrayList();
                    if (i14 != 1 || Math.floor(f15) > 0.0d || Math.floor(val2) > 0.0d) {
                        if (val2 <= 0.0f) {
                            val2 = 0.0f;
                        }
                        arrayList3.add(Float.valueOf(val2));
                        if (f15 <= 0.0f) {
                            f15 = 0.0f;
                        }
                        arrayList3.add(Float.valueOf(f15));
                    } else {
                        arrayList3.add(fValueOf);
                        arrayList3.add(fValueOf);
                    }
                    arrayList2.add(arrayList3);
                }
                i14++;
            }
        }

        @Override // g22.c
        public final void d(List<List<Float>> list) {
            String strG;
            List<List<Float>> list2 = list;
            b bVar = this.f145389g;
            if (bVar != null) {
                m.a aVar = (m.a) ((ps2.d) bVar).f140472b;
                f12.l.f68084a.getClass();
                f12.l lVarA = f12.l.a.a();
                m mVar = m.this;
                Context context = mVar.f145425b;
                m.d dVar = mVar.f145399m;
                String string = context.getString(lVarA.y() ? R.string.lbl_meter : R.string.lbl_foot);
                double d14 = lVarA.y() ? 1.0d : 3.2808399d;
                i2.d("DivingCombChartConfig", "result size is " + list2.size());
                mVar.f145400n.setMarkerSecondChartValueColor(R.color.palette_ruby_3);
                if (list2.size() >= 1) {
                    String strG2 = e5.g(e5.g(dVar.b(Math.round(((double) list2.get(0).get(1).floatValue()) * d14)), StringUtils.SPACE, string), "\n", e5.g(dVar.b(Math.round(((double) list2.get(0).get(0).floatValue()) * d14)), StringUtils.SPACE, string));
                    i2.d("DivingCombChartConfig", "setting first label to ".concat(strG2));
                    mVar.f145400n.setValueLabel(strG2);
                }
                if (list2.size() < 2) {
                    mVar.f145400n.d(false);
                    return;
                }
                int iFloor = (int) Math.floor(((double) list2.get(1).get(0).floatValue()) * d14);
                int iRound = (int) Math.round(((double) list2.get(1).get(0).floatValue()) * d14);
                int iFloor2 = (int) Math.floor(((double) list2.get(1).get(1).floatValue()) * d14);
                int iRound2 = (int) Math.round(((double) list2.get(1).get(1).floatValue()) * d14);
                String strB = dVar.b(iRound);
                String strB2 = dVar.b(iRound2);
                mVar.f145400n.d(iFloor >= 1 || iFloor2 >= 1);
                if (iFloor < 1) {
                    strG = e5.g(strB2, StringUtils.SPACE, string);
                } else {
                    strG = iFloor2 < 1 ? e5.g(strB, StringUtils.SPACE, string) : e5.g(e5.g(strB2, StringUtils.SPACE, string), "\n", e5.g(strB, StringUtils.SPACE, string));
                }
                mVar.f145400n.setSecondValueLabel(strG);
            }
        }
    }

    public interface b {
    }
}
