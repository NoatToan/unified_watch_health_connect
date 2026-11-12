package ot2;

import java.util.Iterator;
import java.util.List;
import lc.u0;
import o72.t;
import o73.u;
import o73.v;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.math.MathKt;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133900a;

        static {
            int[] iArr = new int[mt2.i.values().length];
            try {
                iArr[mt2.i.CADENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mt2.i.CUSTOM_HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mt2.i.HEART_RATE_ZONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mt2.i.SPEED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mt2.i.PACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mt2.i.CUSTOM_POWER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mt2.i.POWER_ZONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mt2.i.POWER_CURVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mt2.i.EXHALE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mt2.i.INHALE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mt2.i.EXHALE_HOLD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[mt2.i.INHALE_HOLD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[mt2.i.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f133900a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0149  */
    /* JADX WARN: Code duplicated, block: B:38:0x0178  */
    /* JADX WARN: Code duplicated, block: B:42:0x0190  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x0209  */
    /* JADX WARN: Code duplicated, block: B:56:0x0245  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0115, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0140, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02bb, code lost:
    
        if (r7 == r9) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Serializable, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(boolean z14, boolean z15, double d14, double d15, mt2.j jVar, int i14, v13.c cVar) {
        o oVar;
        double d16;
        String str;
        String str2;
        u uVarX;
        ?? r14;
        boolean z16;
        int i15;
        u uVar;
        ?? r15;
        boolean z17;
        double d17;
        double d18;
        u uVarX2;
        ?? r16;
        ?? r17;
        ?? r18;
        String str3;
        ?? r19;
        Object objB;
        Object obj;
        boolean z18;
        boolean z19;
        double d19;
        double d24;
        int i16;
        String str4;
        Object obj2;
        String str5;
        String str6;
        boolean z24 = z14;
        boolean z25 = z15;
        double d25 = d14;
        double d26 = d15;
        int i17 = i14;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i18 = oVar.f133911k;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                oVar.f133911k = i18 - Integer.MIN_VALUE;
            } else {
                oVar = new o(cVar);
            }
        } else {
            oVar = new o(cVar);
        }
        Object objA = oVar.f133910j;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = 0;
        switch (oVar.f133911k) {
            case 0:
                o13.r.b(objA);
                if (jVar == mt2.j.PERCENT) {
                    if (!z24) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar2 = (u) kt2.e.W.getValue();
                        oVar.f133901a = z24;
                        oVar.f133902b = z25;
                        oVar.f133903c = d25;
                        oVar.f133904d = d26;
                        oVar.f133905e = i17;
                        oVar.f133911k = 2;
                        objA = v.a(uVar2, oVar);
                    } else {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar3 = (u) kt2.e.C.getValue();
                        oVar.f133901a = z24;
                        oVar.f133902b = z25;
                        oVar.f133903c = d25;
                        oVar.f133904d = d26;
                        oVar.f133905e = i17;
                        oVar.f133911k = 1;
                        objA = v.a(uVar3, oVar);
                    }
                    break;
                } else {
                    if (!z24) {
                        u uVarY = gg.b.y(kt2.f.f106534a);
                        oVar.f133903c = d25;
                        oVar.f133904d = d26;
                        oVar.f133911k = 9;
                        objA = v.a(uVarY, oVar);
                        if (objA != aVar) {
                            d16 = d26;
                            str5 = (String) objA;
                            double d27 = d25;
                            double d28 = d16;
                            str6 = str5;
                            u uVarE = gg.b.E(kt2.f.f106534a);
                            Object[] objArr = {String.valueOf((int) d27), String.valueOf((int) d28)};
                            oVar.f133906f = str6;
                            oVar.f133911k = 10;
                            objA = v.b(uVarE, objArr, oVar);
                        }
                    } else {
                        u uVarR = gg.b.r(kt2.f.f106534a);
                        oVar.f133903c = d25;
                        oVar.f133904d = d26;
                        oVar.f133911k = 8;
                        objA = v.a(uVarR, oVar);
                        if (objA != aVar) {
                            d16 = d26;
                            str5 = (String) objA;
                            double d29 = d25;
                            double d210 = d16;
                            str6 = str5;
                            u uVarE2 = gg.b.E(kt2.f.f106534a);
                            Object[] objArr2 = {String.valueOf((int) d29), String.valueOf((int) d210)};
                            oVar.f133906f = str6;
                            oVar.f133911k = 10;
                            objA = v.b(uVarE2, objArr2, oVar);
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                int i24 = oVar.f133905e;
                double d34 = oVar.f133904d;
                double d35 = oVar.f133903c;
                boolean z26 = oVar.f133902b;
                boolean z27 = oVar.f133901a;
                o13.r.b(objA);
                i17 = i24;
                z24 = z27;
                z25 = z26;
                d25 = d35;
                d26 = d34;
                str = (String) objA;
                str2 = str;
                if (z25) {
                    kt2.f fVar = kt2.f.f106534a;
                    uVarX2 = gg.b.x(fVar);
                    r16 = new Object[1];
                    u uVarE3 = gg.b.E(fVar);
                    Object[] objArr3 = {String.valueOf((int) d25), String.valueOf((int) d26)};
                    oVar.f133906f = str2;
                    oVar.f133907g = r16;
                    oVar.f133908h = uVarX2;
                    oVar.f133909i = r16;
                    oVar.f133905e = 0;
                    oVar.f133911k = 3;
                    objA = v.b(uVarE3, objArr3, oVar);
                    if (objA != aVar) {
                        ?? r24 = r16;
                        r17 = r24;
                        r18 = r24;
                        r18[i19] = objA;
                        oVar.f133906f = str2;
                        oVar.f133907g = null;
                        oVar.f133908h = null;
                        oVar.f133909i = null;
                        oVar.f133911k = 4;
                        objA = v.b(uVarX2, r17, oVar);
                        if (objA != aVar) {
                            str3 = str2;
                            return objA + StringUtils.SPACE + str3;
                        }
                    }
                } else {
                    kt2.f fVar2 = kt2.f.f106534a;
                    uVarX = gg.b.x(fVar2);
                    r14 = new Object[1];
                    u uVarE4 = gg.b.E(fVar2);
                    Object[] objArr4 = {String.valueOf((int) d25), String.valueOf((int) d26)};
                    oVar.f133906f = str2;
                    oVar.f133907g = r14;
                    oVar.f133908h = uVarX;
                    oVar.f133909i = r14;
                    oVar.f133901a = z24;
                    oVar.f133902b = z25;
                    oVar.f133903c = d25;
                    oVar.f133904d = d26;
                    oVar.f133905e = i17;
                    oVar.f133911k = 5;
                    objA = v.b(uVarE4, objArr4, oVar);
                    if (objA != aVar) {
                        int i25 = i17;
                        z16 = z24;
                        i15 = i25;
                        ?? r110 = r14;
                        uVar = uVarX;
                        r15 = r110;
                        z17 = z25;
                        d17 = d25;
                        d18 = d26;
                        r19 = r110;
                        r15[0] = objA;
                        oVar.f133906f = str2;
                        oVar.f133907g = null;
                        oVar.f133908h = null;
                        oVar.f133909i = null;
                        oVar.f133901a = z16;
                        oVar.f133902b = z17;
                        oVar.f133903c = d17;
                        oVar.f133904d = d18;
                        oVar.f133905e = i15;
                        oVar.f133911k = 6;
                        objB = v.b(uVar, r19, oVar);
                        if (objB != aVar) {
                            obj = objB;
                            z18 = z16;
                            z19 = z17;
                            d19 = d17;
                            d24 = d18;
                            i16 = i15;
                            str4 = str2;
                            double d36 = i16;
                            int i26 = i16;
                            double d37 = 100;
                            double d38 = (int) MathKt.d((d19 * d36) / d37);
                            double d39 = (int) MathKt.d((d36 * d24) / d37);
                            oVar.f133906f = obj;
                            oVar.f133907g = str4;
                            oVar.f133911k = 7;
                            objA = a(z18, z19, d38, d39, null, i26, oVar);
                            if (objA != aVar) {
                                obj2 = obj;
                                return obj2 + StringUtils.SPACE + str4 + " (" + objA + ")";
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                int i27 = oVar.f133905e;
                double d44 = oVar.f133904d;
                double d45 = oVar.f133903c;
                boolean z28 = oVar.f133902b;
                boolean z29 = oVar.f133901a;
                o13.r.b(objA);
                i17 = i27;
                z24 = z29;
                z25 = z28;
                d25 = d45;
                d26 = d44;
                str = (String) objA;
                str2 = str;
                if (z25) {
                    kt2.f fVar3 = kt2.f.f106534a;
                    uVarX2 = gg.b.x(fVar3);
                    r16 = new Object[1];
                    u uVarE5 = gg.b.E(fVar3);
                    Object[] objArr5 = {String.valueOf((int) d25), String.valueOf((int) d26)};
                    oVar.f133906f = str2;
                    oVar.f133907g = r16;
                    oVar.f133908h = uVarX2;
                    oVar.f133909i = r16;
                    oVar.f133905e = 0;
                    oVar.f133911k = 3;
                    objA = v.b(uVarE5, objArr5, oVar);
                    if (objA != aVar) {
                        ?? r25 = r16;
                        r17 = r25;
                        r18 = r25;
                        r18[i19] = objA;
                        oVar.f133906f = str2;
                        oVar.f133907g = null;
                        oVar.f133908h = null;
                        oVar.f133909i = null;
                        oVar.f133911k = 4;
                        objA = v.b(uVarX2, r17, oVar);
                        if (objA != aVar) {
                            str3 = str2;
                            return objA + StringUtils.SPACE + str3;
                        }
                    }
                } else {
                    kt2.f fVar4 = kt2.f.f106534a;
                    uVarX = gg.b.x(fVar4);
                    r14 = new Object[1];
                    u uVarE6 = gg.b.E(fVar4);
                    Object[] objArr6 = {String.valueOf((int) d25), String.valueOf((int) d26)};
                    oVar.f133906f = str2;
                    oVar.f133907g = r14;
                    oVar.f133908h = uVarX;
                    oVar.f133909i = r14;
                    oVar.f133901a = z24;
                    oVar.f133902b = z25;
                    oVar.f133903c = d25;
                    oVar.f133904d = d26;
                    oVar.f133905e = i17;
                    oVar.f133911k = 5;
                    objA = v.b(uVarE6, objArr6, oVar);
                    if (objA != aVar) {
                        int i28 = i17;
                        z16 = z24;
                        i15 = i28;
                        ?? r111 = r14;
                        uVar = uVarX;
                        r15 = r111;
                        z17 = z25;
                        d17 = d25;
                        d18 = d26;
                        r19 = r111;
                        r15[0] = objA;
                        oVar.f133906f = str2;
                        oVar.f133907g = null;
                        oVar.f133908h = null;
                        oVar.f133909i = null;
                        oVar.f133901a = z16;
                        oVar.f133902b = z17;
                        oVar.f133903c = d17;
                        oVar.f133904d = d18;
                        oVar.f133905e = i15;
                        oVar.f133911k = 6;
                        objB = v.b(uVar, r19, oVar);
                        if (objB != aVar) {
                            obj = objB;
                            z18 = z16;
                            z19 = z17;
                            d19 = d17;
                            d24 = d18;
                            i16 = i15;
                            str4 = str2;
                            double d310 = i16;
                            int i29 = i16;
                            double d311 = 100;
                            double d312 = (int) MathKt.d((d19 * d310) / d311);
                            double d313 = (int) MathKt.d((d310 * d24) / d311);
                            oVar.f133906f = obj;
                            oVar.f133907g = str4;
                            oVar.f133911k = 7;
                            objA = a(z18, z19, d312, d313, null, i29, oVar);
                            if (objA != aVar) {
                                obj2 = obj;
                                return obj2 + StringUtils.SPACE + str4 + " (" + objA + ")";
                            }
                        }
                    }
                }
                return aVar;
            case 3:
                i19 = oVar.f133905e;
                Object[] objArr7 = oVar.f133909i;
                uVarX2 = oVar.f133908h;
                Object[] objArr8 = (Object[]) oVar.f133907g;
                String str7 = (String) oVar.f133906f;
                o13.r.b(objA);
                str2 = str7;
                r18 = objArr7;
                r17 = objArr8;
                r18[i19] = objA;
                oVar.f133906f = str2;
                oVar.f133907g = null;
                oVar.f133908h = null;
                oVar.f133909i = null;
                oVar.f133911k = 4;
                objA = v.b(uVarX2, r17, oVar);
                if (objA != aVar) {
                    str3 = str2;
                    return objA + StringUtils.SPACE + str3;
                }
                return aVar;
            case 4:
                str3 = (String) oVar.f133906f;
                o13.r.b(objA);
                return objA + StringUtils.SPACE + str3;
            case 5:
                i15 = oVar.f133905e;
                d18 = oVar.f133904d;
                d17 = oVar.f133903c;
                z17 = oVar.f133902b;
                z16 = oVar.f133901a;
                Object[] objArr9 = oVar.f133909i;
                uVar = oVar.f133908h;
                Object[] objArr10 = (Object[]) oVar.f133907g;
                str2 = (String) oVar.f133906f;
                o13.r.b(objA);
                r15 = objArr9;
                r19 = objArr10;
                r15[0] = objA;
                oVar.f133906f = str2;
                oVar.f133907g = null;
                oVar.f133908h = null;
                oVar.f133909i = null;
                oVar.f133901a = z16;
                oVar.f133902b = z17;
                oVar.f133903c = d17;
                oVar.f133904d = d18;
                oVar.f133905e = i15;
                oVar.f133911k = 6;
                objB = v.b(uVar, r19, oVar);
                if (objB != aVar) {
                    obj = objB;
                    z18 = z16;
                    z19 = z17;
                    d19 = d17;
                    d24 = d18;
                    i16 = i15;
                    str4 = str2;
                    double d314 = i16;
                    int i210 = i16;
                    double d315 = 100;
                    double d316 = (int) MathKt.d((d19 * d314) / d315);
                    double d317 = (int) MathKt.d((d314 * d24) / d315);
                    oVar.f133906f = obj;
                    oVar.f133907g = str4;
                    oVar.f133911k = 7;
                    objA = a(z18, z19, d316, d317, null, i210, oVar);
                    if (objA != aVar) {
                        obj2 = obj;
                        return obj2 + StringUtils.SPACE + str4 + " (" + objA + ")";
                    }
                }
                return aVar;
            case 6:
                int i30 = oVar.f133905e;
                double d46 = oVar.f133904d;
                double d47 = oVar.f133903c;
                boolean z34 = oVar.f133902b;
                boolean z35 = oVar.f133901a;
                String str8 = (String) oVar.f133906f;
                o13.r.b(objA);
                i16 = i30;
                str4 = str8;
                obj = objA;
                z18 = z35;
                z19 = z34;
                d19 = d47;
                d24 = d46;
                double d318 = i16;
                int i211 = i16;
                double d319 = 100;
                double d3110 = (int) MathKt.d((d19 * d318) / d319);
                double d3111 = (int) MathKt.d((d318 * d24) / d319);
                oVar.f133906f = obj;
                oVar.f133907g = str4;
                oVar.f133911k = 7;
                objA = a(z18, z19, d3110, d3111, null, i211, oVar);
                if (objA != aVar) {
                    obj2 = obj;
                    return obj2 + StringUtils.SPACE + str4 + " (" + objA + ")";
                }
                return aVar;
            case 7:
                str4 = (String) oVar.f133907g;
                obj2 = oVar.f133906f;
                o13.r.b(objA);
                return obj2 + StringUtils.SPACE + str4 + " (" + objA + ")";
            case 8:
                d16 = oVar.f133904d;
                d25 = oVar.f133903c;
                o13.r.b(objA);
                str5 = (String) objA;
                double d211 = d25;
                double d212 = d16;
                str6 = str5;
                u uVarE7 = gg.b.E(kt2.f.f106534a);
                Object[] objArr11 = {String.valueOf((int) d211), String.valueOf((int) d212)};
                oVar.f133906f = str6;
                oVar.f133911k = 10;
                objA = v.b(uVarE7, objArr11, oVar);
                break;
            case 9:
                d16 = oVar.f133904d;
                d25 = oVar.f133903c;
                o13.r.b(objA);
                str5 = (String) objA;
                double d213 = d25;
                double d214 = d16;
                str6 = str5;
                u uVarE8 = gg.b.E(kt2.f.f106534a);
                Object[] objArr12 = {String.valueOf((int) d213), String.valueOf((int) d214)};
                oVar.f133906f = str6;
                oVar.f133911k = 10;
                objA = v.b(uVarE8, objArr12, oVar);
                break;
            case 10:
                str6 = (String) oVar.f133906f;
                o13.r.b(objA);
                return objA + StringUtils.SPACE + str6;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public static final Object b(boolean z14, long j8, r rVar) {
        if (j8 <= 3599 && j8 >= 0) {
            return z14 ? t.x(j8, rVar, true) : t.y(j8);
        }
        if (z14) {
            kt2.f.f106534a.getClass();
            kt2.e.f106460a.getClass();
            Object objA = v.a((u) kt2.e.Z0.getValue(), rVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : (String) objA;
        }
        kt2.f.f106534a.getClass();
        kt2.e.f106460a.getClass();
        Object objA2 = v.a((u) kt2.e.O0.getValue(), rVar);
        return objA2 == u13.a.COROUTINE_SUSPENDED ? objA2 : (String) objA2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(boolean z14, boolean z15, int i14, int i15, int i16, List list, v13.c cVar) {
        p pVar;
        String str;
        int i17;
        int i18;
        int i19;
        Object objA;
        String str2;
        int i24;
        Object objA2;
        int i25;
        String str3;
        int i26;
        boolean z16;
        int i27;
        Object objA3;
        Iterator it;
        Object next;
        lt2.c cVar2;
        String str4;
        String str5;
        Object objB;
        Object objB2;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i28 = pVar.f133919h;
            if ((i28 & Integer.MIN_VALUE) != 0) {
                pVar.f133919h = i28 - Integer.MIN_VALUE;
            } else {
                pVar = new p(cVar);
            }
        } else {
            pVar = new p(cVar);
        }
        Object objX = pVar.f133918g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (pVar.f133919h) {
            case 0:
                o13.r.b(objX);
                pVar.f133917f = list;
                pVar.f133912a = z14;
                pVar.f133913b = z15;
                pVar.f133914c = i14;
                pVar.f133915d = i15;
                pVar.f133916e = i16;
                pVar.f133919h = 1;
                objX = t.x(i14, pVar, z14);
                if (objX != aVar) {
                    str = (String) objX;
                    if (list != null) {
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            cVar2 = (lt2.c) next;
                            if (cVar2 != null) {
                                i17 = cVar2.f114879b;
                            } else {
                                i17 = 0;
                            }
                        } while (((lt2.c) next).f114878a != i14);
                        cVar2 = (lt2.c) next;
                        if (cVar2 != null) {
                            i17 = cVar2.f114879b;
                        } else {
                            i17 = 0;
                        }
                    } else {
                        i17 = 0;
                    }
                    int i29 = (int) ((i17 * i15) / 100.0f);
                    int i30 = i29 - i16;
                    i18 = i30 >= 0 ? i30 : 0;
                    i19 = i16 + i29;
                    if (i17 > 0) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar = (u) kt2.e.N0.getValue();
                        pVar.f133917f = str;
                        pVar.f133912a = z15;
                        pVar.f133914c = i15;
                        pVar.f133919h = 4;
                        objA = v.a(uVar, pVar);
                        if (objA != aVar) {
                            str2 = str;
                            objX = objA;
                            i24 = i15;
                            str3 = str2;
                            i26 = i24;
                            str5 = (String) objX;
                            z16 = z15;
                            if (z16) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                u uVar2 = (u) kt2.e.R0.getValue();
                                Object[] objArr = {String.valueOf(i26), str3};
                                pVar.f133917f = null;
                                pVar.f133919h = 5;
                                objB2 = v.b(uVar2, objArr, pVar);
                                if (objB2 != aVar) {
                                    return objB2;
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                u uVar3 = (u) kt2.e.J.getValue();
                                Object[] objArr2 = {String.valueOf(i26), str3, str5};
                                pVar.f133917f = null;
                                pVar.f133919h = 6;
                                objB = v.b(uVar3, objArr2, pVar);
                                if (objB != aVar) {
                                    return objB;
                                }
                            }
                        }
                    } else if (z14) {
                        u uVarR = gg.b.r(kt2.f.f106534a);
                        pVar.f133917f = str;
                        pVar.f133912a = z15;
                        pVar.f133914c = i15;
                        pVar.f133915d = i18;
                        pVar.f133916e = i19;
                        pVar.f133919h = 2;
                        objA3 = v.a(uVarR, pVar);
                        if (objA3 != aVar) {
                            objX = objA3;
                            i25 = i19;
                            str3 = str;
                            i26 = i15;
                            z16 = z15;
                            i27 = i18;
                            str4 = (String) objX;
                            str5 = i27 + "-" + i25 + StringUtils.SPACE + str4;
                            if (z16) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                u uVar4 = (u) kt2.e.R0.getValue();
                                Object[] objArr3 = {String.valueOf(i26), str3};
                                pVar.f133917f = null;
                                pVar.f133919h = 5;
                                objB2 = v.b(uVar4, objArr3, pVar);
                                if (objB2 != aVar) {
                                    return objB2;
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                u uVar5 = (u) kt2.e.J.getValue();
                                Object[] objArr4 = {String.valueOf(i26), str3, str5};
                                pVar.f133917f = null;
                                pVar.f133919h = 6;
                                objB = v.b(uVar5, objArr4, pVar);
                                if (objB != aVar) {
                                    return objB;
                                }
                            }
                        }
                    } else {
                        u uVarY = gg.b.y(kt2.f.f106534a);
                        pVar.f133917f = str;
                        pVar.f133912a = z15;
                        pVar.f133914c = i15;
                        pVar.f133915d = i18;
                        pVar.f133916e = i19;
                        pVar.f133919h = 3;
                        objA2 = v.a(uVarY, pVar);
                        if (objA2 != aVar) {
                            objX = objA2;
                            i25 = i19;
                            str3 = str;
                            i26 = i15;
                            z16 = z15;
                            i27 = i18;
                            str4 = (String) objX;
                            str5 = i27 + "-" + i25 + StringUtils.SPACE + str4;
                            if (z16) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                u uVar6 = (u) kt2.e.R0.getValue();
                                Object[] objArr5 = {String.valueOf(i26), str3};
                                pVar.f133917f = null;
                                pVar.f133919h = 5;
                                objB2 = v.b(uVar6, objArr5, pVar);
                                if (objB2 != aVar) {
                                    return objB2;
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                u uVar7 = (u) kt2.e.J.getValue();
                                Object[] objArr6 = {String.valueOf(i26), str3, str5};
                                pVar.f133917f = null;
                                pVar.f133919h = 6;
                                objB = v.b(uVar7, objArr6, pVar);
                                if (objB != aVar) {
                                    return objB;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                i16 = pVar.f133916e;
                i15 = pVar.f133915d;
                i14 = pVar.f133914c;
                z15 = pVar.f133913b;
                z14 = pVar.f133912a;
                list = (List) pVar.f133917f;
                o13.r.b(objX);
                str = (String) objX;
                if (list != null) {
                    it = list.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        cVar2 = (lt2.c) next;
                        if (cVar2 != null) {
                            i17 = cVar2.f114879b;
                        } else {
                            i17 = 0;
                        }
                    } while (((lt2.c) next).f114878a != i14);
                    cVar2 = (lt2.c) next;
                    if (cVar2 != null) {
                        i17 = cVar2.f114879b;
                    } else {
                        i17 = 0;
                    }
                } else {
                    i17 = 0;
                }
                int i210 = (int) ((i17 * i15) / 100.0f);
                int i34 = i210 - i16;
                if (i34 >= 0) {
                }
                i19 = i16 + i210;
                if (i17 > 0) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar8 = (u) kt2.e.N0.getValue();
                    pVar.f133917f = str;
                    pVar.f133912a = z15;
                    pVar.f133914c = i15;
                    pVar.f133919h = 4;
                    objA = v.a(uVar8, pVar);
                    if (objA != aVar) {
                        str2 = str;
                        objX = objA;
                        i24 = i15;
                        str3 = str2;
                        i26 = i24;
                        str5 = (String) objX;
                        z16 = z15;
                        if (z16) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            u uVar9 = (u) kt2.e.R0.getValue();
                            Object[] objArr7 = {String.valueOf(i26), str3};
                            pVar.f133917f = null;
                            pVar.f133919h = 5;
                            objB2 = v.b(uVar9, objArr7, pVar);
                            if (objB2 != aVar) {
                                return objB2;
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            u uVar10 = (u) kt2.e.J.getValue();
                            Object[] objArr8 = {String.valueOf(i26), str3, str5};
                            pVar.f133917f = null;
                            pVar.f133919h = 6;
                            objB = v.b(uVar10, objArr8, pVar);
                            if (objB != aVar) {
                                return objB;
                            }
                        }
                    }
                } else if (z14) {
                    u uVarR2 = gg.b.r(kt2.f.f106534a);
                    pVar.f133917f = str;
                    pVar.f133912a = z15;
                    pVar.f133914c = i15;
                    pVar.f133915d = i18;
                    pVar.f133916e = i19;
                    pVar.f133919h = 2;
                    objA3 = v.a(uVarR2, pVar);
                    if (objA3 != aVar) {
                        objX = objA3;
                        i25 = i19;
                        str3 = str;
                        i26 = i15;
                        z16 = z15;
                        i27 = i18;
                        str4 = (String) objX;
                        str5 = i27 + "-" + i25 + StringUtils.SPACE + str4;
                        if (z16) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            u uVar11 = (u) kt2.e.R0.getValue();
                            Object[] objArr9 = {String.valueOf(i26), str3};
                            pVar.f133917f = null;
                            pVar.f133919h = 5;
                            objB2 = v.b(uVar11, objArr9, pVar);
                            if (objB2 != aVar) {
                                return objB2;
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            u uVar12 = (u) kt2.e.J.getValue();
                            Object[] objArr10 = {String.valueOf(i26), str3, str5};
                            pVar.f133917f = null;
                            pVar.f133919h = 6;
                            objB = v.b(uVar12, objArr10, pVar);
                            if (objB != aVar) {
                                return objB;
                            }
                        }
                    }
                } else {
                    u uVarY2 = gg.b.y(kt2.f.f106534a);
                    pVar.f133917f = str;
                    pVar.f133912a = z15;
                    pVar.f133914c = i15;
                    pVar.f133915d = i18;
                    pVar.f133916e = i19;
                    pVar.f133919h = 3;
                    objA2 = v.a(uVarY2, pVar);
                    if (objA2 != aVar) {
                        objX = objA2;
                        i25 = i19;
                        str3 = str;
                        i26 = i15;
                        z16 = z15;
                        i27 = i18;
                        str4 = (String) objX;
                        str5 = i27 + "-" + i25 + StringUtils.SPACE + str4;
                        if (z16) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            u uVar13 = (u) kt2.e.R0.getValue();
                            Object[] objArr11 = {String.valueOf(i26), str3};
                            pVar.f133917f = null;
                            pVar.f133919h = 5;
                            objB2 = v.b(uVar13, objArr11, pVar);
                            if (objB2 != aVar) {
                                return objB2;
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            u uVar14 = (u) kt2.e.J.getValue();
                            Object[] objArr12 = {String.valueOf(i26), str3, str5};
                            pVar.f133917f = null;
                            pVar.f133919h = 6;
                            objB = v.b(uVar14, objArr12, pVar);
                            if (objB != aVar) {
                                return objB;
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                i25 = pVar.f133916e;
                i27 = pVar.f133915d;
                i26 = pVar.f133914c;
                z16 = pVar.f133912a;
                str3 = (String) pVar.f133917f;
                o13.r.b(objX);
                str4 = (String) objX;
                str5 = i27 + "-" + i25 + StringUtils.SPACE + str4;
                if (z16) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar15 = (u) kt2.e.R0.getValue();
                    Object[] objArr13 = {String.valueOf(i26), str3};
                    pVar.f133917f = null;
                    pVar.f133919h = 5;
                    objB2 = v.b(uVar15, objArr13, pVar);
                    if (objB2 != aVar) {
                        return objB2;
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar16 = (u) kt2.e.J.getValue();
                    Object[] objArr14 = {String.valueOf(i26), str3, str5};
                    pVar.f133917f = null;
                    pVar.f133919h = 6;
                    objB = v.b(uVar16, objArr14, pVar);
                    if (objB != aVar) {
                        return objB;
                    }
                }
                return aVar;
            case 3:
                i25 = pVar.f133916e;
                i27 = pVar.f133915d;
                i26 = pVar.f133914c;
                z16 = pVar.f133912a;
                str3 = (String) pVar.f133917f;
                o13.r.b(objX);
                str4 = (String) objX;
                str5 = i27 + "-" + i25 + StringUtils.SPACE + str4;
                if (z16) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar17 = (u) kt2.e.R0.getValue();
                    Object[] objArr15 = {String.valueOf(i26), str3};
                    pVar.f133917f = null;
                    pVar.f133919h = 5;
                    objB2 = v.b(uVar17, objArr15, pVar);
                    if (objB2 != aVar) {
                        return objB2;
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar18 = (u) kt2.e.J.getValue();
                    Object[] objArr16 = {String.valueOf(i26), str3, str5};
                    pVar.f133917f = null;
                    pVar.f133919h = 6;
                    objB = v.b(uVar18, objArr16, pVar);
                    if (objB != aVar) {
                        return objB;
                    }
                }
                return aVar;
            case 4:
                i24 = pVar.f133914c;
                z15 = pVar.f133912a;
                str2 = (String) pVar.f133917f;
                o13.r.b(objX);
                str3 = str2;
                i26 = i24;
                str5 = (String) objX;
                z16 = z15;
                if (z16) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar19 = (u) kt2.e.R0.getValue();
                    Object[] objArr17 = {String.valueOf(i26), str3};
                    pVar.f133917f = null;
                    pVar.f133919h = 5;
                    objB2 = v.b(uVar19, objArr17, pVar);
                    if (objB2 != aVar) {
                        return objB2;
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar110 = (u) kt2.e.J.getValue();
                    Object[] objArr18 = {String.valueOf(i26), str3, str5};
                    pVar.f133917f = null;
                    pVar.f133919h = 6;
                    objB = v.b(uVar110, objArr18, pVar);
                    if (objB != aVar) {
                        return objB;
                    }
                }
                return aVar;
            case 5:
                o13.r.b(objX);
                return objX;
            case 6:
                o13.r.b(objX);
                return objX;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:51:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x0160  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(boolean z14, boolean z15, lt2.d dVar, int i14, v13.c cVar) {
        q qVar;
        Integer num;
        Integer num2;
        String str;
        List<Integer> list;
        String str2;
        Integer num3;
        boolean z16;
        String str3;
        Integer num4;
        String strI;
        String str4;
        String str5;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i15 = qVar.f133927h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                qVar.f133927h = i15 - Integer.MIN_VALUE;
            } else {
                qVar = new q(cVar);
            }
        } else {
            qVar = new q(cVar);
        }
        Object objB = qVar.f133926g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = qVar.f133927h;
        if (i16 == 0) {
            o13.r.b(objB);
            kt2.f.f106534a.getClass();
            kt2.e.f106460a.getClass();
            u uVar = (u) kt2.e.f106486i1.getValue();
            Object[] objArr = {new Integer(i14)};
            qVar.f133922c = dVar;
            qVar.f133920a = z14;
            qVar.f133921b = z15;
            qVar.f133925f = i14;
            qVar.f133927h = 1;
            objB = v.b(uVar, objArr, qVar);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i16 != 1) {
            if (i16 == 2) {
                z14 = qVar.f133920a;
                num2 = qVar.f133924e;
                num = (Integer) qVar.f133923d;
                str = (String) qVar.f133922c;
                o13.r.b(objB);
                str2 = (String) objB;
                num3 = num2;
                z16 = z14;
                str3 = str2;
                num4 = num;
                if (num3 != null) {
                    if (z16) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar2 = (u) kt2.e.I.getValue();
                        Object[] objArr2 = {num4.toString()};
                        qVar.f133922c = str;
                        qVar.f133923d = str3;
                        qVar.f133924e = null;
                        qVar.f133927h = 5;
                        objB = v.b(uVar2, objArr2, qVar);
                        if (objB != aVar) {
                            str4 = str;
                            strI = objB + StringUtils.SPACE + str3;
                            str = str4;
                        }
                    } else {
                        strI = u0.i(num4, ">", StringUtils.SPACE, str3);
                    }
                    return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
                }
                String string = num4.toString();
                String string2 = num3.toString();
                qVar.f133922c = str;
                qVar.f133923d = null;
                qVar.f133924e = null;
                qVar.f133927h = 4;
                objB = og2.k.r(string, string2, str3, qVar, z16);
                if (objB != aVar) {
                    str5 = str;
                    strI = (String) objB;
                    str = str5;
                    return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
                }
                return aVar;
            }
            if (i16 != 3) {
                if (i16 == 4) {
                    str5 = (String) qVar.f133922c;
                    o13.r.b(objB);
                    strI = (String) objB;
                    str = str5;
                    return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
                }
                if (i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = (String) qVar.f133923d;
                str4 = (String) qVar.f133922c;
                o13.r.b(objB);
                strI = objB + StringUtils.SPACE + str3;
                str = str4;
                return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
            }
            z14 = qVar.f133920a;
            num2 = qVar.f133924e;
            num = (Integer) qVar.f133923d;
            str = (String) qVar.f133922c;
            o13.r.b(objB);
            str2 = (String) objB;
            num3 = num2;
            z16 = z14;
            str3 = str2;
            num4 = num;
            if (num3 != null) {
                if (z16) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar3 = (u) kt2.e.I.getValue();
                    Object[] objArr3 = {num4.toString()};
                    qVar.f133922c = str;
                    qVar.f133923d = str3;
                    qVar.f133924e = null;
                    qVar.f133927h = 5;
                    objB = v.b(uVar3, objArr3, qVar);
                    if (objB != aVar) {
                        str4 = str;
                        strI = objB + StringUtils.SPACE + str3;
                        str = str4;
                    }
                } else {
                    strI = u0.i(num4, ">", StringUtils.SPACE, str3);
                }
                return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
            }
            String string3 = num4.toString();
            String string4 = num3.toString();
            qVar.f133922c = str;
            qVar.f133923d = null;
            qVar.f133924e = null;
            qVar.f133927h = 4;
            objB = og2.k.r(string3, string4, str3, qVar, z16);
            if (objB != aVar) {
                str5 = str;
                strI = (String) objB;
                str = str5;
                return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
            }
            return aVar;
        }
        i14 = qVar.f133925f;
        z15 = qVar.f133921b;
        z14 = qVar.f133920a;
        dVar = (lt2.d) qVar.f133922c;
        o13.r.b(objB);
        String str6 = (String) objB;
        if (!z15) {
            Integer num5 = (dVar == null || (list = dVar.f114881b) == null) ? null : (Integer) h0.e0(i14 - 1, list);
            if (num5 != null) {
                Integer num6 = (Integer) h0.e0(i14, dVar.f114881b);
                if (z14) {
                    u uVarR = gg.b.r(kt2.f.f106534a);
                    qVar.f133922c = str6;
                    qVar.f133923d = num5;
                    qVar.f133924e = num6;
                    qVar.f133920a = z14;
                    qVar.f133927h = 2;
                    Object objA = v.a(uVarR, qVar);
                    if (objA != aVar) {
                        num = num5;
                        num2 = num6;
                        objB = objA;
                        str = str6;
                        str2 = (String) objB;
                        num3 = num2;
                        z16 = z14;
                        str3 = str2;
                        num4 = num;
                        if (num3 != null) {
                            if (z16) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                u uVar4 = (u) kt2.e.I.getValue();
                                Object[] objArr4 = {num4.toString()};
                                qVar.f133922c = str;
                                qVar.f133923d = str3;
                                qVar.f133924e = null;
                                qVar.f133927h = 5;
                                objB = v.b(uVar4, objArr4, qVar);
                                if (objB != aVar) {
                                    str4 = str;
                                    strI = objB + StringUtils.SPACE + str3;
                                    str = str4;
                                }
                            } else {
                                strI = u0.i(num4, ">", StringUtils.SPACE, str3);
                            }
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
                        }
                        String string5 = num4.toString();
                        String string6 = num3.toString();
                        qVar.f133922c = str;
                        qVar.f133923d = null;
                        qVar.f133924e = null;
                        qVar.f133927h = 4;
                        objB = og2.k.r(string5, string6, str3, qVar, z16);
                        if (objB != aVar) {
                            str5 = str;
                            strI = (String) objB;
                            str = str5;
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
                        }
                    }
                } else {
                    u uVarY = gg.b.y(kt2.f.f106534a);
                    qVar.f133922c = str6;
                    qVar.f133923d = num5;
                    qVar.f133924e = num6;
                    qVar.f133920a = z14;
                    qVar.f133927h = 3;
                    Object objA2 = v.a(uVarY, qVar);
                    if (objA2 != aVar) {
                        num = num5;
                        num2 = num6;
                        objB = objA2;
                        str = str6;
                        str2 = (String) objB;
                        num3 = num2;
                        z16 = z14;
                        str3 = str2;
                        num4 = num;
                        if (num3 != null) {
                            if (z16) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                u uVar5 = (u) kt2.e.I.getValue();
                                Object[] objArr5 = {num4.toString()};
                                qVar.f133922c = str;
                                qVar.f133923d = str3;
                                qVar.f133924e = null;
                                qVar.f133927h = 5;
                                objB = v.b(uVar5, objArr5, qVar);
                                if (objB != aVar) {
                                    str4 = str;
                                    strI = objB + StringUtils.SPACE + str3;
                                    str = str4;
                                }
                            } else {
                                strI = u0.i(num4, ">", StringUtils.SPACE, str3);
                            }
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
                        }
                        String string7 = num4.toString();
                        String string8 = num3.toString();
                        qVar.f133922c = str;
                        qVar.f133923d = null;
                        qVar.f133924e = null;
                        qVar.f133927h = 4;
                        objB = og2.k.r(string7, string8, str3, qVar, z16);
                        if (objB != aVar) {
                            str5 = str;
                            strI = (String) objB;
                            str = str5;
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", strI, ")");
                        }
                    }
                }
                return aVar;
            }
        }
        return str6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0367  */
    /* JADX WARN: Code duplicated, block: B:104:0x0387  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:157:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:164:0x04da  */
    /* JADX WARN: Code duplicated, block: B:174:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:177:0x050e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0591  */
    /* JADX WARN: Code duplicated, block: B:211:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:214:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:244:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 mt2.d, still in use, count: 2, list:
          (r2v11 mt2.d) from 0x04f7: IGET (r2v11 mt2.d) A[WRAPPED] mt2.d.a int
          (r2v11 mt2.d) from 0x04fd: PHI (r2 I:??) = (r2v8 mt2.d), (r2v11 mt2.d) binds: [B:172:0x04fc, B:242:0x04fd] A[DONT_GENERATE, DONT_INLINE]
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
    public static final java.lang.Object e(boolean r26, boolean r27, mt2.f r28, lt2.d r29, java.util.List r30, nt2.a r31, lt2.b r32, v13.c r33) {
        /*
            Method dump skipped, instruction units count: 2014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot2.n.e(boolean, boolean, mt2.f, lt2.d, java.util.List, nt2.a, lt2.b, v13.c):java.lang.Object");
    }
}
