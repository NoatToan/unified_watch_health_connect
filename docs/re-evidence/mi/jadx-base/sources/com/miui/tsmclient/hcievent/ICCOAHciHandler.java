package com.miui.tsmclient.hcievent;

import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.NonTransactionHciEvent;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.model.i;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.tlv.ITLVObject;
import com.tsmclient.smartcard.tlv.ITLVValue;
import com.tsmclient.smartcard.tlv.TLVParser;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes6.dex */
public class ICCOAHciHandler implements IHciEventHandler {
    private static final String ACTION_VEHICLE_TRIGGERED_LOCK = "02";
    private static final String ACTION_VEHICLE_TRIGGERED_UNLOCK = "00";
    private static final String AID = "F00000004943434F41444B412021";
    private static final String FAST_TRANSACTION = "0002";
    private static final String STANDARD_TRANSACTION = "0001";
    private static final byte[] TAG_KEY_ID = {-119};
    private static final ByteArray TAG_CONTROL_FLOW = ByteArray.wrap(HMProSyncDataBaseProfile.DATA_TYPE_COACHING);
    private static final byte[] TAG_VEHICLE_STATUS_CHANGED = {95, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR};

    private HciEventInfo parseBLETransactionEvent(byte[] bArr) {
        try {
            try {
                ITLVValue tLVValue = TLVParser.parseTLVValue(ByteArray.wrap(bArr));
                String string = tLVValue.findTLV(ByteArray.wrap(TAG_KEY_ID)).getValue().toBytes().toString();
                HciEventInfo hciEventInfo = new HciEventInfo(string, HciEventInfo.HciEventType.NonTransaction);
                try {
                    String string2 = tLVValue.findTLV(TAG_CONTROL_FLOW).getValue().toBytes().toString();
                    if (!TextUtils.equals(string2, STANDARD_TRANSACTION) && !TextUtils.equals(string2, FAST_TRANSACTION)) {
                        return null;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(Constants.EXTRA_NEED_ACTIVATE, 1);
                    bundle.putString(Constants.EXTRA_CAR_KEY_ID, string);
                    bundle.putString("protocolType", ProductList.ProductInfo.ICCOA_TYPE);
                    hciEventInfo.setExtra(bundle);
                    return hciEventInfo;
                } catch (TagNotFoundException unused) {
                    LogUtils.i("parse ble transaction event of iccoa, don't find controlFlow tag");
                    String string3 = tLVValue.findTLV(ByteArray.wrap(TAG_VEHICLE_STATUS_CHANGED)).getValue().toBytes().toString();
                    if (!string3.equals("02")) {
                        if (string3.equals("00")) {
                        }
                        return null;
                    }
                    boolean zEquals = string3.equals("02");
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean(CCCHciHandler.KEY_VEHICLE_TRIGGERED_LOCK_STATUS, zEquals);
                    hciEventInfo.setExtra(bundle2);
                    return hciEventInfo;
                }
            } catch (InvalidTLVException e) {
                e = e;
                LogUtils.e("parse ble transaction event of iccoa", e);
                return null;
            }
        } catch (TagNotFoundException e2) {
            e = e2;
            LogUtils.e("parse ble transaction event of iccoa", e);
            return null;
        }
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
        String str;
        boolean z = false;
        if (bArr2.length > 1 && bArr2[0] == TAG_KEY_ID[0]) {
            z = true;
        }
        LogUtils.d("ICCOAHciHandler handleData " + z);
        if (z) {
            return parseBLETransactionEvent(bArr2);
        }
        NonTransactionHciEvent nonTransactionHciEventA = i.b().a(Coder.bytesToHexString(bArr), Coder.bytesToHexString(bArr2));
        if (nonTransactionHciEventA == null) {
            str = "ICCOAHciHandler nonTransactionHciEvent empty";
        } else {
            NonTransactionHciEvent.Event event = nonTransactionHciEventA.getEvent(Coder.bytesToHexString(bArr2), nonTransactionHciEventA.getEvents());
            if (event != null) {
                try {
                    ITLVObject iTLVObject = TLVParser.parse(ByteArray.wrap(bArr2));
                    String string = iTLVObject.getValue().findTLV(ByteArray.wrap(TAG_KEY_ID)).getValue().toBytes().toString();
                    String string2 = iTLVObject.getValue().findTLV(TAG_CONTROL_FLOW).getValue().toBytes().toString();
                    NonTransactionHciEvent.Event event2 = nonTransactionHciEventA.getEvent(string2, event.getEventList());
                    if (event2 != null) {
                        HciEventInfo hciEventInfo = new HciEventInfo(string, HciEventInfo.HciEventType.getHciEventType(event2.getType()));
                        hciEventInfo.mTradeTime = j;
                        hciEventInfo.setDescription(event2.getDesc());
                        if (TextUtils.equals(string2, STANDARD_TRANSACTION) || TextUtils.equals(string2, FAST_TRANSACTION)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt(Constants.EXTRA_NEED_ACTIVATE, 3);
                            bundle.putString(Constants.EXTRA_CAR_KEY_ID, string);
                            bundle.putString("protocolType", ProductList.ProductInfo.ICCOA_TYPE);
                            hciEventInfo.setExtra(bundle);
                        }
                        return hciEventInfo;
                    }
                } catch (InvalidTLVException e) {
                    e = e;
                    LogUtils.e("ICCOAHciHandler parse data", e);
                } catch (TagNotFoundException e2) {
                    e = e2;
                    LogUtils.e("ICCOAHciHandler parse data", e);
                }
                return null;
            }
            str = "ICCOAHciHandler event empty";
        }
        LogUtils.d(str);
        return null;
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        return TextUtils.equals(Coder.bytesToHexString(bArr), AID);
    }
}
