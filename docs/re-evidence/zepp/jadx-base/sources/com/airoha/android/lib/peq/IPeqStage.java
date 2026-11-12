package com.airoha.android.lib.peq;

/* JADX INFO: loaded from: classes2.dex */
public interface IPeqStage {
    void handleRespOrInd(int i, byte[] bArr, int i2);

    boolean isCompleted();

    boolean isError();

    void sendCmd();
}
