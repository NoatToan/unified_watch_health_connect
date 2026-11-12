package com.huawei.ui.commonui.linechart.barchart;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.components.Legend;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import defpackage.njy;
import defpackage.qly;
import defpackage.qnl;
import defpackage.qnn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthBarDataSet extends HwHealthBaseBarDataSet implements HwEntrys.MarkerViewFormatProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qnl f23592c;
    private DrawColorMode d;

    public enum DrawColorMode {
        DEFAULT,
        DATA_COLOR
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwEntrys.MarkerViewFormatProvider
    public int acquireMarkViewTextDigitalCount() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet
    public int acquireRangeCenterValue(int i) {
        return i;
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet
    public int acquireValuePresentRangeMax(int i) {
        return i;
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet
    public int acquireValuePresentRangeMin(int i) {
        return i;
    }

    protected boolean c(float f, HwHealthBarEntry hwHealthBarEntry) {
        return true;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet, com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public IHwHealthDatasContainer cacheDataContainer(HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        return null;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet
    public void flushCachedDataContainer() {
    }

    public HwHealthBarDataSet(List<HwHealthBarEntry> list, String str, String str2, String str3) {
        super(list, str2);
        this.d = DrawColorMode.DEFAULT;
        this.f23592c = new qnl();
        c(list, str, str3);
    }

    private void c(List<HwHealthBarEntry> list, String str, String str2) {
        List<HwHealthBarEntry> listAcquireEntryVals = acquireEntryVals();
        for (HwHealthBarEntry hwHealthBarEntry : list) {
            listAcquireEntryVals.add(new HwHealthBarEntry(hwHealthBarEntry.getX(), hwHealthBarEntry.acquireModel()));
        }
        this.f23592c.b(str);
        this.f23592c.c(str2);
        setColor(-16776961);
        setValueTextSize(9.0f);
        setFormLineWidth(1.0f);
        setFormLineDashEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        setFormSize(15.0f);
        setDrawIcons(false);
        setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        setHighLightColor(-7829368);
        setForm(Legend.LegendForm.CIRCLE);
        setDrawValues(false);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwEntrys.MarkerViewFormatProvider
    public int acquireColor() {
        return this.f23592c.a();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwEntrys.MarkerViewFormatProvider
    public String acquireUnit() {
        return this.f23592c.e();
    }

    public void e(DrawColorMode drawColorMode) {
        this.d = drawColorMode;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet
    public DrawColorMode getDrawColorMode() {
        return this.d;
    }

    @Override // com.github.mikephil.charting.data.BaseDataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor(int i) {
        int iA;
        if (DrawColorMode.DATA_COLOR.equals(this.d)) {
            List<T> values = getValues();
            if (values.size() > i && i >= 0 && (iA = qnn.a(((HwHealthBarEntry) values.get(i)).acquireModel())) != 0) {
                return iA;
            }
        }
        return super.getColor(i);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet
    public int acquireFocusColor() {
        return this.f23592c.c();
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet
    public int acquireFocusColor(HwHealthBarEntry hwHealthBarEntry) {
        int iE;
        return (!DrawColorMode.DATA_COLOR.equals(this.d) || hwHealthBarEntry == null || (iE = qnn.e(hwHealthBarEntry.acquireModel())) == 0) ? this.f23592c.c() : iE;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwEntrys.MarkerViewFormatProvider
    public int acquireMarkViewTextColor() {
        qnl qnlVar = this.f23592c;
        if (qnlVar.i()) {
            return qnlVar.a();
        }
        return qnlVar.d();
    }

    @Override // com.github.mikephil.charting.data.BaseDataSet
    public void setColor(int i) {
        this.f23592c.d(i);
        super.setColor(i);
    }

    public void e(int i) {
        this.f23592c.c(i);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet
    public List<HwHealthBarEntry> getEntriesForXValue(final float f, HwHealthBarDataProvider hwHealthBarDataProvider) {
        float barDrawWidth;
        List<HwHealthBarEntry> entriesForXValue = getEntriesForXValue(f);
        if (!njy.e(entriesForXValue)) {
            Collections.sort(entriesForXValue, new Comparator<HwHealthBarEntry>() { // from class: com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet.2
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(HwHealthBarEntry hwHealthBarEntry, HwHealthBarEntry hwHealthBarEntry2) {
                    if (hwHealthBarEntry == null || hwHealthBarEntry2 == null) {
                        return 0;
                    }
                    return Float.compare(Math.abs(hwHealthBarEntry.getX() - f), Math.abs(hwHealthBarEntry2.getX() - f));
                }
            });
            if (isSearchByBarWidth()) {
                HwHealthTransformer transformer = hwHealthBarDataProvider.getTransformer(getAxisDependencyExt());
                qly barData = hwHealthBarDataProvider.getBarData();
                if (barData != null && IHwHealthBarDataSet.BarWidthMode.DEFAULT_WIDTH.equals(getBarDrawWidthMode())) {
                    barDrawWidth = barData.a();
                } else {
                    barDrawWidth = getBarDrawWidth(transformer);
                }
                Iterator<HwHealthBarEntry> it = entriesForXValue.iterator();
                while (it.hasNext()) {
                    HwHealthBarEntry next = it.next();
                    if (next == null || Math.abs(next.getX() - f) > barDrawWidth / 2.0f) {
                        it.remove();
                    }
                }
            }
        }
        return entriesForXValue;
    }

    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<HwHealthBarEntry> getEntriesForXValue(float f) {
        List<HwHealthBarEntry> arrayList = new ArrayList<>();
        if (this.mEntries.size() == 0) {
            return arrayList;
        }
        int size = this.mEntries.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) this.mEntries.get(i2);
            if (f == hwHealthBarEntry.getX()) {
                while (i2 > 0 && ((HwHealthBarEntry) this.mEntries.get(i2 - 1)).getX() == f) {
                    i2--;
                }
                size = this.mEntries.size();
                while (i2 < size) {
                    HwHealthBarEntry hwHealthBarEntry2 = (HwHealthBarEntry) this.mEntries.get(i2);
                    if (hwHealthBarEntry2.getX() != f) {
                        break;
                    }
                    arrayList.add(hwHealthBarEntry2);
                    i2++;
                }
                break;
            }
            if (f > hwHealthBarEntry.getX()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        if (i > size) {
            arrayList = d(arrayList, size, i);
        }
        if (arrayList.size() == 0) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (HwHealthBarEntry hwHealthBarEntry3 : arrayList) {
            if (c(f, hwHealthBarEntry3)) {
                arrayList2.add(hwHealthBarEntry3);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    private HwHealthBarEntry c(int i, boolean z) {
        HwHealthBarEntry hwHealthBarEntry;
        HwHealthBarEntry hwHealthBarEntry2 = null;
        while (njy.c((Collection<?>) this.mEntries, i) && (hwHealthBarEntry = (HwHealthBarEntry) this.mEntries.get(i)) != null) {
            if (hwHealthBarEntry2 == null) {
                hwHealthBarEntry2 = hwHealthBarEntry;
            } else {
                if (Float.compare(hwHealthBarEntry2.getX(), hwHealthBarEntry.getX()) != 0) {
                    break;
                }
                if (Math.abs(hwHealthBarEntry2.getY()) <= Math.abs(hwHealthBarEntry.getY())) {
                    hwHealthBarEntry2 = hwHealthBarEntry;
                }
            }
            i = z ? i + 1 : i - 1;
        }
        return hwHealthBarEntry2;
    }

    private List<HwHealthBarEntry> d(List<HwHealthBarEntry> list, int i, int i2) {
        if (i2 < 0 || i2 > this.mEntries.size() - 1 || i < 0 || i > this.mEntries.size() - 1) {
            list.add((HwHealthBarEntry) this.mEntries.get(0));
            list.add((HwHealthBarEntry) this.mEntries.get(this.mEntries.size() - 1));
            return list;
        }
        HwHealthBarEntry hwHealthBarEntryC = c(i, false);
        HwHealthBarEntry hwHealthBarEntryC2 = c(i2, true);
        if (hwHealthBarEntryC != null) {
            list.add(hwHealthBarEntryC);
        }
        if (hwHealthBarEntryC2 != null) {
            list.add(hwHealthBarEntryC2);
        }
        return list;
    }

    public qnl a() {
        return this.f23592c;
    }
}
