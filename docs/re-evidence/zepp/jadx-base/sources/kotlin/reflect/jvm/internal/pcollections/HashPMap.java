package kotlin.reflect.jvm.internal.pcollections;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class HashPMap<K, V> {
    private static final HashPMap<Object, Object> c = new HashPMap<>(c.a(), 0);
    private final c<a<d<K, V>>> a;
    private final int b;

    private HashPMap(c<a<d<K, V>>> cVar, int i) {
        this.a = cVar;
        this.b = i;
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    private a<d<K, V>> b(int i) {
        a<d<K, V>> aVarB = this.a.b(i);
        return aVarB == null ? a.b() : aVarB;
    }

    private static <K, V> int c(a<d<K, V>> aVar, Object obj) {
        int i = 0;
        while (aVar != null && aVar.size() > 0) {
            if (aVar.a.a.equals(obj)) {
                return i;
            }
            aVar = aVar.b;
            i++;
        }
        return -1;
    }

    @NotNull
    public static <K, V> HashPMap<K, V> empty() {
        HashPMap<K, V> hashPMap = (HashPMap<K, V>) c;
        if (hashPMap == null) {
            a(0);
        }
        return hashPMap;
    }

    public boolean containsKey(Object obj) {
        return c(b(obj.hashCode()), obj) != -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V get(Object obj) {
        for (a aVarB = b(obj.hashCode()); aVarB != null && aVarB.size() > 0; aVarB = aVarB.b) {
            d dVar = (d) aVarB.a;
            if (dVar.a.equals(obj)) {
                return dVar.b;
            }
        }
        return null;
    }

    @NotNull
    public HashPMap<K, V> minus(Object obj) {
        a<d<K, V>> aVarB = b(obj.hashCode());
        int iC = c(aVarB, obj);
        if (iC == -1) {
            return this;
        }
        a<d<K, V>> aVarD = aVarB.d(iC);
        return aVarD.size() == 0 ? new HashPMap<>(this.a.c(obj.hashCode()), this.b - 1) : new HashPMap<>(this.a.d(obj.hashCode(), aVarD), this.b - 1);
    }

    @NotNull
    public HashPMap<K, V> plus(K k, V v) {
        a<d<K, V>> aVarB = b(k.hashCode());
        int size = aVarB.size();
        int iC = c(aVarB, k);
        if (iC != -1) {
            aVarB = aVarB.d(iC);
        }
        a<d<K, V>> aVarF = aVarB.f(new d<>(k, v));
        return new HashPMap<>(this.a.d(k.hashCode(), aVarF), (this.b - size) + aVarF.size());
    }

    public int size() {
        return this.b;
    }
}
