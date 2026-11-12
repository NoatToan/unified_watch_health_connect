package cn.hutool.core.math;

import defpackage.s2h;
import defpackage.tt3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Combination implements Serializable {
    private static final long serialVersionUID = 1;
    private final String[] datas;

    public Combination(String[] strArr) {
        this.datas = strArr;
    }

    public static long count(int i, int i2) {
        if (i2 == 0) {
            return 1L;
        }
        if (i == i2) {
            return s2h.n(i) / s2h.n(i2);
        }
        if (i > i2) {
            return s2h.o(i, i - i2) / s2h.n(i2);
        }
        return 0L;
    }

    public static long countAll(int i) {
        if (i < 0 || i > 63) {
            throw new IllegalArgumentException(tt3.y("countAll must have n >= 0 and n <= 63, but got n={}", Integer.valueOf(i)));
        }
        if (i == 63) {
            return Long.MAX_VALUE;
        }
        return (1 << i) - 1;
    }

    public List<String[]> select(int i) {
        ArrayList arrayList = new ArrayList((int) count(this.datas.length, i));
        select(0, new String[i], 0, arrayList);
        return arrayList;
    }

    public List<String[]> selectAll() {
        ArrayList arrayList = new ArrayList((int) countAll(this.datas.length));
        for (int i = 1; i <= this.datas.length; i++) {
            arrayList.addAll(select(i));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void select(int i, String[] strArr, int i2, List<String[]> list) {
        int length = strArr.length;
        int i3 = i2 + 1;
        if (i3 > length) {
            list.add(Arrays.copyOf(strArr, strArr.length));
            return;
        }
        while (true) {
            String[] strArr2 = this.datas;
            if (i >= (strArr2.length + i3) - length) {
                return;
            }
            strArr[i2] = strArr2[i];
            i++;
            select(i, strArr, i3, list);
        }
    }
}
