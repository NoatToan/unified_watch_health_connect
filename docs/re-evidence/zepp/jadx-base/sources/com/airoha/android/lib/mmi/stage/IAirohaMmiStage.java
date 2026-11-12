package com.airoha.android.lib.mmi.stage;

/* JADX INFO: loaded from: classes2.dex */
public interface IAirohaMmiStage {
    int getCompletedTaskCount();

    String getErrorReason();

    byte getRespType();

    String getSimpleName();

    byte getStatus();

    int getTotalTaskCount();

    void handleResp(int i, byte[] bArr, int i2);

    boolean isCmdQueueEmpty();

    boolean isCompleted();

    boolean isErrorOccurred();

    boolean isExpectedResp(int i, int i2, byte[] bArr);

    boolean isRespStatusSuccess();

    boolean isRetryUpToLimit();

    boolean isStopped();

    void pollCmdQueue();

    void prePoolCmdQueue();

    void start();

    void stop();
}
