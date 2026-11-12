package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.gson.JsonObject;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cku {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f1690c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f1689a = new ConcurrentHashMap<>();

    public static boolean d(byte[] bArr) {
        cqb cqbVarE = e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("HandshakeUtils", "checkResponseCode tlvFather is null");
            return false;
        }
        List<cqa> listB = cqbVarE.b();
        if (coq.d(listB) && coq.d(cqbVarE.e())) {
            LogUtil.e("HandshakeUtils", "father tlvList is empty and sub tlvFatherList is empty");
            return false;
        }
        if (listB.size() <= 0) {
            return true;
        }
        try {
            return e(listB, cpb.a(listB.get(0).b()));
        } catch (NumberFormatException unused) {
            LogUtil.b("HandshakeUtils", "checkResponseCode NumberFormatException");
            return false;
        }
    }

    private static boolean e(List<cqa> list, int i) {
        if (i != 127) {
            return true;
        }
        try {
            int iA = cpb.a(list.get(0).c());
            if (iA == 100000) {
                return true;
            }
            LogUtil.b("HandshakeUtils", "error code = ", Integer.valueOf(iA));
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.d("HandshakeUtils", "NumberFormatException");
            return false;
        }
    }

    public static boolean d(DeviceInfo deviceInfo, cmm cmmVar) {
        if (deviceInfo != null && cmmVar != null && cmmVar.d() != null) {
            return true;
        }
        LogUtil.b("HandshakeUtils", "Parameter Check Failed");
        return false;
    }

    public static cqb e(byte[] bArr) {
        String strD = cph.d(bArr);
        if (strD == null) {
            LogUtil.e("HandshakeUtils", "parseDataToTlvFormat dataStrInfo is null");
            return null;
        }
        try {
            return new cqe().a(strD.substring(4, strD.length()));
        } catch (cpy unused) {
            LogUtil.d("HandshakeUtils", "tlv resolve exception.");
            return null;
        }
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.d("HandshakeUtils", "setPin: params is incorrect");
        } else {
            cpv.e(str, str2);
            f1689a.put(str, str2);
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("HandshakeUtils", "getPin: deviceIdentify is empty");
            return "";
        }
        if (f1689a.contains(str)) {
            return f1689a.get(str);
        }
        return cpv.e(str);
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.d("HandshakeUtils", "setPin: params is incorrect");
        } else {
            f1690c.put(str, str2);
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("HandshakeUtils", "getPin: deviceIdentify is empty");
            return "";
        }
        return f1690c.get(str);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("HandshakeUtils", "getPin: deviceIdentify is empty");
        } else {
            f1690c.remove(str);
        }
    }

    public static TimeZone e() {
        TimeZone timeZone = null;
        for (int i = 0; i < 5; i++) {
            timeZone = TimeZone.getDefault();
            if (Calendar.getInstance(timeZone).get(1) >= 2000) {
                LogUtil.e("HandshakeUtils", "getTimeZone nowYear >= VALID_YEAR:" + i);
                return timeZone;
            }
            if (i < 4) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException unused) {
                    LogUtil.d("HandshakeUtils", "Thread sleep InterruptedException");
                }
            }
        }
        return timeZone;
    }

    public static byte[] c() {
        TimeZone timeZoneE = e();
        if (timeZoneE == null) {
            LogUtil.d("HandshakeUtils", "timeZone is null");
            return new byte[0];
        }
        int offset = timeZoneE.getOffset(System.currentTimeMillis()) / 3600;
        int iAbs = offset / 1000;
        int iAbs2 = (Math.abs(offset % 1000) * 60) / 1000;
        if (iAbs < 0) {
            iAbs = Math.abs(iAbs) + 128;
        }
        byte[] bArrD = d((iAbs << 8) + iAbs2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = (int) (jCurrentTimeMillis / 1000);
        if (((int) (jCurrentTimeMillis % 1000)) >= 500) {
            i++;
        }
        byte[] bArrC = c(i);
        byte[] bArr = new byte[bArrD.length + bArrC.length];
        System.arraycopy(bArrC, 0, bArr, 0, bArrC.length);
        System.arraycopy(bArrD, 0, bArr, bArrC.length, bArrD.length);
        ReleaseLogUtil.c("DEVMGR_HandshakeUtils", "connect Zone 5.1.5 content:", cph.d(bArr));
        return bArr;
    }

    public static byte[] b() throws Throwable {
        try {
            long jA = cpr.a(GRSManager.c(BaseApplication.b()).getNoCheckUrl("domainConsumerHuawei", GRSManager.c(BaseApplication.b()).getCommonCountryCode()) + "/");
            int i = (int) (jA / 1000);
            if (((int) (jA % 1000)) >= 500) {
                i++;
            }
            LogUtil.b("HandshakeUtils", "getNetWorkTimeInfo date: ", new Date(jA).toString());
            return c(i);
        } catch (Exception e) {
            LogUtil.d("HandshakeUtils", "getNetworkTime e: ", e.getMessage());
            return null;
        }
    }

    private static byte[] d(int i) {
        byte[] bArrF = cph.f(i >> 8);
        byte[] bArrF2 = cph.f(i & 255);
        byte[] bArr = new byte[bArrF.length + 2 + bArrF2.length];
        bArr[0] = 2;
        bArr[1] = 2;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        System.arraycopy(bArrF2, 0, bArr, bArrF.length + 2, bArrF2.length);
        return bArr;
    }

    private static byte[] c(int i) {
        byte[] bArrF = cph.f(i >> 24);
        byte[] bArrF2 = cph.f((i >> 16) & 255);
        byte[] bArrF3 = cph.f((i >> 8) & 255);
        byte[] bArrF4 = cph.f(i & 255);
        byte[] bArr = new byte[bArrF.length + 2 + bArrF2.length + bArrF3.length + bArrF4.length];
        bArr[0] = 1;
        bArr[1] = 4;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        System.arraycopy(bArrF2, 0, bArr, bArrF.length + 2, bArrF2.length);
        System.arraycopy(bArrF3, 0, bArr, bArrF.length + 2 + bArrF2.length, bArrF3.length);
        System.arraycopy(bArrF4, 0, bArr, bArrF.length + 2 + bArrF2.length + bArrF3.length, bArrF4.length);
        return bArr;
    }

    public static String e(String str) {
        LogUtil.b("HandshakeUtils", "Start to construct key info.");
        if (str != null && str.length() > 32) {
            String strSubstring = str.substring(32);
            return cph.b(6) + cph.b(strSubstring.length() / 2) + strSubstring;
        }
        LogUtil.d("HandshakeUtils", "createBondKey is error, key is null");
        return "";
    }

    public static String c(cml cmlVar, String str, String str2) {
        LogUtil.b("HandshakeUtils", "Enter getAuthenticTokenValue.");
        if (cmlVar != null && cmlVar.g() != null && str != null) {
            String strG = cmlVar.g();
            if (strG.length() / 2 == 16 && str.length() / 2 == 16) {
                byte[] bArrD = cph.d(strG);
                byte[] bArrD2 = cph.d(str);
                byte[] bArr = new byte[32];
                System.arraycopy(bArrD, 0, bArr, 0, 16);
                System.arraycopy(bArrD2, 0, bArr, 16, 16);
                try {
                    return cph.d(ckg.c(ckg.c(cph.d(a(cmlVar.b()) + str2), bArr), bArr));
                } catch (UnsupportedEncodingException unused) {
                    LogUtil.d("HandshakeUtils", "HMac256 occur unsupportedEncodingException");
                    return "";
                } catch (InvalidKeyException unused2) {
                    LogUtil.d("HandshakeUtils", "HMac256 occur InvalidKeyException");
                    return "";
                } catch (NoSuchAlgorithmException unused3) {
                    LogUtil.d("HandshakeUtils", "HMac256 occur noSuchAlgorithmException");
                    return "";
                }
            }
            LogUtil.d("HandshakeUtils", "Authentic Random parameter is incorrect.");
        }
        return "";
    }

    public static String a(int i) {
        LogUtil.b("HandshakeUtils", "getCak enter");
        if (i == 1) {
            return cqr.e(cqh.c(1, 30) + cqh.c(1, 1030) + cqh.c(1, 2030));
        }
        if (i == 2) {
            return cqr.e(cqh.c(1, 31) + cqh.c(1, AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED) + cqh.c(1, 2031));
        }
        if (i == 3) {
            try {
                byte[] bArrE = cqh.e(Base64.decode(cqh.c(1, 23) + cqh.c(1, 1023) + cqh.c(1, 2023), 0));
                if (bArrE != null) {
                    return new String(bArrE, "UTF-8");
                }
                LogUtil.e("HandshakeUtils", "getCak bytes is null.");
                return "";
            } catch (UnsupportedEncodingException unused) {
                LogUtil.d("HandshakeUtils", "getCak occur UnsupportedEncodingException");
            }
        } else {
            LogUtil.b("HandshakeUtils", "no support SECRET_KEY", Integer.valueOf(i));
        }
        LogUtil.b("HandshakeUtils", "getCak exception, the mAuthenticVersion is ", Integer.valueOf(i));
        return "";
    }

    public static byte[] b(int i) {
        return cph.e(i);
    }

    public static String e(int i) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("identify", "");
        jsonObject.addProperty("isUseSynergy", "");
        jsonObject.addProperty("isCompatibleDevice", "");
        jsonObject.addProperty("pairMode", "");
        if (i == 3) {
            jsonObject.addProperty("isConnectNewPhone", "");
        }
        return jsonObject.toString();
    }

    public static boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.d("HandshakeUtils", "isCompatibleDevice: params is incorrect");
            return false;
        }
        cmr cmrVarH = cnk.c().h(deviceInfo.getDeviceMac());
        if (cmrVarH == null) {
            LogUtil.d("HandshakeUtils", "isCompatibleDevice: preConnectParameter is null");
            return false;
        }
        return cmrVarH.c();
    }

    public static void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("HandshakeUtils", "btDeviceInfo is null");
            return;
        }
        int iD = cps.d(xgx.d().getBrand(deviceInfo.getDeviceType()));
        if (deviceInfo.getDeviceType() < 74 || iD != 2) {
            LogUtil.b("HandshakeUtils", "deviceType: ", Integer.valueOf(deviceInfo.getDeviceType()), "manuType: ", Integer.valueOf(iD));
            return;
        }
        String deviceMode = deviceInfo.getDeviceMode();
        String strE = cpk.e("honor_device_model_list", "");
        LogUtil.b("HandshakeUtils", "deviceModel: ", deviceMode, "honorDeviceModelList: ", strE);
        if (!TextUtils.isEmpty(strE)) {
            if (strE.contains(deviceMode)) {
                LogUtil.b("HandshakeUtils", "honorDeviceModelList contains deviceModel");
                return;
            }
            deviceMode = strE + ";" + deviceMode;
        }
        cpk.d("honor_device_model_list", deviceMode);
        dmw.c().a();
        LogUtil.b("HandshakeUtils", "saveHonorDeviceModel end");
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 4) {
            return "";
        }
        return "ServiceID = " + str.substring(0, 2) + ", CommandId = " + str.substring(2);
    }
}
