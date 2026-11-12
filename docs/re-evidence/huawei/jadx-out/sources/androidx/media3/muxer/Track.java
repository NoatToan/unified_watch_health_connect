package androidx.media3.muxer;

import android.media.MediaCodec;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.OpusUtil;
import com.google.common.collect.ImmutableList;
import com.huawei.health.device.wifi.control.logic.AccessNetWorkTask;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
final class Track implements Muxer.TrackToken, Mp4MoovStructure.TrackMetadataProvider {
    public final Format format;
    public boolean hadKeyframe;
    public final Deque<MediaCodec.BufferInfo> pendingSamplesBufferInfo;
    public final Deque<ByteBuffer> pendingSamplesByteBuffer;
    private final boolean sampleCopyEnabled;
    public final int sortKey;
    public final List<Long> writtenChunkOffsets;
    public final List<Integer> writtenChunkSampleCounts;
    public final List<MediaCodec.BufferInfo> writtenSamples;

    public Track(Format format, boolean z) {
        this(format, 1, z);
    }

    public Track(Format format, int i, boolean z) {
        this.format = format;
        this.sortKey = i;
        this.sampleCopyEnabled = z;
        this.writtenSamples = new ArrayList();
        this.writtenChunkOffsets = new ArrayList();
        this.writtenChunkSampleCounts = new ArrayList();
        this.pendingSamplesBufferInfo = new ArrayDeque();
        this.pendingSamplesByteBuffer = new ArrayDeque();
    }

    public void writeSampleData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (bufferInfo.size == 0 || byteBuffer.remaining() == 0) {
            return;
        }
        if ((bufferInfo.flags & 1) > 0) {
            this.hadKeyframe = true;
        }
        if (this.hadKeyframe || !MimeTypes.isVideo(this.format.sampleMimeType)) {
            if (this.sampleCopyEnabled) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
                byteBufferAllocateDirect.put(byteBuffer);
                byteBufferAllocateDirect.rewind();
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                bufferInfo2.set(byteBufferAllocateDirect.position(), byteBufferAllocateDirect.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                bufferInfo = bufferInfo2;
                byteBuffer = byteBufferAllocateDirect;
            }
            this.pendingSamplesBufferInfo.addLast(bufferInfo);
            this.pendingSamplesByteBuffer.addLast(byteBuffer);
        }
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public int videoUnitTimebase() {
        return MimeTypes.isAudio(this.format.sampleMimeType) ? OpusUtil.SAMPLE_RATE : AccessNetWorkTask.TIME_OUT_ALL;
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public ImmutableList<MediaCodec.BufferInfo> writtenSamples() {
        return ImmutableList.copyOf((Collection) this.writtenSamples);
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public ImmutableList<Long> writtenChunkOffsets() {
        return ImmutableList.copyOf((Collection) this.writtenChunkOffsets);
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public ImmutableList<Integer> writtenChunkSampleCounts() {
        return ImmutableList.copyOf((Collection) this.writtenChunkSampleCounts);
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public Format format() {
        return this.format;
    }
}
