package ma;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.common.e0;
import androidx.media3.common.w;
import androidx.media3.common.x;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.x0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import fa.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l implements androidx.media3.exoplayer.source.i, HlsPlaylistTracker.a {
    public int A;
    public sa.c B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f117529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HlsPlaylistTracker f117530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f117531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ha.n f117532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xa.d f117533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.c f117534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.b.a f117535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f117536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.k.a f117537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xa.b f117538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentityHashMap<sa.n, Integer> f117539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f117540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sa.d f117541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f117542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f117543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f117544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ja.q f117545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f117546r = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f117547t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.media3.exoplayer.source.i.a f117548v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f117549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public sa.r f117550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o[] f117551y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o[] f117552z;

    public class b implements o.b {
        private b() {
        }

        @Override // androidx.media3.exoplayer.source.s.a
        public final void b(s sVar) {
            l lVar = l.this;
            lVar.f117548v.b(lVar);
        }

        public final void c() {
            l lVar = l.this;
            int i14 = lVar.f117549w - 1;
            lVar.f117549w = i14;
            if (i14 > 0) {
                return;
            }
            int i15 = 0;
            for (o oVar : lVar.f117551y) {
                oVar.h();
                i15 += oVar.Y.f158153a;
            }
            e0[] e0VarArr = new e0[i15];
            int i16 = 0;
            for (o oVar2 : lVar.f117551y) {
                oVar2.h();
                int i17 = oVar2.Y.f158153a;
                int i18 = 0;
                while (i18 < i17) {
                    oVar2.h();
                    e0VarArr[i16] = oVar2.Y.a(i18);
                    i18++;
                    i16++;
                }
            }
            lVar.f117550x = new sa.r(e0VarArr);
            lVar.f117548v.a(lVar);
        }
    }

    public l(h hVar, HlsPlaylistTracker hlsPlaylistTracker, g gVar, ha.n nVar, xa.d dVar, androidx.media3.exoplayer.drm.c cVar, androidx.media3.exoplayer.drm.b.a aVar, androidx.media3.exoplayer.upstream.b bVar, androidx.media3.exoplayer.source.k.a aVar2, xa.b bVar2, sa.d dVar2, boolean z14, int i14, boolean z15, ja.q qVar, long j8) {
        this.f117529a = hVar;
        this.f117530b = hlsPlaylistTracker;
        this.f117531c = gVar;
        this.f117532d = nVar;
        this.f117533e = dVar;
        this.f117534f = cVar;
        this.f117535g = aVar;
        this.f117536h = bVar;
        this.f117537i = aVar2;
        this.f117538j = bVar2;
        this.f117541m = dVar2;
        this.f117542n = z14;
        this.f117543o = i14;
        this.f117544p = z15;
        this.f117545q = qVar;
        this.f117547t = j8;
        ((sa.e) dVar2).getClass();
        this.B = new sa.c(ImmutableList.of(), ImmutableList.of());
        this.f117539k = new IdentityHashMap<>();
        this.f117540l = new q();
        this.f117551y = new o[0];
        this.f117552z = new o[0];
    }

    public static androidx.media3.common.q h(androidx.media3.common.q qVar, androidx.media3.common.q qVar2, boolean z14) {
        w wVar;
        int i14;
        String str;
        String str2;
        ImmutableList immutableList;
        int i15;
        int i16;
        String str3;
        ImmutableList immutableListOf = ImmutableList.of();
        if (qVar2 != null) {
            str2 = qVar2.f8383k;
            wVar = qVar2.f8384l;
            i15 = qVar2.C;
            i14 = qVar2.f8377e;
            i16 = qVar2.f8378f;
            str = qVar2.f8376d;
            str3 = qVar2.f8374b;
            immutableList = qVar2.f8375c;
        } else {
            String strS = z.s(qVar.f8383k, 1);
            wVar = qVar.f8384l;
            if (z14) {
                i15 = qVar.C;
                i14 = qVar.f8377e;
                i16 = qVar.f8378f;
                str = qVar.f8376d;
                str3 = qVar.f8374b;
                str2 = strS;
                immutableList = qVar.f8375c;
            } else {
                i14 = 0;
                str = null;
                str2 = strS;
                immutableList = immutableListOf;
                i15 = -1;
                i16 = 0;
                str3 = null;
            }
        }
        String strD = x.d(str2);
        int i17 = z14 ? qVar.f8380h : -1;
        int i18 = z14 ? qVar.f8381i : -1;
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        bVar.f8399a = qVar.f8373a;
        bVar.f8400b = str3;
        bVar.f8401c = ImmutableList.copyOf((Collection) immutableList);
        bVar.f8410l = x.n(qVar.f8385m);
        bVar.f8411m = x.n(strD);
        bVar.f8408j = str2;
        bVar.f8409k = wVar;
        bVar.f8406h = i17;
        bVar.f8407i = i18;
        bVar.B = i15;
        bVar.f8403e = i14;
        bVar.f8404f = i16;
        bVar.f8402d = str;
        return bVar.a();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
    public final void a() {
        for (o oVar : this.f117551y) {
            Loader loader = oVar.f117568j;
            ArrayList<j> arrayList = oVar.f117573n;
            if (!arrayList.isEmpty()) {
                j jVar = (j) Iterables.getLast(arrayList);
                int iB = oVar.f117562d.b(jVar);
                if (iB == 1) {
                    jVar.L = true;
                } else if (iB == 0) {
                    oVar.f117577r.post(new l0.e(5, oVar, jVar));
                } else if (iB == 2 && !oVar.P0 && loader.c()) {
                    loader.a();
                }
            }
        }
        this.f117548v.b(this);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
    public final boolean b(Uri uri, androidx.media3.exoplayer.upstream.b.c cVar, boolean z14) {
        boolean z15;
        int iIndexOf;
        androidx.media3.exoplayer.upstream.b.C0129b c0129bA;
        boolean z16 = true;
        for (o oVar : this.f117551y) {
            f fVar = oVar.f117562d;
            if (z.k(fVar.f117484e, uri)) {
                long j8 = (z14 || (c0129bA = oVar.f117567i.a(wa.k.a(fVar.f117498s), cVar)) == null || c0129bA.f9721a != 2) ? -9223372036854775807L : c0129bA.f9722b;
                int i14 = 0;
                while (true) {
                    Uri[] uriArr = fVar.f117484e;
                    if (i14 >= uriArr.length) {
                        i14 = -1;
                        break;
                    }
                    if (uriArr[i14].equals(uri)) {
                        break;
                    }
                    i14++;
                }
                if (i14 == -1 || (iIndexOf = fVar.f117498s.indexOf(i14)) == -1) {
                    if (j8 != C.TIME_UNSET) {
                    }
                    z16 &= z15;
                } else {
                    fVar.f117500u |= uri.equals(fVar.f117496q);
                    if (j8 == C.TIME_UNSET || (fVar.f117498s.d(iIndexOf, j8) && fVar.f117486g.k(j8, uri))) {
                        if (j8 != C.TIME_UNSET) {
                        }
                        z16 &= z15;
                    }
                }
                z15 = false;
                z16 &= z15;
            }
            z15 = true;
            z16 &= z15;
        }
        this.f117548v.b(this);
        return z16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [ma.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    @Override // androidx.media3.exoplayer.source.i
    public final void c(androidx.media3.exoplayer.source.i.a aVar, long j8) {
        ?? map;
        h hVar;
        boolean z14;
        List<androidx.media3.exoplayer.hls.playlist.c.a> list;
        List<androidx.media3.exoplayer.hls.playlist.c.a> list2;
        o[] oVarArr;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        Uri[] uriArr;
        this.f117548v = aVar;
        HlsPlaylistTracker hlsPlaylistTracker = this.f117530b;
        hlsPlaylistTracker.e(this);
        androidx.media3.exoplayer.hls.playlist.c cVarD = hlsPlaylistTracker.d();
        cVarD.getClass();
        List<androidx.media3.exoplayer.hls.playlist.c.a> list3 = cVarD.f9132g;
        List<androidx.media3.exoplayer.hls.playlist.c.b> list4 = cVarD.f9130e;
        int i16 = 0;
        if (this.f117544p) {
            List<androidx.media3.common.l> list5 = cVarD.f9138m;
            ArrayList arrayList = new ArrayList(list5);
            map = new HashMap();
            int i17 = 0;
            while (i17 < arrayList.size()) {
                androidx.media3.common.l lVar = list5.get(i17);
                String str = lVar.f8340c;
                i17++;
                int i18 = i17;
                while (i18 < arrayList.size()) {
                    androidx.media3.common.l lVar2 = (androidx.media3.common.l) arrayList.get(i18);
                    String str2 = lVar2.f8340c;
                    if (TextUtils.equals(str2, str)) {
                        String str3 = lVar.f8340c;
                        fa.a.d(str3 == null || str2 == null || TextUtils.equals(str3, str2));
                        if (str3 != null) {
                            str2 = str3;
                        }
                        androidx.media3.common.l.b[] bVarArr = lVar.f8338a;
                        androidx.media3.common.l.b[] bVarArr2 = lVar2.f8338a;
                        int i19 = z.f70071a;
                        Object[] objArrCopyOf = Arrays.copyOf(bVarArr, bVarArr.length + bVarArr2.length);
                        System.arraycopy(bVarArr2, 0, objArrCopyOf, bVarArr.length, bVarArr2.length);
                        lVar = new androidx.media3.common.l(str2, (androidx.media3.common.l.b[]) objArrCopyOf);
                        arrayList.remove(i18);
                    } else {
                        i18++;
                    }
                }
                map.put(str, lVar);
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        ?? r14 = map;
        boolean zIsEmpty = list4.isEmpty();
        List<androidx.media3.exoplayer.hls.playlist.c.a> list6 = cVarD.f9133h;
        this.f117549w = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        h hVar2 = this.f117529a;
        boolean z17 = this.f117542n;
        if (zIsEmpty) {
            hVar = hVar2;
            z14 = z17;
            list = list3;
            list2 = list6;
        } else {
            androidx.media3.common.q qVar = cVarD.f9135j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i24 = 0;
            int i25 = 0;
            while (true) {
                list2 = list6;
                if (i24 >= list4.size()) {
                    break;
                }
                androidx.media3.common.q qVar2 = list4.get(i24).f9143b;
                int i26 = qVar2.f8394v;
                String str4 = qVar2.f8383k;
                if (i26 > 0 || z.s(str4, 2) != null) {
                    iArr[i24] = 2;
                    i25++;
                } else if (z.s(str4, 1) != null) {
                    iArr[i24] = 1;
                    i16++;
                } else {
                    iArr[i24] = -1;
                }
                i24++;
                list6 = list2;
            }
            if (i25 > 0) {
                i15 = i25;
                z16 = false;
                z15 = true;
            } else if (i16 < size) {
                i15 = size - i16;
                z15 = false;
                z16 = true;
            } else {
                i15 = size;
                z15 = false;
                z16 = false;
            }
            Uri[] uriArr2 = new Uri[i15];
            androidx.media3.common.q[] qVarArr = new androidx.media3.common.q[i15];
            int[] iArr2 = new int[i15];
            boolean z18 = z15;
            int i27 = 0;
            int i28 = 0;
            while (i27 < list4.size()) {
                if (z18) {
                    uriArr = uriArr2;
                    if (iArr[i27] == 2) {
                    }
                    i27++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z16 || iArr[i27] != 1) {
                    androidx.media3.exoplayer.hls.playlist.c.b bVar = list4.get(i27);
                    uriArr[i28] = bVar.f9142a;
                    qVarArr[i28] = bVar.f9143b;
                    iArr2[i28] = i27;
                    i28++;
                }
                i27++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str5 = qVarArr[0].f8383k;
            int iR = z.r(str5, 2);
            int iR2 = z.r(str5, 1);
            boolean z19 = (iR2 == 1 || (iR2 == 0 && list3.isEmpty())) && iR <= 1 && iR2 + iR > 0;
            int i29 = (z18 || iR2 <= 0) ? 0 : 1;
            hVar = hVar2;
            z14 = z17;
            list = list3;
            o oVarG = g("main", i29, uriArr3, qVarArr, cVarD.f9135j, cVarD.f9136k, r14, j8);
            arrayList2.add(oVarG);
            arrayList3.add(iArr2);
            if (z14 && z19) {
                ArrayList arrayList4 = new ArrayList();
                if (iR > 0) {
                    androidx.media3.common.q[] qVarArr2 = new androidx.media3.common.q[i15];
                    int i30 = 0;
                    while (i30 < i15) {
                        androidx.media3.common.q qVar3 = qVarArr[i30];
                        String strS = z.s(qVar3.f8383k, 2);
                        String strD = x.d(strS);
                        androidx.media3.common.q.b bVar2 = new androidx.media3.common.q.b();
                        bVar2.f8399a = qVar3.f8373a;
                        bVar2.f8400b = qVar3.f8374b;
                        bVar2.f8401c = ImmutableList.copyOf((Collection) qVar3.f8375c);
                        bVar2.f8410l = x.n(qVar3.f8385m);
                        bVar2.f8411m = x.n(strD);
                        bVar2.f8408j = strS;
                        bVar2.f8409k = qVar3.f8384l;
                        bVar2.f8406h = qVar3.f8380h;
                        bVar2.f8407i = qVar3.f8381i;
                        bVar2.f8418t = qVar3.f8393u;
                        bVar2.f8419u = qVar3.f8394v;
                        bVar2.f8420v = qVar3.f8395w;
                        bVar2.f8403e = qVar3.f8377e;
                        bVar2.f8404f = qVar3.f8378f;
                        qVarArr2[i30] = bVar2.a();
                        i30++;
                        qVarArr = qVarArr;
                    }
                    androidx.media3.common.q[] qVarArr3 = qVarArr;
                    arrayList4.add(new e0("main", qVarArr2));
                    if (iR2 > 0 && (qVar != null || list.isEmpty())) {
                        arrayList4.add(new e0("main:audio", h(qVarArr3[0], qVar, false)));
                    }
                    List<androidx.media3.common.q> list7 = cVarD.f9136k;
                    if (list7 != null) {
                        for (int i34 = 0; i34 < list7.size(); i34++) {
                            arrayList4.add(new e0(am.j.h(i34, "main:cc:"), ((d) hVar).b(list7.get(i34))));
                        }
                    }
                } else {
                    androidx.media3.common.q[] qVarArr4 = new androidx.media3.common.q[i15];
                    for (int i35 = 0; i35 < i15; i35++) {
                        qVarArr4[i35] = h(qVarArr[i35], qVar, true);
                    }
                    arrayList4.add(new e0("main", qVarArr4));
                }
                androidx.media3.common.q.b bVar3 = new androidx.media3.common.q.b();
                bVar3.f8399a = "ID3";
                bVar3.f8411m = x.n(MimeTypes.APPLICATION_ID3);
                e0 e0Var = new e0("main:id3", bVar3.a());
                arrayList4.add(e0Var);
                oVarG.t((e0[]) arrayList4.toArray(new e0[0]), arrayList4.indexOf(e0Var));
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i36 = 0;
        while (i36 < list.size()) {
            List<androidx.media3.exoplayer.hls.playlist.c.a> list8 = list;
            String str6 = list8.get(i36).f9141c;
            if (hashSet.add(str6)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                boolean z24 = true;
                for (int i37 = 0; i37 < list8.size(); i37++) {
                    String str7 = list8.get(i37).f9141c;
                    int i38 = z.f70071a;
                    if (Objects.equals(str6, str7)) {
                        androidx.media3.exoplayer.hls.playlist.c.a aVar2 = list8.get(i37);
                        arrayList7.add(Integer.valueOf(i37));
                        Uri uri = aVar2.f9139a;
                        androidx.media3.common.q qVar4 = aVar2.f9140b;
                        arrayList5.add(uri);
                        arrayList6.add(qVar4);
                        z24 &= z.r(qVar4.f8383k, 1) == 1;
                    }
                }
                String strN = fb1.c.n("audio:", str6);
                int i39 = z.f70071a;
                list = list8;
                i14 = i36;
                o oVarG2 = g(strN, 1, (Uri[]) arrayList5.toArray(new Uri[0]), (androidx.media3.common.q[]) arrayList6.toArray(new androidx.media3.common.q[0]), null, Collections.EMPTY_LIST, r14, j8);
                arrayList3.add(Ints.toArray(arrayList7));
                arrayList2.add(oVarG2);
                if (z14 && z24) {
                    oVarG2.t(new e0[]{new e0(strN, (androidx.media3.common.q[]) arrayList6.toArray(new androidx.media3.common.q[0]))}, new int[0]);
                }
            } else {
                i14 = i36;
                list = list8;
            }
            i36 = i14 + 1;
        }
        this.A = arrayList2.size();
        for (int i44 = 0; i44 < list2.size(); i44++) {
            androidx.media3.exoplayer.hls.playlist.c.a aVar3 = list2.get(i44);
            StringBuilder sbI = b71.i.i(i44, "subtitle:", ":");
            sbI.append(aVar3.f9141c);
            String string = sbI.toString();
            androidx.media3.common.q qVar5 = aVar3.f9140b;
            o oVarG3 = g(string, 3, new Uri[]{aVar3.f9139a}, new androidx.media3.common.q[]{qVar5}, null, Collections.EMPTY_LIST, r14, j8);
            arrayList3.add(new int[]{i44});
            arrayList2.add(oVarG3);
            oVarG3.t(new e0[]{new e0(string, ((d) hVar).b(qVar5))}, new int[0]);
        }
        this.f117551y = (o[]) arrayList2.toArray(new o[0]);
        this.f117549w = this.f117551y.length;
        int i45 = 0;
        while (true) {
            int i46 = this.A;
            oVarArr = this.f117551y;
            if (i45 >= i46) {
                break;
            }
            oVarArr[i45].f117562d.f117493n = true;
            i45++;
        }
        for (o oVar : oVarArr) {
            if (!oVar.F) {
                d0.b bVar4 = new d0.b();
                bVar4.f8815a = oVar.L0;
                oVar.f(bVar4.a());
            }
        }
        this.f117552z = this.f117551y;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x025b  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f0  */
    @Override // androidx.media3.exoplayer.source.i
    public final long d(wa.g[] gVarArr, boolean[] zArr, sa.n[] nVarArr, boolean[] zArr2, long j8) {
        IdentityHashMap<sa.n, Integer> identityHashMap;
        sa.n[] nVarArr2;
        f fVar;
        f fVar2;
        boolean z14;
        int[] iArr;
        int i14;
        int i15;
        sa.n[] nVarArr3;
        int i16;
        f fVar3;
        o[] oVarArr;
        o oVar;
        boolean z15;
        boolean z16;
        int i17;
        sa.n[] nVarArr4;
        int i18;
        int[] iArr2;
        int i19;
        int[] iArr3 = new int[gVarArr.length];
        int[] iArr4 = new int[gVarArr.length];
        int i24 = 0;
        while (true) {
            int length = gVarArr.length;
            identityHashMap = this.f117539k;
            if (i24 >= length) {
                break;
            }
            sa.n nVar = nVarArr[i24];
            iArr3[i24] = nVar == null ? -1 : identityHashMap.get(nVar).intValue();
            iArr4[i24] = -1;
            wa.g gVar = gVarArr[i24];
            if (gVar != null) {
                e0 trackGroup = gVar.getTrackGroup();
                int i25 = 0;
                while (true) {
                    o[] oVarArr2 = this.f117551y;
                    if (i25 >= oVarArr2.length) {
                        break;
                    }
                    o oVar2 = oVarArr2[i25];
                    oVar2.h();
                    if (oVar2.Y.b(trackGroup) != -1) {
                        iArr4[i24] = i25;
                        break;
                    }
                    i25++;
                }
            }
            i24++;
        }
        identityHashMap.clear();
        int length2 = gVarArr.length;
        sa.n[] nVarArr5 = new sa.n[length2];
        int length3 = gVarArr.length;
        sa.n[] nVarArr6 = new sa.n[length3];
        int length4 = gVarArr.length;
        wa.g[] gVarArr2 = new wa.g[length4];
        o[] oVarArr3 = new o[this.f117551y.length];
        int i26 = length3;
        int i27 = 0;
        int i28 = 0;
        boolean z17 = false;
        while (i27 < this.f117551y.length) {
            int i29 = length2;
            int i30 = 0;
            while (true) {
                nVarArr2 = nVarArr5;
                if (i30 >= gVarArr.length) {
                    break;
                }
                nVarArr6[i30] = iArr3[i30] == i27 ? nVarArr[i30] : null;
                gVarArr2[i30] = iArr4[i30] == i27 ? gVarArr[i30] : null;
                i30++;
                nVarArr5 = nVarArr2;
            }
            o oVar3 = this.f117551y[i27];
            Loader loader = oVar3.f117568j;
            int i34 = i27;
            f fVar4 = oVar3.f117562d;
            ArrayList<j> arrayList = oVar3.f117573n;
            oVar3.h();
            int i35 = oVar3.I;
            sa.n[] nVarArr7 = nVarArr6;
            int i36 = 0;
            while (i36 < length4) {
                m mVar = (m) nVarArr7[i36];
                if (mVar == null || (gVarArr2[i36] != null && zArr[i36])) {
                    i19 = i36;
                } else {
                    i19 = i36;
                    oVar3.I--;
                    if (mVar.f117556c != -1) {
                        o oVar4 = mVar.f117555b;
                        int i37 = mVar.f117554a;
                        oVar4.h();
                        oVar4.f117570k0.getClass();
                        int i38 = oVar4.f117570k0[i37];
                        fa.a.d(oVar4.J0[i38]);
                        oVar4.J0[i38] = false;
                        mVar.f117556c = -1;
                    }
                    nVarArr7[i19] = null;
                }
                i36 = i19 + 1;
                loader = loader;
            }
            Loader loader2 = loader;
            boolean z18 = true;
            if (z17) {
                fVar = fVar4;
                fVar2 = fVar;
                z14 = true;
            } else {
                if (oVar3.O0) {
                    if (i35 != 0) {
                        fVar = fVar4;
                    }
                    fVar = fVar4;
                    fVar2 = fVar;
                    z14 = true;
                } else {
                    fVar = fVar4;
                    if (j8 != oVar3.L0) {
                        fVar2 = fVar;
                        z14 = true;
                    }
                }
                fVar2 = fVar;
                z14 = false;
            }
            wa.g gVar2 = fVar2.f117498s;
            Uri[] uriArr = fVar2.f117484e;
            boolean z19 = z14;
            HlsPlaylistTracker hlsPlaylistTracker = fVar2.f117486g;
            wa.g[] gVarArr3 = gVarArr2;
            int i39 = 0;
            wa.g gVar3 = gVar2;
            while (i39 < length4) {
                int i44 = i39;
                wa.g gVar4 = gVarArr3[i44];
                if (gVar4 == null) {
                    i18 = length4;
                    iArr2 = iArr3;
                } else {
                    i18 = length4;
                    iArr2 = iArr3;
                    int iB = oVar3.Y.b(gVar4.getTrackGroup());
                    if (iB == oVar3.H0) {
                        hlsPlaylistTracker.c(uriArr[fVar2.f117498s.getSelectedIndexInTrackGroup()]);
                        fVar2.f117498s = gVar4;
                        gVar3 = gVar4;
                    }
                    if (nVarArr7[i44] == null) {
                        oVar3.I++;
                        m mVar2 = new m(oVar3, iB);
                        nVarArr7[i44] = mVar2;
                        zArr2[i44] = z18;
                        if (oVar3.f117570k0 != null) {
                            mVar2.b();
                            if (!z19) {
                                o.d dVar = oVar3.f117581x[oVar3.f117570k0[iB]];
                                z19 = (dVar.n() == 0 || dVar.y(j8, z18)) ? false : true;
                            }
                        }
                    }
                }
                i39 = i44 + 1;
                length4 = i18;
                iArr3 = iArr2;
                z18 = true;
            }
            int i45 = length4;
            int[] iArr5 = iArr3;
            if (oVar3.I == 0) {
                hlsPlaylistTracker.c(uriArr[fVar2.f117498s.getSelectedIndexInTrackGroup()]);
                fVar2.f117495p = null;
                oVar3.T = null;
                oVar3.N0 = true;
                arrayList.clear();
                if (loader2.c()) {
                    if (oVar3.E) {
                        for (o.d dVar2 : oVar3.f117581x) {
                            dVar2.i();
                        }
                    }
                    loader2.a();
                } else {
                    oVar3.u();
                }
                o[] oVarArr4 = oVarArr3;
                oVar = oVar3;
                i17 = i26;
                oVarArr = oVarArr4;
                iArr = iArr4;
                i15 = i29;
                nVarArr3 = nVarArr2;
                i16 = i34;
                fVar3 = fVar2;
            } else {
                boolean z24 = true;
                if (arrayList.isEmpty()) {
                    iArr = iArr4;
                    i14 = i26;
                    i15 = i29;
                    nVarArr3 = nVarArr2;
                    i16 = i34;
                    fVar3 = fVar2;
                    oVarArr = oVarArr3;
                    oVar = oVar3;
                    z15 = z17;
                    z16 = z19;
                } else {
                    int i46 = z.f70071a;
                    if (Objects.equals(gVar3, gVar2)) {
                        iArr = iArr4;
                        i14 = i26;
                        i15 = i29;
                        nVarArr3 = nVarArr2;
                        i16 = i34;
                        fVar3 = fVar2;
                        oVarArr = oVarArr3;
                        oVar = oVar3;
                    } else {
                        if (oVar3.O0) {
                            iArr = iArr4;
                            i14 = i26;
                            i15 = i29;
                            nVarArr3 = nVarArr2;
                            i16 = i34;
                            fVar3 = fVar2;
                            oVarArr = oVarArr3;
                            oVar = oVar3;
                        } else {
                            long j14 = j8 < 0 ? -j8 : 0L;
                            j jVarO = oVar3.o();
                            wa.g gVar5 = gVar3;
                            iArr = iArr4;
                            i14 = i26;
                            i15 = i29;
                            nVarArr3 = nVarArr2;
                            i16 = i34;
                            fVar3 = fVar2;
                            oVarArr = oVarArr3;
                            oVar = oVar3;
                            gVar5.b(j8, j14, C.TIME_UNSET, oVar3.f117574o, fVar2.a(jVarO, j8));
                            if (gVar5.getSelectedIndexInTrackGroup() != fVar3.f117487h.b(jVarO.f169586d)) {
                                z24 = true;
                            } else {
                                z24 = true;
                            }
                        }
                        oVar.N0 = z24;
                        z15 = z24;
                        z16 = z15;
                    }
                    z15 = z17;
                    z16 = z19;
                }
                if (z16) {
                    oVar.v(j8, z15);
                    int i47 = 0;
                    i17 = i14;
                    while (i47 < i17) {
                        if (nVarArr7[i47] != null) {
                            zArr2[i47] = z24;
                        }
                        i47++;
                        z24 = true;
                    }
                } else {
                    i17 = i14;
                }
                z19 = z16;
            }
            ArrayList<m> arrayList2 = oVar.f117578t;
            arrayList2.clear();
            for (int i48 = 0; i48 < i17; i48++) {
                sa.n nVar2 = nVarArr7[i48];
                if (nVar2 != null) {
                    arrayList2.add((m) nVar2);
                }
            }
            oVar.O0 = true;
            int i49 = 0;
            boolean z25 = false;
            while (i49 < gVarArr.length) {
                sa.n nVar3 = nVarArr7[i49];
                int i54 = i16;
                if (iArr[i49] == i54) {
                    nVar3.getClass();
                    nVarArr4 = nVarArr3;
                    nVarArr4[i49] = nVar3;
                    identityHashMap.put(nVar3, Integer.valueOf(i54));
                    z25 = true;
                } else {
                    nVarArr4 = nVarArr3;
                    if (iArr5[i49] == i54) {
                        fa.a.d(nVar3 == null);
                    }
                }
                i49++;
                nVarArr3 = nVarArr4;
                i16 = i54;
            }
            sa.n[] nVarArr8 = nVarArr3;
            int i55 = i16;
            int i56 = i28;
            if (z25) {
                oVarArr[i56] = oVar;
                i28 = i56 + 1;
                if (i56 == 0) {
                    fVar3.f117493n = true;
                    if (z19) {
                        this.f117540l.f117601a.clear();
                        z17 = true;
                    } else {
                        o[] oVarArr5 = this.f117552z;
                        if (oVarArr5.length == 0 || oVar != oVarArr5[0]) {
                            this.f117540l.f117601a.clear();
                            z17 = true;
                        }
                    }
                } else {
                    fVar3.f117493n = i55 < this.A;
                }
            }
            i27 = i55 + 1;
            nVarArr5 = nVarArr8;
            oVarArr3 = oVarArr;
            nVarArr6 = nVarArr7;
            iArr4 = iArr;
            gVarArr2 = gVarArr3;
            length4 = i45;
            iArr3 = iArr5;
            i26 = i17;
            length2 = i15;
        }
        System.arraycopy(nVarArr5, 0, nVarArr, 0, length2);
        o[] oVarArr6 = (o[]) z.Q(oVarArr3, i28);
        this.f117552z = oVarArr6;
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(oVarArr6);
        List listTransform = Lists.transform(immutableListCopyOf, new androidx.media3.common.p(8));
        ((sa.e) this.f117541m).getClass();
        this.B = new sa.c(immutableListCopyOf, listTransform);
        return j8;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void discardBuffer(long j8, boolean z14) throws Throwable {
        for (o oVar : this.f117552z) {
            if (oVar.E && !oVar.q()) {
                int length = oVar.f117581x.length;
                for (int i14 = 0; i14 < length; i14++) {
                    oVar.f117581x[i14].h(j8, z14, oVar.J0[i14]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.i
    public final long e(long j8, x0 x0Var) {
        for (o oVar : this.f117552z) {
            if (oVar.C == 2) {
                f fVar = oVar.f117562d;
                HlsPlaylistTracker hlsPlaylistTracker = fVar.f117486g;
                int selectedIndex = fVar.f117498s.getSelectedIndex();
                Uri[] uriArr = fVar.f117484e;
                androidx.media3.exoplayer.hls.playlist.b bVarH = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : hlsPlaylistTracker.h(uriArr[fVar.f117498s.getSelectedIndexInTrackGroup()], true);
                if (bVarH == null) {
                    break;
                }
                ImmutableList immutableList = bVarH.f9100r;
                if (immutableList.isEmpty() || !bVarH.f125104c) {
                    break;
                    break;
                }
                long j14 = bVarH.f9090h - hlsPlaylistTracker.j();
                long j15 = j8 - j14;
                int iC = z.c(immutableList, Long.valueOf(j15), true);
                long j16 = ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(iC)).f9116e;
                return x0Var.a(j15, j16, iC != immutableList.size() - 1 ? ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(iC + 1)).f9116e : j16) + j14;
            }
        }
        return j8;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        if (this.f117550x != null) {
            return this.B.f(d0Var);
        }
        for (o oVar : this.f117551y) {
            if (!oVar.F) {
                d0.b bVar = new d0.b();
                bVar.f8815a = oVar.L0;
                oVar.f(bVar.a());
            }
        }
        return false;
    }

    public final o g(String str, int i14, Uri[] uriArr, androidx.media3.common.q[] qVarArr, androidx.media3.common.q qVar, List<androidx.media3.common.q> list, Map<String, androidx.media3.common.l> map, long j8) {
        return new o(str, i14, this.f117546r, new f(this.f117529a, this.f117530b, uriArr, qVarArr, this.f117531c, this.f117532d, this.f117540l, this.f117547t, list, this.f117545q, this.f117533e), map, this.f117538j, j8, qVar, this.f117534f, this.f117535g, this.f117536h, this.f117537i, this.f117543o);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        return this.B.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        return this.B.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final sa.r getTrackGroups() {
        sa.r rVar = this.f117550x;
        rVar.getClass();
        return rVar;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        return this.B.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowPrepareError() throws IOException {
        for (o oVar : this.f117551y) {
            oVar.s();
            if (oVar.P0 && !oVar.F) {
                throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
        this.B.reevaluateBuffer(j8);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long seekToUs(long j8) {
        o[] oVarArr = this.f117552z;
        if (oVarArr.length > 0) {
            boolean zV = oVarArr[0].v(j8, false);
            int i14 = 1;
            while (true) {
                o[] oVarArr2 = this.f117552z;
                if (i14 >= oVarArr2.length) {
                    break;
                }
                oVarArr2[i14].v(j8, zV);
                i14++;
            }
            if (zV) {
                this.f117540l.f117601a.clear();
            }
        }
        return j8;
    }
}
