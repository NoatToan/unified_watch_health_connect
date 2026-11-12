package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.drm.DrmSession;
import bb.l0;
import fa.z;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Objects;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public class r implements l0 {
    public androidx.media3.common.q A;
    public androidx.media3.common.q B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f9619a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.c f9622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.b.a f9623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.media3.common.q f9625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DrmSession f9626h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9637s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9641w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9644z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f9620b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9627i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f9628j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f9629k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f9632n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f9631m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f9630l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l0.a[] f9633o = new l0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa.p<c> f9621c = new sa.p<>(new q2(28));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9638t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f9639u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f9640v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9643y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9642x = true;
    public boolean D = true;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l0.a f9647c;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.q f9648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.c.b f9649b;

        private c(androidx.media3.common.q qVar, androidx.media3.exoplayer.drm.c.b bVar) {
            this.f9648a = qVar;
            this.f9649b = bVar;
        }
    }

    public interface d {
        void b();
    }

    public r(xa.b bVar, androidx.media3.exoplayer.drm.c cVar, androidx.media3.exoplayer.drm.b.a aVar) {
        this.f9622d = cVar;
        this.f9623e = aVar;
        this.f9619a = new q(bVar);
    }

    @Override // bb.l0
    public final void a(fa.r rVar, int i14, int i15) {
        while (true) {
            q qVar = this.f9619a;
            if (i14 <= 0) {
                qVar.getClass();
                return;
            }
            int iC = qVar.c(i14);
            q.a aVar = qVar.f9613f;
            xa.a aVar2 = aVar.f9617c;
            rVar.e(aVar2.f189665a, ((int) (qVar.f9614g - aVar.f9615a)) + aVar2.f189666b, iC);
            i14 -= iC;
            long j8 = qVar.f9614g + ((long) iC);
            qVar.f9614g = j8;
            q.a aVar3 = qVar.f9613f;
            if (j8 == aVar3.f9616b) {
                qVar.f9613f = aVar3.f9618d;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0172 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0120, B:110:0x0196, B:112:0x019f, B:89:0x0139, B:91:0x0142, B:93:0x014b, B:95:0x015e, B:99:0x0167, B:100:0x016c, B:102:0x0172, B:106:0x0180, B:108:0x0185, B:109:0x0193, B:92:0x0149), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:104:0x017d  */
    /* JADX WARN: Code duplicated, block: B:105:0x017f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0185 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0120, B:110:0x0196, B:112:0x019f, B:89:0x0139, B:91:0x0142, B:93:0x014b, B:95:0x015e, B:99:0x0167, B:100:0x016c, B:102:0x0172, B:106:0x0180, B:108:0x0185, B:109:0x0193, B:92:0x0149), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:89:0x0139 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0120, B:110:0x0196, B:112:0x019f, B:89:0x0139, B:91:0x0142, B:93:0x014b, B:95:0x015e, B:99:0x0167, B:100:0x016c, B:102:0x0172, B:106:0x0180, B:108:0x0185, B:109:0x0193, B:92:0x0149), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0142 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0120, B:110:0x0196, B:112:0x019f, B:89:0x0139, B:91:0x0142, B:93:0x014b, B:95:0x015e, B:99:0x0167, B:100:0x016c, B:102:0x0172, B:106:0x0180, B:108:0x0185, B:109:0x0193, B:92:0x0149), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0149 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0120, B:110:0x0196, B:112:0x019f, B:89:0x0139, B:91:0x0142, B:93:0x014b, B:95:0x015e, B:99:0x0167, B:100:0x016c, B:102:0x0172, B:106:0x0180, B:108:0x0185, B:109:0x0193, B:92:0x0149), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:95:0x015e A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0120, B:110:0x0196, B:112:0x019f, B:89:0x0139, B:91:0x0142, B:93:0x014b, B:95:0x015e, B:99:0x0167, B:100:0x016c, B:102:0x0172, B:106:0x0180, B:108:0x0185, B:109:0x0193, B:92:0x0149), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x0166  */
    @Override // bb.l0
    public void c(long j8, int i14, int i15, int i16, l0.a aVar) {
        int i17;
        androidx.media3.common.q qVar;
        androidx.media3.exoplayer.drm.c cVar;
        androidx.media3.exoplayer.drm.c.b bVarC;
        sa.p<c> pVar;
        int i18;
        SparseArray<c> sparseArray;
        int iKeyAt;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f9644z) {
            androidx.media3.common.q qVar2 = this.A;
            fa.a.f(qVar2);
            d(qVar2);
        }
        int i19 = i14 & 1;
        boolean z17 = i19 != 0;
        if (this.f9642x) {
            if (!z17) {
                return;
            } else {
                this.f9642x = false;
            }
        }
        long j14 = j8 + this.F;
        if (!this.D) {
            i17 = i14;
        } else {
            if (j14 < this.f9638t) {
                return;
            }
            if (i19 == 0) {
                if (!this.E) {
                    fa.k.g("Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i17 = i14 | 1;
            } else {
                i17 = i14;
            }
        }
        if (this.G) {
            if (!z17) {
                return;
            }
            synchronized (this) {
                if (this.f9634p == 0) {
                    z16 = j14 > this.f9639u;
                } else {
                    synchronized (this) {
                        long jMax = Math.max(this.f9639u, m(this.f9637s));
                        if (jMax >= j14) {
                            z16 = false;
                        } else {
                            int i24 = this.f9634p;
                            int iO = o(i24 - 1);
                            while (i24 > this.f9637s && this.f9632n[iO] >= j14) {
                                i24--;
                                iO--;
                                if (iO == -1) {
                                    iO = this.f9627i - 1;
                                }
                            }
                            j(this.f9635q + i24);
                            z16 = true;
                        }
                    }
                }
            }
            if (!z16) {
                return;
            } else {
                this.G = false;
            }
        }
        long j15 = (this.f9619a.f9614g - ((long) i15)) - ((long) i16);
        synchronized (this) {
            try {
                int i25 = this.f9634p;
                if (i25 > 0) {
                    int iO2 = o(i25 - 1);
                    fa.a.a(this.f9629k[iO2] + ((long) this.f9630l[iO2]) <= j15);
                }
                this.f9641w = (536870912 & i17) != 0;
                this.f9640v = Math.max(this.f9640v, j14);
                int iO3 = o(this.f9634p);
                this.f9632n[iO3] = j14;
                this.f9629k[iO3] = j15;
                this.f9630l[iO3] = i15;
                this.f9631m[iO3] = i17;
                this.f9633o[iO3] = aVar;
                this.f9628j[iO3] = this.C;
                if (this.f9621c.f158148b.size() == 0) {
                    qVar = this.B;
                    qVar.getClass();
                    cVar = this.f9622d;
                    if (cVar != null) {
                        bVarC = cVar.c(this.f9623e, qVar);
                    } else {
                        bVarC = androidx.media3.exoplayer.drm.c.b.f8900s;
                    }
                    pVar = this.f9621c;
                    i18 = this.f9635q + this.f9634p;
                    c cVar2 = new c(qVar, bVarC);
                    sparseArray = pVar.f158148b;
                    if (pVar.f158147a == -1) {
                        if (sparseArray.size() == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        fa.a.d(z15);
                        pVar.f158147a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i18 >= iKeyAt) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        fa.a.a(z14);
                        if (iKeyAt == i18) {
                            pVar.f158149c.accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i18, cVar2);
                } else {
                    SparseArray<c> sparseArray2 = this.f9621c.f158148b;
                    if (!sparseArray2.valueAt(sparseArray2.size() - 1).f9648a.equals(this.B)) {
                        qVar = this.B;
                        qVar.getClass();
                        cVar = this.f9622d;
                        if (cVar != null) {
                            bVarC = cVar.c(this.f9623e, qVar);
                        } else {
                            bVarC = androidx.media3.exoplayer.drm.c.b.f8900s;
                        }
                        pVar = this.f9621c;
                        i18 = this.f9635q + this.f9634p;
                        c cVar3 = new c(qVar, bVarC);
                        sparseArray = pVar.f158148b;
                        if (pVar.f158147a == -1) {
                            if (sparseArray.size() == 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            fa.a.d(z15);
                            pVar.f158147a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i18 >= iKeyAt) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            fa.a.a(z14);
                            if (iKeyAt == i18) {
                                pVar.f158149c.accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i18, cVar3);
                    }
                }
                int i26 = this.f9634p + 1;
                this.f9634p = i26;
                int i27 = this.f9627i;
                if (i26 == i27) {
                    int i28 = i27 + 1000;
                    long[] jArr = new long[i28];
                    long[] jArr2 = new long[i28];
                    long[] jArr3 = new long[i28];
                    int[] iArr = new int[i28];
                    int[] iArr2 = new int[i28];
                    l0.a[] aVarArr = new l0.a[i28];
                    int i29 = this.f9636r;
                    int i30 = i27 - i29;
                    System.arraycopy(this.f9629k, i29, jArr2, 0, i30);
                    System.arraycopy(this.f9632n, this.f9636r, jArr3, 0, i30);
                    System.arraycopy(this.f9631m, this.f9636r, iArr, 0, i30);
                    System.arraycopy(this.f9630l, this.f9636r, iArr2, 0, i30);
                    System.arraycopy(this.f9633o, this.f9636r, aVarArr, 0, i30);
                    System.arraycopy(this.f9628j, this.f9636r, jArr, 0, i30);
                    int i34 = this.f9636r;
                    System.arraycopy(this.f9629k, 0, jArr2, i30, i34);
                    System.arraycopy(this.f9632n, 0, jArr3, i30, i34);
                    System.arraycopy(this.f9631m, 0, iArr, i30, i34);
                    System.arraycopy(this.f9630l, 0, iArr2, i30, i34);
                    System.arraycopy(this.f9633o, 0, aVarArr, i30, i34);
                    System.arraycopy(this.f9628j, 0, jArr, i30, i34);
                    this.f9629k = jArr2;
                    this.f9632n = jArr3;
                    this.f9631m = iArr;
                    this.f9630l = iArr2;
                    this.f9633o = aVarArr;
                    this.f9628j = jArr;
                    this.f9636r = 0;
                    this.f9627i = i28;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x000a, B:8:0x0019, B:13:0x0029, B:15:0x0040, B:19:0x0059, B:81:0x010f, B:73:0x00fc, B:76:0x0104, B:18:0x0057), top: B:91:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Type inference failed for: r7v23, types: [androidx.media3.exoplayer.source.r$d, java.lang.Object] */
    @Override // bb.l0
    public final void d(androidx.media3.common.q qVar) {
        boolean z14;
        androidx.media3.common.x.b bVarF;
        int iA;
        androidx.media3.common.q qVarL = l(qVar);
        boolean z15 = false;
        this.f9644z = false;
        this.A = qVar;
        synchronized (this) {
            try {
                this.f9643y = false;
                androidx.media3.common.q qVar2 = this.B;
                int i14 = z.f70071a;
                if (!Objects.equals(qVarL, qVar2)) {
                    if (this.f9621c.f158148b.size() == 0) {
                        this.B = qVarL;
                    } else {
                        SparseArray<c> sparseArray = this.f9621c.f158148b;
                        if (sparseArray.valueAt(sparseArray.size() - 1).f9648a.equals(qVarL)) {
                            SparseArray<c> sparseArray2 = this.f9621c.f158148b;
                            this.B = sparseArray2.valueAt(sparseArray2.size() - 1).f9648a;
                        } else {
                            this.B = qVarL;
                        }
                    }
                    boolean z16 = this.D;
                    androidx.media3.common.q qVar3 = this.B;
                    String str = qVar3.f8386n;
                    String str2 = qVar3.f8383k;
                    ArrayList<androidx.media3.common.x.a> arrayList = androidx.media3.common.x.f8576a;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/mpeg-L1":
                            case "audio/mpeg-L2":
                            case "audio/ac3":
                            case "audio/raw":
                            case "audio/eac3":
                            case "audio/flac":
                            case "audio/mpeg":
                            case "audio/g711-alaw":
                            case "audio/g711-mlaw":
                                z14 = true;
                                break;
                            case "audio/mp4a-latm":
                                if (str2 != null && (bVarF = androidx.media3.common.x.f(str2)) != null && (iA = bVarF.a()) != 0 && iA != 16) {
                                    z14 = true;
                                    break;
                                } else {
                                    z14 = false;
                                    break;
                                }
                                break;
                            default:
                                z14 = false;
                                break;
                        }
                    } else {
                        z14 = false;
                    }
                    this.D = z16 & z14;
                    this.E = false;
                    z15 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ?? r14 = this.f9624f;
        if (r14 == 0 || !z15) {
            return;
        }
        r14.b();
    }

    @Override // bb.l0
    public final int e(androidx.media3.common.j jVar, int i14, boolean z14) throws EOFException {
        q qVar = this.f9619a;
        int iC = qVar.c(i14);
        q.a aVar = qVar.f9613f;
        xa.a aVar2 = aVar.f9617c;
        int i15 = jVar.read(aVar2.f189665a, ((int) (qVar.f9614g - aVar.f9615a)) + aVar2.f189666b, iC);
        if (i15 == -1) {
            if (z14) {
                return -1;
            }
            vb.h.m();
            return 0;
        }
        long j8 = qVar.f9614g + ((long) i15);
        qVar.f9614g = j8;
        q.a aVar3 = qVar.f9613f;
        if (j8 == aVar3.f9616b) {
            qVar.f9613f = aVar3.f9618d;
        }
        return i15;
    }

    public final long g(int i14) {
        this.f9639u = Math.max(this.f9639u, m(i14));
        this.f9634p -= i14;
        int i15 = this.f9635q + i14;
        this.f9635q = i15;
        int i16 = this.f9636r + i14;
        this.f9636r = i16;
        int i17 = this.f9627i;
        if (i16 >= i17) {
            this.f9636r = i16 - i17;
        }
        int i18 = this.f9637s - i14;
        this.f9637s = i18;
        int i19 = 0;
        if (i18 < 0) {
            this.f9637s = 0;
        }
        sa.p<c> pVar = this.f9621c;
        SparseArray<c> sparseArray = pVar.f158148b;
        while (i19 < sparseArray.size() - 1) {
            int i24 = i19 + 1;
            if (i15 < sparseArray.keyAt(i24)) {
                break;
            }
            pVar.f158149c.accept(sparseArray.valueAt(i19));
            sparseArray.removeAt(i19);
            int i25 = pVar.f158147a;
            if (i25 > 0) {
                pVar.f158147a = i25 - 1;
            }
            i19 = i24;
        }
        if (this.f9634p != 0) {
            return this.f9629k[this.f9636r];
        }
        int i26 = this.f9636r;
        if (i26 == 0) {
            i26 = this.f9627i;
        }
        int i27 = i26 - 1;
        return this.f9629k[i27] + ((long) this.f9630l[i27]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void h(long j8, boolean z14, boolean z15) throws Throwable {
        Throwable th3;
        q qVar = this.f9619a;
        synchronized (this) {
            try {
                try {
                    int i14 = this.f9634p;
                    long jG = -1;
                    if (i14 != 0) {
                        long[] jArr = this.f9632n;
                        int i15 = this.f9636r;
                        if (j8 >= jArr[i15]) {
                            if (z15) {
                                try {
                                    int i16 = this.f9637s;
                                    if (i16 != i14) {
                                        i14 = i16 + 1;
                                    }
                                } catch (Throwable th4) {
                                    th3 = th4;
                                    throw th3;
                                }
                            }
                            int iK = k(i15, i14, j8, z14);
                            if (iK != -1) {
                                jG = g(iK);
                            }
                        }
                    }
                    qVar.b(jG);
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
                th3 = th;
                throw th3;
            }
        }
    }

    public final void i() {
        long jG;
        q qVar = this.f9619a;
        synchronized (this) {
            int i14 = this.f9634p;
            jG = i14 == 0 ? -1L : g(i14);
        }
        qVar.b(jG);
    }

    public final long j(int i14) {
        int i15 = this.f9635q;
        int i16 = this.f9634p;
        int i17 = (i15 + i16) - i14;
        boolean z14 = false;
        fa.a.a(i17 >= 0 && i17 <= i16 - this.f9637s);
        int i18 = this.f9634p - i17;
        this.f9634p = i18;
        this.f9640v = Math.max(this.f9639u, m(i18));
        if (i17 == 0 && this.f9641w) {
            z14 = true;
        }
        this.f9641w = z14;
        sa.p<c> pVar = this.f9621c;
        SparseArray<c> sparseArray = pVar.f158148b;
        for (int size = sparseArray.size() - 1; size >= 0 && i14 < sparseArray.keyAt(size); size--) {
            pVar.f158149c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        pVar.f158147a = sparseArray.size() > 0 ? Math.min(pVar.f158147a, sparseArray.size() - 1) : -1;
        int i19 = this.f9634p;
        if (i19 == 0) {
            return 0L;
        }
        int iO = o(i19 - 1);
        return this.f9629k[iO] + ((long) this.f9630l[iO]);
    }

    public final int k(int i14, int i15, long j8, boolean z14) {
        int i16 = -1;
        for (int i17 = 0; i17 < i15; i17++) {
            long j14 = this.f9632n[i14];
            if (j14 > j8) {
                break;
            }
            if (!z14 || (this.f9631m[i14] & 1) != 0) {
                if (j14 == j8) {
                    return i17;
                }
                i16 = i17;
            }
            i14++;
            if (i14 == this.f9627i) {
                i14 = 0;
            }
        }
        return i16;
    }

    public androidx.media3.common.q l(androidx.media3.common.q qVar) {
        if (this.F == 0 || qVar.f8391s == Long.MAX_VALUE) {
            return qVar;
        }
        androidx.media3.common.q.b bVarA = qVar.a();
        bVarA.f8416r = qVar.f8391s + this.F;
        return bVarA.a();
    }

    public final long m(int i14) {
        long jMax = Long.MIN_VALUE;
        if (i14 == 0) {
            return Long.MIN_VALUE;
        }
        int iO = o(i14 - 1);
        for (int i15 = 0; i15 < i14; i15++) {
            jMax = Math.max(jMax, this.f9632n[iO]);
            if ((this.f9631m[iO] & 1) != 0) {
                return jMax;
            }
            iO--;
            if (iO == -1) {
                iO = this.f9627i - 1;
            }
        }
        return jMax;
    }

    public final int n() {
        return this.f9635q + this.f9637s;
    }

    public final int o(int i14) {
        int i15 = this.f9636r + i14;
        int i16 = this.f9627i;
        return i15 < i16 ? i15 : i15 - i16;
    }

    public final synchronized int p(long j8, boolean z14) throws Throwable {
        try {
            try {
                int iO = o(this.f9637s);
                int i14 = this.f9637s;
                int i15 = this.f9634p;
                if (!(i14 != i15) || j8 < this.f9632n[iO]) {
                    return 0;
                }
                if (j8 > this.f9640v && z14) {
                    return i15 - i14;
                }
                int iK = k(iO, i15 - i14, j8, true);
                if (iK == -1) {
                    return 0;
                }
                return iK;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    public final synchronized androidx.media3.common.q q() {
        return this.f9643y ? null : this.B;
    }

    public final synchronized boolean r(boolean z14) {
        androidx.media3.common.q qVar;
        boolean z15 = false;
        if (this.f9637s != this.f9634p) {
            if (this.f9621c.a(n()).f9648a != this.f9625g) {
                return true;
            }
            return s(o(this.f9637s));
        }
        if (z14 || this.f9641w || ((qVar = this.B) != null && qVar != this.f9625g)) {
            z15 = true;
        }
        return z15;
    }

    public final boolean s(int i14) {
        DrmSession drmSession = this.f9626h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f9631m[i14] & 1073741824) == 0 && this.f9626h.playClearSamplesWithoutKeys();
    }

    public final void t(androidx.media3.common.q qVar, a0 a0Var) {
        androidx.media3.common.q qVarA;
        androidx.media3.common.q qVar2 = this.f9625g;
        boolean z14 = qVar2 == null;
        androidx.media3.common.l lVar = qVar2 == null ? null : qVar2.f8390r;
        this.f9625g = qVar;
        androidx.media3.common.l lVar2 = qVar.f8390r;
        androidx.media3.exoplayer.drm.c cVar = this.f9622d;
        if (cVar != null) {
            int iA = cVar.a(qVar);
            androidx.media3.common.q.b bVarA = qVar.a();
            bVarA.K = iA;
            qVarA = bVarA.a();
        } else {
            qVarA = qVar;
        }
        a0Var.f8667b = qVarA;
        a0Var.f8666a = this.f9626h;
        if (cVar == null) {
            return;
        }
        if (!z14) {
            int i14 = z.f70071a;
            if (Objects.equals(lVar, lVar2)) {
                return;
            }
        }
        DrmSession drmSession = this.f9626h;
        androidx.media3.exoplayer.drm.b.a aVar = this.f9623e;
        DrmSession drmSessionB = cVar.b(aVar, qVar);
        this.f9626h = drmSessionB;
        a0Var.f8666a = drmSessionB;
        if (drmSession != null) {
            drmSession.a(aVar);
        }
    }

    public final synchronized long u() {
        try {
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f9637s != this.f9634p ? this.f9628j[o(this.f9637s)] : this.C;
    }

    public final int v(a0 a0Var, DecoderInputBuffer decoderInputBuffer, int i14, boolean z14) {
        int i15;
        boolean z15 = (i14 & 2) != 0;
        b bVar = this.f9620b;
        synchronized (this) {
            try {
                decoderInputBuffer.f8632e = false;
                i15 = -3;
                if (this.f9637s != this.f9634p) {
                    androidx.media3.common.q qVar = this.f9621c.a(n()).f9648a;
                    if (z15 || qVar != this.f9625g) {
                        t(qVar, a0Var);
                        i15 = -5;
                    } else {
                        int iO = o(this.f9637s);
                        if (s(iO)) {
                            decoderInputBuffer.f92372a = this.f9631m[iO];
                            if (this.f9637s == this.f9634p - 1 && (z14 || this.f9641w)) {
                                decoderInputBuffer.a(536870912);
                            }
                            decoderInputBuffer.f8633f = this.f9632n[iO];
                            bVar.f9645a = this.f9630l[iO];
                            bVar.f9646b = this.f9629k[iO];
                            bVar.f9647c = this.f9633o[iO];
                            i15 = -4;
                        } else {
                            decoderInputBuffer.f8632e = true;
                        }
                    }
                } else if (z14 || this.f9641w) {
                    decoderInputBuffer.f92372a = 4;
                    decoderInputBuffer.f8633f = Long.MIN_VALUE;
                    i15 = -4;
                } else {
                    androidx.media3.common.q qVar2 = this.B;
                    if (qVar2 != null && (z15 || qVar2 != this.f9625g)) {
                        t(qVar2, a0Var);
                        i15 = -5;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (i15 == -4 && !decoderInputBuffer.b(4)) {
            boolean z16 = (i14 & 1) != 0;
            if ((i14 & 4) == 0) {
                q qVar3 = this.f9619a;
                b bVar2 = this.f9620b;
                if (z16) {
                    q.f(qVar3.f9612e, decoderInputBuffer, bVar2, qVar3.f9610c);
                } else {
                    qVar3.f9612e = q.f(qVar3.f9612e, decoderInputBuffer, bVar2, qVar3.f9610c);
                }
            }
            if (!z16) {
                this.f9637s++;
            }
        }
        return i15;
    }

    public final void w(boolean z14) {
        q qVar = this.f9619a;
        qVar.a(qVar.f9611d);
        q.a aVar = qVar.f9611d;
        int i14 = qVar.f9609b;
        fa.a.d(aVar.f9617c == null);
        aVar.f9615a = 0L;
        aVar.f9616b = i14;
        q.a aVar2 = qVar.f9611d;
        qVar.f9612e = aVar2;
        qVar.f9613f = aVar2;
        qVar.f9614g = 0L;
        ((xa.f) qVar.f9608a).b();
        this.f9634p = 0;
        this.f9635q = 0;
        this.f9636r = 0;
        this.f9637s = 0;
        this.f9642x = true;
        this.f9638t = Long.MIN_VALUE;
        this.f9639u = Long.MIN_VALUE;
        this.f9640v = Long.MIN_VALUE;
        this.f9641w = false;
        sa.p<c> pVar = this.f9621c;
        SparseArray<c> sparseArray = pVar.f158148b;
        for (int i15 = 0; i15 < sparseArray.size(); i15++) {
            pVar.f158149c.accept(sparseArray.valueAt(i15));
        }
        pVar.f158147a = -1;
        sparseArray.clear();
        if (z14) {
            this.A = null;
            this.B = null;
            this.f9643y = true;
            this.D = true;
        }
    }

    public final synchronized boolean x(int i14) {
        synchronized (this) {
            this.f9637s = 0;
            q qVar = this.f9619a;
            qVar.f9612e = qVar.f9611d;
        }
        int i15 = this.f9635q;
        if (i14 >= i15 && i14 <= this.f9634p + i15) {
            this.f9638t = Long.MIN_VALUE;
            this.f9637s = i14 - i15;
            return true;
        }
        return false;
    }

    public final synchronized boolean y(long j8, boolean z14) throws Throwable {
        Throwable th3;
        r rVar;
        long j14;
        int iK;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f9637s = 0;
                        q qVar = this.f9619a;
                        qVar.f9612e = qVar.f9611d;
                        int iO = o(0);
                        int i14 = this.f9637s;
                        int i15 = this.f9634p;
                        if (!(i14 != i15) || j8 < this.f9632n[iO] || (j8 > this.f9640v && !z14)) {
                            return false;
                        }
                        if (this.D) {
                            iK = i15 - i14;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= iK) {
                                    if (!z14) {
                                        iK = -1;
                                        break;
                                    }
                                    break;
                                }
                                try {
                                    if (this.f9632n[iO] >= j8) {
                                        iK = i16;
                                        break;
                                    }
                                    iO++;
                                    if (iO == this.f9627i) {
                                        iO = 0;
                                    }
                                    i16++;
                                } catch (Throwable th4) {
                                    th3 = th4;
                                }
                            }
                            rVar = this;
                            j14 = j8;
                        } else {
                            rVar = this;
                            j14 = j8;
                            iK = rVar.k(iO, i15 - i14, j14, true);
                        }
                        if (iK == -1) {
                            return false;
                        }
                        rVar.f9638t = j14;
                        rVar.f9637s += iK;
                        return true;
                    } catch (Throwable th5) {
                        th = th5;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th3 = th;
                }
                th3 = th;
                throw th3;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void z(int i14) {
        boolean z14;
        if (i14 >= 0) {
            try {
                if (this.f9637s + i14 <= this.f9634p) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } else {
            z14 = false;
        }
        fa.a.a(z14);
        this.f9637s += i14;
    }
}
