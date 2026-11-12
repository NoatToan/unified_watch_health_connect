package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qtm {
    private static final int d = Color.argb(51, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f46817a = Color.argb(76, 255, 255, 255);

    public static void b(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthLineDataSet hwHealthLineDataSet) {
        List dataSets;
        qmc qmcVar = (qmc) hwHealthBaseCombinedChart.getData();
        if (qmcVar == null) {
            qmcVar = new qmc();
            qmcVar.a(new HwHealthBaseCombinedChart.DrawOrder[]{HwHealthBaseCombinedChart.DrawOrder.LINE, HwHealthBaseCombinedChart.DrawOrder.BAR, HwHealthBaseCombinedChart.DrawOrder.POINT});
        }
        if (qmcVar.j() == null) {
            dataSets = new ArrayList(10);
            qmcVar.d(new qnt(dataSets));
        } else {
            dataSets = qmcVar.j().getDataSets();
        }
        dataSets.add(hwHealthLineDataSet);
        hwHealthBaseCombinedChart.setData(qmcVar);
    }

    public static void a(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthLineDataSet hwHealthLineDataSet) {
        List dataSets;
        qmc qmcVar = (qmc) hwHealthBaseCombinedChart.getData();
        if (qmcVar == null) {
            qmcVar = new qmc();
            qmcVar.a(new HwHealthBaseCombinedChart.DrawOrder[]{HwHealthBaseCombinedChart.DrawOrder.POINT, HwHealthBaseCombinedChart.DrawOrder.LINE, HwHealthBaseCombinedChart.DrawOrder.BAR});
        }
        if (qmcVar.i() == null) {
            dataSets = new ArrayList(10);
            qmcVar.a(new qnu(dataSets));
        } else {
            dataSets = qmcVar.i().getDataSets();
        }
        dataSets.add(hwHealthLineDataSet);
        hwHealthBaseCombinedChart.setData(qmcVar);
    }

    public static void d(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        List dataSets;
        qmc qmcVar = (qmc) hwHealthBaseCombinedChart.getData();
        if (qmcVar == null) {
            qmcVar = new qmc();
            qmcVar.a(new HwHealthBaseCombinedChart.DrawOrder[]{HwHealthBaseCombinedChart.DrawOrder.LINE, HwHealthBaseCombinedChart.DrawOrder.BAR, HwHealthBaseCombinedChart.DrawOrder.POINT});
        }
        if (qmcVar.h() == null) {
            dataSets = new ArrayList(10);
            qmcVar.d(new qly(dataSets));
        } else {
            dataSets = qmcVar.h().getDataSets();
        }
        dataSets.add((HwHealthBarDataSet) hwHealthBaseBarLineDataSet);
        hwHealthBaseCombinedChart.setData(qmcVar);
    }

    public static void d(HwHealthLineDataSet hwHealthLineDataSet) {
        hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: qtm.4
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i, int i2, int i3) {
                return i2 - i <= i3;
            }
        });
    }

    public static void e(boolean z, List<nju> list, Context context, List<HwHealthBarEntry> list2, String str) {
        float f = z ? 68.0f : 70.0f;
        for (nju njuVar : list) {
            if (njuVar == null || !qqg.a(njuVar.b())) {
                LogUtil.e(str, "spo2 data is error or invalid. pls check");
            } else {
                list2.add(new HwHealthBarEntry(njuVar.acquireTime(), new qmf(njuVar.b(), f, qqg.a(context, njuVar.b(), z), qqg.e(context, njuVar.b()))));
            }
        }
    }

    public static void c(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, TrackLineChartHolder.c cVar, float f) {
        if (cVar.f24024c) {
            hwHealthBaseCombinedChart.enableSpacePreserveForDataOverlay(true);
            hwHealthBaseCombinedChart.setAvoidFirstLastClipping(false);
            hwHealthBaseCombinedChart.enableMarkerView(true);
            hwHealthBaseCombinedChart.setExtraTopOffset(f);
            return;
        }
        hwHealthBaseCombinedChart.setAvoidFirstLastClipping(true);
        hwHealthBaseCombinedChart.enableOnlyShowMinutes(true);
        hwHealthBaseCombinedChart.enableOneMinuteOmit(true);
    }

    public static void d(HwHealthLineDataSet hwHealthLineDataSet, final ArrayList<HeartRateData> arrayList) {
        hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: qtm.3
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i, int i2, int i3) {
                if (i2 - i > i3) {
                    return qtm.e(i, i2, (ArrayList<HeartRateData>) arrayList);
                }
                return true;
            }
        });
    }

    public static boolean e(int i, int i2, ArrayList<HeartRateData> arrayList) {
        if (njy.e(arrayList)) {
            return true;
        }
        for (HeartRateData heartRateData : arrayList) {
            if (heartRateData != null && heartRateData.acquireTime() > i && heartRateData.acquireTime() < i2) {
                return false;
            }
        }
        return true;
    }

    public static void b(TrackLineChartHolder.c cVar, HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2, float f3) {
        if (cVar.f24024c) {
            if (hwHealthBaseBarLineDataSet instanceof HwHealthLineDataSet) {
                ((HwHealthLineDataSet) hwHealthBaseBarLineDataSet).setLineWidth(f);
            }
            hwHealthBaseCombinedChart.enableSpacePreserveForDataOverlay(true);
            hwHealthBaseCombinedChart.setAvoidFirstLastClipping(false);
            hwHealthBaseCombinedChart.enableMarkerView(true);
            hwHealthBaseCombinedChart.setExtraTopOffset(f3);
            return;
        }
        hwHealthBaseCombinedChart.setAvoidFirstLastClipping(true);
        hwHealthBaseCombinedChart.enableOnlyShowMinutes(true);
        hwHealthBaseCombinedChart.enableOneMinuteOmit(true);
        if (hwHealthBaseBarLineDataSet instanceof HwHealthLineDataSet) {
            ((HwHealthLineDataSet) hwHealthBaseBarLineDataSet).setLineWidth(f2);
        }
    }

    public static void d(float f, String str, HwHealthLineDataSet hwHealthLineDataSet, int i, int i2, int i3, int i4, TrackLineChartHolder.c cVar, float f2, float f3) {
        if (f > 0.0f) {
            LogUtil.d(str, "addRunningPostureDataLayer acquireRunningPostureDataSumTime:", LogAnonymous.a((long) f));
            hwHealthLineDataSet.setXMaxForcedValue(f);
        }
        if (!cVar.f24023b) {
            hwHealthLineDataSet.setColor(Color.argb(i, i2, i3, i4));
            hwHealthLineDataSet.a(Color.argb((int) (i * f2), i2, i3, i4), Color.argb(0, i2, i3, i4), true);
        }
        if (cVar.f24022a) {
            float f4 = i;
            hwHealthLineDataSet.a(Color.argb((int) (f2 * f4), i2, i3, i4), Color.argb((int) (f4 * f3), i2, i3, i4), false);
        }
    }

    public static String e(Resources resources, int i, String str, Context context) {
        if (i == 266 || i == 262) {
            if (UnitUtil.f()) {
                return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
            }
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
        }
        if (i == 274) {
            if (UnitUtil.f()) {
                return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
            }
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500);
        }
        if (i == 198 || i == 199 || i == 200) {
            return qre.e(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500);
        }
        if (UnitUtil.f()) {
            return "/" + resources.getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        }
        return "/" + resources.getString(R.string.IDS_motiontrack_show_sport_unit_km);
    }

    public static void b(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, List<TrackLineChartHolder.Mode> list) {
        qmc qmcVar = (qmc) hwHealthBaseCombinedChart.getData();
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        List<T> dataSets = qmcVar.getDataSets();
        HashMap map3 = new HashMap(16);
        for (int i = 0; i < dataSets.size() && i < list.size(); i++) {
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet = (HwHealthBaseBarLineDataSet) dataSets.get(i);
            HwHealthYAxis axis = hwHealthBaseCombinedChart.getAxis(hwHealthBaseBarLineDataSet.getAxisDependencyExt());
            qmi qmiVar = new qmi();
            qmiVar.e(hwHealthBaseCombinedChart.getAxisDataRenderArg(hwHealthBaseBarLineDataSet.getAxisDependencyExt()));
            map.put(hwHealthBaseBarLineDataSet, Float.valueOf(axis.getAxisMinimum()));
            map2.put(hwHealthBaseBarLineDataSet, Float.valueOf(axis.getAxisMaximum()));
            map3.put(hwHealthBaseBarLineDataSet, qmiVar);
        }
        for (int i2 = 0; i2 < dataSets.size() && i2 < list.size(); i2++) {
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet2 = (HwHealthBaseBarLineDataSet) dataSets.get(i2);
            LogUtil.a("Track_TrackLineChartHolder", "rmDataSet customAxis mode=", list.get(i2), " max=", map2.get(hwHealthBaseBarLineDataSet2), " min=", map.get(hwHealthBaseBarLineDataSet2));
            e(hwHealthBaseCombinedChart, hwHealthBaseBarLineDataSet2, list.get(i2), ((Float) map2.get(hwHealthBaseBarLineDataSet2)).floatValue(), ((Float) map.get(hwHealthBaseBarLineDataSet2)).floatValue());
            b(hwHealthBaseCombinedChart, hwHealthBaseBarLineDataSet2, list.get(i2), (qmi) map3.get(hwHealthBaseBarLineDataSet2));
        }
        qmcVar.notifyDataChanged();
    }

    public static void b(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, TrackLineChartHolder.Mode mode, qmi qmiVar) {
        LogUtil.a("Track_TrackLineChartHolder", "customAxisRenderArg mode:", mode);
        if (mode == TrackLineChartHolder.Mode.MODE_FIRST_AXIS) {
            hwHealthBaseCombinedChart.setAxisDataRenderArg(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY, qmiVar);
        } else if (mode == TrackLineChartHolder.Mode.MODE_SECOND_AXIS) {
            hwHealthBaseCombinedChart.setAxisDataRenderArg(HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY, qmiVar);
        } else {
            hwHealthBaseCombinedChart.setAxisDataRenderArg(HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY, qmiVar);
        }
        qmiVar.c().initStyle(hwHealthBaseCombinedChart, hwHealthBaseBarLineDataSet);
    }

    public static void e(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, IHwHealthBarLineDataSet iHwHealthBarLineDataSet, TrackLineChartHolder.Mode mode, float f, float f2) {
        HwHealthYAxis axisThirdParty;
        LogUtil.a("Track_TrackLineChartHolder", "customAxis mode:", mode);
        if (mode == TrackLineChartHolder.Mode.MODE_FIRST_AXIS) {
            axisThirdParty = hwHealthBaseCombinedChart.getAxisFirstParty();
            iHwHealthBarLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        } else if (mode == TrackLineChartHolder.Mode.MODE_SECOND_AXIS) {
            axisThirdParty = hwHealthBaseCombinedChart.getAxisSecondParty();
            iHwHealthBarLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY);
        } else {
            axisThirdParty = hwHealthBaseCombinedChart.getAxisThirdParty();
            iHwHealthBarLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY);
        }
        float f3 = f - f2;
        if (Math.abs(f3) >= 1.0E-4f) {
            axisThirdParty.setAxisMinimum(f2);
            axisThirdParty.setAxisMaximum(f);
        } else if (Math.abs(f) < 1.0E-4f) {
            axisThirdParty.setAxisMaximum(f + 1.0f);
            axisThirdParty.setAxisMinimum(f2);
        } else {
            axisThirdParty.setAxisMinimum(f3);
            axisThirdParty.setAxisMaximum(f);
        }
    }

    public static TrackLineChartHolder.a e(int i, int i2, boolean z) {
        int iD = d(i, i2, 3);
        int iD2 = d(i, i2, 5);
        if (z) {
            return new TrackLineChartHolder.a(iD2, 3);
        }
        if (i - i2 >= 4) {
            return new TrackLineChartHolder.a(iD2, 5);
        }
        if (iD2 <= iD) {
            return new TrackLineChartHolder.a(iD2, 5);
        }
        return new TrackLineChartHolder.a(iD2, 3);
    }

    public static TrackLineChartHolder.a a(int i, int i2, boolean z) {
        if (z) {
            return new TrackLineChartHolder.a(i, 3);
        }
        if (i - i2 >= 4) {
            return new TrackLineChartHolder.a(i, 5);
        }
        return new TrackLineChartHolder.a(i, 5);
    }

    public static int d(int i, int i2, int i3) {
        int i4;
        int i5;
        return (i3 > 1 && (i5 = (i - i2) % (i4 = i3 + (-1))) != 0) ? i + (i4 - i5) : i;
    }

    public static void b(final HwHealthLineDataSet hwHealthLineDataSet) {
        hwHealthLineDataSet.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: qtm.5
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return z;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                if (z) {
                    return hwHealthLineDataSet.getLineWidth();
                }
                return Utils.convertDpToPixel(4.0f);
            }
        });
    }

    public static void c(List<HeartRateData> list, int i, HeartRateData heartRateData, int i2) {
        for (int i3 = 1; i3 < i; i3++) {
            list.add(new HeartRateData(heartRateData.acquireTime() + (((long) i2) * ((long) i3) * 1000), heartRateData.acquireHeartRate()));
        }
    }

    public static void a(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthLineDataSet hwHealthLineDataSet, List<TrackLineChartHolder.Mode> list) {
        b(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        b(hwHealthBaseCombinedChart, list);
    }

    public static void a(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, List<TrackLineChartHolder.Mode> list) {
        if (hwHealthBaseCombinedChart == null) {
            return;
        }
        d(hwHealthBaseCombinedChart, hwHealthBaseBarLineDataSet);
        b(hwHealthBaseCombinedChart, list);
    }

    public static void e(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, TrackLineChartHolder.c cVar, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, int i, float f, int i2, float f2, List<TrackLineChartHolder.Mode> list) {
        if (!cVar.e) {
            int i3 = (int) (i * f);
            hwHealthBaseCombinedChart.setGridColor(Color.argb(i3, i2, i2, i2), Color.argb(i3, i2, i2, i2));
            hwHealthBaseCombinedChart.setLabelColor(Color.rgb(i2, i2, i2));
        }
        c(hwHealthBaseCombinedChart, cVar, f2);
        a(hwHealthBaseCombinedChart, hwHealthBaseBarLineDataSet, list);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthBaseBarLineDataSet);
    }

    public static boolean a(gzv gzvVar) {
        return gzvVar.l() <= 0 && gzvVar.k() <= 0;
    }

    public static boolean c(gzv gzvVar) {
        return gzvVar.n() > 0.0f || gzvVar.o() > 0.0f || gzvVar.q() > 0.0f || gzvVar.t() > 0.0f;
    }

    public static boolean b(gzv gzvVar) {
        return gzvVar.a() == 0 && gzvVar.d() == 0 && gzvVar.j() == 0 && gzvVar.b() == 0;
    }

    public static TrackLineChartHolder.Mode c(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        qmc qmcVar = (qmc) hwHealthBaseCombinedChart.getData();
        if (qmcVar == null) {
            return TrackLineChartHolder.Mode.MODE_FIRST_AXIS;
        }
        List<T> dataSets = qmcVar.getDataSets();
        if (njy.e(dataSets)) {
            return TrackLineChartHolder.Mode.MODE_FIRST_AXIS;
        }
        if (dataSets.size() == 1) {
            return TrackLineChartHolder.Mode.MODE_SECOND_AXIS;
        }
        if (dataSets.size() == 2) {
            return TrackLineChartHolder.Mode.MODE_THIRD_PARTY_AXIS;
        }
        return TrackLineChartHolder.Mode.MODE_NONE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[RETURN] */
    public static float a(gzv gzvVar, int i) {
        float fO;
        int iL;
        if (i == 7) {
            iL = gzvVar.a();
        } else {
            if (i != 8) {
                if (i == 16) {
                    iL = gzvVar.l();
                } else if (i == 17) {
                    fO = gzz.b(gzvVar.k());
                    if (fO == 0.0f) {
                        return -10000.0f;
                    }
                } else if (i == 19) {
                    fO = gzvVar.n();
                } else if (i == 18) {
                    fO = d(gzvVar);
                } else if (i == 20) {
                    fO = gzvVar.q();
                } else {
                    fO = gzvVar.o();
                }
                if (fO <= 0.0f) {
                    return -10000.0f;
                }
                return fO;
            }
            iL = gzvVar.d();
        }
        fO = iL;
        if (fO <= 0.0f) {
            return -10000.0f;
        }
        return fO;
    }

    private static float d(gzv gzvVar) {
        if (!UnitUtil.f()) {
            return gzvVar.t();
        }
        return (float) UnitUtil.e(gzvVar.t(), 0);
    }

    public static HwHealthBarDataSet d(List<HwHealthBarEntry> list, Context context) {
        HwHealthBarDataSet hwHealthBarDataSet = new HwHealthBarDataSet(list, context.getResources().getString(R.string.IDS_aw_version2_duration_of_passage), context.getResources().getString(R.string.IDS_aw_version2_duration_of_passage), context.getResources().getString(R.string.IDS_msec_unit));
        hwHealthBarDataSet.setColor(-16745217);
        hwHealthBarDataSet.e(-16750120);
        hwHealthBarDataSet.setBarDrawWidthDp(1.5f);
        hwHealthBarDataSet.setSearchByBarWidth(true);
        return hwHealthBarDataSet;
    }

    public static String b(Context context) {
        if (!UnitUtil.f()) {
            return context.getResources().getString(R.string.IDS_cm);
        }
        return context.getResources().getString(R.string.IDS_ins);
    }

    public static HwHealthBarDataSet e(float f, HwHealthBarDataSet hwHealthBarDataSet) {
        if (f > 0.0f) {
            LogUtil.d("Track_TrackLineChartHolder", "add Height SumTime:", Float.valueOf(f));
            hwHealthBarDataSet.setXMaxForcedValue(f);
        }
        hwHealthBarDataSet.setSearchByBarWidth(true);
        hwHealthBarDataSet.setColor(-301790);
        hwHealthBarDataSet.e(-2140647);
        hwHealthBarDataSet.setBarDrawWidthDp(1.5f);
        return hwHealthBarDataSet;
    }

    public static ArrayList<njm> b(ArrayList<njm> arrayList) {
        if (njy.e(arrayList)) {
            return new ArrayList<>(16);
        }
        if (!UnitUtil.f()) {
            return arrayList;
        }
        ArrayList<njm> arrayList2 = new ArrayList<>(16);
        for (njm njmVar : arrayList) {
            arrayList2.add(new njm(njmVar.acquireTime(), UnitUtil.e(njmVar.a(), 1)));
        }
        return arrayList2;
    }

    public static ArrayList<njr> c(ArrayList<njr> arrayList) {
        if (njy.e(arrayList)) {
            return new ArrayList<>(16);
        }
        if (!UnitUtil.f()) {
            return arrayList;
        }
        ArrayList<njr> arrayList2 = new ArrayList<>(16);
        for (njr njrVar : arrayList) {
            arrayList2.add(new njr(njrVar.acquireTime(), UnitUtil.e(njrVar.c(), 3)));
        }
        return arrayList2;
    }

    public static ArrayList<njm> d(ArrayList<njm> arrayList) {
        ArrayList<njm> arrayList2 = new ArrayList<>(16);
        float fA = Float.MAX_VALUE;
        for (njm njmVar : arrayList) {
            if (njmVar.a() < fA) {
                fA = (float) njmVar.a();
            }
        }
        int iFloor = (int) Math.floor(fA);
        LogUtil.a("Track_TrackLineChartHolder", "baseLine:", Integer.valueOf(iFloor), " min:", Float.valueOf(fA));
        for (njm njmVar2 : arrayList) {
            arrayList2.add(new njm(njmVar2.acquireTime(), njmVar2.a() - ((double) iFloor)));
        }
        return arrayList2;
    }

    public static void a(List<TrackLineChartHolder.Mode> list) {
        list.clear();
        list.add(TrackLineChartHolder.Mode.MODE_FIRST_AXIS);
        list.add(TrackLineChartHolder.Mode.MODE_SECOND_AXIS);
        list.add(TrackLineChartHolder.Mode.MODE_THIRD_PARTY_AXIS);
        list.add(TrackLineChartHolder.Mode.MODE_NONE);
    }

    public static String c(Context context) {
        if (!UnitUtil.f()) {
            return context.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
        }
        return context.getResources().getString(R.string.IDS_ft);
    }

    public static HwHealthLineDataSet a(HwHealthLineDataSet hwHealthLineDataSet) {
        if (UnitUtil.f()) {
            hwHealthLineDataSet.e(2);
            return hwHealthLineDataSet;
        }
        hwHealthLineDataSet.e(1);
        return hwHealthLineDataSet;
    }

    public static void e(TrackLineChartHolder.d dVar) {
        b(dVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0124  */
    /* JADX WARN: Code duplicated, block: B:14:0x013d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0142  */
    public static void b(TrackLineChartHolder.d dVar, boolean z) {
        int iCeil;
        int i;
        double dFloor;
        int i2;
        if (dVar.f24027c) {
            float fMax = Math.max(Math.min(dVar.c() - dVar.d(), dVar.d() - dVar.e()) * 2.0f, 35.0f);
            iCeil = (int) Math.ceil(Math.max(dVar.d() + (0.65f * fMax), ((double) dVar.c()) + (Math.pow(Math.max(dVar.d(), 5.0f), 0.5d) * 0.5d)));
            dFloor = Math.floor(Math.min(dVar.d() - (fMax * 0.75f), dVar.e()));
        } else {
            if (!dVar.f24026b) {
                float fMin = Math.min(dVar.c() - dVar.d(), dVar.d() - dVar.e()) * 2.0f;
                iCeil = (int) Math.ceil(Math.max(dVar.d() + (0.65f * fMin), ((double) dVar.c()) + (Math.pow(Math.max(dVar.d(), 5.0f), 0.5d) * 0.5d)));
                dFloor = Math.floor(Math.max(0.0f, Math.min(dVar.e() - (fMin * 0.05f), dVar.d() * 0.8f)));
            } else {
                float fMin2 = Math.min(dVar.c() - dVar.d(), dVar.d() - dVar.e()) * 2.0f;
                int iFloor = (int) Math.floor(Math.max(Math.min(dVar.d() - (0.65f * fMin2), ((double) dVar.e()) - (Math.pow(Math.max(dVar.d(), 5.0f), 0.5d) * 0.5d)), 0.0d));
                iCeil = (int) Math.ceil(Math.max(dVar.d() + (fMin2 * 2.0f), dVar.d() * 3.3f));
                i = iFloor;
            }
            if (z) {
                LogUtil.a("Track_TrackLineChartHolder", " maxAxisInteger=", Integer.valueOf(iCeil), " minAxisInteger=", Integer.valueOf(i));
                if (dVar.i()) {
                    i2 = (iCeil - i) / 5;
                } else {
                    i2 = (iCeil - i) / 11;
                }
                iCeil += i2;
            }
            LogUtil.a("Track_TrackLineChartHolder", "customAxisByDataBoard mode=", dVar.a(), " maxAxisInteger=", Integer.valueOf(iCeil), " minAxisInteger=", Integer.valueOf(i));
            TrackLineChartHolder.a aVarE = e(iCeil, i, dVar.i());
            int i3 = aVarE.e;
            dVar.g().setLabelCount(aVarE.d, true);
            LogUtil.a("Track_TrackLineChartHolder", "customAxisByDataBoard(after correct) mode=", dVar.a(), " maxAxisInteger=", Integer.valueOf(i3), " minAxisInteger=", Integer.valueOf(i));
            e(dVar.b(), dVar.g(), dVar.a(), i3, i);
        }
        i = (int) dFloor;
        if (z) {
            LogUtil.a("Track_TrackLineChartHolder", " maxAxisInteger=", Integer.valueOf(iCeil), " minAxisInteger=", Integer.valueOf(i));
            if (dVar.i()) {
                i2 = (iCeil - i) / 5;
            } else {
                i2 = (iCeil - i) / 11;
            }
            iCeil += i2;
        }
        LogUtil.a("Track_TrackLineChartHolder", "customAxisByDataBoard mode=", dVar.a(), " maxAxisInteger=", Integer.valueOf(iCeil), " minAxisInteger=", Integer.valueOf(i));
        TrackLineChartHolder.a aVarE2 = e(iCeil, i, dVar.i());
        int i4 = aVarE2.e;
        dVar.g().setLabelCount(aVarE2.d, true);
        LogUtil.a("Track_TrackLineChartHolder", "customAxisByDataBoard(after correct) mode=", dVar.a(), " maxAxisInteger=", Integer.valueOf(i4), " minAxisInteger=", Integer.valueOf(i));
        e(dVar.b(), dVar.g(), dVar.a(), i4, i);
    }

    public static void b(TrackLineChartHolder.d dVar) {
        int iA = qrs.a(dVar.c(), dVar.e());
        int iB = qrs.b(dVar.c(), dVar.e());
        LogUtil.a("Track_TrackLineChartHolder", "customAxisByDataBoard mode=", dVar.a(), " maxAxisInteger=", Integer.valueOf(iA), " minAxisInteger=", Integer.valueOf(iB));
        TrackLineChartHolder.a aVarA = a(iA, iB, dVar.i());
        int i = aVarA.e;
        dVar.g().setLabelCount(aVarA.d, true);
        LogUtil.a("Track_TrackLineChartHolder", "customAxisByDataBoard(after correct) mode=", dVar.a(), " maxAxisInteger=", Integer.valueOf(i), " minAxisInteger=", Integer.valueOf(iB));
        e(dVar.b(), dVar.g(), dVar.a(), i, iB);
    }

    public static void c(HwHealthLineDataSet hwHealthLineDataSet, boolean z) {
        hwHealthLineDataSet.a(Color.argb(127, 255, 131, 25), Color.argb(0, 255, 131, 25), z);
    }

    public static boolean e(List<njc> list) {
        if (njy.e(list)) {
            return false;
        }
        for (njc njcVar : list) {
            if (njcVar != null && njcVar.a() != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(List<njh> list) {
        if (njy.e(list)) {
            return false;
        }
        for (njh njhVar : list) {
            if (njhVar != null && njhVar.e() != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(List<njb> list) {
        if (njy.e(list)) {
            return false;
        }
        for (njb njbVar : list) {
            if (njbVar != null && njbVar.a() != 0) {
                return true;
            }
        }
        return false;
    }

    public static void b(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, TrackLineChartHolder.c cVar, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        if (!cVar.e) {
            hwHealthBaseCombinedChart.setGridColor(Color.argb(51, 255, 255, 255), Color.argb(51, 255, 255, 255));
            hwHealthBaseCombinedChart.setLabelColor(Color.rgb(255, 255, 255));
        }
        b(cVar, hwHealthBaseCombinedChart, hwHealthBaseBarLineDataSet, 2.0f, 1.0f, 9.0f);
    }

    public static int d(int i) {
        if (i == 1) {
            return Color.argb(255, 0, 125, 255);
        }
        if (i == 2) {
            return Color.argb(255, 100, 187, 92);
        }
        if (i == 3) {
            return Color.argb(255, 255, 152, 0);
        }
        if (i == 4) {
            return Color.argb(255, 251, 101, 34);
        }
        if (i == 5) {
            return Color.argb(255, 222, 55, 55);
        }
        return Color.argb(255, 29, 204, 205);
    }

    public static int a(int i) {
        int iD = d(i);
        return Color.argb(76, Color.red(iD), Color.green(iD), Color.blue(iD));
    }

    public static HwHealthLineDataSet e(int i, ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, qre.f(R.string.IDS_track_analog_cadence), qre.f(R.string.IDS_track_analog_cadence), qre.f(R.string.IDS_indoor_equip_cadence_unit_times_minute), i);
        hwHealthLineDataSet.setColor(Color.argb(255, 255, 131, 25));
        c(hwHealthLineDataSet, true);
        return hwHealthLineDataSet;
    }

    public static void d(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, TrackLineChartHolder.c cVar, float f, int i) {
        b(hwHealthBaseCombinedChart, cVar, f, i, (String) null, (HwHealthBaseCombinedChart.DataParser) null);
    }

    public static void e(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, TrackLineChartHolder.c cVar, float f, int i, String str) {
        b(hwHealthBaseCombinedChart, cVar, f, i, str, (HwHealthBaseCombinedChart.DataParser) null);
    }

    public static void b(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, TrackLineChartHolder.c cVar, float f, int i, String str, HwHealthBaseCombinedChart.DataParser dataParser) {
        if (hwHealthBaseCombinedChart == null || cVar == null) {
            ReleaseLogUtil.a("Track_TrackLineChartHolder", "setChartAvgLine chart or showMode is null");
            return;
        }
        if (cVar.f24024c || Math.abs(Float.MAX_VALUE - f) <= 1.0E-6d) {
            return;
        }
        int i2 = qqs.e(BaseApplication.getContext()) ? f46817a : d;
        if (TextUtils.isEmpty(str)) {
            hwHealthBaseCombinedChart.enableManualFloatLine(f, i2);
        } else {
            hwHealthBaseCombinedChart.setManualReferenceLine(f, i2, str);
        }
        hwHealthBaseCombinedChart.enableManualFloatLineText(i);
        if (dataParser != null) {
            hwHealthBaseCombinedChart.d(dataParser);
        }
    }
}
