package p33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f<TAnnotation> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t43.h f135430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h33.y f135431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t43.n f135432c;

        public a(t43.h hVar, h33.y yVar, t43.n nVar) {
            this.f135430a = hVar;
            this.f135431b = yVar;
            this.f135432c = nVar;
        }
    }

    public static void a(Object obj, ArrayList arrayList, e eVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) eVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, eVar);
            }
        }
    }

    public abstract boolean b(TAnnotation tannotation, t43.h hVar);

    public abstract h33.d c();

    public abstract u23.h d(t43.h hVar);

    public final n e(t43.n nVar) {
        List<p43.n0> upperBounds;
        List<p43.n0> list;
        m mVar;
        q43.s sVarK = k();
        if (!l(nVar)) {
            return null;
        }
        sVarK.getClass();
        nVar.getClass();
        if (nVar instanceof t23.d1) {
            upperBounds = ((t23.d1) nVar).getUpperBounds();
            upperBounds.getClass();
        } else {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(nVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(p005kotlin.jvm.internal.s0.f105811a, nVar.getClass(), sb3));
            upperBounds = null;
        }
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!q43.b.a.G((t43.h) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (i((t43.h) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                o13.l lVarA = o13.m.a(o13.n.NONE, new b(upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        if (it3.hasNext()) {
                            ((t43.h) it3.next()).getClass();
                            list = upperBounds;
                        }
                    }
                    return new n(m.FORCE_FLEXIBILITY, false);
                }
                if (((List) lVarA.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) lVarA.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it4 = list2.iterator();
                    if (it4.hasNext()) {
                        ((t43.h) it4.next()).getClass();
                        list = (List) lVarA.getValue();
                    }
                }
                return new n(m.FORCE_FLEXIBILITY, true);
                if (list != null && list.isEmpty()) {
                    mVar = m.NULLABLE;
                    break;
                }
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        mVar = m.NULLABLE;
                        break;
                    }
                    if (!q43.b.a.M((t43.h) it5.next())) {
                        mVar = m.NOT_NULL;
                        break;
                    }
                }
                return new n(mVar, list != upperBounds);
            }
        }
        return null;
    }

    public abstract h33.c f();

    public abstract h33.y g();

    public abstract p43.n0 h(t43.h hVar);

    public final m i(t43.h hVar) {
        q43.s sVarK = k();
        if (q43.b.a.K(sVarK.A0(hVar))) {
            return m.NULLABLE;
        }
        if (q43.b.a.K(sVarK.k(hVar))) {
            return null;
        }
        return m.NOT_NULL;
    }

    public abstract boolean j();

    public abstract q43.s k();

    public abstract boolean l(t43.n nVar);

    public final ArrayList m(t43.h hVar) {
        q43.s sVarK = k();
        a aVar = new a(hVar, h33.b.b(c(), g(), d(hVar)), null);
        e eVar = new e(this, sVarK);
        ArrayList arrayList = new ArrayList(1);
        a(aVar, arrayList, eVar);
        return arrayList;
    }
}
