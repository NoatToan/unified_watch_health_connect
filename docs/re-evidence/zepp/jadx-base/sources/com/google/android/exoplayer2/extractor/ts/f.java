package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class f {
    private static final int c = 434;
    private final List<Format> a;
    private final TrackOutput[] b;

    public f(List<Format> closedCaptionFormats) {
        this.a = closedCaptionFormats;
        this.b = new TrackOutput[closedCaptionFormats.size()];
    }

    public void a(long pesTimeUs, ParsableByteArray userDataPayload) {
        if (userDataPayload.bytesLeft() < 9) {
            return;
        }
        int i = userDataPayload.readInt();
        int i2 = userDataPayload.readInt();
        int unsignedByte = userDataPayload.readUnsignedByte();
        if (i == c && i2 == 1195456820 && unsignedByte == 3) {
            CeaUtil.consumeCcData(pesTimeUs, userDataPayload, this.b);
        }
    }

    public void b(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        for (int i = 0; i < this.b.length; i++) {
            idGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(idGenerator.getTrackId(), 3);
            Format format = this.a.get(i);
            String str = format.sampleMimeType;
            boolean z = MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str);
            String strValueOf = String.valueOf(str);
            Assertions.checkArgument(z, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            trackOutputTrack.format(new Format.Builder().setId(idGenerator.getFormatId()).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.b[i] = trackOutputTrack;
        }
    }
}
