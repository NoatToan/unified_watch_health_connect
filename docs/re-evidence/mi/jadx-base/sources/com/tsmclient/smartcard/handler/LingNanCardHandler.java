package com.tsmclient.smartcard.handler;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
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
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class LingNanCardHandler extends BaseTransCardHandler {
    private static final String TAG = "LingNanCardHandler";
    private final ByteArray READ_BALANCE_CMD = ByteArray.wrap(new byte[]{-128, 92, 0, 2, 4});
    private static final ByteArray LNT_AID = ByteArray.wrap(new byte[]{SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 89, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, SettingsModule.VALUE_TYPE_FLAG, SettingsModule.VALUE_TYPE_FLAG, 89});
    private static final ByteArray LNT_MOT_INTERNAL_AID = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 6, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 1, 1, 5, 88, 0, 2, 32, 88, 16, 0, 0});
    private static final ByteArray LNT_INTERNAL_AID = ByteArray.wrap(new byte[]{89, 67, 84, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 85, 83, 69, 82});
    private static final ByteArray LNT_INTERNAL_WALLET_AID = ByteArray.wrap(new byte[]{-35, -15});

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public int getBalance() throws IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 0);
        selectCommand.setData(ByteArray.wrap(new byte[]{-83, -13}));
        byte[] bArrTransceive = transceive(selectCommand.toRawAPDU().toBytes());
        return !ByteArray.equals(ISmartCardHandler.STATUS_OK, ByteArray.wrap(bArrTransceive, bArrTransceive.length - 2, 2)) ? CardConstants.RESULT_INVALID : Coder.bytesToInt(transceive(this.READ_BALANCE_CMD.toBytes()), 0, 4);
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public Map<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        HashMap map = new HashMap();
        ReadBinaryCommand readBinaryCommand = new ReadBinaryCommand();
        readBinaryCommand.setP1((byte) -107);
        byte[] bArrTransceive = transceive(readBinaryCommand.toRawAPDU().toBytes());
        assertResponse(bArrTransceive, "failed to get card num");
        String strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 53, 5).toBytes());
        Pattern patternCompile = Pattern.compile("^0*$");
        if (strBytesToHexString == null || patternCompile.matcher(strBytesToHexString).matches()) {
            throw new UnProcessableCardException(getClass().getSimpleName() + " illegal card number");
        }
        String strBytesToHexString2 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 23, 4).toBytes());
        String strBytesToHexString3 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 27, 4).toBytes());
        map.put(CardConstants.KEY_ACCOUNT_NUM, strBytesToHexString);
        map.put(CardConstants.VALID_START, strBytesToHexString2);
        map.put(CardConstants.VALID_END, strBytesToHexString3);
        return map;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return "LNT";
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public ByteArray getConsumeTag() {
        return ByteArray.wrap(new byte[]{9, 6});
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readRecord(ArrayList<TradeLog> arrayList, boolean z) throws IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 0);
        selectCommand.setData(ByteArray.wrap(new byte[]{0, 24}));
        byte[] bArrTransceive = transceive(selectCommand.toRawAPDU().toBytes());
        if (!ByteArray.equals(ISmartCardHandler.STATUS_OK, ByteArray.wrap(bArrTransceive, bArrTransceive.length - 2, 2))) {
            throw new IOException("failed to get record");
        }
        super.readRecord(arrayList, true);
        for (TradeLog tradeLog : arrayList) {
            String tradeDate = tradeLog.getTradeDate();
            if (!TextUtils.isEmpty(tradeDate) && tradeDate.length() > 4) {
                tradeLog.setTradeDate(tradeDate.substring(4, tradeDate.length()));
            }
        }
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(LNT_MOT_INTERNAL_AID);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), ISmartCardHandler.STATUS_APP_NOT_FOUND, "LingNanTong MOT should not be selected");
        if (!this.mInternalRead) {
            selectCommand.setData(LNT_AID);
            assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select LingNanTong AID");
            return;
        }
        selectCommand.setData(LNT_INTERNAL_AID);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select LingNanTong internal AID");
        selectCommand.setP1((byte) 0);
        selectCommand.setData(LNT_INTERNAL_WALLET_AID);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select LingNanTong wallet AID");
    }
}
