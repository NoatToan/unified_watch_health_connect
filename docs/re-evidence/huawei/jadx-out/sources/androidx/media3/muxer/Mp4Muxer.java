package androidx.media3.muxer;

import android.media.MediaCodec;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public final class Mp4Muxer implements Muxer {
    public static final int LAST_FRAME_DURATION_BEHAVIOR_DUPLICATE_PREV_DURATION = 1;
    public static final int LAST_FRAME_DURATION_BEHAVIOR_INSERT_SHORT_FRAME = 0;
    private final MetadataCollector metadataCollector;
    private final Mp4Writer mp4Writer;

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LastFrameDurationBehavior {
    }

    public static final class Builder {
        private AnnexBToAvccConverter annexBToAvccConverter;
        private final FileOutputStream fileOutputStream;
        private int lastFrameDurationBehavior = 0;
        private boolean sampleCopyEnabled = true;
        private boolean attemptStreamableOutputEnabled = true;

        public Builder(FileOutputStream fileOutputStream) {
            this.fileOutputStream = (FileOutputStream) Assertions.checkNotNull(fileOutputStream);
        }

        public Builder setLastFrameDurationBehavior(int i) {
            this.lastFrameDurationBehavior = i;
            return this;
        }

        public Builder setAnnexBToAvccConverter(AnnexBToAvccConverter annexBToAvccConverter) {
            this.annexBToAvccConverter = annexBToAvccConverter;
            return this;
        }

        public Builder setSampleCopyEnabled(boolean z) {
            this.sampleCopyEnabled = z;
            return this;
        }

        public Builder setAttemptStreamableOutputEnabled(boolean z) {
            this.attemptStreamableOutputEnabled = z;
            return this;
        }

        public Mp4Muxer build() {
            MetadataCollector metadataCollector = new MetadataCollector();
            Mp4MoovStructure mp4MoovStructure = new Mp4MoovStructure(metadataCollector, this.lastFrameDurationBehavior);
            FileOutputStream fileOutputStream = this.fileOutputStream;
            AnnexBToAvccConverter annexBToAvccConverter = this.annexBToAvccConverter;
            if (annexBToAvccConverter == null) {
                annexBToAvccConverter = AnnexBToAvccConverter.DEFAULT;
            }
            return new Mp4Muxer(new Mp4Writer(fileOutputStream, mp4MoovStructure, annexBToAvccConverter, this.sampleCopyEnabled, this.attemptStreamableOutputEnabled), metadataCollector);
        }
    }

    private Mp4Muxer(Mp4Writer mp4Writer, MetadataCollector metadataCollector) {
        this.mp4Writer = mp4Writer;
        this.metadataCollector = metadataCollector;
    }

    @Override // androidx.media3.muxer.Muxer
    public Muxer.TrackToken addTrack(Format format) {
        return addTrack(1, format);
    }

    public Muxer.TrackToken addTrack(int i, Format format) {
        return this.mp4Writer.addTrack(i, format);
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(Muxer.TrackToken trackToken, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws Muxer.MuxerException {
        try {
            this.mp4Writer.writeSampleData(trackToken, byteBuffer, bufferInfo);
        } catch (IOException e) {
            throw new Muxer.MuxerException("Failed to write sample for presentationTimeUs=" + bufferInfo.presentationTimeUs + ", size=" + bufferInfo.size, e);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        Assertions.checkArgument(Mp4Utils.isMetadataSupported(entry), "Unsupported metadata");
        this.metadataCollector.addMetadata(entry);
    }

    @Override // androidx.media3.muxer.Muxer
    public void close() throws Muxer.MuxerException {
        try {
            this.mp4Writer.close();
        } catch (IOException e) {
            throw new Muxer.MuxerException("Failed to close the muxer", e);
        }
    }
}
