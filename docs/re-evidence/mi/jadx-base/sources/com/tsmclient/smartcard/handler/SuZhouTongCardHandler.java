package com.tsmclient.smartcard.handler;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.apdu.ReadBinaryCommand;
import com.tsmclient.smartcard.apdu.SelectCommand;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.model.TradeLog;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SuZhouTongCardHandler extends BaseTransCardHandler {
    private static final ByteArray SUZHOUTONG_AID = ByteArray.wrap(new byte[]{83, 85, 88, 73, 78, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 77, 70});
    private static final ByteArray GET_BALANCE_CMD = ByteArray.wrap(new byte[]{-128, 92, 0, 1, 4});
    private static final ByteArray PIN_AUTH_CMD = ByteArray.wrap(new byte[]{0, 32, 0, 0, 3, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, 86});

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public int getBalance() throws UnProcessableCardException, IOException {
        assertResponse(transceive(PIN_AUTH_CMD.toBytes()), "failed to auth pin");
        byte[] bArrTransceive = transceive(GET_BALANCE_CMD.toBytes());
        assertResponse(bArrTransceive, "failed to get balance");
        return Coder.bytesToInt(ByteArray.wrap(bArrTransceive, 0, 4).toBytes());
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public Map<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        HashMap map = new HashMap();
        ReadBinaryCommand readBinaryCommand = new ReadBinaryCommand();
        readBinaryCommand.setP1((byte) -107);
        byte[] bArrTransceive = transceive(readBinaryCommand.toRawAPDU().toBytes());
        assertResponse(bArrTransceive, "failed to get card num");
        String strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 0, 8).toBytes());
        String strBytesToHexString2 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 20, 4).toBytes());
        String strBytesToHexString3 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 24, 4).toBytes());
        map.put(CardConstants.KEY_ACCOUNT_NUM, strBytesToHexString);
        map.put(CardConstants.VALID_START, strBytesToHexString2);
        map.put(CardConstants.VALID_END, strBytesToHexString3);
        return map;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return CardConstants.SUZHOUTONG;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readRecord(ArrayList<TradeLog> arrayList, boolean z) throws IOException {
        try {
            assertResponse(transceive(PIN_AUTH_CMD.toBytes()), "failed to auth pin");
            super.readRecord(arrayList, z);
        } catch (UnProcessableCardException unused) {
        }
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(SUZHOUTONG_AID);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select SUZHOUTONG AID");
        selectCommand.setP1((byte) 0);
        selectCommand.setData(ByteArray.wrap(new byte[]{-33, 1}));
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select DF 01");
    }
}
