package com.liulishuo.engzo.lingorecorder.processor;

import com.liulishuo.engzo.lingorecorder.utils.RecorderProperty;

/* JADX INFO: loaded from: classes18.dex */
public class TimerProcessor implements AudioProcessor {
    private long a;
    private RecorderProperty b;
    private long c;

    public TimerProcessor(long j) {
        this(new RecorderProperty(), j);
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void end() {
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void flow(byte[] bArr, int i) {
        this.c += (long) i;
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public boolean needExit() {
        return ((long) ((((((double) (this.c * 8)) * 1000.0d) / ((double) this.b.getBitsPerSample())) / ((double) this.b.getSampleRate())) / ((double) this.b.getChannels()))) >= this.a;
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void release() {
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void start() {
        this.c = 0L;
    }

    public TimerProcessor(RecorderProperty recorderProperty, long j) {
        this.c = 0L;
        this.b = recorderProperty;
        this.a = j;
    }
}
