package defpackage;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class lmq {
    public static boolean e() {
        return d().toLowerCase(Locale.ENGLISH).indexOf("vivo") != -1;
    }

    public static boolean c() {
        return d().toLowerCase(Locale.ENGLISH).indexOf("oppo") != -1;
    }

    public static boolean a() {
        return d().toLowerCase(Locale.ENGLISH).indexOf("samsung") != -1;
    }

    private static String d() {
        return Build.BRAND;
    }

    public static String b(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i))).append(String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2)));
        return stringBuffer.toString();
    }

    public static void c(int i, List<String> list, boolean z) {
        LogUtil.b("BTCommonUtil", "Enter updateDeviceFilterNameList productType: ", Integer.valueOf(i));
        if (list == null) {
            LogUtil.e("BTCommonUtil", "updateDeviceFilterNameList deviceFilterNameList is null.");
            return;
        }
        if (cod.a(i)) {
            LogUtil.e("BTCommonUtil", "updateDeviceFilterNameList productType is aw70");
            return;
        }
        if (i == 66) {
            LogUtil.e("BTCommonUtil", "productType is ProductType.PORSCHE_RS");
            return;
        }
        LogUtil.b("BTCommonUtil", "updateDeviceFilterNameList isBand: ", Boolean.valueOf(z));
        if (z) {
            list.add("BAND");
        } else if (i == 34) {
            list.add("PORSCHE");
            list.add(DeviceTypes.WATCH);
        } else {
            list.add(DeviceTypes.WATCH);
        }
        if (cop.i() || cop.e()) {
            LogUtil.b("BTCommonUtil", "updateDeviceFilterNameList storeDemo or beta");
            list.add("HUAWEI");
            list.add("HONOR");
        }
    }

    public static void c(String str) {
        LogUtil.b("BTCommonUtil", "sendInitConnectionMessage:", str);
        Intent intent = new Intent("com.huawei.bone.action.REQUEST_BIND_DEVICE");
        intent.setPackage(BaseApplication.b().getPackageName());
        intent.putExtra("connect_status", "initConnect");
        intent.putExtra("deviceName", str);
        BaseApplication.b().sendBroadcast(intent, clx.e);
    }

    public static String b(String str) {
        LogUtil.b("BTCommonUtil", "Enter decryptMacAddress.");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BTCommonUtil", "Enter decryptMacAddress encryptId is null.");
            return "";
        }
        try {
            String str2 = new String(cqh.e(cph.d(cqh.c(1, 21) + cqh.c(1, 1021) + cqh.c(1, 2021))), "utf-8");
            if (str.length() < 32) {
                return "";
            }
            return new String(lnh.d(1, cph.d(str.substring(32, str.length())), cph.d(str2), cph.d(str.substring(0, 32))), "utf-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.d("BTCommonUtil", "decryptMacAddress UnsupportedEncodingException.");
            return "";
        } catch (Exception unused2) {
            LogUtil.d("BTCommonUtil", "decryptMacAddress exception.");
            return "";
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("BTCommonUtil", "tag or data is empty.");
        } else if (str2.length() > 1000) {
            LogUtil.b(str, "SDK-->Device : ", lnb.e(str2), " dataLen:", Integer.valueOf(str2.length()));
        } else {
            LogUtil.b(str, "SDK-->Device : ", str2);
        }
    }
}
