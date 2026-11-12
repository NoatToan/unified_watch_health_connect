package b82;

import c2.x2;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.AnchoredButtonStackKt$ColumnAnchoredButtonStack$1$1", f = "AnchoredButtonStack.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u1.d2 f16476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f16477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u1.d2 d2Var, p3.p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f16476a = d2Var;
            this.f16477b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f16476a, this.f16477b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            u1.d2 d2Var = this.f16476a;
            this.f16477b.setValue(Boolean.valueOf(d2Var.f167433a.getIntValue() >= d2Var.f167437e.getIntValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x015a  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, long j8, p3.m mVar, int i14, int i15) {
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        long jD;
        boolean z14;
        h4.r rVar2;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        long j14;
        p2 p2VarI0;
        h4.r rVar3;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.b bVar;
        int i16;
        int i17;
        pVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1552598053);
        int i18 = i14 | 6;
        int i19 = i15 & 2;
        if (i19 == 0) {
            if ((i14 & 48) == 0) {
                pVar3 = pVar;
                i18 |= o0VarE.r(pVar3) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.r(pVar2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i18 |= i17;
            }
            if ((i14 & 3072) == 0) {
                jD = j8;
                if ((i15 & 8) == 0 || !o0VarE.l(jD)) {
                    i16 = 1024;
                } else {
                    i16 = 2048;
                }
                i18 |= i16;
            } else {
                jD = j8;
            }
            if ((i18 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    rVar3 = h4.r.S;
                    if (i19 != 0) {
                        pVar3 = null;
                    }
                    if ((i15 & 8) != 0) {
                        jD = d(o0VarE);
                        i18 &= -7169;
                    }
                } else {
                    o0VarE.e();
                    if ((i15 & 8) != 0) {
                        i18 &= -7169;
                    }
                    rVar3 = rVar;
                }
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarThen = c2.l.s(u1.n.e(aVar2, jD, o4.m1.f128891a)).then(rVar3);
                h4.r rVarF = x2.f(aVar2, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarThen2 = rVarThen.then(c2.l.y(rVarF, j92.b.f97899b.f97920e));
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen2, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (pVar3 == null) {
                    o0VarE.C(-1475008152);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1199345081);
                    e5.q((i18 >> 3) & 14, pVar3, o0VarE, false);
                }
                e5.q((i18 >> 6) & 14, pVar2, o0VarE, true);
                rVar2 = rVar3;
            } else {
                o0VarE.e();
                rVar2 = rVar;
            }
            pVar4 = pVar3;
            j14 = jD;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b(rVar2, pVar4, pVar2, j14, i14, i15);
            }
        }
        i18 = i14 | 54;
        pVar3 = pVar;
        if ((i14 & 384) == 0) {
            if (o0VarE.r(pVar2)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i18 |= i17;
        }
        if ((i14 & 3072) == 0) {
            jD = j8;
            if ((i15 & 8) == 0) {
                i16 = 1024;
            } else {
                i16 = 1024;
            }
            i18 |= i16;
        } else {
            jD = j8;
        }
        if ((i18 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                rVar3 = h4.r.S;
                if (i19 != 0) {
                    pVar3 = null;
                }
                if ((i15 & 8) != 0) {
                    jD = d(o0VarE);
                    i18 &= -7169;
                }
            } else {
                rVar3 = h4.r.S;
                if (i19 != 0) {
                    pVar3 = null;
                }
                if ((i15 & 8) != 0) {
                    jD = d(o0VarE);
                    i18 &= -7169;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarThen3 = c2.l.s(u1.n.e(aVar3, jD, o4.m1.f128891a)).then(rVar3);
            h4.r rVarF2 = x2.f(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarThen4 = rVarThen3.then(c2.l.y(rVarF2, j92.b.f97899b.f97920e));
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen4, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (pVar3 == null) {
                o0VarE.C(-1475008152);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1199345081);
                e5.q((i18 >> 3) & 14, pVar3, o0VarE, false);
            }
            e5.q((i18 >> 6) & 14, pVar2, o0VarE, true);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        pVar4 = pVar3;
        j14 = jD;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar2, pVar4, pVar2, j14, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x0153  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:91:0x016d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0178  */
    /* JADX WARN: Code duplicated, block: B:95:0x0193  */
    /* JADX WARN: Code duplicated, block: B:97:0x01af  */
    public static final void b(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, long j8, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        int i17;
        e23.p<? super p3.m, ? super Integer, Unit> pVar5;
        int i18;
        long jD;
        boolean z14;
        h4.r rVar3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar6;
        e23.p<? super p3.m, ? super Integer, Unit> pVar7;
        long j14;
        p2 p2VarI0;
        h4.r rVar4;
        h4.r.a aVar;
        j92.b bVar;
        j92.e eVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h4.r rVar5;
        h5.e0.a aVar2;
        int i19;
        h5.g.a.b bVar2;
        int i24;
        pVar2.getClass();
        p3.o0 o0VarE = mVar.E(-353069188);
        int i25 = i15 & 1;
        if (i25 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i26 = i15 & 2;
        if (i26 == 0) {
            if ((i14 & 48) == 0) {
                pVar4 = pVar;
                i16 |= o0VarE.r(pVar4) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.r(pVar2)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i16 |= i24;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    pVar5 = pVar3;
                    if (o0VarE.r(pVar5)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if ((i15 & 16) == 0) {
                        jD = j8;
                        int i27 = o0VarE.l(jD) ? 16384 : 8192;
                        i16 |= i27;
                    } else {
                        jD = j8;
                    }
                    i16 |= i27;
                } else {
                    jD = j8;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i25 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i26 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if ((i15 & 16) != 0) {
                            jD = d(o0VarE);
                            i16 &= -57345;
                        }
                    } else {
                        o0VarE.e();
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                        }
                        rVar4 = rVar2;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    aVar = h4.r.S;
                    h4.r rVarThen = c2.l.s(u1.n.e(aVar, jD, o4.m1.f128891a)).then(rVar4);
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarThen2 = rVarThen.then(c2.l.y(rVarF, eVar.f97920e));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen2, o0VarE);
                    h5.g.V.getClass();
                    rVar5 = rVar4;
                    aVar2 = h5.g.a.f81805b;
                    i19 = i16;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
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
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (pVar4 == null) {
                        o0VarE.C(-1852336857);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-198300134);
                        e5.q((i19 >> 3) & 14, pVar4, o0VarE, false);
                    }
                    pVar2.invoke(o0VarE, Integer.valueOf((i19 >> 6) & 14));
                    if (pVar5 != null) {
                        o0VarE.C(-1852249250);
                        bVar.getClass();
                        c2.l.f(x2.h(aVar, eVar.f97920e), o0VarE);
                        e5.q((i19 >> 9) & 14, pVar5, o0VarE, false);
                    } else {
                        o0VarE.C(-1852139696);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    rVar3 = rVar5;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                }
                pVar6 = pVar4;
                pVar7 = pVar5;
                j14 = jD;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b82.a(rVar3, pVar6, pVar2, pVar7, j14, i14, i15);
                }
            }
            i16 |= 3072;
            pVar5 = pVar3;
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    jD = j8;
                    if (o0VarE.l(jD)) {
                    }
                    i16 |= i27;
                } else {
                    jD = j8;
                }
                i16 |= i27;
            } else {
                jD = j8;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i26 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if ((i15 & 16) != 0) {
                        jD = d(o0VarE);
                        i16 &= -57345;
                    }
                } else {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i26 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if ((i15 & 16) != 0) {
                        jD = d(o0VarE);
                        i16 &= -57345;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                aVar = h4.r.S;
                h4.r rVarThen3 = c2.l.s(u1.n.e(aVar, jD, o4.m1.f128891a)).then(rVar4);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarThen4 = rVarThen3.then(c2.l.y(rVarF2, eVar.f97920e));
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen4, o0VarE);
                h5.g.V.getClass();
                rVar5 = rVar4;
                aVar2 = h5.g.a.f81805b;
                i19 = i16;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
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
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                if (pVar4 == null) {
                    o0VarE.C(-1852336857);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-198300134);
                    e5.q((i19 >> 3) & 14, pVar4, o0VarE, false);
                }
                pVar2.invoke(o0VarE, Integer.valueOf((i19 >> 6) & 14));
                if (pVar5 != null) {
                    o0VarE.C(-1852249250);
                    bVar.getClass();
                    c2.l.f(x2.h(aVar, eVar.f97920e), o0VarE);
                    e5.q((i19 >> 9) & 14, pVar5, o0VarE, false);
                } else {
                    o0VarE.C(-1852139696);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                rVar3 = rVar5;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
            }
            pVar6 = pVar4;
            pVar7 = pVar5;
            j14 = jD;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.a(rVar3, pVar6, pVar2, pVar7, j14, i14, i15);
            }
        }
        i16 |= 48;
        pVar4 = pVar;
        if ((i14 & 384) == 0) {
            if (o0VarE.r(pVar2)) {
                i24 = 256;
            } else {
                i24 = 128;
            }
            i16 |= i24;
        }
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                pVar5 = pVar3;
                if (o0VarE.r(pVar5)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    jD = j8;
                    if (o0VarE.l(jD)) {
                    }
                    i16 |= i27;
                } else {
                    jD = j8;
                }
                i16 |= i27;
            } else {
                jD = j8;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i26 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if ((i15 & 16) != 0) {
                        jD = d(o0VarE);
                        i16 &= -57345;
                    }
                } else {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i26 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if ((i15 & 16) != 0) {
                        jD = d(o0VarE);
                        i16 &= -57345;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                aVar = h4.r.S;
                h4.r rVarThen5 = c2.l.s(u1.n.e(aVar, jD, o4.m1.f128891a)).then(rVar4);
                h4.r rVarF3 = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarThen6 = rVarThen5.then(c2.l.y(rVarF3, eVar.f97920e));
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen6, o0VarE);
                h5.g.V.getClass();
                rVar5 = rVar4;
                aVar2 = h5.g.a.f81805b;
                i19 = i16;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
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
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                if (pVar4 == null) {
                    o0VarE.C(-1852336857);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-198300134);
                    e5.q((i19 >> 3) & 14, pVar4, o0VarE, false);
                }
                pVar2.invoke(o0VarE, Integer.valueOf((i19 >> 6) & 14));
                if (pVar5 != null) {
                    o0VarE.C(-1852249250);
                    bVar.getClass();
                    c2.l.f(x2.h(aVar, eVar.f97920e), o0VarE);
                    e5.q((i19 >> 9) & 14, pVar5, o0VarE, false);
                } else {
                    o0VarE.C(-1852139696);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                rVar3 = rVar5;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
            }
            pVar6 = pVar4;
            pVar7 = pVar5;
            j14 = jD;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.a(rVar3, pVar6, pVar2, pVar7, j14, i14, i15);
            }
        }
        i16 |= 3072;
        pVar5 = pVar3;
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                jD = j8;
                if (o0VarE.l(jD)) {
                }
                i16 |= i27;
            } else {
                jD = j8;
            }
            i16 |= i27;
        } else {
            jD = j8;
        }
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i26 != 0) {
                    pVar4 = null;
                }
                if (i17 != 0) {
                    pVar5 = null;
                }
                if ((i15 & 16) != 0) {
                    jD = d(o0VarE);
                    i16 &= -57345;
                }
            } else {
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i26 != 0) {
                    pVar4 = null;
                }
                if (i17 != 0) {
                    pVar5 = null;
                }
                if ((i15 & 16) != 0) {
                    jD = d(o0VarE);
                    i16 &= -57345;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            aVar = h4.r.S;
            h4.r rVarThen7 = c2.l.s(u1.n.e(aVar, jD, o4.m1.f128891a)).then(rVar4);
            h4.r rVarF4 = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            h4.r rVarThen8 = rVarThen7.then(c2.l.y(rVarF4, eVar.f97920e));
            c2.j.f22691a.getClass();
            c2.j.k kVar4 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen8, o0VarE);
            h5.g.V.getClass();
            rVar5 = rVar4;
            aVar2 = h5.g.a.f81805b;
            i19 = i16;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
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
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            if (pVar4 == null) {
                o0VarE.C(-1852336857);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-198300134);
                e5.q((i19 >> 3) & 14, pVar4, o0VarE, false);
            }
            pVar2.invoke(o0VarE, Integer.valueOf((i19 >> 6) & 14));
            if (pVar5 != null) {
                o0VarE.C(-1852249250);
                bVar.getClass();
                c2.l.f(x2.h(aVar, eVar.f97920e), o0VarE);
                e5.q((i19 >> 9) & 14, pVar5, o0VarE, false);
            } else {
                o0VarE.C(-1852139696);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            rVar3 = rVar5;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        pVar6 = pVar4;
        pVar7 = pVar5;
        j14 = jD;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.a(rVar3, pVar6, pVar2, pVar7, j14, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:32:0x0104  */
    /* JADX WARN: Code duplicated, block: B:33:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x0123  */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:42:0x0151  */
    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(e23.r<? super Boolean, ? super o4.d0, ? super p3.m, ? super Integer, Unit> rVar, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        long jD;
        rVar.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(800234552);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, (i14 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            u1.d2 d2VarA = u1.a2.a(o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Integer numValueOf = Integer.valueOf(d2VarA.f167433a.getIntValue());
            boolean zB = o0VarE.B(d2VarA);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new a(d2VarA, p1Var, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, numValueOf, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = c2.b0.f22601a;
                h4.r rVarA = b0Var.a(u1.a2.b(aVar, d2VarA, true), 1.0f, true);
                zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                qVar.invoke(b0Var, o0VarE, 54);
                o0VarE.g0(true);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(1632836653);
                    o0VarE.g0(false);
                    o4.d0.f128823b.getClass();
                    jD = o4.d0.f128831j;
                } else {
                    o0VarE.C(1632835049);
                    jD = d(o0VarE);
                    o0VarE.g0(false);
                }
                Boolean bool = (Boolean) p1Var.getF182175a();
                bool.getClass();
                rVar.invoke(bool, o4.d0.a(jD), o0VarE, 384);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = c2.b0.f22601a;
            h4.r rVarA2 = b0Var.a(u1.a2.b(aVar, d2VarA, true), 1.0f, true);
            zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            qVar.invoke(b0Var, o0VarE, 54);
            o0VarE.g0(true);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(1632835049);
                jD = d(o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1632836653);
                o0VarE.g0(false);
                o4.d0.f128823b.getClass();
                jD = o4.d0.f128831j;
            }
            Boolean bool2 = (Boolean) p1Var.getF182175a();
            bool2.getClass();
            rVar.invoke(bool2, o4.d0.a(jD), o0VarE, 384);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.t0(rVar, qVar, i14, 16);
        }
    }

    public static final long d(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        return fb1.c.z(d92.b.f58623a, mVar);
    }
}
