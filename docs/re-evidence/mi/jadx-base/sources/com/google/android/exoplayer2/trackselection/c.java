package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;
import defpackage.ayf;
import defpackage.bop;
import defpackage.cop;
import defpackage.rkk;
import defpackage.skk;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends bop {
    public a c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f8325b;
        public final int[] c;
        public final TrackGroupArray[] d;
        public final int[] e;
        public final int[][][] f;
        public final TrackGroupArray g;

        public a(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f8325b = strArr;
            this.c = iArr;
            this.d = trackGroupArrayArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = trackGroupArray;
            this.f8324a = iArr.length;
        }

        public int a(int i, int i2, boolean z) {
            int i3 = this.d[i].a(i2).f8076a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iF = f(i, i2, i5);
                if (iF == 4 || (z && iF == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return b(i, i2, Arrays.copyOf(iArr, i4));
        }

        public int b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                String str2 = this.d[i].a(i2).a(iArr[i3]).l;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !wlq.c(str, str2);
                }
                iMin = Math.min(iMin, rkk.g(this.f[i][i2][i3]));
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.e[i]) : iMin;
        }

        public int c() {
            return this.f8324a;
        }

        public int d(int i) {
            return this.c[i];
        }

        public TrackGroupArray e(int i) {
            return this.d[i];
        }

        public int f(int i, int i2, int i3) {
            return rkk.p(this.f[i][i2][i3]);
        }
    }

    public static int f(rkk[] rkkVarArr, TrackGroup trackGroup, int[] iArr, boolean z) throws ExoPlaybackException {
        int length = rkkVarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < rkkVarArr.length; i2++) {
            rkk rkkVar = rkkVarArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < trackGroup.f8076a; i3++) {
                iMax = Math.max(iMax, rkk.p(rkkVar.a(trackGroup.a(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    public static int[] h(rkk rkkVar, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.f8076a];
        for (int i = 0; i < trackGroup.f8076a; i++) {
            iArr[i] = rkkVar.a(trackGroup.a(i));
        }
        return iArr;
    }

    public static int[] i(rkk[] rkkVarArr) throws ExoPlaybackException {
        int length = rkkVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = rkkVarArr[i].x();
        }
        return iArr;
    }

    @Override // defpackage.bop
    public final void d(Object obj) {
        this.c = (a) obj;
    }

    @Override // defpackage.bop
    public final cop e(rkk[] rkkVarArr, TrackGroupArray trackGroupArray, k.a aVar, v vVar) throws ExoPlaybackException {
        int[] iArr = new int[rkkVarArr.length + 1];
        int length = rkkVarArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[rkkVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = trackGroupArray.f8078a;
            trackGroupArr[i] = new TrackGroup[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrI = i(rkkVarArr);
        for (int i3 = 0; i3 < trackGroupArray.f8078a; i3++) {
            TrackGroup trackGroupA = trackGroupArray.a(i3);
            int iF = f(rkkVarArr, trackGroupA, iArr, ayf.l(trackGroupA.a(0).l) == 5);
            int[] iArrH = iF == rkkVarArr.length ? new int[trackGroupA.f8076a] : h(rkkVarArr[iF], trackGroupA);
            int i4 = iArr[iF];
            trackGroupArr[iF][i4] = trackGroupA;
            iArr2[iF][i4] = iArrH;
            iArr[iF] = i4 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rkkVarArr.length];
        String[] strArr = new String[rkkVarArr.length];
        int[] iArr3 = new int[rkkVarArr.length];
        for (int i5 = 0; i5 < rkkVarArr.length; i5++) {
            int i6 = iArr[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((TrackGroup[]) wlq.A0(trackGroupArr[i5], i6));
            iArr2[i5] = (int[][]) wlq.A0(iArr2[i5], i6);
            strArr[i5] = rkkVarArr[i5].getName();
            iArr3[i5] = rkkVarArr[i5].e();
        }
        a aVar2 = new a(strArr, iArr3, trackGroupArrayArr, iArrI, iArr2, new TrackGroupArray((TrackGroup[]) wlq.A0(trackGroupArr[rkkVarArr.length], iArr[rkkVarArr.length])));
        Pair<skk[], b[]> pairJ = j(aVar2, iArr2, iArrI, aVar, vVar);
        return new cop((skk[]) pairJ.first, (b[]) pairJ.second, aVar2);
    }

    public final a g() {
        return this.c;
    }

    public abstract Pair<skk[], b[]> j(a aVar, int[][][] iArr, int[] iArr2, k.a aVar2, v vVar) throws ExoPlaybackException;
}
