package com.miui.tsmclient.hcievent;

import android.text.TextUtils;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.StringUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.tlv.ITLVObject;
import com.tsmclient.smartcard.tlv.ITLVValue;
import com.tsmclient.smartcard.tlv.TLVParser;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class TLVHciHandler extends AbsTransportationEventHandler {
    private static final String DEFAULT_DATE_FORMAT = "yyMMdd";

    private CardConfigManager.HciTLVRule getHciTLVRule(String str) {
        CardConfigManager.CardConfig cardConfig = CardConfigManager.getInstance().getCardConfig(str);
        if (cardConfig == null) {
            return null;
        }
        return cardConfig.getHciTLVRule(str);
    }

    private byte[] getTagValue(ITLVObject iTLVObject, String[] strArr) throws TagNotFoundException {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        while (true) {
            int length = strArr.length;
            ITLVValue value = iTLVObject.getValue();
            if (i >= length) {
                return value.toBytes().toBytes();
            }
            iTLVObject = value.findTLV(ByteArray.wrap(Coder.hexStringToBytes(strArr[i])));
            i++;
        }
    }

    private String getValue(ITLVObject iTLVObject, String str, String[] strArr, int i) {
        try {
            ByteArray byteArrayWrap = ByteArray.wrap(getTagValue(iTLVObject, strArr));
            if ((str.length() / 2) + i > byteArrayWrap.length()) {
                return "";
            }
            if (i > -1) {
                byteArrayWrap = byteArrayWrap.duplicate(i, str.length() / 2);
            }
            return Coder.bytesToHexString(byteArrayWrap.toBytes());
        } catch (TagNotFoundException e) {
            e = e;
            LogUtils.e("error when parse tlv value ", e);
            return "";
        } catch (IllegalArgumentException e2) {
            e = e2;
            LogUtils.e("error when parse tlv value ", e);
            return "";
        }
    }

    private boolean isHciTradeEvent(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            return Pattern.compile(str).matcher(Coder.bytesToHexString(bArr)).matches();
        }
        LogUtils.d("regex is empty");
        return true;
    }

    @Override // com.miui.tsmclient.hcievent.AbsTransportationEventHandler
    public HciEventInfo doHandleData(String str, long j, ByteArray byteArray) {
        String str2;
        long j2;
        long dataFromString;
        String strMillsToTime;
        CardConfigManager.HciTLVRule hciTLVRule = getHciTLVRule(str);
        if (hciTLVRule != null) {
            int tLVDataOffset = hciTLVRule.getTLVDataOffset();
            try {
                ITLVObject iTLVObject = TLVParser.parse(byteArray.duplicate(tLVDataOffset, byteArray.length() - tLVDataOffset));
                if (!TextUtils.isEmpty(hciTLVRule.getTransactionTypeFormat())) {
                    if (!Pattern.compile(hciTLVRule.getTransactionTypeFormat()).matcher(Coder.bytesToHexString(getTagValue(iTLVObject, hciTLVRule.getTransactionTypeTags()))).matches()) {
                        return null;
                    }
                }
                ByteArray byteArrayWrap = ByteArray.wrap(getTagValue(iTLVObject, hciTLVRule.getTradeAmountTags()));
                if (hciTLVRule.getTradeAmountOffset() > -1) {
                    byteArrayWrap = byteArrayWrap.duplicate(hciTLVRule.getTradeAmountOffset(), 4);
                }
                ByteArray byteArrayWrap2 = ByteArray.wrap(getTagValue(iTLVObject, hciTLVRule.getBalanceTags()));
                if (hciTLVRule.getBalanceOffset() > -1) {
                    byteArrayWrap2 = byteArrayWrap2.duplicate(hciTLVRule.getBalanceOffset(), 4);
                }
                if (TextUtils.isEmpty(hciTLVRule.getTimeFormat())) {
                    j2 = j;
                    dataFromString = -1;
                } else {
                    String value = getValue(iTLVObject, hciTLVRule.getTimeFormat(), hciTLVRule.getTimeTags(), hciTLVRule.getTimeOffset());
                    String dateFormat = DEFAULT_DATE_FORMAT;
                    if (TextUtils.isEmpty(hciTLVRule.getDateFormat())) {
                        j2 = j;
                        strMillsToTime = StringUtils.millsToTime(j2, DEFAULT_DATE_FORMAT);
                    } else {
                        dateFormat = hciTLVRule.getDateFormat();
                        strMillsToTime = getValue(iTLVObject, dateFormat, hciTLVRule.getDateTags(), hciTLVRule.getDateOffset());
                        j2 = j;
                    }
                    dataFromString = StringUtils.formatDataFromString(strMillsToTime + " " + value, dateFormat + " " + hciTLVRule.getTimeFormat());
                }
                HciEventInfo hciEventInfo = new HciEventInfo(str, dataFromString == -1 ? j2 : dataFromString, Coder.bytesToInt(byteArrayWrap.toBytes()), Coder.bytesToInt(byteArrayWrap2.toBytes()), false);
                ByteArray byteArrayWrap3 = ByteArray.wrap(getTagValue(iTLVObject, hciTLVRule.getTerminalNoTags()));
                if (hciTLVRule.getTerminalNoOffset() > -1) {
                    byteArrayWrap3 = byteArrayWrap3.duplicate(hciTLVRule.getTerminalNoOffset(), 6);
                }
                hciEventInfo.setTerminalNo(Coder.bytesToHexString(byteArrayWrap3.toBytes()));
                hciEventInfo.setDescription(hciTLVRule.getDesc());
                return hciEventInfo;
            } catch (InvalidTLVException e) {
                e = e;
                str2 = "invalid tlv";
                LogUtils.e(str2, e);
                return null;
            } catch (TagNotFoundException e2) {
                e = e2;
                str2 = "error when parse tlv";
                LogUtils.e(str2, e);
                return null;
            } catch (IllegalArgumentException e3) {
                e = e3;
                str2 = "invalid tlv tags";
                LogUtils.e(str2, e);
                return null;
            }
        }
        return null;
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        CardConfigManager.HciTLVRule hciTLVRule;
        if (bArr == null || bArr2 == null || (hciTLVRule = getHciTLVRule(Coder.bytesToHexString(bArr))) == null || bArr2.length <= hciTLVRule.getTLVDataOffset()) {
            return false;
        }
        return isHciTradeEvent(ByteArray.wrap(bArr2, 0, hciTLVRule.getTLVDataOffset()).toBytes(), hciTLVRule.getHciPrefix());
    }
}
