package com.airoha.android.lib.fota;

import android.content.Context;
import com.airoha.android.lib.ProductType;
import com.airoha.android.lib.fota.actionEnum.DualActionEnum;
import com.airoha.android.lib.fota.actionEnum.SingleActionEnum;
import com.airoha.android.lib.fota.stage.FotaStage_00_Start;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_00_InquiryFota;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_00_QueryState;
import com.airoha.android.lib.fota.stage.forTws.FotaStageTwsQueryPartition;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_00_CheckAgentChannel;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_00_GetAgentClientVersion;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_00_TwsQueryState;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaRaceOtaMgrS extends AirohaRaceOtaMgr {
    private static final String T = "AirohaRaceOtaMgrS";
    private AgentPartnerParam L;
    private DualActionEnum M;
    private SingleActionEnum N;
    private byte[] O;
    private String P;
    private String Q;
    private UUID R;
    private ConcurrentHashMap<String, AirohaRaceOtaListener> S;

    public AirohaRaceOtaMgrS(Context context) {
        super(context);
        this.L = AgentPartnerParam.AGENT;
        this.M = DualActionEnum.UNKNOWN;
        this.N = SingleActionEnum.UNKNOWN;
        this.S = new ConcurrentHashMap<>();
        ProductType.isForSony = true;
    }

    private void C(AirohaRaceOtaError airohaRaceOtaError) {
        for (AirohaRaceOtaListener airohaRaceOtaListener : this.S.values()) {
            if (airohaRaceOtaListener != null) {
                airohaRaceOtaListener.onFailed(airohaRaceOtaError);
            }
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void cancel() {
        super.cancel();
    }

    public void close() {
        this.S.clear();
        this.mAirohaLink.disconnect();
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void handleQueriedStates() {
        int i = this.mHistoryState;
        if (i != 257 && i != 258 && i != 512 && i != 65535 && i != 528) {
            if (i != 529) {
                return;
            }
            for (AirohaRaceOtaListener airohaRaceOtaListener : this.S.values()) {
                if (airohaRaceOtaListener != null) {
                    airohaRaceOtaListener.onTransferCompleted();
                }
            }
            return;
        }
        this.N = SingleActionEnum.StartFota;
        if (this.mIsFlashOperationAllowed) {
            String str = this.P;
            if (str != null) {
                startSingleFota(str, this.mFotaSingleSettings);
                return;
            }
            byte[] bArr = this.O;
            if (bArr != null) {
                startSingleFota(bArr, this.mFotaSingleSettings);
            }
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void handleTwsQueriedStates() {
        if (this.mAgentFotaState == 65535) {
            if (this.mPartnerFotaState == 65535) {
                this.L = AgentPartnerParam.AGENT;
                notifyDualAction(DualActionEnum.StartFota);
                return;
            } else if (this.mPartnerFotaState == 785) {
                this.L = AgentPartnerParam.PARTNER;
                notifyDualAction(DualActionEnum.StartFota);
                return;
            }
        }
        if (this.mAgentFotaState == 257) {
            if (this.mPartnerFotaState == 257) {
                this.L = AgentPartnerParam.AGENT;
                notifyDualAction(DualActionEnum.StartFota);
                return;
            } else if (this.mPartnerFotaState == 785) {
                this.L = AgentPartnerParam.PARTNER;
                notifyDualAction(DualActionEnum.StartFota);
            }
        }
        if (this.mAgentFotaState == 785) {
            if (this.mPartnerFotaState == 785) {
                notifyDualAction(DualActionEnum.TwsCommit);
                return;
            }
            if (this.mPartnerFotaState == 257) {
                notifyDualAction(DualActionEnum.RoleSwitch);
                return;
            }
            if (this.mPartnerFotaState == 65535) {
                notifyDualAction(DualActionEnum.RoleSwitch);
                return;
            } else if (this.mPartnerFotaState == 528) {
                notifyDualAction(DualActionEnum.RoleSwitch);
                return;
            } else if (this.mPartnerFotaState == 769) {
                notifyDualAction(DualActionEnum.RoleSwitch);
                return;
            }
        }
        if (this.mAgentFotaState == 513) {
            if (this.mPartnerFotaState == 513) {
                this.L = AgentPartnerParam.AGENT;
                notifyDualAction(DualActionEnum.StartFota);
                return;
            } else if (this.mPartnerFotaState == 785) {
                this.L = AgentPartnerParam.PARTNER;
                notifyDualAction(DualActionEnum.StartFota);
                return;
            }
        }
        if (this.mAgentFotaState != 784 || this.mPartnerFotaState != 785) {
            notifyDualAction(DualActionEnum.StartFota);
        } else {
            this.L = AgentPartnerParam.PARTNER;
            notifyDualAction(DualActionEnum.StartFota);
        }
    }

    public boolean isConnnected() {
        return this.mAirohaLink.isConnected();
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyAppListenerUnexpectedlyDisconnected() {
        C(AirohaRaceOtaError.DISCONNECTED);
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyBatteryLevelLow() {
        C(AirohaRaceOtaError.BATERY_LEVEL_LOW);
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyDualAction(DualActionEnum dualActionEnum) {
        this.M = dualActionEnum;
        if (this.mIsFlashOperationAllowed) {
            if (DualActionEnum.StartFota == dualActionEnum) {
                String str = this.P;
                if (str != null) {
                    startDualFota(str, (String) null, this.mFotaDualSettings);
                    return;
                }
                byte[] bArr = this.O;
                if (bArr != null) {
                    startDualFota(bArr, (byte[]) null, this.mFotaDualSettings);
                    return;
                }
            }
            if (DualActionEnum.TwsCommit == dualActionEnum) {
                for (AirohaRaceOtaListener airohaRaceOtaListener : this.S.values()) {
                    if (airohaRaceOtaListener != null) {
                        airohaRaceOtaListener.onTransferCompleted();
                    }
                }
            }
            if (DualActionEnum.RoleSwitch == dualActionEnum) {
                doRoleSwitch();
            }
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void queryAfterConnected() {
        if (this.mIsTws) {
            queryDualFotaInfo();
        } else {
            querySingleFotaInfo();
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void queryDualFotaInfo() {
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStage_00_Start(this, true));
        this.mStagesQueue.offer(new FotaStage_00_CheckAgentChannel(this));
        this.mStagesQueue.offer(new FotaStageTwsQueryPartition(this));
        this.mStagesQueue.offer(new FotaStage_00_GetAgentClientVersion(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_00_GetAgentClientVersion(this, (byte) 1));
        this.mStagesQueue.offer(new FotaStage_00_TwsQueryState(this));
        startPollStagetQueue();
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void querySingleFotaInfo() {
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStage_00_Start(this, false));
        this.mStagesQueue.offer(new FotaStage_00_InquiryFota(this));
        this.mStagesQueue.offer(new FotaStage_00_QueryState(this));
        startPollStagetQueue();
    }

    public void registerAirohaOtaListener(AirohaRaceOtaListener airohaRaceOtaListener) {
        this.S.put(String.format("Observer%d", Integer.valueOf(this.S.size() + 1)), airohaRaceOtaListener);
    }

    public void setBdAdress(String str) {
        this.Q = str;
    }

    public void setBinaryFile(byte[] bArr) {
        this.O = bArr;
    }

    public void setFilePath(String str) {
        this.P = str;
    }

    public void setUUID(UUID uuid) {
        this.R = uuid;
    }

    public void start(int i, boolean z, boolean z2, boolean z3) {
        this.mFotaDualSettings.batteryThreshold = i;
        this.mFotaSingleSettings.batteryThreshold = i;
        this.mBatteryThrd = i;
        this.M = DualActionEnum.UNKNOWN;
        this.N = SingleActionEnum.UNKNOWN;
        if (z) {
            enableLongPacketMode(true);
            setLongPacketCmdCount(3);
            setLongPacketCmdDelay(200);
            enableSingleActiveFotaPreparation(false);
            enableTwsActiveFotaPreparation(false);
        } else {
            enableLongPacketMode(false);
            enableSingleActiveFotaPreparation(true);
            enableTwsActiveFotaPreparation(true);
        }
        this.mIsTws = z2;
        if (this.mAirohaLink.isConnected()) {
            queryAfterConnected();
        } else {
            this.mAirohaLink.connect(this.Q, this.R);
        }
    }

    public void startCommitProcess() {
        if (this.mIsTws) {
            startTwsCommit();
        } else {
            startSingleCommit();
        }
        for (AirohaRaceOtaListener airohaRaceOtaListener : this.S.values()) {
            if (airohaRaceOtaListener != null) {
                airohaRaceOtaListener.onCompleted();
            }
        }
    }

    public void unregisterAirohaOtaListener(AirohaRaceOtaListener airohaRaceOtaListener) {
        this.S.remove(airohaRaceOtaListener);
    }
}
