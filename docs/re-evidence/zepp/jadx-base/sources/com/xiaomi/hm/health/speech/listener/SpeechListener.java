package com.xiaomi.hm.health.speech.listener;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public interface SpeechListener {
    void speechAnswerEntity(Context context, Object baseAnswerEntity);

    void speechAsrDesc(String asrDesc);

    void speechDetectionEndInVadMode(Context context);

    void speechError(Context context);

    void speechManualRequestEnd(Context context);

    void speechPartialAsrDesc(String partialAsrDesc);
}
