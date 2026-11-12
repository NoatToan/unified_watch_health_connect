package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import defpackage.cpd;
import defpackage.f14;
import defpackage.gy1;
import defpackage.nag;
import defpackage.oag;
import defpackage.tif;
import defpackage.toe;
import defpackage.uif;
import defpackage.vw9;
import defpackage.wlq;
import defpackage.ye2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a extends ye2 {
    public final gy1 h;
    public final long i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f8316k;
    public final float l;
    public final float m;
    public final ImmutableList<C0202a> n;
    public final f14 o;
    public float p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8317r;
    public long s;
    public tif t;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.a$a, reason: collision with other inner class name */
    public static final class C0202a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8319b;

        public C0202a(long j, long j2) {
            this.f8318a = j;
            this.f8319b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0202a)) {
                return false;
            }
            C0202a c0202a = (C0202a) obj;
            return this.f8318a == c0202a.f8318a && this.f8319b == c0202a.f8319b;
        }

        public int hashCode() {
            return (((int) this.f8318a) * 31) + ((int) this.f8319b);
        }
    }

    public static class b implements com.google.android.exoplayer2.trackselection.b.InterfaceC0203b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8321b;
        public final int c;
        public final float d;
        public final float e;
        public final f14 f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, f14.f17281a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.trackselection.b.InterfaceC0203b
        public final com.google.android.exoplayer2.trackselection.b[] a(com.google.android.exoplayer2.trackselection.b.a[] aVarArr, gy1 gy1Var, k.a aVar, v vVar) {
            ImmutableList immutableListZ = a.z(aVarArr);
            com.google.android.exoplayer2.trackselection.b[] bVarArr = new com.google.android.exoplayer2.trackselection.b[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                com.google.android.exoplayer2.trackselection.b.a aVar2 = aVarArr[i];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f8323b;
                    if (iArr.length != 0) {
                        bVarArr[i] = iArr.length == 1 ? new vw9(aVar2.f8322a, iArr[0], aVar2.c) : b(aVar2.f8322a, iArr, aVar2.c, gy1Var, (ImmutableList) immutableListZ.get(i));
                    }
                }
            }
            return bVarArr;
        }

        public a b(TrackGroup trackGroup, int[] iArr, int i, gy1 gy1Var, ImmutableList<C0202a> immutableList) {
            return new a(trackGroup, iArr, i, gy1Var, this.f8320a, this.f8321b, this.c, this.d, this.e, immutableList, this.f);
        }

        public b(int i, int i2, int i3, float f, float f2, f14 f14Var) {
            this.f8320a = i;
            this.f8321b = i2;
            this.c = i3;
            this.d = f;
            this.e = f2;
            this.f = f14Var;
        }
    }

    public a(TrackGroup trackGroup, int[] iArr, int i, gy1 gy1Var, long j, long j2, long j3, float f, float f2, List<C0202a> list, f14 f14Var) {
        super(trackGroup, iArr, i);
        if (j3 < j) {
            toe.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.h = gy1Var;
        this.i = j * 1000;
        this.j = j2 * 1000;
        this.f8316k = j3 * 1000;
        this.l = f;
        this.m = f2;
        this.n = ImmutableList.copyOf((Collection) list);
        this.o = f14Var;
        this.p = 1.0f;
        this.f8317r = 0;
        this.s = -9223372036854775807L;
    }

    public static long[][] E(com.google.android.exoplayer2.trackselection.b.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            com.google.android.exoplayer2.trackselection.b.a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.f8323b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.f8323b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    jArr[i][i2] = aVar.f8322a.a(iArr[i2]).h;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    public static ImmutableList<Integer> F(long[][] jArr) {
        nag nagVarE = oag.c().a().e();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double dLog = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    nagVarE.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.copyOf(nagVarE.values());
    }

    public static void w(List<ImmutableList.a<C0202a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList.a<C0202a> aVar = list.get(i);
            if (aVar != null) {
                aVar.a(new C0202a(j, jArr[i]));
            }
        }
    }

    public static ImmutableList<ImmutableList<C0202a>> z(com.google.android.exoplayer2.trackselection.b.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (com.google.android.exoplayer2.trackselection.b.a aVar : aVarArr) {
            if (aVar == null || aVar.f8323b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.a aVarBuilder = ImmutableList.builder();
                aVarBuilder.a(new C0202a(0L, 0L));
                arrayList.add(aVarBuilder);
            }
        }
        long[][] jArrE = E(aVarArr);
        int[] iArr = new int[jArrE.length];
        long[] jArr = new long[jArrE.length];
        for (int i = 0; i < jArrE.length; i++) {
            long[] jArr2 = jArrE[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        w(arrayList, jArr);
        ImmutableList<Integer> immutableListF = F(jArrE);
        for (int i2 = 0; i2 < immutableListF.size(); i2++) {
            int iIntValue = immutableListF.get(i2).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrE[iIntValue][i3];
            w(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        w(arrayList, jArr);
        ImmutableList.a aVarBuilder2 = ImmutableList.builder();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ImmutableList.a aVar2 = (ImmutableList.a) arrayList.get(i5);
            aVarBuilder2.a(aVar2 == null ? ImmutableList.of() : aVar2.k());
        }
        return aVarBuilder2.k();
    }

    public final long A(long j) {
        long jG = G(j);
        if (this.n.isEmpty()) {
            return jG;
        }
        int i = 1;
        while (i < this.n.size() - 1 && this.n.get(i).f8318a < jG) {
            i++;
        }
        C0202a c0202a = this.n.get(i - 1);
        C0202a c0202a2 = this.n.get(i);
        long j2 = c0202a.f8318a;
        float f = (jG - j2) / (c0202a2.f8318a - j2);
        long j3 = c0202a.f8319b;
        return j3 + ((long) (f * (c0202a2.f8319b - j3)));
    }

    public final long B(List<? extends tif> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        tif tifVar = (tif) cpd.f(list);
        long j = tifVar.g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = tifVar.h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    public long C() {
        return this.f8316k;
    }

    public final long D(uif[] uifVarArr, List<? extends tif> list) {
        int i = this.q;
        if (i < uifVarArr.length && uifVarArr[i].next()) {
            uif uifVar = uifVarArr[this.q];
            return uifVar.a() - uifVar.b();
        }
        for (uif uifVar2 : uifVarArr) {
            if (uifVar2.next()) {
                return uifVar2.a() - uifVar2.b();
            }
        }
        return B(list);
    }

    public final long G(long j) {
        long jB = (long) (this.h.b() * this.l);
        long jF = this.h.f();
        if (jF == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (jB / this.p);
        }
        float f = j;
        return (long) ((jB * Math.max((f / this.p) - jF, 0.0f)) / f);
    }

    public final long H(long j) {
        return (j == -9223372036854775807L || j > this.i) ? this.i : (long) (j * this.m);
    }

    public boolean I(long j, List<? extends tif> list) {
        long j2 = this.s;
        return j2 == -9223372036854775807L || j - j2 >= 1000 || !(list.isEmpty() || ((tif) cpd.f(list)).equals(this.t));
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public int a() {
        return this.q;
    }

    @Override // defpackage.ye2, com.google.android.exoplayer2.trackselection.b
    public void disable() {
        this.t = null;
    }

    @Override // defpackage.ye2, com.google.android.exoplayer2.trackselection.b
    public void enable() {
        this.s = -9223372036854775807L;
        this.t = null;
    }

    @Override // defpackage.ye2, com.google.android.exoplayer2.trackselection.b
    public int g(long j, List<? extends tif> list) {
        int i;
        int i2;
        long jElapsedRealtime = this.o.elapsedRealtime();
        if (!I(jElapsedRealtime, list)) {
            return list.size();
        }
        this.s = jElapsedRealtime;
        this.t = list.isEmpty() ? null : (tif) cpd.f(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jA0 = wlq.a0(list.get(size - 1).g - j, this.p);
        long jC = C();
        if (jA0 < jC) {
            return size;
        }
        Format formatL = l(y(jElapsedRealtime, B(list)));
        for (int i3 = 0; i3 < size; i3++) {
            tif tifVar = list.get(i3);
            Format format = tifVar.d;
            if (wlq.a0(tifVar.g - j, this.p) >= jC && format.h < formatL.h && (i = format.f7818r) != -1 && i < 720 && (i2 = format.q) != -1 && i2 < 1280 && i < formatL.f7818r) {
                return i3;
            }
        }
        return size;
    }

    @Override // defpackage.ye2, com.google.android.exoplayer2.trackselection.b
    public void m(float f) {
        this.p = f;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public Object n() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public void o(long j, long j2, long j3, List<? extends tif> list, uif[] uifVarArr) {
        long jElapsedRealtime = this.o.elapsedRealtime();
        long jD = D(uifVarArr, list);
        int i = this.f8317r;
        if (i == 0) {
            this.f8317r = 1;
            this.q = y(jElapsedRealtime, jD);
            return;
        }
        int i2 = this.q;
        int iQ = list.isEmpty() ? -1 : q(((tif) cpd.f(list)).d);
        if (iQ != -1) {
            i = ((tif) cpd.f(list)).e;
            i2 = iQ;
        }
        int iY = y(jElapsedRealtime, jD);
        if (!t(i2, jElapsedRealtime)) {
            Format formatL = l(i2);
            Format formatL2 = l(iY);
            if ((formatL2.h > formatL.h && j2 < H(j3)) || (formatL2.h < formatL.h && j2 >= this.j)) {
                iY = i2;
            }
        }
        if (iY != i2) {
            i = 3;
        }
        this.f8317r = i;
        this.q = iY;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public int r() {
        return this.f8317r;
    }

    public boolean x(Format format, int i, long j) {
        return ((long) i) <= j;
    }

    public final int y(long j, long j2) {
        long jA = A(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.f40088b; i2++) {
            if (j == Long.MIN_VALUE || !t(i2, j)) {
                Format formatL = l(i2);
                if (x(formatL, formatL.h, jA)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }
}
