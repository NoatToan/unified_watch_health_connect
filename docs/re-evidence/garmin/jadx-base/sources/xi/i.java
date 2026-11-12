package xi;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements xi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<a, Object> f191080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f191081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f191082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f191083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f191084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f191085f;

    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f191086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f191087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f191088c;

        public a(b bVar) {
            this.f191086a = bVar;
        }

        @Override // xi.l
        public final void a() {
            this.f191086a.a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f191087b == aVar.f191087b && this.f191088c == aVar.f191088c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i14 = this.f191087b * 31;
            Class<?> cls = this.f191088c;
            return i14 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f191087b + "array=" + this.f191088c + CoreConstants.CURLY_RIGHT;
        }
    }

    public static final class b extends c<a> {
        public final l b() {
            return new a(this);
        }
    }

    public i() {
        this.f191080a = new g<>();
        this.f191081b = new b();
        this.f191082c = new HashMap();
        this.f191083d = new HashMap();
        this.f191084e = 4194304;
    }

    @Override // xi.b
    public final synchronized void a() {
        f(0);
    }

    @Override // xi.b
    public final synchronized void b(int i14) {
        try {
            if (i14 >= 40) {
                a();
            } else if (i14 >= 20 || i14 == 15) {
                f(this.f191084e / 2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xi.b
    public final synchronized <T> T c(int i14, Class<T> cls) {
        a aVar;
        int i15;
        try {
            Integer numCeilingKey = i(cls).ceilingKey(Integer.valueOf(i14));
            boolean z14 = numCeilingKey != null && ((i15 = this.f191085f) == 0 || this.f191084e / i15 >= 2 || numCeilingKey.intValue() <= i14 * 8);
            b bVar = this.f191081b;
            if (z14) {
                int iIntValue = numCeilingKey.intValue();
                l lVarB = (l) bVar.f191073a.poll();
                if (lVarB == null) {
                    lVarB = bVar.b();
                }
                aVar = (a) lVarB;
                aVar.f191087b = iIntValue;
                aVar.f191088c = cls;
            } else {
                l lVarB2 = (l) bVar.f191073a.poll();
                if (lVarB2 == null) {
                    lVarB2 = bVar.b();
                }
                aVar = (a) lVarB2;
                aVar.f191087b = i14;
                aVar.f191088c = cls;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (T) h(aVar, cls);
    }

    @Override // xi.b
    public final synchronized Object d() {
        a aVar;
        b bVar = this.f191081b;
        l lVarB = (l) bVar.f191073a.poll();
        if (lVarB == null) {
            lVarB = bVar.b();
        }
        aVar = (a) lVarB;
        aVar.f191087b = 8;
        aVar.f191088c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(int i14, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapI = i(cls);
        Integer num = navigableMapI.get(Integer.valueOf(i14));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapI.remove(Integer.valueOf(i14));
                return;
            } else {
                navigableMapI.put(Integer.valueOf(i14), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i14 + ", this: " + this);
    }

    public final void f(int i14) {
        while (this.f191085f > i14) {
            Object objC = this.f191080a.c();
            qj.l.b(objC);
            xi.a aVarG = g(objC.getClass());
            this.f191085f -= aVarG.b() * aVarG.a(objC);
            e(aVarG.a(objC), objC.getClass());
            if (Log.isLoggable(aVarG.getTag(), 2)) {
                aVarG.a(objC);
            }
        }
    }

    public final <T> xi.a<T> g(Class<T> cls) {
        xi.a<T> fVar;
        HashMap map = this.f191083d;
        xi.a<T> aVar = (xi.a) map.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                vb.h.s("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            fVar = new f();
        }
        map.put(cls, fVar);
        return fVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        xi.a<T> aVarG = g(cls);
        T t7 = (T) this.f191080a.a(aVar);
        if (t7 != null) {
            this.f191085f -= aVarG.b() * aVarG.a(t7);
            e(aVarG.a(t7), cls);
        }
        return t7 == null ? aVarG.newArray(aVar.f191087b) : t7;
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap map = this.f191082c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // xi.b
    public final synchronized <T> void put(T t7) {
        Class<?> cls = t7.getClass();
        xi.a<T> aVarG = g(cls);
        int iA = aVarG.a(t7);
        int iB = aVarG.b() * iA;
        if (iB <= this.f191084e / 2) {
            b bVar = this.f191081b;
            l lVarB = (l) bVar.f191073a.poll();
            if (lVarB == null) {
                lVarB = bVar.b();
            }
            a aVar = (a) lVarB;
            aVar.f191087b = iA;
            aVar.f191088c = cls;
            this.f191080a.b(aVar, t7);
            NavigableMap<Integer, Integer> navigableMapI = i(cls);
            Integer num = navigableMapI.get(Integer.valueOf(aVar.f191087b));
            Integer numValueOf = Integer.valueOf(aVar.f191087b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapI.put(numValueOf, Integer.valueOf(iIntValue));
            this.f191085f += iB;
            f(this.f191084e);
        }
    }

    public i(int i14) {
        this.f191080a = new g<>();
        this.f191081b = new b();
        this.f191082c = new HashMap();
        this.f191083d = new HashMap();
        this.f191084e = i14;
    }
}
