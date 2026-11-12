package com.liulishuo.engzo.lingorecorder.recorder;

import androidx.annotation.NonNull;
import com.liulishuo.engzo.lingorecorder.utils.LOG;
import com.liulishuo.engzo.lingorecorder.utils.RecorderProperty;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes18.dex */
public class WavFileRecorder implements IRecorder {
    private FileInputStream a;
    private long b;
    private final String c;
    private final RecorderProperty d;

    public WavFileRecorder(String str, RecorderProperty recorderProperty) {
        this.c = str;
        this.d = recorderProperty;
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public int getBufferSize() {
        return 1024;
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public long getDurationInMills() {
        return (long) (((((this.b * 8.0d) * 1000.0d) / ((double) this.d.getBitsPerSample())) / ((double) this.d.getSampleRate())) / ((double) this.d.getChannels()));
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public RecorderProperty getRecordProperty() {
        return this.d;
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public int read(@NonNull byte[] bArr, int i) throws Exception {
        int i2 = this.a.read(bArr, 0, i);
        this.b += (long) i2;
        return i2;
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public void release() {
        try {
            this.a.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.liulishuo.engzo.lingorecorder.recorder.IRecorder
    public void startRecording() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(this.c);
        this.a = fileInputStream;
        LOG.d("skip size = " + fileInputStream.skip(44L));
        this.b = 0L;
    }
}
