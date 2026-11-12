package com.sogou.map.loc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
final class v0 {
    private final Map a = new HashMap();
    private final Set b = new HashSet();

    private void a(String str, int[] iArr) {
        List arrayList = (List) this.a.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.a.put(str, arrayList);
        }
        arrayList.add(iArr);
    }

    public final void b(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int i = iArr[0];
        if (i == 1) {
            if (iArr.length != 7 || iArr[5] == Integer.MAX_VALUE || iArr[6] == Integer.MAX_VALUE) {
                return;
            }
            int i2 = iArr[5];
            int i3 = iArr[6];
            if (this.b.contains(String.valueOf(i2) + "_" + i3)) {
                return;
            }
            this.b.add(String.valueOf(i2) + "_" + i3);
            this.b.add(String.valueOf(i3) + "_" + i2);
            a("1_" + iArr[3] + "_" + iArr[4], iArr);
            return;
        }
        if (i == 2) {
            if (iArr.length != 6 || iArr[5] == Integer.MAX_VALUE || iArr[5] == 0) {
                return;
            }
            String str = "psc_" + iArr[5];
            if (this.b.contains(str)) {
                return;
            }
            this.b.add(str);
            a("2_" + iArr[3] + "_" + iArr[4], iArr);
            return;
        }
        if (i == 3) {
            if (iArr.length != 6) {
                return;
            }
            String str2 = String.valueOf(iArr[3]) + "_" + iArr[4] + "_" + iArr[5];
            if (this.b.contains(str2)) {
                return;
            }
            this.b.add(str2);
            a("3_", iArr);
            return;
        }
        if (i != 4) {
            if (i == 5 && iArr.length == 6 && iArr[5] != Integer.MAX_VALUE && iArr[5] != 0) {
                String str3 = "psc_" + iArr[5];
                if (this.b.contains(str3)) {
                    return;
                }
                this.b.add(str3);
                a("5_" + iArr[3] + "_" + iArr[4], iArr);
                return;
            }
            return;
        }
        if (iArr.length != 7 || iArr[5] == Integer.MAX_VALUE || iArr[6] == Integer.MAX_VALUE) {
            return;
        }
        int i4 = iArr[5];
        int i5 = iArr[6];
        if (this.b.contains(String.valueOf(i4) + "_" + i5)) {
            return;
        }
        this.b.add(String.valueOf(i4) + "_" + i5);
        this.b.add(String.valueOf(i5) + "_" + i4);
        a("4_" + iArr[3] + "_" + iArr[4], iArr);
    }

    public final boolean c() {
        return this.a.size() == 0;
    }

    public final Collection d() {
        return this.a.values();
    }
}
