package com.liulishuo.engzo.lingorecorder.recorder;

import androidx.annotation.NonNull;
import com.liulishuo.engzo.lingorecorder.utils.RecorderProperty;

/* JADX INFO: loaded from: classes18.dex */
public interface IRecorder {
    int getBufferSize() throws Throwable;

    long getDurationInMills();

    RecorderProperty getRecordProperty();

    int read(@NonNull byte[] bArr, int i) throws Throwable;

    void release();

    void startRecording() throws Throwable;
}
