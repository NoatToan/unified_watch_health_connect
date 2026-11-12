package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class FlacMetadataReader {
    private static final int SEEK_POINT_SIZE = 18;
    private static final int STREAM_MARKER = 1716281667;
    private static final int SYNC_CODE = 16382;

    public static final class FlacStreamMetadataHolder {
        public FlacStreamMetadata flacStreamMetadata;

        public FlacStreamMetadataHolder(FlacStreamMetadata flacStreamMetadata) {
            this.flacStreamMetadata = flacStreamMetadata;
        }
    }

    private FlacMetadataReader() {
    }

    public static boolean checkAndPeekStreamMarker(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        return parsableByteArray.readUnsignedInt() == 1716281667;
    }

    public static int getFrameStartMarker(ExtractorInput extractorInput) throws ParserException {
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(2);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        if ((unsignedShort >> 2) == SYNC_CODE) {
            extractorInput.resetPeekPosition();
            return unsignedShort;
        }
        extractorInput.resetPeekPosition();
        throw ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    public static Metadata peekId3Metadata(ExtractorInput extractorInput, boolean z14) {
        Metadata metadataPeekId3Data = new Id3Peeker().peekId3Data(extractorInput, z14 ? null : Id3Decoder.NO_FRAMES_PREDICATE);
        if (metadataPeekId3Data == null || metadataPeekId3Data.length() == 0) {
            return null;
        }
        return metadataPeekId3Data;
    }

    public static Metadata readId3Metadata(ExtractorInput extractorInput, boolean z14) {
        extractorInput.resetPeekPosition();
        long peekPosition = extractorInput.getPeekPosition();
        Metadata metadataPeekId3Metadata = peekId3Metadata(extractorInput, z14);
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - peekPosition));
        return metadataPeekId3Metadata;
    }

    public static boolean readMetadataBlock(ExtractorInput extractorInput, FlacStreamMetadataHolder flacStreamMetadataHolder) {
        extractorInput.resetPeekPosition();
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[4]);
        extractorInput.peekFully(parsableBitArray.data, 0, 4);
        boolean bit = parsableBitArray.readBit();
        int bits = parsableBitArray.readBits(7);
        int bits2 = parsableBitArray.readBits(24) + 4;
        if (bits == 0) {
            flacStreamMetadataHolder.flacStreamMetadata = readStreamInfoBlock(extractorInput);
            return bit;
        }
        FlacStreamMetadata flacStreamMetadata = flacStreamMetadataHolder.flacStreamMetadata;
        if (flacStreamMetadata == null) {
            h.w();
            return false;
        }
        if (bits == 3) {
            flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithSeekTable(readSeekTableMetadataBlock(extractorInput, bits2));
            return bit;
        }
        if (bits == 4) {
            flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithVorbisComments(readVorbisCommentMetadataBlock(extractorInput, bits2));
            return bit;
        }
        if (bits != 6) {
            extractorInput.skipFully(bits2);
            return bit;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(bits2);
        extractorInput.readFully(parsableByteArray.getData(), 0, bits2);
        parsableByteArray.skipBytes(4);
        flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithPictureFrames(ImmutableList.of(PictureFrame.fromPictureBlock(parsableByteArray)));
        return bit;
    }

    public static FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(1);
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        long position = ((long) parsableByteArray.getPosition()) + ((long) unsignedInt24);
        int i14 = unsignedInt24 / 18;
        long[] jArrCopyOf = new long[i14];
        long[] jArrCopyOf2 = new long[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            long j8 = parsableByteArray.readLong();
            if (j8 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                break;
            }
            jArrCopyOf[i15] = j8;
            jArrCopyOf2[i15] = parsableByteArray.readLong();
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes((int) (position - ((long) parsableByteArray.getPosition())));
        return new FlacStreamMetadata.SeekTable(jArrCopyOf, jArrCopyOf2);
    }

    private static FlacStreamMetadata readStreamInfoBlock(ExtractorInput extractorInput) {
        byte[] bArr = new byte[38];
        extractorInput.readFully(bArr, 0, 38);
        return new FlacStreamMetadata(bArr, 4);
    }

    public static void readStreamMarker(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        extractorInput.readFully(parsableByteArray.getData(), 0, 4);
        if (parsableByteArray.readUnsignedInt() != 1716281667) {
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> readVorbisCommentMetadataBlock(ExtractorInput extractorInput, int i14) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(i14);
        extractorInput.readFully(parsableByteArray.getData(), 0, i14);
        parsableByteArray.skipBytes(4);
        return Arrays.asList(VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments);
    }

    private static FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(ExtractorInput extractorInput, int i14) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(i14);
        extractorInput.readFully(parsableByteArray.getData(), 0, i14);
        return readSeekTableMetadataBlock(parsableByteArray);
    }
}
