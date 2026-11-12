package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class d9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9c f15253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f15254b;
    public final com.google.android.exoplayer2.upstream.a c;
    public final sfp d;
    public final Uri[] e;
    public final Format[] f;
    public final HlsPlaylistTracker g;
    public final TrackGroup h;
    public final List<Format> i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15255k;
    public IOException m;
    public Uri n;
    public boolean o;
    public com.google.android.exoplayer2.trackselection.b p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15256r;
    public final wta j = new wta(4);
    public byte[] l = wlq.f;
    public long q = -9223372036854775807L;

    public static final class a extends zk5 {
        public byte[] l;

        public a(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, Format format, int i, Object obj, byte[] bArr) {
            super(aVar, bVar, 3, format, i, obj, bArr);
        }

        @Override // defpackage.zk5
        public void f(byte[] bArr, int i) {
            this.l = Arrays.copyOf(bArr, i);
        }

        public byte[] i() {
            return this.l;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public cw3 f15257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15258b;
        public Uri c;

        public b() {
            a();
        }

        public void a() {
            this.f15257a = null;
            this.f15258b = false;
            this.c = null;
        }
    }

    @VisibleForTesting
    public static final class c extends g92 {
        public final List<com.google.android.exoplayer2.source.hls.playlist.c.e> e;
        public final long f;
        public final String g;

        public c(String str, long j, List<com.google.android.exoplayer2.source.hls.playlist.c.e> list) {
            super(0L, list.size() - 1);
            this.g = str;
            this.f = j;
            this.e = list;
        }

        @Override // defpackage.uif
        public long a() {
            c();
            com.google.android.exoplayer2.source.hls.playlist.c.e eVar = this.e.get((int) d());
            return this.f + eVar.e + eVar.c;
        }

        @Override // defpackage.uif
        public long b() {
            c();
            return this.f + this.e.get((int) d()).e;
        }
    }

    public static final class d extends ye2 {
        public int h;

        public d(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.h = q(trackGroup.a(iArr[0]));
        }

        @Override // com.google.android.exoplayer2.trackselection.b
        public int a() {
            return this.h;
        }

        @Override // com.google.android.exoplayer2.trackselection.b
        public Object n() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.b
        public void o(long j, long j2, long j3, List<? extends tif> list, uif[] uifVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (t(this.h, jElapsedRealtime)) {
                for (int i = this.f40088b - 1; i >= 0; i--) {
                    if (!t(i, jElapsedRealtime)) {
                        this.h = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.b
        public int r() {
            return 0;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.hls.playlist.c.e f15259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15260b;
        public final int c;
        public final boolean d;

        public e(com.google.android.exoplayer2.source.hls.playlist.c.e eVar, long j, int i) {
            this.f15259a = eVar;
            this.f15260b = j;
            this.c = i;
            this.d = (eVar instanceof com.google.android.exoplayer2.source.hls.playlist.c.b) && ((com.google.android.exoplayer2.source.hls.playlist.c.b) eVar).m;
        }
    }

    public d9c(f9c f9cVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, e9c e9cVar, fxp fxpVar, sfp sfpVar, List<Format> list) {
        this.f15253a = f9cVar;
        this.g = hlsPlaylistTracker;
        this.e = uriArr;
        this.f = formatArr;
        this.d = sfpVar;
        this.i = list;
        com.google.android.exoplayer2.upstream.a aVarA = e9cVar.a(1);
        this.f15254b = aVarA;
        if (fxpVar != null) {
            aVarA.f(fxpVar);
        }
        this.c = e9cVar.a(3);
        this.h = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((formatArr[i].e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.p = new d(this.h, ahd.k(arrayList));
    }

    public static Uri c(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c.e eVar) {
        String str;
        if (eVar == null || (str = eVar.g) == null) {
            return null;
        }
        return hdq.d(cVar.f23628a, str);
    }

    public static e f(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j, int i) {
        int i2 = (int) (j - cVar.i);
        if (i2 == cVar.p.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < cVar.q.size()) {
                return new e(cVar.q.get(i), j, i);
            }
            return null;
        }
        com.google.android.exoplayer2.source.hls.playlist.c.d dVar = cVar.p.get(i2);
        if (i == -1) {
            return new e(dVar, j, -1);
        }
        if (i < dVar.m.size()) {
            return new e(dVar.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < cVar.p.size()) {
            return new e(cVar.p.get(i3), j + 1, -1);
        }
        if (cVar.q.isEmpty()) {
            return null;
        }
        return new e(cVar.q.get(0), j + 1, 0);
    }

    @VisibleForTesting
    public static List<com.google.android.exoplayer2.source.hls.playlist.c.e> h(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j, int i) {
        int i2 = (int) (j - cVar.i);
        if (i2 < 0 || cVar.p.size() < i2) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < cVar.p.size()) {
            if (i != -1) {
                com.google.android.exoplayer2.source.hls.playlist.c.d dVar = cVar.p.get(i2);
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i < dVar.m.size()) {
                    List<com.google.android.exoplayer2.source.hls.playlist.c.b> list = dVar.m;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List<com.google.android.exoplayer2.source.hls.playlist.c.d> list2 = cVar.p;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (cVar.l != -9223372036854775807L) {
            int i3 = i != -1 ? i : 0;
            if (i3 < cVar.q.size()) {
                List<com.google.android.exoplayer2.source.hls.playlist.c.b> list3 = cVar.q;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public uif[] a(h9c h9cVar, long j) {
        int i;
        int iC = h9cVar == null ? -1 : this.h.c(h9cVar.d);
        int length = this.p.length();
        uif[] uifVarArr = new uif[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int iC2 = this.p.c(i2);
            Uri uri = this.e[iC2];
            if (this.g.h(uri)) {
                com.google.android.exoplayer2.source.hls.playlist.c cVarK = this.g.k(uri, z);
                rk1.e(cVarK);
                long jB = cVarK.f - this.g.b();
                i = i2;
                Pair<Long, Integer> pairE = e(h9cVar, iC2 != iC ? true : z, cVarK, jB, j);
                uifVarArr[i] = new c(cVarK.f23628a, jB, h(cVarK, ((Long) pairE.first).longValue(), ((Integer) pairE.second).intValue()));
            } else {
                uifVarArr[i2] = uif.f35791a;
                i = i2;
            }
            i2 = i + 1;
            z = false;
        }
        return uifVarArr;
    }

    public int b(h9c h9cVar) {
        if (h9cVar.o == -1) {
            return 1;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar = (com.google.android.exoplayer2.source.hls.playlist.c) rk1.e(this.g.k(this.e[this.h.c(h9cVar.d)], false));
        int i = (int) (h9cVar.j - cVar.i);
        if (i < 0) {
            return 1;
        }
        List<com.google.android.exoplayer2.source.hls.playlist.c.b> list = i < cVar.p.size() ? cVar.p.get(i).m : cVar.q;
        if (h9cVar.o >= list.size()) {
            return 2;
        }
        com.google.android.exoplayer2.source.hls.playlist.c.b bVar = list.get(h9cVar.o);
        if (bVar.m) {
            return 0;
        }
        return wlq.c(Uri.parse(hdq.c(cVar.f23628a, bVar.f8166a)), h9cVar.f14795b.f8404a) ? 1 : 2;
    }

    public void d(long j, long j2, List<h9c> list, boolean z, b bVar) {
        long jB;
        Uri uri;
        h9c h9cVar = list.isEmpty() ? null : (h9c) cpd.f(list);
        int iC = h9cVar == null ? -1 : this.h.c(h9cVar.d);
        long jMax = j2 - j;
        long jQ = q(j);
        if (h9cVar != null && !this.o) {
            long jC = h9cVar.c();
            jMax = Math.max(0L, jMax - jC);
            if (jQ != -9223372036854775807L) {
                jQ = Math.max(0L, jQ - jC);
            }
        }
        this.p.o(j, jMax, jQ, list, a(h9cVar, j2));
        int iH = this.p.h();
        boolean z2 = iC != iH;
        Uri uri2 = this.e[iH];
        if (!this.g.h(uri2)) {
            bVar.c = uri2;
            this.f15256r &= uri2.equals(this.n);
            this.n = uri2;
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVarK = this.g.k(uri2, true);
        rk1.e(cVarK);
        this.o = cVarK.c;
        u(cVarK);
        long jB2 = cVarK.f - this.g.b();
        Pair<Long, Integer> pairE = e(h9cVar, z2, cVarK, jB2, j2);
        long jLongValue = ((Long) pairE.first).longValue();
        int iIntValue = ((Integer) pairE.second).intValue();
        if (jLongValue >= cVarK.i || h9cVar == null || !z2) {
            jB = jB2;
            uri = uri2;
            iC = iH;
        } else {
            Uri uri3 = this.e[iC];
            com.google.android.exoplayer2.source.hls.playlist.c cVarK2 = this.g.k(uri3, true);
            rk1.e(cVarK2);
            jB = cVarK2.f - this.g.b();
            Pair<Long, Integer> pairE2 = e(h9cVar, false, cVarK2, jB, j2);
            jLongValue = ((Long) pairE2.first).longValue();
            iIntValue = ((Integer) pairE2.second).intValue();
            uri = uri3;
            cVarK = cVarK2;
        }
        if (jLongValue < cVarK.i) {
            this.m = new BehindLiveWindowException();
            return;
        }
        e eVarF = f(cVarK, jLongValue, iIntValue);
        if (eVarF == null) {
            if (!cVarK.m) {
                bVar.c = uri;
                this.f15256r &= uri.equals(this.n);
                this.n = uri;
                return;
            } else {
                if (z || cVarK.p.isEmpty()) {
                    bVar.f15258b = true;
                    return;
                }
                eVarF = new e((com.google.android.exoplayer2.source.hls.playlist.c.e) cpd.f(cVarK.p), (cVarK.i + ((long) cVarK.p.size())) - 1, -1);
            }
        }
        this.f15256r = false;
        this.n = null;
        Uri uriC = c(cVarK, eVarF.f15259a.f8167b);
        cw3 cw3VarK = k(uriC, iC);
        bVar.f15257a = cw3VarK;
        if (cw3VarK != null) {
            return;
        }
        Uri uriC2 = c(cVarK, eVarF.f15259a);
        cw3 cw3VarK2 = k(uriC2, iC);
        bVar.f15257a = cw3VarK2;
        if (cw3VarK2 != null) {
            return;
        }
        bVar.f15257a = h9c.i(this.f15253a, this.f15254b, this.f[iC], jB, cVarK, eVarF, uri, this.i, this.p.r(), this.p.n(), this.f15255k, this.d, h9cVar, this.j.a(uriC2), this.j.a(uriC));
    }

    public final Pair<Long, Integer> e(h9c h9cVar, boolean z, com.google.android.exoplayer2.source.hls.playlist.c cVar, long j, long j2) {
        int i = -1;
        if (h9cVar != null && !z) {
            if (!h9cVar.g()) {
                return new Pair<>(Long.valueOf(h9cVar.j), Integer.valueOf(h9cVar.o));
            }
            Long lValueOf = Long.valueOf(h9cVar.o == -1 ? h9cVar.f() : h9cVar.j);
            int i2 = h9cVar.o;
            return new Pair<>(lValueOf, Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j3 = cVar.s + j;
        if (h9cVar != null && !this.o) {
            j2 = h9cVar.g;
        }
        if (!cVar.m && j2 >= j3) {
            return new Pair<>(Long.valueOf(cVar.i + ((long) cVar.p.size())), -1);
        }
        long j4 = j2 - j;
        int iG = wlq.g(cVar.p, Long.valueOf(j4), true, !this.g.i() || h9cVar == null);
        long j5 = ((long) iG) + cVar.i;
        if (iG >= 0) {
            com.google.android.exoplayer2.source.hls.playlist.c.d dVar = cVar.p.get(iG);
            List<com.google.android.exoplayer2.source.hls.playlist.c.b> list = j4 < dVar.e + dVar.c ? dVar.m : cVar.q;
            for (int i3 = 0; i3 < list.size(); i3++) {
                com.google.android.exoplayer2.source.hls.playlist.c.b bVar = list.get(i3);
                if (j4 < bVar.e + bVar.c) {
                    if (!bVar.l) {
                        break;
                    }
                    j5 += list == cVar.q ? 1L : 0L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j5), Integer.valueOf(i));
    }

    public int g(long j, List<? extends tif> list) {
        return (this.m != null || this.p.length() < 2) ? list.size() : this.p.g(j, list);
    }

    public TrackGroup i() {
        return this.h;
    }

    public com.google.android.exoplayer2.trackselection.b j() {
        return this.p;
    }

    public final cw3 k(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.j.c(uri);
        if (bArrC != null) {
            this.j.b(uri, bArrC);
            return null;
        }
        return new a(this.c, new com.google.android.exoplayer2.upstream.b.C0206b().i(uri).b(1).a(), this.f[i], this.p.r(), this.p.n(), this.l);
    }

    public boolean l(cw3 cw3Var, long j) {
        com.google.android.exoplayer2.trackselection.b bVar = this.p;
        return bVar.k(bVar.e(this.h.c(cw3Var.d)), j);
    }

    public void m() throws IOException {
        IOException iOException = this.m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.n;
        if (uri == null || !this.f15256r) {
            return;
        }
        this.g.e(uri);
    }

    public void n(cw3 cw3Var) {
        if (cw3Var instanceof a) {
            a aVar = (a) cw3Var;
            this.l = aVar.g();
            this.j.b(aVar.f14795b.f8404a, (byte[]) rk1.e(aVar.i()));
        }
    }

    public boolean o(Uri uri, long j) {
        int iE;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iE = this.p.e(i)) == -1) {
            return true;
        }
        this.f15256r = uri.equals(this.n) | this.f15256r;
        return j == -9223372036854775807L || this.p.k(iE, j);
    }

    public void p() {
        this.m = null;
    }

    public final long q(long j) {
        long j2 = this.q;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    public void r(boolean z) {
        this.f15255k = z;
    }

    public void s(com.google.android.exoplayer2.trackselection.b bVar) {
        this.p = bVar;
    }

    public boolean t(long j, cw3 cw3Var, List<? extends tif> list) {
        if (this.m != null) {
            return false;
        }
        return this.p.b(j, cw3Var, list);
    }

    public final void u(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        this.q = cVar.m ? -9223372036854775807L : cVar.e() - this.g.b();
    }
}
