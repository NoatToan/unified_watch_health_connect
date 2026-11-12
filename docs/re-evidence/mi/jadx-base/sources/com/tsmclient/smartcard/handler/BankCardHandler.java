package com.tsmclient.smartcard.handler;

import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.miui.tsmclient.util.StringUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.apdu.GPOCommand;
import com.tsmclient.smartcard.apdu.GetDataCommand;
import com.tsmclient.smartcard.apdu.ReadRecordCommand;
import com.tsmclient.smartcard.apdu.SelectCommand;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.model.TradeLog;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.tsmclient.smartcard.terminal.CommandApdu;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import com.tsmclient.smartcard.tlv.ITLVObject;
import com.tsmclient.smartcard.tlv.TLVParser;
import com.tsmclient.smartcard.util.LogUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.gv5;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class BankCardHandler implements ISmartCardHandler<IsoDep> {
    public static final String EXTRAS_KEY_PAN_LIST = "extras_key_pan_list";
    private static final String TAG = "BankCardHandler";
    private int mCardScheme;
    public static final ByteArray VISA_AID = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 0, 3});
    public static final ByteArray UNION_PAY_AID = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 3, 51});
    public static final ByteArray VISA_DEBIT = ByteArray.wrap(new byte[]{68, 69, 66, 73, 84});
    public static final ByteArray VISA_CREDIT = ByteArray.wrap(new byte[]{67, 82, 69, 68, 73, 84});
    private static final ByteArray TAG_FCI_DATA_TEMPLATE = ByteArray.wrap(new byte[]{-91});
    private static final ByteArray TAG_AEF_ENTRANCE = ByteArray.wrap(new byte[]{APDUConstants.TAG_MORE_DATA});
    private static final ByteArray TAG_AID = ByteArray.wrap(new byte[]{79});
    private static final ByteArray TAG_APP = ByteArray.wrap(new byte[]{SettingsModule.VALUE_TYPE_FLAG});
    private static final ByteArray TAG_CARD_NUM = ByteArray.wrap(new byte[]{87});
    private static final ByteArray TAG_BANK_CUSTOM_DATA = ByteArray.wrap(new byte[]{-65, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT});
    private static final ByteArray TAG_PDOL = ByteArray.wrap(new byte[]{-97, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA});
    private static final ByteArray TER_TRADE_TYPE = ByteArray.wrap(new byte[]{126, 0, 0, 0});
    private static final ByteArray AU_AMOUNT = ByteArray.wrap(new byte[]{0, 0, 0, 0, 0, 0});
    private static final ByteArray AU_AMOUNT_OTHER = ByteArray.wrap(new byte[]{0, 0, 0, 0, 0, 0});
    private static final ByteArray RANDOM_NUMBER = ByteArray.wrap(new byte[]{1, 2, 3, 4});
    private static final ByteArray CUR_CODE = ByteArray.wrap(new byte[]{1, 86});
    private static final ByteArray TVR = ByteArray.wrap(new byte[]{0, 0, 0, 0, 0});
    private static final ByteArray TRADE_TYPE = ByteArray.wrap(new byte[]{48});
    private static final ByteArray NOT_EXISTS = ByteArray.wrap(new byte[]{106, -126});

    private int getATC(IsoDep isoDep) throws IOException {
        byte[] bArrTransceive;
        GetDataCommand getDataCommand = new GetDataCommand();
        getDataCommand.setP1((byte) -97);
        getDataCommand.setP2(HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG);
        try {
            bArrTransceive = isoDep.transceive(getDataCommand.toRawAPDU().toBytes());
        } catch (IOException unused) {
            bArrTransceive = null;
        }
        if (bArrTransceive != null) {
            return Coder.bytesToInt(bArrTransceive, 3, 2);
        }
        throw new IOException("failed to get ATC");
    }

    private String getCardNumString(byte[] bArr) {
        Boolean bool = Boolean.FALSE;
        try {
            ByteArray bytes = TLVParser.parse(ByteArray.wrap(bArr, 0, bArr.length - 2)).getValue().findTLV(TAG_CARD_NUM).getValue().toBytes();
            int i = 0;
            while (((bytes.get(i) & 240) ^ 208) != 0) {
                int i2 = i + 1;
                if (((bytes.get(i2) & 15) ^ 13) == 0) {
                    i += 2;
                    bool = Boolean.TRUE;
                    break;
                }
                i = i2;
            }
            String string = ByteArray.wrap(bytes.toBytes(), 0, i).toString();
            return bool.booleanValue() ? string.substring(0, string.length() - 1) : string;
        } catch (InvalidTLVException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid res: ");
            sb.append(Coder.bytesToHexString(bArr));
            return null;
        } catch (TagNotFoundException unused2) {
            return null;
        }
    }

    private int getCardType(ByteArray byteArray, ByteArray byteArray2) throws UnProcessableCardException {
        if (byteArray == null || byteArray2 == null) {
            throw new UnProcessableCardException("BankCardHandler: unsupported card type");
        }
        if (!ByteArray.equals(byteArray.duplicate(0, 5), UNION_PAY_AID)) {
            if (!ByteArray.equals(byteArray.duplicate(0, 5), VISA_AID)) {
                throw new UnProcessableCardException("BankCardHandler: unsupported card type");
            }
            this.mCardScheme = 2;
            return byteArray2.toString().contains(VISA_DEBIT.toString()) ? 1 : 2;
        }
        this.mCardScheme = 1;
        byte b2 = byteArray.get(7);
        if (b2 == 2) {
            return 2;
        }
        if (b2 != 3) {
            return b2 != 6 ? 1 : 4;
        }
        return 3;
    }

    private float getEBalance(IsoDep isoDep) throws IOException {
        byte[] bArrTransceive;
        GetDataCommand getDataCommand = new GetDataCommand();
        getDataCommand.setP1((byte) -97);
        getDataCommand.setP2((byte) 121);
        try {
            bArrTransceive = isoDep.transceive(getDataCommand.toRawAPDU().toBytes());
        } catch (IOException unused) {
            bArrTransceive = null;
        }
        byte[] bArr = bArrTransceive;
        if (isStatusOK(bArr)) {
            return getRealMoney(bArr, 3, 5, 8, 1);
        }
        throw new IOException("failed to get balance");
    }

    private float getEBanlanceLimit(IsoDep isoDep) throws IOException {
        byte[] bArrTransceive;
        GetDataCommand getDataCommand = new GetDataCommand();
        getDataCommand.setP1((byte) -97);
        getDataCommand.setP2((byte) 119);
        try {
            bArrTransceive = isoDep.transceive(getDataCommand.toRawAPDU().toBytes());
        } catch (IOException unused) {
            bArrTransceive = null;
        }
        byte[] bArr = bArrTransceive;
        if (isStatusOK(bArr)) {
            return getRealMoney(bArr, 3, 5, 8, 1);
        }
        throw new IOException("failed to get EBanlanceLimit");
    }

    private float getEPerLimit(IsoDep isoDep) throws IOException {
        byte[] bArrTransceive;
        GetDataCommand getDataCommand = new GetDataCommand();
        getDataCommand.setP1((byte) -97);
        getDataCommand.setP2((byte) 120);
        try {
            bArrTransceive = isoDep.transceive(getDataCommand.toRawAPDU().toBytes());
        } catch (IOException unused) {
            bArrTransceive = null;
        }
        byte[] bArr = bArrTransceive;
        if (isStatusOK(bArr)) {
            return getRealMoney(bArr, 3, 5, 8, 1);
        }
        throw new IOException("failed to get EPerLimit");
    }

    private byte[] getEntranceOfTrade(byte[] bArr) {
        int i = 0;
        while (i < bArr.length - 1) {
            if (bArr[i] == -97 && bArr[i + 1] == 77) {
                i += 3;
                break;
            }
            i++;
        }
        if (i == bArr.length - 1) {
            return new byte[]{11, 10};
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put(bArr[i]).put(bArr[i + 1]);
        return byteBufferAllocate.array();
    }

    private ByteArray getGPOInputData(ByteArray byteArray) {
        char c;
        char c2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            c = 'f';
            c2 = '7';
            if (i2 >= byteArray.length()) {
                break;
            }
            if ((byteArray.get(i2) & 31) == 31) {
                int i4 = byteArray.get(i2 + 1) & 255;
                if (i4 == 2 || i4 == 3) {
                    i3 += 6;
                } else {
                    if (i4 != 26) {
                        if (i4 == 33) {
                            i3 += 3;
                        } else if (i4 != 42) {
                            if (i4 == 55 || i4 == 102) {
                                i3 += 4;
                            }
                        }
                    }
                    i3 += 2;
                }
                i2 += 3;
            }
            int i5 = byteArray.get(i2) & 255;
            if (i5 == 149) {
                i3 += 5;
            } else if (i5 == 154) {
                i3 += 3;
            } else {
                if (i5 != 156) {
                    break;
                }
                i3++;
            }
            i2 += 2;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i3 + 2);
        byteBufferAllocate.put((byte) -125).put(Coder.toBytesLow(i3));
        while (i < byteArray.length()) {
            if ((byteArray.get(i) & 31) == 31) {
                int i6 = byteArray.get(i + 1) & 255;
                if (i6 == 2) {
                    byteBufferAllocate.put(AU_AMOUNT.toBytes());
                } else if (i6 == 3) {
                    byteBufferAllocate.put(AU_AMOUNT_OTHER.toBytes());
                } else if (i6 == 26) {
                    byteBufferAllocate.put(CUR_CODE.toBytes());
                } else if (i6 != 33) {
                    if (i6 == 42) {
                        byteBufferAllocate.put(CUR_CODE.toBytes());
                    } else if (i6 == c2) {
                        byteBufferAllocate.put(RANDOM_NUMBER.toBytes());
                    } else if (i6 == c) {
                        byteBufferAllocate.put(TER_TRADE_TYPE.toBytes());
                    }
                    i += 3;
                } else {
                    byteBufferAllocate.put(Coder.str2Bcd(new SimpleDateFormat(StringUtils.SOURCE_TIME_FORMAT, Locale.getDefault()).format(new Date())));
                }
                i += 3;
                c = 'f';
                c2 = '7';
            }
            int i7 = byteArray.get(i) & 255;
            if (i7 == 149) {
                byteBufferAllocate.put(TVR.toBytes());
            } else if (i7 == 154) {
                byteBufferAllocate.put(Coder.str2Bcd(new SimpleDateFormat("yyMMdd", Locale.getDefault()).format(new Date())));
            } else {
                if (i7 != 156) {
                    break;
                }
                byteBufferAllocate.put(TRADE_TYPE.toBytes());
            }
            i += 2;
            c = 'f';
            c2 = '7';
        }
        return ByteArray.wrap(byteBufferAllocate.array());
    }

    private float getRealMoney(byte[] bArr, int i, int i2, int i3, int i4) {
        return Integer.parseInt(Coder.bytesToHexString(ByteArray.wrap(bArr).duplicate(i, i2).toBytes())) + (Float.parseFloat(Coder.bytesToHexString(ByteArray.wrap(bArr).duplicate(i3, i4).toBytes())) / 100.0f);
    }

    private void getTradeLog(IsoDep isoDep, byte[] bArr, byte[] bArr2, ArrayList<TradeLog> arrayList) throws IOException {
        byte[] bArrTransceive;
        byte bytesLow = Coder.toBytesLow((bArr[0] << 3) + 4);
        ReadRecordCommand readRecordCommand = new ReadRecordCommand();
        readRecordCommand.setP2(bytesLow);
        int i = 0;
        while (i < Coder.bytesToInt(bArr[1])) {
            i++;
            readRecordCommand.setP1(Coder.toBytesLow(i));
            try {
                bArrTransceive = isoDep.transceive(readRecordCommand.toRawAPDU().toBytes());
            } catch (IOException unused) {
                bArrTransceive = null;
            }
            if (bArrTransceive == null) {
                throw new IOException("failed to get per trade log");
            }
            if (bArrTransceive[0] == 106) {
                return;
            } else {
                arrayList.add(translateLog(bArrTransceive, bArr2));
            }
        }
    }

    private byte[] getTradeLogFormat(IsoDep isoDep) throws IOException {
        byte[] bArrTransceive;
        GetDataCommand getDataCommand = new GetDataCommand();
        getDataCommand.setP1((byte) -97);
        getDataCommand.setP2((byte) 79);
        try {
            bArrTransceive = isoDep.transceive(getDataCommand.toRawAPDU().toBytes());
        } catch (IOException unused) {
            bArrTransceive = null;
        }
        if (bArrTransceive != null) {
            return bArrTransceive;
        }
        throw new IOException("failed to get TradeLogFormat");
    }

    private boolean isStatusOK(byte[] bArr) {
        if (bArr != null && bArr.length >= 2) {
            ByteArray byteArrayDuplicate = ByteArray.wrap(bArr).duplicate(bArr.length - 2, 2);
            LogUtils.d("getEBalance res:", Coder.bytesToHexString(bArr) + " response:" + byteArrayDuplicate);
            if (ByteArray.equals(ISmartCardHandler.STATUS_OK, byteArrayDuplicate)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0152  */
    private TradeLog translateLog(byte[] bArr, byte[] bArr2) {
        TradeLog tradeLog = new TradeLog();
        int i = 0;
        int i2 = 3;
        String str = null;
        while (i2 < bArr2.length) {
            byte b2 = bArr2[i2];
            if (b2 == -102) {
                i2 += 2;
                StringBuilder sb = new StringBuilder();
                sb.append(UserConfig.KEY_CAMERA_LIST_SORT_ORDER);
                sb.append(Coder.bytesToHexString(bArr[i]));
                int i3 = i + 2;
                sb.append(Coder.bytesToHexString(bArr[i + 1]));
                i += 3;
                sb.append(Coder.bytesToHexString(bArr[i3]));
                tradeLog.setTradeDate(sb.toString());
            } else {
                int i4 = 2;
                if (b2 == -97) {
                    byte b3 = bArr2[i2 + 1];
                    if (b3 == 33) {
                        i2 += 3;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(Coder.bytesToHexString(bArr[i]));
                        int i5 = i + 2;
                        sb2.append(Coder.bytesToHexString(bArr[i + 1]));
                        i += 3;
                        sb2.append(Coder.bytesToHexString(bArr[i5]));
                        tradeLog.setTradeTime(sb2.toString());
                    } else if (b3 == 2) {
                        tradeLog.setAuAmount(getRealMoney(bArr, i, 5, i + 5, 1));
                        i += 6;
                        i2 += 3;
                    } else if (b3 == 3) {
                        i2 += 3;
                        i += 6;
                    } else {
                        if (b3 == 26) {
                            i2 += 3;
                            tradeLog.setCountryCode(" ");
                        } else if (b3 == 78) {
                            i2 += 3;
                            if (ByteArray.wrap(bArr).duplicate(i, 20).toString().matches("0*")) {
                                tradeLog.setBusinessName(null);
                            } else {
                                try {
                                    str = new String(ByteArray.wrap(bArr).duplicate(i, 20).toBytes(), "GBK");
                                } catch (UnsupportedEncodingException unused) {
                                }
                                tradeLog.setBusinessName(str);
                            }
                            i += 20;
                        } else if (b3 == 54) {
                            i2 += 3;
                        } else {
                            if (b3 == 39) {
                                i2 += 3;
                            }
                            i++;
                        }
                        i += 2;
                    }
                }
                if (b2 != 95 || bArr2[i2 + 1] != 42) {
                    if (b2 != -100) {
                        break;
                    }
                    i2 += 2;
                    byte b4 = bArr[i];
                    if (b4 == 0) {
                        i4 = 1;
                    } else if (b4 == 1) {
                        i4 = 6;
                    } else if (b4 == 33) {
                        i4 = 3;
                    } else if (b4 == 48) {
                        i4 = 4;
                    } else if (b4 == 96) {
                        i4 = 5;
                    } else if (b4 != 99) {
                        i4 = 4;
                    }
                    tradeLog.setTradeType(i4);
                    i++;
                } else {
                    i2 += 3;
                    ByteArray byteArrayDuplicate = ByteArray.wrap(bArr).duplicate(i, 2);
                    if (CardConstants.sCurrencyCodeMap.containsKey(byteArrayDuplicate.toString())) {
                        tradeLog.setCurCode(CardConstants.sCurrencyCodeMap.get(byteArrayDuplicate.toString()).intValue());
                    }
                    i += 2;
                }
            }
        }
        return tradeLog;
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public int getTechType() {
        return 1;
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(IsoDep isoDep) throws UnProcessableCardException, IOException {
        ByteArray bytes;
        ByteArray bytes2;
        ByteArray bytes3;
        ArrayList<TradeLog> arrayList = new ArrayList<>();
        Bundle bundle = new Bundle();
        isoDep.transceive(ByteArray.wrap(new byte[]{0, -78, 1, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 0}).toBytes());
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(ISmartCardHandler.AID_PPSE);
        byte[] bArrTransceive = isoDep.transceive(selectCommand.toRawAPDU().toBytes());
        if (bArrTransceive == null || bArrTransceive.length < 2) {
            throw new IOException("failed to select PPSE");
        }
        if (ByteArray.equals(NOT_EXISTS, ByteArray.wrap(bArrTransceive))) {
            throw new UnProcessableCardException("BankCardHandler: unsupported card type");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ppse = ");
        sb.append(Coder.bytesToHexString(bArrTransceive));
        String cardNumString = null;
        try {
            bytes = TLVParser.parse(ByteArray.wrap(bArrTransceive, 0, bArrTransceive.length - 2)).getValue().findTLV(TAG_FCI_DATA_TEMPLATE).getValue().findTLV(TAG_BANK_CUSTOM_DATA).getValue().findTLV(TAG_AEF_ENTRANCE).getValue().findTLV(TAG_AID).getValue().toBytes();
        } catch (InvalidTLVException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("invalid res: ");
            sb2.append(Coder.bytesToHexString(bArrTransceive));
            bytes = null;
        } catch (TagNotFoundException unused2) {
            throw new UnProcessableCardException("BankCardHandler: unsupported card type");
        }
        if (bytes == null) {
            throw new UnProcessableCardException("failed to get aid or appBytes");
        }
        selectCommand.setData(bytes);
        byte[] bArrTransceive2 = isoDep.transceive(selectCommand.toRawAPDU().toBytes());
        if (bArrTransceive2 == null || bArrTransceive2.length < 2) {
            throw new IOException("failed to select qPBOC");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Qppse = ");
        sb3.append(Coder.bytesToHexString(bArrTransceive2));
        byte[] entranceOfTrade = getEntranceOfTrade(bArrTransceive2);
        try {
            ITLVObject iTLVObjectFindTLV = TLVParser.parse(ByteArray.wrap(bArrTransceive2, 0, bArrTransceive2.length - 2)).getValue().findTLV(TAG_FCI_DATA_TEMPLATE);
            bytes2 = iTLVObjectFindTLV.getValue().findTLV(TAG_APP).getValue().toBytes();
            try {
                bytes3 = iTLVObjectFindTLV.getValue().findTLV(TAG_PDOL).getValue().toBytes();
            } catch (InvalidTLVException unused3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Invalid res: ");
                sb4.append(Coder.bytesToHexString(bArrTransceive2));
                bytes3 = null;
            } catch (TagNotFoundException unused4) {
                bytes3 = null;
            }
        } catch (InvalidTLVException unused5) {
            bytes2 = null;
        } catch (TagNotFoundException unused6) {
            bytes2 = null;
        }
        if (bytes3 == null) {
            throw new UnProcessableCardException("failed to get pdol");
        }
        int cardType = getCardType(bytes, bytes2);
        ByteArray gPOInputData = getGPOInputData(bytes3);
        GPOCommand gPOCommand = new GPOCommand();
        gPOCommand.setData(gPOInputData);
        byte[] bArrTransceive3 = isoDep.transceive(gPOCommand.toRawAPDU().toBytes());
        if (bArrTransceive3 == null || bArrTransceive3.length < 2) {
            throw new IOException("failed to get AFL");
        }
        ReadRecordCommand readRecordCommand = new ReadRecordCommand();
        for (byte b2 = 1; b2 <= 10; b2 = (byte) (b2 + 1)) {
            readRecordCommand.setP1(b2);
            readRecordCommand.setP2(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT);
            byte[] bArrTransceive4 = isoDep.transceive(readRecordCommand.toRawAPDU().toBytes());
            if (bArrTransceive4 == null || bArrTransceive4.length < 2) {
                throw new IOException("failed to read card number");
            }
            cardNumString = getCardNumString(bArrTransceive4);
            if (!TextUtils.isEmpty(cardNumString)) {
                break;
            }
        }
        if (TextUtils.isEmpty(cardNumString)) {
            throw new UnProcessableCardException("failed to get cardNum string");
        }
        getTradeLog(isoDep, entranceOfTrade, getTradeLogFormat(isoDep), arrayList);
        int atc = getATC(isoDep);
        bundle.putBoolean("success", true);
        bundle.putInt("card_type", 1);
        bundle.putInt(CardConstants.CARD_SCHEME, this.mCardScheme);
        bundle.putInt("bank_card_type", cardType);
        bundle.putString(CardConstants.KEY_ACCOUNT_NUM, cardNumString);
        bundle.putInt(CardConstants.ATC, atc);
        bundle.putParcelableArrayList(CardConstants.TRADE_LOG, arrayList);
        try {
            float eBalance = getEBalance(isoDep);
            float ePerLimit = getEPerLimit(isoDep);
            float eBanlanceLimit = getEBanlanceLimit(isoDep);
            bundle.putFloat(CardConstants.E_BALANCE, eBalance);
            bundle.putFloat(CardConstants.E_PER_LIMIT, ePerLimit);
            bundle.putFloat(CardConstants.E_BALANCE_LIMIT, eBanlanceLimit);
        } catch (IOException e) {
            LogUtils.e(TAG, "failed to get balance ", e);
        }
        return bundle;
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(IScTerminal iScTerminal, Bundle bundle) throws UnProcessableCardException, IOException {
        Bundle bundle2 = new Bundle();
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            if (ByteArray.equals(iScTerminal.transmit(APDUConstants.SELECT_CRS).getStatus(), ScResponse.STATUS_OK)) {
                byte[] bArr = APDUConstants.PBOC_CARD_AID_PREFFIX;
                byte[] bArr2 = new byte[bArr.length + 7];
                bArr2[0] = 79;
                bArr2[1] = (byte) (bArr.length & 255);
                System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
                CommandApdu commandApdu = APDUConstants.COMM_TAG_GET_STATUS;
                System.arraycopy(commandApdu.toBytes(), 0, bArr2, bArr.length + 2, commandApdu.toBytes().length);
                CommandApdu commandApduM212clone = APDUConstants.COMM_PREFIX_GET_STATUS.m212clone();
                commandApduM212clone.setData(bArr2);
                ScResponse scResponseTransmit = iScTerminal.transmit(commandApduM212clone.toBytes());
                if (ByteArray.equals(scResponseTransmit.getStatus(), ScResponse.STATUS_REFERENCE_NOT_FOUND)) {
                    return null;
                }
                while (true) {
                    if (!ByteArray.equals(scResponseTransmit.getStatus(), ScResponse.STATUS_MORE_DATA_AVAILABLE) && !ByteArray.equals(scResponseTransmit.getStatus(), ScResponse.STATUS_OK)) {
                        break;
                    }
                    if (commandApduM212clone.getP2() != 1) {
                        commandApduM212clone.setP2(1);
                    }
                    List<ITLVObject> listFindTLVList = TLVParser.parseTLVValue(scResponseTransmit.getData()).findTLVList(TAG_AEF_ENTRANCE);
                    SelectCommand selectCommand = new SelectCommand();
                    selectCommand.setP1((byte) 4);
                    Iterator<ITLVObject> it = listFindTLVList.iterator();
                    while (it.hasNext()) {
                        ByteArray bytes = it.next().getValue().findTLV(TAG_AID).getValue().toBytes();
                        selectCommand.setData(bytes);
                        ScResponse scResponseTransmit2 = iScTerminal.transmit(selectCommand.toRawAPDU().toBytes());
                        if (ByteArray.equals(scResponseTransmit2.getStatus(), ScResponse.STATUS_OK)) {
                            ReadRecordCommand readRecordCommand = new ReadRecordCommand();
                            readRecordCommand.setP1((byte) 1);
                            readRecordCommand.setP2(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT);
                            scResponseTransmit2 = iScTerminal.transmit(readRecordCommand.toRawAPDU().toBytes());
                            String cardNumString = getCardNumString(scResponseTransmit2.toBytes());
                            if (!TextUtils.isEmpty(cardNumString)) {
                                arrayList.add(bytes.toString() + gv5.CONNECT_STR + cardNumString);
                            }
                        }
                        scResponseTransmit = scResponseTransmit2;
                    }
                }
                bundle2.putStringArrayList(EXTRAS_KEY_PAN_LIST, arrayList);
                return bundle2;
            }
            throw new IOException("failed to select CRS");
        } catch (InvalidTLVException | TagNotFoundException unused) {
        } catch (InterruptedException unused2) {
            throw new IOException("onHandleCard is interrupted");
        }
    }
}
