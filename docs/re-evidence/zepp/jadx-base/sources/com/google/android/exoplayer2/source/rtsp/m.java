package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes3.dex */
final class m {
    private static final String c = "profile-level-id";
    private static final String d = "sprop-parameter-sets";
    private static final String e = "mp4a.40.";
    private static final String f = "avc1.";
    private static final String g = "*";
    public final RtpPayloadFormat a;
    public final Uri b;

    public m(MediaDescription mediaDescription, Uri sessionUri) {
        Assertions.checkArgument(mediaDescription.i.containsKey(SessionDescription.n));
        this.a = b(mediaDescription);
        this.b = a(sessionUri, (String) Util.castNonNull(mediaDescription.i.get(SessionDescription.n)));
    }

    private static Uri a(Uri sessionUri, String controlAttributeString) {
        Uri uri = Uri.parse(controlAttributeString);
        if (uri.isAbsolute()) {
            return uri;
        }
        return controlAttributeString.equals("*") ? sessionUri : sessionUri.buildUpon().appendEncodedPath(controlAttributeString).build();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @VisibleForTesting
    public static RtpPayloadFormat b(MediaDescription mediaDescription) {
        int iD;
        Format.Builder builder = new Format.Builder();
        int i = mediaDescription.e;
        if (i > 0) {
            builder.setAverageBitrate(i);
        }
        Assertions.checkArgument(mediaDescription.i.containsKey(SessionDescription.r));
        byte b = 2;
        Assertions.checkArgument(Util.split((String) Util.castNonNull(mediaDescription.i.get(SessionDescription.r)), " ").length == 2);
        MediaDescription.RtpMapAttribute rtpMapAttribute = mediaDescription.j;
        int i2 = rtpMapAttribute.payloadType;
        String mimeTypeFromRtpMediaType = RtpPayloadFormat.getMimeTypeFromRtpMediaType(rtpMapAttribute.mediaEncoding);
        builder.setSampleMimeType(mimeTypeFromRtpMediaType);
        int i3 = mediaDescription.j.clockRate;
        if ("audio".equals(mediaDescription.a)) {
            iD = d(mediaDescription.j.encodingParameters, mimeTypeFromRtpMediaType);
            builder.setSampleRate(i3).setChannelCount(iD);
        } else {
            iD = -1;
        }
        ImmutableMap<String, String> immutableMapA = mediaDescription.a();
        int iHashCode = mimeTypeFromRtpMediaType.hashCode();
        if (iHashCode != -53558318) {
            if (iHashCode != 187078296) {
                if (iHashCode == 1331836730 && mimeTypeFromRtpMediaType.equals(MimeTypes.VIDEO_H264)) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (!mimeTypeFromRtpMediaType.equals(MimeTypes.AUDIO_AC3)) {
                b = -1;
            }
        } else if (mimeTypeFromRtpMediaType.equals(MimeTypes.AUDIO_AAC)) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            Assertions.checkArgument(iD != -1);
            Assertions.checkArgument(!immutableMapA.isEmpty());
            e(builder, immutableMapA, iD, i3);
        } else if (b == 1) {
            Assertions.checkArgument(!immutableMapA.isEmpty());
            f(builder, immutableMapA);
        }
        Assertions.checkArgument(i3 > 0);
        Assertions.checkArgument(i2 >= 96);
        return new RtpPayloadFormat(builder.build(), i2, i3, immutableMapA);
    }

    private static byte[] c(String parameterSet) {
        byte[] bArrDecode = Base64.decode(parameterSet, 0);
        int length = bArrDecode.length;
        byte[] bArr = NalUnitUtil.NAL_START_CODE;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    private static int d(int encodingParameter, String mimeType) {
        if (encodingParameter != -1) {
            return encodingParameter;
        }
        return mimeType.equals(MimeTypes.AUDIO_AC3) ? 6 : 1;
    }

    private static void e(Format.Builder formatBuilder, ImmutableMap<String, String> fmtpAttributes, int channelCount, int sampleRate) {
        Assertions.checkArgument(fmtpAttributes.containsKey(c));
        String strValueOf = String.valueOf((String) Assertions.checkNotNull(fmtpAttributes.get(c)));
        formatBuilder.setCodecs(strValueOf.length() != 0 ? e.concat(strValueOf) : new String(e));
        formatBuilder.setInitializationData(ImmutableList.of(AacUtil.buildAacLcAudioSpecificConfig(sampleRate, channelCount)));
    }

    private static void f(Format.Builder formatBuilder, ImmutableMap<String, String> fmtpAttributes) {
        Assertions.checkArgument(fmtpAttributes.containsKey(d));
        String[] strArrSplit = Util.split((String) Assertions.checkNotNull(fmtpAttributes.get(d)), ",");
        Assertions.checkArgument(strArrSplit.length == 2);
        ImmutableList immutableListOf = ImmutableList.of(c(strArrSplit[0]), c(strArrSplit[1]));
        formatBuilder.setInitializationData(immutableListOf);
        byte[] bArr = immutableListOf.get(0);
        NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(bArr, NalUnitUtil.NAL_START_CODE.length, bArr.length);
        formatBuilder.setPixelWidthHeightRatio(spsNalUnit.pixelWidthAspectRatio);
        formatBuilder.setHeight(spsNalUnit.height);
        formatBuilder.setWidth(spsNalUnit.width);
        String str = fmtpAttributes.get(c);
        if (str != null) {
            formatBuilder.setCodecs(str.length() != 0 ? f.concat(str) : new String(f));
        } else {
            formatBuilder.setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc));
        }
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || m.class != o.getClass()) {
            return false;
        }
        m mVar = (m) o;
        return this.a.equals(mVar.a) && this.b.equals(mVar.b);
    }

    public int hashCode() {
        return ((217 + this.a.hashCode()) * 31) + this.b.hashCode();
    }
}
