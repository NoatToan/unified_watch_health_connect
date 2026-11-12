package defpackage;

import com.github.mikephil.charting.data.Entry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fqi extends qob {
    private List<qod> d;
    private List<qod> h;
    private List<qod> j;

    public fqi(HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(hwHealthBaseBarLineChart);
        this.h = new ArrayList();
        this.j = new ArrayList();
        this.d = new ArrayList();
    }

    @Override // defpackage.qob, com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public void load(HwHealthLineDataSet hwHealthLineDataSet) {
        Entry entryForIndex;
        this.f46544a.c(this.e, hwHealthLineDataSet);
        this.f46545b = hwHealthLineDataSet;
        d();
        if (this.f46544a.a() - 1 >= 0 && this.f46544a.a() - 1 < hwHealthLineDataSet.getEntryCount()) {
            a(hwHealthLineDataSet.getEntryForIndex(this.f46544a.a() - 1));
        }
        for (int iA = this.f46544a.a(); this.f46544a.c() != 0 && iA < this.f46544a.c() + this.f46544a.a(); iA++) {
            a(hwHealthLineDataSet.getEntryForIndex(iA));
        }
        if (this.f46544a.d() >= 0 && this.f46544a.d() < hwHealthLineDataSet.getEntryCount() && (entryForIndex = hwHealthLineDataSet.getEntryForIndex(this.f46544a.d())) != null) {
            a(entryForIndex);
        }
        b(this.h);
        b(hwHealthLineDataSet, this.h);
    }

    private void b(List<qod> list) {
        this.d.clear();
        for (qod qodVar : list) {
            float fC = qodVar.c();
            float f = fC % 30.0f;
            int i = (int) (fC - f);
            int i2 = (int) ((fC + 30.0f) - f);
            if (qodVar.b() != 0.0f) {
                this.d.add(qodVar);
            } else {
                Iterator<qod> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        qod next = it.next();
                        float fC2 = next.c();
                        if (fC2 >= i && fC2 <= i2 && next.b() != 0.0f) {
                            break;
                        }
                    } else {
                        this.d.add(qodVar);
                        break;
                    }
                }
            }
        }
    }

    @Override // defpackage.qob
    protected void b(HwHealthLineDataSet hwHealthLineDataSet, List<qod> list) {
        if (njy.b(list)) {
            Iterator<qod> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().e() == null) {
                    it.remove();
                }
            }
            Iterator<qod> it2 = list.iterator();
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MAX_VALUE;
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next().e()).intValue();
                if (iIntValue > i) {
                    i = iIntValue;
                }
                if (iIntValue < i2) {
                    i2 = iIntValue;
                }
            }
            int iD = d(i2);
            float fC = (c(i) - iD) / 20.5f;
            float f = iD;
            for (qod qodVar : list) {
                qodVar.a((((Integer) qodVar.e()).intValue() - (f - (80.5f * fC))) / fC);
            }
        }
        if (this.e.getRenderer() instanceof fqj) {
            d(((fqj) this.e.getRenderer()).f34408a == DataInfos.BloodOxygenAltitudeDayHorizontal, hwHealthLineDataSet, list);
        }
    }

    @Override // defpackage.qob, com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public List<qod> queryNewNodes() {
        return this.h;
    }

    @Override // defpackage.qob, com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public List<HwHealthBaseEntry> searchEntryForXValue(float f) {
        if (!(this.e.getRenderer() instanceof fqj)) {
            return b(this.f46546c, f);
        }
        return b(this.d, f);
    }

    public List<HwHealthBaseEntry> b(float f) {
        List<HwHealthBaseEntry> listB = b(this.f46546c, f);
        if (njy.b(listB)) {
            return Math.abs(listB.get(0).getX() - f) >= 1.0f ? new ArrayList() : listB;
        }
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<HwHealthBaseEntry> a(float f) {
        ArrayList arrayList = new ArrayList();
        float f2 = f % 30.0f;
        int i = (int) (f - f2);
        int i2 = (int) ((30.0f + f) - f2);
        HwHealthBaseEntry hwHealthBaseEntry = null;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < this.f46545b.getEntryCount(); i4++) {
            HwHealthBaseEntry hwHealthBaseEntry2 = (HwHealthBaseEntry) this.f46545b.getEntryForIndex(i4);
            if (hwHealthBaseEntry2.getX() >= i && hwHealthBaseEntry2.getX() <= i2) {
                int iAbs = (int) Math.abs(f - hwHealthBaseEntry2.getX());
                if ((hwHealthBaseEntry2.getData() instanceof fqt) && ((fqt) hwHealthBaseEntry2.getData()).b() != Integer.MAX_VALUE && iAbs < i3) {
                    hwHealthBaseEntry = hwHealthBaseEntry2;
                    i3 = iAbs;
                }
            }
        }
        if (hwHealthBaseEntry != null) {
            arrayList.add(hwHealthBaseEntry);
        }
        return arrayList;
    }

    private void d() {
        this.f46546c.clear();
        this.h.clear();
        this.j.clear();
    }

    private void a(Entry entry) {
        if (entry.getData() instanceof fqt) {
            int iB = ((fqt) entry.getData()).b();
            qod qodVar = new qod(entry);
            if (iB != Integer.MAX_VALUE) {
                qodVar.c(Integer.valueOf(iB));
            } else {
                this.j.add(qodVar);
            }
            this.f46546c.add(qodVar);
            this.h.add(qodVar);
        }
    }

    private int c(int i) {
        int i2 = i % 50;
        int i3 = i + 50;
        return i2 == 0 ? i3 : i3 - i2;
    }

    private int d(int i) {
        int i2 = i % 50;
        return i2 == 0 ? i - 50 : i - i2;
    }

    private void d(boolean z, HwHealthLineDataSet hwHealthLineDataSet, List<qod> list) {
        int i = z ? 20 : 24;
        int i2 = 0;
        while (i2 < list.size()) {
            int i3 = i2 - 1;
            qod qodVar = null;
            qod qodVar2 = (i3 < 0 || i3 >= list.size()) ? null : list.get(i3);
            int i4 = i2 + 1;
            if (i4 >= 0 && i4 < list.size()) {
                qodVar = list.get(i4);
            }
            qod qodVar3 = list.get(i2);
            if (qodVar2 != null && qodVar3 != null && Math.abs(qodVar2.c() - qodVar3.c()) <= i) {
                qodVar3.e(hwHealthLineDataSet.e((int) qodVar2.c(), (int) qodVar3.c()));
            }
            if (qodVar != null && qodVar3 != null && Math.abs(qodVar.c() - qodVar3.c()) <= i) {
                qodVar3.b(hwHealthLineDataSet.e((int) qodVar3.c(), (int) qodVar.c()));
            }
            i2 = i4;
        }
    }
}
