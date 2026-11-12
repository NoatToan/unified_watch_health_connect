package com.amazon.alexa.avs;

import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class AudioStateOutputStream extends PipedOutputStream {
    private static final Logger log = LoggerFactory.getLogger(AudioStateOutputStream.class);
    private RecordingRMSListener rmsListener;
    private RecordingStateListener stateListener;

    public AudioStateOutputStream(PipedInputStream pipedInputStream, RecordingStateListener recordingStateListener, RecordingRMSListener recordingRMSListener) throws IOException {
        super(pipedInputStream);
        this.stateListener = recordingStateListener;
        this.rmsListener = recordingRMSListener;
        notifyRecordingStarted();
    }

    private void calculateDB(byte[] bArr, int i) {
        if (this.rmsListener == null || i < 2) {
            return;
        }
        int i2 = i / 2;
        double d = 0.0d;
        for (int i3 = 0; i3 < i; i3 += 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.put(bArr[i3]);
            byteBufferAllocate.put(bArr[i3 + 1]);
            double dAbs = ((((double) Math.abs((int) byteBufferAllocate.getShort(0))) * 100.0d) / 16383.5d) + 1.0d;
            d += dAbs * dAbs;
        }
        this.rmsListener.rmsChanged((int) Math.sqrt(d / ((double) i2)));
    }

    private void clearRMS() {
        RecordingRMSListener recordingRMSListener = this.rmsListener;
        if (recordingRMSListener != null) {
            recordingRMSListener.rmsChanged(0);
        }
    }

    private void notifyRecordingCompleted() {
        RecordingStateListener recordingStateListener = this.stateListener;
        if (recordingStateListener != null) {
            recordingStateListener.recordingCompleted();
        }
    }

    private void notifyRecordingStarted() {
        RecordingStateListener recordingStateListener = this.stateListener;
        if (recordingStateListener != null) {
            recordingStateListener.recordingStarted();
        }
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        notifyRecordingCompleted();
        clearRMS();
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        try {
            super.flush();
            calculateDB(bArr, i2);
        } catch (IOException e) {
            log.error("Failed to flush AudioStateOutputStream", e);
            throw e;
        }
    }
}
