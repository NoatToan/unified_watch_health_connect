package hc;

import androidx.media3.common.ParserException;
import bb.l0;
import com.garmin.device.ble.BleCommunicationException;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.flexbox.FlexItem;
import com.google.android.material.internal.ViewUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.math.LongMath;

/* JADX INFO: loaded from: classes.dex */
public final class r implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f83131f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f83134i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f83136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f83137l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f83139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f83140o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f83144s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f83146u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83129d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.r f83126a = new fa.r(new byte[15], 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.q f83127b = new fa.q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.r f83128c = new fa.r();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s.b f83141p = new s.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f83142q = BleCommunicationException.UNSPECIFIED_FAILURE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f83143r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f83145t = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f83135j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f83138m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f83132g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f83133h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02da  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:198:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:233:0x0465  */
    /* JADX WARN: Code duplicated, block: B:234:0x0471  */
    /* JADX WARN: Code duplicated, block: B:269:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02d1, please report this as an issue */
    @Override // hc.j
    public final void b(fa.r rVar) throws ParserException {
        int i14;
        int i15;
        int iG;
        int iG2;
        int i16;
        char c14;
        byte[] bArr;
        s.c cVar;
        long j8;
        long j14;
        byte[] bArr2;
        ImmutableList immutableListOf;
        char c15;
        int iG3;
        fa.r rVar2;
        long jI;
        boolean z14;
        int i17;
        int i18;
        fa.a.f(this.f83131f);
        while (rVar.a() > 0) {
            int i19 = this.f83129d;
            int i24 = 8;
            int i25 = 1;
            if (i19 == 0) {
                int i26 = this.f83136k;
                if ((i26 & 2) != 0) {
                    if ((i26 & 4) == 0) {
                        while (rVar.a() > 0) {
                            int i27 = this.f83137l << 8;
                            this.f83137l = i27;
                            int iU = i27 | rVar.u();
                            this.f83137l = iU;
                            if ((iU & FlexItem.MAX_SIZE) == 12583333) {
                                rVar.G(rVar.f70055b - 3);
                                this.f83137l = 0;
                            }
                        }
                    }
                    this.f83129d = 1;
                    break;
                }
                rVar.G(rVar.f70056c);
            } else {
                fa.r rVar3 = this.f83128c;
                s.b bVar = this.f83141p;
                if (i19 == 1) {
                    int iA = rVar.a();
                    fa.r rVar4 = this.f83126a;
                    int iMin = Math.min(iA, rVar4.a());
                    rVar.e(rVar4.f70054a, rVar4.f70055b, iMin);
                    rVar4.H(iMin);
                    if (rVar4.a() == 0) {
                        int i28 = rVar4.f70056c;
                        byte[] bArr3 = rVar4.f70054a;
                        fa.q qVar = this.f83127b;
                        qVar.l(bArr3, i28);
                        qVar.d();
                        int iA2 = s.a(qVar, 3, 8, 8);
                        bVar.f83147a = iA2;
                        if (iA2 == -1) {
                            rVar2 = rVar3;
                        } else {
                            fa.a.a(Math.max(Math.max(2, 8), 32) <= 63);
                            rVar2 = rVar3;
                            LongMath.checkedAdd(LongMath.checkedAdd(3L, 255L), 4294967296L);
                            if (qVar.b() < 2) {
                                jI = -1;
                            } else {
                                jI = qVar.i(2);
                                if (jI == 3) {
                                    if (qVar.b() < 8) {
                                        jI = -1;
                                    } else {
                                        long jI2 = qVar.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (qVar.b() < 32) {
                                                jI = -1;
                                            } else {
                                                jI += qVar.i(32);
                                            }
                                        }
                                    }
                                }
                            }
                            bVar.f83148b = jI;
                            if (jI != -1) {
                                if (jI > 16) {
                                    throw ParserException.createForUnsupportedContainerFeature("Contains sub-stream with an invalid packet label " + bVar.f83148b);
                                }
                                if (jI == 0) {
                                    int i29 = bVar.f83147a;
                                    if (i29 == 1) {
                                        throw ParserException.createForMalformedContainer("Mpegh3daConfig packet with invalid packet label 0", null);
                                    }
                                    if (i29 == 2) {
                                        throw ParserException.createForMalformedContainer("Mpegh3daFrame packet with invalid packet label 0", null);
                                    }
                                    if (i29 == 17) {
                                        throw ParserException.createForMalformedContainer("AudioTruncation packet with invalid packet label 0", null);
                                    }
                                }
                                int iA3 = s.a(qVar, 11, 24, 24);
                                bVar.f83149c = iA3;
                                z14 = iA3 != -1;
                            }
                            if (z14) {
                                i17 = 0;
                                this.f83139n = 0;
                                this.f83140o = bVar.f83149c + i28 + this.f83140o;
                            } else {
                                i17 = 0;
                            }
                            if (z14) {
                                rVar4.G(i17);
                                this.f83131f.f(rVar4.f70056c, rVar4);
                                rVar4.D(2);
                                rVar2.D(bVar.f83149c);
                                this.f83138m = true;
                                this.f83129d = 2;
                            } else {
                                i18 = rVar4.f70056c;
                                if (i18 < 15) {
                                    rVar4.F(i18 + 1);
                                    this.f83138m = false;
                                }
                            }
                        }
                        if (z14) {
                            i17 = 0;
                            this.f83139n = 0;
                            this.f83140o = bVar.f83149c + i28 + this.f83140o;
                        } else {
                            i17 = 0;
                        }
                        if (z14) {
                            rVar4.G(i17);
                            this.f83131f.f(rVar4.f70056c, rVar4);
                            rVar4.D(2);
                            rVar2.D(bVar.f83149c);
                            this.f83138m = true;
                            this.f83129d = 2;
                        } else {
                            i18 = rVar4.f70056c;
                            if (i18 < 15) {
                                rVar4.F(i18 + 1);
                                this.f83138m = false;
                            }
                        }
                    } else {
                        this.f83138m = false;
                    }
                } else {
                    if (i19 != 2) {
                        j20.x.h();
                        return;
                    }
                    int i30 = bVar.f83147a;
                    if (i30 == 1 || i30 == 17) {
                        int i34 = rVar.f70055b;
                        int iMin2 = Math.min(rVar.a(), rVar3.a());
                        rVar.e(rVar3.f70054a, rVar3.f70055b, iMin2);
                        rVar3.H(iMin2);
                        rVar.G(i34);
                    }
                    int iMin3 = Math.min(rVar.a(), bVar.f83149c - this.f83139n);
                    this.f83131f.f(iMin3, rVar);
                    int i35 = this.f83139n + iMin3;
                    this.f83139n = i35;
                    if (i35 != bVar.f83149c) {
                        continue;
                    } else {
                        int i36 = bVar.f83147a;
                        if (i36 == 1) {
                            fa.q qVar2 = new fa.q(rVar3.f70054a);
                            int iG4 = qVar2.g(8);
                            char c16 = 5;
                            int iG5 = qVar2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = OpusUtil.SAMPLE_RATE;
                                        break;
                                    case 4:
                                        iG2 = 44100;
                                        break;
                                    case 5:
                                        iG2 = 32000;
                                        break;
                                    case 6:
                                        iG2 = 24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case 10:
                                        iG2 = 11025;
                                        break;
                                    case 11:
                                        iG2 = 8000;
                                        break;
                                    case 12:
                                        iG2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate index " + iG5);
                                    case 15:
                                        iG2 = 57600;
                                        break;
                                    case 16:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case 19:
                                        iG2 = 34150;
                                        break;
                                    case 20:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case 23:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case 25:
                                        iG2 = 14400;
                                        break;
                                    case 26:
                                        iG2 = 12800;
                                        break;
                                    case 27:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = qVar2.g(24);
                            }
                            int iG6 = qVar2.g(3);
                            int i37 = 4;
                            if (iG6 == 0) {
                                i16 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                            } else if (iG6 == 1) {
                                i16 = 1024;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i16 = 2048;
                            } else {
                                if (iG6 != 4) {
                                    throw ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i16 = 4096;
                            }
                            int i38 = i16;
                            if (iG6 == 0 || iG6 == 1) {
                                c14 = 0;
                            } else if (iG6 == 2) {
                                c14 = 2;
                            } else if (iG6 == 3) {
                                c14 = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c14 = 1;
                            }
                            qVar2.o(2);
                            s.c(qVar2);
                            int iG7 = qVar2.g(5);
                            int i39 = 0;
                            int iA4 = 0;
                            while (true) {
                                int i44 = i25;
                                int i45 = 16;
                                if (i39 < iG7 + 1) {
                                    int iG8 = qVar2.g(3);
                                    iA4 = s.a(qVar2, 5, 8, 16) + 1 + iA4;
                                    if ((iG8 == 0 || iG8 == 2) && qVar2.f()) {
                                        s.c(qVar2);
                                    }
                                    i39++;
                                    i25 = i44;
                                } else {
                                    int iA5 = s.a(qVar2, 4, 8, 16) + 1;
                                    qVar2.n();
                                    int i46 = 0;
                                    while (true) {
                                        double d14 = 2.0d;
                                        if (i46 < iA5) {
                                            int iG9 = qVar2.g(2);
                                            if (iG9 == 0) {
                                                c15 = c16;
                                                qVar2.o(3);
                                                if (qVar2.f()) {
                                                    qVar2.o(13);
                                                }
                                                if (c14 > 0) {
                                                    s.b(qVar2);
                                                }
                                            } else if (iG9 != i44) {
                                                if (iG9 == 3) {
                                                    s.a(qVar2, i37, i24, i45);
                                                    int iA6 = s.a(qVar2, i37, i24, i45);
                                                    if (qVar2.f()) {
                                                        s.a(qVar2, i24, i45, 0);
                                                    }
                                                    qVar2.n();
                                                    if (iA6 > 0) {
                                                        qVar2.o(iA6 * 8);
                                                    }
                                                }
                                                c15 = 5;
                                            } else {
                                                qVar2.o(3);
                                                boolean zF = qVar2.f();
                                                if (zF) {
                                                    qVar2.o(13);
                                                }
                                                if (zF) {
                                                    qVar2.n();
                                                }
                                                if (c14 > 0) {
                                                    s.b(qVar2);
                                                    iG3 = qVar2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    qVar2.o(6);
                                                    int iG10 = qVar2.g(2);
                                                    qVar2.o(i37);
                                                    c15 = 5;
                                                    if (qVar2.f()) {
                                                        qVar2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == 3) {
                                                        qVar2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        qVar2.n();
                                                    }
                                                } else {
                                                    c15 = 5;
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iA4 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = qVar2.g(2);
                                                if (iG11 > 0 && qVar2.f()) {
                                                    qVar2.o(iFloor);
                                                }
                                                if (qVar2.f()) {
                                                    qVar2.o(iFloor);
                                                }
                                                if (c14 == 0 && iG11 == 0) {
                                                    qVar2.n();
                                                }
                                            }
                                            i46++;
                                            c16 = c15;
                                            i24 = 8;
                                            i45 = 16;
                                            i37 = 4;
                                            i44 = 1;
                                        } else {
                                            if (qVar2.f()) {
                                                int i47 = 8;
                                                int iA7 = s.a(qVar2, 2, 4, 8) + 1;
                                                int i48 = 0;
                                                bArr = null;
                                                while (i48 < iA7) {
                                                    int iA8 = s.a(qVar2, 4, i47, 16);
                                                    int iA9 = s.a(qVar2, 4, i47, 16);
                                                    if (iA8 == 7) {
                                                        int iG12 = qVar2.g(4) + 1;
                                                        qVar2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i49 = 0; i49 < iG12; i49++) {
                                                            bArr4[i49] = (byte) qVar2.g(i47);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        qVar2.o(iA9 * i47);
                                                    }
                                                    i48++;
                                                    i47 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                                                    d14 = 3.0d;
                                                    cVar = new s.c(iG4, (int) (((double) iG2) * d14), (int) (((double) i38) * d14), bArr);
                                                    this.f83142q = cVar.f83151b;
                                                    this.f83143r = cVar.f83152c;
                                                    j8 = this.f83145t;
                                                    j14 = bVar.f83148b;
                                                    if (j8 != j14) {
                                                        this.f83145t = j14;
                                                        int i54 = cVar.f83150a;
                                                        String strConcat = i54 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i54))) : "mhm1";
                                                        bArr2 = cVar.f83153d;
                                                        if (bArr2 != null || bArr2.length <= 0) {
                                                            immutableListOf = null;
                                                        } else {
                                                            immutableListOf = ImmutableList.of(fa.z.f70076f, bArr2);
                                                        }
                                                        androidx.media3.common.q.b bVar2 = new androidx.media3.common.q.b();
                                                        bVar2.f8399a = this.f83130e;
                                                        bVar2.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_MPEGH_MHM1);
                                                        bVar2.C = this.f83142q;
                                                        bVar2.f8408j = strConcat;
                                                        bVar2.f8414p = immutableListOf;
                                                        this.f83131f.d(bVar2.a());
                                                    }
                                                    i15 = 1;
                                                    this.f83146u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    cVar = new s.c(iG4, (int) (((double) iG2) * d14), (int) (((double) i38) * d14), bArr);
                                                    this.f83142q = cVar.f83151b;
                                                    this.f83143r = cVar.f83152c;
                                                    j8 = this.f83145t;
                                                    j14 = bVar.f83148b;
                                                    if (j8 != j14) {
                                                        this.f83145t = j14;
                                                        int i55 = cVar.f83150a;
                                                        if (i55 != -1) {
                                                        }
                                                        bArr2 = cVar.f83153d;
                                                        if (bArr2 != null) {
                                                            immutableListOf = null;
                                                        } else {
                                                            immutableListOf = null;
                                                        }
                                                        androidx.media3.common.q.b bVar3 = new androidx.media3.common.q.b();
                                                        bVar3.f8399a = this.f83130e;
                                                        bVar3.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_MPEGH_MHM1);
                                                        bVar3.C = this.f83142q;
                                                        bVar3.f8408j = strConcat;
                                                        bVar3.f8414p = immutableListOf;
                                                        this.f83131f.d(bVar3.a());
                                                    }
                                                    i15 = 1;
                                                    this.f83146u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d14 = 1.5d;
                                                    cVar = new s.c(iG4, (int) (((double) iG2) * d14), (int) (((double) i38) * d14), bArr);
                                                    this.f83142q = cVar.f83151b;
                                                    this.f83143r = cVar.f83152c;
                                                    j8 = this.f83145t;
                                                    j14 = bVar.f83148b;
                                                    if (j8 != j14) {
                                                        this.f83145t = j14;
                                                        int i56 = cVar.f83150a;
                                                        if (i56 != -1) {
                                                        }
                                                        bArr2 = cVar.f83153d;
                                                        if (bArr2 != null) {
                                                            immutableListOf = null;
                                                        } else {
                                                            immutableListOf = null;
                                                        }
                                                        androidx.media3.common.q.b bVar4 = new androidx.media3.common.q.b();
                                                        bVar4.f8399a = this.f83130e;
                                                        bVar4.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_MPEGH_MHM1);
                                                        bVar4.C = this.f83142q;
                                                        bVar4.f8408j = strConcat;
                                                        bVar4.f8414p = immutableListOf;
                                                        this.f83131f.d(bVar4.a());
                                                    }
                                                    i15 = 1;
                                                    this.f83146u = true;
                                                    break;
                                                case 44100:
                                                case OpusUtil.SAMPLE_RATE /* 48000 */:
                                                case 88200:
                                                case 96000:
                                                    d14 = 1.0d;
                                                    cVar = new s.c(iG4, (int) (((double) iG2) * d14), (int) (((double) i38) * d14), bArr);
                                                    this.f83142q = cVar.f83151b;
                                                    this.f83143r = cVar.f83152c;
                                                    j8 = this.f83145t;
                                                    j14 = bVar.f83148b;
                                                    if (j8 != j14) {
                                                        this.f83145t = j14;
                                                        int i57 = cVar.f83150a;
                                                        if (i57 != -1) {
                                                        }
                                                        bArr2 = cVar.f83153d;
                                                        if (bArr2 != null) {
                                                            immutableListOf = null;
                                                        } else {
                                                            immutableListOf = null;
                                                        }
                                                        androidx.media3.common.q.b bVar5 = new androidx.media3.common.q.b();
                                                        bVar5.f8399a = this.f83130e;
                                                        bVar5.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_MPEGH_MHM1);
                                                        bVar5.C = this.f83142q;
                                                        bVar5.f8408j = strConcat;
                                                        bVar5.f8414p = immutableListOf;
                                                        this.f83131f.d(bVar5.a());
                                                    }
                                                    i15 = 1;
                                                    this.f83146u = true;
                                                    break;
                                                default:
                                                    throw ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i36 == 17) {
                                fa.q qVar3 = new fa.q(rVar3.f70054a);
                                if (qVar3.f()) {
                                    qVar3.o(2);
                                    iG = qVar3.g(13);
                                } else {
                                    iG = 0;
                                }
                                this.f83144s = iG;
                            } else if (i36 == 2) {
                                if (this.f83146u) {
                                    this.f83135j = false;
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                double d15 = (((double) (this.f83143r - this.f83144s)) * 1000000.0d) / ((double) this.f83142q);
                                long jRound = Math.round(this.f83132g);
                                if (this.f83134i) {
                                    this.f83134i = false;
                                    this.f83132g = this.f83133h;
                                } else {
                                    this.f83132g += d15;
                                }
                                this.f83131f.c(jRound, i14, this.f83140o, 0, null);
                                this.f83146u = false;
                                this.f83144s = 0;
                                this.f83140o = 0;
                            }
                            i15 = 1;
                        }
                        this.f83129d = i15;
                    }
                }
            }
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f83130e = dVar.f82933e;
        dVar.b();
        this.f83131f = pVar.track(dVar.f82932d, 1);
    }

    @Override // hc.j
    public final void d(boolean z14) {
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f83136k = i14;
        if (!this.f83135j && (this.f83140o != 0 || !this.f83138m)) {
            this.f83134i = true;
        }
        if (j8 != C.TIME_UNSET) {
            if (this.f83134i) {
                this.f83133h = j8;
            } else {
                this.f83132g = j8;
            }
        }
    }

    @Override // hc.j
    public final void seek() {
        this.f83129d = 0;
        this.f83137l = 0;
        this.f83126a.D(2);
        this.f83139n = 0;
        this.f83140o = 0;
        this.f83142q = BleCommunicationException.UNSPECIFIED_FAILURE;
        this.f83143r = -1;
        this.f83144s = 0;
        this.f83145t = -1L;
        this.f83146u = false;
        this.f83134i = false;
        this.f83138m = true;
        this.f83135j = true;
        this.f83132g = -9.223372036854776E18d;
        this.f83133h = -9.223372036854776E18d;
    }
}
