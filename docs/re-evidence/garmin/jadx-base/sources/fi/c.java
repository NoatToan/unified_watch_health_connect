package fi;

import ci.j;
import ci.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.l0;
import p13.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi/c;", "Lci/j;", "Lgi/d;", "recordDatabase", "<init>", "(Lgi/d;)V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f71640c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi.d f71641b;

    public c(gi.d dVar) {
        dVar.getClass();
        this.f71641b = dVar;
    }

    public static final n f(c cVar, n nVar, Long l14) {
        cVar.getClass();
        if (l14 == null) {
            return nVar;
        }
        String str = nVar.f27616a;
        Map<String, Object> map = nVar.f27617b;
        UUID uuid = nVar.f27618c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((Map.Entry) it.next()).getKey(), l14);
        }
        return new n(str, map, uuid, linkedHashMap);
    }

    @Override // ci.m
    public final n a(String str, ci.a aVar) {
        n nVarB;
        gi.d dVar = this.f71641b;
        str.getClass();
        aVar.getClass();
        try {
            nVarB = dVar.b(str);
        } catch (Exception e4) {
            ji.a.f98763a.invoke(new Exception("Unable to read a record from the database", e4));
            nVarB = null;
        }
        if (nVarB != null) {
            if (aVar.f27592a.containsKey("evict-after-read")) {
                dVar.a(str);
            }
            return nVarB;
        }
        j jVar = this.f27614a;
        if (jVar != null) {
            return jVar.a(str, aVar);
        }
        return null;
    }

    @Override // ci.m
    public final Collection b(ArrayList arrayList, ci.a aVar) {
        Collection collectionG;
        try {
            collectionG = g(arrayList);
        } catch (Exception e4) {
            ji.a.f98763a.invoke(new Exception("Unable to read records from the database", e4));
            collectionG = j0.f134944a;
        }
        if (aVar.f27592a.containsKey("evict-after-read")) {
            Iterator it = collectionG.iterator();
            while (it.hasNext()) {
                this.f71641b.a(((n) it.next()).f27616a);
            }
        }
        return collectionG;
    }

    @Override // ci.j
    public final void c() {
        j jVar = this.f27614a;
        if (jVar != null) {
            jVar.c();
        }
        this.f71641b.deleteAll();
    }

    @Override // ci.j
    public final Set<String> d(n nVar, ci.a aVar) {
        nVar.getClass();
        aVar.getClass();
        Map<String, String> map = aVar.f27592a;
        if (map.containsKey("do-not-store")) {
            return l0.f134950a;
        }
        try {
            String str = map.get("apollo-date");
            return (Set) this.f71641b.f(new a(this, nVar, str != null ? Long.valueOf(Long.parseLong(str)) : null));
        } catch (Exception e4) {
            ji.a.f98763a.invoke(new Exception("Unable to merge a record from the database", e4));
            return l0.f134950a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, p13.l0] */
    @Override // ci.j
    public final Set<String> e(Collection<n> collection, ci.a aVar) {
        collection.getClass();
        aVar.getClass();
        Map<String, String> map = aVar.f27592a;
        if (map.containsKey("do-not-store")) {
            return l0.f134950a;
        }
        try {
            String str = map.get("apollo-date");
            Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            r0 r0Var = new r0();
            r0Var.f105810a = l0.f134950a;
            this.f71641b.f(new b(this, collection, r0Var, lValueOf));
            return (Set) r0Var.f105810a;
        } catch (Exception e4) {
            ji.a.f98763a.invoke(new Exception("Unable to merge records from the database", e4));
            return l0.f134950a;
        }
    }

    public final ArrayList g(ArrayList arrayList) {
        ArrayList arrayListI1 = h0.i1(arrayList, 999, 999, true);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListI1.iterator();
        while (it.hasNext()) {
            d0.v(arrayList2, this.f71641b.e((List) it.next()));
        }
        return arrayList2;
    }
}
