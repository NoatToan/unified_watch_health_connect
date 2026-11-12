package androidx.media3.muxer;

import android.media.MediaCodec;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
final class FragmentedMp4Writer {
    private final AnnexBToAvccConverter annexBToAvccConverter;
    private final long fragmentDurationUs;
    private boolean headerCreated;
    private long maxTrackDurationUs;
    private final Mp4MoovStructure moovGenerator;
    private final FileChannel output;
    private final FileOutputStream outputStream;
    private final boolean sampleCopyEnabled;
    private Track videoTrack;
    private final List<Track> tracks = new ArrayList();
    private long minInputPresentationTimeUs = Long.MAX_VALUE;
    private int currentFragmentSequenceNumber = 1;

    public static class SampleMetadata {
        public final int compositionTimeOffsetVu;
        public final long durationVu;
        public final int flags;
        public final int size;

        public SampleMetadata(long j, int i, int i2, int i3) {
            this.durationVu = j;
            this.size = i;
            this.flags = i2;
            this.compositionTimeOffsetVu = i3;
        }
    }

    public FragmentedMp4Writer(FileOutputStream fileOutputStream, Mp4MoovStructure mp4MoovStructure, AnnexBToAvccConverter annexBToAvccConverter, long j, boolean z) {
        this.outputStream = fileOutputStream;
        this.output = fileOutputStream.getChannel();
        this.moovGenerator = mp4MoovStructure;
        this.annexBToAvccConverter = annexBToAvccConverter;
        this.sampleCopyEnabled = z;
        this.fragmentDurationUs = j * 1000;
    }

    public Muxer.TrackToken addTrack(int i, Format format) {
        Track track = new Track(format, this.sampleCopyEnabled);
        this.tracks.add(track);
        if (MimeTypes.isVideo(format.sampleMimeType)) {
            this.videoTrack = track;
        }
        return track;
    }

