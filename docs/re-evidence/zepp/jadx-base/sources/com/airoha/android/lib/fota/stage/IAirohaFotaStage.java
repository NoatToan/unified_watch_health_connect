package com.airoha.android.lib.fota.stage;

import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public interface IAirohaFotaStage {

    public enum SKIP_TYPE {
        All_stages,
        Compare_stages,
        Erase_stages,
        Program_stages,
        CompareErase_stages,
        Client_Erase_stages,
        Sinlge_StateUpdate_stages,
        None
    }

    void genRacePackets();

    int getCompletedTaskCount();

    ErrorEnum getErrorCode();

    String getErrorMsg();

    FotaStageEnum getFotaStageIndex();

    byte getRespType();

    SKIP_TYPE getSkipType();

    LinkedList<FotaStage> getStagesForSkip(SKIP_TYPE skip_type);

    byte getStatus();

    int getTotalTaskCount();

    int getWaitingRespCount();

    void handleResp(int i, byte[] bArr, int i2);

    boolean isCmdQueueEmpty();

    boolean isCompleted();

    boolean isErrorOccurred();

    boolean isExpectedResp(int i, int i2, byte[] bArr);

    boolean isRespStatusSuccess();

    boolean isRetryUpToLimit();

    boolean isStopped();

    void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2);

    void pollCmdQueue();

    void prePoolCmdQueue();

    void start();

    void stop();
}
