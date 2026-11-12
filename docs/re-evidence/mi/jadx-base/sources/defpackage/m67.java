package defpackage;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.digitalkey.wearable.DigitalKeyService;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class m67 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25802a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25803b = {-1, 8000, 16000, 32000, -1, -1, 11025, DigitalKeyService.DIGITAL_KEY_INSUFFICIENT_SE_SPACE, 44100, -1, -1, 12000, 24000, MIOTAudioModuleCore.SAMPLING_RATE, -1, -1};
    public static final int[] c = {64, 112, 128, 192, SportReportBaseParser.ReportType.avgFreq, 256, 384, FileUtils.S_IRWXU, 512, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, BaseAivsService.MAX_PACKAGE_LENGTH, 3840, 4096, 6144, 7680};

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int a(byte[] bArr) {
        int i;
        byte b2;
        int i2;
        int i3;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i2 = (((b3 & 60) >> 2) | i3) + 1;
            z = true;
            if (z) {
                return (i2 * 16) / 14;
            }
            return i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i2 = (((b2 & 240) >> 4) | i) + 1;
        if (z) {
            return (i2 * 16) / 14;
        }
        return i2;
    }

    public static nkh b(byte[] bArr) {
        if (bArr[0] == 127) {
            return new nkh(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b2 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b2;
            }
        }
        nkh nkhVar = new nkh(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            nkh nkhVar2 = new nkh(bArrCopyOf);
            while (nkhVar2.b() >= 16) {
                nkhVar2.r(2);
                nkhVar.f(nkhVar2.h(14), 14);
            }
        }
        nkhVar.n(bArrCopyOf);
        return nkhVar;
    }

    public static boolean c(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1;
    }

    public static boolean d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int iPosition = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition);
        if (b4 != -2) {
            if (b4 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 7);
            } else if (b4 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b2 = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 6);
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b2 = byteBuffer.get(iPosition + 4);
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static int f(byte[] bArr) {
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static Format g(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        nkh nkhVarB = b(bArr);
        nkhVarB.r(60);
        int i = f25802a[nkhVarB.h(6)];
        int i2 = f25803b[nkhVarB.h(4)];
        int iH = nkhVarB.h(5);
        int[] iArr = c;
        int i3 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        nkhVarB.r(10);
        return new Format.b().S(str).e0("audio/vnd.dts").G(i3).H(i + (nkhVarB.h(2) > 0 ? 1 : 0)).f0(i2).L(drmInitData).V(str2).E();
    }
}
