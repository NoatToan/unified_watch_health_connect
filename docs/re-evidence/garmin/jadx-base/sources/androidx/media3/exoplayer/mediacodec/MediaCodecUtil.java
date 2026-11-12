package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.i;
import androidx.media3.common.q;
import androidx.media3.common.x;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.InlineMe;
import fa.k;
import fa.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<b, List<androidx.media3.exoplayer.mediacodec.d>> f9248a = new HashMap<>();

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th3) {
            super("Failed to query underlying media codecs", th3);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9251c;

        public b(String str, boolean z14, boolean z15) {
            this.f9249a = str;
            this.f9250b = z14;
            this.f9251c = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f9249a, bVar.f9249a) && this.f9250b == bVar.f9250b && this.f9251c == bVar.f9251c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((wr.g.j(31, 31, this.f9249a) + (this.f9250b ? 1231 : 1237)) * 31) + (this.f9251c ? 1231 : 1237);
        }
    }

    public interface c {
        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int getCodecCount();

        MediaCodecInfo getCodecInfoAt(int i14);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    public static final class d implements c {
        private d() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final MediaCodecInfo getCodecInfoAt(int i14) {
            return MediaCodecList.getCodecInfoAt(i14);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean secureDecodersExplicit() {
            return false;
        }
    }

    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f9253b;

        public e(boolean z14, boolean z15) {
            this.f9252a = (z14 || z15) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final int getCodecCount() {
            if (this.f9253b == null) {
                this.f9253b = new MediaCodecList(this.f9252a).getCodecInfos();
            }
            return this.f9253b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final MediaCodecInfo getCodecInfoAt(int i14) {
            if (this.f9253b == null) {
                this.f9253b = new MediaCodecList(this.f9252a).getCodecInfos();
            }
            return this.f9253b[i14];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean secureDecodersExplicit() {
            return true;
        }
    }

    public interface f<T> {
        int getScore(T t7);
    }

    private MediaCodecUtil() {
    }

    public static void a(String str, ArrayList arrayList) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (z.f70071a < 26 && z.f70072b.equals("R9") && arrayList.size() == 1 && ((androidx.media3.exoplayer.mediacodec.d) arrayList.get(0)).f9270a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(androidx.media3.exoplayer.mediacodec.d.h("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false));
            }
            Collections.sort(arrayList, new a61.c(new p6.b(5), 15));
        }
        if (z.f70071a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((androidx.media3.exoplayer.mediacodec.d) arrayList.get(0)).f9270a)) {
            return;
        }
        arrayList.add((androidx.media3.exoplayer.mediacodec.d) arrayList.remove(0));
    }

    public static String b(q qVar) {
        Pair<Integer, Integer> pairD;
        String str = qVar.f8386n;
        String str2 = qVar.f8386n;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str2) && (pairD = d(qVar)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return MimeTypes.VIDEO_H265;
            }
            if (iIntValue == 512) {
                return MimeTypes.VIDEO_H264;
            }
            if (iIntValue == 1024) {
                return MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01be  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01da  */
    /* JADX WARN: Code duplicated, block: B:121:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:137:0x0202  */
    /* JADX WARN: Code duplicated, block: B:140:0x020a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0211  */
    /* JADX WARN: Code duplicated, block: B:144:0x0216  */
    /* JADX WARN: Code duplicated, block: B:145:0x021b  */
    /* JADX WARN: Code duplicated, block: B:146:0x021e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0221  */
    /* JADX WARN: Code duplicated, block: B:148:0x0224  */
    /* JADX WARN: Code duplicated, block: B:149:0x0227  */
    /* JADX WARN: Code duplicated, block: B:150:0x022a  */
    /* JADX WARN: Code duplicated, block: B:151:0x022d  */
    /* JADX WARN: Code duplicated, block: B:152:0x022f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0231  */
    /* JADX WARN: Code duplicated, block: B:154:0x0234  */
    /* JADX WARN: Code duplicated, block: B:156:0x0238  */
    /* JADX WARN: Code duplicated, block: B:158:0x024a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0262  */
    /* JADX WARN: Code duplicated, block: B:81:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Code duplicated, block: B:86:0x017b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0182  */
    /* JADX WARN: Code duplicated, block: B:89:0x0185  */
    /* JADX WARN: Code duplicated, block: B:92:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0192  */
    /* JADX WARN: Code duplicated, block: B:96:0x019b  */
    /* JADX WARN: Code duplicated, block: B:97:0x019f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:156:0x0238, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0161, please report this as an issue */
    @InlineMe(imports = {"androidx.media3.common.util.CodecSpecificDataUtil"}, replacement = "CodecSpecificDataUtil.getCodecProfileAndLevel(format)")
    @Deprecated
    public static Pair<Integer, Integer> d(q qVar) {
        byte b14;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        Integer num;
        byte b15;
        Integer num2;
        String str;
        byte b16;
        byte[] bArr = fa.d.f70005a;
        Integer num3 = 1;
        String str2 = qVar.f8383k;
        i iVar = qVar.B;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        int i26 = 16;
        if (!MimeTypes.VIDEO_DOLBY_VISION.equals(qVar.f8386n)) {
            String str3 = strArrSplit[0];
            str3.getClass();
            switch (str3) {
                case "av01":
                    b14 = 0;
                    break;
                case "avc1":
                    b14 = 1;
                    break;
                case "avc2":
                    b14 = 2;
                    break;
                case "hev1":
                    b14 = 3;
                    break;
                case "hvc1":
                    b14 = 4;
                    break;
                case "mp4a":
                    b14 = 5;
                    break;
                case "s263":
                    b14 = 6;
                    break;
                case "vp09":
                    b14 = 7;
                    break;
                default:
                    b14 = -1;
                    break;
            }
            int i27 = 16384;
            switch (b14) {
                case 0:
                    if (strArrSplit.length < 4) {
                        k.g("Ignoring malformed AV1 codec string: ".concat(str2));
                        return null;
                    }
                    try {
                        int i28 = Integer.parseInt(strArrSplit[1]);
                        int i29 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i30 = Integer.parseInt(strArrSplit[3]);
                        if (i28 != 0) {
                            fb1.c.r(i28, "Unknown AV1 profile: ");
                            return null;
                        }
                        if (i30 != 8 && i30 != 10) {
                            fb1.c.r(i30, "Unknown AV1 bit depth: ");
                            return null;
                        }
                        int i34 = i30 == 8 ? 1 : (iVar == null || !(iVar.f8318d != null || (i14 = iVar.f8317c) == 7 || i14 == 6)) ? 2 : 4096;
                        switch (i29) {
                            case 0:
                                i27 = 1;
                                break;
                            case 1:
                                i27 = 2;
                                break;
                            case 2:
                                i27 = 4;
                                break;
                            case 3:
                                i27 = 8;
                                break;
                            case 4:
                                i27 = 16;
                                break;
                            case 5:
                                i27 = 32;
                                break;
                            case 6:
                                i27 = 64;
                                break;
                            case 7:
                                i27 = 128;
                                break;
                            case 8:
                                i27 = 256;
                                break;
                            case 9:
                                i27 = 512;
                                break;
                            case 10:
                                i27 = 1024;
                                break;
                            case 11:
                                i27 = 2048;
                                break;
                            case 12:
                                i27 = 4096;
                                break;
                            case 13:
                                i27 = 8192;
                                break;
                            case 14:
                                break;
                            case 15:
                                i27 = 32768;
                                break;
                            case 16:
                                i27 = 65536;
                                break;
                            case 17:
                                i27 = 131072;
                                break;
                            case 18:
                                i27 = GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                                break;
                            case 19:
                                i27 = 524288;
                                break;
                            case 20:
                                i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                break;
                            case 21:
                                i27 = 2097152;
                                break;
                            case 22:
                                i27 = 4194304;
                                break;
                            case 23:
                                i27 = 8388608;
                                break;
                            default:
                                i27 = -1;
                                break;
                        }
                        if (i27 != -1) {
                            return new Pair<>(Integer.valueOf(i34), Integer.valueOf(i27));
                        }
                        fb1.c.r(i29, "Unknown AV1 level: ");
                        return null;
                    } catch (NumberFormatException unused) {
                        k.g("Ignoring malformed AV1 codec string: ".concat(str2));
                    }
                    break;
                case 1:
                case 2:
                    if (strArrSplit.length < 2) {
                        k.g("Ignoring malformed AVC codec string: ".concat(str2));
                        return null;
                    }
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i15 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i16 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else {
                            if (strArrSplit.length < 3) {
                                k.g("Ignoring malformed AVC codec string: ".concat(str2));
                                return null;
                            }
                            i15 = Integer.parseInt(strArrSplit[1]);
                            i16 = Integer.parseInt(strArrSplit[2]);
                        }
                        if (i15 == 66) {
                            i17 = -1;
                            i18 = 1;
                        } else if (i15 == 77) {
                            i17 = -1;
                            i18 = 2;
                        } else if (i15 == 88) {
                            i17 = -1;
                            i18 = 4;
                        } else if (i15 != 100) {
                            if (i15 == 110) {
                                i18 = 16;
                            } else if (i15 == 122) {
                                i18 = 32;
                            } else if (i15 != 244) {
                                i17 = -1;
                                i18 = -1;
                            } else {
                                i18 = 64;
                            }
                            i17 = -1;
                        } else {
                            i17 = -1;
                            i18 = 8;
                        }
                        if (i18 == i17) {
                            fb1.c.r(i15, "Unknown AVC profile: ");
                            return null;
                        }
                        switch (i16) {
                            case 10:
                                i27 = 1;
                                break;
                            case 11:
                                i27 = 4;
                                break;
                            case 12:
                                i27 = 8;
                                break;
                            case 13:
                                i27 = 16;
                                break;
                            default:
                                switch (i16) {
                                    case 20:
                                        i27 = 32;
                                        break;
                                    case 21:
                                        i27 = 64;
                                        break;
                                    case 22:
                                        i27 = 128;
                                        break;
                                    default:
                                        switch (i16) {
                                            case 30:
                                                i27 = 256;
                                                break;
                                            case 31:
                                                i27 = 512;
                                                break;
                                            case 32:
                                                i27 = 1024;
                                                break;
                                            default:
                                                switch (i16) {
                                                    case 40:
                                                        i27 = 2048;
                                                        break;
                                                    case 41:
                                                        i27 = 4096;
                                                        break;
                                                    case 42:
                                                        i27 = 8192;
                                                        break;
                                                    default:
                                                        switch (i16) {
                                                            case 50:
                                                                break;
                                                            case 51:
                                                                i27 = 32768;
                                                                break;
                                                            case 52:
                                                                i27 = 65536;
                                                                break;
                                                            default:
                                                                i27 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i27 != -1) {
                            return new Pair<>(Integer.valueOf(i18), Integer.valueOf(i27));
                        }
                        fb1.c.r(i16, "Unknown AVC level: ");
                        return null;
                    } catch (NumberFormatException unused2) {
                        k.g("Ignoring malformed AVC codec string: ".concat(str2));
                    }
                    break;
                case 3:
                case 4:
                    return fa.d.b(str2, strArrSplit, iVar);
                case 5:
                    if (strArrSplit.length != 3) {
                        k.g("Ignoring malformed MP4A codec string: ".concat(str2));
                        return null;
                    }
                    try {
                        if (MimeTypes.AUDIO_AAC.equals(x.e(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i35 = Integer.parseInt(strArrSplit[2]);
                            int i36 = 17;
                            if (i35 == 17) {
                                i19 = -1;
                            } else {
                                if (i35 != 20) {
                                    i36 = 23;
                                    if (i35 != 23) {
                                        i36 = 29;
                                        if (i35 != 29) {
                                            i36 = 39;
                                            if (i35 != 39) {
                                                i36 = 42;
                                                if (i35 != 42) {
                                                    switch (i35) {
                                                        case 1:
                                                            i19 = -1;
                                                            i36 = 1;
                                                            break;
                                                        case 2:
                                                            i19 = -1;
                                                            i36 = 2;
                                                            break;
                                                        case 3:
                                                            i19 = -1;
                                                            i36 = 3;
                                                            break;
                                                        case 4:
                                                            i19 = -1;
                                                            i36 = 4;
                                                            break;
                                                        case 5:
                                                            i19 = -1;
                                                            i36 = 5;
                                                            break;
                                                        case 6:
                                                            i19 = -1;
                                                            i36 = 6;
                                                            break;
                                                        default:
                                                            i19 = -1;
                                                            i36 = -1;
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i36 = 20;
                                }
                                i19 = -1;
                            }
                            if (i36 != i19) {
                                return new Pair<>(Integer.valueOf(i36), 0);
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        k.g("Ignoring malformed MP4A codec string: ".concat(str2));
                    }
                    break;
                case 6:
                    Pair<Integer, Integer> pair = new Pair<>(num3, num3);
                    if (strArrSplit.length < 3) {
                        k.g("Ignoring malformed H263 codec string: ".concat(str2));
                        return pair;
                    }
                    try {
                        return new Pair<>(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                    } catch (NumberFormatException unused4) {
                        k.g("Ignoring malformed H263 codec string: ".concat(str2));
                        return pair;
                    }
                case 7:
                    if (strArrSplit.length < 3) {
                        k.g("Ignoring malformed VP9 codec string: ".concat(str2));
                        return null;
                    }
                    try {
                        int i37 = Integer.parseInt(strArrSplit[1]);
                        int i38 = Integer.parseInt(strArrSplit[2]);
                        if (i37 == 0) {
                            i24 = 1;
                        } else if (i37 == 1) {
                            i24 = 2;
                        } else if (i37 != 2) {
                            i24 = i37 != 3 ? -1 : 8;
                        } else {
                            i24 = 4;
                        }
                        if (i24 == -1) {
                            fb1.c.r(i37, "Unknown VP9 profile: ");
                            return null;
                        }
                        if (i38 == 10) {
                            i25 = -1;
                            i26 = 1;
                        } else if (i38 == 11) {
                            i25 = -1;
                            i26 = 2;
                        } else if (i38 == 20) {
                            i25 = -1;
                            i26 = 4;
                        } else if (i38 == 21) {
                            i25 = -1;
                            i26 = 8;
                        } else if (i38 == 30) {
                            i25 = -1;
                        } else {
                            if (i38 == 31) {
                                i26 = 32;
                            } else if (i38 == 40) {
                                i26 = 64;
                            } else if (i38 == 41) {
                                i26 = 128;
                            } else if (i38 == 50) {
                                i26 = 256;
                            } else if (i38 != 51) {
                                switch (i38) {
                                    case 60:
                                        i26 = 2048;
                                        break;
                                    case 61:
                                        i26 = 4096;
                                        break;
                                    case 62:
                                        i26 = 8192;
                                        break;
                                    default:
                                        i25 = -1;
                                        i26 = -1;
                                        break;
                                }
                            } else {
                                i26 = 512;
                            }
                            i25 = -1;
                        }
                        if (i26 != i25) {
                            return new Pair<>(Integer.valueOf(i24), Integer.valueOf(i26));
                        }
                        fb1.c.r(i38, "Unknown VP9 level: ");
                        return null;
                    } catch (NumberFormatException unused5) {
                        k.g("Ignoring malformed VP9 codec string: ".concat(str2));
                    }
                    break;
                default:
                    return null;
            }
            return null;
        }
        if (strArrSplit.length < 3) {
            k.g("Ignoring malformed Dolby Vision codec string: ".concat(str2));
            return null;
        }
        Matcher matcher = fa.d.f70007c.matcher(strArrSplit[1]);
        if (!matcher.matches()) {
            k.g("Ignoring malformed Dolby Vision codec string: ".concat(str2));
            return null;
        }
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            switch (strGroup.hashCode()) {
                case 1536:
                    num = 4;
                    b15 = !strGroup.equals("00") ? (byte) -1 : (byte) 0;
                    break;
                case 1537:
                    if (!strGroup.equals("01")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 1;
                    }
                    break;
                case 1538:
                    if (!strGroup.equals("02")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 2;
                    }
                    break;
                case 1539:
                    if (!strGroup.equals("03")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 3;
                    }
                    break;
                case 1540:
                    if (!strGroup.equals("04")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 4;
                    }
                    break;
                case 1541:
                    if (!strGroup.equals("05")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 5;
                    }
                    break;
                case 1542:
                    if (!strGroup.equals("06")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 6;
                    }
                    break;
                case 1543:
                    if (!strGroup.equals("07")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 7;
                    }
                    break;
                case 1544:
                    if (!strGroup.equals("08")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 8;
                    }
                    break;
                case 1545:
                    if (!strGroup.equals("09")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 9;
                    }
                    break;
                case 1567:
                    if (!strGroup.equals("10")) {
                        num = 4;
                    } else {
                        num = 4;
                        b15 = 10;
                    }
                    break;
                default:
                    num = 4;
                    break;
            }
            switch (b15) {
                case 0:
                    num2 = num3;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = num;
                    break;
                case 3:
                    num2 = 8;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case 8:
                    num2 = 256;
                    break;
                case 9:
                    num2 = 512;
                    break;
                case 10:
                    num2 = 1024;
                    break;
            }
            if (num2 == null) {
                k.g("Unknown Dolby Vision profile string: " + strGroup);
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str.hashCode()) {
                    case 1537:
                        if (str.equals("01")) {
                            b16 = -1;
                        } else {
                            b16 = 0;
                        }
                        break;
                    case 1538:
                        if (str.equals("02")) {
                            b16 = -1;
                        } else {
                            b16 = 1;
                        }
                        break;
                    case 1539:
                        if (str.equals("03")) {
                            b16 = -1;
                        } else {
                            b16 = 2;
                        }
                        break;
                    case 1540:
                        if (str.equals("04")) {
                            b16 = -1;
                        } else {
                            b16 = 3;
                        }
                        break;
                    case 1541:
                        if (str.equals("05")) {
                            b16 = -1;
                        } else {
                            b16 = 4;
                        }
                        break;
                    case 1542:
                        if (str.equals("06")) {
                            b16 = -1;
                        } else {
                            b16 = 5;
                        }
                        break;
                    case 1543:
                        if (str.equals("07")) {
                            b16 = -1;
                        } else {
                            b16 = 6;
                        }
                        break;
                    case 1544:
                        if (str.equals("08")) {
                            b16 = -1;
                        } else {
                            b16 = 7;
                        }
                        break;
                    case 1545:
                        if (str.equals("09")) {
                            b16 = -1;
                        } else {
                            b16 = 8;
                        }
                        break;
                    case 1567:
                        if (str.equals("10")) {
                            b16 = -1;
                        } else {
                            b16 = 9;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            b16 = -1;
                        } else {
                            b16 = 10;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            b16 = -1;
                        } else {
                            b16 = Ascii.VT;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            b16 = -1;
                        } else {
                            b16 = Ascii.FF;
                        }
                        break;
                    default:
                        b16 = -1;
                        break;
                }
                switch (b16) {
                    case 0:
                        break;
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = num;
                        break;
                    case 3:
                        num3 = 8;
                        break;
                    case 4:
                        num3 = 16;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = 128;
                        break;
                    case 8:
                        num3 = 256;
                        break;
                    case 9:
                        num3 = 512;
                        break;
                    case 10:
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case 12:
                        num3 = 4096;
                        break;
                    default:
                        num3 = null;
                        break;
                }
            } else {
                num3 = null;
            }
            if (num3 == null) {
                return new Pair<>(num2, num3);
            }
            k.g("Unknown Dolby Vision level string: " + str);
            return null;
        }
        num = 4;
        num2 = null;
        if (num2 == null) {
            k.g("Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        str = strArrSplit[2];
        if (str == null) {
            switch (str.hashCode()) {
                case 1537:
                    if (str.equals("01")) {
                        b16 = 0;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1538:
                    if (str.equals("02")) {
                        b16 = 1;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1539:
                    if (str.equals("03")) {
                        b16 = 2;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1540:
                    if (str.equals("04")) {
                        b16 = 3;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1541:
                    if (str.equals("05")) {
                        b16 = 4;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1542:
                    if (str.equals("06")) {
                        b16 = 5;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1543:
                    if (str.equals("07")) {
                        b16 = 6;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1544:
                    if (str.equals("08")) {
                        b16 = 7;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1545:
                    if (str.equals("09")) {
                        b16 = 8;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1567:
                    if (str.equals("10")) {
                        b16 = 9;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1568:
                    if (str.equals("11")) {
                        b16 = 10;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1569:
                    if (str.equals("12")) {
                        b16 = Ascii.VT;
                    } else {
                        b16 = -1;
                    }
                    break;
                case 1570:
                    if (str.equals("13")) {
                        b16 = Ascii.FF;
                    } else {
                        b16 = -1;
                    }
                    break;
                default:
                    b16 = -1;
                    break;
            }
            switch (b16) {
                case 0:
                    break;
                case 1:
                    num3 = 2;
                    break;
                case 2:
                    num3 = num;
                    break;
                case 3:
                    num3 = 8;
                    break;
                case 4:
                    num3 = 16;
                    break;
                case 5:
                    num3 = 32;
                    break;
                case 6:
                    num3 = 64;
                    break;
                case 7:
                    num3 = 128;
                    break;
                case 8:
                    num3 = 256;
                    break;
                case 9:
                    num3 = 512;
                    break;
                case 10:
                    num3 = 1024;
                    break;
                case 11:
                    num3 = 2048;
                    break;
                case 12:
                    num3 = 4096;
                    break;
                default:
                    num3 = null;
                    break;
            }
        } else {
            num3 = null;
        }
        if (num3 == null) {
            return new Pair<>(num2, num3);
        }
        k.g("Unknown Dolby Vision level string: " + str);
        return null;
    }

    public static synchronized List<androidx.media3.exoplayer.mediacodec.d> e(String str, boolean z14, boolean z15) {
        try {
            b bVar = new b(str, z14, z15);
            HashMap<b, List<androidx.media3.exoplayer.mediacodec.d>> map = f9248a;
            List<androidx.media3.exoplayer.mediacodec.d> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList<androidx.media3.exoplayer.mediacodec.d> arrayListF = f(bVar, new e(z14, z15));
            if (z14 && arrayListF.isEmpty() && z.f70071a <= 23) {
                arrayListF = f(bVar, new d());
                if (!arrayListF.isEmpty()) {
                    k.g("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListF.get(0).f9270a);
                }
            }
            a(str, arrayListF);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListF);
            map.put(bVar, immutableListCopyOf);
            return immutableListCopyOf;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117 A[Catch: Exception -> 0x0161, TryCatch #4 {Exception -> 0x0161, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:76:0x0136, B:10:0x0035, B:13:0x0040, B:71:0x0111, B:73:0x0117, B:75:0x011d, B:77:0x013e, B:78:0x015f), top: B:91:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:95:0x013e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static ArrayList<androidx.media3.exoplayer.mediacodec.d> f(b bVar, c cVar) throws DecoderQueryException {
        boolean z14;
        String str;
        int i14;
        int i15;
        b bVar2 = bVar;
        boolean z15 = bVar2.f9250b;
        try {
            ArrayList<androidx.media3.exoplayer.mediacodec.d> arrayList = new ArrayList<>();
            String str2 = bVar2.f9249a;
            int codecCount = cVar.getCodecCount();
            boolean zSecureDecodersExplicit = cVar.secureDecodersExplicit();
            int i16 = 0;
            while (i16 < codecCount) {
                MediaCodecInfo codecInfoAt = cVar.getCodecInfoAt(i16);
                int i17 = z.f70071a;
                if (i17 < 29 || !codecInfoAt.isAlias()) {
                    String name = codecInfoAt.getName();
                    if (h(codecInfoAt, name, zSecureDecodersExplicit, str2)) {
                        int i18 = i16;
                        String strC = c(codecInfoAt, name, str2);
                        if (strC == null) {
                            z14 = zSecureDecodersExplicit;
                            i14 = i18;
                        } else {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(strC);
                                boolean zIsFeatureSupported = cVar.isFeatureSupported("tunneled-playback", strC, capabilitiesForType);
                                boolean zA = cVar.a("tunneled-playback", capabilitiesForType);
                                boolean z16 = bVar2.f9251c;
                                if (!z16 && zA) {
                                    z14 = zSecureDecodersExplicit;
                                    i14 = i18;
                                } else if (!z16 || zIsFeatureSupported) {
                                    boolean zIsFeatureSupported2 = cVar.isFeatureSupported("secure-playback", strC, capabilitiesForType);
                                    boolean zA2 = cVar.a("secure-playback", capabilitiesForType);
                                    if (!z15 && zA2) {
                                        z14 = zSecureDecodersExplicit;
                                        i14 = i18;
                                    } else if (!z15 || zIsFeatureSupported2) {
                                        boolean zIsVendor = true;
                                        boolean zIsHardwareAccelerated = i17 >= 29 ? codecInfoAt.isHardwareAccelerated() : !i(codecInfoAt, str2);
                                        z14 = zSecureDecodersExplicit;
                                        try {
                                            boolean zI = i(codecInfoAt, str2);
                                            if (i17 >= 29) {
                                                zIsVendor = codecInfoAt.isVendor();
                                            } else {
                                                String lowerCase = Ascii.toLowerCase(codecInfoAt.getName());
                                                if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!(z14 && z15 == zIsFeatureSupported2) && (z14 || z15)) {
                                                boolean z17 = zIsHardwareAccelerated;
                                                i15 = i18;
                                                boolean z18 = zIsVendor;
                                                if (!z14 && zIsFeatureSupported2) {
                                                    i14 = i15;
                                                    str = name;
                                                    try {
                                                        arrayList.add(androidx.media3.exoplayer.mediacodec.d.h(name + ".secure", str2, strC, capabilitiesForType, z17, zI, z18, true));
                                                        break;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        if (z.f70071a <= 23) {
                                                        }
                                                        k.c("Failed to query codec " + str + " (" + strC + ")");
                                                        throw e;
                                                    }
                                                }
                                            } else {
                                                boolean z19 = zIsHardwareAccelerated;
                                                i15 = i18;
                                                try {
                                                    arrayList.add(androidx.media3.exoplayer.mediacodec.d.h(name, str2, strC, capabilitiesForType, z19, zI, zIsVendor, false));
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    i14 = i15;
                                                    str = name;
                                                    if (z.f70071a <= 23 || arrayList.isEmpty()) {
                                                        k.c("Failed to query codec " + str + " (" + strC + ")");
                                                        throw e;
                                                    }
                                                    k.c("Skipping codec " + str + " (failed to query capabilities)");
                                                }
                                            }
                                            i14 = i15;
                                        } catch (Exception e15) {
                                            e = e15;
                                            str = name;
                                            i14 = i18;
                                            if (z.f70071a <= 23) {
                                            }
                                            k.c("Failed to query codec " + str + " (" + strC + ")");
                                            throw e;
                                        }
                                    } else {
                                        z14 = zSecureDecodersExplicit;
                                        i14 = i18;
                                    }
                                } else {
                                    z14 = zSecureDecodersExplicit;
                                    i14 = i18;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                z14 = zSecureDecodersExplicit;
                                str = name;
                            }
                        }
                    } else {
                        z14 = zSecureDecodersExplicit;
                        i14 = i16;
                    }
                } else {
                    z14 = zSecureDecodersExplicit;
                    i14 = i16;
                }
                i16 = i14 + 1;
                bVar2 = bVar;
                zSecureDecodersExplicit = z14;
            }
            return arrayList;
        } catch (Exception e17) {
            throw new DecoderQueryException(e17);
        }
    }

    public static ImmutableList g(androidx.media3.exoplayer.mediacodec.f fVar, q qVar, boolean z14, boolean z15) {
        List<androidx.media3.exoplayer.mediacodec.d> decoderInfos = fVar.getDecoderInfos(qVar.f8386n, z14, z15);
        String strB = b(qVar);
        return ImmutableList.builder().addAll((Iterable) decoderInfos).addAll((Iterable) (strB == null ? ImmutableList.of() : fVar.getDecoderInfos(strB, z14, z15))).build();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z14, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z14 && str.endsWith(".secure")) {
            return false;
        }
        int i14 = z.f70071a;
        if (i14 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(z.f70073c))) {
            String str3 = z.f70072b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i14 <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (z.f70071a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (x.j(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }
}
