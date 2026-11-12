package defpackage;

import android.content.Context;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ukf extends HwHealthLineDataSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataInfos f50288b;

    public ukf(Context context, List<HwHealthBaseEntry> list, String str, String str2, String str3, DataInfos dataInfos) {
        super(context, list, str, str2, str3);
        this.f50288b = dataInfos;
    }

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
        return e(f, arrayList);
    }

    private List<HwHealthBaseEntry> e(float f, List<HwHealthBaseEntry> list) {
        ArrayList arrayList = new ArrayList(16);
        if (njy.b(list)) {
            for (HwHealthBaseEntry hwHealthBaseEntry : list) {
                if (a(f, hwHealthBaseEntry)) {
                    arrayList.add(hwHealthBaseEntry);
                }
            }
        }
        return arrayList;
    }

    private boolean a(float f, HwHealthBaseEntry hwHealthBaseEntry) {
        return f >= ((float) j((int) hwHealthBaseEntry.getX())) && f <= ((float) b((int) hwHealthBaseEntry.getX()));
    }

    private int j(int i) {
        return ukh.c(i, this.f50288b);
    }

    private int b(int i) {
        return ukh.d(i, this.f50288b);
    }

    public int a(int i) {
        return (int) ((b(i) + j(i)) / 2.0f);
    }

    public DataInfos a() {
        return this.f50288b;
    }
}
