package kd0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/m0;", "Luu0/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 implements uu0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f104217a = o13.m.b(new k62.l(29));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uu0.b
    public final Object a(long j8, String str, v13.c cVar) {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f104138c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f104138c = i14 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object objJ = j0Var.f104136a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j0Var.f104138c;
        if (i15 == 0) {
            o13.r.b(objJ);
            m20.z zVar = (m20.z) this.f104217a.getValue();
            j0Var.f104138c = 1;
            zVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(zVar, new m20.r(zVar, str, j8, null), j0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        return Boolean.valueOf(((com.garmin.android.apps.connectmobile.v2) objJ) instanceof com.garmin.android.apps.connectmobile.v2.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // uu0.b
    public final Object b(pu0.b bVar, v13.c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f104162c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f104162c = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object objH = k0Var.f104160a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f104162c;
        if (i15 == 0) {
            o13.r.b(objH);
            m20.z zVar = (m20.z) this.f104217a.getValue();
            l20.a aVarB = nu0.a.b(bVar);
            k0Var.f104162c = 1;
            objH = zVar.h(aVarB, k0Var);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objH;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            com.garmin.android.apps.connectmobile.v2.b bVar2 = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
            return new com.garmin.android.apps.connectmobile.v2.b(nu0.a.a((l20.a) bVar2.f47386a), bVar2.f47387b, null, null, 12, null);
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            return v2Var;
        }
        lc.u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // uu0.b
    public final Object c(v13.c cVar) {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f104073c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f104073c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objG = g0Var.f104071a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f104073c;
        if (i15 == 0) {
            o13.r.b(objG);
            m20.z zVar = (m20.z) this.f104217a.getValue();
            g0Var.f104073c = 1;
            objG = zVar.g(g0Var);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objG;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            return null;
        }
        l20.r rVar = (l20.r) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        rVar.getClass();
        return new pu0.k(nu0.a.c(rVar.f()), p005kotlin.jvm.internal.s.g(rVar.getMessengerAccountStatusForSelfString(), "AVAILABLE"), p005kotlin.jvm.internal.s.g(rVar.getMessengerSmsStatusForSelfString(), "SUPPORTED"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // uu0.b
    public final Serializable d(v13.c cVar) throws Throwable {
        h0 h0Var;
        List<l20.n> list;
        List list2;
        List list3;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f104095c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f104095c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objE0 = h0Var.f104093a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f104095c;
        if (i15 == 0) {
            o13.r.b(objE0);
            j22.b bVar = j22.b.f96736a;
            j22.a[] aVarArr = {j22.a.f96717f};
            bVar.getClass();
            if (!j22.b.k(aVarArr)) {
                return p13.j0.f134944a;
            }
            m20.z zVar = (m20.z) this.f104217a.getValue();
            h0Var.f104095c = 1;
            zVar.getClass();
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new m20.q(zVar, 5, 5, null), h0Var);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objE0;
        if ((v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) && (list = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a) != null) {
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            for (l20.n nVar : list) {
                String strValueOf = String.valueOf(nVar.f109027a);
                String strA = nVar.a();
                String strB = nVar.b();
                Set<l20.o> set = nVar.f109031e;
                if (set == null) {
                    list2 = p13.j0.f134944a;
                } else {
                    Set<l20.o> set2 = set;
                    ArrayList arrayList2 = new ArrayList(p13.y.r(set2, 10));
                    for (l20.o oVar : set2) {
                        arrayList2.add(new pu0.i(null, oVar.f109033a, null, Boolean.valueOf(oVar.f109035c), Integer.valueOf(oVar.f109034b.f109040a), 0, null, null, null, null, null, null, null, null, null, null, 65509, null));
                    }
                    list2 = arrayList2;
                }
                Set<l20.j> set3 = nVar.f109032f;
                if (set3 == null) {
                    list3 = p13.j0.f134944a;
                } else {
                    Set<l20.j> set4 = set3;
                    ArrayList arrayList3 = new ArrayList(p13.y.r(set4, 10));
                    for (l20.j jVar : set4) {
                        arrayList3.add(new pu0.f(null, jVar.f109005a, null, Boolean.valueOf(jVar.f109007c), Integer.valueOf(jVar.f109006b.f109012a), 0, null, null, null, null, null, null, null, null, 16357, null));
                    }
                    list3 = arrayList3;
                }
                arrayList.add(new pu0.b(strValueOf, strA, strB, list3, false, pu0.d.C2651d.f141215a, null, null, list2, null, null, null, null, null, null, null, 65232, null));
            }
            return arrayList;
        }
        return p13.j0.f134944a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // uu0.b
    public final Serializable e(pu0.b bVar, v13.c cVar) {
        l0 l0Var;
        List<l20.a> listF;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i14 = l0Var.f104185c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l0Var.f104185c = i14 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object objI = l0Var.f104183a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l0Var.f104185c;
        if (i15 == 0) {
            o13.r.b(objI);
            m20.z zVar = (m20.z) this.f104217a.getValue();
            l20.r rVar = new l20.r(p13.w.c(nu0.a.b(bVar)), null, null, null, null, null, 62, null);
            l0Var.f104185c = 1;
            objI = zVar.i(rVar, l0Var);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objI;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) || (listF = ((l20.r) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).f()) == null) {
            return null;
        }
        return (Serializable) nu0.a.c(listF);
    }

    public final Object f(long j8, pu0.b bVar, v13.c cVar) {
        return ((te0.b) KoinJavaComponent.get$default(te0.b.class, null, null, 6, null)).a(j8, nu0.a.b(bVar), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(long j8, v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f104060c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f104060c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objO = f0Var.f104058a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f104060c;
        if (i15 == 0) {
            o13.r.b(objO);
            re0.o oVar = (re0.o) KoinJavaComponent.get$default(re0.o.class, null, null, 6, null);
            f0Var.f104060c = 1;
            objO = oVar.o(j8, f0Var);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objO);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objO;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                return v2Var;
            }
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
        List<pu0.b> listC = nu0.a.c(((l20.r) bVar.f47386a).f());
        ArrayList arrayList = new ArrayList();
        ArrayList<pu0.b> arrayList2 = new ArrayList();
        for (Object obj : listC) {
            pu0.b bVar2 = (pu0.b) obj;
            if (lv0.e.a(bVar2.f141186d) || lv0.e.b(bVar2.f141191i)) {
                arrayList2.add(obj);
            }
        }
        for (pu0.b bVar3 : arrayList2) {
            for (pu0.f fVar : bVar3.f141186d) {
                if (p005kotlin.jvm.internal.s.g(fVar.f141222c, pu0.g.a.f141234a)) {
                    List listC2 = p13.w.c(fVar);
                    p13.j0 j0Var = p13.j0.f134944a;
                    List<pu0.f> list = bVar3.f141186d;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!p005kotlin.jvm.internal.s.g(((pu0.f) obj2).f141222c, pu0.g.a.f141234a)) {
                            arrayList3.add(obj2);
                        }
                    }
                    List<pu0.i> list2 = bVar3.f141191i;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!p005kotlin.jvm.internal.s.g(((pu0.i) obj3).f141262c, pu0.g.a.f141234a)) {
                            arrayList4.add(obj3);
                        }
                    }
                    arrayList.add(pu0.b.a(bVar3, listC2, null, j0Var, j0Var, arrayList3, arrayList4, 15607));
                }
            }
            for (pu0.i iVar : bVar3.f141191i) {
                if (p005kotlin.jvm.internal.s.g(iVar.f141262c, pu0.g.a.f141234a)) {
                    List listC3 = p13.w.c(iVar);
                    p13.j0 j0Var2 = p13.j0.f134944a;
                    List<pu0.f> list3 = bVar3.f141186d;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (!p005kotlin.jvm.internal.s.g(((pu0.f) obj4).f141222c, pu0.g.a.f141234a)) {
                            arrayList5.add(obj4);
                        }
                    }
                    List<pu0.i> list4 = bVar3.f141191i;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj5 : list4) {
                        if (!p005kotlin.jvm.internal.s.g(((pu0.i) obj5).f141262c, pu0.g.a.f141234a)) {
                            arrayList6.add(obj5);
                        }
                    }
                    arrayList.add(pu0.b.a(bVar3, j0Var2, null, listC3, j0Var2, arrayList5, arrayList6, 15607));
                }
            }
        }
        return new com.garmin.android.apps.connectmobile.v2.b(p13.h0.b1(arrayList), bVar.f47387b, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Comparable h(long j8, String str, v13.c cVar) {
        i0 i0Var;
        l20.a aVarC;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f104113d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f104113d = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objN = i0Var.f104111b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f104113d;
        if (i15 == 0) {
            o13.r.b(objN);
            re0.o oVar = (re0.o) KoinJavaComponent.get$default(re0.o.class, null, null, 6, null);
            i0Var.f104110a = str;
            i0Var.f104113d = 1;
            objN = oVar.n(j8, str, i0Var);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = i0Var.f104110a;
            o13.r.b(objN);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objN;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            List<l20.a> listF = ((l20.r) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).f();
            if (listF != null && (aVarC = com.garmin.android.apps.connectmobile.contacts.b.c(str, null, listF)) != null) {
                return nu0.a.a(aVarC);
            }
        } else if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
            lc.u0.r();
            return null;
        }
        return null;
    }

    public final Object i(long j8, pu0.b bVar, v13.i iVar) {
        return ((te0.j) KoinJavaComponent.get$default(te0.j.class, null, null, 6, null)).a(j8, nu0.a.b(bVar), iVar);
    }
}
