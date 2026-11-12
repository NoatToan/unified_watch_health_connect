package gw0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.y1;
import c2.n3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.d1;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f79758b;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79757a = iArr;
            int[] iArr2 = new int[gw0.a.values().length];
            try {
                iArr2[gw0.a.AUTO_LOGGING_BEHAVIORS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[gw0.a.PREGNANCY_AND_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f79758b = iArr2;
        }
    }

    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1481396657);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            s62.a.f157643a.getClass();
            sVar.c(null, d1.a(t62.b.f162798a), null, null, gl1.y.Q(o0VarE, R.string.lbl_auto_logging_available), gl1.y.Q(o0VarE, R.string.msg_lifestyle_logging_auto_log_banner), gl1.y.Q(o0VarE, R.string.lbl_enable_auto_logging), false, aVar2, aVar, o0VarE, (i15 << 24) & 1879048192, i15 & 14, 397);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    public static final void b(c2.a0 a0Var, ArrayList arrayList, ug2.x xVar, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1442487645);
        int i15 = i14 | (o0VarE.r(arrayList) ? 32 : 16) | (o0VarE.r(xVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int size = arrayList.size();
            boolean zK = o0VarE.k(size);
            Object objQ = o0VarE.q();
            if (zK) {
                objQ = new a51.c(size, 12);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a51.c(size, 12);
                    o0VarE.K(objQ);
                }
            }
            h2.b bVarB = h2.o0.b(0, (e23.a) objQ, o0VarE, 0, 3);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            bVar.getClass();
            o0Var = o0VarE;
            h2.u.a(bVarB, null, c2.l.a(f15), null, 0, f14, null, null, false, null, null, null, null, z3.f.c(1612004574, new a42.d0((Object) arrayList, (Object) xVar, aVar, (Object) aVar2, 20), o0VarE), o0Var, 0, 24576, 16346);
            if (size > 1) {
                o0Var.C(2002817003);
                h4.r.a aVar3 = h4.r.S;
                bVar.getClass();
                h4.r rVarA = c2.l.A(aVar3, f15, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                h4.d.f81522a.getClass();
                h4.r rVarB = a0Var.b(rVarC, h4.d.a.f81537o);
                bVar.getClass();
                l02.f.a(bVarB, rVarB, size, 0, 0L, 0L, j92.b.f97901d.f97902a, 0.0f, null, o0Var, 0, 952);
                o0Var.g0(false);
            } else {
                o0Var.C(2003186213);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p((Object) a0Var, (Object) arrayList, (o13.h) xVar, aVar, aVar2, i14, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(u uVar, boolean z14, ug2.x xVar, ug2.x xVar2, ug2.x xVar3, ug2.x xVar4, ug2.x xVar5, e23.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        uVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-653977226);
        int i15 = i14 | (o0VarE.r(uVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(xVar) ? 256 : 128) | (o0VarE.r(xVar2) ? 2048 : 1024) | (o0VarE.r(xVar3) ? 16384 : 8192) | (o0VarE.r(xVar4) ? 131072 : 65536) | (o0VarE.r(xVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(uVar.f79771l, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new n82.f.a(uVar.f79769j, null, uVar.f79768i, 2, null);
                o0VarE.K(objQ);
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ, null, o0VarE, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130854g);
                o0VarE.K(objQ2);
            }
            i53.f fVar = (i53.f) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new yd1.a(context);
                o0VarE.K(objQ3);
            }
            yd1.a aVar2 = (yd1.a) objQ3;
            boolean zR = o0VarE.r(uVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new h(uVar, 2);
                o0VarE.K(objQ4);
            }
            e23.a aVar3 = (e23.a) objQ4;
            boolean zR2 = o0VarE.r(uVar);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new h(uVar, 3);
                o0VarE.K(objQ5);
            }
            e23.a aVar4 = (e23.a) objQ5;
            boolean zR3 = o0VarE.r(uVar);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                objQ6 = new h(uVar, 4);
                o0VarE.K(objQ6);
            }
            e23.a aVar5 = (e23.a) objQ6;
            b63.o oVar = ((h0) p1VarC.getF182175a()).f79617i;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.B(fVarA) | o0VarE.r(uVar);
            Object objQ7 = o0VarE.q();
            if (zB || objQ7 == c2565a) {
                objQ7 = new s(fVarA, uVar, p1VarC, null);
                o0VarE.K(objQ7);
            }
            l0.e((e23.p) objQ7, oVar, o0VarE);
            z3.e eVarC = z3.f.c(-707034159, new bt1.m(xVar, xVar2, xVar3, z14, aVar, 12), o0VarE);
            g6.f.a aVar6 = g6.f.f75994b;
            o0Var = o0VarE;
            z02.d.a(false, eVarC, null, null, n3.b(0.0f, 0.0f, 0.0f, 0, 7), z3.f.c(381015373, new a11.j(fVarA, xVar5, aVar5, aVar4, p1VarC, aVar3, fVar, aVar2, uVar, xVar4), o0VarE), o0Var, 196656, 13);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(uVar, z14, xVar, xVar2, xVar3, xVar4, xVar5, aVar, i14);
        }
    }

    public static final void d(pv0.r rVar, e23.l lVar, z3.e eVar, p3.m mVar, int i14) {
        z3.e eVar2;
        o0 o0VarE = mVar.E(137745476);
        int i15 = i14 | (o0VarE.k(rVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            y1 y1Var = y1.f16902a;
            o0VarE.C(-770576916);
            w13.c cVar = pv0.r.f141412f;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                pv0.r rVar2 = (pv0.r) bVar.next();
                zv0.d dVar = zv0.d.f207169a;
                l22.a aVarS = w2.a0.s(o0VarE);
                dVar.getClass();
                arrayList.add(zv0.d.e(rVar2, aVarS));
            }
            o0VarE.g0(false);
            i53.c<String> cVarE = i53.a.e(arrayList);
            int iOrdinal = rVar.ordinal();
            long jD = ds.e0.d(d92.b.f58623a, o0VarE);
            eVar2 = eVar;
            z3.e eVarC = z3.f.c(1334398764, new e11.c0(lVar, eVar2), o0VarE);
            y1 y1Var2 = y1.f16902a;
            y1Var.c(cVarE, iOrdinal, true, true, true, 0L, jD, eVarC, o0VarE, 12610944, 32);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.f0(rVar, lVar, eVar2, i14, 29);
        }
    }

    public static final void e(e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1378593968);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            s62.a.f157643a.getClass();
            sVar.c(null, d1.a(t62.b.f162798a), null, null, gl1.y.Q(o0VarE, R.string.lbl_pregnancy_and_logging), gl1.y.Q(o0VarE, R.string.msg_pregnancy_and_logging), null, false, aVar, null, o0VarE, (i15 << 27) & 1879048192, 0, 1485);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.p(aVar, i14, 25);
        }
    }
}
