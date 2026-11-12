package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qtj extends HwHealthLineDataSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f46803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f46804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f46805c;
    private boolean d;
    private List<Integer> e;

    public qtj(Context context, List<HwHealthBaseEntry> list, String str, String str2, String str3, int i) {
        super(context, list, str, str2, str3, i);
        this.d = false;
        this.e = new ArrayList();
    }

    @Override // com.github.mikephil.charting.data.BaseDataSet
    public void setColors(int[] iArr) {
        this.f46804b = iArr;
        this.d = true;
        if (iArr != null) {
            this.e = new ArrayList(iArr.length);
            for (int i : iArr) {
                this.e.add(Integer.valueOf(i));
            }
        }
        notifyDataSetChanged();
    }

    @Override // com.github.mikephil.charting.data.BaseDataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<Integer> getColors() {
        List<Integer> list;
        if (this.d && (list = this.e) != null && !list.isEmpty()) {
            return this.e;
        }
        return super.getColors();
    }

    @Override // com.github.mikephil.charting.data.BaseDataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor(int i) {
        int[] iArr;
        if (this.d && (iArr = this.f46804b) != null && i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        return super.getColor(i);
    }

    public void a(int[] iArr, int[] iArr2, boolean z) {
        this.f46803a = iArr;
        this.f46805c = iArr2;
        super.a((iArr == null || iArr.length <= 0) ? Color.argb(128, 29, 204, 205) : iArr[0], (iArr2 == null || iArr2.length <= 0) ? Color.argb(0, 29, 204, 205) : iArr2[0], z);
    }

    public int[] m() {
        return this.f46804b;
    }

    public int[] n() {
        return this.f46803a;
    }

    public int[] a() {
        return this.f46805c;
    }
}
