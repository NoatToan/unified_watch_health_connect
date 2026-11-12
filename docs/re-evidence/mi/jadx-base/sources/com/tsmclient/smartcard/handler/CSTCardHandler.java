package com.tsmclient.smartcard.handler;

import android.text.TextUtils;
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
public class CSTCardHandler extends BaseTransCardHandler {
    private final String HAS_BEEN_BACK_CARD = "01111";
    private final String ILLEGAL_CARD_NUMBER = "0000000000000000";
    private static final ByteArray FID_00 = ByteArray.wrap(new byte[]{63, 0});
    private static final ByteArray FID_01 = ByteArray.wrap(new byte[]{63, 1});
    private static final ByteArray GET_CARDNUM_CMD = ByteArray.wrap(new byte[]{0, -80, -107, 0, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC});
    private static final ByteArray GET_REAL_CARDNUM_CMD = ByteArray.wrap(new byte[]{-128, -54, 0, 0, 9});
    private static final ByteArray GET_BALANCE_CMD = ByteArray.wrap(new byte[]{-128, 92, 0, 2, 4});
    private static final ByteArray READ_CARD_STATAUS_CMD = ByteArray.wrap(new byte[]{0, -78, 2, -72, 48});

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public int getBalance() throws UnProcessableCardException, IOException {
        byte[] bArrTransceive = transceive(GET_BALANCE_CMD.toBytes());
        assertResponse(bArrTransceive, "failed to get balance");
        return Coder.bytesToInt(ByteArray.wrap(bArrTransceive, 0, 4).toBytes());
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public Map<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        HashMap map = new HashMap();
        byte[] bArrTransceive = transceive(GET_CARDNUM_CMD.toBytes());
        assertResponse(bArrTransceive, "failed to get logic card num");
        String strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 12, 8).toBytes());
        if (strBytesToHexString.equals("0000000000000000")) {
            throw new UnProcessableCardException(getClass().getSimpleName() + " illegal card number");
        }
        map.put(CardConstants.KEY_ACCOUNT_NUM, strBytesToHexString);
        byte[] bArrTransceive2 = transceive(GET_REAL_CARDNUM_CMD.toBytes());
        assertResponse(bArrTransceive2, "failed to get real card num");
        map.put(CardConstants.KEY_ACCOUNT_REAL_NUM, Coder.bytesToHexString(ByteArray.wrap(bArrTransceive2, 1, 4).toBytes()));
        return map;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return CardConstants.CST;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readCardStatus(Map<String, String> map) throws UnProcessableCardException, IOException {
        if (map == null) {
            return;
        }
        byte[] bArrTransceive = transceive(READ_CARD_STATAUS_CMD.toBytes());
        if (bArrTransceive.length < 5) {
            map.put(CardConstants.STATUS_NEGATIVE, "1");
        } else {
            map.put(CardConstants.STATUS_NEGATIVE, String.valueOf(TextUtils.equals(String.format("%08d", Integer.valueOf(Integer.parseInt(Integer.toBinaryString(ByteArray.wrap(bArrTransceive).get(4))))).substring(0, 5), "01111") ? 1 : 0));
        }
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readRecord(ArrayList<TradeLog> arrayList, boolean z) throws IOException {
        readRecord(arrayList, true, (byte) -60, (byte) 23, false);
        Collections.sort(arrayList);
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(APDUConstants.AID_CST);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select CST AID_APPLET");
        selectCommand.setP1((byte) 0);
        selectCommand.setData(FID_00);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select CST FID00");
        selectCommand.setP1((byte) 0);
        selectCommand.setData(FID_01);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select CST FID01");
    }
}
