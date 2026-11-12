package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {
    private static final String a = "MediaCodecUtil";
    private static final String d = "avc1";
    private static final String e = "avc2";
    private static final String f = "vp09";
    private static final String g = "hev1";
    private static final String h = "hvc1";
    private static final String i = "av01";
    private static final String j = "mp4a";
    private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");

    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap<b, List<MediaCodecInfo>> c = new HashMap<>();
    private static int k = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable cause) {
            super("Failed to query underlying media codecs", cause);
        }
    }

    public static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String mimeType, boolean secure, boolean tunneling) {
            this.a = mimeType;
            this.b = secure;
            this.c = tunneling;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            return ((((this.a.hashCode() + 31) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    public interface c {
        boolean a(String feature, String mimeType, android.media.MediaCodecInfo.CodecCapabilities capabilities);

        android.media.MediaCodecInfo b(int index);

        boolean c(String feature, String mimeType, android.media.MediaCodecInfo.CodecCapabilities capabilities);

        int d();

        boolean e();
    }

    public static final class d implements c {
        private d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String feature, String mimeType, android.media.MediaCodecInfo.CodecCapabilities capabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public android.media.MediaCodecInfo b(int index) {
            return MediaCodecList.getCodecInfoAt(index);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String feature, String mimeType, android.media.MediaCodecInfo.CodecCapabilities capabilities) {
            return "secure-playback".equals(feature) && MimeTypes.VIDEO_H264.equals(mimeType);
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
        private final int a;

        @Nullable
        private android.media.MediaCodecInfo[] b;

        public e(boolean includeSecure, boolean includeTunneling) {
            this.a = (includeSecure || includeTunneling) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        private void f() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String feature, String mimeType, android.media.MediaCodecInfo.CodecCapabilities capabilities) {
            return capabilities.isFeatureRequired(feature);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public android.media.MediaCodecInfo b(int index) {
            f();
            return this.b[index];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String feature, String mimeType, android.media.MediaCodecInfo.CodecCapabilities capabilities) {
            return capabilities.isFeatureSupported(feature);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    public interface f<T> {
        int a(T t);
    }

    private MediaCodecUtil() {
    }

    @RequiresApi(29)
    private static boolean A(android.media.MediaCodecInfo codecInfo) {
        return codecInfo.isSoftwareOnly();
    }

    private static boolean B(android.media.MediaCodecInfo codecInfo) {
        if (Util.SDK_INT >= 29) {
            return C(codecInfo);
        }
        String lowerCase = Ascii.toLowerCase(codecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    @RequiresApi(29)
    private static boolean C(android.media.MediaCodecInfo codecInfo) {
        return codecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int D(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int E(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.name.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int F(Format format, MediaCodecInfo mediaCodecInfo) {
        try {
            return mediaCodecInfo.isFormatSupported(format) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int G(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    private static int H(int profileNumber) {
        int i2 = 17;
        if (profileNumber != 17) {
            i2 = 20;
            if (profileNumber != 20) {
                i2 = 23;
                if (profileNumber != 23) {
                    i2 = 29;
                    if (profileNumber != 29) {
                        i2 = 39;
                        if (profileNumber != 39) {
                            i2 = 42;
                            if (profileNumber != 42) {
                                switch (profileNumber) {
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

    private static <T> void I(List<T> list, final f<T> scoreProvider) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.G(scoreProvider, obj, obj2);
            }
        });
    }

    private static int J(int levelNumber) {
        if (levelNumber == 10) {
            return 1;
        }
        if (levelNumber == 11) {
            return 2;
        }
        if (levelNumber == 20) {
            return 4;
        }
        if (levelNumber == 21) {
            return 8;
        }
        if (levelNumber == 30) {
            return 16;
        }
        if (levelNumber == 31) {
            return 32;
        }
        if (levelNumber == 40) {
            return 64;
        }
        if (levelNumber == 41) {
            return 128;
        }
        if (levelNumber == 50) {
            return 256;
        }
        if (levelNumber == 51) {
            return 512;
        }
        switch (levelNumber) {
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

    private static int K(int profileNumber) {
        if (profileNumber == 0) {
            return 1;
        }
        if (profileNumber == 1) {
            return 2;
        }
        if (profileNumber != 2) {
            return profileNumber != 3 ? -1 : 8;
        }
        return 4;
    }

    public static synchronized void clearDecoderInfoCache() {
        c.clear();
    }

    private static void e(String mimeType, List<MediaCodecInfo> decoderInfos) {
        if (MimeTypes.AUDIO_RAW.equals(mimeType)) {
            if (Util.SDK_INT < 26 && Util.DEVICE.equals("R9") && decoderInfos.size() == 1 && decoderInfos.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                decoderInfos.add(MediaCodecInfo.newInstance("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            I(decoderInfos, new f() { // from class: com.google.android.exoplayer2.mediacodec.h
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    return MediaCodecUtil.D((MediaCodecInfo) obj);
                }
            });
        }
        int i2 = Util.SDK_INT;
        if (i2 < 21 && decoderInfos.size() > 1) {
            String str = decoderInfos.get(0).name;
            if ("OMX.SEC.mp3.dec".equals(str) || "OMX.SEC.MP3.Decoder".equals(str) || "OMX.brcm.audio.mp3.decoder".equals(str)) {
                I(decoderInfos, new f() { // from class: com.google.android.exoplayer2.mediacodec.i
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int a(Object obj) {
                        return MediaCodecUtil.E((MediaCodecInfo) obj);
                    }
                });
            }
        }
        if (i2 >= 30 || decoderInfos.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(decoderInfos.get(0).name)) {
            return;
        }
        decoderInfos.add(decoderInfos.remove(0));
    }

    private static int f(int levelNumber) {
        switch (levelNumber) {
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
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int levelNumber) {
        switch (levelNumber) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (levelNumber) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (levelNumber) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (levelNumber) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (levelNumber) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Nullable
    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            return q(format.codecs, strArrSplit);
        }
        byte b2 = 0;
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals(i)) {
                    b2 = -1;
                }
                break;
            case 3006243:
                if (!str2.equals(d)) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 3006244:
                if (!str2.equals(e)) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 3199032:
                if (!str2.equals(g)) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 3214780:
                if (!str2.equals(h)) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 3356560:
                if (!str2.equals(j)) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 3624515:
                if (!str2.equals(f)) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return m(format.codecs, strArrSplit, format.colorInfo);
            case 1:
            case 2:
                return n(format.codecs, strArrSplit);
            case 3:
            case 4:
                return r(format.codecs, strArrSplit);
            case 5:
                return l(format.codecs, strArrSplit);
            case 6:
                return s(format.codecs, strArrSplit);
            default:
                return null;
        }
    }

    @Nullable
    public static MediaCodecInfo getDecoderInfo(String mimeType, boolean secure, boolean tunneling) throws DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(mimeType, secure, tunneling);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String mimeType, boolean secure, boolean tunneling) throws DecoderQueryException {
        b bVar = new b(mimeType, secure, tunneling);
        HashMap<b, List<MediaCodecInfo>> map = c;
        List<MediaCodecInfo> list = map.get(bVar);
        if (list != null) {
            return list;
        }
        int i2 = Util.SDK_INT;
        ArrayList<MediaCodecInfo> arrayListP = p(bVar, i2 >= 21 ? new e(secure, tunneling) : new d());
        if (secure && arrayListP.isEmpty() && 21 <= i2 && i2 <= 23) {
            arrayListP = p(bVar, new d());
            if (!arrayListP.isEmpty()) {
                String str = arrayListP.get(0).name;
                StringBuilder sb = new StringBuilder(String.valueOf(mimeType).length() + 63 + String.valueOf(str).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(mimeType);
                sb.append(". Assuming: ");
                sb.append(str);
                Log.w(a, sb.toString());
            }
        }
        e(mimeType, arrayListP);
        List<MediaCodecInfo> listUnmodifiableList = Collections.unmodifiableList(arrayListP);
        map.put(bVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    @CheckResult
    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(List<MediaCodecInfo> decoderInfos, final Format format) {
        ArrayList arrayList = new ArrayList(decoderInfos);
        I(arrayList, new f() { // from class: com.google.android.exoplayer2.mediacodec.g
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.F(format, (MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    @Nullable
    public static MediaCodecInfo getDecryptOnlyDecoderInfo() throws DecoderQueryException {
        return getDecoderInfo(MimeTypes.AUDIO_RAW, false, false);
    }

    private static int h(int avcLevel) {
        if (avcLevel == 1 || avcLevel == 2) {
            return 25344;
        }
        switch (avcLevel) {
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
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int profileNumber) {
        if (profileNumber == 66) {
            return 1;
        }
        if (profileNumber == 77) {
            return 2;
        }
        if (profileNumber == 88) {
            return 4;
        }
        if (profileNumber == 100) {
            return 8;
        }
        if (profileNumber == 110) {
            return 16;
        }
        if (profileNumber != 122) {
            return profileNumber != 244 ? -1 : 64;
        }
        return 32;
    }

    @Nullable
    private static Integer j(@Nullable String levelString) {
        if (levelString == null) {
            return null;
        }
        switch (levelString) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    @Nullable
    private static Integer k(@Nullable String profileString) {
        if (profileString == null) {
            return null;
        }
        switch (profileString) {
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

    @Nullable
    private static Pair<Integer, Integer> l(String codec, String[] parts) {
        int iH;
        if (parts.length != 3) {
            String strValueOf = String.valueOf(codec);
            Log.w(a, strValueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(parts[1], 16))) && (iH = H(Integer.parseInt(parts[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iH), 0);
            }
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(codec);
            Log.w(a, strValueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> m(String codec, String[] parts, @Nullable ColorInfo colorInfo) {
        int i2;
        if (parts.length < 4) {
            String strValueOf = String.valueOf(codec);
            Log.w(a, strValueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i3 = 1;
        try {
            int i4 = Integer.parseInt(parts[1]);
            int i5 = Integer.parseInt(parts[2].substring(0, 2));
            int i6 = Integer.parseInt(parts[3]);
            if (i4 != 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown AV1 profile: ");
                sb.append(i4);
                Log.w(a, sb.toString());
                return null;
            }
            if (i6 != 8 && i6 != 10) {
                StringBuilder sb2 = new StringBuilder(34);
                sb2.append("Unknown AV1 bit depth: ");
                sb2.append(i6);
                Log.w(a, sb2.toString());
                return null;
            }
            if (i6 != 8) {
                i3 = (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i2 = colorInfo.colorTransfer) == 7 || i2 == 6)) ? 2 : 4096;
            }
            int iF = f(i5);
            if (iF != -1) {
                return new Pair<>(Integer.valueOf(i3), Integer.valueOf(iF));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown AV1 level: ");
            sb3.append(i5);
            Log.w(a, sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(codec);
            Log.w(a, strValueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    public static int maxH264DecodableFrameSize() throws DecoderQueryException {
        if (k == -1) {
            int iMax = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo(MimeTypes.VIDEO_H264, false, false);
            if (decoderInfo != null) {
                android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(h(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, Util.SDK_INT >= 21 ? 345600 : 172800);
            }
            k = iMax;
        }
        return k;
    }

    @Nullable
    private static Pair<Integer, Integer> n(String codec, String[] parts) {
        int i2;
        int i3;
        if (parts.length < 2) {
            String strValueOf = String.valueOf(codec);
            Log.w(a, strValueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (parts[1].length() == 6) {
                i3 = Integer.parseInt(parts[1].substring(0, 2), 16);
                i2 = Integer.parseInt(parts[1].substring(4), 16);
            } else {
                if (parts.length < 3) {
                    String strValueOf2 = String.valueOf(codec);
                    Log.w(a, strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                int i4 = Integer.parseInt(parts[1]);
                i2 = Integer.parseInt(parts[2]);
                i3 = i4;
            }
            int i5 = i(i3);
            if (i5 == -1) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown AVC profile: ");
                sb.append(i3);
                Log.w(a, sb.toString());
                return null;
            }
            int iG = g(i2);
            if (iG != -1) {
                return new Pair<>(Integer.valueOf(i5), Integer.valueOf(iG));
            }
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unknown AVC level: ");
            sb2.append(i2);
            Log.w(a, sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf3 = String.valueOf(codec);
            Log.w(a, strValueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    @Nullable
    private static String o(android.media.MediaCodecInfo info, String name, String mimeType) {
        for (String str : info.getSupportedTypes()) {
            if (str.equalsIgnoreCase(mimeType)) {
                return str;
            }
        }
        if (mimeType.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (mimeType.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(name)) {
            return "audio/x-lg-alac";
        }
        if (mimeType.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(name)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    private static ArrayList<MediaCodecInfo> p(b key, c mediaCodecList) throws DecoderQueryException {
        String strO;
        String str;
        String str2;
        int i2;
        boolean z;
        int i3;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str3 = key.a;
            int iD = mediaCodecList.d();
            boolean zE = mediaCodecList.e();
            int i4 = 0;
            while (i4 < iD) {
                android.media.MediaCodecInfo mediaCodecInfoB = mediaCodecList.b(i4);
                if (u(mediaCodecInfoB)) {
                    i2 = i4;
                    z = zE;
                    i3 = iD;
                } else {
                    String name = mediaCodecInfoB.getName();
                    if (w(mediaCodecInfoB, name, zE, str3) && (strO = o(mediaCodecInfoB, name, str3)) != null) {
                        try {
                            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strO);
                            boolean zC = mediaCodecList.c("tunneled-playback", strO, capabilitiesForType);
                            boolean zA = mediaCodecList.a("tunneled-playback", strO, capabilitiesForType);
                            boolean z2 = key.c;
                            if ((z2 || !zA) && (!z2 || zC)) {
                                boolean zC2 = mediaCodecList.c("secure-playback", strO, capabilitiesForType);
                                boolean zA2 = mediaCodecList.a("secure-playback", strO, capabilitiesForType);
                                boolean z3 = key.b;
                                if ((z3 || !zA2) && (!z3 || zC2)) {
                                    boolean zX = x(mediaCodecInfoB);
                                    boolean z4 = z(mediaCodecInfoB);
                                    boolean zB = B(mediaCodecInfoB);
                                    if (!(zE && key.b == zC2) && (zE || key.b)) {
                                        str = strO;
                                        str2 = name;
                                        i2 = i4;
                                        z = zE;
                                        i3 = iD;
                                        if (!z && zC2) {
                                            arrayList.add(MediaCodecInfo.newInstance(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, zX, z4, zB, false, true));
                                            return arrayList;
                                        }
                                    } else {
                                        str = strO;
                                        str2 = name;
                                        i2 = i4;
                                        z = zE;
                                        i3 = iD;
                                        try {
                                            arrayList.add(MediaCodecInfo.newInstance(name, str3, strO, capabilitiesForType, zX, z4, zB, false, false));
                                        } catch (Exception e2) {
                                            e = e2;
                                            if (Util.SDK_INT > 23 || arrayList.isEmpty()) {
                                                String str4 = str2;
                                                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 25 + str.length());
                                                sb.append("Failed to query codec ");
                                                sb.append(str4);
                                                sb.append(" (");
                                                sb.append(str);
                                                sb.append(")");
                                                Log.e(a, sb.toString());
                                                throw e;
                                            }
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                            sb2.append("Skipping codec ");
                                            sb2.append(str2);
                                            sb2.append(" (failed to query capabilities)");
                                            Log.e(a, sb2.toString());
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                    z = zE;
                                    i3 = iD;
                                }
                            } else {
                                i2 = i4;
                                z = zE;
                                i3 = iD;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str = strO;
                            str2 = name;
                            i2 = i4;
                            z = zE;
                            i3 = iD;
                        }
                    } else {
                        i2 = i4;
                        z = zE;
                        i3 = iD;
                    }
                }
                i4 = i2 + 1;
                iD = i3;
                zE = z;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new DecoderQueryException(e4);
        }
    }

    @Nullable
    private static Pair<Integer, Integer> q(String codec, String[] parts) {
        if (parts.length < 3) {
            String strValueOf = String.valueOf(codec);
            Log.w(a, strValueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = b.matcher(parts[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(codec);
            Log.w(a, strValueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numK = k(strGroup);
        if (numK == null) {
            String strValueOf3 = String.valueOf(strGroup);
            Log.w(a, strValueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(strValueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str = parts[2];
        Integer numJ = j(str);
        if (numJ != null) {
            return new Pair<>(numK, numJ);
        }
        String strValueOf4 = String.valueOf(str);
        Log.w(a, strValueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(strValueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> r(String codec, String[] parts) {
        if (parts.length < 4) {
            String strValueOf = String.valueOf(codec);
            Log.w(a, strValueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i2 = 1;
        Matcher matcher = b.matcher(parts[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(codec);
            Log.w(a, strValueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                String strValueOf3 = String.valueOf(strGroup);
                Log.w(a, strValueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            i2 = 2;
        }
        String str = parts[3];
        Integer numT = t(str);
        if (numT != null) {
            return new Pair<>(Integer.valueOf(i2), numT);
        }
        String strValueOf4 = String.valueOf(str);
        Log.w(a, strValueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> s(String codec, String[] parts) {
        if (parts.length < 3) {
            String strValueOf = String.valueOf(codec);
            Log.w(a, strValueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int i2 = Integer.parseInt(parts[1]);
            int i3 = Integer.parseInt(parts[2]);
            int iK = K(i2);
            if (iK == -1) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown VP9 profile: ");
                sb.append(i2);
                Log.w(a, sb.toString());
                return null;
            }
            int iJ = J(i3);
            if (iJ != -1) {
                return new Pair<>(Integer.valueOf(iK), Integer.valueOf(iJ));
            }
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unknown VP9 level: ");
            sb2.append(i3);
            Log.w(a, sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(codec);
            Log.w(a, strValueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    @Nullable
    private static Integer t(@Nullable String codecString) {
        if (codecString == null) {
            return null;
        }
        switch (codecString) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return 8192;
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return 524288;
            case "H180":
                return 2097152;
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return 1024;
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return 65536;
            case "L156":
                return 262144;
            case "L180":
                return 1048576;
            case "L183":
                return 4194304;
            case "L186":
                return 16777216;
            default:
                return null;
        }
    }

    private static boolean u(android.media.MediaCodecInfo info) {
        return Util.SDK_INT >= 29 && v(info);
    }

    @RequiresApi(29)
    private static boolean v(android.media.MediaCodecInfo info) {
        return info.isAlias();
    }

    private static boolean w(android.media.MediaCodecInfo info, String name, boolean secureDecodersExplicit, String mimeType) {
        if (info.isEncoder() || (!secureDecodersExplicit && name.endsWith(".secure"))) {
            return false;
        }
        int i2 = Util.SDK_INT;
        if (i2 < 21 && ("CIPAACDecoder".equals(name) || "CIPMP3Decoder".equals(name) || "CIPVorbisDecoder".equals(name) || "CIPAMRNBDecoder".equals(name) || "AACDecoder".equals(name) || "MP3Decoder".equals(name))) {
            return false;
        }
        if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(name)) {
            String str = Util.DEVICE;
            if ("a70".equals(str) || ("Xiaomi".equals(Util.MANUFACTURER) && str.startsWith("HM"))) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
            String str2 = Util.DEVICE;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
            String str3 = Util.DEVICE;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i2 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(Util.MANUFACTURER))) {
            String str4 = Util.DEVICE;
            if (str4.startsWith("zeroflte") || str4.startsWith("zerolte") || str4.startsWith("zenlte") || "SC-05G".equals(str4) || "marinelteatt".equals(str4) || "404SC".equals(str4) || "SC-04G".equals(str4) || "SCV31".equals(str4)) {
                return false;
            }
        }
        if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(Util.MANUFACTURER)) {
            String str5 = Util.DEVICE;
            if (str5.startsWith("d2") || str5.startsWith("serrano") || str5.startsWith("jflte") || str5.startsWith("santos") || str5.startsWith("t0")) {
                return false;
            }
        }
        if (i2 <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(name)) {
            return false;
        }
        return (MimeTypes.AUDIO_E_AC3_JOC.equals(mimeType) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) ? false : true;
    }

    public static void warmDecoderInfoCache(String mimeType, boolean secure, boolean tunneling) {
        try {
            getDecoderInfos(mimeType, secure, tunneling);
        } catch (DecoderQueryException e2) {
            Log.e(a, "Codec warming failed", e2);
        }
    }

    private static boolean x(android.media.MediaCodecInfo codecInfo) {
        return Util.SDK_INT >= 29 ? y(codecInfo) : !z(codecInfo);
    }

    @RequiresApi(29)
    private static boolean y(android.media.MediaCodecInfo codecInfo) {
        return codecInfo.isHardwareAccelerated();
    }

    private static boolean z(android.media.MediaCodecInfo codecInfo) {
        if (Util.SDK_INT >= 29) {
            return A(codecInfo);
        }
        String lowerCase = Ascii.toLowerCase(codecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }
}
