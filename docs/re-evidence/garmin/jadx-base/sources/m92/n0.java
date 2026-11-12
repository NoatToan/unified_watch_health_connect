package m92;

import android.graphics.Path;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import lc.u0;
import o4.j1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 {
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    public static final void a(h4.r rVar, m0 m0Var, Float f14, Float f15, Float f16, e0 e0Var, boolean z14, String str, p3.m mVar, int i14) {
        str.getClass();
        p3.o0 o0VarE = mVar.E(565517411);
        int i15 = i14 | (o0VarE.B(m0Var) ? 32 : 16) | 27648 | (o0VarE.B(f16) ? 1048576 : 524288) | C.ENCODING_PCM_32BIT;
        int i16 = (o0VarE.B(str) ? 4 : 2) | 28080;
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && (i16 & 9363) == 9362) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            boolean zIsEmpty = m0Var.f117409a.isEmpty();
            boolean z15 = ((i15 & 112) == 32) | ((i15 & 3670016) == 1048576);
            Object objQ = o0VarE.q();
            if (z15) {
                ds.e eVar = new ds.e(m0Var, f14, f15, f16, e0Var, z14);
                o0VarE.K(eVar);
                objQ = eVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    ds.e eVar2 = new ds.e(m0Var, f14, f15, f16, e0Var, z14);
                    o0VarE.K(eVar2);
                    objQ = eVar2;
                }
            }
            l.b(rVar, null, null, str, zIsEmpty, 0.0f, null, null, null, (e23.l) objQ, o0VarE, ((i16 << 9) & 7168) | 918553014, 96);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(rVar, m0Var, f14, f15, f16, e0Var, z14, str, i14, 9);
        }
    }

    public static final i53.g<Float, Float> b(q4.f fVar, m0 m0Var, float f14, float f15, float f16, float f17, e0 e0Var) throws Throwable {
        o4.d0 d0Var;
        h0 aVar;
        i53.c<h0> cVar = m0Var.f117409a;
        g6.f fVar2 = m0Var.f117412d;
        m mVar = m0Var.f117411c;
        if (cVar.isEmpty()) {
            return i53.a.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(p13.y.r(cVar, 10));
        Iterator<h0> it = cVar.iterator();
        while (true) {
            Iterator<h0> it3 = it;
            if (!it.hasNext()) {
                break;
            }
            h0 next = it3.next();
            g6.f fVar3 = fVar2;
            m mVar2 = mVar;
            float fH = i0.h(i0.c(next), f14, f15, 0.0f, Float.intBitsToFloat((int) (fVar.b() >> 32)));
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            float fH2 = i0.h(i0.f(next), f16, f17, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), 0.0f);
            linkedHashMap2.put(Float.valueOf(fH), Float.valueOf(i0.c(next)));
            arrayList.add(new h0.e.a(fH, fH2));
            arrayList3.add(new h0.e.a(i0.c(next), i0.f(next)));
            if (next instanceof h0.d) {
                h0.d dVar = (h0.d) next;
                float fH3 = i0.h(i0.g(dVar), f16, f17, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), 0.0f);
                arrayList2.add(new h0.e.a(fH, fH3));
                arrayList4.add(new h0.e.a(i0.a(dVar), i0.g(dVar)));
                aVar = new h0.d.b(fH, fH2, fH3);
            } else {
                aVar = new h0.e.a(fH, fH2);
            }
            arrayList5.add(aVar);
            it = it3;
            linkedHashMap = linkedHashMap2;
            fVar2 = fVar3;
            mVar = mVar2;
        }
        g6.f fVar4 = fVar2;
        m mVar3 = mVar;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        o4.j jVarA = o4.m.a();
        o4.j jVarA2 = o4.m.a();
        if (!arrayList3.isEmpty() && !arrayList.isEmpty()) {
            jVarA = c0.d(arrayList, e0Var);
        }
        if (!arrayList4.isEmpty() && !arrayList2.isEmpty()) {
            jVarA2 = c0.d(arrayList2, e0Var);
        }
        if (mVar3 != null) {
            o4.j jVar = new o4.j(new Path(jVarA.f128869b));
            if (jVarA2.f128869b.isEmpty()) {
                jVar.c(((h0.e.a) p13.h0.m0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                jVar.c(((h0.e.a) p13.h0.b0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                jVar.close();
            } else if (arrayList.size() == 1) {
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.b() >> 32)) / (f15 - f14)) / 8.0f;
                float f18 = ((h0.e.a) p13.h0.b0(arrayList)).f117346a;
                jVar.reset();
                float f19 = f18 - fIntBitsToFloat;
                jVar.a(f19, ((h0.e.a) p13.h0.b0(arrayList)).f117347b);
                float f22 = f18 + fIntBitsToFloat;
                jVar.c(f22, ((h0.e.a) p13.h0.b0(arrayList)).f117347b);
                jVar.c(f22, ((h0.e.a) p13.h0.b0(arrayList2)).f117347b);
                jVar.c(f19, ((h0.e.a) p13.h0.b0(arrayList2)).f117347b);
                jVar.close();
            } else {
                jVarA2.c(((h0.e.a) p13.h0.m0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                jVarA2.c(((h0.e.a) p13.h0.b0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                jVarA2.close();
                jVarA.c(((h0.e.a) p13.h0.m0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                jVarA.c(((h0.e.a) p13.h0.b0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                jVarA.close();
                j1.f128873b.getClass();
                jVar.s(jVarA, jVarA2, j1.f128876e);
            }
            if (mVar3 instanceof m.d) {
                q4.f.L(fVar, jVar, ((m.d) mVar3).f117408a, 0.0f, null, 60);
            } else if (mVar3 instanceof m.b) {
                o4.w.a aVar2 = o4.w.f129023a;
                o13.p[] pVarArr = (o13.p[]) ((m.b) mVar3).f117404a.toArray(new o13.p[0]);
                o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                o4.x1.f129034b.getClass();
                aVar2.getClass();
                q4.f.C1(fVar, jVar, o4.w.a.h(pVarArr2, fIntBitsToFloat2, 0.0f), 0.0f, null, 60);
            } else {
                if (!(mVar3 instanceof m.c)) {
                    if (mVar3 instanceof m.a) {
                        throw new o13.o(null, 1, null);
                    }
                    u0.r();
                    return null;
                }
                o4.w.a aVar3 = o4.w.f129023a;
                o13.p[] pVarArr3 = (o13.p[]) ((m.c) mVar3).f117406a.toArray(new o13.p[0]);
                o13.p[] pVarArr4 = (o13.p[]) Arrays.copyOf(pVarArr3, pVarArr3.length);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar.b() >> 32));
                o4.x1.f129034b.getClass();
                aVar3.getClass();
                q4.f.C1(fVar, jVar, o4.w.a.a(pVarArr4, 0.0f, fIntBitsToFloat3), 0.0f, null, 60);
            }
        }
        if (fVar4 != null && (d0Var = m0Var.f117410b) != null) {
            q4.f.L(fVar, jVarA, d0Var.f128833a, 0.0f, new q4.k(fVar.s0(fVar4.f75997a), 0.0f, 0, 0, null, 30, null), 52);
        }
        return i53.a.k(linkedHashMap3);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[LOOP:3: B:27:0x0076->B:29:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[LOOP:2: B:36:0x00a8->B:38:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    /* JADX WARN: Code duplicated, block: B:73:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x0156  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0182  */
    /* JADX WARN: Code duplicated, block: B:87:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x019d A[LOOP:0: B:88:0x0197->B:90:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:99:0x017a A[SYNTHETIC] */
    public static final i53.g<Float, Float> c(q4.f fVar, m0 m0Var, Float f14, Float f15, Float f16, Float f17, Float f18, e0 e0Var, boolean z14) throws Throwable {
        float f19;
        float fFloatValue;
        Iterator<h0> it;
        float fC;
        float f22;
        float fFloatValue2;
        Iterator<h0> it3;
        float f24;
        float fFloatValue3;
        Iterator<h0> it4;
        h0 next;
        float fMax;
        float f25;
        float fFloatValue4;
        h0 next2;
        float fMax2;
        float f26;
        Map mapB;
        fVar.getClass();
        e0Var.getClass();
        i53.c<h0> cVar = m0Var.f117409a;
        if (cVar.isEmpty()) {
            return i53.a.c();
        }
        Map mapB2 = p13.k0.f134949a;
        mapB2.getClass();
        if (f15 == null) {
            if (f14 != null) {
                fFloatValue = 0.0f;
            } else {
                Iterator<h0> it5 = cVar.iterator();
                if (!it5.hasNext()) {
                    c22.t.g();
                    return null;
                }
                float fC2 = i0.c(it5.next());
                while (it5.hasNext()) {
                    fC2 = Math.min(fC2, i0.c(it5.next()));
                }
                f19 = fC2;
            }
            if (f16 != null) {
                if (f14 != null) {
                    fFloatValue2 = f14.floatValue() - 1;
                } else {
                    it = cVar.iterator();
                    if (it.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    fC = i0.c(it.next());
                    while (it.hasNext()) {
                        fC = Math.max(fC, i0.c(it.next()));
                    }
                    f22 = fC;
                }
                if (f17 != null) {
                    fFloatValue3 = f17.floatValue();
                } else {
                    it3 = cVar.iterator();
                    if (it3.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    f24 = i0.f(it3.next());
                    while (it3.hasNext()) {
                        f24 = Math.min(f24, i0.f(it3.next()));
                    }
                    fFloatValue3 = f24;
                }
                if (f18 != null) {
                    fFloatValue4 = f18.floatValue();
                } else {
                    it4 = cVar.iterator();
                    if (it4.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    next = it4.next();
                    if (next instanceof h0.e) {
                        fMax = i0.e((h0.e) next);
                    } else if (next instanceof h0.d) {
                        fMax = i0.g((h0.d) next);
                    } else if (next instanceof h0.b) {
                        h0.b bVar = (h0.b) next;
                        f25 = bVar.f117335a.f117347b;
                        fMax = bVar.f117337c.f117347b;
                        if (f25 > fMax) {
                            fMax = f25;
                        }
                    } else {
                        if (next instanceof h0.a) {
                            if (next instanceof h0.c) {
                                h0.c cVar2 = (h0.c) next;
                                fMax = Math.max(i0.e(cVar2.f117339a), i0.e(cVar2.f117340b));
                            }
                            u0.r();
                            return null;
                        }
                        fMax = ((h0.a) next).f117334d;
                    }
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        if (next2 instanceof h0.e) {
                            fMax2 = i0.e((h0.e) next2);
                        } else if (next2 instanceof h0.d) {
                            fMax2 = i0.g((h0.d) next2);
                        } else if (next2 instanceof h0.b) {
                            h0.b bVar2 = (h0.b) next2;
                            f26 = bVar2.f117335a.f117347b;
                            fMax2 = bVar2.f117337c.f117347b;
                            if (f26 > fMax2) {
                                fMax2 = f26;
                            }
                        } else if (next2 instanceof h0.a) {
                            fMax2 = ((h0.a) next2).f117334d;
                        } else {
                            if (next2 instanceof h0.c) {
                                u0.r();
                                return null;
                            }
                            h0.c cVar3 = (h0.c) next2;
                            fMax2 = Math.max(i0.e(cVar3.f117339a), i0.e(cVar3.f117340b));
                        }
                        fMax = Math.max(fMax, fMax2);
                    }
                    fFloatValue4 = fMax;
                }
                if (z14) {
                    for (i53.c cVar4 : c0.g(cVar)) {
                        o4.d0 d0Var = m0Var.f117410b;
                        m mVar = m0Var.f117411c;
                        g6.f fVar2 = m0Var.f117412d;
                        cVar4.getClass();
                        mapB2 = b(fVar, new m0(cVar4, d0Var, mVar, fVar2, (p005kotlin.jvm.internal.j) null), f19, f22, fFloatValue3, fFloatValue4, e0Var);
                    }
                    mapB = mapB2;
                } else {
                    mapB = b(fVar, m0Var, f19, f22, fFloatValue3, fFloatValue4, e0Var);
                }
                return i53.a.k(mapB);
            }
            fFloatValue2 = f16.floatValue();
            f22 = fFloatValue2;
            if (f17 != null) {
                fFloatValue3 = f17.floatValue();
            } else {
                it3 = cVar.iterator();
                if (it3.hasNext()) {
                    c22.t.g();
                    return null;
                }
                f24 = i0.f(it3.next());
                while (it3.hasNext()) {
                    f24 = Math.min(f24, i0.f(it3.next()));
                }
                fFloatValue3 = f24;
            }
            if (f18 != null) {
                fFloatValue4 = f18.floatValue();
            } else {
                it4 = cVar.iterator();
                if (it4.hasNext()) {
                    c22.t.g();
                    return null;
                }
                next = it4.next();
                if (next instanceof h0.e) {
                    fMax = i0.e((h0.e) next);
                } else if (next instanceof h0.d) {
                    fMax = i0.g((h0.d) next);
                } else if (next instanceof h0.b) {
                    h0.b bVar3 = (h0.b) next;
                    f25 = bVar3.f117335a.f117347b;
                    fMax = bVar3.f117337c.f117347b;
                    if (f25 > fMax) {
                        fMax = f25;
                    }
                } else {
                    if (next instanceof h0.a) {
                        if (next instanceof h0.c) {
                            h0.c cVar5 = (h0.c) next;
                            fMax = Math.max(i0.e(cVar5.f117339a), i0.e(cVar5.f117340b));
                        }
                        u0.r();
                        return null;
                    }
                    fMax = ((h0.a) next).f117334d;
                }
                while (it4.hasNext()) {
                    next2 = it4.next();
                    if (next2 instanceof h0.e) {
                        fMax2 = i0.e((h0.e) next2);
                    } else if (next2 instanceof h0.d) {
                        fMax2 = i0.g((h0.d) next2);
                    } else if (next2 instanceof h0.b) {
                        h0.b bVar4 = (h0.b) next2;
                        f26 = bVar4.f117335a.f117347b;
                        fMax2 = bVar4.f117337c.f117347b;
                        if (f26 > fMax2) {
                            fMax2 = f26;
                        }
                    } else if (next2 instanceof h0.a) {
                        fMax2 = ((h0.a) next2).f117334d;
                    } else {
                        if (next2 instanceof h0.c) {
                            u0.r();
                            return null;
                        }
                        h0.c cVar6 = (h0.c) next2;
                        fMax2 = Math.max(i0.e(cVar6.f117339a), i0.e(cVar6.f117340b));
                    }
                    fMax = Math.max(fMax, fMax2);
                }
                fFloatValue4 = fMax;
            }
            if (z14) {
                mapB = b(fVar, m0Var, f19, f22, fFloatValue3, fFloatValue4, e0Var);
            } else {
                while (r0.hasNext()) {
                    o4.d0 d0Var2 = m0Var.f117410b;
                    m mVar2 = m0Var.f117411c;
                    g6.f fVar3 = m0Var.f117412d;
                    cVar4.getClass();
                    mapB2 = b(fVar, new m0(cVar4, d0Var2, mVar2, fVar3, (p005kotlin.jvm.internal.j) null), f19, f22, fFloatValue3, fFloatValue4, e0Var);
                }
                mapB = mapB2;
            }
            return i53.a.k(mapB);
        }
        fFloatValue = f15.floatValue();
        f19 = fFloatValue;
        if (f16 != null) {
            if (f14 != null) {
                fFloatValue2 = f14.floatValue() - 1;
            } else {
                it = cVar.iterator();
                if (it.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fC = i0.c(it.next());
                while (it.hasNext()) {
                    fC = Math.max(fC, i0.c(it.next()));
                }
                f22 = fC;
            }
            if (f17 != null) {
                fFloatValue3 = f17.floatValue();
            } else {
                it3 = cVar.iterator();
                if (it3.hasNext()) {
                    c22.t.g();
                    return null;
                }
                f24 = i0.f(it3.next());
                while (it3.hasNext()) {
                    f24 = Math.min(f24, i0.f(it3.next()));
                }
                fFloatValue3 = f24;
            }
            if (f18 != null) {
                fFloatValue4 = f18.floatValue();
            } else {
                it4 = cVar.iterator();
                if (it4.hasNext()) {
                    c22.t.g();
                    return null;
                }
                next = it4.next();
                if (next instanceof h0.e) {
                    fMax = i0.e((h0.e) next);
                } else if (next instanceof h0.d) {
                    fMax = i0.g((h0.d) next);
                } else if (next instanceof h0.b) {
                    h0.b bVar5 = (h0.b) next;
                    f25 = bVar5.f117335a.f117347b;
                    fMax = bVar5.f117337c.f117347b;
                    if (f25 > fMax) {
                        fMax = f25;
                    }
                } else {
                    if (next instanceof h0.a) {
                        if (next instanceof h0.c) {
                            h0.c cVar7 = (h0.c) next;
                            fMax = Math.max(i0.e(cVar7.f117339a), i0.e(cVar7.f117340b));
                        }
                        u0.r();
                        return null;
                    }
                    fMax = ((h0.a) next).f117334d;
                }
                while (it4.hasNext()) {
                    next2 = it4.next();
                    if (next2 instanceof h0.e) {
                        fMax2 = i0.e((h0.e) next2);
                    } else if (next2 instanceof h0.d) {
                        fMax2 = i0.g((h0.d) next2);
                    } else if (next2 instanceof h0.b) {
                        h0.b bVar6 = (h0.b) next2;
                        f26 = bVar6.f117335a.f117347b;
                        fMax2 = bVar6.f117337c.f117347b;
                        if (f26 > fMax2) {
                            fMax2 = f26;
                        }
                    } else if (next2 instanceof h0.a) {
                        fMax2 = ((h0.a) next2).f117334d;
                    } else {
                        if (next2 instanceof h0.c) {
                            u0.r();
                            return null;
                        }
                        h0.c cVar8 = (h0.c) next2;
                        fMax2 = Math.max(i0.e(cVar8.f117339a), i0.e(cVar8.f117340b));
                    }
                    fMax = Math.max(fMax, fMax2);
                }
                fFloatValue4 = fMax;
            }
            if (z14) {
                mapB = b(fVar, m0Var, f19, f22, fFloatValue3, fFloatValue4, e0Var);
            } else {
                while (r0.hasNext()) {
                    o4.d0 d0Var3 = m0Var.f117410b;
                    m mVar3 = m0Var.f117411c;
                    g6.f fVar4 = m0Var.f117412d;
                    cVar4.getClass();
                    mapB2 = b(fVar, new m0(cVar4, d0Var3, mVar3, fVar4, (p005kotlin.jvm.internal.j) null), f19, f22, fFloatValue3, fFloatValue4, e0Var);
                }
                mapB = mapB2;
            }
            return i53.a.k(mapB);
        }
        fFloatValue2 = f16.floatValue();
        f22 = fFloatValue2;
        if (f17 != null) {
            fFloatValue3 = f17.floatValue();
        } else {
            it3 = cVar.iterator();
            if (it3.hasNext()) {
                c22.t.g();
                return null;
            }
            f24 = i0.f(it3.next());
            while (it3.hasNext()) {
                f24 = Math.min(f24, i0.f(it3.next()));
            }
            fFloatValue3 = f24;
        }
        if (f18 != null) {
            fFloatValue4 = f18.floatValue();
        } else {
            it4 = cVar.iterator();
            if (it4.hasNext()) {
                c22.t.g();
                return null;
            }
            next = it4.next();
            if (next instanceof h0.e) {
                fMax = i0.e((h0.e) next);
            } else if (next instanceof h0.d) {
                fMax = i0.g((h0.d) next);
            } else if (next instanceof h0.b) {
                h0.b bVar7 = (h0.b) next;
                f25 = bVar7.f117335a.f117347b;
                fMax = bVar7.f117337c.f117347b;
                if (f25 > fMax) {
                    fMax = f25;
                }
            } else {
                if (next instanceof h0.a) {
                    if (next instanceof h0.c) {
                        h0.c cVar9 = (h0.c) next;
                        fMax = Math.max(i0.e(cVar9.f117339a), i0.e(cVar9.f117340b));
                    }
                    u0.r();
                    return null;
                }
                fMax = ((h0.a) next).f117334d;
            }
            while (it4.hasNext()) {
                next2 = it4.next();
                if (next2 instanceof h0.e) {
                    fMax2 = i0.e((h0.e) next2);
                } else if (next2 instanceof h0.d) {
                    fMax2 = i0.g((h0.d) next2);
                } else if (next2 instanceof h0.b) {
                    h0.b bVar8 = (h0.b) next2;
                    f26 = bVar8.f117335a.f117347b;
                    fMax2 = bVar8.f117337c.f117347b;
                    if (f26 > fMax2) {
                        fMax2 = f26;
                    }
                } else if (next2 instanceof h0.a) {
                    fMax2 = ((h0.a) next2).f117334d;
                } else {
                    if (next2 instanceof h0.c) {
                        u0.r();
                        return null;
                    }
                    h0.c cVar10 = (h0.c) next2;
                    fMax2 = Math.max(i0.e(cVar10.f117339a), i0.e(cVar10.f117340b));
                }
                fMax = Math.max(fMax, fMax2);
            }
            fFloatValue4 = fMax;
        }
        if (z14) {
            mapB = b(fVar, m0Var, f19, f22, fFloatValue3, fFloatValue4, e0Var);
        } else {
            while (r0.hasNext()) {
                o4.d0 d0Var4 = m0Var.f117410b;
                m mVar4 = m0Var.f117411c;
                g6.f fVar5 = m0Var.f117412d;
                cVar4.getClass();
                mapB2 = b(fVar, new m0(cVar4, d0Var4, mVar4, fVar5, (p005kotlin.jvm.internal.j) null), f19, f22, fFloatValue3, fFloatValue4, e0Var);
            }
            mapB = mapB2;
        }
        return i53.a.k(mapB);
    }

    public static /* synthetic */ i53.g d(q4.f fVar, m0 m0Var, Float f14, Float f15, Float f16, Float f17, Float f18, e0 e0Var, int i14) {
        if ((i14 & 2) != 0) {
            f14 = null;
        }
        if ((i14 & 4) != 0) {
            f15 = null;
        }
        if ((i14 & 8) != 0) {
            f16 = null;
        }
        if ((i14 & 64) != 0) {
            e0Var = e0.LINEAR;
        }
        return c(fVar, m0Var, f14, f15, f16, f17, f18, e0Var, (i14 & 128) == 0);
    }
}
