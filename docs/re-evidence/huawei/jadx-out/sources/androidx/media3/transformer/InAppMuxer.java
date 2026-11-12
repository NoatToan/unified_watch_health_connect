package androidx.media3.transformer;

import android.media.MediaCodec;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.muxer.FragmentedMp4Muxer;
import androidx.media3.muxer.Mp4Muxer;
import androidx.media3.muxer.Mp4Utils;
import androidx.media3.muxer.Muxer;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class InAppMuxer implements Muxer {
    private final Set<Metadata.Entry> metadataEntries;
    private final MetadataProvider metadataProvider;
    private final Muxer muxer;

    public interface MetadataProvider {
        void updateMetadataEntries(Set<Metadata.Entry> set);
    }

    public static final class Factory implements Muxer.Factory {
        private final long fragmentDurationMs;
        private final MetadataProvider metadataProvider;
        private final boolean outputFragmentedMp4;
        private static final ImmutableList<String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = ImmutableList.of(MimeTypes.VIDEO_H264, MimeTypes.VIDEO_H265, MimeTypes.VIDEO_AV1);
        private static final ImmutableList<String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = ImmutableList.of(MimeTypes.AUDIO_AAC);

        public static final class Builder {
            private long fragmentDurationMs = C.TIME_UNSET;
            private MetadataProvider metadataProvider;
            private boolean outputFragmentedMp4;

            public Builder setMetadataProvider(MetadataProvider metadataProvider) {
                this.metadataProvider = metadataProvider;
                return this;
            }

            public Builder setOutputFragmentedMp4(boolean z) {
                this.outputFragmentedMp4 = z;
                return this;
            }

            public Builder setFragmentDurationMs(long j) {
                this.fragmentDurationMs = j;
                return this;
            }

            public Factory build() {
                return new Factory(this.metadataProvider, this.outputFragmentedMp4, this.fragmentDurationMs);
            }
        }

        private Factory(MetadataProvider metadataProvider, boolean z, long j) {
            this.metadataProvider = metadataProvider;
            this.outputFragmentedMp4 = z;
            this.fragmentDurationMs = j;
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public InAppMuxer create(String str) throws Muxer.MuxerException {
            Muxer muxerBuild;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                if (!this.outputFragmentedMp4) {
                    muxerBuild = new Mp4Muxer.Builder(fileOutputStream).build();
                } else if (this.fragmentDurationMs != C.TIME_UNSET) {
                    muxerBuild = new FragmentedMp4Muxer.Builder(fileOutputStream).setFragmentDurationMs(this.fragmentDurationMs).build();
                } else {
                    muxerBuild = new FragmentedMp4Muxer.Builder(fileOutputStream).build();
                }
                return new InAppMuxer(muxerBuild, this.metadataProvider);
            } catch (FileNotFoundException e) {
                throw new Muxer.MuxerException("Error creating file output stream", e);
            }
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public ImmutableList<String> getSupportedSampleMimeTypes(int i) {
            if (i == 2) {
                return SUPPORTED_VIDEO_SAMPLE_MIME_TYPES;
            }
            if (i == 1) {
                return SUPPORTED_AUDIO_SAMPLE_MIME_TYPES;
            }
            return ImmutableList.of();
        }
    }

    private InAppMuxer(Muxer muxer, MetadataProvider metadataProvider) {
        this.muxer = muxer;
        this.metadataProvider = metadataProvider;
        this.metadataEntries = new LinkedHashSet();
    }

    @Override // androidx.media3.muxer.Muxer
    public Muxer.TrackToken addTrack(Format format) throws Muxer.MuxerException {
        Muxer.TrackToken trackTokenAddTrack = this.muxer.addTrack(format);
        if (MimeTypes.isVideo(format.sampleMimeType)) {
            this.muxer.addMetadataEntry(new Mp4OrientationData(format.rotationDegrees));
        }
        return trackTokenAddTrack;
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(Muxer.TrackToken trackToken, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws Muxer.MuxerException {
        this.muxer.writeSampleData(trackToken, byteBuffer, bufferInfo);
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        if (Mp4Utils.isMetadataSupported(entry)) {
            this.metadataEntries.add(entry);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void close() throws Muxer.MuxerException {
        writeMetadata();
        this.muxer.close();
    }

    private void writeMetadata() {
        if (this.metadataProvider != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.metadataEntries);
            this.metadataProvider.updateMetadataEntries(linkedHashSet);
            this.metadataEntries.clear();
            this.metadataEntries.addAll(linkedHashSet);
        }
        Iterator<Metadata.Entry> it = this.metadataEntries.iterator();
        while (it.hasNext()) {
            this.muxer.addMetadataEntry(it.next());
        }
    }
}
