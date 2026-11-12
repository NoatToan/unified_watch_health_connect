package kq;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f106065b;

    public /* synthetic */ e0(g0 g0Var, int i14) {
        this.f106064a = i14;
        this.f106065b = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f106064a;
        final int i15 = 2;
        final g0 g0Var = this.f106065b;
        Object[] objArr = 0;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = g0.f106072g;
                if (mVar.n(1 & iIntValue, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    g0Var.j(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                boolean z14 = true;
                final h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = g0.f106072g;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    z14 = false;
                }
                if (mVar2.n(iIntValue2 & 1, z14)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i19 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.lbl_cycling_position, mVar2, i19);
                    c22.x0.f23314a.getClass();
                    rVar.m((iIntValue2 << 6) & 896, 2, gl1.d.W(c22.x0.f23690w9), null, mVar2);
                    int i24 = i19 | 6;
                    rVar.j(z3.f.c(-404952109, new e23.p() { // from class: kq.d0
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i25 = i15;
                            h82.r rVar2 = rVar;
                            g0 g0Var2 = g0Var;
                            switch (i25) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    int i26 = g0.f106072g;
                                    if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        c22.x0.f23314a.getClass();
                                        rVar2.q(gl1.d.W(c22.x0.f23724y9), mVar3, 0);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_lowered, R.string.lbl_lowered), new g0.b(R.drawable.cycling_position_upright, R.string.lbl_upright), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar3, 0);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar4 = (p3.m) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    int i27 = g0.f106072g;
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        rVar.o(R.string.msg_cycling_position_categories, 0, 2, null, mVar4);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_seated, R.string.activity_details_seated), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar4, 0);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar5 = (p3.m) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    int i28 = g0.f106072g;
                                    if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        c22.x0.f23314a.getClass();
                                        rVar2.q(gl1.d.W(c22.x0.f23707x9), mVar5, 0);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_aero, R.string.lbl_aero), new g0.b(R.drawable.cycling_position_upright, R.string.lbl_upright), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar5, 0);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, i24);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    rVar.j(z3.f.c(1452197308, new e23.p() { // from class: kq.d0
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i25 = objArr2;
                            h82.r rVar2 = rVar;
                            g0 g0Var2 = g0Var;
                            switch (i25) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    int i26 = g0.f106072g;
                                    if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        c22.x0.f23314a.getClass();
                                        rVar2.q(gl1.d.W(c22.x0.f23724y9), mVar3, 0);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_lowered, R.string.lbl_lowered), new g0.b(R.drawable.cycling_position_upright, R.string.lbl_upright), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar3, 0);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar4 = (p3.m) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    int i27 = g0.f106072g;
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        rVar.o(R.string.msg_cycling_position_categories, 0, 2, null, mVar4);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_seated, R.string.activity_details_seated), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar4, 0);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar5 = (p3.m) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    int i28 = g0.f106072g;
                                    if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        c22.x0.f23314a.getClass();
                                        rVar2.q(gl1.d.W(c22.x0.f23707x9), mVar5, 0);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_aero, R.string.lbl_aero), new g0.b(R.drawable.cycling_position_upright, R.string.lbl_upright), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar5, 0);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, i24);
                    rVar.j(z3.f.c(-1671561317, new ix0.f(rVar, 15), mVar2), mVar2, i24);
                } else {
                    mVar2.e();
                }
                break;
            default:
                final h82.r rVar2 = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i25 = g0.f106072g;
                rVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i26 = (iIntValue3 << 3) & 112;
                    rVar2.D(R.string.lbl_cycling_position, mVar3, i26);
                    rVar2.l(R.string.msg_cycling_position_assessment, (iIntValue3 << 6) & 896, 2, null, mVar3);
                    int i27 = i26 | 6;
                    rVar2.j(z3.f.c(-1993024070, new e23.p() { // from class: kq.d0
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i28 = i16;
                            h82.r rVar3 = rVar2;
                            g0 g0Var2 = g0Var;
                            switch (i28) {
                                case 0:
                                    p3.m mVar4 = (p3.m) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    int i29 = g0.f106072g;
                                    if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        c22.x0.f23314a.getClass();
                                        rVar3.q(gl1.d.W(c22.x0.f23724y9), mVar4, 0);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_lowered, R.string.lbl_lowered), new g0.b(R.drawable.cycling_position_upright, R.string.lbl_upright), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar4, 0);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar5 = (p3.m) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    int i210 = g0.f106072g;
                                    if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        rVar2.o(R.string.msg_cycling_position_categories, 0, 2, null, mVar5);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_seated, R.string.activity_details_seated), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar5, 0);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar6 = (p3.m) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    int i211 = g0.f106072g;
                                    if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                                        x1 x1Var6 = p3.n.f135158a;
                                        c22.x0.f23314a.getClass();
                                        rVar3.q(gl1.d.W(c22.x0.f23707x9), mVar6, 0);
                                        g0Var2.h(p13.x.k(new g0.b(R.drawable.cycling_position_aero, R.string.lbl_aero), new g0.b(R.drawable.cycling_position_upright, R.string.lbl_upright), new g0.b(R.drawable.cycling_position_standing, R.string.activity_details_standing)), mVar6, 0);
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar3), mVar3, i27);
                    rVar2.j(z3.f.c(871518001, new ix0.f(rVar2, 16), mVar3), mVar3, i27);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
