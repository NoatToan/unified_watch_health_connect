package s3;

import ch.qos.logback.core.CoreConstants;
import e23.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.h0;
import p1.i0;
import p1.j0;
import p1.q;
import p1.q0;
import p13.s;
import p3.j2;
import p3.s0;
import p3.u0;
import p3.z2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ls3/l;", "", "Ls3/i;", "table", "<init>", "(Ls3/i;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f156362y = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f156363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f156364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f156365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<b> f156366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<b, c> f156367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0<j0> f156368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f156369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f156371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f156373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f156374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f156375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f156376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f156377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u0 f156378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u0 f156379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u0 f156380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i0<q0<Object>> f156381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f156382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f156383u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f156384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f156385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h0 f156386x;

    public l(i iVar) {
        this.f156363a = iVar;
        int[] iArr = iVar.f156348a;
        this.f156364b = iArr;
        Object[] objArr = iVar.f156350c;
        this.f156365c = objArr;
        this.f156366d = iVar.f156356i;
        this.f156367e = iVar.f156357j;
        this.f156368f = iVar.f156358k;
        int i14 = iVar.f156349b;
        this.f156369g = i14;
        this.f156370h = (iArr.length / 5) - i14;
        int i15 = iVar.f156351d;
        this.f156373k = i15;
        this.f156374l = objArr.length - i15;
        this.f156375m = i14;
        this.f156378p = new u0();
        this.f156379q = new u0();
        this.f156380r = new u0();
        this.f156383u = iVar.f156349b;
        this.f156384v = -1;
    }

    public static int i(int i14, int i15, int i16, int i17) {
        return i14 > i15 ? -(((i17 - i16) - i14) + 1) : i14;
    }

    public static void z(l lVar) {
        int i14 = lVar.f156384v;
        int iR = lVar.r(i14);
        int[] iArr = lVar.f156364b;
        int i15 = (iR * 5) + 1;
        int i16 = iArr[i15];
        if ((i16 & 134217728) != 0) {
            return;
        }
        int i17 = (i16 & (-134217729)) | 134217728;
        iArr[i15] = i17;
        if ((67108864 & i17) != 0) {
            return;
        }
        lVar.X(lVar.G(i14, iArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(i iVar, int i14) {
        if (this.f156376n <= 0) {
            p3.n.a("Check failed");
        }
        boolean z14 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i14 == 0 && this.f156382t == 0 && this.f156363a.f156349b == 0) {
            int iA = k.a(i14, iVar.f156348a);
            int i15 = iVar.f156349b;
            if (iA == i15) {
                int[] iArr = this.f156364b;
                Object[] objArr3 = this.f156365c;
                ArrayList<b> arrayList = this.f156366d;
                HashMap<b, c> map = this.f156367e;
                i0<j0> i0Var = this.f156368f;
                int[] iArr2 = iVar.f156348a;
                Object[] objArr4 = iVar.f156350c;
                int i16 = iVar.f156351d;
                HashMap<b, c> map2 = iVar.f156357j;
                i0<j0> i0Var2 = iVar.f156358k;
                this.f156364b = iArr2;
                this.f156365c = objArr4;
                this.f156366d = iVar.f156356i;
                this.f156369g = i15;
                this.f156370h = (iArr2.length / 5) - i15;
                this.f156373k = i16;
                this.f156374l = objArr4.length - i16;
                this.f156375m = i15;
                this.f156367e = map2;
                this.f156368f = i0Var2;
                iVar.f156348a = iArr;
                iVar.f156349b = objArr2 == true ? 1 : 0;
                iVar.f156350c = objArr3;
                iVar.f156351d = objArr == true ? 1 : 0;
                iVar.f156356i = arrayList;
                iVar.f156357j = map;
                iVar.f156358k = i0Var;
                return;
            }
        }
        l lVarH = iVar.h();
        try {
            f156362y.getClass();
            a.a(lVarH, i14, this, true, true, false);
            boolean z15 = true;
        } finally {
            lVarH.e(z14);
        }
    }

    public final void B(int i14) {
        b bVar;
        int i15;
        b bVar2;
        int i16;
        int i17;
        int i18 = this.f156370h;
        int i19 = this.f156369g;
        if (i19 != i14) {
            if (!this.f156366d.isEmpty()) {
                int iO = o() - this.f156370h;
                ArrayList<b> arrayList = this.f156366d;
                if (i19 < i14) {
                    for (int iB = k.b(arrayList, i19, iO); iB < this.f156366d.size() && (i16 = (bVar2 = this.f156366d.get(iB)).f156318a) < 0 && (i17 = i16 + iO) < i14; iB++) {
                        bVar2.f156318a = i17;
                    }
                } else {
                    for (int iB2 = k.b(arrayList, i14, iO); iB2 < this.f156366d.size() && (i15 = (bVar = this.f156366d.get(iB2)).f156318a) >= 0; iB2++) {
                        bVar.f156318a = -(iO - i15);
                    }
                }
            }
            if (i18 > 0) {
                int[] iArr = this.f156364b;
                int i24 = i14 * 5;
                int i25 = i18 * 5;
                int i26 = i19 * 5;
                if (i14 < i19) {
                    s.d(i25 + i24, i24, i26, iArr, iArr);
                } else {
                    s.d(i26, i26 + i25, i24 + i25, iArr, iArr);
                }
            }
            if (i14 < i19) {
                i19 = i14 + i18;
            }
            int iO2 = o();
            if (i19 >= iO2) {
                p3.n.a("Check failed");
            }
            while (i19 < iO2) {
                int i27 = (i19 * 5) + 2;
                int i28 = this.f156364b[i27];
                int iP = i28 > -2 ? i28 : (p() + i28) - (-2);
                if (iP >= i14) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i28) {
                    this.f156364b[i27] = iP;
                }
                i19++;
                if (i19 == i14) {
                    i19 += i18;
                }
            }
        }
        this.f156369g = i14;
    }

    public final void C(int i14, int i15) {
        int i16 = this.f156374l;
        int i17 = this.f156373k;
        int i18 = this.f156375m;
        if (i17 != i14) {
            Object[] objArr = this.f156365c;
            if (i14 < i17) {
                System.arraycopy(objArr, i14, objArr, i14 + i16, i17 - i14);
            } else {
                int i19 = i17 + i16;
                System.arraycopy(objArr, i19, objArr, i17, (i14 + i16) - i19);
            }
        }
        int iMin = Math.min(i15 + 1, p());
        if (i18 != iMin) {
            int length = this.f156365c.length - i16;
            if (iMin < i18) {
                int iR = r(iMin);
                int iR2 = r(i18);
                int i24 = this.f156369g;
                while (iR < iR2) {
                    int i25 = (iR * 5) + 4;
                    int i26 = this.f156364b[i25];
                    if (!(i26 >= 0)) {
                        p3.n.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f156364b[i25] = -((length - i26) + 1);
                    iR++;
                    if (iR == i24) {
                        iR += this.f156370h;
                    }
                }
            } else {
                int iR3 = r(i18);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i27 = (iR3 * 5) + 4;
                    int i28 = this.f156364b[i27];
                    if (!(i28 < 0)) {
                        p3.n.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f156364b[i27] = i28 + length + 1;
                    iR3++;
                    if (iR3 == this.f156369g) {
                        iR3 += this.f156370h;
                    }
                }
            }
            this.f156375m = iMin;
        }
        this.f156373k = i14;
    }

    public final List D(b bVar, l lVar) {
        if (lVar.f156376n <= 0) {
            p3.n.a("Check failed");
        }
        if (this.f156376n != 0) {
            p3.n.a("Check failed");
        }
        if (!bVar.getValid()) {
            p3.n.a("Check failed");
        }
        int iC = c(bVar) + 1;
        int i14 = this.f156382t;
        if (i14 > iC || iC >= this.f156383u) {
            p3.n.a("Check failed");
        }
        int iG = G(iC, this.f156364b);
        int iU = u(iC);
        int iF = y(iC) ? 1 : F(iC);
        f156362y.getClass();
        List listA = a.a(this, iC, lVar, false, false, true);
        X(iG);
        boolean z14 = iF > 0;
        while (iG >= i14) {
            int iR = r(iG);
            int[] iArr = this.f156364b;
            int i15 = iR * 5;
            iArr[i15 + 3] = k.a(iR, iArr) - iU;
            if (z14) {
                int[] iArr2 = this.f156364b;
                int i16 = iArr2[i15 + 1];
                if ((1073741824 & i16) != 0) {
                    z14 = false;
                } else {
                    k.d(iR, (i16 & 67108863) - iF, iArr2);
                }
            }
            iG = G(iG, this.f156364b);
        }
        if (z14) {
            if (this.f156377o < iF) {
                p3.n.a("Check failed");
            }
            this.f156377o -= iF;
        }
        return listA;
    }

    public final Object E(int i14) {
        int iR = r(i14);
        int[] iArr = this.f156364b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f156365c[h(g(iR, iArr))];
        }
        return null;
    }

    public final int F(int i14) {
        return this.f156364b[(r(i14) * 5) + 1] & 67108863;
    }

    public final int G(int i14, int[] iArr) {
        int i15 = iArr[(r(i14) * 5) + 2];
        return i15 > -2 ? i15 : (p() + i15) - (-2);
    }

    public final Object H(Object obj) {
        if (this.f156376n > 0) {
            x(1, this.f156384v);
        }
        Object[] objArr = this.f156365c;
        int i14 = this.f156371i;
        this.f156371i = i14 + 1;
        Object obj2 = objArr[h(i14)];
        if (this.f156371i > this.f156372j) {
            p3.n.a("Writing to an invalid slot");
        }
        this.f156365c[h(this.f156371i - 1)] = obj;
        return obj2;
    }

    public final void I() {
        int i14;
        h0 h0Var = this.f156386x;
        if (h0Var != null) {
            while (h0Var.f134763b != 0) {
                int iB = f.b(h0Var);
                int iR = r(iB);
                int iU = iB + 1;
                int iU2 = u(iB) + iB;
                while (true) {
                    if (iU >= iU2) {
                        i14 = 0;
                        break;
                    } else {
                        if ((this.f156364b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i14 = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.f156364b;
                int i15 = (iR * 5) + 1;
                int i16 = iArr[i15];
                if (((67108864 & i16) != 0 ? 1 : 0) != i14) {
                    iArr[i15] = (i14 << 26) | ((-67108865) & i16);
                    int iG = G(iB, iArr);
                    if (iG >= 0) {
                        f.a(h0Var, iG);
                    }
                }
            }
        }
    }

    public final boolean J() {
        b bVarU;
        if (!(this.f156376n == 0)) {
            p3.n.a("Cannot remove group while inserting");
        }
        int i14 = this.f156382t;
        int i15 = this.f156371i;
        int iG = g(r(i14), this.f156364b);
        int iN = N();
        c cVarQ = Q(this.f156384v);
        if (cVarQ != null && (bVarU = U(i14)) != null) {
            cVarQ.f(bVarU);
        }
        h0 h0Var = this.f156386x;
        if (h0Var != null) {
            while (true) {
                int i16 = h0Var.f134763b;
                if (i16 == 0) {
                    break;
                }
                if (i16 == 0) {
                    n23.j.s("IntList is empty.");
                    return false;
                }
                if (h0Var.f134762a[0] < i14) {
                    break;
                }
                f.b(h0Var);
            }
        }
        boolean zK = K(i14, this.f156382t - i14);
        L(iG, this.f156371i - iG, i14 - 1);
        this.f156382t = i14;
        this.f156371i = i15;
        this.f156377o -= iN;
        return zK;
    }

    public final boolean K(int i14, int i15) {
        boolean z14 = false;
        if (i15 > 0) {
            ArrayList<b> arrayList = this.f156366d;
            B(i14);
            if (!arrayList.isEmpty()) {
                HashMap<b, c> map = this.f156367e;
                int i16 = i14 + i15;
                int iB = k.b(this.f156366d, i16, o() - this.f156370h);
                if (iB >= this.f156366d.size()) {
                    iB--;
                }
                int i17 = iB + 1;
                int i18 = 0;
                while (iB >= 0) {
                    b bVar = this.f156366d.get(iB);
                    int iC = c(bVar);
                    if (iC < i14) {
                        break;
                    }
                    if (iC < i16) {
                        bVar.f156318a = Integer.MIN_VALUE;
                        if (map != null) {
                            map.remove(bVar);
                        }
                        if (i18 == 0) {
                            i18 = iB + 1;
                        }
                        i17 = iB;
                    }
                    iB--;
                }
                z14 = i17 < i18;
                if (z14) {
                    this.f156366d.subList(i17, i18).clear();
                }
            }
            this.f156369g = i14;
            this.f156370h += i15;
            int i19 = this.f156375m;
            if (i19 > i14) {
                this.f156375m = Math.max(i14, i19 - i15);
            }
            int i24 = this.f156383u;
            if (i24 >= this.f156369g) {
                this.f156383u = i24 - i15;
            }
            int i25 = this.f156384v;
            if (i25 >= 0 && (this.f156364b[(r(i25) * 5) + 1] & 67108864) != 0) {
                X(i25);
            }
        }
        return z14;
    }

    public final void L(int i14, int i15, int i16) {
        if (i15 > 0) {
            int i17 = this.f156374l;
            int i18 = i14 + i15;
            C(i18, i16);
            this.f156373k = i14;
            this.f156374l = i17 + i15;
            s.m(i14, i18, null, this.f156365c);
            int i19 = this.f156372j;
            if (i19 >= i14) {
                this.f156372j = i19 - i15;
            }
        }
    }

    public final Object M(int i14, int i15, Object obj) {
        int iP = P(r(i14), this.f156364b);
        int iG = g(r(i14 + 1), this.f156364b);
        int i16 = iP + i15;
        if (i16 < iP || i16 >= iG) {
            p3.n.a("Write to an invalid slot index " + i15 + " for group " + i14);
        }
        int iH = h(i16);
        Object[] objArr = this.f156365c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int N() {
        int iR = r(this.f156382t);
        int iA = k.a(iR, this.f156364b) + this.f156382t;
        this.f156382t = iA;
        this.f156371i = g(r(iA), this.f156364b);
        int i14 = this.f156364b[(iR * 5) + 1];
        if ((1073741824 & i14) != 0) {
            return 1;
        }
        return i14 & 67108863;
    }

    public final void O() {
        int i14 = this.f156383u;
        this.f156382t = i14;
        this.f156371i = g(r(i14), this.f156364b);
    }

    public final int P(int i14, int[] iArr) {
        if (i14 >= o()) {
            return this.f156365c.length - this.f156374l;
        }
        int iC = k.c(i14, iArr);
        return iC < 0 ? (this.f156365c.length - this.f156374l) + iC + 1 : iC;
    }

    public final c Q(int i14) {
        b bVarU;
        HashMap<b, c> map = this.f156367e;
        if (map == null || (bVarU = U(i14)) == null) {
            return null;
        }
        return map.get(bVarU);
    }

    public final void R() {
        if (this.f156376n != 0) {
            p3.n.a("Key must be supplied when inserting");
        }
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        T(c2565a, 0, c2565a, false);
    }

    public final void S(int i14, Object obj) {
        p3.m.f135153a.getClass();
        T(obj, i14, p3.m.a.f135155b, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(Object obj, int i14, Object obj2, boolean z14) {
        int i15;
        c cVarQ;
        int i16 = this.f156384v;
        Object[] objArr = this.f156376n > 0;
        this.f156380r.c(this.f156377o);
        p3.m.a aVar = p3.m.f135153a;
        if (objArr == true) {
            int i17 = this.f156382t;
            int iG = g(r(i17), this.f156364b);
            w(1);
            this.f156371i = iG;
            this.f156372j = iG;
            int iR = r(i17);
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            int i18 = obj != c2565a ? 1 : 0;
            int i19 = (z14 || obj2 == c2565a) ? 0 : 1;
            int i24 = i(iG, this.f156373k, this.f156374l, this.f156365c.length);
            if (i24 >= 0 && this.f156375m < i17) {
                i24 = -(((this.f156365c.length - this.f156374l) - i24) + 1);
            }
            int[] iArr = this.f156364b;
            int i25 = this.f156384v;
            int i26 = iR * 5;
            iArr[i26] = i14;
            iArr[i26 + 1] = ((z14 ? 1 : 0) << 30) | (i18 << 29) | (i19 << 28);
            iArr[i26 + 2] = i25;
            iArr[i26 + 3] = 0;
            iArr[i26 + 4] = i24;
            int i27 = (z14 ? 1 : 0) + i18 + i19;
            if (i27 > 0) {
                x(i27, i17);
                Object[] objArr2 = this.f156365c;
                int i28 = this.f156371i;
                if (z14) {
                    objArr2[i28] = obj2;
                    i28++;
                }
                if (i18 != 0) {
                    objArr2[i28] = obj;
                    i28++;
                }
                if (i19 != 0) {
                    objArr2[i28] = obj2;
                    i28++;
                }
                this.f156371i = i28;
            }
            this.f156377o = 0;
            i15 = i17 + 1;
            this.f156384v = i17;
            this.f156382t = i15;
            if (i16 >= 0 && (cVarQ = Q(i16)) != null) {
                c cVarE = cVarQ.e();
                b bVarB = b(i17);
                ArrayList<Object> arrayList = cVarE.f156322d;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                cVarE.f156322d = arrayList;
                arrayList.add(bVarB);
            }
        } else {
            this.f156378p.c(i16);
            this.f156379q.c((o() - this.f156370h) - this.f156383u);
            int i29 = this.f156382t;
            int iR2 = r(i29);
            aVar.getClass();
            if (!p005kotlin.jvm.internal.s.g(obj2, p3.m.a.f135155b)) {
                if (z14) {
                    Y(this.f156382t, obj2);
                } else {
                    W(obj2);
                }
            }
            this.f156371i = P(iR2, this.f156364b);
            this.f156372j = g(r(this.f156382t + 1), this.f156364b);
            int[] iArr2 = this.f156364b;
            int i30 = iR2 * 5;
            this.f156377o = iArr2[i30 + 1] & 67108863;
            this.f156384v = i29;
            this.f156382t = i29 + 1;
            i15 = i29 + iArr2[i30 + 3];
        }
        this.f156383u = i15;
    }

    public final b U(int i14) {
        ArrayList<b> arrayList;
        int iF;
        if (i14 < 0 || i14 >= p() || (iF = k.f((arrayList = this.f156366d), i14, p())) < 0) {
            return null;
        }
        return arrayList.get(iF);
    }

    public final void V(Object obj) {
        if (this.f156376n <= 0 || this.f156371i == this.f156373k) {
            H(obj);
            return;
        }
        i0<q0<Object>> i0Var = this.f156381s;
        p005kotlin.jvm.internal.j jVar = null;
        int i14 = 1;
        int i15 = 0;
        if (i0Var == null) {
            i0Var = new i0<>(0, 1, null);
        }
        this.f156381s = i0Var;
        int i16 = this.f156384v;
        q0<Object> q0VarB = i0Var.b(i16);
        if (q0VarB == null) {
            q0VarB = new q0<>(i15, i14, jVar);
            i0Var.i(i16, q0VarB);
        }
        q0VarB.g(obj);
        p3.m.f135153a.getClass();
        p3.m.a aVar = p3.m.a.f135154a;
    }

    public final void W(Object obj) {
        int iR = r(this.f156382t);
        int i14 = (iR * 5) + 1;
        if ((this.f156364b[i14] & 268435456) == 0) {
            p3.n.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f156365c;
        int[] iArr = this.f156364b;
        objArr[h(Integer.bitCount(iArr[i14] >> 29) + g(iR, iArr))] = obj;
    }

    public final void X(int i14) {
        if (i14 >= 0) {
            h0 h0Var = this.f156386x;
            if (h0Var == null) {
                h0Var = new h0(0, 1, null);
                this.f156386x = h0Var;
            }
            f.a(h0Var, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void Y(int i14, Object obj) {
        boolean z14;
        int iR = r(i14);
        int[] iArr = this.f156364b;
        if (iR < iArr.length) {
            z14 = (iArr[(iR * 5) + 1] & 1073741824) != 0;
        }
        if (!z14) {
            p3.n.a("Updating the node of a group at " + i14 + " that was not created with as a node group");
        }
        this.f156365c[h(g(iR, this.f156364b))] = obj;
    }

    public final void a(int i14) {
        boolean z14 = false;
        if (!(i14 >= 0)) {
            p3.n.a("Cannot seek backwards");
        }
        if (!(this.f156376n <= 0)) {
            j2.b("Cannot call seek() while inserting");
        }
        if (i14 == 0) {
            return;
        }
        int i15 = this.f156382t + i14;
        if (i15 >= this.f156384v && i15 <= this.f156383u) {
            z14 = true;
        }
        if (!z14) {
            p3.n.a("Cannot seek outside the current group (" + this.f156384v + '-' + this.f156383u + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        this.f156382t = i15;
        int iG = g(r(i15), this.f156364b);
        this.f156371i = iG;
        this.f156372j = iG;
    }

    public final b b(int i14) {
        ArrayList<b> arrayList = this.f156366d;
        int iF = k.f(arrayList, i14, p());
        if (iF >= 0) {
            return arrayList.get(iF);
        }
        if (i14 > this.f156369g) {
            i14 = -(p() - i14);
        }
        b bVar = new b(i14);
        arrayList.add(-(iF + 1), bVar);
        return bVar;
    }

    public final int c(b bVar) {
        int i14 = bVar.f156318a;
        return i14 < 0 ? p() + i14 : i14;
    }

    public final void d() {
        int i14 = this.f156376n;
        this.f156376n = i14 + 1;
        if (i14 == 0) {
            this.f156379q.c((o() - this.f156370h) - this.f156383u);
        }
    }

    public final void e(boolean z14) {
        this.f156385w = true;
        if (z14 && this.f156378p.f135320b == 0) {
            B(p());
            C(this.f156365c.length - this.f156374l, this.f156369g);
            int i14 = this.f156373k;
            s.m(i14, this.f156374l + i14, null, this.f156365c);
            I();
        }
        int[] iArr = this.f156364b;
        int i15 = this.f156369g;
        Object[] objArr = this.f156365c;
        int i16 = this.f156373k;
        ArrayList<b> arrayList = this.f156366d;
        HashMap<b, c> map = this.f156367e;
        i0<j0> i0Var = this.f156368f;
        i iVar = this.f156363a;
        iVar.getClass();
        if (!iVar.f156354g) {
            j2.a("Unexpected writer close()");
        }
        iVar.f156354g = false;
        iVar.f156348a = iArr;
        iVar.f156349b = i15;
        iVar.f156350c = objArr;
        iVar.f156351d = i16;
        iVar.f156356i = arrayList;
        iVar.f156357j = map;
        iVar.f156358k = i0Var;
    }

    public final int f(int i14) {
        return g(r(i14), this.f156364b);
    }

    public final int g(int i14, int[] iArr) {
        if (i14 >= o()) {
            return this.f156365c.length - this.f156374l;
        }
        int i15 = iArr[(i14 * 5) + 4];
        return i15 < 0 ? (this.f156365c.length - this.f156374l) + i15 + 1 : i15;
    }

    public final int h(int i14) {
        return (this.f156374l * (i14 < this.f156373k ? 0 : 1)) + i14;
    }

    public final void j() {
        q0<Object> q0VarB;
        boolean z14 = this.f156376n > 0;
        int i14 = this.f156382t;
        int i15 = this.f156383u;
        int i16 = this.f156384v;
        int iR = r(i16);
        int i17 = this.f156377o;
        int i18 = i14 - i16;
        int i19 = iR * 5;
        int i24 = i19 + 1;
        boolean z15 = (this.f156364b[i24] & 1073741824) != 0;
        u0 u0Var = this.f156380r;
        if (z14) {
            i0<q0<Object>> i0Var = this.f156381s;
            if (i0Var != null && (q0VarB = i0Var.b(i16)) != null) {
                Object[] objArr = q0VarB.f134667a;
                int i25 = q0VarB.f134668b;
                for (int i26 = 0; i26 < i25; i26++) {
                    H(objArr[i26]);
                }
                i0Var.g(i16);
            }
            int[] iArr = this.f156364b;
            iArr[i19 + 3] = i18;
            k.d(iR, i17, iArr);
            int iB = u0Var.b();
            if (z15) {
                i17 = 1;
            }
            this.f156377o = iB + i17;
            int iG = G(i16, this.f156364b);
            this.f156384v = iG;
            int iP = iG < 0 ? p() : r(iG + 1);
            int iG2 = iP >= 0 ? g(iP, this.f156364b) : 0;
            this.f156371i = iG2;
            this.f156372j = iG2;
            return;
        }
        if (i14 != i15) {
            p3.n.a("Expected to be at the end of a group");
        }
        int iA = k.a(iR, this.f156364b);
        int[] iArr2 = this.f156364b;
        int i27 = iArr2[i24] & 67108863;
        iArr2[i19 + 3] = i18;
        k.d(iR, i17, iArr2);
        int iB2 = this.f156378p.b();
        this.f156383u = (o() - this.f156370h) - this.f156379q.b();
        this.f156384v = iB2;
        int iG3 = G(i16, this.f156364b);
        int iB3 = u0Var.b();
        this.f156377o = iB3;
        if (iG3 == iB2) {
            this.f156377o = iB3 + (z15 ? 0 : i17 - i27);
            return;
        }
        int i28 = i18 - iA;
        int i29 = z15 ? 0 : i17 - i27;
        if (i28 != 0 || i29 != 0) {
            while (iG3 != 0 && iG3 != iB2 && (i29 != 0 || i28 != 0)) {
                int iR2 = r(iG3);
                if (i28 != 0) {
                    this.f156364b[(iR2 * 5) + 3] = k.a(iR2, this.f156364b) + i28;
                }
                if (i29 != 0) {
                    int[] iArr3 = this.f156364b;
                    k.d(iR2, (iArr3[(iR2 * 5) + 1] & 67108863) + i29, iArr3);
                }
                int[] iArr4 = this.f156364b;
                if ((iArr4[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i29 = 0;
                }
                iG3 = G(iG3, iArr4);
            }
        }
        this.f156377o += i29;
    }

    public final void k() {
        if (this.f156376n <= 0) {
            j2.b("Unbalanced begin/end insert");
        }
        int i14 = this.f156376n - 1;
        this.f156376n = i14;
        if (i14 == 0) {
            if (this.f156380r.f135320b != this.f156378p.f135320b) {
                p3.n.a("startGroup/endGroup mismatch while inserting");
            }
            this.f156383u = (o() - this.f156370h) - this.f156379q.b();
        }
    }

    public final void l(int i14) {
        boolean z14 = false;
        if (!(this.f156376n <= 0)) {
            p3.n.a("Cannot call ensureStarted() while inserting");
        }
        int i15 = this.f156384v;
        if (i15 != i14) {
            if (i14 >= i15 && i14 < this.f156383u) {
                z14 = true;
            }
            if (!z14) {
                p3.n.a("Started group at " + i14 + " must be a subgroup of the group at " + i15);
            }
            int i16 = this.f156382t;
            int i17 = this.f156371i;
            int i18 = this.f156372j;
            this.f156382t = i14;
            R();
            this.f156382t = i16;
            this.f156371i = i17;
            this.f156372j = i18;
        }
    }

    public final void m(int i14, int i15, int i16) {
        if (i14 >= this.f156369g) {
            i14 = -((p() - i14) + 2);
        }
        while (i16 < i15) {
            this.f156364b[(r(i16) * 5) + 2] = i14;
            int iA = k.a(r(i16), this.f156364b) + i16;
            m(i16, iA, i16 + 1);
            i16 = iA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    public final void n(int i14, p<? super Integer, Object, Unit> pVar) {
        int i15;
        int i16;
        int i17;
        int i18;
        p005kotlin.jvm.internal.j jVar;
        int iG = G(i14, this.f156364b);
        int iP = p();
        int iU = u(i14) + i14;
        int i19 = i14;
        j0 j0Var = null;
        h0 h0Var = null;
        while (i19 < iU) {
            int iF = f(i19);
            int i24 = i19 + 1;
            int iF2 = f(i24);
            while (iF < iF2) {
                Object obj = this.f156365c[h(iF)];
                if (obj instanceof z2) {
                    z2 z2Var = (z2) obj;
                    s0 s0Var = z2Var instanceof s0 ? (s0) z2Var : null;
                    if (s0Var == null) {
                        p3.n.b("Inconsistent composition");
                        o2.c.f();
                        return;
                    }
                    int i25 = s0Var.f135270b;
                    if (i25 >= 0) {
                        int iU2 = u(i19) + i19;
                        int iA = i24;
                        int i26 = 0;
                        while (iA < iU2 && i26 < i25) {
                            int iR = r(iA);
                            int i27 = iU;
                            iA += k.a(iR, this.f156364b);
                            if (iA < iU2 && (this.f156364b[(iR * 5) + 1] & 536870912) == 0) {
                                i26++;
                            }
                            iU = i27;
                        }
                        i16 = iU;
                        if (j0Var == null) {
                            int[] iArr = q.f134798a;
                            i17 = 1;
                            i18 = 0;
                            jVar = null;
                            j0Var = new j0(i18, i17, jVar);
                        } else {
                            i17 = 1;
                            i18 = 0;
                            jVar = null;
                        }
                        if (h0Var == null) {
                            h0Var = new h0(i18, i17, jVar);
                        }
                        j0Var.b(iA);
                        h0Var.d(iA);
                        h0Var.d(iF);
                    } else {
                        i16 = iU;
                        pVar.invoke(Integer.valueOf(iF), obj);
                    }
                } else {
                    i16 = iU;
                    pVar.invoke(Integer.valueOf(iF), obj);
                }
                iF++;
                iG = iG;
                iU = i16;
            }
            int i28 = iG;
            int i29 = iU;
            int i30 = 0;
            int iG2 = i24 < iP ? G(i24, this.f156364b) : -1;
            if (iG2 != i19) {
                int i34 = i19;
                int iG3 = i28;
                while (true) {
                    if (h0Var != null && j0Var != null && j0Var.g(i34)) {
                        int i35 = h0Var.f134763b;
                        int i36 = i35 / 2;
                        int i37 = i30;
                        int i38 = i37;
                        while (i37 < i36) {
                            int i39 = i37 * 2;
                            int iA2 = h0Var.a(i39);
                            if (iA2 == i34) {
                                int iA3 = h0Var.a(i39 + 1);
                                pVar.invoke(Integer.valueOf(iA3), this.f156365c[h(iA3)]);
                            } else if (i39 != i38) {
                                int i44 = i38 + 1;
                                h0Var.g(i38, iA2);
                                i38 += 2;
                                h0Var.g(i44, h0Var.a(i39 + 1));
                            } else {
                                i38 += 2;
                            }
                            i37++;
                            pVar = pVar;
                        }
                        if (i38 != i35) {
                            if (i38 < 0 || i38 > (i15 = h0Var.f134763b) || i35 < 0 || i35 > i15) {
                                org.apache.commons.lang3.e.v("Index must be between 0 and size");
                                return;
                            }
                            if (i35 < i38) {
                                vb.h.s("The end index must be < start index");
                                return;
                            } else if (i35 != i38) {
                                if (i35 < i15) {
                                    int[] iArr2 = h0Var.f134762a;
                                    s.d(i38, i35, i15, iArr2, iArr2);
                                }
                                h0Var.f134763b -= i35 - i38;
                            }
                        }
                    }
                    if (i34 == i14 || iG3 == iG2) {
                        break;
                    }
                    pVar = pVar;
                    i34 = iG3;
                    iG3 = G(iG3, this.f156364b);
                    i30 = 0;
                }
            }
            iG = iG2;
            i19 = i24;
            iU = i29;
        }
    }

    public final int o() {
        return this.f156364b.length / 5;
    }

    public final int p() {
        return o() - this.f156370h;
    }

    public final Object q(int i14) {
        int iR = r(i14);
        int[] iArr = this.f156364b;
        int i15 = (iR * 5) + 1;
        if ((iArr[i15] & 268435456) == 0) {
            p3.m.f135153a.getClass();
            return p3.m.a.f135155b;
        }
        return this.f156365c[Integer.bitCount(iArr[i15] >> 29) + g(iR, iArr)];
    }

    public final int r(int i14) {
        return (this.f156370h * (i14 < this.f156369g ? 0 : 1)) + i14;
    }

    public final int s(int i14) {
        return this.f156364b[r(i14) * 5];
    }

    public final Object t(int i14) {
        int iR = r(i14);
        int[] iArr = this.f156364b;
        int i15 = iR * 5;
        int i16 = iArr[i15 + 1];
        if ((536870912 & i16) == 0) {
            return null;
        }
        return this.f156365c[Integer.bitCount(i16 >> 30) + iArr[i15 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f156382t + " end=" + this.f156383u + " size = " + p() + " gap=" + this.f156369g + '-' + (this.f156369g + this.f156370h) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final int u(int i14) {
        return k.a(r(i14), this.f156364b);
    }

    public final boolean v(int i14, int i15) {
        int iO;
        int iU;
        if (i15 == this.f156384v) {
            iO = this.f156383u;
        } else {
            u0 u0Var = this.f156378p;
            if (i15 > u0Var.a(0)) {
                iU = u(i15);
            } else {
                int[] iArr = u0Var.f135319a;
                int iMin = Math.min(iArr.length, u0Var.f135320b);
                int i16 = 0;
                while (true) {
                    if (i16 >= iMin) {
                        i16 = -1;
                        break;
                    }
                    if (iArr[i16] == i15) {
                        break;
                    }
                    i16++;
                }
                if (i16 < 0) {
                    iU = u(i15);
                } else {
                    iO = (o() - this.f156370h) - this.f156379q.f135319a[i16];
                }
            }
            iO = iU + i15;
        }
        return i14 > i15 && i14 < iO;
    }

    public final void w(int i14) {
        if (i14 > 0) {
            int i15 = this.f156382t;
            B(i15);
            int i16 = this.f156369g;
            int i17 = this.f156370h;
            int[] iArr = this.f156364b;
            int length = iArr.length / 5;
            int i18 = length - i17;
            if (i17 < i14) {
                int iMax = Math.max(Math.max(length * 2, i18 + i14), 32);
                int[] iArr2 = new int[iMax * 5];
                int i19 = iMax - i18;
                s.d(0, 0, i16 * 5, iArr, iArr2);
                s.d((i16 + i19) * 5, (i17 + i16) * 5, length * 5, iArr, iArr2);
                this.f156364b = iArr2;
                i17 = i19;
            }
            int i24 = this.f156383u;
            if (i24 >= i16) {
                this.f156383u = i24 + i14;
            }
            int i25 = i16 + i14;
            this.f156369g = i25;
            this.f156370h = i17 - i14;
            int i26 = i(i18 > 0 ? f(i15 + i14) : 0, this.f156375m >= i16 ? this.f156373k : 0, this.f156374l, this.f156365c.length);
            for (int i27 = i16; i27 < i25; i27++) {
                this.f156364b[(i27 * 5) + 4] = i26;
            }
            int i28 = this.f156375m;
            if (i28 >= i16) {
                this.f156375m = i28 + i14;
            }
        }
    }

    public final void x(int i14, int i15) {
        if (i14 > 0) {
            C(this.f156371i, i15);
            int i16 = this.f156373k;
            int i17 = this.f156374l;
            if (i17 < i14) {
                Object[] objArr = this.f156365c;
                int length = objArr.length;
                int i18 = length - i17;
                int iMax = Math.max(Math.max(length * 2, i18 + i14), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i19 = 0; i19 < iMax; i19++) {
                    objArr2[i19] = null;
                }
                int i24 = iMax - i18;
                int i25 = i17 + i16;
                System.arraycopy(objArr, 0, objArr2, 0, i16);
                System.arraycopy(objArr, i25, objArr2, i16 + i24, length - i25);
                this.f156365c = objArr2;
                i17 = i24;
            }
            int i26 = this.f156372j;
            if (i26 >= i16) {
                this.f156372j = i26 + i14;
            }
            this.f156373k = i16 + i14;
            this.f156374l = i17 - i14;
        }
    }

    public final boolean y(int i14) {
        return (this.f156364b[(r(i14) * 5) + 1] & 1073741824) != 0;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls3/l$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public static List a(l lVar, int i14, l lVar2, boolean z14, boolean z15, boolean z16) {
            List list;
            List list2;
            boolean z17;
            List list3;
            int i15;
            b bVarU;
            List list4;
            List list5;
            int iU = lVar.u(i14);
            int i16 = i14 + iU;
            int iF = lVar.f(i14);
            int iF2 = lVar.f(i16);
            int i17 = iF2 - iF;
            boolean z18 = i14 >= 0 && (lVar.f156364b[(lVar.r(i14) * 5) + 1] & 201326592) != 0;
            lVar2.w(iU);
            lVar2.x(i17, lVar2.f156382t);
            if (lVar.f156369g < i16) {
                lVar.B(i16);
            }
            if (lVar.f156373k < iF2) {
                lVar.C(iF2, i16);
            }
            int[] iArr = lVar2.f156364b;
            int i18 = lVar2.f156382t;
            int i19 = i18 * 5;
            s.d(i19, i14 * 5, i16 * 5, lVar.f156364b, iArr);
            Object[] objArr = lVar2.f156365c;
            int i24 = lVar2.f156371i;
            System.arraycopy(lVar.f156365c, iF, objArr, i24, i17);
            int i25 = lVar2.f156384v;
            iArr[i19 + 2] = i25;
            int i26 = i18 - i14;
            int i27 = i18 + iU;
            int iG = i24 - lVar2.g(i18, iArr);
            int i28 = lVar2.f156375m;
            int i29 = lVar2.f156374l;
            int length = objArr.length;
            boolean z19 = z18;
            int i30 = i28;
            int i34 = i18;
            while (i34 < i27) {
                if (i34 != i18) {
                    int i35 = (i34 * 5) + 2;
                    iArr[i35] = iArr[i35] + i26;
                }
                int[] iArr2 = iArr;
                iArr2[(i34 * 5) + 4] = l.i(lVar2.g(i34, iArr) + iG, i30 < i34 ? 0 : lVar2.f156373k, i29, length);
                if (i34 == i30) {
                    i30++;
                }
                i34++;
                i18 = i18;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            lVar2.f156375m = i30;
            int iB = k.b(lVar.f156366d, i14, lVar.p());
            int iB2 = k.b(lVar.f156366d, i16, lVar.p());
            if (iB < iB2) {
                ArrayList<b> arrayList = lVar.f156366d;
                ArrayList arrayList2 = new ArrayList(iB2 - iB);
                for (int i36 = iB; i36 < iB2; i36++) {
                    b bVar = arrayList.get(i36);
                    bVar.f156318a += i26;
                    arrayList2.add(bVar);
                }
                lVar2.f156366d.addAll(k.b(lVar2.f156366d, lVar2.f156382t, lVar2.p()), arrayList2);
                arrayList.subList(iB, iB2).clear();
                list = arrayList2;
            } else {
                list = p13.j0.f134944a;
            }
            List list6 = list;
            if (!list6.isEmpty()) {
                HashMap<b, c> map = lVar.f156367e;
                HashMap<b, c> map2 = lVar2.f156367e;
                if (map != null && map2 != null) {
                    int size = list6.size();
                    for (int i37 = 0; i37 < size; i37++) {
                        b bVar2 = (b) list.get(i37);
                        c cVar = map.get(bVar2);
                        if (cVar != null) {
                            map.remove(bVar2);
                            map2.put(bVar2, cVar);
                        }
                    }
                }
            }
            int i38 = lVar2.f156384v;
            c cVarQ = lVar2.Q(i25);
            if (cVarQ != null) {
                int iA = i38 + 1;
                int i39 = lVar2.f156382t;
                int i44 = -1;
                while (iA < i39) {
                    i44 = iA;
                    iA = k.a(iA, lVar2.f156364b) + iA;
                }
                ArrayList<Object> arrayList3 = cVarQ.f156322d;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    cVarQ.f156322d = arrayList3;
                }
                if (i44 >= 0 && (bVarU = lVar2.U(i44)) != null) {
                    int size2 = arrayList3.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size2) {
                            list4 = list;
                            list3 = list4;
                            i15 = -1;
                            break;
                        }
                        Object obj = arrayList3.get(i45);
                        if (p005kotlin.jvm.internal.s.g(obj, bVarU)) {
                            list4 = list;
                            list5 = list4;
                        } else {
                            list5 = list4;
                            if ((obj instanceof c) && ((c) obj).d(bVarU)) {
                                list4 = list;
                            } else {
                                list4 = list;
                                i45++;
                                list4 = list5;
                            }
                        }
                        i15 = i45;
                        list3 = list5;
                        break;
                    }
                }
                list3 = list;
                i15 = 0;
                arrayList3.add(i15, lVar2.b(i39));
                list2 = list3;
            } else {
                list2 = list;
            }
            int iG2 = lVar.G(i14, lVar.f156364b);
            if (!z16) {
                z17 = false;
            } else if (z14) {
                boolean z24 = iG2 >= 0;
                if (z24) {
                    lVar.R();
                    lVar.a(iG2 - lVar.f156382t);
                    lVar.R();
                }
                lVar.a(i14 - lVar.f156382t);
                boolean zJ = lVar.J();
                if (z24) {
                    lVar.O();
                    lVar.j();
                    lVar.O();
                    lVar.j();
                }
                z17 = zJ;
            } else {
                boolean zK = lVar.K(i14, iU);
                lVar.L(iF, i17, i14 - 1);
                z17 = zK;
            }
            if (z17) {
                p3.n.a("Unexpectedly removed anchors");
            }
            int i46 = lVar2.f156377o;
            int i47 = iArr3[i19 + 1];
            lVar2.f156377o = i46 + ((1073741824 & i47) != 0 ? 1 : i47 & 67108863);
            if (z15) {
                lVar2.f156382t = i27;
                lVar2.f156371i = i24 + i17;
            }
            if (z19) {
                lVar2.X(i25);
            }
            return list2;
        }

        private a() {
        }
    }
}
