package defpackage;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.digitalkey.wearable.DigitalKeyService;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class e20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16178a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f16179b = {MIOTAudioModuleCore.SAMPLING_RATE, 44100, 32000};
    public static final int[] c = {24000, DigitalKeyService.DIGITAL_KEY_INSUFFICIENT_SE_SPACE, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, SportReportBaseParser.ReportType.avgFreq, 256, 320, 384, FileUtils.S_IRWXU, 512, 576, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16181b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f16180a = str;
            this.f16181b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((wlq.H(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static int b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f16179b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static Format c(okh okhVar, String str, String str2, DrmInitData drmInitData) {
        int i = f16179b[(okhVar.D() & 192) >> 6];
        int iD = okhVar.D();
        int i2 = d[(iD & 56) >> 3];
        if ((iD & 4) != 0) {
            i2++;
        }
        return new Format.b().S(str).e0("audio/ac3").H(i2).f0(i).L(drmInitData).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f16178a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static b e(nkh nkhVar) {
        int iB;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iH;
        int i5;
        int i6;
        int i7;
        int i8;
        int iE = nkhVar.e();
        nkhVar.r(40);
        boolean z = nkhVar.h(5) > 10;
        nkhVar.p(iE);
        int i9 = -1;
        if (z) {
            nkhVar.r(16);
            int iH2 = nkhVar.h(2);
            if (iH2 == 0) {
                i9 = 0;
            } else if (iH2 == 1) {
                i9 = 1;
            } else if (iH2 == 2) {
                i9 = 2;
            }
            nkhVar.r(3);
            iB = (nkhVar.h(11) + 1) * 2;
            int iH3 = nkhVar.h(2);
            if (iH3 == 3) {
                i = c[nkhVar.h(2)];
                i5 = 6;
                iH = 3;
            } else {
                iH = nkhVar.h(2);
                i5 = f16178a[iH];
                i = f16179b[iH3];
            }
            i3 = i5 * 256;
            int iH4 = nkhVar.h(3);
            boolean zG = nkhVar.g();
            i2 = d[iH4] + (zG ? 1 : 0);
            nkhVar.r(10);
            if (nkhVar.g()) {
                nkhVar.r(8);
            }
            if (iH4 == 0) {
                nkhVar.r(5);
                if (nkhVar.g()) {
                    nkhVar.r(8);
                }
            }
            if (i9 == 1 && nkhVar.g()) {
                nkhVar.r(16);
            }
            if (nkhVar.g()) {
                if (iH4 > 2) {
                    nkhVar.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i7 = 6;
                } else {
                    i7 = 6;
                    nkhVar.r(6);
                }
                if ((iH4 & 4) != 0) {
                    nkhVar.r(i7);
                }
                if (zG && nkhVar.g()) {
                    nkhVar.r(5);
                }
                if (i9 == 0) {
                    if (nkhVar.g()) {
                        i8 = 6;
                        nkhVar.r(6);
                    } else {
                        i8 = 6;
                    }
                    if (iH4 == 0 && nkhVar.g()) {
                        nkhVar.r(i8);
                    }
                    if (nkhVar.g()) {
                        nkhVar.r(i8);
                    }
                    int iH5 = nkhVar.h(2);
                    if (iH5 == 1) {
                        nkhVar.r(5);
                    } else if (iH5 == 2) {
                        nkhVar.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = nkhVar.h(5);
                        if (nkhVar.g()) {
                            nkhVar.r(5);
                            if (nkhVar.g()) {
                                nkhVar.r(4);
                            }
                            if (nkhVar.g()) {
                                nkhVar.r(4);
                            }
                            if (nkhVar.g()) {
                                nkhVar.r(4);
                            }
                            if (nkhVar.g()) {
                                nkhVar.r(4);
                            }
                            if (nkhVar.g()) {
                                nkhVar.r(4);
                            }
                            if (nkhVar.g()) {
                                nkhVar.r(4);
                            }
                            if (nkhVar.g()) {
                                nkhVar.r(4);
                            }
                            if (nkhVar.g()) {
                                if (nkhVar.g()) {
                                    nkhVar.r(4);
                                }
                                if (nkhVar.g()) {
                                    nkhVar.r(4);
                                }
                            }
                        }
                        if (nkhVar.g()) {
                            nkhVar.r(5);
                            if (nkhVar.g()) {
                                nkhVar.r(7);
                                if (nkhVar.g()) {
                                    nkhVar.r(8);
                                }
                            }
                        }
                        nkhVar.r((iH6 + 2) * 8);
                        nkhVar.c();
                    }
                    if (iH4 < 2) {
                        if (nkhVar.g()) {
                            nkhVar.r(14);
                        }
                        if (iH4 == 0 && nkhVar.g()) {
                            nkhVar.r(14);
                        }
                    }
                    if (nkhVar.g()) {
                        if (iH == 0) {
                            nkhVar.r(5);
                        } else {
                            for (int i10 = 0; i10 < i5; i10++) {
                                if (nkhVar.g()) {
                                    nkhVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (nkhVar.g()) {
                nkhVar.r(5);
                if (iH4 == 2) {
                    nkhVar.r(4);
                }
                if (iH4 >= 6) {
                    nkhVar.r(2);
                }
                if (nkhVar.g()) {
                    nkhVar.r(8);
                }
                if (iH4 == 0 && nkhVar.g()) {
                    nkhVar.r(8);
                }
                if (iH3 < 3) {
                    nkhVar.q();
                }
            }
            if (i9 == 0 && iH != 3) {
                nkhVar.q();
            }
            if (i9 == 2 && (iH == 3 || nkhVar.g())) {
                i6 = 6;
                nkhVar.r(6);
            } else {
                i6 = 6;
            }
            str = (nkhVar.g() && nkhVar.h(i6) == 1 && nkhVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i9;
        } else {
            nkhVar.r(32);
            int iH7 = nkhVar.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            iB = b(iH7, nkhVar.h(6));
            nkhVar.r(8);
            int iH8 = nkhVar.h(3);
            if ((iH8 & 1) != 0 && iH8 != 1) {
                nkhVar.r(2);
            }
            if ((iH8 & 4) != 0) {
                nkhVar.r(2);
            }
            if (iH8 == 2) {
                nkhVar.r(2);
            }
            int[] iArr = f16179b;
            i = iH7 < iArr.length ? iArr[iH7] : -1;
            i2 = d[iH8] + (nkhVar.g() ? 1 : 0);
            i3 = 1536;
            i4 = -1;
            str = str2;
        }
        return new b(str, i4, i2, i, iB, i3);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return b((b2 & 192) >> 6, b2 & 63);
    }

    public static Format g(okh okhVar, String str, String str2, DrmInitData drmInitData) {
        okhVar.Q(2);
        int i = f16179b[(okhVar.D() & 192) >> 6];
        int iD = okhVar.D();
        int i2 = d[(iD & 14) >> 1];
        if ((iD & 1) != 0) {
            i2++;
        }
        if (((okhVar.D() & 30) >> 1) > 0 && (2 & okhVar.D()) != 0) {
            i2 += 2;
        }
        return new Format.b().S(str).e0((okhVar.a() <= 0 || (okhVar.D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i2).f0(i).L(drmInitData).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
