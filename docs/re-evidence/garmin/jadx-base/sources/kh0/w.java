package kh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.m8;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104775a;

        static {
            int[] iArr = new int[dh0.g.values().length];
            try {
                iArr[dh0.g.BMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dh0.g.BODY_FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dh0.g.RESTING_HR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dh0.g.VIGOROUS_DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dh0.g.VIGOROUS_MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f104775a = iArr;
        }
    }

    public static final void a(String str, String str2, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.a<Unit> aVar2;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 1720878663);
        int i17 = i14 | (o0VarK.B(str) ? 4 : 2) | (o0VarK.B(str2) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
        } else {
            i16 = i17 | (o0VarK.r(aVar) ? 256 : 128);
        }
        if (o0VarK.n(i16 & 1, (i16 & 147) != 146)) {
            e23.a<Unit> aVar3 = i18 != 0 ? null : aVar;
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-895547207, new t(aVar3, str, str2), o0VarK);
            g6.f.a aVar4 = g6.f.f75994b;
            l72.l.c(eVarC, null, c2.l.z(h4.r.S, 16, 8), null, false, aVar3, o0VarK, ((i16 << 9) & 458752) | 390, 26);
            aVar2 = aVar3;
        } else {
            o0VarK.e();
            aVar2 = aVar;
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.d(str, str2, aVar2, i14, i15, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    public static final void b(ArrayList arrayList, e23.l lVar, p3.m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(992929015);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarC = c2.l.C(h4.r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(-309097379);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ih0.o oVar = (ih0.o) it.next();
                boolean z14 = oVar instanceof ih0.o.a;
                p3.m.a aVar3 = p3.m.f135153a;
                if (z14) {
                    o0VarE.C(-765388581);
                    ih0.o.a aVar4 = (ih0.o.a) oVar;
                    int i16 = a.f104775a[aVar4.f93470a.ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        o0VarE.C(1360786598);
                        boolean zR = o0VarE.r(oVar) | ((i15 & 112) == 32);
                        Object objQ = o0VarE.q();
                        if (zR) {
                            objQ = new k11.h(8, lVar, aVar4);
                            o0VarE.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new k11.h(8, lVar, aVar4);
                                o0VarE.K(objQ);
                            }
                        }
                        e((e23.a) objQ, o0VarE, 0);
                        o0VarE.g0(false);
                    } else if (i16 == 3) {
                        o0VarE.C(1360789935);
                        c(o0VarE, 0);
                        o0VarE.g0(false);
                    } else if (i16 == 4) {
                        o0VarE.C(1360792637);
                        o0VarE.g0(false);
                    } else {
                        if (i16 != 5) {
                            throw kg.f.h(o0VarE, 1360783367, false);
                        }
                        o0VarE.C(1360794877);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    if (!p005kotlin.jvm.internal.s.g(oVar, ih0.o.b.f93471a)) {
                        throw kg.f.h(o0VarE, 1360780445, false);
                    }
                    o0VarE.C(1360798380);
                    boolean zR2 = ((i15 & 112) == 32) | o0VarE.r(oVar);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        objQ2 = new k11.h(9, lVar, oVar);
                        o0VarE.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new k11.h(9, lVar, oVar);
                            o0VarE.K(objQ2);
                        }
                    }
                    d((e23.a) objQ2, o0VarE, 0);
                    o0VarE.g0(false);
                }
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.y(i14, 2, lVar, arrayList);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1417912393);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            a(gl1.y.Q(o0VarE, R.string.hr_zones_lbl_resting_heart_rate), gl1.y.Q(o0VarE, R.string.msg_wear_device_regularly), null, o0VarE, 0, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kc0.a(i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    public static final void d(e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1656269381);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            gh0.a aVar2 = (gh0.a) KoinJavaComponent.get$default(gh0.a.class, null, null, 6, null);
            g.h hVar = new g.h();
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new m8(aVar, 11);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m8(aVar, 11);
                    o0VarE.K(objQ);
                }
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ, o0VarE, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_add_user_settings);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_add_extra_user_data);
            boolean zR = o0VarE.r(qVarC) | o0VarE.r(aVar2) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new u(qVarC, aVar2, context, 0);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u(qVarC, aVar2, context, 0);
                    o0VarE.K(objQ2);
                }
            }
            a(strQ, strQ2, (e23.a) objQ2, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    public static final void e(e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-976571729);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            gh0.a aVar2 = (gh0.a) KoinJavaComponent.get$default(gh0.a.class, null, null, 6, null);
            g.h hVar = new g.h();
            boolean zR = ((i15 & 14) == 4) | o0VarE.r(aVar2);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new v(aVar2, aVar, 0);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v(aVar2, aVar, 0);
                    o0VarE.K(objQ);
                }
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ, o0VarE, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_add_weight);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_manually_add_your_weight);
            boolean zR2 = o0VarE.r(qVarC) | o0VarE.r(aVar2) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new u(qVarC, aVar2, context, 1);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u(qVarC, aVar2, context, 1);
                    o0VarE.K(objQ2);
                }
            }
            a(strQ, strQ2, (e23.a) objQ2, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar, i14, 20);
        }
    }
}
