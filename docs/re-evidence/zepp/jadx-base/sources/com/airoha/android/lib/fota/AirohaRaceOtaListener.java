package com.airoha.android.lib.fota;

/* JADX INFO: loaded from: classes2.dex */
public interface AirohaRaceOtaListener {
    void onCompleted();

    void onFailed(AirohaRaceOtaError airohaRaceOtaError);

    void onProgressChanged(int i, AgentPartnerParam agentPartnerParam);

    void onTransferCompleted();
}
