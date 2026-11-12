package com.huawei.uikit.hwalphaindexerlistview.widget;

import android.widget.SectionIndexer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes43.dex */
public class HwSectionIndexer implements SectionIndexer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f29253c;
    private String[] d;

    public HwSectionIndexer(String[] strArr, int[] iArr, boolean z) {
        if (strArr == null || iArr == null || strArr.length != iArr.length) {
            return;
        }
        int length = strArr.length;
        String[] strArr2 = new String[length];
        this.d = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, length);
        this.f29253c = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String[] strArr3 = this.d;
            String str = strArr3[i2];
            if (str == null) {
                strArr3[i2] = "";
            } else {
                strArr3[i2] = str.trim();
            }
            this.f29253c[i2] = i;
            i += iArr[i2];
        }
        this.f29252b = i;
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        if (i < 0 || i >= this.d.length) {
            return -1;
        }
        return this.f29253c[i];
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        if (i < 0 || i >= this.f29252b) {
            return -1;
        }
        int iBinarySearch = Arrays.binarySearch(this.f29253c, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 2;
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        String[] strArr = this.d;
        if (strArr == null || strArr.length == 0) {
            return new String[0];
        }
        int length = strArr.length;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        return strArr2;
    }

    public HwSectionIndexer(String[] strArr, int[] iArr) {
        this(strArr, iArr, false);
    }
}
