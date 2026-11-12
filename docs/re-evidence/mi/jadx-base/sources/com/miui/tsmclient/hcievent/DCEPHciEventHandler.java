package com.miui.tsmclient.hcievent;

import android.os.Bundle;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ResUtils;
import com.miui.tsmclient.util.StringUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.tsmclient.smartcard.tlv.ITLVValue;
import com.tsmclient.smartcard.tlv.TLVParser;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DCEPHciEventHandler implements IHciEventHandler {
    private static final ByteArray AID_DIGICCY = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 0, 68, 67, 69, SettingsModule.VALUE_TYPE_FLAG});
    private static final int EXTRA_TRADE_TIME = 5;
    private static final String HCI_SUCCESS_VALUE = "9000";
    private static final String PREFIX_COMPLETE = "0A";
    private static final String PREFIX_END = "02";
    private static final String PREFIX_START = "01";
    private static final String TAG_TRADE_AMOUNT = "51";
    private static final String TAG_TRADE_BALANCE = "5F30";
    private static final String TAG_TRADE_NUM = "5F34";
    private static final String TAG_TRADE_TIME = "0A";
    private static Map<String, String[]> sErrorMap;

    static {
        HashMap map = new HashMap();
        sErrorMap = map;
        map.put("9302", new String[]{"dcep_hci_trade_status_fail", "dcep_hci_tip_paying_not_enough"});
        sErrorMap.put("9304", new String[]{"dcep_hci_trade_status_fail", "dcep_hci_tip_more_than_three"});
        sErrorMap.put("9401", new String[]{"dcep_hci_trade_status_balance_not_enough", "dcep_hci_tip_balance_not_enough"});
        sErrorMap.put("9402", new String[]{"dcep_hci_trade_status_balance_not_enough", "dcep_hci_tip_balance_not_enough"});
        sErrorMap.put("9403", new String[]{"dcep_hci_trade_status_balance_not_enough", "dcep_hci_tip_balance_not_enough"});
        sErrorMap.put("9404", new String[]{"dcep_hci_trade_status_balance_limited", "dcep_hci_tip_balance_limited"});
        sErrorMap.put("9405", new String[]{"dcep_hci_trade_status_balance_limited", "dcep_hci_tip_balance_limited"});
        sErrorMap.put("9406", new String[]{"dcep_hci_trade_status_balance_limited", "dcep_hci_tip_balance_limited"});
    }

    private byte[] getTagValue(ITLVValue iTLVValue, String str) throws TagNotFoundException {
        return iTLVValue.findTLV(ByteArray.wrap(Coder.hexStringToBytes(str))).getValue().toBytes().toBytes();
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
        try {
            String strBytesToHexString = Coder.bytesToHexString(bArr2);
            String strBytesToHexString2 = Coder.bytesToHexString(bArr);
            String str = APDUConstants.AID_DCEP_ACCOUNT_MODE_STR;
            if (TextUtils.equals(strBytesToHexString2, str)) {
                if (!strBytesToHexString.startsWith("0A") || !TextUtils.equals(HCI_SUCCESS_VALUE, TLVParser.parse(ByteArray.wrap(bArr2)).getValue().toBytes().toString())) {
                    return null;
                }
                HciEventInfo hciEventInfo = new HciEventInfo(str, j, false);
                hciEventInfo.mStatus = 1;
                hciEventInfo.mHciEventType = HciEventInfo.HciEventType.DCEP;
                hciEventInfo.setTradeState(true);
                return hciEventInfo;
            }
            if (strBytesToHexString.startsWith("0A")) {
                HciEventInfo hciEventInfo2 = new HciEventInfo(Coder.bytesToHexString(bArr), j, false);
                hciEventInfo2.mStatus = 1;
                hciEventInfo2.mHciEventType = HciEventInfo.HciEventType.DCEP;
                String[] strArr = sErrorMap.get(TLVParser.parse(ByteArray.wrap(bArr2)).getValue().toBytes().toString());
                if (strArr != null) {
                    hciEventInfo2.setDescription(ResUtils.getString(EnvironmentConfig.getContext(), strArr[0]));
                    Bundle bundle = new Bundle();
                    bundle.putString(HciEventInfo.KEY_SUB_DESC, ResUtils.getString(EnvironmentConfig.getContext(), strArr[1]));
                    hciEventInfo2.setExtra(bundle);
                }
                return hciEventInfo2;
            }
            if (strBytesToHexString.length() < 8) {
                return null;
            }
            ITLVValue tLVValue = TLVParser.parseTLVValue(ByteArray.wrap(Coder.hexStringToBytes(strBytesToHexString.substring(8))));
            int iBytesToInt = Coder.bytesToInt(getTagValue(tLVValue, "51"));
            long dataFromString = StringUtils.formatDataFromString(Coder.bytesToHexString(getTagValue(tLVValue, "0A")), "yyyyMMddHHmm");
            int iBytesToInt2 = Coder.bytesToInt(getTagValue(tLVValue, TAG_TRADE_BALANCE));
            int iBytesToInt3 = strBytesToHexString.startsWith("02") ? Coder.bytesToInt(getTagValue(tLVValue, TAG_TRADE_NUM)) : 0;
            HciEventInfo hciEventInfo3 = new HciEventInfo(Coder.bytesToHexString(bArr), dataFromString > -1 ? dataFromString : j, iBytesToInt, iBytesToInt2, false);
            hciEventInfo3.mHciEventType = HciEventInfo.HciEventType.DCEP;
            if (strBytesToHexString.startsWith("02")) {
                if (iBytesToInt3 < 5) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(HciEventInfo.KEY_SUB_DESC, ResUtils.getString(EnvironmentConfig.getContext(), "dcep_hci_tip_paying_less_than_five"));
                    hciEventInfo3.setExtra(bundle2);
                }
                hciEventInfo3.mStatus = 1;
            } else {
                hciEventInfo3.mStatus = 0;
            }
            return hciEventInfo3;
        } catch (InvalidTLVException e) {
            e = e;
            LogUtils.e("handleData occurs exception", e);
            return null;
        } catch (TagNotFoundException e2) {
            e = e2;
            LogUtils.e("handleData occurs exception", e);
            return null;
        }
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        String strBytesToHexString = Coder.bytesToHexString(bArr2);
        return (APDUConstants.AID_DCEP_ACCOUNT_MODE_STR.equals(Coder.bytesToHexString(bArr)) && strBytesToHexString.startsWith("0A")) || (Coder.bytesToHexString(AID_DIGICCY.toBytes()).equals(Coder.bytesToHexString(bArr)) && (strBytesToHexString.startsWith("01") || strBytesToHexString.startsWith("02") || strBytesToHexString.startsWith("0A")));
    }
}
