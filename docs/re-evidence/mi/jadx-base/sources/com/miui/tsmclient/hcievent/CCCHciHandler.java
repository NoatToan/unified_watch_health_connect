package com.miui.tsmclient.hcievent;

import android.os.Bundle;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.entity.NonTransactionHciEvent;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.model.i;
import com.miui.tsmclient.service.DKFRequestService;
import com.miui.tsmclient.util.CarKeyConstants;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.tlv.ITLVValue;
import com.tsmclient.smartcard.tlv.TLVParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CCCHciHandler implements IHciEventHandler {
    private static final String AUTH0_TRANSACTION_CODE_03 = "03";
    private static final String AUTH0_TRANSACTION_CODE_04 = "04";
    private static final String AUTH0_TRANSACTION_CODE_05 = "05";
    private static final String FUNCTION_CENTRAL_LOCKING = "0001";
    private static final String FUNCTION_LOCK_AND_SECURE = "0002";
    public static final String KEY_VEHICLE_TRIGGERED_LOCK_STATUS = "vehicle_triggered_lock_status";
    private static final String NOTIFY_ENDPOINT_NOT_FOUND_STANDARD = "02";
    private static final String NOTIFY_START_OF_TRANSACTION = "00";
    private static final String NOTIFY_USER_AUTHENTICATION_NOT_PERFORMED = "03";
    private static final String PHASE_3_COMPLETED_P1 = "01";
    private static final String PHASE_3_COMPLETED_P2 = "81";
    private static final String PHASE_4_COMPLETED_P1 = "01";
    private static final String PHASE_4_COMPLETED_P2 = "90";
    private static final int TRANSACTION_CODE_OFFSET = 3;
    private static final byte[] TAG_NOTIFICATION_CONTEXT = {DKFRequestService.o};
    private static final byte[] TAG_NOTIFICATION_CODE = {-127};
    private static final byte[] TAG_KEY_ID = {SettingsModule.VALUE_TYPE_FLAG};
    private static final byte[] TAG_ADDITIONAL_DATA = {-114};
    private static final byte[] TAG_VEHICLE_ID = {77};
    private static final byte[] TAG_VEHICLE_STATUS_CHANGED = {127, 113};
    private static final byte[] TAG_FUNCTION_ID = {-128};
    private static final byte[] TAG_ACTION_ID = {-127};
    private static final byte[] TAG_ACTION_EXECUTION_STATUS = {-126};
    private static List<String> sHciOpTypeList = new ArrayList();

    private int isNeedActivate(ByteArray byteArray) {
        if (byteArray != null && byteArray.length() >= 4) {
            String strBytesToHexString = Coder.bytesToHexString(byteArray.get(0));
            String strBytesToHexString2 = Coder.bytesToHexString(byteArray.get(1));
            if (TextUtils.equals(strBytesToHexString, "01") && TextUtils.equals(strBytesToHexString2, PHASE_4_COMPLETED_P2)) {
                return 1;
            }
            String strBytesToHexString3 = Coder.bytesToHexString(byteArray.get(3));
            if (TextUtils.equals(strBytesToHexString, "01") && (TextUtils.equals(strBytesToHexString3, "03") || TextUtils.equals(strBytesToHexString3, "04") || TextUtils.equals(strBytesToHexString3, AUTH0_TRANSACTION_CODE_05))) {
                return 3;
            }
        }
        return 0;
    }

    private boolean isPhase3Completed(ByteArray byteArray) {
        if (byteArray == null || byteArray.length() < 4) {
            return false;
        }
        return TextUtils.equals(Coder.bytesToHexString(byteArray.get(0)), "01") && TextUtils.equals(Coder.bytesToHexString(byteArray.get(1)), PHASE_3_COMPLETED_P2);
    }

    private HciEventInfo parseContactlessHci(byte[] bArr) {
        try {
            ITLVValue tLVValue = TLVParser.parseTLVValue(ByteArray.wrap(bArr));
            String string = tLVValue.findTLV(ByteArray.wrap(TAG_KEY_ID)).getValue().toBytes().toString();
            ITLVValue value = tLVValue.findTLV(ByteArray.wrap(TAG_VEHICLE_STATUS_CHANGED)).getValue();
            String string2 = value.findTLV(ByteArray.wrap(TAG_FUNCTION_ID)).getValue().toBytes().toString();
            if (!string2.equals(FUNCTION_CENTRAL_LOCKING) && !string2.equals(FUNCTION_LOCK_AND_SECURE)) {
                return null;
            }
            String string3 = value.findTLV(ByteArray.wrap(TAG_ACTION_ID)).getValue().toBytes().toString();
            if (!string3.equals(CarKeyConstants.CCC_ACTION_VEHICLE_TRIGGERED_LOCK) && !string3.equals(CarKeyConstants.CCC_ACTION_VEHICLE_TRIGGERED_UNLOCK)) {
                return null;
            }
            HciEventInfo hciEventInfo = new HciEventInfo(string, HciEventInfo.HciEventType.NonTransaction);
            boolean zEquals = string3.equals(CarKeyConstants.CCC_ACTION_VEHICLE_TRIGGERED_LOCK);
            if ((value.findTLV(ByteArray.wrap(TAG_ACTION_EXECUTION_STATUS)).getValue().toBytes().toBytes()[0] & 255) >= 16) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_VEHICLE_TRIGGERED_LOCK_STATUS, zEquals);
            hciEventInfo.setExtra(bundle);
            return hciEventInfo;
        } catch (InvalidTLVException e) {
            e = e;
            LogUtils.e("parse contactless hci", e);
            return null;
        } catch (TagNotFoundException e2) {
            e = e2;
            LogUtils.e("parse contactless hci", e);
            return null;
        }
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
        String string;
        HciEventInfo hciEventInfo;
        String strBytesToHexString;
        int iIsNeedActivate;
        boolean z = false;
        boolean z2 = bArr2.length > 1 && bArr2[0] == TAG_KEY_ID[0];
        LogUtils.d("CCCHciHandler handleData " + z2);
        if (z2) {
            return parseContactlessHci(bArr2);
        }
        try {
            NonTransactionHciEvent nonTransactionHciEventA = i.b().a(Coder.bytesToHexString(bArr), Coder.bytesToHexString(bArr2));
            if (nonTransactionHciEventA == null) {
                return null;
            }
            NonTransactionHciEvent.Event event = nonTransactionHciEventA.getEvent(Coder.bytesToHexString(bArr2), nonTransactionHciEventA.getEvents());
            if (event == null) {
                LogUtils.e("Data cannot match nonTransactionHciEvent rule");
                return null;
            }
            ITLVValue value = TLVParser.parse(ByteArray.wrap(bArr2)).getValue();
            String string2 = value.findTLV(ByteArray.wrap(TAG_NOTIFICATION_CODE)).getValue().toString();
            if (TextUtils.equals(string2, "00")) {
                sHciOpTypeList.clear();
            }
            sHciOpTypeList.add(string2);
            NonTransactionHciEvent.Event event2 = nonTransactionHciEventA.getEvent(string2, event.getEventList());
            String str = "";
            if (event2 != null) {
                String string3 = value.findTLV(ByteArray.wrap(TAG_NOTIFICATION_CONTEXT)).getValue().findTLV(ByteArray.wrap(TAG_KEY_ID)).getValue().toString();
                ITLVValue value2 = value.findTLV(ByteArray.wrap(TAG_ADDITIONAL_DATA)).getValue();
                if (isPhase3Completed(value2.toBytes())) {
                    HciEventInfo hciEventInfo2 = new HciEventInfo(string3, HciEventInfo.HciEventType.getHciEventType(event2.getType()));
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(Constants.EXTRA_PHASE3_COMPLETED, true);
                    hciEventInfo2.setExtra(bundle);
                    return hciEventInfo2;
                }
                iIsNeedActivate = isNeedActivate(value2.toBytes());
                NonTransactionHciEvent.Event event3 = nonTransactionHciEventA.getEvent(value2.toBytes().toString(), event2.getEventList());
                if (event3 == null) {
                    return null;
                }
                hciEventInfo = new HciEventInfo(string3, HciEventInfo.HciEventType.getHciEventType(event3.getType()));
                hciEventInfo.mTradeTime = j;
                hciEventInfo.setTradeState(event3.isSuccess());
                hciEventInfo.setDescription(event3.getDesc());
                string = null;
                strBytesToHexString = value2.toBytes().length() > 3 ? Coder.bytesToHexString(value2.toBytes().get(3)) : "";
                str = string3;
            } else {
                if (!TextUtils.equals(string2, "03")) {
                    return null;
                }
                string = value.findTLV(ByteArray.wrap(TAG_NOTIFICATION_CONTEXT)).getValue().findTLV(ByteArray.wrap(TAG_VEHICLE_ID)).getValue().toString();
                hciEventInfo = new HciEventInfo("", HciEventInfo.HciEventType.NonTransaction);
                strBytesToHexString = "";
                iIsNeedActivate = 0;
                z = true;
            }
            if (sHciOpTypeList.contains("02")) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(Constants.EXTRA_NEED_AUTH, z);
            bundle2.putInt(Constants.EXTRA_NEED_ACTIVATE, iIsNeedActivate);
            bundle2.putString(Constants.EXTRA_VEHICLE_ID, string);
            bundle2.putString(Constants.EXTRA_CAR_KEY_ID, str);
            bundle2.putString("protocolType", ProductList.ProductInfo.CCC_TYPE);
            bundle2.putString(Constants.EXTRA_TRANSACTION_CODE, strBytesToHexString);
            hciEventInfo.setExtra(bundle2);
            return hciEventInfo;
        } catch (InvalidTLVException e) {
            LogUtils.e("Invalid TLV, ", e);
            return null;
        } catch (TagNotFoundException e2) {
            LogUtils.d("TAG not found, " + e2.getMessage());
            return null;
        }
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        return TextUtils.equals(Constants.CCC_AID, Coder.bytesToHexString(bArr));
    }
}
