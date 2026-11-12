package w3;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u000e\u000fB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"Lw3/t;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Ly3/d;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Ly3/d;)V", "(II[Ljava/lang/Object;)V", "b", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f181809e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f181810f = new t(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f181812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y3.d f181813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f181814d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw3/t$b;", "K", "V", "", "Lw3/t;", "node", "", "sizeDelta", "<init>", "(Lw3/t;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t<K, V> f181815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f181816b;

        public b(t<K, V> tVar, int i14) {
            this.f181815a = tVar;
            this.f181816b = i14;
        }
    }

    public t(int i14, int i15, Object[] objArr, y3.d dVar) {
        this.f181811a = i14;
        this.f181812b = i15;
        this.f181813c = dVar;
        this.f181814d = objArr;
    }

    public static t j(int i14, Object obj, Object obj2, int i15, Object obj3, Object obj4, int i16, y3.d dVar) {
        if (i16 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, dVar);
        }
        int iP = x.p(i14, i16);
        int iP2 = x.p(i15, i16);
        if (iP != iP2) {
            return new t((1 << iP) | (1 << iP2), 0, iP < iP2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, dVar);
        }
        return new t(0, 1 << iP, new Object[]{j(i14, obj, obj2, i15, obj3, obj4, i16 + 5, dVar)}, dVar);
    }

    public final Object[] a(int i14, int i15, int i16, K k14, V v14, int i17, y3.d dVar) {
        Object obj = this.f181814d[i14];
        t tVarJ = j(obj != null ? obj.hashCode() : 0, obj, x(i14), i16, k14, v14, i17 + 5, dVar);
        int iT = t(i15);
        int i18 = iT + 1;
        Object[] objArr = this.f181814d;
        Object[] objArr2 = new Object[objArr.length - 1];
        p13.s.j(objArr, objArr2, 0, i14, 6);
        p13.s.h(objArr, objArr2, i14, i14 + 2, i18);
        objArr2[iT - 1] = tVarJ;
        p13.s.h(objArr, objArr2, iT, i18, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f181812b == 0) {
            return this.f181814d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f181811a);
        int length = this.f181814d.length;
        for (int i14 = iBitCount * 2; i14 < length; i14++) {
            iBitCount += s(i14).b();
        }
        return iBitCount;
    }

    public final boolean c(K k14) {
        j23.j jVarN = j23.t.n(2, j23.t.o(0, this.f181814d.length));
        int i14 = jVarN.f96796a;
        int i15 = jVarN.f96797b;
        int i16 = jVarN.f96798c;
        if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
            while (!p005kotlin.jvm.internal.s.g(k14, this.f181814d[i14])) {
                if (i14 != i15) {
                    i14 += i16;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i14, int i15, Object obj) {
        int iP = 1 << x.p(i14, i15);
        if (h(iP)) {
            return p005kotlin.jvm.internal.s.g(obj, this.f181814d[f(iP)]);
        }
        if (!i(iP)) {
            return false;
        }
        t<K, V> tVarS = s(t(iP));
        return i15 == 30 ? tVarS.c(obj) : tVarS.d(i14, i15 + 5, obj);
    }

    public final boolean e(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f181812b == tVar.f181812b && this.f181811a == tVar.f181811a) {
            int length = this.f181814d.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (this.f181814d[i14] == tVar.f181814d[i14]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i14) {
        return Integer.bitCount((i14 - 1) & this.f181811a) * 2;
    }

    public final Object g(int i14, int i15, Object obj) {
        int iP = 1 << x.p(i14, i15);
        if (h(iP)) {
            int iF = f(iP);
            if (p005kotlin.jvm.internal.s.g(obj, this.f181814d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iP)) {
            return null;
        }
        t<K, V> tVarS = s(t(iP));
        if (i15 != 30) {
            return tVarS.g(i14, i15 + 5, obj);
        }
        j23.j jVarN = j23.t.n(2, j23.t.o(0, tVarS.f181814d.length));
        int i16 = jVarN.f96796a;
        int i17 = jVarN.f96797b;
        int i18 = jVarN.f96798c;
        if ((i18 <= 0 || i16 > i17) && (i18 >= 0 || i17 > i16)) {
            return null;
        }
        while (!p005kotlin.jvm.internal.s.g(obj, tVarS.f181814d[i16])) {
            if (i16 == i17) {
                return null;
            }
            i16 += i18;
        }
        return tVarS.x(i16);
    }

    public final boolean h(int i14) {
        return (i14 & this.f181811a) != 0;
    }

    public final boolean i(int i14) {
        return (i14 & this.f181812b) != 0;
    }

    public final t<K, V> k(int i14, f<K, V> fVar) {
        fVar.g(fVar.f181797f - 1);
        fVar.f181795d = x(i14);
        Object[] objArr = this.f181814d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f181813c != fVar.f181793b) {
            return new t<>(0, 0, x.e(i14, objArr), fVar.f181793b);
        }
        this.f181814d = x.e(i14, objArr);
        return this;
    }

    public final t<K, V> l(int i14, K k14, V v14, int i15, f<K, V> fVar) {
        f<K, V> fVar2;
        t<K, V> tVarL;
        int iP = 1 << x.p(i14, i15);
        boolean zH = h(iP);
        y3.d dVar = this.f181813c;
        if (zH) {
            int iF = f(iP);
            if (!p005kotlin.jvm.internal.s.g(k14, this.f181814d[iF])) {
                fVar.g(fVar.f181797f + 1);
                y3.d dVar2 = fVar.f181793b;
                if (dVar != dVar2) {
                    return new t<>(this.f181811a ^ iP, this.f181812b | iP, a(iF, iP, i14, k14, v14, i15, dVar2), dVar2);
                }
                this.f181814d = a(iF, iP, i14, k14, v14, i15, dVar2);
                this.f181811a ^= iP;
                this.f181812b |= iP;
                return this;
            }
            fVar.f181795d = x(iF);
            if (x(iF) == v14) {
                return this;
            }
            if (dVar == fVar.f181793b) {
                this.f181814d[iF + 1] = v14;
                return this;
            }
            fVar.f181796e++;
            Object[] objArr = this.f181814d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = v14;
            return new t<>(this.f181811a, this.f181812b, objArrCopyOf, fVar.f181793b);
        }
        if (!i(iP)) {
            fVar.g(fVar.f181797f + 1);
            y3.d dVar3 = fVar.f181793b;
            int iF2 = f(iP);
            Object[] objArr2 = this.f181814d;
            if (dVar != dVar3) {
                return new t<>(this.f181811a | iP, this.f181812b, x.d(objArr2, iF2, k14, v14), dVar3);
            }
            this.f181814d = x.d(objArr2, iF2, k14, v14);
            this.f181811a |= iP;
            return this;
        }
        int iT = t(iP);
        t<K, V> tVarS = s(iT);
        if (i15 == 30) {
            j23.j jVarN = j23.t.n(2, j23.t.o(0, tVarS.f181814d.length));
            int i16 = jVarN.f96796a;
            int i17 = jVarN.f96797b;
            int i18 = jVarN.f96798c;
            if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                while (true) {
                    if (!p005kotlin.jvm.internal.s.g(k14, tVarS.f181814d[i16])) {
                        if (i16 == i17) {
                            fVar.g(fVar.f181797f + 1);
                            tVarL = new t<>(0, 0, x.d(tVarS.f181814d, 0, k14, v14), fVar.f181793b);
                            break;
                        }
                        i16 += i18;
                    } else {
                        fVar.f181795d = tVarS.x(i16);
                        if (tVarS.f181813c != fVar.f181793b) {
                            fVar.f181796e++;
                            Object[] objArr3 = tVarS.f181814d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i16 + 1] = v14;
                            tVarL = new t<>(0, 0, objArrCopyOf2, fVar.f181793b);
                            break;
                        }
                        tVarS.f181814d[i16 + 1] = v14;
                        tVarL = tVarS;
                        break;
                    }
                }
            } else {
                fVar.g(fVar.f181797f + 1);
                tVarL = new t<>(0, 0, x.d(tVarS.f181814d, 0, k14, v14), fVar.f181793b);
                break;
            }
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            tVarL = tVarS.l(i14, k14, v14, i15 + 5, fVar2);
        }
        return tVarS == tVarL ? this : r(iT, tVarL, fVar2.f181793b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r27v0, types: [w3.t, w3.t<K, V>] */
    /* JADX WARN: Type inference failed for: r4v18, types: [w3.t] */
    /* JADX WARN: Type inference failed for: r5v14, types: [w3.t] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [w3.t] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [w3.t] */
    /* JADX WARN: Type inference failed for: r5v28, types: [w3.t] */
    /* JADX WARN: Type inference failed for: r5v29, types: [w3.t] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type w3.t<K, V> to ?? for r27v0 'this'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:139)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:212)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public final w3.t<K, V> m(w3.t<K, V> r28, int r29, y3.a r30, w3.f<K, V> r31) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.t.m(w3.t, int, y3.a, w3.f):w3.t");
    }

    public final t<K, V> n(int i14, K k14, int i15, f<K, V> fVar) {
        t<K, V> tVarN;
        int iP = 1 << x.p(i14, i15);
        if (h(iP)) {
            int iF = f(iP);
            if (p005kotlin.jvm.internal.s.g(k14, this.f181814d[iF])) {
                return p(iF, iP, fVar);
            }
        } else if (i(iP)) {
            int iT = t(iP);
            t<K, V> tVarS = s(iT);
            if (i15 == 30) {
                j23.j jVarN = j23.t.n(2, j23.t.o(0, tVarS.f181814d.length));
                int i16 = jVarN.f96796a;
                int i17 = jVarN.f96797b;
                int i18 = jVarN.f96798c;
                if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                    while (true) {
                        if (!p005kotlin.jvm.internal.s.g(k14, tVarS.f181814d[i16])) {
                            if (i16 == i17) {
                                tVarN = tVarS;
                                break;
                            }
                            i16 += i18;
                        } else {
                            tVarN = tVarS.k(i16, fVar);
                            break;
                        }
                    }
                } else {
                    tVarN = tVarS;
                    break;
                }
            } else {
                tVarN = tVarS.n(i14, k14, i15 + 5, fVar);
            }
            return q(tVarS, tVarN, iT, iP, fVar.f181793b);
        }
        return this;
    }

    public final t<K, V> o(int i14, K k14, V v14, int i15, f<K, V> fVar) {
        t<K, V> tVar;
        t<K, V> tVarO;
        int iP = 1 << x.p(i14, i15);
        if (h(iP)) {
            int iF = f(iP);
            if (p005kotlin.jvm.internal.s.g(k14, this.f181814d[iF]) && p005kotlin.jvm.internal.s.g(v14, x(iF))) {
                return p(iF, iP, fVar);
            }
        } else if (i(iP)) {
            int iT = t(iP);
            t<K, V> tVarS = s(iT);
            if (i15 == 30) {
                j23.j jVarN = j23.t.n(2, j23.t.o(0, tVarS.f181814d.length));
                int i16 = jVarN.f96796a;
                int i17 = jVarN.f96797b;
                int i18 = jVarN.f96798c;
                if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                    while (true) {
                        if (!p005kotlin.jvm.internal.s.g(k14, tVarS.f181814d[i16]) || !p005kotlin.jvm.internal.s.g(v14, tVarS.x(i16))) {
                            if (i16 == i17) {
                                tVarO = tVarS;
                                break;
                            }
                            i16 += i18;
                        } else {
                            tVarO = tVarS.k(i16, fVar);
                            break;
                        }
                    }
                } else {
                    tVarO = tVarS;
                    break;
                }
                tVar = tVarS;
            } else {
                tVar = tVarS;
                tVarO = tVar.o(i14, k14, v14, i15 + 5, fVar);
            }
            return q(tVar, tVarO, iT, iP, fVar.f181793b);
        }
        return this;
    }

    public final t<K, V> p(int i14, int i15, f<K, V> fVar) {
        fVar.g(fVar.f181797f - 1);
        fVar.f181795d = x(i14);
        Object[] objArr = this.f181814d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f181813c != fVar.f181793b) {
            return new t<>(i15 ^ this.f181811a, this.f181812b, x.e(i14, objArr), fVar.f181793b);
        }
        this.f181814d = x.e(i14, objArr);
        this.f181811a ^= i15;
        return this;
    }

    public final t<K, V> q(t<K, V> tVar, t<K, V> tVar2, int i14, int i15, y3.d dVar) {
        y3.d dVar2 = this.f181813c;
        if (tVar2 != null) {
            return (dVar2 == dVar || tVar != tVar2) ? r(i14, tVar2, dVar) : this;
        }
        Object[] objArr = this.f181814d;
        if (objArr.length == 1) {
            return null;
        }
        if (dVar2 != dVar) {
            return new t<>(this.f181811a, i15 ^ this.f181812b, x.f(i14, objArr), dVar);
        }
        this.f181814d = x.f(i14, objArr);
        this.f181812b ^= i15;
        return this;
    }

    public final t<K, V> r(int i14, t<K, V> tVar, y3.d dVar) {
        Object[] objArr = this.f181814d;
        if (objArr.length == 1 && tVar.f181814d.length == 2 && tVar.f181812b == 0) {
            tVar.f181811a = this.f181812b;
            return tVar;
        }
        if (this.f181813c == dVar) {
            objArr[i14] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i14] = tVar;
        return new t<>(this.f181811a, this.f181812b, objArrCopyOf, dVar);
    }

    public final t<K, V> s(int i14) {
        Object obj = this.f181814d[i14];
        obj.getClass();
        return (t) obj;
    }

    public final int t(int i14) {
        return (this.f181814d.length - 1) - Integer.bitCount((i14 - 1) & this.f181812b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        r13.f181815a = w(r11, r4, r13.f181815a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b<K, V> u(int i14, K k14, V v14, int i15) {
        b<K, V> bVar;
        b<K, V> bVarU;
        int iP = 1 << x.p(i14, i15);
        if (h(iP)) {
            bVar = null;
            int iF = f(iP);
            if (!p005kotlin.jvm.internal.s.g(k14, this.f181814d[iF])) {
                return new b<>(new t(this.f181811a ^ iP, this.f181812b | iP, a(iF, iP, i14, k14, v14, i15, null)), 1);
            }
            if (x(iF) != v14) {
                Object[] objArr = this.f181814d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = v14;
                return new b<>(new t(this.f181811a, this.f181812b, objArrCopyOf), 0);
            }
        } else {
            bVar = null;
            if (!i(iP)) {
                return new b<>(new t(this.f181811a | iP, this.f181812b, x.d(this.f181814d, f(iP), k14, v14)), 1);
            }
            int iT = t(iP);
            t<K, V> tVarS = s(iT);
            if (i15 == 30) {
                j23.j jVarN = j23.t.n(2, j23.t.o(0, tVarS.f181814d.length));
                int i16 = jVarN.f96796a;
                int i17 = jVarN.f96797b;
                int i18 = jVarN.f96798c;
                if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                    while (true) {
                        if (!p005kotlin.jvm.internal.s.g(k14, tVarS.f181814d[i16])) {
                            if (i16 == i17) {
                                bVarU = new b<>(new t(0, 0, x.d(tVarS.f181814d, 0, k14, v14)), 1);
                                break;
                            }
                            i16 += i18;
                        } else {
                            if (v14 != tVarS.x(i16)) {
                                Object[] objArr2 = tVarS.f181814d;
                                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                objArrCopyOf2[i16 + 1] = v14;
                                bVarU = new b<>(new t(0, 0, objArrCopyOf2), 0);
                                break;
                            }
                            bVarU = null;
                            break;
                        }
                    }
                } else {
                    bVarU = new b<>(new t(0, 0, x.d(tVarS.f181814d, 0, k14, v14)), 1);
                    break;
                }
            } else {
                bVarU = tVarS.u(i14, k14, v14, i15 + 5);
            }
        }
        return bVar;
    }

    public final t v(int i14, int i15, Object obj) {
        t<K, V> tVarV;
        int iP = 1 << x.p(i14, i15);
        if (h(iP)) {
            int iF = f(iP);
            if (p005kotlin.jvm.internal.s.g(obj, this.f181814d[iF])) {
                Object[] objArr = this.f181814d;
                if (objArr.length != 2) {
                    return new t(this.f181811a ^ iP, this.f181812b, x.e(iF, objArr));
                }
                return null;
            }
            return this;
        }
        if (i(iP)) {
            int iT = t(iP);
            t<K, V> tVarS = s(iT);
            if (i15 == 30) {
                j23.j jVarN = j23.t.n(2, j23.t.o(0, tVarS.f181814d.length));
                int i16 = jVarN.f96796a;
                int i17 = jVarN.f96797b;
                int i18 = jVarN.f96798c;
                if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                    while (true) {
                        if (!p005kotlin.jvm.internal.s.g(obj, tVarS.f181814d[i16])) {
                            if (i16 == i17) {
                                tVarV = tVarS;
                                break;
                            }
                            i16 += i18;
                        } else {
                            Object[] objArr2 = tVarS.f181814d;
                            if (objArr2.length != 2) {
                                tVarV = new t<>(0, 0, x.e(i16, objArr2));
                                break;
                            }
                            tVarV = null;
                            break;
                        }
                    }
                } else {
                    tVarV = tVarS;
                    break;
                }
            } else {
                tVarV = tVarS.v(i14, i15 + 5, obj);
            }
            if (tVarV == null) {
                Object[] objArr3 = this.f181814d;
                if (objArr3.length != 1) {
                    return new t(this.f181811a, iP ^ this.f181812b, x.f(iT, objArr3));
                }
                return null;
            }
            if (tVarS != tVarV) {
                return w(iT, iP, tVarV);
            }
        }
        return this;
    }

    public final t<K, V> w(int i14, int i15, t<K, V> tVar) {
        Object[] objArr = tVar.f181814d;
        if (objArr.length != 2 || tVar.f181812b != 0) {
            Object[] objArr2 = this.f181814d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i14] = tVar;
            return new t<>(this.f181811a, this.f181812b, objArrCopyOf);
        }
        if (this.f181814d.length == 1) {
            tVar.f181811a = this.f181812b;
            return tVar;
        }
        int iF = f(i15);
        Object[] objArr3 = this.f181814d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        p13.s.h(objArrCopyOf2, objArrCopyOf2, i14 + 2, i14 + 1, objArr3.length);
        p13.s.h(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i14);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new t<>(this.f181811a ^ i15, i15 ^ this.f181812b, objArrCopyOf2);
    }

    public final V x(int i14) {
        return (V) this.f181814d[i14 + 1];
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw3/t$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public t(int i14, int i15, Object[] objArr) {
        this(i14, i15, objArr, null);
    }
}
