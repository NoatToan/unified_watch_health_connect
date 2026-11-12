package com.airoha.android.lib.fota;

import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public interface AirohaFotaListener {
    void onAgentChannelReceived(boolean z);

    void onCompleted();

    void onDeviceRebooted();

    void onFailed(FotaStageEnum fotaStageEnum, ErrorEnum errorEnum);

    void onProgressChanged(AgentPartnerParam agentPartnerParam, int i);

    void onRhoNotification();

    void onTransferCompleted();
}
