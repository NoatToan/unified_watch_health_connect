package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/d;", "Llc/g;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends g<boolean[]> {
    public d() {
        super(true);
    }

    public static boolean[] j(String str) {
        str.getClass();
        return new boolean[]{((Boolean) q0.f111848m.h(str)).booleanValue()};
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        gg.b.J(str);
        throw null;
    }

    @Override // lc.q0
    public final String b() {
        return "boolean[]";
    }

    @Override // lc.q0
    public final Object c(Object obj, String str) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return j(str);
        }
        boolean[] zArrJ = j(str);
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(zArrJ, 0, zArrCopyOf, length, 1);
        return zArrCopyOf;
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object h(String str) {
        return j(str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        str.getClass();
        if (zArr != null) {
            bundle.putBooleanArray(str, zArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // lc.q0
    public final boolean g(Object obj, Object obj2) {
        Boolean[] boolArr;
        boolean[] zArr = (boolean[]) obj;
        boolean[] zArr2 = (boolean[]) obj2;
        Boolean[] boolArr2 = null;
        if (zArr != null) {
            boolArr = new Boolean[zArr.length];
            int length = zArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                boolArr[i14] = Boolean.valueOf(zArr[i14]);
            }
        } else {
            boolArr = null;
        }
        if (zArr2 != null) {
            boolArr2 = new Boolean[zArr2.length];
            int length2 = zArr2.length;
            for (int i15 = 0; i15 < length2; i15++) {
                boolArr2[i15] = Boolean.valueOf(zArr2[i15]);
            }
        }
        return p13.m.b(boolArr, boolArr2);
    }

    @Override // lc.g
    public final boolean[] h() {
        return new boolean[0];
    }

    @Override // lc.g
    public final List i(boolean[] zArr) {
        List<Boolean> listJ0;
        boolean[] zArr2 = zArr;
        if (zArr2 == null || (listJ0 = p13.u.j0(zArr2)) == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listJ0, 10));
        Iterator<T> it = listJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }
}
