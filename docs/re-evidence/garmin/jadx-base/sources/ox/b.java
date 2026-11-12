package ox;

import e2.i0;
import e2.k0;
import e23.p;
import ix.j;
import java.util.ArrayList;
import java.util.List;
import l72.j0;
import p005kotlin.Unit;
import p13.x;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f134316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f134317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f134318d;

    public /* synthetic */ b(i53.c cVar, j jVar, ArrayList arrayList, int i14) {
        this.f134315a = i14;
        this.f134316b = cVar;
        this.f134317c = jVar;
        this.f134318d = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f134315a;
        m.a aVar = m.f135153a;
        final ArrayList arrayList = this.f134318d;
        final j jVar = this.f134317c;
        final int i15 = 0;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    i0 i0VarA = k0.a(0, 0, 3, mVar);
                    f82.a aVar2 = new f82.a();
                    boolean zR = mVar.r(jVar) | mVar.r(arrayList);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new p() { // from class: ox.c
                            @Override // e23.p
                            public final Object invoke(Object obj3, Object obj4) {
                                int i17 = i15;
                                List list = (List) obj3;
                                ((Integer) obj4).getClass();
                                switch (i17) {
                                    case 0:
                                        list.getClass();
                                        ArrayList arrayList2 = new ArrayList();
                                        ArrayList arrayList3 = arrayList;
                                        int i18 = 0;
                                        for (Object obj5 : arrayList3) {
                                            int i19 = i18 + 1;
                                            if (i18 < 0) {
                                                x.q();
                                                throw null;
                                            }
                                            if (((j0) list.get(i18)).f111076e) {
                                                arrayList2.add(obj5);
                                            }
                                            i18 = i19;
                                        }
                                        jVar.z4(arrayList3, arrayList2);
                                        return Unit.INSTANCE;
                                    default:
                                        list.getClass();
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = arrayList;
                                        int i24 = 0;
                                        for (Object obj6 : arrayList5) {
                                            int i25 = i24 + 1;
                                            if (i24 < 0) {
                                                x.q();
                                                throw null;
                                            }
                                            if (((j0) list.get(i24)).f111076e) {
                                                arrayList4.add(obj6);
                                            }
                                            i24 = i25;
                                        }
                                        jVar.z4(arrayList5, arrayList4);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new p() { // from class: ox.c
                                @Override // e23.p
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i17 = i15;
                                    List list = (List) obj3;
                                    ((Integer) obj4).getClass();
                                    switch (i17) {
                                        case 0:
                                            list.getClass();
                                            ArrayList arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = arrayList;
                                            int i18 = 0;
                                            for (Object obj5 : arrayList3) {
                                                int i19 = i18 + 1;
                                                if (i18 < 0) {
                                                    x.q();
                                                    throw null;
                                                }
                                                if (((j0) list.get(i18)).f111076e) {
                                                    arrayList2.add(obj5);
                                                }
                                                i18 = i19;
                                            }
                                            jVar.z4(arrayList3, arrayList2);
                                            return Unit.INSTANCE;
                                        default:
                                            list.getClass();
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = arrayList;
                                            int i24 = 0;
                                            for (Object obj6 : arrayList5) {
                                                int i25 = i24 + 1;
                                                if (i24 < 0) {
                                                    x.q();
                                                    throw null;
                                                }
                                                if (((j0) list.get(i24)).f111076e) {
                                                    arrayList4.add(obj6);
                                                }
                                                i24 = i25;
                                            }
                                            jVar.z4(arrayList5, arrayList4);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    e82.a.b(this.f134316b, aVar2, i0VarA, null, null, (p) objQ, mVar, 0, 24);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    i0 i0VarA2 = k0.a(0, 0, 3, mVar2);
                    f82.a aVar3 = new f82.a();
                    boolean zR2 = mVar2.r(jVar) | mVar2.r(arrayList);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new p() { // from class: ox.c
                            @Override // e23.p
                            public final Object invoke(Object obj3, Object obj4) {
                                int i17 = i16;
                                List list = (List) obj3;
                                ((Integer) obj4).getClass();
                                switch (i17) {
                                    case 0:
                                        list.getClass();
                                        ArrayList arrayList2 = new ArrayList();
                                        ArrayList arrayList3 = arrayList;
                                        int i18 = 0;
                                        for (Object obj5 : arrayList3) {
                                            int i19 = i18 + 1;
                                            if (i18 < 0) {
                                                x.q();
                                                throw null;
                                            }
                                            if (((j0) list.get(i18)).f111076e) {
                                                arrayList2.add(obj5);
                                            }
                                            i18 = i19;
                                        }
                                        jVar.z4(arrayList3, arrayList2);
                                        return Unit.INSTANCE;
                                    default:
                                        list.getClass();
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = arrayList;
                                        int i24 = 0;
                                        for (Object obj6 : arrayList5) {
                                            int i25 = i24 + 1;
                                            if (i24 < 0) {
                                                x.q();
                                                throw null;
                                            }
                                            if (((j0) list.get(i24)).f111076e) {
                                                arrayList4.add(obj6);
                                            }
                                            i24 = i25;
                                        }
                                        jVar.z4(arrayList5, arrayList4);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new p() { // from class: ox.c
                                @Override // e23.p
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i17 = i16;
                                    List list = (List) obj3;
                                    ((Integer) obj4).getClass();
                                    switch (i17) {
                                        case 0:
                                            list.getClass();
                                            ArrayList arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = arrayList;
                                            int i18 = 0;
                                            for (Object obj5 : arrayList3) {
                                                int i19 = i18 + 1;
                                                if (i18 < 0) {
                                                    x.q();
                                                    throw null;
                                                }
                                                if (((j0) list.get(i18)).f111076e) {
                                                    arrayList2.add(obj5);
                                                }
                                                i18 = i19;
                                            }
                                            jVar.z4(arrayList3, arrayList2);
                                            return Unit.INSTANCE;
                                        default:
                                            list.getClass();
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = arrayList;
                                            int i24 = 0;
                                            for (Object obj6 : arrayList5) {
                                                int i25 = i24 + 1;
                                                if (i24 < 0) {
                                                    x.q();
                                                    throw null;
                                                }
                                                if (((j0) list.get(i24)).f111076e) {
                                                    arrayList4.add(obj6);
                                                }
                                                i24 = i25;
                                            }
                                            jVar.z4(arrayList5, arrayList4);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    e82.a.b(this.f134316b, aVar3, i0VarA2, null, null, (p) objQ2, mVar2, 0, 24);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
