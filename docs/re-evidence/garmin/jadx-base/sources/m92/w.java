package m92;

import f5.z0;
import i3.s3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class w {
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    public static final void a(h4.r rVar, i53.c cVar, Float f14, float f15, h0.e.d dVar, g6.f fVar, Float f16, Float f17, p3.m mVar, int i14) {
        int i15;
        Float f18;
        cVar.getClass();
        p3.o0 o0VarE = mVar.E(1595894301);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(cVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            f18 = f14;
            i16 |= o0VarE.B(f18) ? 256 : 128;
        } else {
            f18 = f14;
        }
        int i17 = i16 | (o0VarE.i(f15) ? 2048 : 1024) | (o0VarE.B(dVar) ? 16384 : 8192) | (o0VarE.B(fVar) ? 131072 : 65536) | 14155776;
        if (o0VarE.n(i17 & 1, (306783379 & i17) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(rVar, f15 / 2);
            boolean z14 = ((i17 & 458752) == 131072) | ((i17 & 112) == 32) | ((i17 & 896) == 256) | ((i17 & 7168) == 2048) | ((57344 & i17) == 16384);
            Object objQ = o0VarE.q();
            if (z14) {
                v vVar = new v(cVar, f18, f15, dVar, fVar, f16, f17);
                o0VarE.K(vVar);
                objQ = vVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    v vVar2 = new v(cVar, f18, f15, dVar, fVar, f16, f17);
                    o0VarE.K(vVar2);
                    objQ = vVar2;
                }
            }
            u1.n.b(rVarY, (e23.l) objQ, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s3(rVar, cVar, f14, f15, dVar, fVar, f16, f17, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e A[LOOP:6: B:27:0x0078->B:29:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[LOOP:5: B:36:0x00aa->B:38:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2 A[LOOP:4: B:45:0x00dc->B:47:0x00e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180 A[LOOP:2: B:66:0x017a->B:68:0x0180, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x021d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0222  */
    /* JADX WARN: Code duplicated, block: B:83:0x0226  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124 A[SYNTHETIC] */
    public static final i53.g<Float, Float> b(q4.f fVar, List<h0.e.d> list, Float f14, float f15, h0.e.d dVar, g6.f fVar2, Float f16, Float f17, Float f18, Float f19) {
        float f22;
        float fFloatValue;
        Iterator<T> it;
        float fB;
        float f24;
        float fFloatValue2;
        Iterator<T> it3;
        float fE;
        float fFloatValue3;
        Iterator<T> it4;
        float fE2;
        float fFloatValue4;
        ArrayList<h0.e.d> arrayList;
        float fS0;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        ArrayList arrayList2;
        int i14;
        float f25;
        ArrayList arrayList3;
        float fS1;
        int iFloatValue;
        int i15;
        Iterator<T> it5;
        q4.f fVar3 = fVar;
        fVar3.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return i53.a.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (f16 == null) {
            if (f14 != null) {
                fFloatValue = 0.0f;
            } else {
                Iterator<T> it6 = list.iterator();
                if (!it6.hasNext()) {
                    c22.t.g();
                    return null;
                }
                float fB2 = i0.b((h0.e.d) it6.next());
                while (it6.hasNext()) {
                    fB2 = Math.min(fB2, i0.b((h0.e.d) it6.next()));
                }
                f22 = fB2;
            }
            if (f17 != null) {
                if (f14 != null) {
                    fFloatValue2 = f14.floatValue() - 1;
                } else {
                    it = list.iterator();
                    if (it.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    fB = i0.b((h0.e.d) it.next());
                    while (it.hasNext()) {
                        fB = Math.max(fB, i0.b((h0.e.d) it.next()));
                    }
                    f24 = fB;
                }
                if (f18 != null) {
                    fFloatValue3 = f18.floatValue();
                } else {
                    it3 = list.iterator();
                    if (it3.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    fE = i0.e((h0.e.d) it3.next());
                    while (it3.hasNext()) {
                        fE = Math.min(fE, i0.e((h0.e.d) it3.next()));
                    }
                    fFloatValue3 = fE;
                }
                if (f19 != null) {
                    fFloatValue4 = f19.floatValue();
                } else {
                    it4 = list.iterator();
                    if (it4.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    fE2 = i0.e((h0.e.d) it4.next());
                    while (it4.hasNext()) {
                        fE2 = Math.max(fE2, i0.e((h0.e.d) it4.next()));
                    }
                    fFloatValue4 = fE2;
                }
                arrayList = new ArrayList();
                if (f14 != null && dVar != null) {
                    iFloatValue = (int) f14.floatValue();
                    for (i15 = 0; i15 < iFloatValue; i15++) {
                        if (list.isEmpty()) {
                            arrayList.add(new h0.e.d(new h0.e.a(i15, i0.e(dVar)), dVar.f117354b, null, 4, null));
                            break;
                        }
                        it5 = list.iterator();
                        do {
                            if (it5.hasNext()) {
                                arrayList.add(new h0.e.d(new h0.e.a(i15, i0.e(dVar)), dVar.f117354b, null, 4, null));
                                break;
                                break;
                            }
                        } while (i0.b((h0.e.d) it5.next()) != i15);
                    }
                }
                fS0 = fVar3.s0(f15);
                fIntBitsToFloat = Float.intBitsToFloat((int) (fVar3.b() >> 32));
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar3.b() & 4294967295L));
                i14 = 10;
                arrayList2 = new ArrayList(p13.y.r(list, 10));
                for (h0.e.d dVar2 : list) {
                    h0.e.a aVarA = q0.a(dVar2.f117353a, f22, f24, fFloatValue3, fFloatValue4, fIntBitsToFloat, fIntBitsToFloat2);
                    linkedHashMap.put(Float.valueOf(aVarA.f117346a), Float.valueOf(dVar2.f117353a.f117346a));
                    ArrayList arrayList4 = arrayList2;
                    o92.d.b(fVar3, aVarA.f117346a, aVarA.f117347b, dVar2.f117354b, fS0, fS0);
                    arrayList4.add(Unit.INSTANCE);
                    arrayList2 = arrayList4;
                    i14 = 10;
                    f22 = f22;
                }
                f25 = f22;
                arrayList3 = new ArrayList(p13.y.r(arrayList, i14));
                for (h0.e.d dVar3 : arrayList) {
                    float f26 = f25;
                    h0.e.a aVarA2 = q0.a(dVar3.f117353a, f26, f24, fFloatValue3, fFloatValue4, fIntBitsToFloat, fIntBitsToFloat2);
                    if (fVar2 != null) {
                        fS1 = fVar3.s0(fVar2.f75997a);
                    } else {
                        fS1 = fS0;
                    }
                    linkedHashMap.put(Float.valueOf(aVarA2.f117346a), Float.valueOf(dVar3.f117353a.f117346a));
                    ArrayList arrayList5 = arrayList3;
                    o92.d.b(fVar3, aVarA2.f117346a, aVarA2.f117347b, dVar3.f117354b, fS1, fS1);
                    arrayList5.add(Unit.INSTANCE);
                    fVar3 = fVar;
                    arrayList3 = arrayList5;
                    f25 = f26;
                }
                return i53.a.k(linkedHashMap);
            }
            fFloatValue2 = f17.floatValue();
            f24 = fFloatValue2;
            if (f18 != null) {
                fFloatValue3 = f18.floatValue();
            } else {
                it3 = list.iterator();
                if (it3.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fE = i0.e((h0.e.d) it3.next());
                while (it3.hasNext()) {
                    fE = Math.min(fE, i0.e((h0.e.d) it3.next()));
                }
                fFloatValue3 = fE;
            }
            if (f19 != null) {
                fFloatValue4 = f19.floatValue();
            } else {
                it4 = list.iterator();
                if (it4.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fE2 = i0.e((h0.e.d) it4.next());
                while (it4.hasNext()) {
                    fE2 = Math.max(fE2, i0.e((h0.e.d) it4.next()));
                }
                fFloatValue4 = fE2;
            }
            arrayList = new ArrayList();
            if (f14 != null) {
                iFloatValue = (int) f14.floatValue();
                while (i15 < iFloatValue) {
                    if (list.isEmpty()) {
                        arrayList.add(new h0.e.d(new h0.e.a(i15, i0.e(dVar)), dVar.f117354b, null, 4, null));
                        break;
                        break;
                    }
                    it5 = list.iterator();
                    do {
                        if (it5.hasNext()) {
                            arrayList.add(new h0.e.d(new h0.e.a(i15, i0.e(dVar)), dVar.f117354b, null, 4, null));
                            break;
                            break;
                        }
                    } while (i0.b((h0.e.d) it5.next()) != i15);
                }
            }
            fS0 = fVar3.s0(f15);
            fIntBitsToFloat = Float.intBitsToFloat((int) (fVar3.b() >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar3.b() & 4294967295L));
            i14 = 10;
            arrayList2 = new ArrayList(p13.y.r(list, 10));
            while (r16.hasNext()) {
                h0.e.a aVarA3 = q0.a(dVar2.f117353a, f22, f24, fFloatValue3, fFloatValue4, fIntBitsToFloat, fIntBitsToFloat2);
                linkedHashMap.put(Float.valueOf(aVarA3.f117346a), Float.valueOf(dVar2.f117353a.f117346a));
                ArrayList arrayList6 = arrayList2;
                o92.d.b(fVar3, aVarA3.f117346a, aVarA3.f117347b, dVar2.f117354b, fS0, fS0);
                arrayList6.add(Unit.INSTANCE);
                arrayList2 = arrayList6;
                i14 = 10;
                f22 = f22;
            }
            f25 = f22;
            arrayList3 = new ArrayList(p13.y.r(arrayList, i14));
            while (r15.hasNext()) {
                float f27 = f25;
                h0.e.a aVarA4 = q0.a(dVar3.f117353a, f27, f24, fFloatValue3, fFloatValue4, fIntBitsToFloat, fIntBitsToFloat2);
                if (fVar2 != null) {
                    fS1 = fVar3.s0(fVar2.f75997a);
                } else {
                    fS1 = fS0;
                }
                linkedHashMap.put(Float.valueOf(aVarA4.f117346a), Float.valueOf(dVar3.f117353a.f117346a));
                ArrayList arrayList7 = arrayList3;
                o92.d.b(fVar3, aVarA4.f117346a, aVarA4.f117347b, dVar3.f117354b, fS1, fS1);
                arrayList7.add(Unit.INSTANCE);
                fVar3 = fVar;
                arrayList3 = arrayList7;
                f25 = f27;
            }
            return i53.a.k(linkedHashMap);
        }
        fFloatValue = f16.floatValue();
        f22 = fFloatValue;
        if (f17 != null) {
            if (f14 != null) {
                fFloatValue2 = f14.floatValue() - 1;
            } else {
                it = list.iterator();
                if (it.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fB = i0.b((h0.e.d) it.next());
                while (it.hasNext()) {
                    fB = Math.max(fB, i0.b((h0.e.d) it.next()));
                }
                f24 = fB;
            }
            if (f18 != null) {
                fFloatValue3 = f18.floatValue();
            } else {
                it3 = list.iterator();
                if (it3.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fE = i0.e((h0.e.d) it3.next());
                while (it3.hasNext()) {
                    fE = Math.min(fE, i0.e((h0.e.d) it3.next()));
                }
                fFloatValue3 = fE;
            }
            if (f19 != null) {
                fFloatValue4 = f19.floatValue();
            } else {
                it4 = list.iterator();
                if (it4.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fE2 = i0.e((h0.e.d) it4.next());
                while (it4.hasNext()) {
                    fE2 = Math.max(fE2, i0.e((h0.e.d) it4.next()));
                }
                fFloatValue4 = fE2;
            }
            arrayList = new ArrayList();
            if (f14 != null) {
                iFloatValue = (int) f14.floatValue();
                while (i15 < iFloatValue) {
                    if (list.isEmpty()) {
                        arrayList.add(new h0.e.d(new h0.e.a(i15, i0.e(dVar)), dVar.f117354b, null, 4, null));
                        break;
                        break;
                    }
                    it5 = list.iterator();
                    do {
                        if (it5.hasNext()) {
                            arrayList.add(new h0.e.d(new h0.e.a(i15, i0.e(dVar)), dVar.f117354b, null, 4, null));
                            break;
                            break;
                        }
                    } while (i0.b((h0.e.d) it5.next()) != i15);
                }
            }
            fS0 = fVar3.s0(f15);
            fIntBitsToFloat = Float.intBitsToFloat((int) (fVar3.b() >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar3.b() & 4294967295L));
            i14 = 10;
            arrayList2 = new ArrayList(p13.y.r(list, 10));
            while (r16.hasNext()) {
                h0.e.a aVarA5 = q0.a(dVar2.f117353a, f22, f24, fFloatValue3, fFloatValue4, fIntBitsToFloat, fIntBitsToFloat2);
                linkedHashMap.put(Float.valueOf(aVarA5.f117346a), Float.valueOf(dVar2.f117353a.f117346a));
                ArrayList arrayList8 = arrayList2;
                o92.d.b(fVar3, aVarA5.f117346a, aVarA5.f117347b, dVar2.f117354b, fS0, fS0);
                arrayList8.add(Unit.INSTANCE);
                arrayList2 = arrayList8;
                i14 = 10;
                f22 = f22;
            }
            f25 = f22;
            arrayList3 = new ArrayList(p13.y.r(arrayList, i14));
            while (r15.hasNext()) {
                float f28 = f25;
                h0.e.a aVarA6 = q0.a(dVar3.f117353a, f28, f24, fFloatValue3, fFloatValue4, fIntBitsToFloat, fIntBitsToFloat2);
                if (fVar2 != null) {
                    fS1 = fVar3.s0(fVar2.f75997a);
                } else {
                    fS1 = fS0;
                }
                linkedHashMap.put(Float.valueOf(aVarA6.f117346a), Float.valueOf(dVar3.f117353a.f117346a));
                ArrayList arrayList9 = arrayList3;
                o92.d.b(fVar3, aVarA6.f117346a, aVarA6.f117347b, dVar3.f117354b, fS1, fS1);
                arrayList9.add(Unit.INSTANCE);
                fVar3 = fVar;
                arrayList3 = arrayList9;
                f25 = f28;
            }
            return i53.a.k(linkedHashMap);
        }
        fFloatValue2 = f17.floatValue();
        f24 = fFloatValue2;
        if (f18 != null) {
            fFloatValue3 = f18.floatValue();
        } else {
            it3 = list.iterator();
            if (it3.hasNext()) {
                c22.t.g();
                return null;
            }
            fE = i0.e((h0.e.d) it3.next());
            while (it3.hasNext()) {
                fE = Math.min(fE, i0.e((h0.e.d) it3.next()));
            }
            fFloatValue3 = fE;
        }
        if (f19 != null) {
            fFloatValue4 = f19.floatValue();
        } else {
            it4 = list.iterator();
            if (it4.hasNext()) {
                c22.t.g();
                return null;
            }
            fE2 = i0.e((h0.e.d) it4.next());
            while (it4.hasNext()) {
                fE2 = Math.max(fE2, i0.e((h0.e.d) it4.next()));
            }
            fFloatValue4 = fE2;
        }
        arrayList = new ArrayList();
        if (f14 != null) {
            iFloatValue = (int) f14.floatValue();
            while (i15 < iFloatValue) {
                if (list.isEmpty()) {
                    arrayList.add(new h0.e.d(new h0.e.a(i15, i0.e(dVar)), dVar.f117354b, null, 4, null));
                    break;
                    break;
                }
                it5 = list.iterator();
                do {
                    if (it5.hasNext()) {
                        arrayList.add(new h0.e.d(new h0.e.a(i15, i0.e(dVar)), dVar.f117354b, null, 4, null));
                        break;
                        break;
                    }
                } while (i0.b((h0.e.d) it5.next()) != i15);
            }
        }
        fS0 = fVar3.s0(f15);
        fIntBitsToFloat = Float.intBitsToFloat((int) (fVar3.b() >> 32));
        fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar3.b() & 4294967295L));
        i14 = 10;
        arrayList2 = new ArrayList(p13.y.r(list, 10));
        while (r16.hasNext()) {
            h0.e.a aVarA7 = q0.a(dVar2.f117353a, f22, f24, fFloatValue3, fFloatValue4, fIntBitsToFloat, fIntBitsToFloat2);
            linkedHashMap.put(Float.valueOf(aVarA7.f117346a), Float.valueOf(dVar2.f117353a.f117346a));
            ArrayList arrayList10 = arrayList2;
            o92.d.b(fVar3, aVarA7.f117346a, aVarA7.f117347b, dVar2.f117354b, fS0, fS0);
            arrayList10.add(Unit.INSTANCE);
            arrayList2 = arrayList10;
            i14 = 10;
            f22 = f22;
        }
        f25 = f22;
        arrayList3 = new ArrayList(p13.y.r(arrayList, i14));
        while (r15.hasNext()) {
            float f29 = f25;
            h0.e.a aVarA8 = q0.a(dVar3.f117353a, f29, f24, fFloatValue3, fFloatValue4, fIntBitsToFloat, fIntBitsToFloat2);
            if (fVar2 != null) {
                fS1 = fVar3.s0(fVar2.f75997a);
            } else {
                fS1 = fS0;
            }
            linkedHashMap.put(Float.valueOf(aVarA8.f117346a), Float.valueOf(dVar3.f117353a.f117346a));
            ArrayList arrayList11 = arrayList3;
            o92.d.b(fVar3, aVarA8.f117346a, aVarA8.f117347b, dVar3.f117354b, fS1, fS1);
            arrayList11.add(Unit.INSTANCE);
            fVar3 = fVar;
            arrayList3 = arrayList11;
            f25 = f29;
        }
        return i53.a.k(linkedHashMap);
    }

    public static i53.g c(q4.f fVar, List list, Float f14, float f15, Float f16, Float f17, Float f18, Float f19, int i14) {
        return b(fVar, list, (i14 & 2) != 0 ? null : f14, f15, null, null, (i14 & 32) != 0 ? null : f16, (i14 & 64) != 0 ? null : f17, f18, f19);
    }
}
