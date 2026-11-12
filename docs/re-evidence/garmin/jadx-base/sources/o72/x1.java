package o72;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import i3.mh;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class x1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130684a;

        static {
            int[] iArr = new int[b82.t0.a.values().length];
            try {
                iArr[b82.t0.a.ON_FOCUS_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b82.t0.a.ON_FOCUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f130684a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p3.m mVar, int i14) {
        int i15;
        int i16;
        int i17;
        p3.p1 p1Var;
        p3.p1 p1Var2;
        p3.p1 p1Var3;
        p3.p1 p1Var4;
        x5.r0 e0Var;
        p3.o0 o0VarE = mVar.E(286683349);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n("Initial Value");
                o0VarE.K(objQ);
            }
            p3.p1 p1Var5 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(new x5.l0("Selected text", og.a.l(0, 8), (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var6 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n("");
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var7 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n("");
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var8 = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p3.p0.n("");
                o0VarE.K(objQ5);
            }
            p3.p1 p1Var9 = (p3.p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p3.p0.n("");
                o0VarE.K(objQ6);
            }
            p3.p1 p1Var10 = (p3.p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p3.p0.n("");
                o0VarE.K(objQ7);
            }
            p3.p1 p1Var11 = (p3.p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p3.p0.n("");
                o0VarE.K(objQ8);
            }
            p3.p1 p1Var12 = (p3.p1) objQ8;
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = p3.p0.n("");
                o0VarE.K(objQ9);
            }
            p3.p1 p1Var13 = (p3.p1) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = p3.p0.n("");
                o0VarE.K(objQ10);
            }
            p3.p1 p1Var14 = (p3.p1) objQ10;
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = p3.p0.n("");
                o0VarE.K(objQ11);
            }
            p3.p1 p1Var15 = (p3.p1) objQ11;
            Object objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = p3.p0.n(new x5.l0("selected", og.a.l(0, 8), (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ12);
            }
            p3.p1 p1Var16 = (p3.p1) objQ12;
            Object objQ13 = o0VarE.q();
            if (objQ13 == c2565a) {
                objQ13 = p3.p0.n("Disabled");
                o0VarE.K(objQ13);
            }
            p3.p1 p1Var17 = (p3.p1) objQ13;
            Object objQ14 = o0VarE.q();
            if (objQ14 == c2565a) {
                objQ14 = p3.p0.n("");
                o0VarE.K(objQ14);
            }
            p3.p1 p1Var18 = (p3.p1) objQ14;
            Object objQ15 = o0VarE.q();
            if (objQ15 == c2565a) {
                objQ15 = p3.p0.n("");
                o0VarE.K(objQ15);
            }
            p3.p1 p1Var19 = (p3.p1) objQ15;
            Object objQ16 = o0VarE.q();
            if (objQ16 == c2565a) {
                objQ16 = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ16);
            }
            p3.p1 p1Var20 = (p3.p1) objQ16;
            Object objQ17 = o0VarE.q();
            if (objQ17 == c2565a) {
                objQ17 = p3.p0.n("");
                o0VarE.K(objQ17);
            }
            p3.p1 p1Var21 = (p3.p1) objQ17;
            Object objQ18 = o0VarE.q();
            if (objQ18 == c2565a) {
                objQ18 = p3.p0.n("");
                o0VarE.K(objQ18);
            }
            p3.p1 p1Var22 = (p3.p1) objQ18;
            Object objQ19 = o0VarE.q();
            if (objQ19 == c2565a) {
                objQ19 = p3.p0.n("");
                o0VarE.K(objQ19);
            }
            final p3.p1 p1Var23 = (p3.p1) objQ19;
            Object objQ20 = o0VarE.q();
            if (objQ20 == c2565a) {
                objQ20 = p3.p0.n("");
                o0VarE.K(objQ20);
            }
            final p3.p1 p1Var24 = (p3.p1) objQ20;
            Object objQ21 = o0VarE.q();
            if (objQ21 == c2565a) {
                objQ21 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ21);
            }
            final p3.p1 p1Var25 = (p3.p1) objQ21;
            Object objQ22 = o0VarE.q();
            if (objQ22 == c2565a) {
                objQ22 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ22);
            }
            final p3.p1 p1Var26 = (p3.p1) objQ22;
            Object objQ23 = o0VarE.q();
            if (objQ23 == c2565a) {
                objQ23 = p3.p0.n(null);
                o0VarE.K(objQ23);
            }
            final p3.p1 p1Var27 = (p3.p1) objQ23;
            Object objQ24 = o0VarE.q();
            if (objQ24 == c2565a) {
                objQ24 = p3.p0.n(null);
                o0VarE.K(objQ24);
            }
            final p3.p1 p1Var28 = (p3.p1) objQ24;
            String str = (String) p1Var5.getF182175a();
            Object objQ25 = o0VarE.q();
            int i18 = 23;
            if (objQ25 == c2565a) {
                objQ25 = new md0.f(p1Var5, i18);
                o0VarE.K(objQ25);
            }
            l72.p1.a(str, null, "Hint", null, false, false, null, 0L, null, null, null, null, null, (e23.l) objQ25, o0VarE, 384, 24576, 16378);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            x5.l0 l0Var = (x5.l0) p1Var6.getF182175a();
            Object objQ26 = o0VarE.q();
            if (objQ26 == c2565a) {
                objQ26 = new md0.f(p1Var6, 25);
                o0VarE.K(objQ26);
            }
            l72.p1.b(l0Var, null, "Hint", null, false, false, null, 0L, null, null, null, null, null, null, (e23.l) objQ26, o0VarE, 384, 24576, 16378);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            b82.t0 t0Var = b82.t0.f16792a;
            String str2 = (String) p1Var23.getF182175a();
            boolean zBooleanValue = ((Boolean) p1Var25.getF182175a()).booleanValue();
            Object objQ27 = o0VarE.q();
            if (objQ27 == c2565a) {
                objQ27 = new v1(p1Var23, 3);
                o0VarE.K(objQ27);
            }
            e23.l lVar = (e23.l) objQ27;
            Object objQ28 = o0VarE.q();
            if (objQ28 == c2565a) {
                final int i19 = 0;
                objQ28 = new e23.l() { // from class: o72.w1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        b82.t0.a aVar3 = (b82.t0.a) obj;
                        switch (i19) {
                            case 0:
                                aVar3.getClass();
                                int i24 = x1.a.f130684a[aVar3.ordinal()];
                                if (i24 == 1) {
                                    boolean zD = new d53.k("^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})").d((String) p1Var23.getF182175a());
                                    p1Var25.setValue(Boolean.valueOf(!zD));
                                    p3.p1 p1Var29 = p1Var26;
                                    boolean zBooleanValue2 = ((Boolean) p1Var29.getF182175a()).booleanValue();
                                    p3.p1 p1Var30 = p1Var27;
                                    p3.p1 p1Var31 = p1Var28;
                                    if (!zBooleanValue2 && zD) {
                                        p1Var30.setValue(null);
                                        p1Var31.setValue(null);
                                    } else if (!zD && ((Boolean) p1Var29.getF182175a()).booleanValue()) {
                                        p1Var30.setValue(null);
                                        p1Var31.setValue("Please review your email and phone number. Both are required so we can reach you in case of an emergency.");
                                    } else if (zD) {
                                        p1Var30.setValue(null);
                                        p1Var31.setValue("Please review the format of your phone number. It is the primary method we will try to reach you in case of an emergency.");
                                    } else {
                                        p1Var30.setValue("Please review the format of your email address. It will be used in case we cannot reach you via SMS.");
                                        p1Var31.setValue(null);
                                    }
                                } else if (i24 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                return Unit.INSTANCE;
                            default:
                                aVar3.getClass();
                                int i25 = x1.a.f130684a[aVar3.ordinal()];
                                if (i25 == 1) {
                                    boolean zD2 = new d53.k("^\\d{10}$").d((String) p1Var23.getF182175a());
                                    p1Var25.setValue(Boolean.valueOf(!zD2));
                                    p3.p1 p1Var32 = p1Var26;
                                    p3.p1 p1Var33 = p1Var27;
                                    p3.p1 p1Var34 = p1Var28;
                                    if (zD2 && !((Boolean) p1Var32.getF182175a()).booleanValue()) {
                                        p1Var33.setValue(null);
                                        p1Var34.setValue(null);
                                    } else if (((Boolean) p1Var32.getF182175a()).booleanValue() && !zD2) {
                                        p1Var33.setValue(null);
                                        p1Var34.setValue("Please review your email and phone number. Both are required so we can reach you in case of an emergency.");
                                    } else if (((Boolean) p1Var32.getF182175a()).booleanValue()) {
                                        p1Var33.setValue("Please review the format of your email address. It will be used in case we cannot reach you via SMS.");
                                        p1Var34.setValue(null);
                                    } else {
                                        p1Var33.setValue(null);
                                        p1Var34.setValue("Please review the format of your phone number. It is the primary method we will try to reach you in case of an emergency.");
                                    }
                                } else if (i25 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                o0VarE.K(objQ28);
            }
            x5.v.f188954b.getClass();
            t0Var.i(null, "Email Address", str2, null, zBooleanValue, lVar, (e23.l) objQ28, x5.v.f188960h, 0, null, o0VarE, 14355504, 769);
            String str3 = (String) p1Var24.getF182175a();
            boolean zBooleanValue2 = ((Boolean) p1Var26.getF182175a()).booleanValue();
            Object objQ29 = o0VarE.q();
            int i24 = 6;
            if (objQ29 == c2565a) {
                objQ29 = new v1(p1Var24, i24);
                o0VarE.K(objQ29);
            }
            e23.l lVar2 = (e23.l) objQ29;
            Object objQ30 = o0VarE.q();
            if (objQ30 == c2565a) {
                final int i25 = 1;
                objQ30 = new e23.l() { // from class: o72.w1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        b82.t0.a aVar3 = (b82.t0.a) obj;
                        switch (i25) {
                            case 0:
                                aVar3.getClass();
                                int i26 = x1.a.f130684a[aVar3.ordinal()];
                                if (i26 == 1) {
                                    boolean zD = new d53.k("^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})").d((String) p1Var24.getF182175a());
                                    p1Var26.setValue(Boolean.valueOf(!zD));
                                    p3.p1 p1Var29 = p1Var25;
                                    boolean zBooleanValue3 = ((Boolean) p1Var29.getF182175a()).booleanValue();
                                    p3.p1 p1Var30 = p1Var27;
                                    p3.p1 p1Var31 = p1Var28;
                                    if (!zBooleanValue3 && zD) {
                                        p1Var30.setValue(null);
                                        p1Var31.setValue(null);
                                    } else if (!zD && ((Boolean) p1Var29.getF182175a()).booleanValue()) {
                                        p1Var30.setValue(null);
                                        p1Var31.setValue("Please review your email and phone number. Both are required so we can reach you in case of an emergency.");
                                    } else if (zD) {
                                        p1Var30.setValue(null);
                                        p1Var31.setValue("Please review the format of your phone number. It is the primary method we will try to reach you in case of an emergency.");
                                    } else {
                                        p1Var30.setValue("Please review the format of your email address. It will be used in case we cannot reach you via SMS.");
                                        p1Var31.setValue(null);
                                    }
                                } else if (i26 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                return Unit.INSTANCE;
                            default:
                                aVar3.getClass();
                                int i27 = x1.a.f130684a[aVar3.ordinal()];
                                if (i27 == 1) {
                                    boolean zD2 = new d53.k("^\\d{10}$").d((String) p1Var24.getF182175a());
                                    p1Var26.setValue(Boolean.valueOf(!zD2));
                                    p3.p1 p1Var32 = p1Var25;
                                    p3.p1 p1Var33 = p1Var27;
                                    p3.p1 p1Var34 = p1Var28;
                                    if (zD2 && !((Boolean) p1Var32.getF182175a()).booleanValue()) {
                                        p1Var33.setValue(null);
                                        p1Var34.setValue(null);
                                    } else if (((Boolean) p1Var32.getF182175a()).booleanValue() && !zD2) {
                                        p1Var33.setValue(null);
                                        p1Var34.setValue("Please review your email and phone number. Both are required so we can reach you in case of an emergency.");
                                    } else if (((Boolean) p1Var32.getF182175a()).booleanValue()) {
                                        p1Var33.setValue("Please review the format of your email address. It will be used in case we cannot reach you via SMS.");
                                        p1Var34.setValue(null);
                                    } else {
                                        p1Var33.setValue(null);
                                        p1Var34.setValue("Please review the format of your phone number. It is the primary method we will try to reach you in case of an emergency.");
                                    }
                                } else if (i27 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                o0VarE.K(objQ30);
            }
            int i26 = x5.v.f188957e;
            t0Var.i(null, "Phone Number", str3, null, zBooleanValue2, lVar2, (e23.l) objQ30, i26, 0, null, o0VarE, 14355504, 769);
            Object objQ31 = o0VarE.q();
            if (objQ31 == c2565a) {
                objQ31 = p3.p0.n("");
                o0VarE.K(objQ31);
            }
            p3.p1 p1Var29 = (p3.p1) objQ31;
            Object objQ32 = o0VarE.q();
            if (objQ32 == c2565a) {
                objQ32 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ32);
            }
            p3.p1 p1Var30 = (p3.p1) objQ32;
            String str4 = (String) p1Var29.getF182175a();
            int i27 = x5.v.f188955c;
            int i28 = 10;
            Object objQ33 = o0VarE.q();
            if (objQ33 == c2565a) {
                objQ33 = new v1(p1Var29, 7);
                o0VarE.K(objQ33);
            }
            e23.l lVar3 = (e23.l) objQ33;
            Object objQ34 = o0VarE.q();
            if (objQ34 == c2565a) {
                i16 = 8;
                objQ34 = new v1(p1Var30, i16);
                o0VarE.K(objQ34);
            } else {
                i16 = 8;
            }
            t0Var.i(null, "Description", str4, 10, false, lVar3, (e23.l) objQ34, i27, 0, z3.f.c(-707135763, new j10.q(p1Var30, p1Var29, 4), o0VarE), o0VarE, 819686448, TsExtractor.TS_STREAM_TYPE_AIT);
            Object objQ35 = o0VarE.q();
            if (objQ35 == c2565a) {
                objQ35 = p3.p0.n("");
                o0VarE.K(objQ35);
            }
            p3.p1 p1Var31 = (p3.p1) objQ35;
            String str5 = (String) p1Var31.getF182175a();
            Object objQ36 = o0VarE.q();
            if (objQ36 == c2565a) {
                objQ36 = new v1(p1Var31, 9);
                o0VarE.K(objQ36);
            }
            t0Var.k(null, "Description with hint", str5, "Hint text", false, 10, false, null, (e23.l) objQ36, null, i27, 0, null, null, o0VarE, 102435888, 6, 14993);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str6 = (String) p1Var10.getF182175a();
            m0.f130473a.getClass();
            z3.e eVar = m0.f130474b;
            Object objQ37 = o0VarE.q();
            if (objQ37 == c2565a) {
                i17 = 1;
                objQ37 = new v1(p1Var10, i17);
                o0VarE.K(objQ37);
            } else {
                i17 = 1;
            }
            int i29 = i17;
            l72.p1.a(str6, null, "Search field with leading icon", null, false, false, null, 0L, null, null, eVar, null, null, (e23.l) objQ37, o0VarE, 384, 24582, 15354);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            String str7 = (String) p1Var11.getF182175a();
            long jC = am.j.c(d92.b.f58623a, o0VarE);
            Object objQ38 = o0VarE.q();
            int i30 = 13;
            if (objQ38 == c2565a) {
                objQ38 = new li0.w(p1Var11, i30);
                o0VarE.K(objQ38);
            }
            t0Var.g(rVarF, str7, "Search bar", null, null, jC, (e23.p) objQ38, o0VarE, 1573254, 24);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str8 = (String) p1Var7.getF182175a();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, i26, 0, (x5.f0) null, (Boolean) null, (z5.c) null, 123, (p005kotlin.jvm.internal.j) null);
            Object objQ39 = o0VarE.q();
            if (objQ39 == c2565a) {
                objQ39 = new v1(p1Var7, i28);
                o0VarE.K(objQ39);
            }
            l72.p1.a(str8, null, "Number input with max limit of 6", 6, false, false, a2Var, 0L, null, null, null, null, null, (e23.l) objQ39, o0VarE, 1576320, 24576, 16306);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str9 = (String) p1Var8.getF182175a();
            Object objQ40 = o0VarE.q();
            if (objQ40 == c2565a) {
                objQ40 = new v1(p1Var8, 11);
                o0VarE.K(objQ40);
            }
            l72.p1.a(str9, null, "Text multiline - max char 300", 300, false, false, null, 0L, null, null, null, null, null, (e23.l) objQ40, o0VarE, 28032, 24576, 16354);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f15 = eVar2.f97920e;
            bVar.getClass();
            float f16 = eVar2.f97920e;
            bVar.getClass();
            mh.c("TextField with password visual transformation", c2.l.C(aVar, f16, f15, eVar2.f97920e, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, o0VarE, 6, 0, 262140);
            String str10 = (String) p1Var5.getF182175a();
            x5.e0 e0Var2 = new x5.e0((char) 0, i29, null);
            Object objQ41 = o0VarE.q();
            if (objQ41 == c2565a) {
                objQ41 = new v1(p1Var5, 12);
                o0VarE.K(objQ41);
            }
            l72.p1.a(str10, null, "Hint", null, false, false, null, 0L, null, null, null, e0Var2, null, (e23.l) objQ41, o0VarE, 384, 24576, 14330);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str11 = (String) p1Var9.getF182175a();
            Object objQ42 = o0VarE.q();
            if (objQ42 == c2565a) {
                objQ42 = new z0(8);
                o0VarE.K(objQ42);
            }
            e23.l lVar4 = (e23.l) objQ42;
            Object objQ43 = o0VarE.q();
            if (objQ43 == c2565a) {
                objQ43 = new v1(p1Var9, 13);
                o0VarE.K(objQ43);
            }
            t0Var.b(str11, null, null, "Add Notes", 0, 0, lVar4, (e23.l) objQ43, o0VarE, 113273856, 102);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str12 = (String) p1Var12.getF182175a();
            Object objQ44 = o0VarE.q();
            if (objQ44 == c2565a) {
                objQ44 = new v1(p1Var12, 14);
                o0VarE.K(objQ44);
            }
            t0Var.h(str12, null, "Helper or Validation Message.", null, "Hint", null, false, 0, (e23.l) objQ44, o0VarE, 805331328, 490);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str13 = (String) p1Var13.getF182175a();
            z3.e eVar3 = m0.f130475c;
            Object objQ45 = o0VarE.q();
            if (objQ45 == c2565a) {
                objQ45 = new v1(p1Var13, 15);
                o0VarE.K(objQ45);
            }
            t0Var.h(str13, null, null, eVar3, "Hint", null, false, 0, (e23.l) objQ45, o0VarE, 805334016, 486);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str14 = (String) p1Var14.getF182175a();
            z3.e eVar4 = m0.f130476d;
            Object objQ46 = o0VarE.q();
            if (objQ46 == c2565a) {
                p1Var = p1Var14;
                objQ46 = new md0.f(p1Var, 24);
                o0VarE.K(objQ46);
            } else {
                p1Var = p1Var14;
            }
            p3.p1 p1Var32 = p1Var;
            t0Var.h(str14, null, null, eVar4, "Hint", 300, false, 0, (e23.l) objQ46, o0VarE, 807103488, 390);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str15 = (String) p1Var32.getF182175a();
            z3.e eVar5 = m0.f130477e;
            Object objQ47 = o0VarE.q();
            int i34 = 26;
            if (objQ47 == c2565a) {
                objQ47 = new md0.f(p1Var32, i34);
                o0VarE.K(objQ47);
            }
            t0Var.h(str15, null, null, eVar5, "Hint", 300, false, 0, (e23.l) objQ47, o0VarE, 807103488, 390);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str16 = (String) p1Var15.getF182175a();
            boolean z14 = (((String) p1Var15.getF182175a()).length() == 0 ? i29 : 0) ^ 1;
            Object objQ48 = o0VarE.q();
            if (objQ48 == c2565a) {
                p1Var2 = p1Var15;
                objQ48 = new q1(p1Var2, 26);
                o0VarE.K(objQ48);
            } else {
                p1Var2 = p1Var15;
            }
            z3.e eVarM = b82.t0.m(z14, (e23.a) objQ48, o0VarE);
            bVar.getClass();
            int i35 = 2;
            h4.r rVarA = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            Object objQ49 = o0VarE.q();
            if (objQ49 == c2565a) {
                i15 = 27;
                objQ49 = new md0.f(p1Var2, i15);
                o0VarE.K(objQ49);
            } else {
                i15 = 27;
            }
            t0Var.e(str16, rVarA, null, "Label", null, false, false, null, null, eVarM, 0, 0L, 0L, null, null, (e23.l) objQ49, o0VarE, 3072, 196608, 32244);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            x5.l0 l0Var2 = (x5.l0) p1Var16.getF182175a();
            boolean z15 = (((x5.l0) p1Var16.getF182175a()).f188878a.f157138b.length() == 0 ? i29 : 0) ^ 1;
            Object objQ50 = o0VarE.q();
            if (objQ50 == c2565a) {
                p1Var3 = p1Var16;
                objQ50 = new q1(p1Var3, i15);
                o0VarE.K(objQ50);
            } else {
                p1Var3 = p1Var16;
            }
            z3.e eVarM2 = b82.t0.m(z15, (e23.a) objQ50, o0VarE);
            bVar.getClass();
            h4.r rVarA2 = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            Object objQ51 = o0VarE.q();
            int i36 = 28;
            if (objQ51 == c2565a) {
                objQ51 = new md0.f(p1Var3, i36);
                o0VarE.K(objQ51);
            }
            t0Var.f(l0Var2, rVarA2, "Label", false, false, null, eVarM2, 0, 0L, 0L, null, (e23.l) objQ51, o0VarE, 3072);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str17 = (String) p1Var17.getF182175a();
            bVar.getClass();
            h4.r rVarA3 = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            Object objQ52 = o0VarE.q();
            if (objQ52 == c2565a) {
                objQ52 = new i0(23);
                o0VarE.K(objQ52);
            }
            z3.e eVarN = b82.t0.n(false, "Hide sensitive text", (e23.a) objQ52, o0VarE);
            Object objQ53 = o0VarE.q();
            if (objQ53 == c2565a) {
                objQ53 = new md0.f(p1Var17, 29);
                o0VarE.K(objQ53);
            }
            t0Var.e(str17, rVarA3, null, "Label", null, false, false, null, null, eVarN, 0, 0L, 0L, null, null, (e23.l) objQ53, o0VarE, 199680, 196608, 32212);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str18 = (String) p1Var18.getF182175a();
            bVar.getClass();
            h4.r rVarA4 = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            int i37 = 0;
            z3.e eVarC = z3.f.c(1767833323, new b82.y(aVar, i37), o0VarE);
            Object objQ54 = o0VarE.q();
            if (objQ54 == c2565a) {
                objQ54 = new v1(p1Var18, i37);
                o0VarE.K(objQ54);
            }
            t0Var.e(str18, rVarA4, null, "Label", null, false, false, null, null, eVarC, 0, 0L, 0L, null, null, (e23.l) objQ54, o0VarE, 3072, 196608, 32244);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str19 = (String) p1Var19.getF182175a();
            bVar.getClass();
            h4.r rVarA5 = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            boolean zBooleanValue3 = ((Boolean) p1Var20.getF182175a()).booleanValue();
            String str20 = ((Boolean) p1Var20.getF182175a()).booleanValue() ? "Show sensitive text" : "Hide sensitive text";
            Object objQ55 = o0VarE.q();
            if (objQ55 == c2565a) {
                p1Var4 = p1Var20;
                objQ55 = new q1(p1Var4, 28);
                o0VarE.K(objQ55);
            } else {
                p1Var4 = p1Var20;
            }
            z3.e eVarN2 = b82.t0.n(zBooleanValue3, str20, (e23.a) objQ55, o0VarE);
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                e0Var = new x5.e0((char) 0, i29, null);
            } else {
                x5.r0.f188941a.getClass();
                e0Var = x5.r0.a.f188943b;
            }
            x5.r0 r0Var = e0Var;
            Object objQ56 = o0VarE.q();
            if (objQ56 == c2565a) {
                objQ56 = new v1(p1Var19, i35);
                o0VarE.K(objQ56);
            }
            t0Var.e(str19, rVarA5, null, "Label", null, false, false, "Helper or Validation Message.", null, eVarN2, 0, 0L, 0L, r0Var, null, (e23.l) objQ56, o0VarE, 12585984, 196608, 23924);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str21 = (String) p1Var21.getF182175a();
            bVar.getClass();
            h4.r rVarA6 = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            b82.t0.b bVar2 = b82.t0.b.ERROR;
            Object objQ57 = o0VarE.q();
            if (objQ57 == c2565a) {
                objQ57 = new v1(p1Var21, 4);
                o0VarE.K(objQ57);
            }
            t0Var.e(str21, rVarA6, null, "Label", null, false, false, "Validation error", bVar2, null, 0, 0L, 0L, null, null, (e23.l) objQ57, o0VarE, 113249280, 196608, 32372);
            c2.l.f(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
            String str22 = (String) p1Var22.getF182175a();
            bVar.getClass();
            h4.r rVarA7 = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            b82.t0.b bVar3 = b82.t0.b.SUCCESS;
            Object objQ58 = o0VarE.q();
            if (objQ58 == c2565a) {
                objQ58 = new v1(p1Var22, 5);
                o0VarE.K(objQ58);
            }
            t0Var.e(str22, rVarA7, null, "Label", null, false, false, "Success", bVar3, null, 0, 0L, 0L, null, null, (e23.l) objQ58, o0VarE, 113249280, 196608, 32372);
            o0VarE = o0VarE;
        } else {
            i15 = 27;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b1(i14, i15);
        }
    }
}
