package i3;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f88278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c2.h2 f88279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.q<c2.t2, p3.m, Integer, Unit> f88280c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j8, c2.h2 h2Var, e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar) {
            this.f88278a = j8;
            this.f88279b = h2Var;
            this.f88280c = qVar;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                s7.f89624a.getClass();
                l3.k.b(this.f88278a, s7.c(mVar2).f89554m, z3.f.c(417635459, new g1(this.f88279b, this.f88280c), mVar2), mVar2, 384);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x013c A[PHI: r1 r6 r9 r14 r15
      0x013c: PHI (r1v54 u1.u) = (r1v25 u1.u), (r1v57 u1.u) binds: [B:121:0x017f, B:107:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r6v6 c2.h2) = (r6v3 c2.h2), (r6v7 c2.h2) binds: [B:121:0x017f, B:107:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r9v10 i3.f1) = (r9v7 i3.f1), (r9v4 i3.f1) binds: [B:121:0x017f, B:107:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r14v4 int) = (r14v1 int), (r14v5 int) binds: [B:121:0x017f, B:107:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r15v9 boolean) = (r15v5 boolean), (r15v10 boolean) binds: [B:121:0x017f, B:107:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x0167  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:122:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0198  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:144:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x020e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0224  */
    /* JADX WARN: Code duplicated, block: B:149:0x0227  */
    /* JADX WARN: Code duplicated, block: B:151:0x022b  */
    /* JADX WARN: Code duplicated, block: B:152:0x022e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0232  */
    /* JADX WARN: Code duplicated, block: B:155:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0239  */
    /* JADX WARN: Code duplicated, block: B:158:0x023c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0244  */
    /* JADX WARN: Code duplicated, block: B:164:0x0279  */
    /* JADX WARN: Code duplicated, block: B:166:0x027f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0293  */
    /* JADX WARN: Code duplicated, block: B:174:0x0299  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:186:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:191:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:193:0x0335  */
    /* JADX WARN: Code duplicated, block: B:196:0x0347  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e23.a<Unit> aVar, h4.r rVar, boolean z14, o4.r1 r1Var, b1 b1Var, f1 f1Var, u1.u uVar, c2.h2 h2Var, a2.j jVar, e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        f1 f1Var2;
        int i17;
        u1.u uVar2;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z16;
        boolean z17;
        p3.o0 o0Var;
        c2.h2 h2Var2;
        boolean z18;
        f1 f1Var3;
        u1.u uVar3;
        a2.j jVar2;
        p3.p2 p2VarI0;
        f1 f1Var4;
        c2.h2 h2Var3;
        c2.h2 h2Var4;
        u1.u uVar4;
        int i28;
        boolean z19;
        a2.j jVar3;
        p3.m.a aVar2;
        a2.j jVar4;
        long j8;
        long j14;
        int i29;
        p3.m.a aVar3;
        Object objQ;
        p3.m.a.C2565a c2565a;
        f4.s sVar;
        boolean zB;
        Object objQ2;
        a2.h hVar;
        float f14;
        Object objQ3;
        s1.b bVar;
        float f15;
        boolean zR;
        Object objQ4;
        boolean z24;
        s1.m mVar2;
        int i30;
        float f16;
        Object objQ5;
        Object objH;
        int i34;
        int i35;
        int i36;
        p3.o0 o0VarE = mVar.E(-1310015664);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i37 = i15 & 4;
        if (i37 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i14 & 3072) != 0) {
                if (o0VarE.B(r1Var)) {
                    i36 = 2048;
                } else {
                    i36 = 1024;
                }
                i16 |= i36;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(b1Var)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i16 |= i35;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    f1Var2 = f1Var;
                    int i38 = o0VarE.B(f1Var2) ? 131072 : 65536;
                    i16 |= i38;
                } else {
                    f1Var2 = f1Var;
                }
                i16 |= i38;
            } else {
                f1Var2 = f1Var;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                if ((1572864 & i14) == 0) {
                    uVar2 = uVar;
                    if (o0VarE.B(uVar2)) {
                        i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 128;
                if (i19 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(h2Var)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i16 |= i24;
                }
                i25 = i16;
                i26 = i15 & 256;
                if (i26 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (o0VarE.B(jVar)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i25 |= i27;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i25 |= i34;
                    }
                    z16 = true;
                    if ((i25 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (o0VarE.n(i25 & 1, z17)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0 || o0VarE.o0()) {
                            if (i37 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 32) != 0) {
                                c1.f87691a.getClass();
                                n3.a0.f122675a.getClass();
                                float f17 = n3.a0.f122677c;
                                float f18 = n3.a0.f122686l;
                                float f19 = n3.a0.f122683i;
                                float f22 = n3.a0.f122684j;
                                float f24 = n3.a0.f122679e;
                                p3.x1 x1Var = p3.n.f135158a;
                                f1Var4 = new f1(f17, f18, f19, f22, f24, null);
                                i25 &= -458753;
                            } else {
                                f1Var4 = f1Var2;
                            }
                            if (i17 != 0) {
                                uVar2 = null;
                            }
                            if (i19 != 0) {
                                c1.f87691a.getClass();
                                h2Var3 = c1.f87692b;
                            } else {
                                h2Var3 = h2Var;
                            }
                            h2Var4 = h2Var3;
                            uVar4 = uVar2;
                            i28 = i25;
                            f1Var2 = f1Var4;
                            z19 = z15;
                            if (i26 != 0) {
                                jVar3 = null;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var2 = p3.n.f135158a;
                            aVar2 = p3.m.f135153a;
                            if (jVar3 == null) {
                                objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                                if (objH == p3.m.a.f135155b) {
                                    objH = kg.f.b(o0VarE);
                                }
                                jVar4 = (a2.j) objH;
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-499617780);
                                o0VarE.g0(false);
                                jVar4 = jVar3;
                            }
                            if (z19) {
                                j8 = b1Var.f87531a;
                            } else {
                                j8 = b1Var.f87533c;
                            }
                            long j15 = j8;
                            if (z19) {
                                j14 = b1Var.f87532b;
                            } else {
                                j14 = b1Var.f87534d;
                            }
                            if (f1Var2 == null) {
                                o0VarE.C(1691921830);
                                i30 = 0;
                                o0VarE.g0(false);
                                aVar3 = aVar2;
                                z24 = z19;
                                mVar2 = null;
                            } else {
                                o0VarE.C(-499611205);
                                i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                                aVar3 = aVar2;
                                objQ = o0VarE.q();
                                aVar3.getClass();
                                c2565a = p3.m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = new f4.s();
                                    o0VarE.K(objQ);
                                }
                                sVar = (f4.s) objQ;
                                zB = o0VarE.B(jVar4);
                                objQ2 = o0VarE.q();
                                if (zB || objQ2 == c2565a) {
                                    objQ2 = new d1(jVar4, sVar, null);
                                    o0VarE.K(objQ2);
                                }
                                p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                                hVar = (a2.h) p13.h0.n0(sVar);
                                if (!z19) {
                                    f14 = f1Var2.f88050e;
                                } else if (hVar instanceof a2.l.b) {
                                    f14 = f1Var2.f88047b;
                                } else if (hVar instanceof a2.e) {
                                    f14 = f1Var2.f88049d;
                                } else if (hVar instanceof a2.b) {
                                    f14 = f1Var2.f88048c;
                                } else {
                                    f14 = f1Var2.f88046a;
                                }
                                objQ3 = o0VarE.q();
                                if (objQ3 == c2565a) {
                                    objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                                    o0VarE.K(objQ3);
                                }
                                bVar = (s1.b) objQ3;
                                g6.f fVarA = g6.f.a(f14);
                                f15 = f14;
                                boolean zR2 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                                if ((((i29 & 896) ^ 384) > 256 || !o0VarE.B(f1Var2)) && (i29 & 384) != 256) {
                                }
                                zR = zR2 | z16 | o0VarE.r(hVar);
                                objQ4 = o0VarE.q();
                                if (!zR || objQ4 == c2565a) {
                                    z24 = z19;
                                    objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                                    o0VarE.K(objQ4);
                                } else {
                                    z24 = z19;
                                }
                                p3.l0.e((e23.p) objQ4, fVarA, o0VarE);
                                mVar2 = bVar.f155489c;
                                i30 = 0;
                                o0VarE.g0(false);
                            }
                            if (mVar2 != null) {
                                f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
                            } else {
                                f16 = i30;
                                g6.f.a aVar4 = g6.f.f75994b;
                            }
                            float f25 = f16;
                            objQ5 = o0VarE.q();
                            aVar3.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new i11.f(4);
                                o0VarE.K(objQ5);
                            }
                            u1.u uVar5 = uVar4;
                            boolean z25 = z24;
                            o0Var = o0VarE;
                            ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z25, r1Var, j15, j14, 0.0f, f25, uVar5, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
                            h2Var2 = h2Var4;
                            f1Var3 = f1Var2;
                            z18 = z25;
                            uVar3 = uVar5;
                            jVar2 = jVar3;
                        } else {
                            o0VarE.e();
                            if ((i15 & 32) != 0) {
                                i25 &= -458753;
                            }
                            h2Var4 = h2Var;
                            uVar4 = uVar2;
                            i28 = i25;
                            z19 = z15;
                        }
                        jVar3 = jVar;
                        o0VarE.h0();
                        p3.x1 x1Var3 = p3.n.f135158a;
                        aVar2 = p3.m.f135153a;
                        if (jVar3 == null) {
                            objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                            if (objH == p3.m.a.f135155b) {
                                objH = kg.f.b(o0VarE);
                            }
                            jVar4 = (a2.j) objH;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-499617780);
                            o0VarE.g0(false);
                            jVar4 = jVar3;
                        }
                        if (z19) {
                            j8 = b1Var.f87531a;
                        } else {
                            j8 = b1Var.f87533c;
                        }
                        long j16 = j8;
                        if (z19) {
                            j14 = b1Var.f87532b;
                        } else {
                            j14 = b1Var.f87534d;
                        }
                        if (f1Var2 == null) {
                            o0VarE.C(1691921830);
                            i30 = 0;
                            o0VarE.g0(false);
                            aVar3 = aVar2;
                            z24 = z19;
                            mVar2 = null;
                        } else {
                            o0VarE.C(-499611205);
                            i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                            aVar3 = aVar2;
                            objQ = o0VarE.q();
                            aVar3.getClass();
                            c2565a = p3.m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = new f4.s();
                                o0VarE.K(objQ);
                            }
                            sVar = (f4.s) objQ;
                            zB = o0VarE.B(jVar4);
                            objQ2 = o0VarE.q();
                            if (zB) {
                                objQ2 = new d1(jVar4, sVar, null);
                                o0VarE.K(objQ2);
                            } else {
                                objQ2 = new d1(jVar4, sVar, null);
                                o0VarE.K(objQ2);
                            }
                            p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                            hVar = (a2.h) p13.h0.n0(sVar);
                            if (!z19) {
                                f14 = f1Var2.f88050e;
                            } else if (hVar instanceof a2.l.b) {
                                f14 = f1Var2.f88047b;
                            } else if (hVar instanceof a2.e) {
                                f14 = f1Var2.f88049d;
                            } else if (hVar instanceof a2.b) {
                                f14 = f1Var2.f88048c;
                            } else {
                                f14 = f1Var2.f88046a;
                            }
                            objQ3 = o0VarE.q();
                            if (objQ3 == c2565a) {
                                objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                                o0VarE.K(objQ3);
                            }
                            bVar = (s1.b) objQ3;
                            g6.f fVarA2 = g6.f.a(f14);
                            f15 = f14;
                            boolean zR3 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                            z16 = ((i29 & 896) ^ 384) > 256 ? false : false;
                            zR = zR3 | z16 | o0VarE.r(hVar);
                            objQ4 = o0VarE.q();
                            if (zR) {
                                z24 = z19;
                                objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                                o0VarE.K(objQ4);
                            } else {
                                z24 = z19;
                                objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                                o0VarE.K(objQ4);
                            }
                            p3.l0.e((e23.p) objQ4, fVarA2, o0VarE);
                            mVar2 = bVar.f155489c;
                            i30 = 0;
                            o0VarE.g0(false);
                        }
                        if (mVar2 != null) {
                            f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
                        } else {
                            f16 = i30;
                            g6.f.a aVar5 = g6.f.f75994b;
                        }
                        float f26 = f16;
                        objQ5 = o0VarE.q();
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new i11.f(4);
                            o0VarE.K(objQ5);
                        }
                        u1.u uVar6 = uVar4;
                        boolean z26 = z24;
                        o0Var = o0VarE;
                        ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z26, r1Var, j16, j14, 0.0f, f26, uVar6, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
                        h2Var2 = h2Var4;
                        f1Var3 = f1Var2;
                        z18 = z26;
                        uVar3 = uVar6;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        h2Var2 = h2Var;
                        z18 = z15;
                        f1Var3 = f1Var2;
                        uVar3 = uVar2;
                        jVar2 = jVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new c12.f(aVar, rVar, z18, r1Var, b1Var, f1Var3, uVar3, h2Var2, jVar2, qVar, i14, i15);
                    }
                }
                i25 |= 100663296;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i25 |= i34;
                }
                z16 = true;
                if ((i25 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i25 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i37 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 32) != 0) {
                            c1.f87691a.getClass();
                            n3.a0.f122675a.getClass();
                            float f110 = n3.a0.f122677c;
                            float f111 = n3.a0.f122686l;
                            float f112 = n3.a0.f122683i;
                            float f27 = n3.a0.f122684j;
                            float f28 = n3.a0.f122679e;
                            p3.x1 x1Var4 = p3.n.f135158a;
                            f1Var4 = new f1(f110, f111, f112, f27, f28, null);
                            i25 &= -458753;
                        } else {
                            f1Var4 = f1Var2;
                        }
                        if (i17 != 0) {
                            uVar2 = null;
                        }
                        if (i19 != 0) {
                            c1.f87691a.getClass();
                            h2Var3 = c1.f87692b;
                        } else {
                            h2Var3 = h2Var;
                        }
                        h2Var4 = h2Var3;
                        uVar4 = uVar2;
                        i28 = i25;
                        f1Var2 = f1Var4;
                        z19 = z15;
                        if (i26 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i37 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 32) != 0) {
                            c1.f87691a.getClass();
                            n3.a0.f122675a.getClass();
                            float f113 = n3.a0.f122677c;
                            float f114 = n3.a0.f122686l;
                            float f115 = n3.a0.f122683i;
                            float f29 = n3.a0.f122684j;
                            float f210 = n3.a0.f122679e;
                            p3.x1 x1Var5 = p3.n.f135158a;
                            f1Var4 = new f1(f113, f114, f115, f29, f210, null);
                            i25 &= -458753;
                        } else {
                            f1Var4 = f1Var2;
                        }
                        if (i17 != 0) {
                            uVar2 = null;
                        }
                        if (i19 != 0) {
                            c1.f87691a.getClass();
                            h2Var3 = c1.f87692b;
                        } else {
                            h2Var3 = h2Var;
                        }
                        h2Var4 = h2Var3;
                        uVar4 = uVar2;
                        i28 = i25;
                        f1Var2 = f1Var4;
                        z19 = z15;
                        if (i26 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var6 = p3.n.f135158a;
                    aVar2 = p3.m.f135153a;
                    if (jVar3 == null) {
                        objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                        if (objH == p3.m.a.f135155b) {
                            objH = kg.f.b(o0VarE);
                        }
                        jVar4 = (a2.j) objH;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-499617780);
                        o0VarE.g0(false);
                        jVar4 = jVar3;
                    }
                    if (z19) {
                        j8 = b1Var.f87531a;
                    } else {
                        j8 = b1Var.f87533c;
                    }
                    long j17 = j8;
                    if (z19) {
                        j14 = b1Var.f87532b;
                    } else {
                        j14 = b1Var.f87534d;
                    }
                    if (f1Var2 == null) {
                        o0VarE.C(1691921830);
                        i30 = 0;
                        o0VarE.g0(false);
                        aVar3 = aVar2;
                        z24 = z19;
                        mVar2 = null;
                    } else {
                        o0VarE.C(-499611205);
                        i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                        aVar3 = aVar2;
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new f4.s();
                            o0VarE.K(objQ);
                        }
                        sVar = (f4.s) objQ;
                        zB = o0VarE.B(jVar4);
                        objQ2 = o0VarE.q();
                        if (zB) {
                            objQ2 = new d1(jVar4, sVar, null);
                            o0VarE.K(objQ2);
                        } else {
                            objQ2 = new d1(jVar4, sVar, null);
                            o0VarE.K(objQ2);
                        }
                        p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                        hVar = (a2.h) p13.h0.n0(sVar);
                        if (!z19) {
                            f14 = f1Var2.f88050e;
                        } else if (hVar instanceof a2.l.b) {
                            f14 = f1Var2.f88047b;
                        } else if (hVar instanceof a2.e) {
                            f14 = f1Var2.f88049d;
                        } else if (hVar instanceof a2.b) {
                            f14 = f1Var2.f88048c;
                        } else {
                            f14 = f1Var2.f88046a;
                        }
                        objQ3 = o0VarE.q();
                        if (objQ3 == c2565a) {
                            objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                            o0VarE.K(objQ3);
                        }
                        bVar = (s1.b) objQ3;
                        g6.f fVarA3 = g6.f.a(f14);
                        f15 = f14;
                        boolean zR4 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                        if (((i29 & 896) ^ 384) > 256) {
                        }
                        zR = zR4 | z16 | o0VarE.r(hVar);
                        objQ4 = o0VarE.q();
                        if (zR) {
                            z24 = z19;
                            objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                            o0VarE.K(objQ4);
                        } else {
                            z24 = z19;
                            objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                            o0VarE.K(objQ4);
                        }
                        p3.l0.e((e23.p) objQ4, fVarA3, o0VarE);
                        mVar2 = bVar.f155489c;
                        i30 = 0;
                        o0VarE.g0(false);
                    }
                    if (mVar2 != null) {
                        f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
                    } else {
                        f16 = i30;
                        g6.f.a aVar6 = g6.f.f75994b;
                    }
                    float f211 = f16;
                    objQ5 = o0VarE.q();
                    aVar3.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new i11.f(4);
                        o0VarE.K(objQ5);
                    }
                    u1.u uVar7 = uVar4;
                    boolean z27 = z24;
                    o0Var = o0VarE;
                    ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z27, r1Var, j17, j14, 0.0f, f211, uVar7, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
                    h2Var2 = h2Var4;
                    f1Var3 = f1Var2;
                    z18 = z27;
                    uVar3 = uVar7;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    h2Var2 = h2Var;
                    z18 = z15;
                    f1Var3 = f1Var2;
                    uVar3 = uVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c12.f(aVar, rVar, z18, r1Var, b1Var, f1Var3, uVar3, h2Var2, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 1572864;
            uVar2 = uVar;
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.B(h2Var)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
            i25 = i16;
            i26 = i15 & 256;
            if (i26 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.B(jVar)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i25 |= i27;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i25 |= i34;
                }
                z16 = true;
                if ((i25 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i25 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i37 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 32) != 0) {
                            c1.f87691a.getClass();
                            n3.a0.f122675a.getClass();
                            float f116 = n3.a0.f122677c;
                            float f117 = n3.a0.f122686l;
                            float f118 = n3.a0.f122683i;
                            float f212 = n3.a0.f122684j;
                            float f213 = n3.a0.f122679e;
                            p3.x1 x1Var7 = p3.n.f135158a;
                            f1Var4 = new f1(f116, f117, f118, f212, f213, null);
                            i25 &= -458753;
                        } else {
                            f1Var4 = f1Var2;
                        }
                        if (i17 != 0) {
                            uVar2 = null;
                        }
                        if (i19 != 0) {
                            c1.f87691a.getClass();
                            h2Var3 = c1.f87692b;
                        } else {
                            h2Var3 = h2Var;
                        }
                        h2Var4 = h2Var3;
                        uVar4 = uVar2;
                        i28 = i25;
                        f1Var2 = f1Var4;
                        z19 = z15;
                        if (i26 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i37 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 32) != 0) {
                            c1.f87691a.getClass();
                            n3.a0.f122675a.getClass();
                            float f119 = n3.a0.f122677c;
                            float f1110 = n3.a0.f122686l;
                            float f1111 = n3.a0.f122683i;
                            float f214 = n3.a0.f122684j;
                            float f215 = n3.a0.f122679e;
                            p3.x1 x1Var8 = p3.n.f135158a;
                            f1Var4 = new f1(f119, f1110, f1111, f214, f215, null);
                            i25 &= -458753;
                        } else {
                            f1Var4 = f1Var2;
                        }
                        if (i17 != 0) {
                            uVar2 = null;
                        }
                        if (i19 != 0) {
                            c1.f87691a.getClass();
                            h2Var3 = c1.f87692b;
                        } else {
                            h2Var3 = h2Var;
                        }
                        h2Var4 = h2Var3;
                        uVar4 = uVar2;
                        i28 = i25;
                        f1Var2 = f1Var4;
                        z19 = z15;
                        if (i26 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var9 = p3.n.f135158a;
                    aVar2 = p3.m.f135153a;
                    if (jVar3 == null) {
                        objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                        if (objH == p3.m.a.f135155b) {
                            objH = kg.f.b(o0VarE);
                        }
                        jVar4 = (a2.j) objH;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-499617780);
                        o0VarE.g0(false);
                        jVar4 = jVar3;
                    }
                    if (z19) {
                        j8 = b1Var.f87531a;
                    } else {
                        j8 = b1Var.f87533c;
                    }
                    long j18 = j8;
                    if (z19) {
                        j14 = b1Var.f87532b;
                    } else {
                        j14 = b1Var.f87534d;
                    }
                    if (f1Var2 == null) {
                        o0VarE.C(1691921830);
                        i30 = 0;
                        o0VarE.g0(false);
                        aVar3 = aVar2;
                        z24 = z19;
                        mVar2 = null;
                    } else {
                        o0VarE.C(-499611205);
                        i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                        aVar3 = aVar2;
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new f4.s();
                            o0VarE.K(objQ);
                        }
                        sVar = (f4.s) objQ;
                        zB = o0VarE.B(jVar4);
                        objQ2 = o0VarE.q();
                        if (zB) {
                            objQ2 = new d1(jVar4, sVar, null);
                            o0VarE.K(objQ2);
                        } else {
                            objQ2 = new d1(jVar4, sVar, null);
                            o0VarE.K(objQ2);
                        }
                        p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                        hVar = (a2.h) p13.h0.n0(sVar);
                        if (!z19) {
                            f14 = f1Var2.f88050e;
                        } else if (hVar instanceof a2.l.b) {
                            f14 = f1Var2.f88047b;
                        } else if (hVar instanceof a2.e) {
                            f14 = f1Var2.f88049d;
                        } else if (hVar instanceof a2.b) {
                            f14 = f1Var2.f88048c;
                        } else {
                            f14 = f1Var2.f88046a;
                        }
                        objQ3 = o0VarE.q();
                        if (objQ3 == c2565a) {
                            objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                            o0VarE.K(objQ3);
                        }
                        bVar = (s1.b) objQ3;
                        g6.f fVarA4 = g6.f.a(f14);
                        f15 = f14;
                        boolean zR5 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                        if (((i29 & 896) ^ 384) > 256) {
                        }
                        zR = zR5 | z16 | o0VarE.r(hVar);
                        objQ4 = o0VarE.q();
                        if (zR) {
                            z24 = z19;
                            objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                            o0VarE.K(objQ4);
                        } else {
                            z24 = z19;
                            objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                            o0VarE.K(objQ4);
                        }
                        p3.l0.e((e23.p) objQ4, fVarA4, o0VarE);
                        mVar2 = bVar.f155489c;
                        i30 = 0;
                        o0VarE.g0(false);
                    }
                    if (mVar2 != null) {
                        f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
                    } else {
                        f16 = i30;
                        g6.f.a aVar7 = g6.f.f75994b;
                    }
                    float f216 = f16;
                    objQ5 = o0VarE.q();
                    aVar3.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new i11.f(4);
                        o0VarE.K(objQ5);
                    }
                    u1.u uVar8 = uVar4;
                    boolean z28 = z24;
                    o0Var = o0VarE;
                    ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z28, r1Var, j18, j14, 0.0f, f216, uVar8, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
                    h2Var2 = h2Var4;
                    f1Var3 = f1Var2;
                    z18 = z28;
                    uVar3 = uVar8;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    h2Var2 = h2Var;
                    z18 = z15;
                    f1Var3 = f1Var2;
                    uVar3 = uVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c12.f(aVar, rVar, z18, r1Var, b1Var, f1Var3, uVar3, h2Var2, jVar2, qVar, i14, i15);
                }
            }
            i25 |= 100663296;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(qVar)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i25 |= i34;
            }
            z16 = true;
            if ((i25 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i25 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i37 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 32) != 0) {
                        c1.f87691a.getClass();
                        n3.a0.f122675a.getClass();
                        float f1112 = n3.a0.f122677c;
                        float f1113 = n3.a0.f122686l;
                        float f1114 = n3.a0.f122683i;
                        float f217 = n3.a0.f122684j;
                        float f218 = n3.a0.f122679e;
                        p3.x1 x1Var10 = p3.n.f135158a;
                        f1Var4 = new f1(f1112, f1113, f1114, f217, f218, null);
                        i25 &= -458753;
                    } else {
                        f1Var4 = f1Var2;
                    }
                    if (i17 != 0) {
                        uVar2 = null;
                    }
                    if (i19 != 0) {
                        c1.f87691a.getClass();
                        h2Var3 = c1.f87692b;
                    } else {
                        h2Var3 = h2Var;
                    }
                    h2Var4 = h2Var3;
                    uVar4 = uVar2;
                    i28 = i25;
                    f1Var2 = f1Var4;
                    z19 = z15;
                    if (i26 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i37 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 32) != 0) {
                        c1.f87691a.getClass();
                        n3.a0.f122675a.getClass();
                        float f1115 = n3.a0.f122677c;
                        float f1116 = n3.a0.f122686l;
                        float f1117 = n3.a0.f122683i;
                        float f219 = n3.a0.f122684j;
                        float f2110 = n3.a0.f122679e;
                        p3.x1 x1Var11 = p3.n.f135158a;
                        f1Var4 = new f1(f1115, f1116, f1117, f219, f2110, null);
                        i25 &= -458753;
                    } else {
                        f1Var4 = f1Var2;
                    }
                    if (i17 != 0) {
                        uVar2 = null;
                    }
                    if (i19 != 0) {
                        c1.f87691a.getClass();
                        h2Var3 = c1.f87692b;
                    } else {
                        h2Var3 = h2Var;
                    }
                    h2Var4 = h2Var3;
                    uVar4 = uVar2;
                    i28 = i25;
                    f1Var2 = f1Var4;
                    z19 = z15;
                    if (i26 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var12 = p3.n.f135158a;
                aVar2 = p3.m.f135153a;
                if (jVar3 == null) {
                    objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                    if (objH == p3.m.a.f135155b) {
                        objH = kg.f.b(o0VarE);
                    }
                    jVar4 = (a2.j) objH;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-499617780);
                    o0VarE.g0(false);
                    jVar4 = jVar3;
                }
                if (z19) {
                    j8 = b1Var.f87531a;
                } else {
                    j8 = b1Var.f87533c;
                }
                long j19 = j8;
                if (z19) {
                    j14 = b1Var.f87532b;
                } else {
                    j14 = b1Var.f87534d;
                }
                if (f1Var2 == null) {
                    o0VarE.C(1691921830);
                    i30 = 0;
                    o0VarE.g0(false);
                    aVar3 = aVar2;
                    z24 = z19;
                    mVar2 = null;
                } else {
                    o0VarE.C(-499611205);
                    i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                    aVar3 = aVar2;
                    objQ = o0VarE.q();
                    aVar3.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new f4.s();
                        o0VarE.K(objQ);
                    }
                    sVar = (f4.s) objQ;
                    zB = o0VarE.B(jVar4);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new d1(jVar4, sVar, null);
                        o0VarE.K(objQ2);
                    } else {
                        objQ2 = new d1(jVar4, sVar, null);
                        o0VarE.K(objQ2);
                    }
                    p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                    hVar = (a2.h) p13.h0.n0(sVar);
                    if (!z19) {
                        f14 = f1Var2.f88050e;
                    } else if (hVar instanceof a2.l.b) {
                        f14 = f1Var2.f88047b;
                    } else if (hVar instanceof a2.e) {
                        f14 = f1Var2.f88049d;
                    } else if (hVar instanceof a2.b) {
                        f14 = f1Var2.f88048c;
                    } else {
                        f14 = f1Var2.f88046a;
                    }
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                        o0VarE.K(objQ3);
                    }
                    bVar = (s1.b) objQ3;
                    g6.f fVarA5 = g6.f.a(f14);
                    f15 = f14;
                    boolean zR6 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                    if (((i29 & 896) ^ 384) > 256) {
                    }
                    zR = zR6 | z16 | o0VarE.r(hVar);
                    objQ4 = o0VarE.q();
                    if (zR) {
                        z24 = z19;
                        objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                        o0VarE.K(objQ4);
                    } else {
                        z24 = z19;
                        objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                        o0VarE.K(objQ4);
                    }
                    p3.l0.e((e23.p) objQ4, fVarA5, o0VarE);
                    mVar2 = bVar.f155489c;
                    i30 = 0;
                    o0VarE.g0(false);
                }
                if (mVar2 != null) {
                    f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
                } else {
                    f16 = i30;
                    g6.f.a aVar8 = g6.f.f75994b;
                }
                float f2111 = f16;
                objQ5 = o0VarE.q();
                aVar3.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new i11.f(4);
                    o0VarE.K(objQ5);
                }
                u1.u uVar9 = uVar4;
                boolean z29 = z24;
                o0Var = o0VarE;
                ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z29, r1Var, j19, j14, 0.0f, f2111, uVar9, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
                h2Var2 = h2Var4;
                f1Var3 = f1Var2;
                z18 = z29;
                uVar3 = uVar9;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                h2Var2 = h2Var;
                z18 = z15;
                f1Var3 = f1Var2;
                uVar3 = uVar2;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c12.f(aVar, rVar, z18, r1Var, b1Var, f1Var3, uVar3, h2Var2, jVar2, qVar, i14, i15);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) != 0) {
            if (o0VarE.B(r1Var)) {
                i36 = 2048;
            } else {
                i36 = 1024;
            }
            i16 |= i36;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(b1Var)) {
                i35 = 16384;
            } else {
                i35 = 8192;
            }
            i16 |= i35;
        }
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                f1Var2 = f1Var;
                if (o0VarE.B(f1Var2)) {
                }
                i16 |= i38;
            } else {
                f1Var2 = f1Var;
            }
            i16 |= i38;
        } else {
            f1Var2 = f1Var;
        }
        i17 = i15 & 64;
        if (i17 != 0) {
            if ((1572864 & i14) == 0) {
                uVar2 = uVar;
                if (o0VarE.B(uVar2)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.B(h2Var)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
            i25 = i16;
            i26 = i15 & 256;
            if (i26 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.B(jVar)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i25 |= i27;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i25 |= i34;
                }
                z16 = true;
                if ((i25 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i25 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i37 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 32) != 0) {
                            c1.f87691a.getClass();
                            n3.a0.f122675a.getClass();
                            float f1118 = n3.a0.f122677c;
                            float f1119 = n3.a0.f122686l;
                            float f11110 = n3.a0.f122683i;
                            float f2112 = n3.a0.f122684j;
                            float f2113 = n3.a0.f122679e;
                            p3.x1 x1Var13 = p3.n.f135158a;
                            f1Var4 = new f1(f1118, f1119, f11110, f2112, f2113, null);
                            i25 &= -458753;
                        } else {
                            f1Var4 = f1Var2;
                        }
                        if (i17 != 0) {
                            uVar2 = null;
                        }
                        if (i19 != 0) {
                            c1.f87691a.getClass();
                            h2Var3 = c1.f87692b;
                        } else {
                            h2Var3 = h2Var;
                        }
                        h2Var4 = h2Var3;
                        uVar4 = uVar2;
                        i28 = i25;
                        f1Var2 = f1Var4;
                        z19 = z15;
                        if (i26 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i37 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 32) != 0) {
                            c1.f87691a.getClass();
                            n3.a0.f122675a.getClass();
                            float f11111 = n3.a0.f122677c;
                            float f11112 = n3.a0.f122686l;
                            float f11113 = n3.a0.f122683i;
                            float f2114 = n3.a0.f122684j;
                            float f2115 = n3.a0.f122679e;
                            p3.x1 x1Var14 = p3.n.f135158a;
                            f1Var4 = new f1(f11111, f11112, f11113, f2114, f2115, null);
                            i25 &= -458753;
                        } else {
                            f1Var4 = f1Var2;
                        }
                        if (i17 != 0) {
                            uVar2 = null;
                        }
                        if (i19 != 0) {
                            c1.f87691a.getClass();
                            h2Var3 = c1.f87692b;
                        } else {
                            h2Var3 = h2Var;
                        }
                        h2Var4 = h2Var3;
                        uVar4 = uVar2;
                        i28 = i25;
                        f1Var2 = f1Var4;
                        z19 = z15;
                        if (i26 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var15 = p3.n.f135158a;
                    aVar2 = p3.m.f135153a;
                    if (jVar3 == null) {
                        objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                        if (objH == p3.m.a.f135155b) {
                            objH = kg.f.b(o0VarE);
                        }
                        jVar4 = (a2.j) objH;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-499617780);
                        o0VarE.g0(false);
                        jVar4 = jVar3;
                    }
                    if (z19) {
                        j8 = b1Var.f87531a;
                    } else {
                        j8 = b1Var.f87533c;
                    }
                    long j110 = j8;
                    if (z19) {
                        j14 = b1Var.f87532b;
                    } else {
                        j14 = b1Var.f87534d;
                    }
                    if (f1Var2 == null) {
                        o0VarE.C(1691921830);
                        i30 = 0;
                        o0VarE.g0(false);
                        aVar3 = aVar2;
                        z24 = z19;
                        mVar2 = null;
                    } else {
                        o0VarE.C(-499611205);
                        i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                        aVar3 = aVar2;
                        objQ = o0VarE.q();
                        aVar3.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new f4.s();
                            o0VarE.K(objQ);
                        }
                        sVar = (f4.s) objQ;
                        zB = o0VarE.B(jVar4);
                        objQ2 = o0VarE.q();
                        if (zB) {
                            objQ2 = new d1(jVar4, sVar, null);
                            o0VarE.K(objQ2);
                        } else {
                            objQ2 = new d1(jVar4, sVar, null);
                            o0VarE.K(objQ2);
                        }
                        p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                        hVar = (a2.h) p13.h0.n0(sVar);
                        if (!z19) {
                            f14 = f1Var2.f88050e;
                        } else if (hVar instanceof a2.l.b) {
                            f14 = f1Var2.f88047b;
                        } else if (hVar instanceof a2.e) {
                            f14 = f1Var2.f88049d;
                        } else if (hVar instanceof a2.b) {
                            f14 = f1Var2.f88048c;
                        } else {
                            f14 = f1Var2.f88046a;
                        }
                        objQ3 = o0VarE.q();
                        if (objQ3 == c2565a) {
                            objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                            o0VarE.K(objQ3);
                        }
                        bVar = (s1.b) objQ3;
                        g6.f fVarA6 = g6.f.a(f14);
                        f15 = f14;
                        boolean zR7 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                        if (((i29 & 896) ^ 384) > 256) {
                        }
                        zR = zR7 | z16 | o0VarE.r(hVar);
                        objQ4 = o0VarE.q();
                        if (zR) {
                            z24 = z19;
                            objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                            o0VarE.K(objQ4);
                        } else {
                            z24 = z19;
                            objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                            o0VarE.K(objQ4);
                        }
                        p3.l0.e((e23.p) objQ4, fVarA6, o0VarE);
                        mVar2 = bVar.f155489c;
                        i30 = 0;
                        o0VarE.g0(false);
                    }
                    if (mVar2 != null) {
                        f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
                    } else {
                        f16 = i30;
                        g6.f.a aVar9 = g6.f.f75994b;
                    }
                    float f2116 = f16;
                    objQ5 = o0VarE.q();
                    aVar3.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new i11.f(4);
                        o0VarE.K(objQ5);
                    }
                    u1.u uVar10 = uVar4;
                    boolean z210 = z24;
                    o0Var = o0VarE;
                    ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z210, r1Var, j110, j14, 0.0f, f2116, uVar10, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
                    h2Var2 = h2Var4;
                    f1Var3 = f1Var2;
                    z18 = z210;
                    uVar3 = uVar10;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    h2Var2 = h2Var;
                    z18 = z15;
                    f1Var3 = f1Var2;
                    uVar3 = uVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c12.f(aVar, rVar, z18, r1Var, b1Var, f1Var3, uVar3, h2Var2, jVar2, qVar, i14, i15);
                }
            }
            i25 |= 100663296;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(qVar)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i25 |= i34;
            }
            z16 = true;
            if ((i25 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i25 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i37 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 32) != 0) {
                        c1.f87691a.getClass();
                        n3.a0.f122675a.getClass();
                        float f11114 = n3.a0.f122677c;
                        float f11115 = n3.a0.f122686l;
                        float f11116 = n3.a0.f122683i;
                        float f2117 = n3.a0.f122684j;
                        float f2118 = n3.a0.f122679e;
                        p3.x1 x1Var16 = p3.n.f135158a;
                        f1Var4 = new f1(f11114, f11115, f11116, f2117, f2118, null);
                        i25 &= -458753;
                    } else {
                        f1Var4 = f1Var2;
                    }
                    if (i17 != 0) {
                        uVar2 = null;
                    }
                    if (i19 != 0) {
                        c1.f87691a.getClass();
                        h2Var3 = c1.f87692b;
                    } else {
                        h2Var3 = h2Var;
                    }
                    h2Var4 = h2Var3;
                    uVar4 = uVar2;
                    i28 = i25;
                    f1Var2 = f1Var4;
                    z19 = z15;
                    if (i26 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i37 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 32) != 0) {
                        c1.f87691a.getClass();
                        n3.a0.f122675a.getClass();
                        float f11117 = n3.a0.f122677c;
                        float f11118 = n3.a0.f122686l;
                        float f11119 = n3.a0.f122683i;
                        float f2119 = n3.a0.f122684j;
                        float f21110 = n3.a0.f122679e;
                        p3.x1 x1Var17 = p3.n.f135158a;
                        f1Var4 = new f1(f11117, f11118, f11119, f2119, f21110, null);
                        i25 &= -458753;
                    } else {
                        f1Var4 = f1Var2;
                    }
                    if (i17 != 0) {
                        uVar2 = null;
                    }
                    if (i19 != 0) {
                        c1.f87691a.getClass();
                        h2Var3 = c1.f87692b;
                    } else {
                        h2Var3 = h2Var;
                    }
                    h2Var4 = h2Var3;
                    uVar4 = uVar2;
                    i28 = i25;
                    f1Var2 = f1Var4;
                    z19 = z15;
                    if (i26 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var18 = p3.n.f135158a;
                aVar2 = p3.m.f135153a;
                if (jVar3 == null) {
                    objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                    if (objH == p3.m.a.f135155b) {
                        objH = kg.f.b(o0VarE);
                    }
                    jVar4 = (a2.j) objH;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-499617780);
                    o0VarE.g0(false);
                    jVar4 = jVar3;
                }
                if (z19) {
                    j8 = b1Var.f87531a;
                } else {
                    j8 = b1Var.f87533c;
                }
                long j111 = j8;
                if (z19) {
                    j14 = b1Var.f87532b;
                } else {
                    j14 = b1Var.f87534d;
                }
                if (f1Var2 == null) {
                    o0VarE.C(1691921830);
                    i30 = 0;
                    o0VarE.g0(false);
                    aVar3 = aVar2;
                    z24 = z19;
                    mVar2 = null;
                } else {
                    o0VarE.C(-499611205);
                    i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                    aVar3 = aVar2;
                    objQ = o0VarE.q();
                    aVar3.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new f4.s();
                        o0VarE.K(objQ);
                    }
                    sVar = (f4.s) objQ;
                    zB = o0VarE.B(jVar4);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new d1(jVar4, sVar, null);
                        o0VarE.K(objQ2);
                    } else {
                        objQ2 = new d1(jVar4, sVar, null);
                        o0VarE.K(objQ2);
                    }
                    p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                    hVar = (a2.h) p13.h0.n0(sVar);
                    if (!z19) {
                        f14 = f1Var2.f88050e;
                    } else if (hVar instanceof a2.l.b) {
                        f14 = f1Var2.f88047b;
                    } else if (hVar instanceof a2.e) {
                        f14 = f1Var2.f88049d;
                    } else if (hVar instanceof a2.b) {
                        f14 = f1Var2.f88048c;
                    } else {
                        f14 = f1Var2.f88046a;
                    }
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                        o0VarE.K(objQ3);
                    }
                    bVar = (s1.b) objQ3;
                    g6.f fVarA7 = g6.f.a(f14);
                    f15 = f14;
                    boolean zR8 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                    if (((i29 & 896) ^ 384) > 256) {
                    }
                    zR = zR8 | z16 | o0VarE.r(hVar);
                    objQ4 = o0VarE.q();
                    if (zR) {
                        z24 = z19;
                        objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                        o0VarE.K(objQ4);
                    } else {
                        z24 = z19;
                        objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                        o0VarE.K(objQ4);
                    }
                    p3.l0.e((e23.p) objQ4, fVarA7, o0VarE);
                    mVar2 = bVar.f155489c;
                    i30 = 0;
                    o0VarE.g0(false);
                }
                if (mVar2 != null) {
                    f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
                } else {
                    f16 = i30;
                    g6.f.a aVar10 = g6.f.f75994b;
                }
                float f21111 = f16;
                objQ5 = o0VarE.q();
                aVar3.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new i11.f(4);
                    o0VarE.K(objQ5);
                }
                u1.u uVar11 = uVar4;
                boolean z211 = z24;
                o0Var = o0VarE;
                ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z211, r1Var, j111, j14, 0.0f, f21111, uVar11, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
                h2Var2 = h2Var4;
                f1Var3 = f1Var2;
                z18 = z211;
                uVar3 = uVar11;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                h2Var2 = h2Var;
                z18 = z15;
                f1Var3 = f1Var2;
                uVar3 = uVar2;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c12.f(aVar, rVar, z18, r1Var, b1Var, f1Var3, uVar3, h2Var2, jVar2, qVar, i14, i15);
            }
        }
        i16 |= 1572864;
        uVar2 = uVar;
        i19 = i15 & 128;
        if (i19 != 0) {
            i16 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.B(h2Var)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i16 |= i24;
        }
        i25 = i16;
        i26 = i15 & 256;
        if (i26 != 0) {
            if ((i14 & 100663296) == 0) {
                if (o0VarE.B(jVar)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i25 |= i27;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(qVar)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i25 |= i34;
            }
            z16 = true;
            if ((i25 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i25 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i37 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 32) != 0) {
                        c1.f87691a.getClass();
                        n3.a0.f122675a.getClass();
                        float f111110 = n3.a0.f122677c;
                        float f111111 = n3.a0.f122686l;
                        float f111112 = n3.a0.f122683i;
                        float f21112 = n3.a0.f122684j;
                        float f21113 = n3.a0.f122679e;
                        p3.x1 x1Var19 = p3.n.f135158a;
                        f1Var4 = new f1(f111110, f111111, f111112, f21112, f21113, null);
                        i25 &= -458753;
                    } else {
                        f1Var4 = f1Var2;
                    }
                    if (i17 != 0) {
                        uVar2 = null;
                    }
                    if (i19 != 0) {
                        c1.f87691a.getClass();
                        h2Var3 = c1.f87692b;
                    } else {
                        h2Var3 = h2Var;
                    }
                    h2Var4 = h2Var3;
                    uVar4 = uVar2;
                    i28 = i25;
                    f1Var2 = f1Var4;
                    z19 = z15;
                    if (i26 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i37 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 32) != 0) {
                        c1.f87691a.getClass();
                        n3.a0.f122675a.getClass();
                        float f111113 = n3.a0.f122677c;
                        float f111114 = n3.a0.f122686l;
                        float f111115 = n3.a0.f122683i;
                        float f21114 = n3.a0.f122684j;
                        float f21115 = n3.a0.f122679e;
                        p3.x1 x1Var110 = p3.n.f135158a;
                        f1Var4 = new f1(f111113, f111114, f111115, f21114, f21115, null);
                        i25 &= -458753;
                    } else {
                        f1Var4 = f1Var2;
                    }
                    if (i17 != 0) {
                        uVar2 = null;
                    }
                    if (i19 != 0) {
                        c1.f87691a.getClass();
                        h2Var3 = c1.f87692b;
                    } else {
                        h2Var3 = h2Var;
                    }
                    h2Var4 = h2Var3;
                    uVar4 = uVar2;
                    i28 = i25;
                    f1Var2 = f1Var4;
                    z19 = z15;
                    if (i26 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var111 = p3.n.f135158a;
                aVar2 = p3.m.f135153a;
                if (jVar3 == null) {
                    objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                    if (objH == p3.m.a.f135155b) {
                        objH = kg.f.b(o0VarE);
                    }
                    jVar4 = (a2.j) objH;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-499617780);
                    o0VarE.g0(false);
                    jVar4 = jVar3;
                }
                if (z19) {
                    j8 = b1Var.f87531a;
                } else {
                    j8 = b1Var.f87533c;
                }
                long j112 = j8;
                if (z19) {
                    j14 = b1Var.f87532b;
                } else {
                    j14 = b1Var.f87534d;
                }
                if (f1Var2 == null) {
                    o0VarE.C(1691921830);
                    i30 = 0;
                    o0VarE.g0(false);
                    aVar3 = aVar2;
                    z24 = z19;
                    mVar2 = null;
                } else {
                    o0VarE.C(-499611205);
                    i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                    aVar3 = aVar2;
                    objQ = o0VarE.q();
                    aVar3.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new f4.s();
                        o0VarE.K(objQ);
                    }
                    sVar = (f4.s) objQ;
                    zB = o0VarE.B(jVar4);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new d1(jVar4, sVar, null);
                        o0VarE.K(objQ2);
                    } else {
                        objQ2 = new d1(jVar4, sVar, null);
                        o0VarE.K(objQ2);
                    }
                    p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                    hVar = (a2.h) p13.h0.n0(sVar);
                    if (!z19) {
                        f14 = f1Var2.f88050e;
                    } else if (hVar instanceof a2.l.b) {
                        f14 = f1Var2.f88047b;
                    } else if (hVar instanceof a2.e) {
                        f14 = f1Var2.f88049d;
                    } else if (hVar instanceof a2.b) {
                        f14 = f1Var2.f88048c;
                    } else {
                        f14 = f1Var2.f88046a;
                    }
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                        o0VarE.K(objQ3);
                    }
                    bVar = (s1.b) objQ3;
                    g6.f fVarA8 = g6.f.a(f14);
                    f15 = f14;
                    boolean zR9 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                    if (((i29 & 896) ^ 384) > 256) {
                    }
                    zR = zR9 | z16 | o0VarE.r(hVar);
                    objQ4 = o0VarE.q();
                    if (zR) {
                        z24 = z19;
                        objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                        o0VarE.K(objQ4);
                    } else {
                        z24 = z19;
                        objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                        o0VarE.K(objQ4);
                    }
                    p3.l0.e((e23.p) objQ4, fVarA8, o0VarE);
                    mVar2 = bVar.f155489c;
                    i30 = 0;
                    o0VarE.g0(false);
                }
                if (mVar2 != null) {
                    f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
                } else {
                    f16 = i30;
                    g6.f.a aVar11 = g6.f.f75994b;
                }
                float f21116 = f16;
                objQ5 = o0VarE.q();
                aVar3.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new i11.f(4);
                    o0VarE.K(objQ5);
                }
                u1.u uVar12 = uVar4;
                boolean z212 = z24;
                o0Var = o0VarE;
                ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z212, r1Var, j112, j14, 0.0f, f21116, uVar12, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
                h2Var2 = h2Var4;
                f1Var3 = f1Var2;
                z18 = z212;
                uVar3 = uVar12;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                h2Var2 = h2Var;
                z18 = z15;
                f1Var3 = f1Var2;
                uVar3 = uVar2;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c12.f(aVar, rVar, z18, r1Var, b1Var, f1Var3, uVar3, h2Var2, jVar2, qVar, i14, i15);
            }
        }
        i25 |= 100663296;
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(qVar)) {
                i34 = 536870912;
            } else {
                i34 = 268435456;
            }
            i25 |= i34;
        }
        z16 = true;
        if ((i25 & 306783379) != 306783378) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i25 & 1, z17)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i37 != 0) {
                    z15 = true;
                }
                if ((i15 & 32) != 0) {
                    c1.f87691a.getClass();
                    n3.a0.f122675a.getClass();
                    float f111116 = n3.a0.f122677c;
                    float f111117 = n3.a0.f122686l;
                    float f111118 = n3.a0.f122683i;
                    float f21117 = n3.a0.f122684j;
                    float f21118 = n3.a0.f122679e;
                    p3.x1 x1Var112 = p3.n.f135158a;
                    f1Var4 = new f1(f111116, f111117, f111118, f21117, f21118, null);
                    i25 &= -458753;
                } else {
                    f1Var4 = f1Var2;
                }
                if (i17 != 0) {
                    uVar2 = null;
                }
                if (i19 != 0) {
                    c1.f87691a.getClass();
                    h2Var3 = c1.f87692b;
                } else {
                    h2Var3 = h2Var;
                }
                h2Var4 = h2Var3;
                uVar4 = uVar2;
                i28 = i25;
                f1Var2 = f1Var4;
                z19 = z15;
                if (i26 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
            } else {
                if (i37 != 0) {
                    z15 = true;
                }
                if ((i15 & 32) != 0) {
                    c1.f87691a.getClass();
                    n3.a0.f122675a.getClass();
                    float f111119 = n3.a0.f122677c;
                    float f1111110 = n3.a0.f122686l;
                    float f1111111 = n3.a0.f122683i;
                    float f21119 = n3.a0.f122684j;
                    float f211110 = n3.a0.f122679e;
                    p3.x1 x1Var113 = p3.n.f135158a;
                    f1Var4 = new f1(f111119, f1111110, f1111111, f21119, f211110, null);
                    i25 &= -458753;
                } else {
                    f1Var4 = f1Var2;
                }
                if (i17 != 0) {
                    uVar2 = null;
                }
                if (i19 != 0) {
                    c1.f87691a.getClass();
                    h2Var3 = c1.f87692b;
                } else {
                    h2Var3 = h2Var;
                }
                h2Var4 = h2Var3;
                uVar4 = uVar2;
                i28 = i25;
                f1Var2 = f1Var4;
                z19 = z15;
                if (i26 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var114 = p3.n.f135158a;
            aVar2 = p3.m.f135153a;
            if (jVar3 == null) {
                objH = r1.q2.h(o0VarE, 1691738187, aVar2);
                if (objH == p3.m.a.f135155b) {
                    objH = kg.f.b(o0VarE);
                }
                jVar4 = (a2.j) objH;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-499617780);
                o0VarE.g0(false);
                jVar4 = jVar3;
            }
            if (z19) {
                j8 = b1Var.f87531a;
            } else {
                j8 = b1Var.f87533c;
            }
            long j113 = j8;
            if (z19) {
                j14 = b1Var.f87532b;
            } else {
                j14 = b1Var.f87534d;
            }
            if (f1Var2 == null) {
                o0VarE.C(1691921830);
                i30 = 0;
                o0VarE.g0(false);
                aVar3 = aVar2;
                z24 = z19;
                mVar2 = null;
            } else {
                o0VarE.C(-499611205);
                i29 = ((i28 >> 6) & 14) | ((i28 >> 9) & 896);
                aVar3 = aVar2;
                objQ = o0VarE.q();
                aVar3.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new f4.s();
                    o0VarE.K(objQ);
                }
                sVar = (f4.s) objQ;
                zB = o0VarE.B(jVar4);
                objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new d1(jVar4, sVar, null);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new d1(jVar4, sVar, null);
                    o0VarE.K(objQ2);
                }
                p3.l0.e((e23.p) objQ2, jVar4, o0VarE);
                hVar = (a2.h) p13.h0.n0(sVar);
                if (!z19) {
                    f14 = f1Var2.f88050e;
                } else if (hVar instanceof a2.l.b) {
                    f14 = f1Var2.f88047b;
                } else if (hVar instanceof a2.e) {
                    f14 = f1Var2.f88049d;
                } else if (hVar instanceof a2.b) {
                    f14 = f1Var2.f88048c;
                } else {
                    f14 = f1Var2.f88046a;
                }
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new s1.b(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
                    o0VarE.K(objQ3);
                }
                bVar = (s1.b) objQ3;
                g6.f fVarA9 = g6.f.a(f14);
                f15 = f14;
                boolean zR10 = o0VarE.r(bVar) | o0VarE.i(f14) | ((((i29 & 14) ^ 6) <= 4 && o0VarE.h(z19)) || (i29 & 6) == 4);
                if (((i29 & 896) ^ 384) > 256) {
                }
                zR = zR10 | z16 | o0VarE.r(hVar);
                objQ4 = o0VarE.q();
                if (zR) {
                    z24 = z19;
                    objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                    o0VarE.K(objQ4);
                } else {
                    z24 = z19;
                    objQ4 = new e1(bVar, f15, z24, f1Var2, hVar, null);
                    o0VarE.K(objQ4);
                }
                p3.l0.e((e23.p) objQ4, fVarA9, o0VarE);
                mVar2 = bVar.f155489c;
                i30 = 0;
                o0VarE.g0(false);
            }
            if (mVar2 != null) {
                f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
            } else {
                f16 = i30;
                g6.f.a aVar12 = g6.f.f75994b;
            }
            float f211111 = f16;
            objQ5 = o0VarE.q();
            aVar3.getClass();
            if (objQ5 == p3.m.a.f135155b) {
                objQ5 = new i11.f(4);
                o0VarE.K(objQ5);
            }
            u1.u uVar13 = uVar4;
            boolean z213 = z24;
            o0Var = o0VarE;
            ve.c(aVar, p5.v.c((e23.l) objQ5, rVar, false), z213, r1Var, j113, j14, 0.0f, f211111, uVar13, jVar4, z3.f.c(-535639973, new a(j14, h2Var4, qVar), o0VarE), o0Var, (i28 & 8078) | (234881024 & (i28 << 6)), 64);
            h2Var2 = h2Var4;
            f1Var3 = f1Var2;
            z18 = z213;
            uVar3 = uVar13;
            jVar2 = jVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            h2Var2 = h2Var;
            z18 = z15;
            f1Var3 = f1Var2;
            uVar3 = uVar2;
            jVar2 = jVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c12.f(aVar, rVar, z18, r1Var, b1Var, f1Var3, uVar3, h2Var2, jVar2, qVar, i14, i15);
        }
    }

    public static final void b(e23.a aVar, h4.r rVar, boolean z14, o4.r1 r1Var, b1 b1Var, u1.u uVar, c2.h2 h2Var, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(399974542);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(r1Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(b1Var) ? 16384 : 8192;
        }
        int i16 = i15 | 196608;
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.B(uVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.B(h2Var) ? 8388608 : 4194304;
        }
        int i17 = i16 | 100663296;
        if ((805306368 & i14) == 0) {
            i17 |= o0VarE.r(eVar) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i17 & 1, (306783379 & i17) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            a(aVar, rVar, z14, r1Var, b1Var, null, uVar, h2Var, null, eVar, o0Var, i17 & 2147483646, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(aVar, rVar, z14, r1Var, b1Var, uVar, h2Var, eVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010b  */
    /* JADX WARN: Code duplicated, block: B:102:0x010e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0122  */
    /* JADX WARN: Code duplicated, block: B:107:0x0125  */
    /* JADX WARN: Code duplicated, block: B:110:0x012e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:122:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0160  */
    /* JADX WARN: Code duplicated, block: B:126:0x0164  */
    /* JADX WARN: Code duplicated, block: B:129:0x016a  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0184  */
    /* JADX WARN: Code duplicated, block: B:134:0x019a  */
    /* JADX WARN: Code duplicated, block: B:136:0x019d  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0105  */
    public static final void c(e23.a aVar, h4.r rVar, boolean z14, o4.r1 r1Var, b1 b1Var, u1.u uVar, c2.h2 h2Var, a2.j jVar, e23.q qVar, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        boolean z15;
        int i18;
        o4.r1 r1Var2;
        b1 b1Var2;
        int i19;
        int i24;
        u1.u uVar2;
        int i25;
        int i26;
        c2.h2 h2Var2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        boolean z16;
        p3.o0 o0Var;
        h4.r rVar2;
        a2.j jVar2;
        boolean z17;
        o4.r1 r1Var3;
        b1 b1Var3;
        u1.u uVar3;
        c2.h2 h2Var3;
        p3.p2 p2VarI0;
        h4.r rVar3;
        o4.r1 r1VarC;
        b1 b1VarB;
        a2.j jVar3;
        h4.r rVar4;
        o4.r1 r1Var4;
        int i35;
        p3.o0 o0VarE = mVar.E(-1061374109);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i36 = i15 & 2;
        if (i36 == 0) {
            if ((i14 & 48) == 0) {
                i16 |= o0VarE.B(rVar) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & 8) == 0) {
                        r1Var2 = r1Var;
                        int i37 = o0VarE.B(r1Var2) ? 2048 : 1024;
                        i16 |= i37;
                    } else {
                        r1Var2 = r1Var;
                    }
                    i16 |= i37;
                } else {
                    r1Var2 = r1Var;
                }
                if ((i14 & 24576) == 0) {
                    if ((i15 & 16) == 0) {
                        b1Var2 = b1Var;
                        int i38 = o0VarE.B(b1Var2) ? 16384 : 8192;
                        i16 |= i38;
                    } else {
                        b1Var2 = b1Var;
                    }
                    i16 |= i38;
                } else {
                    b1Var2 = b1Var;
                }
                if ((i15 & 32) != 0) {
                    i16 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    if (o0VarE.B(null)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 64;
                if (i24 != 0) {
                    if ((1572864 & i14) == 0) {
                        uVar2 = uVar;
                        if (o0VarE.B(uVar2)) {
                            i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i25 = 524288;
                        }
                        i16 |= i25;
                    }
                    i26 = i15 & 128;
                    if (i26 != 0) {
                        if ((12582912 & i14) == 0) {
                            h2Var2 = h2Var;
                            if (o0VarE.B(h2Var2)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i16 |= i27;
                        }
                        i28 = i15 & 256;
                        if (i28 != 0) {
                            if ((i14 & 100663296) == 0) {
                                int i39 = i16;
                                if (o0VarE.B(jVar)) {
                                    i29 = 67108864;
                                } else {
                                    i29 = 33554432;
                                }
                                i30 = i39 | i29;
                            }
                            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                                if (o0VarE.r(qVar)) {
                                    i35 = 536870912;
                                } else {
                                    i35 = 268435456;
                                }
                                i30 |= i35;
                            }
                            i34 = i30;
                            if ((i34 & 306783379) != 306783378) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (o0VarE.n(i34 & 1, z16)) {
                                o0VarE.G0();
                                if ((i14 & 1) != 0 || o0VarE.o0()) {
                                    if (i36 != 0) {
                                        rVar3 = h4.r.S;
                                    } else {
                                        rVar3 = rVar;
                                    }
                                    if (i17 != 0) {
                                        z15 = true;
                                    }
                                    if ((i15 & 8) != 0) {
                                        c1.f87691a.getClass();
                                        p3.x1 x1Var = p3.n.f135158a;
                                        n3.h.f122937a.getClass();
                                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                        i34 &= -7169;
                                    } else {
                                        r1VarC = r1Var2;
                                    }
                                    if ((i15 & 16) != 0) {
                                        c1.f87691a.getClass();
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        s7.f89624a.getClass();
                                        b1VarB = c1.b(s7.a(o0VarE));
                                        i34 &= -57345;
                                    } else {
                                        b1VarB = b1Var2;
                                    }
                                    if (i24 != 0) {
                                        uVar2 = null;
                                    }
                                    if (i26 != 0) {
                                        c1.f87691a.getClass();
                                        h2Var2 = c1.f87693c;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    rVar4 = rVar3;
                                    r1Var4 = r1VarC;
                                } else {
                                    o0VarE.e();
                                    if ((i15 & 8) != 0) {
                                        i34 &= -7169;
                                    }
                                    if ((i15 & 16) != 0) {
                                        i34 &= -57345;
                                    }
                                    jVar3 = jVar;
                                    z15 = z15;
                                    b1VarB = b1Var2;
                                    uVar2 = uVar2;
                                    h2Var2 = h2Var2;
                                    rVar4 = rVar;
                                    r1Var4 = r1Var2;
                                }
                                o0VarE.h0();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                o0Var = o0VarE;
                                a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                                rVar2 = rVar4;
                                z17 = z15;
                                r1Var3 = r1Var4;
                                b1Var3 = b1VarB;
                                uVar3 = uVar2;
                                h2Var3 = h2Var2;
                                jVar2 = jVar3;
                            } else {
                                o0Var = o0VarE;
                                o0Var.e();
                                rVar2 = rVar;
                                jVar2 = jVar;
                                z17 = z15;
                                r1Var3 = r1Var2;
                                b1Var3 = b1Var2;
                                uVar3 = uVar2;
                                h2Var3 = h2Var2;
                            }
                            p2VarI0 = o0Var.i0();
                            if (p2VarI0 != null) {
                                p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                            }
                        }
                        i16 |= 100663296;
                        i30 = i16;
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(qVar)) {
                                i35 = 536870912;
                            } else {
                                i35 = 268435456;
                            }
                            i30 |= i35;
                        }
                        i34 = i30;
                        if ((i34 & 306783379) != 306783378) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i34 & 1, z16)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var4 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var5 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            } else {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var6 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var7 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var8 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                            rVar2 = rVar4;
                            z17 = z15;
                            r1Var3 = r1Var4;
                            b1Var3 = b1VarB;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                            jVar2 = jVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            rVar2 = rVar;
                            jVar2 = jVar;
                            z17 = z15;
                            r1Var3 = r1Var2;
                            b1Var3 = b1Var2;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                        }
                    }
                    i16 |= 12582912;
                    h2Var2 = h2Var;
                    i28 = i15 & 256;
                    if (i28 != 0) {
                        if ((i14 & 100663296) == 0) {
                            int i310 = i16;
                            if (o0VarE.B(jVar)) {
                                i29 = 67108864;
                            } else {
                                i29 = 33554432;
                            }
                            i30 = i310 | i29;
                        }
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(qVar)) {
                                i35 = 536870912;
                            } else {
                                i35 = 268435456;
                            }
                            i30 |= i35;
                        }
                        i34 = i30;
                        if ((i34 & 306783379) != 306783378) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i34 & 1, z16)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var9 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var10 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            } else {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var11 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var12 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var13 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                            rVar2 = rVar4;
                            z17 = z15;
                            r1Var3 = r1Var4;
                            b1Var3 = b1VarB;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                            jVar2 = jVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            rVar2 = rVar;
                            jVar2 = jVar;
                            z17 = z15;
                            r1Var3 = r1Var2;
                            b1Var3 = b1Var2;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                        }
                    }
                    i16 |= 100663296;
                    i30 = i16;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var14 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var15 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var16 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var17 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var18 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 1572864;
                uVar2 = uVar;
                i26 = i15 & 128;
                if (i26 != 0) {
                    if ((12582912 & i14) == 0) {
                        h2Var2 = h2Var;
                        if (o0VarE.B(h2Var2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                    i28 = i15 & 256;
                    if (i28 != 0) {
                        if ((i14 & 100663296) == 0) {
                            int i311 = i16;
                            if (o0VarE.B(jVar)) {
                                i29 = 67108864;
                            } else {
                                i29 = 33554432;
                            }
                            i30 = i311 | i29;
                        }
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(qVar)) {
                                i35 = 536870912;
                            } else {
                                i35 = 268435456;
                            }
                            i30 |= i35;
                        }
                        i34 = i30;
                        if ((i34 & 306783379) != 306783378) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i34 & 1, z16)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var19 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var110 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            } else {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var111 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var112 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var113 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                            rVar2 = rVar4;
                            z17 = z15;
                            r1Var3 = r1Var4;
                            b1Var3 = b1VarB;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                            jVar2 = jVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            rVar2 = rVar;
                            jVar2 = jVar;
                            z17 = z15;
                            r1Var3 = r1Var2;
                            b1Var3 = b1Var2;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                        }
                    }
                    i16 |= 100663296;
                    i30 = i16;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var114 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var115 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var116 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var117 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var118 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 12582912;
                h2Var2 = h2Var;
                i28 = i15 & 256;
                if (i28 != 0) {
                    if ((i14 & 100663296) == 0) {
                        int i312 = i16;
                        if (o0VarE.B(jVar)) {
                            i29 = 67108864;
                        } else {
                            i29 = 33554432;
                        }
                        i30 = i312 | i29;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var119 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1110 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1112 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var1113 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 100663296;
                i30 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1114 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1115 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1116 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1117 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var1118 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 384;
            z15 = z14;
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    r1Var2 = r1Var;
                    if (o0VarE.B(r1Var2)) {
                    }
                    i16 |= i37;
                } else {
                    r1Var2 = r1Var;
                }
                i16 |= i37;
            } else {
                r1Var2 = r1Var;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    b1Var2 = b1Var;
                    if (o0VarE.B(b1Var2)) {
                    }
                    i16 |= i38;
                } else {
                    b1Var2 = b1Var;
                }
                i16 |= i38;
            } else {
                b1Var2 = b1Var;
            }
            if ((i15 & 32) != 0) {
                i16 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (o0VarE.B(null)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                if ((1572864 & i14) == 0) {
                    uVar2 = uVar;
                    if (o0VarE.B(uVar2)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 128;
                if (i26 != 0) {
                    if ((12582912 & i14) == 0) {
                        h2Var2 = h2Var;
                        if (o0VarE.B(h2Var2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                    i28 = i15 & 256;
                    if (i28 != 0) {
                        if ((i14 & 100663296) == 0) {
                            int i313 = i16;
                            if (o0VarE.B(jVar)) {
                                i29 = 67108864;
                            } else {
                                i29 = 33554432;
                            }
                            i30 = i313 | i29;
                        }
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(qVar)) {
                                i35 = 536870912;
                            } else {
                                i35 = 268435456;
                            }
                            i30 |= i35;
                        }
                        i34 = i30;
                        if ((i34 & 306783379) != 306783378) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i34 & 1, z16)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var1119 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var11110 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            } else {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var11111 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var11112 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var11113 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                            rVar2 = rVar4;
                            z17 = z15;
                            r1Var3 = r1Var4;
                            b1Var3 = b1VarB;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                            jVar2 = jVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            rVar2 = rVar;
                            jVar2 = jVar;
                            z17 = z15;
                            r1Var3 = r1Var2;
                            b1Var3 = b1Var2;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                        }
                    }
                    i16 |= 100663296;
                    i30 = i16;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var11114 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var11115 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var11116 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var11117 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var11118 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 12582912;
                h2Var2 = h2Var;
                i28 = i15 & 256;
                if (i28 != 0) {
                    if ((i14 & 100663296) == 0) {
                        int i314 = i16;
                        if (o0VarE.B(jVar)) {
                            i29 = 67108864;
                        } else {
                            i29 = 33554432;
                        }
                        i30 = i314 | i29;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var11119 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111110 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111111 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111112 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var111113 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 100663296;
                i30 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111114 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111115 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111116 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111117 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var111118 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 1572864;
            uVar2 = uVar;
            i26 = i15 & 128;
            if (i26 != 0) {
                if ((12582912 & i14) == 0) {
                    h2Var2 = h2Var;
                    if (o0VarE.B(h2Var2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
                i28 = i15 & 256;
                if (i28 != 0) {
                    if ((i14 & 100663296) == 0) {
                        int i315 = i16;
                        if (o0VarE.B(jVar)) {
                            i29 = 67108864;
                        } else {
                            i29 = 33554432;
                        }
                        i30 = i315 | i29;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111119 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111110 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111111 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111112 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var1111113 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 100663296;
                i30 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111114 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111115 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111116 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111117 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var1111118 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 12582912;
            h2Var2 = h2Var;
            i28 = i15 & 256;
            if (i28 != 0) {
                if ((i14 & 100663296) == 0) {
                    int i316 = i16;
                    if (o0VarE.B(jVar)) {
                        i29 = 67108864;
                    } else {
                        i29 = 33554432;
                    }
                    i30 = i316 | i29;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111119 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111110 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111112 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var11111113 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 100663296;
            i30 = i16;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(qVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i30 |= i35;
            }
            i34 = i30;
            if ((i34 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i34 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var11111114 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var11111115 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                } else {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var11111116 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var11111117 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                }
                o0VarE.h0();
                p3.x1 x1Var11111118 = p3.n.f135158a;
                o0Var = o0VarE;
                a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                rVar2 = rVar4;
                z17 = z15;
                r1Var3 = r1Var4;
                b1Var3 = b1VarB;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                jVar2 = jVar;
                z17 = z15;
                r1Var3 = r1Var2;
                b1Var3 = b1Var2;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
            }
        }
        i16 |= 48;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    r1Var2 = r1Var;
                    if (o0VarE.B(r1Var2)) {
                    }
                    i16 |= i37;
                } else {
                    r1Var2 = r1Var;
                }
                i16 |= i37;
            } else {
                r1Var2 = r1Var;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    b1Var2 = b1Var;
                    if (o0VarE.B(b1Var2)) {
                    }
                    i16 |= i38;
                } else {
                    b1Var2 = b1Var;
                }
                i16 |= i38;
            } else {
                b1Var2 = b1Var;
            }
            if ((i15 & 32) != 0) {
                i16 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (o0VarE.B(null)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                if ((1572864 & i14) == 0) {
                    uVar2 = uVar;
                    if (o0VarE.B(uVar2)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 128;
                if (i26 != 0) {
                    if ((12582912 & i14) == 0) {
                        h2Var2 = h2Var;
                        if (o0VarE.B(h2Var2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                    i28 = i15 & 256;
                    if (i28 != 0) {
                        if ((i14 & 100663296) == 0) {
                            int i317 = i16;
                            if (o0VarE.B(jVar)) {
                                i29 = 67108864;
                            } else {
                                i29 = 33554432;
                            }
                            i30 = i317 | i29;
                        }
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(qVar)) {
                                i35 = 536870912;
                            } else {
                                i35 = 268435456;
                            }
                            i30 |= i35;
                        }
                        i34 = i30;
                        if ((i34 & 306783379) != 306783378) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i34 & 1, z16)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var11111119 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var111111110 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            } else {
                                if (i36 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i17 != 0) {
                                    z15 = true;
                                }
                                if ((i15 & 8) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var111111111 = p3.n.f135158a;
                                    n3.h.f122937a.getClass();
                                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                    i34 &= -7169;
                                } else {
                                    r1VarC = r1Var2;
                                }
                                if ((i15 & 16) != 0) {
                                    c1.f87691a.getClass();
                                    p3.x1 x1Var111111112 = p3.n.f135158a;
                                    s7.f89624a.getClass();
                                    b1VarB = c1.b(s7.a(o0VarE));
                                    i34 &= -57345;
                                } else {
                                    b1VarB = b1Var2;
                                }
                                if (i24 != 0) {
                                    uVar2 = null;
                                }
                                if (i26 != 0) {
                                    c1.f87691a.getClass();
                                    h2Var2 = c1.f87693c;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                rVar4 = rVar3;
                                r1Var4 = r1VarC;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var111111113 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                            rVar2 = rVar4;
                            z17 = z15;
                            r1Var3 = r1Var4;
                            b1Var3 = b1VarB;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                            jVar2 = jVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            rVar2 = rVar;
                            jVar2 = jVar;
                            z17 = z15;
                            r1Var3 = r1Var2;
                            b1Var3 = b1Var2;
                            uVar3 = uVar2;
                            h2Var3 = h2Var2;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                        }
                    }
                    i16 |= 100663296;
                    i30 = i16;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111111114 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111111115 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111111116 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111111117 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var111111118 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 12582912;
                h2Var2 = h2Var;
                i28 = i15 & 256;
                if (i28 != 0) {
                    if ((i14 & 100663296) == 0) {
                        int i318 = i16;
                        if (o0VarE.B(jVar)) {
                            i29 = 67108864;
                        } else {
                            i29 = 33554432;
                        }
                        i30 = i318 | i29;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111111119 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111111110 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111111111 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111111112 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var1111111113 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 100663296;
                i30 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111114 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111115 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111116 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111117 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var1111111118 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 1572864;
            uVar2 = uVar;
            i26 = i15 & 128;
            if (i26 != 0) {
                if ((12582912 & i14) == 0) {
                    h2Var2 = h2Var;
                    if (o0VarE.B(h2Var2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
                i28 = i15 & 256;
                if (i28 != 0) {
                    if ((i14 & 100663296) == 0) {
                        int i319 = i16;
                        if (o0VarE.B(jVar)) {
                            i29 = 67108864;
                        } else {
                            i29 = 33554432;
                        }
                        i30 = i319 | i29;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111111119 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var11111111110 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var11111111111 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var11111111112 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var11111111113 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 100663296;
                i30 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111114 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111115 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111116 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111117 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var11111111118 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 12582912;
            h2Var2 = h2Var;
            i28 = i15 & 256;
            if (i28 != 0) {
                if ((i14 & 100663296) == 0) {
                    int i3110 = i16;
                    if (o0VarE.B(jVar)) {
                        i29 = 67108864;
                    } else {
                        i29 = 33554432;
                    }
                    i30 = i3110 | i29;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111119 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111111111110 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111111111111 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111111111112 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var111111111113 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 100663296;
            i30 = i16;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(qVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i30 |= i35;
            }
            i34 = i30;
            if ((i34 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i34 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111114 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111115 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                } else {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111116 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111117 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                }
                o0VarE.h0();
                p3.x1 x1Var111111111118 = p3.n.f135158a;
                o0Var = o0VarE;
                a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                rVar2 = rVar4;
                z17 = z15;
                r1Var3 = r1Var4;
                b1Var3 = b1VarB;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                jVar2 = jVar;
                z17 = z15;
                r1Var3 = r1Var2;
                b1Var3 = b1Var2;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                r1Var2 = r1Var;
                if (o0VarE.B(r1Var2)) {
                }
                i16 |= i37;
            } else {
                r1Var2 = r1Var;
            }
            i16 |= i37;
        } else {
            r1Var2 = r1Var;
        }
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                b1Var2 = b1Var;
                if (o0VarE.B(b1Var2)) {
                }
                i16 |= i38;
            } else {
                b1Var2 = b1Var;
            }
            i16 |= i38;
        } else {
            b1Var2 = b1Var;
        }
        if ((i15 & 32) != 0) {
            i16 |= 196608;
        } else if ((i14 & 196608) == 0) {
            if (o0VarE.B(null)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i16 |= i19;
        }
        i24 = i15 & 64;
        if (i24 != 0) {
            if ((1572864 & i14) == 0) {
                uVar2 = uVar;
                if (o0VarE.B(uVar2)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i16 |= i25;
            }
            i26 = i15 & 128;
            if (i26 != 0) {
                if ((12582912 & i14) == 0) {
                    h2Var2 = h2Var;
                    if (o0VarE.B(h2Var2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
                i28 = i15 & 256;
                if (i28 != 0) {
                    if ((i14 & 100663296) == 0) {
                        int i3111 = i16;
                        if (o0VarE.B(jVar)) {
                            i29 = 67108864;
                        } else {
                            i29 = 33554432;
                        }
                        i30 = i3111 | i29;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(qVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i34 = i30;
                    if ((i34 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i34 & 1, z16)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var111111111119 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111111111110 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        } else {
                            if (i36 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i17 != 0) {
                                z15 = true;
                            }
                            if ((i15 & 8) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111111111111 = p3.n.f135158a;
                                n3.h.f122937a.getClass();
                                r1VarC = fc.c(n3.h.f122939c, o0VarE);
                                i34 &= -7169;
                            } else {
                                r1VarC = r1Var2;
                            }
                            if ((i15 & 16) != 0) {
                                c1.f87691a.getClass();
                                p3.x1 x1Var1111111111112 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                b1VarB = c1.b(s7.a(o0VarE));
                                i34 &= -57345;
                            } else {
                                b1VarB = b1Var2;
                            }
                            if (i24 != 0) {
                                uVar2 = null;
                            }
                            if (i26 != 0) {
                                c1.f87691a.getClass();
                                h2Var2 = c1.f87693c;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            rVar4 = rVar3;
                            r1Var4 = r1VarC;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var1111111111113 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                        rVar2 = rVar4;
                        z17 = z15;
                        r1Var3 = r1Var4;
                        b1Var3 = b1VarB;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        jVar2 = jVar;
                        z17 = z15;
                        r1Var3 = r1Var2;
                        b1Var3 = b1Var2;
                        uVar3 = uVar2;
                        h2Var3 = h2Var2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                    }
                }
                i16 |= 100663296;
                i30 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111111114 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111111115 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111111116 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111111117 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var1111111111118 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 12582912;
            h2Var2 = h2Var;
            i28 = i15 & 256;
            if (i28 != 0) {
                if ((i14 & 100663296) == 0) {
                    int i3112 = i16;
                    if (o0VarE.B(jVar)) {
                        i29 = 67108864;
                    } else {
                        i29 = 33554432;
                    }
                    i30 = i3112 | i29;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var1111111111119 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111111110 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111111111 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111111112 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var11111111111113 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 100663296;
            i30 = i16;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(qVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i30 |= i35;
            }
            i34 = i30;
            if ((i34 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i34 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var11111111111114 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var11111111111115 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                } else {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var11111111111116 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var11111111111117 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                }
                o0VarE.h0();
                p3.x1 x1Var11111111111118 = p3.n.f135158a;
                o0Var = o0VarE;
                a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                rVar2 = rVar4;
                z17 = z15;
                r1Var3 = r1Var4;
                b1Var3 = b1VarB;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                jVar2 = jVar;
                z17 = z15;
                r1Var3 = r1Var2;
                b1Var3 = b1Var2;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
            }
        }
        i16 |= 1572864;
        uVar2 = uVar;
        i26 = i15 & 128;
        if (i26 != 0) {
            if ((12582912 & i14) == 0) {
                h2Var2 = h2Var;
                if (o0VarE.B(h2Var2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            i28 = i15 & 256;
            if (i28 != 0) {
                if ((i14 & 100663296) == 0) {
                    int i3113 = i16;
                    if (o0VarE.B(jVar)) {
                        i29 = 67108864;
                    } else {
                        i29 = 33554432;
                    }
                    i30 = i3113 | i29;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(qVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i34 = i30;
                if ((i34 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i34 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var11111111111119 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111111111111110 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    } else {
                        if (i36 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 8) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111111111111111 = p3.n.f135158a;
                            n3.h.f122937a.getClass();
                            r1VarC = fc.c(n3.h.f122939c, o0VarE);
                            i34 &= -7169;
                        } else {
                            r1VarC = r1Var2;
                        }
                        if ((i15 & 16) != 0) {
                            c1.f87691a.getClass();
                            p3.x1 x1Var111111111111112 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            b1VarB = c1.b(s7.a(o0VarE));
                            i34 &= -57345;
                        } else {
                            b1VarB = b1Var2;
                        }
                        if (i24 != 0) {
                            uVar2 = null;
                        }
                        if (i26 != 0) {
                            c1.f87691a.getClass();
                            h2Var2 = c1.f87693c;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        rVar4 = rVar3;
                        r1Var4 = r1VarC;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var111111111111113 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                    rVar2 = rVar4;
                    z17 = z15;
                    r1Var3 = r1Var4;
                    b1Var3 = b1VarB;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    jVar2 = jVar;
                    z17 = z15;
                    r1Var3 = r1Var2;
                    b1Var3 = b1Var2;
                    uVar3 = uVar2;
                    h2Var3 = h2Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
                }
            }
            i16 |= 100663296;
            i30 = i16;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(qVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i30 |= i35;
            }
            i34 = i30;
            if ((i34 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i34 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111111114 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111111115 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                } else {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111111116 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111111117 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                }
                o0VarE.h0();
                p3.x1 x1Var111111111111118 = p3.n.f135158a;
                o0Var = o0VarE;
                a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                rVar2 = rVar4;
                z17 = z15;
                r1Var3 = r1Var4;
                b1Var3 = b1VarB;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                jVar2 = jVar;
                z17 = z15;
                r1Var3 = r1Var2;
                b1Var3 = b1Var2;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
            }
        }
        i16 |= 12582912;
        h2Var2 = h2Var;
        i28 = i15 & 256;
        if (i28 != 0) {
            if ((i14 & 100663296) == 0) {
                int i3114 = i16;
                if (o0VarE.B(jVar)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i30 = i3114 | i29;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(qVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i30 |= i35;
            }
            i34 = i30;
            if ((i34 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i34 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var111111111111119 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var1111111111111110 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                } else {
                    if (i36 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var1111111111111111 = p3.n.f135158a;
                        n3.h.f122937a.getClass();
                        r1VarC = fc.c(n3.h.f122939c, o0VarE);
                        i34 &= -7169;
                    } else {
                        r1VarC = r1Var2;
                    }
                    if ((i15 & 16) != 0) {
                        c1.f87691a.getClass();
                        p3.x1 x1Var1111111111111112 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        b1VarB = c1.b(s7.a(o0VarE));
                        i34 &= -57345;
                    } else {
                        b1VarB = b1Var2;
                    }
                    if (i24 != 0) {
                        uVar2 = null;
                    }
                    if (i26 != 0) {
                        c1.f87691a.getClass();
                        h2Var2 = c1.f87693c;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    rVar4 = rVar3;
                    r1Var4 = r1VarC;
                }
                o0VarE.h0();
                p3.x1 x1Var1111111111111113 = p3.n.f135158a;
                o0Var = o0VarE;
                a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
                rVar2 = rVar4;
                z17 = z15;
                r1Var3 = r1Var4;
                b1Var3 = b1VarB;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                jVar2 = jVar;
                z17 = z15;
                r1Var3 = r1Var2;
                b1Var3 = b1Var2;
                uVar3 = uVar2;
                h2Var3 = h2Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
            }
        }
        i16 |= 100663296;
        i30 = i16;
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(qVar)) {
                i35 = 536870912;
            } else {
                i35 = 268435456;
            }
            i30 |= i35;
        }
        i34 = i30;
        if ((i34 & 306783379) != 306783378) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i34 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i36 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                if ((i15 & 8) != 0) {
                    c1.f87691a.getClass();
                    p3.x1 x1Var1111111111111114 = p3.n.f135158a;
                    n3.h.f122937a.getClass();
                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                    i34 &= -7169;
                } else {
                    r1VarC = r1Var2;
                }
                if ((i15 & 16) != 0) {
                    c1.f87691a.getClass();
                    p3.x1 x1Var1111111111111115 = p3.n.f135158a;
                    s7.f89624a.getClass();
                    b1VarB = c1.b(s7.a(o0VarE));
                    i34 &= -57345;
                } else {
                    b1VarB = b1Var2;
                }
                if (i24 != 0) {
                    uVar2 = null;
                }
                if (i26 != 0) {
                    c1.f87691a.getClass();
                    h2Var2 = c1.f87693c;
                }
                if (i28 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                rVar4 = rVar3;
                r1Var4 = r1VarC;
            } else {
                if (i36 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                if ((i15 & 8) != 0) {
                    c1.f87691a.getClass();
                    p3.x1 x1Var1111111111111116 = p3.n.f135158a;
                    n3.h.f122937a.getClass();
                    r1VarC = fc.c(n3.h.f122939c, o0VarE);
                    i34 &= -7169;
                } else {
                    r1VarC = r1Var2;
                }
                if ((i15 & 16) != 0) {
                    c1.f87691a.getClass();
                    p3.x1 x1Var1111111111111117 = p3.n.f135158a;
                    s7.f89624a.getClass();
                    b1VarB = c1.b(s7.a(o0VarE));
                    i34 &= -57345;
                } else {
                    b1VarB = b1Var2;
                }
                if (i24 != 0) {
                    uVar2 = null;
                }
                if (i26 != 0) {
                    c1.f87691a.getClass();
                    h2Var2 = c1.f87693c;
                }
                if (i28 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                rVar4 = rVar3;
                r1Var4 = r1VarC;
            }
            o0VarE.h0();
            p3.x1 x1Var1111111111111118 = p3.n.f135158a;
            o0Var = o0VarE;
            a(aVar, rVar4, z15, r1Var4, b1VarB, null, uVar2, h2Var2, jVar3, qVar, o0Var, i34 & 2147483646, 0);
            rVar2 = rVar4;
            z17 = z15;
            r1Var3 = r1Var4;
            b1Var3 = b1VarB;
            uVar3 = uVar2;
            h2Var3 = h2Var2;
            jVar2 = jVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            jVar2 = jVar;
            z17 = z15;
            r1Var3 = r1Var2;
            b1Var3 = b1Var2;
            uVar3 = uVar2;
            h2Var3 = h2Var2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e2.b(aVar, rVar2, z17, r1Var3, b1Var3, uVar3, h2Var3, jVar2, qVar, i14, i15);
        }
    }
}
