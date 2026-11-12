package ma;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.net.HttpHeaders;
import fa.w;
import fa.x;
import fa.z;
import hc.e0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ua.d {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public final long C;
    public k D;
    public o E;
    public int F;
    public boolean G;
    public volatile boolean H;
    public boolean I;
    public ImmutableList<Integer> J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f117513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f117514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f117515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f117516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f117517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ha.d f117518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ha.g f117519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f117520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f117521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f117522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final w f117523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f117524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<androidx.media3.common.q> f117525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.media3.common.l f117526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final pb.g f117527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final fa.r f117528z;

    private j(h hVar, ha.d dVar, ha.g gVar, androidx.media3.common.q qVar, boolean z14, ha.d dVar2, ha.g gVar2, boolean z15, Uri uri, List<androidx.media3.common.q> list, int i14, Object obj, long j8, long j14, long j15, int i15, boolean z16, int i16, boolean z17, boolean z18, w wVar, long j16, androidx.media3.common.l lVar, k kVar, pb.g gVar3, fa.r rVar, boolean z19, ja.q qVar2) {
        super(dVar, gVar, qVar, i14, obj, j8, j14, j15);
        this.A = z14;
        this.f117517o = i15;
        this.L = z16;
        this.f117514l = i16;
        this.f117519q = gVar2;
        this.f117518p = dVar2;
        this.G = gVar2 != null;
        this.B = z15;
        this.f117515m = uri;
        this.f117521s = z18;
        this.f117523u = wVar;
        this.C = j16;
        this.f117522t = z17;
        this.f117524v = hVar;
        this.f117525w = list;
        this.f117526x = lVar;
        this.f117520r = kVar;
        this.f117527y = gVar3;
        this.f117528z = rVar;
        this.f117516n = z19;
        this.J = ImmutableList.of();
        this.f117513k = M.getAndIncrement();
    }

    public static j a(h hVar, ha.d dVar, androidx.media3.common.q qVar, long j8, androidx.media3.exoplayer.hls.playlist.b bVar, f.e eVar, Uri uri, List<androidx.media3.common.q> list, int i14, Object obj, boolean z14, q qVar2, long j14, j jVar, byte[] bArr, byte[] bArr2, boolean z15, ja.q qVar3, xa.e eVar2) {
        byte[] bArrC;
        boolean z16;
        ha.d aVar;
        k kVar;
        ha.g gVarA;
        ha.d dVar2;
        boolean z17;
        Uri uri2;
        pb.g gVar;
        fa.r rVar;
        k kVar2;
        byte[] bArrC2;
        ha.d aVar2 = dVar;
        androidx.media3.exoplayer.hls.playlist.b.e eVar3 = eVar.f117509a;
        ha.g.b bVar2 = new ha.g.b();
        String str = bVar.f125102a;
        String str2 = eVar3.f9112a;
        long j15 = eVar3.f9114c;
        bVar2.f82565a = x.d(str, str2);
        bVar2.f82570f = eVar3.f9120i;
        bVar2.f82571g = eVar3.f9121j;
        boolean z18 = eVar.f117512d;
        bVar2.f82573i = z18 ? 8 : 0;
        ha.g gVarA2 = bVar2.a();
        if (eVar2 != null) {
            fa.a.a(j15 >= 0);
            eVar2.f189671a.getClass();
            throw null;
        }
        boolean z19 = bArr != null;
        if (z19) {
            String str3 = eVar3.f9119h;
            str3.getClass();
            bArrC = c(str3);
        } else {
            bArrC = null;
        }
        if (bArr != null) {
            bArrC.getClass();
            z16 = true;
            aVar = new a(aVar2, bArr, bArrC);
        } else {
            z16 = true;
            aVar = aVar2;
        }
        androidx.media3.exoplayer.hls.playlist.b.d dVar3 = eVar3.f9113b;
        if (dVar3 != null) {
            boolean z24 = bArr2 != null ? z16 : false;
            if (z24) {
                String str4 = dVar3.f9119h;
                str4.getClass();
                bArrC2 = c(str4);
            } else {
                bArrC2 = null;
            }
            Uri uriD = x.d(str, dVar3.f9112a);
            ha.g.b bVar3 = new ha.g.b();
            bVar3.f82565a = uriD;
            kVar = null;
            byte[] bArr3 = bArrC2;
            bVar3.f82570f = dVar3.f9120i;
            bVar3.f82571g = dVar3.f9121j;
            gVarA = bVar3.a();
            if (eVar2 != null) {
                eVar2.f189671a.getClass();
                throw null;
            }
            if (bArr2 != null) {
                bArr3.getClass();
                aVar2 = new a(aVar2, bArr2, bArr3);
            }
            dVar2 = aVar2;
            z17 = z24;
        } else {
            kVar = null;
            gVarA = null;
            dVar2 = null;
            z17 = false;
        }
        long j16 = j8 + eVar3.f9116e;
        long j17 = j16 + j15;
        int i15 = bVar.f9092j + eVar3.f9115d;
        if (jVar != null) {
            ha.g gVar2 = jVar.f117519q;
            boolean z25 = (gVarA == gVar2 || (gVarA != null && gVar2 != null && gVarA.f82555a.equals(gVar2.f82555a) && gVarA.f82560f == gVar2.f82560f)) ? z16 : false;
            uri2 = uri;
            boolean z26 = (uri2.equals(jVar.f117515m) && jVar.I) ? z16 : false;
            gVar = jVar.f117527y;
            rVar = jVar.f117528z;
            kVar2 = (z25 && z26 && !jVar.K && jVar.f117514l == i15) ? jVar.D : kVar;
        } else {
            uri2 = uri;
            gVar = new pb.g();
            rVar = new fa.r(10);
            kVar2 = kVar;
        }
        pb.g gVar3 = gVar;
        fa.r rVar2 = rVar;
        long j18 = eVar.f117510b;
        int i16 = eVar.f117511c;
        boolean z27 = !z18;
        boolean z28 = eVar3.f9122k;
        SparseArray<w> sparseArray = qVar2.f117601a;
        w wVar = sparseArray.get(i15);
        if (wVar == null) {
            wVar = new w(TimestampAdjuster.MODE_SHARED);
            sparseArray.put(i15, wVar);
        }
        return new j(hVar, aVar, gVarA2, qVar, z19, dVar2, gVarA, z17, uri2, list, i14, obj, j16, j17, j18, i16, z27, i15, z28, z14, wVar, j14, eVar3.f9117f, kVar2, gVar3, rVar2, z15, qVar3);
    }

    public static byte[] c(String str) {
        if (Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public final void b(ha.d dVar, ha.g gVar, boolean z14, boolean z15) {
        ha.g gVarA;
        long j8;
        int i14 = this.F;
        boolean z16 = false;
        if (z14) {
            z16 = i14 != 0;
            gVarA = gVar;
        } else {
            gVarA = gVar.a(i14);
        }
        try {
            bb.i iVarE = e(dVar, gVarA, z15);
            if (z16) {
                iVarE.skipFully(this.F);
            }
            do {
                try {
                    try {
                        if (this.H) {
                            break;
                        }
                    } catch (EOFException e4) {
                        if ((this.f169586d.f8378f & 16384) == 0) {
                            throw e4;
                        }
                        ((b) this.D).f117467a.seek(0L, 0L);
                        j8 = iVarE.f17191d;
                    }
                } catch (Throwable th3) {
                    this.F = (int) (iVarE.f17191d - gVar.f82560f);
                    throw th3;
                }
            } while (((b) this.D).f117467a.b(iVarE, b.f117466f) == 0);
            j8 = iVarE.f17191d;
            this.F = (int) (j8 - gVar.f82560f);
            ha.f.a(dVar);
        } catch (Throwable th4) {
            ha.f.a(dVar);
            throw th4;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void cancelLoad() {
        this.H = true;
    }

    public final int d(int i14) {
        fa.a.d(!this.f117516n);
        if (i14 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i14).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:123:0x029e  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final bb.i e(ha.d dVar, ha.g gVar, boolean z14) throws Throwable {
        int i14;
        long jO;
        long j8;
        int i15;
        b bVar;
        b bVar2;
        w wVar;
        bb.n aVar;
        boolean zD;
        yb.n.a aVar2;
        boolean z15;
        int i16;
        yb.n.a aVar3;
        List<androidx.media3.common.q> listOf;
        List<androidx.media3.common.q> listSingletonList;
        int i17;
        bb.n dVar2;
        long jB = dVar.b(gVar);
        if (z14) {
            try {
                this.f117523u.g(this.f169589g, this.C, this.f117521s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e4) {
                throw new IOException(e4);
            }
        }
        bb.i iVar = new bb.i(dVar, gVar.f82560f, jB);
        int i18 = 1;
        if (this.D == null) {
            fa.r rVar = this.f117528z;
            iVar.f17193f = 0;
            try {
                rVar.D(10);
                iVar.peekFully(rVar.f70054a, 0, 10, false);
                if (rVar.x() != 4801587) {
                    jO = C.TIME_UNSET;
                    break;
                }
                rVar.H(3);
                int iT = rVar.t();
                int i19 = iT + 10;
                byte[] bArr = rVar.f70054a;
                if (i19 > bArr.length) {
                    rVar.D(i19);
                    System.arraycopy(bArr, 0, rVar.f70054a, 0, 10);
                }
                iVar.peekFully(rVar.f70054a, 10, iT, false);
                androidx.media3.common.w wVarC = this.f117527y.c(iT, rVar.f70054a);
                if (wVarC == null) {
                    jO = C.TIME_UNSET;
                    break;
                }
                androidx.media3.common.w.b[] bVarArr = wVarC.f8574a;
                int length = bVarArr.length;
                int i24 = 0;
                while (true) {
                    if (i24 >= length) {
                        jO = C.TIME_UNSET;
                        break;
                    }
                    androidx.media3.common.w.b bVar3 = bVarArr[i24];
                    if (bVar3 instanceof pb.l) {
                        pb.l lVar = (pb.l) bVar3;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f136822b)) {
                            System.arraycopy(lVar.f136823c, 0, rVar.f70054a, 0, 8);
                            rVar.G(0);
                            rVar.F(8);
                            jO = rVar.o() & 8589934591L;
                            break;
                        }
                    }
                    i24++;
                }
            } catch (EOFException unused2) {
            }
            iVar.f17193f = 0;
            k kVar = this.f117520r;
            if (kVar != null) {
                b bVar4 = (b) kVar;
                bb.n nVar = bVar4.f117467a;
                bb.n nVarE = nVar.e();
                fa.a.d(!((nVarE instanceof e0) || (nVarE instanceof vb.f)));
                fa.a.e(nVar.e() == nVar, "Can't recreate wrapped extractors. Outer type: " + nVar.getClass());
                if (nVar instanceof r) {
                    dVar2 = new r(bVar4.f117468b.f8376d, bVar4.f117469c, bVar4.f117470d, bVar4.f117471e);
                } else if (nVar instanceof hc.e) {
                    dVar2 = new hc.e();
                } else if (nVar instanceof hc.a) {
                    dVar2 = new hc.a();
                } else if (nVar instanceof hc.c) {
                    dVar2 = new hc.c();
                } else {
                    if (!(nVar instanceof ub.d)) {
                        vb.h.z("Unexpected extractor type for recreation: ".concat(nVar.getClass().getSimpleName()));
                        return null;
                    }
                    dVar2 = new ub.d();
                }
                bVar2 = new b(dVar2, bVar4.f117468b, bVar4.f117469c, bVar4.f117470d, bVar4.f117471e);
                i15 = 1;
                i14 = 0;
                j8 = C.TIME_UNSET;
            } else {
                Uri uri = gVar.f82555a;
                Map<String, List<String>> responseHeaders = dVar.getResponseHeaders();
                d dVar3 = (d) this.f117524v;
                dVar3.getClass();
                androidx.media3.common.q qVar = this.f169586d;
                int iA = androidx.media3.common.n.a(qVar.f8386n);
                j8 = C.TIME_UNSET;
                List<String> list = responseHeaders.get(HttpHeaders.CONTENT_TYPE);
                int iA2 = androidx.media3.common.n.a((list == null || list.isEmpty()) ? null : list.get(0));
                int iB = androidx.media3.common.n.b(uri);
                int i25 = 7;
                ArrayList arrayList = new ArrayList(7);
                d.a(iA, arrayList);
                d.a(iA2, arrayList);
                d.a(iB, arrayList);
                for (int i26 = 0; i26 < 7; i26++) {
                    d.a(d.f117473e[i26], arrayList);
                }
                iVar.f17193f = 0;
                int i27 = 0;
                bb.n nVar2 = null;
                while (true) {
                    int size = arrayList.size();
                    w wVar2 = this.f117523u;
                    if (i27 >= size) {
                        i15 = i18;
                        i14 = 0;
                        nVar2.getClass();
                        bVar = new b(nVar2, qVar, wVar2, dVar3.f117475b, dVar3.f117476c);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i27)).intValue();
                    if (iIntValue == 0) {
                        i15 = i18;
                        wVar = wVar2;
                        aVar = new hc.a();
                    } else if (iIntValue != i18) {
                        i15 = i18;
                        if (iIntValue == 2) {
                            wVar = wVar2;
                            aVar = new hc.e();
                        } else if (iIntValue != i25) {
                            List<androidx.media3.common.q> list2 = this.f117525w;
                            if (iIntValue == 8) {
                                wVar = wVar2;
                                yb.n.a aVar4 = dVar3.f117475b;
                                boolean z16 = dVar3.f117476c;
                                androidx.media3.common.w wVar3 = qVar.f8384l;
                                if (wVar3 == null) {
                                    aVar2 = aVar4;
                                } else {
                                    int i28 = 0;
                                    while (true) {
                                        androidx.media3.common.w.b[] bVarArr2 = wVar3.f8574a;
                                        aVar2 = aVar4;
                                        if (i28 < bVarArr2.length) {
                                            androidx.media3.common.w.b bVar5 = bVarArr2[i28];
                                            if (bVar5 instanceof p) {
                                                z15 = !((p) bVar5).f117594c.isEmpty();
                                                break;
                                            }
                                            i28++;
                                            aVar4 = aVar2;
                                        }
                                    }
                                    if (z15) {
                                        i16 = 4;
                                    } else {
                                        i16 = 0;
                                    }
                                    if (z16) {
                                        aVar3 = aVar2;
                                    } else {
                                        i16 |= 32;
                                        aVar3 = yb.n.a.f195662a;
                                    }
                                    int i29 = i16;
                                    if (list2 != null) {
                                        listOf = list2;
                                    } else {
                                        listOf = ImmutableList.of();
                                    }
                                    aVar = new vb.f(aVar3, i29, wVar, null, listOf, null);
                                }
                                z15 = false;
                                if (z15) {
                                    i16 = 4;
                                } else {
                                    i16 = 0;
                                }
                                if (z16) {
                                    i16 |= 32;
                                    aVar3 = yb.n.a.f195662a;
                                } else {
                                    aVar3 = aVar2;
                                }
                                int i210 = i16;
                                if (list2 != null) {
                                    listOf = list2;
                                } else {
                                    listOf = ImmutableList.of();
                                }
                                aVar = new vb.f(aVar3, i210, wVar, null, listOf, null);
                            } else if (iIntValue == 11) {
                                int i30 = dVar3.f117474a;
                                boolean z17 = dVar3.f117477d;
                                yb.n.a aVar5 = dVar3.f117475b;
                                boolean z18 = dVar3.f117476c;
                                int i34 = i30 | 16;
                                if (list2 != null) {
                                    i34 = i30 | 48;
                                    listSingletonList = list2;
                                } else if (z17) {
                                    androidx.media3.common.q.b bVar6 = new androidx.media3.common.q.b();
                                    bVar6.f8411m = androidx.media3.common.x.n(MimeTypes.APPLICATION_CEA608);
                                    listSingletonList = Collections.singletonList(bVar6.a());
                                } else {
                                    listSingletonList = Collections.EMPTY_LIST;
                                }
                                String str = qVar.f8383k;
                                if (!TextUtils.isEmpty(str)) {
                                    if (androidx.media3.common.x.b(str, MimeTypes.AUDIO_AAC) == null) {
                                        i34 |= 2;
                                    }
                                    if (androidx.media3.common.x.b(str, MimeTypes.VIDEO_H264) == null) {
                                        i34 |= 4;
                                    }
                                }
                                int i35 = i34;
                                if (z18) {
                                    i17 = 0;
                                } else {
                                    aVar5 = yb.n.a.f195662a;
                                    i17 = i15;
                                }
                                aVar = new e0(2, i17, aVar5, wVar2, new hc.g(i35, listSingletonList), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
                                wVar = wVar2;
                            } else if (iIntValue != 13) {
                                wVar = wVar2;
                                aVar = null;
                            } else {
                                aVar = new r(qVar.f8376d, wVar2, dVar3.f117475b, dVar3.f117476c);
                                wVar = wVar2;
                            }
                        } else {
                            wVar = wVar2;
                            aVar = new ub.d(0, 0L);
                        }
                    } else {
                        i15 = i18;
                        wVar = wVar2;
                        aVar = new hc.c();
                    }
                    aVar.getClass();
                    try {
                        zD = aVar.d(iVar);
                        i14 = 0;
                        iVar.f17193f = 0;
                    } catch (EOFException unused3) {
                        i14 = 0;
                        iVar.f17193f = 0;
                        zD = false;
                    } catch (Throwable th3) {
                        iVar.f17193f = 0;
                        throw th3;
                    }
                    if (zD) {
                        bVar = new b(aVar, qVar, wVar, dVar3.f117475b, dVar3.f117476c);
                        break;
                    }
                    androidx.media3.common.q qVar2 = qVar;
                    if (nVar2 == null && (iIntValue == iA || iIntValue == iA2 || iIntValue == iB || iIntValue == 11)) {
                        nVar2 = aVar;
                    }
                    i27++;
                    qVar = qVar2;
                    arrayList = arrayList;
                    i18 = i15;
                    i25 = 7;
                }
                bVar2 = bVar;
            }
            this.D = bVar2;
            bb.n nVarE2 = bVar2.f117467a.e();
            int i36 = ((nVarE2 instanceof hc.e) || (nVarE2 instanceof hc.a) || (nVarE2 instanceof hc.c) || (nVarE2 instanceof ub.d)) ? i15 : i14;
            o oVar = this.E;
            if (i36 != 0) {
                long jB2 = jO != j8 ? this.f117523u.b(jO) : this.f169589g;
                if (oVar.R0 != jB2) {
                    oVar.R0 = jB2;
                    o.d[] dVarArr = oVar.f117581x;
                    int length2 = dVarArr.length;
                    int i37 = i14;
                    while (i37 < length2) {
                        o.d dVar4 = dVarArr[i37];
                        if (dVar4.F != jB2) {
                            dVar4.F = jB2;
                            dVar4.f9644z = i15;
                        }
                        i37++;
                        i15 = 1;
                    }
                }
            } else if (oVar.R0 != 0) {
                oVar.R0 = 0L;
                o.d[] dVarArr2 = oVar.f117581x;
                int length3 = dVarArr2.length;
                for (int i38 = i14; i38 < length3; i38++) {
                    o.d dVar5 = dVarArr2[i38];
                    if (dVar5.F != 0) {
                        dVar5.F = 0L;
                        dVar5.f9644z = true;
                    }
                }
            }
            this.E.f117583z.clear();
            ((b) this.D).f117467a.c(this.E);
        } else {
            i14 = 0;
        }
        o oVar2 = this.E;
        androidx.media3.common.l lVar2 = oVar2.S0;
        int i39 = z.f70071a;
        androidx.media3.common.l lVar3 = this.f117526x;
        if (!Objects.equals(lVar2, lVar3)) {
            oVar2.S0 = lVar3;
            int i44 = i14;
            while (true) {
                o.d[] dVarArr3 = oVar2.f117581x;
                if (i44 >= dVarArr3.length) {
                    break;
                }
                if (oVar2.K0[i44]) {
                    o.d dVar6 = dVarArr3[i44];
                    dVar6.I = lVar3;
                    dVar6.f9644z = true;
                }
                i44++;
            }
        }
        return iVar;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void load() {
        k kVar;
        this.E.getClass();
        if (this.D == null && (kVar = this.f117520r) != null) {
            bb.n nVarE = ((b) kVar).f117467a.e();
            if ((nVarE instanceof e0) || (nVarE instanceof vb.f)) {
                this.D = this.f117520r;
                this.G = false;
            }
        }
        ha.g gVar = this.f117519q;
        ha.d dVar = this.f117518p;
        if (this.G) {
            dVar.getClass();
            gVar.getClass();
            b(dVar, gVar, this.B, false);
            this.F = 0;
            this.G = false;
        }
        if (this.H) {
            return;
        }
        if (!this.f117522t) {
            b(this.f169591i, this.f169584b, this.A, true);
        }
        this.I = !this.H;
    }
}
