package defpackage;

import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qmc extends HwHealthBaseBarLineData<HwHealthBaseBarLineDataSet<HwHealthBaseEntry>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qly f46470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qnu f46471b;
    private qnt d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthBaseCombinedChart.DrawOrder[] f46472c = {HwHealthBaseCombinedChart.DrawOrder.BAR, HwHealthBaseCombinedChart.DrawOrder.LINE};
    private List<IHwHealthBarDataSet> e = new ArrayList();

    public void d(qnt qntVar) {
        this.d = qntVar;
        notifyDataChanged();
    }

    public void a(qnu qnuVar) {
        this.f46471b = qnuVar;
        notifyDataChanged();
    }

    public void d(qly qlyVar) {
        this.f46470a = qlyVar;
        notifyDataChanged();
    }

    public HwHealthBaseCombinedChart.DrawOrder[] f() {
        return (HwHealthBaseCombinedChart.DrawOrder[]) this.f46472c.clone();
    }

    public void a(HwHealthBaseCombinedChart.DrawOrder[] drawOrderArr) {
        if (drawOrderArr == null || drawOrderArr.length == 0) {
            return;
        }
        this.f46472c = (HwHealthBaseCombinedChart.DrawOrder[]) drawOrderArr.clone();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData, com.github.mikephil.charting.data.ChartData
    public void calcMinMax() {
        if (this.mDataSets == null) {
            this.mDataSets = new ArrayList(10);
        }
        this.mDataSets.clear();
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mFirstPartyAxisMax = -3.4028235E38f;
        this.mFirstPartyAxisMin = Float.MAX_VALUE;
        this.mSecondPartyAxisMax = -3.4028235E38f;
        this.mSecondPartyAxisMin = Float.MAX_VALUE;
        this.mThirdPartyAxisMax = -3.4028235E38f;
        this.mThirdPartyAxisMin = Float.MAX_VALUE;
        d();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void e() {
        List<HwHealthBaseBarLineData> listA = a();
        this.mDataSets.clear();
        for (HwHealthBaseBarLineData hwHealthBaseBarLineData : listA) {
            if (hwHealthBaseBarLineData != null) {
                this.mDataSets.addAll((Collection<? extends T>) hwHealthBaseBarLineData.getDataSets());
            }
        }
    }

    public qnt j() {
        return this.d;
    }

    public qnt i() {
        return this.f46471b;
    }

    public void c() {
        this.d.getDataSets().clear();
        notifyDataChanged();
    }

    public void b() {
        this.f46471b.getDataSets().clear();
        notifyDataChanged();
    }

    public qly h() {
        return this.f46470a;
    }

    public void g() {
        this.e.addAll(this.f46470a.getDataSets());
        this.f46470a.getDataSets().clear();
        notifyDataChanged();
    }

    public void k() {
        List<IHwHealthBarDataSet> list = this.e;
        if (list == null || list.size() == 0) {
            return;
        }
        this.f46470a.getDataSets().addAll(this.e);
        notifyDataChanged();
    }

    public void c(HwHealthBarDataSet hwHealthBarDataSet) {
        this.f46470a.getDataSets().remove(hwHealthBarDataSet);
        notifyDataChanged();
    }

    public List<HwHealthBaseBarLineData> a() {
        qnu qnuVar;
        ArrayList arrayList = new ArrayList(2);
        for (HwHealthBaseCombinedChart.DrawOrder drawOrder : this.f46472c) {
            int i = AnonymousClass3.f46473a[drawOrder.ordinal()];
            if (i == 1) {
                qly qlyVar = this.f46470a;
                if (qlyVar != null) {
                    arrayList.add(qlyVar);
                }
            } else if (i == 2) {
                qnt qntVar = this.d;
                if (qntVar != null) {
                    arrayList.add(qntVar);
                }
            } else if (i == 3 && (qnuVar = this.f46471b) != null) {
                arrayList.add(qnuVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: qmc$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46473a;

        static {
            int[] iArr = new int[HwHealthBaseCombinedChart.DrawOrder.values().length];
            f46473a = iArr;
            try {
                iArr[HwHealthBaseCombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46473a[HwHealthBaseCombinedChart.DrawOrder.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46473a[HwHealthBaseCombinedChart.DrawOrder.POINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public void notifyDataChanged() {
        qnt qntVar = this.d;
        if (qntVar != null) {
            qntVar.notifyDataChanged();
        }
        qly qlyVar = this.f46470a;
        if (qlyVar != null) {
            qlyVar.notifyDataChanged();
        }
        qnu qnuVar = this.f46471b;
        if (qnuVar != null) {
            qnuVar.notifyDataChanged();
        }
        calcMinMax();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData, com.github.mikephil.charting.data.ChartData
    public Entry getEntryForHighlight(Highlight highlight) {
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleDataE;
        if (highlight.getDataIndex() >= a().size() || (barLineScatterCandleBubbleDataE = e(highlight.getDataIndex())) == null || highlight.getDataSetIndex() >= barLineScatterCandleBubbleDataE.getDataSetCount()) {
            return null;
        }
        List<Entry> entriesForXValue = barLineScatterCandleBubbleDataE.getDataSetByIndex(highlight.getDataSetIndex()).getEntriesForXValue(highlight.getX());
        if (entriesForXValue == null || entriesForXValue.isEmpty()) {
            LogUtil.e("HealthChart_HwHealthCombinedData", "getEntryForHighlight() entries is null!");
            return null;
        }
        for (Entry entry : entriesForXValue) {
            if (entry.getY() == highlight.getY() || Float.isNaN(highlight.getY())) {
                return entry;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData
    public Entry getEntryForXValue(float f, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        List entriesForXValue;
        HwEntrys hwEntrys = new HwEntrys();
        for (T t : this.mDataSets) {
            if (t instanceof IHwHealthLineDataSet) {
                IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = t.cacheDataContainer(hwHealthBaseBarLineChart);
                entriesForXValue = iHwHealthDatasContainerCacheDataContainer instanceof IHwHealthLineDatasContainer ? ((IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer).searchEntryForXValue(f) : null;
            } else if ((t instanceof IHwHealthBarDataSet) && (hwHealthBaseBarLineChart instanceof HwHealthBarDataProvider)) {
                entriesForXValue = new ArrayList(10);
                entriesForXValue.addAll(((IHwHealthBarDataSet) t).getEntriesForXValue(f, (HwHealthBarDataProvider) hwHealthBaseBarLineChart));
            } else {
                entriesForXValue = t.getEntriesForXValue(f);
            }
            if (entriesForXValue == null || entriesForXValue.size() == 0) {
                if (t instanceof HwHealthBarDataSet) {
                    hwEntrys.add(new HwEntrys.HwDataEntry(null, (HwHealthBarDataSet) t));
                } else if (t instanceof HwHealthLineDataSet) {
                    hwEntrys.add(new HwEntrys.HwDataEntry(null, (HwHealthLineDataSet) t));
                }
            } else if (t instanceof HwHealthBarDataSet) {
                hwEntrys.add(new HwEntrys.HwDataEntry((HwHealthBaseEntry) entriesForXValue.get(0), (HwHealthBarDataSet) t));
            } else if (t instanceof HwHealthLineDataSet) {
                hwEntrys.add(new HwEntrys.HwDataEntry((HwHealthBaseEntry) entriesForXValue.get(0), (HwHealthLineDataSet) t));
            }
        }
        return hwEntrys;
    }

    public BarLineScatterCandleBubbleData e(int i) {
        List<HwHealthBaseBarLineData> listA = a();
        if (i < 0 || i >= listA.size()) {
            return null;
        }
        return listA.get(i);
    }

    @Override // com.github.mikephil.charting.data.ChartData
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean removeDataSet(HwHealthBaseBarLineDataSet<HwHealthBaseEntry> hwHealthBaseBarLineDataSet) {
        Iterator<HwHealthBaseBarLineData> it = a().iterator();
        boolean zRemoveDataSet = false;
        while (it.hasNext() && !(zRemoveDataSet = it.next().removeDataSet(hwHealthBaseBarLineDataSet))) {
        }
        notifyDataChanged();
        return zRemoveDataSet;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @Deprecated
    public boolean removeDataSet(int i) {
        LogUtil.e("HealthChart_HwHealthCombinedData", "removeDataSet(int index) not supported for CombinedData");
        return false;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @Deprecated
    public boolean removeEntry(Entry entry, int i) {
        LogUtil.e("HealthChart_HwHealthCombinedData", "removeEntry(...) not supported for CombinedData");
        return false;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @Deprecated
    public boolean removeEntry(float f, int i) {
        LogUtil.e("HealthChart_HwHealthCombinedData", "removeEntry(...) not supported for CombinedData");
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void d() {
        for (HwHealthBaseBarLineData hwHealthBaseBarLineData : a()) {
            hwHealthBaseBarLineData.calcMinMax();
            this.mDataSets.addAll((Collection<? extends T>) hwHealthBaseBarLineData.getDataSets());
            if (hwHealthBaseBarLineData.getYMax() > this.mYMax) {
                this.mYMax = hwHealthBaseBarLineData.getYMax();
            }
            if (hwHealthBaseBarLineData.getYMin() < this.mYMin) {
                this.mYMin = hwHealthBaseBarLineData.getYMin();
            }
            if (hwHealthBaseBarLineData.getXMax() > this.mXMax) {
                this.mXMax = hwHealthBaseBarLineData.getXMax();
            }
            if (hwHealthBaseBarLineData.getXMin() < this.mXMin) {
                this.mXMin = hwHealthBaseBarLineData.getXMin();
            }
            if (hwHealthBaseBarLineData.acquireFirstPartyAxisMax() > this.mFirstPartyAxisMax) {
                this.mFirstPartyAxisMax = hwHealthBaseBarLineData.acquireFirstPartyAxisMax();
            }
            if (hwHealthBaseBarLineData.acquireFirstPartyAxisMin() < this.mFirstPartyAxisMin) {
                this.mFirstPartyAxisMin = hwHealthBaseBarLineData.acquireFirstPartyAxisMin();
            }
            if (hwHealthBaseBarLineData.acquireSecondPartyAxisMax() > this.mSecondPartyAxisMax) {
                this.mSecondPartyAxisMax = hwHealthBaseBarLineData.acquireSecondPartyAxisMax();
            }
            if (hwHealthBaseBarLineData.acquireSecondPartyAxisMin() < this.mSecondPartyAxisMin) {
                this.mSecondPartyAxisMin = hwHealthBaseBarLineData.acquireSecondPartyAxisMin();
            }
            if (hwHealthBaseBarLineData.acquireThirdPartyAxisMax() > this.mThirdPartyAxisMax) {
                this.mThirdPartyAxisMax = hwHealthBaseBarLineData.acquireThirdPartyAxisMax();
            }
            if (hwHealthBaseBarLineData.acquireThirdPartyAxisMin() < this.mThirdPartyAxisMin) {
                this.mThirdPartyAxisMin = hwHealthBaseBarLineData.acquireThirdPartyAxisMin();
            }
        }
    }
}
