package androidx.health.platform.client.proto;

import defpackage.hbq;
import defpackage.pee;
import defpackage.r8i;
import defpackage.vaq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f2508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f2509b;

    public static final class b extends j0 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static <E> List<E> f(Object obj, long j) {
            return (List) hbq.G(obj, j);
        }

        public static <L> List<L> g(Object obj, long j, int i) {
            Object obj2;
            List<L> listA;
            List<L> listF = f(obj, j);
            if (listF.isEmpty()) {
                if (listF instanceof pee) {
                    listA = new i0(i);
                } else {
                    listA = ((listF instanceof r8i) && (listF instanceof f0.i)) ? ((f0.i) listF).a(i) : new ArrayList<>(i);
                }
                hbq.W(obj, j, listA);
                return listA;
            }
            if (c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i);
                arrayList.addAll(listF);
                hbq.W(obj, j, arrayList);
                obj2 = arrayList;
            } else {
                if (!(listF instanceof vaq)) {
                    if (!(listF instanceof r8i) || !(listF instanceof f0.i)) {
                        return listF;
                    }
                    f0.i iVar = (f0.i) listF;
                    if (iVar.c()) {
                        return listF;
                    }
                    f0.i iVarA = iVar.a(listF.size() + i);
                    hbq.W(obj, j, iVarA);
                    return iVarA;
                }
                i0 i0Var = new i0(listF.size() + i);
                i0Var.addAll((vaq) listF);
                hbq.W(obj, j, i0Var);
                obj2 = i0Var;
            }
            return (List<L>) obj2;
        }

        @Override // androidx.health.platform.client.proto.j0
        public void c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) hbq.G(obj, j);
            if (list instanceof pee) {
                objUnmodifiableList = ((pee) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof r8i) && (list instanceof f0.i)) {
                    f0.i iVar = (f0.i) list;
                    if (iVar.c()) {
                        iVar.b();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            hbq.W(obj, j, objUnmodifiableList);
        }

        @Override // androidx.health.platform.client.proto.j0
        public <E> void d(Object obj, Object obj2, long j) {
            List listF = f(obj2, j);
            List listG = g(obj, j, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            hbq.W(obj, j, listF);
        }

        @Override // androidx.health.platform.client.proto.j0
        public <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    public static final class c extends j0 {
        public c() {
            super();
        }

        public static <E> f0.i<E> f(Object obj, long j) {
            return (f0.i) hbq.G(obj, j);
        }

        @Override // androidx.health.platform.client.proto.j0
        public void c(Object obj, long j) {
            f(obj, j).b();
        }

        @Override // androidx.health.platform.client.proto.j0
        public <E> void d(Object obj, Object obj2, long j) {
            f0.i iVarF = f(obj, j);
            f0.i iVarF2 = f(obj2, j);
            int size = iVarF.size();
            int size2 = iVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarF.c()) {
                    iVarF = iVarF.a(size2 + size);
                }
                iVarF.addAll(iVarF2);
            }
            if (size > 0) {
                iVarF2 = iVarF;
            }
            hbq.W(obj, j, iVarF2);
        }

        @Override // androidx.health.platform.client.proto.j0
        public <L> List<L> e(Object obj, long j) {
            f0.i iVarF = f(obj, j);
            if (iVarF.c()) {
                return iVarF;
            }
            int size = iVarF.size();
            f0.i iVarA = iVarF.a(size == 0 ? 10 : size * 2);
            hbq.W(obj, j, iVarA);
            return iVarA;
        }
    }

    static {
        f2508a = new b();
        f2509b = new c();
    }

    public j0() {
    }

    public static j0 a() {
        return f2508a;
    }

    public static j0 b() {
        return f2509b;
    }

    public abstract void c(Object obj, long j);

    public abstract <L> void d(Object obj, Object obj2, long j);

    public abstract <L> List<L> e(Object obj, long j);
}
