package a42;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import f5.z0;
import i3.h7;
import i3.i7;
import i3.mh;
import l72.i3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import t21.r0;
import v62.b3;
import v62.n1;
import w51.o0;
import zo1.w0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1000c;

    public /* synthetic */ e(boolean z14, e23.a aVar) {
        this.f998a = 1;
        this.f999b = aVar;
        this.f1000c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x046c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0561  */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:205:0x0657  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:235:0x070d  */
    /* JADX WARN: Code duplicated, block: B:266:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:343:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x016b  */
    /* JADX WARN: Code duplicated, block: B:86:0x026c  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f998a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f999b;
        boolean z14 = this.f1000c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                h.b(z14, aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new e52.c(aVar2, 22);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e52.c(aVar2, 22);
                            mVar.K(objQ);
                        }
                    }
                    h7.a((e23.a) objQ, null, false, null, null, z3.f.c(412896395, new an1.i(z14, 20), mVar), mVar, 1572864, 62);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_lifestyle_logging);
                    if (z14) {
                        mVar2.C(2143737857);
                        z02.f.c(0, 54, null, this.f999b, null, strQ, mVar2, null);
                        mVar2.f();
                    } else {
                        mVar2.C(2143894469);
                        z02.f.a(0, 59, null, null, null, strQ, mVar2, null);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (z14) {
                        mVar3.C(-1243878357);
                        wv0.x.a(null, aVar2, mVar3, 0, 1);
                        mVar3.f();
                    } else {
                        mVar3.C(-1243796672);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    l72.f0.f110999a.d(384, 1, this.f999b, x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar4, R.string.lbl_next), mVar4, null, this.f1000c);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    l72.f0.f110999a.d(384, 1, this.f999b, x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar5, R.string.lbl_next), mVar5, null, this.f1000c);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (z14) {
                        mVar6.C(959384333);
                        l72.f0.f110999a.d(384, 9, this.f999b, x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar6, R.string.lbl_got_it), mVar6, null, false);
                        mVar6.f();
                    } else {
                        mVar6.C(959604960);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                k62.f.a(z14, aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (z14) {
                        mVar7.C(1348726121);
                        boolean zB2 = mVar7.B(aVar2);
                        Object objQ2 = mVar7.q();
                        if (zB2) {
                            objQ2 = new kb0.p(aVar2, 6);
                            mVar7.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new kb0.p(aVar2, 6);
                                mVar7.K(objQ2);
                            }
                        }
                        kj2.a.f104975a.getClass();
                        h7.a((e23.a) objQ2, null, false, null, null, kj2.a.f104976b, mVar7, 1572864, 62);
                        mVar7.f();
                    } else {
                        mVar7.C(1349172025);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    if (z14) {
                        mVar8.C(466155806);
                        ll1.h.a(aVar2, mVar8, 0);
                        mVar8.f();
                    } else {
                        mVar8.C(466235569);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (z14) {
                        mVar9.C(-181184517);
                        String strQ2 = gl1.y.Q(mVar9, R.string.connection_request_sent);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar9), mVar9, 0, 0, 131070);
                        mVar9.f();
                    } else {
                        mVar9.C(-181381367);
                        l72.f0.a aVar3 = l72.f0.a.f111000a;
                        String strQ3 = gl1.y.Q(mVar9, R.string.smart_scale_label_invite);
                        boolean zB3 = mVar9.B(aVar2);
                        Object objQ3 = mVar9.q();
                        if (zB3) {
                            objQ3 = new ll0.a(aVar2, 17);
                            mVar9.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new ll0.a(aVar2, 17);
                                mVar9.K(objQ3);
                            }
                        }
                        aVar3.f(strQ3, null, false, (e23.a) objQ3, mVar9, 0, 6);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    l72.f0.f110999a.d(384, 1, this.f999b, x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar10, R.string.lbl_next), mVar10, null, this.f1000c);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    if (z14) {
                        mVar11.C(930639206);
                        h4.r.a aVar4 = h4.r.S;
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar11.getU());
                        i2 i2VarX = mVar11.x();
                        h4.r rVarC = h4.k.c(aVar4, mVar11);
                        h5.g.V.getClass();
                        h5.e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar11.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar11.z();
                        if (mVar11.getT()) {
                            mVar11.M(aVar5);
                        } else {
                            mVar11.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar11);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar11);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar11, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar11);
                        c2.u uVar = c2.u.f22885a;
                        s62.a.f157643a.getClass();
                        u4.d dVarA = n1.a(t62.b.f162798a);
                        long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar11);
                        String strQ4 = gl1.y.Q(mVar11, R.string.lbl_remove);
                        d92.b.f58625c.getClass();
                        h4.r rVarQ = x2.q(aVar4, j92.b.f97901d.f97905d);
                        boolean zB4 = mVar11.B(aVar2);
                        Object objQ4 = mVar11.q();
                        if (zB4) {
                            objQ4 = new ov1.o(aVar2, 14);
                            mVar11.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new ov1.o(aVar2, 14);
                                mVar11.K(objQ4);
                            }
                        }
                        i7.b(dVarA, strQ4, u1.w.d(rVarQ, false, null, null, (e23.a) objQ4, 15), jA, mVar11, 0, 0);
                        mVar11.y();
                        mVar11.f();
                    } else {
                        mVar11.C(931234065);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    if (z14) {
                        mVar12.C(-118732764);
                        h4.r.a aVar6 = h4.r.S;
                        h4.d.f81522a.getClass();
                        z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode2 = Long.hashCode(mVar12.getU());
                        i2 i2VarX2 = mVar12.x();
                        h4.r rVarC2 = h4.k.c(aVar6, mVar12);
                        h5.g.V.getClass();
                        h5.e0.a aVar7 = h5.g.a.f81805b;
                        if (mVar12.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar12.z();
                        if (mVar12.getT()) {
                            mVar12.M(aVar7);
                        } else {
                            mVar12.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD2, mVar12);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar12);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar12, iHashCode2, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar12);
                        c2.u uVar2 = c2.u.f22885a;
                        s62.a.f157643a.getClass();
                        u4.d dVarA2 = n1.a(t62.b.f162798a);
                        long jA2 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar12);
                        String strQ5 = gl1.y.Q(mVar12, R.string.lbl_remove);
                        d92.b.f58625c.getClass();
                        h4.r rVarQ2 = x2.q(aVar6, j92.b.f97901d.f97905d);
                        boolean zB5 = mVar12.B(aVar2);
                        Object objQ5 = mVar12.q();
                        if (zB5) {
                            objQ5 = new ov1.o(aVar2, 15);
                            mVar12.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new ov1.o(aVar2, 15);
                                mVar12.K(objQ5);
                            }
                        }
                        i7.b(dVarA2, strQ5, u1.w.d(rVarQ2, false, null, null, (e23.a) objQ5, 15), jA2, mVar12, 0, 0);
                        mVar12.y();
                        mVar12.f();
                    } else {
                        mVar12.C(-118136944);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    if (z14) {
                        mVar13.C(-941693930);
                        h4.r.a aVar8 = h4.r.S;
                        h4.d.f81522a.getClass();
                        z0 z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode3 = Long.hashCode(mVar13.getU());
                        i2 i2VarX3 = mVar13.x();
                        h4.r rVarC3 = h4.k.c(aVar8, mVar13);
                        h5.g.V.getClass();
                        h5.e0.a aVar9 = h5.g.a.f81805b;
                        if (mVar13.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar13.z();
                        if (mVar13.getT()) {
                            mVar13.M(aVar9);
                        } else {
                            mVar13.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD3, mVar13);
                        b4.c(h5.g.a.f81809f, i2VarX3, mVar13);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar13.getT() || !p005kotlin.jvm.internal.s.g(mVar13.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar13, iHashCode3, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, mVar13);
                        c2.u uVar3 = c2.u.f22885a;
                        s62.a.f157643a.getClass();
                        u4.d dVarA3 = b3.a(t62.b.f162798a);
                        long jA3 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar13);
                        String strQ6 = gl1.y.Q(mVar13, R.string.lbl_edit);
                        d92.b.f58625c.getClass();
                        h4.r rVarQ3 = x2.q(aVar8, j92.b.f97901d.f97904c);
                        boolean zB6 = mVar13.B(aVar2);
                        Object objQ6 = mVar13.q();
                        if (zB6) {
                            objQ6 = new ov1.o(aVar2, 17);
                            mVar13.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new ov1.o(aVar2, 17);
                                mVar13.K(objQ6);
                            }
                        }
                        i7.b(dVarA3, strQ6, u1.w.d(rVarQ3, false, null, null, (e23.a) objQ6, 15), jA3, mVar13, 0, 0);
                        mVar13.y();
                        mVar13.f();
                    } else {
                        mVar13.C(-941135589);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    z3.e eVarC = z3.f.c(-1295303991, new q31.e.b(z14, aVar2), mVar14);
                    q31.b.f142405a.getClass();
                    b82.c.c(eVarC, q31.b.f142409e, mVar14, 54);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    if (z14) {
                        mVar15.C(-115731437);
                        String strQ7 = gl1.y.Q(mVar15, R.string.lbl_message_komoot_already_connected);
                        d6.h.f57752b.getClass();
                        int i15 = d6.h.f57755e;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0Var = j92.f.f97931h;
                        w5.f0.f182097b.getClass();
                        w5.f0 f0Var = w5.f0.f182104i;
                        h4.r.a aVar10 = h4.r.S;
                        d92.b.f58625c.getClass();
                        mh.c(strQ7, x2.f(c2.l.y(aVar10, j92.b.f97899b.f97920e), 1.0f), 0L, null, 0L, f0Var, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0Var, mVar15, 1572864, 0, 129980);
                        mVar15.f();
                    } else {
                        mVar15.C(-116122905);
                        l72.f0 f0Var2 = l72.f0.f110999a;
                        String strQ8 = gl1.y.Q(mVar15, R.string.btn_connect_komoot);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        boolean zB7 = mVar15.B(aVar2);
                        Object objQ7 = mVar15.q();
                        if (zB7) {
                            objQ7 = new pf0.j(aVar2, 17);
                            mVar15.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new pf0.j(aVar2, 17);
                                mVar15.K(objQ7);
                            }
                        }
                        f0Var2.d(384, 9, (e23.a) objQ7, rVarF, strQ8, mVar15, null, false);
                        mVar15.f();
                    }
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    if (z14) {
                        mVar16.C(-1220685460);
                        String strQ9 = gl1.y.Q(mVar16, R.string.feedback_diagnostic_report);
                        boolean zB8 = mVar16.B(aVar2);
                        Object objQ8 = mVar16.q();
                        if (zB8) {
                            objQ8 = new rk0.y(aVar2, 2);
                            mVar16.K(objQ8);
                        } else {
                            aVar.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new rk0.y(aVar2, 2);
                                mVar16.K(objQ8);
                            }
                        }
                        z02.f.c(0, 54, null, (e23.a) objQ8, null, strQ9, mVar16, null);
                        mVar16.f();
                    } else {
                        mVar16.C(-1220471529);
                        z02.f.a(0, 59, null, null, null, gl1.y.Q(mVar16, R.string.feedback_diagnostic_report), mVar16, null);
                        mVar16.f();
                    }
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 18:
                boolean z15 = false;
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if ((iIntValue17 & 3) != 2) {
                    z15 = true;
                }
                if (mVar17.n(iIntValue17 & 1, z15)) {
                    x1 x1Var17 = p3.n.f135158a;
                    String strQ10 = gl1.y.Q(mVar17, R.string.mct_menstrual_cycle);
                    j53.j jVarB = j53.l.b();
                    Object objQ9 = mVar17.q();
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new rw0.b(3);
                        mVar17.K(objQ9);
                    }
                    e23.l lVar = (e23.l) objQ9;
                    if (z14) {
                        mVar17.C(256908323);
                        z02.f.d(strQ10, null, null, this.f999b, null, jVarB, lVar, mVar17, 16252928, 54);
                        mVar17.f();
                    } else {
                        mVar17.C(257167328);
                        z02.f.b(null, null, strQ10, null, null, null, jVarB, lVar, mVar17, 16252928, 59);
                        mVar17.f();
                    }
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                sk0.g.e(z14, aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                r0.b(z14, aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    l72.f0 f0Var3 = l72.f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    String strQ11 = gl1.y.Q(mVar18, R.string.lbl_next);
                    boolean zB9 = mVar18.B(aVar2);
                    Object objQ10 = mVar18.q();
                    if (zB9) {
                        objQ10 = new u11.b(aVar2, 25);
                        mVar18.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new u11.b(aVar2, 25);
                            mVar18.K(objQ10);
                        }
                    }
                    f0Var3.d(384, 1, (e23.a) objQ10, rVarF2, strQ11, mVar18, null, this.f1000c);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                o0.m(z14, aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    l72.f0.f110999a.d(384, 1, this.f999b, x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar19, R.string.lbl_save), mVar19, null, !z14);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 24:
                boolean z16 = false;
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if ((iIntValue20 & 3) != 2) {
                    z16 = true;
                }
                if (mVar20.n(iIntValue20 & 1, z16)) {
                    x1 x1Var20 = p3.n.f135158a;
                    if (z14) {
                        mVar20.C(698206247);
                        mVar20.f();
                    } else {
                        mVar20.C(697736318);
                        String strQ12 = gl1.y.Q(mVar20, R.string.pulse_ox_lbl_acclimation);
                        b.u uVar4 = (b.u) mVar20.A(g02.d.f74342a);
                        boolean zR = mVar20.r(uVar4);
                        Object objQ11 = mVar20.q();
                        if (zR) {
                            objQ11 = new wl.c.a(uVar4);
                            mVar20.K(objQ11);
                        } else {
                            aVar.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                objQ11 = new wl.c.a(uVar4);
                                mVar20.K(objQ11);
                            }
                        }
                        e23.a aVar11 = (e23.a) ((k23.g) objQ11);
                        i53.f fVarA = i53.a.a(new i3("menu_item_help", gl1.y.Q(mVar20, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        boolean zB10 = mVar20.B(aVar2);
                        Object objQ12 = mVar20.q();
                        if (zB10) {
                            objQ12 = new rx1.m(aVar2, 21);
                            mVar20.K(objQ12);
                        } else {
                            aVar.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                objQ12 = new rx1.m(aVar2, 21);
                                mVar20.K(objQ12);
                            }
                        }
                        z02.f.d(strQ12, null, null, aVar11, fVarA, null, (e23.l) objQ12, mVar20, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                        mVar20.f();
                    }
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                w0.a(z14, aVar2, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i14, int i15, e23.a aVar, boolean z14) {
        this.f998a = i15;
        this.f1000c = z14;
        this.f999b = aVar;
    }

    public /* synthetic */ e(boolean z14, e23.a aVar, int i14) {
        this.f998a = i14;
        this.f1000c = z14;
        this.f999b = aVar;
    }
}
