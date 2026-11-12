package com.airoha.android.lib.fota.stage;

import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.util.Converter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_07_GetModelName extends FotaStage {
    private static final String g = "AirohaFota07_GetModelName";
    private int f;

    public FotaStage_07_GetModelName(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.f = 62720;
        this.mFotaStageIndex = FotaStageEnum.GetModelName;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RacePacket racePacketGenReadNvKeyPacket = genReadNvKeyPacket(Converter.shortToBytes((short) this.f));
        this.mCmdPacketQueue.offer(racePacketGenReadNvKeyPacket);
        this.mCmdPacketMap.put(g, racePacketGenReadNvKeyPacket);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        short sBytesToShort = Converter.BytesToShort(bArr[3], bArr[2]);
        this.mAirohaLink.logToFile(g, "FotaStage_07_GetModelName resp length: " + ((int) sBytesToShort));
        if (sBytesToShort > 40) {
            Arrays.copyOfRange(bArr, 8, 28);
            this.mOtaMgr.notifyModelName(Converter.hexToAsciiString(Arrays.copyOfRange(bArr, 28, 48)));
            this.mCmdPacketMap.get(g).setIsRespStatusSuccess();
            this.mIsRespSuccess = true;
            this.mStatusCode = (byte) 0;
        }
    }
}
