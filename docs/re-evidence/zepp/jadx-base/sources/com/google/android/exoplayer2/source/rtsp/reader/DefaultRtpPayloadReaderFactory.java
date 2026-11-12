package com.google.android.exoplayer2.source.rtsp.reader;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultRtpPayloadReaderFactory implements RtpPayloadReader.Factory {
    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader.Factory
    @Nullable
    public RtpPayloadReader createPayloadReader(RtpPayloadFormat payloadFormat) {
        String str = (String) Assertions.checkNotNull(payloadFormat.format.sampleMimeType);
        str.hashCode();
        switch (str) {
            case "audio/mp4a-latm":
                return new a(payloadFormat);
            case "audio/ac3":
                return new RtpAc3Reader(payloadFormat);
            case "video/avc":
                return new b(payloadFormat);
            default:
                return null;
        }
    }
}
