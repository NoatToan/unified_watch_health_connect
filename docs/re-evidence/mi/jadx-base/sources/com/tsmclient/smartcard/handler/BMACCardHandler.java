package com.tsmclient.smartcard.handler;

import android.text.TextUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.apdu.ReadBinaryCommand;
import com.tsmclient.smartcard.apdu.SelectCommand;
import com.tsmclient.smartcard.exception.CardStatusException;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.model.TradeLog;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.tsmclient.smartcard.tlv.ITLVObject;
import com.tsmclient.smartcard.tlv.TLVParser;
import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BMACCardHandler extends BaseTransCardHandler {
    private static final String TAG = "BMACCardHandler";
    private static final ByteArray SELECT_DDF_CMD = ByteArray.wrap(new byte[]{0, -92, 0, 0, 2, 16, 1});
    private static final ByteArray BMAC_AID = ByteArray.wrap(new byte[]{-111, 86, 0, 0, 20, 1, 0, 1});
    private static final ByteArray PRE_SELECT_CMD = ByteArray.wrap(new byte[]{0, -92, 0, 0, 2, 63, 0});
    private static final ByteArray READ_OVERDRAW_CMD = ByteArray.wrap(new byte[]{0, -80, -123, 5, 4});
    private static final ByteArray READ_CARD_STATAUS_CMD = ByteArray.wrap(new byte[]{0, -80, -124, 9, 1});
    private static final ByteArray READ_BLACK_LIST_CMD = ByteArray.wrap(new byte[]{0, -80, -123, 0, 1});

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public int getAtc() throws UnProcessableCardException, IOException {
        ReadBinaryCommand readBinaryCommand = new ReadBinaryCommand();
        readBinaryCommand.setP1((byte) -123);
        byte[] bArrTransceive = transceive(readBinaryCommand.toRawAPDU().toBytes());
        assertResponse(bArrTransceive, "failed to get atc");
        return Coder.bytesToInt(bArrTransceive, 3, 2);
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public int getBalance() throws UnProcessableCardException, IOException {
        int balance = super.getBalance();
        assertResponse(transceive(PRE_SELECT_CMD.toBytes()), "select 1PAY.SYS.DDF01 failed.");
        byte[] bArrTransceive = transceive(READ_OVERDRAW_CMD.toBytes());
        assertResponse(bArrTransceive, "failed to read overdraw");
        int iIntValue = 0;
        if (bArrTransceive.length > 4) {
            String strSubstring = Coder.bytesToHexString(bArrTransceive).substring(0, 8);
            if (!TextUtils.equals(strSubstring, "FFFFFFFF")) {
                iIntValue = new BigInteger(strSubstring, 16).intValue();
                updateCardInfo(CardConstants.OVER_DRAWN, String.valueOf(iIntValue));
                if (iIntValue < 0) {
                    return balance;
                }
            }
        }
        return balance - iIntValue;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return "BMAC";
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public ByteArray getConsumeTag() {
        return ByteArray.wrap(new byte[]{6});
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void otherVerify() throws UnProcessableCardException, IOException {
        assertResponse(transceive(SELECT_DDF_CMD.toBytes()), "failed to verify card");
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readCardStatus(Map<String, String> map) throws UnProcessableCardException, CardStatusException, IOException {
        super.readCardStatus(map);
        if (map == null) {
            map = new HashMap<>();
        }
        byte[] bArrTransceive = transceive(READ_CARD_STATAUS_CMD.toBytes());
        assertResponse(bArrTransceive, "read card status failed.");
        map.put(CardConstants.STATUS_NEGATIVE, String.valueOf(Coder.bytesToInt(bArrTransceive, 0, 1) == 2 ? 0 : 1));
        byte[] bArrTransceive2 = transceive(READ_BLACK_LIST_CMD.toBytes());
        assertResponse(bArrTransceive2, "read black list failed.");
        map.put(CardConstants.STATUS_IN_BLACK_LIST, String.valueOf(TextUtils.equals(Coder.bytesToHexString(bArrTransceive2).substring(0, 2), "A5") ? 1 : 0));
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readRecord(ArrayList<TradeLog> arrayList, boolean z) throws IOException {
        try {
            assertResponse(transceive(SELECT_DDF_CMD.toBytes()), "failed to verify card");
            super.readRecord(arrayList, z);
        } catch (UnProcessableCardException unused) {
        }
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        String strBytesToHexString;
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        if (this.mInternalRead) {
            selectCommand.setData(BMAC_AID);
        } else {
            selectCommand.setData(ISmartCardHandler.AID_PSE);
        }
        byte[] bArrTransceive = transceive(selectCommand.toRawAPDU().toBytes());
        assertResponse(bArrTransceive, "failed to select BMAC");
        if (this.mInternalRead) {
            return;
        }
        try {
            ITLVObject iTLVObject = TLVParser.parse(ByteArray.wrap(bArrTransceive).duplicate(0, bArrTransceive.length - 2));
            if (ByteArray.equals(APDUConstants.TAG_FCI_TEMPLATE, iTLVObject.getTag()) && (strBytesToHexString = Coder.bytesToHexString(iTLVObject.getValue().findTLV(APDUConstants.TAG_FCI_2PAY).getValue().toBytes().toBytes())) != null && strBytesToHexString.startsWith(ISmartCardHandler.AID_PSE.toString())) {
                return;
            }
        } catch (InvalidTLVException | TagNotFoundException unused) {
        }
        throw new UnProcessableCardException("BMACCardHandler: unsupported card type");
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public HashMap<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        HashMap<String, String> map = new HashMap<>();
        ReadBinaryCommand readBinaryCommand = new ReadBinaryCommand();
        readBinaryCommand.setP1((byte) -124);
        byte[] bArrTransceive = transceive(readBinaryCommand.toRawAPDU().toBytes());
        assertResponse(bArrTransceive, "failed to get card num");
        String strBytesToHexString = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 0, 8).toBytes());
        String strBytesToHexString2 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 24, 4).toBytes());
        String strBytesToHexString3 = Coder.bytesToHexString(ByteArray.wrap(bArrTransceive, 28, 4).toBytes());
        map.put(CardConstants.KEY_ACCOUNT_NUM, strBytesToHexString);
        map.put(CardConstants.VALID_START, strBytesToHexString2);
        map.put(CardConstants.VALID_END, strBytesToHexString3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Date date = new Date();
        simpleDateFormat.setLenient(false);
        try {
            if (date.before(simpleDateFormat.parse(strBytesToHexString2))) {
                map.put(CardConstants.STATUS_VALID_START_DATE, Boolean.FALSE.toString());
            }
        } catch (ParseException unused) {
            map.put(CardConstants.STATUS_VALID_START_DATE, Boolean.FALSE.toString());
        }
        try {
            if (date.after(simpleDateFormat.parse(strBytesToHexString3))) {
                map.put(CardConstants.STATUS_VALID_END_DATE, Boolean.FALSE.toString());
            }
        } catch (ParseException unused2) {
            map.put(CardConstants.STATUS_VALID_END_DATE, Boolean.FALSE.toString());
        }
        return map;
    }
}
