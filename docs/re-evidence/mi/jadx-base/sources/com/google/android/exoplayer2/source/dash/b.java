package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.upstream.h;
import defpackage.ahd;
import defpackage.bk5;
import defpackage.brl;
import defpackage.dp0;
import defpackage.fxp;
import defpackage.gw3;
import defpackage.j98;
import defpackage.k9l;
import defpackage.mz5;
import defpackage.r61;
import defpackage.ra4;
import defpackage.sie;
import defpackage.tmk;
import defpackage.uqh;
import defpackage.wlq;
import defpackage.ye8;
import defpackage.ze8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements j, s.a<gw3<com.google.android.exoplayer2.source.dash.a>>, gw3.b<com.google.android.exoplayer2.source.dash.a> {
    public static final Pattern w = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern x = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.dash.a.InterfaceC0190a f8111b;
    public final fxp c;
    public final com.google.android.exoplayer2.drm.c d;
    public final h e;
    public final long f;
    public final sie g;
    public final r61 h;
    public final TrackGroupArray i;
    public final a[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ra4 f8112k;
    public final d l;
    public final l.a n;
    public final com.google.android.exoplayer2.drm.b.a o;
    public j.a p;
    public s s;
    public bk5 t;
    public int u;
    public List<ze8> v;
    public gw3<com.google.android.exoplayer2.source.dash.a>[] q = F(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ye8[] f8113r = new ye8[0];
    public final IdentityHashMap<gw3<com.google.android.exoplayer2.source.dash.a>, d.c> m = new IdentityHashMap<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f8114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8115b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f8115b = i;
            this.f8114a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
        }

        public static a a(int[] iArr, int i) {
            return new a(3, 1, iArr, i, -1, -1, -1);
        }

        public static a b(int[] iArr, int i) {
            return new a(5, 1, iArr, i, -1, -1, -1);
        }

        public static a c(int i) {
            return new a(5, 2, new int[0], -1, -1, -1, i);
        }

        public static a d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public b(int i, bk5 bk5Var, int i2, com.google.android.exoplayer2.source.dash.a.InterfaceC0190a interfaceC0190a, fxp fxpVar, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.drm.b.a aVar, h hVar, l.a aVar2, long j, sie sieVar, r61 r61Var, ra4 ra4Var, d.b bVar) {
        this.f8110a = i;
        this.t = bk5Var;
        this.u = i2;
        this.f8111b = interfaceC0190a;
        this.c = fxpVar;
        this.d = cVar;
        this.o = aVar;
        this.e = hVar;
        this.n = aVar2;
        this.f = j;
        this.g = sieVar;
        this.h = r61Var;
        this.f8112k = ra4Var;
        this.l = new d(bk5Var, bVar, r61Var);
        this.s = ra4Var.a(this.q);
        uqh uqhVarD = bk5Var.d(i2);
        List<ze8> list = uqhVarD.d;
        this.v = list;
        Pair<TrackGroupArray, a[]> pairV = v(cVar, uqhVarD.c, list);
        this.i = (TrackGroupArray) pairV.first;
        this.j = (a[]) pairV.second;
    }

    public static int[][] A(List<dp0> list) {
        int iMin;
        mz5 mz5VarW;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(list.get(i).f15770a, i);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            dp0 dp0Var = list.get(i2);
            mz5 mz5VarY = y(dp0Var.e);
            if (mz5VarY == null) {
                mz5VarY = y(dp0Var.f);
            }
            if (mz5VarY == null || (iMin = sparseIntArray.get(Integer.parseInt(mz5VarY.f27367b), -1)) == -1) {
                iMin = i2;
            }
            if (iMin == i2 && (mz5VarW = w(dp0Var.f)) != null) {
                for (String str : wlq.M0(mz5VarW.f27367b, ",")) {
                    int i3 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i3 != -1) {
                        iMin = Math.min(iMin, i3);
                    }
                }
            }
            if (iMin != i2) {
                List list2 = (List) sparseArray.get(i2);
                List list3 = (List) sparseArray.get(iMin);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i4 = 0; i4 < size2; i4++) {
            int[] iArrK = ahd.k((Collection) arrayList.get(i4));
            iArr[i4] = iArrK;
            Arrays.sort(iArrK);
        }
        return iArr;
    }

    public static boolean D(List<dp0> list, int[] iArr) {
        for (int i : iArr) {
            List<tmk> list2 = list.get(i).c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int E(int i, List<dp0> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (D(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            Format[] formatArrZ = z(list, iArr[i3]);
            formatArr[i3] = formatArrZ;
            if (formatArrZ.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    public static gw3<com.google.android.exoplayer2.source.dash.a>[] F(int i) {
        return new gw3[i];
    }

    public static Format[] H(mz5 mz5Var, Pattern pattern, Format format) {
        String str = mz5Var.f27367b;
        if (str == null) {
            return new Format[]{format};
        }
        String[] strArrM0 = wlq.M0(str, ";");
        Format[] formatArr = new Format[strArrM0.length];
        for (int i = 0; i < strArrM0.length; i++) {
            Matcher matcher = pattern.matcher(strArrM0[i]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            Format.b bVarA = format.a();
            String str2 = format.f7815a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
            sb.append(str2);
            sb.append(":");
            sb.append(i2);
            formatArr[i] = bVarA.S(sb.toString()).F(i2).V(matcher.group(2)).E();
        }
        return formatArr;
    }

    public static void l(List<ze8> list, TrackGroup[] trackGroupArr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            trackGroupArr[i] = new TrackGroup(new Format.b().S(list.get(i2).a()).e0("application/x-emsg").E());
            aVarArr[i] = a.c(i2);
            i2++;
            i++;
        }
    }

    public static int q(com.google.android.exoplayer2.drm.c cVar, List<dp0> list, int[][] iArr, int i, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).c);
            }
            int size = arrayList.size();
            Format[] formatArr2 = new Format[size];
            for (int i7 = 0; i7 < size; i7++) {
                Format format = ((tmk) arrayList.get(i7)).f34858b;
                formatArr2[i7] = format.c(cVar.c(format));
            }
            dp0 dp0Var = list.get(iArr2[0]);
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i5 + 2;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (formatArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            trackGroupArr[i5] = new TrackGroup(formatArr2);
            aVarArr[i5] = a.d(dp0Var.f15771b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                Format.b bVar = new Format.b();
                int i9 = dp0Var.f15770a;
                StringBuilder sb = new StringBuilder(16);
                sb.append(i9);
                sb.append(":emsg");
                trackGroupArr[i8] = new TrackGroup(bVar.S(sb.toString()).e0("application/x-emsg").E());
                aVarArr[i8] = a.b(iArr2, i5);
            }
            if (i2 != -1) {
                trackGroupArr[i2] = new TrackGroup(formatArr[i4]);
                aVarArr[i2] = a.a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    public static Pair<TrackGroupArray, a[]> v(com.google.android.exoplayer2.drm.c cVar, List<dp0> list, List<ze8> list2) {
        int[][] iArrA = A(list);
        int length = iArrA.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length][];
        int iE = E(length, list, iArrA, zArr, formatArr) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[iE];
        a[] aVarArr = new a[iE];
        l(list2, trackGroupArr, aVarArr, q(cVar, list, iArrA, length, zArr, formatArr, trackGroupArr, aVarArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), aVarArr);
    }

    public static mz5 w(List<mz5> list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static mz5 x(List<mz5> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            mz5 mz5Var = list.get(i);
            if (str.equals(mz5Var.f27366a)) {
                return mz5Var;
            }
        }
        return null;
    }

    public static mz5 y(List<mz5> list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    public static Format[] z(List<dp0> list, int[] iArr) {
        for (int i : iArr) {
            dp0 dp0Var = list.get(i);
            List<mz5> list2 = list.get(i).d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                mz5 mz5Var = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(mz5Var.f27366a)) {
                    Format.b bVarE0 = new Format.b().e0("application/cea-608");
                    int i3 = dp0Var.f15770a;
                    StringBuilder sb = new StringBuilder(18);
                    sb.append(i3);
                    sb.append(":cea608");
                    return H(mz5Var, w, bVarE0.S(sb.toString()).E());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(mz5Var.f27366a)) {
                    Format.b bVarE1 = new Format.b().e0("application/cea-708");
                    int i4 = dp0Var.f15770a;
                    StringBuilder sb2 = new StringBuilder(18);
                    sb2.append(i4);
                    sb2.append(":cea708");
                    return H(mz5Var, x, bVarE1.S(sb2.toString()).E());
                }
            }
        }
        return new Format[0];
    }

    public final int B(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.j[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.j[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    public final int[] C(com.google.android.exoplayer2.trackselection.b[] bVarArr) {
        int[] iArr = new int[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            com.google.android.exoplayer2.trackselection.b bVar = bVarArr[i];
            if (bVar != null) {
                iArr[i] = this.i.c(bVar.f());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    @Override // com.google.android.exoplayer2.source.s.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void k(gw3<com.google.android.exoplayer2.source.dash.a> gw3Var) {
        this.p.k(this);
    }

    public void I() {
        this.l.o();
        for (gw3<com.google.android.exoplayer2.source.dash.a> gw3Var : this.q) {
            gw3Var.P(this);
        }
        this.p = null;
    }

    public final void J(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr) {
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i] == null || !zArr[i]) {
                k9l k9lVar = k9lVarArr[i];
                if (k9lVar instanceof gw3) {
                    ((gw3) k9lVar).P(this);
                } else if (k9lVar instanceof gw3.a) {
                    ((gw3.a) k9lVar).c();
                }
                k9lVarArr[i] = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    public final void K(com.google.android.exoplayer2.trackselection.b[] bVarArr, k9l[] k9lVarArr, int[] iArr) {
        k9l k9lVar;
        for (int i = 0; i < bVarArr.length; i++) {
            k9l k9lVar2 = k9lVarArr[i];
            if ((k9lVar2 instanceof j98) || (k9lVar2 instanceof gw3.a)) {
                int iB = B(i, iArr);
                if (iB != -1) {
                    k9l k9lVar3 = k9lVarArr[i];
                    if (!(k9lVar3 instanceof gw3.a) || ((gw3.a) k9lVar3).f19390a != k9lVarArr[iB]) {
                        k9lVar = k9lVarArr[i];
                        if (k9lVar instanceof gw3.a) {
                            ((gw3.a) k9lVar).c();
                        }
                        k9lVarArr[i] = null;
                    }
                } else if (!(k9lVarArr[i] instanceof j98)) {
                    k9lVar = k9lVarArr[i];
                    if (k9lVar instanceof gw3.a) {
                        ((gw3.a) k9lVar).c();
                    }
                    k9lVarArr[i] = null;
                }
            }
        }
    }

    public final void L(com.google.android.exoplayer2.trackselection.b[] bVarArr, k9l[] k9lVarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < bVarArr.length; i++) {
            com.google.android.exoplayer2.trackselection.b bVar = bVarArr[i];
            if (bVar != null) {
                k9l k9lVar = k9lVarArr[i];
                if (k9lVar == null) {
                    zArr[i] = true;
                    a aVar = this.j[iArr[i]];
                    int i2 = aVar.c;
                    if (i2 == 0) {
                        k9lVarArr[i] = s(aVar, bVar, j);
                    } else if (i2 == 2) {
                        k9lVarArr[i] = new ye8(this.v.get(aVar.d), bVar.f().a(0), this.t.d);
                    }
                } else if (k9lVar instanceof gw3) {
                    ((com.google.android.exoplayer2.source.dash.a) ((gw3) k9lVar).D()).c(bVar);
                }
            }
        }
        for (int i3 = 0; i3 < bVarArr.length; i3++) {
            if (k9lVarArr[i3] == null && bVarArr[i3] != null) {
                a aVar2 = this.j[iArr[i3]];
                if (aVar2.c == 1) {
                    int iB = B(i3, iArr);
                    if (iB == -1) {
                        k9lVarArr[i3] = new j98();
                    } else {
                        k9lVarArr[i3] = ((gw3) k9lVarArr[iB]).S(j, aVar2.f8115b);
                    }
                }
            }
        }
    }

    public void M(bk5 bk5Var, int i) {
        this.t = bk5Var;
        this.u = i;
        this.l.q(bk5Var);
        gw3<com.google.android.exoplayer2.source.dash.a>[] gw3VarArr = this.q;
        if (gw3VarArr != null) {
            for (gw3<com.google.android.exoplayer2.source.dash.a> gw3Var : gw3VarArr) {
                ((com.google.android.exoplayer2.source.dash.a) gw3Var.D()).e(bk5Var, i);
            }
            this.p.k(this);
        }
        this.v = bk5Var.d(i).d;
        for (ye8 ye8Var : this.f8113r) {
            for (ze8 ze8Var : this.v) {
                if (ze8Var.a().equals(ye8Var.b())) {
                    ye8Var.e(ze8Var, bk5Var.d && i == bk5Var.e() - 1);
                    break;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        for (gw3<com.google.android.exoplayer2.source.dash.a> gw3Var : this.q) {
            if (gw3Var.f19386a == 2) {
                return gw3Var.b(j, brlVar);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        return this.s.c(j);
    }

    @Override // gw3.b
    public synchronized void d(gw3<com.google.android.exoplayer2.source.dash.a> gw3Var) {
        d.c cVarRemove = this.m.remove(gw3Var);
        if (cVarRemove != null) {
            cVarRemove.n();
        }
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        return this.s.e();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
        this.s.f(j);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        return this.s.g();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.s.h();
    }

    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        for (gw3<com.google.android.exoplayer2.source.dash.a> gw3Var : this.q) {
            gw3Var.R(j);
        }
        for (ye8 ye8Var : this.f8113r) {
            ye8Var.c(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        int[] iArrC = C(bVarArr);
        J(bVarArr, zArr, k9lVarArr);
        K(bVarArr, k9lVarArr, iArrC);
        L(bVarArr, k9lVarArr, zArr2, j, iArrC);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (k9l k9lVar : k9lVarArr) {
            if (k9lVar instanceof gw3) {
                arrayList.add((gw3) k9lVar);
            } else if (k9lVar instanceof ye8) {
                arrayList2.add((ye8) k9lVar);
            }
        }
        gw3<com.google.android.exoplayer2.source.dash.a>[] gw3VarArrF = F(arrayList.size());
        this.q = gw3VarArrF;
        arrayList.toArray(gw3VarArrF);
        ye8[] ye8VarArr = new ye8[arrayList2.size()];
        this.f8113r = ye8VarArr;
        arrayList2.toArray(ye8VarArr);
        this.s = this.f8112k.a(this.q);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(j.a aVar, long j) {
        this.p = aVar;
        aVar.o(this);
    }

    public final gw3<com.google.android.exoplayer2.source.dash.a> s(a aVar, com.google.android.exoplayer2.trackselection.b bVar, long j) {
        int i;
        TrackGroup trackGroupA;
        TrackGroup trackGroupA2;
        int i2;
        int i3 = aVar.f;
        boolean z = i3 != -1;
        d.c cVarK = null;
        if (z) {
            trackGroupA = this.i.a(i3);
            i = 1;
        } else {
            i = 0;
            trackGroupA = null;
        }
        int i4 = aVar.g;
        boolean z2 = i4 != -1;
        if (z2) {
            trackGroupA2 = this.i.a(i4);
            i += trackGroupA2.f8076a;
        } else {
            trackGroupA2 = null;
        }
        Format[] formatArr = new Format[i];
        int[] iArr = new int[i];
        if (z) {
            formatArr[0] = trackGroupA.a(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < trackGroupA2.f8076a; i5++) {
                Format formatA = trackGroupA2.a(i5);
                formatArr[i2] = formatA;
                iArr[i2] = 3;
                arrayList.add(formatA);
                i2++;
            }
        }
        if (this.t.d && z) {
            cVarK = this.l.k();
        }
        d.c cVar = cVarK;
        gw3<com.google.android.exoplayer2.source.dash.a> gw3Var = new gw3<>(aVar.f8115b, iArr, formatArr, this.f8111b.a(this.g, this.t, this.u, aVar.f8114a, bVar, aVar.f8115b, this.f, z, arrayList, cVar, this.c), this, this.h, j, this.d, this.o, this.e, this.n);
        synchronized (this) {
            this.m.put(gw3Var, cVar);
        }
        return gw3Var;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() throws IOException {
        this.g.a();
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
        for (gw3<com.google.android.exoplayer2.source.dash.a> gw3Var : this.q) {
            gw3Var.u(j, z);
        }
    }
}
