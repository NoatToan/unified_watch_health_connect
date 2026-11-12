package com.tsmclient.smartcard.handler;

import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.ReaderUtil;
import com.tsmclient.smartcard.apdu.ReadBinaryCommand;
import com.tsmclient.smartcard.apdu.SelectCommand;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.model.TradeLog;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CityUCardHandler extends BaseTransCardHandler {
    private static final String TAG = "CityUCardHandler";
    private ByteArray mAid;
    private String mCardId;
    private static final ByteArray SHANG_HAI = ByteArray.wrap(new byte[]{32, 0});
    private static final ByteArray DONG_GUAN = ByteArray.wrap(new byte[]{82, 48});
    private static final ByteArray CHONG_QING = ByteArray.wrap(new byte[]{64, 0});
    private static final ByteArray LAN_ZHOU = ByteArray.wrap(new byte[]{115, 0});
    private static final ByteArray ZHENG_ZHOU = ByteArray.wrap(new byte[]{69, 0});
    private static final ByteArray GUI_YANG = ByteArray.wrap(new byte[]{85, 0});
    private static final ByteArray XI_AN = ByteArray.wrap(new byte[]{113, 0});
    private static final ByteArray KUN_MING = ByteArray.wrap(new byte[]{101, 0});
    private static final ByteArray HA_ER_BIN = ByteArray.wrap(new byte[]{21, 0});
    private static final ByteArray QING_DAO = ByteArray.wrap(new byte[]{HMProSyncDataBaseProfile.DATA_SPO2_OSA, 96});
    private static final ByteArray NAN_CHANG = ByteArray.wrap(new byte[]{51, 0});
    private static final ByteArray NING_BO = ByteArray.wrap(new byte[]{49, SettingsModule.VALUE_TYPE_FLAG});
    private static final ByteArray ZHOU_SHAN = ByteArray.wrap(new byte[]{49, 96});
    private static final ByteArray CITYU_AID = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 0, 3, -122, -104, 7, 1});

    public CityUCardHandler(String str) {
        this.mCardId = str;
        if ("SPTC".equals(str)) {
            this.mAid = APDUConstants.AID_SPTC;
        } else if ("SPTC_NEW".equals(str)) {
            this.mAid = APDUConstants.AID_SPTC_NEW;
        }
    }

    private String getDateString(byte[] bArr, int i, int i2) {
        return Coder.bytesToHexString(ByteArray.wrap(bArr, i, i2).toBytes());
    }

    private String hexInvertAndToInt(byte... bArr) {
        return String.format("%010d", Integer.valueOf(Coder.bytesToInt(Coder.str2Bcd(ReaderUtil.invertString(Coder.bytesToHexString(bArr), 2)))));
    }

    private String hexToInt(ByteArray byteArray, int i) {
        return String.format("%0" + i + PluginDeviceInfo.FICONOFF, Integer.valueOf(Coder.bytesToInt(byteArray.toBytes())));
    }

    private String hexToIntAndInvert(ByteArray byteArray) {
        String str = String.format("%010d", Integer.valueOf(Coder.bytesToInt(byteArray.toBytes())));
        if (Integer.parseInt(str) < 0) {
            return null;
        }
        return ReaderUtil.invertString(str, 2);
    }

    private String hexToUnsignedIntAndInvert(ByteArray byteArray) {
        return ReaderUtil.invertString(String.format("%010d", Long.valueOf(Long.parseLong(byteArray.toString(), 16))), 2);
    }

    private String readCQCardNum() throws UnProcessableCardException, IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(ISmartCardHandler.AID_PSE);
        assertResponse(transceive(selectCommand.toRawAPDU().toBytes()), "failed to select CQCard AID");
        ReadBinaryCommand readBinaryCommand = new ReadBinaryCommand();
        readBinaryCommand.setP1((byte) -123);
        byte[] bArrTransceive = transceive(readBinaryCommand.toRawAPDU().toBytes());
        assertResponse(bArrTransceive, "failed to get card num");
        return Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 12, 8).toBytes());
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public Bundle doHandleCard(Bundle bundle) throws UnProcessableCardException, IOException {
        ArrayList<TradeLog> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        selectVerify();
        Map<String, String> cardNumAndValidDate = getCardNumAndValidDate();
        if (cardNumAndValidDate == null) {
            throw new UnProcessableCardException("CityUCardHandler: unsupported card type");
        }
        otherVerify();
        int balance = getBalance();
        if (!bundle.getBoolean(ISmartCardHandler.KEY_READ_CARD_OPTION_SKIP_RECORD, false)) {
            if (TextUtils.equals(this.mCardId, CardConstants.QINGDAO)) {
                readRecord(arrayList, true);
            } else if (this.mAid != null) {
                readRecord(arrayList, true, (byte) 4, (byte) 0, false);
            } else {
                readRecord(arrayList, false);
            }
        }
        if (TextUtils.equals(this.mCardId, CardConstants.CQTK)) {
            cardNumAndValidDate.put(CardConstants.KEY_ACCOUNT_NUM, readCQCardNum());
        }
        bundle2.putBoolean("success", true);
        bundle2.putInt("card_type", 2);
        bundle2.putString("card_id", getCardType());
        bundle2.putString(CardConstants.KEY_ACCOUNT_NUM, cardNumAndValidDate.get(CardConstants.KEY_ACCOUNT_NUM));
        bundle2.putString(CardConstants.VALID_START, cardNumAndValidDate.get(CardConstants.VALID_START));
        bundle2.putString(CardConstants.VALID_END, cardNumAndValidDate.get(CardConstants.VALID_END));
        bundle2.putInt(CardConstants.E_BALANCE, balance);
        bundle2.putParcelableArrayList(CardConstants.TRADE_LOG, arrayList);
        bundle2.putString(CardConstants.KEY_ACCOUNT_REAL_NUM, cardNumAndValidDate.get(CardConstants.KEY_ACCOUNT_REAL_NUM));
        return bundle2;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public Map<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        String strBytesToHexString;
        String dateString;
        String dateString2;
        String string;
        HashMap map = new HashMap();
        ReadBinaryCommand readBinaryCommand = new ReadBinaryCommand();
        readBinaryCommand.setP1((byte) -107);
        byte[] bArrTransceive = transceive(readBinaryCommand.toRawAPDU().toBytes());
        assertResponse(bArrTransceive, "failed to get card num");
        ByteArray byteArrayWrap = ByteArray.wrap(bArrTransceive, 2, 2);
        if (this.mAid != null && !ByteArray.equals(byteArrayWrap, SHANG_HAI)) {
            throw new UnProcessableCardException(this.mCardId + " isn't supported");
        }
        if (ByteArray.equals(byteArrayWrap, SHANG_HAI)) {
            if (this.mAid == null) {
                this.mCardId = "SPTC";
            }
            string = ByteArray.wrap(bArrTransceive, 12, 8).toString();
            strBytesToHexString = getCardNumByLuhm(ByteArray.wrap(bArrTransceive, 16, 4));
            dateString = getDateString(bArrTransceive, 20, 4);
            dateString2 = getDateString(bArrTransceive, 24, 4);
        } else if (ByteArray.equals(byteArrayWrap, CHONG_QING)) {
            this.mCardId = CardConstants.CQTK;
            dateString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 4, 4).toBytes());
            dateString2 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 8, 4).toBytes());
            string = null;
            strBytesToHexString = null;
        } else {
            ByteArray byteArray = LAN_ZHOU;
            if (ByteArray.equals(byteArrayWrap, byteArray) || ByteArray.equals(byteArrayWrap, GUI_YANG) || ByteArray.equals(byteArrayWrap, NING_BO)) {
                if (ByteArray.equals(byteArrayWrap, byteArray)) {
                    this.mCardId = CardConstants.LANZHOU;
                } else if (ByteArray.equals(byteArrayWrap, GUI_YANG)) {
                    this.mCardId = CardConstants.GUIYANG;
                } else if (ByteArray.equals(byteArrayWrap, NING_BO)) {
                    this.mCardId = CardConstants.NINGBO;
                }
                strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 12, 8).toBytes());
                dateString = getDateString(bArrTransceive, 20, 4);
                dateString2 = getDateString(bArrTransceive, 24, 4);
            } else if (ByteArray.equals(byteArrayWrap, ZHENG_ZHOU)) {
                this.mCardId = CardConstants.ZHENGZHOU;
                strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 14, 6).toBytes());
                dateString = getDateString(bArrTransceive, 20, 4);
                dateString2 = getDateString(bArrTransceive, 24, 4);
            } else {
                ByteArray byteArray2 = XI_AN;
                if (ByteArray.equals(byteArrayWrap, byteArray2) || ByteArray.equals(byteArrayWrap, HA_ER_BIN) || ByteArray.equals(byteArrayWrap, QING_DAO)) {
                    if (ByteArray.equals(byteArrayWrap, byteArray2)) {
                        this.mCardId = CardConstants.XIAN;
                    } else if (ByteArray.equals(byteArrayWrap, HA_ER_BIN)) {
                        this.mCardId = CardConstants.HAERBIN;
                    } else if (ByteArray.equals(byteArrayWrap, QING_DAO)) {
                        this.mCardId = CardConstants.QINGDAO;
                    }
                    strBytesToHexString = hexToInt(ByteArray.wrap(bArrTransceive, 16, 4), 8);
                    dateString = getDateString(bArrTransceive, 20, 4);
                    dateString2 = getDateString(bArrTransceive, 24, 4);
                } else if (ByteArray.equals(byteArrayWrap, KUN_MING)) {
                    this.mCardId = CardConstants.KUNMING;
                    strBytesToHexString = hexInvertAndToInt(ByteArray.wrap(bArrTransceive, 16, 4).toBytes());
                    dateString = getDateString(bArrTransceive, 20, 4);
                    dateString2 = getDateString(bArrTransceive, 24, 4);
                } else if (ByteArray.equals(byteArrayWrap, NAN_CHANG)) {
                    this.mCardId = CardConstants.NANCHANG;
                    strBytesToHexString = hexToInt(ByteArray.wrap(bArrTransceive, 16, 4), 8);
                    dateString2 = null;
                    string = null;
                    dateString = null;
                } else if (ByteArray.equals(byteArrayWrap, ZHOU_SHAN)) {
                    this.mCardId = CardConstants.ZHOUSHAN;
                    strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 10, 10).toBytes());
                    dateString = getDateString(bArrTransceive, 20, 4);
                    dateString2 = getDateString(bArrTransceive, 24, 4);
                } else {
                    this.mCardId = CardConstants.CITYU;
                    dateString2 = null;
                    string = null;
                    strBytesToHexString = null;
                    dateString = null;
                }
            }
            string = null;
        }
        map.put(CardConstants.KEY_ACCOUNT_NUM, strBytesToHexString);
        map.put(CardConstants.VALID_START, dateString);
        map.put(CardConstants.VALID_END, dateString2);
        map.put(CardConstants.KEY_ACCOUNT_REAL_NUM, string);
        return map;
    }

    public String getCardNumByLuhm(ByteArray byteArray) {
        String strHexToUnsignedIntAndInvert = hexToUnsignedIntAndInvert(byteArray);
        if (TextUtils.isEmpty(strHexToUnsignedIntAndInvert)) {
            return null;
        }
        char[] charArray = strHexToUnsignedIntAndInvert.toCharArray();
        int length = charArray.length - 1;
        int i = 0;
        int i2 = 0;
        while (length >= 0) {
            int i3 = Integer.parseInt(charArray[length] + "");
            if (i2 % 2 == 0 && (i3 = i3 * 2) > 9) {
                i3 -= 9;
            }
            i += i3;
            length--;
            i2++;
        }
        return ((10 - (i % 10)) % 10) + strHexToUnsignedIntAndInvert;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return this.mCardId;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public ByteArray getConsumeTag() {
        return TextUtils.equals(this.mCardId, CardConstants.XIAN) ? ByteArray.wrap(new byte[]{6, 9}) : super.getConsumeTag();
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        if (this.mInternalRead) {
            selectCommand.setData(this.mAid);
        } else {
            selectCommand.setData(CITYU_AID);
        }
        byte[] bArrTransceive = transceive(selectCommand.toRawAPDU().toBytes());
        StringBuilder sb = new StringBuilder();
        sb.append("failed to select ");
        sb.append(this.mInternalRead ? this.mAid : "CityU AID");
        assertResponse(bArrTransceive, sb.toString());
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler, com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(IsoDep isoDep) throws UnProcessableCardException, IOException {
        return super.onHandleCard(isoDep);
    }
}
