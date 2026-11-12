package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
final class b extends g {
    private static final byte t = -1;
    private static final int u = 4;

    @Nullable
    private FlacStreamMetadata r;

    @Nullable
    private a s;

    public static final class a implements e {
        private FlacStreamMetadata a;
        private FlacStreamMetadata.SeekTable b;
        private long c = -1;
        private long d = -1;

        public a(FlacStreamMetadata streamMetadata, FlacStreamMetadata.SeekTable seekTable) {
            this.a = streamMetadata;
            this.b = seekTable;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.e
        public SeekMap a() {
            Assertions.checkState(this.c != -1);
            return new FlacSeekTableSeekMap(this.a, this.c);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.e
        public void b(long targetGranule) {
            long[] jArr = this.b.pointSampleNumbers;
            this.d = jArr[Util.binarySearchFloor(jArr, targetGranule, true, true)];
        }

        public void c(long firstFrameOffset) {
            this.c = firstFrameOffset;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.e
        public long read(ExtractorInput input) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }
    }

    private int n(ParsableByteArray packet) {
        int i = (packet.getData()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            packet.skipBytes(4);
            packet.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = FlacFrameReader.readFrameBlockSizeSamplesFromKey(packet, i);
        packet.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    private static boolean o(byte[] data) {
        return data[0] == -1;
    }

    public static boolean p(ParsableByteArray data) {
        return data.bytesLeft() >= 5 && data.readUnsignedByte() == 127 && data.readUnsignedInt() == 1179402563;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public long f(ParsableByteArray packet) {
        if (o(packet.getData())) {
            return n(packet);
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean i(ParsableByteArray packet, long position, g.b setupData) {
        byte[] data = packet.getData();
        FlacStreamMetadata flacStreamMetadata = this.r;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(data, 17);
            this.r = flacStreamMetadata2;
            setupData.a = flacStreamMetadata2.getFormat(Arrays.copyOfRange(data, 9, packet.limit()), null);
            return true;
        }
        if ((data[0] & 127) == 3) {
            FlacStreamMetadata.SeekTable seekTableMetadataBlock = FlacMetadataReader.readSeekTableMetadataBlock(packet);
            FlacStreamMetadata flacStreamMetadataCopyWithSeekTable = flacStreamMetadata.copyWithSeekTable(seekTableMetadataBlock);
            this.r = flacStreamMetadataCopyWithSeekTable;
            this.s = new a(flacStreamMetadataCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (!o(data)) {
            return true;
        }
        a aVar = this.s;
        if (aVar != null) {
            aVar.c(position);
            setupData.b = this.s;
        }
        Assertions.checkNotNull(setupData.a);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public void l(boolean headerData) {
        super.l(headerData);
        if (headerData) {
            this.r = null;
            this.s = null;
        }
    }
}
