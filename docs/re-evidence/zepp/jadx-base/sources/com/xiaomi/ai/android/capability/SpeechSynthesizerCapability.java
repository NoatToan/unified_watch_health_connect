package com.xiaomi.ai.android.capability;

/* JADX INFO: loaded from: classes18.dex */
public abstract class SpeechSynthesizerCapability implements Capability {
    public abstract void onPcmData(byte[] bArr);

    public abstract void onPlayFinish();

    public void onPlayFinish(String str) {
    }

    public abstract void onPlayStart(int i);

    public void onPlayStart(int i, String str) {
    }
}
