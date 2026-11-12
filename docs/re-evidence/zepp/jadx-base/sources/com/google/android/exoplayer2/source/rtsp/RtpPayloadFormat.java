package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RtpPayloadFormat {
    private static final String a = "AC3";
    private static final String b = "MPEG4-GENERIC";
    private static final String c = "H264";
    public final int clockRate;
    public final ImmutableMap<String, String> fmtpParameters;
    public final Format format;
    public final int rtpPayloadType;

    public RtpPayloadFormat(Format format, int rtpPayloadType, int clockRate, Map<String, String> fmtpParameters) {
        this.rtpPayloadType = rtpPayloadType;
        this.clockRate = clockRate;
        this.format = format;
        this.fmtpParameters = ImmutableMap.copyOf((Map) fmtpParameters);
    }

    public static String getMimeTypeFromRtpMediaType(String mediaType) {
        String upperCase = Ascii.toUpperCase(mediaType);
        upperCase.hashCode();
        switch (upperCase) {
            case "MPEG4-GENERIC":
                return MimeTypes.AUDIO_AAC;
            case "AC3":
                return MimeTypes.AUDIO_AC3;
            case "H264":
                return MimeTypes.VIDEO_H264;
            default:
                throw new IllegalArgumentException(mediaType);
        }
    }

    public static boolean isFormatSupported(MediaDescription mediaDescription) {
        String upperCase = Ascii.toUpperCase(mediaDescription.j.mediaEncoding);
        upperCase.hashCode();
        switch (upperCase) {
            case "MPEG4-GENERIC":
            case "AC3":
            case "H264":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || RtpPayloadFormat.class != o.getClass()) {
            return false;
        }
        RtpPayloadFormat rtpPayloadFormat = (RtpPayloadFormat) o;
        return this.rtpPayloadType == rtpPayloadFormat.rtpPayloadType && this.clockRate == rtpPayloadFormat.clockRate && this.format.equals(rtpPayloadFormat.format) && this.fmtpParameters.equals(rtpPayloadFormat.fmtpParameters);
    }

    public int hashCode() {
        return ((((((217 + this.rtpPayloadType) * 31) + this.clockRate) * 31) + this.format.hashCode()) * 31) + this.fmtpParameters.hashCode();
    }
}
