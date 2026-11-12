package wa;

import android.util.Pair;
import androidx.media3.common.d0;
import androidx.media3.common.e0;
import androidx.media3.common.h0;
import androidx.media3.common.q;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v0;
import com.google.common.collect.ImmutableList;
import fa.z;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sa.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f183746c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f183747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f183748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r[] f183749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f183750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[][][] f183751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final r f183752f;

        public a(String[] strArr, int[] iArr, r[] rVarArr, int[] iArr2, int[][][] iArr3, r rVar) {
            this.f183748b = iArr;
            this.f183749c = rVarArr;
            this.f183751e = iArr3;
            this.f183750d = iArr2;
            this.f183752f = rVar;
            this.f183747a = iArr.length;
        }

        public final int a(int i14, int i15) {
            int[][][] iArr;
            r[] rVarArr = this.f183749c;
            int i16 = rVarArr[i14].a(i15).f8214a;
            int[] iArr2 = new int[i16];
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                iArr = this.f183751e;
                if (i18 >= i16) {
                    break;
                }
                if ((iArr[i14][i15][i18] & 7) == 4) {
                    iArr2[i19] = i18;
                    i19++;
                }
                i18++;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr2, i19);
            int iMin = 16;
            int i24 = 0;
            String str = null;
            boolean z14 = false;
            while (i17 < iArrCopyOf.length) {
                String str2 = rVarArr[i14].a(i15).f8217d[iArrCopyOf[i17]].f8386n;
                int i25 = i24 + 1;
                if (i24 == 0) {
                    str = str2;
                } else {
                    int i26 = z.f70071a;
                    z14 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, iArr[i14][i15][i17] & 24);
                i17++;
                i24 = i25;
            }
            return z14 ? Math.min(iMin, this.f183750d[i14]) : iMin;
        }
    }

    @Override // wa.l
    public final void c(Object obj) {
        this.f183746c = (a) obj;
    }

    @Override // wa.l
    public final m e(u0[] u0VarArr, r rVar, androidx.media3.exoplayer.source.j.b bVar, d0 d0Var) {
        boolean z14;
        int[] iArr;
        r rVar2 = rVar;
        boolean z15 = true;
        int[] iArr2 = new int[u0VarArr.length + 1];
        int length = u0VarArr.length + 1;
        e0[][] e0VarArr = new e0[length][];
        int[][][] iArr3 = new int[u0VarArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = rVar2.f158153a;
            e0VarArr[i14] = new e0[i15];
            iArr3[i14] = new int[i15][];
        }
        int length2 = u0VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr4[i16] = u0VarArr[i16].supportsMixedMimeTypeAdaptation();
        }
        int i17 = 0;
        while (i17 < rVar2.f158153a) {
            e0 e0VarA = rVar2.a(i17);
            int i18 = e0VarA.f8216c;
            q[] qVarArr = e0VarA.f8217d;
            int i19 = e0VarA.f8214a;
            boolean z16 = i18 == 5 ? z15 : false;
            int length3 = u0VarArr.length;
            boolean z17 = z15;
            int i24 = 0;
            int i25 = 0;
            while (i24 < u0VarArr.length) {
                u0 u0Var = u0VarArr[i24];
                int iMax = 0;
                int i26 = 0;
                while (i26 < i19) {
                    iMax = Math.max(iMax, u0Var.a(qVarArr[i26]) & 7);
                    i26++;
                    iArr2 = iArr2;
                }
                int[] iArr5 = iArr2;
                boolean z18 = iArr5[i24] == 0 ? z17 : false;
                if (iMax > i25 || (iMax == i25 && z16 && !z17 && z18)) {
                    i25 = iMax;
                    z17 = z18;
                    length3 = i24;
                }
                i24++;
                iArr2 = iArr5;
            }
            int[] iArr6 = iArr2;
            if (length3 == u0VarArr.length) {
                iArr = new int[i19];
            } else {
                u0 u0Var2 = u0VarArr[length3];
                int[] iArr7 = new int[i19];
                for (int i27 = 0; i27 < i19; i27++) {
                    iArr7[i27] = u0Var2.a(qVarArr[i27]);
                }
                iArr = iArr7;
            }
            int i28 = iArr6[length3];
            e0VarArr[length3][i28] = e0VarA;
            iArr3[length3][i28] = iArr;
            iArr6[length3] = i28 + 1;
            i17++;
            rVar2 = rVar;
            z15 = z17;
            iArr2 = iArr6;
        }
        int[] iArr8 = iArr2;
        boolean z19 = z15;
        r[] rVarArr = new r[u0VarArr.length];
        String[] strArr = new String[u0VarArr.length];
        int[] iArr9 = new int[u0VarArr.length];
        for (int i29 = 0; i29 < u0VarArr.length; i29++) {
            int i30 = iArr8[i29];
            rVarArr[i29] = new r((e0[]) z.Q(e0VarArr[i29], i30));
            iArr3[i29] = (int[][]) z.Q(iArr3[i29], i30);
            strArr[i29] = u0VarArr[i29].getName();
            iArr9[i29] = ((androidx.media3.exoplayer.f) u0VarArr[i29]).f8922b;
        }
        a aVar = new a(strArr, iArr9, rVarArr, iArr4, iArr3, new r((e0[]) z.Q(e0VarArr[u0VarArr.length], iArr8[u0VarArr.length])));
        Pair<v0[], g[]> pairH = h(aVar, iArr3, iArr4, bVar, d0Var);
        j[] jVarArr = (j[]) pairH.second;
        List[] listArr = new List[jVarArr.length];
        for (int i34 = 0; i34 < jVarArr.length; i34++) {
            j jVar = jVarArr[i34];
            listArr[i34] = jVar != null ? ImmutableList.of(jVar) : ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i35 = 0; i35 < aVar.f183747a; i35++) {
            r rVar3 = aVar.f183749c[i35];
            List list = listArr[i35];
            for (int i36 = 0; i36 < rVar3.f158153a; i36++) {
                e0 e0VarA2 = rVar3.a(i36);
                boolean z24 = aVar.a(i35, i36) != 0 ? z19 : false;
                int i37 = e0VarA2.f8214a;
                int[] iArr10 = new int[i37];
                boolean[] zArr = new boolean[i37];
                for (int i38 = 0; i38 < e0VarA2.f8214a; i38++) {
                    iArr10[i38] = aVar.f183751e[i35][i36][i38] & 7;
                    int i39 = 0;
                    while (true) {
                        if (i39 >= list.size()) {
                            z14 = false;
                            break;
                        }
                        j jVar2 = (j) list.get(i39);
                        if (jVar2.getTrackGroup().equals(e0VarA2) && jVar2.indexOf(i38) != -1) {
                            z14 = z19;
                            break;
                        }
                        i39++;
                    }
                    zArr[i38] = z14;
                }
                builder.add(new h0.a(e0VarA2, z24, iArr10, zArr));
            }
        }
        int i44 = 0;
        while (true) {
            r rVar4 = aVar.f183752f;
            if (i44 >= rVar4.f158153a) {
                return new m((v0[]) pairH.first, (g[]) pairH.second, new h0(builder.build()), aVar);
            }
            e0 e0VarA3 = rVar4.a(i44);
            int[] iArr11 = new int[e0VarA3.f8214a];
            Arrays.fill(iArr11, 0);
            builder.add(new h0.a(e0VarA3, false, iArr11, new boolean[e0VarA3.f8214a]));
            i44++;
        }
    }

    public abstract Pair<v0[], g[]> h(a aVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.j.b bVar, d0 d0Var);
}
