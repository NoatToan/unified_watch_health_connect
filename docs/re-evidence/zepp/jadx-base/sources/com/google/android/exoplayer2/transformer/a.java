package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaFormatUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    private static final int i = 2;
    private final MediaCodecAdapter b;
    private Format c;

    @Nullable
    private ByteBuffer d;
    private boolean g;
    private boolean h;
    private final MediaCodec.BufferInfo a = new MediaCodec.BufferInfo();
    private int e = -1;
    private int f = -1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.transformer.a$a, reason: collision with other inner class name */
    public static class C0155a extends SynchronousMediaCodecAdapter.Factory {
        private final boolean a;

        public C0155a(boolean decoder) {
            this.a = decoder;
        }

        @Override // com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter.Factory
        public MediaCodec createCodec(MediaCodecAdapter.Configuration configuration) throws IOException {
            String str = (String) Assertions.checkNotNull(configuration.mediaFormat.getString("mime"));
            return this.a ? MediaCodec.createDecoderByType((String) Assertions.checkNotNull(str)) : MediaCodec.createEncoderByType((String) Assertions.checkNotNull(str));
        }
    }

    private a(MediaCodecAdapter codec) {
        this.b = codec;
    }

    public static a a(Format format) throws Exception {
        MediaCodecAdapter mediaCodecAdapterCreateAdapter = null;
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat((String) Assertions.checkNotNull(format.sampleMimeType), format.sampleRate, format.channelCount);
            MediaFormatUtil.maybeSetInteger(mediaFormatCreateAudioFormat, "max-input-size", format.maxInputSize);
            MediaFormatUtil.setCsdBuffers(mediaFormatCreateAudioFormat, format.initializationData);
            mediaCodecAdapterCreateAdapter = new C0155a(true).createAdapter(new MediaCodecAdapter.Configuration(c(), mediaFormatCreateAudioFormat, format, null, null, 0));
            return new a(mediaCodecAdapterCreateAdapter);
        } catch (Exception e) {
            if (mediaCodecAdapterCreateAdapter != null) {
                mediaCodecAdapterCreateAdapter.release();
            }
            throw e;
        }
    }

    public static a b(Format format) throws Exception {
        MediaCodecAdapter mediaCodecAdapterCreateAdapter = null;
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat((String) Assertions.checkNotNull(format.sampleMimeType), format.sampleRate, format.channelCount);
            mediaFormatCreateAudioFormat.setInteger("bitrate", format.bitrate);
            mediaCodecAdapterCreateAdapter = new C0155a(false).createAdapter(new MediaCodecAdapter.Configuration(c(), mediaFormatCreateAudioFormat, format, null, null, 1));
            return new a(mediaCodecAdapterCreateAdapter);
        } catch (Exception e) {
            if (mediaCodecAdapterCreateAdapter != null) {
                mediaCodecAdapterCreateAdapter.release();
            }
            throw e;
        }
    }

    private static MediaCodecInfo c() {
        return MediaCodecInfo.newInstance("name-placeholder", "mime-type-placeholder", "mime-type-placeholder", null, false, false, false, false, false);
    }

    private static Format d(MediaFormat mediaFormat) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = 0;
        while (true) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                break;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            builder.add(bArr);
            i2++;
        }
        String string = mediaFormat.getString("mime");
        Format.Builder initializationData = new Format.Builder().setSampleMimeType(mediaFormat.getString("mime")).setInitializationData(builder.build());
        if (MimeTypes.isVideo(string)) {
            initializationData.setWidth(mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)).setHeight(mediaFormat.getInteger("height"));
        } else if (MimeTypes.isAudio(string)) {
            initializationData.setChannelCount(mediaFormat.getInteger("channel-count")).setSampleRate(mediaFormat.getInteger("sample-rate")).setPcmEncoding(2);
        }
        return initializationData.build();
    }

    private boolean j() {
        if (this.f >= 0) {
            return true;
        }
        if (this.h) {
            return false;
        }
        int iDequeueOutputBufferIndex = this.b.dequeueOutputBufferIndex(this.a);
        this.f = iDequeueOutputBufferIndex;
        if (iDequeueOutputBufferIndex < 0) {
            if (iDequeueOutputBufferIndex == -2) {
                this.c = d(this.b.getOutputFormat());
            }
            return false;
        }
        MediaCodec.BufferInfo bufferInfo = this.a;
        int i2 = bufferInfo.flags;
        if ((i2 & 4) != 0) {
            this.h = true;
            if (bufferInfo.size == 0) {
                m();
                return false;
            }
        }
        if ((i2 & 2) != 0) {
            m();
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.b.getOutputBuffer(iDequeueOutputBufferIndex));
        this.d = byteBuffer;
        byteBuffer.position(this.a.offset);
        ByteBuffer byteBuffer2 = this.d;
        MediaCodec.BufferInfo bufferInfo2 = this.a;
        byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
        return true;
    }

    @Nullable
    public ByteBuffer e() {
        if (j()) {
            return this.d;
        }
        return null;
    }

    @Nullable
    public MediaCodec.BufferInfo f() {
        if (j()) {
            return this.a;
        }
        return null;
    }

    @Nullable
    public Format g() {
        j();
        return this.c;
    }

    public boolean h() {
        return this.h && this.f == -1;
    }

    @EnsuresNonNullIf(expression = {"#1.data"}, result = true)
    public boolean i(DecoderInputBuffer inputBuffer) {
        if (this.g) {
            return false;
        }
        if (this.e < 0) {
            int iDequeueInputBufferIndex = this.b.dequeueInputBufferIndex();
            this.e = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            inputBuffer.data = this.b.getInputBuffer(iDequeueInputBufferIndex);
            inputBuffer.clear();
        }
        Assertions.checkNotNull(inputBuffer.data);
        return true;
    }

    public void k(DecoderInputBuffer inputBuffer) {
        int iPosition;
        int iRemaining;
        int i2;
        Assertions.checkState(!this.g, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer = inputBuffer.data;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            iPosition = 0;
            iRemaining = 0;
        } else {
            iPosition = inputBuffer.data.position();
            iRemaining = inputBuffer.data.remaining();
        }
        if (inputBuffer.isEndOfStream()) {
            this.g = true;
            i2 = 4;
        } else {
            i2 = 0;
        }
        this.b.queueInputBuffer(this.e, iPosition, iRemaining, inputBuffer.timeUs, i2);
        this.e = -1;
        inputBuffer.data = null;
    }

    public void l() {
        this.d = null;
        this.b.release();
    }

    public void m() {
        this.d = null;
        this.b.releaseOutputBuffer(this.f, false);
        this.f = -1;
    }
}
