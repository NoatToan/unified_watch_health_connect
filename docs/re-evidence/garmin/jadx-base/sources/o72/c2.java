package o72;

import i3.mh;
import i3.wa;
import i3.xa;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.c2 f130346a = p3.p0.n(d2.WithButtonStack);

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130347a;

        static {
            int[] iArr = new int[d2.values().length];
            try {
                iArr[d2.WithActionButton.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d2.WithButtonStack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f130347a = iArr;
        }
    }

    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1532347083);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = f72.a2.a(t62.c.f162799a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i0(24);
                o0VarE.K(objQ);
            }
            b82.y0.c("https://static.garmincdn.com/gdc/about-us/41119-about-us-strategies-TILE-BANNER-SUSTAINABILITY-DESKTOP.jpg", dVarA, "Lorem Ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", "Get Started", (e23.a) objQ, z3.f.c(-596149960, new z1(2), o0VarE), o0VarE, 1797510, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 3);
        }
    }

    public static final void b(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1174083607);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            o0.f130507a.getClass();
            b82.y0.d("https://static.garmincdn.com/gdc/about-us/41119-about-us-strategies-TILE-BANNER-SUSTAINABILITY-DESKTOP.jpg", o0.f130509c, "Lorem Ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", o0.f130510d, z3.f.c(-1322808955, new z1(4), o0VarE), o0VarE, 224694, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1903133521);
        int i15 = 1;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = a.f130347a[((d2) f130346a.getF182175a()).ordinal()];
            if (i16 == 1) {
                o0VarE.C(744758150);
                a(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                if (i16 != 2) {
                    throw kg.f.h(o0VarE, 744755898, false);
                }
                o0VarE.C(744760263);
                b(o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(d2 d2Var, final e23.l<? super d2, Unit> lVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        Object obj;
        final int i15;
        p3.o0 o0VarE = mVar.E(978969816);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = 32;
        int i17 = (o0VarE.k(d2Var.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        final int i18 = 0;
        int i19 = 1;
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            float f14 = 1.0f;
            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f15 = 0.0f;
            h4.r rVarA = c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(1598726232);
            w13.c cVar2 = d2.f130357e;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            p3.o0 o0Var2 = o0VarE;
            while (bVarN.hasNext()) {
                final d2 d2Var2 = (d2) bVarN.next();
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarF2 = c2.x2.f(aVar2, f14);
                int i24 = i17 & 112;
                int i25 = (i24 == i16 ? i19 : i18) | (o0Var2.k(d2Var2.ordinal()) ? 1 : 0);
                Object objQ = o0Var2.q();
                p3.m.a aVar3 = p3.m.f135153a;
                if (i25 == 0) {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        obj = objQ;
                        Object obj2 = new e23.a() { // from class: o72.b2
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        lVar.invoke(d2Var2);
                                        break;
                                    default:
                                        lVar.invoke(d2Var2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(obj2);
                        obj = obj2;
                    }
                } else {
                    obj = objQ;
                    Object obj3 = new e23.a() { // from class: o72.b2
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    lVar.invoke(d2Var2);
                                    break;
                                default:
                                    lVar.invoke(d2Var2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(obj3);
                    obj = obj3;
                }
                obj = objQ;
                h4.r rVarD = u1.w.d(rVarF2, false, null, null, (e23.a) obj, 15);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarA2 = c2.l.A(rVarD, f15, eVar.f97918c, i19);
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar3, o0Var2, 48);
                p3.x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0Var2.U);
                p3.i2 i2VarA1 = o0Var2.a0();
                h4.r rVarC2 = h4.k.c(rVarA2, o0Var2);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar4);
                } else {
                    o0Var2.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0Var2);
                b4.c(h5.g.a.f81809f, i2VarA1, o0Var2);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var2, iHashCode2, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0Var2);
                c2.u2 u2Var = c2.u2.f22900a;
                boolean z14 = d2Var2 == d2Var;
                boolean zK = (i24 == 32) | o0Var2.k(d2Var2.ordinal());
                Object objQ2 = o0Var2.q();
                if (zK) {
                    i15 = 1;
                    objQ2 = new e23.a() { // from class: o72.b2
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    lVar.invoke(d2Var2);
                                    break;
                                default:
                                    lVar.invoke(d2Var2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        i15 = 1;
                        objQ2 = new e23.a() { // from class: o72.b2
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        lVar.invoke(d2Var2);
                                        break;
                                    default:
                                        lVar.invoke(d2Var2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(objQ2);
                    } else {
                        i15 = 1;
                    }
                }
                wa waVar = wa.f90116a;
                long jE = hb.a.e(o0Var2);
                long jD = d92.b.a(o0Var2).k().d();
                waVar.getClass();
                p3.o0 o0Var3 = o0Var2;
                xa.a(z14, (e23.a) objQ2, null, false, wa.a(jE, jD, o0Var2, 12), o0Var3, 0, 44);
                String str = d2Var2.f130358a;
                d92.b.f58624b.getClass();
                s5.x0 x0VarE = d92.c.e(j92.f.f97932i);
                bVar2.getClass();
                boolean z15 = i15;
                mh.c(str, c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, o0Var3, 0, 0, 131068);
                p3.o0 o0Var4 = o0Var3;
                o0Var4.g0(z15);
                i19 = z15 ? 1 : 0;
                f15 = 0.0f;
                f14 = 1.0f;
                cVar = cVar;
                i16 = 32;
                i18 = 0;
                o0Var2 = o0Var4;
            }
            o0Var2.g0(i18);
            o0Var2.g0(i19);
            p3.x1 x1Var3 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(d2Var, lVar, i14, 23);
        }
    }
}
