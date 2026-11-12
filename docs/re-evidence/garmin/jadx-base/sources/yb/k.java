package yb;

import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.common.x;
import bb.b0;
import bb.f0;
import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.common.primitives.Ints;
import fa.r;
import fa.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class k implements bb.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f195646a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f195648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f195649d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f195652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f195653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f195654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f195655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f195656k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb.b f195647b = new yb.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f195651f = z.f70076f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f195650e = new r();

    public static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f195657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f195658b;

        private b(long j8, byte[] bArr) {
            this.f195657a = j8;
            this.f195658b = bArr;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            return Long.compare(this.f195657a, bVar.f195657a);
        }
    }

    public k(n nVar, q qVar) {
        this.f195646a = nVar;
        q.b bVarA = qVar.a();
        bVarA.f8411m = x.n("application/x-media3-cues");
        bVarA.f8408j = qVar.f8386n;
        bVarA.H = nVar.a();
        this.f195648c = bVarA.a();
        this.f195649d = new ArrayList();
        this.f195654i = 0;
        this.f195655j = z.f70077g;
        this.f195656k = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: RuntimeException -> 0x008b, TryCatch #0 {RuntimeException -> 0x008b, blocks: (B:33:0x007e, B:35:0x0084, B:40:0x0090, B:41:0x00b2, B:43:0x00b8, B:44:0x00c7, B:39:0x008d), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008d A[Catch: RuntimeException -> 0x008b, TryCatch #0 {RuntimeException -> 0x008b, blocks: (B:33:0x007e, B:35:0x0084, B:40:0x0090, B:41:0x00b2, B:43:0x00b8, B:44:0x00c7, B:39:0x008d), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8 A[Catch: RuntimeException -> 0x008b, LOOP:1: B:41:0x00b2->B:43:0x00b8, LOOP_END, TryCatch #0 {RuntimeException -> 0x008b, blocks: (B:33:0x007e, B:35:0x0084, B:40:0x0090, B:41:0x00b2, B:43:0x00b8, B:44:0x00c7, B:39:0x008d), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
      0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // bb.n
    public final int b(bb.o oVar, f0 f0Var) throws ParserException {
        int i14;
        long j8;
        n.b bVarA;
        int i15;
        int i16 = this.f195654i;
        fa.a.d((i16 == 0 || i16 == 5) ? false : true);
        if (this.f195654i == 1) {
            int iCheckedCast = oVar.getLength() != -1 ? Ints.checkedCast(oVar.getLength()) : 1024;
            if (iCheckedCast > this.f195651f.length) {
                this.f195651f = new byte[iCheckedCast];
            }
            this.f195653h = 0;
            this.f195654i = 2;
        }
        int i17 = this.f195654i;
        ArrayList arrayList = this.f195649d;
        if (i17 == 2) {
            byte[] bArr = this.f195651f;
            if (bArr.length == this.f195653h) {
                this.f195651f = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f195651f;
            int i18 = this.f195653h;
            int i19 = oVar.read(bArr2, i18, bArr2.length - i18);
            if (i19 != -1) {
                this.f195653h += i19;
            }
            long length = oVar.getLength();
            if (length != -1) {
                i14 = 0;
                if (this.f195653h == length) {
                    try {
                        j8 = this.f195656k;
                        if (j8 != C.TIME_UNSET) {
                            bVarA = n.b.a(j8);
                        } else {
                            bVarA = n.b.f195663c;
                        }
                        this.f195646a.c(this.f195651f, 0, this.f195653h, bVarA, new xw.b(this, 2));
                        Collections.sort(arrayList);
                        this.f195655j = new long[arrayList.size()];
                        for (i15 = i14; i15 < arrayList.size(); i15++) {
                            this.f195655j[i15] = ((b) arrayList.get(i15)).f195657a;
                        }
                        this.f195651f = z.f70076f;
                        this.f195654i = 4;
                    } catch (RuntimeException e4) {
                        throw ParserException.createForMalformedContainer("SubtitleParser failed.", e4);
                    }
                }
            } else {
                i14 = 0;
            }
            if (i19 == -1) {
                j8 = this.f195656k;
                if (j8 != C.TIME_UNSET) {
                    bVarA = n.b.a(j8);
                } else {
                    bVarA = n.b.f195663c;
                }
                this.f195646a.c(this.f195651f, 0, this.f195653h, bVarA, new xw.b(this, 2));
                Collections.sort(arrayList);
                this.f195655j = new long[arrayList.size()];
                while (i15 < arrayList.size()) {
                    this.f195655j[i15] = ((b) arrayList.get(i15)).f195657a;
                }
                this.f195651f = z.f70076f;
                this.f195654i = 4;
            }
        } else {
            i14 = 0;
        }
        if (this.f195654i == 3) {
            if (oVar.skip(oVar.getLength() != -1 ? Ints.checkedCast(oVar.getLength()) : 1024) == -1) {
                long j14 = this.f195656k;
                for (int iE = j14 == C.TIME_UNSET ? i14 : z.e(this.f195655j, j14, true); iE < arrayList.size(); iE++) {
                    f((b) arrayList.get(iE));
                }
                this.f195654i = 4;
            }
        }
        if (this.f195654i == 4) {
            return -1;
        }
        return i14;
    }

    @Override // bb.n
    public final void c(bb.p pVar) {
        fa.a.d(this.f195654i == 0);
        l0 l0VarTrack = pVar.track(0, 3);
        this.f195652g = l0VarTrack;
        l0VarTrack.d(this.f195648c);
        pVar.endTracks();
        pVar.a(new b0(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        this.f195654i = 1;
    }

    @Override // bb.n
    public final boolean d(bb.o oVar) {
        return true;
    }

    public final void f(b bVar) {
        fa.a.f(this.f195652g);
        byte[] bArr = bVar.f195658b;
        int length = bArr.length;
        r rVar = this.f195650e;
        rVar.getClass();
        rVar.E(bArr, bArr.length);
        this.f195652g.f(length, rVar);
        this.f195652g.c(bVar.f195657a, 1, length, 0, null);
    }

    @Override // bb.n
    public final void release() {
        if (this.f195654i == 5) {
            return;
        }
        this.f195646a.reset();
        this.f195654i = 5;
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        int i14 = this.f195654i;
        fa.a.d((i14 == 0 || i14 == 5) ? false : true);
        this.f195656k = j14;
        if (this.f195654i == 2) {
            this.f195654i = 1;
        }
        if (this.f195654i == 4) {
            this.f195654i = 3;
        }
    }
}
