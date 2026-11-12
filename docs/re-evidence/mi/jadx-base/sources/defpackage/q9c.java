package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q9c implements Loader.b<cw3>, Loader.f, s, kl8, r.d {
    public static final Set<Integer> X = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public Format E;
    public Format F;
    public boolean G;
    public TrackGroupArray H;
    public Set<TrackGroup> I;
    public int[] J;
    public int K;
    public boolean L;
    public boolean[] M;
    public boolean[] N;
    public long O;
    public long P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public DrmInitData V;
    public h9c W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f31251b;
    public final d9c c;
    public final r61 d;
    public final Format e;
    public final com.google.android.exoplayer2.drm.c f;
    public final com.google.android.exoplayer2.drm.b.a g;
    public final h h;
    public final l.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f31252k;
    public final ArrayList<h9c> m;
    public final List<h9c> n;
    public final Runnable o;
    public final Runnable p;
    public final Handler q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<m9c> f31253r;
    public final Map<String, DrmInitData> s;
    public cw3 t;
    public d[] u;
    public Set<Integer> w;
    public SparseIntArray x;
    public snp y;
    public int z;
    public final Loader i = new Loader("Loader:HlsSampleStreamWrapper");
    public final d9c.b l = new d9c.b();
    public int[] v = new int[0];

    public interface b extends s.a<q9c> {
        void a();

        void m(Uri uri);
    }

    public static class c implements snp {
        public static final Format g = new Format.b().e0("application/id3").E();
        public static final Format h = new Format.b().e0("application/x-emsg").E();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final td8 f31254a = new td8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final snp f31255b;
        public final Format c;
        public Format d;
        public byte[] e;
        public int f;

        public c(snp snpVar, int i) {
            this.f31255b = snpVar;
            if (i == 1) {
                this.c = g;
            } else {
                if (i != 3) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Unknown metadataType: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.c = h;
            }
            this.e = new byte[0];
            this.f = 0;
        }

        @Override // defpackage.snp
        public void a(okh okhVar, int i, int i2) {
            h(this.f + i);
            okhVar.j(this.e, this.f, i);
            this.f += i;
        }

        @Override // defpackage.snp
        public void b(Format format) {
            this.d = format;
            this.f31255b.b(this.c);
        }

        @Override // defpackage.snp
        public void e(long j, int i, int i2, int i3, snp.a aVar) {
            rk1.e(this.d);
            okh okhVarI = i(i2, i3);
            if (!wlq.c(this.d.l, this.c.l)) {
                if (!"application/x-emsg".equals(this.d.l)) {
                    String strValueOf = String.valueOf(this.d.l);
                    toe.h("EmsgUnwrappingTrackOutput", strValueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(strValueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                } else {
                    EventMessage eventMessageC = this.f31254a.c(okhVarI);
                    if (!g(eventMessageC)) {
                        toe.h("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.l, eventMessageC.U()));
                        return;
                    }
                    okhVarI = new okh((byte[]) rk1.e(eventMessageC.N()));
                }
            }
            int iA = okhVarI.a();
            this.f31255b.d(okhVarI, iA);
            this.f31255b.e(j, i, iA, i3, aVar);
        }

        @Override // defpackage.snp
        public int f(zm5 zm5Var, int i, boolean z, int i2) throws IOException {
            h(this.f + i);
            int i3 = zm5Var.read(this.e, this.f, i);
            if (i3 != -1) {
                this.f += i3;
                return i3;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        public final boolean g(EventMessage eventMessage) {
            Format formatU = eventMessage.U();
            return formatU != null && wlq.c(this.c.l, formatU.l);
        }

        public final void h(int i) {
            byte[] bArr = this.e;
            if (bArr.length < i) {
                this.e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        public final okh i(int i, int i2) {
            int i3 = this.f - i2;
            okh okhVar = new okh(Arrays.copyOfRange(this.e, i3 - i, i3));
            byte[] bArr = this.e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f = i2;
            return okhVar;
        }
    }

    public static final class d extends r {
        public final Map<String, DrmInitData> I;
        public DrmInitData J;

        @Override // com.google.android.exoplayer2.source.r, defpackage.snp
        public void e(long j, int i, int i2, int i3, snp.a aVar) {
            super.e(j, i, i2, i3, aVar);
        }

        public final Metadata h0(Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iE = metadata.e();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iE) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry entryD = metadata.d(i2);
                if ((entryD instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entryD).f8008b)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (iE == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iE - 1];
            while (i < iE) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.d(i);
                }
                i++;
            }
            return new Metadata(entryArr);
        }

        public void i0(DrmInitData drmInitData) {
            this.J = drmInitData;
            I();
        }

        public void j0(h9c h9cVar) {
            f0(h9cVar.f19830k);
        }

        @Override // com.google.android.exoplayer2.source.r
        public Format w(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.J;
            if (drmInitData2 == null) {
                drmInitData2 = format.o;
            }
            if (drmInitData2 != null && (drmInitData = this.I.get(drmInitData2.c)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadataH0 = h0(format.j);
            if (drmInitData2 != format.o || metadataH0 != format.j) {
                format = format.a().L(drmInitData2).X(metadataH0).E();
            }
            return super.w(format);
        }

        public d(r61 r61Var, Looper looper, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.drm.b.a aVar, Map<String, DrmInitData> map) {
            super(r61Var, looper, cVar, aVar);
            this.I = map;
        }
    }

    public q9c(int i, b bVar, d9c d9cVar, Map<String, DrmInitData> map, r61 r61Var, long j, Format format, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.drm.b.a aVar, h hVar, l.a aVar2, int i2) {
        this.f31250a = i;
        this.f31251b = bVar;
        this.c = d9cVar;
        this.s = map;
        this.d = r61Var;
        this.e = format;
        this.f = cVar;
        this.g = aVar;
        this.h = hVar;
        this.j = aVar2;
        this.f31252k = i2;
        Set<Integer> set = X;
        this.w = new HashSet(set.size());
        this.x = new SparseIntArray(set.size());
        this.u = new d[0];
        this.N = new boolean[0];
        this.M = new boolean[0];
        ArrayList<h9c> arrayList = new ArrayList<>();
        this.m = arrayList;
        this.n = Collections.unmodifiableList(arrayList);
        this.f31253r = new ArrayList<>();
        this.o = new Runnable() { // from class: n9c
            @Override // java.lang.Runnable
            public final void run() {
                this.f27679a.S();
            }
        };
        this.p = new Runnable() { // from class: o9c
            @Override // java.lang.Runnable
            public final void run() {
                this.f28891a.b0();
            }
        };
        this.q = wlq.x();
        this.O = j;
        this.P = j;
    }

    public static p67 C(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        toe.h("HlsSampleStreamWrapper", sb.toString());
        return new p67();
    }

    public static Format F(Format format, Format format2, boolean z) {
        String strD;
        String strG;
        if (format == null) {
            return format2;
        }
        int iL = ayf.l(format2.l);
        if (wlq.J(format.i, iL) == 1) {
            strD = wlq.K(format.i, iL);
            strG = ayf.g(strD);
        } else {
            strD = ayf.d(format.i, format2.l);
            strG = format2.l;
        }
        Format.b bVarQ = format2.a().S(format.f7815a).U(format.f7816b).V(format.c).g0(format.d).c0(format.e).G(z ? format.f : -1).Z(z ? format.g : -1).I(strD).j0(format.q).Q(format.f7818r);
        if (strG != null) {
            bVarQ.e0(strG);
        }
        int i = format.y;
        if (i != -1) {
            bVarQ.H(i);
        }
        Metadata metadataC = format.j;
        if (metadataC != null) {
            Metadata metadata = format2.j;
            if (metadata != null) {
                metadataC = metadata.c(metadataC);
            }
            bVarQ.X(metadataC);
        }
        return bVarQ.E();
    }

    private void G(int i) {
        rk1.g(!this.i.j());
        while (true) {
            if (i >= this.m.size()) {
                i = -1;
                break;
            } else if (A(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = K().h;
        h9c h9cVarH = H(i);
        if (this.m.isEmpty()) {
            this.P = this.O;
        } else {
            ((h9c) cpd.f(this.m)).n();
        }
        this.S = false;
        this.j.D(this.z, h9cVarH.g, j);
    }

    public static boolean J(Format format, Format format2) {
        String str = format.l;
        String str2 = format2.l;
        int iL = ayf.l(str);
        if (iL != 3) {
            return iL == ayf.l(str2);
        }
        if (wlq.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || format.D == format2.D;
        }
        return false;
    }

    public static int M(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    private static boolean O(cw3 cw3Var) {
        return cw3Var instanceof h9c;
    }

    private boolean P() {
        return this.P != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (!this.G && this.J == null && this.B) {
            for (d dVar : this.u) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.H != null) {
                R();
                return;
            }
            z();
            k0();
            this.f31251b.a();
        }
    }

    private void f0() {
        for (d dVar : this.u) {
            dVar.W(this.Q);
        }
        this.Q = false;
    }

    public final boolean A(int i) {
        for (int i2 = i; i2 < this.m.size(); i2++) {
            if (this.m.get(i2).n) {
                return false;
            }
        }
        h9c h9cVar = this.m.get(i);
        for (int i3 = 0; i3 < this.u.length; i3++) {
            if (this.u[i3].C() > h9cVar.l(i3)) {
                return false;
            }
        }
        return true;
    }

    public void B() {
        if (this.C) {
            return;
        }
        c(this.O);
    }

    public final r D(int i, int i2) {
        int length = this.u.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        d dVar = new d(this.d, this.q.getLooper(), this.f, this.g, this.s);
        dVar.b0(this.O);
        if (z) {
            dVar.i0(this.V);
        }
        dVar.a0(this.U);
        h9c h9cVar = this.W;
        if (h9cVar != null) {
            dVar.j0(h9cVar);
        }
        dVar.d0(this);
        int i3 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.v, i3);
        this.v = iArrCopyOf;
        iArrCopyOf[length] = i;
        this.u = (d[]) wlq.y0(this.u, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.N, i3);
        this.N = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.L |= z;
        this.w.add(Integer.valueOf(i2));
        this.x.append(i2, length);
        if (M(i2) > M(this.z)) {
            this.A = length;
            this.z = i2;
        }
        this.M = Arrays.copyOf(this.M, i3);
        return dVar;
    }

    public final TrackGroupArray E(TrackGroup[] trackGroupArr) {
        for (int i = 0; i < trackGroupArr.length; i++) {
            TrackGroup trackGroup = trackGroupArr[i];
            Format[] formatArr = new Format[trackGroup.f8076a];
            for (int i2 = 0; i2 < trackGroup.f8076a; i2++) {
                Format formatA = trackGroup.a(i2);
                formatArr[i2] = formatA.c(this.f.c(formatA));
            }
            trackGroupArr[i] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    public final h9c H(int i) {
        h9c h9cVar = this.m.get(i);
        ArrayList<h9c> arrayList = this.m;
        wlq.G0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.u.length; i2++) {
            this.u[i2].u(h9cVar.l(i2));
        }
        return h9cVar;
    }

    public final boolean I(h9c h9cVar) {
        int i = h9cVar.f19830k;
        int length = this.u.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.M[i2] && this.u[i2].Q() == i) {
                return false;
            }
        }
        return true;
    }

    public final h9c K() {
        ArrayList<h9c> arrayList = this.m;
        return arrayList.get(arrayList.size() - 1);
    }

    public final snp L(int i, int i2) {
        rk1.a(X.contains(Integer.valueOf(i2)));
        int i3 = this.x.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.w.add(Integer.valueOf(i2))) {
            this.v[i3] = i;
        }
        return this.v[i3] == i ? this.u[i3] : C(i, i2);
    }

    public final void N(h9c h9cVar) {
        this.W = h9cVar;
        this.E = h9cVar.d;
        this.P = -9223372036854775807L;
        this.m.add(h9cVar);
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (d dVar : this.u) {
            aVarBuilder.a(Integer.valueOf(dVar.G()));
        }
        h9cVar.m(this, aVarBuilder.k());
        for (d dVar2 : this.u) {
            dVar2.j0(h9cVar);
            if (h9cVar.n) {
                dVar2.g0();
            }
        }
    }

    public boolean Q(int i) {
        return !P() && this.u[i].K(this.S);
    }

    public final void R() {
        int i = this.H.f8078a;
        int[] iArr = new int[i];
        this.J = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                d[] dVarArr = this.u;
                if (i3 >= dVarArr.length) {
                    break;
                }
                if (J((Format) rk1.i(dVarArr[i3].F()), this.H.a(i2).a(0))) {
                    this.J[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator<m9c> it = this.f31253r.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void T() throws IOException {
        this.i.a();
        this.c.m();
    }

    public void U(int i) throws IOException {
        T();
        this.u[i].N();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void o(cw3 cw3Var, long j, long j2, boolean z) {
        this.t = null;
        mie mieVar = new mie(cw3Var.f14794a, cw3Var.f14795b, cw3Var.e(), cw3Var.d(), j, j2, cw3Var.a());
        this.h.d(cw3Var.f14794a);
        this.j.r(mieVar, cw3Var.c, this.f31250a, cw3Var.d, cw3Var.e, cw3Var.f, cw3Var.g, cw3Var.h);
        if (z) {
            return;
        }
        if (P() || this.D == 0) {
            f0();
        }
        if (this.D > 0) {
            this.f31251b.k(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void q(cw3 cw3Var, long j, long j2) {
        this.t = null;
        this.c.n(cw3Var);
        mie mieVar = new mie(cw3Var.f14794a, cw3Var.f14795b, cw3Var.e(), cw3Var.d(), j, j2, cw3Var.a());
        this.h.d(cw3Var.f14794a);
        this.j.u(mieVar, cw3Var.c, this.f31250a, cw3Var.d, cw3Var.e, cw3Var.f, cw3Var.g, cw3Var.h);
        if (this.C) {
            this.f31251b.k(this);
        } else {
            c(this.O);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Loader.c s(cw3 cw3Var, long j, long j2, IOException iOException, int i) {
        Loader.c cVarH;
        int i2;
        boolean zO = O(cw3Var);
        if (zO && !((h9c) cw3Var).p() && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i2 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return Loader.d;
        }
        long jA = cw3Var.a();
        mie mieVar = new mie(cw3Var.f14794a, cw3Var.f14795b, cw3Var.e(), cw3Var.d(), j, j2, jA);
        h.a aVar = new h.a(mieVar, new ljf(cw3Var.c, this.f31250a, cw3Var.d, cw3Var.e, cw3Var.f, g83.d(cw3Var.g), g83.d(cw3Var.h)), iOException, i);
        long jC = this.h.c(aVar);
        boolean zL = jC != -9223372036854775807L ? this.c.l(cw3Var, jC) : false;
        if (zL) {
            if (zO && jA == 0) {
                ArrayList<h9c> arrayList = this.m;
                rk1.g(arrayList.remove(arrayList.size() - 1) == cw3Var);
                if (this.m.isEmpty()) {
                    this.P = this.O;
                } else {
                    ((h9c) cpd.f(this.m)).n();
                }
            }
            cVarH = Loader.f;
        } else {
            long jA2 = this.h.a(aVar);
            cVarH = jA2 != -9223372036854775807L ? Loader.h(false, jA2) : Loader.g;
        }
        Loader.c cVar = cVarH;
        boolean z = !cVar.c();
        this.j.w(mieVar, cw3Var.c, this.f31250a, cw3Var.d, cw3Var.e, cw3Var.f, cw3Var.g, cw3Var.h, iOException, z);
        if (z) {
            this.t = null;
            this.h.d(cw3Var.f14794a);
        }
        if (zL) {
            if (this.C) {
                this.f31251b.k(this);
            } else {
                c(this.O);
            }
        }
        return cVar;
    }

    public void Y() {
        this.w.clear();
    }

    public boolean Z(Uri uri, long j) {
        return this.c.o(uri, j);
    }

    @Override // com.google.android.exoplayer2.source.r.d
    public void a(Format format) {
        this.q.post(this.o);
    }

    public void a0() {
        if (this.m.isEmpty()) {
            return;
        }
        h9c h9cVar = (h9c) cpd.f(this.m);
        int iB = this.c.b(h9cVar);
        if (iB == 1) {
            h9cVar.u();
        } else if (iB == 2 && !this.S && this.i.j()) {
            this.i.f();
        }
    }

    public final void b0() {
        this.B = true;
        S();
    }

    @Override // com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        List<h9c> listEmptyList;
        long jMax;
        if (this.S || this.i.j() || this.i.i()) {
            return false;
        }
        if (P()) {
            listEmptyList = Collections.emptyList();
            jMax = this.P;
            for (d dVar : this.u) {
                dVar.b0(this.P);
            }
        } else {
            listEmptyList = this.n;
            h9c h9cVarK = K();
            jMax = h9cVarK.g() ? h9cVarK.h : Math.max(this.O, h9cVarK.g);
        }
        List<h9c> list = listEmptyList;
        this.c.d(j, jMax, list, this.C || !list.isEmpty(), this.l);
        d9c.b bVar = this.l;
        boolean z = bVar.f15258b;
        cw3 cw3Var = bVar.f15257a;
        Uri uri = bVar.c;
        bVar.a();
        if (z) {
            this.P = -9223372036854775807L;
            this.S = true;
            return true;
        }
        if (cw3Var == null) {
            if (uri != null) {
                this.f31251b.m(uri);
            }
            return false;
        }
        if (O(cw3Var)) {
            N((h9c) cw3Var);
        }
        this.t = cw3Var;
        this.j.A(new mie(cw3Var.f14794a, cw3Var.f14795b, this.i.n(cw3Var, this, this.h.e(cw3Var.c))), cw3Var.c, this.f31250a, cw3Var.d, cw3Var.e, cw3Var.f, cw3Var.g, cw3Var.h);
        return true;
    }

    public void c0(TrackGroup[] trackGroupArr, int i, int... iArr) {
        this.H = E(trackGroupArr);
        this.I = new HashSet();
        for (int i2 : iArr) {
            this.I.add(this.H.a(i2));
        }
        this.K = i;
        Handler handler = this.q;
        final b bVar = this.f31251b;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: p9c
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a();
            }
        });
        k0();
    }

    @Override // defpackage.kl8
    public snp d(int i, int i2) {
        snp snpVarD;
        if (!X.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                snp[] snpVarArr = this.u;
                if (i3 >= snpVarArr.length) {
                    snpVarD = null;
                    break;
                }
                if (this.v[i3] == i) {
                    snpVarD = snpVarArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            snpVarD = L(i, i2);
        }
        if (snpVarD == null) {
            if (this.T) {
                return C(i, i2);
            }
            snpVarD = D(i, i2);
        }
        if (i2 != 5) {
            return snpVarD;
        }
        if (this.y == null) {
            this.y = new c(snpVarD, this.f31252k);
        }
        return this.y;
    }

    public int d0(int i, a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (P()) {
            return -3;
        }
        int i3 = 0;
        if (!this.m.isEmpty()) {
            int i4 = 0;
            while (i4 < this.m.size() - 1 && I(this.m.get(i4))) {
                i4++;
            }
            wlq.G0(this.m, 0, i4);
            h9c h9cVar = this.m.get(0);
            Format format = h9cVar.d;
            if (!format.equals(this.F)) {
                this.j.i(this.f31250a, format, h9cVar.e, h9cVar.f, h9cVar.g);
            }
            this.F = format;
        }
        if (!this.m.isEmpty() && !this.m.get(0).p()) {
            return -3;
        }
        int iS = this.u[i].S(a1aVar, decoderInputBuffer, i2, this.S);
        if (iS == -5) {
            Format formatG = (Format) rk1.e(a1aVar.f517b);
            if (i == this.A) {
                int iQ = this.u[i].Q();
                while (i3 < this.m.size() && this.m.get(i3).f19830k != iQ) {
                    i3++;
                }
                formatG = formatG.g(i3 < this.m.size() ? this.m.get(i3).d : (Format) rk1.e(this.E));
            }
            a1aVar.f517b = formatG;
        }
        return iS;
    }

    @Override // com.google.android.exoplayer2.source.s
    public long e() {
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.P;
        }
        long jMax = this.O;
        h9c h9cVarK = K();
        if (!h9cVarK.g()) {
            if (this.m.size() > 1) {
                ArrayList<h9c> arrayList = this.m;
                h9cVarK = arrayList.get(arrayList.size() - 2);
            } else {
                h9cVarK = null;
            }
        }
        if (h9cVarK != null) {
            jMax = Math.max(jMax, h9cVarK.h);
        }
        if (this.B) {
            for (d dVar : this.u) {
                jMax = Math.max(jMax, dVar.z());
            }
        }
        return jMax;
    }

    public void e0() {
        if (this.C) {
            for (d dVar : this.u) {
                dVar.R();
            }
        }
        this.i.m(this);
        this.q.removeCallbacksAndMessages(null);
        this.G = true;
        this.f31253r.clear();
    }

    @Override // com.google.android.exoplayer2.source.s
    public void f(long j) {
        if (this.i.i() || P()) {
            return;
        }
        if (this.i.j()) {
            rk1.e(this.t);
            if (this.c.t(j, this.t, this.n)) {
                this.i.f();
                return;
            }
            return;
        }
        int size = this.n.size();
        while (size > 0 && this.c.b(this.n.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.n.size()) {
            G(size);
        }
        int iG = this.c.g(j, this.n);
        if (iG < this.m.size()) {
            G(iG);
        }
    }

    @Override // com.google.android.exoplayer2.source.s
    public long g() {
        if (P()) {
            return this.P;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return K().h;
    }

    public final boolean g0(long j) {
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            if (!this.u[i].Z(j, false) && (this.N[i] || !this.L)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.i.j();
    }

    public boolean h0(long j, boolean z) {
        this.O = j;
        if (P()) {
            this.P = j;
            return true;
        }
        if (this.B && !z && g0(j)) {
            return false;
        }
        this.P = j;
        this.S = false;
        this.m.clear();
        if (this.i.j()) {
            if (this.B) {
                for (d dVar : this.u) {
                    dVar.r();
                }
            }
            this.i.f();
        } else {
            this.i.g();
            f0();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    public boolean i0(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        x();
        int i = this.D;
        int i2 = 0;
        for (int i3 = 0; i3 < bVarArr.length; i3++) {
            m9c m9cVar = (m9c) k9lVarArr[i3];
            if (m9cVar != null && (bVarArr[i3] == null || !zArr[i3])) {
                this.D--;
                m9cVar.e();
                k9lVarArr[i3] = null;
            }
        }
        boolean z3 = z || (!this.R ? j == this.O : i != 0);
        com.google.android.exoplayer2.trackselection.b bVarJ = this.c.j();
        boolean z4 = z3;
        com.google.android.exoplayer2.trackselection.b bVar = bVarJ;
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            com.google.android.exoplayer2.trackselection.b bVar2 = bVarArr[i4];
            if (bVar2 != null) {
                int iC = this.H.c(bVar2.f());
                if (iC == this.K) {
                    this.c.s(bVar2);
                    bVar = bVar2;
                }
                if (k9lVarArr[i4] == null) {
                    this.D++;
                    m9c m9cVar2 = new m9c(this, iC);
                    k9lVarArr[i4] = m9cVar2;
                    zArr2[i4] = true;
                    if (this.J != null) {
                        m9cVar2.b();
                        if (!z4) {
                            d dVar = this.u[this.J[iC]];
                            z4 = (dVar.Z(j, true) || dVar.C() == 0) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.D == 0) {
            this.c.p();
            this.F = null;
            this.Q = true;
            this.m.clear();
            if (this.i.j()) {
                if (this.B) {
                    d[] dVarArr = this.u;
                    int length = dVarArr.length;
                    while (i2 < length) {
                        dVarArr[i2].r();
                        i2++;
                    }
                }
                this.i.f();
            } else {
                f0();
            }
        } else {
            if (this.m.isEmpty() || wlq.c(bVar, bVarJ)) {
                z2 = z;
            } else {
                if (!this.R) {
                    long j2 = j < 0 ? -j : 0L;
                    h9c h9cVarK = K();
                    bVar.o(j, j2, -9223372036854775807L, this.n, this.c.a(h9cVarK, j));
                    if (bVar.h() == this.c.i().c(h9cVarK.d)) {
                        z2 = z;
                    }
                }
                this.Q = true;
                z2 = true;
                z4 = true;
            }
            if (z4) {
                h0(j, z2);
                while (i2 < k9lVarArr.length) {
                    if (k9lVarArr[i2] != null) {
                        zArr2[i2] = true;
                    }
                    i2++;
                }
            }
        }
        p0(k9lVarArr);
        this.R = true;
        return z4;
    }

    public void j0(DrmInitData drmInitData) {
        if (wlq.c(this.V, drmInitData)) {
            return;
        }
        this.V = drmInitData;
        int i = 0;
        while (true) {
            d[] dVarArr = this.u;
            if (i >= dVarArr.length) {
                return;
            }
            if (this.N[i]) {
                dVarArr[i].i0(drmInitData);
            }
            i++;
        }
    }

    @Override // defpackage.kl8
    public void k(arl arlVar) {
    }

    public final void k0() {
        this.C = true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void l() {
        for (d dVar : this.u) {
            dVar.T();
        }
    }

    public void l0(boolean z) {
        this.c.r(z);
    }

    @Override // defpackage.kl8
    public void m() {
        this.T = true;
        this.q.post(this.p);
    }

    public void m0(long j) {
        if (this.U != j) {
            this.U = j;
            for (d dVar : this.u) {
                dVar.a0(j);
            }
        }
    }

    public TrackGroupArray n() {
        x();
        return this.H;
    }

    public int n0(int i, long j) {
        if (P()) {
            return 0;
        }
        d dVar = this.u[i];
        int iE = dVar.E(j, this.S);
        int iC = dVar.C();
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            h9c h9cVar = this.m.get(i2);
            int iL = this.m.get(i2).l(i);
            if (iC + iE <= iL) {
                break;
            }
            if (!h9cVar.p()) {
                iE = iL - iC;
                break;
            }
        }
        dVar.e0(iE);
        return iE;
    }

    public void o0(int i) {
        x();
        rk1.e(this.J);
        int i2 = this.J[i];
        rk1.g(this.M[i2]);
        this.M[i2] = false;
    }

    public final void p0(k9l[] k9lVarArr) {
        this.f31253r.clear();
        for (k9l k9lVar : k9lVarArr) {
            if (k9lVar != null) {
                this.f31253r.add((m9c) k9lVar);
            }
        }
    }

    public void t() throws IOException {
        T();
        if (this.S && !this.C) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    public void u(long j, boolean z) {
        if (!this.B || P()) {
            return;
        }
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            this.u[i].q(j, z, this.M[i]);
        }
    }

    public final void x() {
        rk1.g(this.C);
        rk1.e(this.H);
        rk1.e(this.I);
    }

    public int y(int i) {
        x();
        rk1.e(this.J);
        int i2 = this.J[i];
        if (i2 == -1) {
            return this.I.contains(this.H.a(i)) ? -3 : -2;
        }
        boolean[] zArr = this.M;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    public final void z() {
        int length = this.u.length;
        int i = 7;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= length) {
                break;
            }
            String str = ((Format) rk1.i(this.u[i3].F())).l;
            if (!ayf.s(str)) {
                i4 = ayf.p(str) ? 1 : ayf.r(str) ? 3 : 7;
            }
            if (M(i4) > M(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        TrackGroup trackGroupI = this.c.i();
        int i5 = trackGroupI.f8076a;
        this.K = -1;
        this.J = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.J[i6] = i6;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i7 = 0; i7 < length; i7++) {
            Format format = (Format) rk1.i(this.u[i7].F());
            if (i7 == i2) {
                Format[] formatArr = new Format[i5];
                if (i5 == 1) {
                    formatArr[0] = format.g(trackGroupI.a(0));
                } else {
                    for (int i8 = 0; i8 < i5; i8++) {
                        formatArr[i8] = F(trackGroupI.a(i8), format, true);
                    }
                }
                trackGroupArr[i7] = new TrackGroup(formatArr);
                this.K = i7;
            } else {
                trackGroupArr[i7] = new TrackGroup(F((i == 2 && ayf.p(format.l)) ? this.e : null, format, false));
            }
        }
        this.H = E(trackGroupArr);
        rk1.g(this.I == null);
        this.I = Collections.emptySet();
    }
}
