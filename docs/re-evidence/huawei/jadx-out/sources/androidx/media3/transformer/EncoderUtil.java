package androidx.media3.transformer;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import defpackage.akb;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public final class EncoderUtil {
    public static final int LEVEL_UNSET = -1;
    private static final akb<String, MediaCodecInfo> mimeTypeToEncoders = akb.a();

    public static ImmutableList<MediaCodecInfo> getSupportedEncoders(String str) {
        ImmutableList<MediaCodecInfo> immutableListCopyOf;
        synchronized (EncoderUtil.class) {
            maybePopulateEncoderInfo();
            immutableListCopyOf = ImmutableList.copyOf((Collection) mimeTypeToEncoders.get((Object) Ascii.toLowerCase(str)));
        }
        return immutableListCopyOf;
    }

    public static ImmutableSet<String> getSupportedMimeTypes() {
        ImmutableSet<String> immutableSetCopyOf;
        synchronized (EncoderUtil.class) {
            maybePopulateEncoderInfo();
            immutableSetCopyOf = ImmutableSet.copyOf((Collection) mimeTypeToEncoders.keySet());
        }
        return immutableSetCopyOf;
    }

    public static void clearCachedEncoders() {
        synchronized (EncoderUtil.class) {
            mimeTypeToEncoders.clear();
        }
    }

    public static ImmutableList<MediaCodecInfo> getSupportedEncodersForHdrEditing(String str, ColorInfo colorInfo) {
        if (Util.SDK_INT < 33 || colorInfo == null) {
            return ImmutableList.of();
        }
        ImmutableList<MediaCodecInfo> supportedEncoders = getSupportedEncoders(str);
        ImmutableList<Integer> codecProfilesForHdrFormat = getCodecProfilesForHdrFormat(str, colorInfo.colorTransfer);
        ImmutableList.c cVar = new ImmutableList.c();
        for (int i = 0; i < supportedEncoders.size(); i++) {
            MediaCodecInfo mediaCodecInfo = supportedEncoders.get(i);
            if (!mediaCodecInfo.isAlias() && isFeatureSupported(mediaCodecInfo, str, "hdr-editing")) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                    if (codecProfilesForHdrFormat.contains(Integer.valueOf(codecProfileLevel.profile))) {
                        cVar.add(mediaCodecInfo);
                    }
                }
            }
        }
        return cVar.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static ImmutableList<Integer> getCodecProfilesForHdrFormat(String str, int i) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "video/av01":
                b2 = 0;
                break;
            case "video/hevc":
                b2 = 1;
                break;
            case "video/avc":
                b2 = 2;
                break;
            case "video/x-vnd.on2.vp9":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 == 3 && (i == 7 || i == 6)) {
                        return ImmutableList.of(4096, 8192);
                    }
                } else if (i == 7) {
                    return ImmutableList.of(16);
                }
            } else {
                if (i == 7) {
                    return ImmutableList.of(2);
                }
                if (i == 6) {
                    return ImmutableList.of(4096);
                }
            }
        } else {
            if (i == 7) {
                return ImmutableList.of(2);
            }
            if (i == 6) {
                return ImmutableList.of(4096);
            }
        }
        return ImmutableList.of();
    }

    public static boolean isSizeSupported(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static Range<Integer> getSupportedHeights(MediaCodecInfo mediaCodecInfo, String str, int i) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedHeightsFor(i);
    }

    public static Pair<Range<Integer>, Range<Integer>> getSupportedResolutionRanges(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        return Pair.create(videoCapabilities.getSupportedWidths(), videoCapabilities.getSupportedHeights());
    }

    public static Size getSupportedResolution(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int iAlignResolution = alignResolution(i, widthAlignment);
        int iAlignResolution2 = alignResolution(i2, heightAlignment);
        if (isSizeSupported(mediaCodecInfo, str, iAlignResolution, iAlignResolution2)) {
            return new Size(iAlignResolution, iAlignResolution2);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int iAlignResolution3 = alignResolution(Math.round(i * f), widthAlignment);
            int iAlignResolution4 = alignResolution(Math.round(i2 * f), heightAlignment);
            if (isSizeSupported(mediaCodecInfo, str, iAlignResolution3, iAlignResolution4)) {
                return new Size(iAlignResolution3, iAlignResolution4);
            }
        }
        int iIntValue = ((Integer) videoCapabilities.getSupportedHeightsFor(((Integer) videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i))).intValue()).clamp(Integer.valueOf(i2))).intValue();
        if (iIntValue != i2) {
            i = alignResolution((int) Math.round((((double) i) * ((double) iIntValue)) / ((double) i2)), widthAlignment);
            i2 = alignResolution(iIntValue, heightAlignment);
        }
        if (isSizeSupported(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    public static ImmutableSet<Integer> findSupportedEncodingProfiles(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo.getCapabilitiesForType(str).profileLevels;
        ImmutableSet.b bVar = new ImmutableSet.b();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            bVar.add(Integer.valueOf(codecProfileLevel.profile));
        }
        return bVar.build();
    }

    public static int findHighestSupportedEncodingLevel(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int iMax = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                iMax = Math.max(iMax, codecProfileLevel.level);
            }
        }
        return iMax;
    }

    public static String findCodecForFormat(MediaFormat mediaFormat, boolean z) {
        float integer;
        String strFindEncoderForFormat;
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        if (Util.SDK_INT == 21 && mediaFormat.containsKey("frame-rate")) {
            try {
                integer = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
            mediaFormat.setString("frame-rate", null);
        } else {
            integer = -1.0f;
        }
        if (z) {
            strFindEncoderForFormat = mediaCodecList.findDecoderForFormat(mediaFormat);
        } else {
            strFindEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormat);
        }
        if (Util.SDK_INT == 21) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, "frame-rate", Math.round(integer));
        }
        return strFindEncoderForFormat;
    }

    public static Range<Integer> getSupportedBitrateRange(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
    }

    public static boolean isBitrateModeSupported(MediaCodecInfo mediaCodecInfo, String str, int i) {
        return mediaCodecInfo.getCapabilitiesForType(str).getEncoderCapabilities().isBitrateModeSupported(i);
    }

    public static ImmutableList<Integer> getSupportedColorFormats(MediaCodecInfo mediaCodecInfo, String str) {
        return ImmutableList.copyOf((Collection) Ints.a(mediaCodecInfo.getCapabilitiesForType(str).colorFormats));
    }

    public static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.SDK_INT >= 29) {
            return Api29.isHardwareAccelerated(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    public static boolean isFeatureSupported(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        return mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported(str2);
    }

    public static int getMaxSupportedInstances(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getMaxSupportedInstances();
    }

    private static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.SDK_INT >= 29) {
            return Api29.isSoftwareOnly(mediaCodecInfo);
        }
        if (MimeTypes.isAudio(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static int alignResolution(int i, int i2) {
        if (i % 10 == 1) {
            return (int) (((double) i2) * Math.floor(i / i2));
        }
        return i2 * Math.round(i / i2);
    }

    private static void maybePopulateEncoderInfo() {
        synchronized (EncoderUtil.class) {
            if (mimeTypeToEncoders.isEmpty()) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    if (mediaCodecInfo.isEncoder()) {
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            mimeTypeToEncoders.put(Ascii.toLowerCase(str), mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }

    static final class Api29 {
        private Api29() {
        }

        public static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isHardwareAccelerated();
        }

        public static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isSoftwareOnly();
        }
    }

    private EncoderUtil() {
    }
}
