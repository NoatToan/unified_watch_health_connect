package wa;

import androidx.media3.common.e0;
import androidx.media3.common.q;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import fa.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends wa.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xa.c f183616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f183617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f183618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f183619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f183620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f183621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f183622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f183623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImmutableList<C3404a> f183624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fa.c f183625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f183626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f183627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f183628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f183629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ua.d f183630u;

    /* JADX INFO: renamed from: wa.a$a, reason: collision with other inner class name */
    public static final class C3404a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f183631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f183632b;

        public C3404a(long j8, long j14) {
            this.f183631a = j8;
            this.f183632b = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3404a)) {
                return false;
            }
            C3404a c3404a = (C3404a) obj;
            return this.f183631a == c3404a.f183631a && this.f183632b == c3404a.f183632b;
        }

        public final int hashCode() {
            return (((int) this.f183631a) * 31) + ((int) this.f183632b);
        }
    }

    public a(e0 e0Var, int[] iArr, int i14, xa.c cVar, long j8, long j14, long j15, int i15, int i16, float f14, float f15, List<C3404a> list, fa.c cVar2) {
        long j16;
        super(e0Var, iArr, i14);
        if (j15 < j8) {
            fa.k.g("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j16 = j8;
        } else {
            j16 = j15;
        }
        this.f183616g = cVar;
        this.f183617h = j8 * 1000;
        this.f183618i = j14 * 1000;
        this.f183619j = j16 * 1000;
        this.f183620k = i15;
        this.f183621l = i16;
        this.f183622m = f14;
        this.f183623n = f15;
        this.f183624o = ImmutableList.copyOf((Collection) list);
        this.f183625p = cVar2;
        this.f183626q = 1.0f;
        this.f183628s = 0;
        this.f183629t = C.TIME_UNSET;
    }

    public static void e(ArrayList arrayList, long[] jArr) {
        long j8 = 0;
        for (long j14 : jArr) {
            j8 += j14;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i14);
            if (builder != null) {
                builder.add(new C3404a(j8, jArr[i14]));
            }
        }
    }

    public static long g(List list) {
        if (!list.isEmpty()) {
            ua.d dVar = (ua.d) Iterables.getLast(list);
            long j8 = dVar.f169589g;
            if (j8 != C.TIME_UNSET) {
                long j14 = dVar.f169590h;
                if (j14 != C.TIME_UNSET) {
                    return j14 - j8;
                }
            }
        }
        return C.TIME_UNSET;
    }

    @Override // wa.g
    public final void b(long j8, long j14, long j15, List<? extends ua.d> list, ua.e[] eVarArr) {
        long jG;
        long jElapsedRealtime = this.f183625p.elapsedRealtime();
        int i14 = this.f183627r;
        int i15 = 0;
        if (i14 >= eVarArr.length || !eVarArr[i14].next()) {
            int length = eVarArr.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    jG = g(list);
                    break;
                }
                ua.e eVar = eVarArr[i16];
                if (eVar.next()) {
                    jG = eVar.getChunkEndTimeUs() - eVar.getChunkStartTimeUs();
                    break;
                }
                i16++;
            }
        } else {
            ua.e eVar2 = eVarArr[this.f183627r];
            jG = eVar2.getChunkEndTimeUs() - eVar2.getChunkStartTimeUs();
        }
        int i17 = this.f183628s;
        if (i17 == 0) {
            this.f183628s = 1;
            this.f183627r = f(jElapsedRealtime, jG);
            return;
        }
        int i18 = this.f183627r;
        boolean zIsEmpty = list.isEmpty();
        q[] qVarArr = this.f183644d;
        if (!zIsEmpty) {
            q qVar = ((ua.d) Iterables.getLast(list)).f169586d;
            while (true) {
                if (i15 >= this.f183642b) {
                    i15 = -1;
                    break;
                } else if (qVarArr[i15] == qVar) {
                    break;
                } else {
                    i15++;
                }
            }
        } else {
            i15 = -1;
            break;
        }
        if (i15 != -1) {
            i17 = ((ua.d) Iterables.getLast(list)).f169587e;
            i18 = i15;
        }
        int iF = f(jElapsedRealtime, jG);
        if (iF != i18 && !a(i18, jElapsedRealtime)) {
            q qVar2 = qVarArr[i18];
            q qVar3 = qVarArr[iF];
            long jMin = this.f183617h;
            if (j15 != C.TIME_UNSET) {
                jMin = Math.min((long) ((jG != C.TIME_UNSET ? j15 - jG : j15) * this.f183623n), jMin);
            }
            int i19 = qVar3.f8382j;
            int i24 = qVar2.f8382j;
            if ((i19 > i24 && j14 < jMin) || (i19 < i24 && j14 >= this.f183618i)) {
                iF = i18;
            }
        }
        if (iF != i18) {
            i17 = 3;
        }
        this.f183628s = i17;
        this.f183627r = iF;
    }

    @Override // wa.b, wa.g
    public final void disable() {
        this.f183630u = null;
    }

    @Override // wa.b, wa.g
    public final void enable() {
        this.f183629t = C.TIME_UNSET;
        this.f183630u = null;
    }

    @Override // wa.b, wa.g
    public final int evaluateQueueSize(long j8, List<? extends ua.d> list) {
        int i14;
        int i15;
        long jElapsedRealtime = this.f183625p.elapsedRealtime();
        long j14 = this.f183629t;
        if (j14 != C.TIME_UNSET && jElapsedRealtime - j14 < 1000 && (list.isEmpty() || ((ua.d) Iterables.getLast(list)).equals(this.f183630u))) {
            return list.size();
        }
        this.f183629t = jElapsedRealtime;
        this.f183630u = list.isEmpty() ? null : (ua.d) Iterables.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jZ = z.z(list.get(size - 1).f169589g - j8, this.f183626q);
        long j15 = this.f183619j;
        if (jZ >= j15) {
            q qVar = this.f183644d[f(jElapsedRealtime, g(list))];
            for (int i16 = 0; i16 < size; i16++) {
                ua.d dVar = list.get(i16);
                q qVar2 = dVar.f169586d;
                if (z.z(dVar.f169589g - j8, this.f183626q) >= j15 && qVar2.f8382j < qVar.f8382j && (i14 = qVar2.f8394v) != -1 && i14 <= this.f183621l && (i15 = qVar2.f8393u) != -1 && i15 <= this.f183620k && i14 < qVar.f8394v) {
                    return i16;
                }
            }
        }
        return size;
    }

    public final int f(long j8, long j14) {
        long bitrateEstimate = (long) (((long) (this.f183616g.getBitrateEstimate() * this.f183622m)) / this.f183626q);
        ImmutableList<C3404a> immutableList = this.f183624o;
        if (!immutableList.isEmpty()) {
            int i14 = 1;
            while (i14 < immutableList.size() - 1 && immutableList.get(i14).f183631a < bitrateEstimate) {
                i14++;
            }
            C3404a c3404a = immutableList.get(i14 - 1);
            C3404a c3404a2 = immutableList.get(i14);
            long j15 = c3404a.f183631a;
            float f14 = (bitrateEstimate - j15) / (c3404a2.f183631a - j15);
            long j16 = c3404a.f183632b;
            bitrateEstimate = ((long) (f14 * (c3404a2.f183632b - j16))) + j16;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f183642b; i16++) {
            if (j8 == Long.MIN_VALUE || !a(i16, j8)) {
                if (this.f183644d[i16].f8382j <= bitrateEstimate) {
                    return i16;
                }
                i15 = i16;
            }
        }
        return i15;
    }

    @Override // wa.g
    public final int getSelectedIndex() {
        return this.f183627r;
    }

    @Override // wa.g
    public final Object getSelectionData() {
        return null;
    }

    @Override // wa.g
    public final int getSelectionReason() {
        return this.f183628s;
    }

    @Override // wa.b, wa.g
    public final void onPlaybackSpeed(float f14) {
        this.f183626q = f14;
    }

    public static class b implements g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f183633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f183634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f183635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f183636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f183637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f183638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f183639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final fa.c f183640h;

        public b(int i14, int i15, int i16, int i17, int i18, float f14, float f15, fa.c cVar) {
            this.f183633a = i14;
            this.f183634b = i15;
            this.f183635c = i16;
            this.f183636d = i17;
            this.f183637e = i18;
            this.f183638f = f14;
            this.f183639g = f15;
            this.f183640h = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:81:0x0188  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // wa.g.b
        public final g[] a(g.a[] aVarArr, xa.c cVar) {
            int i14;
            long j8;
            int i15;
            int i16;
            long j14;
            g.a[] aVarArr2 = aVarArr;
            ArrayList arrayList = new ArrayList();
            int i17 = 0;
            int i18 = 0;
            while (true) {
                i14 = 1;
                if (i18 >= aVarArr2.length) {
                    break;
                }
                g.a aVar = aVarArr2[i18];
                if (aVar == null || aVar.f183742b.length <= 1) {
                    arrayList.add(null);
                } else {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    builder.add(new C3404a(0L, 0L));
                    arrayList.add(builder);
                }
                i18++;
            }
            int length = aVarArr2.length;
            long[][] jArr = new long[length][];
            int i19 = 0;
            while (true) {
                j8 = -1;
                if (i19 >= aVarArr2.length) {
                    break;
                }
                g.a aVar2 = aVarArr2[i19];
                if (aVar2 == null) {
                    jArr[i19] = new long[0];
                } else {
                    int[] iArr = aVar2.f183742b;
                    jArr[i19] = new long[iArr.length];
                    for (int i24 = 0; i24 < iArr.length; i24++) {
                        long j15 = aVar2.f183741a.f8217d[iArr[i24]].f8382j;
                        long[] jArr2 = jArr[i19];
                        if (j15 == -1) {
                            j15 = 0;
                        }
                        jArr2[i24] = j15;
                    }
                    Arrays.sort(jArr[i19]);
                }
                i19++;
            }
            int[] iArr2 = new int[length];
            long[] jArr3 = new long[length];
            for (int i25 = 0; i25 < length; i25++) {
                long[] jArr4 = jArr[i25];
                jArr3[i25] = jArr4.length == 0 ? 0L : jArr4[0];
            }
            a.e(arrayList, jArr3);
            Multimap multimapBuild = MultimapBuilder.treeKeys().arrayListValues().build();
            int i26 = 0;
            while (i26 < length) {
                long[] jArr5 = jArr[i26];
                if (jArr5.length <= i14) {
                    i15 = i17;
                    i16 = i14;
                    j14 = j8;
                } else {
                    int length2 = jArr5.length;
                    double[] dArr = new double[length2];
                    int i27 = i17;
                    i15 = i27;
                    while (true) {
                        long[] jArr6 = jArr[i26];
                        i16 = i14;
                        double dLog = 0.0d;
                        if (i27 >= jArr6.length) {
                            break;
                        }
                        long j16 = j8;
                        long j17 = jArr6[i27];
                        if (j17 != j16) {
                            dLog = Math.log(j17);
                        }
                        dArr[i27] = dLog;
                        i27++;
                        i14 = i16;
                        j8 = j16;
                    }
                    j14 = j8;
                    int i28 = length2 - 1;
                    double d14 = dArr[i28] - dArr[i15];
                    int i29 = i15;
                    while (i29 < i28) {
                        double d15 = dArr[i29];
                        i29++;
                        multimapBuild.put(Double.valueOf(d14 == 0.0d ? 1.0d : (((d15 + dArr[i29]) * 0.5d) - dArr[i15]) / d14), Integer.valueOf(i26));
                    }
                }
                i26++;
                i17 = i15;
                i14 = i16;
                j8 = j14;
            }
            int i30 = i17;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf(multimapBuild.values());
            for (int i34 = i30; i34 < immutableListCopyOf.size(); i34++) {
                int iIntValue = ((Integer) immutableListCopyOf.get(i34)).intValue();
                int i35 = iArr2[iIntValue] + 1;
                iArr2[iIntValue] = i35;
                jArr3[iIntValue] = jArr[iIntValue][i35];
                a.e(arrayList, jArr3);
            }
            for (int i36 = i30; i36 < aVarArr2.length; i36++) {
                if (arrayList.get(i36) != null) {
                    jArr3[i36] = jArr3[i36] * 2;
                }
            }
            a.e(arrayList, jArr3);
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (int i37 = i30; i37 < arrayList.size(); i37++) {
                ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i37);
                builder2.add(builder3 == null ? ImmutableList.of() : builder3.build());
            }
            ImmutableList immutableListBuild = builder2.build();
            g[] gVarArr = new g[aVarArr2.length];
            char c14 = 0;
            int i38 = 0;
            while (i38 < aVarArr2.length) {
                g.a aVar3 = aVarArr2[i38];
                if (aVar3 != null) {
                    int[] iArr3 = aVar3.f183742b;
                    if (iArr3.length == 0) {
                        i38 = i38;
                    } else {
                        int length3 = iArr3.length;
                        e0 e0Var = aVar3.f183741a;
                        gVarArr[i38] = length3 == 1 ? new h(e0Var, iArr3[c14], aVar3.f183743c) : new a(e0Var, iArr3, aVar3.f183743c, cVar, this.f183633a, this.f183634b, this.f183635c, this.f183636d, this.f183637e, this.f183638f, this.f183639g, (ImmutableList) immutableListBuild.get(i38), this.f183640h);
                    }
                } else {
                    i38 = i38;
                }
                i38++;
                aVarArr2 = aVarArr;
                c14 = 0;
            }
            return gVarArr;
        }

        public b(int i14, int i15, int i16, float f14) {
            this(i14, i15, i16, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f14, 0.75f, fa.c.f70004a);
        }

        public b(int i14, int i15, int i16, int i17, int i18, float f14) {
            this(i14, i15, i16, i17, i18, f14, 0.75f, fa.c.f70004a);
        }

        public b(int i14, int i15, int i16, float f14, float f15, fa.c cVar) {
            this(i14, i15, i16, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f14, f15, cVar);
        }

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }
    }

    public a(e0 e0Var, int[] iArr, xa.c cVar) {
        this(e0Var, iArr, 0, cVar, AbstractComponentTracker.LINGERING_TIMEOUT, 25000L, 25000L, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0.7f, 0.75f, ImmutableList.of(), fa.c.f70004a);
    }
}
