package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes13.dex */
final class OpusReader extends StreamReader {
    private static final byte[] OPUS_ID_HEADER_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] OPUS_COMMENT_HEADER_SIGNATURE = {79, 112, 117, 115, 84, 97, 103, 115};

    private long getPacketDurationUs(byte[] bArr) {
        int i14;
        int i15;
        byte b14 = bArr[0];
        int i16 = b14 & UnsignedBytes.MAX_VALUE;
        int i17 = b14 & 3;
        if (i17 != 0) {
            i14 = 2;
            if (i17 != 1 && i17 != 2) {
                i14 = bArr[1] & 63;
            }
        } else {
            i14 = 1;
        }
        int i18 = i16 >> 3;
        int i19 = i18 & 3;
        if (i18 >= 16) {
            i15 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i19;
        } else if (i18 >= 12) {
            i15 = 10000 << (i18 & 1);
        } else {
            i15 = i19 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : 10000 << i19;
        }
        return ((long) i14) * ((long) i15);
    }

    private static boolean peekPacketStartsWith(ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.bytesLeft() < bArr.length) {
            return false;
        }
        int position = parsableByteArray.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.readBytes(bArr2, 0, bArr.length);
        parsableByteArray.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        return peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public long preparePayload(ParsableByteArray parsableByteArray) {
        return convertTimeToGranule(getPacketDurationUs(parsableByteArray.getData()));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public boolean readHeaders(ParsableByteArray parsableByteArray, long j8, StreamReader.SetupData setupData) {
        if (peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE)) {
            byte[] bArrCopyOf = Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit());
            int channelCount = OpusUtil.getChannelCount(bArrCopyOf);
            List<byte[]> listBuildInitializationData = OpusUtil.buildInitializationData(bArrCopyOf);
            Assertions.checkState(setupData.format == null);
            setupData.format = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_OPUS).setChannelCount(channelCount).setSampleRate(OpusUtil.SAMPLE_RATE).setInitializationData(listBuildInitializationData).build();
            return true;
        }
        byte[] bArr = OPUS_COMMENT_HEADER_SIGNATURE;
        if (!peekPacketStartsWith(parsableByteArray, bArr)) {
            Assertions.checkStateNotNull(setupData.format);
            return false;
        }
        Assertions.checkStateNotNull(setupData.format);
        parsableByteArray.skipBytes(bArr.length);
        Metadata vorbisComments = VorbisUtil.parseVorbisComments(ImmutableList.copyOf(VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments));
        if (vorbisComments == null) {
            return true;
        }
        setupData.format = setupData.format.buildUpon().setMetadata(vorbisComments.copyWithAppendedEntriesFrom(setupData.format.metadata)).build();
        return true;
    }
}
