package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.common.base.Supplier;
import com.xiaomi.ai.api.AIApiConstants;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private final MediaCodec a;
    private final d b;
    private final b c;
    private final boolean d;
    private boolean e;
    private int f;

    public static final class Factory implements MediaCodecAdapter.Factory {
        private final Supplier<HandlerThread> a;
        private final Supplier<HandlerThread> b;
        private final boolean c;
        private final boolean d;

        public Factory(int trackType) {
            this(trackType, false, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread c(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.e(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread d(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.f(i));
        }

        public Factory(final int trackType, boolean forceQueueingSynchronizationWorkaround, boolean synchronizeCodecInteractionsWithQueueing) {
            this(new Supplier() { // from class: aj
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.c(trackType);
                }
            }, new Supplier() { // from class: bj
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.d(trackType);
                }
            }, forceQueueingSynchronizationWorkaround, synchronizeCodecInteractionsWithQueueing);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public AsynchronousMediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = configuration.codecInfo.name;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                String strValueOf = String.valueOf(str);
                TraceUtil.beginSection(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, this.a.get(), this.b.get(), this.c, this.d);
                    try {
                        TraceUtil.endSection();
                        asynchronousMediaCodecAdapter2.h(configuration.mediaFormat, configuration.surface, configuration.crypto, configuration.flags);
                        return asynchronousMediaCodecAdapter2;
                    } catch (Exception e) {
                        e = e;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }

        @VisibleForTesting
        public Factory(Supplier<HandlerThread> callbackThreadSupplier, Supplier<HandlerThread> queueingThreadSupplier, boolean forceQueueingSynchronizationWorkaround, boolean synchronizeCodecInteractionsWithQueueing) {
            this.a = callbackThreadSupplier;
            this.b = queueingThreadSupplier;
            this.c = forceQueueingSynchronizationWorkaround;
            this.d = synchronizeCodecInteractionsWithQueueing;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(int trackType) {
        return g(trackType, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(int trackType) {
        return g(trackType, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String g(int trackType, String prefix) {
        StringBuilder sb = new StringBuilder(prefix);
        if (trackType == 1) {
            sb.append("Audio");
        } else if (trackType == 2) {
            sb.append(AIApiConstants.Video.NAME);
        } else {
            sb.append("Unknown(");
            sb.append(trackType);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto crypto, int flags) {
        this.b.h(this.a);
        TraceUtil.beginSection("configureCodec");
        this.a.configure(mediaFormat, surface, crypto, flags);
        TraceUtil.endSection();
        this.c.s();
        TraceUtil.beginSection("startCodec");
        this.a.start();
        TraceUtil.endSection();
        this.f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    private void j() {
        if (this.d) {
            try {
                this.c.t();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.b.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.b.d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
        this.c.i();
        this.a.flush();
        d dVar = this.b;
        final MediaCodec mediaCodec = this.a;
        Objects.requireNonNull(mediaCodec);
        dVar.e(new Runnable() { // from class: zi
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int index) {
        return this.a.getInputBuffer(index);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int index) {
        return this.a.getOutputBuffer(index);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.b.g();
    }

    @VisibleForTesting
    public void k(MediaCodec.CodecException error) {
        this.b.onError(this.a, error);
    }

    @VisibleForTesting
    public void l(MediaFormat format) {
        this.b.onOutputFormatChanged(this.a, format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int index, int offset, int size, long presentationTimeUs, int flags) {
        this.c.n(index, offset, size, presentationTimeUs, flags);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int index, int offset, CryptoInfo info, long presentationTimeUs, int flags) {
        this.c.o(index, offset, info, presentationTimeUs, flags);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
        try {
            if (this.f == 1) {
                this.c.r();
                this.b.q();
            }
            this.f = 2;
        } finally {
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int index, boolean render) {
        this.a.releaseOutputBuffer(index, render);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener listener, Handler handler) {
        j();
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.a.i(listener, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        j();
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle params) {
        j();
        this.a.setParameters(params);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int scalingMode) {
        j();
        this.a.setVideoScalingMode(scalingMode);
    }

    private AsynchronousMediaCodecAdapter(MediaCodec codec, HandlerThread callbackThread, HandlerThread enqueueingThread, boolean forceQueueingSynchronizationWorkaround, boolean synchronizeCodecInteractionsWithQueueing) {
        this.a = codec;
        this.b = new d(callbackThread);
        this.c = new b(codec, enqueueingThread, forceQueueingSynchronizationWorkaround);
        this.d = synchronizeCodecInteractionsWithQueueing;
        this.f = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int index, long renderTimeStampNs) {
        this.a.releaseOutputBuffer(index, renderTimeStampNs);
    }
}
