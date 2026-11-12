package q13;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\u0014\u0015\u0016\u0017\u0018\u0019BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u001a"}, d2 = {"Lq13/c;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "a", "d", JWKParameterNames.RSA_EXPONENT, "f", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c<K, V> implements Map<K, V>, Serializable, f23.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f142119n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f142120o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K[] f142121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f142122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f142123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f142124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f142125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f142126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f142127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f142128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f142129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q13.e<K> f142130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q13.f<V> f142131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q13.d<K, V> f142132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f142133m;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq13/c$b;", "K", "V", "Lq13/c$d;", "", "", "Lq13/c;", "map", "<init>", "(Lq13/c;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, f23.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c<K, V> cVar) {
            super(cVar);
            cVar.getClass();
        }

        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i14 = this.f142138b;
            c<K, V> cVar = this.f142137a;
            if (i14 >= cVar.f142126f) {
                t.g();
                return null;
            }
            this.f142138b = i14 + 1;
            this.f142139c = i14;
            C2670c c2670c = new C2670c(cVar, i14);
            b();
            return c2670c;
        }
    }

    /* JADX INFO: renamed from: q13.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq13/c$c;", "K", "V", "", "Lq13/c;", "map", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Lq13/c;I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2670c<K, V> implements Map.Entry<K, V>, f23.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<K, V> f142134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f142135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f142136c;

        public C2670c(c<K, V> cVar, int i14) {
            cVar.getClass();
            this.f142134a = cVar;
            this.f142135b = i14;
            this.f142136c = cVar.f142128h;
        }

        public final void a() {
            if (this.f142134a.f142128h != this.f142136c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return s.g(entry.getKey(), getKey()) && s.g(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            a();
            return this.f142134a.f142121a[this.f142135b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            a();
            V[] vArr = this.f142134a.f142122b;
            vArr.getClass();
            return vArr[this.f142135b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v14) {
            a();
            c<K, V> cVar = this.f142134a;
            cVar.c();
            V[] vArr = cVar.f142122b;
            if (vArr == null) {
                int length = cVar.f142121a.length;
                if (length < 0) {
                    h.s("capacity must be non-negative.");
                    return null;
                }
                vArr = (V[]) new Object[length];
                cVar.f142122b = vArr;
            }
            int i14 = this.f142135b;
            V v15 = vArr[i14];
            vArr[i14] = v14;
            return v15;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getKey());
            sb3.append('=');
            sb3.append(getValue());
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq13/c$d;", "K", "V", "", "Lq13/c;", "map", "<init>", "(Lq13/c;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<K, V> f142137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f142139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f142140d;

        public d(c<K, V> cVar) {
            cVar.getClass();
            this.f142137a = cVar;
            this.f142139c = -1;
            this.f142140d = cVar.f142128h;
            b();
        }

        public final void a() {
            if (this.f142137a.f142128h == this.f142140d) {
                return;
            }
            org.apache.commons.lang3.e.h();
        }

        public final void b() {
            while (true) {
                int i14 = this.f142138b;
                c<K, V> cVar = this.f142137a;
                if (i14 >= cVar.f142126f || cVar.f142123c[i14] >= 0) {
                    return;
                } else {
                    this.f142138b = i14 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f142138b < this.f142137a.f142126f;
        }

        public final void remove() {
            a();
            if (this.f142139c == -1) {
                h.z("Call next() before removing element from the iterator.");
                return;
            }
            c<K, V> cVar = this.f142137a;
            cVar.c();
            cVar.m(this.f142139c);
            this.f142139c = -1;
            this.f142140d = cVar.f142128h;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq13/c$e;", "K", "V", "Lq13/c$d;", "", "Lq13/c;", "map", "<init>", "(Lq13/c;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, f23.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c<K, V> cVar) {
            super(cVar);
            cVar.getClass();
        }

        @Override // java.util.Iterator
        public final K next() {
            a();
            int i14 = this.f142138b;
            c<K, V> cVar = this.f142137a;
            if (i14 >= cVar.f142126f) {
                t.g();
                return null;
            }
            this.f142138b = i14 + 1;
            this.f142139c = i14;
            K k14 = cVar.f142121a[i14];
            b();
            return k14;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq13/c$f;", "K", "V", "Lq13/c$d;", "", "Lq13/c;", "map", "<init>", "(Lq13/c;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, f23.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c<K, V> cVar) {
            super(cVar);
            cVar.getClass();
        }

        @Override // java.util.Iterator
        public final V next() {
            a();
            int i14 = this.f142138b;
            c<K, V> cVar = this.f142137a;
            if (i14 >= cVar.f142126f) {
                t.g();
                return null;
            }
            this.f142138b = i14 + 1;
            this.f142139c = i14;
            V[] vArr = cVar.f142122b;
            vArr.getClass();
            V v14 = vArr[this.f142139c];
            b();
            return v14;
        }
    }

    static {
        c cVar = new c(0);
        cVar.f142133m = true;
        f142120o = cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i14) {
        if (i14 < 0) {
            h.s("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i14];
        int[] iArr = new int[i14];
        f142119n.getClass();
        this(objArr, null, iArr, new int[Integer.highestOneBit((i14 < 1 ? 1 : i14) * 3)], 2, 0);
    }

    public final int a(K k14) {
        c();
        while (true) {
            int iK = k(k14);
            int i14 = this.f142125e * 2;
            int length = this.f142124d.length / 2;
            if (i14 > length) {
                i14 = length;
            }
            int i15 = 0;
            while (true) {
                int[] iArr = this.f142124d;
                int i16 = iArr[iK];
                if (i16 == 0) {
                    int i17 = this.f142126f;
                    K[] kArr = this.f142121a;
                    if (i17 >= kArr.length) {
                        g(1);
                        break;
                    }
                    int i18 = i17 + 1;
                    this.f142126f = i18;
                    kArr[i17] = k14;
                    this.f142123c[i17] = iK;
                    iArr[iK] = i18;
                    this.f142129i++;
                    this.f142128h++;
                    if (i15 > this.f142125e) {
                        this.f142125e = i15;
                    }
                    return i17;
                }
                if (s.g(this.f142121a[i16 - 1], k14)) {
                    return -i16;
                }
                i15++;
                if (i15 > i14) {
                    l(this.f142124d.length * 2);
                    break;
                }
                iK = iK == 0 ? this.f142124d.length - 1 : iK - 1;
            }
        }
    }

    public final c b() {
        c();
        this.f142133m = true;
        if (this.f142129i > 0) {
            return this;
        }
        c cVar = f142120o;
        cVar.getClass();
        return cVar;
    }

    public final void c() {
        if (this.f142133m) {
            com.google.protobuf.a.m();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i14 = this.f142126f - 1;
        if (i14 >= 0) {
            int i15 = 0;
            while (true) {
                int[] iArr = this.f142123c;
                int i16 = iArr[i15];
                if (i16 >= 0) {
                    this.f142124d[i16] = 0;
                    iArr[i15] = -1;
                }
                if (i15 == i14) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        oi0.c.U(0, this.f142126f, this.f142121a);
        V[] vArr = this.f142122b;
        if (vArr != null) {
            oi0.c.U(0, this.f142126f, vArr);
        }
        this.f142129i = 0;
        this.f142126f = 0;
        this.f142128h++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z14) {
        int i14;
        V[] vArr = this.f142122b;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i14 = this.f142126f;
            if (i15 >= i14) {
                break;
            }
            int[] iArr = this.f142123c;
            int i17 = iArr[i15];
            if (i17 >= 0) {
                K[] kArr = this.f142121a;
                kArr[i16] = kArr[i15];
                if (vArr != null) {
                    vArr[i16] = vArr[i15];
                }
                if (z14) {
                    iArr[i16] = i17;
                    this.f142124d[i17] = i16 + 1;
                }
                i16++;
            }
            i15++;
        }
        oi0.c.U(i16, i14, this.f142121a);
        if (vArr != null) {
            oi0.c.U(i16, this.f142126f, vArr);
        }
        this.f142126f = i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(Collection<?> collection) {
        boolean zG;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iH = h(entry.getKey());
                    if (iH < 0) {
                        zG = false;
                    } else {
                        V[] vArr = this.f142122b;
                        vArr.getClass();
                        zG = s.g(vArr[iH], entry.getValue());
                    }
                    if (!zG) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        q13.d<K, V> dVar = this.f142132l;
        if (dVar != null) {
            return dVar;
        }
        q13.d<K, V> dVar2 = new q13.d<>(this);
        this.f142132l = dVar2;
        return dVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f142129i == map.size() && e(map.entrySet());
    }

    public final void g(int i14) {
        K[] kArr = this.f142121a;
        int length = kArr.length;
        int i15 = this.f142126f;
        int i16 = length - i15;
        int i17 = i15 - this.f142129i;
        if (i16 < i14 && i16 + i17 >= i14 && i17 >= kArr.length / 4) {
            d(true);
            return;
        }
        int i18 = i15 + i14;
        if (i18 < 0) {
            com.google.protobuf.a.b();
            return;
        }
        if (i18 > kArr.length) {
            p13.c.a aVar = p13.c.f134916a;
            int length2 = kArr.length;
            aVar.getClass();
            int iE = p13.c.a.e(length2, i18);
            K[] kArr2 = this.f142121a;
            kArr2.getClass();
            this.f142121a = (K[]) Arrays.copyOf(kArr2, iE);
            V[] vArr = this.f142122b;
            this.f142122b = vArr != null ? (V[]) Arrays.copyOf(vArr, iE) : null;
            this.f142123c = Arrays.copyOf(this.f142123c, iE);
            f142119n.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.f142124d.length) {
                l(iHighestOneBit);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        V[] vArr = this.f142122b;
        vArr.getClass();
        return vArr[iH];
    }

    public final int h(K k14) {
        int iK = k(k14);
        int i14 = this.f142125e;
        while (true) {
            int i15 = this.f142124d[iK];
            if (i15 == 0) {
                return -1;
            }
            int i16 = i15 - 1;
            if (s.g(this.f142121a[i16], k14)) {
                return i16;
            }
            i14--;
            if (i14 < 0) {
                return -1;
            }
            iK = iK == 0 ? this.f142124d.length - 1 : iK - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i14 = 0;
        while (bVar.hasNext()) {
            int i15 = bVar.f142138b;
            c<K, V> cVar = bVar.f142137a;
            if (i15 >= cVar.f142126f) {
                t.g();
                return 0;
            }
            bVar.f142138b = i15 + 1;
            bVar.f142139c = i15;
            K k14 = cVar.f142121a[i15];
            int iHashCode = k14 != null ? k14.hashCode() : 0;
            V[] vArr = cVar.f142122b;
            vArr.getClass();
            V v14 = vArr[bVar.f142139c];
            int iHashCode2 = v14 != null ? v14.hashCode() : 0;
            bVar.b();
            i14 += iHashCode ^ iHashCode2;
        }
        return i14;
    }

    public final int i(V v14) {
        int i14 = this.f142126f;
        while (true) {
            i14--;
            if (i14 < 0) {
                return -1;
            }
            if (this.f142123c[i14] >= 0) {
                V[] vArr = this.f142122b;
                vArr.getClass();
                if (s.g(vArr[i14], v14)) {
                    return i14;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f142129i == 0;
    }

    public final int k(K k14) {
        return ((k14 != null ? k14.hashCode() : 0) * (-1640531527)) >>> this.f142127g;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        q13.e<K> eVar = this.f142130j;
        if (eVar != null) {
            return eVar;
        }
        q13.e<K> eVar2 = new q13.e<>(this);
        this.f142130j = eVar2;
        return eVar2;
    }

    public final void l(int i14) {
        int[] iArr;
        this.f142128h++;
        int i15 = 0;
        if (this.f142126f > this.f142129i) {
            d(false);
        }
        this.f142124d = new int[i14];
        f142119n.getClass();
        this.f142127g = Integer.numberOfLeadingZeros(i14) + 1;
        while (i15 < this.f142126f) {
            int i16 = i15 + 1;
            int iK = k(this.f142121a[i15]);
            int i17 = this.f142125e;
            while (true) {
                iArr = this.f142124d;
                if (iArr[iK] == 0) {
                    break;
                }
                i17--;
                if (i17 < 0) {
                    h.z("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iK = iK == 0 ? iArr.length - 1 : iK - 1;
            }
            iArr[iK] = i16;
            this.f142123c[i15] = iK;
            i15 = i16;
        }
    }

    public final void m(int i14) {
        int i15;
        int i16;
        int iK;
        int[] iArr;
        K[] kArr = this.f142121a;
        kArr.getClass();
        kArr[i14] = null;
        V[] vArr = this.f142122b;
        if (vArr != null) {
            vArr[i14] = null;
        }
        int length = this.f142123c[i14];
        loop0: while (true) {
            int i17 = length;
            int i18 = 0;
            do {
                length = length == 0 ? this.f142124d.length - 1 : length - 1;
                int[] iArr2 = this.f142124d;
                i15 = iArr2[length];
                i18++;
                if (i18 > this.f142125e) {
                    iArr2[i17] = 0;
                    break loop0;
                } else if (i15 == 0) {
                    iArr2[i17] = 0;
                    break loop0;
                } else {
                    i16 = i15 - 1;
                    iK = k(this.f142121a[i16]) - length;
                    iArr = this.f142124d;
                }
            } while ((iK & (iArr.length - 1)) < i18);
            iArr[i17] = i15;
            this.f142123c[i16] = i17;
        }
        this.f142123c[i14] = -1;
        this.f142129i--;
        this.f142128h++;
    }

    @Override // java.util.Map
    public final V put(K k14, V v14) {
        c();
        int iA = a(k14);
        V[] vArr = this.f142122b;
        if (vArr == null) {
            int length = this.f142121a.length;
            if (length < 0) {
                h.s("capacity must be non-negative.");
                return null;
            }
            vArr = (V[]) new Object[length];
            this.f142122b = vArr;
        }
        if (iA >= 0) {
            vArr[iA] = v14;
            return null;
        }
        int i14 = (-iA) - 1;
        V v15 = vArr[i14];
        vArr[i14] = v14;
        return v15;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        c();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            V[] vArr = this.f142122b;
            if (vArr == null) {
                int length = this.f142121a.length;
                if (length < 0) {
                    h.s("capacity must be non-negative.");
                    return;
                } else {
                    vArr = (V[]) new Object[length];
                    this.f142122b = vArr;
                }
            }
            if (iA >= 0) {
                vArr[iA] = entry.getValue();
            } else {
                int i14 = (-iA) - 1;
                if (!s.g(entry.getValue(), vArr[i14])) {
                    vArr[i14] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        V[] vArr = this.f142122b;
        vArr.getClass();
        V v14 = vArr[iH];
        m(iH);
        return v14;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f142129i;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder((this.f142129i * 3) + 2);
        sb3.append("{");
        b bVar = new b(this);
        int i14 = 0;
        while (bVar.hasNext()) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            int i15 = bVar.f142138b;
            c<K, V> cVar = bVar.f142137a;
            if (i15 >= cVar.f142126f) {
                t.g();
                return null;
            }
            bVar.f142138b = i15 + 1;
            bVar.f142139c = i15;
            K k14 = cVar.f142121a[i15];
            if (k14 == cVar) {
                sb3.append("(this Map)");
            } else {
                sb3.append(k14);
            }
            sb3.append('=');
            V[] vArr = cVar.f142122b;
            vArr.getClass();
            V v14 = vArr[bVar.f142139c];
            if (v14 == cVar) {
                sb3.append("(this Map)");
            } else {
                sb3.append(v14);
            }
            bVar.b();
            i14++;
        }
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb3.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        q13.f<V> fVar = this.f142131k;
        if (fVar != null) {
            return fVar;
        }
        q13.f<V> fVar2 = new q13.f<>(this);
        this.f142131k = fVar2;
        return fVar2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lq13/c$a;", "", "<init>", "()V", "", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public c() {
        this(8);
    }

    private c(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i14, int i15) {
        this.f142121a = kArr;
        this.f142122b = vArr;
        this.f142123c = iArr;
        this.f142124d = iArr2;
        this.f142125e = i14;
        this.f142126f = i15;
        int length = iArr2.length;
        f142119n.getClass();
        this.f142127g = Integer.numberOfLeadingZeros(length) + 1;
    }
}
