package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/o;", "Llc/g;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends g<long[]> {
    public o() {
        super(true);
    }

    public static long[] j(String str) {
        str.getClass();
        return new long[]{((Number) q0.f111842g.h(str)).longValue()};
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        gg.b.J(str);
        throw null;
    }

    @Override // lc.q0
    public final String b() {
        return "long[]";
    }

    @Override // lc.q0
    public final Object c(Object obj, String str) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return j(str);
        }
        long[] jArrJ = j(str);
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(jArrJ, 0, jArrCopyOf, length, 1);
        return jArrCopyOf;
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object h(String str) {
        return j(str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        long[] jArr = (long[]) obj;
        str.getClass();
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // lc.q0
    public final boolean g(Object obj, Object obj2) {
        Long[] lArr;
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        Long[] lArr2 = null;
        if (jArr != null) {
            lArr = new Long[jArr.length];
            int length = jArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                lArr[i14] = Long.valueOf(jArr[i14]);
            }
        } else {
            lArr = null;
        }
        if (jArr2 != null) {
            lArr2 = new Long[jArr2.length];
            int length2 = jArr2.length;
            for (int i15 = 0; i15 < length2; i15++) {
                lArr2[i15] = Long.valueOf(jArr2[i15]);
            }
        }
        return p13.m.b(lArr, lArr2);
    }

    @Override // lc.g
    public final long[] h() {
        return new long[0];
    }

    @Override // lc.g
    public final List i(long[] jArr) {
        List<Long> listH0;
        long[] jArr2 = jArr;
        if (jArr2 == null || (listH0 = p13.u.h0(jArr2)) == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listH0, 10));
        Iterator<T> it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }
}
