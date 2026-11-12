package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceInfoDecoder extends SimpleMetadataDecoder {
    private static final int d = 0;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 255;
    private final ParsableByteArray a = new ParsableByteArray();
    private final ParsableBitArray b = new ParsableBitArray();
    private TimestampAdjuster c;

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public Metadata decode(MetadataInputBuffer inputBuffer, ByteBuffer buffer) {
        TimestampAdjuster timestampAdjuster = this.c;
        if (timestampAdjuster == null || inputBuffer.subsampleOffsetUs != timestampAdjuster.getTimestampOffsetUs()) {
            TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(inputBuffer.timeUs);
            this.c = timestampAdjuster2;
            timestampAdjuster2.adjustSampleTimestamp(inputBuffer.timeUs - inputBuffer.subsampleOffsetUs);
        }
        byte[] bArrArray = buffer.array();
        int iLimit = buffer.limit();
        this.a.reset(bArrArray, iLimit);
        this.b.reset(bArrArray, iLimit);
        this.b.skipBits(39);
        long bits = (((long) this.b.readBits(1)) << 32) | ((long) this.b.readBits(32));
        this.b.skipBits(20);
        int bits2 = this.b.readBits(12);
        int bits3 = this.b.readBits(8);
        Metadata.Entry spliceNullCommand = null;
        this.a.skipBytes(14);
        if (bits3 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (bits3 == 255) {
            spliceNullCommand = PrivateCommand.a(this.a, bits2, bits);
        } else if (bits3 == 4) {
            spliceNullCommand = SpliceScheduleCommand.a(this.a);
        } else if (bits3 == 5) {
            spliceNullCommand = SpliceInsertCommand.a(this.a, bits, this.c);
        } else if (bits3 == 6) {
            spliceNullCommand = TimeSignalCommand.a(this.a, bits, this.c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
