package com.huami.watch.companion.xiaomiai;

import com.huami.watch.util.Log;
import java.io.InputStream;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;
import javazoom.jl.player.AudioDevice;

/* JADX INFO: loaded from: classes16.dex */
public class PcmDecoder {
    public static final String TAG = "PcmDecoder";
    private Bitstream bitstream;
    private Decoder decoder;

    public interface DecodeCallback {
        void onDecodeEnd();

        void onDecodeFailed();

        void onDecodeStart(int i, int i2, int i3);

        boolean onDecoderFrame(short[] sArr);
    }

    public PcmDecoder(InputStream inputStream) throws JavaLayerException {
        this(inputStream, null);
    }

    public void decode(DecodeCallback decodeCallback) throws JavaLayerException {
        decode(Integer.MAX_VALUE, decodeCallback);
    }

    public short[] decodeFrame() throws JavaLayerException {
        try {
            Header frame = this.bitstream.readFrame();
            if (frame == null) {
                return null;
            }
            SampleBuffer sampleBuffer = (SampleBuffer) this.decoder.decodeFrame(frame, this.bitstream);
            int bufferLength = sampleBuffer.getBufferLength();
            short[] sArr = new short[bufferLength];
            System.arraycopy(sampleBuffer.getBuffer(), 0, sArr, 0, bufferLength);
            this.bitstream.closeFrame();
            return sArr;
        } catch (RuntimeException e) {
            Log.e("PcmDecoder", e.toString(), e, new Object[0]);
            throw new JavaLayerException("Exception decoding audio frame", e);
        }
    }

    public PcmDecoder(InputStream inputStream, AudioDevice audioDevice) throws JavaLayerException {
        this.bitstream = new Bitstream(inputStream);
        this.decoder = new Decoder();
    }

    public boolean decode(int i, DecodeCallback decodeCallback) throws JavaLayerException {
        Header frame = this.bitstream.readFrame();
        if (frame == null) {
            decodeCallback.onDecodeFailed();
            return false;
        }
        Log.d("PcmDecoder", "header:" + frame.toString() + "  " + frame.mode() + " layer : " + frame.layer(), new Object[0]);
        int iMode = frame.mode();
        int i2 = 2;
        if (iMode != 0 && iMode != 1 && iMode != 2) {
            i2 = 1;
        }
        decodeCallback.onDecodeStart(i2, frame.frequency(), frame.bitrate());
        boolean z = true;
        while (true) {
            int i3 = i - 1;
            if (i <= 0 || !z) {
                break;
            }
            short[] sArrDecodeFrame = decodeFrame();
            z = sArrDecodeFrame != null;
            if (!z) {
                Log.d("PcmDecoder", "should  decode failed", new Object[0]);
            } else if (!decodeCallback.onDecoderFrame(sArrDecodeFrame)) {
                Log.d("PcmDecoder", "should not continue decode", new Object[0]);
                break;
            }
            i = i3;
        }
        decodeCallback.onDecodeEnd();
        return z;
    }
}
