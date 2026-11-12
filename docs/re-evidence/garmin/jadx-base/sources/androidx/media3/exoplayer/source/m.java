package androidx.media3.exoplayer.source;

import androidx.media3.common.e0;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.x0;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m implements i, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i[] f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentityHashMap<sa.n, Integer> f9531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa.d f9532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<i> f9533d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<e0, e0> f9534e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.a f9535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sa.r f9536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i[] f9537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sa.c f9538i;

    public static final class a implements wa.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wa.g f9539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f9540b;

        public a(wa.g gVar, e0 e0Var) {
            this.f9539a = gVar;
            this.f9540b = e0Var;
        }

        @Override // wa.g
        public final boolean a(int i14, long j8) {
            return this.f9539a.a(i14, j8);
        }

        @Override // wa.g
        public final void b(long j8, long j14, long j15, List<? extends ua.d> list, ua.e[] eVarArr) {
            this.f9539a.b(j8, j14, j15, list, eVarArr);
        }

        @Override // wa.g
        public final boolean c(long j8, ua.b bVar, List<? extends ua.d> list) {
            return this.f9539a.c(j8, bVar, list);
        }

        @Override // wa.g
        public final boolean d(int i14, long j8) {
            return this.f9539a.d(i14, j8);
        }

        @Override // wa.g
        public final void disable() {
            this.f9539a.disable();
        }

        @Override // wa.g
        public final void enable() {
            this.f9539a.enable();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9539a.equals(aVar.f9539a) && this.f9540b.equals(aVar.f9540b);
        }

        @Override // wa.g
        public final int evaluateQueueSize(long j8, List<? extends ua.d> list) {
            return this.f9539a.evaluateQueueSize(j8, list);
        }

        @Override // wa.j
        public final androidx.media3.common.q getFormat(int i14) {
            return this.f9540b.f8217d[this.f9539a.getIndexInTrackGroup(i14)];
        }

        @Override // wa.j
        public final int getIndexInTrackGroup(int i14) {
            return this.f9539a.getIndexInTrackGroup(i14);
        }

        @Override // wa.g
        public final androidx.media3.common.q getSelectedFormat() {
            return this.f9540b.f8217d[this.f9539a.getSelectedIndexInTrackGroup()];
        }

        @Override // wa.g
        public final int getSelectedIndex() {
            return this.f9539a.getSelectedIndex();
        }

        @Override // wa.g
        public final int getSelectedIndexInTrackGroup() {
            return this.f9539a.getSelectedIndexInTrackGroup();
        }

        @Override // wa.g
        public final Object getSelectionData() {
            return this.f9539a.getSelectionData();
        }

        @Override // wa.g
        public final int getSelectionReason() {
            return this.f9539a.getSelectionReason();
        }

        @Override // wa.j
        public final e0 getTrackGroup() {
            return this.f9540b;
        }

        public final int hashCode() {
            return this.f9539a.hashCode() + ((this.f9540b.hashCode() + 527) * 31);
        }

        @Override // wa.j
        public final int indexOf(int i14) {
            return this.f9539a.indexOf(i14);
        }

        @Override // wa.j
        public final int length() {
            return this.f9539a.length();
        }

        @Override // wa.g
        public final void onDiscontinuity() {
            this.f9539a.onDiscontinuity();
        }

        @Override // wa.g
        public final void onPlayWhenReadyChanged(boolean z14) {
            this.f9539a.onPlayWhenReadyChanged(z14);
        }

        @Override // wa.g
        public final void onPlaybackSpeed(float f14) {
            this.f9539a.onPlaybackSpeed(f14);
        }

        @Override // wa.g
        public final void onRebuffer() {
            this.f9539a.onRebuffer();
        }
    }

    public m(sa.d dVar, long[] jArr, i... iVarArr) {
        this.f9532c = dVar;
        this.f9530a = iVarArr;
        ((sa.e) dVar).getClass();
        this.f9538i = new sa.c(ImmutableList.of(), ImmutableList.of());
        this.f9531b = new IdentityHashMap<>();
        this.f9537h = new i[0];
        for (int i14 = 0; i14 < iVarArr.length; i14++) {
            long j8 = jArr[i14];
            if (j8 != 0) {
                this.f9530a[i14] = new w(iVarArr[i14], j8);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final void a(i iVar) {
        ArrayList<i> arrayList = this.f9533d;
        arrayList.remove(iVar);
        if (arrayList.isEmpty()) {
            i[] iVarArr = this.f9530a;
            int i14 = 0;
            for (i iVar2 : iVarArr) {
                i14 += iVar2.getTrackGroups().f158153a;
            }
            e0[] e0VarArr = new e0[i14];
            int i15 = 0;
            for (int i16 = 0; i16 < iVarArr.length; i16++) {
                sa.r trackGroups = iVarArr[i16].getTrackGroups();
                int i17 = trackGroups.f158153a;
                int i18 = 0;
                while (i18 < i17) {
                    e0 e0VarA = trackGroups.a(i18);
                    androidx.media3.common.q[] qVarArr = new androidx.media3.common.q[e0VarA.f8214a];
                    for (int i19 = 0; i19 < e0VarA.f8214a; i19++) {
                        androidx.media3.common.q qVar = e0VarA.f8217d[i19];
                        androidx.media3.common.q.b bVarA = qVar.a();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append(":");
                        String str = qVar.f8373a;
                        if (str == null) {
                            str = "";
                        }
                        sb3.append(str);
                        bVarA.f8399a = sb3.toString();
                        qVarArr[i19] = bVarA.a();
                    }
                    e0 e0Var = new e0(i16 + ":" + e0VarA.f8215b, qVarArr);
                    this.f9534e.put(e0Var, e0VarA);
                    e0VarArr[i15] = e0Var;
                    i18++;
                    i15++;
                }
            }
            this.f9536g = new sa.r(e0VarArr);
            i.a aVar = this.f9535f;
            aVar.getClass();
            aVar.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.s.a
    public final void b(s sVar) {
        i.a aVar = this.f9535f;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void c(i.a aVar, long j8) {
        this.f9535f = aVar;
        ArrayList<i> arrayList = this.f9533d;
        i[] iVarArr = this.f9530a;
        Collections.addAll(arrayList, iVarArr);
        for (i iVar : iVarArr) {
            iVar.c(this, j8);
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long d(wa.g[] gVarArr, boolean[] zArr, sa.n[] nVarArr, boolean[] zArr2, long j8) {
        IdentityHashMap<sa.n, Integer> identityHashMap;
        int[] iArr = new int[gVarArr.length];
        int[] iArr2 = new int[gVarArr.length];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int length = gVarArr.length;
            identityHashMap = this.f9531b;
            if (i15 >= length) {
                break;
            }
            sa.n nVar = nVarArr[i15];
            Integer num = nVar == null ? null : identityHashMap.get(nVar);
            iArr[i15] = num == null ? -1 : num.intValue();
            wa.g gVar = gVarArr[i15];
            if (gVar != null) {
                String str = gVar.getTrackGroup().f8215b;
                iArr2[i15] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i15] = -1;
            }
            i15++;
        }
        identityHashMap.clear();
        int length2 = gVarArr.length;
        sa.n[] nVarArr2 = new sa.n[length2];
        sa.n[] nVarArr3 = new sa.n[gVarArr.length];
        wa.g[] gVarArr2 = new wa.g[gVarArr.length];
        i[] iVarArr = this.f9530a;
        ArrayList arrayList = new ArrayList(iVarArr.length);
        long j14 = j8;
        int i16 = 0;
        while (i16 < iVarArr.length) {
            int i17 = i14;
            while (i17 < gVarArr.length) {
                nVarArr3[i17] = iArr[i17] == i16 ? nVarArr[i17] : null;
                if (iArr2[i17] == i16) {
                    wa.g gVar2 = gVarArr[i17];
                    gVar2.getClass();
                    e0 e0Var = this.f9534e.get(gVar2.getTrackGroup());
                    e0Var.getClass();
                    gVarArr2[i17] = new a(gVar2, e0Var);
                } else {
                    gVarArr2[i17] = null;
                }
                i17++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            i[] iVarArr2 = iVarArr;
            int i18 = i16;
            long jD = iVarArr2[i16].d(gVarArr2, zArr, nVarArr3, zArr2, j14);
            if (i18 == 0) {
                j14 = jD;
            } else if (jD != j14) {
                vb.h.z("Children enabled at different positions.");
                return 0L;
            }
            boolean z14 = false;
            for (int i19 = 0; i19 < gVarArr.length; i19++) {
                if (iArr2[i19] == i18) {
                    sa.n nVar2 = nVarArr3[i19];
                    nVar2.getClass();
                    nVarArr2[i19] = nVarArr3[i19];
                    identityHashMap.put(nVar2, Integer.valueOf(i18));
                    z14 = true;
                } else if (iArr3[i19] == i18) {
                    fa.a.d(nVarArr3[i19] == null);
                }
            }
            if (z14) {
                arrayList.add(iVarArr2[i18]);
            }
            i16 = i18 + 1;
            iVarArr = iVarArr2;
            iArr = iArr3;
            i14 = 0;
        }
        int i24 = i14;
        System.arraycopy(nVarArr2, i24, nVarArr, i24, length2);
        this.f9537h = (i[]) arrayList.toArray(new i[i24]);
        List listTransform = Lists.transform(arrayList, new androidx.media3.common.p(13));
        ((sa.e) this.f9532c).getClass();
        this.f9538i = new sa.c(arrayList, listTransform);
        return j14;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void discardBuffer(long j8, boolean z14) {
        for (i iVar : this.f9537h) {
            iVar.discardBuffer(j8, z14);
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long e(long j8, x0 x0Var) {
        i[] iVarArr = this.f9537h;
        return (iVarArr.length > 0 ? iVarArr[0] : this.f9530a[0]).e(j8, x0Var);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        ArrayList<i> arrayList = this.f9533d;
        if (arrayList.isEmpty()) {
            return this.f9538i.f(d0Var);
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.get(i14).f(d0Var);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        return this.f9538i.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        return this.f9538i.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final sa.r getTrackGroups() {
        sa.r rVar = this.f9536g;
        rVar.getClass();
        return rVar;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        return this.f9538i.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowPrepareError() {
        for (i iVar : this.f9530a) {
            iVar.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long readDiscontinuity() {
        long j8 = -9223372036854775807L;
        for (i iVar : this.f9537h) {
            long discontinuity = iVar.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j8 != C.TIME_UNSET && iVar.seekToUs(j8) != j8) {
                    vb.h.z("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j8 == C.TIME_UNSET) {
                for (i iVar2 : this.f9537h) {
                    if (iVar2 == iVar) {
                        break;
                    }
                    if (iVar2.seekToUs(discontinuity) != discontinuity) {
                        vb.h.z("Unexpected child seekToUs result.");
                        return 0L;
                    }
                }
                j8 = discontinuity;
            } else if (discontinuity != j8) {
                vb.h.z("Conflicting discontinuities.");
                return 0L;
            }
        }
        return j8;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
        this.f9538i.reevaluateBuffer(j8);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long seekToUs(long j8) {
        long jSeekToUs = this.f9537h[0].seekToUs(j8);
        int i14 = 1;
        while (true) {
            i[] iVarArr = this.f9537h;
            if (i14 >= iVarArr.length) {
                return jSeekToUs;
            }
            if (iVarArr[i14].seekToUs(jSeekToUs) != jSeekToUs) {
                vb.h.z("Unexpected child seekToUs result.");
                return 0L;
            }
            i14++;
        }
    }
}
