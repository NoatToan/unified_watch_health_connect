package ll1;

import c2.b0;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import cr.s;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.h7;
import i3.i7;
import l72.f0;
import l72.u0;
import l72.w;
import nw0.q;
import nw0.x;
import o72.u1;
import ov1.o;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import u1.a2;
import v62.s6;
import v62.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f113396b;

    public /* synthetic */ g(e23.a aVar, int i14) {
        this.f113395a = i14;
        this.f113396b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x030d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0439  */
    /* JADX WARN: Code duplicated, block: B:192:0x0510  */
    /* JADX WARN: Code duplicated, block: B:231:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:246:0x063d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x020d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0273  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c1  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f113395a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f113396b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                h.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f113396b, null, y.Q(mVar, R.string.devices_page_title), mVar, null);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f113396b, null, y.Q(mVar2, R.string.lbl_adaptive_training_plan), mVar2, null);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f113396b, null, y.Q(mVar3, R.string.lbl_adaptive_training_plan), mVar3, null);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    f0.f110999a.d(384, 9, this.f113396b, x2.f(r.S, 1.0f), y.Q(mVar4, R.string.lbl_i_accept), mVar4, null, false);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    f0.f110999a.i(y.Q(mVar5, R.string.lbl_i_do_not_accept), x2.f(r.S, 1.0f), false, this.f113396b, mVar5, 48, 4);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i15 = PreviewCatalogActivity.f49781a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean zB = mVar6.B(aVar2);
                    Object objQ = mVar6.q();
                    if (zB) {
                        objQ = new ll0.a(aVar2, 10);
                        mVar6.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ll0.a(aVar2, 10);
                            mVar6.K(objQ);
                        }
                    }
                    u0.a(null, null, null, null, (e23.a) objQ, mVar6, 0, 15);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    boolean zB2 = mVar7.B(aVar2);
                    Object objQ2 = mVar7.q();
                    if (zB2) {
                        objQ2 = new ll0.a(aVar2, 12);
                        mVar7.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ll0.a(aVar2, 12);
                            mVar7.K(objQ2);
                        }
                    }
                    u0.a(null, null, null, null, (e23.a) objQ2, mVar7, 0, 15);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                mg2.b.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f113396b, null, y.Q(mVar8, R.string.lbl_connected_apps), mVar8, null);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f113396b, null, y.Q(mVar9, R.string.lbl_connected_apps), mVar9, null);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                mk1.g.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strQ = y.Q(mVar10, R.string.lbl_add);
                    boolean zB3 = mVar10.B(aVar2);
                    Object objQ3 = mVar10.q();
                    if (zB3) {
                        objQ3 = new ll0.a(aVar2, 21);
                        mVar10.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ll0.a(aVar2, 21);
                            mVar10.K(objQ3);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ3, null, strQ, mVar10, null);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ml0.h.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ml0.h.e(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    s.a(aVar2, mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f113396b, null, y.Q(mVar12, R.string.concept_workouts), mVar12, null);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 17:
                boolean z14 = false;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if ((iIntValue13 & 3) != 2) {
                    z14 = true;
                }
                if (mVar13.n(iIntValue13 & 1, z14)) {
                    x1 x1Var13 = p3.n.f135158a;
                    r.a aVar3 = r.S;
                    h4.d.f81522a.getClass();
                    r rVarX = x2.x(aVar3, h4.d.a.f81533k, 2);
                    String strQ2 = y.Q(mVar13, R.string.msg_no_data_available);
                    String strQ3 = y.Q(mVar13, R.string.running_tolerance_no_data_available_msg);
                    String strQ4 = y.Q(mVar13, R.string.common_learn_more);
                    boolean zB4 = mVar13.B(aVar2);
                    Object objQ4 = mVar13.q();
                    if (zB4) {
                        objQ4 = new ll0.a(aVar2, 26);
                        mVar13.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ll0.a(aVar2, 26);
                            mVar13.K(objQ4);
                        }
                    }
                    b82.n.d(null, strQ2, strQ3, rVarX, strQ4, (e23.a) objQ4, null, null, mVar13, 3072, 193);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                nf1.d.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    u0.a(null, null, null, null, this.f113396b, mVar14, 0, 15);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                q.f(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    nw0.c.f128001a.getClass();
                    h7.a(this.f113396b, null, false, null, null, nw0.c.f128003c, mVar15, 1572864, 62);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f113396b, null, y.Q(mVar16, R.string.mct_reminders), mVar16, null);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    String strQ5 = y.Q(mVar17, R.string.nutrition_developer_menu);
                    boolean zB5 = mVar17.B(aVar2);
                    Object objQ5 = mVar17.q();
                    if (zB5) {
                        objQ5 = new x(aVar2, 4);
                        mVar17.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new x(aVar2, 4);
                            mVar17.K(objQ5);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ5, null, strQ5, mVar17, null);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    w wVar = w.f111301a;
                    boolean zB6 = mVar18.B(aVar2);
                    Object objQ6 = mVar18.q();
                    if (zB6) {
                        objQ6 = new x(aVar2, 8);
                        mVar18.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new x(aVar2, 8);
                            mVar18.K(objQ6);
                        }
                    }
                    wVar.j(6, (e23.a) objQ6, "Action", mVar18);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    boolean zB7 = mVar19.B(aVar2);
                    Object objQ7 = mVar19.q();
                    if (zB7) {
                        objQ7 = new x(aVar2, 9);
                        mVar19.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new x(aVar2, 9);
                            mVar19.K(objQ7);
                        }
                    }
                    u0.a(null, null, "Close", null, (e23.a) objQ7, mVar19, 384, 11);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                u1.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    r.a aVar4 = r.S;
                    r rVarD = c2.l.D(a2.b(aVar4, a2.a(mVar20), true));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar20, 0);
                    int iHashCode = Long.hashCode(mVar20.getU());
                    i2 i2VarX = mVar20.x();
                    r rVarC = h4.k.c(rVarD, mVar20);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar20.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar20.z();
                    if (mVar20.getT()) {
                        mVar20.M(aVar5);
                    } else {
                        mVar20.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar20);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar20);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar20.getT() || !p005kotlin.jvm.internal.s.g(mVar20.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar20, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar20);
                    b0 b0Var = b0.f22601a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = x3.a(t62.b.f162798a);
                    String strQ6 = y.Q(mVar20, R.string.start_tracking_your_gear);
                    String strQ7 = y.Q(mVar20, R.string.add_gear_monitor_replace_more);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarC2 = c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    String strQ8 = y.Q(mVar20, R.string.lbl_gear_add);
                    boolean zB8 = mVar20.B(aVar2);
                    Object objQ8 = mVar20.q();
                    if (zB8) {
                        objQ8 = new x(aVar2, 24);
                        mVar20.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new x(aVar2, 24);
                            mVar20.K(objQ8);
                        }
                    }
                    b82.n.d(dVarA, strQ6, strQ7, rVarC2, strQ8, (e23.a) objQ8, null, null, mVar20, 0, 192);
                    mVar20.y();
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f113396b, null, y.Q(mVar21, R.string.lbl_settings), mVar21, null);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    r.a aVar6 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar22.getU());
                    i2 i2VarX2 = mVar22.x();
                    r rVarC3 = h4.k.c(aVar6, mVar22);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar22.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar22.z();
                    if (mVar22.getT()) {
                        mVar22.M(aVar7);
                    } else {
                        mVar22.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar22);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar22);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar22.getT() || !p005kotlin.jvm.internal.s.g(mVar22.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar22, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar22);
                    u uVar = u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = s6.a(t62.b.f162798a);
                    String strQ9 = y.Q(mVar22, R.string.lbl_add);
                    long jG = fb1.c.g(d92.b.f58623a, mVar22);
                    d92.b.f58625c.getClass();
                    r rVarQ = x2.q(aVar6, j92.b.f97901d.f97905d);
                    boolean zB9 = mVar22.B(aVar2);
                    Object objQ9 = mVar22.q();
                    if (zB9) {
                        objQ9 = new o(aVar2, 18);
                        mVar22.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new o(aVar2, 18);
                            mVar22.K(objQ9);
                        }
                    }
                    i7.b(dVarA2, strQ9, u1.w.d(rVarQ, false, null, null, (e23.a) objQ9, 15), jG, mVar22, 0, 0);
                    mVar22.y();
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(e23.a aVar, int i14, int i15) {
        this.f113395a = i15;
        this.f113396b = aVar;
    }
}
