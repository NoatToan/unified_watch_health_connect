package m92;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import o4.f1;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:145:0x01cb  */
    public static final void a(final h4.r rVar, final String str, final float f14, final long j8, float f15, final i53.c cVar, final Float f16, final String str2, final n92.a aVar, e23.p pVar, final e23.q qVar, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        i53.c cVar2;
        e23.p pVar2;
        int i18;
        p3.o0 o0Var;
        final float f17;
        final e23.p pVar3;
        e23.p pVar4;
        float f18;
        int i19;
        i53.f<o13.p<Float, String>> fVarB;
        n92.o oVar;
        int i24;
        n92.o oVar2;
        cVar.getClass();
        str2.getClass();
        p3.o0 o0VarE = mVar.E(-1634868200);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.i(f14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.l(j8) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= 8192;
        }
        if ((196608 & i14) == 0) {
            cVar2 = cVar;
            i17 |= o0VarE.B(cVar2) ? 131072 : 65536;
        } else {
            cVar2 = cVar;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= o0VarE.B(f16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i16 & 128) != 0) {
            i17 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            i17 |= o0VarE.B(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i17 |= o0VarE.B(str2) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= (i14 & 1073741824) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 536870912 : 268435456;
        }
        int i25 = i16 & 1024;
        if (i25 != 0) {
            i18 = i15 | 6;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            if ((i15 & 6) == 0) {
                i18 = i15 | (o0VarE.r(pVar2) ? 4 : 2);
            } else {
                i18 = i15;
            }
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.r(qVar) ? 32 : 16;
        }
        int i26 = i17;
        if (o0VarE.n(i26 & 1, ((i26 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                g6.f.a aVar2 = g6.f.f75994b;
                float fA = o92.c.a(f14 / 5, o0VarE);
                int i27 = i26 & (-57345);
                pVar4 = i25 != 0 ? null : pVar2;
                f18 = fA;
                i19 = i27;
            } else {
                o0VarE.e();
                i19 = i26 & (-57345);
                pVar4 = pVar2;
                f18 = f15;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (aVar == null || (oVar2 = aVar.f125056a) == null || (fVarB = oVar2.a()) == null) {
                fVarB = (aVar == null || (oVar = aVar.f125057b) == null) ? j53.l.b() : oVar.a();
            }
            boolean zIsEmpty = cVar2.isEmpty();
            boolean zB = ((i19 & 896) == 256) | ((i19 & 7168) == 2048) | ((458752 & i19) == 131072) | ((3670016 & i19) == 1048576) | o0VarE.B(fVarB);
            Object objQ = o0VarE.q();
            if (zB) {
                i24 = i19;
                f21.i0 i0Var = new f21.i0(f14, j8, cVar2, f16, fVarB);
                o0VarE.K(i0Var);
                objQ = i0Var;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i24 = i19;
                    f21.i0 i0Var2 = new f21.i0(f14, j8, cVar2, f16, fVarB);
                    o0VarE.K(i0Var2);
                    objQ = i0Var2;
                } else {
                    i24 = i19;
                }
            }
            int i28 = i24 >> 15;
            int i29 = (i24 & 126) | (i28 & 896) | (i28 & 7168) | (29360128 & (i24 >> 6));
            int i30 = i18 << 24;
            float f19 = f18;
            o0Var = o0VarE;
            e23.p pVar5 = pVar4;
            l.b(rVar, str, null, str2, zIsEmpty, f19, aVar, pVar5, qVar, (e23.l) objQ, o0Var, i29 | (234881024 & i30) | (i30 & 1879048192), 64);
            f17 = f19;
            pVar3 = pVar5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f17 = f15;
            pVar3 = pVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: m92.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    d.a(rVar, str, f14, j8, f17, cVar, f16, str2, aVar, pVar3, qVar, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(final h4.r rVar, final float f14, final long j8, final i53.c cVar, final Float f15, final String str, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        cVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(543994909);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | 48 | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.B(cVar) ? 16384 : 8192);
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.B(f15) ? 131072 : 65536;
        }
        int i16 = i15 | (o0VarE.B(str) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 918552576;
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(new l0((h0.e.a) it.next(), true, false, 4, null));
            }
            o0Var = o0VarE;
            a(rVar, null, f14, j8, 0.0f, i53.a.e(arrayList), f15, str, null, null, null, o0Var, ((i16 << 6) & 234881024) | (i16 & 8190) | (3670016 & (i16 << 3)) | 12582912 | C.ENCODING_PCM_32BIT, 54, 16);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: m92.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.b(rVar, f14, j8, cVar, f15, str, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:157:0x032c  */
    /* JADX WARN: Code duplicated, block: B:160:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:163:0x0429 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0454  */
    /* JADX WARN: Code duplicated, block: B:175:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:178:0x0504 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x050d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0533  */
    /* JADX WARN: Code duplicated, block: B:190:0x0553  */
    /* JADX WARN: Code duplicated, block: B:208:0x061a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x061c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0628 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x062a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0636  */
    /* JADX WARN: Code duplicated, block: B:215:0x063e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0644  */
    /* JADX WARN: Code duplicated, block: B:218:0x0648  */
    /* JADX WARN: Code duplicated, block: B:219:0x064e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0652  */
    /* JADX WARN: Code duplicated, block: B:222:0x0658  */
    /* JADX WARN: Code duplicated, block: B:228:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:235:0x071d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0759  */
    /* JADX WARN: Code duplicated, block: B:262:0x0829  */
    /* JADX WARN: Code duplicated, block: B:264:0x082f  */
    /* JADX WARN: Code duplicated, block: B:293:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0174  */
    /* JADX WARN: Code duplicated, block: B:85:0x0178  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0183  */
    /* JADX WARN: Code duplicated, block: B:90:0x0191  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    public static final Map<Float, Float> c(q4.f fVar, float f14, long j8, List<l0> list, Float f15, Float f16, Float f17) throws Throwable {
        float fFloatValue;
        float fMax;
        float fFloatValue2;
        float fMax2;
        Iterator it;
        h0 h0Var;
        float fMin;
        float f18;
        float fFloatValue3;
        h0 h0Var2;
        float fMin2;
        float f19;
        Throwable th3;
        Iterator it3;
        LinkedHashMap linkedHashMap;
        float f22;
        int i14;
        float fIntBitsToFloat;
        float f24;
        float f25;
        float f26;
        long j14;
        long j15;
        float f27;
        float f28;
        float f29;
        float f34;
        float f35;
        float f36;
        float f37;
        float f38;
        long j16;
        boolean z14;
        long j17;
        LinkedHashMap linkedHashMap2;
        h0.e.a aVar;
        float f39;
        int i15;
        long j18;
        float f44;
        float f45;
        h0.e.a aVar2;
        LinkedHashMap linkedHashMap3;
        long j19;
        long j24;
        LinkedHashMap linkedHashMap4;
        float f46;
        fVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList.add(((l0) it4.next()).f117398a);
        }
        Throwable th4 = null;
        int i16 = 1;
        if (f15 != null) {
            fFloatValue = f15.floatValue() - 1;
        } else {
            Iterator it5 = arrayList.iterator();
            if (!it5.hasNext()) {
                c22.t.g();
                return null;
            }
            float fC = i0.c((h0) it5.next());
            while (it5.hasNext()) {
                fC = Math.max(fC, i0.c((h0) it5.next()));
            }
            fFloatValue = fC;
        }
        if (f17 != null) {
            fFloatValue2 = f17.floatValue();
        } else {
            Iterator it6 = arrayList.iterator();
            if (!it6.hasNext()) {
                c22.t.g();
                return null;
            }
            h0 h0Var3 = (h0) it6.next();
            if (h0Var3 instanceof h0.e) {
                fMax = i0.e((h0.e) h0Var3);
            } else if (h0Var3 instanceof h0.d) {
                fMax = i0.g((h0.d) h0Var3);
            } else if (h0Var3 instanceof h0.b) {
                h0.b bVar = (h0.b) h0Var3;
                float f47 = bVar.f117335a.f117347b;
                fMax = bVar.f117337c.f117347b;
                if (f47 > fMax) {
                    fMax = f47;
                }
            } else if (h0Var3 instanceof h0.a) {
                fMax = ((h0.a) h0Var3).f117334d;
            } else {
                if (!(h0Var3 instanceof h0.c)) {
                    u0.r();
                    return null;
                }
                h0.c cVar = (h0.c) h0Var3;
                fMax = Math.max(i0.e(cVar.f117339a), i0.e(cVar.f117340b));
            }
            while (it6.hasNext()) {
                h0 h0Var4 = (h0) it6.next();
                if (h0Var4 instanceof h0.e) {
                    fMax2 = i0.e((h0.e) h0Var4);
                } else if (h0Var4 instanceof h0.d) {
                    fMax2 = i0.g((h0.d) h0Var4);
                } else if (h0Var4 instanceof h0.b) {
                    h0.b bVar2 = (h0.b) h0Var4;
                    float f48 = bVar2.f117335a.f117347b;
                    fMax2 = bVar2.f117337c.f117347b;
                    if (f48 > fMax2) {
                        fMax2 = f48;
                    }
                } else if (h0Var4 instanceof h0.a) {
                    fMax2 = ((h0.a) h0Var4).f117334d;
                } else {
                    if (!(h0Var4 instanceof h0.c)) {
                        u0.r();
                        return null;
                    }
                    h0.c cVar2 = (h0.c) h0Var4;
                    fMax2 = Math.max(i0.e(cVar2.f117339a), i0.e(cVar2.f117340b));
                }
                fMax = Math.max(fMax, fMax2);
            }
            fFloatValue2 = fMax;
        }
        float f49 = 0.0f;
        if (list.isEmpty()) {
            it = arrayList.iterator();
            if (it.hasNext()) {
                c22.t.g();
                return null;
            }
            h0Var = (h0) it.next();
            if (h0Var instanceof h0.e) {
                fMin = i0.e((h0.e) h0Var);
            } else if (h0Var instanceof h0.d) {
                fMin = i0.g((h0.d) h0Var);
            } else if (h0Var instanceof h0.b) {
                h0.b bVar3 = (h0.b) h0Var;
                f18 = bVar3.f117335a.f117347b;
                fMin = bVar3.f117337c.f117347b;
                if (f18 > fMin) {
                    fMin = f18;
                }
            } else if (h0Var instanceof h0.a) {
                fMin = ((h0.a) h0Var).f117334d;
            } else {
                if (h0Var instanceof h0.c) {
                    u0.r();
                    return null;
                }
                h0.c cVar3 = (h0.c) h0Var;
                fMin = Math.min(i0.e(cVar3.f117339a), i0.e(cVar3.f117340b));
            }
            while (it.hasNext()) {
                h0Var2 = (h0) it.next();
                if (h0Var2 instanceof h0.e) {
                    fMin2 = i0.e((h0.e) h0Var2);
                } else if (h0Var2 instanceof h0.d) {
                    fMin2 = i0.g((h0.d) h0Var2);
                } else if (h0Var2 instanceof h0.b) {
                    h0.b bVar4 = (h0.b) h0Var2;
                    f19 = bVar4.f117335a.f117347b;
                    fMin2 = bVar4.f117337c.f117347b;
                    if (f19 > fMin2) {
                        fMin2 = f19;
                    }
                } else if (h0Var2 instanceof h0.a) {
                    fMin2 = ((h0.a) h0Var2).f117334d;
                } else {
                    if (h0Var2 instanceof h0.c) {
                        u0.r();
                        return null;
                    }
                    h0.c cVar4 = (h0.c) h0Var2;
                    fMin2 = Math.min(i0.e(cVar4.f117339a), i0.e(cVar4.f117340b));
                }
                fMin = Math.min(fMin, fMin2);
            }
            fFloatValue3 = fMin;
        } else {
            Iterator<T> it7 = list.iterator();
            while (true) {
                if (it7.hasNext()) {
                    l0 l0Var = (l0) it7.next();
                    if (!l0Var.f117399b || !l0Var.f117400c) {
                        fFloatValue3 = f16 != null ? f16.floatValue() : 0.0f;
                    }
                } else {
                    it = arrayList.iterator();
                    if (it.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    h0Var = (h0) it.next();
                    if (h0Var instanceof h0.e) {
                        fMin = i0.e((h0.e) h0Var);
                    } else if (h0Var instanceof h0.d) {
                        fMin = i0.g((h0.d) h0Var);
                    } else if (h0Var instanceof h0.b) {
                        h0.b bVar5 = (h0.b) h0Var;
                        f18 = bVar5.f117335a.f117347b;
                        fMin = bVar5.f117337c.f117347b;
                        if (f18 > fMin) {
                            fMin = f18;
                        }
                    } else if (h0Var instanceof h0.a) {
                        fMin = ((h0.a) h0Var).f117334d;
                    } else {
                        if (h0Var instanceof h0.c) {
                            u0.r();
                            return null;
                        }
                        h0.c cVar5 = (h0.c) h0Var;
                        fMin = Math.min(i0.e(cVar5.f117339a), i0.e(cVar5.f117340b));
                    }
                    while (it.hasNext()) {
                        h0Var2 = (h0) it.next();
                        if (h0Var2 instanceof h0.e) {
                            fMin2 = i0.e((h0.e) h0Var2);
                        } else if (h0Var2 instanceof h0.d) {
                            fMin2 = i0.g((h0.d) h0Var2);
                        } else if (h0Var2 instanceof h0.b) {
                            h0.b bVar6 = (h0.b) h0Var2;
                            f19 = bVar6.f117335a.f117347b;
                            fMin2 = bVar6.f117337c.f117347b;
                            if (f19 > fMin2) {
                                fMin2 = f19;
                            }
                        } else if (h0Var2 instanceof h0.a) {
                            fMin2 = ((h0.a) h0Var2).f117334d;
                        } else {
                            if (h0Var2 instanceof h0.c) {
                                u0.r();
                                return null;
                            }
                            h0.c cVar6 = (h0.c) h0Var2;
                            fMin2 = Math.min(i0.e(cVar6.f117339a), i0.e(cVar6.f117340b));
                        }
                        fMin = Math.min(fMin, fMin2);
                    }
                    fFloatValue3 = fMin;
                }
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        if (!list.isEmpty()) {
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                if (!(((l0) it8.next()).f117398a instanceof h0.a)) {
                    Iterator it9 = list.iterator();
                    int i17 = 0;
                    while (it9.hasNext()) {
                        Object next = it9.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            Throwable th5 = th4;
                            p13.x.q();
                            throw th5;
                        }
                        l0 l0Var2 = (l0) next;
                        h0 h0Var5 = l0Var2.f117398a;
                        boolean z15 = l0Var2.f117400c;
                        boolean z16 = l0Var2.f117399b;
                        if (h0Var5 instanceof h0.b) {
                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                            h0 h0Var6 = l0Var2.f117398a;
                            h0Var6.getClass();
                            h0.b bVar7 = (h0.b) h0Var6;
                            float fH = i0.h(i0.c(bVar7), f49, fFloatValue, f49, Float.intBitsToFloat((int) (fVar.b() >> 32)));
                            h0.e.a aVar3 = bVar7.f117335a;
                            th3 = th4;
                            it3 = it9;
                            float fH2 = i0.h(aVar3.f117347b, fFloatValue3, fFloatValue2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), f49);
                            h0.e.a aVar4 = bVar7.f117337c;
                            float fH3 = i0.h(aVar4.f117347b, fFloatValue3, fFloatValue2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), f49);
                            float f50 = f49;
                            float f54 = fFloatValue3;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - fH2;
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - fH3;
                            if (z16 && z15) {
                                float f55 = f14 / 2;
                                f37 = fH2 - f55;
                                f38 = f37 > f50 ? fIntBitsToFloat2 + f14 : f50;
                                float f56 = fH3 - f55;
                                if (f56 > f50) {
                                    f35 = f56;
                                    f36 = fIntBitsToFloat3 + f14;
                                } else {
                                    f36 = f50;
                                    f35 = f56;
                                    f34 = f38;
                                }
                                f29 = f37;
                                j16 = bVar7.f117336b;
                                z14 = z15;
                                j17 = bVar7.f117338d;
                                if (fIntBitsToFloat2 < f14) {
                                    linkedHashMap2 = linkedHashMap6;
                                    aVar = aVar3;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fH - f14)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                                    n4.c.a aVar5 = n4.c.f123541b;
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f34)) & 4294967295L);
                                    n4.g.a aVar6 = n4.g.f123559b;
                                    f39 = f54;
                                    i15 = 2;
                                    j18 = j16;
                                    linkedHashMap = linkedHashMap5;
                                    q4.f.A0(fVar, j18, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, null, null, 120);
                                } else {
                                    linkedHashMap2 = linkedHashMap6;
                                    aVar = aVar3;
                                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fH - f14)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                                    n4.c.a aVar7 = n4.c.f123541b;
                                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f34)) & 4294967295L);
                                    n4.g.a aVar8 = n4.g.f123559b;
                                    f39 = f54;
                                    i15 = 2;
                                    j18 = j16;
                                    linkedHashMap = linkedHashMap5;
                                    q4.f.A0(fVar, j18, jFloatToRawIntBits3, jFloatToRawIntBits4, 0.0f, null, null, 120);
                                }
                                float f57 = i15;
                                f44 = f14 / f57;
                                f45 = fH - f44;
                                float f58 = 5.0f / f57;
                                aVar2 = aVar;
                                linkedHashMap3 = linkedHashMap2;
                                linkedHashMap3.put(Float.valueOf(f45 - f58), Float.valueOf(aVar2.f117346a));
                                if (aVar2.f117347b > f50) {
                                    q4.f.o0(fVar, j18, f44, (((long) Float.floatToRawIntBits(f45)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L), null, 0, 120);
                                }
                                j19 = j18;
                                if (fIntBitsToFloat3 < f14) {
                                    j24 = j17;
                                    linkedHashMap4 = linkedHashMap3;
                                    q4.f.A0(fVar, j24, (((long) Float.floatToRawIntBits(fH + 5.0f)) << 32) | (((long) Float.floatToRawIntBits(f35)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f36)) & 4294967295L), 0.0f, null, null, 120);
                                } else {
                                    j24 = j17;
                                    linkedHashMap4 = linkedHashMap3;
                                    q4.f.A0(fVar, j24, (((long) Float.floatToRawIntBits(fH + 5.0f)) << 32) | (((long) Float.floatToRawIntBits(f35)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f36)) & 4294967295L), 0.0f, null, null, 120);
                                }
                                float f59 = fH + f44;
                                linkedHashMap4.put(Float.valueOf(f59 + f58), Float.valueOf(aVar4.f117346a));
                                if (aVar4.f117347b > f50) {
                                    f46 = f44;
                                } else {
                                    f46 = f44;
                                }
                                if (z14 != 0) {
                                    q4.f.o0(fVar, j19, f46, (((long) Float.floatToRawIntBits(f50)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH)) << 32), null, 0, 120);
                                }
                                if (z14 != 0) {
                                    q4.f.o0(fVar, j24, f46, (((long) Float.floatToRawIntBits(f50)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH - f14)) << 32), null, 0, 120);
                                }
                                linkedHashMap.putAll(linkedHashMap4);
                                f27 = f50;
                                f22 = f39;
                            } else {
                                if (z16) {
                                    float f64 = f14 / 2;
                                    f29 = fH2 + f64;
                                    f34 = fIntBitsToFloat2 - f64;
                                    f35 = fH3 + f64;
                                    z15 = z15;
                                    f36 = fIntBitsToFloat3 - f64;
                                } else if (z15) {
                                    float f65 = f14 / 2;
                                    f37 = fH2 - f65;
                                    f38 = fIntBitsToFloat2 - f65;
                                    f36 = fIntBitsToFloat3 - f65;
                                    f35 = fH3 - f65;
                                } else {
                                    z15 = z15;
                                    f29 = fH2;
                                    f34 = fIntBitsToFloat2;
                                    f35 = fH3;
                                    f36 = fIntBitsToFloat3;
                                }
                                j16 = bVar7.f117336b;
                                z14 = z15;
                                j17 = bVar7.f117338d;
                                if (fIntBitsToFloat2 < f14 || !(z16 ^ z14)) {
                                    linkedHashMap2 = linkedHashMap6;
                                    aVar = aVar3;
                                    long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fH - f14)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                                    n4.c.a aVar9 = n4.c.f123541b;
                                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f34)) & 4294967295L);
                                    n4.g.a aVar10 = n4.g.f123559b;
                                    f39 = f54;
                                    i15 = 2;
                                    j18 = j16;
                                    linkedHashMap = linkedHashMap5;
                                    q4.f.A0(fVar, j18, jFloatToRawIntBits5, jFloatToRawIntBits6, 0.0f, null, null, 120);
                                } else {
                                    o4.j jVarA = o4.m.a();
                                    long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fH - f14)) << 32) | (((long) Float.floatToRawIntBits(fH2)) & 4294967295L);
                                    n4.c.a aVar11 = n4.c.f123541b;
                                    long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                                    n4.g.a aVar12 = n4.g.f123559b;
                                    n4.d dVarG = g8.i.g(jFloatToRawIntBits7, jFloatToRawIntBits8);
                                    float f66 = f14 / 2;
                                    long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(f66)) << 32) | (((long) Float.floatToRawIntBits(f66)) & 4294967295L);
                                    n4.a.C2318a c2318a = n4.a.f123535b;
                                    jVarA.k(n4.f.b(dVarG, jFloatToRawIntBits9, (((long) Float.floatToRawIntBits(f66)) << 32) | (((long) Float.floatToRawIntBits(f66)) & 4294967295L), 0L, 0L, 24), f1.b.CounterClockwise);
                                    aVar = aVar3;
                                    linkedHashMap2 = linkedHashMap6;
                                    q4.f.L(fVar, jVarA, j16, 0.0f, null, 60);
                                    j18 = j16;
                                    f39 = f54;
                                    i15 = 2;
                                    linkedHashMap = linkedHashMap5;
                                }
                                float f510 = i15;
                                f44 = f14 / f510;
                                f45 = fH - f44;
                                float f511 = 5.0f / f510;
                                aVar2 = aVar;
                                linkedHashMap3 = linkedHashMap2;
                                linkedHashMap3.put(Float.valueOf(f45 - f511), Float.valueOf(aVar2.f117346a));
                                if (aVar2.f117347b > f50 && z16 && (f34 >= f44 || z14)) {
                                    q4.f.o0(fVar, j18, f44, (((long) Float.floatToRawIntBits(f45)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L), null, 0, 120);
                                }
                                j19 = j18;
                                if (fIntBitsToFloat3 < f14 || !(r26 ^ z14)) {
                                    j24 = j17;
                                    linkedHashMap4 = linkedHashMap3;
                                    q4.f.A0(fVar, j24, (((long) Float.floatToRawIntBits(fH + 5.0f)) << 32) | (((long) Float.floatToRawIntBits(f35)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f36)) & 4294967295L), 0.0f, null, null, 120);
                                } else {
                                    o4.j jVarA2 = o4.m.a();
                                    n4.d dVarG2 = g8.i.g((((long) Float.floatToRawIntBits(fH + 5.0f)) << 32) | (((long) Float.floatToRawIntBits(fH3)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L));
                                    long jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(f44)) << 32) | (((long) Float.floatToRawIntBits(f44)) & 4294967295L);
                                    n4.a.C2318a c2318a2 = n4.a.f123535b;
                                    jVarA2.k(n4.f.b(dVarG2, jFloatToRawIntBits10, (((long) Float.floatToRawIntBits(f44)) << 32) | (((long) Float.floatToRawIntBits(f44)) & 4294967295L), 0L, 0L, 24), f1.b.CounterClockwise);
                                    q4.f.L(fVar, jVarA2, j17, 0.0f, null, 60);
                                    j24 = j17;
                                    linkedHashMap4 = linkedHashMap3;
                                }
                                float f512 = fH + f44;
                                linkedHashMap4.put(Float.valueOf(f512 + f511), Float.valueOf(aVar4.f117346a));
                                if (aVar4.f117347b > f50 || r26 == 0 || (f36 < f44 && z14 == 0)) {
                                    f46 = f44;
                                } else {
                                    long jFloatToRawIntBits11 = (((long) Float.floatToRawIntBits(f512 + 5.0f)) << 32) | (((long) Float.floatToRawIntBits(f35)) & 4294967295L);
                                    f46 = f44;
                                    q4.f.o0(fVar, j24, f46, jFloatToRawIntBits11, null, 0, 120);
                                }
                                if (z14 != 0 && f29 > f50) {
                                    q4.f.o0(fVar, j19, f46, (((long) Float.floatToRawIntBits(f50)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH)) << 32), null, 0, 120);
                                }
                                if (z14 != 0 && f35 > f50) {
                                    q4.f.o0(fVar, j24, f46, (((long) Float.floatToRawIntBits(f50)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH - f14)) << 32), null, 0, 120);
                                }
                                linkedHashMap.putAll(linkedHashMap4);
                                f27 = f50;
                                f22 = f39;
                            }
                            f34 = f38;
                            f29 = f37;
                            j16 = bVar7.f117336b;
                            z14 = z15;
                            j17 = bVar7.f117338d;
                            if (fIntBitsToFloat2 < f14) {
                                linkedHashMap2 = linkedHashMap6;
                                aVar = aVar3;
                                long jFloatToRawIntBits12 = (((long) Float.floatToRawIntBits(fH - f14)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                                n4.c.a aVar13 = n4.c.f123541b;
                                long jFloatToRawIntBits13 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f34)) & 4294967295L);
                                n4.g.a aVar14 = n4.g.f123559b;
                                f39 = f54;
                                i15 = 2;
                                j18 = j16;
                                linkedHashMap = linkedHashMap5;
                                q4.f.A0(fVar, j18, jFloatToRawIntBits12, jFloatToRawIntBits13, 0.0f, null, null, 120);
                            } else {
                                linkedHashMap2 = linkedHashMap6;
                                aVar = aVar3;
                                long jFloatToRawIntBits14 = (((long) Float.floatToRawIntBits(fH - f14)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L);
                                n4.c.a aVar15 = n4.c.f123541b;
                                long jFloatToRawIntBits15 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f34)) & 4294967295L);
                                n4.g.a aVar16 = n4.g.f123559b;
                                f39 = f54;
                                i15 = 2;
                                j18 = j16;
                                linkedHashMap = linkedHashMap5;
                                q4.f.A0(fVar, j18, jFloatToRawIntBits14, jFloatToRawIntBits15, 0.0f, null, null, 120);
                            }
                            float f513 = i15;
                            f44 = f14 / f513;
                            f45 = fH - f44;
                            float f514 = 5.0f / f513;
                            aVar2 = aVar;
                            linkedHashMap3 = linkedHashMap2;
                            linkedHashMap3.put(Float.valueOf(f45 - f514), Float.valueOf(aVar2.f117346a));
                            if (aVar2.f117347b > f50) {
                                q4.f.o0(fVar, j18, f44, (((long) Float.floatToRawIntBits(f45)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L), null, 0, 120);
                            }
                            j19 = j18;
                            if (fIntBitsToFloat3 < f14) {
                                j24 = j17;
                                linkedHashMap4 = linkedHashMap3;
                                q4.f.A0(fVar, j24, (((long) Float.floatToRawIntBits(fH + 5.0f)) << 32) | (((long) Float.floatToRawIntBits(f35)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f36)) & 4294967295L), 0.0f, null, null, 120);
                            } else {
                                j24 = j17;
                                linkedHashMap4 = linkedHashMap3;
                                q4.f.A0(fVar, j24, (((long) Float.floatToRawIntBits(fH + 5.0f)) << 32) | (((long) Float.floatToRawIntBits(f35)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f36)) & 4294967295L), 0.0f, null, null, 120);
                            }
                            float f515 = fH + f44;
                            linkedHashMap4.put(Float.valueOf(f515 + f514), Float.valueOf(aVar4.f117346a));
                            if (aVar4.f117347b > f50) {
                                f46 = f44;
                            } else {
                                f46 = f44;
                            }
                            if (z14 != 0) {
                                q4.f.o0(fVar, j19, f46, (((long) Float.floatToRawIntBits(f50)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH)) << 32), null, 0, 120);
                            }
                            if (z14 != 0) {
                                q4.f.o0(fVar, j24, f46, (((long) Float.floatToRawIntBits(f50)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH - f14)) << 32), null, 0, 120);
                            }
                            linkedHashMap.putAll(linkedHashMap4);
                            f27 = f50;
                            f22 = f39;
                        } else {
                            float f67 = f49;
                            th3 = th4;
                            it3 = it9;
                            linkedHashMap = linkedHashMap5;
                            float fH4 = i0.h(i0.c(h0Var5), f67, fFloatValue, f67, Float.intBitsToFloat((int) (fVar.b() >> 32)));
                            linkedHashMap.put(Float.valueOf(fH4), Float.valueOf(i0.c(h0Var5)));
                            f22 = fFloatValue3;
                            float fH5 = i0.h(i0.f(h0Var5), f22, fFloatValue2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), f67);
                            if (h0Var5 instanceof h0.e) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - fH5;
                                i14 = 2;
                            } else {
                                if (h0Var5 instanceof h0.d) {
                                    float fH6 = i0.h(i0.g((h0.d) h0Var5), 0.0f, fFloatValue2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), 0.0f);
                                    i14 = 2;
                                    float f68 = (f14 / 2) + fH6;
                                    fIntBitsToFloat = fH6 - fH5;
                                    f24 = f68;
                                } else {
                                    i14 = 2;
                                    fIntBitsToFloat = 0.0f;
                                }
                                if (!z16 && z15) {
                                    float f69 = fH5 - (f14 / i14);
                                    if (f69 > f24) {
                                        f25 = f69;
                                        f26 = fIntBitsToFloat + f14;
                                    } else {
                                        f25 = f69;
                                        f26 = 0.0f;
                                    }
                                } else if (z16) {
                                    float f74 = f14 / i14;
                                    f26 = fIntBitsToFloat - f74;
                                    f25 = fH5 + f74;
                                } else if (z15) {
                                    float f75 = f14 / i14;
                                    f25 = fH5 - f75;
                                    f26 = fIntBitsToFloat - f75;
                                } else {
                                    f25 = fH5;
                                    f26 = fIntBitsToFloat;
                                }
                                if (h0Var5 instanceof h0.e.c) {
                                    j14 = ((h0.e.c) h0Var5).f117351b;
                                } else if (h0Var5 instanceof h0.d.a) {
                                    j14 = ((h0.d.a) h0Var5).f117342b;
                                } else if (h0Var5 instanceof h0.e.b) {
                                    j14 = ((h0.e.b) h0Var5).f117349b;
                                } else {
                                    j14 = j8;
                                }
                                if (fIntBitsToFloat < f14 || !(z16 ^ z15)) {
                                    j15 = j14;
                                    long jFloatToRawIntBits16 = (((long) Float.floatToRawIntBits(fH4 - (f14 / 2))) << 32) | (((long) Float.floatToRawIntBits(f25)) & 4294967295L);
                                    n4.c.a aVar17 = n4.c.f123541b;
                                    long jFloatToRawIntBits17 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f26)) & 4294967295L);
                                    n4.g.a aVar18 = n4.g.f123559b;
                                    q4.f.A0(fVar, j15, jFloatToRawIntBits16, jFloatToRawIntBits17, 0.0f, null, null, 120);
                                } else {
                                    o4.j jVarA3 = o4.m.a();
                                    float f76 = f14 / 2;
                                    long jFloatToRawIntBits18 = (((long) Float.floatToRawIntBits(fH4 - f76)) << 32) | (((long) Float.floatToRawIntBits(fH5)) & 4294967295L);
                                    n4.c.a aVar19 = n4.c.f123541b;
                                    long j25 = j14;
                                    long jFloatToRawIntBits19 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32);
                                    n4.g.a aVar20 = n4.g.f123559b;
                                    n4.d dVarG3 = g8.i.g(jFloatToRawIntBits18, jFloatToRawIntBits19);
                                    long jFloatToRawIntBits20 = (((long) Float.floatToRawIntBits(f76)) << 32) | (((long) Float.floatToRawIntBits(f76)) & 4294967295L);
                                    n4.a.C2318a c2318a3 = n4.a.f123535b;
                                    jVarA3.k(n4.f.b(dVarG3, jFloatToRawIntBits20, (((long) Float.floatToRawIntBits(f76)) << 32) | (((long) Float.floatToRawIntBits(f76)) & 4294967295L), 0L, 0L, 24), f1.b.CounterClockwise);
                                    q4.f.L(fVar, jVarA3, j25, 0.0f, null, 60);
                                    j15 = j25;
                                }
                                f27 = 0.0f;
                                if (i0.f(h0Var5) > 0.0f && z16) {
                                    f28 = f14 / 2;
                                    if (f26 < f28 || z15) {
                                        q4.f.o0(fVar, j15, f28, (((long) Float.floatToRawIntBits(fH4)) << 32) | (((long) Float.floatToRawIntBits(f25)) & 4294967295L), null, 0, 120);
                                    }
                                }
                                if (!z15 && f25 > f24) {
                                    q4.f.o0(fVar, j15, f14 / 2, (((long) Float.floatToRawIntBits(fH4)) << 32) | (((long) Float.floatToRawIntBits(f24)) & 4294967295L), null, 0, 120);
                                }
                            }
                            f24 = 0.0f;
                            if (!z16) {
                                if (z16) {
                                    float f77 = f14 / i14;
                                    f26 = fIntBitsToFloat - f77;
                                    f25 = fH5 + f77;
                                } else if (z15) {
                                    float f78 = f14 / i14;
                                    f25 = fH5 - f78;
                                    f26 = fIntBitsToFloat - f78;
                                } else {
                                    f25 = fH5;
                                    f26 = fIntBitsToFloat;
                                }
                            } else if (z16) {
                                float f79 = f14 / i14;
                                f26 = fIntBitsToFloat - f79;
                                f25 = fH5 + f79;
                            } else if (z15) {
                                float f710 = f14 / i14;
                                f25 = fH5 - f710;
                                f26 = fIntBitsToFloat - f710;
                            } else {
                                f25 = fH5;
                                f26 = fIntBitsToFloat;
                            }
                            if (h0Var5 instanceof h0.e.c) {
                                j14 = ((h0.e.c) h0Var5).f117351b;
                            } else if (h0Var5 instanceof h0.d.a) {
                                j14 = ((h0.d.a) h0Var5).f117342b;
                            } else if (h0Var5 instanceof h0.e.b) {
                                j14 = ((h0.e.b) h0Var5).f117349b;
                            } else {
                                j14 = j8;
                            }
                            if (fIntBitsToFloat < f14) {
                                j15 = j14;
                                long jFloatToRawIntBits110 = (((long) Float.floatToRawIntBits(fH4 - (f14 / 2))) << 32) | (((long) Float.floatToRawIntBits(f25)) & 4294967295L);
                                n4.c.a aVar110 = n4.c.f123541b;
                                long jFloatToRawIntBits111 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f26)) & 4294967295L);
                                n4.g.a aVar111 = n4.g.f123559b;
                                q4.f.A0(fVar, j15, jFloatToRawIntBits110, jFloatToRawIntBits111, 0.0f, null, null, 120);
                            } else {
                                j15 = j14;
                                long jFloatToRawIntBits112 = (((long) Float.floatToRawIntBits(fH4 - (f14 / 2))) << 32) | (((long) Float.floatToRawIntBits(f25)) & 4294967295L);
                                n4.c.a aVar112 = n4.c.f123541b;
                                long jFloatToRawIntBits113 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f26)) & 4294967295L);
                                n4.g.a aVar113 = n4.g.f123559b;
                                q4.f.A0(fVar, j15, jFloatToRawIntBits112, jFloatToRawIntBits113, 0.0f, null, null, 120);
                            }
                            f27 = 0.0f;
                            if (i0.f(h0Var5) > 0.0f) {
                                f28 = f14 / 2;
                                if (f26 < f28) {
                                    q4.f.o0(fVar, j15, f28, (((long) Float.floatToRawIntBits(fH4)) << 32) | (((long) Float.floatToRawIntBits(f25)) & 4294967295L), null, 0, 120);
                                } else {
                                    q4.f.o0(fVar, j15, f28, (((long) Float.floatToRawIntBits(fH4)) << 32) | (((long) Float.floatToRawIntBits(f25)) & 4294967295L), null, 0, 120);
                                }
                            }
                            if (!z15) {
                            }
                        }
                        f49 = f27;
                        fFloatValue3 = f22;
                        linkedHashMap5 = linkedHashMap;
                        i17 = i18;
                        th4 = th3;
                        it9 = it3;
                    }
                    return linkedHashMap5;
                }
                fFloatValue3 = fFloatValue3;
                th4 = th4;
                i16 = i16;
            }
        }
        float f84 = fFloatValue3;
        int i19 = i16;
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        g6.f.a aVar21 = g6.f.f75994b;
        float fS0 = fVar.s0(2);
        float fS1 = fVar.s0(8);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((l0) obj).f117398a instanceof h0.a) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        for (Object obj2 : arrayList2) {
            h0 h0Var7 = ((l0) obj2).f117398a;
            h0Var7.getClass();
            Integer numValueOf = Integer.valueOf(((h0.a) h0Var7).f117331a);
            Object arrayList3 = linkedHashMap8.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap8.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        int size2 = linkedHashMap8.size();
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fVar.b() >> 32));
        float f85 = (size - size2) * fS0;
        float f86 = size2 - i19;
        float f87 = (fIntBitsToFloat4 - f85) - (fS1 * f86);
        float f88 = size;
        float fMin3 = Math.min(f87 / f88, f14);
        linkedHashMap8.forEach(new a73.l(new c(new p005kotlin.jvm.internal.o0(), (fIntBitsToFloat4 - ((f88 * fMin3) + f85)) / f86, fS0, linkedHashMap7, fMin3, f84, fFloatValue2, fVar, j8), i19));
        return linkedHashMap7;
    }
}
