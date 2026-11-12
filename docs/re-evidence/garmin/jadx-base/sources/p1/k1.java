package p1;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lp1/k1;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Lp1/k1;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class k1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f134759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f134760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134761c;

    public k1(int i14) {
        this.f134759a = i14 == 0 ? q1.a.f142054a : new int[i14];
        this.f134760b = i14 == 0 ? q1.a.f142056c : new Object[i14 << 1];
    }

    public final int a(V v14) {
        int i14 = this.f134761c * 2;
        Object[] objArr = this.f134760b;
        if (v14 == null) {
            for (int i15 = 1; i15 < i14; i15 += 2) {
                if (objArr[i15] == null) {
                    return i15 >> 1;
                }
            }
            return -1;
        }
        for (int i16 = 1; i16 < i14; i16 += 2) {
            if (v14.equals(objArr[i16])) {
                return i16 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i14) {
        int i15 = this.f134761c;
        int[] iArr = this.f134759a;
        if (iArr.length < i14) {
            this.f134759a = Arrays.copyOf(iArr, i14);
            this.f134760b = Arrays.copyOf(this.f134760b, i14 * 2);
        }
        if (this.f134761c == i15) {
            return;
        }
        org.apache.commons.lang3.e.h();
    }

    public final int c(int i14, Object obj) {
        int i15 = this.f134761c;
        if (i15 == 0) {
            return -1;
        }
        int iA = q1.a.a(i15, i14, this.f134759a);
        if (iA < 0 || p005kotlin.jvm.internal.s.g(obj, this.f134760b[iA << 1])) {
            return iA;
        }
        int i16 = iA + 1;
        while (i16 < i15 && this.f134759a[i16] == i14) {
            if (p005kotlin.jvm.internal.s.g(obj, this.f134760b[i16 << 1])) {
                return i16;
            }
            i16++;
        }
        for (int i17 = iA - 1; i17 >= 0 && this.f134759a[i17] == i14; i17--) {
            if (p005kotlin.jvm.internal.s.g(obj, this.f134760b[i17 << 1])) {
                return i17;
            }
        }
        return ~i16;
    }

    public void clear() {
        if (this.f134761c > 0) {
            this.f134759a = q1.a.f142054a;
            this.f134760b = q1.a.f142056c;
            this.f134761c = 0;
        }
        if (this.f134761c <= 0) {
            return;
        }
        org.apache.commons.lang3.e.h();
    }

    public boolean containsKey(K k14) {
        return d(k14) >= 0;
    }

    public boolean containsValue(V v14) {
        return a(v14) >= 0;
    }

    public final int d(K k14) {
        return k14 == null ? e() : c(k14.hashCode(), k14);
    }

    public final int e() {
        int i14 = this.f134761c;
        if (i14 == 0) {
            return -1;
        }
        int iA = q1.a.a(i14, 0, this.f134759a);
        if (iA < 0 || this.f134760b[iA << 1] == null) {
            return iA;
        }
        int i15 = iA + 1;
        while (i15 < i14 && this.f134759a[i15] == 0) {
            if (this.f134760b[i15 << 1] == null) {
                return i15;
            }
            i15++;
        }
        for (int i16 = iA - 1; i16 >= 0 && this.f134759a[i16] == 0; i16--) {
            if (this.f134760b[i16 << 1] == null) {
                return i16;
            }
        }
        return ~i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k1) {
                int i14 = this.f134761c;
                if (i14 != ((k1) obj).f134761c) {
                    return false;
                }
                k1 k1Var = (k1) obj;
                for (int i15 = 0; i15 < i14; i15++) {
                    K kG = g(i15);
                    V vK = k(i15);
                    Object obj2 = k1Var.get(kG);
                    if (vK == null) {
                        if (obj2 != null || !k1Var.containsKey(kG)) {
                            return false;
                        }
                    } else if (!vK.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f134761c != ((Map) obj).size()) {
                return false;
            }
            int i16 = this.f134761c;
            for (int i17 = 0; i17 < i16; i17++) {
                K kG2 = g(i17);
                V vK2 = k(i17);
                Object obj3 = ((Map) obj).get(kG2);
                if (vK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kG2)) {
                        return false;
                    }
                } else if (!vK2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final K g(int i14) {
        boolean z14 = false;
        if (i14 >= 0 && i14 < this.f134761c) {
            z14 = true;
        }
        if (z14) {
            return (K) this.f134760b[i14 << 1];
        }
        vb.h.s(am.j.h(i14, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public V get(K k14) {
        int iD = d(k14);
        if (iD >= 0) {
            return (V) this.f134760b[(iD << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v14) {
        int iD = d(obj);
        return iD >= 0 ? (V) this.f134760b[(iD << 1) + 1] : v14;
    }

    public void h(k1<? extends K, ? extends V> k1Var) {
        k1Var.getClass();
        int i14 = k1Var.f134761c;
        b(this.f134761c + i14);
        if (this.f134761c != 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                put(k1Var.g(i15), k1Var.k(i15));
            }
        } else if (i14 > 0) {
            p13.s.d(0, 0, i14, k1Var.f134759a, this.f134759a);
            p13.s.h(k1Var.f134760b, this.f134760b, 0, 0, i14 << 1);
            this.f134761c = i14;
        }
    }

    public int hashCode() {
        int[] iArr = this.f134759a;
        Object[] objArr = this.f134760b;
        int i14 = this.f134761c;
        int i15 = 1;
        int i16 = 0;
        int iHashCode = 0;
        while (i16 < i14) {
            Object obj = objArr[i15];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i16];
            i16++;
            i15 += 2;
        }
        return iHashCode;
    }

    public V i(int i14) {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.f134761c)) {
            vb.h.s(am.j.h(i14, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.f134760b;
        int i16 = i14 << 1;
        V v14 = (V) objArr[i16 + 1];
        if (i15 <= 1) {
            clear();
            return v14;
        }
        int i17 = i15 - 1;
        int[] iArr = this.f134759a;
        if (iArr.length <= 8 || i15 >= iArr.length / 3) {
            if (i14 < i17) {
                int i18 = i14 + 1;
                p13.s.d(i14, i18, i15, iArr, iArr);
                Object[] objArr2 = this.f134760b;
                p13.s.h(objArr2, objArr2, i16, i18 << 1, i15 << 1);
            }
            Object[] objArr3 = this.f134760b;
            int i19 = i17 << 1;
            objArr3[i19] = null;
            objArr3[i19 + 1] = null;
        } else {
            int i24 = i15 > 8 ? i15 + (i15 >> 1) : 8;
            this.f134759a = Arrays.copyOf(iArr, i24);
            this.f134760b = Arrays.copyOf(this.f134760b, i24 << 1);
            if (i15 != this.f134761c) {
                org.apache.commons.lang3.e.h();
                return null;
            }
            if (i14 > 0) {
                p13.s.d(0, 0, i14, iArr, this.f134759a);
                p13.s.h(objArr, this.f134760b, 0, 0, i16);
            }
            if (i14 < i17) {
                int i25 = i14 + 1;
                p13.s.d(i14, i25, i15, iArr, this.f134759a);
                p13.s.h(objArr, this.f134760b, i16, i25 << 1, i15 << 1);
            }
        }
        if (i15 == this.f134761c) {
            this.f134761c = i17;
            return v14;
        }
        org.apache.commons.lang3.e.h();
        return null;
    }

    public final boolean isEmpty() {
        return this.f134761c <= 0;
    }

    public V j(int i14, V v14) {
        boolean z14 = false;
        if (i14 >= 0 && i14 < this.f134761c) {
            z14 = true;
        }
        if (!z14) {
            vb.h.s(am.j.h(i14, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i15 = (i14 << 1) + 1;
        Object[] objArr = this.f134760b;
        V v15 = (V) objArr[i15];
        objArr[i15] = v14;
        return v15;
    }

    public final V k(int i14) {
        boolean z14 = false;
        if (i14 >= 0 && i14 < this.f134761c) {
            z14 = true;
        }
        if (z14) {
            return (V) this.f134760b[(i14 << 1) + 1];
        }
        vb.h.s(am.j.h(i14, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public V put(K k14, V v14) {
        int i14 = this.f134761c;
        int iHashCode = k14 != null ? k14.hashCode() : 0;
        int iC = k14 != null ? c(iHashCode, k14) : e();
        if (iC >= 0) {
            int i15 = (iC << 1) + 1;
            Object[] objArr = this.f134760b;
            V v15 = (V) objArr[i15];
            objArr[i15] = v14;
            return v15;
        }
        int i16 = ~iC;
        int[] iArr = this.f134759a;
        if (i14 >= iArr.length) {
            int i17 = 8;
            if (i14 >= 8) {
                i17 = (i14 >> 1) + i14;
            } else if (i14 < 4) {
                i17 = 4;
            }
            this.f134759a = Arrays.copyOf(iArr, i17);
            this.f134760b = Arrays.copyOf(this.f134760b, i17 << 1);
            if (i14 != this.f134761c) {
                org.apache.commons.lang3.e.h();
                return null;
            }
        }
        if (i16 < i14) {
            int[] iArr2 = this.f134759a;
            int i18 = i16 + 1;
            p13.s.d(i18, i16, i14, iArr2, iArr2);
            Object[] objArr2 = this.f134760b;
            p13.s.h(objArr2, objArr2, i18 << 1, i16 << 1, this.f134761c << 1);
        }
        int i19 = this.f134761c;
        if (i14 == i19) {
            int[] iArr3 = this.f134759a;
            if (i16 < iArr3.length) {
                iArr3[i16] = iHashCode;
                Object[] objArr3 = this.f134760b;
                int i24 = i16 << 1;
                objArr3[i24] = k14;
                objArr3[i24 + 1] = v14;
                this.f134761c = i19 + 1;
                return null;
            }
        }
        org.apache.commons.lang3.e.h();
        return null;
    }

    public final V putIfAbsent(K k14, V v14) {
        V v15 = get(k14);
        return v15 == null ? put(k14, v14) : v15;
    }

    public final boolean remove(K k14, V v14) {
        int iD = d(k14);
        if (iD < 0 || !p005kotlin.jvm.internal.s.g(v14, k(iD))) {
            return false;
        }
        i(iD);
        return true;
    }

    public final boolean replace(K k14, V v14, V v15) {
        int iD = d(k14);
        if (iD < 0 || !p005kotlin.jvm.internal.s.g(v14, k(iD))) {
            return false;
        }
        j(iD, v15);
        return true;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public final int getF134761c() {
        return this.f134761c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f134761c * 28);
        sb3.append(CoreConstants.CURLY_LEFT);
        int i14 = this.f134761c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 > 0) {
                sb3.append(", ");
            }
            K kG = g(i15);
            if (kG != sb3) {
                sb3.append(kG);
            } else {
                sb3.append("(this Map)");
            }
            sb3.append('=');
            V vK = k(i15);
            if (vK != sb3) {
                sb3.append(vK);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    public V remove(K k14) {
        int iD = d(k14);
        if (iD >= 0) {
            return i(iD);
        }
        return null;
    }

    public final V replace(K k14, V v14) {
        int iD = d(k14);
        if (iD >= 0) {
            return j(iD, v14);
        }
        return null;
    }

    public k1() {
        this(0, 1, null);
    }

    public /* synthetic */ k1(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    public k1(k1<? extends K, ? extends V> k1Var) {
        this(0, 1, null);
        if (k1Var != null) {
            h(k1Var);
        }
    }
}
