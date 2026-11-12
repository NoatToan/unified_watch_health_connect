package com.miui.tsmclient.entity;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CardInfoFactory {
    public static CardInfo makeCardInfo(String str, JSONObject jSONObject) {
        ObjectParser iCCOACarKeyCardInfo;
        if (str == null) {
            return null;
        }
        if (CardInfo.SPTC_TYPE_SET.contains(str)) {
            iCCOACarKeyCardInfo = new SptcCardInfo(str);
        } else if (TextUtils.equals(str, CardInfo.CARD_TYPE_BANKCARD)) {
            iCCOACarKeyCardInfo = new BankCardInfo();
        } else if (TextUtils.equals(str, CardInfo.CARD_TYPE_QRBANKCARD)) {
            iCCOACarKeyCardInfo = new QrBankCardInfo();
        } else if (TextUtils.equals(str, CardInfo.CARD_TYPE_MIFARE)) {
            iCCOACarKeyCardInfo = new MifareCardInfo();
        } else if (TextUtils.equals(str, CardInfo.CARD_TYPE_EID)) {
            iCCOACarKeyCardInfo = new EidCardInfo();
        } else if (TextUtils.equals(str, "DCEPCARD")) {
            iCCOACarKeyCardInfo = new DCEPCardInfo();
        } else if (TextUtils.equals(str, CardInfo.CARD_TYPE_DIGITAL_KEY)) {
            iCCOACarKeyCardInfo = new CarKeyCardInfo();
        } else if (TextUtils.equals(str, CardInfo.CARD_TYPE_TRADITIONALCARKEYCARD)) {
            iCCOACarKeyCardInfo = new ProprietaryCarKeyCardInfo();
        } else if (TextUtils.equals(str, CardInfo.CARD_TYPE_BLE_CAR)) {
            iCCOACarKeyCardInfo = new BLECarKeyInfo();
        } else {
            iCCOACarKeyCardInfo = TextUtils.equals(str, CardInfo.CARD_TYPE_ICCOA_DIGITAL_KEY) ? new ICCOACarKeyCardInfo() : new PayableCardInfo(str);
        }
        return (CardInfo) iCCOACarKeyCardInfo.parse(jSONObject);
    }
}
