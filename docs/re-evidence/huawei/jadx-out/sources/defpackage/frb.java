package defpackage;

import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class frb extends HwHealthLineDataSet {
    private DataInfos e;

    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<HwHealthBaseEntry> getEntriesForXValue(float f) {
        ArrayList arrayList = new ArrayList(16);
        if (this.mEntries == null || this.mEntries.size() == 0) {
            return arrayList;
        }
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
                arrayList.add((HwHealthBaseEntry) this.mEntries.get(0));
                arrayList.add((HwHealthBaseEntry) this.mEntries.get(this.mEntries.size() - 1));
            } else {
                HwHealthBaseEntry hwHealthBaseEntry3 = (HwHealthBaseEntry) this.mEntries.get(size);
                HwHealthBaseEntry hwHealthBaseEntry4 = (HwHealthBaseEntry) this.mEntries.get(i);
                arrayList.add(hwHealthBaseEntry3);
                arrayList.add(hwHealthBaseEntry4);
            }
        }
        return c(f, arrayList);
    }

    private List<HwHealthBaseEntry> c(float f, List<HwHealthBaseEntry> list) {
        ArrayList arrayList = new ArrayList(16);
        if (njy.b(list)) {
            for (HwHealthBaseEntry hwHealthBaseEntry : list) {
                if (c(f, hwHealthBaseEntry)) {
                    arrayList.add(hwHealthBaseEntry);
                }
            }
        }
        return arrayList;
    }

    private boolean c(float f, HwHealthBaseEntry hwHealthBaseEntry) {
        return f >= ((float) h((int) hwHealthBaseEntry.getX())) && f <= ((float) b((int) hwHealthBaseEntry.getX()));
    }

    private int h(int i) {
        return fqz.e(i, this.e);
    }

    private int b(int i) {
        return fqz.a(i, this.e);
    }

    public int a(int i) {
        return (int) ((b(i) + h(i)) / 2.0f);
    }

    public DataInfos a() {
        return this.e;
    }
}
