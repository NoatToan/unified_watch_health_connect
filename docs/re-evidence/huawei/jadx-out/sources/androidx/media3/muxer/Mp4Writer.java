package androidx.media3.muxer;

import android.media.MediaCodec;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import defpackage.amv;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
final class Mp4Writer {
    private static final int DEFAULT_MOOV_BOX_SIZE_BYTES = 400000;
    private static final String FREE_BOX_TYPE = "free";
    private static final long INTERLEAVE_DURATION_US = 1000000;
    private final AnnexBToAvccConverter annexBToAvccConverter;
    private boolean canWriteMoovAtStart;
    private long mdatDataEnd;
    private long mdatEnd;
    private long mdatStart;
    private final Mp4MoovStructure moovGenerator;
    private final FileChannel output;
    private final FileOutputStream outputStream;
    private long reservedMoovSpaceEnd;
    private long reservedMoovSpaceStart;
    private final boolean sampleCopyEnabled;
    private final List<Track> tracks = new ArrayList();
    private final AtomicBoolean hasWrittenSamples = new AtomicBoolean(false);
    private amv<Long> lastMoovWritten = amv.d(0L, 0L);

    public Mp4Writer(FileOutputStream fileOutputStream, Mp4MoovStructure mp4MoovStructure, AnnexBToAvccConverter annexBToAvccConverter, boolean z, boolean z2) {
        this.outputStream = fileOutputStream;
        this.output = fileOutputStream.getChannel();
        this.moovGenerator = mp4MoovStructure;
        this.annexBToAvccConverter = annexBToAvccConverter;
        this.sampleCopyEnabled = z;
        this.canWriteMoovAtStart = z2;
    }

