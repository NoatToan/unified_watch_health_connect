package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.SonicAudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
final class i extends j {
    private static final String E = "TransformerAudioRenderer";
    private static final int F = 131072;
    private static final float G = -1.0f;
    private float A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final DecoderInputBuffer q;
    private final DecoderInputBuffer r;
    private final SonicAudioProcessor s;

    @Nullable
    private a t;

    @Nullable
    private a u;

    @Nullable
    private f v;

    @Nullable
    private Format w;

    @Nullable
    private AudioProcessor.AudioFormat x;
    private ByteBuffer y;
    private long z;

    public i(b muxerWrapper, k mediaClock, g transformation) {
        super(1, muxerWrapper, mediaClock, transformation);
        this.q = new DecoderInputBuffer(0);
        this.r = new DecoderInputBuffer(0);
        this.s = new SonicAudioProcessor();
        this.y = AudioProcessor.EMPTY_BUFFER;
        this.z = 0L;
        this.A = -1.0f;
    }

    private ExoPlaybackException a(Throwable cause, int errorCode) {
        return ExoPlaybackException.createForRenderer(cause, E, getIndex(), this.w, 4, false, errorCode);
    }

    private boolean b() {
        a aVar = (a) Assertions.checkNotNull(this.t);
        if (!((a) Assertions.checkNotNull(this.u)).i(this.r)) {
            return false;
        }
        if (aVar.h()) {
            m();
            return false;
        }
        ByteBuffer byteBufferE = aVar.e();
        if (byteBufferE == null) {
            return false;
        }
        if (l((MediaCodec.BufferInfo) Assertions.checkNotNull(aVar.f()))) {
            j(this.A);
            return false;
        }
        i(byteBufferE);
        if (byteBufferE.hasRemaining()) {
            return true;
        }
        aVar.m();
        return true;
    }

    private boolean c() {
        a aVar = (a) Assertions.checkNotNull(this.t);
        if (this.D) {
            if (this.s.isEnded() && !this.y.hasRemaining()) {
                j(this.A);
                this.D = false;
            }
            return false;
        }
        if (this.y.hasRemaining()) {
            return false;
        }
        if (aVar.h()) {
            this.s.queueEndOfStream();
            return false;
        }
        Assertions.checkState(!this.s.isEnded());
        ByteBuffer byteBufferE = aVar.e();
        if (byteBufferE == null) {
            return false;
        }
        if (l((MediaCodec.BufferInfo) Assertions.checkNotNull(aVar.f()))) {
            this.s.queueEndOfStream();
            this.D = true;
            return false;
        }
        this.s.queueInput(byteBufferE);
        if (!byteBufferE.hasRemaining()) {
            aVar.m();
        }
        return true;
    }

    private boolean d() {
        a aVar = (a) Assertions.checkNotNull(this.u);
        if (!this.C) {
            Format formatG = aVar.g();
            if (formatG == null) {
                return false;
            }
            this.C = true;
            this.m.a(formatG);
        }
        if (aVar.h()) {
            this.m.c(getTrackType());
            this.B = true;
            return false;
        }
        ByteBuffer byteBufferE = aVar.e();
        if (byteBufferE == null) {
            return false;
        }
        if (!this.m.h(getTrackType(), byteBufferE, true, ((MediaCodec.BufferInfo) Assertions.checkNotNull(aVar.f())).presentationTimeUs)) {
            return false;
        }
        aVar.m();
        return true;
    }

    private boolean e() {
        if (!((a) Assertions.checkNotNull(this.u)).i(this.r)) {
            return false;
        }
        if (!this.y.hasRemaining()) {
            ByteBuffer output = this.s.getOutput();
            this.y = output;
            if (!output.hasRemaining()) {
                if (((a) Assertions.checkNotNull(this.t)).h() && this.s.isEnded()) {
                    m();
                }
                return false;
            }
        }
        i(this.y);
        return true;
    }

    private boolean f() throws ExoPlaybackException {
        if (this.t != null) {
            return true;
        }
        FormatHolder formatHolder = getFormatHolder();
        if (readSource(formatHolder, this.q, 2) != -5) {
            return false;
        }
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        this.w = format;
        try {
            this.t = a.a(format);
            e eVar = new e(this.w);
            this.v = eVar;
            this.A = eVar.a(0L);
            return true;
        } catch (IOException e) {
            throw a(e, 1000);
        }
    }

