package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdRoleSwitch;
import com.airoha.android.lib.mmi.AirohaMmiMgr;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageRoleSwitch extends MmiStage {
    private static final String f = "MmiStageRoleSwitch";

    public MmiStageRoleSwitch(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RaceCmdRoleSwitch raceCmdRoleSwitch = new RaceCmdRoleSwitch();
        this.mRaceId = raceCmdRoleSwitch.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdRoleSwitch);
        this.mCmdPacketMap.put(f, raceCmdRoleSwitch);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(f, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }
}
