package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class TeeAudioProcessor extends BaseAudioProcessor {
    private final AudioBufferSink f;

    public interface AudioBufferSink {
        void flush(int sampleRateHz, int channelCount, int encoding);

        void handleBuffer(ByteBuffer buffer);
    }

    public static final class WavFileAudioBufferSink implements AudioBufferSink {
        private static final String j = "WaveFileAudioBufferSink";
        private static final int k = 4;
        private static final int l = 40;
        private static final int m = 44;
        private final String a;
        private final byte[] b;
        private final ByteBuffer c;
        private int d;
        private int e;
        private int f;

        @Nullable
        private RandomAccessFile g;
        private int h;
        private int i;

        public WavFileAudioBufferSink(String outputFileNamePrefix) {
            this.a = outputFileNamePrefix;
            byte[] bArr = new byte[1024];
            this.b = bArr;
            this.c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        private String a() {
            int i = this.h;
            this.h = i + 1;
            return Util.formatInvariant("%s-%04d.wav", this.a, Integer.valueOf(i));
        }

        private void b() throws IOException {
            if (this.g != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(a(), "rw");
            e(randomAccessFile);
            this.g = randomAccessFile;
            this.i = 44;
        }

        private void c() throws IOException {
            RandomAccessFile randomAccessFile = this.g;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.c.clear();
                this.c.putInt(this.i - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.b, 0, 4);
                this.c.clear();
                this.c.putInt(this.i - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.b, 0, 4);
            } catch (IOException e) {
                Log.w(j, "Error updating file size", e);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.g = null;
            }
        }

        private void d(ByteBuffer buffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) Assertions.checkNotNull(this.g);
            while (buffer.hasRemaining()) {
                int iMin = Math.min(buffer.remaining(), this.b.length);
                buffer.get(this.b, 0, iMin);
                randomAccessFile.write(this.b, 0, iMin);
                this.i += iMin;
            }
        }

        private void e(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(WavUtil.RIFF_FOURCC);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(WavUtil.WAVE_FOURCC);
            randomAccessFile.writeInt(WavUtil.FMT_FOURCC);
            this.c.clear();
            this.c.putInt(16);
            this.c.putShort((short) WavUtil.getTypeForPcmEncoding(this.f));
            this.c.putShort((short) this.e);
            this.c.putInt(this.d);
            int pcmFrameSize = Util.getPcmFrameSize(this.f, this.e);
            this.c.putInt(this.d * pcmFrameSize);
            this.c.putShort((short) pcmFrameSize);
            this.c.putShort((short) ((pcmFrameSize * 8) / this.e));
            randomAccessFile.write(this.b, 0, this.c.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        @Override // com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink
        public void flush(int sampleRateHz, int channelCount, int encoding) {
            try {
                c();
            } catch (IOException e) {
                Log.e(j, "Error resetting", e);
            }
            this.d = sampleRateHz;
            this.e = channelCount;
            this.f = encoding;
        }

        @Override // com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink
        public void handleBuffer(ByteBuffer buffer) {
            try {
                b();
                d(buffer);
            } catch (IOException e) {
                Log.e(j, "Error writing data", e);
            }
        }
    }

    public TeeAudioProcessor(AudioBufferSink audioBufferSink) {
        this.f = (AudioBufferSink) Assertions.checkNotNull(audioBufferSink);
    }

    private void a() {
        if (isActive()) {
            AudioBufferSink audioBufferSink = this.f;
            AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
            audioBufferSink.flush(audioFormat.sampleRate, audioFormat.channelCount, audioFormat.encoding);
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat inputAudioFormat) {
        return inputAudioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onFlush() {
        a();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        a();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onReset() {
        a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer inputBuffer) {
        int iRemaining = inputBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        this.f.handleBuffer(inputBuffer.asReadOnlyBuffer());
        replaceOutputBuffer(iRemaining).put(inputBuffer).flip();
    }
}
