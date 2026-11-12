package y7;

import e23.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.t0;
import p13.u;
import p13.y;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly7/b;", "Ly7/g;", "", "Ly7/g$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<g.a<?>, Object> f194626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y7.a f194627b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Ly7/g$a;", "", "entry", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends w implements l<Map.Entry<g.a<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f194628a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final CharSequence invoke(Map.Entry<g.a<?>, Object> entry) {
            Map.Entry<g.a<?>, Object> entry2 = entry;
            entry2.getClass();
            Object value = entry2.getValue();
            return e0.h(new StringBuilder("  "), entry2.getKey().f194635a, " = ", value instanceof byte[] ? u.O((byte[]) value, ", ", null, 56) : String.valueOf(entry2.getValue()));
        }
    }

    public /* synthetic */ b(Map map, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? new LinkedHashMap() : map, (i14 & 2) != 0 ? true : z14);
    }

    @Override // y7.g
    public final Map<g.a<?>, Object> a() {
        p pVar;
        Set<Map.Entry<g.a<?>, Object>> setEntrySet = this.f194626a.entrySet();
        int iA = t0.a(y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pVar = new p(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pVar = new p(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        Map<g.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    @Override // y7.g
    public final <T> boolean b(g.a<T> aVar) {
        aVar.getClass();
        return this.f194626a.containsKey(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y7.g
    public final <T> T c(g.a<T> aVar) {
        aVar.getClass();
        T t7 = (T) this.f194626a.get(aVar);
        if (!(t7 instanceof byte[])) {
            return t7;
        }
        byte[] bArr = (byte[]) t7;
        return (T) Arrays.copyOf(bArr, bArr.length);
    }

    public final void d() {
        if (this.f194627b.f194625a.get()) {
            vb.h.z("Do mutate preferences once returned to DataStore.");
        }
    }

    public final <T> void e(g.a<T> aVar, T t7) {
        aVar.getClass();
        f(aVar, t7);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zG;
        if (!(obj instanceof b)) {
            return false;
        }
        Map<g.a<?>, Object> map = ((b) obj).f194626a;
        Map<g.a<?>, Object> map2 = this.f194626a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<g.a<?>, Object> entry : map.entrySet()) {
            Object obj2 = map2.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zG = s.g(value, obj2);
                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                    zG = true;
                } else {
                    zG = false;
                }
            } else {
                zG = false;
            }
            if (!zG) {
                return false;
            }
        }
        return true;
    }

    public final void f(g.a<?> aVar, Object obj) {
        aVar.getClass();
        d();
        Map<g.a<?>, Object> map = this.f194626a;
        if (obj == null) {
            d();
            map.remove(aVar);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(h0.g1((Set) obj));
            setUnmodifiableSet.getClass();
            map.put(aVar, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            map.put(aVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            map.put(aVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final int hashCode() {
        Iterator<T> it = this.f194626a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return h0.k0(this.f194626a.entrySet(), ",\n", "{\n", "\n}", a.f194628a, 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public b(Map<g.a<?>, Object> map, boolean z14) {
        map.getClass();
        this.f194626a = map;
        this.f194627b = new y7.a(z14);
    }
}
