package xn;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import i3.i7;
import i3.mh;
import nr.z;
import o4.d0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191627b;

    public /* synthetic */ t(Object obj, int i14) {
        this.f191626a = i14;
        this.f191627b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        yo1.j jVar = (yo1.j) this.f191627b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            c2.l.f(x2.h(aVar, eVar.f97918c), mVar);
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarA = c2.l.A(aVar, 16, 0.0f, 2);
            String strQ = y.Q(mVar, R.string.lbl_preliminary_results);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar), mVar, 48, 0, 131068);
            c2.l.f(x2.h(aVar, eVar.f97918c), mVar);
            String strP = y.P(R.string.lbl_riders_have_finished, new Object[]{String.valueOf(jVar.getParticipantCompleteCount()), String.valueOf(jVar.getParticipantCount())}, mVar);
            x0 x0VarB = d92.c.b(j92.f.f97932i, mVar);
            float f14 = eVar.f97920e;
            mh.c(strP, c2.l.C(aVar, f14, 0.0f, f14, f14, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        nr.u.b bVar = (nr.u.b) this.f191627b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            zr.b.c(bVar, null, mVar, 0, 2);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        long jB;
        p3.m mVar;
        z zVar = (z) this.f191627b;
        c2.t tVar = (c2.t) obj;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(tVar) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            h4.r.a aVar = h4.r.S;
            h4.r rVarC = tVar.c(aVar, h4.d.a.f81529g);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(rVarC, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            d0 d0VarA = null;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC3, mVar2);
            u2 u2Var = u2.f22900a;
            String str = zVar.f127597c;
            if (str == null) {
                str = "";
            }
            d92.b.f58624b.getClass();
            mh.c(str, null, zl.a.a(mVar2), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, mVar2, 0, 0, 131066);
            u4.d dVar = zVar.f127598d;
            if (dVar == null) {
                mVar2.C(518263427);
                mVar2.f();
                mVar = mVar2;
            } else {
                mVar2.C(518263428);
                h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97905d);
                Integer num = zVar.f127599e;
                if (num == null) {
                    mVar2.C(2119305381);
                    mVar2.f();
                } else {
                    mVar2.C(2119305382);
                    long jA = n5.a.a(mVar2, num.intValue());
                    mVar2.f();
                    d0VarA = d0.a(jA);
                }
                d0 d0Var = d0VarA;
                if (d0Var == null) {
                    mVar2.C(-1732749206);
                    jB = d92.b.a(mVar2).f().b();
                    mVar2.f();
                } else {
                    mVar2.C(-1732751252);
                    mVar2.f();
                    jB = d0Var.f128833a;
                }
                i7.b(dVar, null, rVarQ, jB, mVar2, 48, 0);
                mVar = mVar2;
                mVar.f();
            }
            mVar.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3;
        String str4;
        nr.e.d dVar = (nr.e.d) this.f191627b;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            r22.p pVar = dVar.f127016b;
            String str5 = (pVar == null || (str4 = pVar.f149774a) == null) ? "" : str4;
            String str6 = (pVar == null || (str3 = pVar.f149776c) == null) ? "" : str3;
            int i14 = (l72.x0.f111348c << 24) | (iIntValue & 14);
            x0Var.a(i14, 124, null, t2Var, null, null, str5, str6, null, null, mVar);
            r22.p pVar2 = dVar.f127017c;
            x0Var.a(i14, 124, null, t2Var, null, null, (pVar2 == null || (str2 = pVar2.f149774a) == null) ? "" : str2, (pVar2 == null || (str = pVar2.f149776c) == null) ? "" : str, null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        nr.e.g gVar = (nr.e.g) this.f191627b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            zr.h.h(aVar, gVar.f127024a, null, mVar, 6, 4);
            z zVar = gVar.f127025b;
            zr.h.g(aVar, zVar, zVar.f127599e, mVar, 6);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:156:0x03de  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:166:0x0403  */
    /* JADX WARN: Code duplicated, block: B:170:0x040f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0432  */
    /* JADX WARN: Code duplicated, block: B:188:0x0455  */
    /* JADX WARN: Code duplicated, block: B:196:0x0472  */
    /* JADX WARN: Code duplicated, block: B:198:0x047c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0483  */
    /* JADX WARN: Code duplicated, block: B:201:0x0487  */
    /* JADX WARN: Code duplicated, block: B:203:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:230:0x0589  */
    /* JADX WARN: Code duplicated, block: B:376:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:377:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:441:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0423 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x0409 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x043b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x042c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x045e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x044f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0189  */
    /* JADX WARN: Code duplicated, block: B:76:0x018f  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v34 q71.b, still in use, count: 2, list:
          (r7v34 q71.b) from 0x0185: PHI (r7 I:??) = (r7v31 q71.b), (r7v34 q71.b) binds: [B:72:0x0184, B:446:0x0185] A[DONT_GENERATE, DONT_INLINE]
          (r7v34 q71.b) from 0x017b: IGET (r7v34 q71.b) A[WRAPPED] q71.b.a float
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // e23.q
    public final java.lang.Object invoke(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 3174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.t.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
