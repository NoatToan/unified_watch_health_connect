package qr;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initGasesStateCollector$1", f = "ActivityDetailsViewModel.kt", l = {3560}, m = "invokeSuspend", v = 2)
public final class q5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146451b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljr/d;", "configuration", "Lps/r;", "activitySummaryDto", "", "Lnr/n;", "<anonymous>", "(Ljr/d;Lps/r;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initGasesStateCollector$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<jr.d, ps.r, t13.d<? super List<? extends nr.n>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ jr.d f146452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ ps.r f146453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f146454c = tVar;
        }

        @Override // e23.q
        public final Object invoke(jr.d dVar, ps.r rVar, t13.d<? super List<? extends nr.n>> dVar2) {
            a aVar = new a(this.f146454c, dVar2);
            aVar.f146452a = dVar;
            aVar.f146453b = rVar;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:160:0x031b  */
        /* JADX WARN: Code duplicated, block: B:188:0x031e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:76:0x0155  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            am.x0 x0VarH;
            ArrayList arrayList;
            Object next;
            Object next2;
            ArrayList arrayListA;
            Iterator it;
            nr.n nVar;
            ps.j0 j0Var;
            ArrayList arrayList2;
            List<jr.o> listE;
            c22.o3 o3Var;
            Object p1Var;
            ls.e eVarA;
            Object objG;
            qs.y yVarH;
            qs.y yVarH2;
            int i14;
            qs.y yVarH3;
            double d14;
            double dA;
            ps.k0 diveInfoDTO;
            List<ps.j0> listF;
            List listM0;
            jr.d dVar = this.f146452a;
            ps.r rVar = this.f146453b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (rVar == null || (x0VarH = rVar.h()) == null) {
                x0VarH = am.x0.f4346x;
            }
            if (rVar == null || (diveInfoDTO = rVar.getDiveInfoDTO()) == null || (listF = diveInfoDTO.f()) == null || (listM0 = p13.h0.M0(listF)) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : listM0) {
                    if (((ps.j0) obj2).d() != qs.m.ENABLED) {
                        arrayList.add(obj2);
                    }
                }
            }
            jr.d dVar2 = new mr.s0(x0VarH, dVar).f120304a;
            Iterator<T> it3 = dVar2.a().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((jr.u) next).d() != jr.v.GASES);
            if (next != null) {
                arrayListA = mr.s0.a(arrayList, jr.j.BOTTOM_GAS);
            } else {
                Iterator<T> it4 = dVar2.a().iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (((jr.u) next2).d() != jr.v.GASES_CCR);
                arrayListA = next2 != null ? mr.s0.a(arrayList, jr.j.DILUENT_GAS) : null;
            }
            sr.b bVar = this.f146454c.f146541n;
            if (arrayListA == null) {
                return null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayListA.iterator();
            int i15 = 0;
            while (it5.hasNext()) {
                Object next3 = it5.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                jr.f fVar = (jr.f) next3;
                if (arrayList == null || (j0Var = (ps.j0) arrayList.get(i15)) == null) {
                    it = it5;
                    nVar = null;
                } else {
                    jr.i itemDetails = fVar.getItemDetails();
                    jr.j jVarC = itemDetails != null ? itemDetails.c() : null;
                    String strK = jVarC != null ? bVar.k(jVarC) : null;
                    if (strK != null) {
                        bVar.getClass();
                        if (strK.length() == 0) {
                            strK = ((sr.g) bVar.f160558s.getValue()).f160570b.a(R.string.lbl_deco_gas, String.valueOf(i15));
                        }
                    } else {
                        strK = ((sr.g) bVar.f160558s.getValue()).f160570b.a(R.string.lbl_deco_gas, String.valueOf(i15));
                    }
                    nr.o0 o0Var = new nr.o0(strK, null, null, null, 14, null);
                    jr.i itemDetails2 = fVar.getItemDetails();
                    if (itemDetails2 == null || (listE = itemDetails2.e()) == null) {
                        it = it5;
                        arrayList2 = null;
                    } else {
                        arrayList2 = new ArrayList();
                        for (jr.o oVar : listE) {
                            oVar.getClass();
                            bVar.getClass();
                            jr.p pVarB = oVar.b();
                            if (pVarB == null || (eVarA = is.m.a(pVarB)) == null) {
                                it5 = it5;
                                o3Var = null;
                            } else {
                                switch (ss.k.a.f160607a[eVarA.ordinal()]) {
                                    case 382:
                                        it5 = it5;
                                        o3Var = null;
                                        objG = j0Var.g();
                                        break;
                                    case 383:
                                        it5 = it5;
                                        o3Var = null;
                                        objG = j0Var.d();
                                        break;
                                    case 384:
                                        it5 = it5;
                                        o3Var = null;
                                        Double oxygenContent = j0Var.getOxygenContent();
                                        Integer numValueOf = oxygenContent != null ? Integer.valueOf((int) oxygenContent.doubleValue()) : null;
                                        Double heliumContent = j0Var.getHeliumContent();
                                        objG = new ns.v(numValueOf, heliumContent != null ? Integer.valueOf((int) heliumContent.doubleValue()) : null);
                                        break;
                                    case 385:
                                        it5 = it5;
                                        o3Var = null;
                                        Double oxygenContent2 = j0Var.getOxygenContent();
                                        Integer numValueOf2 = oxygenContent2 != null ? Integer.valueOf((int) oxygenContent2.doubleValue()) : null;
                                        Double heliumContent2 = j0Var.getHeliumContent();
                                        objG = new ns.v(numValueOf2, heliumContent2 != null ? Integer.valueOf((int) heliumContent2.doubleValue()) : null);
                                        break;
                                    case 386:
                                        it5 = it5;
                                        o3Var = null;
                                        objG = j0Var.getTankType();
                                        break;
                                    case 387:
                                        it5 = it5;
                                        o3Var = null;
                                        objG = new ps.h0(j0Var.getTankSize(), j0Var.getTankSizeUnit());
                                        break;
                                    case 388:
                                        it5 = it5;
                                        o3Var = null;
                                        Integer tankStartingPressure = j0Var.getTankStartingPressure();
                                        Double dValueOf = tankStartingPressure != null ? Double.valueOf(tankStartingPressure.intValue()) : null;
                                        ps.z1 tankSizeUnit = j0Var.getTankSizeUnit();
                                        objG = new ps.k1(dValueOf, (tankSizeUnit == null || (yVarH = tankSizeUnit.h()) == null) ? null : qs.z.a(yVarH));
                                        break;
                                    case 389:
                                        it5 = it5;
                                        o3Var = null;
                                        Integer tankEndingPressure = j0Var.getTankEndingPressure();
                                        Double dValueOf2 = tankEndingPressure != null ? Double.valueOf(tankEndingPressure.intValue()) : null;
                                        ps.z1 tankEndingPressureUnit = j0Var.getTankEndingPressureUnit();
                                        objG = new ps.k1(dValueOf2, (tankEndingPressureUnit == null || (yVarH2 = tankEndingPressureUnit.h()) == null) ? null : qs.z.a(yVarH2));
                                        break;
                                    case 390:
                                        Integer tankStartingPressure2 = j0Var.getTankStartingPressure();
                                        int iIntValue = tankStartingPressure2 != null ? tankStartingPressure2.intValue() : 0;
                                        Integer tankEndingPressure2 = j0Var.getTankEndingPressure();
                                        int iIntValue2 = tankEndingPressure2 != null ? tankEndingPressure2.intValue() : 0;
                                        if (j0Var.getTankStartingPressureUnit() == null || j0Var.getTankEndingPressureUnit() == null) {
                                            it5 = it5;
                                            o3Var = null;
                                            i14 = 0;
                                        } else {
                                            o3Var = null;
                                            if (j0Var.getTankEndingPressureUnit().h() != j0Var.getTankStartingPressureUnit().h()) {
                                                if (qs.y.UNIT_PRESSURE_BAR == j0Var.getTankStartingPressureUnit().h()) {
                                                    double d15 = iIntValue2;
                                                    c22.o3.a aVar2 = c22.o3.f23180d;
                                                    c22.o3 o3Var2 = c22.o3.PSI;
                                                    d14 = d15;
                                                    c22.o3 o3Var3 = c22.o3.BAR;
                                                    aVar2.getClass();
                                                    dA = c22.o3.a.a(o3Var2, o3Var3);
                                                } else {
                                                    double d16 = iIntValue2;
                                                    c22.o3.a aVar3 = c22.o3.f23180d;
                                                    c22.o3 o3Var4 = c22.o3.BAR;
                                                    d14 = d16;
                                                    c22.o3 o3Var5 = c22.o3.PSI;
                                                    aVar3.getClass();
                                                    dA = c22.o3.a.a(o3Var4, o3Var5);
                                                }
                                                iIntValue2 = (int) (dA * d14);
                                            } else {
                                                it5 = it5;
                                            }
                                            i14 = iIntValue - iIntValue2;
                                        }
                                        Double dValueOf3 = Double.valueOf(i14);
                                        ps.z1 tankSizeUnit2 = j0Var.getTankSizeUnit();
                                        objG = new ps.k1(dValueOf3, (tankSizeUnit2 == null || (yVarH3 = tankSizeUnit2.h()) == null) ? o3Var : qs.z.a(yVarH3));
                                        break;
                                    case 391:
                                        Double volume = j0Var.getVolume();
                                        if (volume != null) {
                                            objG = Integer.valueOf((int) volume.doubleValue());
                                            it5 = it5;
                                            o3Var = null;
                                        } else {
                                            it5 = it5;
                                            o3Var = null;
                                            objG = null;
                                        }
                                        break;
                                    case 392:
                                        objG = new ps.h0(j0Var.getSacRate(), j0Var.getTankStartingPressureUnit());
                                        it5 = it5;
                                        o3Var = null;
                                        break;
                                    default:
                                        it5 = it5;
                                        o3Var = null;
                                        objG = null;
                                        break;
                                }
                                String strB = ss.k.b(eVarA, bVar.f160541b, objG, ss.k.g(eVarA));
                                if (strB != null) {
                                    p1Var = new r22.p1(bVar.i(eVarA), strB, null, null, null, null, null, 124, null);
                                }
                                if (p1Var != null) {
                                    arrayList2.add(p1Var);
                                }
                                it5 = it5;
                            }
                            p1Var = o3Var;
                            if (p1Var != null) {
                                arrayList2.add(p1Var);
                            }
                            it5 = it5;
                        }
                        it = it5;
                    }
                    nVar = new nr.n(o0Var, arrayList2);
                }
                if (nVar != null) {
                    arrayList3.add(nVar);
                }
                it5 = it;
                i15 = i16;
            }
            return arrayList3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146455a;

        public b(t tVar) {
            this.f146455a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            List list = (List) obj;
            r53.p2 p2Var = this.f146455a.O1;
            if (list == null) {
                list = p13.j0.f134944a;
            }
            p2Var.k(null, new nr.t.c(list));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(t tVar, t13.d<? super q5> dVar) {
        super(2, dVar);
        this.f146451b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q5(this.f146451b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146450a;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = this.f146451b;
            r53.u1 u1Var = new r53.u1(tVar.F, tVar.W4(), new a(tVar, null));
            b bVar = new b(tVar);
            this.f146450a = 1;
            if (u1Var.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
