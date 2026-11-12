package com.liulishuo.engzo.lingorecorder.recorder;

import android.media.AudioRecord;
import androidx.annotation.NonNull;
import com.liulishuo.engzo.lingorecorder.recorder.exception.RecorderException;
import com.liulishuo.engzo.lingorecorder.recorder.exception.RecorderGetBufferSizeException;
import com.liulishuo.engzo.lingorecorder.recorder.exception.RecorderInitException;
import com.liulishuo.engzo.lingorecorder.recorder.exception.RecorderReadException;
import com.liulishuo.engzo.lingorecorder.recorder.exception.RecorderStartException;
import com.liulishuo.engzo.lingorecorder.utils.RecorderProperty;

/* JADX INFO: loaded from: classes18.dex */
public class AndroidRecorder implements IRecorder {
    private int a;
    private long b;
    private int c;
    private AudioRecord d;
    private final RecorderProperty e;

    public AndroidRecorder(RecorderProperty recorderProperty) {
        this.e = recorderProperty;
        if (recorderProperty.getBitsPerSample() == 16) {
            this.a = 2;
        } else {
            if (recorderProperty.getBitsPerSample() != 8) {
                throw new RecorderException("unsupported bitsPerSample: " + recorderProperty.getBitsPerSample());
            }
            this.a = 3;
        }
        if (recorderProperty.getChannels() == 1) {
            this.c = 16;
        } else {
            if (recorderProperty.getChannels() == 2) {
                this.c = 12;
                return;
            }
            throw new RecorderException("unsupported channel: " + recorderProperty.getChannels());
        }
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public int getBufferSize() {
        int minBufferSize = AudioRecord.getMinBufferSize(this.e.getSampleRate(), this.c, this.a);
        if (minBufferSize > 0) {
            return minBufferSize * 2;
        }
        throw new RecorderGetBufferSizeException(minBufferSize);
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public long getDurationInMills() {
        return (long) (((((this.b * 8.0d) * 1000.0d) / ((double) this.e.getBitsPerSample())) / ((double) this.e.getSampleRate())) / ((double) this.e.getChannels()));
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public RecorderProperty getRecordProperty() {
        return this.e;
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public int read(@NonNull byte[] bArr, int i) throws Exception {
        int i2 = this.d.read(bArr, 0, i);
        if (i2 < 0) {
            throw new RecorderReadException(i2);
        }
        this.b += (long) i2;
        return i2;
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public void release() {
        AudioRecord audioRecord = this.d;
        if (audioRecord != null) {
            audioRecord.release();
        }
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public void startRecording() throws Exception {
        AudioRecord audioRecord = new AudioRecord(1, this.e.getSampleRate(), this.c, this.a, getBufferSize());
        this.d = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new RecorderInitException();
        }
        this.b = 0L;
        this.d.startRecording();
        if (this.d.getRecordingState() != 3) {
            throw new RecorderStartException();
        }
    }
}
