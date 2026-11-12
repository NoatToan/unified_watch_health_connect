package defpackage;

import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.HwHealthBaseLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qob implements IHwHealthLineDatasContainer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HwHealthLineDataSet f46545b;
    protected HwHealthBaseBarLineChart e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<qod> f46546c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f46544a = new c();

    protected boolean a(float f, float f2, float f3) {
        return f3 < f && f3 > f2;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public List<qod> queryNewNodes() {
        return null;
    }

    public qob(HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        this.e = hwHealthBaseBarLineChart;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public HwHealthBaseBarLineChart acquireChart() {
        return this.e;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public void reset() {
        this.f46546c.clear();
        this.f46545b = null;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public void load(HwHealthLineDataSet hwHealthLineDataSet) {
        ?? entryForIndex;
        this.f46544a.c(this.e, hwHealthLineDataSet);
        this.f46545b = hwHealthLineDataSet;
        this.f46546c.clear();
        if (this.f46544a.a() - 1 >= 0 && this.f46544a.a() - 1 < hwHealthLineDataSet.getEntryCount()) {
            this.f46546c.add(new qod(hwHealthLineDataSet.getEntryForIndex(this.f46544a.a() - 1)));
        }
        for (int iA = this.f46544a.a(); this.f46544a.c() != 0 && iA < this.f46544a.d(); iA++) {
            qod qodVar = new qod(hwHealthLineDataSet.getEntryForIndex(iA));
            if (iA == this.f46544a.a() && hwHealthLineDataSet.isDrawStartEndNode()) {
                qodVar.a(true);
            }
            if (iA == this.f46544a.d() - 1 && hwHealthLineDataSet.isDrawStartEndNode()) {
                qodVar.d(true);
            }
            this.f46546c.add(qodVar);
        }
        if (this.f46544a.d() >= 0 && this.f46544a.d() < hwHealthLineDataSet.getEntryCount() && (entryForIndex = hwHealthLineDataSet.getEntryForIndex(this.f46544a.d())) != 0) {
            this.f46546c.add(new qod(entryForIndex));
        }
        b(hwHealthLineDataSet, this.f46546c);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public List<qod> queryNodes() {
        return this.f46546c;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public List<HwHealthBaseEntry> searchEntryForXValue(float f) {
        return b(this.f46546c, f);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e A[RETURN] */
    protected List<HwHealthBaseEntry> b(List<qod> list, float f) {
        int size;
        ArrayList arrayList = new ArrayList();
        int size2 = list.size() - 1;
        int i = 0;
        while (i <= size2) {
            int i2 = (size2 + i) / 2;
            qod qodVar = list.get(i2);
            if (Math.abs(f - qodVar.c()) <= 0.001f) {
                int i3 = i2;
                while (i3 > 0 && Math.abs(list.get(i3 - 1).c() - f) <= 0.001f) {
                    i3--;
                }
                size = list.size();
                c(list, f, arrayList, size, i3);
                if (i > size) {
                    return d(list, arrayList, i, size, f);
                }
                return arrayList;
            }
            if (f > qodVar.c()) {
                i = i2 + 1;
            } else {
                size2 = i2 - 1;
            }
        }
        size = size2;
        if (i > size) {
            return d(list, arrayList, i, size, f);
        }
        return arrayList;
    }

    private List<HwHealthBaseEntry> d(List<qod> list, List<HwHealthBaseEntry> list2, int i, int i2, float f) {
        boolean z;
        boolean zI = this.f46545b.i();
        boolean z2 = false;
        boolean z3 = (i < 0 || i > list.size() - 1) || (i2 < 0 || i2 > list.size() - 1);
        if (zI) {
            HwHealthBaseEntry hwHealthBaseEntryA = a(list, i, i2, f);
            if (hwHealthBaseEntryA != null) {
                list2.add(hwHealthBaseEntryA);
                return list2;
            }
        } else {
            HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.e;
            if (hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) {
                boolean z4 = ((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart).acquireChartShowMode() == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE;
                z = ((HwHealthBaseScrollBarLineChart) this.e).acquireChartShowMode() == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_SCALE_MODE;
                z2 = z4;
            } else {
                z = false;
            }
            if (!z2 && !z) {
                if (z3) {
                    return b(list, list2, f);
                }
                HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) list.get(i2).a();
                HwHealthBaseEntry hwHealthBaseEntry2 = (HwHealthBaseEntry) list.get(i).a();
                if (Math.abs(hwHealthBaseEntry.getX() - f) <= Math.abs(hwHealthBaseEntry2.getX() - f)) {
                    list2.add(hwHealthBaseEntry);
                    return list2;
                }
                list2.add(hwHealthBaseEntry2);
                return list2;
            }
            HwHealthBaseEntry hwHealthBaseEntryD = d(list, i, i2, f);
            if (hwHealthBaseEntryD != null) {
                list2.add(hwHealthBaseEntryD);
                return list2;
            }
        }
        return list2;
    }

    private List<HwHealthBaseEntry> b(List<qod> list, List<HwHealthBaseEntry> list2, float f) {
        if (njy.e(list2) && !njy.e(list)) {
            float fE = e();
            if (fE >= 0.001f) {
                float f2 = fE / 2.0f;
                if (Math.abs(f - list.get(list.size() - 1).c()) <= f2) {
                    Entry entryA = list.get(list.size() - 1).a();
                    if (entryA instanceof HwHealthBaseEntry) {
                        list2.add((HwHealthBaseEntry) entryA);
                        return list2;
                    }
                } else if (Math.abs(f - list.get(0).c()) <= f2) {
                    Entry entryA2 = list.get(0).a();
                    if (entryA2 instanceof HwHealthBaseEntry) {
                        list2.add((HwHealthBaseEntry) entryA2);
                    }
                }
            }
        }
        return list2;
    }

    private float e() {
        HwHealthLineDataSet hwHealthLineDataSet = this.f46545b;
        if (hwHealthLineDataSet != null) {
            return hwHealthLineDataSet.c();
        }
        return 0.0f;
    }

    private void c(List<qod> list, float f, List<HwHealthBaseEntry> list2, int i, int i2) {
        while (i2 < i) {
            qod qodVar = list.get(i2);
            if (qodVar == null || Math.abs(qodVar.c() - f) > 0.001f || !(qodVar.a() instanceof HwHealthBaseEntry)) {
                return;
            }
            list2.add((HwHealthBaseEntry) qodVar.a());
            i2++;
        }
    }

    private HwHealthBaseEntry a(List<qod> list, int i, int i2, float f) {
        return e(list, i, i2, f, this.f46545b.b() / 2.0f);
    }

    private HwHealthBaseEntry b(List<qod> list, int i, int i2, float f, float f2) {
        boolean z = true;
        boolean z2 = i < 0 || i > list.size() - 1;
        if (i2 >= 0 && i2 <= list.size() - 1) {
            z = false;
        }
        if (z2 && !z && (list.get(i2).a() instanceof HwHealthBaseEntry)) {
            HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) list.get(i2).a();
            if (Math.abs(hwHealthBaseEntry.getX() - f) >= f2) {
                return null;
            }
            return hwHealthBaseEntry;
        }
        if (z2 || !z || !(list.get(i).a() instanceof HwHealthBaseEntry)) {
            return null;
        }
        HwHealthBaseEntry hwHealthBaseEntry2 = (HwHealthBaseEntry) list.get(i).a();
        if (Math.abs(hwHealthBaseEntry2.getX() - f) >= f2) {
            return null;
        }
        return hwHealthBaseEntry2;
    }

    private HwHealthBaseEntry e(List<qod> list, int i, int i2, float f, float f2) {
        boolean z = i < 0 || i > list.size() - 1;
        boolean z2 = i2 < 0 || i2 > list.size() - 1;
        if (z || z2) {
            return b(list, i, i2, f, f2);
        }
        Entry entryA = list.get(i).a();
        Entry entryA2 = list.get(i2).a();
        int x = (int) entryA.getX();
        int x2 = (int) entryA2.getX();
        float fAbs = Math.abs(entryA2.getX() - f);
        float fAbs2 = Math.abs(entryA.getX() - f);
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        if (list.get(iMin) == null || list.get(iMax) == null) {
            LogUtil.e("HwHealthLineDataContainer", "dataList.get(minPoint) is null or dataList.get(maxPoint) is null");
            return null;
        }
        boolean z3 = list.get(iMin).j() && list.get(iMax).h();
        if (x - x2 > f2 && fAbs >= f2 && fAbs2 >= f2 && !z3) {
            return null;
        }
        if (!(list.get(i2).a() instanceof HwHealthBaseEntry) || !(list.get(i).a() instanceof HwHealthBaseEntry)) {
            LogUtil.e("HwHealthLineDataContainer", "!(dataList.get(high).getHookEntry() instanceof HwHealthBaseEntry)");
            return null;
        }
        HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) list.get(i2).a();
        HwHealthBaseEntry hwHealthBaseEntry2 = (HwHealthBaseEntry) list.get(i).a();
        return Math.abs(hwHealthBaseEntry.getX() - f) <= Math.abs(hwHealthBaseEntry2.getX() - f) ? hwHealthBaseEntry : hwHealthBaseEntry2;
    }

    private HwHealthBaseEntry b(List<qod> list, int i, int i2, float f) {
        HwHealthTransformer transformer = this.e.getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        float[] fArr = {0.0f, 0.0f, Utils.convertDpToPixel(6.0f), 0.0f};
        transformer.pixelsToValue(fArr);
        return e(list, i, i2, f, Math.abs(fArr[2] - fArr[0]));
    }

    private HwHealthBaseEntry d(List<qod> list, int i, int i2, float f) {
        HwHealthBaseEntry hwHealthBaseEntry;
        boolean z = true;
        boolean z2 = i < 0 || i > list.size() - 1;
        boolean z3 = i2 < 0 || i2 > list.size() - 1;
        if (!z2 && !z3) {
            z = false;
        }
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.e;
        if (!(hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart)) {
            LogUtil.j("HwHealthLineDataContainer", "!(mChart instanceof HwHealthBaseScrollBarLineChart)");
            return null;
        }
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = ((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart).acquireScrollAdapter();
        ChartData data = this.e.getData();
        if ((scrollAdapterInterfaceAcquireScrollAdapter instanceof qmy) && data != null && data.getDataSets() != null && data.getDataSets().size() != 0 && (data.getDataSets().get(0) instanceof HwHealthBaseLineDataSet)) {
            return b(list, i, i2, f);
        }
        int i3 = (int) f;
        int iAcquireValuePresentRangeMin = scrollAdapterInterfaceAcquireScrollAdapter.acquireValuePresentRangeMin(i3);
        int iAcquireValuePresentRangeMax = scrollAdapterInterfaceAcquireScrollAdapter.acquireValuePresentRangeMax(i3);
        if (z) {
            if (!z2 && (list.get(i).a() instanceof HwHealthBaseEntry)) {
                hwHealthBaseEntry = (HwHealthBaseEntry) list.get(i).a();
            } else {
                hwHealthBaseEntry = (z3 || !(list.get(i2).a() instanceof HwHealthBaseEntry)) ? null : (HwHealthBaseEntry) list.get(i2).a();
            }
            if (hwHealthBaseEntry == null || hwHealthBaseEntry.getX() < iAcquireValuePresentRangeMin || hwHealthBaseEntry.getX() > iAcquireValuePresentRangeMax) {
                return null;
            }
            return hwHealthBaseEntry;
        }
        HwHealthBaseEntry hwHealthBaseEntry2 = list.get(i).a() instanceof HwHealthBaseEntry ? (HwHealthBaseEntry) list.get(i).a() : null;
        HwHealthBaseEntry hwHealthBaseEntry3 = list.get(i2).a() instanceof HwHealthBaseEntry ? (HwHealthBaseEntry) list.get(i2).a() : null;
        if (b(hwHealthBaseEntry2, iAcquireValuePresentRangeMin, iAcquireValuePresentRangeMax)) {
            return hwHealthBaseEntry2;
        }
        if (b(hwHealthBaseEntry3, iAcquireValuePresentRangeMin, iAcquireValuePresentRangeMax)) {
            return hwHealthBaseEntry3;
        }
        return null;
    }

    private boolean b(HwHealthBaseEntry hwHealthBaseEntry, int i, int i2) {
        return hwHealthBaseEntry != null && hwHealthBaseEntry.getX() >= ((float) i) && hwHealthBaseEntry.getX() <= ((float) i2);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public HwHealthBaseEntry acquireNearestPoint(float f) {
        float highestVisibleX = this.e.getHighestVisibleX();
        float lowestVisibleX = this.e.getLowestVisibleX();
        float fAbs = Float.MAX_VALUE;
        HwHealthBaseEntry hwHealthBaseEntry = null;
        for (qod qodVar : this.f46546c) {
            if (!(qodVar.a() instanceof HwHealthBaseEntry)) {
                return null;
            }
            float x = ((HwHealthBaseEntry) qodVar.a()).getX();
            if (a(highestVisibleX, lowestVisibleX, x)) {
                float f2 = x - f;
                if (Math.abs(f2) < fAbs) {
                    fAbs = Math.abs(f2);
                    hwHealthBaseEntry = (HwHealthBaseEntry) qodVar.a();
                }
            }
        }
        return hwHealthBaseEntry;
    }

    protected void b(HwHealthLineDataSet hwHealthLineDataSet, List<qod> list) {
        int i = 0;
        while (i < list.size()) {
            int i2 = i - 1;
            qod qodVar = null;
            qod qodVar2 = (i2 < 0 || i2 >= list.size()) ? null : list.get(i2);
            int i3 = i + 1;
            if (i3 >= 0 && i3 < list.size()) {
                qodVar = list.get(i3);
            }
            qod qodVar3 = list.get(i);
            if (qodVar2 != null && qodVar3 != null) {
                qodVar3.e(hwHealthLineDataSet.e((int) qodVar2.c(), (int) qodVar3.c()));
            }
            if (qodVar != null && qodVar3 != null) {
                qodVar3.b(hwHealthLineDataSet.e((int) qodVar3.c(), (int) qodVar.c()));
            }
            i = i3;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46547a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46548c;
        private int d;

        public void c(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, HwHealthLineDataSet hwHealthLineDataSet) {
            if (hwHealthLineDataSet.getValues().size() == 0) {
                this.f46548c = 0;
                this.d = 0;
                this.f46547a = 0;
            } else {
                this.f46548c = 0;
                int size = hwHealthLineDataSet.getValues().size();
                this.d = size;
                this.f46547a = size - this.f46548c;
            }
        }

        public int a() {
            return this.f46548c;
        }

        public int d() {
            return this.d;
        }

        public int c() {
            return this.f46547a;
        }
    }
}
