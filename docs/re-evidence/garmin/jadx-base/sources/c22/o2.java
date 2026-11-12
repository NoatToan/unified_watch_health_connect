package c22;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
public final class o2 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23179a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130850c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o82.g.f130854g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o82.g.f130855h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o82.g.f130858k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[o82.g.f130857j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[o82.g.f130859l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f23179a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, ne.a aVar, n82.f fVar, i53.c cVar, e23.l lVar, p3.m mVar, int i14) {
        final i53.c cVar2;
        final e23.l lVar2;
        h4.r rVar2;
        boolean z14;
        h4.r.a aVar2;
        boolean z15;
        final n82.f fVar2 = fVar;
        aVar.getClass();
        int i15 = aVar.f125419a;
        n82.b bVar = fVar2.f124961b;
        cVar.getClass();
        p3.o0 o0VarE = mVar.E(1711922526);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i16 = i14 | 6 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.B(fVar2) ? 256 : 128) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            h4.r.a aVar3 = h4.r.S;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(c2.x2.f(aVar3, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            c2.z zVarA = c2.y.a(kVar, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar3 = h5.g.a.f81807d;
            b4.c(fVar3, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new yd1.a(context);
                o0VarE.K(objQ);
            }
            n82.n nVar = new n82.n(fVar2, (yd1.a) objQ);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            String strQ = gl1.y.Q(o0VarE, R.string.label_previous);
            LinkedHashMap linkedHashMap = c0235a.f16962a;
            linkedHashMap.put("chevron_left", strQ);
            linkedHashMap.put("chevron_right", gl1.y.Q(o0VarE, R.string.lbl_next));
            b92.a aVarB = c0235a.b();
            if (i15 >= 600) {
                o0VarE.C(387508801);
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, 1);
                g02.a.f74300a.getClass();
                h4.r rVarF = c2.x2.f(c2.x2.w(rVarA, 0.0f, g02.a.f74301b, 1), 1.0f);
                c2.s2 s2VarA = c2.q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarF, o0VarE);
                if (cVar3 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar3, rVarC2, o0VarE);
                c2.u2 u2Var = c2.u2.f22900a;
                aVar2 = aVar3;
                z14 = true;
                p3.x3 x3VarA = s1.f.a(i15 >= 840 ? g02.a.f74303d : g02.a.f74302c, null, null, o0VarE, 0, 14);
                h4.r rVarW = c2.x2.w(aVar2, 0.0f, ((g6.f) x3VarA.getF182175a()).f75997a, 1);
                int i17 = b92.a.f16960b;
                q82.a.a(rVarW, nVar, aVarB, o0VarE, 0, 0);
                h4.r rVarW2 = c2.x2.w(aVar2, 0.0f, ((g6.f) x3VarA.getF182175a()).f75997a, 1);
                c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81538p, o0VarE, 48);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarW2, o0VarE);
                if (cVar3 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar3, rVarC3, o0VarE);
                cVar2 = cVar;
                i53.c cVarE = i53.a.e(b(cVar2, o0VarE));
                int iIndexOf = cVar2.indexOf(bVar.a());
                boolean z16 = ((i16 & 57344) == 16384) | ((i16 & 896) == 256);
                Object objQ2 = o0VarE.q();
                if (z16 || objQ2 == c2565a) {
                    fVar2 = fVar;
                    lVar2 = lVar;
                    z15 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    objQ2 = new e23.l() { // from class: c22.n2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i18 = objArr;
                            int iIntValue = ((Integer) obj).intValue();
                            switch (i18) {
                                case 0:
                                    o82.g gVar = (o82.g) cVar2.get(iIntValue);
                                    n82.f fVar4 = fVar2;
                                    fVar4.d(gVar);
                                    e23.l lVar3 = lVar2;
                                    if (lVar3 != null) {
                                        lVar3.invoke(fVar4.f124961b.a());
                                    }
                                    break;
                                default:
                                    o82.g gVar2 = (o82.g) cVar2.get(iIntValue);
                                    n82.f fVar5 = fVar2;
                                    fVar5.d(gVar2);
                                    e23.l lVar4 = lVar2;
                                    if (lVar4 != null) {
                                        lVar4.invoke(fVar5.f124961b.a());
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    fVar2 = fVar;
                    lVar2 = lVar;
                    z15 = false;
                }
                t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ2, o0VarE, 0, 26);
                o0VarE = o0VarE;
                e5.u(o0VarE, true, true, z15);
            } else {
                cVar2 = cVar;
                lVar2 = lVar;
                z14 = true;
                char c14 = 1;
                o0VarE.C(389301438);
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), o0VarE);
                i53.c cVarE2 = i53.a.e(b(cVar2, o0VarE));
                int iIndexOf2 = cVar2.indexOf(bVar.a());
                boolean z17 = ((i16 & 57344) == 16384) | ((i16 & 896) == 256);
                Object objQ3 = o0VarE.q();
                if (z17 || objQ3 == c2565a) {
                    final char c15 = c14 == true ? 1 : 0;
                    objQ3 = new e23.l() { // from class: c22.n2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i18 = c15;
                            int iIntValue = ((Integer) obj).intValue();
                            switch (i18) {
                                case 0:
                                    o82.g gVar = (o82.g) cVar2.get(iIntValue);
                                    n82.f fVar4 = fVar2;
                                    fVar4.d(gVar);
                                    e23.l lVar3 = lVar2;
                                    if (lVar3 != null) {
                                        lVar3.invoke(fVar4.f124961b.a());
                                    }
                                    break;
                                default:
                                    o82.g gVar2 = (o82.g) cVar2.get(iIntValue);
                                    n82.f fVar5 = fVar2;
                                    fVar5.d(gVar2);
                                    e23.l lVar4 = lVar2;
                                    if (lVar4 != null) {
                                        lVar4.invoke(fVar5.f124961b.a());
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
                aVar2 = aVar3;
                t82.c.a(cVarE2, null, iIndexOf2, 0.0f, (e23.l) objQ3, o0VarE, 0, 26);
                o0VarE = o0VarE;
                h4.r rVarF2 = c2.x2.f(aVar2, 1.0f);
                int i18 = b92.a.f16960b;
                q82.a.a(rVarF2, nVar, aVarB, o0VarE, 6, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
            rVar2 = aVar2;
        } else {
            cVar2 = cVar;
            lVar2 = lVar;
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.z((Object) rVar2, (Object) aVar, (Object) fVar2, (Object) cVar2, (Object) lVar2, i14, 11);
        }
    }

    public static final ArrayList b(List list, p3.m mVar) {
        String strH;
        String strQ;
        list.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        mVar.C(-31362589);
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e32.o oVarC = c((o82.g) it.next());
            int i14 = oVarC.f62820b;
            String str = oVarC.f62821c;
            Integer num = oVarC.f62823e;
            String str2 = oVarC.f62824f;
            p3.x1 x1Var2 = p3.n.f135158a;
            if (str != null) {
                mVar.C(-1507055864);
                strH = gl1.y.P(i14, new Object[]{str}, mVar);
                mVar.f();
            } else {
                strH = sn.a.h(mVar, -1506992810, i14, mVar);
            }
            if (str2 != null && num != null) {
                mVar.C(-741344191);
                strQ = gl1.y.P(num.intValue(), new Object[]{str2}, mVar);
                mVar.f();
            } else if (num != null) {
                mVar.C(-741340790);
                strQ = gl1.y.Q(mVar, num.intValue());
                mVar.f();
            } else {
                mVar.C(-741338940);
                mVar.f();
                strQ = strH;
            }
            arrayList.add(new t82.a(strH, strQ));
        }
        mVar.f();
        p3.x1 x1Var3 = p3.n.f135158a;
        return arrayList;
    }

    public static final e32.o c(o82.g gVar) {
        gVar.getClass();
        switch (a.f23179a[gVar.ordinal()]) {
            case 1:
                return e32.o.f62805h;
            case 2:
                return e32.o.f62806i;
            case 3:
                return e32.o.f62807j;
            case 4:
                return e32.o.f62808k;
            case 5:
                return e32.o.f62810m;
            case 6:
            case 7:
                return e32.o.f62812o;
            case 8:
                return e32.o.f62816t;
            case 9:
                return e32.o.f62809l;
            case 10:
                return e32.o.f62814q;
            default:
                return e32.o.f62806i;
        }
    }
}
