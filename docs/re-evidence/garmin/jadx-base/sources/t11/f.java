package t11;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.q;
import gl1.y;
import h82.r;
import kotlin.t3;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f161728b;

    public /* synthetic */ f(t3 t3Var, int i14) {
        this.f161727a = i14;
        this.f161728b = t3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f161727a;
        final t3 t3Var = this.f161728b;
        Object[] objArr = 0;
        int i15 = 18;
        char c14 = 1;
        final r rVar = (r) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    int i16 = ((iIntValue << 3) & 112) | 6;
                    rVar.k(z3.f.c(-403114267, new sm1.j(rVar, 15), mVar), mVar, i16);
                    rVar.j(z3.f.c(-1992202447, new sm1.j(rVar, 16), mVar), mVar, i16);
                    rVar.j(z3.f.c(1003912488, new sm1.j(rVar, 17), mVar), mVar, i16);
                    rVar.j(z3.f.c(1582678633, new sm1.j(rVar, i15), mVar), mVar, i16);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    rVar.j(z3.f.c(-2133522518, new p() { // from class: t11.g
                        /* JADX WARN: Code duplicated, block: B:14:0x003e  */
                        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i17 = objArr2;
                            m.a aVar = m.f135153a;
                            t3 t3Var2 = t3Var;
                            r rVar2 = rVar;
                            m mVar2 = (m) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            switch (i17) {
                                case 0:
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var2 = n.f135158a;
                                        String strQ = y.Q(mVar2, R.string.visit_support_center_for_more_information);
                                        boolean zR = mVar2.r(t3Var2);
                                        Object objQ = mVar2.q();
                                        if (zR) {
                                            objQ = new by1.q(t3Var2, 13);
                                            mVar2.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                objQ = new by1.q(t3Var2, 13);
                                                mVar2.K(objQ);
                                            }
                                        }
                                        rVar2.h(0, (e23.a) objQ, strQ, mVar2);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        String strQ2 = y.Q(mVar2, R.string.citation_cleveland_clinic);
                                        boolean zR2 = mVar2.r(t3Var2);
                                        Object objQ2 = mVar2.q();
                                        if (zR2) {
                                            objQ2 = new by1.q(t3Var2, 14);
                                            mVar2.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = new by1.q(t3Var2, 14);
                                                mVar2.K(objQ2);
                                            }
                                        }
                                        rVar2.h(0, (e23.a) objQ2, strQ2, mVar2);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, i16);
                } else {
                    mVar.e();
                }
                break;
            default:
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i17 = ((iIntValue << 3) & 112) | 6;
                    rVar.k(z3.f.c(-913695489, new sm1.j(rVar, 25), mVar), mVar, i17);
                    rVar.j(z3.f.c(-1253472437, new sm1.j(rVar, 26), mVar), mVar, i17);
                    rVar.j(z3.f.c(1256507842, new sm1.j(rVar, 27), mVar), mVar, i17);
                    rVar.j(z3.f.c(-439515517, new sm1.j(rVar, 20), mVar), mVar, i17);
                    rVar.j(z3.f.c(-2135538876, new sm1.j(rVar, 21), mVar), mVar, i17);
                    final char c15 = c14 == true ? 1 : 0;
                    rVar.j(z3.f.c(463405061, new p() { // from class: t11.g
                        /* JADX WARN: Code duplicated, block: B:14:0x003e  */
                        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i18 = c15;
                            m.a aVar = m.f135153a;
                            t3 t3Var2 = t3Var;
                            r rVar2 = rVar;
                            m mVar2 = (m) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            switch (i18) {
                                case 0:
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        String strQ = y.Q(mVar2, R.string.visit_support_center_for_more_information);
                                        boolean zR = mVar2.r(t3Var2);
                                        Object objQ = mVar2.q();
                                        if (zR) {
                                            objQ = new by1.q(t3Var2, 13);
                                            mVar2.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                objQ = new by1.q(t3Var2, 13);
                                                mVar2.K(objQ);
                                            }
                                        }
                                        rVar2.h(0, (e23.a) objQ, strQ, mVar2);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        String strQ2 = y.Q(mVar2, R.string.citation_cleveland_clinic);
                                        boolean zR2 = mVar2.r(t3Var2);
                                        Object objQ2 = mVar2.q();
                                        if (zR2) {
                                            objQ2 = new by1.q(t3Var2, 14);
                                            mVar2.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = new by1.q(t3Var2, 14);
                                                mVar2.K(objQ2);
                                            }
                                        }
                                        rVar2.h(0, (e23.a) objQ2, strQ2, mVar2);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, i17);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
