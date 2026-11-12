package androidx.datastore.preferences.protobuf;

import defpackage.kbq;
import defpackage.see;
import defpackage.u8i;
import defpackage.yaq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f2259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f2260b;

    public static final class b extends w {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static <E> List<E> f(Object obj, long j) {
            return (List) kbq.E(obj, j);
        }

        public static <L> List<L> g(Object obj, long j, int i) {
            Object obj2;
            List<L> listA;
            List<L> listF = f(obj, j);
            if (listF.isEmpty()) {
                if (listF instanceof see) {
                    listA = new v(i);
                } else {
                    listA = ((listF instanceof u8i) && (listF instanceof s.i)) ? ((s.i) listF).a(i) : new ArrayList<>(i);
                }
                kbq.T(obj, j, listA);
                return listA;
            }
            if (c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i);
                arrayList.addAll(listF);
                kbq.T(obj, j, arrayList);
                obj2 = arrayList;
            } else {
                if (!(listF instanceof yaq)) {
                    if (!(listF instanceof u8i) || !(listF instanceof s.i)) {
                        return listF;
                    }
                    s.i iVar = (s.i) listF;
                    if (iVar.c()) {
                        return listF;
                    }
                    s.i iVarA = iVar.a(listF.size() + i);
                    kbq.T(obj, j, iVarA);
                    return iVarA;
                }
                v vVar = new v(listF.size() + i);
                vVar.addAll((yaq) listF);
                kbq.T(obj, j, vVar);
                obj2 = vVar;
            }
            return (List<L>) obj2;
        }

        @Override // androidx.datastore.preferences.protobuf.w
        public void c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) kbq.E(obj, j);
            if (list instanceof see) {
                objUnmodifiableList = ((see) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof u8i) && (list instanceof s.i)) {
                    s.i iVar = (s.i) list;
                    if (iVar.c()) {
                        iVar.b();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            kbq.T(obj, j, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.w
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
            kbq.T(obj, j, listF);
        }

        @Override // androidx.datastore.preferences.protobuf.w
        public <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    public static final class c extends w {
        public c() {
            super();
        }

        public static <E> s.i<E> f(Object obj, long j) {
            return (s.i) kbq.E(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.w
        public void c(Object obj, long j) {
            f(obj, j).b();
        }

        @Override // androidx.datastore.preferences.protobuf.w
        public <E> void d(Object obj, Object obj2, long j) {
            s.i iVarF = f(obj, j);
            s.i iVarF2 = f(obj2, j);
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
            kbq.T(obj, j, iVarF2);
        }

        @Override // androidx.datastore.preferences.protobuf.w
        public <L> List<L> e(Object obj, long j) {
            s.i iVarF = f(obj, j);
            if (iVarF.c()) {
                return iVarF;
            }
            int size = iVarF.size();
            s.i iVarA = iVarF.a(size == 0 ? 10 : size * 2);
            kbq.T(obj, j, iVarA);
            return iVarA;
        }
    }

    static {
        f2259a = new b();
        f2260b = new c();
    }

    public w() {
    }

    public static w a() {
        return f2259a;
    }

    public static w b() {
        return f2260b;
    }

    public abstract void c(Object obj, long j);

    public abstract <L> void d(Object obj, Object obj2, long j);

    public abstract <L> List<L> e(Object obj, long j);
}
