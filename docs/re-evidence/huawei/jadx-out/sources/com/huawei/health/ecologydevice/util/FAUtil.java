package com.huawei.health.ecologydevice.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.callback.DownloadCallback;
import com.huawei.health.ecologydevice.ui.measure.fragment.utils.ProductCreateFactory;
import com.huawei.hihealth.util.HiFileUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import defpackage.dmr;
import defpackage.dmu;
import defpackage.efi;
import defpackage.efx;
import defpackage.emh;
import defpackage.era;
import defpackage.esf;
import defpackage.est;
import defpackage.esw;
import defpackage.etg;
import defpackage.etn;
import defpackage.njy;
import defpackage.piq;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.Services;
import health.compact.a.WhiteBoxManager;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class FAUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Set<ResultCallback> f6675a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f6676b = false;
    private static AtomicInteger e;

    public interface ResultCallback {
        void onResult(boolean z);
    }

    public static void a(ResultCallback resultCallback) {
        if (resultCallback == null) {
            LogUtil.d("FAUtil", "callBack is null");
            return;
        }
        f6675a.add(resultCallback);
        if (f6676b) {
            LogUtil.d("FAUtil", "Last check not finish");
            return;
        }
        LogUtil.a("FAUtil", "checkCachedDataFromFA: start");
        f6676b = true;
        Context contextB = BaseApplication.b();
        if (!new File(contextB.getFilesDir(), "cache_data_from_fa").exists()) {
            LogUtil.a("FAUtil", "checkCachedDataFromFA: file not exist, no device need bind");
            d(false);
            return;
        }
        String strA = HiFileUtil.a(contextB, "cache_data_from_fa");
        if (TextUtils.isEmpty(strA)) {
            LogUtil.a("FAUtil", "checkCachedDataFromFA: cached data is empty");
            d(false);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            int length = jSONObject.length();
            if (length <= 0) {
                LogUtil.a("FAUtil", "checkCachedDataFromFA: objects.length <= 0");
                d(false);
            } else {
                LogUtil.a("FAUtil", "checkCachedDataFromFA: objects.length = ", Integer.valueOf(length));
                b(jSONObject);
            }
        } catch (JSONException e2) {
            LogUtil.e("FAUtil", "checkCachedDataFromFA: failed because: ", e2.getMessage());
            d(false);
        }
    }

    private static void b(JSONObject jSONObject) {
        e = new AtomicInteger(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            LogUtil.d("FAUtil", "handleCachedData: hashCode = ", next);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject == null) {
                LogUtil.d("FAUtil", "handleCachedData: object is null");
                d(next);
            } else {
                String str = new String(WhiteBoxManager.b().a(HEXUtils.a(jSONObjectOptJSONObject.optString("uniqueId"))), StandardCharsets.UTF_8);
                if (TextUtils.isEmpty(str)) {
                    LogUtil.a("FAUtil", "handleCachedData: uniqueId is null");
                    d(next);
                } else {
                    LogUtil.d("FAUtil", "handleCachedData: uniqueId = ", CommonUtil.n(str));
                    LogUtil.d("FAUtil", "handleCachedData: object = ", jSONObjectOptJSONObject);
                    String strOptString = jSONObjectOptJSONObject.optString("productId");
                    LogUtil.a("FAUtil", "handleCachedData: productId = ", strOptString);
                    if (((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).getBondedDeviceByUniqueId(str) == null) {
                        LogUtil.a("FAUtil", "handleCachedData: device is null");
                        b(jSONObjectOptJSONObject, strOptString, str, next);
                    } else {
                        d(next);
                    }
                }
            }
        }
    }

    private static void b(final JSONObject jSONObject, final String str, final String str2, final String str3) {
        LogUtil.a("FAUtil", "downloadAndBindDevice: productId = ", str);
        Context contextB = BaseApplication.b();
        final String strOptString = jSONObject.optString("deviceType");
        esw eswVar = new esw(contextB, strOptString, 2, Collections.singletonList(str), new est() { // from class: com.huawei.health.ecologydevice.util.FAUtil.3
            @Override // defpackage.ess
            public void onSuccess() {
                LogUtil.a("FAUtil", "download Success");
                FAUtil.e(etn.a(strOptString).getType(), jSONObject, str, str2, str3);
            }

            @Override // defpackage.ess
            public void onFailure(int i) {
                LogUtil.a("FAUtil", "download Failure: ", Integer.valueOf(i));
                if (FAUtil.e.decrementAndGet() == 0) {
                    FAUtil.d(true);
                }
            }
        });
        b(eswVar, jSONObject.optString(AdShowExtras.DOWNLOAD_SOURCE));
        eswVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final String str, JSONObject jSONObject, final String str2, final String str3, final String str4) {
        LogUtil.a("FAUtil", "bindDevice: productId = ", str2);
        ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).bindDevice(str2, e(str2, str3, jSONObject.optString("deviceBtName"), jSONObject.optInt("bluetoothType")), new IDeviceEventHandler() { // from class: com.huawei.health.ecologydevice.util.FAUtil.2
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
                LogUtil.a("FAUtil", "onDeviceFound");
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i) {
                LogUtil.a("FAUtil", "onScanFailed code: ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i) {
                LogUtil.a("FAUtil", "onStateChanged code: ", Integer.valueOf(i));
                if (i != 7) {
                    if (FAUtil.e.decrementAndGet() == 0) {
                        FAUtil.d(true);
                        return;
                    }
                    return;
                }
                String str5 = str2;
                String str6 = str3;
                etg.d(str5, str6, str6);
                FAUtil.d(str4);
                if (njy.e(piq.e().d())) {
                    FAUtil.e(str, str2, str3);
                } else {
                    FAUtil.a(str, str2, str3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final String str, final String str2, final String str3) {
        new efi().a(new DownloadCallback() { // from class: com.huawei.health.ecologydevice.util.FAUtil.1
            @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
            public void onSuccess() {
                FAUtil.a(str, str2, str3);
            }

            @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
            public void onFailure(int i) {
                LogUtil.a("FAUtil", "downloadIndexAll onFailure errorCode ", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, String str3) {
        if (era.g(str2)) {
            LogUtil.a("FAUtil", "registerDataClient deviceType is ", str);
            esf esfVar = new esf();
            if (ProductCreateFactory.getProductKind(HealthDevice.HealthDeviceKind.getHealthDeviceKind(str)) == 2 && emh.b().g()) {
                LogUtil.a("FAUtil", "isRopeDeviceBtConnected");
                esfVar.c(esfVar.a(new esf.d(str2, str3).a(emh.b().c())), null);
            } else if (ProductCreateFactory.getProductKind(HealthDevice.HealthDeviceKind.getHealthDeviceKind(str)) == 1) {
                IndoorEquipManagerApi indoorEquipManagerApi = (IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class);
                if (indoorEquipManagerApi.isDeviceBtConnected()) {
                    LogUtil.a("FAUtil", "isDeviceBtConnected");
                    esfVar.c(esfVar.a(new esf.d(str2, str3).e(indoorEquipManagerApi.getDeviceInformation())), null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        LogUtil.a("FAUtil", "removeInfoByUniqueId: ", str);
        if (e.decrementAndGet() == 0) {
            d(true);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = HiFileUtil.a(BaseApplication.b(), "cache_data_from_fa");
        if (TextUtils.isEmpty(strA)) {
            LogUtil.a("FAUtil", "removeInfoByUniqueId: cachedData is already null, return");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            if (jSONObject.isNull(str)) {
                LogUtil.a("FAUtil", "removeInfoByUniqueId: no cache info for this device, return");
                return;
            }
            jSONObject.remove(str);
            int length = jSONObject.length();
            LogUtil.a("FAUtil", "removeInfoByUniqueId: remaining length = ", Integer.valueOf(length));
            if (length <= 0) {
                a();
            } else {
                HiFileUtil.b(BaseApplication.b(), jSONObject.toString(), "cache_data_from_fa");
            }
        } catch (JSONException e2) {
            LogUtil.e("FAUtil", "removeInfoByUniqueId: exception: ", e2.getMessage());
        }
    }

    private static MeasurableDevice e(String str, String str2, String str3, int i) {
        if ("9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(str)) {
            return new dmr();
        }
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str2);
        if (i == 1) {
            efx efxVarB = efx.b(remoteDevice);
            efxVarB.setDeviceName(str3);
            return efxVarB;
        }
        if (i != 2) {
            return null;
        }
        dmu dmuVarA = dmu.a(remoteDevice);
        dmuVarA.setDeviceName(str3);
        return dmuVarA;
    }

    private static void b(esw eswVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DeviceDownloadSourceInfo deviceDownloadSourceInfo = new DeviceDownloadSourceInfo(null);
        try {
            JSONObject jSONObject = new JSONObject(str);
            deviceDownloadSourceInfo.setSite(jSONObject.optInt("site"));
            deviceDownloadSourceInfo.setIndexName(jSONObject.optString("indexName"));
            deviceDownloadSourceInfo.setConfigurationPoint(jSONObject.optString("configurationPoint"));
        } catch (JSONException e2) {
            LogUtil.e("FAUtil", "setDownloadSource： exception = ", e2.getMessage());
        }
        eswVar.e(deviceDownloadSourceInfo);
    }

    private static void a() {
        LogUtil.a("FAUtil", "deleteFile: deleted = ", Boolean.valueOf(FileUtils.b(new File(BaseApplication.b().getFilesDir(), "cache_data_from_fa"))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(boolean z) {
        f6676b = false;
        if (f6675a.isEmpty()) {
            return;
        }
        Iterator<ResultCallback> it = f6675a.iterator();
        while (it.hasNext()) {
            it.next().onResult(z);
        }
        f6675a.clear();
    }
}
