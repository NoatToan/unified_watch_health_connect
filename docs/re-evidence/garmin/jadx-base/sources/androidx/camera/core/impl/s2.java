package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5751a;

    public s2(t2... t2VarArr) {
        ArrayList arrayList = new ArrayList();
        this.f5751a = arrayList;
        Collections.addAll(arrayList, t2VarArr);
    }

    public static void b(ArrayList arrayList, int i14, int[] iArr, int i15) {
        if (i15 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            int i17 = 0;
            while (true) {
                if (i17 >= i15) {
                    iArr[i15] = i16;
                    b(arrayList, i14, iArr, i15 + 1);
                    break;
                } else if (i16 == iArr[i17]) {
                    break;
                } else {
                    i17++;
                }
            }
        }
    }

    public final void a(t2 t2Var) {
        this.f5751a.add(t2Var);
    }

    public final List<t2> c(List<t2> list) {
        r2 r2Var;
        r2 r2Var2;
        r2 r2Var3;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f5751a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList<int[]> arrayList2 = new ArrayList();
        boolean z14 = false;
        b(arrayList2, size2, new int[size2], 0);
        t2[] t2VarArr = new t2[list.size()];
        for (int[] iArr : arrayList2) {
            boolean z15 = true;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                if (iArr[i14] < list.size()) {
                    t2 t2Var = (t2) arrayList.get(i14);
                    t2 t2Var2 = list.get(iArr[i14]);
                    t2Var.getClass();
                    t2Var2.getClass();
                    z15 &= t2Var2.f5764b.f5783a <= t2Var.f5764b.f5783a && t2Var2.f5763a == t2Var.f5763a && ((r2Var = t2Var.f5765c) == (r2Var2 = r2.DEFAULT) || (r2Var3 = t2Var2.f5765c) == r2Var2 || r2Var3 == r2Var);
                    if (!z15) {
                        break;
                    }
                    t2VarArr[iArr[i14]] = (t2) arrayList.get(i14);
                }
            }
            if (z15) {
                z14 = true;
                break;
            }
        }
        if (z14) {
            return Arrays.asList(t2VarArr);
        }
        return null;
    }

    public s2() {
        this.f5751a = new ArrayList();
    }
}
