package androidx.media3.transformer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.muxer.Muxer;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
final class FrameworkMuxer implements Muxer {
    public static final String MUXER_STOPPING_FAILED_ERROR_MESSAGE = "Failed to stop the MediaMuxer";
    private boolean isReleased;
    private boolean isStarted;
    private final MediaMuxer mediaMuxer;
    private final Map<Muxer.TrackToken, Long> trackTokenToLastPresentationTimeUs;
    private final Map<Muxer.TrackToken, Long> trackTokenToPresentationTimeOffsetUs;
    private final long videoDurationUs;
    private Muxer.TrackToken videoTrackToken;
    private static final ImmutableList<String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = getSupportedVideoSampleMimeTypes();
    private static final ImmutableList<String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = ImmutableList.of(MimeTypes.AUDIO_AAC, MimeTypes.AUDIO_AMR_NB, MimeTypes.AUDIO_AMR_WB);

    public static final class Factory implements Muxer.Factory {
        private final long videoDurationMs;

        public Factory(long j) {
            this.videoDurationMs = j;
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public FrameworkMuxer create(String str) throws Muxer.MuxerException {
            try {
                return new FrameworkMuxer(new MediaMuxer(str, 0), this.videoDurationMs);
            } catch (IOException e) {
                throw new Muxer.MuxerException("Error creating muxer", e);
            }
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public ImmutableList<String> getSupportedSampleMimeTypes(int i) {
            if (i == 2) {
                return FrameworkMuxer.SUPPORTED_VIDEO_SAMPLE_MIME_TYPES;
            }
            if (i == 1) {
                return FrameworkMuxer.SUPPORTED_AUDIO_SAMPLE_MIME_TYPES;
            }
            return ImmutableList.of();
        }
    }

    private FrameworkMuxer(MediaMuxer mediaMuxer, long j) {
        this.mediaMuxer = mediaMuxer;
        this.videoDurationUs = Util.msToUs(j);
        this.trackTokenToLastPresentationTimeUs = new HashMap();
        this.trackTokenToPresentationTimeOffsetUs = new HashMap();
    }

    @Override // androidx.media3.muxer.Muxer
    public Muxer.TrackToken addTrack(Format format) throws Muxer.MuxerException {
        MediaFormat mediaFormatCreateAudioFormat;
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        boolean zIsVideo = MimeTypes.isVideo(str);
        if (zIsVideo) {
            mediaFormatCreateAudioFormat = MediaFormat.createVideoFormat(str, format.width, format.height);
            MediaFormatUtil.maybeSetColorInfo(mediaFormatCreateAudioFormat, format.colorInfo);
            try {
                this.mediaMuxer.setOrientationHint(format.rotationDegrees);
            } catch (RuntimeException e) {
                throw new Muxer.MuxerException("Failed to set orientation hint with rotationDegrees=" + format.rotationDegrees, e);
            }
        } else {
            mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, format.sampleRate, format.channelCount);
            MediaFormatUtil.maybeSetString(mediaFormatCreateAudioFormat, "language", format.language);
        }
        MediaFormatUtil.setCsdBuffers(mediaFormatCreateAudioFormat, format.initializationData);
        try {
            TrackTokenImpl trackTokenImpl = new TrackTokenImpl(this.mediaMuxer.addTrack(mediaFormatCreateAudioFormat));
            if (zIsVideo) {
                this.videoTrackToken = trackTokenImpl;
            }
            return trackTokenImpl;
        } catch (RuntimeException e2) {
            throw new Muxer.MuxerException("Failed to add track with format=" + format, e2);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(Muxer.TrackToken trackToken, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws Muxer.MuxerException {
        long j = bufferInfo.presentationTimeUs;
        long j2 = this.videoDurationUs;
        if (j2 == C.TIME_UNSET || trackToken != this.videoTrackToken || j <= j2) {
            if (!this.isStarted) {
                if (Util.SDK_INT < 30 && j < 0) {
                    this.trackTokenToPresentationTimeOffsetUs.put(trackToken, Long.valueOf(-j));
                }
                startMuxer();
            }
            long jLongValue = this.trackTokenToPresentationTimeOffsetUs.containsKey(trackToken) ? this.trackTokenToPresentationTimeOffsetUs.get(trackToken).longValue() : 0L;
            long j3 = j + jLongValue;
            long jLongValue2 = this.trackTokenToLastPresentationTimeUs.containsKey(trackToken) ? this.trackTokenToLastPresentationTimeUs.get(trackToken).longValue() : 0L;
            Assertions.checkState(Util.SDK_INT > 24 || j3 >= jLongValue2, "Samples not in presentation order (" + j3 + " < " + jLongValue2 + ") unsupported on this API version");
            this.trackTokenToLastPresentationTimeUs.put(trackToken, Long.valueOf(j3));
            Assertions.checkState(jLongValue == 0 || j3 >= jLongValue2, "Samples not in presentation order (" + j3 + " < " + jLongValue2 + ") unsupported when using negative PTS workaround");
            bufferInfo.set(bufferInfo.offset, bufferInfo.size, j3, bufferInfo.flags);
            try {
                Assertions.checkState(trackToken instanceof TrackTokenImpl);
                this.mediaMuxer.writeSampleData(((TrackTokenImpl) trackToken).trackIndex, byteBuffer, bufferInfo);
            } catch (RuntimeException e) {
                throw new Muxer.MuxerException("Failed to write sample for presentationTimeUs=" + j3 + ", size=" + bufferInfo.size, e);
            }
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        if (entry instanceof Mp4LocationData) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) entry;
            this.mediaMuxer.setLocation(mp4LocationData.latitude, mp4LocationData.longitude);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void close() throws Muxer.MuxerException {
        if (this.isReleased) {
            return;
        }
        if (!this.isStarted) {
            startMuxer();
        }
        if (this.videoDurationUs != C.TIME_UNSET && this.videoTrackToken != null) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(0, 0, this.videoDurationUs, TransformerUtil.getMediaCodecFlags(4));
            writeSampleData((Muxer.TrackToken) Assertions.checkNotNull(this.videoTrackToken), ByteBuffer.allocateDirect(0), bufferInfo);
        }
        this.isStarted = false;
        try {
            try {
                stopMuxer(this.mediaMuxer);
                this.mediaMuxer.release();
                this.isReleased = true;
            } catch (RuntimeException e) {
                throw new Muxer.MuxerException(MUXER_STOPPING_FAILED_ERROR_MESSAGE, e);
            }
        } catch (Throwable th) {
            this.mediaMuxer.release();
            this.isReleased = true;
            throw th;
        }
    }

    private void startMuxer() throws Muxer.MuxerException {
        try {
            this.mediaMuxer.start();
            this.isStarted = true;
        } catch (RuntimeException e) {
            throw new Muxer.MuxerException("Failed to start the muxer", e);
        }
    }

    private static void stopMuxer(MediaMuxer mediaMuxer) {
        try {
            mediaMuxer.stop();
        } catch (RuntimeException e) {
            if (Util.SDK_INT < 30) {
                try {
                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    Integer num = (Integer) Util.castNonNull((Integer) declaredField.get(mediaMuxer));
                    num.intValue();
                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, num);
                } catch (Exception unused) {
                }
            }
            throw e;
        }
    }

    private static ImmutableList<String> getSupportedVideoSampleMimeTypes() {
        ImmutableList.c cVarAdd = new ImmutableList.c().add((Object[]) new String[]{MimeTypes.VIDEO_H264, MimeTypes.VIDEO_H263, MimeTypes.VIDEO_MP4V});
        if (Util.SDK_INT >= 24) {
            cVarAdd.add(MimeTypes.VIDEO_H265);
        }
        if (Util.SDK_INT >= 34) {
            cVarAdd.add(MimeTypes.VIDEO_AV1);
        }
        return cVarAdd.build();
    }

    static class TrackTokenImpl implements Muxer.TrackToken {
        public final int trackIndex;

        public TrackTokenImpl(int i) {
            this.trackIndex = i;
        }
    }
}
