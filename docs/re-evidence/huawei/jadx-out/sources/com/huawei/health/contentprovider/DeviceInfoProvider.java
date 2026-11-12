package com.huawei.health.contentprovider;

import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.s.e;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import defpackage.edg;
import defpackage.edl;
import defpackage.eep;
import defpackage.lvl;
import defpackage.mkf;
import defpackage.qqt;
import defpackage.ykx;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes26.dex */
public class DeviceInfoProvider extends ContentProvider {
    private static Bitmap e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f6284a = new BroadcastReceiver() { // from class: com.huawei.health.contentprovider.DeviceInfoProvider.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction())) {
                return;
            }
            LogUtil.a("DeviceInfoProvider", "mDeviceBatteryReceiver ACTION_BATTERY_LEVEL");
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                DeviceInfoProvider.d.put(extras.getString("DEVICE_MAC"), String.valueOf(extras.getInt("BATTERY_LEVEL")));
                DeviceInfoProvider.d.put("BATTERY_LEFT", String.valueOf(extras.getInt("BATTERY_LEFT")));
                DeviceInfoProvider.d.put("BATTERY_RIGHT", String.valueOf(extras.getInt("BATTERY_RIGHT")));
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f6283c = {"06D", "06E"};
    private static Map<String, String> d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DateTimeFormatter f6282b = DateTimeFormatter.ofPattern("yyyyMMdd");

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        d(this.f6284a);
        ThreadPoolManager.c().execute(new Runnable() { // from class: dlu
            @Override // java.lang.Runnable
            public final void run() {
                mev.d().e();
            }
        });
        return true;
    }

    private static void d(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            LogUtil.j("DeviceInfoProvider", "registerBatteryBroadcast deviceBatteryReceiver == null");
            return;
        }
        LogUtil.a("DeviceInfoProvider", "enter registerBatteryBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        BroadcastManagerUtil.c(BaseApplication.b(), broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"code", "data"});
        if (!a(uri, matrixCursor)) {
            return matrixCursor;
        }
        List<DeviceInfo> listE = e();
        a(0, matrixCursor, listE, c(listE));
        return matrixCursor;
    }

    private boolean a(Uri uri, MatrixCursor matrixCursor) {
        if (!CommonUtil.bj()) {
            matrixCursor.addRow(new Object[]{2003, "do not support"});
            ReleaseLogUtil.e("R_DeviceInfoProvider", "device not acceptable");
            return false;
        }
        if (!"com.hihonor.quickengine".equals(getCallingPackage())) {
            matrixCursor.addRow(new Object[]{2001, "do not support"});
            ReleaseLogUtil.e("R_DeviceInfoProvider", "calling app not acceptable");
            return false;
        }
        if (!"com.huawei.health.hndevice".equals(uri.getQueryParameter("cardPackage"))) {
            matrixCursor.addRow(new Object[]{2002, "do not support"});
            ReleaseLogUtil.e("R_DeviceInfoProvider", "calling card not acceptable");
            return false;
        }
        if ("query".equals(uri.getQueryParameter(e.n))) {
            return true;
        }
        matrixCursor.addRow(new Object[]{202, "do not support"});
        ReleaseLogUtil.e("R_DeviceInfoProvider", "params error");
        return false;
    }

    private List<DeviceInfo> e() {
        List<DeviceInfo> deviceList = mkf.e(BaseApplication.b()).getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceInfoProvider");
        if (deviceList == null) {
            return new ArrayList(16);
        }
        deviceList.sort(new Comparator() { // from class: dlz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((DeviceInfo) obj2).getLastConnectedTime(), ((DeviceInfo) obj).getLastConnectedTime());
            }
        });
        return deviceList;
    }

    private DeviceInfo c(List<DeviceInfo> list) {
        DeviceInfo deviceInfo = null;
        for (DeviceInfo deviceInfo2 : list) {
            if (c(deviceInfo2)) {
                if (deviceInfo2.getDeviceConnectState() == 2) {
                    long jD = SharedPreferenceManager.d("honor_device_card", "honor_card_send_command_timestamp", 0L);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - jD >= 300000) {
                        d(deviceInfo2.getDeviceIdentify());
                        SharedPreferenceManager.c("honor_device_card", "honor_card_send_command_timestamp", jCurrentTimeMillis);
                    }
                    return deviceInfo2;
                }
                if (deviceInfo == null) {
                    deviceInfo = deviceInfo2;
                }
            }
        }
        return deviceInfo;
    }

    private void d(String str) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(8);
        deviceCommand.setPriority(2);
        deviceCommand.setmIdentify(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        mkf.e(BaseApplication.b()).sendDeviceData(deviceCommand);
    }

    private boolean c(DeviceInfo deviceInfo) {
        String strB = b(deviceInfo);
        LogUtil.a("DeviceInfoProvider", "isWatchOrBand deviceType:", strB);
        return Arrays.asList(f6283c).contains(strB);
    }

    private String b(DeviceInfo deviceInfo) {
        ProductMapInfo productMapInfoA = a(deviceInfo.getHiLinkDeviceId());
        if (productMapInfoA != null) {
            return productMapInfoA.e();
        }
        return ykx.e(deviceInfo);
    }

    private ProductMapInfo a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<ProductMapInfo> listC = ProductMap.c("smartProductId", str);
        if (CollectionUtils.a(listC)) {
            return null;
        }
        return listC.get(0);
    }

    private String e(List<DeviceInfo> list, DeviceInfo deviceInfo, ProductMapInfo productMapInfo) {
        String strC = c(list, deviceInfo.getDeviceName());
        LogUtil.a("DeviceInfoProvider", "getDeviceName connectDeviceName:", deviceInfo.getDeviceName(), " deviceTitle:", strC);
        if (!TextUtils.isEmpty(strC) || productMapInfo == null || TextUtils.isEmpty(productMapInfo.c(deviceInfo.getDeviceSubModelId()))) {
            return strC;
        }
        String strC2 = productMapInfo.c(deviceInfo.getDeviceSubModelId());
        LogUtil.a("DeviceInfoProvider", "getDeviceName marketingName:", strC2);
        return strC2.contains("####") ? strC2.split("####")[0] : strC2;
    }

    private String c(List<DeviceInfo> list, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strD = lvl.d(str);
        return e(list, strD) ? str : strD;
    }

    private boolean e(List<DeviceInfo> list, String str) {
        return b(list, str) || a(lvl.c(), str);
    }

    private boolean b(List<DeviceInfo> list, String str) {
        Iterator<DeviceInfo> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (lvl.d(it.next().getDeviceName()).equals(str) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private boolean a(List<CloudDeviceInfo> list, String str) {
        if (CollectionUtils.a(list)) {
            return false;
        }
        Iterator<CloudDeviceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (lvl.d(it.next().getDeviceName()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void e(DeviceInfo deviceInfo) {
        String strA = a(deviceInfo.getProductType());
        if (TextUtils.isEmpty(strA)) {
            e = d(deviceInfo.getProductType());
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strA);
        Bitmap bitmapLoadImageByImageName = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, eep.e(pluginInfoByUuid, 2, deviceInfo));
        if (bitmapLoadImageByImageName == null) {
            e = BitmapFactory.decodeResource(BaseApplication.b().getResources(), R.mipmap.device_icon_watch_default);
        } else {
            e = bitmapLoadImageByImageName;
        }
    }

    private Bitmap d(int i) {
        int i2;
        switch (i) {
            case 7:
                i2 = R.mipmap.img_huawei_b3_pic1;
                break;
            case 8:
                i2 = R.mipmap.img_honor_s1_pic1;
                break;
            case 9:
            case 11:
            default:
                i2 = R.mipmap.device_icon_watch_default;
                break;
            case 10:
                i2 = R.mipmap.img_huawei_watch_w2_pic1;
                break;
            case 12:
                i2 = R.mipmap.img_device_honor_a1_pic1;
                break;
            case 13:
                i2 = R.mipmap.img_honor_nyx_pic1;
                break;
            case 14:
                i2 = R.mipmap.img_huawei_grus_pic1;
                break;
            case 15:
                i2 = R.mipmap.img_huawei_eris_pic1;
                break;
        }
        return BitmapFactory.decodeResource(BaseApplication.b().getResources(), i2);
    }

    public static String a(int i) {
        for (Map.Entry<String, Integer> entry : edg.b().entrySet()) {
            if (entry != null && entry.getKey() != null) {
                String key = entry.getKey();
                if ((edg.b().get(key) != null ? edg.b().get(key).intValue() : 0) == i) {
                    return key;
                }
            }
        }
        return "";
    }

    private void e(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(OpAnalyticsConstants.HONOR_DEVICE_CARD_DEVICE_NAME, str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HN_DEVICE_CARD_2129042.value(), linkedHashMap);
    }

    private static String e(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.WEBP, 75, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    private void a(int i, MatrixCursor matrixCursor, List<DeviceInfo> list, DeviceInfo deviceInfo) {
        HashMap map = new HashMap();
        if (deviceInfo != null) {
            map.put("deviceName", e(list, deviceInfo, a(deviceInfo.getHiLinkDeviceId())));
            map.put(BleConstants.KEY_CONNECTSTATE, String.valueOf(deviceInfo.getDeviceConnectState()));
            if (deviceInfo.getDeviceConnectState() == 2) {
                map.put("batteryLevel", d.getOrDefault(deviceInfo.getDeviceIdentify(), "0"));
                map.put("batteryLeft", d.getOrDefault("BATTERY_LEFT", "-1"));
                map.put("batteryRight", d.getOrDefault("BATTERY_RIGHT", "-1"));
            } else {
                map.put("batteryLevel", null);
            }
            map.put("hasNoDevice", false);
            e(deviceInfo);
            map.put("image", e(e));
            map.put("productType", Integer.valueOf(deviceInfo.getProductType()));
        }
        if (deviceInfo == null) {
            map.put("hasNoDevice", true);
        }
        int iC = SharedPreferenceManager.c(Integer.toString(10000), "health_fit_play_state", 0);
        map.put("fitState", Integer.valueOf(iC));
        LogUtil.a("DeviceInfoProvider", "wrapData fitState:", Integer.valueOf(iC));
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        matrixCursor.addRow(new Object[]{Integer.valueOf(i), qqt.b(map)});
        String strB = SharedPreferenceManager.b("honor_device_card", "honor_card_op_event_date", (String) null);
        String str = LocalDate.now().format(f6282b);
        if (str.equals(strB)) {
            return;
        }
        e(deviceInfo != null ? deviceInfo.getDeviceName() : null);
        SharedPreferenceManager.c("honor_device_card", "honor_card_op_event_date", str);
    }
}
