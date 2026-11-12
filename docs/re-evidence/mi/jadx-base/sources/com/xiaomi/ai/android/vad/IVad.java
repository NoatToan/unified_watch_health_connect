package com.xiaomi.ai.android.vad;

/* JADX INFO: loaded from: classes6.dex */
public interface IVad {
    boolean checkVad(byte[] bArr);

    boolean init();

    void release();
}
