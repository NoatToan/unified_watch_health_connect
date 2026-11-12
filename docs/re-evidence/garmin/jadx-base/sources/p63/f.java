package p63;

import c22.t;
import ch.qos.logback.core.CoreConstants;
import e23.l;
import i63.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.h0;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp63/f;", "Lp63/g;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f136258a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f136259b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f136260c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f136261d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f136262e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f136263f;

    public static void h(f fVar, k23.d dVar, k23.d dVar2, i63.c cVar) {
        Object next;
        k23.d dVar3;
        dVar.getClass();
        dVar2.getClass();
        cVar.getClass();
        String f103257a = cVar.getF158591b().getF103257a();
        HashMap map = fVar.f136259b;
        Object map2 = map.get(dVar);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(dVar, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = fVar.f136261d;
        Object map5 = map4.get(dVar);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(dVar, map5);
        }
        Map map6 = (Map) map5;
        i63.c cVar2 = (i63.c) map3.get(dVar2);
        if (cVar2 != null && !cVar2.equals(cVar)) {
            throw new d(dVar, dVar2);
        }
        i63.c cVar3 = (i63.c) map6.get(f103257a);
        if (cVar3 == null || cVar3.equals(cVar)) {
            map3.put(dVar2, cVar);
            map6.put(f103257a, cVar);
            return;
        }
        Iterator it = h0.M(map3.entrySet()).f134939a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Map.Entry) next).getValue() != cVar3);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (dVar3 = (k23.d) entry.getKey()) == null) {
            l2.m("Name ", f103257a, " is registered in the module but no Kotlin class is associated with it.");
            return;
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + dVar + "' have the same serial name '" + f103257a + "': " + cVar + " for '" + dVar2 + "' and " + cVar3 + " for '" + dVar3 + CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public static void i(f fVar, k23.d dVar, a aVar) {
        HashMap map = fVar.f136258a;
        dVar.getClass();
        a aVar2 = (a) map.get(dVar);
        if (aVar2 != null && !aVar2.equals(aVar)) {
            throw new d("Contextual serializer or serializer provider for " + dVar + " already registered in this module");
        }
        map.put(dVar, aVar);
        if (dh.b.u(dVar).isInterface()) {
            fVar.f136263f = true;
        }
    }

    @Override // p63.g
    public final <T> void a(k23.d<T> dVar, i63.c<T> cVar) {
        dVar.getClass();
        cVar.getClass();
        i(this, dVar, new a.C2578a(cVar));
    }

    @Override // p63.g
    public final <Base> void b(k23.d<Base> dVar, l<? super String, ? extends i63.b<? extends Base>> lVar) {
        g(dVar, lVar);
    }

    @Override // p63.g
    public final <T> void c(k23.d<T> dVar, l<? super List<? extends i63.c<?>>, ? extends i63.c<?>> lVar) {
        dVar.getClass();
        lVar.getClass();
        i(this, dVar, new a.b(lVar));
    }

    @Override // p63.g
    public final <Base> void d(k23.d<Base> dVar, l<? super Base, ? extends i<? super Base>> lVar) {
        HashMap map = this.f136260c;
        l lVar2 = (l) map.get(dVar);
        if (lVar2 == null || lVar2.equals(lVar)) {
            map.put(dVar, lVar);
        } else {
            t.i("Default serializers provider for ", dVar, " is already registered: ", lVar2);
        }
    }

    @Override // p63.g
    public final <Base, Sub extends Base> void e(k23.d<Base> dVar, k23.d<Sub> dVar2, i63.c<Sub> cVar) {
        h(this, dVar, dVar2, cVar);
    }

    public final c f() {
        return new c(this.f136258a, this.f136259b, this.f136260c, this.f136261d, this.f136262e, this.f136263f);
    }

    public final void g(k23.d dVar, l lVar) {
        dVar.getClass();
        lVar.getClass();
        HashMap map = this.f136262e;
        l lVar2 = (l) map.get(dVar);
        if (lVar2 == null || lVar2.equals(lVar)) {
            map.put(dVar, lVar);
        } else {
            t.i("Default deserializers provider for ", dVar, " is already registered: ", lVar2);
        }
    }
}
