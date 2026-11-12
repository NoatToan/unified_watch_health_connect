package com.airoha.android.lib.fota;

import android.content.Context;
import android.os.Handler;
import com.airoha.android.lib.fota.actionEnum.DualActionEnum;
import com.airoha.android.lib.fota.actionEnum.SingleActionEnum;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.fotaError.FotaErrorMsg;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.fota.stage.IAirohaFotaStage;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_04_CheckIntegrity;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_11_DiffFlashPartitionEraseStorage;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_12_ProgramDiffFotaStorage;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_21_TwsDiffFlashPartitionEraseStorage;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_22_TwsProgramDiffFotaStorage;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.PacketParser.OnRaceMmiRoleSwitchIndListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaFotaMgrEx extends AirohaRaceOtaMgr {
    private static final String T = "AirohaFotaMgrEx";
    private byte[] L;
    private String M;
    private String N;
    private UUID O;
    private List<AirohaFotaListener> P;
    private DualActionEnum Q;
    private SingleActionEnum R;
    private OnRaceMmiRoleSwitchIndListener S;

    public class a implements Runnable {
        public final /* synthetic */ DualActionEnum a;

        public a(DualActionEnum dualActionEnum) {
            this.a = dualActionEnum;
        }

        @Override // java.lang.Runnable
        public void run() {
            DualActionEnum dualActionEnum = DualActionEnum.StartFota;
            DualActionEnum dualActionEnum2 = this.a;
            if (dualActionEnum == dualActionEnum2) {
                if (AirohaFotaMgrEx.this.M != null) {
                    AirohaFotaMgrEx airohaFotaMgrEx = AirohaFotaMgrEx.this;
                    airohaFotaMgrEx.startDualFota(airohaFotaMgrEx.M, (String) null, AirohaFotaMgrEx.this.mFotaDualSettings);
                    return;
                } else {
                    if (AirohaFotaMgrEx.this.L != null) {
                        AirohaFotaMgrEx airohaFotaMgrEx2 = AirohaFotaMgrEx.this;
                        airohaFotaMgrEx2.startDualFota(airohaFotaMgrEx2.L, (byte[]) null, AirohaFotaMgrEx.this.mFotaDualSettings);
                        return;
                    }
                    return;
                }
            }
            if (DualActionEnum.TwsCommit != dualActionEnum2) {
                if (DualActionEnum.RoleSwitch == dualActionEnum2) {
                    AirohaFotaMgrEx.this.doRoleSwitch();
                    return;
                }
                return;
            }
            for (AirohaFotaListener airohaFotaListener : AirohaFotaMgrEx.this.P) {
                if (airohaFotaListener != null) {
                    airohaFotaListener.onProgressChanged(AgentPartnerParam.PARTNER, 100);
                }
            }
            for (AirohaFotaListener airohaFotaListener2 : AirohaFotaMgrEx.this.P) {
                if (airohaFotaListener2 != null) {
                    airohaFotaListener2.onTransferCompleted();
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AirohaFotaMgrEx.this.M != null) {
                AirohaFotaMgrEx airohaFotaMgrEx = AirohaFotaMgrEx.this;
                airohaFotaMgrEx.startSingleFota(airohaFotaMgrEx.M, AirohaFotaMgrEx.this.mFotaSingleSettings);
            } else if (AirohaFotaMgrEx.this.L != null) {
                AirohaFotaMgrEx airohaFotaMgrEx2 = AirohaFotaMgrEx.this;
                airohaFotaMgrEx2.startSingleFota(airohaFotaMgrEx2.L, AirohaFotaMgrEx.this.mFotaSingleSettings);
            }
        }
    }

    public class c implements OnRaceMmiRoleSwitchIndListener {
        public c() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRaceMmiRoleSwitchIndListener
        public void OnRoleSwitched(byte b) {
            if (b == 0) {
                for (AirohaFotaListener airohaFotaListener : AirohaFotaMgrEx.this.P) {
                    if (airohaFotaListener != null) {
                        airohaFotaListener.onRhoNotification();
                    }
                }
            }
        }
    }

    public class d {
        public int a;
        public int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public AirohaFotaMgrEx(Context context) {
        super(context);
        this.P = Collections.synchronizedList(new ArrayList());
        this.Q = DualActionEnum.UNKNOWN;
        this.R = SingleActionEnum.UNKNOWN;
        this.S = new c();
        this.mAirohaLink.logToFile(T, "AirohaFotaMgrEx constructor");
        this.mAirohaLink.registerOnRaceMmiRoleSwitchIndListener(T, this.S);
    }

    private d F(IAirohaFotaStage iAirohaFotaStage) {
        if ((iAirohaFotaStage instanceof FotaStage_21_TwsDiffFlashPartitionEraseStorage) && FotaStage_21_TwsDiffFlashPartitionEraseStorage.gRealEraseCmdCount > 1) {
            return new d(0, 15);
        }
        if (iAirohaFotaStage instanceof FotaStage_22_TwsProgramDiffFotaStorage) {
            return FotaStage_21_TwsDiffFlashPartitionEraseStorage.gRealEraseCmdCount > 1 ? new d(15, 84) : new d(0, 99);
        }
        if (iAirohaFotaStage instanceof FotaStage_04_CheckIntegrity) {
            return new d(99, 1);
        }
        if ((iAirohaFotaStage instanceof FotaStage_11_DiffFlashPartitionEraseStorage) && FotaStage_11_DiffFlashPartitionEraseStorage.gRealEraseCmdCount > 1) {
            return new d(0, 15);
        }
        if (iAirohaFotaStage instanceof FotaStage_12_ProgramDiffFotaStorage) {
            return FotaStage_11_DiffFlashPartitionEraseStorage.gRealEraseCmdCount > 1 ? new d(15, 84) : new d(0, 99);
        }
        return new d(-1, 0);
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void cancel() {
        this.mAirohaLink.logToFile(T, "Cancel()");
        super.cancel();
    }

    public void close() {
        this.mAirohaLink.logToFile(T, "close()");
        this.P.clear();
        this.mAirohaLink.disconnect();
    }

    public void disableActiveMode() {
        this.mAirohaLink.logToFile(T, "disableActiveMode()");
        enableLongPacketMode(true);
        setLongPacketCmdCount(3);
        setLongPacketCmdDelay(200);
        enableSingleActiveFotaPreparation(false);
        enableTwsActiveFotaPreparation(false);
    }

    public String findErrorMsg(ErrorEnum errorEnum) {
        return FotaErrorMsg.findErrorMsg(errorEnum);
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void handleQueriedStates() {
        this.mAirohaLink.logToFile(T, "handleQueriedStates()");
        this.mAirohaLink.logToFile(T, "mHistoryState= " + this.mHistoryState);
        this.mAirohaLink.logToFile(T, "mActingSingleAciton= " + this.R);
        int i = this.mHistoryState;
        if (i != 257 && i != 258 && i != 512 && i != 65535 && i != 528) {
            if (i != 529) {
                return;
            }
            for (AirohaFotaListener airohaFotaListener : this.P) {
                if (airohaFotaListener != null) {
                    airohaFotaListener.onTransferCompleted();
                }
            }
            return;
        }
        SingleActionEnum singleActionEnum = SingleActionEnum.StartFota;
        SingleActionEnum singleActionEnum2 = this.R;
        if (singleActionEnum == singleActionEnum2) {
            return;
        }
        if (SingleActionEnum.Commit == singleActionEnum2) {
            this.R = SingleActionEnum.UNKNOWN;
            notifyAppListenerRebooted();
            this.mAirohaLink.logToFile(T, "mActingSingleAciton= " + this.R);
            return;
        }
        this.R = singleActionEnum;
        this.mAirohaLink.logToFile(T, "mIsFlashOperationAllowed= " + this.mIsFlashOperationAllowed);
        if (this.mIsFlashOperationAllowed) {
            new Handler(this.mAirohaLink.getContext().getMainLooper()).postDelayed(new b(), 1000L);
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void handleTwsQueriedStates() {
        this.mAirohaLink.logToFile(T, "handleTwsQueriedStates()");
        this.mAirohaLink.logToFile(T, "mAgentFotaState= " + this.mAgentFotaState);
        this.mAirohaLink.logToFile(T, "mPartnerFotaState= " + this.mPartnerFotaState);
        if (this.mAgentFotaState == 65535) {
            if (this.mPartnerFotaState == 65535) {
                notifyDualAction(DualActionEnum.StartFota);
                return;
            } else if (this.mPartnerFotaState == 785) {
                notifyDualAction(DualActionEnum.StartFota);
                return;
            }
        }
        if (this.mAgentFotaState == 257) {
            if (this.mPartnerFotaState == 257) {
                notifyDualAction(DualActionEnum.StartFota);
                return;
            } else if (this.mPartnerFotaState == 785) {
                notifyDualAction(DualActionEnum.StartFota);
                return;
            }
        }
        if (this.mAgentFotaState == 785) {
            if (this.mPartnerFotaState != 785) {
                notifyDualAction(DualActionEnum.RoleSwitch);
                return;
            }
            DualActionEnum dualActionEnum = this.Q;
            DualActionEnum dualActionEnum2 = DualActionEnum.StartFota;
            if (dualActionEnum == dualActionEnum2) {
                notifyDualAction(DualActionEnum.TwsCommit);
                return;
            } else {
                notifyDualAction(dualActionEnum2);
                return;
            }
        }
        if (this.mAgentFotaState != 785 && this.mPartnerFotaState == 785) {
            notifyDualAction(DualActionEnum.StartFota);
            return;
        }
        if (this.mAgentFotaState == 513) {
            if (this.mPartnerFotaState == 513) {
                notifyDualAction(DualActionEnum.StartFota);
                return;
            } else if (this.mPartnerFotaState == 785) {
                notifyDualAction(DualActionEnum.StartFota);
                return;
            }
        }
        if (this.mAgentFotaState == 784 && this.mPartnerFotaState == 785) {
            notifyDualAction(DualActionEnum.StartFota);
        } else {
            notifyDualAction(DualActionEnum.StartFota);
        }
    }

    public boolean isConnnected() {
        return this.mAirohaLink.isConnected();
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyAgentIsRight(boolean z) {
        this.mAirohaLink.logToFile(T, "notifyAgentIsRight");
        for (AirohaFotaListener airohaFotaListener : this.P) {
            if (airohaFotaListener != null) {
                airohaFotaListener.onAgentChannelReceived(z);
            }
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyAppListenerError(FotaStageEnum fotaStageEnum, ErrorEnum errorEnum, String str) {
        this.mAirohaLink.logToFile(T, "stageEnum= " + fotaStageEnum.ordinal() + ", errorEnum= " + errorEnum.ordinal());
        for (AirohaFotaListener airohaFotaListener : this.P) {
            if (airohaFotaListener != null) {
                airohaFotaListener.onFailed(fotaStageEnum, errorEnum);
            }
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyAppListenerInterrupted(String str) {
        this.mAirohaLink.logToFile(T, "Interrupted");
        for (AirohaFotaListener airohaFotaListener : this.P) {
            if (airohaFotaListener != null) {
                airohaFotaListener.onFailed(FotaStageEnum.None, ErrorEnum.INTERRUPTED);
            }
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyAppListenerProgress(AgentPartnerParam agentPartnerParam, IAirohaFotaStage iAirohaFotaStage, int i, int i2) {
        float f;
        float f2;
        int i3;
        d dVarF = F(iAirohaFotaStage);
        int i4 = dVarF.a;
        if (i4 < 0) {
            return;
        }
        if (iAirohaFotaStage instanceof FotaStage_21_TwsDiffFlashPartitionEraseStorage) {
            int i5 = FotaStage_21_TwsDiffFlashPartitionEraseStorage.gTotalEraseCmdCount;
            f = i4;
            f2 = (i + (i5 - i2)) / i5;
            i3 = dVarF.b;
        } else if (iAirohaFotaStage instanceof FotaStage_22_TwsProgramDiffFotaStorage) {
            int i6 = FotaStage_22_TwsProgramDiffFotaStorage.gTotalProgramCmdCount;
            f = i4;
            f2 = (i + (i6 - i2)) / i6;
            i3 = dVarF.b;
        } else if (iAirohaFotaStage instanceof FotaStage_11_DiffFlashPartitionEraseStorage) {
            int i7 = FotaStage_11_DiffFlashPartitionEraseStorage.gTotalEraseCmdCount;
            f = i4;
            f2 = (i + (i7 - i2)) / i7;
            i3 = dVarF.b;
        } else if (iAirohaFotaStage instanceof FotaStage_12_ProgramDiffFotaStorage) {
            int i8 = FotaStage_12_ProgramDiffFotaStorage.gTotalProgramCmdCount;
            f = i4;
            f2 = (i + (i8 - i2)) / i8;
            i3 = dVarF.b;
        } else {
            f = i4;
            f2 = i / i2;
            i3 = dVarF.b;
        }
        int i9 = (int) (f + (f2 * i3));
        this.mAirohaLink.logToFile(T, "over-all progress: " + i9 + ", " + iAirohaFotaStage.getClass().getSimpleName());
        DualActionEnum dualActionEnum = this.Q;
        if (dualActionEnum == DualActionEnum.StartFota || dualActionEnum == DualActionEnum.TwsCommit || this.R == SingleActionEnum.StartFota) {
            for (AirohaFotaListener airohaFotaListener : this.P) {
                if (airohaFotaListener != null) {
                    airohaFotaListener.onProgressChanged(agentPartnerParam, i9);
                }
            }
        }
    }

    public void notifyAppListenerRebooted() {
        this.mAirohaLink.logToFile(T, "notifyAppListenerRebooted");
        for (AirohaFotaListener airohaFotaListener : this.P) {
            if (airohaFotaListener != null) {
                airohaFotaListener.onDeviceRebooted();
            }
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyAppListenerUnexpectedlyDisconnected() {
        this.mAirohaLink.logToFile(T, "Unexpectedly Disconnected");
        for (AirohaFotaListener airohaFotaListener : this.P) {
            if (airohaFotaListener != null) {
                airohaFotaListener.onFailed(FotaStageEnum.None, ErrorEnum.ABNORMALLY_DISCONNECTED);
            }
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void notifyDualAction(DualActionEnum dualActionEnum) {
        this.mAirohaLink.logToFile(T, "notifyDualAction");
        this.mAirohaLink.logToFile(T, "actionEnum= " + dualActionEnum);
        this.mAirohaLink.logToFile(T, "mActingDualAction= " + this.Q);
        DualActionEnum dualActionEnum2 = DualActionEnum.StartFota;
        DualActionEnum dualActionEnum3 = this.Q;
        if (dualActionEnum2 == dualActionEnum3 && dualActionEnum2 == dualActionEnum) {
            return;
        }
        if (DualActionEnum.FotaComplete == dualActionEnum3 && dualActionEnum2 == dualActionEnum) {
            this.Q = DualActionEnum.UNKNOWN;
            notifyAppListenerRebooted();
            this.mAirohaLink.logToFile(T, "mActingDualAction= " + this.Q);
            return;
        }
        this.Q = dualActionEnum;
        this.mAirohaLink.logToFile(T, "mIsFlashOperationAllowed= " + this.mIsFlashOperationAllowed);
        if (this.mIsFlashOperationAllowed) {
            new Handler(this.mAirohaLink.getContext().getMainLooper()).postDelayed(new a(dualActionEnum), 1000L);
        }
    }

    @Override // com.airoha.android.lib.fota.AirohaRaceOtaMgr
    public void queryAfterConnected() {
        this.mAirohaLink.logToFile(T, "queryAfterConnected()");
        Queue<IAirohaFotaStage> queue = this.mStagesQueue;
        if (queue != null && !queue.isEmpty()) {
            startRespTimer(2000);
        } else if (this.mIsTws) {
            queryDualFotaInfo();
        } else {
            querySingleFotaInfo();
        }
    }

    public void registerAirohaOtaListener(AirohaFotaListener airohaFotaListener) {
        if (this.P.contains(airohaFotaListener)) {
            return;
        }
        this.P.add(airohaFotaListener);
    }

    public void setBdAdress(String str) {
        this.N = str;
    }

    public void setBinaryFile(byte[] bArr) {
        this.L = bArr;
    }

    public void setFilePath(String str) {
        this.M = str;
    }

    public void setUUID(UUID uuid) {
        this.O = uuid;
    }

    public void start(int i, boolean z, boolean z2, boolean z3) {
        start(i, z, z2, z3, 2048);
    }

    public void startCommitProcess() {
        this.mAirohaLink.logToFile(T, "startCommitProcess()");
        if (this.mIsTws) {
            startTwsCommit();
        } else {
            this.R = SingleActionEnum.Commit;
            startSingleCommit();
        }
        for (AirohaFotaListener airohaFotaListener : this.P) {
            if (airohaFotaListener != null) {
                airohaFotaListener.onCompleted();
            }
        }
        this.mProgressRoleIndex = AgentPartnerParam.AGENT;
    }

    public void unregisterAirohaOtaListener(AirohaFotaListener airohaFotaListener) {
        this.P.remove(airohaFotaListener);
    }

    public void start(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.mAirohaLink.logToFile(T, "start()");
        this.mFotaDualSettings.batteryThreshold = i;
        this.mFotaSingleSettings.batteryThreshold = i;
        this.Q = DualActionEnum.UNKNOWN;
        this.R = SingleActionEnum.UNKNOWN;
        if (z) {
            enableLongPacketMode(true);
            setLongPacketCmdCount(3);
            setLongPacketCmdDelay(200);
            enableSingleActiveFotaPreparation(false);
            enableTwsActiveFotaPreparation(false);
            this.mFotaSingleSettings.programInterval = 200;
            this.mFotaDualSettings.programInterval = 200;
        } else {
            enableLongPacketMode(false);
            setLongPacketCmdCount(0);
            setLongPacketCmdDelay(0);
            enableSingleActiveFotaPreparation(true);
            enableTwsActiveFotaPreparation(true);
            this.mFotaSingleSettings.programInterval = 0;
            this.mFotaDualSettings.programInterval = 0;
        }
        this.mIsTws = z2;
        if (this.mAirohaLink.isConnected()) {
            queryAfterConnected();
        } else {
            this.mAirohaLink.connect(this.N, this.O);
        }
    }

    public AirohaFotaMgrEx(AirohaLink airohaLink) {
        super(airohaLink);
        this.P = Collections.synchronizedList(new ArrayList());
        this.Q = DualActionEnum.UNKNOWN;
        this.R = SingleActionEnum.UNKNOWN;
        c cVar = new c();
        this.S = cVar;
        this.mAirohaLink.registerOnRaceMmiRoleSwitchIndListener(T, cVar);
    }
}
