package com.huawei.ui.commonui.linechart.view;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.drawable.GradientDrawable;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import defpackage.njy;
import defpackage.qnl;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthLineDataSet extends HwHealthBaseLineDataSet implements HwEntrys.MarkerViewFormatProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GradientDrawable f23730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NodeDrawStyle f23731c;
    private boolean d;
    private IHwHealthLineDatasContainer e;
    private LineLinkerFilter f;
    private int g;
    private NodeDrawStyle h;
    private boolean i;
    private boolean j;
    private GradientDrawable k;
    private qnl l;
    private int o;

    public interface LineLinkerFilter {
        boolean drawLine(int i, int i2, int i3);
    }

    public interface NodeDrawStyle {
        float calcuNodeWidthPixel(boolean z);

        float initNodeStyle(int i);

        boolean needDrawNodeFill(boolean z);
    }

    public HwHealthLineDataSet(Context context, List<HwHealthBaseEntry> list, String str, String str2, String str3, int i) {
        super(list, str2);
        this.l = new qnl();
        this.j = false;
        this.d = false;
        this.k = null;
        this.f23730b = null;
        this.i = false;
        this.g = 0;
        this.o = 0;
        this.f23729a = Integer.MAX_VALUE;
        this.e = null;
        this.f = new LineLinkerFilter() { // from class: com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.5
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i2, int i3, int i4) {
                return true;
            }
        };
        this.f23731c = new NodeDrawStyle() { // from class: com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i2) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return z;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return qrs.d(BaseApplication.getContext(), 2.0f);
            }
        };
        this.h = new NodeDrawStyle() { // from class: com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.1
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i2) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return z;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return HwHealthLineDataSet.this.getLineWidth();
            }
        };
        this.o = i;
        c(list, str, str3);
    }

    public HwHealthLineDataSet(Context context, List<HwHealthBaseEntry> list, String str, String str2, String str3) {
        super(list, str2);
        this.l = new qnl();
        this.j = false;
        this.d = false;
        this.k = null;
        this.f23730b = null;
        this.i = false;
        this.g = 0;
        this.o = 0;
        this.f23729a = Integer.MAX_VALUE;
        this.e = null;
        this.f = new LineLinkerFilter() { // from class: com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.5
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i2, int i3, int i4) {
                return true;
            }
        };
        this.f23731c = new NodeDrawStyle() { // from class: com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i2) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return z;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return qrs.d(BaseApplication.getContext(), 2.0f);
            }
        };
        this.h = new NodeDrawStyle() { // from class: com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.1
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i2) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return z;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return HwHealthLineDataSet.this.getLineWidth();
            }
        };
        c(list, str, str3);
    }

    public int c() {
        return this.o;
    }

    public qnl e() {
        return this.l;
    }

    private void c(List<HwHealthBaseEntry> list, String str, String str2) {
        List<T> listAcquireEntryVals = acquireEntryVals();
        for (HwHealthBaseEntry hwHealthBaseEntry : list) {
            if (hwHealthBaseEntry != null) {
                listAcquireEntryVals.add(new HwHealthBaseEntry(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY(), hwHealthBaseEntry.getData()));
            }
        }
        this.l.b(str);
        this.l.c(str2);
        setColor(-16776961);
        setDrawCircles(false);
        setCircleColor(-16776961);
        setLineWidth(2.0f);
        setDrawCircleHole(false);
        setValueTextSize(9.0f);
        setFormLineWidth(1.0f);
        setFormLineDashEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        setFormSize(15.0f);
        setDrawIcons(false);
        setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        setMode(HwHealthBaseLineDataSet.Mode.LINEAR);
        setDrawHorizontalHighlightIndicator(false);
        setHighLightColor(-7829368);
        setFillAlpha(255);
        setHighlightLineWidth(1.0f);
        setForm(Legend.LegendForm.CIRCLE);
        setDrawValues(false);
    }

    @Override // com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet
    public List<HwHealthBaseEntry> getEntriesForXValue(float f, IHwHealthLineDatasContainer iHwHealthLineDatasContainer) {
        if (iHwHealthLineDatasContainer == null) {
            return d(f);
        }
        return iHwHealthLineDatasContainer.searchEntryForXValue(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if ((((int) ((com.github.mikephil.charting.data.Entry) r6.mEntries.get(r2)).getX()) - ((int) ((com.github.mikephil.charting.data.Entry) r6.mEntries.get(r1)).getX())) > r6.f23729a) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<HwHealthBaseEntry> d(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.mEntries.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) this.mEntries.get(i2);
            if (f == hwHealthBaseEntry.getX()) {
                while (i2 > 0 && ((HwHealthBaseEntry) this.mEntries.get(i2 - 1)).getX() == f) {
                    i2--;
                }
                size = this.mEntries.size();
                while (i2 < size) {
                    HwHealthBaseEntry hwHealthBaseEntry2 = (HwHealthBaseEntry) this.mEntries.get(i2);
                    if (hwHealthBaseEntry2.getX() != f) {
                        break;
                    }
                    arrayList.add(hwHealthBaseEntry2);
                    i2++;
                }
                break;
            }
            if (f > hwHealthBaseEntry.getX()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        if (i > size) {
            if (i < 0 || i > this.mEntries.size() - 1 || size < 0 || size > this.mEntries.size() - 1) {
                return null;
            }
            if (this.j) {
            }
            d(arrayList, i, size, f);
            return arrayList;
        }
        return arrayList;
    }

    private void d(List<HwHealthBaseEntry> list, int i, int i2, float f) {
        if (njy.e((Collection<?>) this.mEntries, i2) || njy.e((Collection<?>) this.mEntries, i)) {
            LogUtil.j("HwHealthLineDataSet", "mEntries isOutOfBounds  low or high");
            return;
        }
        HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) this.mEntries.get(i2);
        HwHealthBaseEntry hwHealthBaseEntry2 = (HwHealthBaseEntry) this.mEntries.get(i);
        if (Math.abs(hwHealthBaseEntry.getX() - f) <= Math.abs(hwHealthBaseEntry2.getX() - f)) {
            list.add(hwHealthBaseEntry);
        } else {
            list.add(hwHealthBaseEntry2);
        }
    }

    public void a(int i, int i2, boolean z) {
        this.i = z;
        if (z) {
            this.k = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i});
            this.f23730b = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2});
            return;
        }
        this.mFillDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2});
    }

    public boolean h() {
        return this.i;
    }

    public GradientDrawable g() {
        return this.k;
    }

    public GradientDrawable d() {
        return this.f23730b;
    }

    public void j() {
        this.j = true;
    }

    public boolean i() {
        return this.j;
    }

    @Override // com.github.mikephil.charting.data.BaseDataSet
    public void setColor(int i) {
        this.l.d(i);
        super.setColor(i);
    }

    public void d(int i) {
        this.l.d(false);
        this.l.b(i);
    }

    @Override // com.github.mikephil.charting.data.BaseDataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    @Deprecated
    public void setAxisDependency(YAxis.AxisDependency axisDependency) {
        LogUtil.e("HwHealthLineDataSet", "HwHealthLineDataSet setAxisDependency Deprecated");
    }

    @Override // com.github.mikephil.charting.data.BaseDataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    @Deprecated
    public YAxis.AxisDependency getAxisDependency() {
        LogUtil.e("HwHealthLineDataSet", "HwHealthLineDataSet getAxisDependency Deprecated");
        return this.mAxisDependency;
    }

    public void e(int i) {
        this.g = i;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwEntrys.MarkerViewFormatProvider
    public int acquireMarkViewTextDigitalCount() {
        return this.g;
    }

    public void b(LineLinkerFilter lineLinkerFilter) {
        this.f = lineLinkerFilter;
    }

    public boolean e(int i, int i2) {
        return this.f.drawLine(i, i2, this.f23729a);
    }

    public float b() {
        return this.f23729a;
    }

    public boolean f() {
        return this.f23729a != Integer.MAX_VALUE;
    }

    public void c(int i) {
        LogUtil.d("HwHealthLineDataSet", "modifySamplingInterval:", Integer.valueOf(i));
        if (i != this.f23729a) {
            this.d = true;
        }
        this.f23729a = i;
    }

    @Override // com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet
    public void checkIfNeedReload() {
        if (this.d) {
            flushCachedDataContainer();
            this.d = false;
        }
    }

    public float d(boolean z) {
        return this.h.calcuNodeWidthPixel(z);
    }

    public boolean c(boolean z) {
        return this.h.needDrawNodeFill(z);
    }

    public void e(NodeDrawStyle nodeDrawStyle) {
        this.h = nodeDrawStyle;
    }

    public void d(NodeDrawStyle nodeDrawStyle) {
        this.f23731c = nodeDrawStyle;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwEntrys.MarkerViewFormatProvider
    public int acquireColor() {
        return e().a();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwEntrys.MarkerViewFormatProvider
    public String acquireUnit() {
        return e().e();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwEntrys.MarkerViewFormatProvider
    public int acquireMarkViewTextColor() {
        qnl qnlVarE = e();
        if (qnlVarE.i()) {
            return qnlVarE.a();
        }
        return qnlVarE.d();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet
    public void flushCachedDataContainer() {
        IHwHealthLineDatasContainer iHwHealthLineDatasContainer = this.e;
        if (iHwHealthLineDatasContainer != null) {
            iHwHealthLineDatasContainer.reset();
            this.e.load(this);
            this.mIsNeedLoad = false;
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet, com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public IHwHealthDatasContainer cacheDataContainer(HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        HwHealthBaseBarLineChart.HwHealthDataContainerGenerator hwHealthDataContainerGeneratorQueryLineDataContainerGenerator = hwHealthBaseBarLineChart.queryLineDataContainerGenerator();
        if (hwHealthDataContainerGeneratorQueryLineDataContainerGenerator == null) {
            LogUtil.e("HwHealthLineDataSet", "cacheDataContainer not support");
            return null;
        }
        IHwHealthLineDatasContainer iHwHealthLineDatasContainer = this.e;
        if (iHwHealthLineDatasContainer == null || !hwHealthDataContainerGeneratorQueryLineDataContainerGenerator.typeOf(iHwHealthLineDatasContainer.getClass())) {
            IHwHealthLineDatasContainer iHwHealthLineDatasContainer2 = (IHwHealthLineDatasContainer) hwHealthDataContainerGeneratorQueryLineDataContainerGenerator.newDataContainer();
            this.e = iHwHealthLineDatasContainer2;
            iHwHealthLineDatasContainer2.load(this);
            this.mIsNeedLoad = false;
        }
        if (this.mIsNeedLoad) {
            this.e.load(this);
            this.mIsNeedLoad = false;
        }
        return this.e;
    }
}
