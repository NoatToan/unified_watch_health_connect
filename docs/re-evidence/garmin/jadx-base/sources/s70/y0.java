package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import i3.e5;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import v62.fa;
import v62.z4;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Ls70/y0;", "Lr70/r;", "Ly70/n;", "stateHolder", "<init>", "(Ly70/n;)V", "", "showManagePasscodeDialog", "showResetPasscodeDialog", "showSetPasscodeOnDeviceDialog", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.n f157833a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157834a;

        static {
            int[] iArr = new int[o70.l.values().length];
            try {
                iArr[o70.l.INCORRECT_PASSCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.l.LOCKED_PASSCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f157834a = iArr;
        }
    }

    public y0(y70.n nVar) {
        nVar.getClass();
        this.f157833a = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d8  */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        y0 y0Var;
        y0 y0Var2 = this;
        r70.q qVar2 = qVar;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar2, mVar, -1457212270);
        int i15 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(y0Var2) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarQ.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            List list = (List) s9.c.b((r53.i) y0Var2.f157833a.f194674c.getValue(), null, o0VarQ, 48).getF182175a();
            List<o70.m> list2 = (list == null || list.isEmpty()) ? null : list;
            if (list2 == null) {
                o0VarQ.C(1719033585);
                o0VarQ.g0(false);
                o0Var = o0VarQ;
            } else {
                o0VarQ.C(1719033586);
                Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
                boolean zR = o0VarQ.r(context);
                Object objQ = o0VarQ.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zR) {
                    objQ = new ot.c(context, 12);
                    o0VarQ.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ot.c(context, 12);
                        o0VarQ.K(objQ);
                    }
                }
                e23.l lVar = (e23.l) objQ;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVar, f15, f14, eVar.f97920e, 0.0f, 8);
                c2.j jVar = c2.j.f22691a;
                bVar.getClass();
                float f16 = eVar.f97920e;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f16);
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarQ, 0);
                int iHashCode = Long.hashCode(o0VarQ.U);
                i2 i2VarA0 = o0VarQ.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarQ);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarQ.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarQ.z();
                if (o0VarQ.T) {
                    o0VarQ.M(aVar2);
                } else {
                    o0VarQ.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarQ);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarQ);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarQ, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarQ);
                c2.b0 b0Var = c2.b0.f22601a;
                o0VarQ.C(-57925406);
                for (o70.m mVar2 : list2) {
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    boolean zB = o0VarQ.B(lVar) | o0VarQ.B(mVar2);
                    Object objQ2 = o0VarQ.q();
                    if (zB) {
                        objQ2 = new rk0.f(26, lVar, mVar2);
                        o0VarQ.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new rk0.f(26, lVar, mVar2);
                            o0VarQ.K(objQ2);
                        }
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ2;
                    boolean zB2 = o0VarQ.B(mVar2) | o0VarQ.r(qVar2) | o0VarQ.r(context) | o0VarQ.r(y0Var2);
                    Object objQ3 = o0VarQ.q();
                    if (zB2) {
                        ok0.d dVar = new ok0.d(19, context, mVar2, qVar2, this);
                        mVar2 = mVar2;
                        y0Var = this;
                        o0VarQ.K(dVar);
                        objQ3 = dVar;
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            ok0.d dVar2 = new ok0.d(19, context, mVar2, qVar2, this);
                            mVar2 = mVar2;
                            y0Var = this;
                            o0VarQ.K(dVar2);
                            objQ3 = dVar2;
                        } else {
                            y0Var = y0Var2;
                        }
                    }
                    e23.a<Unit> aVar4 = (e23.a) objQ3;
                    boolean zR2 = o0VarQ.r(y0Var) | o0VarQ.B(mVar2);
                    Object objQ4 = o0VarQ.q();
                    if (zR2) {
                        objQ4 = new rk0.f(27, y0Var, mVar2);
                        o0VarQ.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new rk0.f(27, y0Var, mVar2);
                            o0VarQ.K(objQ4);
                        }
                    }
                    y0Var.b(rVarF, mVar2, aVar3, aVar4, (e23.a) objQ4, o0VarQ, ((i16 << 9) & 458752) | 6);
                    y0Var2 = this;
                    qVar2 = qVar;
                }
                o0Var = o0VarQ;
                e5.u(o0Var, false, true, false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(h4.r rVar, o70.m mVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar2, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.m.a.C2565a c2565a;
        char c14;
        char c15;
        boolean z14;
        p3.o0 o0Var2;
        p3.p1 p1Var;
        p3.o0 o0Var3;
        boolean z15;
        String strJ;
        Object dVar;
        int i16;
        final o70.m mVar3 = mVar;
        rVar.getClass();
        mVar3.getClass();
        String str = mVar3.f130029b;
        boolean z16 = mVar3.f130031d;
        boolean z17 = mVar3.f130032e;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar2.E(1304142822);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(mVar3) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            final p3.p1 p1Var3 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var4 = (p3.p1) objQ3;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-554839214);
                String strJ2 = z17 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -554800929, R.string.msg_manage_passcode_with_wallet, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -554703093, R.string.msg_manage_passcode, o0VarE, false);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_manage_passcode);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_change_passcode);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_reset_passcode);
                boolean z18 = (i15 & 896) == 256;
                Object objQ4 = o0VarE.q();
                if (z18 || objQ4 == c2565a2) {
                    objQ4 = new p40.j0(aVar, p1Var2, 11);
                    o0VarE.K(objQ4);
                }
                e23.a aVar4 = (e23.a) objQ4;
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a2) {
                    objQ5 = new p40.q0(p1Var2, p1Var3, 5);
                    o0VarE.K(objQ5);
                }
                e23.a aVar5 = (e23.a) objQ5;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a2) {
                    objQ6 = new rk0.w(p1Var2, 19);
                    o0VarE.K(objQ6);
                }
                e23.a aVar6 = (e23.a) objQ6;
                c2565a = c2565a2;
                c15 = 2048;
                c14 = ' ';
                c1Var.b(false, strQ, strJ2, strQ2, strQ3, null, true, aVar4, aVar5, null, aVar6, o0VarE, C.ENCODING_PCM_32BIT, 24960, 9625);
                o0Var2 = o0VarE;
                z14 = false;
                o0Var2.g0(false);
            } else {
                c2565a = c2565a2;
                c14 = ' ';
                c15 = 2048;
                z14 = false;
                o0Var2 = o0VarE;
                o0Var2.C(-553845540);
                o0Var2.g0(false);
            }
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0Var2.C(-553771760);
                if (z17) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var2, -553737536, R.string.msg_reset_passcode_with_wallet, o0Var2, z14);
                } else {
                    strJ = z16 ? com.airbnb.lottie.animation.keyframe.a.j(o0Var2, -553621844, R.string.msg_reset_passcode, o0Var2, z14) : com.airbnb.lottie.animation.keyframe.a.j(o0Var2, -553536284, R.string.lbl_reset_non_nfc_passcode, o0Var2, z14);
                }
                String str2 = strJ;
                l72.c1 c1Var2 = l72.c1.f110940a;
                String strQ4 = gl1.y.Q(o0Var2, R.string.lbl_reset_passcode);
                String strQ5 = gl1.y.Q(o0Var2, R.string.lbl_reset);
                boolean z19 = ((i15 & 7168) == c15) | ((i15 & 112) == c14);
                Object objQ7 = o0Var2.q();
                if (z19 || objQ7 == c2565a) {
                    i16 = i15;
                    p1Var = p1Var4;
                    mVar3 = mVar;
                    dVar = new ok0.d(mVar3, aVar2, p1Var3, p1Var, 20);
                    o0Var2.K(dVar);
                } else {
                    i16 = i15;
                    dVar = objQ7;
                    p1Var = p1Var4;
                    mVar3 = mVar;
                }
                e23.a<Unit> aVar7 = (e23.a) dVar;
                String strQ6 = gl1.y.Q(o0Var2, R.string.lbl_cancel);
                Object objQ8 = o0Var2.q();
                if (objQ8 == c2565a) {
                    objQ8 = new rk0.w(p1Var3, 20);
                    o0Var2.K(objQ8);
                }
                e23.a<Unit> aVar8 = (e23.a) objQ8;
                p3.o0 o0Var4 = o0Var2;
                i15 = i16;
                c1Var2.a(false, strQ4, str2, null, null, strQ5, true, false, aVar7, strQ6, aVar8, o0Var4, 1572864, 6, 153);
                o0Var2 = o0Var4;
                o0Var2.g0(false);
            } else {
                c2565a = c2565a;
                p1Var = p1Var4;
                p1Var2 = p1Var2;
                mVar3 = mVar;
                o0Var2.C(-552683908);
                o0Var2.g0(z14);
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var2.C(-552625628);
                l72.c1 c1Var3 = l72.c1.f110940a;
                String strQ7 = gl1.y.Q(o0Var2, R.string.lbl_create_passcode_on_device);
                String strQ8 = gl1.y.Q(o0Var2, R.string.lbl_use_garmin_for_passcode);
                String strQ9 = gl1.y.Q(o0Var2, R.string.lbl_ok);
                boolean z24 = (i15 & 7168) == 2048;
                Object objQ9 = o0Var2.q();
                if (z24 || objQ9 == c2565a) {
                    objQ9 = new p40.j0(aVar2, p1Var, 10);
                    o0Var2.K(objQ9);
                }
                p3.o0 o0Var5 = o0Var2;
                c1Var3.a(false, strQ7, strQ8, null, null, strQ9, false, false, (e23.a) objQ9, null, null, o0Var5, 0, 0, 1753);
                o0Var3 = o0Var5;
                z15 = false;
                o0Var3.g0(false);
            } else {
                o0Var3 = o0Var2;
                z15 = false;
                o0Var3.C(-552202788);
                o0Var3.g0(false);
            }
            String strJ3 = z16 ? com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -552144973, R.string.lbl_manage_passcode, o0Var3, z15) : com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -552066636, R.string.lbl_reset_passcode, o0Var3, z15);
            int i17 = a.f157834a[mVar3.f130033f.ordinal()];
            if (i17 == 1) {
                final p3.p1 p1Var5 = p1Var2;
                o0Var3.C(-551873320);
                o0Var3.C(-849086119);
                s5.c.b bVar = new s5.c.b(0, 1, null);
                bVar.b(gl1.y.P(R.string.msg_passcode_entry_failed, new Object[]{str}, o0Var3));
                w5.f0.f182097b.getClass();
                int iJ = bVar.j(new s5.i0(0L, 0L, w5.f0.f182104i, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                try {
                    bVar.b(StringUtils.SPACE + strJ3);
                    Unit unit = Unit.INSTANCE;
                    bVar.f(iJ);
                    s5.c cVarK = bVar.k();
                    o0Var3.g0(false);
                    l72.s sVar = l72.s.f111232a;
                    l72.s.b bVar2 = l72.s.b.ALERT;
                    boolean z25 = (i15 & 112) == 32;
                    Object objQ10 = o0Var3.q();
                    if (z25 || objQ10 == c2565a) {
                        final int i18 = 0;
                        objQ10 = new e23.a() { // from class: s70.x0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        if (mVar3.f130031d) {
                                            p1Var5.setValue(Boolean.TRUE);
                                        } else {
                                            p1Var3.setValue(Boolean.TRUE);
                                        }
                                        break;
                                    default:
                                        if (mVar3.f130031d) {
                                            p1Var5.setValue(Boolean.TRUE);
                                        } else {
                                            p1Var3.setValue(Boolean.TRUE);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var3.K(objQ10);
                    }
                    boolean z26 = true;
                    h4.r rVarD = u1.w.d(rVar, false, null, null, (e23.a) objQ10, 15);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = fa.a(t62.b.f162798a);
                    String strQ10 = gl1.y.Q(o0Var3, R.string.lbl_incorrect_passcode);
                    if ((i15 & 57344) != 16384) {
                        z26 = false;
                    }
                    Object objQ11 = o0Var3.q();
                    if (z26 || objQ11 == c2565a) {
                        objQ11 = new rk0.y(aVar3, 14);
                        o0Var3.K(objQ11);
                    }
                    p3.o0 o0Var6 = o0Var3;
                    sVar.e(rVarD, bVar2, dVarA, strQ10, cVarK, null, null, null, (e23.a) objQ11, o0Var6, 48, 224);
                    o0Var = o0Var6;
                    o0Var.g0(false);
                } catch (Throwable th3) {
                    bVar.f(iJ);
                    throw th3;
                }
            } else {
                if (i17 != 2) {
                    throw kg.f.h(o0Var3, -849087983, false);
                }
                o0Var3.C(-550828465);
                o0Var3.C(-849052364);
                s5.c.b bVar3 = new s5.c.b(0, 1, null);
                bVar3.b(gl1.y.P(R.string.msg_device_is_locked, new Object[]{str}, o0Var3));
                w5.f0.f182097b.getClass();
                int iJ2 = bVar3.j(new s5.i0(0L, 0L, w5.f0.f182104i, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                try {
                    bVar3.b(StringUtils.SPACE + strJ3);
                    Unit unit2 = Unit.INSTANCE;
                    bVar3.f(iJ2);
                    s5.c cVarK2 = bVar3.k();
                    o0Var3.g0(false);
                    l72.s sVar2 = l72.s.f111232a;
                    l72.s.b bVar4 = l72.s.b.ALERT;
                    boolean z27 = (i15 & 112) == 32;
                    Object objQ12 = o0Var3.q();
                    if (z27 || objQ12 == c2565a) {
                        final p3.p1 p1Var6 = p1Var2;
                        final int i19 = 1;
                        objQ12 = new e23.a() { // from class: s70.x0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        if (mVar3.f130031d) {
                                            p1Var6.setValue(Boolean.TRUE);
                                        } else {
                                            p1Var3.setValue(Boolean.TRUE);
                                        }
                                        break;
                                    default:
                                        if (mVar3.f130031d) {
                                            p1Var6.setValue(Boolean.TRUE);
                                        } else {
                                            p1Var3.setValue(Boolean.TRUE);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var3.K(objQ12);
                    }
                    h4.r rVarD2 = u1.w.d(rVar, false, null, null, (e23.a) objQ12, 15);
                    s62.a.f157643a.getClass();
                    sVar2.e(rVarD2, bVar4, z4.a(t62.b.f162798a), gl1.y.Q(o0Var3, R.string.lbl_device_is_locked), cVarK2, null, null, null, null, o0Var3, 48, 480);
                    o0Var3.g0(false);
                    o0Var = o0Var3;
                } catch (Throwable th4) {
                    bVar3.f(iJ2);
                    throw th4;
                }
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(this, rVar, mVar3, aVar, aVar2, aVar3, i14);
        }
    }
}
