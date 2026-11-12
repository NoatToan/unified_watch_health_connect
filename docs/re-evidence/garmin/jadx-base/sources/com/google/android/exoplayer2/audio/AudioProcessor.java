package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class AudioFormat {
        public static final AudioFormat NOT_SET = new AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(int i14, int i15, int i16) {
            this.sampleRate = i14;
            this.channelCount = i15;
            this.encoding = i16;
            this.bytesPerFrame = Util.isEncodingLinearPcm(i16) ? Util.getPcmFrameSize(i16, i15) : -1;
        }

        public String toString() {
            int i14 = this.sampleRate;
            int i15 = this.channelCount;
            int i16 = this.encoding;
            StringBuilder sb3 = new StringBuilder(83);
            sb3.append("AudioFormat[sampleRate=");
            sb3.append(i14);
            sb3.append(", channelCount=");
            sb3.append(i15);
            sb3.append(", encoding=");
            sb3.append(i16);
            sb3.append(']');
            return sb3.toString();
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            String strValueOf = String.valueOf(audioFormat);
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 18);
            sb3.append("Unhandled format: ");
            sb3.append(strValueOf);
            super(sb3.toString());
        }
    }

    AudioFormat configure(AudioFormat audioFormat);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
