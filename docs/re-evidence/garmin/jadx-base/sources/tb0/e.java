package tb0;

import android.graphics.Bitmap;
import b21.n9;
import b82.w0;
import com.airbnb.lottie.RenderMode;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import java.util.Iterator;
import java.util.Map;
import o72.a3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, q.class, "onSkipTutorial", "onSkipTutorial()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            q qVar = (q) this.receiver;
            qVar.z4("SkipTutorials");
            p2 p2Var = qVar.f163687h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, ub0.m.SKIP_TUTORIAL));
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163619a;

        static {
            int[] iArr = new int[ub0.l.values().length];
            try {
                iArr[ub0.l.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ub0.l.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f163619a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(q qVar, String str, o90.a aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar4, p3.m mVar, int i14, int i15) {
        int i16;
        e23.a<Unit> aVar5;
        int i17;
        boolean z14;
        o0 o0Var;
        e23.a<Unit> aVar6;
        p3.p2 p2VarI0;
        e23.a<Unit> aVar7;
        qVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1892662551);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(qVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        int i18 = i15 & 64;
        if (i18 == 0) {
            if ((1572864 & i14) == 0) {
                aVar5 = aVar4;
                i16 |= o0VarE.r(aVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i17 = i16;
            if ((599187 & i17) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                if (i18 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar5;
                }
                x1 x1Var = p3.n.f135158a;
                p1 p1VarC = s9.c.c(qVar.f163686g, o0VarE);
                e23.a<Unit> aVar8 = aVar7;
                da0.p.d("device_gesture_lottie_tutorial_screen", ((s) p1VarC.getF182175a()).f163700a, aVar8, null, null, null, z3.f.c(-1255786784, new a11.j(((s) p1VarC.getF182175a()).f163704e, str, aVar, lVar, aVar3, qVar, aVar2, p1VarC, s9.c.c(qVar.f163690k, o0VarE), s9.c.c(qVar.f163688i, o0VarE)), o0VarE), o0VarE, ((i17 >> 12) & 896) | 12582918, 120);
                o0Var = o0VarE;
                aVar6 = aVar8;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar6 = aVar5;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new w0(qVar, str, aVar, aVar2, aVar3, lVar, aVar6, i14, i15);
            }
        }
        i16 |= 1572864;
        aVar5 = aVar4;
        i17 = i16;
        if ((599187 & i17) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            if (i18 != 0) {
                aVar7 = null;
            } else {
                aVar7 = aVar5;
            }
            x1 x1Var2 = p3.n.f135158a;
            p1 p1VarC2 = s9.c.c(qVar.f163686g, o0VarE);
            e23.a<Unit> aVar9 = aVar7;
            da0.p.d("device_gesture_lottie_tutorial_screen", ((s) p1VarC2.getF182175a()).f163700a, aVar9, null, null, null, z3.f.c(-1255786784, new a11.j(((s) p1VarC2.getF182175a()).f163704e, str, aVar, lVar, aVar3, qVar, aVar2, p1VarC2, s9.c.c(qVar.f163690k, o0VarE), s9.c.c(qVar.f163688i, o0VarE)), o0VarE), o0VarE, ((i17 >> 12) & 896) | 12582918, 120);
            o0Var = o0VarE;
            aVar6 = aVar9;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar6 = aVar5;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w0(qVar, str, aVar, aVar2, aVar3, lVar, aVar6, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(c2.a0 a0Var, String str, RenderMode renderMode, boolean z14, p pVar, ub0.l lVar, e23.l<? super Float, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strP;
        ba0.a aVar;
        i53.e eVar;
        Object next;
        int i16;
        int i17;
        o0 o0VarE = mVar.E(1240626620);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(renderMode.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.k(lVar == null ? -1 : lVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.common_learn_more);
            if (pVar.f163679l) {
                o0VarE.C(1314440695);
                strP = gl1.y.P(R.string.msg_tutorials_basics, new Object[]{str == null ? "" : str}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1314525201);
                strP = gl1.y.P(R.string.msg_tutorials_basics_short, new Object[]{str == null ? "" : str}, o0VarE);
                o0VarE.g0(false);
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(new ba0.a("", strQ));
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            String str2 = pVar.f163672e;
            i53.d<String, Bitmap> dVar = pVar.f163673f;
            Object objQ3 = o0VarE.q();
            int i18 = i15;
            if (objQ3 == c2565a) {
                objQ3 = new a3(n1Var, 11);
                o0VarE.K(objQ3);
            }
            e23.l lVar3 = (e23.l) objQ3;
            boolean zR = ((i18 & 458752) == 131072) | o0VarE.r(pVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new sy.i(11, lVar, pVar);
                o0VarE.K(objQ4);
            }
            o0Var = o0VarE;
            ub0.f.a(str2, dVar, z14, renderMode, lVar2, lVar3, (e23.l) objQ4, o0Var, ((i18 >> 3) & 896) | 196608 | ((i18 << 3) & 7168) | ((i18 >> 6) & 57344), 0);
            if (pVar.f163668a) {
                aVar = new ba0.a(strP, strQ);
            } else {
                int intValue = n1Var.getIntValue();
                i53.d<ba0.a, hv.j> dVar2 = pVar.f163678k;
                ba0.a aVar2 = null;
                if (dVar2 != null && (eVar = (i53.e) dVar2.entrySet()) != null) {
                    Iterator<E> it = eVar.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            hv.j jVar = (hv.j) ((Map.Entry) next).getValue();
                            int time = jVar.getTime();
                            int iB = jVar.b();
                            if (intValue < time) {
                                i16 = time - intValue;
                            } else {
                                i16 = intValue > iB ? intValue - iB : 0;
                            }
                            do {
                                Object next2 = it.next();
                                hv.j jVar2 = (hv.j) ((Map.Entry) next2).getValue();
                                int time2 = jVar2.getTime();
                                int iB2 = jVar2.b();
                                if (intValue < time2) {
                                    i17 = time2 - intValue;
                                } else {
                                    i17 = intValue > iB2 ? intValue - iB2 : 0;
                                }
                                if (i16 > i17) {
                                    next = next2;
                                    i16 = i17;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null) {
                        aVar2 = (ba0.a) entry.getKey();
                    }
                }
                aVar = aVar2 == null ? new ba0.a("", "") : aVar2;
            }
            p1Var.setValue(aVar);
            ub0.b.a(a0Var, (ba0.a) p1Var.getF182175a(), strQ, str, o0Var, (i18 & 14) | ((i18 << 6) & 7168));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(a0Var, str, renderMode, z14, pVar, lVar, lVar2, i14);
        }
    }

    public static final void c(ub0.l lVar, ub0.m mVar, p pVar, String str, RenderMode renderMode, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar2, e23.l lVar3, p3.m mVar2, int i14) {
        o0 o0VarE = mVar2.E(1115553990);
        int i15 = (o0VarE.k(mVar != null ? mVar.ordinal() : -1) ? 32 : 16) | i14 | (o0VarE.k(lVar == null ? -1 : lVar.ordinal()) ? 4 : 2) | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.k(renderMode.ordinal()) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar3) ? 67108864 : 33554432) | (o0VarE.r(lVar2) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && ((o0VarE.r(lVar3) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.c(z3.f.c(20202268, new f(mVar, lVar, pVar, lVar2, aVar, aVar2, aVar3), o0VarE), z3.f.c(-1697243114, new l72.b(str, renderMode, z14, pVar, lVar, lVar3), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et1.e(lVar, mVar, pVar, str, renderMode, z14, aVar, aVar2, aVar3, lVar2, lVar3, i14);
        }
    }
}
