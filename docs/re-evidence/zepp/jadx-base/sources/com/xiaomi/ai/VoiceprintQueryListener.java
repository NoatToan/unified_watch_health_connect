package com.xiaomi.ai;

/* JADX INFO: loaded from: classes18.dex */
public interface VoiceprintQueryListener {
    void onError(SpeechError speechError);

    void onResults(SpeechResult speechResult);
}
