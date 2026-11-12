package com.tsmclient.smartcard.handler;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.apdu.ReadBinaryCommand;
import com.tsmclient.smartcard.apdu.SelectCommand;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class WHTCardHandler extends BaseTransCardHandler {
    private boolean mIsSeCard;
    private static final ByteArray WHT_ENTITY_AID = ByteArray.wrap(new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, SettingsModule.VALUE_TYPE_FLAG, 49, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 87, 72, 67, 84, 67});
    private static final ByteArray SELECT_MF = ByteArray.wrap(new byte[]{63, 0});
    private static final ByteArray PIN_AUTH_CMD = ByteArray.wrap(new byte[]{0, 32, 0, 0, 3, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, 86});

    private static String getCardNum(byte[] bArr) {
        String strBytesToHexString = Coder.bytesToHexString(bArr);
        if (strBytesToHexString == null || strBytesToHexString.length() != 16) {
            return null;
        }
        String strSubstring = strBytesToHexString.substring(7);
        int i = 0;
        int i2 = 0;
        while (i < strSubstring.length()) {
            int iIntValue = Integer.valueOf(String.valueOf(strSubstring.charAt(i)), 16).intValue();
            i2 = i == 0 ? iIntValue : i2 ^ iIntValue;
            i++;
        }
        return strSubstring + (i2 % 10);
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return CardConstants.WHT;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void otherVerify() throws UnProcessableCardException, IOException {
        if (this.mIsSeCard) {
            return;
        }
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(WHT_ENTITY_AID);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select MF");
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(this.mInternalRead ? APDUConstants.AID_WHT : WHT_ENTITY_AID);
        byte[] bArrTransceive = transceive(selectCommand.toRawAPDU().toBytes());
        boolean z = this.mInternalRead;
        this.mIsSeCard = z;
        if (bArrTransceive == null || bArrTransceive.length < 2) {
            throw new IOException("failed to select WHT AID");
        }
        if (!z && !ByteArray.equals(ISmartCardHandler.STATUS_OK, ByteArray.wrap(bArrTransceive, bArrTransceive.length - 2, 2))) {
            selectCommand.setData(APDUConstants.AID_WHT);
            bArrTransceive = transceive(selectCommand.toRawAPDU().toBytes());
            this.mIsSeCard = true;
        }
        assertResponse(bArrTransceive, "failed to select WHT AID");
        if (this.mIsSeCard) {
            selectCommand.setP1((byte) 0);
            selectCommand.setData(ByteArray.wrap(new byte[]{16, 1}));
            assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select 10 01");
        } else {
            if (this.mInternalRead) {
                return;
            }
            selectCommand.setP1((byte) 0);
            selectCommand.setData(SELECT_MF);
            assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select MF");
        }
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public HashMap<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        if (this.mIsSeCard) {
            assertResponse(transceive(PIN_AUTH_CMD.toBytes()), "failed to auth pin");
        }
        HashMap<String, String> map = new HashMap<>();
        ReadBinaryCommand readBinaryCommand = new ReadBinaryCommand();
        if (this.mIsSeCard) {
            readBinaryCommand.setP1((byte) -107);
            byte[] bArrTransceive = transceive(readBinaryCommand.toRawAPDU().toBytes());
            assertResponse(bArrTransceive, "failed to get card num");
            String cardNum = getCardNum(ByteArray.wrap(bArrTransceive, 12, 8).toBytes());
            String strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 20, 4).toBytes());
            String strBytesToHexString2 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 24, 4).toBytes());
            map.put(CardConstants.KEY_ACCOUNT_NUM, cardNum);
            map.put(CardConstants.VALID_START, strBytesToHexString);
            map.put(CardConstants.VALID_END, strBytesToHexString2);
        } else {
            readBinaryCommand.setP1((byte) -118);
            byte[] bArrTransceive2 = transceive(readBinaryCommand.toRawAPDU().toBytes());
            assertResponse(bArrTransceive2, "failed to get card num");
            String strBytesToHexString3 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive2, 0, 5).toBytes());
            readBinaryCommand.setP1((byte) -123);
            byte[] bArrTransceive3 = transceive(readBinaryCommand.toRawAPDU().toBytes());
            assertResponse(bArrTransceive3, "failed to get valid time");
            String strBytesToHexString4 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive3, 20, 4).toBytes());
            String strBytesToHexString5 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive3, 16, 4).toBytes());
            map.put(CardConstants.KEY_ACCOUNT_NUM, strBytesToHexString3);
            map.put(CardConstants.VALID_START, strBytesToHexString4);
            map.put(CardConstants.VALID_END, strBytesToHexString5);
        }
        return map;
    }
}
