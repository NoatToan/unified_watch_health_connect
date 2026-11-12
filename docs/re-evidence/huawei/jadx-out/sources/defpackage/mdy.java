package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.health.BuildConfig;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mdy {
    public static String b() {
        int iNextInt = new SecureRandom().nextInt(ExceptionCode.CRASH_EXCEPTION);
        Date date = new Date(System.currentTimeMillis());
        return new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault()).format(date) + (((iNextInt + ExceptionCode.CRASH_EXCEPTION) % ExceptionCode.CRASH_EXCEPTION) + ExceptionCode.CRASH_EXCEPTION);
    }

    public static String h() {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = BaseApplication.getContext().getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(BaseApplication.getAppPackage(), 0)) != null) {
                return packageInfo.versionCode + "";
            }
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e("TouchUtil", "getAppVersionName() Exception", e.getMessage());
        }
        return "";
    }

    public static List<mdg> e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(16);
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                mdg mdgVarB = mdg.b(jSONArray.getJSONObject(i));
                if (mdgVarB != null) {
                    arrayList.add(mdgVarB);
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("TouchUtil", "parseApduList,JSONException");
        }
        return arrayList;
    }

    public static String i() {
        DeviceInfo deviceInfoC = mgg.c("TouchUtil");
        if (deviceInfoC != null) {
            return deviceInfoC.getDeviceModel();
        }
        return "";
    }

    public static String g() {
        DeviceInfo deviceInfoC = mgg.c("TouchUtil");
        if (deviceInfoC != null) {
            return deviceInfoC.getSecurityDeviceId();
        }
        return "";
    }

    public static String c() {
        DeviceInfo deviceInfoC = mgg.c("TouchUtil");
        if (deviceInfoC != null) {
            return deviceInfoC.getDeviceIdentify();
        }
        return "";
    }

    public static String j() {
        DeviceInfo deviceInfoC = mgg.c("TouchUtil");
        if (deviceInfoC != null) {
            return deviceInfoC.getDeviceName();
        }
        return "";
    }

    public static String a() {
        String strD;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Data_File_E103", "000F20010000FF0406E10401000000");
            String strD2 = d(c().replace(":", ""));
            StringBuilder sb = new StringBuilder(16);
            sb.append("D20C");
            StringBuilder sb2 = new StringBuilder(16);
            sb2.append("100000000901");
            String str = eeq.d(3) + eeq.d(strD2.length() / 2) + strD2;
            sb2.append(str);
            sb.append(eeq.d(sb2.toString().length() / 2));
            sb.append("6170702F68776F6E65686F70100000000901");
            sb.append(str);
            if (sb.toString().length() / 2 <= 255) {
                strD = eeq.d(0) + eeq.d(sb.toString().length() / 2);
            } else {
                strD = eeq.d(sb.toString().length() / 2);
            }
            LogUtil.a("TouchUtil", "length:", strD);
            jSONObject.put("Data_File_E104", strD + sb.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            LogUtil.e("TouchUtil", "createPersonalizeMacDeviceModel,JSONException");
            return null;
        }
    }

    public static String d(String str) {
        if (str == null || str.length() == 0 || str.length() < 3) {
            return "";
        }
        String str2 = "000000000" + str.substring(str.length() - 3, str.length());
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            int i2 = i * 2;
            bArr[i] = a(str2.charAt(i2), str2.charAt(i2 + 1));
        }
        return e(bArr, 6);
    }

    public static String e(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(16);
        for (int i2 = 0; i2 < i; i2++) {
            String hexString = Integer.toHexString(bArr[i2] & 255);
            if (hexString.length() == 1) {
                sb.append("0");
                sb.append(hexString);
                sb.append("");
            } else {
                sb.append(hexString);
                sb.append("");
            }
        }
        return sb.toString().toUpperCase(Locale.ENGLISH).trim();
    }

    private static byte a(char c2, char c3) {
        return (byte) ((b(c2) << 4) | b(c3));
    }

    private static int b(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        LogUtil.j("TouchUtil", "hexCharToInt error");
        return 0;
    }

    public static int e() {
        DeviceInfo deviceInfoC = mgg.c("TouchUtil");
        if (deviceInfoC != null) {
            return deviceInfoC.getDeviceConnectState();
        }
        return 0;
    }

    public static String d() {
        if (CommonUtil.af(BaseApplication.getContext())) {
            return BuildConfig.WALLET_MERCHANT_ID;
        }
        return "900086000000010204";
    }
}
