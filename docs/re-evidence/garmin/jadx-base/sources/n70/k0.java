package n70;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 implements r53.i<com.garmin.android.apps.connectmobile.dashboard.presentation.c.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f124346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j70.r f124347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f124348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f124349e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f124351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j70.r f124352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f124353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f124354e;

        /* JADX INFO: renamed from: n70.k0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$$inlined$map$1$2", f = "GetDashboardItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2364a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124355a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124356b;

            public C2364a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124355a = obj;
                this.f124356b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, c0 c0Var, j70.r rVar, List list, boolean z14) {
            this.f124350a = jVar;
            this.f124351b = c0Var;
            this.f124352c = rVar;
            this.f124353d = list;
            this.f124354e = z14;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x03d2  */
        /* JADX WARN: Code duplicated, block: B:74:0x03d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2364a c2364a;
            Iterator<T> it;
            int i14;
            t13.d dVar2;
            Object objB;
            t13.d dVar3;
            r70.s sVarB;
            r70.s sVarB2;
            if (dVar instanceof C2364a) {
                c2364a = (C2364a) dVar;
                int i15 = c2364a.f124356b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c2364a.f124356b = i15 - Integer.MIN_VALUE;
                } else {
                    c2364a = new C2364a(dVar);
                }
            } else {
                c2364a = new C2364a(dVar);
            }
            Object obj2 = c2364a.f124355a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = c2364a.f124356b;
            int i17 = 1;
            t13.d dVar4 = null;
            if (i16 == 0) {
                o13.r.b(obj2);
                Set set = (Set) obj;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                StringBuilder sb3 = new StringBuilder("GetDashboardItemsUseCase focusType[");
                j70.r rVar = this.f124352c;
                sb3.append(rVar);
                sb3.append("] config sections ");
                sb3.append(set);
                String string = sb3.toString();
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var, string);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = set.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    c0 c0Var = this.f124351b;
                    if (zHasNext) {
                        o70.f fVar = (o70.f) it3.next();
                        switch (c0.b.f124089a[fVar.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                it = it3;
                                i14 = i17;
                                String strA = fVar.a();
                                try {
                                    dVar2 = null;
                                    dVar3 = null;
                                    try {
                                        objB = (r70.s) KoinJavaComponent.get$default(r70.s.class, QualifierKt.named(strA), null, 4, null);
                                    } catch (Exception unused) {
                                        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                                        String strConcat = "Failed to get dashboard item state holder with qualifier: ".concat(strA);
                                        aVar2.getClass();
                                        com.garmin.android.apps.connectmobile.i2.a.o(a2Var2, strConcat);
                                        objB = dVar2;
                                        dVar3 = dVar2;
                                    }
                                } catch (Exception unused2) {
                                    dVar2 = null;
                                }
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 14:
                                it = it3;
                                i14 = i17;
                                sVarB = m70.f.b(c0Var.f124063a.T2(), fVar.a());
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 15:
                                it = it3;
                                i14 = i17;
                                sVarB = m70.f.b(new c1(c0.a(c0Var)), fVar.a());
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 16:
                                it = it3;
                                i14 = i17;
                                String strA2 = fVar.a();
                                q6 q6Var = c0Var.f124066d;
                                ed0.a.f63825a.getClass();
                                r53.z1 z1Var = ed0.a.f63831g;
                                r53.b bVarF = r53.s.f(new p6(q6Var.f124517a, null));
                                x53.c cVar = o53.s0.f129406a;
                                sVarB = m70.f.b(new r53.u1(z1Var, r53.s.A(bVarF, x53.b.f189152a), new r6(q6Var, null)), strA2);
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 17:
                                it = it3;
                                i14 = i17;
                                String strA3 = fVar.a();
                                s6 s6Var = c0Var.f124067e;
                                sVarB = m70.f.b(new t6(s6Var.f124571a.b(), s6Var), strA3);
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 18:
                                it = it3;
                                i14 = i17;
                                sVarB = m70.f.b((r53.o2) c0Var.f124086x.getValue(), fVar.a());
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 19:
                                it = it3;
                                i14 = i17;
                                sVarB = m70.f.b(new d1((r53.o2) c0Var.f124075m.getValue()), fVar.a());
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 20:
                                it = it3;
                                i14 = i17;
                                sVarB = m70.f.b(new e1(c0Var.f124078p), fVar.a());
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 21:
                                it = it3;
                                i14 = i17;
                                sVarB = m70.f.b(r53.s.m(c0Var.f124078p, (r53.o2) c0Var.f124079q.getValue(), (r53.o2) c0Var.f124083u.getValue(), c0Var.f124072j.f13011j, new u0(null)), fVar.a());
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 22:
                                it = it3;
                                i14 = i17;
                                sVarB = m70.f.b(new r53.u1(c0.a(c0Var), c0Var.c(rVar, this.f124354e), new v0(dVar4)), fVar.a());
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 23:
                                it = it3;
                                i14 = i17;
                                t13.d dVar5 = dVar4;
                                objB = m70.f.b(new r53.u1((r53.o2) c0Var.f124083u.getValue(), c0.b(c0Var), new w0(dVar5)), fVar.a());
                                dVar3 = dVar5;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 24:
                                it = it3;
                                i14 = i17;
                                t13.d dVar6 = dVar4;
                                objB = m70.f.b(new r53.u1((r53.o2) c0Var.f124085w.getValue(), c0.b(c0Var), new x0(dVar6)), fVar.a());
                                dVar3 = dVar6;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 25:
                                it = it3;
                                i14 = i17;
                                dVar3 = null;
                                objB = m70.f.b(r53.s.l((r53.o2) c0Var.f124084v.getValue(), c0.b(c0Var), (r53.o2) c0Var.f124083u.getValue(), new y0(null)), fVar.a());
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 26:
                                it = it3;
                                i14 = i17;
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                if (com.garmin.android.apps.connectmobile.k1.f37122a.I0()) {
                                    sVarB = m70.f.b(new r53.u1(c0.a(c0Var), r53.s.s(new e0(c0Var.f124063a.p())), new z0(c0Var, null)), fVar.a());
                                } else {
                                    sVarB = null;
                                }
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 27:
                                i14 = i17;
                                String strA4 = fVar.a();
                                p2 p2Var = c0Var.f124069g;
                                r53.i iVarS = r53.s.s(new g0(c0Var.f124063a.p()));
                                l0 l0Var = new l0(c0Var);
                                m0 m0Var = new m0(c0Var);
                                n0 n0Var = new n0(c0Var);
                                it = it3;
                                sVarB = m70.f.b(r53.s.N(r53.s.s(iVarS), new t2(null, p2Var, l0Var, new p0(c0Var), m0Var, new o0(c0Var), n0Var, new q0(c0Var))), strA4);
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 28:
                                i14 = i17;
                                sVarB2 = m70.f.b(new r53.u1(c0.a(c0Var), r53.s.s(new h0(c0Var.f124063a.p())), new r0(c0Var, null)), fVar.a());
                                it = it3;
                                sVarB = sVarB2;
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 29:
                                i14 = i17;
                                String strA5 = fVar.a();
                                r53.o2 o2VarA = c0.a(c0Var);
                                l70.c cVar2 = c0Var.f124063a;
                                r53.u1 u1Var = c0Var.f124078p;
                                r53.o2 o2Var = (r53.o2) c0Var.f124079q.getValue();
                                r53.i iVarS2 = r53.s.s(new i0(cVar2.p()));
                                r53.i iVarB = c0.b(c0Var);
                                r53.i iVarS3 = r53.s.s(new j0(cVar2.p()));
                                r53.i[] iVarArr = new r53.i[6];
                                iVarArr[0] = o2VarA;
                                iVarArr[i14] = u1Var;
                                iVarArr[2] = o2Var;
                                iVarArr[3] = iVarS2;
                                iVarArr[4] = iVarB;
                                iVarArr[5] = iVarS3;
                                sVarB2 = m70.f.b(new a1(iVarArr, c0Var), strA5);
                                it = it3;
                                sVarB = sVarB2;
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 30:
                                String strA6 = fVar.a();
                                r53.o2 o2VarA2 = c0.a(c0Var);
                                l70.c cVar3 = c0Var.f124063a;
                                r53.u1 u1Var2 = c0Var.f124078p;
                                i14 = i17;
                                r53.o2 o2Var2 = (r53.o2) c0Var.f124079q.getValue();
                                r53.i iVarS4 = r53.s.s(new f0(cVar3.p()));
                                r53.i iVarB2 = c0.b(c0Var);
                                r53.i iVarS5 = r53.s.s(new j0(cVar3.p()));
                                r53.i[] iVarArr2 = new r53.i[6];
                                iVarArr2[0] = o2VarA2;
                                iVarArr2[i14] = u1Var2;
                                iVarArr2[2] = o2Var2;
                                iVarArr2[3] = iVarS4;
                                iVarArr2[4] = iVarB2;
                                iVarArr2[5] = iVarS5;
                                sVarB2 = m70.f.b(new b1(iVarArr2, c0Var), strA6);
                                it = it3;
                                sVarB = sVarB2;
                                dVar3 = null;
                                objB = sVarB;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 31:
                                it = it3;
                                i14 = i17;
                                t13.d dVar7 = dVar4;
                                dVar3 = dVar7;
                                objB = dVar7;
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            case 32:
                                it = it3;
                                i14 = i17;
                                dVar3 = dVar4;
                                objB = m70.f.b((r53.o2) c0Var.f124088z.getValue(), fVar.a());
                                if (objB != null) {
                                    arrayList2.add(objB);
                                }
                                it3 = it;
                                dVar4 = dVar3;
                                i17 = i14;
                                break;
                            default:
                                lc.u0.r();
                                return dVar4;
                        }
                    } else {
                        int i18 = i17;
                        arrayList.addAll(arrayList2);
                        String strH4 = c0Var.f124073k.h4();
                        com.garmin.android.apps.connectmobile.dashboard.presentation.c.b bVar = new com.garmin.android.apps.connectmobile.dashboard.presentation.c.b(arrayList, (strH4 == null || strH4.equals(j70.r.f97629l.f97636a)) ? 0 : i18);
                        c2364a.f124356b = i18;
                        if (this.f124350a.emit(bVar, c2364a) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public k0(r53.i iVar, c0 c0Var, j70.r rVar, List list, boolean z14) {
        this.f124345a = iVar;
        this.f124346b = c0Var;
        this.f124347c = rVar;
        this.f124348d = list;
        this.f124349e = z14;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super com.garmin.android.apps.connectmobile.dashboard.presentation.c.b> jVar, t13.d dVar) {
        Object objCollect = this.f124345a.collect(new a(jVar, this.f124346b, this.f124347c, this.f124348d, this.f124349e), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
