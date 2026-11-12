package k53;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;
import p13.p0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u000eB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lk53/t;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Ln53/e;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Ln53/e;)V", "(II[Ljava/lang/Object;)V", "a", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f102994e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f102995f = new t(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n53.e f102998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f102999d;

    public t(int i14, int i15, Object[] objArr, n53.e eVar) {
        objArr.getClass();
        this.f102996a = i14;
        this.f102997b = i15;
        this.f102998c = eVar;
        this.f102999d = objArr;
    }

    public static t k(int i14, Object obj, Object obj2, int i15, Object obj3, Object obj4, int i16, n53.e eVar) {
        if (i16 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, eVar);
        }
        int iZ = gl1.y.z(i14, i16);
        int iZ2 = gl1.y.z(i15, i16);
        if (iZ != iZ2) {
            return new t((1 << iZ) | (1 << iZ2), 0, iZ < iZ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, eVar);
        }
        return new t(0, 1 << iZ, new Object[]{k(i14, obj, obj2, i15, obj3, obj4, i16 + 5, eVar)}, eVar);
    }

    public final Object[] a(int i14, int i15, int i16, K k14, V v14, int i17, n53.e eVar) {
        Object obj = this.f102999d[i14];
        t tVarK = k(obj != null ? obj.hashCode() : 0, obj, v(i14), i16, k14, v14, i17 + 5, eVar);
        int iT = t(i15);
        int i18 = iT + 1;
        Object[] objArr = this.f102999d;
        Object[] objArr2 = new Object[objArr.length - 1];
        p13.s.j(objArr, objArr2, 0, i14, 6);
        p13.s.h(objArr, objArr2, i14, i14 + 2, i18);
        objArr2[iT - 1] = tVarK;
        p13.s.h(objArr, objArr2, iT, i18, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f102997b == 0) {
            return this.f102999d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f102996a);
        int length = this.f102999d.length;
        for (int i14 = iBitCount * 2; i14 < length; i14++) {
            iBitCount += s(i14).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        j23.j jVarN = j23.t.n(2, j23.t.o(0, this.f102999d.length));
        int i14 = jVarN.f96796a;
        int i15 = jVarN.f96797b;
        int i16 = jVarN.f96798c;
        if ((i16 <= 0 || i14 > i15) && (i16 >= 0 || i15 > i14)) {
            return -1;
        }
        while (!p005kotlin.jvm.internal.s.g(obj, this.f102999d[i14])) {
            if (i14 == i15) {
                return -1;
            }
            i14 += i16;
        }
        return i14;
    }

    public final boolean d(int i14, int i15, Object obj) {
        int iZ = 1 << gl1.y.z(i14, i15);
        if (i(iZ)) {
            return p005kotlin.jvm.internal.s.g(obj, this.f102999d[f(iZ)]);
        }
        if (!j(iZ)) {
            return false;
        }
        t<K, V> tVarS = s(t(iZ));
        if (i15 == 30) {
            return tVarS.c(obj) != -1;
        }
        return tVarS.d(i14, i15 + 5, obj);
    }

    public final boolean e(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f102997b == tVar.f102997b && this.f102996a == tVar.f102996a) {
            int length = this.f102999d.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (this.f102999d[i14] == tVar.f102999d[i14]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i14) {
        return Integer.bitCount((i14 - 1) & this.f102996a) * 2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca A[LOOP:2: B:44:0x00b9->B:48:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:51:0x00cf BREAK  A[LOOP:1: B:35:0x008e->B:42:0x00b4], SYNTHETIC] */
    public final <K1, V1> boolean g(t<K1, V1> tVar, e23.p<? super V, ? super V1, Boolean> pVar) {
        int i14;
        int length;
        tVar.getClass();
        pVar.getClass();
        if (this == tVar) {
            return true;
        }
        int i15 = this.f102996a;
        if (i15 == tVar.f102996a && (i14 = this.f102997b) == tVar.f102997b) {
            if (i15 == 0 && i14 == 0) {
                Object[] objArr = this.f102999d;
                if (objArr.length == tVar.f102999d.length) {
                    Iterable iterableN = j23.t.n(2, j23.t.o(0, objArr.length));
                    if ((iterableN instanceof Collection) && ((Collection) iterableN).isEmpty()) {
                        return true;
                    }
                    Iterator<Integer> it = iterableN.iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((p0) it).nextInt();
                        Object obj = tVar.f102999d[iNextInt];
                        V1 v1V = tVar.v(iNextInt);
                        int iC = c(obj);
                        if (!(iC != -1 ? pVar.invoke(v(iC), v1V).booleanValue() : false)) {
                        }
                    }
                    return true;
                }
            } else {
                int iBitCount = Integer.bitCount(i15) * 2;
                j23.j jVarN = j23.t.n(2, j23.t.o(0, iBitCount));
                int i16 = jVarN.f96796a;
                int i17 = jVarN.f96797b;
                int i18 = jVarN.f96798c;
                if ((i18 <= 0 || i16 > i17) && (i18 >= 0 || i17 > i16)) {
                    length = this.f102999d.length;
                    while (iBitCount < length) {
                        if (!s(iBitCount).g(tVar.s(iBitCount), pVar)) {
                            break;
                        }
                        iBitCount++;
                    }
                    return true;
                }
                while (p005kotlin.jvm.internal.s.g(this.f102999d[i16], tVar.f102999d[i16]) && pVar.invoke(v(i16), tVar.v(i16)).booleanValue()) {
                    if (i16 == i17) {
                        length = this.f102999d.length;
                        while (iBitCount < length) {
                            if (!s(iBitCount).g(tVar.s(iBitCount), pVar)) {
                                break;
                                break;
                            }
                            iBitCount++;
                        }
                        return true;
                    }
                    i16 += i18;
                }
            }
        }
        return false;
    }

    public final Object h(int i14, int i15, Object obj) {
        int iZ = 1 << gl1.y.z(i14, i15);
        if (i(iZ)) {
            int iF = f(iZ);
            if (p005kotlin.jvm.internal.s.g(obj, this.f102999d[iF])) {
                return v(iF);
            }
            return null;
        }
        if (!j(iZ)) {
            return null;
        }
        t<K, V> tVarS = s(t(iZ));
        if (i15 != 30) {
            return tVarS.h(i14, i15 + 5, obj);
        }
        int iC = tVarS.c(obj);
        if (iC != -1) {
            return tVarS.v(iC);
        }
        return null;
    }

    public final boolean i(int i14) {
        return (i14 & this.f102996a) != 0;
    }

    public final boolean j(int i14) {
        return (i14 & this.f102997b) != 0;
    }

    public final t<K, V> l(int i14, f<K, V> fVar) {
        fVar.h(fVar.f102978f - 1);
        fVar.f102976d = v(i14);
        Object[] objArr = this.f102999d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f102998c != fVar.f102974b) {
            return new t<>(0, 0, gl1.y.j(i14, objArr), fVar.f102974b);
        }
        this.f102999d = gl1.y.j(i14, objArr);
        return this;
    }

    public final t<K, V> m(int i14, K k14, V v14, int i15, f<K, V> fVar) {
        t<K, V> tVarM;
        int iZ = 1 << gl1.y.z(i14, i15);
        boolean zI = i(iZ);
        n53.e eVar = this.f102998c;
        if (zI) {
            int iF = f(iZ);
            if (!p005kotlin.jvm.internal.s.g(k14, this.f102999d[iF])) {
                fVar.h(fVar.f102978f + 1);
                n53.e eVar2 = fVar.f102974b;
                if (eVar != eVar2) {
                    return new t<>(this.f102996a ^ iZ, this.f102997b | iZ, a(iF, iZ, i14, k14, v14, i15, eVar2), eVar2);
                }
                this.f102999d = a(iF, iZ, i14, k14, v14, i15, eVar2);
                this.f102996a ^= iZ;
                this.f102997b |= iZ;
                return this;
            }
            fVar.f102976d = v(iF);
            if (v(iF) != v14) {
                if (eVar == fVar.f102974b) {
                    this.f102999d[iF + 1] = v14;
                    return this;
                }
                fVar.f102977e++;
                Object[] objArr = this.f102999d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = v14;
                return new t<>(this.f102996a, this.f102997b, objArrCopyOf, fVar.f102974b);
            }
        } else {
            if (!j(iZ)) {
                fVar.h(fVar.f102978f + 1);
                n53.e eVar3 = fVar.f102974b;
                int iF2 = f(iZ);
                Object[] objArr2 = this.f102999d;
                if (eVar != eVar3) {
                    return new t<>(this.f102996a | iZ, this.f102997b, gl1.y.i(objArr2, iF2, k14, v14), eVar3);
                }
                this.f102999d = gl1.y.i(objArr2, iF2, k14, v14);
                this.f102996a |= iZ;
                return this;
            }
            int iT = t(iZ);
            t<K, V> tVarS = s(iT);
            if (i15 == 30) {
                int iC = tVarS.c(k14);
                if (iC != -1) {
                    fVar.f102976d = tVarS.v(iC);
                    if (tVarS.f102998c == fVar.f102974b) {
                        tVarS.f102999d[iC + 1] = v14;
                        tVarM = tVarS;
                    } else {
                        fVar.f102977e++;
                        Object[] objArr3 = tVarS.f102999d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                        objArrCopyOf2[iC + 1] = v14;
                        tVarM = new t<>(0, 0, objArrCopyOf2, fVar.f102974b);
                    }
                } else {
                    fVar.h(fVar.f102978f + 1);
                    tVarM = new t<>(0, 0, gl1.y.i(tVarS.f102999d, 0, k14, v14), fVar.f102974b);
                }
            } else {
                tVarM = tVarS.m(i14, k14, v14, i15 + 5, fVar);
            }
            if (tVarS != tVarM) {
                return u(iT, iZ, tVarM, fVar.f102974b);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r5v14, types: [k53.t] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [k53.t] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [k53.t] */
    /* JADX WARN: Type inference failed for: r5v28, types: [k53.t] */
    /* JADX WARN: Type inference failed for: r5v29, types: [k53.t] */
    public final t<K, V> n(t<K, V> tVar, int i14, n53.a aVar, f<K, V> fVar) {
        t<K, V> tVar2;
        ?? r17;
        t<K, V> tVarM;
        tVar.getClass();
        if (this == tVar) {
            aVar.f123787a += b();
            return this;
        }
        int i15 = 0;
        if (i14 > 30) {
            n53.e eVar = fVar.f102974b;
            Object[] objArr = this.f102999d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f102999d.length);
            int length = this.f102999d.length;
            j23.j jVarN = j23.t.n(2, j23.t.o(0, tVar.f102999d.length));
            int i16 = jVarN.f96796a;
            int i17 = jVarN.f96797b;
            int i18 = jVarN.f96798c;
            if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                while (true) {
                    if (c(tVar.f102999d[i16]) != -1) {
                        aVar.f123787a++;
                    } else {
                        Object[] objArr2 = tVar.f102999d;
                        objArrCopyOf[length] = objArr2[i16];
                        objArrCopyOf[length + 1] = objArr2[i16 + 1];
                        length += 2;
                    }
                    if (i16 == i17) {
                        break;
                    }
                    i16 += i18;
                }
            }
            if (length != this.f102999d.length) {
                if (length != tVar.f102999d.length) {
                    return length == objArrCopyOf.length ? new t<>(0, 0, objArrCopyOf, eVar) : new t<>(0, 0, Arrays.copyOf(objArrCopyOf, length), eVar);
                }
            }
            return this;
        }
        int i19 = this.f102997b | tVar.f102997b;
        int i24 = this.f102996a;
        int i25 = tVar.f102996a;
        int i26 = (i24 ^ i25) & (~i19);
        int i27 = i24 & i25;
        int i28 = i26;
        while (i27 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i27);
            if (p005kotlin.jvm.internal.s.g(this.f102999d[f(iLowestOneBit)], tVar.f102999d[tVar.f(iLowestOneBit)])) {
                i28 |= iLowestOneBit;
            } else {
                i19 |= iLowestOneBit;
            }
            i27 ^= iLowestOneBit;
        }
        if ((i19 & i28) != 0) {
            vb.h.z("Check failed.");
            return null;
        }
        if (p005kotlin.jvm.internal.s.g(this.f102998c, fVar.f102974b) && this.f102996a == i28 && this.f102997b == i19) {
            tVar2 = this;
        } else {
            tVar2 = new t<>(i28, i19, new Object[Integer.bitCount(i19) + (Integer.bitCount(i28) * 2)]);
        }
        int i29 = i19;
        int i30 = 0;
        while (i29 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i29);
            Object[] objArr3 = tVar2.f102999d;
            int length2 = (objArr3.length - 1) - i30;
            if (j(iLowestOneBit2)) {
                tVarM = s(t(iLowestOneBit2));
                if (tVar.j(iLowestOneBit2)) {
                    tVarM = (t<K, V>) tVarM.n(tVar.s(tVar.t(iLowestOneBit2)), i14 + 5, aVar, fVar);
                    r17 = objArr3;
                } else if (tVar.i(iLowestOneBit2)) {
                    int iF = tVar.f(iLowestOneBit2);
                    Object obj = tVar.f102999d[iF];
                    V v14 = tVar.v(iF);
                    int i34 = fVar.f102978f;
                    r17 = objArr3;
                    tVarM = (t<K, V>) tVarM.m(obj != null ? obj.hashCode() : i15, obj, v14, i14 + 5, fVar);
                    if (fVar.f102978f == i34) {
                        aVar.f123787a++;
                    }
                } else {
                    r17 = objArr3;
                }
            } else {
                r17 = objArr3;
                if (tVar.j(iLowestOneBit2)) {
                    t<K, V> tVarS = tVar.s(tVar.t(iLowestOneBit2));
                    if (i(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.f102999d[iF2];
                        int i35 = i14 + 5;
                        if (tVarS.d(obj2 != null ? obj2.hashCode() : 0, i35, obj2)) {
                            aVar.f123787a++;
                            tVarM = tVarS;
                        } else {
                            tVarM = tVarS.m(obj2 != null ? obj2.hashCode() : 0, obj2, v(iF2), i35, fVar);
                        }
                    } else {
                        tVarM = tVarS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.f102999d[iF3];
                    V v15 = v(iF3);
                    int iF4 = tVar.f(iLowestOneBit2);
                    Object obj4 = tVar.f102999d[iF4];
                    tVarM = (t<K, V>) k(obj3 != null ? obj3.hashCode() : 0, obj3, v15, obj4 != null ? obj4.hashCode() : 0, obj4, tVar.v(iF4), i14 + 5, fVar.f102974b);
                }
            }
            r17[length2] = tVarM;
            i30++;
            i29 ^= iLowestOneBit2;
            i15 = 0;
        }
        int i36 = 0;
        while (i28 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i28);
            int i37 = i36 * 2;
            if (tVar.i(iLowestOneBit3)) {
                int iF5 = tVar.f(iLowestOneBit3);
                Object[] objArr4 = tVar2.f102999d;
                objArr4[i37] = tVar.f102999d[iF5];
                objArr4[i37 + 1] = tVar.v(iF5);
                if (i(iLowestOneBit3)) {
                    aVar.f123787a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr5 = tVar2.f102999d;
                objArr5[i37] = this.f102999d[iF6];
                objArr5[i37 + 1] = v(iF6);
            }
            i36++;
            i28 ^= iLowestOneBit3;
        }
        if (!e(tVar2)) {
            return tVar.e(tVar2) ? tVar : tVar2;
        }
        return this;
    }

    public final t<K, V> o(int i14, K k14, int i15, f<K, V> fVar) {
        int iZ = 1 << gl1.y.z(i14, i15);
        if (i(iZ)) {
            int iF = f(iZ);
            if (p005kotlin.jvm.internal.s.g(k14, this.f102999d[iF])) {
                return q(iF, iZ, fVar);
            }
        } else if (j(iZ)) {
            int iT = t(iZ);
            t<K, V> tVarS = s(iT);
            if (i15 == 30) {
                int iC = tVarS.c(k14);
                if (iC != -1) {
                    tVarS = tVarS.l(iC, fVar);
                }
            } else {
                tVarS = tVarS.o(i14, k14, i15 + 5, fVar);
            }
            return r(iT, iZ, tVarS, fVar.f102974b);
        }
        return this;
    }

    public final t<K, V> p(int i14, K k14, V v14, int i15, f<K, V> fVar) {
        f<K, V> fVar2;
        int iZ = 1 << gl1.y.z(i14, i15);
        if (i(iZ)) {
            int iF = f(iZ);
            if (p005kotlin.jvm.internal.s.g(k14, this.f102999d[iF]) && p005kotlin.jvm.internal.s.g(v14, v(iF))) {
                return q(iF, iZ, fVar);
            }
        } else if (j(iZ)) {
            int iT = t(iZ);
            t<K, V> tVarS = s(iT);
            if (i15 == 30) {
                int iC = tVarS.c(k14);
                if (iC != -1 && p005kotlin.jvm.internal.s.g(v14, tVarS.v(iC))) {
                    tVarS = tVarS.l(iC, fVar);
                }
                fVar2 = fVar;
            } else {
                fVar2 = fVar;
                tVarS = tVarS.p(i14, k14, v14, i15 + 5, fVar2);
            }
            return r(iT, iZ, tVarS, fVar2.f102974b);
        }
        return this;
    }

    public final t<K, V> q(int i14, int i15, f<K, V> fVar) {
        fVar.h(fVar.f102978f - 1);
        fVar.f102976d = v(i14);
        Object[] objArr = this.f102999d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f102998c != fVar.f102974b) {
            return new t<>(i15 ^ this.f102996a, this.f102997b, gl1.y.j(i14, objArr), fVar.f102974b);
        }
        this.f102999d = gl1.y.j(i14, objArr);
        this.f102996a ^= i15;
        return this;
    }

    public final t r(int i14, int i15, t tVar, n53.e eVar) {
        if (tVar != null) {
            return u(i14, i15, tVar, eVar);
        }
        Object[] objArr = this.f102999d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f102998c != eVar) {
            Object[] objArr2 = new Object[objArr.length - 1];
            p13.s.j(objArr, objArr2, 0, i14, 6);
            p13.s.h(objArr, objArr2, i14, i14 + 1, objArr.length);
            return new t(this.f102996a, i15 ^ this.f102997b, objArr2, eVar);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        p13.s.j(objArr, objArr3, 0, i14, 6);
        p13.s.h(objArr, objArr3, i14, i14 + 1, objArr.length);
        this.f102999d = objArr3;
        this.f102997b ^= i15;
        return this;
    }

    public final t<K, V> s(int i14) {
        Object obj = this.f102999d[i14];
        obj.getClass();
        return (t) obj;
    }

    public final int t(int i14) {
        return (this.f102999d.length - 1) - Integer.bitCount((i14 - 1) & this.f102997b);
    }

    public final t<K, V> u(int i14, int i15, t<K, V> tVar, n53.e eVar) {
        Object[] objArr = tVar.f102999d;
        if (objArr.length != 2 || tVar.f102997b != 0) {
            if (eVar != null && this.f102998c == eVar) {
                this.f102999d[i14] = tVar;
                return this;
            }
            Object[] objArr2 = this.f102999d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i14] = tVar;
            return new t<>(this.f102996a, this.f102997b, objArrCopyOf, eVar);
        }
        if (this.f102999d.length == 1) {
            tVar.f102996a = this.f102997b;
            return tVar;
        }
        int iF = f(i15);
        Object[] objArr3 = this.f102999d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        p13.s.h(objArrCopyOf2, objArrCopyOf2, i14 + 2, i14 + 1, objArr3.length);
        p13.s.h(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i14);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new t<>(this.f102996a ^ i15, i15 ^ this.f102997b, objArrCopyOf2, eVar);
    }

    public final V v(int i14) {
        return (V) this.f102999d[i14 + 1];
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk53/t$a;", "", "<init>", "()V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(int i14, int i15, Object[] objArr) {
        this(i14, i15, objArr, null);
        objArr.getClass();
    }
}