    public void writeSampleData(Muxer.TrackToken trackToken, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws IOException {
        Assertions.checkArgument(trackToken instanceof Track);
        if (!this.headerCreated) {
            createHeader();
            this.headerCreated = true;
        }
        Track track = (Track) trackToken;
        if (shouldFlushPendingSamples(track, bufferInfo)) {
            createFragment();
        }
        track.writeSampleData(byteBuffer, bufferInfo);
        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekFirst());
        MediaCodec.BufferInfo bufferInfo3 = (MediaCodec.BufferInfo) Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekLast());
        this.minInputPresentationTimeUs = Math.min(this.minInputPresentationTimeUs, bufferInfo2.presentationTimeUs);
        this.maxTrackDurationUs = Math.max(this.maxTrackDurationUs, bufferInfo3.presentationTimeUs - bufferInfo2.presentationTimeUs);
    }

    public void close() throws IOException {
        try {
            createFragment();
        } finally {
            this.output.close();
            this.outputStream.close();
        }
    }

    private static ImmutableList<ByteBuffer> createTrafBoxes(List<ProcessedTrackInfo> list, long j) {
        ImmutableList.c cVar = new ImmutableList.c();
        int iCalculateMoofBoxSize = calculateMoofBoxSize(list) + 8;
        for (int i = 0; i < list.size(); i++) {
            ProcessedTrackInfo processedTrackInfo = list.get(i);
            cVar.add(Boxes.traf(Boxes.tfhd(processedTrackInfo.trackId, j), Boxes.trun(processedTrackInfo.pendingSamplesMetadata, iCalculateMoofBoxSize, processedTrackInfo.hasBFrame)));
            iCalculateMoofBoxSize += processedTrackInfo.totalSamplesSize;
        }
        return cVar.build();
    }

    private static int calculateMoofBoxSize(List<ProcessedTrackInfo> list) {
        int trunBoxContentSize = 0;
        for (int i = 0; i < list.size(); i++) {
            ProcessedTrackInfo processedTrackInfo = list.get(i);
            trunBoxContentSize += Boxes.getTrunBoxContentSize(processedTrackInfo.pendingSamplesMetadata.size(), processedTrackInfo.hasBFrame) + 40;
        }
        return trunBoxContentSize + 24;
    }

    private void createHeader() throws IOException {
        this.output.position(0L);
        this.output.write(Boxes.ftyp());
        this.output.write(this.moovGenerator.moovMetadataHeader(this.tracks, 0L, true));
    }

    private boolean shouldFlushPendingSamples(Track track, MediaCodec.BufferInfo bufferInfo) {
        Track track2 = this.videoTrack;
        if (track2 == null) {
            return this.maxTrackDurationUs >= this.fragmentDurationUs;
        }
        if (track.equals(track2) && track.hadKeyframe && (bufferInfo.flags & 1) > 0) {
            if (((MediaCodec.BufferInfo) Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekLast())).presentationTimeUs - ((MediaCodec.BufferInfo) Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekFirst())).presentationTimeUs >= this.fragmentDurationUs) {
                return true;
            }
        }
        return false;
    }

    private void createFragment() throws IOException {
        ImmutableList<ProcessedTrackInfo> immutableListProcessAllTracks = processAllTracks();
        ImmutableList<ByteBuffer> immutableListCreateTrafBoxes = createTrafBoxes(immutableListProcessAllTracks, this.output.position());
        if (immutableListCreateTrafBoxes.isEmpty()) {
            return;
        }
        this.output.write(Boxes.moof(Boxes.mfhd(this.currentFragmentSequenceNumber), immutableListCreateTrafBoxes));
        writeMdatBox(immutableListProcessAllTracks);
        this.currentFragmentSequenceNumber++;
    }

    private void writeMdatBox(List<ProcessedTrackInfo> list) throws IOException {
        long jPosition = this.output.position();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(8);
        byteBufferAllocate.put(Util.getUtf8Bytes("mdat"));
        byteBufferAllocate.flip();
        this.output.write(byteBufferAllocate);
        long jWrite = 0;
        for (int i = 0; i < list.size(); i++) {
            ProcessedTrackInfo processedTrackInfo = list.get(i);
            for (int i2 = 0; i2 < processedTrackInfo.pendingSamplesByteBuffer.size(); i2++) {
                jWrite += (long) this.output.write(processedTrackInfo.pendingSamplesByteBuffer.get(i2));
            }
        }
        long jPosition2 = this.output.position();
        this.output.position(jPosition);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
        long j = jWrite + ((long) 8);
        Assertions.checkArgument(j <= Mp4Utils.UNSIGNED_INT_MAX_VALUE, "Only 32-bit long mdat size supported in the fragmented MP4");
        byteBufferAllocate2.putInt((int) j);
        byteBufferAllocate2.flip();
        this.output.write(byteBufferAllocate2);
        this.output.position(jPosition2);
    }

    private ImmutableList<ProcessedTrackInfo> processAllTracks() {
        ImmutableList.c cVar = new ImmutableList.c();
        for (int i = 0; i < this.tracks.size(); i++) {
            if (!this.tracks.get(i).pendingSamplesBufferInfo.isEmpty()) {
                cVar.add(processTrack(i + 1, this.tracks.get(i)));
            }
        }
        return cVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ProcessedTrackInfo processTrack(int i, Track track) {
        long j;
        Assertions.checkState(track.pendingSamplesByteBuffer.size() == track.pendingSamplesBufferInfo.size());
        ImmutableList.c cVar = new ImmutableList.c();
        ImmutableList.c cVar2 = new ImmutableList.c();
        if (AnnexBUtils.doesSampleContainAnnexBNalUnits((String) Assertions.checkNotNull(track.format.sampleMimeType))) {
            while (!track.pendingSamplesByteBuffer.isEmpty()) {
                ByteBuffer byteBufferProcess = this.annexBToAvccConverter.process(track.pendingSamplesByteBuffer.removeFirst());
                cVar.add(byteBufferProcess);
                MediaCodec.BufferInfo bufferInfoRemoveFirst = track.pendingSamplesBufferInfo.removeFirst();
                bufferInfoRemoveFirst.set(byteBufferProcess.position(), byteBufferProcess.remaining(), bufferInfoRemoveFirst.presentationTimeUs, bufferInfoRemoveFirst.flags);
                cVar2.add(bufferInfoRemoveFirst);
            }
        } else {
            cVar.addAll(track.pendingSamplesByteBuffer);
            track.pendingSamplesByteBuffer.clear();
            cVar2.addAll(track.pendingSamplesBufferInfo);
            track.pendingSamplesBufferInfo.clear();
        }
        ImmutableList immutableListBuild = cVar2.build();
        if (this.currentFragmentSequenceNumber == 1) {
            j = this.minInputPresentationTimeUs;
        } else {
            j = ((MediaCodec.BufferInfo) immutableListBuild.get(0)).presentationTimeUs;
        }
        List<Long> listConvertPresentationTimestampsToDurationsVu = Boxes.convertPresentationTimestampsToDurationsVu(immutableListBuild, j, track.videoUnitTimebase(), 1);
        List<Integer> listCalculateSampleCompositionTimeOffsets = Boxes.calculateSampleCompositionTimeOffsets(immutableListBuild, listConvertPresentationTimestampsToDurationsVu, track.videoUnitTimebase());
        boolean zIsEmpty = listCalculateSampleCompositionTimeOffsets.isEmpty();
        ImmutableList.c cVar3 = new ImmutableList.c();
        int i2 = 0;
        for (int i3 = 0; i3 < immutableListBuild.size(); i3++) {
            i2 += ((MediaCodec.BufferInfo) immutableListBuild.get(i3)).size;
            cVar3.add(new SampleMetadata(listConvertPresentationTimestampsToDurationsVu.get(i3).longValue(), ((MediaCodec.BufferInfo) immutableListBuild.get(i3)).size, ((MediaCodec.BufferInfo) immutableListBuild.get(i3)).flags, !zIsEmpty ? listCalculateSampleCompositionTimeOffsets.get(i3).intValue() : 0));
        }
        return new ProcessedTrackInfo(i, i2, !zIsEmpty, cVar.build(), cVar3.build());
    }

    static class ProcessedTrackInfo {
        public final boolean hasBFrame;
        public final ImmutableList<ByteBuffer> pendingSamplesByteBuffer;
        public final ImmutableList<SampleMetadata> pendingSamplesMetadata;
        public final int totalSamplesSize;
        public final int trackId;

        public ProcessedTrackInfo(int i, int i2, boolean z, ImmutableList<ByteBuffer> immutableList, ImmutableList<SampleMetadata> immutableList2) {
            this.trackId = i;
            this.totalSamplesSize = i2;
            this.hasBFrame = z;
            this.pendingSamplesByteBuffer = immutableList;
            this.pendingSamplesMetadata = immutableList2;
        }
    }
}
