package com.liulishuo.engzo.lingorecorder.processor;

import com.liulishuo.engzo.lingorecorder.utils.RecorderProperty;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes18.dex */
public class WavProcessor implements AudioProcessor {
    private String a;
    private RandomAccessFile b;
    private int c;
    private RecorderProperty d;

    public WavProcessor(String str) {
        this(str, new RecorderProperty());
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void end() throws Exception {
        this.b.seek(4L);
        this.b.writeInt(Integer.reverseBytes(this.c + 36));
        this.b.seek(40L);
        this.b.writeInt(Integer.reverseBytes(this.c));
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void flow(byte[] bArr, int i) throws Exception {
        if (i > 0) {
            this.b.write(bArr);
            this.c += i;
        }
    }

    public String getFilePath() {
        return this.a;
    }

    public RecorderProperty getRecordProperty() {
        return this.d;
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public boolean needExit() {
        return false;
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void release() {
        try {
            RandomAccessFile randomAccessFile = this.b;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.b = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.liulishuo.engzo.lingorecorder.processor.AudioProcessor
    public void start() throws Exception {
        this.c = 0;
        try {
            this.b = new RandomAccessFile(this.a, "rw");
        } catch (FileNotFoundException unused) {
            new File(this.a).getParentFile().mkdirs();
            this.b = new RandomAccessFile(this.a, "rw");
        }
        this.b.setLength(0L);
        this.b.writeBytes("RIFF");
        this.b.writeInt(0);
        this.b.writeBytes("WAVE");
        this.b.writeBytes("fmt ");
        this.b.writeInt(Integer.reverseBytes(16));
        this.b.writeShort(Short.reverseBytes((short) 1));
        this.b.writeShort(Short.reverseBytes((short) this.d.getChannels()));
        this.b.writeInt(Integer.reverseBytes(this.d.getSampleRate()));
        this.b.writeInt(Integer.reverseBytes(((this.d.getSampleRate() * this.d.getChannels()) * this.d.getBitsPerSample()) / 8));
        this.b.writeShort(Short.reverseBytes((short) ((this.d.getChannels() * this.d.getBitsPerSample()) / 8)));
        this.b.writeShort(Short.reverseBytes((short) this.d.getBitsPerSample()));
        this.b.writeBytes("data");
        this.b.writeInt(0);
    }

    public WavProcessor(String str, RecorderProperty recorderProperty) {
        this.c = 0;
        this.a = str;
        this.d = recorderProperty;
    }
}
