package ma;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.e0;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import c22.t;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import fa.z;
import j20.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f117480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha.d f117481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ha.d f117482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f117483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f117484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.q[] f117485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HlsPlaylistTracker f117486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f117487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<androidx.media3.common.q> f117488i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ja.q f117490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xa.d f117491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f117492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f117493n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BehindLiveWindowException f117495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f117496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f117497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wa.g f117498s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f117500u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f117501v = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ma.e f117489j = new ma.e(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f117494o = z.f70076f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f117499t = C.TIME_UNSET;

    public static final class a extends ua.c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f117502l;

        public a(ha.d dVar, ha.g gVar, androidx.media3.common.q qVar, int i14, Object obj, byte[] bArr) {
            super(dVar, gVar, 3, qVar, i14, obj, bArr);
        }

        @Override // ua.c
        public final void a(byte[] bArr, int i14) {
            this.f117502l = Arrays.copyOf(bArr, i14);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ua.b f117503a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f117504b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f117505c = null;
    }

    public static final class c extends ua.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<androidx.media3.exoplayer.hls.playlist.b.e> f117506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f117507f;

        public c(String str, long j8, List<androidx.media3.exoplayer.hls.playlist.b.e> list) {
            super(0L, list.size() - 1);
            this.f117507f = j8;
            this.f117506e = list;
        }

        @Override // ua.e
        public final long getChunkEndTimeUs() {
            long j8 = this.f169582d;
            if (j8 < this.f169580b || j8 > this.f169581c) {
                t.g();
                return 0L;
            }
            androidx.media3.exoplayer.hls.playlist.b.e eVar = this.f117506e.get((int) j8);
            return this.f117507f + eVar.f9116e + eVar.f9114c;
        }

        @Override // ua.e
        public final long getChunkStartTimeUs() {
            long j8 = this.f169582d;
            if (j8 < this.f169580b || j8 > this.f169581c) {
                t.g();
                return 0L;
            }
            return this.f117507f + this.f117506e.get((int) j8).f9116e;
        }
    }

    public static final class d extends wa.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f117508g;

        public d(e0 e0Var, int[] iArr) {
            super(e0Var, iArr);
            int i14 = 0;
            androidx.media3.common.q qVar = e0Var.f8217d[iArr[0]];
            while (i14 < this.f183642b) {
                if (this.f183644d[i14] == qVar) {
                    this.f117508g = i14;
                }
                i14++;
            }
            i14 = -1;
            this.f117508g = i14;
        }

        @Override // wa.g
        public final void b(long j8, long j14, long j15, List<? extends ua.d> list, ua.e[] eVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.f117508g, jElapsedRealtime)) {
                for (int i14 = this.f183642b - 1; i14 >= 0; i14--) {
                    if (!a(i14, jElapsedRealtime)) {
                        this.f117508g = i14;
                        return;
                    }
                }
                x.h();
            }
        }

        @Override // wa.g
        public final int getSelectedIndex() {
            return this.f117508g;
        }

        @Override // wa.g
        public final Object getSelectionData() {
            return null;
        }

        @Override // wa.g
        public final int getSelectionReason() {
            return 0;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.hls.playlist.b.e f117509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f117510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f117511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f117512d;

        public e(androidx.media3.exoplayer.hls.playlist.b.e eVar, long j8, int i14) {
            this.f117509a = eVar;
            this.f117510b = j8;
            this.f117511c = i14;
            this.f117512d = (eVar instanceof androidx.media3.exoplayer.hls.playlist.b.C0125b) && ((androidx.media3.exoplayer.hls.playlist.b.C0125b) eVar).f9106m;
        }
    }

    public f(h hVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, androidx.media3.common.q[] qVarArr, g gVar, ha.n nVar, q qVar, long j8, List<androidx.media3.common.q> list, ja.q qVar2, xa.d dVar) {
        this.f117480a = hVar;
        this.f117486g = hlsPlaylistTracker;
        this.f117484e = uriArr;
        this.f117485f = qVarArr;
        this.f117483d = qVar;
        this.f117492m = j8;
        this.f117488i = list;
        this.f117490k = qVar2;
        this.f117491l = dVar;
        ha.d dVarCreateDataSource = gVar.createDataSource();
        this.f117481b = dVarCreateDataSource;
        if (nVar != null) {
            dVarCreateDataSource.a(nVar);
        }
        this.f117482c = gVar.createDataSource();
        this.f117487h = new e0(qVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < uriArr.length; i14++) {
            if ((qVarArr[i14].f8378f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        this.f117498s = new d(this.f117487h, Ints.toArray(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e d(androidx.media3.exoplayer.hls.playlist.b bVar, long j8, int i14) {
        long j14 = bVar.f9093k;
        ImmutableList immutableList = bVar.f9101s;
        int i15 = (int) (j8 - j14);
        ImmutableList immutableList2 = bVar.f9100r;
        if (i15 == immutableList2.size()) {
            if (i14 == -1) {
                i14 = 0;
            }
            if (i14 < immutableList.size()) {
                return new e((androidx.media3.exoplayer.hls.playlist.b.e) immutableList.get(i14), j8, i14);
            }
            return null;
        }
        androidx.media3.exoplayer.hls.playlist.b.d dVar = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList2.get(i15);
        if (i14 == -1) {
            return new e(dVar, j8, -1);
        }
        if (i14 < dVar.f9111m.size()) {
            return new e((androidx.media3.exoplayer.hls.playlist.b.e) dVar.f9111m.get(i14), j8, i14);
        }
        int i16 = i15 + 1;
        if (i16 < immutableList2.size()) {
            return new e((androidx.media3.exoplayer.hls.playlist.b.e) immutableList2.get(i16), j8 + 1, -1);
        }
        if (immutableList.isEmpty()) {
            return null;
        }
        return new e((androidx.media3.exoplayer.hls.playlist.b.e) immutableList.get(0), j8 + 1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ua.e[] a(j jVar, long j8) {
        List listOf;
        f fVar = this;
        j jVar2 = jVar;
        int iB = jVar2 == null ? -1 : fVar.f117487h.b(jVar2.f169586d);
        int length = fVar.f117498s.length();
        ua.e[] eVarArr = new ua.e[length];
        boolean z14 = false;
        int i14 = 0;
        while (i14 < length) {
            int indexInTrackGroup = fVar.f117498s.getIndexInTrackGroup(i14);
            Uri uri = fVar.f117484e[indexInTrackGroup];
            HlsPlaylistTracker hlsPlaylistTracker = fVar.f117486g;
            if (hlsPlaylistTracker.o(uri)) {
                androidx.media3.exoplayer.hls.playlist.b bVarH = hlsPlaylistTracker.h(uri, z14);
                bVarH.getClass();
                long j14 = bVarH.f9090h - hlsPlaylistTracker.j();
                Pair<Long, Integer> pairC = fVar.c(jVar2, indexInTrackGroup != iB ? true : z14, bVarH, j14, j8);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                String str = bVarH.f125102a;
                long j15 = bVarH.f9093k;
                ImmutableList immutableList = bVarH.f9101s;
                ImmutableList immutableList2 = bVarH.f9100r;
                int i15 = (int) (jLongValue - j15);
                if (i15 < 0 || immutableList2.size() < i15) {
                    listOf = ImmutableList.of();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i15 < immutableList2.size()) {
                        if (iIntValue != -1) {
                            androidx.media3.exoplayer.hls.playlist.b.d dVar = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList2.get(i15);
                            if (iIntValue == 0) {
                                arrayList.add(dVar);
                            } else if (iIntValue < dVar.f9111m.size()) {
                                ImmutableList immutableList3 = dVar.f9111m;
                                arrayList.addAll(immutableList3.subList(iIntValue, immutableList3.size()));
                            }
                            i15++;
                        }
                        arrayList.addAll(immutableList2.subList(i15, immutableList2.size()));
                        iIntValue = 0;
                    }
                    if (bVarH.f9096n != C.TIME_UNSET) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < immutableList.size()) {
                            arrayList.addAll(immutableList.subList(iIntValue, immutableList.size()));
                        }
                    }
                    listOf = Collections.unmodifiableList(arrayList);
                }
                eVarArr[i14] = new c(str, j14, listOf);
            } else {
                eVarArr[i14] = ua.e.f169595a;
            }
            i14++;
            fVar = this;
            jVar2 = jVar;
            z14 = false;
        }
        return eVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(j jVar) {
        int i14 = jVar.f117517o;
        if (i14 == -1) {
            return 1;
        }
        androidx.media3.exoplayer.hls.playlist.b bVarH = this.f117486g.h(this.f117484e[this.f117487h.b(jVar.f169586d)], false);
        bVarH.getClass();
        ImmutableList immutableList = bVarH.f9100r;
        int i15 = (int) (jVar.f169594j - bVarH.f9093k);
        if (i15 < 0) {
            return 1;
        }
        ImmutableList immutableList2 = i15 < immutableList.size() ? ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(i15)).f9111m : bVarH.f9101s;
        if (i14 >= immutableList2.size()) {
            return 2;
        }
        androidx.media3.exoplayer.hls.playlist.b.C0125b c0125b = (androidx.media3.exoplayer.hls.playlist.b.C0125b) immutableList2.get(i14);
        if (c0125b.f9106m) {
            return 0;
        }
        Uri uri = Uri.parse(fa.x.c(bVarH.f125102a, c0125b.f9112a));
        Uri uri2 = jVar.f169584b.f82555a;
        int i16 = z.f70071a;
        return Objects.equals(uri, uri2) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Long, Integer> c(j jVar, boolean z14, androidx.media3.exoplayer.hls.playlist.b bVar, long j8, long j14) {
        int i14;
        boolean z15 = true;
        if (jVar != null) {
            long j15 = jVar.f169594j;
            int i15 = jVar.f117517o;
            if (!z14) {
                if (!jVar.I) {
                    return new Pair<>(Long.valueOf(j15), Integer.valueOf(i15));
                }
                if (i15 == -1) {
                    j15 = j15 != -1 ? j15 + 1 : -1L;
                }
                return new Pair<>(Long.valueOf(j15), Integer.valueOf(i15 != -1 ? i15 + 1 : -1));
            }
        }
        long j16 = bVar.f9103u;
        ImmutableList immutableList = bVar.f9101s;
        long j17 = bVar.f9093k;
        ImmutableList immutableList2 = bVar.f9100r;
        long j18 = j8 + j16;
        long j19 = (jVar == null || this.f117497r) ? j14 : jVar.f169589g;
        if (!bVar.f9097o && j19 >= j18) {
            return new Pair<>(Long.valueOf(j17 + ((long) immutableList2.size())), -1);
        }
        long j24 = j19 - j8;
        Long lValueOf = Long.valueOf(j24);
        if (this.f117486g.p() && jVar != null) {
            z15 = false;
        }
        int iC = z.c(immutableList2, lValueOf, z15);
        long j25 = ((long) iC) + j17;
        if (iC >= 0) {
            androidx.media3.exoplayer.hls.playlist.b.d dVar = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList2.get(iC);
            ImmutableList immutableList3 = j24 < dVar.f9116e + dVar.f9114c ? dVar.f9111m : immutableList;
            for (int i16 = 0; i16 < immutableList3.size(); i16++) {
                androidx.media3.exoplayer.hls.playlist.b.C0125b c0125b = (androidx.media3.exoplayer.hls.playlist.b.C0125b) immutableList3.get(i16);
                if (j24 < c0125b.f9116e + c0125b.f9114c) {
                    if (c0125b.f9105l) {
                        j25 += immutableList3 == immutableList ? 1L : 0L;
                        i14 = i16;
                    }
                }
            }
            i14 = -1;
        } else {
            i14 = -1;
        }
        return new Pair<>(Long.valueOf(j25), Integer.valueOf(i14));
    }

    public final a e(Uri uri, int i14, boolean z14, xa.e eVar) {
        if (uri == null) {
            return null;
        }
        ma.e eVar2 = this.f117489j;
        byte[] bArrRemove = eVar2.f117478a.remove(uri);
        if (bArrRemove != null) {
            eVar2.f117478a.put(uri, bArrRemove);
            return null;
        }
        ha.g.b bVar = new ha.g.b();
        bVar.f82565a = uri;
        bVar.f82573i = 1;
        ha.g gVarA = bVar.a();
        if (eVar != null) {
            eVar.f189671a.getClass();
            throw null;
        }
        return new a(this.f117482c, gVarA, this.f117485f[i14], this.f117498s.getSelectionReason(), this.f117498s.getSelectionData(), this.f117494o);
    }
}
