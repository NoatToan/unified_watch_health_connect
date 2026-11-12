package com.xiaomi.fitness.nfc.sdk;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.miui.tsmclient.util.IDeviceInfo;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import defpackage.ssg;
import defpackage.vqg;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DeviceInfoImpl implements IDeviceInfo {
    private static int deviceType;
    private static String firmwareVersion;
    private static String mDeviceId;
    private static String mDeviceModel;

    public static void clear() {
        vqg.d("DeviceInfoImpl clear");
        mDeviceId = null;
        mDeviceModel = null;
        deviceType = 0;
    }

    public static boolean init(WearableDeviceModel wearableDeviceModel) {
        mDeviceModel = wearableDeviceModel.getAlias();
        vqg.d("DeviceInfoImpl: mDeviceModel" + mDeviceModel);
        String strPickupDid = pickupDid(wearableDeviceModel);
        vqg.d("mDeviceId:" + mDeviceId + "  newDid:" + strPickupDid);
        String str = mDeviceId;
        if (str != null && str.equals(strPickupDid)) {
            vqg.d("mDeviceId:" + mDeviceId + "  newDid:" + strPickupDid);
            return true;
        }
        mDeviceId = strPickupDid;
        deviceType = DeviceModelExtKt.isBandType(wearableDeviceModel) ? 4 : 3;
        firmwareVersion = wearableDeviceModel.getDeviceInfo().getFirmwareVersion();
        vqg.d("DeviceInfoImpl mDeviceId:" + mDeviceId + " firmwareVersion:" + firmwareVersion + " mDeviceModel" + mDeviceModel);
        return false;
    }

    private static String pickupDid(WearableDeviceModel wearableDeviceModel) {
        String sn = ("baiji".equalsIgnoreCase(mDeviceModel) || "houyi".equalsIgnoreCase(mDeviceModel)) ? null : wearableDeviceModel.getDeviceInfo().getSn();
        vqg.d("SN = " + sn);
        return TextUtils.isEmpty(sn) ? wearableDeviceModel.getDeviceInfo().getDid() : sn;
    }

    @Override // com.miui.tsmclient.util.IDeviceInfo
    public String getDeviceFirmwareVersion() {
        vqg.a("firmwareVersion:" + firmwareVersion);
        return firmwareVersion;
    }

    @Override // com.miui.tsmclient.util.IDeviceInfo
    public String getDeviceId(Context context) {
        if (TextUtils.isEmpty(mDeviceId)) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                return wearableDeviceModel != null ? wearableDeviceModel.getDeviceInfo().getDid() : "";
            }
            try {
                NfcResponse nfcResponseC = ssg.u().c(210, null);
                if (nfcResponseC.isSuccess()) {
                    mDeviceId = new String(nfcResponseC.mData, StandardCharsets.UTF_8);
                }
            } catch (Exception e) {
                vqg.c("getDeviceId error occurred", e);
            }
            vqg.a("getDeviceId:" + mDeviceId);
        }
        vqg.d("getDeviceId:" + mDeviceId);
        return mDeviceId;
    }

    @Override // com.miui.tsmclient.util.IDeviceInfo
    public String getDeviceModel() {
        if (TextUtils.isEmpty(mDeviceModel)) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                return wearableDeviceModel != null ? wearableDeviceModel.getDeviceInfo().getProduct().getAlias() : "";
            }
            try {
                NfcResponse nfcResponseC = ssg.u().c(209, null);
                if (nfcResponseC.isSuccess()) {
                    mDeviceModel = new String(nfcResponseC.mData, StandardCharsets.UTF_8);
                }
            } catch (Exception e) {
                vqg.c("getDeviceModel error occurred", e);
            }
            vqg.a("getDeviceModel:" + mDeviceModel);
        }
        vqg.d("getDeviceModel:" + mDeviceModel);
        return mDeviceModel;
    }

    @Override // com.miui.tsmclient.util.IDeviceInfo
    public int getDeviceType() {
        vqg.a("getDeviceType:" + deviceType);
        return deviceType;
    }

    @Override // com.miui.tsmclient.util.IDeviceInfo
    public List<String> getSIMNumber() {
        return Collections.emptyList();
    }

    @Override // com.miui.tsmclient.util.IDeviceInfo
    public boolean isEseEnabled(Context context) {
        return true;
    }
}
