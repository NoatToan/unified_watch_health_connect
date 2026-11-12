package defpackage;

import defpackage.l3i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class x3b<K extends l3i, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f38637a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f38638b = new HashMap();

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.c.d = aVar;
        aVar.d.c = aVar;
    }

    public V a(K k2) {
        a<K, V> aVar = this.f38638b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.f38638b.put(k2, aVar);
        } else {
            k2.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f38637a;
        aVar.d = aVar2;
        aVar.c = aVar2.c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f38637a;
        aVar.d = aVar2.d;
        aVar.c = aVar2;
        g(aVar);
    }

    public void d(K k2, V v) {
        a<K, V> aVar = this.f38638b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            c(aVar);
            this.f38638b.put(k2, aVar);
        } else {
            k2.a();
        }
        aVar.a(v);
    }

    public V f() {
        for (a aVar = this.f38637a.d; !aVar.equals(this.f38637a); aVar = aVar.d) {
            V v = (V) aVar.b();
            if (v != null) {
                return v;
            }
            e(aVar);
            this.f38638b.remove(aVar.f38639a);
            ((l3i) aVar.f38639a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f38637a.c;
        boolean z = false;
        while (!aVar.equals(this.f38637a)) {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sb.append(aVar.f38639a);
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f38639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<V> f38640b;
        public a<K, V> c;
        public a<K, V> d;

        public a() {
            this(null);
        }

        public void a(V v) {
            if (this.f38640b == null) {
                this.f38640b = new ArrayList();
            }
            this.f38640b.add(v);
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f38640b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f38640b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(K k2) {
            this.d = this;
            this.c = this;
            this.f38639a = k2;
        }
    }
}
