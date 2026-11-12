package androidx.media3.transformer;

import android.media.MediaCodec;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.muxer.Muxer;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultMuxer implements Muxer {
    private final Muxer muxer;

    public static final class Factory implements Muxer.Factory {
        private final Muxer.Factory muxerFactory;

        public Factory() {
            this(C.TIME_UNSET);
        }

        public Factory(long j) {
            this.muxerFactory = new FrameworkMuxer.Factory(j);
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public Muxer create(String str) throws Muxer.MuxerException {
            return new DefaultMuxer(this.muxerFactory.create(str));
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public ImmutableList<String> getSupportedSampleMimeTypes(int i) {
            return this.muxerFactory.getSupportedSampleMimeTypes(i);
        }
    }

    private DefaultMuxer(Muxer muxer) {
        this.muxer = muxer;
    }

    @Override // androidx.media3.muxer.Muxer
    public Muxer.TrackToken addTrack(Format format) throws Muxer.MuxerException {
        return this.muxer.addTrack(format);
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(Muxer.TrackToken trackToken, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws Muxer.MuxerException {
        this.muxer.writeSampleData(trackToken, byteBuffer, bufferInfo);
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        this.muxer.addMetadataEntry(entry);
    }

    @Override // androidx.media3.muxer.Muxer
    public void close() throws Muxer.MuxerException {
        this.muxer.close();
    }
}
