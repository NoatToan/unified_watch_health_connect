package com.liulishuo.engzo.lingorecorder.processor;

/* JADX INFO: loaded from: classes18.dex */
public interface AudioProcessor {
    void end() throws Exception;

    void flow(byte[] bArr, int i) throws Exception;

    boolean needExit();

    void release();

    void start() throws Exception;
}
