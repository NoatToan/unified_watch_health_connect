package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.view.j;
import androidx.media3.common.i;
import androidx.media3.common.q;
import androidx.media3.common.x;
import androidx.media3.exoplayer.h;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import fa.k;
import fa.z;
import i3.e5;
import java.util.List;
import java.util.Objects;
import o4.s;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f9273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9278i;

    public d(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        str.getClass();
        this.f9270a = str;
        this.f9271b = str2;
        this.f9272c = str3;
        this.f9273d = codecCapabilities;
        this.f9276g = z14;
        this.f9274e = z17;
        this.f9275f = z19;
        this.f9277h = z24;
        this.f9278i = x.m(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i14, int i15, double d14) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(z.f(i14, widthAlignment) * widthAlignment, z.f(i15, heightAlignment) * heightAlignment);
        int i16 = point.x;
        int i17 = point.y;
        return (d14 == -1.0d || d14 < 1.0d) ? videoCapabilities.isSizeSupported(i16, i17) : videoCapabilities.areSizeAndRateSupported(i16, i17, Math.floor(d14));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static d h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z14, boolean z15, boolean z16, boolean z17) {
        boolean z18;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z18 = false;
        } else {
            if (z.f70071a <= 22) {
                String str4 = z.f70074d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z18 = false;
                }
            }
            z18 = true;
        }
        return new d(str, str2, str3, codecCapabilities, z14, z15, z16, z18, codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z17 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), z.f70071a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    public final h b(q qVar, q qVar2) {
        q qVar3;
        q qVar4;
        String str = qVar.f8386n;
        i iVar = qVar.B;
        String str2 = qVar2.f8386n;
        i iVar2 = qVar2.B;
        int i14 = z.f70071a;
        int i15 = !Objects.equals(str, str2) ? 8 : 0;
        boolean z14 = this.f9278i;
        String str3 = this.f9270a;
        if (z14) {
            if (qVar.f8396x != qVar2.f8396x) {
                i15 |= 1024;
            }
            if (!this.f9274e && (qVar.f8393u != qVar2.f8393u || qVar.f8394v != qVar2.f8394v)) {
                i15 |= 512;
            }
            if ((!i.f(iVar) || !i.f(iVar2)) && !Objects.equals(iVar, iVar2)) {
                i15 |= 2048;
            }
            if (z.f70074d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !qVar.c(qVar2)) {
                i15 |= 2;
            }
            if (i15 == 0) {
                return new h(str3, qVar, qVar2, qVar.c(qVar2) ? 3 : 2, 0);
            }
            qVar3 = qVar;
            qVar4 = qVar2;
        } else {
            qVar3 = qVar;
            qVar4 = qVar2;
            if (qVar3.C != qVar4.C) {
                i15 |= 4096;
            }
            if (qVar3.D != qVar4.D) {
                i15 |= 8192;
            }
            if (qVar3.E != qVar4.E) {
                i15 |= 16384;
            }
            String str4 = this.f9271b;
            if (i15 == 0 && MimeTypes.AUDIO_AAC.equals(str4)) {
                Pair<Integer, Integer> pairD = MediaCodecUtil.d(qVar3);
                Pair<Integer, Integer> pairD2 = MediaCodecUtil.d(qVar4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new h(str3, qVar3, qVar4, 3, 0);
                    }
                }
            }
            if (!qVar3.c(qVar4)) {
                i15 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str4)) {
                i15 |= 2;
            }
            if (i15 == 0) {
                return new h(str3, qVar3, qVar4, 1, 0);
            }
        }
        return new h(str3, qVar3, qVar4, 0, i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(q qVar, boolean z14) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair<Integer, Integer> pair;
        String strA;
        int i14;
        Pair<Integer, Integer> pairD = MediaCodecUtil.d(qVar);
        String str = qVar.f8386n;
        int i15 = 4;
        String str2 = this.f9272c;
        if (str != null && str.equals("video/mv-hevc")) {
            String strN = x.n(str2);
            if (strN.equals("video/mv-hevc")) {
                return true;
            }
            if (strN.equals(MimeTypes.VIDEO_H265)) {
                List<byte[]> list = qVar.f8389q;
                int i16 = 0;
                loop0: while (true) {
                    if (i16 >= list.size()) {
                        pair = null;
                        strA = null;
                        break;
                    }
                    byte[] bArr = list.get(i16);
                    int length = bArr.length;
                    int i17 = 3;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        ImmutableList.Builder builder = ImmutableList.builder();
                        int i18 = 0;
                        while (i18 < bArr.length) {
                            int iB = ga.e.b(bArr, i18, bArr.length, zArr);
                            if (iB != bArr.length) {
                                builder.add(Integer.valueOf(iB));
                            }
                            i18 = iB + 3;
                        }
                        ImmutableList immutableListBuild = builder.build();
                        int i19 = 0;
                        while (i19 < immutableListBuild.size()) {
                            if (((Integer) immutableListBuild.get(i19)).intValue() + i17 < length) {
                                ga.f fVar = new ga.f(bArr, ((Integer) immutableListBuild.get(i19)).intValue() + i17, length);
                                ga.e.b bVarD = ga.e.d(fVar);
                                if (bVarD.f76520a == 33 && bVarD.f76521b == 0) {
                                    fVar.j(4);
                                    int iE = fVar.e(3);
                                    fVar.i();
                                    pair = null;
                                    ga.e.c cVarE = ga.e.e(fVar, true, iE, null);
                                    strA = fa.d.a(cVarE.f76522a, cVarE.f76523b, cVarE.f76524c, cVarE.f76525d, cVarE.f76526e, cVarE.f76527f);
                                    break loop0;
                                }
                                i14 = 3;
                            } else {
                                i14 = i17;
                            }
                            i19++;
                            i17 = i14;
                        }
                    }
                    i16++;
                }
                if (strA == null) {
                    pairD = pair;
                } else {
                    String strTrim = strA.trim();
                    int i24 = z.f70071a;
                    pairD = fa.d.b(strA, strTrim.split("\\.", -1), qVar.B);
                }
            }
        }
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = MimeTypes.VIDEO_DOLBY_VISION.equals(str);
        String str3 = this.f9271b;
        if (zEquals) {
            if (MimeTypes.VIDEO_H264.equals(str3)) {
                iIntValue = 8;
            } else if (MimeTypes.VIDEO_H265.equals(str3)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.f9278i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9273d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (z.f70071a <= 23 && MimeTypes.VIDEO_VP9.equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i15 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i15 = 512;
            } else if (iIntValue3 >= 60000000) {
                i15 = 256;
            } else if (iIntValue3 >= 30000000) {
                i15 = 128;
            } else if (iIntValue3 >= 18000000) {
                i15 = 64;
            } else if (iIntValue3 >= 12000000) {
                i15 = 32;
            } else if (iIntValue3 >= 7200000) {
                i15 = 16;
            } else if (iIntValue3 >= 3600000) {
                i15 = 8;
            } else if (iIntValue3 < 1800000) {
                i15 = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i15;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z14)) {
                if (!MimeTypes.VIDEO_H265.equals(str3) || 2 != iIntValue) {
                    return true;
                }
                String str4 = z.f70072b;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        g("codec.profileLevel, " + qVar.f8383k + ", " + str2);
        return false;
    }

    public final boolean d(q qVar) {
        int i14;
        int i15;
        String str = qVar.f8386n;
        String str2 = this.f9271b;
        if ((!str2.equals(str) && !str2.equals(MediaCodecUtil.b(qVar))) || !c(qVar, true)) {
            return false;
        }
        if (this.f9278i) {
            int i16 = qVar.f8393u;
            if (i16 > 0 && (i15 = qVar.f8394v) > 0) {
                return f(i16, i15, qVar.f8395w);
            }
        } else {
            int i17 = qVar.D;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9273d;
            if (i17 != -1) {
                if (codecCapabilities == null) {
                    g("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i17)) {
                    g("sampleRate.support, " + i17);
                    return false;
                }
            }
            int i18 = qVar.C;
            if (i18 != -1) {
                if (codecCapabilities == null) {
                    g("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    g("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((z.f70071a < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
                    if (MimeTypes.AUDIO_AC3.equals(str2)) {
                        i14 = 6;
                    } else {
                        i14 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
                    }
                    StringBuilder sbK = j.k(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.f9270a, ", [", " to ");
                    sbK.append(i14);
                    sbK.append("]");
                    k.g(sbK.toString());
                    maxInputChannelCount = i14;
                }
                if (maxInputChannelCount < i18) {
                    g("channelCount.support, " + i18);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(q qVar) {
        if (this.f9278i) {
            return this.f9274e;
        }
        Pair<Integer, Integer> pairD = MediaCodecUtil.d(qVar);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    public final boolean f(int i14, int i15, double d14) {
        String str;
        char c14;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z14;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9273d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i16 = z.f70071a;
        if (i16 >= 29) {
            if (i16 < 29 || (((bool = e.f9279a) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                c14 = 0;
            } else {
                s.w();
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointD = s.d(i14, i15, (int) d14);
                int i17 = 0;
                while (true) {
                    if (i17 >= supportedPerformancePoints.size()) {
                        c14 = 1;
                        break;
                    }
                    if (s.e(supportedPerformancePoints.get(i17)).covers(performancePointD)) {
                        c14 = 2;
                        break;
                    }
                    i17++;
                }
                if (c14 == 1 && e.f9279a == null) {
                    if (i16 >= 35) {
                        z14 = false;
                    } else {
                        int iA = e.a.a(false);
                        int iA2 = e.a.a(true);
                        if (iA != 0 && (iA2 != 0 ? iA == 2 && iA2 == 2 : iA == 2)) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                    }
                    e.f9279a = Boolean.valueOf(z14);
                    if (z14) {
                        c14 = 0;
                    }
                }
            }
            if (c14 != 2) {
                if (c14 == 1) {
                    StringBuilder sbJ = e5.j(i14, i15, "sizeAndRate.cover, ", "x", "@");
                    sbJ.append(d14);
                    g(sbJ.toString());
                    return false;
                }
                if (!a(videoCapabilities, i14, i15, d14)) {
                    if (i14 < i15) {
                        str = this.f9270a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbJ2 = e5.j(i14, i15, "sizeAndRate.rotated, ", "x", "@");
                            sbJ2.append(d14);
                            StringBuilder sbI = p6.b.i("AssumedSupport [", sbJ2.toString(), "] [", str, ", ");
                            sbI.append(this.f9271b);
                            sbI.append("] [");
                            sbI.append(z.f70075e);
                            sbI.append("]");
                            k.b(sbI.toString());
                            return true;
                        }
                        StringBuilder sbJ3 = e5.j(i14, i15, "sizeAndRate.rotated, ", "x", "@");
                        sbJ3.append(d14);
                        StringBuilder sbI2 = p6.b.i("AssumedSupport [", sbJ3.toString(), "] [", str, ", ");
                        sbI2.append(this.f9271b);
                        sbI2.append("] [");
                        sbI2.append(z.f70075e);
                        sbI2.append("]");
                        k.b(sbI2.toString());
                        return true;
                    }
                    StringBuilder sbJ4 = e5.j(i14, i15, "sizeAndRate.support, ", "x", "@");
                    sbJ4.append(d14);
                    g(sbJ4.toString());
                    return false;
                }
            }
        } else if (!a(videoCapabilities, i14, i15, d14)) {
            if (i14 < i15) {
                str = this.f9270a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(z.f70072b)) && a(videoCapabilities, i15, i14, d14)) {
                    StringBuilder sbJ5 = e5.j(i14, i15, "sizeAndRate.rotated, ", "x", "@");
                    sbJ5.append(d14);
                    StringBuilder sbI3 = p6.b.i("AssumedSupport [", sbJ5.toString(), "] [", str, ", ");
                    sbI3.append(this.f9271b);
                    sbI3.append("] [");
                    sbI3.append(z.f70075e);
                    sbI3.append("]");
                    k.b(sbI3.toString());
                    return true;
                }
            }
            StringBuilder sbJ6 = e5.j(i14, i15, "sizeAndRate.support, ", "x", "@");
            sbJ6.append(d14);
            g(sbJ6.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder sbL = hb.a.l("NoSupport [", str, "] [");
        sbL.append(this.f9270a);
        sbL.append(", ");
        sbL.append(this.f9271b);
        sbL.append("] [");
        sbL.append(z.f70075e);
        sbL.append("]");
        k.b(sbL.toString());
    }

    public final String toString() {
        return this.f9270a;
    }
}
