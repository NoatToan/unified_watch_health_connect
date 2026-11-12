package ta0;

import ca0.o1;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.Collection;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;
import sk0.k1;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163451a;

        static {
            int[] iArr = new int[o1.values().length];
            try {
                iArr[o1.CREATE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o1.SIGN_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o1.ADD_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f163451a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:121:0x0207  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:75:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0169  */
    /* JADX WARN: Code duplicated, block: B:93:0x0192  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(x xVar, l90.d dVar, o1 o1Var, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, ca0.u0 u0Var, e23.l lVar2, p3.m mVar, int i14) {
        x xVar2;
        p3.o0 o0Var;
        boolean z14;
        xVar.getClass();
        o1Var.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarO = androidx.room.a0.o(aVar3, lVar2, mVar, -1864228105);
        int i15 = (o0VarO.r(lVar2) ? 67108864 : 33554432) | i14 | (o0VarO.r(xVar) ? 4 : 2) | (o0VarO.B(dVar) ? 32 : 16) | (o0VarO.k(o1Var.ordinal()) ? 256 : 128) | (o0VarO.r(lVar) ? 2048 : 1024) | (o0VarO.r(aVar) ? 16384 : 8192) | (o0VarO.r(aVar2) ? 131072 : 65536) | (o0VarO.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarO.r(u0Var) ? 8388608 : 4194304);
        if (o0VarO.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            o13.q qVar = (o13.q) s9.c.c(xVar.f163469m, o0VarO).getF182175a();
            p3.m.a aVar4 = p3.m.f135153a;
            if (qVar == null) {
                o0VarO.C(1003100156);
                o0VarO.g0(false);
            } else {
                o0VarO.C(1003100157);
                Object obj = qVar.f128597a;
                if (obj instanceof o13.q.b) {
                    obj = null;
                }
                Collection collection = (Collection) obj;
                if (collection == null || collection.isEmpty()) {
                    o0VarO.C(-600117387);
                    boolean z15 = (i15 & 29360128) == 8388608;
                    Object objQ = o0VarO.q();
                    if (z15) {
                        objQ = new r(u0Var, 0);
                        o0VarO.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r(u0Var, 0);
                            o0VarO.K(objQ);
                        }
                    }
                    og2.k.d(xVar, (e23.a) objQ, o0VarO, i15 & 14);
                    o0VarO.g0(false);
                } else {
                    o0VarO.C(-600017443);
                    o0VarO.g0(false);
                }
                o0VarO.g0(false);
            }
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i15 & 7168) == 2048) | o0VarO.r(xVar);
            Object objQ2 = o0VarO.q();
            if (zR) {
                objQ2 = new t(xVar, lVar, null);
                o0VarO.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new t(xVar, lVar, null);
                    o0VarO.K(objQ2);
                }
            }
            p3.l0.e((e23.p) objQ2, unit, o0VarO);
            boolean zR2 = o0VarO.r(xVar) | ((57344 & i15) == 16384);
            Object objQ3 = o0VarO.q();
            if (zR2) {
                objQ3 = new u(xVar, aVar, null);
                o0VarO.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new u(xVar, aVar, null);
                    o0VarO.K(objQ3);
                }
            }
            p3.l0.e((e23.p) objQ3, unit, o0VarO);
            boolean zR3 = o0VarO.r(xVar) | ((i15 & 112) == 32);
            Object objQ4 = o0VarO.q();
            if (zR3) {
                objQ4 = new v(xVar, dVar, null);
                o0VarO.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new v(xVar, dVar, null);
                    o0VarO.K(objQ4);
                }
            }
            p3.l0.e((e23.p) objQ4, unit, o0VarO);
            boolean zR4 = o0VarO.r(xVar) | ((i15 & 896) == 256) | ((458752 & i15) == 131072) | ((i15 & 29360128) == 8388608);
            Object objQ5 = o0VarO.q();
            if (zR4) {
                z14 = false;
                ok0.d dVar2 = new ok0.d(xVar, o1Var, aVar2, u0Var, 24);
                o0VarO.K(dVar2);
                objQ5 = dVar2;
            } else {
                aVar4.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    z14 = false;
                    ok0.d dVar3 = new ok0.d(xVar, o1Var, aVar2, u0Var, 24);
                    o0VarO.K(dVar3);
                    objQ5 = dVar3;
                } else {
                    z14 = false;
                }
            }
            e23.a aVar5 = (e23.a) objQ5;
            boolean zR5 = o0VarO.r(xVar2) | ((3670016 & i15) == 1048576 ? true : z14);
            Object objQ6 = o0VarO.q();
            if (zR5) {
                objQ6 = new s(xVar, aVar3);
                o0VarO.K(objQ6);
            } else {
                aVar4.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new s(xVar, aVar3);
                    o0VarO.K(objQ6);
                }
            }
            o0Var = o0VarO;
            b(o1Var, lVar2, aVar5, (e23.a) objQ6, o0Var, ((i15 >> 6) & 14) | ((i15 >> 21) & 112));
        } else {
            xVar2 = xVar;
            o0Var = o0VarO;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.d(xVar2, dVar, o1Var, lVar, aVar, aVar2, aVar3, u0Var, lVar2, i14, 19);
        }
    }

    public static final void b(o1 o1Var, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o1 o1Var2;
        p3.o0 o0VarE = mVar.E(-2130117079);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(o1Var.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            o1Var2 = o1Var;
            da0.p.d("device_discovery_device_detection_screen", false, null, null, null, null, z3.f.c(-1886316302, new k1(o1Var2, aVar, aVar2, lVar), o0VarE), o0VarE, 12582918, 126);
        } else {
            o1Var2 = o1Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(o1Var2, lVar, aVar, aVar2, i14, 25);
        }
    }
}
