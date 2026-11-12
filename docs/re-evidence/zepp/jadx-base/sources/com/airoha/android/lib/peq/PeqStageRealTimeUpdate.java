package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.util.Converter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageRealTimeUpdate extends PeqStage {
    private static final String c = "PeqStageRealTimeUpdate";
    public Map<Rate, CoefParamStruct> b;

    public PeqStageRealTimeUpdate(AirohaPeqMgr airohaPeqMgr, Map<Rate, CoefParamStruct> map) {
        super(airohaPeqMgr);
        this.b = map;
        this.mRaceId = RaceId.DSP_REALTIME_PEQ;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.DSP_REALTIME_PEQ);
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte) 0);
        byte[] bArr = {0, 0};
        for (byte b : Converter.shortToBytes((short) this.b.size())) {
            arrayList.add(Byte.valueOf(b));
        }
        for (int i = 0; i < 2; i++) {
            arrayList.add(Byte.valueOf(bArr[i]));
        }
        Iterator<CoefParamStruct> it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            for (byte b2 : it2.next().getRaw()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        byte[] bArr2 = new byte[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bArr2[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        racePacket.setPayload(bArr2);
        return racePacket;
    }
}
