package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/l;", "Llc/g;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends g<int[]> {
    public l() {
        super(true);
    }

    public static int[] j(String str) {
        str.getClass();
        return new int[]{((Number) q0.f111838c.h(str)).intValue()};
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        return nd.b.e(bundle, str);
    }

    @Override // lc.q0
    public final String b() {
        return "integer[]";
    }

    @Override // lc.q0
    public final Object c(Object obj, String str) {
        int[] iArr = (int[]) obj;
        return iArr != null ? p13.s.s(iArr, j(str)) : j(str);
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object h(String str) {
        return j(str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        int[] iArr = (int[]) obj;
        str.getClass();
        if (iArr != null) {
            bundle.putIntArray(str, iArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // lc.q0
    public final boolean g(Object obj, Object obj2) {
        Integer[] numArr;
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        Integer[] numArr2 = null;
        if (iArr != null) {
            numArr = new Integer[iArr.length];
            int length = iArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                numArr[i14] = Integer.valueOf(iArr[i14]);
            }
        } else {
            numArr = null;
        }
        if (iArr2 != null) {
            numArr2 = new Integer[iArr2.length];
            int length2 = iArr2.length;
            for (int i15 = 0; i15 < length2; i15++) {
                numArr2[i15] = Integer.valueOf(iArr2[i15]);
            }
        }
        return p13.m.b(numArr, numArr2);
    }

    @Override // lc.g
    public final int[] h() {
        return new int[0];
    }

    @Override // lc.g
    public final List i(int[] iArr) {
        List<Integer> listG0;
        int[] iArr2 = iArr;
        if (iArr2 == null || (listG0 = p13.u.g0(iArr2)) == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listG0, 10));
        Iterator<T> it = listG0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
