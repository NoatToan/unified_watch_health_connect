package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Message;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.multisimsdk.multidevicemanager.common.InProgressData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class oco {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConnectivityManager f44131b = null;
    private static final String e = "Utils";
    private static final Character d = '{';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Map> f44130a = new ConcurrentHashMap();

    public static boolean d(Message message) {
        return true;
    }

    public static int d() {
        return ((int) (Math.random() * 100000.0d)) + 1;
    }

    public static String b(Context context, String str, String str2) {
        String strJ = j(str);
        StringBuffer stringBuffer = new StringBuffer("");
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("MultiSIM_info", 0) : null;
        if (sharedPreferences == null || str2 == null || str2.isEmpty()) {
            return "";
        }
        String string = sharedPreferences.getString(stringBuffer.append(strJ).append("_").append(str2).toString(), "");
        return "".equals(string) ? "" : ocs.c(context, string);
    }

    public static void a(Context context, String str, String str2) {
        b(context, str, "Tag", str2);
        b(context, str2, "Tag", str);
    }

    public static boolean b(Context context, String str, String str2, String str3) {
        String strJ = j(str);
        StringBuffer stringBuffer = new StringBuffer("");
        String strA = ocs.a(context, str3);
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("MultiSIM_info", 0) : null;
        if (sharedPreferences == null || str2 == null || str2.isEmpty()) {
            return false;
        }
        String string = stringBuffer.append(strJ).append("_").append(str2).toString();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (!"".equals(sharedPreferences.getString(string, ""))) {
            editorEdit.remove(string);
        }
        editorEdit.putString(string, strA);
        editorEdit.commit();
        return true;
    }

    public static boolean e(Context context, String str, String str2) {
        String strJ = j(str);
        StringBuffer stringBuffer = new StringBuffer("");
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("MultiSIM_info", 0) : null;
        if (sharedPreferences == null || str2 == null || str2.isEmpty()) {
            return false;
        }
        String string = stringBuffer.append(strJ).append("_").append(str2).toString();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (!"".equals(sharedPreferences.getString(string, ""))) {
            editorEdit.remove(string);
        }
        editorEdit.commit();
        return true;
    }

    private static String j(String str) {
        int length;
        if (str == null || (length = str.length()) <= 5) {
            return null;
        }
        return str.substring(length - 5, length);
    }

    public static obr e(Context context, String str) {
        obr obrVar = new obr();
        obrVar.e(d());
        obrVar.a("DevAuth");
        obrVar.c("Token");
        obrVar.d(Base64.encodeToString(String.format("0%1$s@nai.epc.mnc%2$s.mcc%3$s.3gppnetwork.org", str, a(str), b(str)).getBytes(), 0).trim());
        obrVar.e(b(context, str, "authen_Token"));
        return obrVar;
    }

    public static void c(int i, InProgressData inProgressData) {
        ocf.d dVarI = ocf.a().i();
        if (dVarI != null) {
            dVarI.sendMessage(dVarI.obtainMessage(i, inProgressData));
        }
    }

    public static boolean d(Context context) {
        if (context == null) {
            return false;
        }
        if (f44131b == null) {
            f44131b = (ConnectivityManager) context.getSystemService("connectivity");
        }
        NetworkInfo activeNetworkInfo = f44131b.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    public static void a(Message message) {
        if (message == null || message.getTarget() == null) {
            return;
        }
        try {
            message.sendToTarget();
        } catch (IllegalStateException unused) {
            ocq.c(e, "don't send again!!");
        }
    }

    public static boolean g(String str) {
        return (str == null || str.length() <= 1 || d.charValue() == str.charAt(0)) ? false : true;
    }

    public static String c(InProgressData inProgressData) {
        String primary;
        String primaryIDtype;
        if (inProgressData != null) {
            primary = inProgressData.getPrimary();
            primaryIDtype = inProgressData.getPrimaryIDtype();
        } else {
            primary = null;
            primaryIDtype = null;
        }
        return ock.b(primaryIDtype, primary);
    }

    public static void d(Message message, int i) {
        if (message != null) {
            ocq.e(e, "sendMessagewitharg1 arg1 :" + i);
            message.arg1 = i;
            a(message);
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str) || !str.matches("[0-9]{1,4}")) {
            return false;
        }
        ocq.e(e, "http connect result is match digital, result:" + str);
        return true;
    }

    public static void e(HttpURLConnection httpURLConnection, String str) {
        JSONArray jSONArray;
        String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("set-cookie") : null;
        try {
            if (TextUtils.isEmpty(str)) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(str);
            }
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject == null || !"DevAuth".equals(jSONObject.optString("ReqName"))) {
                return;
            }
            String strValueOf = String.valueOf(jSONObject.optInt("ReqSN"));
            SharedPreferences sharedPreferences = ocf.a().b().getSharedPreferences("MultiCookie", 0);
            if (sharedPreferences == null || strValueOf == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!"".equals(sharedPreferences.getString(strValueOf, ""))) {
                editorEdit.remove(strValueOf);
            }
            editorEdit.putString(strValueOf, headerField);
            editorEdit.commit();
            sharedPreferences.getString(strValueOf, "");
        } catch (JSONException unused) {
            ocq.e(e, "ResponseAuthFirstInfo-parseResponseAuthInfoArray JSONException");
        }
    }

    public static String d(String str) {
        SharedPreferences sharedPreferences = ocf.a().b().getSharedPreferences("MultiCookie", 0);
        if (sharedPreferences == null || str == null) {
            return null;
        }
        String string = sharedPreferences.getString(str, "");
        if (!"".equals(string)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(str);
            editorEdit.commit();
        }
        return string;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return String.format("%03d", Integer.valueOf(Integer.parseInt(str.substring(0, 3))));
        } catch (NumberFormatException unused) {
            ocq.e(e, "getMcc NumberFormatException");
            return null;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return String.format("%03d", Integer.valueOf(Integer.parseInt(str.substring(3, 5))));
        } catch (NumberFormatException unused) {
            ocq.e(e, "getMnc NumberFormatException");
            return null;
        }
    }

    public static int e(Context context, int i) {
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        int subscriptionId = -1;
        if (subscriptionManager == null) {
            ocq.c(e, "subscriptionManager is null");
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int[] subscriptionIds = subscriptionManager.getSubscriptionIds(i);
            if (subscriptionIds != null && subscriptionIds.length > 0) {
                subscriptionId = subscriptionIds[0];
            }
        } else if (Build.VERSION.SDK_INT >= 28) {
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList == null) {
                ocq.c(e, "P not obtained subId");
                return -1;
            }
            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                if (subscriptionInfo.getSimSlotIndex() == i) {
                    ocq.e(e, "P get subId");
                    subscriptionId = subscriptionInfo.getSubscriptionId();
                }
            }
        } else {
            SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(i);
            if (activeSubscriptionInfoForSimSlotIndex == null) {
                ocq.c(e, "no subscriptionInfo");
                return -1;
            }
            subscriptionId = activeSubscriptionInfoForSimSlotIndex.getSubscriptionId();
        }
        ocq.e(e, "Utils getSubIdFromSlotId() subId=" + subscriptionId);
        return subscriptionId;
    }

    public static boolean d(int i, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Map<String, String> map) {
        if (absPrimaryDevice == null || absPairedDevice == null) {
            ocq.c(e, "primaryDevice is null or pairedDevice is null");
            return false;
        }
        if (i == 0) {
            return e(absPrimaryDevice, absPairedDevice);
        }
        if (i == 1) {
            return c(absPrimaryDevice, absPairedDevice);
        }
        if (i == 2) {
            return e(absPrimaryDevice, absPairedDevice, map);
        }
        if (i == 3 || i == 5) {
            return a(absPrimaryDevice, absPairedDevice);
        }
        return true;
    }

    private static boolean c(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice) {
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalId())) {
            ocq.c(e, "isContainParamsOperationManageSubscription: TerminalId is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalVendor())) {
            ocq.c(e, "isContainParamsOperationManageSubscription: TerminalVendor is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalModel())) {
            ocq.c(e, "isContainParamsOperationManageSubscription: TerminalModel is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalSwVersion())) {
            ocq.c(e, "isContainParamsOperationManageSubscription: TerminalSwVersion is null");
            return false;
        }
        if (TextUtils.isEmpty(absPairedDevice.getTerminalEid())) {
            ocq.c(e, "isContainParamsOperationManageSubscription: pairedDevice TerminalEid is null");
            return false;
        }
        if (!TextUtils.isEmpty(absPairedDevice.getTerminalId())) {
            return true;
        }
        ocq.c(e, "isContainParamsOperationManageSubscription: pairedDevice TerminalId is null");
        return false;
    }

    private static boolean a(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice) {
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalId())) {
            ocq.c(e, "isContainParamsOperationAcquireConfiguration: TerminalId is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalVendor())) {
            ocq.c(e, "isContainParamsOperationAcquireConfiguration: TerminalVendor is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalModel())) {
            ocq.c(e, "isContainParamsOperationAcquireConfiguration: TerminalModel is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalSwVersion())) {
            ocq.c(e, "isContainParamsOperationAcquireConfiguration: TerminalSwVersion is null");
            return false;
        }
        if (!TextUtils.isEmpty(absPairedDevice.getTerminalId())) {
            return true;
        }
        ocq.c(e, "isContainParamsOperationAcquireConfiguration: pairedDevice TerminalId is null");
        return false;
    }

    private static boolean e(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice) {
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalId())) {
            ocq.c(e, "isContainParamsOperationCheckCheckEligibility: TerminalId is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalVendor())) {
            ocq.c(e, "isContainParamsOperationCheckCheckEligibility: TerminalVendor is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalModel())) {
            ocq.c(e, "isContainParamsOperationCheckCheckEligibility: TerminalModel is null");
            return false;
        }
        if (TextUtils.isEmpty(absPrimaryDevice.getTerminalSwVersion())) {
            ocq.c(e, "isContainParamsOperationCheckCheckEligibility: TerminalSwVersion is null");
            return false;
        }
        if (!TextUtils.isEmpty(absPairedDevice.getTerminalId())) {
            return true;
        }
        ocq.c(e, "isContainParamsOperationCheckCheckEligibility: pairedDevice TerminalId is null");
        return false;
    }

    private static boolean e(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Map<String, String> map) {
        try {
            int iIntValue = Integer.valueOf(map.get("operation_type")).intValue();
            if (iIntValue != 10 && iIntValue != 11) {
                ocq.c(e, "isContainParamsOperationManageService: typeResultCode is can only be 10 or 11");
                return false;
            }
            if (TextUtils.isEmpty(absPrimaryDevice.getTerminalId())) {
                ocq.c(e, "isContainParamsOperationManageService: TerminalId is null");
                return false;
            }
            if (TextUtils.isEmpty(absPrimaryDevice.getTerminalVendor())) {
                ocq.c(e, "isContainParamsOperationManageService: TerminalVendor is null");
                return false;
            }
            if (TextUtils.isEmpty(absPrimaryDevice.getTerminalModel())) {
                ocq.c(e, "isContainParamsOperationManageService: TerminalModel is null");
                return false;
            }
            if (TextUtils.isEmpty(absPrimaryDevice.getTerminalSwVersion())) {
                ocq.c(e, "isContainParamsOperationManageService: TerminalSwVersion is null");
                return false;
            }
            if (!TextUtils.isEmpty(absPairedDevice.getTerminalId())) {
                return true;
            }
            ocq.c(e, "isContainParamsOperationManageService: pairedDevice TerminalId is null");
            return false;
        } catch (NumberFormatException unused) {
            ocq.c(e, "isContainParamsOperationManageService: typeResultCode is not number");
            return false;
        }
    }

    public static boolean a(Context context, Message message, int i) {
        int iC;
        String str = e;
        ocq.b(str, "HwES check Android version, slotID = %s", Integer.valueOf(i));
        if (Build.VERSION.SDK_INT > 29 || (iC = c(context, i)) == 1000) {
            return true;
        }
        ocq.c(str, "HwES check Android Version is false");
        message.arg1 = iC;
        a(message);
        return false;
    }

    private static int c(Context context, int i) {
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        if (subscriptionManager == null) {
            ocq.c(e, "subscriptionManager is null");
            return -1007;
        }
        int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.size() <= 0) {
            ocq.c(e, "subscriptionInfoList is zero or null");
            return -1007;
        }
        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
            if (subscriptionInfo.getSubscriptionId() == defaultDataSubscriptionId && i != subscriptionInfo.getSimSlotIndex()) {
                ocq.e(e, "The slotId is not primary card");
                return -1006;
            }
        }
        return 1000;
    }

    public static String d(Context context, int i) {
        String str = e;
        ocq.e(str, "getSimOperator slotId=" + i);
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (i == -1) {
                if (telephonyManager.getSimState() == 5) {
                    return telephonyManager.getSimOperator();
                }
            } else if (Build.VERSION.SDK_INT >= 28) {
                if (telephonyManager.getSimState(i) == 5) {
                    return telephonyManager.createForSubscriptionId(e(context, i)).getSimOperator();
                }
            } else if (Build.VERSION.SDK_INT == 26) {
                try {
                    int iE = e(context, i);
                    return Class.forName("android.telephony.TelephonyManager").getMethod("getSimOperator", Integer.TYPE).invoke(telephonyManager, Integer.valueOf(iE)) + "";
                } catch (ClassNotFoundException unused) {
                    ocq.c(e, "Unable to find class android.telephony.TelephonyManager");
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    ocq.c(e, "invoke exception");
                } catch (NoSuchMethodException unused3) {
                    ocq.c(e, "getSimOperator method not found");
                } catch (Exception unused4) {
                    ocq.c(e, "other exception");
                }
            } else {
                ocq.c(str, "SDK_INT less than O");
            }
        }
        return "";
    }

    private static Map b(Context context, int i) {
        String strD = d(context, i);
        ocq.e(e, "getCarrierConfigHashMap slotId = " + i);
        Map map = f44130a.get(strD);
        if (map != null) {
            return map;
        }
        Map mapE = obl.e(context, strD);
        f44130a.put(strD, mapE);
        return mapE;
    }

    public static String c(String str, String str2) {
        return c(odd.d().e(), str, odd.d().c(), str2);
    }

    public static String c(Context context, String str, int i, String str2) {
        Object obj;
        Map mapB = b(context, i);
        return (mapB == null || (obj = mapB.get(str)) == null || !String.class.isInstance(obj)) ? str2 : (String) String.class.cast(obj);
    }

    public static Integer a(Context context, String str, int i, Integer num) {
        Object obj;
        Map mapB = b(context, i);
        return (mapB == null || (obj = mapB.get(str)) == null || !Integer.class.isInstance(obj)) ? num : (Integer) Integer.class.cast(obj);
    }

    public static Boolean b(String str, Boolean bool) {
        Object obj;
        Map mapB = b(odd.d().e(), odd.d().c());
        return (mapB == null || (obj = mapB.get(str)) == null || !Boolean.class.isInstance(obj)) ? bool : (Boolean) Boolean.class.cast(obj);
    }

    public static Boolean e(Context context, String str, int i, Boolean bool) {
        Object obj;
        Map mapB = b(context, i);
        return (mapB == null || (obj = mapB.get(str)) == null || !Boolean.class.isInstance(obj)) ? bool : (Boolean) Boolean.class.cast(obj);
    }

    public static String b(HttpURLConnection httpURLConnection) {
        ocq.e(e, "dealGzipContent");
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = gZIPInputStream.read(bArr);
                        if (i != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            String string = byteArrayOutputStream.toString("utf-8");
                            byteArrayOutputStream.close();
                            gZIPInputStream.close();
                            return string;
                        }
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                gZIPInputStream.close();
                throw th4;
            }
        } catch (IOException unused) {
            ocq.c(e, "dealGzipContent IOException");
            return "";
        }
    }

    public static byte[] e(String str) {
        ocq.e(e, "compressToGzip");
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes("utf-8"));
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            ocq.c(e, "compress: fail");
            return new byte[0];
        }
    }

    public static String e() {
        if (odd.d().e() != null) {
            TelephonyManager telephonyManager = (TelephonyManager) odd.d().e().getSystemService("phone");
            if (odd.d().c() == -1) {
                if (telephonyManager.getSimState() == 5) {
                    return telephonyManager.getSimSerialNumber();
                }
                return "";
            }
            if (telephonyManager.getSimState(odd.d().c()) == 5) {
                return telephonyManager.createForSubscriptionId(e(odd.d().e(), odd.d().c())).getSimSerialNumber();
            }
            return "";
        }
        return "";
    }

    public static String c() {
        String language = Locale.getDefault().getLanguage();
        return (language == "en" || language == "tr") ? language : "tr";
    }

    public static String e(int i) {
        if (i <= 0) {
            ocq.c(e, "getSecureRandomForInt bound ", Integer.valueOf(i));
            return String.valueOf(0);
        }
        return String.valueOf(b().nextInt(i));
    }

    public static SecureRandom b() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e2) {
            ocq.a(e, "getSecureRandom exception ", e2);
            return new SecureRandom();
        }
    }
}
