package com.tsmclient.smartcard.handler;

import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.text.TextUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.apdu.ReadRecordCommand;
import com.tsmclient.smartcard.exception.CardStatusException;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.model.TradeLog;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseTransCardHandler implements ISmartCardHandler<IsoDep> {
    private static final String TAG = "CardHandler";
    private Map<String, String> mCardInfoMap = new HashMap();
    protected boolean mInternalRead;
    protected IsoDep mTech;
    protected IScTerminal mTerminal;

    private void processAllLog(ByteArray byteArray, ArrayList<TradeLog> arrayList, boolean z) {
        int length = byteArray.length() / 23;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bytes = byteArray.duplicate(i, 23).toBytes();
            if (ByteArray.equals(ByteArray.wrap(bytes), ISmartCardHandler.EMPTY_RECORD)) {
                return;
            }
            processPerLog(bytes, arrayList, z);
            i += 23;
        }
    }

    public void assertResponse(byte[] bArr, ByteArray byteArray, String str) throws UnProcessableCardException, IOException {
        if (bArr == null || bArr.length < 2) {
            throw new IOException(str);
        }
        ByteArray byteArrayWrap = ByteArray.wrap(bArr, bArr.length - 2, 2);
        if (ByteArray.equals(byteArray, byteArrayWrap)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("assertPattern expect: ");
        sb.append(byteArray);
        sb.append(", but: ");
        sb.append(byteArrayWrap);
        sb.append(" on ");
        sb.append(getClass().getSimpleName());
        throw new UnProcessableCardException(getClass().getSimpleName() + ": unsupported card type");
    }

    public Bundle doHandleCard(Bundle bundle) throws UnProcessableCardException, IOException {
        int atc;
        int balance;
        ArrayList<TradeLog> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        selectVerify();
        try {
            readCardStatus(this.mCardInfoMap);
            this.mCardInfoMap.putAll(getCardNumAndValidDate());
            atc = getAtc();
            try {
                otherVerify();
                balance = getBalance();
                try {
                    if (!bundle.getBoolean(ISmartCardHandler.KEY_READ_CARD_OPTION_SKIP_RECORD, false)) {
                        readRecord(arrayList, false);
                    }
                } catch (CardStatusException unused) {
                }
            } catch (CardStatusException unused2) {
                balance = -999;
            }
        } catch (CardStatusException unused3) {
            atc = -999;
            balance = -999;
        }
        bundle2.putBoolean("success", true);
        bundle2.putInt("card_type", 2);
        bundle2.putString("card_id", getCardType());
        if (this.mCardInfoMap.get(CardConstants.KEY_ACCOUNT_NUM) != null) {
            bundle2.putString(CardConstants.KEY_ACCOUNT_NUM, this.mCardInfoMap.get(CardConstants.KEY_ACCOUNT_NUM));
        }
        if (this.mCardInfoMap.get(CardConstants.KEY_ACCOUNT_REAL_NUM) != null) {
            bundle2.putString(CardConstants.KEY_ACCOUNT_REAL_NUM, this.mCardInfoMap.get(CardConstants.KEY_ACCOUNT_REAL_NUM));
        }
        if (this.mCardInfoMap.get(CardConstants.VALID_START) != null) {
            bundle2.putString(CardConstants.VALID_START, this.mCardInfoMap.get(CardConstants.VALID_START));
        }
        if (this.mCardInfoMap.get(CardConstants.VALID_END) != null) {
            bundle2.putString(CardConstants.VALID_END, this.mCardInfoMap.get(CardConstants.VALID_END));
        }
        if (atc != -999) {
            bundle2.putInt(CardConstants.ATC, atc);
        }
        bundle2.putInt(CardConstants.E_BALANCE, balance);
        bundle2.putParcelableArrayList(CardConstants.TRADE_LOG, arrayList);
        if (this.mCardInfoMap.containsKey(CardConstants.STATUS_NEGATIVE)) {
            bundle2.putInt(CardConstants.STATUS_NEGATIVE, Integer.valueOf(this.mCardInfoMap.get(CardConstants.STATUS_NEGATIVE)).intValue());
        }
        if (this.mCardInfoMap.containsKey(CardConstants.STATUS_IN_BLACK_LIST)) {
            bundle2.putInt(CardConstants.STATUS_IN_BLACK_LIST, Integer.valueOf(this.mCardInfoMap.get(CardConstants.STATUS_IN_BLACK_LIST)).intValue());
        }
        if (this.mCardInfoMap.containsKey(CardConstants.STATUS_LOCKED)) {
            bundle2.putInt(CardConstants.STATUS_LOCKED, Integer.valueOf(this.mCardInfoMap.get(CardConstants.STATUS_LOCKED)).intValue());
        }
        if (this.mCardInfoMap.containsKey(CardConstants.STATUS_CARD_EXCEPTION)) {
            bundle2.putInt(CardConstants.STATUS_CARD_EXCEPTION, Integer.valueOf(this.mCardInfoMap.get(CardConstants.STATUS_CARD_EXCEPTION)).intValue());
        }
        if (this.mCardInfoMap.containsKey(CardConstants.OVER_DRAWN)) {
            bundle2.putInt(CardConstants.OVER_DRAWN, Integer.valueOf(this.mCardInfoMap.get(CardConstants.OVER_DRAWN)).intValue());
        }
        if (this.mCardInfoMap.containsKey(CardConstants.STATUS_VALID_START_DATE)) {
            bundle2.putBoolean(CardConstants.STATUS_VALID_START_DATE, Boolean.valueOf(this.mCardInfoMap.get(CardConstants.STATUS_VALID_START_DATE)).booleanValue());
        }
        if (this.mCardInfoMap.containsKey(CardConstants.STATUS_VALID_END_DATE)) {
            bundle2.putBoolean(CardConstants.STATUS_VALID_END_DATE, Boolean.valueOf(this.mCardInfoMap.get(CardConstants.STATUS_VALID_END_DATE)).booleanValue());
        }
        if (this.mCardInfoMap.containsKey(CardConstants.AREA_CODE)) {
            bundle2.putString(CardConstants.AREA_CODE, String.valueOf(this.mCardInfoMap.get(CardConstants.AREA_CODE)));
        }
        return bundle2;
    }

    public int getAtc() throws UnProcessableCardException, IOException {
        return CardConstants.RESULT_INVALID;
    }

    public int getBalance() throws UnProcessableCardException, IOException {
        byte[] bArrTransceive = transceive(ISmartCardHandler.GET_BALANCE_CMD.toBytes());
        if (bArrTransceive == null || bArrTransceive.length < 2) {
            throw new IOException("failed to get balance");
        }
        return !ByteArray.equals(ISmartCardHandler.STATUS_OK, ByteArray.wrap(bArrTransceive, bArrTransceive.length - 2, 2)) ? CardConstants.RESULT_INVALID : Coder.bytesToInt(bArrTransceive, 0, 4);
    }

    public abstract Map<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException;

    public abstract String getCardType();

    public ByteArray getConsumeTag() {
        return ByteArray.wrap(new byte[]{10, 17, 9, 6, 5});
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public int getTechType() {
        return 1;
    }

    public void otherVerify() throws UnProcessableCardException, IOException {
    }

    public void processPerLog(byte[] bArr, ArrayList<TradeLog> arrayList, boolean z) {
        int iBytesToInt = Coder.bytesToInt(bArr, 5, 4);
        if (iBytesToInt == Integer.MIN_VALUE) {
            return;
        }
        TradeLog tradeLog = new TradeLog();
        int iBytesToInt2 = Coder.bytesToInt(bArr, 0, 2);
        if (iBytesToInt2 > 0) {
            tradeLog.setTradeID(iBytesToInt2);
        }
        if (getConsumeTag().contains(bArr[9])) {
            tradeLog.setTradeType(1);
        } else {
            tradeLog.setTradeType(2);
        }
        tradeLog.setAuAmount(iBytesToInt);
        String strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArr, 10, 6).toBytes());
        if (!TextUtils.isEmpty(strBytesToHexString)) {
            tradeLog.setTerminalNo(strBytesToHexString);
        }
        int i = z ? 2 : 0;
        tradeLog.setTradeDate(Coder.bytesToHexString(ByteArray.wrap(bArr, i + 16, 4 - i).toBytes()));
        tradeLog.setTradeTime(Coder.bytesToHexString(ByteArray.wrap(bArr, 20, 3).toBytes()));
        arrayList.add(tradeLog);
    }

    public void readCardStatus(Map<String, String> map) throws UnProcessableCardException, CardStatusException, IOException {
    }

    public void readRecord(ArrayList<TradeLog> arrayList, boolean z, byte b2, byte b3, boolean z2) throws IOException {
        ReadRecordCommand readRecordCommand = new ReadRecordCommand();
        int i = 1;
        readRecordCommand.setP1((byte) 1);
        readRecordCommand.setP2((byte) -59);
        byte[] bArrTransceive = transceive(readRecordCommand.toRawAPDU().toBytes());
        if (bArrTransceive != null) {
            if (bArrTransceive.length < 2) {
                throw new IOException("failed to get record");
            }
            if (!ByteArray.equals(ISmartCardHandler.STATUS_ERROR_PARAM, ByteArray.wrap(bArrTransceive, bArrTransceive.length - 2, 2)) && !z) {
                processAllLog(ByteArray.wrap(bArrTransceive, 0, bArrTransceive.length - 2), arrayList, z2);
                return;
            }
            readRecordCommand.setP2(b2);
            readRecordCommand.setSfi(b3);
            readRecordCommand.setP1(Coder.toBytesLow(1));
            byte[] bArrTransceive2 = transceive(readRecordCommand.toRawAPDU().toBytes());
            if (bArrTransceive2 == null || ByteArray.wrap(bArrTransceive2).length() == 2) {
                return;
            }
            while (!ByteArray.equals(ISmartCardHandler.STATUS_RECORD_END, ByteArray.wrap(bArrTransceive2)) && i < 11 && !ByteArray.equals(ISmartCardHandler.EMPTY_RECORD, ByteArray.wrap(bArrTransceive2, 0, bArrTransceive2.length - 2)) && !ByteArray.equals(ISmartCardHandler.EMPTY_RECORD_TWO, ByteArray.wrap(bArrTransceive2, 0, bArrTransceive2.length - 2))) {
                processPerLog(bArrTransceive2, arrayList, z2);
                i++;
                readRecordCommand.setP1(Coder.toBytesLow(i));
                bArrTransceive2 = transceive(readRecordCommand.toRawAPDU().toBytes());
                if (bArrTransceive2 == null) {
                    return;
                }
            }
        }
    }

    public abstract void selectVerify() throws UnProcessableCardException, IOException;

    public byte[] transceive(byte[] bArr) throws IOException {
        if (this.mInternalRead) {
            try {
                return this.mTerminal.transmit(bArr).toBytes();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new IOException("transceive is interrupted");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("send: ");
        sb.append(ByteArray.wrap(bArr));
        byte[] bArrTransceive = this.mTech.transceive(bArr);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("receive: ");
        sb2.append(bArrTransceive == null ? null : ByteArray.wrap(bArrTransceive));
        return bArrTransceive;
    }

    public void updateCardInfo(String str, String str2) {
        this.mCardInfoMap.put(str, str2);
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(IsoDep isoDep) throws UnProcessableCardException, IOException {
        this.mTech = isoDep;
        this.mInternalRead = false;
        return doHandleCard(new Bundle());
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(IScTerminal iScTerminal, Bundle bundle) throws UnProcessableCardException, IOException {
        this.mTerminal = iScTerminal;
        this.mInternalRead = true;
        if (bundle == null) {
            bundle = new Bundle();
        }
        return doHandleCard(bundle);
    }

    public void assertResponse(byte[] bArr, String str) throws UnProcessableCardException, IOException {
        assertResponse(bArr, ISmartCardHandler.STATUS_OK, str);
    }

    public void readRecord(ArrayList<TradeLog> arrayList, boolean z) throws IOException {
        readRecord(arrayList, z, (byte) -60, (byte) 0, false);
    }
}
