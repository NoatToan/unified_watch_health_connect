package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.ecologydevice.clouddevice.CloudSwatchDeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class efl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32877c = new Object();

    public static boolean c() {
        boolean z = System.currentTimeMillis() - CommonUtil.i(SharedPreferenceManager.e(BaseApplication.getContext(), "cloudSwatchDevice", "cloud_swatch_device_last_update_time")) > 600000;
        LogUtil.a("SwatchDeviceUtils", "isNeedUpdateCloudSwatchDevice isNeedUpdate = ", Boolean.valueOf(z));
        return z;
    }

    public static void d() {
        LogUtil.a("SwatchDeviceUtils", "saveSwatchUpdateTime");
        SharedPreferenceManager.e(BaseApplication.getContext(), "cloudSwatchDevice", "cloud_swatch_device_last_update_time", Long.toString(System.currentTimeMillis()), new StorageParams());
    }

    private static List<CloudSwatchDeviceInfo> e() {
        synchronized (f32877c) {
            try {
                ArrayList arrayList = new ArrayList(0);
                if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() && !Utils.o()) {
                    Map<String, String> mapE = SharedPreferenceManager.e(BaseApplication.getContext(), a());
                    if (mapE == null) {
                        return arrayList;
                    }
                    Iterator<Map.Entry<String, String>> it = mapE.entrySet().iterator();
                    while (it.hasNext()) {
                        try {
                            CloudSwatchDeviceInfo cloudSwatchDeviceInfo = (CloudSwatchDeviceInfo) new Gson().fromJson(it.next().getValue(), CloudSwatchDeviceInfo.class);
                            if (cloudSwatchDeviceInfo != null && !arrayList.contains(cloudSwatchDeviceInfo)) {
                                LogUtil.a("SwatchDeviceUtils", "getStorageCloudDevices deviceSn:", CommonUtil.n(cloudSwatchDeviceInfo.getDeviceSn()));
                                arrayList.add(cloudSwatchDeviceInfo);
                            }
                        } catch (JsonSyntaxException unused) {
                            LogUtil.e("SwatchDeviceUtils", "getStorageCloudDevices JsonSyntaxException");
                        }
                    }
                    LogUtil.a("SwatchDeviceUtils", "getStorageCloudDevices size:", Integer.valueOf(arrayList.size()));
                    return arrayList;
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String a() {
        return LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_cloudSwatchDevice";
    }

    public static void e(List<CloudSwatchDeviceInfo> list) {
        synchronized (f32877c) {
            try {
                LogUtil.a("SwatchDeviceUtils", "Enter updateStorageDevices.");
                SharedPreferenceManager.i(BaseApplication.getContext(), a());
                if (njy.e(list)) {
                    LogUtil.a("SwatchDeviceUtils", "updateStorageDevices cloudDeviceList is empty");
                    return;
                }
                for (CloudSwatchDeviceInfo cloudSwatchDeviceInfo : list) {
                    String strN = CommonUtil.n(cloudSwatchDeviceInfo.getDeviceSn());
                    LogUtil.a("SwatchDeviceUtils", "updateStorageDevices deviceSn: ", strN);
                    try {
                        SharedPreferenceManager.e(BaseApplication.getContext(), a(), strN, new Gson().toJson(cloudSwatchDeviceInfo), new StorageParams());
                    } catch (JsonSyntaxException unused) {
                        LogUtil.e("SwatchDeviceUtils", "updateStorageDevices JsonSyntaxException");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList<dru> b() {
        elh elhVarD;
        LogUtil.a("SwatchDeviceUtils", "getCloudDevices");
        ArrayList<dru> arrayList = new ArrayList<>(16);
        for (CloudSwatchDeviceInfo cloudSwatchDeviceInfo : e()) {
            if (!TextUtils.isEmpty(cloudSwatchDeviceInfo.getProductId()) && (elhVarD = ResourceManager.c().d(cloudSwatchDeviceInfo.getProductId())) != null && !elhVarD.l().b().trim().isEmpty()) {
                ContentValues contentValues = new ContentValues(16);
                contentValues.put("sn", cloudSwatchDeviceInfo.getDeviceSn());
                contentValues.put("deviceVersion", cloudSwatchDeviceInfo.getSoftVersion());
                contentValues.put("deviceManufacturer", cloudSwatchDeviceInfo.getManufacture());
                contentValues.put("deviceModel", cloudSwatchDeviceInfo.getDeviceModel());
                dru druVar = new dru();
                druVar.a(contentValues);
                druVar.c(elhVarD);
                druVar.d(3);
                arrayList.add(druVar);
            }
        }
        return arrayList;
    }

    public static Intent a(dru druVar) {
        LogUtil.a("SwatchDeviceUtils", "getJumpH5Intent onItemClick swatch");
        Intent intent = new Intent();
        Object objI = druVar.i();
        if (objI instanceof elh) {
            elh elhVar = (elh) objI;
            String strT = elhVar.t();
            StringBuilder sbB = b(b(new StringBuilder(1024), elg.e().e(strT), 5000), "#/tissot?", 5000);
            ContentValues contentValuesD = druVar.d();
            StringBuilder sbB2 = b(b(sbB, "deviceId=", 5000), contentValuesD.getAsString("sn"), 5000);
            StringBuilder sbB3 = b(b(sbB2, "&deviceVersion=", 5000), contentValuesD.getAsString("deviceVersion"), 5000);
            StringBuilder sbB4 = b(b(sbB3, "&deviceManufacturer=", 5000), contentValuesD.getAsString("deviceManufacturer"), 5000);
            StringBuilder sbB5 = b(b(sbB4, "&deviceModel=", 5000), contentValuesD.getAsString("deviceModel"), 5000);
            intent.setPackage(BaseApplication.getContext().getPackageName());
            intent.setClassName(BaseApplication.getContext().getPackageName(), "com.huawei.operation.activity.WebViewActivity");
            intent.putExtra("url", sbB5.toString());
            intent.putExtra("productId", strT);
            if (elhVar.l() != null) {
                intent.putExtra("name", elo.a(strT, elhVar.l().d()));
            }
            if (elhVar.m() != null) {
                intent.putExtra("deviceType", elhVar.m().name());
            }
        }
        return intent;
    }

    private static StringBuilder b(StringBuilder sb, String str, int i) {
        if (sb != null && str != null && sb.length() + str.length() < i) {
            sb.append(str);
        }
        return sb;
    }
}
