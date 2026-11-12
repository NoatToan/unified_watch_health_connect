package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class h6r implements il8 {
    public static final nl8 f = new nl8() { // from class: g6r
        @Override // defpackage.nl8
        public final il8[] c() {
            return h6r.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kl8 f19755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public snp f19756b;
    public b c;
    public int d = -1;
    public long e = -1;

    public static final class a implements b {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, SportReportBaseParser.ReportType.maxWaterTemperature, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, ErrorCode.BIND_CARD_APPLET_UPDATE, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kl8 f19757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final snp f19758b;
        public final i6r c;
        public final int d;
        public final byte[] e;
        public final okh f;
        public final int g;
        public final Format h;
        public int i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19759k;
        public long l;

        public a(kl8 kl8Var, snp snpVar, i6r i6rVar) throws ParserException {
            this.f19757a = kl8Var;
            this.f19758b = snpVar;
            this.c = i6rVar;
            int iMax = Math.max(1, i6rVar.c / 10);
            this.g = iMax;
            okh okhVar = new okh(i6rVar.g);
            okhVar.v();
            int iV = okhVar.v();
            this.d = iV;
            int i = i6rVar.f20842b;
            int i2 = (((i6rVar.e - (i * 4)) * 8) / (i6rVar.f * i)) + 1;
            if (iV == i2) {
                int iL = wlq.l(iMax, iV);
                this.e = new byte[i6rVar.e * iL];
                this.f = new okh(iL * h(iV, i));
                int i3 = ((i6rVar.c * i6rVar.e) * 8) / iV;
                this.h = new Format.b().e0("audio/raw").G(i3).Z(i3).W(h(iMax, i)).H(i6rVar.f20842b).f0(i6rVar.c).Y(2).E();
                return;
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(iV);
            throw new ParserException(sb.toString());
        }

        public static int h(int i, int i2) {
            return i * 2 * i2;
        }

        @Override // h6r.b
        public void a(int i, long j) {
            this.f19757a.k(new k6r(this.c, this.d, i, j));
            this.f19758b.b(this.h);
        }

        @Override // h6r.b
        public void b(long j) {
            this.i = 0;
            this.j = j;
            this.f19759k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // h6r.b
        public boolean c(defpackage.jl8 r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.g
                int r1 = r6.f19759k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.d
                int r0 = defpackage.wlq.l(r0, r1)
                i6r r1 = r6.c
                int r1 = r1.e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.e
                int r5 = r6.i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.i
                int r4 = r4 + r3
                r6.i = r4
                goto L1e
            L3e:
                int r7 = r6.i
                i6r r8 = r6.c
                int r8 = r8.e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.e
                okh r9 = r6.f
                r6.d(r8, r7, r9)
                int r8 = r6.i
                i6r r9 = r6.c
                int r9 = r9.e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.i = r8
                okh r7 = r6.f
                int r7 = r7.f()
                snp r8 = r6.f19758b
                okh r9 = r6.f
                r8.d(r9, r7)
                int r8 = r6.f19759k
                int r8 = r8 + r7
                r6.f19759k = r8
                int r7 = r6.f(r8)
                int r8 = r6.g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f19759k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h6r.a.c(jl8, long):boolean");
        }

        public final void d(byte[] bArr, int i, okh okhVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.c.f20842b; i3++) {
                    e(bArr, i2, i3, okhVar.d());
                }
            }
            int iG = g(this.d * i);
            okhVar.P(0);
            okhVar.O(iG);
        }

        public final void e(byte[] bArr, int i, int i2, byte[] bArr2) {
            i6r i6rVar = this.c;
            int i3 = i6rVar.e;
            int i4 = i6rVar.f20842b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iR = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = n[iMin];
            int i9 = ((i * this.d * i4) + i2) * 2;
            bArr2[i9] = (byte) (iR & 255);
            bArr2[i9 + 1] = (byte) (iR >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                byte b2 = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b2 & 15 : (b2 & 255) >> 4;
                int i12 = ((((i11 & 7) * 2) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iR = wlq.r(iR + i12, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iR & 255);
                bArr2[i9 + 1] = (byte) (iR >> 8);
                int i13 = iMin + m[i11];
                int[] iArr = n;
                iMin = wlq.r(i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        public final int f(int i) {
            return i / (this.c.f20842b * 2);
        }

        public final int g(int i) {
            return h(i, this.c.f20842b);
        }

        public final void i(int i) {
            long jH0 = this.j + wlq.H0(this.l, FolmeCore.NANOS_TO_MS, this.c.c);
            int iG = g(i);
            this.f19758b.e(jH0, 1, iG, this.f19759k - iG, null);
            this.l += (long) i;
            this.f19759k -= iG;
        }
    }

    public interface b {
        void a(int i, long j) throws ParserException;

        void b(long j);

        boolean c(jl8 jl8Var, long j) throws IOException;
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kl8 f19760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final snp f19761b;
        public final i6r c;
        public final Format d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(kl8 kl8Var, snp snpVar, i6r i6rVar, String str, int i) throws ParserException {
            this.f19760a = kl8Var;
            this.f19761b = snpVar;
            this.c = i6rVar;
            int i2 = (i6rVar.f20842b * i6rVar.f) / 8;
            if (i6rVar.e == i2) {
                int i3 = i6rVar.c;
                int i4 = i3 * i2 * 8;
                int iMax = Math.max(i2, (i3 * i2) / 10);
                this.e = iMax;
                this.d = new Format.b().e0(str).G(i4).Z(i4).W(iMax).H(i6rVar.f20842b).f0(i6rVar.c).Y(i).E();
                return;
            }
            int i5 = i6rVar.e;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(i5);
            throw new ParserException(sb.toString());
        }

        @Override // h6r.b
        public void a(int i, long j) {
            this.f19760a.k(new k6r(this.c, 1, i, j));
            this.f19761b.b(this.d);
        }

        @Override // h6r.b
        public void b(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        @Override // h6r.b
        public boolean c(jl8 jl8Var, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int iC = this.f19761b.c(jl8Var, (int) Math.min(i2 - i, j2), true);
                if (iC == -1) {
                    j2 = 0;
                } else {
                    this.g += iC;
                    j2 -= (long) iC;
                }
            }
            i6r i6rVar = this.c;
            int i3 = i6rVar.e;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long jH0 = this.f + wlq.H0(this.h, FolmeCore.NANOS_TO_MS, i6rVar.c);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.f19761b.e(jH0, 1, i5, i6, null);
                this.h += (long) i4;
                this.g = i6;
            }
            return j2 <= 0;
        }
    }

    private void d() {
        rk1.i(this.f19756b);
        wlq.j(this.f19755a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] e() {
        return new il8[]{new h6r()};
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.b(j2);
        }
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.f19755a = kl8Var;
        this.f19756b = kl8Var.d(0, 1);
        kl8Var.m();
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        d();
        if (this.c == null) {
            i6r i6rVarA = j6r.a(jl8Var);
            if (i6rVarA == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
            int i = i6rVarA.f20841a;
            if (i == 17) {
                this.c = new a(this.f19755a, this.f19756b, i6rVarA);
            } else if (i == 6) {
                this.c = new c(this.f19755a, this.f19756b, i6rVarA, "audio/g711-alaw", -1);
            } else if (i == 7) {
                this.c = new c(this.f19755a, this.f19756b, i6rVarA, "audio/g711-mlaw", -1);
            } else {
                int iA = l6r.a(i, i6rVarA.f);
                if (iA == 0) {
                    int i2 = i6rVarA.f20841a;
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(i2);
                    throw new ParserException(sb.toString());
                }
                this.c = new c(this.f19755a, this.f19756b, i6rVarA, "audio/raw", iA);
            }
        }
        if (this.d == -1) {
            Pair<Long, Long> pairB = j6r.b(jl8Var);
            this.d = ((Long) pairB.first).intValue();
            long jLongValue = ((Long) pairB.second).longValue();
            this.e = jLongValue;
            this.c.a(this.d, jLongValue);
        } else if (jl8Var.getPosition() == 0) {
            jl8Var.p(this.d);
        }
        rk1.g(this.e != -1);
        return this.c.c(jl8Var, this.e - jl8Var.getPosition()) ? -1 : 0;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        return j6r.a(jl8Var) != null;
    }

    @Override // defpackage.il8
    public void release() {
    }
}
