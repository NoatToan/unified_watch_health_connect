package i33;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p13.d0;
import p13.l0;
import p13.u0;
import p13.y;
import u23.q;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f90799a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f90800b = u0.e(new p("PACKAGE", EnumSet.noneOf(q.class)), new p("TYPE", EnumSet.of(q.f168262r, q.F)), new p("ANNOTATION_TYPE", EnumSet.of(q.f168263t)), new p("TYPE_PARAMETER", EnumSet.of(q.f168264v)), new p("FIELD", EnumSet.of(q.f168266x)), new p("LOCAL_VARIABLE", EnumSet.of(q.f168267y)), new p("PARAMETER", EnumSet.of(q.f168268z)), new p("CONSTRUCTOR", EnumSet.of(q.A)), new p("METHOD", EnumSet.of(q.B, q.C, q.D)), new p("TYPE_USE", EnumSet.of(q.E)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f90801c = u0.e(new p("RUNTIME", u23.p.RUNTIME), new p("CLASS", u23.p.BINARY), new p("SOURCE", u23.p.SOURCE));

    private f() {
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public static d43.b a(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            if (obj instanceof o33.l) {
                arrayListL.add(obj);
            }
        }
        ArrayList<q> arrayList = new ArrayList();
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            String strB = ((o33.l) it.next()).c().b();
            f90799a.getClass();
            Iterable iterable = (EnumSet) f90800b.get(strB);
            if (iterable == null) {
                iterable = l0.f134950a;
            }
            d0.v(arrayList, iterable);
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (q qVar : arrayList) {
            x33.b.a aVar = x33.b.f188590d;
            x33.c cVar = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105896v;
            aVar.getClass();
            arrayList2.add(new d43.k(x33.b.a.b(cVar), x33.f.e(qVar.name())));
        }
        return new d43.b(arrayList2, e.f90798a);
    }
}
