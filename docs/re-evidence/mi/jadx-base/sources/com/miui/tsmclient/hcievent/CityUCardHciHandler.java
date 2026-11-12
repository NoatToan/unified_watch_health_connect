package com.miui.tsmclient.hcievent;

import android.text.TextUtils;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.util.StringUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.APDUConstants;

/* JADX INFO: loaded from: classes6.dex */
public class CityUCardHciHandler extends AbsTransportationEventHandler {
    private static final String DEFAULT_DATE_FORMAT = "yyyyMMdd";
    private static final int DEFAULT_DATE_OFFSET = 12;
    private static final String DEFAULT_TIME_FORMAT = "HHmmss";
    private static final int DEFAULT_TIME_OFFSET = 16;
    private static final int LENGTH_HCI_EVENT_DATA = 23;

    private String getValue(ByteArray byteArray, int i, String str) {
        return (TextUtils.isEmpty(str) || i < 0 || (str.length() / 2) + i > byteArray.length()) ? "" : Coder.bytesToHexString(byteArray.duplicate(i, str.length() / 2).toBytes());
    }

    @Override // com.miui.tsmclient.hcievent.AbsTransportationEventHandler
    public HciEventInfo doHandleData(String str, long j, ByteArray byteArray) {
        int dataLength;
        int tradeAmountOffset;
        int balanceOffset;
        int timeOffset;
        String timeFormat;
        String desc;
        String dateFormat;
        int i;
        int i2;
        long j2;
        CardConfigManager.HCIRule hCIRule;
        int length = byteArray.length();
        CardConfigManager.CardConfig cardConfig = CardConfigManager.getInstance().getCardConfig(str);
        String str2 = "yyyyMMdd";
        if (cardConfig == null || (hCIRule = cardConfig.getHCIRule(str)) == null) {
            dataLength = 23;
            tradeAmountOffset = 1;
            balanceOffset = 19;
            timeOffset = 16;
            timeFormat = "HHmmss";
            desc = "";
            dateFormat = "yyyyMMdd";
            i = 12;
            i2 = 6;
        } else {
            dataLength = hCIRule.getDataLength();
            tradeAmountOffset = hCIRule.getTradeAmountOffset();
            balanceOffset = hCIRule.getBalanceOffset();
            int terminalNo = hCIRule.getTerminalNo();
            int dateOffset = hCIRule.getDateOffset();
            dateFormat = hCIRule.getDateFormat();
            timeOffset = hCIRule.getTimeOffset();
            timeFormat = hCIRule.getTimeFormat();
            desc = hCIRule.getDesc();
            i = dateOffset;
            i2 = terminalNo;
        }
        if (dataLength > length) {
            return null;
        }
        ByteArray byteArrayDuplicate = byteArray.duplicate(tradeAmountOffset, 4);
        ByteArray byteArrayDuplicate2 = byteArray.duplicate(balanceOffset, 4);
        String value = getValue(byteArray, i, dateFormat);
        String value2 = getValue(byteArray, timeOffset, timeFormat);
        if (TextUtils.isEmpty(value2) || !TextUtils.isEmpty(value)) {
            j2 = j;
            str2 = dateFormat;
        } else {
            j2 = j;
            value = StringUtils.millsToTime(j2, "yyyyMMdd");
        }
        long dataFromString = StringUtils.formatDataFromString(value + " " + value2, str2 + " " + timeFormat);
        if (dataFromString == -1) {
            dataFromString = j2;
        }
        HciEventInfo hciEventInfo = new HciEventInfo(str, dataFromString, Coder.bytesToInt(byteArrayDuplicate.toBytes()), Coder.bytesToInt(byteArrayDuplicate2.toBytes()), false);
        if (i2 > 0) {
            hciEventInfo.setTerminalNo(Coder.bytesToHexString(byteArray.duplicate(i2, 6).toBytes()));
        }
        hciEventInfo.setDescription(desc);
        return hciEventInfo;
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        ByteArray byteArrayWrap = ByteArray.wrap(bArr);
        boolean z = ByteArray.equals(byteArrayWrap, APDUConstants.AID_HZT) || ByteArray.equals(byteArrayWrap, APDUConstants.AID_LNT) || ByteArray.equals(byteArrayWrap, APDUConstants.AID_SUZHOUTONG) || ByteArray.equals(byteArrayWrap, APDUConstants.AID_WHT);
        CardConfigManager.CardConfig cardConfig = CardConfigManager.getInstance().getCardConfig(Coder.bytesToHexString(bArr));
        if (z) {
            return true;
        }
        return cardConfig != null && cardConfig.isSupportCityUHci(byteArrayWrap.toString());
    }
}
