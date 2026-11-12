package xi;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import xi.l;

/* JADX INFO: loaded from: classes7.dex */
public class g<K extends l, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f191074a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f191075b = new HashMap();

    public final V a(K k14) {
        a aVar;
        HashMap map = this.f191075b;
        a aVar2 = (a) map.get(k14);
        if (aVar2 == null) {
            a aVar3 = new a(k14);
            map.put(k14, aVar3);
            aVar = aVar3;
        } else {
            k14.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f191079d;
        aVar4.f191078c = aVar.f191078c;
        aVar.f191078c.f191079d = aVar4;
        a<K, V> aVar5 = this.f191074a;
        aVar.f191079d = aVar5;
        a<K, V> aVar6 = aVar5.f191078c;
        aVar.f191078c = aVar6;
        aVar6.f191079d = aVar;
        aVar.f191079d.f191078c = aVar;
        ArrayList arrayList = aVar.f191077b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return (V) aVar.f191077b.remove(size - 1);
        }
        return null;
    }

    public final void b(K k14, V v14) {
        HashMap map = this.f191075b;
        a aVar = (a) map.get(k14);
        if (aVar == null) {
            aVar = new a(k14);
            a<K, V> aVar2 = aVar.f191079d;
            aVar2.f191078c = aVar.f191078c;
            aVar.f191078c.f191079d = aVar2;
            a<K, V> aVar3 = this.f191074a;
            aVar.f191079d = aVar3.f191079d;
            aVar.f191078c = aVar3;
            aVar3.f191079d = aVar;
            aVar.f191079d.f191078c = aVar;
            map.put(k14, aVar);
        } else {
            k14.a();
        }
        if (aVar.f191077b == null) {
            aVar.f191077b = new ArrayList();
        }
        aVar.f191077b.add(v14);
    }

    public final V c() {
        a<K, V> aVar = this.f191074a;
        a aVar2 = aVar.f191079d;
        while (true) {
            boolean zEquals = aVar2.equals(aVar);
            Object obj = aVar2.f191076a;
            V v14 = null;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = aVar2.f191077b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v14 = (V) aVar2.f191077b.remove(size - 1);
            }
            if (v14 != null) {
                return v14;
            }
            a<K, V> aVar3 = aVar2.f191079d;
            aVar3.f191078c = aVar2.f191078c;
            aVar2.f191078c.f191079d = aVar3;
            this.f191075b.remove(obj);
            ((l) obj).a();
            aVar2 = aVar2.f191079d;
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f191074a;
        a aVar2 = aVar.f191078c;
        boolean z14 = false;
        while (!aVar2.equals(aVar)) {
            sb3.append(CoreConstants.CURLY_LEFT);
            sb3.append(aVar2.f191076a);
            sb3.append(CoreConstants.COLON_CHAR);
            ArrayList arrayList = aVar2.f191077b;
            sb3.append(arrayList != null ? arrayList.size() : 0);
            sb3.append("}, ");
            aVar2 = aVar2.f191078c;
            z14 = true;
        }
        if (z14) {
            sb3.delete(sb3.length() - 2, sb3.length());
        }
        sb3.append(" )");
        return sb3.toString();
    }

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f191076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f191077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f191078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<K, V> f191079d;

        public a(K k14) {
            this.f191079d = this;
            this.f191078c = this;
            this.f191076a = k14;
        }

        public a() {
            this(null);
        }
    }
}