    private boolean g() throws ExoPlaybackException {
        if (this.u != null) {
            return true;
        }
        Format formatG = ((a) Assertions.checkNotNull(this.t)).g();
        if (formatG == null) {
            return false;
        }
        AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(formatG.sampleRate, formatG.channelCount, formatG.pcmEncoding);
        if (this.o.c) {
            try {
                audioFormat = this.s.configure(audioFormat);
                j(this.A);
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw a(e, 1000);
            }
        }
        try {
            this.u = a.b(new Format.Builder().setSampleMimeType(((Format) Assertions.checkNotNull(this.w)).sampleMimeType).setSampleRate(audioFormat.sampleRate).setChannelCount(audioFormat.channelCount).setAverageBitrate(131072).build());
            this.x = audioFormat;
            return true;
        } catch (IOException e2) {
            throw a(e2, 1000);
        }
    }

    private boolean h() {
        a aVar = (a) Assertions.checkNotNull(this.t);
        if (!aVar.i(this.q)) {
            return false;
        }
        this.q.clear();
        int source = readSource(getFormatHolder(), this.q, 0);
        if (source == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (source != -4) {
            return false;
        }
        this.n.a(getTrackType(), this.q.timeUs);
        this.q.flip();
        aVar.k(this.q);
        return !this.q.isEndOfStream();
    }

    private void i(ByteBuffer inputBuffer) {
        AudioProcessor.AudioFormat audioFormat = (AudioProcessor.AudioFormat) Assertions.checkNotNull(this.x);
        a aVar = (a) Assertions.checkNotNull(this.u);
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.r.data);
        int iLimit = inputBuffer.limit();
        inputBuffer.limit(Math.min(iLimit, inputBuffer.position() + byteBuffer.capacity()));
        byteBuffer.put(inputBuffer);
        DecoderInputBuffer decoderInputBuffer = this.r;
        long j = this.z;
        decoderInputBuffer.timeUs = j;
        this.z = j + k(byteBuffer.position(), audioFormat.bytesPerFrame, audioFormat.sampleRate);
        this.r.setFlags(0);
        this.r.flip();
        inputBuffer.limit(iLimit);
        aVar.k(this.r);
    }

    private void j(float speed) {
        this.s.setSpeed(speed);
        this.s.setPitch(speed);
        this.s.flush();
    }

    private static long k(long bytesWritten, int bytesPerFrame, int sampleRate) {
        return ((bytesWritten / ((long) bytesPerFrame)) * 1000000) / ((long) sampleRate);
    }

    private boolean l(MediaCodec.BufferInfo bufferInfo) {
        if (!this.o.c) {
            return false;
        }
        float fA = ((f) Assertions.checkNotNull(this.v)).a(bufferInfo.presentationTimeUs);
        boolean z = fA != this.A;
        this.A = fA;
        return z;
    }

    private void m() {
        a aVar = (a) Assertions.checkNotNull(this.u);
        Assertions.checkState(((ByteBuffer) Assertions.checkNotNull(this.r.data)).position() == 0);
        this.r.addFlag(4);
        this.r.flip();
        aVar.k(this.r);
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return E;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.B;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
        this.q.clear();
        this.q.data = null;
        this.r.clear();
        this.r.data = null;
        this.s.reset();
        a aVar = this.t;
        if (aVar != null) {
            aVar.l();
            this.t = null;
        }
        a aVar2 = this.u;
        if (aVar2 != null) {
            aVar2.l();
            this.u = null;
        }
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = AudioProcessor.EMPTY_BUFFER;
        this.z = 0L;
        this.A = -1.0f;
        this.B = false;
        this.C = false;
        this.D = false;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
        if (this.p && !isEnded() && f()) {
            if (g()) {
                while (d()) {
                }
                if (this.s.isActive()) {
                    while (e()) {
                    }
                    while (c()) {
                    }
                } else {
                    while (b()) {
                    }
                }
            }
            while (h()) {
            }
        }
    }
}
