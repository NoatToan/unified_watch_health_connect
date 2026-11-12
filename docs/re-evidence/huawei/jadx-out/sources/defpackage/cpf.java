package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import health.compact.a.LogUtil;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class cpf {
    public static String c(String str, String str2) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        LogUtil.b("HonorHideUtil", "adapterCloudHide enter : ", str, "device Model : ", str2);
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceModel(str2);
        if (!coy.d(deviceInfo)) {
            return str;
        }
        Object objD = d("hide_capability_on_honor_device");
        JSONArray jSONArray = objD instanceof JSONArray ? (JSONArray) objD : null;
        if (jSONArray == null || jSONArray.length() == 0) {
            return str;
        }
        byte[] bArrD = cph.d(str);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                i = jSONArray.getInt(i2);
            } catch (JSONException e) {
                LogUtil.d("HonorHideUtil", "adapterCloudHide exception : ", cpc.c(e));
                i = 0;
            }
            LogUtil.b("HonorHideUtil", "hide index : ", Integer.valueOf(i));
            e(bArrD, i);
        }
        cpl.d("R_HonorHideUtil", bArrD, "before adapter : ", str, " after adapter : ");
        return cph.d(bArrD);
    }

    private static void e(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || i >= bArr.length * 8) {
            return;
        }
        if (i < 0) {
            LogUtil.e("HonorHideUtil", "isSupport target : ", Integer.valueOf(i));
        } else {
            int i2 = i / 8;
            bArr[i2] = (byte) ((~(1 << (i % 8))) & bArr[i2]);
        }
    }

    private static Object d(String str) {
        Object objOpt = null;
        if (!TextUtils.isEmpty(str) && cop.h()) {
            String strE = cpk.e("app_info_device_cloud", "");
            LogUtil.b("HonorHideUtil", "adapterCloudHide json : ", strE);
            if (!TextUtils.isEmpty(strE)) {
                try {
                    JSONArray jSONArray = new JSONArray(strE);
                    for (int i = 0; i < jSONArray.length() && (objOpt = jSONArray.getJSONObject(i).opt(str)) == null; i++) {
                        LogUtil.e("HonorHideUtil", "cloud no info.");
                    }
                    return objOpt;
                } catch (JSONException e) {
                    LogUtil.d("HonorHideUtil", "isHonorShielded exception : ", cpc.c(e));
                }
            }
        }
        return objOpt;
    }

    public static boolean a(int i, String str) {
        if (i < 10000) {
            LogUtil.e("HonorHideUtil", "wrong 5.1.55 capability please use normal device info.");
            return false;
        }
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceModel(str);
        if (coy.d(deviceInfo)) {
            Object objD = d("hide_capability_on_honor_device");
            JSONArray jSONArray = objD instanceof JSONArray ? (JSONArray) objD : null;
            if (jSONArray == null || jSONArray.length() == 0) {
                return false;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    if (i == jSONArray.getInt(i2)) {
                        LogUtil.b("HonorHideUtil", "cloud shield : ", Integer.valueOf(i));
                        return true;
                    }
                    continue;
                } catch (JSONException e) {
                    LogUtil.d("HonorHideUtil", "isHonorHide exception : ", cpc.c(e));
                }
            }
        }
        LogUtil.b("HonorHideUtil", "isHonorHide index is not hide : ", Integer.valueOf(i));
        return false;
    }
}
