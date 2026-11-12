package c53;

import c2.o3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p13.a1;
import p13.j0;
import p13.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class c0 extends u {
    public static <T> int f(j<? extends T> jVar) {
        jVar.getClass();
        Iterator<? extends T> it = jVar.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            it.next();
            i14++;
            if (i14 < 0) {
                p13.x.p();
                throw null;
            }
        }
        return i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> j<T> g(j<? extends T> jVar, int i14) {
        jVar.getClass();
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i14 == 0) {
            return jVar;
        }
        return jVar instanceof e ? ((e) jVar).b(i14) : new d(jVar, i14);
    }

    public static g h(j jVar, e23.l lVar) {
        jVar.getClass();
        lVar.getClass();
        return new g(jVar, true, lVar);
    }

    public static g i(j jVar, e23.l lVar) {
        jVar.getClass();
        lVar.getClass();
        return new g(jVar, false, lVar);
    }

    public static <T> T j(j<? extends T> jVar) {
        Iterator<? extends T> it = jVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static h k(j jVar, e23.l lVar) {
        jVar.getClass();
        lVar.getClass();
        return new h(jVar, lVar, x.f24587a);
    }

    public static h l(j jVar, e23.l lVar) {
        jVar.getClass();
        lVar.getClass();
        return new h(jVar, lVar, w.f24586a);
    }

    public static String m(j jVar, String str) throws IOException {
        jVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int i14 = 0;
        for (Object obj : jVar) {
            i14++;
            if (i14 > 1) {
                sb3.append((CharSequence) str);
            }
            d53.m.a(sb3, obj, null);
        }
        sb3.append((CharSequence) "");
        return sb3.toString();
    }

    public static <T> T n(j<? extends T> jVar) {
        jVar.getClass();
        Iterator<? extends T> it = jVar.iterator();
        if (!it.hasNext()) {
            n23.j.s("Sequence is empty.");
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static h0 o(j jVar, e23.l lVar) {
        jVar.getClass();
        lVar.getClass();
        return new h0(jVar, lVar);
    }

    public static g p(j jVar, e23.l lVar) {
        jVar.getClass();
        lVar.getClass();
        return i(new h0(jVar, lVar), new o3(17));
    }

    public static <T> j<T> q(j<? extends T> jVar, int i14) {
        jVar.getClass();
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i14 == 0) {
            return f.f24532a;
        }
        return jVar instanceof e ? ((e) jVar).a(i14) : new e0(jVar, i14);
    }

    public static f0 r(j jVar, e23.l lVar) {
        jVar.getClass();
        lVar.getClass();
        return new f0(jVar, lVar);
    }

    public static <T> List<T> s(j<? extends T> jVar) {
        jVar.getClass();
        Iterator<? extends T> it = jVar.iterator();
        if (!it.hasNext()) {
            return j0.f134944a;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return p13.w.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> t(j<? extends T> jVar) {
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = jVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> Set<T> u(j<? extends T> jVar) {
        Iterator<? extends T> it = jVar.iterator();
        if (!it.hasNext()) {
            return l0.f134950a;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return a1.b(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
