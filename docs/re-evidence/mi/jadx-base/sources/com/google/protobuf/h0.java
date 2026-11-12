package com.google.protobuf;

import defpackage.jbq;
import defpackage.ree;
import defpackage.t8i;
import defpackage.xaq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f9648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f9649b;

    public static final class b extends h0 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static <E> List<E> f(Object obj, long j) {
            return (List) jbq.G(obj, j);
        }

        public static <L> List<L> g(Object obj, long j, int i) {
            Object obj2;
            List<L> listA2;
            List<L> listF = f(obj, j);
            if (listF.isEmpty()) {
                if (listF instanceof ree) {
                    listA2 = new g0(i);
                } else {
                    listA2 = ((listF instanceof t8i) && (listF instanceof d0.i)) ? ((d0.i) listF).a2(i) : new ArrayList<>(i);
                }
                jbq.X(obj, j, listA2);
                return listA2;
            }
            if (c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i);
                arrayList.addAll(listF);
                jbq.X(obj, j, arrayList);
                obj2 = arrayList;
            } else {
                if (!(listF instanceof xaq)) {
                    if (!(listF instanceof t8i) || !(listF instanceof d0.i)) {
                        return listF;
                    }
                    d0.i iVar = (d0.i) listF;
                    if (iVar.c()) {
                        return listF;
                    }
                    d0.i iVarA2 = iVar.a2(listF.size() + i);
                    jbq.X(obj, j, iVarA2);
                    return iVarA2;
                }
                g0 g0Var = new g0(listF.size() + i);
                g0Var.addAll((xaq) listF);
                jbq.X(obj, j, g0Var);
                obj2 = g0Var;
            }
            return (List<L>) obj2;
        }

        @Override // com.google.protobuf.h0
        public void c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) jbq.G(obj, j);
            if (list instanceof ree) {
                objUnmodifiableList = ((ree) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof t8i) && (list instanceof d0.i)) {
                    d0.i iVar = (d0.i) list;
                    if (iVar.c()) {
                        iVar.b();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            jbq.X(obj, j, objUnmodifiableList);
        }

        @Override // com.google.protobuf.h0
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
            jbq.X(obj, j, listF);
        }

        @Override // com.google.protobuf.h0
        public <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    public static final class c extends h0 {
        public c() {
            super();
        }

        public static <E> d0.i<E> f(Object obj, long j) {
            return (d0.i) jbq.G(obj, j);
        }

        @Override // com.google.protobuf.h0
        public void c(Object obj, long j) {
            f(obj, j).b();
        }

        @Override // com.google.protobuf.h0
        public <E> void d(Object obj, Object obj2, long j) {
            d0.i iVarF = f(obj, j);
            d0.i iVarF2 = f(obj2, j);
            int size = iVarF.size();
            int size2 = iVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarF.c()) {
                    iVarF = iVarF.a2(size2 + size);
                }
                iVarF.addAll(iVarF2);
            }
            if (size > 0) {
                iVarF2 = iVarF;
            }
            jbq.X(obj, j, iVarF2);
        }

        @Override // com.google.protobuf.h0
        public <L> List<L> e(Object obj, long j) {
            d0.i iVarF = f(obj, j);
            if (iVarF.c()) {
                return iVarF;
            }
            int size = iVarF.size();
            d0.i iVarA2 = iVarF.a2(size == 0 ? 10 : size * 2);
            jbq.X(obj, j, iVarA2);
            return iVarA2;
        }
    }

    static {
        f9648a = new b();
        f9649b = new c();
    }

    public h0() {
    }

    public static h0 a() {
        return f9648a;
    }

    public static h0 b() {
        return f9649b;
    }

    public abstract void c(Object obj, long j);

    public abstract <L> void d(Object obj, Object obj2, long j);

    public abstract <L> List<L> e(Object obj, long j);
}
