package di;

import ci.j;
import ci.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p13.k0;
import p13.l0;
import p13.t0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldi/f;", "Lci/j;", "<init>", "()V", "a", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f59705b = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldi/f$a;", "", "Lci/n;", "record", "<init>", "(Lci/n;)V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f59706a;

        public a(n nVar) {
            nVar.getClass();
            this.f59706a = nVar;
            x.m(nVar);
        }
    }

    @Override // ci.m
    public final n a(String str, ci.a aVar) {
        str.getClass();
        aVar.getClass();
        try {
            j jVar = this.f27614a;
            n nVarA = jVar != null ? jVar.a(str, aVar) : null;
            a aVar2 = (a) this.f59705b.get(str);
            if (aVar2 == null) {
                return nVarA;
            }
            if (nVarA != null) {
                n nVar = aVar2.f59706a;
                nVar.getClass();
                n nVar2 = nVarA.b(nVar, null).f128594a;
                if (nVar2 != null) {
                    return nVar2;
                }
            }
            return aVar2.f59706a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    @Override // ci.m
    public final Collection b(ArrayList arrayList, ci.a aVar) {
        Map linkedHashMap;
        Collection collectionB;
        j jVar = this.f27614a;
        if (jVar == null || (collectionB = jVar.b(arrayList, aVar)) == null) {
            linkedHashMap = k0.f134949a;
            linkedHashMap.getClass();
        } else {
            Collection collection = collectionB;
            int iA = t0.a(y.r(collection, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : collection) {
                linkedHashMap.put(((n) obj).f27616a, obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n nVar = (n) linkedHashMap.get(str);
            a aVar2 = (a) this.f59705b.get(str);
            if (aVar2 != null) {
                if (nVar != null) {
                    n nVar2 = aVar2.f59706a;
                    nVar2.getClass();
                    nVar = nVar.b(nVar2, null).f128594a;
                    if (nVar == null) {
                        nVar = aVar2.f59706a;
                    }
                } else {
                    nVar = aVar2.f59706a;
                }
            }
            if (nVar != null) {
                arrayList2.add(nVar);
            }
        }
        return arrayList2;
    }

    @Override // ci.j
    public final void c() {
        this.f59705b.clear();
        j jVar = this.f27614a;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // ci.j
    public final Set<String> d(n nVar, ci.a aVar) {
        Set<String> setD;
        nVar.getClass();
        aVar.getClass();
        j jVar = this.f27614a;
        return (jVar == null || (setD = jVar.d(nVar, aVar)) == null) ? l0.f134950a : setD;
    }

    @Override // ci.j
    public final Set<String> e(Collection<n> collection, ci.a aVar) {
        Set<String> setE;
        collection.getClass();
        aVar.getClass();
        j jVar = this.f27614a;
        return (jVar == null || (setE = jVar.e(collection, aVar)) == null) ? l0.f134950a : setE;
    }
}
