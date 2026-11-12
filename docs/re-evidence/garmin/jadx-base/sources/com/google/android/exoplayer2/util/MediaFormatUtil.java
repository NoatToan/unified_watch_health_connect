package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class MediaFormatUtil {
    public static final String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";
    private static final int MAX_POWER_OF_TWO_INT = 1073741824;

    private MediaFormatUtil() {
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat createMediaFormatFromFormat(Format format) {
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", format.bitrate);
        maybeSetInteger(mediaFormat, "channel-count", format.channelCount);
        maybeSetColorInfo(mediaFormat, format.colorInfo);
        maybeSetString(mediaFormat, "mime", format.sampleMimeType);
        maybeSetString(mediaFormat, "codecs-string", format.codecs);
        maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        maybeSetInteger(mediaFormat, "width", format.width);
        maybeSetInteger(mediaFormat, "height", format.height);
        setCsdBuffers(mediaFormat, format.initializationData);
        maybeSetPcmEncoding(mediaFormat, format.pcmEncoding);
        maybeSetString(mediaFormat, "language", format.language);
        maybeSetInteger(mediaFormat, "max-input-size", format.maxInputSize);
        maybeSetInteger(mediaFormat, "sample-rate", format.sampleRate);
        maybeSetInteger(mediaFormat, "caption-service-number", format.accessibilityChannel);
        mediaFormat.setInteger("rotation-degrees", format.rotationDegrees);
        int i14 = format.selectionFlags;
        setBooleanAsInt(mediaFormat, "is-autoselect", i14 & 4);
        setBooleanAsInt(mediaFormat, "is-default", i14 & 1);
        setBooleanAsInt(mediaFormat, "is-forced-subtitle", i14 & 2);
        mediaFormat.setInteger("encoder-delay", format.encoderDelay);
        mediaFormat.setInteger("encoder-padding", format.encoderPadding);
        maybeSetPixelAspectRatio(mediaFormat, format.pixelWidthHeightRatio);
        return mediaFormat;
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f14) {
        if (f14 != -1.0f) {
            mediaFormat.setFloat(str, f14);
        }
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i14) {
        if (i14 != -1) {
            mediaFormat.setInteger(str, i14);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPcmEncoding(MediaFormat mediaFormat, int i14) {
        int i15;
        if (i14 == -1) {
            return;
        }
        maybeSetInteger(mediaFormat, KEY_PCM_ENCODING_EXTENDED, i14);
        if (i14 == 0) {
            i15 = 0;
        } else if (i14 == 536870912) {
            i15 = 21;
        } else if (i14 != 805306368) {
            i15 = 2;
            if (i14 != 2) {
                i15 = 3;
                if (i14 != 3) {
                    i15 = 4;
                    if (i14 != 4) {
                        return;
                    }
                }
            }
        } else {
            i15 = 22;
        }
        mediaFormat.setInteger("pcm-encoding", i15);
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPixelAspectRatio(MediaFormat mediaFormat, float f14) {
        int i14;
        mediaFormat.setFloat(KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT, f14);
        int i15 = 1073741824;
        if (f14 < 1.0f) {
            i15 = (int) (f14 * 1073741824);
            i14 = 1073741824;
        } else if (f14 > 1.0f) {
            i14 = (int) (1073741824 / f14);
        } else {
            i15 = 1;
            i14 = 1;
        }
        mediaFormat.setInteger("sar-width", i15);
        mediaFormat.setInteger("sar-height", i14);
    }

    public static void maybeSetString(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    private static void setBooleanAsInt(MediaFormat mediaFormat, String str, int i14) {
        mediaFormat.setInteger(str, i14 != 0 ? 1 : 0);
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            mediaFormat.setByteBuffer(v.b(15, i14, "csd-"), ByteBuffer.wrap(list.get(i14)));
        }
    }
}
