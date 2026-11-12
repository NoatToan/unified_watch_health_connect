package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class SonicAudioProcessor implements AudioProcessor {
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private static final float p = 1.0E-4f;
    private static final int q = 1024;
    private int a;
    private float b = 1.0f;
    private float c = 1.0f;
    private AudioProcessor.AudioFormat d;
    private AudioProcessor.AudioFormat e;
    private AudioProcessor.AudioFormat f;
    private AudioProcessor.AudioFormat g;
    private boolean h;

    @Nullable
    private h i;
    private ByteBuffer j;
    private ShortBuffer k;
    private ByteBuffer l;
    private long m;
    private long n;
    private boolean o;

    public SonicAudioProcessor() {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.d = audioFormat;
        this.e = audioFormat;
        this.f = audioFormat;
        this.g = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.j = byteBuffer;
        this.k = byteBuffer.asShortBuffer();
        this.l = byteBuffer;
        this.a = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat inputAudioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (inputAudioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(inputAudioFormat);
        }
        int i = this.a;
        if (i == -1) {
            i = inputAudioFormat.sampleRate;
        }
        this.d = inputAudioFormat;
        AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(i, inputAudioFormat.channelCount, 2);
        this.e = audioFormat;
        this.h = true;
        return audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.d;
            this.f = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.e;
            this.g = audioFormat2;
            if (this.h) {
                this.i = new h(audioFormat.sampleRate, audioFormat.channelCount, this.b, this.c, audioFormat2.sampleRate);
            } else {
                h hVar = this.i;
                if (hVar != null) {
                    hVar.i();
                }
            }
        }
        this.l = AudioProcessor.EMPTY_BUFFER;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    public long getMediaDuration(long playoutDuration) {
        if (this.n < 1024) {
            return (long) (((double) this.b) * playoutDuration);
        }
        long jL = this.m - ((long) ((h) Assertions.checkNotNull(this.i)).l());
        int i = this.g.sampleRate;
        int i2 = this.f.sampleRate;
        return i == i2 ? Util.scaleLargeTimestamp(playoutDuration, jL, this.n) : Util.scaleLargeTimestamp(playoutDuration, jL * ((long) i), this.n * ((long) i2));
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int iK;
        h hVar = this.i;
        if (hVar != null && (iK = hVar.k()) > 0) {
            if (this.j.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.j = byteBufferOrder;
                this.k = byteBufferOrder.asShortBuffer();
            } else {
                this.j.clear();
                this.k.clear();
            }
            hVar.j(this.k);
            this.n += (long) iK;
            this.j.limit(iK);
            this.l = this.j;
        }
        ByteBuffer byteBuffer = this.l;
        this.l = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.e.sampleRate != -1 && (Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.sampleRate != this.d.sampleRate);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        h hVar;
        return this.o && ((hVar = this.i) == null || hVar.k() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        h hVar = this.i;
        if (hVar != null) {
            hVar.s();
        }
        this.o = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer inputBuffer) {
        if (inputBuffer.hasRemaining()) {
            h hVar = (h) Assertions.checkNotNull(this.i);
            ShortBuffer shortBufferAsShortBuffer = inputBuffer.asShortBuffer();
            int iRemaining = inputBuffer.remaining();
            this.m += (long) iRemaining;
            hVar.t(shortBufferAsShortBuffer);
            inputBuffer.position(inputBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.d = audioFormat;
        this.e = audioFormat;
        this.f = audioFormat;
        this.g = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.j = byteBuffer;
        this.k = byteBuffer.asShortBuffer();
        this.l = byteBuffer;
        this.a = -1;
        this.h = false;
        this.i = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    public void setOutputSampleRateHz(int sampleRateHz) {
        this.a = sampleRateHz;
    }

    public void setPitch(float pitch) {
        if (this.c != pitch) {
            this.c = pitch;
            this.h = true;
        }
    }

    public void setSpeed(float speed) {
        if (this.b != speed) {
            this.b = speed;
            this.h = true;
        }
    }
}
