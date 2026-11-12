package com.tsmclient.smartcard.handler;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.apdu.SelectCommand;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.model.TradeLog;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HZTCardHandler extends BaseTransCardHandler {
    private static final ByteArray HZT_ENTITY_AID = ByteArray.wrap(new byte[]{49, SettingsModule.VALUE_TYPE_FLAG, 85, 66, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 83, 89, 83, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 68, 68, 70, 48, 49});
    private static final ByteArray FID = ByteArray.wrap(new byte[]{63, 1});
    private static final ByteArray GET_CARDNUM_CMD = ByteArray.wrap(new byte[]{0, -80, -107, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 8});

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public Map<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        HashMap map = new HashMap();
        byte[] bArrTransceive = transceive(GET_CARDNUM_CMD.toBytes());
        assertResponse(bArrTransceive, "failed to get card num");
        map.put(CardConstants.KEY_ACCOUNT_NUM, Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 0, bArrTransceive.length - 2).toBytes()));
        return map;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return CardConstants.HZT;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readRecord(ArrayList<TradeLog> arrayList, boolean z) throws IOException {
        readRecord(arrayList, true, (byte) -44, (byte) 0, false);
        readRecord(arrayList, true, (byte) -124, (byte) 0, false);
        readRecord(arrayList, true, (byte) -60, (byte) 0, false);
        Collections.sort(arrayList);
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(this.mInternalRead ? APDUConstants.AID_HZT : HZT_ENTITY_AID);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select HZT AID_APPLET");
        selectCommand.setP1((byte) 0);
        selectCommand.setData(FID);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select HZT FID");
    }
}
