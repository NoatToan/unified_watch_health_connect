package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.video.ColorInfo;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.onetrack.util.z;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.ayf;
import defpackage.b4s;
import defpackage.fk1;
import defpackage.toe;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7967a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("MediaCodecUtil.class")
    public static final HashMap<b, List<com.google.android.exoplayer2.mediacodec.c>> f7968b = new HashMap<>();
    public static int c = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7970b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.f7969a = str;
            this.f7970b = z;
            this.c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f7969a, bVar.f7969a) && this.f7970b == bVar.f7970b && this.c == bVar.c;
        }

        public int hashCode() {
            return ((((this.f7969a.hashCode() + 31) * 31) + (this.f7970b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    public interface c {
        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        MediaCodecInfo b(int i);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    public static final class d implements c {
        public d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo b(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    @RequiresApi(21)
    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f7972b;

        public e(boolean z, boolean z2) {
            this.f7971a = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo b(int i) {
            f();
            return this.f7972b[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.f7972b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }

        public final void f() {
            if (this.f7972b == null) {
                this.f7972b = new MediaCodecList(this.f7971a).getCodecInfos();
            }
        }
    }

    public interface f<T> {
        int a(T t);
    }

    @RequiresApi(29)
    public static boolean A(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean B(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = wlq.f38110a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = wlq.f38111b;
            if ("a70".equals(str3) || ("Xiaomi".equals(wlq.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = wlq.f38111b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = wlq.f38111b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && RomUtils.SAMSUNG.equals(wlq.c))) {
            String str6 = wlq.f38111b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && RomUtils.SAMSUNG.equals(wlq.c)) {
            String str7 = wlq.f38111b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && wlq.f38111b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean C(MediaCodecInfo mediaCodecInfo) {
        return wlq.f38110a >= 29 ? D(mediaCodecInfo) : !E(mediaCodecInfo);
    }

    @RequiresApi(29)
    public static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean E(MediaCodecInfo mediaCodecInfo) {
        if (wlq.f38110a >= 29) {
            return F(mediaCodecInfo);
        }
        String strE = fk1.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        return strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.") || (strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.") || !(strE.startsWith("omx.") || strE.startsWith("c2."));
    }

    @RequiresApi(29)
    public static boolean F(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean G(MediaCodecInfo mediaCodecInfo) {
        if (wlq.f38110a >= 29) {
            return H(mediaCodecInfo);
        }
        String strE = fk1.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    @RequiresApi(29)
    public static boolean H(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int I(com.google.android.exoplayer2.mediacodec.c cVar) {
        String str = cVar.f7979a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (wlq.f38110a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int J(com.google.android.exoplayer2.mediacodec.c cVar) {
        return cVar.f7979a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int K(Format format, com.google.android.exoplayer2.mediacodec.c cVar) {
        try {
            return cVar.m(format) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    public static /* synthetic */ int L(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static int M() throws DecoderQueryException {
        if (c == -1) {
            int iMax = 0;
            com.google.android.exoplayer2.mediacodec.c cVarQ = q("video/avc", false, false);
            if (cVarQ != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = cVarQ.g();
                int length = codecProfileLevelArrG.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(h(codecProfileLevelArrG[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, wlq.f38110a >= 21 ? 345600 : 172800);
            }
            c = iMax;
        }
        return c;
    }

    public static int N(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static <T> void O(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: ejf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.L(fVar, obj, obj2);
            }
        });
    }

    public static int P(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static int Q(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void e(String str, List<com.google.android.exoplayer2.mediacodec.c> list) {
        if ("audio/raw".equals(str)) {
            if (wlq.f38110a < 26 && wlq.f38111b.equals("R9") && list.size() == 1 && list.get(0).f7979a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(com.google.android.exoplayer2.mediacodec.c.A("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            O(list, new f() { // from class: bjf
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    return MediaCodecUtil.I((c) obj);
                }
            });
        }
        int i = wlq.f38110a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f7979a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                O(list, new f() { // from class: cjf
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int a(Object obj) {
                        return MediaCodecUtil.J((c) obj);
                    }
                });
            }
        }
        if (i >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f7979a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static int f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return EventRecurrence.TH;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            default:
                return -1;
        }
    }

    public static int g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    public static int i(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer j(String str) {
        if (str == null) {
            return null;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case CommonConstants.Mgc.RECHARGE_ID_ERROR /* 1537 */:
                if (str.equals("01")) {
                    b2 = 0;
                }
                break;
            case CommonConstants.Mgc.SING_EMPTY_ERROR /* 1538 */:
                if (str.equals("02")) {
                    b2 = 1;
                }
                break;
            case CommonConstants.Mgc.PAGE_MAX_ERROR /* 1539 */:
                if (str.equals("03")) {
                    b2 = 2;
                }
                break;
            case CommonConstants.Mgc.PAGE_SIZE_ERROR /* 1540 */:
                if (str.equals("04")) {
                    b2 = 3;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b2 = 4;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b2 = 5;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b2 = 6;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b2 = 7;
                }
                break;
            case 1545:
                if (str.equals(b4s.APPLY_CHANNEL_TOKEN2_ONE_CLICK_BIND_CARD)) {
                    b2 = 8;
                }
                break;
            case 1567:
                if (str.equals(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
                    b2 = 9;
                }
                break;
            case 1568:
                if (str.equals(b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD)) {
                    b2 = 10;
                }
                break;
            case CommonConstants.Mgc.ORDER_EXPIRED_ERROR /* 1569 */:
                if (str.equals("12")) {
                    b2 = 11;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }

    public static Integer k(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            default:
                return null;
        }
    }

    public static Pair<Integer, Integer> l(String str, String[] strArr) {
        int iN;
        if (strArr.length != 3) {
            String strValueOf = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if (MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE.equals(ayf.h(Integer.parseInt(strArr[1], 16))) && (iN = N(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iN), 0);
            }
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    public static Pair<Integer, Integer> m(String str, String[] strArr, ColorInfo colorInfo) {
        int i;
        if (strArr.length < 4) {
            String strValueOf = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i2 = 1;
        try {
            int i3 = Integer.parseInt(strArr[1]);
            int i4 = Integer.parseInt(strArr[2].substring(0, 2));
            int i5 = Integer.parseInt(strArr[3]);
            if (i3 != 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown AV1 profile: ");
                sb.append(i3);
                toe.h("MediaCodecUtil", sb.toString());
                return null;
            }
            if (i5 != 8 && i5 != 10) {
                StringBuilder sb2 = new StringBuilder(34);
                sb2.append("Unknown AV1 bit depth: ");
                sb2.append(i5);
                toe.h("MediaCodecUtil", sb2.toString());
                return null;
            }
            if (i5 != 8) {
                i2 = (colorInfo == null || !(colorInfo.d != null || (i = colorInfo.c) == 7 || i == 6)) ? 2 : 4096;
            }
            int iF = f(i4);
            if (iF != -1) {
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(iF));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown AV1 level: ");
            sb3.append(i4);
            toe.h("MediaCodecUtil", sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    public static Pair<Integer, Integer> n(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            String strValueOf = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    String strValueOf2 = String.valueOf(str);
                    toe.h("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            }
            int i4 = i(i2);
            if (i4 == -1) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown AVC profile: ");
                sb.append(i2);
                toe.h("MediaCodecUtil", sb.toString());
                return null;
            }
            int iG = g(i);
            if (iG != -1) {
                return new Pair<>(Integer.valueOf(i4), Integer.valueOf(iG));
            }
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unknown AVC level: ");
            sb2.append(i);
            toe.h("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf3 = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    public static String o(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    public static Pair<Integer, Integer> p(Format format) {
        String str = format.i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(z.f14007a);
        if ("video/dolby-vision".equals(format.l)) {
            return v(format.i, strArrSplit);
        }
        byte b2 = 0;
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    b2 = -1;
                }
                break;
            case 3006243:
                b2 = !str2.equals("avc1") ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b2 = !str2.equals("avc2") ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b2 = !str2.equals("hev1") ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b2 = !str2.equals("hvc1") ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b2 = !str2.equals("mp4a") ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b2 = !str2.equals("vp09") ? (byte) -1 : (byte) 6;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return m(format.i, strArrSplit, format.x);
            case 1:
            case 2:
                return n(format.i, strArrSplit);
            case 3:
            case 4:
                return w(format.i, strArrSplit);
            case 5:
                return l(format.i, strArrSplit);
            case 6:
                return x(format.i, strArrSplit);
            default:
                return null;
        }
    }

    public static com.google.android.exoplayer2.mediacodec.c q(String str, boolean z, boolean z2) throws DecoderQueryException {
        List<com.google.android.exoplayer2.mediacodec.c> listR = r(str, z, z2);
        if (listR.isEmpty()) {
            return null;
        }
        return listR.get(0);
    }

    public static synchronized List<com.google.android.exoplayer2.mediacodec.c> r(String str, boolean z, boolean z2) throws DecoderQueryException {
        try {
            b bVar = new b(str, z, z2);
            HashMap<b, List<com.google.android.exoplayer2.mediacodec.c>> map = f7968b;
            List<com.google.android.exoplayer2.mediacodec.c> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            int i = wlq.f38110a;
            ArrayList<com.google.android.exoplayer2.mediacodec.c> arrayListS = s(bVar, i >= 21 ? new e(z, z2) : new d());
            if (z && arrayListS.isEmpty() && 21 <= i && i <= 23) {
                arrayListS = s(bVar, new d());
                if (!arrayListS.isEmpty()) {
                    String str2 = arrayListS.get(0).f7979a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    toe.h("MediaCodecUtil", sb.toString());
                }
            }
            e(str, arrayListS);
            List<com.google.android.exoplayer2.mediacodec.c> listUnmodifiableList = Collections.unmodifiableList(arrayListS);
            map.put(bVar, listUnmodifiableList);
            return listUnmodifiableList;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public static ArrayList<com.google.android.exoplayer2.mediacodec.c> s(b bVar, c cVar) throws DecoderQueryException {
        String strO;
        String str;
        String str2;
        int i;
        boolean z;
        int i2;
        try {
            ArrayList<com.google.android.exoplayer2.mediacodec.c> arrayList = new ArrayList<>();
            String str3 = bVar.f7969a;
            int iD = cVar.d();
            boolean zE = cVar.e();
            int i3 = 0;
            while (i3 < iD) {
                MediaCodecInfo mediaCodecInfoB = cVar.b(i3);
                if (z(mediaCodecInfoB)) {
                    i = i3;
                    z = zE;
                    i2 = iD;
                } else {
                    String name = mediaCodecInfoB.getName();
                    if (B(mediaCodecInfoB, name, zE, str3) && (strO = o(mediaCodecInfoB, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strO);
                            boolean zC = cVar.c("tunneled-playback", strO, capabilitiesForType);
                            boolean zA = cVar.a("tunneled-playback", strO, capabilitiesForType);
                            boolean z2 = bVar.c;
                            if ((z2 || !zA) && (!z2 || zC)) {
                                boolean zC2 = cVar.c("secure-playback", strO, capabilitiesForType);
                                boolean zA2 = cVar.a("secure-playback", strO, capabilitiesForType);
                                boolean z3 = bVar.f7970b;
                                if ((z3 || !zA2) && (!z3 || zC2)) {
                                    boolean zC3 = C(mediaCodecInfoB);
                                    boolean zE2 = E(mediaCodecInfoB);
                                    boolean zG = G(mediaCodecInfoB);
                                    if (zE && bVar.f7970b == zC2) {
                                        str = strO;
                                        str2 = name;
                                        i = i3;
                                        z = zE;
                                        i2 = iD;
                                        arrayList.add(com.google.android.exoplayer2.mediacodec.c.A(name, str3, strO, capabilitiesForType, zC3, zE2, zG, false, false));
                                    } else if (zE || bVar.f7970b) {
                                        str = strO;
                                        str2 = name;
                                        i = i3;
                                        z = zE;
                                        i2 = iD;
                                        if (!z && zC2) {
                                            arrayList.add(com.google.android.exoplayer2.mediacodec.c.A(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, zC3, zE2, zG, false, true));
                                            return arrayList;
                                        }
                                    } else {
                                        str = strO;
                                        str2 = name;
                                        i = i3;
                                        z = zE;
                                        i2 = iD;
                                        try {
                                            arrayList.add(com.google.android.exoplayer2.mediacodec.c.A(name, str3, strO, capabilitiesForType, zC3, zE2, zG, false, false));
                                        } catch (Exception e2) {
                                            e = e2;
                                            if (wlq.f38110a > 23 || arrayList.isEmpty()) {
                                                String str4 = str2;
                                                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 25 + str.length());
                                                sb.append("Failed to query codec ");
                                                sb.append(str4);
                                                sb.append(" (");
                                                sb.append(str);
                                                sb.append(")");
                                                toe.c("MediaCodecUtil", sb.toString());
                                                throw e;
                                            }
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                            sb2.append("Skipping codec ");
                                            sb2.append(str2);
                                            sb2.append(" (failed to query capabilities)");
                                            toe.c("MediaCodecUtil", sb2.toString());
                                        }
                                    }
                                } else {
                                    i = i3;
                                    z = zE;
                                    i2 = iD;
                                }
                            } else {
                                i = i3;
                                z = zE;
                                i2 = iD;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str = strO;
                            str2 = name;
                            i = i3;
                            z = zE;
                            i2 = iD;
                        }
                    } else {
                        i = i3;
                        z = zE;
                        i2 = iD;
                    }
                }
                i3 = i + 1;
                iD = i2;
                zE = z;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new DecoderQueryException(e4);
        }
    }

    @CheckResult
    public static List<com.google.android.exoplayer2.mediacodec.c> t(List<com.google.android.exoplayer2.mediacodec.c> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        O(arrayList, new f() { // from class: djf
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.K(format, (c) obj);
            }
        });
        return arrayList;
    }

    public static com.google.android.exoplayer2.mediacodec.c u() throws DecoderQueryException {
        return q("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> v(String str, String[] strArr) {
        if (strArr.length < 3) {
            String strValueOf = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f7967a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numK = k(strGroup);
        if (numK == null) {
            String strValueOf3 = String.valueOf(strGroup);
            toe.h("MediaCodecUtil", strValueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(strValueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer numJ = j(str2);
        if (numJ != null) {
            return new Pair<>(numK, numJ);
        }
        String strValueOf4 = String.valueOf(str2);
        toe.h("MediaCodecUtil", strValueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(strValueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    public static Pair<Integer, Integer> w(String str, String[] strArr) {
        if (strArr.length < 4) {
            String strValueOf = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i = 1;
        Matcher matcher = f7967a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                String strValueOf3 = String.valueOf(strGroup);
                toe.h("MediaCodecUtil", strValueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            i = 2;
        }
        String str2 = strArr[3];
        Integer numY = y(str2);
        if (numY != null) {
            return new Pair<>(Integer.valueOf(i), numY);
        }
        String strValueOf4 = String.valueOf(str2);
        toe.h("MediaCodecUtil", strValueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    public static Pair<Integer, Integer> x(String str, String[] strArr) {
        if (strArr.length < 3) {
            String strValueOf = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iQ = Q(i);
            if (iQ == -1) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown VP9 profile: ");
                sb.append(i);
                toe.h("MediaCodecUtil", sb.toString());
                return null;
            }
            int iP = P(i2);
            if (iP != -1) {
                return new Pair<>(Integer.valueOf(iQ), Integer.valueOf(iP));
            }
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unknown VP9 level: ");
            sb2.append(i2);
            toe.h("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            toe.h("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer y(String str) {
        if (str == null) {
            return null;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b2 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b2 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b2 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b2 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b2 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b2 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b2 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b2 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b2 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b2 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b2 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b2 = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b2 = 15;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b2 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b2 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b2 = 20;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b2 = 21;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b2 = 22;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b2 = 23;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b2 = 24;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b2 = 25;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return Integer.valueOf(NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return Integer.valueOf(EventRecurrence.TH);
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    public static boolean z(MediaCodecInfo mediaCodecInfo) {
        return wlq.f38110a >= 29 && A(mediaCodecInfo);
    }
}
