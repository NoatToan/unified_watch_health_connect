package cn.hutool.core.math;

import defpackage.qj1;
import defpackage.s2h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Arrangement implements Serializable {
    private static final long serialVersionUID = 1;
    private final String[] datas;

    public Arrangement(String[] strArr) {
        this.datas = strArr;
    }

    public static long count(int i) {
        return count(i, i);
    }

    public static long countAll(int i) {
        long jCount = 0;
        for (int i2 = 1; i2 <= i; i2++) {
            jCount += count(i, i2);
        }
        return jCount;
    }

    public List<String[]> select() {
        return select(this.datas.length);
    }

    public List<String[]> selectAll() {
        ArrayList arrayList = new ArrayList((int) countAll(this.datas.length));
        for (int i = 1; i <= this.datas.length; i++) {
            arrayList.addAll(select(i));
        }
        return arrayList;
    }

    public static long count(int i, int i2) {
        if (i == i2) {
            return s2h.n(i);
        }
        if (i > i2) {
            return s2h.o(i, i - i2);
        }
        return 0L;
    }

    public List<String[]> select(int i) {
        ArrayList arrayList = new ArrayList((int) count(this.datas.length, i));
        select(this.datas, new String[i], 0, arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void select(String[] strArr, String[] strArr2, int i, List<String[]> list) {
        if (i >= strArr2.length) {
            if (list.contains(strArr2)) {
                return;
            }
            list.add(Arrays.copyOf(strArr2, strArr2.length));
        } else {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr2[i] = strArr[i2];
                select((String[]) qj1.L(strArr, i2), strArr2, i + 1, list);
            }
        }
    }
}
