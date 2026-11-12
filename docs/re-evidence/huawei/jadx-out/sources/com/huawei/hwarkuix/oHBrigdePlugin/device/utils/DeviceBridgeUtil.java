package com.huawei.hwarkuix.oHBrigdePlugin.device.utils;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwarkuix.oHBrigdePlugin.device.bean.DeviceImpl;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import defpackage.dsa;
import defpackage.dxw;
import defpackage.eej;
import defpackage.mec;
import defpackage.mgz;
import defpackage.njy;
import defpackage.peh;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes37.dex */
public class DeviceBridgeUtil {
    private static final int APP_LAYER_PROTOCOL_TLV = 0;
    private static final int APP_LAYER_PROTOCOL_WSP = 1;
    private static final int INVALID = 255;
    public static final int LINK_LAYER_PROTOCOL_HIDEVICE = 1;
    public static final int LINK_LAYER_PROTOCOL_WEARABLE = 0;
    private static final String TAG = "DeviceInfoFormatUtil";

    public static ArrayList<DeviceImpl> changerDeviceImpl(List<DeviceInfo> list, ArrayList<ContentValues> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!njy.e(list)) {
            Iterator<DeviceInfo> it = list.iterator();
            while (it.hasNext()) {
                DeviceImpl deviceImplConvertToImpl = convertToImpl(it.next());
                if (deviceImplConvertToImpl.getConnectState() == 2) {
                    arrayList2.add(deviceImplConvertToImpl);
                } else {
                    arrayList3.add(deviceImplConvertToImpl);
                }
            }
        }
        if (!njy.e(arrayList)) {
            Iterator<ContentValues> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(convertToImpl(it2.next()));
            }
        }
        arrayList2.sort(new Comparator() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.DeviceBridgeUtil$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((DeviceImpl) obj2).getLastConnectedTime(), ((DeviceImpl) obj).getLastConnectedTime());
            }
        });
        arrayList3.sort(new Comparator() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.DeviceBridgeUtil$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((DeviceImpl) obj2).getLastConnectedTime(), ((DeviceImpl) obj).getLastConnectedTime());
            }
        });
        ArrayList<DeviceImpl> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    public static JSONArray formatJson(ArrayList<DeviceImpl> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.a(TAG, "allImplList is empty");
            return null;
        }
        LogUtil.a(TAG, "allImplList size  is ", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String strC = peh.c(arrayList.get(i));
            LogUtil.a(TAG, "allImplList i=", Integer.valueOf(i), " json:", strC);
            try {
                arrayList2.add(new JSONObject(strC));
            } catch (JSONException unused) {
                LogUtil.j(TAG, "formatJson new JSONObject");
            }
        }
        return new JSONArray((Collection) arrayList2);
    }

    private static DeviceImpl convertToImpl(DeviceInfo deviceInfo) {
        DeviceImpl deviceImpl = new DeviceImpl();
        deviceImpl.setDeviceId(deviceInfo.getDeviceIdentify());
        deviceImpl.setName(deviceInfo.getDeviceName());
        deviceImpl.setBtType(getDeviceBluetoothType(deviceInfo));
        deviceImpl.setInterfaceName(deviceInfo.getDeviceName());
        deviceImpl.setAppLayerProtocol(0);
        deviceImpl.setConnectState(deviceInfo.getDeviceConnectState());
        deviceImpl.setLastConnectedTime(deviceInfo.getLastConnectedTime());
        deviceImpl.setLinkLayerProtocol(0);
        deviceImpl.setDeviceModel(deviceInfo.getDeviceModel());
        deviceImpl.setDeviceSoftVersion(deviceInfo.getSoftVersion());
        deviceImpl.setCertModel(deviceInfo.getCertModel());
        deviceImpl.setSportVersion(deviceInfo.getSportVersion());
        deviceImpl.setDeviceSn(deviceInfo.getUuid());
        deviceImpl.setPowerSaveMode(deviceInfo.getPowerSaveModel());
        deviceImpl.setBtVersion(CommonUtil.n(BaseApplication.getContext(), deviceInfo.getBluetoothVersion()));
        deviceImpl.setDeviceType(deviceInfo.getProductType());
        deviceImpl.setDeviceVersion(deviceInfo.getDeviceVersion());
        deviceImpl.setBtMac(deviceInfo.getDeviceIdentify());
        deviceImpl.setPowerSaveModel(deviceInfo.getPowerSaveModel());
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (TextUtils.isEmpty(hiLinkDeviceId)) {
            mec mecVarA = new mgz().a(deviceInfo);
            LogUtil.a(TAG, "convertToImpl deviceModeInfo:", mecVarA);
            if (mecVarA != null) {
                hiLinkDeviceId = mecVarA.e();
                if (TextUtils.isEmpty(deviceInfo.getDeviceModel())) {
                    deviceImpl.setDeviceModel(mecVarA.d());
                }
            }
        }
        if (TextUtils.isEmpty(hiLinkDeviceId)) {
            String certModel = deviceInfo.getCertModel();
            LogUtil.a(TAG, "convertToImpl hiLinkDeviceId isEmpty, certModel:", certModel);
            if (!TextUtils.isEmpty(certModel)) {
                List<ProductMapInfo> listC = ProductMap.c("modelName", certModel);
                if (!njy.e(listC)) {
                    hiLinkDeviceId = listC.get(0).g();
                }
            }
        }
        deviceImpl.setProdId(hiLinkDeviceId);
        deviceImpl.setDeviceBtModel(deviceInfo.getManufacture());
        deviceImpl.setSupportVersion(deviceInfo.getSportVersion());
        deviceImpl.setDeviceIdToServerType(deviceInfo.getDeviceIdType());
        deviceImpl.setEmuiVersion(deviceInfo.getEmuiVersion());
        deviceImpl.setSmartMeterVersion(getSmartMetterVersion(deviceInfo));
        deviceImpl.setDeviceSubModelId(deviceInfo.getDeviceSubModelId());
        deviceImpl.setDeviceFactoryReset(deviceInfo.getDeviceFactoryReset());
        return deviceImpl;
    }

    private static DeviceImpl convertToImpl(ContentValues contentValues) {
        String strG;
        DeviceImpl deviceImpl = new DeviceImpl();
        deviceImpl.setDeviceId(contentValues.getAsString("uniqueId"));
        deviceImpl.setName(contentValues.getAsString("name"));
        deviceImpl.setBtType(1);
        deviceImpl.setInterfaceName(contentValues.getAsString("name"));
        deviceImpl.setAppLayerProtocol(1);
        deviceImpl.setConnectState(3);
        deviceImpl.setLastConnectedTime(getBondedDeviceLastConnectedTime(contentValues));
        deviceImpl.setLinkLayerProtocol(1);
        deviceImpl.setDeviceModel(contentValues.getAsString("model"));
        deviceImpl.setDeviceSoftVersion(contentValues.getAsString(ProfileRequestConstants.SWV));
        deviceImpl.setDeviceSn(contentValues.getAsString("sn"));
        deviceImpl.setBtMac(contentValues.getAsString("uniqueId"));
        String asString = contentValues.getAsString("productId");
        List<ProductMapInfo> listC = ProductMap.c("productId", asString);
        if (njy.e(listC)) {
            strG = "";
        } else {
            strG = listC.get(0).g();
        }
        if (TextUtils.isEmpty(strG)) {
            LogUtil.j(TAG, "convertToImpl name:", deviceImpl.getName(), " productId:", asString, " hiLinkDeviceId:", strG);
        }
        deviceImpl.setProdId(strG);
        LogUtil.a(TAG, "ContentValues DeviceImpl ", GsonUtil.toJson(deviceImpl));
        return deviceImpl;
    }

    private static long getBondedDeviceLastConnectedTime(ContentValues contentValues) {
        return new dsa("deviceUsedTime").b(dxw.d(), contentValues.getAsString("uniqueId"));
    }

    private static int getDeviceBluetoothType(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceBluetoothType() == 1) {
            return 0;
        }
        if (deviceInfo.getDeviceBluetoothType() == 2) {
            return 1;
        }
        LogUtil.e(TAG, "getDeviceBluetoothType getDeviceBluetoothType:", Integer.valueOf(deviceInfo.getDeviceBluetoothType()));
        return 0;
    }

    private static int getSmartMetterVersion(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA != null) {
            return deviceCapabilityA.getSmartWatchVersionTypeValue();
        }
        return -1;
    }
}