    public Muxer.TrackToken addTrack(int i, Format format) {
        Track track = new Track(format, i, this.sampleCopyEnabled);
        this.tracks.add(track);
        Collections.sort(this.tracks, new Comparator() { // from class: androidx.media3.muxer.Mp4Writer$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((Track) obj).sortKey, ((Track) obj2).sortKey);
            }
        });
        return track;
    }

    public void writeSampleData(Muxer.TrackToken trackToken, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws IOException {
        Assertions.checkArgument(trackToken instanceof Track);
        ((Track) trackToken).writeSampleData(byteBuffer, bufferInfo);
        doInterleave();
    }

    public void close() throws IOException {
        for (int i = 0; i < this.tracks.size(); i++) {
            try {
                flushPending(this.tracks.get(i));
            } catch (Throwable th) {
                this.output.close();
                this.outputStream.close();
                throw th;
            }
        }
        if (this.hasWrittenSamples.get()) {
            writeMoovAndTrim();
        }
        this.output.close();
        this.outputStream.close();
    }

    private void writeHeader() throws IOException {
        this.output.position(0L);
        this.output.write(Boxes.ftyp());
        if (this.canWriteMoovAtStart) {
            this.reservedMoovSpaceStart = this.output.position();
            this.output.write(BoxUtils.wrapIntoBox(FREE_BOX_TYPE, ByteBuffer.allocate(DEFAULT_MOOV_BOX_SIZE_BYTES)));
            this.reservedMoovSpaceEnd = this.output.position();
        }
        this.mdatStart = this.output.position();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(Util.getUtf8Bytes("mdat"));
        byteBufferAllocate.putLong(16L);
        byteBufferAllocate.flip();
        this.output.write(byteBufferAllocate);
        long j = this.mdatStart + 16;
        this.mdatDataEnd = j;
        if (this.canWriteMoovAtStart) {
            j = Long.MAX_VALUE;
        }
        this.mdatEnd = j;
    }

    private ByteBuffer assembleCurrentMoovData() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.tracks.size(); i++) {
            Track track = this.tracks.get(i);
            if (!track.writtenSamples.isEmpty()) {
                jMin = Math.min(track.writtenSamples.get(0).presentationTimeUs, jMin);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            return this.moovGenerator.moovMetadataHeader(this.tracks, jMin, false);
        }
        return ByteBuffer.allocate(0);
    }

    private void safelyReplaceMoovAtEnd(long j, ByteBuffer byteBuffer) throws IOException {
        Assertions.checkState(j >= ((Long) this.lastMoovWritten.h()).longValue());
        Assertions.checkState(j >= this.mdatEnd);
        this.output.position(j);
        this.output.write(BoxUtils.wrapIntoBox(FREE_BOX_TYPE, byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.mdatEnd = j2;
        updateMdatSize(j2 - this.mdatStart);
        this.lastMoovWritten = amv.d(Long.valueOf(j), Long.valueOf(j + ((long) byteBuffer.remaining())));
    }

    private void maybeWriteMoovAtStart() throws IOException {
        ByteBuffer byteBufferAssembleCurrentMoovData = assembleCurrentMoovData();
        int iRemaining = byteBufferAssembleCurrentMoovData.remaining();
        long jRemaining = byteBufferAssembleCurrentMoovData.remaining() + 8;
        long j = this.reservedMoovSpaceEnd;
        long j2 = this.reservedMoovSpaceStart;
        if (jRemaining <= j - j2) {
            this.output.position(j2);
            this.output.write(byteBufferAssembleCurrentMoovData);
            this.output.write(BoxUtils.wrapIntoBox(FREE_BOX_TYPE, ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.output.position()) - 8))));
        } else {
            this.canWriteMoovAtStart = false;
            long j3 = this.mdatDataEnd;
            this.mdatEnd = j3;
            this.output.position(j3);
            this.output.write(byteBufferAssembleCurrentMoovData);
            this.lastMoovWritten = amv.d(Long.valueOf(this.mdatEnd), Long.valueOf(this.mdatEnd + ((long) iRemaining)));
            this.output.write(BoxUtils.wrapIntoBox(FREE_BOX_TYPE, ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.reservedMoovSpaceStart) - 8))), this.reservedMoovSpaceStart);
        }
        updateMdatSize(this.mdatDataEnd - this.mdatStart);
    }

    private void writeMoovAndTrim() throws IOException {
        if (this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
            return;
        }
        ByteBuffer byteBufferAssembleCurrentMoovData = assembleCurrentMoovData();
        int iRemaining = byteBufferAssembleCurrentMoovData.remaining();
        long j = iRemaining + 8;
        if (this.mdatEnd - this.mdatDataEnd < j) {
            safelyReplaceMoovAtEnd(((Long) this.lastMoovWritten.h()).longValue() + j, byteBufferAssembleCurrentMoovData);
            Assertions.checkState(this.mdatEnd - this.mdatDataEnd >= j);
        }
        long j2 = this.mdatDataEnd;
        this.output.position(j2);
        this.output.write(byteBufferAssembleCurrentMoovData);
        long j3 = ((long) iRemaining) + j2;
        long jLongValue = ((Long) this.lastMoovWritten.h()).longValue() - j3;
        Assertions.checkState(jLongValue < 2147483647L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) jLongValue);
        byteBufferAllocate.put(Util.getUtf8Bytes(FREE_BOX_TYPE));
        byteBufferAllocate.flip();
        this.output.write(byteBufferAllocate);
        this.mdatEnd = j2;
        updateMdatSize(j2 - this.mdatStart);
        this.lastMoovWritten = amv.d(Long.valueOf(j2), Long.valueOf(j2 + ((long) byteBufferAssembleCurrentMoovData.limit())));
        this.output.truncate(j3);
    }

    private void rewriteMoovWithMdatEmptySpace(long j) throws IOException {
        safelyReplaceMoovAtEnd(Math.max(this.mdatEnd + j, ((Long) this.lastMoovWritten.h()).longValue()), assembleCurrentMoovData());
    }

    private void flushPending(Track track) throws IOException {
        Assertions.checkState(track.pendingSamplesByteBuffer.size() == track.pendingSamplesBufferInfo.size());
        if (track.pendingSamplesBufferInfo.isEmpty()) {
            return;
        }
        if (!this.hasWrittenSamples.getAndSet(true)) {
            writeHeader();
        }
        Iterator<ByteBuffer> it = track.pendingSamplesByteBuffer.iterator();
        long jLimit = 0;
        while (it.hasNext()) {
            jLimit += (long) it.next().limit();
        }
        maybeExtendMdatAndRewriteMoov(jLimit);
        track.writtenChunkOffsets.add(Long.valueOf(this.mdatDataEnd));
        track.writtenChunkSampleCounts.add(Integer.valueOf(track.pendingSamplesBufferInfo.size()));
        do {
            MediaCodec.BufferInfo bufferInfoRemoveFirst = track.pendingSamplesBufferInfo.removeFirst();
            ByteBuffer byteBufferRemoveFirst = track.pendingSamplesByteBuffer.removeFirst();
            if (AnnexBUtils.doesSampleContainAnnexBNalUnits((String) Assertions.checkNotNull(track.format.sampleMimeType))) {
                byteBufferRemoveFirst = this.annexBToAvccConverter.process(byteBufferRemoveFirst);
                bufferInfoRemoveFirst.set(byteBufferRemoveFirst.position(), byteBufferRemoveFirst.remaining(), bufferInfoRemoveFirst.presentationTimeUs, bufferInfoRemoveFirst.flags);
            }
            maybeExtendMdatAndRewriteMoov(byteBufferRemoveFirst.remaining());
            long j = this.mdatDataEnd;
            this.mdatDataEnd = j + ((long) this.output.write(byteBufferRemoveFirst, j));
            track.writtenSamples.add(bufferInfoRemoveFirst);
        } while (!track.pendingSamplesBufferInfo.isEmpty());
        Assertions.checkState(this.mdatDataEnd <= this.mdatEnd);
    }

    private void maybeExtendMdatAndRewriteMoov(long j) throws IOException {
        if (this.canWriteMoovAtStart) {
            return;
        }
        long j2 = this.mdatDataEnd;
        if (j2 + j >= this.mdatEnd) {
            rewriteMoovWithMdatEmptySpace(getMdatExtensionAmount(j2) + j);
        }
    }

    private void updateMdatSize(long j) throws IOException {
        this.output.position(this.mdatStart + 8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.flip();
        this.output.write(byteBufferAllocate);
    }

    private void doInterleave() throws IOException {
        boolean z = false;
        for (int i = 0; i < this.tracks.size(); i++) {
            Track track = this.tracks.get(i);
            if (track.pendingSamplesBufferInfo.size() > 2) {
                if (((MediaCodec.BufferInfo) Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekLast())).presentationTimeUs - ((MediaCodec.BufferInfo) Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekFirst())).presentationTimeUs > 1000000) {
                    flushPending(track);
                    z = true;
                }
            }
        }
        if (z && this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
        }
    }

    private long getMdatExtensionAmount(long j) {
        return Math.min(1000000000L, Math.max(500000L, (long) (j * 0.2f)));
    }
}
