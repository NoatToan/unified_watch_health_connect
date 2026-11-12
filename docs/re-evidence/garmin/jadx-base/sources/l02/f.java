package l02;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.f0;
import e2.i0;
import e2.k0;
import e23.p;
import e23.q;
import gl1.y;
import h2.j0;
import h4.r;
import i3.e5;
import o4.d0;
import o4.r1;
import p005kotlin.Unit;
import p3.l0;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import p5.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0228  */
    /* JADX WARN: Code duplicated, block: B:106:0x022a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:118:0x0256  */
    /* JADX WARN: Code duplicated, block: B:122:0x0275  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0145  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final j0 j0Var, final r rVar, final int i14, int i15, long j8, long j14, final float f14, float f15, r1 r1Var, p3.m mVar, final int i16, final int i17) {
        int i18;
        int i19;
        int i24;
        boolean z14;
        o0 o0Var;
        final long j15;
        final float f16;
        final r1 r1Var2;
        final int i25;
        final long j16;
        p2 p2VarI0;
        long jA;
        long j17;
        float f17;
        r1 r1Var3;
        int i26;
        float f18;
        final float f19;
        Object objQ;
        p3.m.a.C2565a c2565a;
        n1 n1Var;
        int i27;
        final float f22;
        float intValue;
        i0 i0VarA;
        int iL;
        int i28;
        String strP;
        int i29;
        boolean z15;
        int i30;
        boolean z16;
        boolean z17;
        Object objQ2;
        boolean z18;
        int i34;
        boolean z19;
        boolean zB;
        Object objQ3;
        boolean z24;
        boolean z25;
        final long j18;
        final long j19;
        final r1 r1Var4;
        boolean zL;
        final i0 i0Var;
        Object obj;
        int i35;
        j0Var.getClass();
        o0 o0VarE = mVar.E(-1066130042);
        if ((i16 & 6) == 0) {
            i18 = (o0VarE.B(j0Var) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= o0VarE.k(i14) ? 256 : 128;
        }
        int i36 = i17 & 8;
        if (i36 == 0) {
            if ((i16 & 3072) == 0) {
                i19 = i15;
                i18 |= o0VarE.k(i19) ? 2048 : 1024;
            }
            if ((i16 & 24576) == 0) {
                i18 |= 8192;
            }
            if ((196608 & i16) == 0) {
                i18 |= 65536;
            }
            if ((i16 & 1572864) == 0) {
                if (o0VarE.i(f14)) {
                    i35 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i35 = 524288;
                }
                i18 |= i35;
            }
            if ((12582912 & i16) == 0) {
                i18 |= 4194304;
            }
            if ((100663296 & i16) == 0) {
                i18 |= 33554432;
            }
            i24 = i18 | C.ENCODING_PCM_32BIT;
            if ((306783379 & i24) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i24 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0 || o0VarE.o0()) {
                    if (i36 != 0) {
                        i19 = 0;
                    }
                    d92.b bVar = d92.b.f58623a;
                    bVar.getClass();
                    jA = d92.b.a(o0VarE).b().a().a();
                    bVar.getClass();
                    j17 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                    bVar.getClass();
                    d92.b.f58625c.getClass();
                    f17 = j92.b.f97899b.f97918c / 2;
                    g6.f.a aVar = g6.f.f75994b;
                    r1Var3 = k2.i.f102406a;
                    i26 = i24 & (-264757249);
                } else {
                    o0VarE.e();
                    i26 = i24 & (-264757249);
                    jA = j8;
                    j17 = j14;
                    f17 = f15;
                    r1Var3 = r1Var;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                f18 = 2;
                r1 r1Var5 = r1Var3;
                f19 = f14 / f18;
                g6.f.a aVar2 = g6.f.f75994b;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                long j24 = j17;
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e5.o(1, o0VarE);
                }
                n1Var = (n1) objQ;
                i27 = i19;
                f22 = f17;
                p005kotlin.jvm.internal.o0 o0Var2 = new p005kotlin.jvm.internal.o0();
                if (i14 == 5) {
                    float f24 = 5;
                    intValue = (f18 * f22 * f24) + (f14 * f24);
                } else if (i14 > 5) {
                    intValue = (f18 * f22 * 5) + (n1Var.getIntValue() * f19) + ((5 - n1Var.getIntValue()) * f14);
                } else {
                    intValue = ((f18 * f22) + f14) * i14;
                }
                o0Var2.f105806a = intValue;
                i0VarA = k0.a(0, 0, 3, o0VarE);
                iL = j0Var.l();
                i28 = i26;
                strP = y.P(R.string.page_indicator_content_description, new Object[]{Integer.valueOf(iL + 1), Integer.valueOf(i14)}, o0VarE);
                long j25 = jA;
                l0.e(new d(j0Var, i0VarA, i14, o0Var2, f14, f22, f19, n1Var, null), Integer.valueOf(j0Var.l()), o0VarE);
                Boolean bool = Boolean.TRUE;
                i29 = i28 & 14;
                if (i29 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i30 = i28 & 7168;
                boolean z26 = z15;
                if (i30 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z26 | z16;
                objQ2 = o0VarE.q();
                if (z17 || objQ2 == c2565a) {
                    objQ2 = new e(j0Var, i27, null);
                    o0VarE.K(objQ2);
                }
                l0.e((p) objQ2, bool, o0VarE);
                r rVarU = x2.u(rVar, o0Var2.f105806a);
                if ((1879048192 & i28) == 536870912) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zK = o0VarE.k(iL) | z18;
                i34 = i28 & 896;
                if (i34 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zB = z19 | zK | o0VarE.B(strP);
                objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new jl0.e(iL, i14, strP);
                    o0VarE.K(objQ3);
                }
                r rVarC = v.c((e23.l) objQ3, rVarU, false);
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                if (i34 == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean zB2 = o0VarE.B(i0VarA) | z24 | o0VarE.i(f19) | ((((3670016 & i28) ^ 1572864) <= 1048576 && o0VarE.i(f14)) || (i28 & 1572864) == 1048576) | o0VarE.i(f22);
                if (i29 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                j18 = j25;
                j19 = j24;
                r1Var4 = r1Var5;
                zL = zB2 | z25 | o0VarE.l(j18) | o0VarE.l(j19) | o0VarE.B(r1Var4);
                Object objQ4 = o0VarE.q();
                if (!zL || objQ4 == c2565a) {
                    i0Var = i0VarA;
                    obj = new e23.l() { // from class: l02.a
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            f0 f0Var = (f0) obj2;
                            f0Var.getClass();
                            final int i37 = 0;
                            while (true) {
                                final int i38 = i14;
                                if (i37 >= i38) {
                                    return Unit.INSTANCE;
                                }
                                Integer numValueOf = Integer.valueOf(i37);
                                final float f25 = f19;
                                final float f26 = f14;
                                final float f27 = f22;
                                final j0 j0Var2 = j0Var;
                                final long j26 = j18;
                                final long j27 = j19;
                                final r1 r1Var6 = r1Var4;
                                final i0 i0Var2 = i0Var;
                                f0.b(f0Var, numValueOf, new z3.e(-1331215241, true, new q() { // from class: l02.c
                                    @Override // e23.q
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        p3.m mVar2 = (p3.m) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((e2.d) obj3).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var2 = n.f135158a;
                                            Object objQ5 = mVar2.q();
                                            p3.m.f135153a.getClass();
                                            if (objQ5 == p3.m.a.f135155b) {
                                                objQ5 = p0.f(new ct1.c(i0Var2, 7));
                                                mVar2.K(objQ5);
                                            }
                                            x3 x3Var = (x3) objQ5;
                                            int iIntValue2 = ((Number) x3Var.getF182175a()).intValue();
                                            int i39 = i37;
                                            c2.q.a(u1.n.e(x2.q(c2.l.A(r.S, f27, 0.0f, 2), ((g6.f) s1.f.a(((i39 != iIntValue2 || i39 <= 0) && (i39 != ((Number) x3Var.getF182175a()).intValue() + 4 || i39 >= i38 - 1)) ? f26 : f25, null, "", mVar2, 384, 10).getF182175a()).f75997a), j0Var2.l() == i39 ? j26 : j27, r1Var6), mVar2, 0);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 2);
                                i37++;
                            }
                        }
                    };
                    f22 = f22;
                    r1Var4 = r1Var4;
                    j19 = j19;
                    j18 = j18;
                    o0VarE.K(obj);
                } else {
                    i0Var = i0VarA;
                    obj = objQ4;
                }
                o0Var = o0VarE;
                e2.c.c(rVarC, i0Var, null, null, bVar2, null, false, null, (e23.l) obj, o0Var, 196608, 476);
                f16 = f22;
                j16 = j18;
                j15 = j19;
                r1Var2 = r1Var4;
                i25 = i27;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                j15 = j14;
                f16 = f15;
                r1Var2 = r1Var;
                i25 = i19;
                j16 = j8;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: l02.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        f.a(j0Var, rVar, i14, i25, j16, j15, f14, f16, r1Var2, (p3.m) obj2, p0.t(i16 | 1), i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 3072;
        i19 = i15;
        if ((i16 & 24576) == 0) {
            i18 |= 8192;
        }
        if ((196608 & i16) == 0) {
            i18 |= 65536;
        }
        if ((i16 & 1572864) == 0) {
            if (o0VarE.i(f14)) {
                i35 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i35 = 524288;
            }
            i18 |= i35;
        }
        if ((12582912 & i16) == 0) {
            i18 |= 4194304;
        }
        if ((100663296 & i16) == 0) {
            i18 |= 33554432;
        }
        i24 = i18 | C.ENCODING_PCM_32BIT;
        if ((306783379 & i24) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i24 & 1, z14)) {
            o0VarE.G0();
            if ((i16 & 1) != 0) {
                if (i36 != 0) {
                    i19 = 0;
                }
                d92.b bVar3 = d92.b.f58623a;
                bVar3.getClass();
                jA = d92.b.a(o0VarE).b().a().a();
                bVar3.getClass();
                j17 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                bVar3.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97899b.f97918c / 2;
                g6.f.a aVar3 = g6.f.f75994b;
                r1Var3 = k2.i.f102406a;
                i26 = i24 & (-264757249);
            } else {
                if (i36 != 0) {
                    i19 = 0;
                }
                d92.b bVar4 = d92.b.f58623a;
                bVar4.getClass();
                jA = d92.b.a(o0VarE).b().a().a();
                bVar4.getClass();
                j17 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                bVar4.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97899b.f97918c / 2;
                g6.f.a aVar4 = g6.f.f75994b;
                r1Var3 = k2.i.f102406a;
                i26 = i24 & (-264757249);
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            f18 = 2;
            r1 r1Var6 = r1Var3;
            f19 = f14 / f18;
            g6.f.a aVar5 = g6.f.f75994b;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            long j26 = j17;
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(1, o0VarE);
            }
            n1Var = (n1) objQ;
            i27 = i19;
            f22 = f17;
            p005kotlin.jvm.internal.o0 o0Var3 = new p005kotlin.jvm.internal.o0();
            if (i14 == 5) {
                float f25 = 5;
                intValue = (f18 * f22 * f25) + (f14 * f25);
            } else if (i14 > 5) {
                intValue = (f18 * f22 * 5) + (n1Var.getIntValue() * f19) + ((5 - n1Var.getIntValue()) * f14);
            } else {
                intValue = ((f18 * f22) + f14) * i14;
            }
            o0Var3.f105806a = intValue;
            i0VarA = k0.a(0, 0, 3, o0VarE);
            iL = j0Var.l();
            i28 = i26;
            strP = y.P(R.string.page_indicator_content_description, new Object[]{Integer.valueOf(iL + 1), Integer.valueOf(i14)}, o0VarE);
            long j27 = jA;
            l0.e(new d(j0Var, i0VarA, i14, o0Var3, f14, f22, f19, n1Var, null), Integer.valueOf(j0Var.l()), o0VarE);
            Boolean bool2 = Boolean.TRUE;
            i29 = i28 & 14;
            if (i29 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            i30 = i28 & 7168;
            boolean z27 = z15;
            if (i30 == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z27 | z16;
            objQ2 = o0VarE.q();
            if (z17) {
                objQ2 = new e(j0Var, i27, null);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new e(j0Var, i27, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, bool2, o0VarE);
            r rVarU2 = x2.u(rVar, o0Var3.f105806a);
            if ((1879048192 & i28) == 536870912) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean zK2 = o0VarE.k(iL) | z18;
            i34 = i28 & 896;
            if (i34 == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            zB = z19 | zK2 | o0VarE.B(strP);
            objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new jl0.e(iL, i14, strP);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new jl0.e(iL, i14, strP);
                o0VarE.K(objQ3);
            }
            r rVarC2 = v.c((e23.l) objQ3, rVarU2, false);
            h4.d.f81522a.getClass();
            h4.g.b bVar5 = h4.d.a.f81534l;
            if (i34 == 256) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean zB3 = o0VarE.B(i0VarA) | z24 | o0VarE.i(f19) | ((((3670016 & i28) ^ 1572864) <= 1048576 && o0VarE.i(f14)) || (i28 & 1572864) == 1048576) | o0VarE.i(f22);
            if (i29 == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            j18 = j27;
            j19 = j26;
            r1Var4 = r1Var6;
            zL = zB3 | z25 | o0VarE.l(j18) | o0VarE.l(j19) | o0VarE.B(r1Var4);
            Object objQ5 = o0VarE.q();
            if (zL) {
                i0Var = i0VarA;
                obj = new e23.l() { // from class: l02.a
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        f0 f0Var = (f0) obj2;
                        f0Var.getClass();
                        final int i37 = 0;
                        while (true) {
                            final int i38 = i14;
                            if (i37 >= i38) {
                                return Unit.INSTANCE;
                            }
                            Integer numValueOf = Integer.valueOf(i37);
                            final float f26 = f19;
                            final float f27 = f14;
                            final float f28 = f22;
                            final j0 j0Var2 = j0Var;
                            final long j28 = j18;
                            final long j29 = j19;
                            final r1 r1Var7 = r1Var4;
                            final i0 i0Var2 = i0Var;
                            f0.b(f0Var, numValueOf, new z3.e(-1331215241, true, new q() { // from class: l02.c
                                @Override // e23.q
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    p3.m mVar2 = (p3.m) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    ((e2.d) obj3).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var3 = n.f135158a;
                                        Object objQ6 = mVar2.q();
                                        p3.m.f135153a.getClass();
                                        if (objQ6 == p3.m.a.f135155b) {
                                            objQ6 = p0.f(new ct1.c(i0Var2, 7));
                                            mVar2.K(objQ6);
                                        }
                                        x3 x3Var = (x3) objQ6;
                                        int iIntValue2 = ((Number) x3Var.getF182175a()).intValue();
                                        int i39 = i37;
                                        c2.q.a(u1.n.e(x2.q(c2.l.A(r.S, f28, 0.0f, 2), ((g6.f) s1.f.a(((i39 != iIntValue2 || i39 <= 0) && (i39 != ((Number) x3Var.getF182175a()).intValue() + 4 || i39 >= i38 - 1)) ? f27 : f26, null, "", mVar2, 384, 10).getF182175a()).f75997a), j0Var2.l() == i39 ? j28 : j29, r1Var7), mVar2, 0);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 2);
                            i37++;
                        }
                    }
                };
                f22 = f22;
                r1Var4 = r1Var4;
                j19 = j19;
                j18 = j18;
                o0VarE.K(obj);
            } else {
                i0Var = i0VarA;
                obj = new e23.l() { // from class: l02.a
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        f0 f0Var = (f0) obj2;
                        f0Var.getClass();
                        final int i37 = 0;
                        while (true) {
                            final int i38 = i14;
                            if (i37 >= i38) {
                                return Unit.INSTANCE;
                            }
                            Integer numValueOf = Integer.valueOf(i37);
                            final float f26 = f19;
                            final float f27 = f14;
                            final float f28 = f22;
                            final j0 j0Var2 = j0Var;
                            final long j28 = j18;
                            final long j29 = j19;
                            final r1 r1Var7 = r1Var4;
                            final i0 i0Var2 = i0Var;
                            f0.b(f0Var, numValueOf, new z3.e(-1331215241, true, new q() { // from class: l02.c
                                @Override // e23.q
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    p3.m mVar2 = (p3.m) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    ((e2.d) obj3).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var3 = n.f135158a;
                                        Object objQ6 = mVar2.q();
                                        p3.m.f135153a.getClass();
                                        if (objQ6 == p3.m.a.f135155b) {
                                            objQ6 = p0.f(new ct1.c(i0Var2, 7));
                                            mVar2.K(objQ6);
                                        }
                                        x3 x3Var = (x3) objQ6;
                                        int iIntValue2 = ((Number) x3Var.getF182175a()).intValue();
                                        int i39 = i37;
                                        c2.q.a(u1.n.e(x2.q(c2.l.A(r.S, f28, 0.0f, 2), ((g6.f) s1.f.a(((i39 != iIntValue2 || i39 <= 0) && (i39 != ((Number) x3Var.getF182175a()).intValue() + 4 || i39 >= i38 - 1)) ? f27 : f26, null, "", mVar2, 384, 10).getF182175a()).f75997a), j0Var2.l() == i39 ? j28 : j29, r1Var7), mVar2, 0);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 2);
                            i37++;
                        }
                    }
                };
                f22 = f22;
                r1Var4 = r1Var4;
                j19 = j19;
                j18 = j18;
                o0VarE.K(obj);
            }
            o0Var = o0VarE;
            e2.c.c(rVarC2, i0Var, null, null, bVar5, null, false, null, (e23.l) obj, o0Var, 196608, 476);
            f16 = f22;
            j16 = j18;
            j15 = j19;
            r1Var2 = r1Var4;
            i25 = i27;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            j15 = j14;
            f16 = f15;
            r1Var2 = r1Var;
            i25 = i19;
            j16 = j8;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: l02.b
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    f.a(j0Var, rVar, i14, i25, j16, j15, f14, f16, r1Var2, (p3.m) obj2, p0.t(i16 | 1), i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
