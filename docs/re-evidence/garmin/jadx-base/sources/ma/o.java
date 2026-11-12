package ma;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.media3.common.e0;
import androidx.media3.common.w;
import androidx.media3.common.x;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import bb.g0;
import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import fa.z;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Loader.b<ua.b>, Loader.f, s, bb.p, androidx.media3.exoplayer.source.r.d {
    public static final Set<Integer> U0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final SparseIntArray A;
    public c B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int H0;
    public int I;
    public boolean I0;
    public boolean[] J0;
    public boolean[] K0;
    public long L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public androidx.media3.common.q P;
    public boolean P0;
    public boolean Q0;
    public long R0;
    public androidx.media3.common.l S0;
    public androidx.media3.common.q T;
    public j T0;
    public boolean X;
    public sa.r Y;
    public Set<e0> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f117561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f117562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xa.b f117563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.q f117564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.c f117565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.b.a f117566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f117567i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.k.a f117569k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int[] f117570k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f117571l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<j> f117573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<j> f117574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f117575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f117576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f117577r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList<m> f117578t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, androidx.media3.common.l> f117579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ua.b f117580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d[] f117581x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f117583z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Loader f117568j = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.b f117572m = new f.b();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f117582y = new int[0];

    public interface b extends s.a<o> {
    }

    public static class c implements l0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final androidx.media3.common.q f117584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final androidx.media3.common.q f117585h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mb.b f117586a = new mb.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l0 f117587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.q f117588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.media3.common.q f117589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f117590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f117591f;

        static {
            androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
            bVar.f8411m = x.n(MimeTypes.APPLICATION_ID3);
            f117584g = bVar.a();
            androidx.media3.common.q.b bVar2 = new androidx.media3.common.q.b();
            bVar2.f8411m = x.n(MimeTypes.APPLICATION_EMSG);
            f117585h = bVar2.a();
        }

        public c(l0 l0Var, int i14) {
            this.f117587b = l0Var;
            if (i14 == 1) {
                this.f117588c = f117584g;
            } else {
                if (i14 != 3) {
                    vb.h.s(am.j.h(i14, "Unknown metadataType: "));
                    throw null;
                }
                this.f117588c = f117585h;
            }
            this.f117590e = new byte[0];
            this.f117591f = 0;
        }

        @Override // bb.l0
        public final void a(fa.r rVar, int i14, int i15) {
            int i16 = this.f117591f + i14;
            byte[] bArr = this.f117590e;
            if (bArr.length < i16) {
                this.f117590e = Arrays.copyOf(bArr, (i16 / 2) + i16);
            }
            rVar.e(this.f117590e, this.f117591f, i14);
            this.f117591f += i14;
        }

        @Override // bb.l0
        public final void c(long j8, int i14, int i15, int i16, l0.a aVar) {
            this.f117589d.getClass();
            int i17 = this.f117591f - i16;
            fa.r rVar = new fa.r(Arrays.copyOfRange(this.f117590e, i17 - i15, i17));
            byte[] bArr = this.f117590e;
            System.arraycopy(bArr, i17, bArr, 0, i16);
            this.f117591f = i16;
            String str = this.f117589d.f8386n;
            androidx.media3.common.q qVar = this.f117588c;
            String str2 = qVar.f8386n;
            String str3 = qVar.f8386n;
            int i18 = z.f70071a;
            if (!Objects.equals(str, str2)) {
                if (!MimeTypes.APPLICATION_EMSG.equals(this.f117589d.f8386n)) {
                    fa.k.g("Ignoring sample for unsupported format: " + this.f117589d.f8386n);
                    return;
                }
                this.f117586a.getClass();
                mb.a aVarC = mb.b.c(rVar);
                androidx.media3.common.q wrappedMetadataFormat = aVarC.getWrappedMetadataFormat();
                if (wrappedMetadataFormat == null || !Objects.equals(str3, wrappedMetadataFormat.f8386n)) {
                    fa.k.g("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarC.getWrappedMetadataFormat());
                    return;
                }
                byte[] wrappedMetadataBytes = aVarC.getWrappedMetadataBytes();
                wrappedMetadataBytes.getClass();
                rVar = new fa.r(wrappedMetadataBytes);
            }
            int iA = rVar.a();
            this.f117587b.f(iA, rVar);
            this.f117587b.c(j8, i14, iA, 0, aVar);
        }

        @Override // bb.l0
        public final void d(androidx.media3.common.q qVar) {
            this.f117589d = qVar;
            this.f117587b.d(this.f117588c);
        }

        @Override // bb.l0
        public final int e(androidx.media3.common.j jVar, int i14, boolean z14) throws EOFException {
            int i15 = this.f117591f + i14;
            byte[] bArr = this.f117590e;
            if (bArr.length < i15) {
                this.f117590e = Arrays.copyOf(bArr, (i15 / 2) + i15);
            }
            int i16 = jVar.read(this.f117590e, this.f117591f, i14);
            if (i16 != -1) {
                this.f117591f += i16;
                return i16;
            }
            if (z14) {
                return -1;
            }
            vb.h.m();
            return 0;
        }
    }

    public static final class d extends androidx.media3.exoplayer.source.r {
        public final Map<String, androidx.media3.common.l> H;
        public androidx.media3.common.l I;

        private d(xa.b bVar, androidx.media3.exoplayer.drm.c cVar, androidx.media3.exoplayer.drm.b.a aVar, Map<String, androidx.media3.common.l> map) {
            super(bVar, cVar, aVar);
            this.H = map;
        }

        @Override // androidx.media3.exoplayer.source.r
        public final androidx.media3.common.q l(androidx.media3.common.q qVar) {
            androidx.media3.common.l lVar;
            androidx.media3.common.l lVar2 = this.I;
            if (lVar2 == null) {
                lVar2 = qVar.f8390r;
            }
            if (lVar2 != null && (lVar = this.H.get(lVar2.f8340c)) != null) {
                lVar2 = lVar;
            }
            w wVar = qVar.f8384l;
            w wVar2 = null;
            if (wVar == null) {
                wVar = wVar2;
            } else {
                w.b[] bVarArr = wVar.f8574a;
                int length = bVarArr.length;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        i15 = -1;
                        break;
                    }
                    w.b bVar = bVarArr[i15];
                    if ((bVar instanceof pb.l) && "com.apple.streaming.transportStreamTimestamp".equals(((pb.l) bVar).f136822b)) {
                        break;
                    }
                    i15++;
                }
                if (i15 != -1) {
                    if (length != 1) {
                        w.b[] bVarArr2 = new w.b[length - 1];
                        while (i14 < length) {
                            if (i14 != i15) {
                                bVarArr2[i14 < i15 ? i14 : i14 - 1] = bVarArr[i14];
                            }
                            i14++;
                        }
                        wVar2 = new w(bVarArr2);
                    }
                    wVar = wVar2;
                }
            }
            if (lVar2 != qVar.f8390r || wVar != qVar.f8384l) {
                androidx.media3.common.q.b bVarA = qVar.a();
                bVarA.f8415q = lVar2;
                bVarA.f8409k = wVar;
                qVar = bVarA.a();
            }
            return super.l(qVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [ma.n] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ma.n] */
    public o(String str, int i14, b bVar, f fVar, Map<String, androidx.media3.common.l> map, xa.b bVar2, long j8, androidx.media3.common.q qVar, androidx.media3.exoplayer.drm.c cVar, androidx.media3.exoplayer.drm.b.a aVar, androidx.media3.exoplayer.upstream.b bVar3, androidx.media3.exoplayer.source.k.a aVar2, int i15) {
        this.f117559a = str;
        this.f117560b = i14;
        this.f117561c = bVar;
        this.f117562d = fVar;
        this.f117579v = map;
        this.f117563e = bVar2;
        this.f117564f = qVar;
        this.f117565g = cVar;
        this.f117566h = aVar;
        this.f117567i = bVar3;
        this.f117569k = aVar2;
        this.f117571l = i15;
        Set<Integer> set = U0;
        this.f117583z = new HashSet(set.size());
        this.A = new SparseIntArray(set.size());
        this.f117581x = new d[0];
        this.K0 = new boolean[0];
        this.J0 = new boolean[0];
        ArrayList<j> arrayList = new ArrayList<>();
        this.f117573n = arrayList;
        this.f117574o = Collections.unmodifiableList(arrayList);
        this.f117578t = new ArrayList<>();
        final int i16 = 0;
        this.f117575p = new Runnable(this) { // from class: ma.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f117558b;

            {
                this.f117558b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i17 = i16;
                o oVar = this.f117558b;
                switch (i17) {
                    case 0:
                        Set<Integer> set2 = o.U0;
                        oVar.r();
                        break;
                    default:
                        oVar.E = true;
                        oVar.r();
                        break;
                }
            }
        };
        final int i17 = 1;
        this.f117576q = new Runnable(this) { // from class: ma.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f117558b;

            {
                this.f117558b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i18 = i17;
                o oVar = this.f117558b;
                switch (i18) {
                    case 0:
                        Set<Integer> set2 = o.U0;
                        oVar.r();
                        break;
                    default:
                        oVar.E = true;
                        oVar.r();
                        break;
                }
            }
        };
        this.f117577r = z.m(null);
        this.L0 = j8;
        this.M0 = j8;
    }

    public static bb.k j(int i14, int i15) {
        fa.k.g("Unmapped track with id " + i14 + " of type " + i15);
        return new bb.k();
    }

    public static androidx.media3.common.q m(androidx.media3.common.q qVar, androidx.media3.common.q qVar2, boolean z14) {
        String strB;
        if (qVar == null) {
            return qVar2;
        }
        String str = qVar.f8383k;
        String strD = qVar2.f8386n;
        int iH = x.h(strD);
        if (z.r(str, iH) == 1) {
            strB = z.s(str, iH);
            strD = x.d(strB);
        } else {
            strB = x.b(str, strD);
        }
        androidx.media3.common.q.b bVarA = qVar2.a();
        bVarA.f8399a = qVar.f8373a;
        bVarA.f8400b = qVar.f8374b;
        bVarA.f8401c = ImmutableList.copyOf((Collection) qVar.f8375c);
        bVarA.f8402d = qVar.f8376d;
        bVarA.f8403e = qVar.f8377e;
        bVarA.f8404f = qVar.f8378f;
        bVarA.f8406h = z14 ? qVar.f8380h : -1;
        bVarA.f8407i = z14 ? qVar.f8381i : -1;
        bVarA.f8408j = strB;
        if (iH == 2) {
            bVarA.f8418t = qVar.f8393u;
            bVarA.f8419u = qVar.f8394v;
            bVarA.f8420v = qVar.f8395w;
        }
        if (strD != null) {
            bVarA.f8411m = x.n(strD);
        }
        int i14 = qVar.C;
        if (i14 != -1 && iH == 1) {
            bVarA.B = i14;
        }
        w wVarD = qVar.f8384l;
        if (wVarD != null) {
            w wVar = qVar2.f8384l;
            if (wVar != null) {
                wVarD = wVar.d(wVarD);
            }
            bVarA.f8409k = wVarD;
        }
        return bVarA.a();
    }

    public static int p(int i14) {
        if (i14 == 1) {
            return 2;
        }
        if (i14 != 2) {
            return i14 != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // bb.p
    public final void a(g0 g0Var) {
    }

    @Override // androidx.media3.exoplayer.source.r.d
    public final void b() {
        this.f117577r.post(this.f117575p);
    }

    @Override // bb.p
    public final void endTracks() {
        this.Q0 = true;
        this.f117577r.post(this.f117576q);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0277  */
    /* JADX WARN: Code duplicated, block: B:101:0x0279  */
    /* JADX WARN: Code duplicated, block: B:104:0x028a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0297  */
    /* JADX WARN: Code duplicated, block: B:110:0x029c  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:146:0x035d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0362  */
    /* JADX WARN: Code duplicated, block: B:156:0x037a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0386  */
    /* JADX WARN: Code duplicated, block: B:162:0x038a  */
    /* JADX WARN: Code duplicated, block: B:164:0x038d  */
    /* JADX WARN: Code duplicated, block: B:168:0x039c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x039e  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:180:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:193:0x03da  */
    /* JADX WARN: Code duplicated, block: B:195:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:196:0x0406  */
    /* JADX WARN: Code duplicated, block: B:198:0x0416  */
    /* JADX WARN: Code duplicated, block: B:199:0x0419  */
    /* JADX WARN: Code duplicated, block: B:86:0x021b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0248  */
    /* JADX WARN: Code duplicated, block: B:98:0x0273  */
    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        long jMax;
        List<j> list;
        long jMax2;
        long j8;
        long j14;
        f.b bVar;
        f fVar;
        j jVar;
        Uri uri;
        int iIntValue;
        androidx.media3.exoplayer.hls.playlist.b bVar2;
        int i14;
        long j15;
        int i15;
        androidx.media3.exoplayer.hls.playlist.b.e eVar;
        int i16;
        xa.e eVar2;
        androidx.media3.exoplayer.hls.playlist.b.d dVar;
        Uri uriD;
        f.a aVarE;
        String str;
        Uri uriD2;
        f.a aVarE2;
        boolean z14;
        e eVar3;
        byte[] bArr;
        byte[] bArr2;
        String str2;
        long j16;
        boolean z15;
        String strA;
        wa.g gVar;
        boolean z16;
        int i17;
        long j17;
        f.e eVarD;
        Uri uriD3;
        Uri uriD4;
        List<String> list2;
        if (!this.P0) {
            Loader loader = this.f117568j;
            if (!loader.c()) {
                if (loader.f9702c != null) {
                    return false;
                }
                if (q()) {
                    list = Collections.EMPTY_LIST;
                    jMax = this.M0;
                    for (d dVar2 : this.f117581x) {
                        dVar2.f9638t = this.M0;
                    }
                } else {
                    j jVarO = o();
                    jMax = jVarO.I ? jVarO.f169590h : Math.max(this.L0, jVarO.f169589g);
                    list = this.f117574o;
                }
                List<j> list3 = list;
                f.b bVar3 = this.f117572m;
                bVar3.f117503a = null;
                bVar3.f117504b = false;
                bVar3.f117505c = null;
                boolean z17 = this.F || !list3.isEmpty();
                f fVar2 = this.f117562d;
                e eVar4 = fVar2.f117489j;
                e0 e0Var = fVar2.f117487h;
                Uri[] uriArr = fVar2.f117484e;
                HlsPlaylistTracker hlsPlaylistTracker = fVar2.f117486g;
                j jVar2 = list3.isEmpty() ? null : (j) Iterables.getLast(list3);
                int iB = jVar2 == null ? -1 : e0Var.b(jVar2.f169586d);
                long j18 = d0Var.f8812a;
                long jMax3 = jMax - j18;
                long j19 = fVar2.f117499t;
                if (j19 != C.TIME_UNSET) {
                    jMax2 = j19 - j18;
                    j8 = -9223372036854775807L;
                } else {
                    jMax2 = -9223372036854775807L;
                    j8 = -9223372036854775807L;
                }
                if (jVar2 == null || fVar2.f117497r) {
                    j14 = j18;
                } else {
                    long j24 = jVar2.f169590h - jVar2.f169589g;
                    j14 = j18;
                    jMax3 = Math.max(0L, jMax3 - j24);
                    if (jMax2 != j8) {
                        jMax2 = Math.max(0L, jMax2 - j24);
                    }
                }
                j jVar3 = jVar2;
                int i18 = iB;
                long j25 = jMax3;
                fVar2.f117498s.b(j14, j25, jMax2, list3, fVar2.a(jVar3, jMax));
                int selectedIndexInTrackGroup = fVar2.f117498s.getSelectedIndexInTrackGroup();
                boolean z18 = i18 != selectedIndexInTrackGroup;
                Uri uri2 = uriArr[selectedIndexInTrackGroup];
                if (hlsPlaylistTracker.o(uri2)) {
                    androidx.media3.exoplayer.hls.playlist.b bVarH = hlsPlaylistTracker.h(uri2, true);
                    bVarH.getClass();
                    long j26 = bVarH.f9090h;
                    long j27 = jMax;
                    fVar2.f117497r = bVarH.f125104c;
                    fVar2.f117499t = bVarH.f9097o ? j8 : (bVarH.f9103u + j26) - hlsPlaylistTracker.j();
                    long j28 = j26 - hlsPlaylistTracker.j();
                    boolean z19 = z18;
                    bVar = bVar3;
                    Pair<Long, Integer> pairC = fVar2.c(jVar3, z19, bVarH, j28, j27);
                    long jLongValue = ((Long) pairC.first).longValue();
                    int iIntValue2 = ((Integer) pairC.second).intValue();
                    if (jLongValue >= bVarH.f9093k || jVar3 == null || !z19) {
                        fVar = fVar2;
                        jVar = jVar3;
                        uri = uri2;
                        iIntValue = iIntValue2;
                        bVar2 = bVarH;
                        i14 = selectedIndexInTrackGroup;
                        j15 = j28;
                    } else {
                        Uri uri3 = uriArr[i18];
                        androidx.media3.exoplayer.hls.playlist.b bVarH2 = hlsPlaylistTracker.h(uri3, true);
                        bVarH2.getClass();
                        long j29 = bVarH2.f9090h - hlsPlaylistTracker.j();
                        uri = uri3;
                        fVar = fVar2;
                        jVar = jVar3;
                        Pair<Long, Integer> pairC2 = fVar.c(jVar, false, bVarH2, j29, j27);
                        jLongValue = ((Long) pairC2.first).longValue();
                        iIntValue = ((Integer) pairC2.second).intValue();
                        j15 = j29;
                        bVar2 = bVarH2;
                        i14 = i18;
                    }
                    long j34 = jLongValue;
                    String str3 = bVar2.f125102a;
                    boolean z24 = bVar2.f125104c;
                    boolean z25 = bVar2.f9097o;
                    long j35 = bVar2.f9093k;
                    ImmutableList immutableList = bVar2.f9100r;
                    if (i14 != i18 && i18 != -1) {
                        hlsPlaylistTracker.c(uriArr[i18]);
                    }
                    if (j34 < j35) {
                        fVar.f117495p = new BehindLiveWindowException();
                    } else {
                        f.e eVarD2 = f.d(bVar2, j34, iIntValue);
                        if (eVarD2 != null) {
                            i15 = eVarD2.f117511c;
                            eVar = eVarD2.f117509a;
                            fVar.f117500u = false;
                            fVar.f117496q = null;
                            if (fVar.f117491l != null) {
                                xa.d dVar3 = fVar.f117491l;
                                wa.g gVar2 = fVar.f117498s;
                                long jMax4 = Math.max(0L, j25);
                                float f14 = d0Var.f8813b;
                                boolean z26 = !z25;
                                long j36 = fVar.f117501v;
                                j16 = d0Var.f8814c;
                                if (j16 != j8 || j36 == j8 || j16 < j36) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                xa.e eVar5 = new xa.e(dVar3, gVar2, jMax4, f14, "h", z26, z15, list3.isEmpty());
                                androidx.media3.common.q qVar = e0Var.f8217d[fVar.f117498s.getSelectedIndex()];
                                strA = x.a(qVar.f8383k);
                                String strI = x.i(qVar.f8383k);
                                if (strA != null || strI == null) {
                                    gVar = fVar.f117498s;
                                    if (gVar != null) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    fa.a.a(z16);
                                    i17 = -1;
                                    if (x.h(gVar.getSelectedFormat().f8386n) == -1) {
                                        x.h(gVar.getSelectedFormat().f8385m);
                                    }
                                } else {
                                    i17 = -1;
                                }
                                j17 = eVarD2.f117510b;
                                if (i15 == i17) {
                                    j17++;
                                }
                                if (i15 != i17) {
                                    i17 = i15 + 1;
                                }
                                eVarD = f.d(bVar2, j17, i17);
                                if (eVarD != null) {
                                    androidx.media3.exoplayer.hls.playlist.b.e eVar6 = eVarD.f117509a;
                                    uriD3 = fa.x.d(str3, eVar.f9112a);
                                    String str4 = eVar6.f9112a;
                                    long j37 = eVar6.f9120i;
                                    uriD4 = fa.x.d(str3, str4);
                                    if (!uriD3.isOpaque() || uriD4.isOpaque()) {
                                        i16 = i15;
                                        uriD4.toString();
                                    } else {
                                        String scheme = uriD3.getScheme();
                                        String scheme2 = uriD4.getScheme();
                                        if (scheme != null ? scheme2 == null || !Ascii.equalsIgnoreCase(scheme, scheme2) : scheme2 != null) {
                                            i16 = i15;
                                            uriD4.toString();
                                        } else {
                                            String authority = uriD3.getAuthority();
                                            String authority2 = uriD4.getAuthority();
                                            int i19 = z.f70071a;
                                            if (Objects.equals(authority, authority2)) {
                                                List<String> pathSegments = uriD3.getPathSegments();
                                                List<String> pathSegments2 = uriD4.getPathSegments();
                                                int iMin = Math.min(pathSegments.size(), pathSegments2.size());
                                                int i24 = 0;
                                                int i25 = 0;
                                                while (true) {
                                                    if (i24 >= iMin) {
                                                        i16 = i15;
                                                        list2 = pathSegments;
                                                        break;
                                                    }
                                                    i16 = i15;
                                                    list2 = pathSegments;
                                                    if (!pathSegments.get(i24).equals(pathSegments2.get(i24))) {
                                                        break;
                                                    }
                                                    i25++;
                                                    i24++;
                                                    pathSegments = list2;
                                                    i15 = i16;
                                                }
                                                for (int i26 = i25; i26 < list2.size(); i26++) {
                                                }
                                                for (int i27 = i25; i27 < pathSegments2.size(); i27++) {
                                                    pathSegments2.get(i27);
                                                    pathSegments2.size();
                                                }
                                            } else {
                                                i16 = i15;
                                                uriD4.toString();
                                            }
                                        }
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(j37);
                                    sb3.append("-");
                                } else {
                                    i16 = i15;
                                }
                                eVar2 = eVar5;
                            } else {
                                i16 = i15;
                                eVar2 = null;
                            }
                            fVar.f117501v = SystemClock.elapsedRealtime();
                            dVar = eVar.f9113b;
                            if (dVar != null || (str2 = dVar.f9118g) == null) {
                                uriD = null;
                            } else {
                                uriD = fa.x.d(str3, str2);
                            }
                            aVarE = fVar.e(uriD, i14, true, eVar2);
                            bVar.f117503a = aVarE;
                            if (aVarE == null) {
                                str = eVar.f9118g;
                                if (str == null) {
                                    uriD2 = null;
                                } else {
                                    uriD2 = fa.x.d(str3, str);
                                }
                                aVarE2 = fVar.e(uriD2, i14, false, eVar2);
                                bVar.f117503a = aVarE2;
                                if (aVarE2 == null) {
                                    if (jVar == null) {
                                        AtomicInteger atomicInteger = j.M;
                                    } else {
                                        if (uri.equals(jVar.f117515m) || !jVar.I) {
                                            long j38 = j15 + eVar.f9116e;
                                            if (eVar instanceof androidx.media3.exoplayer.hls.playlist.b.C0125b) {
                                                if (!((androidx.media3.exoplayer.hls.playlist.b.C0125b) eVar).f9105l || (i16 == 0 && z24)) {
                                                    z24 = true;
                                                } else {
                                                    z24 = false;
                                                }
                                            }
                                            z14 = z24 || j38 < jVar.f169590h;
                                        }
                                        if (z14 || !eVarD2.f117512d) {
                                            h hVar = fVar.f117480a;
                                            ha.d dVar4 = fVar.f117481b;
                                            androidx.media3.common.q qVar2 = fVar.f117485f[i14];
                                            List<androidx.media3.common.q> list4 = fVar.f117488i;
                                            int selectionReason = fVar.f117498s.getSelectionReason();
                                            Object selectionData = fVar.f117498s.getSelectionData();
                                            boolean z27 = fVar.f117493n;
                                            q qVar3 = fVar.f117483d;
                                            xa.e eVar7 = eVar2;
                                            f.e eVar8 = eVarD2;
                                            long j39 = fVar.f117492m;
                                            if (uriD2 == null) {
                                                eVar4.getClass();
                                                eVar3 = eVar4;
                                                bArr = null;
                                            } else {
                                                eVar3 = eVar4;
                                                bArr = eVar3.f117478a.get(uriD2);
                                            }
                                            if (uriD == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = eVar3.f117478a.get(uriD);
                                            }
                                            bVar.f117503a = j.a(hVar, dVar4, qVar2, j15, bVar2, eVar8, uri, list4, selectionReason, selectionData, z27, qVar3, j39, jVar, bArr, bArr2, z14, fVar.f117490k, eVar7);
                                        }
                                    }
                                    if (z14) {
                                        h hVar2 = fVar.f117480a;
                                        ha.d dVar5 = fVar.f117481b;
                                        androidx.media3.common.q qVar4 = fVar.f117485f[i14];
                                        List<androidx.media3.common.q> list5 = fVar.f117488i;
                                        int selectionReason2 = fVar.f117498s.getSelectionReason();
                                        Object selectionData2 = fVar.f117498s.getSelectionData();
                                        boolean z28 = fVar.f117493n;
                                        q qVar5 = fVar.f117483d;
                                        xa.e eVar9 = eVar2;
                                        f.e eVar10 = eVarD2;
                                        long j310 = fVar.f117492m;
                                        if (uriD2 == null) {
                                            eVar4.getClass();
                                            eVar3 = eVar4;
                                            bArr = null;
                                        } else {
                                            eVar3 = eVar4;
                                            bArr = eVar3.f117478a.get(uriD2);
                                        }
                                        if (uriD == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = eVar3.f117478a.get(uriD);
                                        }
                                        bVar.f117503a = j.a(hVar2, dVar5, qVar4, j15, bVar2, eVar10, uri, list5, selectionReason2, selectionData2, z28, qVar5, j310, jVar, bArr, bArr2, z14, fVar.f117490k, eVar9);
                                    } else {
                                        h hVar3 = fVar.f117480a;
                                        ha.d dVar6 = fVar.f117481b;
                                        androidx.media3.common.q qVar6 = fVar.f117485f[i14];
                                        List<androidx.media3.common.q> list6 = fVar.f117488i;
                                        int selectionReason3 = fVar.f117498s.getSelectionReason();
                                        Object selectionData3 = fVar.f117498s.getSelectionData();
                                        boolean z29 = fVar.f117493n;
                                        q qVar7 = fVar.f117483d;
                                        xa.e eVar11 = eVar2;
                                        f.e eVar12 = eVarD2;
                                        long j311 = fVar.f117492m;
                                        if (uriD2 == null) {
                                            eVar4.getClass();
                                            eVar3 = eVar4;
                                            bArr = null;
                                        } else {
                                            eVar3 = eVar4;
                                            bArr = eVar3.f117478a.get(uriD2);
                                        }
                                        if (uriD == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = eVar3.f117478a.get(uriD);
                                        }
                                        bVar.f117503a = j.a(hVar3, dVar6, qVar6, j15, bVar2, eVar12, uri, list6, selectionReason3, selectionData3, z29, qVar7, j311, jVar, bArr, bArr2, z14, fVar.f117490k, eVar11);
                                    }
                                }
                            }
                        } else if (!z25) {
                            bVar.f117505c = uri;
                            fVar.f117500u &= uri.equals(fVar.f117496q);
                            fVar.f117496q = uri;
                        } else if (z17 || immutableList.isEmpty()) {
                            bVar.f117504b = true;
                        } else {
                            eVarD2 = new f.e((androidx.media3.exoplayer.hls.playlist.b.e) Iterables.getLast(immutableList), (j35 + ((long) immutableList.size())) - 1, -1);
                            i15 = eVarD2.f117511c;
                            eVar = eVarD2.f117509a;
                            fVar.f117500u = false;
                            fVar.f117496q = null;
                            if (fVar.f117491l != null) {
                                xa.d dVar7 = fVar.f117491l;
                                wa.g gVar3 = fVar.f117498s;
                                long jMax5 = Math.max(0L, j25);
                                float f15 = d0Var.f8813b;
                                boolean z210 = !z25;
                                long j312 = fVar.f117501v;
                                j16 = d0Var.f8814c;
                                if (j16 != j8) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                xa.e eVar13 = new xa.e(dVar7, gVar3, jMax5, f15, "h", z210, z15, list3.isEmpty());
                                androidx.media3.common.q qVar8 = e0Var.f8217d[fVar.f117498s.getSelectedIndex()];
                                strA = x.a(qVar8.f8383k);
                                String strI2 = x.i(qVar8.f8383k);
                                if (strA != null) {
                                    gVar = fVar.f117498s;
                                    if (gVar != null) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    fa.a.a(z16);
                                    i17 = -1;
                                    if (x.h(gVar.getSelectedFormat().f8386n) == -1) {
                                        x.h(gVar.getSelectedFormat().f8385m);
                                    }
                                } else {
                                    gVar = fVar.f117498s;
                                    if (gVar != null) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    fa.a.a(z16);
                                    i17 = -1;
                                    if (x.h(gVar.getSelectedFormat().f8386n) == -1) {
                                        x.h(gVar.getSelectedFormat().f8385m);
                                    }
                                }
                                j17 = eVarD2.f117510b;
                                if (i15 == i17) {
                                    j17++;
                                }
                                if (i15 != i17) {
                                    i17 = i15 + 1;
                                }
                                eVarD = f.d(bVar2, j17, i17);
                                if (eVarD != null) {
                                    androidx.media3.exoplayer.hls.playlist.b.e eVar14 = eVarD.f117509a;
                                    uriD3 = fa.x.d(str3, eVar.f9112a);
                                    String str5 = eVar14.f9112a;
                                    long j313 = eVar14.f9120i;
                                    uriD4 = fa.x.d(str3, str5);
                                    if (uriD3.isOpaque()) {
                                        i16 = i15;
                                        uriD4.toString();
                                    } else {
                                        i16 = i15;
                                        uriD4.toString();
                                    }
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(j313);
                                    sb4.append("-");
                                } else {
                                    i16 = i15;
                                }
                                eVar2 = eVar13;
                            } else {
                                i16 = i15;
                                eVar2 = null;
                            }
                            fVar.f117501v = SystemClock.elapsedRealtime();
                            dVar = eVar.f9113b;
                            if (dVar != null) {
                                uriD = null;
                            } else {
                                uriD = null;
                            }
                            aVarE = fVar.e(uriD, i14, true, eVar2);
                            bVar.f117503a = aVarE;
                            if (aVarE == null) {
                                str = eVar.f9118g;
                                if (str == null) {
                                    uriD2 = null;
                                } else {
                                    uriD2 = fa.x.d(str3, str);
                                }
                                aVarE2 = fVar.e(uriD2, i14, false, eVar2);
                                bVar.f117503a = aVarE2;
                                if (aVarE2 == null) {
                                    if (jVar == null) {
                                        AtomicInteger atomicInteger2 = j.M;
                                    } else {
                                        if (uri.equals(jVar.f117515m)) {
                                            long j314 = j15 + eVar.f9116e;
                                            if (eVar instanceof androidx.media3.exoplayer.hls.playlist.b.C0125b) {
                                                if (((androidx.media3.exoplayer.hls.playlist.b.C0125b) eVar).f9105l) {
                                                    z24 = true;
                                                } else {
                                                    z24 = true;
                                                }
                                            }
                                            if (z24) {
                                            }
                                        } else {
                                            long j315 = j15 + eVar.f9116e;
                                            if (eVar instanceof androidx.media3.exoplayer.hls.playlist.b.C0125b) {
                                                if (((androidx.media3.exoplayer.hls.playlist.b.C0125b) eVar).f9105l) {
                                                    z24 = true;
                                                } else {
                                                    z24 = true;
                                                }
                                            }
                                            if (z24) {
                                            }
                                        }
                                        if (z14) {
                                            h hVar4 = fVar.f117480a;
                                            ha.d dVar8 = fVar.f117481b;
                                            androidx.media3.common.q qVar9 = fVar.f117485f[i14];
                                            List<androidx.media3.common.q> list7 = fVar.f117488i;
                                            int selectionReason4 = fVar.f117498s.getSelectionReason();
                                            Object selectionData4 = fVar.f117498s.getSelectionData();
                                            boolean z211 = fVar.f117493n;
                                            q qVar10 = fVar.f117483d;
                                            xa.e eVar15 = eVar2;
                                            f.e eVar16 = eVarD2;
                                            long j316 = fVar.f117492m;
                                            if (uriD2 == null) {
                                                eVar4.getClass();
                                                eVar3 = eVar4;
                                                bArr = null;
                                            } else {
                                                eVar3 = eVar4;
                                                bArr = eVar3.f117478a.get(uriD2);
                                            }
                                            if (uriD == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = eVar3.f117478a.get(uriD);
                                            }
                                            bVar.f117503a = j.a(hVar4, dVar8, qVar9, j15, bVar2, eVar16, uri, list7, selectionReason4, selectionData4, z211, qVar10, j316, jVar, bArr, bArr2, z14, fVar.f117490k, eVar15);
                                        } else {
                                            h hVar5 = fVar.f117480a;
                                            ha.d dVar9 = fVar.f117481b;
                                            androidx.media3.common.q qVar11 = fVar.f117485f[i14];
                                            List<androidx.media3.common.q> list8 = fVar.f117488i;
                                            int selectionReason5 = fVar.f117498s.getSelectionReason();
                                            Object selectionData5 = fVar.f117498s.getSelectionData();
                                            boolean z212 = fVar.f117493n;
                                            q qVar12 = fVar.f117483d;
                                            xa.e eVar17 = eVar2;
                                            f.e eVar18 = eVarD2;
                                            long j317 = fVar.f117492m;
                                            if (uriD2 == null) {
                                                eVar4.getClass();
                                                eVar3 = eVar4;
                                                bArr = null;
                                            } else {
                                                eVar3 = eVar4;
                                                bArr = eVar3.f117478a.get(uriD2);
                                            }
                                            if (uriD == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = eVar3.f117478a.get(uriD);
                                            }
                                            bVar.f117503a = j.a(hVar5, dVar9, qVar11, j15, bVar2, eVar18, uri, list8, selectionReason5, selectionData5, z212, qVar12, j317, jVar, bArr, bArr2, z14, fVar.f117490k, eVar17);
                                        }
                                    }
                                    if (z14) {
                                        h hVar6 = fVar.f117480a;
                                        ha.d dVar10 = fVar.f117481b;
                                        androidx.media3.common.q qVar13 = fVar.f117485f[i14];
                                        List<androidx.media3.common.q> list9 = fVar.f117488i;
                                        int selectionReason6 = fVar.f117498s.getSelectionReason();
                                        Object selectionData6 = fVar.f117498s.getSelectionData();
                                        boolean z213 = fVar.f117493n;
                                        q qVar14 = fVar.f117483d;
                                        xa.e eVar19 = eVar2;
                                        f.e eVar110 = eVarD2;
                                        long j318 = fVar.f117492m;
                                        if (uriD2 == null) {
                                            eVar4.getClass();
                                            eVar3 = eVar4;
                                            bArr = null;
                                        } else {
                                            eVar3 = eVar4;
                                            bArr = eVar3.f117478a.get(uriD2);
                                        }
                                        if (uriD == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = eVar3.f117478a.get(uriD);
                                        }
                                        bVar.f117503a = j.a(hVar6, dVar10, qVar13, j15, bVar2, eVar110, uri, list9, selectionReason6, selectionData6, z213, qVar14, j318, jVar, bArr, bArr2, z14, fVar.f117490k, eVar19);
                                    } else {
                                        h hVar7 = fVar.f117480a;
                                        ha.d dVar11 = fVar.f117481b;
                                        androidx.media3.common.q qVar15 = fVar.f117485f[i14];
                                        List<androidx.media3.common.q> list10 = fVar.f117488i;
                                        int selectionReason7 = fVar.f117498s.getSelectionReason();
                                        Object selectionData7 = fVar.f117498s.getSelectionData();
                                        boolean z214 = fVar.f117493n;
                                        q qVar16 = fVar.f117483d;
                                        xa.e eVar111 = eVar2;
                                        f.e eVar112 = eVarD2;
                                        long j319 = fVar.f117492m;
                                        if (uriD2 == null) {
                                            eVar4.getClass();
                                            eVar3 = eVar4;
                                            bArr = null;
                                        } else {
                                            eVar3 = eVar4;
                                            bArr = eVar3.f117478a.get(uriD2);
                                        }
                                        if (uriD == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = eVar3.f117478a.get(uriD);
                                        }
                                        bVar.f117503a = j.a(hVar7, dVar11, qVar15, j15, bVar2, eVar112, uri, list10, selectionReason7, selectionData7, z214, qVar16, j319, jVar, bArr, bArr2, z14, fVar.f117490k, eVar111);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    bVar3.f117505c = uri2;
                    fVar2.f117500u &= uri2.equals(fVar2.f117496q);
                    fVar2.f117496q = uri2;
                    bVar = bVar3;
                }
                boolean z34 = bVar.f117504b;
                ua.b bVar4 = bVar.f117503a;
                Uri uri4 = bVar.f117505c;
                if (z34) {
                    this.M0 = j8;
                    this.P0 = true;
                    return true;
                }
                if (bVar4 == null) {
                    if (uri4 == null) {
                        return false;
                    }
                    l.this.f117530b.n(uri4);
                    return false;
                }
                if (bVar4 instanceof j) {
                    j jVar4 = (j) bVar4;
                    this.T0 = jVar4;
                    this.P = jVar4.f169586d;
                    this.M0 = C.TIME_UNSET;
                    this.f117573n.add(jVar4);
                    ImmutableList.Builder builder = ImmutableList.builder();
                    for (d dVar12 : this.f117581x) {
                        builder.add(Integer.valueOf(dVar12.f9635q + dVar12.f9634p));
                    }
                    ImmutableList<Integer> immutableListBuild = builder.build();
                    jVar4.E = this;
                    jVar4.J = immutableListBuild;
                    for (d dVar13 : this.f117581x) {
                        dVar13.getClass();
                        dVar13.C = jVar4.f117513k;
                        if (jVar4.f117516n) {
                            dVar13.G = true;
                        }
                    }
                }
                this.f117580w = bVar4;
                this.f117569k.f(new sa.i(bVar4.f169583a, bVar4.f169584b, loader.e(bVar4, this, this.f117567i.getMinimumLoadableRetryCount(bVar4.f169585c))), bVar4.f169585c, this.f117560b, bVar4.f169586d, bVar4.f169587e, bVar4.f169588f, bVar4.f169589g, bVar4.f169590h);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void g(Loader.e eVar, long j8, long j14) {
        ua.b bVar = (ua.b) eVar;
        this.f117580w = null;
        f fVar = this.f117562d;
        fVar.getClass();
        if (bVar instanceof f.a) {
            f.a aVar = (f.a) bVar;
            fVar.f117494o = aVar.f169592j;
            e eVar2 = fVar.f117489j;
            Uri uri = aVar.f169584b.f82555a;
            byte[] bArr = aVar.f117502l;
            bArr.getClass();
            e.a aVar2 = eVar2.f117478a;
            uri.getClass();
            aVar2.put(uri, bArr);
        }
        long j15 = bVar.f169583a;
        ha.g gVar = bVar.f169584b;
        ha.m mVar = bVar.f169591i;
        sa.i iVar = new sa.i(j15, gVar, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        this.f117567i.getClass();
        this.f117569k.c(iVar, bVar.f169585c, this.f117560b, bVar.f169586d, bVar.f169587e, bVar.f169588f, bVar.f169589g, bVar.f169590h);
        if (this.F) {
            ((l.b) this.f117561c).b(this);
            return;
        }
        d0.b bVar2 = new d0.b();
        bVar2.f8815a = this.L0;
        f(bVar2.a());
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        long j8;
        ArrayList<j> arrayList = this.f117573n;
        if (this.P0) {
            return Long.MIN_VALUE;
        }
        if (q()) {
            return this.M0;
        }
        long jMax = this.L0;
        j jVarO = o();
        if (!jVarO.I) {
            jVarO = arrayList.size() > 1 ? (j) am.j.f(2, arrayList) : null;
        }
        if (jVarO != null) {
            jMax = Math.max(jMax, jVarO.f169590h);
        }
        if (this.E) {
            for (d dVar : this.f117581x) {
                synchronized (dVar) {
                    j8 = dVar.f9640v;
                }
                jMax = Math.max(jMax, j8);
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        if (q()) {
            return this.M0;
        }
        if (this.P0) {
            return Long.MIN_VALUE;
        }
        return o().f169590h;
    }

    public final void h() {
        fa.a.d(this.F);
        this.Y.getClass();
        this.Z.getClass();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final Loader.c i(Loader.e eVar, long j8, long j14, IOException iOException, int i14) {
        boolean zD;
        Loader.c cVarB;
        int i15;
        ua.b bVar = (ua.b) eVar;
        boolean z14 = bVar instanceof j;
        if (z14 && !((j) bVar).L && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i15 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) == 410 || i15 == 404)) {
            return Loader.f9697d;
        }
        long j15 = bVar.f169591i.f82617b;
        long j16 = bVar.f169583a;
        ha.g gVar = bVar.f169584b;
        ha.m mVar = bVar.f169591i;
        sa.i iVar = new sa.i(j16, gVar, mVar.f82618c, mVar.f82619d, j8, j14, j15);
        androidx.media3.exoplayer.upstream.b.c cVar = new androidx.media3.exoplayer.upstream.b.c(iVar, new sa.j(bVar.f169585c, this.f117560b, bVar.f169586d, bVar.f169587e, bVar.f169588f, z.Y(bVar.f169589g), z.Y(bVar.f169590h)), iOException, i14);
        f fVar = this.f117562d;
        androidx.media3.exoplayer.upstream.b.a aVarA = wa.k.a(fVar.f117498s);
        androidx.media3.exoplayer.upstream.b bVar2 = this.f117567i;
        androidx.media3.exoplayer.upstream.b.C0129b c0129bA = bVar2.a(aVarA, cVar);
        if (c0129bA == null || c0129bA.f9721a != 2) {
            zD = false;
        } else {
            long j17 = c0129bA.f9722b;
            wa.g gVar2 = fVar.f117498s;
            zD = gVar2.d(gVar2.indexOf(fVar.f117487h.b(bVar.f169586d)), j17);
        }
        if (zD) {
            if (z14 && j15 == 0) {
                ArrayList<j> arrayList = this.f117573n;
                fa.a.d(arrayList.remove(arrayList.size() - 1) == bVar);
                if (arrayList.isEmpty()) {
                    this.M0 = this.L0;
                } else {
                    ((j) Iterables.getLast(arrayList)).K = true;
                }
            }
            cVarB = Loader.f9698e;
        } else {
            long jB = bVar2.b(cVar);
            cVarB = jB != C.TIME_UNSET ? Loader.b(jB, false) : Loader.f9699f;
        }
        Loader.c cVar2 = cVarB;
        int i16 = cVar2.f9703a;
        boolean z15 = i16 == 0 || i16 == 1;
        this.f117569k.d(iVar, bVar.f169585c, this.f117560b, bVar.f169586d, bVar.f169587e, bVar.f169588f, bVar.f169589g, bVar.f169590h, iOException, !z15);
        if (!z15) {
            this.f117580w = null;
        }
        if (zD) {
            if (!this.F) {
                d0.b bVar3 = new d0.b();
                bVar3.f8815a = this.L0;
                f(bVar3.a());
                return cVar2;
            }
            ((l.b) this.f117561c).b(this);
        }
        return cVar2;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        return this.f117568j.c();
    }

    public final sa.r k(e0[] e0VarArr) {
        for (int i14 = 0; i14 < e0VarArr.length; i14++) {
            e0 e0Var = e0VarArr[i14];
            androidx.media3.common.q[] qVarArr = new androidx.media3.common.q[e0Var.f8214a];
            for (int i15 = 0; i15 < e0Var.f8214a; i15++) {
                androidx.media3.common.q qVar = e0Var.f8217d[i15];
                int iA = this.f117565g.a(qVar);
                androidx.media3.common.q.b bVarA = qVar.a();
                bVarA.K = iA;
                qVarArr[i15] = bVarA.a();
            }
            e0VarArr[i14] = new e0(e0Var.f8215b, qVarArr);
        }
        return new sa.r(e0VarArr);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void l(Loader.e eVar, long j8, long j14, boolean z14) {
        ua.b bVar = (ua.b) eVar;
        this.f117580w = null;
        long j15 = bVar.f169583a;
        ha.g gVar = bVar.f169584b;
        ha.m mVar = bVar.f169591i;
        sa.i iVar = new sa.i(j15, gVar, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        this.f117567i.getClass();
        this.f117569k.b(iVar, bVar.f169585c, this.f117560b, bVar.f169586d, bVar.f169587e, bVar.f169588f, bVar.f169589g, bVar.f169590h);
        if (z14) {
            return;
        }
        if (q() || this.I == 0) {
            u();
        }
        if (this.I > 0) {
            ((l.b) this.f117561c).b(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    public final void n(int i14) {
        ArrayList<j> arrayList;
        long j8;
        androidx.media3.exoplayer.source.q.a aVar;
        fa.a.d(!this.f117568j.c());
        int i15 = i14;
        loop0: while (true) {
            arrayList = this.f117573n;
            if (i15 >= arrayList.size()) {
                i15 = -1;
                break;
            }
            int i16 = i15;
            while (true) {
                if (i16 >= arrayList.size()) {
                    j jVar = arrayList.get(i15);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.f117581x.length) {
                            break loop0;
                        }
                        if (this.f117581x[i17].n() > jVar.d(i17)) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                } else if (arrayList.get(i16).f117516n) {
                    break;
                } else {
                    i16++;
                }
            }
            i15++;
        }
        if (i15 == -1) {
            return;
        }
        long j14 = o().f169590h;
        j jVar2 = arrayList.get(i15);
        int size = arrayList.size();
        int i18 = z.f70071a;
        if (i15 < 0 || size > arrayList.size() || i15 > size) {
            vb.h.w();
            return;
        }
        if (i15 != size) {
            arrayList.subList(i15, size).clear();
        }
        int i19 = 0;
        while (i19 < this.f117581x.length) {
            int iD = jVar2.d(i19);
            d dVar = this.f117581x[i19];
            androidx.media3.exoplayer.source.q qVar = dVar.f9619a;
            long j15 = dVar.j(iD);
            int i24 = qVar.f9609b;
            fa.a.a(j15 <= qVar.f9614g);
            qVar.f9614g = j15;
            if (j15 != 0) {
                androidx.media3.exoplayer.source.q.a aVar2 = qVar.f9611d;
                if (j15 == aVar2.f9615a) {
                    j8 = j14;
                    qVar.a(qVar.f9611d);
                    androidx.media3.exoplayer.source.q.a aVar3 = new androidx.media3.exoplayer.source.q.a(qVar.f9614g, i24);
                    qVar.f9611d = aVar3;
                    qVar.f9612e = aVar3;
                    qVar.f9613f = aVar3;
                } else {
                    while (true) {
                        long j16 = qVar.f9614g;
                        long j17 = aVar2.f9616b;
                        aVar = aVar2.f9618d;
                        if (j16 <= j17) {
                            break;
                        } else {
                            aVar2 = aVar;
                        }
                    }
                    aVar.getClass();
                    qVar.a(aVar);
                    androidx.media3.exoplayer.source.q.a aVar4 = new androidx.media3.exoplayer.source.q.a(aVar2.f9616b, i24);
                    aVar2.f9618d = aVar4;
                    j8 = j14;
                    if (qVar.f9614g == aVar2.f9616b) {
                        aVar2 = aVar4;
                    }
                    qVar.f9613f = aVar2;
                    if (qVar.f9612e == aVar) {
                        qVar.f9612e = aVar4;
                    }
                }
            } else {
                j8 = j14;
                qVar.a(qVar.f9611d);
                androidx.media3.exoplayer.source.q.a aVar5 = new androidx.media3.exoplayer.source.q.a(qVar.f9614g, i24);
                qVar.f9611d = aVar5;
                qVar.f9612e = aVar5;
                qVar.f9613f = aVar5;
            }
            i19++;
            j14 = j8;
        }
        long j18 = j14;
        if (arrayList.isEmpty()) {
            this.M0 = this.L0;
        } else {
            ((j) Iterables.getLast(arrayList)).K = true;
        }
        this.P0 = false;
        int i25 = this.C;
        long j19 = jVar2.f169589g;
        androidx.media3.exoplayer.source.k.a aVar6 = this.f117569k;
        aVar6.getClass();
        sa.j jVar3 = new sa.j(1, i25, null, 3, null, z.Y(j19), z.Y(j18));
        androidx.media3.exoplayer.source.j.b bVar = aVar6.f9525b;
        bVar.getClass();
        aVar6.a(new p62.e(aVar6, 9, bVar, jVar3));
    }

    public final j o() {
        return (j) am.j.f(1, this.f117573n);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public final void onLoaderReleased() {
        for (d dVar : this.f117581x) {
            dVar.w(true);
            DrmSession drmSession = dVar.f9626h;
            if (drmSession != null) {
                drmSession.a(dVar.f9623e);
                dVar.f9626h = null;
                dVar.f9625g = null;
            }
        }
    }

    public final boolean q() {
        return this.M0 != C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        int i14;
        if (!this.X && this.f117570k0 == null && this.E) {
            int i15 = 0;
            for (d dVar : this.f117581x) {
                if (dVar.q() == null) {
                    return;
                }
            }
            sa.r rVar = this.Y;
            if (rVar != null) {
                int i16 = rVar.f158153a;
                int[] iArr = new int[i16];
                this.f117570k0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i17 = 0; i17 < i16; i17++) {
                    int i18 = 0;
                    while (true) {
                        d[] dVarArr = this.f117581x;
                        if (i18 >= dVarArr.length) {
                            break;
                        }
                        androidx.media3.common.q qVarQ = dVarArr[i18].q();
                        fa.a.f(qVarQ);
                        androidx.media3.common.q qVar = this.Y.a(i17).f8217d[0];
                        String str = qVarQ.f8386n;
                        String str2 = qVar.f8386n;
                        int iH = x.h(str);
                        if (iH == 3) {
                            int i19 = z.f70071a;
                            if (Objects.equals(str, str2) && (!(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || qVarQ.H == qVar.H)) {
                                this.f117570k0[i17] = i18;
                                break;
                                break;
                            }
                            i18++;
                        } else {
                            if (iH == x.h(str2)) {
                                this.f117570k0[i17] = i18;
                                break;
                            }
                            i18++;
                        }
                    }
                }
                Iterator<m> it = this.f117578t.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                return;
            }
            int length = this.f117581x.length;
            int i24 = 0;
            int i25 = -1;
            int i26 = -2;
            while (true) {
                int i27 = 1;
                if (i24 >= length) {
                    break;
                }
                androidx.media3.common.q qVarQ2 = this.f117581x[i24].q();
                fa.a.f(qVarQ2);
                String str3 = qVarQ2.f8386n;
                if (x.m(str3)) {
                    i27 = 2;
                } else if (!x.j(str3)) {
                    i27 = x.l(str3) ? 3 : -2;
                }
                if (p(i27) > p(i26)) {
                    i25 = i24;
                    i26 = i27;
                } else if (i27 == i26 && i25 != -1) {
                    i25 = -1;
                }
                i24++;
            }
            e0 e0Var = this.f117562d.f117487h;
            int i28 = e0Var.f8214a;
            this.H0 = -1;
            this.f117570k0 = new int[length];
            for (int i29 = 0; i29 < length; i29++) {
                this.f117570k0[i29] = i29;
            }
            e0[] e0VarArr = new e0[length];
            int i30 = 0;
            while (i30 < length) {
                androidx.media3.common.q qVarQ3 = this.f117581x[i30].q();
                fa.a.f(qVarQ3);
                String str4 = this.f117559a;
                androidx.media3.common.q qVar2 = this.f117564f;
                if (i30 == i25) {
                    androidx.media3.common.q[] qVarArr = new androidx.media3.common.q[i28];
                    for (int i34 = i15; i34 < i28; i34++) {
                        androidx.media3.common.q qVarE = e0Var.f8217d[i34];
                        if (i26 == 1 && qVar2 != null) {
                            qVarE = qVarE.e(qVar2);
                        }
                        qVarArr[i34] = i28 == 1 ? qVarQ3.e(qVarE) : m(qVarE, qVarQ3, true);
                    }
                    e0VarArr[i30] = new e0(str4, qVarArr);
                    this.H0 = i30;
                    i14 = 0;
                } else {
                    if (i26 != 2 || !x.j(qVarQ3.f8386n)) {
                        qVar2 = null;
                    }
                    StringBuilder sbI = sn.a.i(str4, ":muxed:");
                    sbI.append(i30 < i25 ? i30 : i30 - 1);
                    i14 = 0;
                    e0VarArr[i30] = new e0(sbI.toString(), m(qVar2, qVarQ3, false));
                }
                i30++;
                i15 = i14;
            }
            int i35 = i15;
            this.Y = k(e0VarArr);
            fa.a.d(this.Z == null ? 1 : i35);
            this.Z = Collections.EMPTY_SET;
            this.F = true;
            ((l.b) this.f117561c).c();
        }
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
        Loader loader = this.f117568j;
        if (loader.f9702c == null && !q()) {
            boolean zC = loader.c();
            f fVar = this.f117562d;
            List<j> list = this.f117574o;
            if (zC) {
                this.f117580w.getClass();
                if (fVar.f117495p != null ? false : fVar.f117498s.c(j8, this.f117580w, list)) {
                    loader.a();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && fVar.b(list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                n(size);
            }
            int size2 = (fVar.f117495p != null || fVar.f117498s.length() < 2) ? list.size() : fVar.f117498s.evaluateQueueSize(j8, list);
            if (size2 < this.f117573n.size()) {
                n(size2);
            }
        }
    }

    public final void s() throws IOException {
        Loader loader = this.f117568j;
        IOException iOException = loader.f9702c;
        if (iOException != null) {
            throw iOException;
        }
        Loader.d<? extends Loader.e> dVar = loader.f9701b;
        if (dVar != null) {
            int i14 = dVar.f9705a;
            IOException iOException2 = dVar.f9709e;
            if (iOException2 != null && dVar.f9710f > i14) {
                throw iOException2;
            }
        }
        f fVar = this.f117562d;
        BehindLiveWindowException behindLiveWindowException = fVar.f117495p;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = fVar.f117496q;
        if (uri == null || !fVar.f117500u) {
            return;
        }
        fVar.f117486g.m(uri);
    }

    public final void t(e0[] e0VarArr, int... iArr) {
        this.Y = k(e0VarArr);
        this.Z = new HashSet();
        for (int i14 : iArr) {
            this.Z.add(this.Y.a(i14));
        }
        this.H0 = 0;
        b bVar = this.f117561c;
        Objects.requireNonNull(bVar);
        this.f117577r.post(new k32.n(bVar, 12));
        this.F = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [ma.o$d[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ma.o$d[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bb.l0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.media3.exoplayer.source.r, ma.o$d] */
    /* JADX WARN: Type inference failed for: r5v6, types: [bb.k] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // bb.p
    public final l0 track(int i14, int i15) {
        Integer numValueOf = Integer.valueOf(i15);
        Set<Integer> set = U0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f117583z;
        SparseIntArray sparseIntArray = this.A;
        ?? dVar = 0;
        dVar = 0;
        if (zContains) {
            fa.a.a(set.contains(Integer.valueOf(i15)));
            int i16 = sparseIntArray.get(i15, -1);
            if (i16 != -1) {
                if (hashSet.add(Integer.valueOf(i15))) {
                    this.f117582y[i16] = i14;
                }
                dVar = this.f117582y[i16] == i14 ? this.f117581x[i16] : j(i14, i15);
            }
        } else {
            int i17 = 0;
            while (true) {
                ?? r14 = this.f117581x;
                if (i17 >= r14.length) {
                    break;
                }
                if (this.f117582y[i17] == i14) {
                    dVar = r14[i17];
                    break;
                }
                i17++;
            }
        }
        if (dVar == 0) {
            if (this.Q0) {
                return j(i14, i15);
            }
            int length = this.f117581x.length;
            boolean z14 = i15 == 1 || i15 == 2;
            dVar = new d(this.f117563e, this.f117565g, this.f117566h, this.f117579v);
            dVar.f9638t = this.L0;
            if (z14) {
                dVar.I = this.S0;
                dVar.f9644z = true;
            }
            long j8 = this.R0;
            if (dVar.F != j8) {
                dVar.F = j8;
                dVar.f9644z = true;
            }
            j jVar = this.T0;
            if (jVar != null) {
                dVar.C = jVar.f117513k;
            }
            dVar.f9624f = this;
            int i18 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f117582y, i18);
            this.f117582y = iArrCopyOf;
            iArrCopyOf[length] = i14;
            d[] dVarArr = this.f117581x;
            int i19 = z.f70071a;
            ?? CopyOf = Arrays.copyOf(dVarArr, dVarArr.length + 1);
            CopyOf[dVarArr.length] = dVar;
            this.f117581x = (d[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.K0, i18);
            this.K0 = zArrCopyOf;
            zArrCopyOf[length] = z14;
            this.I0 |= z14;
            hashSet.add(Integer.valueOf(i15));
            sparseIntArray.append(i15, length);
            if (p(i15) > p(this.C)) {
                this.D = length;
                this.C = i15;
            }
            this.J0 = Arrays.copyOf(this.J0, i18);
        }
        if (i15 != 5) {
            return dVar;
        }
        if (this.B == null) {
            this.B = new c(dVar, this.f117571l);
        }
        return this.B;
    }

    public final void u() {
        for (d dVar : this.f117581x) {
            dVar.w(this.N0);
        }
        this.N0 = false;
    }

    public final boolean v(long j8, boolean z14) {
        j jVar;
        boolean z15;
        this.L0 = j8;
        if (q()) {
            this.M0 = j8;
            return true;
        }
        boolean z16 = this.f117562d.f117497r;
        ArrayList<j> arrayList = this.f117573n;
        if (!z16) {
            jVar = null;
            break;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList.size()) {
                jVar = null;
                break;
            }
            jVar = arrayList.get(i14);
            if (jVar.f169589g == j8) {
                break;
            }
            i14++;
        }
        if (this.E && !z14) {
            int length = this.f117581x.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    z15 = true;
                    break;
                }
                d dVar = this.f117581x[i15];
                if (!(jVar != null ? dVar.x(jVar.d(i15)) : dVar.y(j8, false)) && (this.K0[i15] || !this.I0)) {
                    z15 = false;
                    break;
                }
                i15++;
            }
            if (z15) {
                return false;
            }
        }
        this.M0 = j8;
        this.P0 = false;
        arrayList.clear();
        Loader loader = this.f117568j;
        if (!loader.c()) {
            loader.f9702c = null;
            u();
            return true;
        }
        if (this.E) {
            for (d dVar2 : this.f117581x) {
                dVar2.i();
            }
        }
        loader.a();
        return true;
    }
}
