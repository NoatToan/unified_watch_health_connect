package com.airoha.android.lib.RaceCommand.packet.fota.fotTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceRespFotaGetVersion extends RacePacket {
    public RaceRespFotaGetVersion() {
        super(RaceType.RESPONSE, RaceId.RACE_FOTA_GET_VERSION, new byte[]{0});
    }
}
