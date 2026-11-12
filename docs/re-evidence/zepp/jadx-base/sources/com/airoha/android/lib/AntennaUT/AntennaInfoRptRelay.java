package com.airoha.android.lib.AntennaUT;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;

/* JADX INFO: loaded from: classes2.dex */
public class AntennaInfoRptRelay extends AntennaInfoRpt {
    public AntennaInfoRptRelay(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_RELAY_PASS_TO_DST;
        this.mRaceRespType = RaceType.INDICATION;
        this.mRelayRaceId = RaceId.RACE_ANTENNAUT_REPORT_ENABLE;
        this.mRelayRaceRespType = RaceType.RESPONSE;
        this.mIsRelay = true;
    }

    @Override // com.airoha.android.lib.AntennaUT.AntennaInfoRpt, com.airoha.android.lib.fota.stage.FotaStage
    public void placeCmd(RacePacket racePacket) {
        RacePacket racePacketCreateWrappedRelayPacket = createWrappedRelayPacket(racePacket);
        this.mCmdPacketQueue.offer(racePacketCreateWrappedRelayPacket);
        this.mCmdPacketMap.put(this.TAG, racePacketCreateWrappedRelayPacket);
    }

    @Override // com.airoha.android.lib.AntennaUT.AntennaInfoRpt, com.airoha.android.lib.fota.stage.FotaStage
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
