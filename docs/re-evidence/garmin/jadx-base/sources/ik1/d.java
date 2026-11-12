package ik1;

import com.garmin.android.apps.connectmobile.R;
import cw1.v;
import e23.l;
import ew1.u1;
import gl1.y;
import h4.r;
import hk1.f;
import hk1.i;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import l72.p2;
import l72.r1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f93915b;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.IMPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.EXPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93914a = iArr;
            int[] iArr2 = new int[hk1.d.values().length];
            try {
                iArr2[hk1.d.f84135g.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f93915b = iArr2;
        }
    }

    public static final void a(i.a aVar, l<? super i.a, Unit> lVar, boolean z14, m mVar, int i14) {
        int i15;
        boolean z15;
        o0 o0Var;
        lVar.getClass();
        o0 o0VarE = mVar.E(1678131801);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean z16 = aVar.f84155b;
            String strQ = y.Q(o0VarE, aVar.f84154a.f84142c);
            o0Var = o0VarE;
            p2.f111205a.g(strQ, null, null, null, z3.f.c(926637604, new u1(strQ, z16, lVar, aVar, z15), o0VarE), false, false, null, o0Var, 24576, 494);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(aVar, lVar, z14, i14, 9);
        }
    }

    public static final void b(hk1.d dVar, m mVar, int i14) {
        o0 o0Var;
        int i15;
        String strJ;
        dVar.getClass();
        o0 o0VarE = mVar.E(-1979152272);
        int i16 = (o0VarE.k(dVar.ordinal()) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (a.f93915b[dVar.ordinal()] == 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 705182964, R.string.common_activity_data_import_message_into_gc, o0VarE, false);
            } else {
                o0VarE.C(385917678);
                o0VarE.g0(false);
                strJ = "";
            }
            g6.f.a aVar = g6.f.f75994b;
            r rVarY = c2.l.y(r.S, 16);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            o0Var = o0VarE;
            i15 = 0;
            mh.c(strJ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 48, 0, 131068);
        } else {
            o0Var = o0VarE;
            i15 = 0;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(dVar, i14, i15);
        }
    }

    public static final void c(String str, f fVar, m mVar, int i14) {
        String strP;
        fVar.getClass();
        o0 o0VarE = mVar.E(-910027841);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.k(fVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i16 = a.f93914a[fVar.ordinal()];
            if (i16 == 1) {
                o0VarE.C(1636578182);
                strP = y.P(R.string.settings_data_sharing_into_garmin_msg, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            } else {
                if (i16 != 2) {
                    throw kg.f.h(o0VarE, 1636576285, false);
                }
                o0VarE.C(1636581797);
                strP = y.P(R.string.settings_data_sharing_outside_garmin, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            }
            r1.b(strP, null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(str, fVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    public static final void d(int i14, l lVar, i53.c cVar, String str, m mVar) {
        boolean z14;
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(2093201839);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar instanceof i.c) {
                    o0VarE.C(634381235);
                    c(str, ((i.c) iVar).f84157a, o0VarE, i15 & 14);
                    o0VarE.g0(false);
                } else if (iVar instanceof i.a) {
                    o0VarE.C(-1808921814);
                    i.a aVar = (i.a) iVar;
                    if (aVar.f84154a == hk1.d.f84137i) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : cVar) {
                            i iVar2 = (i) obj;
                            if (iVar2 instanceof i.a) {
                                i.a aVar2 = (i.a) iVar2;
                                if (aVar2.f84154a.f84141b == f.EXPORT && aVar2.f84155b) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                    } else {
                        z14 = true;
                    }
                    a(aVar, lVar, z14, o0VarE, (i15 >> 3) & 112);
                    o0VarE.g0(false);
                } else {
                    if (!(iVar instanceof i.b)) {
                        throw kg.f.h(o0VarE, 634380355, false);
                    }
                    o0VarE.C(634400774);
                    b(((i.b) iVar).f84156a, o0VarE, 0);
                    o0VarE.g0(false);
                }
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(str, cVar, lVar, i14);
        }
    }
}
