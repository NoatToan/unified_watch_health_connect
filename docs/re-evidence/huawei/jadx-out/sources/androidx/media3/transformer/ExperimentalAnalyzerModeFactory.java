package androidx.media3.transformer;

import android.content.Context;
import android.media.MediaCodec;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import androidx.media3.muxer.Muxer;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes21.dex */
public final class ExperimentalAnalyzerModeFactory {
    private ExperimentalAnalyzerModeFactory() {
    }

    public static Transformer buildAnalyzer(Context context) {
        return buildAnalyzer(context, new Transformer.Builder(context).build());
    }

    public static Transformer buildAnalyzer(Context context, Transformer transformer) {
        return transformer.buildUpon().experimentalSetTrimOptimizationEnabled(false).setEncoderFactory(new DroppingEncoder.Factory(context)).setMaxDelayBetweenMuxerSamplesMs(C.TIME_UNSET).setMuxerFactory(new NoWriteMuxer.Factory(ImmutableList.of(MimeTypes.AUDIO_AAC), ImmutableList.of(MimeTypes.VIDEO_H264))).setAudioMimeType(MimeTypes.AUDIO_AAC).setVideoMimeType(MimeTypes.VIDEO_H264).build();
    }

    static final class DroppingEncoder implements Codec {
        private static final int INTERNAL_BUFFER_SIZE = 8196;
        private static final String TAG = "DroppingEncoder";
        private final ByteBuffer buffer = ByteBuffer.allocateDirect(INTERNAL_BUFFER_SIZE).order(ByteOrder.nativeOrder());
        private final Format configurationFormat;
        private final Context context;
        private boolean inputStreamEnded;

        @Override // androidx.media3.transformer.Codec
        public ByteBuffer getOutputBuffer() {
            return null;
        }

        @Override // androidx.media3.transformer.Codec
        public MediaCodec.BufferInfo getOutputBufferInfo() {
            return null;
        }

        @Override // androidx.media3.transformer.Codec
        public void release() {
        }

        @Override // androidx.media3.transformer.Codec
        public void releaseOutputBuffer(long j) {
        }

        @Override // androidx.media3.transformer.Codec
        public void releaseOutputBuffer(boolean z) {
        }

        public static final class Factory implements Codec.EncoderFactory {
            private final Context context;

            public Factory(Context context) {
                this.context = context;
            }

            @Override // androidx.media3.transformer.Codec.EncoderFactory
            public Codec createForAudioEncoding(Format format) {
                return new DroppingEncoder(this.context, format);
            }

            @Override // androidx.media3.transformer.Codec.EncoderFactory
            public Codec createForVideoEncoding(Format format) {
                return new DroppingEncoder(this.context, format);
            }
        }

        public DroppingEncoder(Context context, Format format) {
            this.context = context;
            this.configurationFormat = format;
        }

        @Override // androidx.media3.transformer.Codec
        public String getName() {
            return TAG;
        }

        @Override // androidx.media3.transformer.Codec
        public Format getConfigurationFormat() {
            return this.configurationFormat;
        }

        @Override // androidx.media3.transformer.Codec
        public Surface getInputSurface() {
            return PlaceholderSurface.newInstance(this.context, false);
        }

        @Override // androidx.media3.transformer.Codec
        @EnsuresNonNullIf(expression = {"#1.data"}, result = true)
        public boolean maybeDequeueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
            if (this.inputStreamEnded) {
                return false;
            }
            decoderInputBuffer.data = this.buffer;
            return true;
        }

        @Override // androidx.media3.transformer.Codec
        public void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
            Assertions.checkState(!this.inputStreamEnded, "Input buffer can not be queued after the input stream has ended.");
            if (decoderInputBuffer.isEndOfStream()) {
                this.inputStreamEnded = true;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.data = null;
        }

        @Override // androidx.media3.transformer.Codec
        public void signalEndOfInputStream() {
            this.inputStreamEnded = true;
        }

        @Override // androidx.media3.transformer.Codec
        public Format getOutputFormat() {
            return this.configurationFormat;
        }

        @Override // androidx.media3.transformer.Codec
        public boolean isEnded() {
            return this.inputStreamEnded;
        }
    }

    static final class NoWriteMuxer implements Muxer {
        @Override // androidx.media3.muxer.Muxer
        public void addMetadataEntry(Metadata.Entry entry) {
        }

        @Override // androidx.media3.muxer.Muxer
        public void close() {
        }

        @Override // androidx.media3.muxer.Muxer
        public void writeSampleData(Muxer.TrackToken trackToken, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        }

        private NoWriteMuxer() {
        }

        public static final class Factory implements Muxer.Factory {
            private final ImmutableList<String> audioMimeTypes;
            private final ImmutableList<String> videoMimeTypes;

            public Factory(ImmutableList<String> immutableList, ImmutableList<String> immutableList2) {
                this.audioMimeTypes = immutableList;
                this.videoMimeTypes = immutableList2;
            }

            @Override // androidx.media3.muxer.Muxer.Factory
            public Muxer create(String str) {
                return new NoWriteMuxer();
            }

            @Override // androidx.media3.muxer.Muxer.Factory
            public ImmutableList<String> getSupportedSampleMimeTypes(int i) {
                if (i == 1) {
                    return this.audioMimeTypes;
                }
                if (i == 2) {
                    return this.videoMimeTypes;
                }
                return ImmutableList.of();
            }
        }

        @Override // androidx.media3.muxer.Muxer
        public Muxer.TrackToken addTrack(Format format) {
            return new Muxer.TrackToken() { // from class: androidx.media3.transformer.ExperimentalAnalyzerModeFactory.NoWriteMuxer.1
            };
        }
    }
}
