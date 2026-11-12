package com.huawei.health.ecologydevice.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.operation.h5pro.jsmodules.device.DevicePairUtils;
import defpackage.ddy;
import health.compact.a.HEXUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes27.dex */
public class HealthAppProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return "";
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (!"HEALTHWALLETINFO".equals(str)) {
            return null;
        }
        boolean zIsPluginAvaiable = ddy.e().isPluginAvaiable();
        String strE = SharedPreferenceManager.e(getContext(), Integer.toString(10000), "key_wether_to_auth");
        DeviceInfo connectionDevice = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getConnectionDevice();
        boolean zIsWearInfoListSize = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isWearInfoListSize();
        boolean isLogined = LoginInit.getInstance(getContext()).getIsLogined();
        bundle2.putBoolean("isPluginAvaiable", zIsPluginAvaiable);
        bundle2.putBoolean("isLogin", isLogined);
        bundle2.putBoolean("isLogin", isLogined);
        if (TextUtils.isEmpty(strE)) {
            bundle2.putString("key_wether_to_auth", "false");
        } else {
            bundle2.putString("key_wether_to_auth", strE);
        }
        if (connectionDevice == null) {
            if (zIsWearInfoListSize) {
                bundle2.putString(DevicePairUtils.DEVICE_CONNECT_STATE, String.valueOf(1002));
                return bundle2;
            }
            bundle2.putString(DevicePairUtils.DEVICE_CONNECT_STATE, String.valueOf(1001));
            return bundle2;
        }
        bundle2.putString(DevicePairUtils.DEVICE_CONNECT_STATE, String.valueOf(connectionDevice.getDeviceConnectState()));
        bundle2.putString("device_name", connectionDevice.getDeviceName());
        bundle2.putString(PluginPayAdapter.KEY_DEVICE_INFO_SN, HEXUtils.b(connectionDevice.getUuid()));
        bundle2.putString("device_model", connectionDevice.getDeviceModel());
        bundle2.putString(PluginPayAdapter.KEY_DEVICE_INFO_SOFT_VERSION, connectionDevice.getSoftVersion());
        bundle2.putString(PluginPayAdapter.KEY_DEVICE_INFO_BT_VERSION, connectionDevice.getBluetoothVersion());
        bundle2.putString(PluginPayAdapter.KEY_DEVICE_INFO_CERT_MODEL, connectionDevice.getCertModel());
        bundle2.putString(PluginPayAdapter.DEVICE_CATEGORY, String.valueOf(((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isDeviceBand(connectionDevice.getProductType()) ? 1 : 2));
        bundle2.putString(PluginPayAdapter.DEVICE_BT_TYPE, String.valueOf(connectionDevice.getDeviceBluetoothType()));
        return bundle2;
    }
}
