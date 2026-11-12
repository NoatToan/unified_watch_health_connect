package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageHostAudioSaveStatus extends PeqStage {
    public PeqStageHostAudioSaveStatus(AirohaPeqMgr airohaPeqMgr) {
        super(airohaPeqMgr);
        this.mRaceId = RaceId.RACE_HOSTAUDIO_PEQ_SAVE_STATUS;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        try {
            byteArrayOutputStream.write(this.mPeqMgr.m());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_HOSTAUDIO_PEQ_SAVE_STATUS, byteArrayOutputStream.toByteArray());
    }
}
