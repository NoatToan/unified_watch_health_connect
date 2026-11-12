package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.ayf;
import defpackage.rk1;
import defpackage.toe;
import defpackage.us5;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7980b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7981k;

    @VisibleForTesting
    public c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f7979a = (String) rk1.e(str);
        this.f7980b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.f7981k = ayf.s(str2);
    }

    public static c A(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new c(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !h(codecCapabilities) || y(str)) ? false : true, codecCapabilities != null && r(codecCapabilities), z5 || (codecCapabilities != null && p(codecCapabilities)));
    }

    public static int a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((wlq.f38110a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE.equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append("]");
        toe.h("MediaCodecInfo", sb.toString());
        return i2;
    }

    @RequiresApi(21)
    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(wlq.l(i, widthAlignment) * widthAlignment, wlq.l(i2, heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointC = c(videoCapabilities, i, i2);
        int i3 = pointC.x;
        int i4 = pointC.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i = 1024;
        } else if (iIntValue >= 120000000) {
            i = 512;
        } else if (iIntValue >= 60000000) {
            i = 256;
        } else if (iIntValue >= 30000000) {
            i = 128;
        } else if (iIntValue >= 18000000) {
            i = 64;
        } else if (iIntValue >= 12000000) {
            i = 32;
        } else if (iIntValue >= 7200000) {
            i = 16;
        } else if (iIntValue >= 3600000) {
            i = 8;
        } else if (iIntValue >= 1800000) {
            i = 4;
        } else {
            i = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return wlq.f38110a >= 19 && i(codecCapabilities);
    }

    @RequiresApi(19)
    public static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return wlq.f38110a >= 21 && q(codecCapabilities);
    }

    @RequiresApi(21)
    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return wlq.f38110a >= 21 && s(codecCapabilities);
    }

    @RequiresApi(21)
    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean w(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean x(String str) {
        return wlq.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean y(String str) {
        if (wlq.f38110a <= 22) {
            String str2 = wlq.d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(wlq.f38111b)) ? false : true;
    }

    @RequiresApi(21)
    public Point b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i, i2);
    }

    public us5 e(Format format, Format format2) {
        int i = !wlq.c(format.l, format2.l) ? 8 : 0;
        if (this.f7981k) {
            if (format.t != format2.t) {
                i |= 1024;
            }
            if (!this.e && (format.q != format2.q || format.f7818r != format2.f7818r)) {
                i |= 512;
            }
            if (!wlq.c(format.x, format2.x)) {
                i |= 2048;
            }
            if (x(this.f7979a) && !format.f(format2)) {
                i |= 2;
            }
            if (i == 0) {
                return new us5(this.f7979a, format, format2, format.f(format2) ? 3 : 2, 0);
            }
        } else {
            if (format.y != format2.y) {
                i |= 4096;
            }
            if (format.z != format2.z) {
                i |= 8192;
            }
            if (format.A != format2.A) {
                i |= 16384;
            }
            if (i == 0 && MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE.equals(this.f7980b)) {
                Pair<Integer, Integer> pairP = MediaCodecUtil.p(format);
                Pair<Integer, Integer> pairP2 = MediaCodecUtil.p(format2);
                if (pairP != null && pairP2 != null) {
                    int iIntValue = ((Integer) pairP.first).intValue();
                    int iIntValue2 = ((Integer) pairP2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new us5(this.f7979a, format, format2, 3, 0);
                    }
                }
            }
            if (!format.f(format2)) {
                i |= 32;
            }
            if (w(this.f7980b)) {
                i |= 2;
            }
            if (i == 0) {
                return new us5(this.f7979a, format, format2, 1, 0);
            }
        }
        return new us5(this.f7979a, format, format2, 0, i);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @RequiresApi(21)
    public boolean j(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("channelCount.aCaps");
            return false;
        }
        if (a(this.f7979a, this.f7980b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("channelCount.support, ");
        sb.append(i);
        v(sb.toString());
        return false;
    }

    @RequiresApi(21)
    public boolean k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("sampleRate.support, ");
        sb.append(i);
        v(sb.toString());
        return false;
    }

    public boolean l(Format format) {
        String strG;
        String str = format.i;
        if (str == null || this.f7980b == null || (strG = ayf.g(str)) == null) {
            return true;
        }
        if (!this.f7980b.equals(strG)) {
            String str2 = format.i;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + strG.length());
            sb.append("codec.mime ");
            sb.append(str2);
            sb.append(", ");
            sb.append(strG);
            v(sb.toString());
            return false;
        }
        Pair<Integer, Integer> pairP = MediaCodecUtil.p(format);
        if (pairP == null) {
            return true;
        }
        int iIntValue = ((Integer) pairP.first).intValue();
        int iIntValue2 = ((Integer) pairP.second).intValue();
        if (!this.f7981k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = g();
        if (wlq.f38110a <= 23 && "video/x-vnd.on2.vp9".equals(this.f7980b) && codecProfileLevelArrG.length == 0) {
            codecProfileLevelArrG = f(this.d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrG) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        String str3 = format.i;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + strG.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(strG);
        v(sb2.toString());
        return false;
    }

    public boolean m(Format format) throws MediaCodecUtil.DecoderQueryException {
        int i;
        if (!l(format)) {
            return false;
        }
        if (!this.f7981k) {
            if (wlq.f38110a >= 21) {
                int i2 = format.z;
                if (i2 != -1 && !k(i2)) {
                    return false;
                }
                int i3 = format.y;
                if (i3 != -1 && !j(i3)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = format.q;
        if (i4 <= 0 || (i = format.f7818r) <= 0) {
            return true;
        }
        if (wlq.f38110a >= 21) {
            return t(i4, i, format.s);
        }
        boolean z = i4 * i <= MediaCodecUtil.M();
        if (!z) {
            int i5 = format.q;
            int i6 = format.f7818r;
            StringBuilder sb = new StringBuilder(40);
            sb.append("legacyFrameSize, ");
            sb.append(i5);
            sb.append("x");
            sb.append(i6);
            v(sb.toString());
        }
        return z;
    }

    public boolean n() {
        if (wlq.f38110a >= 29 && "video/x-vnd.on2.vp9".equals(this.f7980b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean o(Format format) {
        if (this.f7981k) {
            return this.e;
        }
        Pair<Integer, Integer> pairP = MediaCodecUtil.p(format);
        return pairP != null && ((Integer) pairP.first).intValue() == 42;
    }

    @RequiresApi(21)
    public boolean t(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("sizeAndRate.vCaps");
            return false;
        }
        if (d(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i < i2 && z(this.f7979a) && d(videoCapabilities, i2, i, d)) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.rotated, ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("x");
            sb.append(d);
            u(sb.toString());
            return true;
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.support, ");
        sb2.append(i);
        sb2.append("x");
        sb2.append(i2);
        sb2.append("x");
        sb2.append(d);
        v(sb2.toString());
        return false;
    }

    public String toString() {
        return this.f7979a;
    }

    public final void u(String str) {
        String str2 = this.f7979a;
        String str3 = this.f7980b;
        String str4 = wlq.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        toe.b("MediaCodecInfo", sb.toString());
    }

    public final void v(String str) {
        String str2 = this.f7979a;
        String str3 = this.f7980b;
        String str4 = wlq.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        toe.b("MediaCodecInfo", sb.toString());
    }
}
