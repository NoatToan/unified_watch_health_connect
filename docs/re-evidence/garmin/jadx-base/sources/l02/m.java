package l02;

import b82.i1;
import c2.q;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import h2.j0;
import h5.e0;
import i3.mh;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m1;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.pager.PagerIndicatorItemKt$PagerIndicatorItem$1$1$1$1", f = "PagerIndicatorItem.kt", l = {44}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f108013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f108014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<Integer, Unit> f108015d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j0 j0Var, int i14, e23.l<? super Integer, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f108013b = j0Var;
            this.f108014c = i14;
            this.f108015d = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f108013b, this.f108014c, this.f108015d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f108012a;
            int i15 = this.f108014c;
            if (i14 == 0) {
                r.b(obj);
                this.f108012a = 1;
                if (j0.w(this.f108013b, i15, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            e23.l<Integer, Unit> lVar = this.f108015d;
            if (lVar != null) {
                lVar.invoke(new Integer(i15));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:110:0x020e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0225  */
    /* JADX WARN: Code duplicated, block: B:113:0x0233  */
    /* JADX WARN: Code duplicated, block: B:115:0x0237  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:80:0x016b  */
    /* JADX WARN: Code duplicated, block: B:81:0x016d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:89:0x0182  */
    /* JADX WARN: Code duplicated, block: B:95:0x0190  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3  */
    public static final void a(b0 b0Var, j0 j0Var, int i14, String str, float f14, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i15, int i16) {
        int i17;
        j0 j0Var2;
        e23.l<? super Integer, Unit> lVar2;
        int i18;
        int i19;
        boolean z14;
        p2 p2VarI0;
        h4.r.a aVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        Object objQ;
        p3.m.a.C2565a c2565a;
        m1 m1Var;
        x0 x0VarF;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object kVar;
        e23.l<? super Integer, Unit> lVar3;
        boolean z19;
        boolean z24;
        Object objQ2;
        b0Var.getClass();
        j0Var.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(1601567945);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.r(b0Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            j0Var2 = j0Var;
            i17 |= o0VarE.B(j0Var2) ? 32 : 16;
        } else {
            j0Var2 = j0Var;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.i(f14) ? 16384 : 8192;
        }
        int i24 = i16 & 32;
        if (i24 == 0) {
            if ((196608 & i15) == 0) {
                lVar2 = lVar;
                i17 |= o0VarE.r(lVar2) ? 131072 : 65536;
            }
            i18 = i17;
            i19 = 0;
            if ((74899 & i18) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                if (i24 != 0) {
                    lVar2 = null;
                }
                x1 x1Var = n.f135158a;
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f15 = j92.b.f97899b.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f15);
                aVar = h4.r.S;
                h4.d.f81522a.getClass();
                zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = n23.j.o(0.0f, o0VarE);
                }
                m1Var = (m1) objQ;
                if (j0Var2.l() == i14) {
                    o0VarE.C(842377325);
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.b(j92.f.f97936m, o0VarE);
                } else {
                    o0VarE.C(842378575);
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.f(j92.f.f97936m, o0VarE);
                }
                o0VarE.g0(false);
                x0 x0Var = x0VarF;
                boolean zR = o0VarE.r(b0Var);
                if ((i18 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z25 = zR | z15;
                if ((i18 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z26 = z25 | z16;
                if ((458752 & i18) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z26 | z17;
                Object objQ3 = o0VarE.q();
                if (!z18 || objQ3 == c2565a) {
                    lVar3 = lVar2;
                    kVar = new b21.k(b0Var, j0Var2, i14, lVar3, 6);
                    o0VarE.K(kVar);
                } else {
                    kVar = objQ3;
                    lVar3 = lVar2;
                }
                h4.r rVarD = w.d(aVar, false, null, null, (e23.a) kVar, 15);
                if (j0Var.l() != i14) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                h4.r rVarE = wz1.i.e(rVarD, z19, new kq.r(14), o0VarE, 0);
                if ((57344 & i18) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objQ2 = o0VarE.q();
                if (z24 || objQ2 == c2565a) {
                    objQ2 = new l(m1Var, f14, i19);
                    o0VarE.K(objQ2);
                }
                mh.c(str, rVarE, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ2, x0Var, o0VarE, (i18 >> 9) & 14, 0, 65532);
                o0VarE = o0VarE;
                if (j0Var.l() == i14) {
                    o0VarE.C(344628931);
                    float floatValue = m1Var.getFloatValue();
                    g6.f.a aVar3 = g6.f.f75994b;
                    b(x2.u(aVar, floatValue), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(344721187);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                lVar2 = lVar3;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new i1(b0Var, j0Var, i14, str, f14, lVar2, i15, i16);
            }
        }
        i17 |= 196608;
        lVar2 = lVar;
        i18 = i17;
        i19 = 0;
        if ((74899 & i18) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            if (i24 != 0) {
                lVar2 = null;
            }
            x1 x1Var2 = n.f135158a;
            c2.j jVar2 = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f16 = j92.b.f97899b.f97918c;
            jVar2.getClass();
            c2.j.i iVarI2 = c2.j.i(f16);
            aVar = h4.r.S;
            h4.d.f81522a.getClass();
            zVarA = y.a(iVarI2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.0f, o0VarE);
            }
            m1Var = (m1) objQ;
            if (j0Var2.l() == i14) {
                o0VarE.C(842377325);
                d92.b.f58624b.getClass();
                x0VarF = d92.c.b(j92.f.f97936m, o0VarE);
            } else {
                o0VarE.C(842378575);
                d92.b.f58624b.getClass();
                x0VarF = d92.c.f(j92.f.f97936m, o0VarE);
            }
            o0VarE.g0(false);
            x0 x0Var2 = x0VarF;
            boolean zR2 = o0VarE.r(b0Var);
            if ((i18 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z27 = zR2 | z15;
            if ((i18 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z28 = z27 | z16;
            if ((458752 & i18) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z28 | z17;
            Object objQ4 = o0VarE.q();
            if (z18) {
                lVar3 = lVar2;
                kVar = new b21.k(b0Var, j0Var2, i14, lVar3, 6);
                o0VarE.K(kVar);
            } else {
                lVar3 = lVar2;
                kVar = new b21.k(b0Var, j0Var2, i14, lVar3, 6);
                o0VarE.K(kVar);
            }
            h4.r rVarD2 = w.d(aVar, false, null, null, (e23.a) kVar, 15);
            if (j0Var.l() != i14) {
                z19 = true;
            } else {
                z19 = false;
            }
            h4.r rVarE2 = wz1.i.e(rVarD2, z19, new kq.r(14), o0VarE, 0);
            if ((57344 & i18) == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            objQ2 = o0VarE.q();
            if (z24) {
                objQ2 = new l(m1Var, f14, i19);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new l(m1Var, f14, i19);
                o0VarE.K(objQ2);
            }
            mh.c(str, rVarE2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ2, x0Var2, o0VarE, (i18 >> 9) & 14, 0, 65532);
            o0VarE = o0VarE;
            if (j0Var.l() == i14) {
                o0VarE.C(344628931);
                float floatValue2 = m1Var.getFloatValue();
                g6.f.a aVar4 = g6.f.f75994b;
                b(x2.u(aVar, floatValue2), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(344721187);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            lVar2 = lVar3;
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(b0Var, j0Var, i14, str, f14, lVar2, i15, i16);
        }
    }

    public static final void b(h4.r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-145310653);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.r rVarE = u1.n.e(rVar, hb.a.d(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarH = x2.h(rVarE, eVar.f97916a);
            bVar.getClass();
            q.a(c2.l.C(rVarH, 0.0f, 0.0f, 0.0f, eVar.f97916a, 7), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 12);
        }
    }
}
