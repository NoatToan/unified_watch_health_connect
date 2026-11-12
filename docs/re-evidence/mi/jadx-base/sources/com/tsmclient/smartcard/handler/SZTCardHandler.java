package com.tsmclient.smartcard.handler;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.ReaderUtil;
import com.tsmclient.smartcard.apdu.ReadBinaryCommand;
import com.tsmclient.smartcard.apdu.SelectCommand;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class SZTCardHandler extends BaseTransCardHandler {
    private static final String TAG = "SZTCardHandler";
    private static final ByteArray SZT_FID = ByteArray.wrap(new byte[]{16, 1});
    private static final ByteArray SZT_CARD_AID = ByteArray.wrap(new byte[]{SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 89, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 83, 90, 84});

    private String getCardNum(ByteArray byteArray) {
        return Integer.toString(Coder.bytesToInt(Coder.str2Bcd(ReaderUtil.invertString(Coder.bytesToHexString(byteArray.toBytes()), 2))));
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public int getBalance() throws UnProcessableCardException, IOException {
        byte[] bArrTransceive = transceive(ISmartCardHandler.GET_BALANCE_CMD.toBytes());
        assertResponse(bArrTransceive, "failed to get balance");
        return Coder.bytesToInt(ByteArray.wrap(bArrTransceive, 0, 4).toBytes()) - Integer.MIN_VALUE;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return "SZT";
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        if (!this.mInternalRead) {
            selectCommand.setData(SZT_CARD_AID);
            assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select SZT AID");
            return;
        }
        selectCommand.setData(APDUConstants.AID_SZT);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select SZT AID");
        selectCommand.setP1((byte) 0);
        selectCommand.setData(SZT_FID);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select SZT FID");
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public HashMap<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        HashMap<String, String> map = new HashMap<>();
        ReadBinaryCommand readBinaryCommand = new ReadBinaryCommand();
        readBinaryCommand.setP1((byte) -107);
        byte[] bArrTransceive = transceive(readBinaryCommand.toRawAPDU().toBytes());
        assertResponse(bArrTransceive, "failed to get card num");
        String cardNum = getCardNum(ByteArray.wrap(bArrTransceive, 16, 4));
        String strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 20, 4).toBytes());
        String strBytesToHexString2 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 24, 4).toBytes());
        map.put(CardConstants.KEY_ACCOUNT_NUM, cardNum);
        map.put(CardConstants.VALID_START, strBytesToHexString);
        map.put(CardConstants.VALID_END, strBytesToHexString2);
        return map;
    }
}
