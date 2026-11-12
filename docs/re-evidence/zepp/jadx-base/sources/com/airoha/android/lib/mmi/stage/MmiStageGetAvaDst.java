package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.fota.for153xMCE.RaceCmdGetAvaDst;
import com.airoha.android.lib.fota.stage.for153xMCE.Dst;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageGetAvaDst extends MmiStage {
    public MmiStageGetAvaDst(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_RELAY_GET_AVA_DST;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RaceCmdGetAvaDst raceCmdGetAvaDst = new RaceCmdGetAvaDst();
        this.mCmdPacketQueue.offer(raceCmdGetAvaDst);
        this.mCmdPacketMap.put(this.TAG, raceCmdGetAvaDst);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
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
            this.mAirohaLink.logToFile(this.TAG, "partner not existing");
        }
        this.mMmiMgr.setAwsPeerDst(dst2);
    }
}
