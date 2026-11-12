package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tve implements nj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3b<a, Object> f35103a = new x3b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f35104b = new b();
    public final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    public final Map<Class<?>, hj1<?>> d = new HashMap();
    public final int e;
    public int f;

    public static final class a implements l3i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f35105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35106b;
        public Class<?> c;

        public a(b bVar) {
            this.f35105a = bVar;
        }

        @Override // defpackage.l3i
        public void a() {
            this.f35105a.c(this);
        }

        public void b(int i, Class<?> cls) {
            this.f35106b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35106b == aVar.f35106b && this.c == aVar.c;
        }

        public int hashCode() {
            int i = this.f35106b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f35106b + "array=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static final class b extends n82<a> {
        @Override // defpackage.n82
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i, cls);
            return aVarB;
        }
    }

    public tve(int i) {
        this.e = i;
    }

    @Override // defpackage.nj1
    public synchronized <T> T a(int i, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = j(cls).ceilingKey(Integer.valueOf(i));
        } catch (Throwable th) {
            throw th;
        }
        return (T) i(m(i, numCeilingKey) ? this.f35104b.e(numCeilingKey.intValue(), cls) : this.f35104b.e(i, cls), cls);
    }

    @Override // defpackage.nj1
    public synchronized <T> T b(int i, Class<T> cls) {
        return (T) i(this.f35104b.e(i, cls), cls);
    }

    public final void c(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapJ = j(cls);
        Integer num = navigableMapJ.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapJ.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapJ.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    @Override // defpackage.nj1
    public synchronized void clearMemory() {
        e(0);
    }

    public final void d() {
        e(this.e);
    }

    public final void e(int i) {
        while (this.f > i) {
            Object objF = this.f35103a.f();
            a6i.d(objF);
            hj1 hj1VarF = f(objF);
            this.f -= hj1VarF.a(objF) * hj1VarF.b();
            c(hj1VarF.a(objF), objF.getClass());
            if (Log.isLoggable(hj1VarF.getTag(), 2)) {
                hj1VarF.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(hj1VarF.a(objF));
            }
        }
    }

    public final <T> hj1<T> f(T t) {
        return g(t.getClass());
    }

    public final <T> hj1<T> g(Class<T> cls) {
        hj1<T> s63Var = (hj1) this.d.get(cls);
        if (s63Var == null) {
            if (cls.equals(int[].class)) {
                s63Var = new jcd();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                s63Var = new s63();
            }
            this.d.put(cls, s63Var);
        }
        return s63Var;
    }

    public final <T> T h(a aVar) {
        return (T) this.f35103a.a(aVar);
    }

    public final <T> T i(a aVar, Class<T> cls) {
        hj1<T> hj1VarG = g(cls);
        T t = (T) h(aVar);
        if (t != null) {
            this.f -= hj1VarG.a(t) * hj1VarG.b();
            c(hj1VarG.a(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(hj1VarG.getTag(), 2)) {
            hj1VarG.getTag();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f35106b);
            sb.append(" bytes");
        }
        return hj1VarG.newArray(aVar.f35106b);
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    public final boolean k() {
        int i = this.f;
        return i == 0 || this.e / i >= 2;
    }

    public final boolean l(int i) {
        return i <= this.e / 2;
    }

    public final boolean m(int i, Integer num) {
        return num != null && (k() || num.intValue() <= i * 8);
    }

    @Override // defpackage.nj1
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        hj1<T> hj1VarG = g(cls);
        int iA = hj1VarG.a(t);
        int iB = hj1VarG.b() * iA;
        if (l(iB)) {
            a aVarE = this.f35104b.e(iA, cls);
            this.f35103a.d(aVarE, t);
            NavigableMap<Integer, Integer> navigableMapJ = j(cls);
            Integer num = navigableMapJ.get(Integer.valueOf(aVarE.f35106b));
            Integer numValueOf = Integer.valueOf(aVarE.f35106b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapJ.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            d();
        }
    }

    @Override // defpackage.nj1
    public synchronized void trimMemory(int i) {
        try {
            if (i >= 40) {
                clearMemory();
            } else if (i >= 20 || i == 15) {
                e(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
