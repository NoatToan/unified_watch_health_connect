package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.for153xMCE.RaceCmdGetAvaDst;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.fota.stage.for153xMCE.Dst;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_00_GetAvaDst extends FotaStage {
    public FotaStage_00_GetAvaDst(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_RELAY_GET_AVA_DST;
        this.mFotaStageIndex = FotaStageEnum.GetAvaDst;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdGetAvaDst raceCmdGetAvaDst = new RaceCmdGetAvaDst();
        this.mCmdPacketQueue.offer(raceCmdGetAvaDst);
        this.mCmdPacketMap.put(this.TAG, raceCmdGetAvaDst);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        ArrayList<Dst> arrayList = new ArrayList();
        for (int i3 = 6; i3 < bArr.length - 1; i3 += 2) {
            Dst dst = new Dst();
            dst.Type = bArr[i3];
            dst.Id = bArr[i3 + 1];
            arrayList.add(dst);
        }
        Dst dst2 = null;
        for (Dst dst3 : arrayList) {
            if (dst3.Type == 5) {
                dst2 = dst3;
                break;
            }
        }
        if (dst2 == null) {
            return;
        }
        this.mOtaMgr.setAwsPeerDst(dst2);
        this.mCmdPacketMap.get(this.TAG).setIsRespStatusSuccess();
        this.mIsRespSuccess = true;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage
    public void poolCmdToSend() {
        RacePacket racePacketPoll = this.mCmdPacketQueue.poll();
        if (racePacketPoll != null) {
            this.mAirohaLink.sendCommand(racePacketPoll.getRaw());
            if (racePacketPoll.isNeedResp()) {
                this.mOtaMgr.startRespTimer();
            }
        }
    }
}
