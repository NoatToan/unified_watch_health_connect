package hc;

import androidx.media3.common.ParserException;
import bb.l0;
import com.garmin.device.ble.BleCommunicationException;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.r f82936a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f82941f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f82943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f82945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.media3.common.q f82946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f82947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f82948m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82942g = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f82951p = C.TIME_UNSET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f82937b = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f82949n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f82950o = -1;

    public h(String str, int i14, int i15) {
        this.f82936a = new fa.r(new byte[i15]);
        this.f82938c = str;
        this.f82939d = i14;
    }

    public final boolean a(fa.r rVar, byte[] bArr, int i14) {
        int iMin = Math.min(rVar.a(), i14 - this.f82943h);
        rVar.e(bArr, this.f82943h, iMin);
        int i15 = this.f82943h + iMin;
        this.f82943h = i15;
        return i15 == i14;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x047f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0487  */
    /* JADX WARN: Code duplicated, block: B:182:0x048a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x048c  */
    /* JADX WARN: Code duplicated, block: B:186:0x049c  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ba  */
    @Override // hc.j
    public final void b(fa.r rVar) throws ParserException {
        int i14;
        int i15;
        byte b14;
        boolean z14;
        int i16;
        int i17;
        byte b15;
        int i18;
        byte b16;
        int i19;
        byte b17;
        int i24;
        int i25;
        int iG;
        int iG2;
        int iG3;
        int i26;
        long jU;
        int i27;
        long jU2;
        int iG4;
        int i28;
        int i29;
        fa.a.f(this.f82941f);
        while (rVar.a() > 0) {
            int i30 = this.f82942g;
            int i34 = 8;
            fa.r rVar2 = this.f82936a;
            switch (i30) {
                case 0:
                    while (rVar.a() > 0) {
                        int i35 = this.f82944i << 8;
                        this.f82944i = i35;
                        int iU = i35 | rVar.u();
                        this.f82944i = iU;
                        if (iU == 2147385345 || iU == -25230976 || iU == 536864768 || iU == -14745368) {
                            i14 = 1;
                        } else if (iU == 1683496997 || iU == 622876772) {
                            i14 = 2;
                        } else if (iU == 1078008818 || iU == -233094848) {
                            i14 = 3;
                        } else {
                            i14 = (iU == 1908687592 || iU == -398277519) ? 4 : 0;
                        }
                        this.f82948m = i14;
                        if (i14 != 0) {
                            byte[] bArr = rVar2.f70054a;
                            bArr[0] = (byte) ((iU >> 24) & 255);
                            bArr[1] = (byte) ((iU >> 16) & 255);
                            bArr[2] = (byte) ((iU >> 8) & 255);
                            bArr[3] = (byte) (iU & 255);
                            this.f82943h = 4;
                            this.f82944i = 0;
                            if (i14 != 3 && i14 != 4) {
                                if (i14 == 1) {
                                    this.f82942g = 1;
                                } else {
                                    this.f82942g = 2;
                                }
                            }
                            this.f82942g = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (a(rVar, rVar2.f70054a, 18)) {
                        byte[] bArr2 = rVar2.f70054a;
                        if (this.f82946k == null) {
                            String str = this.f82940e;
                            fa.q qVarA = bb.m.a(bArr2);
                            qVarA.o(60);
                            int i36 = bb.m.f17219a[qVarA.g(6)];
                            int i37 = bb.m.f17220b[qVarA.g(4)];
                            int iG5 = qVarA.g(5);
                            int i38 = iG5 >= 29 ? -1 : (bb.m.f17221c[iG5] * 1000) / 2;
                            qVarA.o(10);
                            int i39 = i36 + (qVarA.g(2) > 0 ? 1 : 0);
                            androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                            bVar.f8399a = str;
                            bVar.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_DTS);
                            bVar.f8406h = i38;
                            bVar.B = i39;
                            bVar.C = i37;
                            bVar.f8415q = null;
                            bVar.f8402d = this.f82938c;
                            bVar.f8404f = this.f82939d;
                            androidx.media3.common.q qVarA2 = bVar.a();
                            this.f82946k = qVarA2;
                            this.f82941f.d(qVarA2);
                        }
                        byte b18 = bArr2[0];
                        if (b18 != -2) {
                            if (b18 == -1) {
                                i19 = ((3 & bArr2[7]) << 12) | ((bArr2[6] & UnsignedBytes.MAX_VALUE) << 4);
                                b17 = bArr2[9];
                            } else if (b18 != 31) {
                                i15 = ((3 & bArr2[5]) << 12) | ((bArr2[6] & UnsignedBytes.MAX_VALUE) << 4);
                                b14 = bArr2[7];
                            } else {
                                i19 = ((3 & bArr2[6]) << 12) | ((bArr2[7] & UnsignedBytes.MAX_VALUE) << 4);
                                b17 = bArr2[8];
                            }
                            i16 = (i19 | ((b17 & 60) >> 2)) + 1;
                            z14 = true;
                            if (z14) {
                                i16 = (i16 * 16) / 14;
                            }
                            this.f82947l = i16;
                            if (b18 != -2) {
                                if (b18 != -1) {
                                    i17 = (bArr2[4] & 7) << 4;
                                    b16 = bArr2[7];
                                } else if (b18 != 31) {
                                    i17 = (bArr2[4] & 1) << 6;
                                    b15 = bArr2[5];
                                } else {
                                    i17 = (bArr2[5] & 7) << 4;
                                    b16 = bArr2[6];
                                }
                                i18 = b16 & 60;
                                this.f82945j = Ints.checkedCast(fa.z.S(this.f82946k.D, (((i18 >> 2) | i17) + 1) * 32));
                                rVar2.G(0);
                                this.f82941f.f(18, rVar2);
                                this.f82942g = 6;
                            } else {
                                i17 = (bArr2[5] & 1) << 6;
                                b15 = bArr2[4];
                            }
                            i18 = b15 & 252;
                            this.f82945j = Ints.checkedCast(fa.z.S(this.f82946k.D, (((i18 >> 2) | i17) + 1) * 32));
                            rVar2.G(0);
                            this.f82941f.f(18, rVar2);
                            this.f82942g = 6;
                        } else {
                            i15 = ((3 & bArr2[4]) << 12) | ((bArr2[7] & UnsignedBytes.MAX_VALUE) << 4);
                            b14 = bArr2[6];
                        }
                        i16 = (i15 | ((b14 & 240) >> 4)) + 1;
                        z14 = false;
                        if (z14) {
                            i16 = (i16 * 16) / 14;
                        }
                        this.f82947l = i16;
                        if (b18 != -2) {
                            if (b18 != -1) {
                                i17 = (bArr2[4] & 7) << 4;
                                b16 = bArr2[7];
                            } else if (b18 != 31) {
                                i17 = (bArr2[4] & 1) << 6;
                                b15 = bArr2[5];
                            } else {
                                i17 = (bArr2[5] & 7) << 4;
                                b16 = bArr2[6];
                            }
                            i18 = b16 & 60;
                            this.f82945j = Ints.checkedCast(fa.z.S(this.f82946k.D, (((i18 >> 2) | i17) + 1) * 32));
                            rVar2.G(0);
                            this.f82941f.f(18, rVar2);
                            this.f82942g = 6;
                        } else {
                            i17 = (bArr2[5] & 1) << 6;
                            b15 = bArr2[4];
                        }
                        i18 = b15 & 252;
                        this.f82945j = Ints.checkedCast(fa.z.S(this.f82946k.D, (((i18 >> 2) | i17) + 1) * 32));
                        rVar2.G(0);
                        this.f82941f.f(18, rVar2);
                        this.f82942g = 6;
                        break;
                    }
                    break;
                case 2:
                    if (a(rVar, rVar2.f70054a, 7)) {
                        fa.q qVarA3 = bb.m.a(rVar2.f70054a);
                        qVarA3.o(42);
                        this.f82949n = qVarA3.g(qVarA3.f() ? 12 : 8) + 1;
                        this.f82942g = 3;
                    }
                    break;
                case 3:
                    if (a(rVar, rVar2.f70054a, this.f82949n)) {
                        fa.q qVarA4 = bb.m.a(rVar2.f70054a);
                        qVarA4.o(40);
                        int iG6 = qVarA4.g(2);
                        if (qVarA4.f()) {
                            i24 = 20;
                            i25 = 12;
                        } else {
                            i24 = 16;
                            i25 = 8;
                        }
                        qVarA4.o(i25);
                        int iG7 = qVarA4.g(i24) + 1;
                        boolean zF = qVarA4.f();
                        if (zF) {
                            iG = qVarA4.g(2);
                            iG2 = (qVarA4.g(3) + 1) * 512;
                            if (qVarA4.f()) {
                                qVarA4.o(36);
                            }
                            int iG8 = qVarA4.g(3) + 1;
                            int iG9 = qVarA4.g(3) + 1;
                            if (iG8 != 1 || iG9 != 1) {
                                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
                            }
                            int i44 = iG6 + 1;
                            int iG10 = qVarA4.g(i44);
                            int i45 = 0;
                            while (i45 < i44) {
                                if (((iG10 >> i45) & 1) == 1) {
                                    qVarA4.o(i34);
                                }
                                i45++;
                                i34 = 8;
                            }
                            if (qVarA4.f()) {
                                qVarA4.o(2);
                                int iG11 = (qVarA4.g(2) + 1) << 2;
                                int iG12 = qVarA4.g(2) + 1;
                                for (int i46 = 0; i46 < iG12; i46++) {
                                    qVarA4.o(iG11);
                                }
                            }
                        } else {
                            iG = -1;
                            iG2 = 0;
                        }
                        qVarA4.o(i24);
                        qVarA4.o(12);
                        if (zF) {
                            if (qVarA4.f()) {
                                qVarA4.o(4);
                            }
                            if (qVarA4.f()) {
                                qVarA4.o(24);
                            }
                            if (qVarA4.f()) {
                                qVarA4.p(qVarA4.g(10) + 1);
                            }
                            qVarA4.o(5);
                            i26 = bb.m.f17222d[qVarA4.g(4)];
                            iG3 = qVarA4.g(8) + 1;
                        } else {
                            iG3 = -1;
                            i26 = BleCommunicationException.UNSPECIFIED_FAILURE;
                        }
                        if (zF) {
                            if (iG == 0) {
                                i27 = 32000;
                            } else if (iG == 1) {
                                i27 = 44100;
                            } else {
                                if (iG != 2) {
                                    throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + iG, null);
                                }
                                i27 = OpusUtil.SAMPLE_RATE;
                            }
                            int i47 = fa.z.f70071a;
                            jU = fa.z.U(iG2, 1000000L, i27, RoundingMode.DOWN);
                        } else {
                            jU = -9223372036854775807L;
                        }
                        bb.m.b bVar2 = new bb.m.b(MimeTypes.AUDIO_DTS_EXPRESS, iG3, i26, iG7, jU, 0);
                        e(bVar2);
                        this.f82947l = bVar2.f17231d;
                        long j8 = bVar2.f17232e;
                        this.f82945j = j8 == C.TIME_UNSET ? 0L : j8;
                        rVar2.G(0);
                        this.f82941f.f(this.f82949n, rVar2);
                        this.f82942g = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (a(rVar, rVar2.f70054a, 6)) {
                        fa.q qVarA5 = bb.m.a(rVar2.f70054a);
                        qVarA5.o(32);
                        int iB = bb.m.b(qVarA5, bb.m.f17227i) + 1;
                        this.f82950o = iB;
                        int i48 = this.f82943h;
                        if (i48 > iB) {
                            int i49 = i48 - iB;
                            this.f82943h = i48 - i49;
                            rVar.G(rVar.f70055b - i49);
                        }
                        this.f82942g = 5;
                    }
                    break;
                case 5:
                    if (a(rVar, rVar2.f70054a, this.f82950o)) {
                        byte[] bArr3 = rVar2.f70054a;
                        fa.q qVarA6 = bb.m.a(bArr3);
                        int i54 = qVarA6.g(32) == 1078008818 ? 1 : 0;
                        int iB2 = bb.m.b(qVarA6, bb.m.f17223e);
                        int i55 = iB2 + 1;
                        if (i54 == 0) {
                            jU2 = -9223372036854775807L;
                            iG4 = BleCommunicationException.UNSPECIFIED_FAILURE;
                        } else {
                            if (!qVarA6.f()) {
                                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
                            }
                            int i56 = iB2 - 1;
                            int i57 = ((bArr3[i56] << 8) & 65535) | (bArr3[iB2] & UnsignedBytes.MAX_VALUE);
                            int i58 = fa.z.f70071a;
                            int i59 = 65535;
                            for (int i64 = 0; i64 < i56; i64++) {
                                int i65 = UnsignedBytes.toInt(bArr3[i64]);
                                int[] iArr = fa.z.f70084n;
                                int i66 = (iArr[(((i59 >> 12) & 255) ^ (i65 >> 4)) & 255] ^ ((i59 << 4) & 65535)) & 65535;
                                i59 = (((i66 << 4) & 65535) ^ iArr[(((i66 >> 12) & 255) ^ (i65 & 15)) & 255]) & 65535;
                            }
                            if (i57 != i59) {
                                throw ParserException.createForMalformedContainer("CRC check failed", null);
                            }
                            int iG13 = qVarA6.g(2);
                            if (iG13 == 0) {
                                i28 = 512;
                            } else if (iG13 == 1) {
                                i28 = 480;
                            } else {
                                if (iG13 != 2) {
                                    throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + iG13, null);
                                }
                                i28 = 384;
                            }
                            int iG14 = (qVarA6.g(3) + 1) * i28;
                            int iG15 = qVarA6.g(2);
                            if (iG15 == 0) {
                                i29 = 32000;
                            } else if (iG15 == 1) {
                                i29 = 44100;
                            } else {
                                if (iG15 != 2) {
                                    throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + iG15, null);
                                }
                                i29 = OpusUtil.SAMPLE_RATE;
                            }
                            if (qVarA6.f()) {
                                qVarA6.o(36);
                            }
                            iG4 = i29 * (1 << qVarA6.g(2));
                            jU2 = fa.z.U(iG14, 1000000L, i29, RoundingMode.DOWN);
                        }
                        int iB3 = 0;
                        for (int i67 = 0; i67 < i54; i67++) {
                            iB3 += bb.m.b(qVarA6, bb.m.f17224f);
                        }
                        AtomicInteger atomicInteger = this.f82937b;
                        if (i54 != 0) {
                            atomicInteger.set(bb.m.b(qVarA6, bb.m.f17225g));
                        }
                        bb.m.b bVar3 = new bb.m.b(MimeTypes.AUDIO_DTS_X, 2, iG4, iB3 + (atomicInteger.get() != 0 ? bb.m.b(qVarA6, bb.m.f17226h) : 0) + i55, jU2, 0);
                        if (this.f82948m == 3) {
                            e(bVar3);
                        }
                        this.f82947l = bVar3.f17231d;
                        long j14 = bVar3.f17232e;
                        this.f82945j = j14 == C.TIME_UNSET ? 0L : j14;
                        rVar2.G(0);
                        this.f82941f.f(this.f82950o, rVar2);
                        this.f82942g = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(rVar.a(), this.f82947l - this.f82943h);
                    this.f82941f.f(iMin, rVar);
                    int i68 = this.f82943h + iMin;
                    this.f82943h = i68;
                    if (i68 == this.f82947l) {
                        fa.a.d(this.f82951p != C.TIME_UNSET);
                        this.f82941f.c(this.f82951p, this.f82948m == 4 ? 0 : 1, this.f82947l, 0, null);
                        this.f82951p += this.f82945j;
                        this.f82942g = 0;
                    }
                    break;
                default:
                    j20.x.h();
                    return;
            }
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f82940e = dVar.f82933e;
        dVar.b();
        this.f82941f = pVar.track(dVar.f82932d, 1);
    }

    @Override // hc.j
    public final void d(boolean z14) {
    }

    public final void e(bb.m.b bVar) {
        int i14 = bVar.f17229b;
        String str = bVar.f17228a;
        int i15 = bVar.f17230c;
        if (i14 == -2147483647 || i15 == -1) {
            return;
        }
        androidx.media3.common.q qVar = this.f82946k;
        if (qVar != null && i15 == qVar.C && i14 == qVar.D) {
            String str2 = qVar.f8386n;
            int i16 = fa.z.f70071a;
            if (Objects.equals(str, str2)) {
                return;
            }
        }
        androidx.media3.common.q qVar2 = this.f82946k;
        androidx.media3.common.q.b bVar2 = qVar2 == null ? new androidx.media3.common.q.b() : qVar2.a();
        bVar2.f8399a = this.f82940e;
        bVar2.f8411m = androidx.media3.common.x.n(str);
        bVar2.B = i15;
        bVar2.C = i14;
        bVar2.f8402d = this.f82938c;
        bVar2.f8404f = this.f82939d;
        androidx.media3.common.q qVarA = bVar2.a();
        this.f82946k = qVarA;
        this.f82941f.d(qVarA);
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f82951p = j8;
    }

    @Override // hc.j
    public final void seek() {
        this.f82942g = 0;
        this.f82943h = 0;
        this.f82944i = 0;
        this.f82951p = C.TIME_UNSET;
        this.f82937b.set(0);
    }
}
