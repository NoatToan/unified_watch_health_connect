package cb;

import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.common.x;
import bb.b0;
import bb.f0;
import bb.g0;
import bb.h;
import bb.k;
import bb.l0;
import bb.n;
import bb.o;
import bb.p;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import fa.l;
import fa.z;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f26615s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f26616t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f26617u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f26618v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f26619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f26621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f26626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f26629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f26630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l0 f26631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l0 f26632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g0 f26633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f26635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26636r;

    static {
        int i14 = z.f70071a;
        Charset charset = StandardCharsets.UTF_8;
        f26617u = "#!AMR\n".getBytes(charset);
        f26618v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i14) {
        this.f26620b = (i14 & 2) != 0 ? i14 | 1 : i14;
        this.f26619a = new byte[1];
        this.f26627i = -1;
        k kVar = new k();
        this.f26621c = kVar;
        this.f26632n = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[PHI: r10
      0x00d1: PHI (r10v1 bb.o) = (r10v0 bb.o), (r10v4 bb.o) binds: [B:45:0x00cf, B:48:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    @Override // bb.n
    public final int b(o oVar, f0 f0Var) throws ParserException {
        o oVar2;
        int i14;
        int i15;
        int iB;
        int i16;
        fa.a.f(this.f26631m);
        int i17 = z.f70071a;
        if (oVar.getPosition() == 0 && !g(oVar)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        if (!this.f26636r) {
            this.f26636r = true;
            boolean z14 = this.f26622d;
            String str = z14 ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB;
            int i18 = z14 ? AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND : 8000;
            int i19 = z14 ? f26616t[8] : f26615s[7];
            l0 l0Var = this.f26632n;
            q.b bVar = new q.b();
            bVar.f8411m = x.n(str);
            bVar.f8412n = i19;
            bVar.B = 1;
            bVar.C = i18;
            l0Var.d(bVar.a());
        }
        if (this.f26625g == 0) {
            try {
                int iF = f(oVar);
                this.f26624f = iF;
                this.f26625g = iF;
                if (this.f26627i == -1) {
                    this.f26626h = oVar.getPosition();
                    this.f26627i = this.f26624f;
                }
                if (this.f26627i == this.f26624f) {
                    this.f26628j++;
                }
                g0 g0Var = this.f26633o;
                if (g0Var instanceof b0) {
                    b0 b0Var = (b0) g0Var;
                    long j8 = this.f26629k + this.f26623e + 20000;
                    long position = oVar.getPosition() + ((long) this.f26624f);
                    l lVar = b0Var.f17105b;
                    int i24 = lVar.f70034a;
                    if (i24 == 0 || j8 - lVar.c(i24 - 1) >= 100000) {
                        b0Var.a(j8, position);
                    }
                    if (this.f26634p && Math.abs(this.f26635q - j8) < 20000) {
                        this.f26634p = false;
                        this.f26632n = this.f26631m;
                    }
                }
                oVar2 = oVar;
                iB = this.f26632n.b(oVar2, this.f26625g, true);
                if (iB == -1) {
                    i14 = -1;
                } else {
                    i16 = this.f26625g - iB;
                    this.f26625g = i16;
                    if (i16 <= 0) {
                        this.f26632n.c(this.f26629k + this.f26623e, 1, this.f26624f, 0, null);
                        this.f26623e += 20000;
                    }
                    i14 = 0;
                }
            } catch (EOFException unused) {
                oVar2 = oVar;
            }
        } else {
            oVar2 = oVar;
            iB = this.f26632n.b(oVar2, this.f26625g, true);
            if (iB == -1) {
                i14 = -1;
            } else {
                i16 = this.f26625g - iB;
                this.f26625g = i16;
                if (i16 <= 0) {
                    this.f26632n.c(this.f26629k + this.f26623e, 1, this.f26624f, 0, null);
                    this.f26623e += 20000;
                }
                i14 = 0;
            }
        }
        long length = oVar2.getLength();
        if (this.f26633o == null) {
            int i25 = this.f26620b;
            if ((i25 & 4) != 0) {
                this.f26633o = new b0(new long[]{this.f26626h}, new long[]{0}, C.TIME_UNSET);
            } else if ((i25 & 1) == 0 || !((i15 = this.f26627i) == -1 || i15 == this.f26624f)) {
                this.f26633o = new g0.b(C.TIME_UNSET);
            } else if (this.f26628j >= 20 || i14 == -1) {
                this.f26633o = new h(length, this.f26626h, (int) ((((long) i15) * 8000000) / 20000), i15, (i25 & 2) != 0);
            }
            g0 g0Var2 = this.f26633o;
            if (g0Var2 != null) {
                this.f26630l.a(g0Var2);
            }
        }
        if (i14 == -1) {
            g0 g0Var3 = this.f26633o;
            if (g0Var3 instanceof b0) {
                ((b0) g0Var3).f17106c = this.f26629k + this.f26623e;
                this.f26630l.a(g0Var3);
            }
        }
        return i14;
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f26630l = pVar;
        l0 l0VarTrack = pVar.track(0, 1);
        this.f26631m = l0VarTrack;
        this.f26632n = l0VarTrack;
        pVar.endTracks();
    }

    @Override // bb.n
    public final boolean d(o oVar) {
        return g(oVar);
    }

    public final int f(o oVar) throws ParserException {
        boolean z14;
        oVar.resetPeekPosition();
        byte[] bArr = this.f26619a;
        oVar.peekFully(bArr, 0, 1);
        byte b14 = bArr[0];
        if ((b14 & 131) > 0) {
            throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b14), null);
        }
        int i14 = (b14 >> 3) & 15;
        if (i14 >= 0 && i14 <= 15 && (((z14 = this.f26622d) && (i14 < 10 || i14 > 13)) || (!z14 && (i14 < 12 || i14 > 14)))) {
            return z14 ? f26616t[i14] : f26615s[i14];
        }
        StringBuilder sb3 = new StringBuilder("Illegal AMR ");
        sb3.append(this.f26622d ? "WB" : "NB");
        sb3.append(" frame type ");
        sb3.append(i14);
        throw ParserException.createForMalformedContainer(sb3.toString(), null);
    }

    public final boolean g(o oVar) {
        oVar.resetPeekPosition();
        byte[] bArr = f26617u;
        byte[] bArr2 = new byte[bArr.length];
        oVar.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f26622d = false;
            oVar.skipFully(bArr.length);
            return true;
        }
        oVar.resetPeekPosition();
        byte[] bArr3 = f26618v;
        byte[] bArr4 = new byte[bArr3.length];
        oVar.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f26622d = true;
        oVar.skipFully(bArr3.length);
        return true;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f26623e = 0L;
        this.f26624f = 0;
        this.f26625g = 0;
        this.f26635q = j14;
        g0 g0Var = this.f26633o;
        if (!(g0Var instanceof b0)) {
            if (j8 == 0 || !(g0Var instanceof h)) {
                this.f26629k = 0L;
                return;
            } else {
                h hVar = (h) g0Var;
                this.f26629k = (Math.max(0L, j8 - hVar.f17179b) * 8000000) / ((long) hVar.f17182e);
                return;
            }
        }
        b0 b0Var = (b0) g0Var;
        l lVar = b0Var.f17105b;
        long jC = lVar.f70034a == 0 ? C.TIME_UNSET : lVar.c(z.b(b0Var.f17104a, j8));
        this.f26629k = jC;
        if (Math.abs(this.f26635q - jC) < 20000) {
            return;
        }
        this.f26634p = true;
        this.f26632n = this.f26621c;
    }

    public a() {
        this(0);
    }
}
