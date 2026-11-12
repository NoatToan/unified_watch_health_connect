package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.upstream.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j9c implements j, q9c.b, HlsPlaylistTracker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9c f22556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HlsPlaylistTracker f22557b;
    public final e9c c;
    public final fxp d;
    public final c e;
    public final b.a f;
    public final h g;
    public final l.a h;
    public final r61 i;
    public final ra4 l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public j.a p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TrackGroupArray f22559r;
    public int v;
    public s w;
    public final IdentityHashMap<k9l, Integer> j = new IdentityHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sfp f22558k = new sfp();
    public q9c[] s = new q9c[0];
    public q9c[] t = new q9c[0];
    public int[][] u = new int[0][];

    public j9c(f9c f9cVar, HlsPlaylistTracker hlsPlaylistTracker, e9c e9cVar, fxp fxpVar, c cVar, b.a aVar, h hVar, l.a aVar2, r61 r61Var, ra4 ra4Var, boolean z, int i, boolean z2) {
        this.f22556a = f9cVar;
        this.f22557b = hlsPlaylistTracker;
        this.c = e9cVar;
        this.d = fxpVar;
        this.e = cVar;
        this.f = aVar;
        this.g = hVar;
        this.h = aVar2;
        this.i = r61Var;
        this.l = ra4Var;
        this.m = z;
        this.n = i;
        this.o = z2;
        this.w = ra4Var.a(new s[0]);
    }

    public static Format x(Format format, Format format2, boolean z) {
        String strK;
        Metadata metadata;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        if (format2 != null) {
            strK = format2.i;
            metadata = format2.j;
            i2 = format2.y;
            i = format2.d;
            i3 = format2.e;
            str = format2.c;
            str2 = format2.f7816b;
        } else {
            strK = wlq.K(format.i, 1);
            metadata = format.j;
            if (z) {
                i2 = format.y;
                i = format.d;
                i3 = format.e;
                str = format.c;
                str2 = format.f7816b;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        return new Format.b().S(format.f7815a).U(str2).K(format.f7817k).e0(ayf.g(strK)).I(strK).X(metadata).G(z ? format.f : -1).Z(z ? format.g : -1).H(i2).g0(i).c0(i3).V(str).E();
    }

    public static Map<String, DrmInitData> y(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitDataG = list.get(i);
            String str = drmInitDataG.c;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData.c, str)) {
                    drmInitDataG = drmInitDataG.g(drmInitData);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            map.put(str, drmInitDataG);
        }
        return map;
    }

    public static Format z(Format format) {
        String strK = wlq.K(format.i, 2);
        return new Format.b().S(format.f7815a).U(format.f7816b).K(format.f7817k).e0(ayf.g(strK)).I(strK).X(format.j).G(format.f).Z(format.g).j0(format.q).Q(format.f7818r).P(format.s).g0(format.d).c0(format.e).E();
    }

    @Override // com.google.android.exoplayer2.source.s.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void k(q9c q9cVar) {
        this.p.k(this);
    }

    public void B() {
        this.f22557b.a(this);
        for (q9c q9cVar : this.s) {
            q9cVar.e0();
        }
        this.p = null;
    }

    @Override // q9c.b
    public void a() {
        int i = this.q - 1;
        this.q = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (q9c q9cVar : this.s) {
            i2 += q9cVar.n().f8078a;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        for (q9c q9cVar2 : this.s) {
            int i4 = q9cVar2.n().f8078a;
            int i5 = 0;
            while (i5 < i4) {
                trackGroupArr[i3] = q9cVar2.n().a(i5);
                i5++;
                i3++;
            }
        }
        this.f22559r = new TrackGroupArray(trackGroupArr);
        this.p.o(this);
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        if (this.f22559r != null) {
            return this.w.c(j);
        }
        for (q9c q9cVar : this.s) {
            q9cVar.B();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public void d() {
        for (q9c q9cVar : this.s) {
            q9cVar.a0();
        }
        this.p.k(this);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        return this.w.e();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
        this.w.f(j);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        return this.w.g();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.w.h();
    }

    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        q9c[] q9cVarArr = this.t;
        if (q9cVarArr.length > 0) {
            boolean zH0 = q9cVarArr[0].h0(j, false);
            int i = 1;
            while (true) {
                q9c[] q9cVarArr2 = this.t;
                if (i >= q9cVarArr2.length) {
                    break;
                }
                q9cVarArr2[i].h0(j, zH0);
                i++;
            }
            if (zH0) {
                this.f22558k.b();
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public boolean l(Uri uri, long j) {
        boolean Z = true;
        for (q9c q9cVar : this.s) {
            Z &= q9cVar.Z(uri, j);
        }
        this.p.k(this);
        return Z;
    }

    @Override // q9c.b
    public void m(Uri uri) {
        this.f22557b.f(uri);
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        return (TrackGroupArray) rk1.e(this.f22559r);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        k9l[] k9lVarArr2 = k9lVarArr;
        int[] iArr = new int[bVarArr.length];
        int[] iArr2 = new int[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            k9l k9lVar = k9lVarArr2[i];
            iArr[i] = k9lVar == null ? -1 : this.j.get(k9lVar).intValue();
            iArr2[i] = -1;
            com.google.android.exoplayer2.trackselection.b bVar = bVarArr[i];
            if (bVar != null) {
                TrackGroup trackGroupF = bVar.f();
                int i2 = 0;
                while (true) {
                    q9c[] q9cVarArr = this.s;
                    if (i2 >= q9cVarArr.length) {
                        break;
                    }
                    if (q9cVarArr[i2].n().c(trackGroupF) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.j.clear();
        int length = bVarArr.length;
        k9l[] k9lVarArr3 = new k9l[length];
        k9l[] k9lVarArr4 = new k9l[bVarArr.length];
        com.google.android.exoplayer2.trackselection.b[] bVarArr2 = new com.google.android.exoplayer2.trackselection.b[bVarArr.length];
        q9c[] q9cVarArr2 = new q9c[this.s.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < this.s.length) {
            for (int i5 = 0; i5 < bVarArr.length; i5++) {
                com.google.android.exoplayer2.trackselection.b bVar2 = null;
                k9lVarArr4[i5] = iArr[i5] == i4 ? k9lVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    bVar2 = bVarArr[i5];
                }
                bVarArr2[i5] = bVar2;
            }
            q9c q9cVar = this.s[i4];
            int i6 = i3;
            int i7 = length;
            int i8 = i4;
            com.google.android.exoplayer2.trackselection.b[] bVarArr3 = bVarArr2;
            q9c[] q9cVarArr3 = q9cVarArr2;
            boolean zI0 = q9cVar.i0(bVarArr2, zArr, k9lVarArr4, zArr2, j, z);
            int i9 = 0;
            boolean z2 = false;
            while (true) {
                if (i9 >= bVarArr.length) {
                    break;
                }
                k9l k9lVar2 = k9lVarArr4[i9];
                if (iArr2[i9] == i8) {
                    rk1.e(k9lVar2);
                    k9lVarArr3[i9] = k9lVar2;
                    this.j.put(k9lVar2, Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    rk1.g(k9lVar2 == null);
                }
                i9++;
            }
            if (z2) {
                q9cVarArr3[i6] = q9cVar;
                i3 = i6 + 1;
                if (i6 == 0) {
                    q9cVar.l0(true);
                    if (zI0) {
                        this.f22558k.b();
                        z = true;
                    } else {
                        q9c[] q9cVarArr4 = this.t;
                        if (q9cVarArr4.length == 0 || q9cVar != q9cVarArr4[0]) {
                            this.f22558k.b();
                            z = true;
                        }
                    }
                } else {
                    q9cVar.l0(i8 < this.v);
                }
            } else {
                i3 = i6;
            }
            i4 = i8 + 1;
            k9lVarArr2 = k9lVarArr;
            q9cVarArr2 = q9cVarArr3;
            length = i7;
            bVarArr2 = bVarArr3;
        }
        System.arraycopy(k9lVarArr3, 0, k9lVarArr2, 0, length);
        q9c[] q9cVarArr5 = (q9c[]) wlq.A0(q9cVarArr2, i3);
        this.t = q9cVarArr5;
        this.w = this.l.a(q9cVarArr5);
        return j;
    }

    public final void q(long j, List<com.google.android.exoplayer2.source.hls.playlist.b.a> list, List<q9c> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (wlq.c(str, list.get(i2).d)) {
                        com.google.android.exoplayer2.source.hls.playlist.b.a aVar = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.f8158a);
                        arrayList2.add(aVar.f8159b);
                        z &= wlq.J(aVar.f8159b.i, 1) == 1;
                    }
                }
                q9c q9cVarW = w(1, (Uri[]) arrayList.toArray((Uri[]) wlq.k(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), map, j);
                list3.add(ahd.k(arrayList3));
                list2.add(q9cVarW);
                if (this.m && z) {
                    q9cVarW.c0(new TrackGroup[]{new TrackGroup((Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(j.a aVar, long j) {
        this.p = aVar;
        this.f22557b.g(this);
        v(j);
    }

    public final void s(com.google.android.exoplayer2.source.hls.playlist.b bVar, long j, List<q9c> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z;
        boolean z2;
        int size = bVar.e.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < bVar.e.size(); i3++) {
            Format format = bVar.e.get(i3).f8161b;
            if (format.f7818r > 0 || wlq.K(format.i, 2) != null) {
                iArr[i3] = 2;
                i++;
            } else if (wlq.K(format.i, 1) != null) {
                iArr[i3] = 1;
                i2++;
            } else {
                iArr[i3] = -1;
            }
        }
        if (i > 0) {
            size = i;
            z = true;
            z2 = false;
        } else if (i2 < size) {
            size -= i2;
            z = false;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        Uri[] uriArr = new Uri[size];
        Format[] formatArr = new Format[size];
        int[] iArr2 = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < bVar.e.size(); i5++) {
            if ((!z || iArr[i5] == 2) && (!z2 || iArr[i5] != 1)) {
                com.google.android.exoplayer2.source.hls.playlist.b.C0193b c0193b = bVar.e.get(i5);
                uriArr[i4] = c0193b.f8160a;
                formatArr[i4] = c0193b.f8161b;
                iArr2[i4] = i5;
                i4++;
            }
        }
        String str = formatArr[0].i;
        int iJ = wlq.J(str, 2);
        int iJ2 = wlq.J(str, 1);
        boolean z3 = iJ2 <= 1 && iJ <= 1 && iJ2 + iJ > 0;
        q9c q9cVarW = w(0, uriArr, formatArr, bVar.j, bVar.f8157k, map, j);
        list.add(q9cVarW);
        list2.add(iArr2);
        if (this.m && z3) {
            ArrayList arrayList = new ArrayList();
            if (iJ > 0) {
                Format[] formatArr2 = new Format[size];
                for (int i6 = 0; i6 < size; i6++) {
                    formatArr2[i6] = z(formatArr[i6]);
                }
                arrayList.add(new TrackGroup(formatArr2));
                if (iJ2 > 0 && (bVar.j != null || bVar.g.isEmpty())) {
                    arrayList.add(new TrackGroup(x(formatArr[0], bVar.j, false)));
                }
                List<Format> list3 = bVar.f8157k;
                if (list3 != null) {
                    for (int i7 = 0; i7 < list3.size(); i7++) {
                        arrayList.add(new TrackGroup(list3.get(i7)));
                    }
                }
            } else {
                Format[] formatArr3 = new Format[size];
                for (int i8 = 0; i8 < size; i8++) {
                    formatArr3[i8] = x(formatArr[i8], bVar.j, true);
                }
                arrayList.add(new TrackGroup(formatArr3));
            }
            TrackGroup trackGroup = new TrackGroup(new Format.b().S("ID3").e0("application/id3").E());
            arrayList.add(trackGroup);
            q9cVarW.c0((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() throws IOException {
        for (q9c q9cVar : this.s) {
            q9cVar.t();
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
        for (q9c q9cVar : this.t) {
            q9cVar.u(j, z);
        }
    }

    public final void v(long j) {
        com.google.android.exoplayer2.source.hls.playlist.b bVar = (com.google.android.exoplayer2.source.hls.playlist.b) rk1.e(this.f22557b.c());
        Map<String, DrmInitData> mapY = this.o ? y(bVar.m) : Collections.emptyMap();
        boolean z = !bVar.e.isEmpty();
        List<com.google.android.exoplayer2.source.hls.playlist.b.a> list = bVar.g;
        List<com.google.android.exoplayer2.source.hls.playlist.b.a> list2 = bVar.h;
        this.q = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            s(bVar, j, arrayList, arrayList2, mapY);
        }
        q(j, list, arrayList, arrayList2, mapY);
        this.v = arrayList.size();
        int i = 0;
        while (i < list2.size()) {
            com.google.android.exoplayer2.source.hls.playlist.b.a aVar = list2.get(i);
            int i2 = i;
            q9c q9cVarW = w(3, new Uri[]{aVar.f8158a}, new Format[]{aVar.f8159b}, null, Collections.emptyList(), mapY, j);
            arrayList2.add(new int[]{i2});
            arrayList.add(q9cVarW);
            q9cVarW.c0(new TrackGroup[]{new TrackGroup(aVar.f8159b)}, 0, new int[0]);
            i = i2 + 1;
        }
        this.s = (q9c[]) arrayList.toArray(new q9c[0]);
        this.u = (int[][]) arrayList2.toArray(new int[0][]);
        q9c[] q9cVarArr = this.s;
        this.q = q9cVarArr.length;
        q9cVarArr[0].l0(true);
        for (q9c q9cVar : this.s) {
            q9cVar.B();
        }
        this.t = this.s;
    }

    public final q9c w(int i, Uri[] uriArr, Format[] formatArr, Format format, List<Format> list, Map<String, DrmInitData> map, long j) {
        return new q9c(i, this, new d9c(this.f22556a, this.f22557b, uriArr, formatArr, this.c, this.d, this.f22558k, list), map, this.i, j, format, this.e, this.f, this.g, this.h, this.n);
    }
}
