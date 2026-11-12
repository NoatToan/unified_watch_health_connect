package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaFormatUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
final class FrameworkMuxer implements Muxer {
    private final MediaMuxer a;
    private final String b;
    private final MediaCodec.BufferInfo c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(String mimeType) {
        if (mimeType.equals(MimeTypes.VIDEO_MP4)) {
            return 0;
        }
        if (Util.SDK_INT < 21 || !mimeType.equals(MimeTypes.VIDEO_WEBM)) {
            throw new IllegalArgumentException(mimeType.length() != 0 ? "Unsupported output MIME type: ".concat(mimeType) : new String("Unsupported output MIME type: "));
        }
        return 1;
    }

    @Override // com.google.android.exoplayer2.transformer.Muxer
    public void a(boolean forCancellation) {
        if (!this.d) {
            this.a.release();
            return;
        }
        this.d = false;
        try {
            try {
                this.a.stop();
            } catch (Throwable th) {
                this.a.release();
                throw th;
            }
        } catch (IllegalStateException e) {
            if (Util.SDK_INT < 30) {
                try {
                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    int iIntValue = ((Integer) Util.castNonNull((Integer) declaredField.get(this.a))).intValue();
                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.a, Integer.valueOf(iIntValue));
                } catch (Exception unused) {
                }
            }
            if (!forCancellation) {
                throw e;
            }
        }
        this.a.release();
    }

    @Override // com.google.android.exoplayer2.transformer.Muxer
    public boolean b(@Nullable String mimeType) {
        int i;
        boolean zIsAudio = MimeTypes.isAudio(mimeType);
        boolean zIsVideo = MimeTypes.isVideo(mimeType);
        if (this.b.equals(MimeTypes.VIDEO_MP4)) {
            if (zIsVideo) {
                if (MimeTypes.VIDEO_H263.equals(mimeType) || MimeTypes.VIDEO_H264.equals(mimeType) || MimeTypes.VIDEO_MP4V.equals(mimeType)) {
                    return true;
                }
                return Util.SDK_INT >= 24 && MimeTypes.VIDEO_H265.equals(mimeType);
            }
            if (zIsAudio) {
                return MimeTypes.AUDIO_AAC.equals(mimeType) || MimeTypes.AUDIO_AMR_NB.equals(mimeType) || MimeTypes.AUDIO_AMR_WB.equals(mimeType);
            }
        } else if (this.b.equals(MimeTypes.VIDEO_WEBM) && (i = Util.SDK_INT) >= 21) {
            if (zIsVideo) {
                if (MimeTypes.VIDEO_VP8.equals(mimeType)) {
                    return true;
                }
                return i >= 24 && MimeTypes.VIDEO_VP9.equals(mimeType);
            }
            if (zIsAudio) {
                return MimeTypes.AUDIO_VORBIS.equals(mimeType);
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.transformer.Muxer
    public void c(int i, ByteBuffer byteBuffer, boolean z, long j) {
        if (!this.d) {
            this.d = true;
            this.a.start();
        }
        int iPosition = byteBuffer.position();
        this.c.set(iPosition, byteBuffer.limit() - iPosition, j, z ? 1 : 0);
        this.a.writeSampleData(i, byteBuffer, this.c);
    }

    @Override // com.google.android.exoplayer2.transformer.Muxer
    public int d(Format format) {
        MediaFormat mediaFormatCreateVideoFormat;
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        if (MimeTypes.isAudio(str)) {
            mediaFormatCreateVideoFormat = MediaFormat.createAudioFormat((String) Util.castNonNull(str), format.sampleRate, format.channelCount);
        } else {
            mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat((String) Util.castNonNull(str), format.width, format.height);
            this.a.setOrientationHint(format.rotationDegrees);
        }
        MediaFormatUtil.setCsdBuffers(mediaFormatCreateVideoFormat, format.initializationData);
        return this.a.addTrack(mediaFormatCreateVideoFormat);
    }

    public static final class Factory implements Muxer.Factory {
        @Override // com.google.android.exoplayer2.transformer.Muxer.Factory
        public boolean supportsOutputMimeType(String mimeType) {
            try {
                FrameworkMuxer.f(mimeType);
                return true;
            } catch (IllegalStateException unused) {
                return false;
            }
        }

        @Override // com.google.android.exoplayer2.transformer.Muxer.Factory
        public FrameworkMuxer create(String path, String outputMimeType) throws IOException {
            return new FrameworkMuxer(new MediaMuxer(path, FrameworkMuxer.f(outputMimeType)), outputMimeType);
        }

        @Override // com.google.android.exoplayer2.transformer.Muxer.Factory
        @RequiresApi(26)
        public FrameworkMuxer create(ParcelFileDescriptor parcelFileDescriptor, String outputMimeType) throws IOException {
            return new FrameworkMuxer(new MediaMuxer(parcelFileDescriptor.getFileDescriptor(), FrameworkMuxer.f(outputMimeType)), outputMimeType);
        }
    }

    private FrameworkMuxer(MediaMuxer mediaMuxer, String outputMimeType) {
        this.a = mediaMuxer;
        this.b = outputMimeType;
        this.c = new MediaCodec.BufferInfo();
    }
}
