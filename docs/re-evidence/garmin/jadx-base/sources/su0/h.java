package su0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o53.i0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu0/h;", "", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f160962a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uu0.e f160963b = ((uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null)).g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static List<pu0.a> f160964c;

    private h() {
    }

    public static int d() {
        List<pu0.a> list = f160964c;
        if (list == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((pu0.a) obj).f141182d, Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085 A[PHI: r2 r10
      0x0085: PHI (r2v7 o53.i0) = (r2v6 o53.i0), (r2v14 o53.i0) binds: [B:28:0x0082, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v1 java.lang.Object) binds: [B:28:0x0082, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) throws Throwable {
        c cVar2;
        i0 i0Var;
        List list;
        Object objAwait;
        List list2;
        List list3;
        List<pu0.a> listM0;
        Boolean boolValueOf;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f160950e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f160950e = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objE0 = cVar2.f160948c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f160950e;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar3 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            d dVar = new d(null);
            cVar2.f160950e = 1;
            objE0 = ge1.b.e0(bVar, dVar, cVar2);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objE0);
        } else {
            if (i15 == 2) {
                i0Var = cVar2.f160946a;
                o13.r.b(objE0);
                cVar2.f160946a = i0Var;
                cVar2.f160950e = 3;
                objE0 = ((i0) objE0).await(cVar2);
                if (objE0 != aVar) {
                    list = (List) objE0;
                    cVar2.f160946a = null;
                    cVar2.f160947b = list;
                    cVar2.f160950e = 4;
                    objAwait = i0Var.await(cVar2);
                    if (objAwait != aVar) {
                        list2 = list;
                        objE0 = objAwait;
                    }
                }
                return aVar;
            }
            if (i15 == 3) {
                i0Var = cVar2.f160946a;
                o13.r.b(objE0);
                list = (List) objE0;
                cVar2.f160946a = null;
                cVar2.f160947b = list;
                cVar2.f160950e = 4;
                objAwait = i0Var.await(cVar2);
                if (objAwait != aVar) {
                    list2 = list;
                    objE0 = objAwait;
                }
                return aVar;
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = cVar2.f160947b;
            o13.r.b(objE0);
        }
        list3 = (List) objE0;
        if (list3 != null) {
            listM0 = h0.M0(list3);
        } else {
            listM0 = null;
        }
        f160964c = listM0;
        if (listM0 != null) {
            for (pu0.a aVar2 : listM0) {
                if (list2 != null) {
                    boolValueOf = Boolean.valueOf(list2.contains(aVar2.f141179a));
                } else {
                    boolValueOf = null;
                }
                aVar2.f141182d = boolValueOf;
            }
        }
        return f160964c;
        i0 i0Var2 = (i0) objE0;
        x53.c cVar4 = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        e eVar = new e(null);
        cVar2.f160946a = i0Var2;
        cVar2.f160950e = 2;
        Object objE1 = ge1.b.e0(bVar2, eVar, cVar2);
        if (objE1 != aVar) {
            i0Var = i0Var2;
            objE0 = objE1;
            cVar2.f160946a = i0Var;
            cVar2.f160950e = 3;
            objE0 = ((i0) objE0).await(cVar2);
            if (objE0 != aVar) {
                list = (List) objE0;
                cVar2.f160946a = null;
                cVar2.f160947b = list;
                cVar2.f160950e = 4;
                objAwait = i0Var.await(cVar2);
                if (objAwait != aVar) {
                    list2 = list;
                    objE0 = objAwait;
                    list3 = (List) objE0;
                    if (list3 != null) {
                        listM0 = h0.M0(list3);
                    } else {
                        listM0 = null;
                    }
                    f160964c = listM0;
                    if (listM0 != null) {
                        while (r10.hasNext()) {
                            if (list2 != null) {
                                boolValueOf = Boolean.valueOf(list2.contains(aVar2.f141179a));
                            } else {
                                boolValueOf = null;
                            }
                            aVar2.f141182d = boolValueOf;
                        }
                    }
                    return f160964c;
                }
            }
        }
        return aVar;
    }

    public final Object b(v13.c cVar) {
        List<pu0.a> list = f160964c;
        return (list == null || list.isEmpty()) ? a(cVar) : f160964c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f160958c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f160958c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objB = fVar.f160956a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f160958c;
        if (i15 == 0) {
            o13.r.b(objB);
            fVar.f160958c = 1;
            objB = b(fVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        List list = (List) objB;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((pu0.a) obj).f141182d, Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [uu0.e] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object e(v13.c cVar) {
        g gVar;
        ?? arrayList;
        ?? arrayList2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f160961c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f160961c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objC = gVar.f160959a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f160961c;
        if (i15 == 0) {
            o13.r.b(objC);
            List<pu0.a> list = f160964c;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (p005kotlin.jvm.internal.s.g(((pu0.a) obj).f141182d, Boolean.TRUE)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(p13.y.r(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pu0.a) it.next()).f141179a);
                }
            } else {
                arrayList = j0.f134944a;
            }
            List<pu0.a> list2 = f160964c;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list2) {
                    if (p005kotlin.jvm.internal.s.g(((pu0.a) obj2).f141182d, Boolean.FALSE)) {
                        arrayList4.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(p13.y.r(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((pu0.a) it3.next()).f141179a);
                }
            } else {
                arrayList2 = j0.f134944a;
            }
            if (((Collection) arrayList).isEmpty() && ((Collection) arrayList2).isEmpty()) {
                return Boolean.TRUE;
            }
            gVar.f160961c = 1;
            objC = f160963b.c(arrayList, arrayList2, gVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        return Boolean.valueOf(p005kotlin.jvm.internal.s.g((Boolean) objC, Boolean.TRUE));
    }
}
