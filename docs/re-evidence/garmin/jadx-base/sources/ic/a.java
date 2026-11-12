package ic;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.common.x;
import bb.f0;
import bb.l0;
import bb.n;
import bb.o;
import bb.p;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import fa.k;
import fa.r;
import fa.z;
import i3.e5;
import java.math.RoundingMode;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f92519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f92520b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f92523e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92521c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f92522d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f92524f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f92525g = -1;

    /* JADX INFO: renamed from: ic.a$a, reason: collision with other inner class name */
    public static final class C1769a implements b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int[] f92526m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int[] f92527n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f92528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l0 f92529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ic.b f92530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f92531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f92532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final r f92533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f92534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final q f92535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f92536i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f92537j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f92538k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f92539l;

        public C1769a(p pVar, l0 l0Var, ic.b bVar) throws ParserException {
            this.f92528a = pVar;
            this.f92529b = l0Var;
            this.f92530c = bVar;
            int i14 = bVar.f92550c;
            int i15 = bVar.f92550c;
            int iMax = Math.max(1, i14 / 10);
            this.f92534g = iMax;
            r rVar = new r(bVar.f92553f);
            rVar.n();
            int iN = rVar.n();
            this.f92531d = iN;
            int i16 = bVar.f92549b;
            int i17 = bVar.f92551d;
            int i18 = (((i17 - (i16 * 4)) * 8) / (bVar.f92552e * i16)) + 1;
            if (iN != i18) {
                throw ParserException.createForMalformedContainer("Expected frames per block: " + i18 + "; got: " + iN, null);
            }
            int iF = z.f(iMax, iN);
            this.f92532e = new byte[iF * i17];
            this.f92533f = new r(iN * 2 * i16 * iF);
            int i19 = ((i17 * i15) * 8) / iN;
            q.b bVar2 = new q.b();
            bVar2.f8411m = x.n(MimeTypes.AUDIO_RAW);
            bVar2.f8406h = i19;
            bVar2.f8407i = i19;
            bVar2.f8412n = iMax * 2 * i16;
            bVar2.B = i16;
            bVar2.C = i15;
            bVar2.D = 2;
            this.f92535h = bVar2.a();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0056  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:37:0x014f  */
        /* JADX WARN: Code duplicated, block: B:38:0x0153  */
        /* JADX WARN: Code duplicated, block: B:44:0x0047 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x011f A[EDGE_INSN: B:48:0x011f->B:35:0x011f BREAK  A[LOOP:1: B:17:0x004d->B:34:0x0110], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x00d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:4:0x0022). Please report as a decompilation issue!!! */
        @Override // ic.a.b
        public final boolean a(o oVar, long j8) {
            byte[] bArr;
            int i14;
            int i15;
            int i16;
            r rVar;
            int i17;
            int i18;
            int i19;
            byte[] bArr2;
            int i24;
            int i25;
            int i26;
            int i27;
            int iMin;
            int[] iArr;
            int i28;
            int i29;
            int i30;
            byte b14;
            int i34;
            int i35;
            int i36;
            int iC;
            int i37;
            int i38;
            int i39 = this.f92538k;
            ic.b bVar = this.f92530c;
            int i44 = 2;
            int i45 = i39 / (bVar.f92549b * 2);
            int i46 = this.f92534g;
            int i47 = this.f92531d;
            int iF = z.f(i46 - i45, i47);
            int i48 = bVar.f92551d;
            int i49 = bVar.f92551d;
            int i54 = iF * i48;
            boolean z14 = j8 == 0;
            while (true) {
                bArr = this.f92532e;
                if (z14 && (i37 = this.f92536i) < i54) {
                    i38 = oVar.read(bArr, this.f92536i, (int) Math.min(i54 - i37, j8));
                    if (i38 == -1) {
                        break;
                    }
                    this.f92536i += i38;
                    bArr = this.f92532e;
                    if (z14) {
                    }
                }
                i14 = this.f92536i / i49;
                if (i14 > 0) {
                    i16 = 0;
                    while (true) {
                        rVar = this.f92533f;
                        if (i16 < i14) {
                            break;
                        }
                        i18 = 0;
                        while (true) {
                            i19 = bVar.f92549b;
                            if (i18 < i19) {
                                bArr2 = rVar.f70054a;
                                int i55 = (i18 * 4) + (i16 * i49);
                                i24 = (i19 * 4) + i55;
                                i25 = (i49 / i19) - 4;
                                i26 = i44;
                                i27 = (short) ((bArr[i55] & UnsignedBytes.MAX_VALUE) | ((bArr[i55 + 1] & UnsignedBytes.MAX_VALUE) << 8));
                                iMin = Math.min(bArr[i55 + 2] & UnsignedBytes.MAX_VALUE, 88);
                                iArr = f92527n;
                                int i56 = iArr[iMin];
                                i28 = ((i16 * i47 * i19) + i18) * 2;
                                bArr2[i28] = (byte) (i27 & 255);
                                int i57 = i14;
                                bArr2[i28 + 1] = (byte) (i27 >> 8);
                                i29 = i56;
                                i30 = 0;
                                int i58 = i16;
                                while (i30 < i25 * 2) {
                                    b14 = bArr[((i30 / 8) * i19 * 4) + i24 + ((i30 / 2) % 4)];
                                    int i59 = i27;
                                    i34 = b14 & UnsignedBytes.MAX_VALUE;
                                    if (i30 % 2 == 0) {
                                        i35 = b14 & Ascii.SI;
                                    } else {
                                        i35 = i34 >> 4;
                                    }
                                    i36 = i35;
                                    int i64 = i47;
                                    iC = e5.c(i35 & 7, i26, 1, i29) >> 3;
                                    if ((i36 & 8) != 0) {
                                        iC = -iC;
                                    }
                                    i27 = z.i(i59 + iC, -32768, 32767);
                                    i28 = (i19 * 2) + i28;
                                    bArr2[i28] = (byte) (i27 & 255);
                                    bArr2[i28 + 1] = (byte) (i27 >> 8);
                                    iMin = z.i(iMin + f92526m[i36], 0, 88);
                                    i29 = iArr[iMin];
                                    i30++;
                                    i47 = i64;
                                    i26 = 2;
                                }
                                i18++;
                                i14 = i57;
                                i16 = i58;
                                i44 = 2;
                            }
                        }
                        i16++;
                        i44 = 2;
                        i14 = i14;
                    }
                    int i65 = i14;
                    int i66 = i47 * i65 * 2 * bVar.f92549b;
                    rVar.G(0);
                    rVar.F(i66);
                    this.f92536i -= i65 * i49;
                    int i67 = rVar.f70056c;
                    this.f92529b.f(i67, rVar);
                    i17 = this.f92538k + i67;
                    this.f92538k = i17;
                    if (i17 / (bVar.f92549b * 2) >= i46) {
                        b(i46);
                    }
                }
                if (z14 && (i15 = this.f92538k / (bVar.f92549b * 2)) > 0) {
                    b(i15);
                }
                return z14;
            }
            while (true) {
                bArr = this.f92532e;
                if (z14) {
                }
                i14 = this.f92536i / i49;
                if (i14 > 0) {
                    i16 = 0;
                    while (true) {
                        rVar = this.f92533f;
                        if (i16 < i14) {
                            break;
                            break;
                        }
                        i18 = 0;
                        while (true) {
                            i19 = bVar.f92549b;
                            if (i18 < i19) {
                                bArr2 = rVar.f70054a;
                                int i510 = (i18 * 4) + (i16 * i49);
                                i24 = (i19 * 4) + i510;
                                i25 = (i49 / i19) - 4;
                                i26 = i44;
                                i27 = (short) ((bArr[i510] & UnsignedBytes.MAX_VALUE) | ((bArr[i510 + 1] & UnsignedBytes.MAX_VALUE) << 8));
                                iMin = Math.min(bArr[i510 + 2] & UnsignedBytes.MAX_VALUE, 88);
                                iArr = f92527n;
                                int i511 = iArr[iMin];
                                i28 = ((i16 * i47 * i19) + i18) * 2;
                                bArr2[i28] = (byte) (i27 & 255);
                                int i512 = i14;
                                bArr2[i28 + 1] = (byte) (i27 >> 8);
                                i29 = i511;
                                i30 = 0;
                                int i513 = i16;
                                while (i30 < i25 * 2) {
                                    b14 = bArr[((i30 / 8) * i19 * 4) + i24 + ((i30 / 2) % 4)];
                                    int i514 = i27;
                                    i34 = b14 & UnsignedBytes.MAX_VALUE;
                                    if (i30 % 2 == 0) {
                                        i35 = b14 & Ascii.SI;
                                    } else {
                                        i35 = i34 >> 4;
                                    }
                                    i36 = i35;
                                    int i68 = i47;
                                    iC = e5.c(i35 & 7, i26, 1, i29) >> 3;
                                    if ((i36 & 8) != 0) {
                                        iC = -iC;
                                    }
                                    i27 = z.i(i514 + iC, -32768, 32767);
                                    i28 = (i19 * 2) + i28;
                                    bArr2[i28] = (byte) (i27 & 255);
                                    bArr2[i28 + 1] = (byte) (i27 >> 8);
                                    iMin = z.i(iMin + f92526m[i36], 0, 88);
                                    i29 = iArr[iMin];
                                    i30++;
                                    i47 = i68;
                                    i26 = 2;
                                }
                                i18++;
                                i14 = i512;
                                i16 = i513;
                                i44 = 2;
                            }
                        }
                        i16++;
                        i44 = 2;
                        i14 = i14;
                    }
                    int i69 = i14;
                    int i610 = i47 * i69 * 2 * bVar.f92549b;
                    rVar.G(0);
                    rVar.F(i610);
                    this.f92536i -= i69 * i49;
                    int i611 = rVar.f70056c;
                    this.f92529b.f(i611, rVar);
                    i17 = this.f92538k + i611;
                    this.f92538k = i17;
                    if (i17 / (bVar.f92549b * 2) >= i46) {
                        b(i46);
                    }
                }
                if (z14) {
                    b(i15);
                }
                return z14;
                this.f92536i += i38;
            }
        }

        public final void b(int i14) {
            long j8 = this.f92537j;
            long j14 = this.f92539l;
            ic.b bVar = this.f92530c;
            long j15 = bVar.f92550c;
            int i15 = z.f70071a;
            long jU = j8 + z.U(j14, 1000000L, j15, RoundingMode.DOWN);
            int i16 = i14 * 2 * bVar.f92549b;
            this.f92529b.c(jU, 1, i16, this.f92538k - i16, null);
            this.f92539l += (long) i14;
            this.f92538k -= i16;
        }

        @Override // ic.a.b
        public final void init(int i14, long j8) {
            this.f92528a.a(new d(this.f92530c, this.f92531d, i14, j8));
            this.f92529b.d(this.f92535h);
        }

        @Override // ic.a.b
        public final void reset(long j8) {
            this.f92536i = 0;
            this.f92537j = j8;
            this.f92538k = 0;
            this.f92539l = 0L;
        }
    }

    public interface b {
        boolean a(o oVar, long j8);

        void init(int i14, long j8);

        void reset(long j8);
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f92540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l0 f92541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ic.b f92542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q f92543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f92544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f92545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f92546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f92547h;

        public c(p pVar, l0 l0Var, ic.b bVar, String str, int i14) throws ParserException {
            this.f92540a = pVar;
            this.f92541b = l0Var;
            this.f92542c = bVar;
            int i15 = bVar.f92549b;
            int i16 = bVar.f92550c;
            int i17 = (i15 * bVar.f92552e) / 8;
            int i18 = bVar.f92551d;
            if (i18 != i17) {
                throw ParserException.createForMalformedContainer("Expected block size: " + i17 + "; got: " + i18, null);
            }
            int i19 = i16 * i17 * 8;
            int iMax = Math.max(i17, (i16 * i17) / 10);
            this.f92544e = iMax;
            q.b bVar2 = new q.b();
            bVar2.f8411m = x.n(str);
            bVar2.f8406h = i19;
            bVar2.f8407i = i19;
            bVar2.f8412n = iMax;
            bVar2.B = bVar.f92549b;
            bVar2.C = i16;
            bVar2.D = i14;
            this.f92543d = bVar2.a();
        }

        @Override // ic.a.b
        public final boolean a(o oVar, long j8) {
            int i14;
            int i15;
            long j14 = j8;
            while (j14 > 0 && (i14 = this.f92546g) < (i15 = this.f92544e)) {
                int iB = this.f92541b.b(oVar, (int) Math.min(i15 - i14, j14), true);
                if (iB == -1) {
                    j14 = 0;
                } else {
                    this.f92546g += iB;
                    j14 -= (long) iB;
                }
            }
            ic.b bVar = this.f92542c;
            int i16 = bVar.f92551d;
            int i17 = this.f92546g / i16;
            if (i17 > 0) {
                long j15 = this.f92545f;
                long j16 = this.f92547h;
                long j17 = bVar.f92550c;
                int i18 = z.f70071a;
                long jU = j15 + z.U(j16, 1000000L, j17, RoundingMode.DOWN);
                int i19 = i17 * i16;
                int i24 = this.f92546g - i19;
                this.f92541b.c(jU, 1, i19, i24, null);
                this.f92547h += (long) i17;
                this.f92546g = i24;
            }
            return j14 <= 0;
        }

        @Override // ic.a.b
        public final void init(int i14, long j8) {
            this.f92540a.a(new d(this.f92542c, 1, i14, j8));
            this.f92541b.d(this.f92543d);
        }

        @Override // ic.a.b
        public final void reset(long j8) {
            this.f92545f = j8;
            this.f92546g = 0;
            this.f92547h = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0189  */
    @Override // bb.n
    public final int b(o oVar, f0 f0Var) throws ParserException {
        byte[] bArr;
        int i14;
        fa.a.f(this.f92520b);
        int i15 = z.f70071a;
        int i16 = this.f92521c;
        int iX = 4;
        if (i16 == 0) {
            fa.a.d(oVar.getPosition() == 0);
            int i17 = this.f92524f;
            if (i17 != -1) {
                oVar.skipFully(i17);
                this.f92521c = 4;
                return 0;
            }
            if (!ic.c.a(oVar)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            oVar.skipFully((int) (oVar.getPeekPosition() - oVar.getPosition()));
            this.f92521c = 1;
            return 0;
        }
        long j8 = -1;
        if (i16 == 1) {
            r rVar = new r(8);
            ic.c.a aVarA = ic.c.a.a(oVar, rVar);
            if (aVarA.f92554a != 1685272116) {
                oVar.resetPeekPosition();
            } else {
                oVar.advancePeekPosition(8);
                rVar.G(0);
                oVar.peekFully(rVar.f70054a, 0, 8);
                j8 = rVar.j();
                oVar.skipFully(((int) aVarA.f92555b) + 8);
            }
            this.f92522d = j8;
            this.f92521c = 2;
            return 0;
        }
        if (i16 != 2) {
            if (i16 != 3) {
                if (i16 != 4) {
                    j20.x.h();
                    return 0;
                }
                fa.a.d(this.f92525g != -1);
                long position = this.f92525g - oVar.getPosition();
                b bVar = this.f92523e;
                bVar.getClass();
                return bVar.a(oVar, position) ? -1 : 0;
            }
            oVar.resetPeekPosition();
            ic.c.a aVarB = ic.c.b(1684108385, oVar, new r(8));
            oVar.skipFully(8);
            Pair pairCreate = Pair.create(Long.valueOf(oVar.getPosition()), Long.valueOf(aVarB.f92555b));
            this.f92524f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j14 = this.f92522d;
            if (j14 != -1 && jLongValue == 4294967295L) {
                jLongValue = j14;
            }
            this.f92525g = ((long) this.f92524f) + jLongValue;
            long length = oVar.getLength();
            if (length != -1 && this.f92525g > length) {
                k.g("Data exceeds input length: " + this.f92525g + ", " + length);
                this.f92525g = length;
            }
            b bVar2 = this.f92523e;
            bVar2.getClass();
            bVar2.init(this.f92524f, this.f92525g);
            this.f92521c = 4;
            return 0;
        }
        r rVar2 = new r(16);
        long j15 = ic.c.b(WavUtil.FMT_FOURCC, oVar, rVar2).f92555b;
        fa.a.d(j15 >= 16);
        oVar.peekFully(rVar2.f70054a, 0, 16);
        rVar2.G(0);
        int iN = rVar2.n();
        int iN2 = rVar2.n();
        int iM = rVar2.m();
        int iM2 = rVar2.m();
        int iN3 = rVar2.n();
        int iN4 = rVar2.n();
        int i18 = ((int) j15) - 16;
        if (i18 > 0) {
            bArr = new byte[i18];
            oVar.peekFully(bArr, 0, i18);
        } else {
            bArr = z.f70076f;
        }
        byte[] bArr2 = bArr;
        oVar.skipFully((int) (oVar.getPeekPosition() - oVar.getPosition()));
        ic.b bVar3 = new ic.b(iN, iN2, iM, iM2, iN3, iN4, bArr2);
        int i19 = bVar3.f92548a;
        if (i19 == 17) {
            this.f92523e = new C1769a(this.f92519a, this.f92520b, bVar3);
        } else if (i19 == 6) {
            this.f92523e = new c(this.f92519a, this.f92520b, bVar3, MimeTypes.AUDIO_ALAW, -1);
        } else if (i19 == 7) {
            this.f92523e = new c(this.f92519a, this.f92520b, bVar3, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int i24 = bVar3.f92552e;
            if (i19 == 1) {
                iX = z.x(i24);
                i14 = iX;
            } else {
                if (i19 != 3) {
                    if (i19 == 65534) {
                        iX = z.x(i24);
                        i14 = iX;
                    }
                } else if (i24 == 32) {
                    i14 = iX;
                }
                i14 = 0;
            }
            if (i14 == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + i19);
            }
            this.f92523e = new c(this.f92519a, this.f92520b, bVar3, MimeTypes.AUDIO_RAW, i14);
        }
        this.f92521c = 3;
        return 0;
    }

    @Override // bb.n
    public final void c(p pVar) {
        this.f92519a = pVar;
        this.f92520b = pVar.track(0, 1);
        pVar.endTracks();
    }

    @Override // bb.n
    public final boolean d(o oVar) {
        return ic.c.a(oVar);
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f92521c = j8 == 0 ? 0 : 4;
        b bVar = this.f92523e;
        if (bVar != null) {
            bVar.reset(j14);
        }
    }
}
