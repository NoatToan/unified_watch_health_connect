package com.airoha.android.lib.AntennaUT;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;

/* JADX INFO: loaded from: classes2.dex */
public class AntennaInfoRpt extends FotaStage {
    public AntennaInfoRpt(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_ANTENNAUT_REPORT_ENABLE;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        placeCmd(new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_ANTENNAUT_REPORT_ENABLE));
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "RACE_SUSPEND_DSP resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage
    public void placeCmd(RacePacket racePacket) {
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
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
