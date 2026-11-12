package health.compact.a;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.gson.Gson;
import com.google.json.JsonSanitizer;
import com.huawei.android.app.LocaleHelperEx;
import com.huawei.android.deviceinfo.HwDeviceInfoEx;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwauthutil.utils.PackageManagerHelper;
import com.huawei.hwcommonmodel.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.CommonUtil$SnStatus;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.wear.oversea.util.SystemPropertyValues;
import defpackage.aej;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class CommonUtil extends CommonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f36526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f36527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f36528c;
    private static Boolean d;
    private static long e;
    private static HashMap<String, Integer> h = new HashMap<>();
    private static String i = "unknown";
    private static CommonUtil$SnStatus g = CommonUtil$SnStatus.DEFAULT;
    private static String f = "-1";
    private static BroadcastReceiver j = new BroadcastReceiver() { // from class: health.compact.a.CommonUtil.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "update receive null,deal failed,return");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "updateReceiver receive action null,deal failed,return");
                return;
            }
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "update receive, action:", action);
            String stringExtra = intent.getStringExtra("update_state");
            if (stringExtra == null) {
                LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "updateReceiver receive state null,deal failed,return");
                return;
            }
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "update receive, state:", stringExtra);
            if (action.equals("com.huawei.health.update_commonutils_area")) {
                String unused = CommonUtil.f36527b = stringExtra;
            } else if (action.equals("com.huawei.health.update_commonutils_LOGIN")) {
                String unused2 = CommonUtil.f36526a = stringExtra;
            } else {
                LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "action equals failed");
            }
        }
    };

    public static boolean az() {
        return false;
    }

    public static boolean ce() {
        return false;
    }

    public static void d(Context context) {
    }

    private CommonUtil() {
    }

    public static Boolean v() {
        return d;
    }

    public static void d(boolean z) {
        d = Boolean.valueOf(z);
    }

    public static String y() {
        return f36527b;
    }

    public static void ab(String str) {
        f36527b = str;
    }

    public static String w() {
        return f36526a;
    }

    public static void aa(String str) {
        f36526a = str;
    }

    public static void z(String str) {
        f36528c = str;
    }

    public static String i() {
        return f36528c;
    }

    public static void r(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "init context null,init failed,return");
        } else {
            as(context);
        }
    }

    public static void j(Context context, String str) {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "sendUpdateAreaBroadcast");
        a(context, "com.huawei.health.update_commonutils_area", str);
    }

    public static void l(Context context, String str) {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "sendUpdateAreaBroadcast");
        a(context, "com.huawei.health.update_commonutils_LOGIN", str);
    }

    public static boolean a(byte[] bArr, int i2) {
        if (bArr == null || bArr.length == 0 || i2 >= bArr.length * 8) {
            return false;
        }
        if (i2 < 0) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isSupport target : ", Integer.valueOf(i2));
            return false;
        }
        int i3 = bArr[i2 / 8];
        int i4 = 1 << (i2 % 8);
        return (i3 & i4) == i4;
    }

    private static void a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setPackage("com.huawei.health");
        intent.putExtra("update_state", str2);
        context.sendBroadcast(intent, SecurityConstant.e);
    }

    private static void as(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.update_commonutils_area");
        intentFilter.addAction("com.huawei.health.update_commonutils_LOGIN");
        BroadcastManagerUtil.d(context, j, intentFilter, SecurityConstant.e, null);
    }

    public static boolean ca() {
        return com.huawei.hwlogsmodel.common.LogConfig.i();
    }

    public static boolean cj() {
        return com.huawei.hwlogsmodel.common.LogConfig.g();
    }

    public static boolean br() {
        return cj() || cl();
    }

    public static String c(String str) {
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "legalPath is empty, leave filterFilePath");
            return null;
        }
        File file = new File(strE);
        try {
            return file.getCanonicalPath();
        } catch (IOException e2) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "filterFilePath IOException :", e2.getMessage(), "filterFilePath finished, file: ", file.getName());
            return null;
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".contains(String.valueOf(str.charAt(i2)))) {
                stringBuffer.append(str.charAt(i2));
            }
        }
        return stringBuffer.toString();
    }

    public static boolean w(Context context) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        String country = context.getResources().getConfiguration().locale.getCountry();
        String strL = l(context);
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isChineseSimplified(): country = ", country, ", language = ", strL);
        if (MLAsrConstants.LAN_ZH.equalsIgnoreCase(strL) && "cn".equalsIgnoreCase(country)) {
            z = true;
        }
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isChineseSimplified(): result = ", Boolean.valueOf(z));
        return z;
    }

    public static boolean aa(Context context) {
        if (context == null) {
            return false;
        }
        String strL = l(context);
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isFrench(): language = ", strL);
        boolean zEqualsIgnoreCase = "fr".equalsIgnoreCase(strL);
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isFrench(): result = ", Boolean.valueOf(zEqualsIgnoreCase));
        return zEqualsIgnoreCase;
    }

    public static boolean g(Context context, String str) {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isCnAndEu() enter: ", str);
        if ("cn".equalsIgnoreCase(str)) {
            return true;
        }
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isCnAndEu null");
            return false;
        }
        String[] stringArray = context.getApplicationContext().getResources().getStringArray(R.array.eu_national_code);
        if (stringArray == null || stringArray.length < 1) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isInEuAccountArea() if ((countryList == null) || (countryList.length < 1))");
            return false;
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isCnAndEu() country=", str);
        for (String str2 : stringArray) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isContainCountry country is empty");
            return false;
        }
        try {
            for (String str2 : BaseApplication.getContext().getResources().getStringArray(i2)) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        } catch (Resources.NotFoundException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isContainCountry resourceId NotFoundException");
        }
        return false;
    }

    public static int n(Context context, String str) {
        return b(context, str, 0);
    }

    public static int b(Context context, String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "stringToInt str is empty");
            return i2;
        }
        try {
            if (str.indexOf(".") > 0) {
                str = str.substring(0, str.indexOf("."));
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "Exception e = ", e2.getMessage());
            return i2;
        }
    }

    public static float e(Context context, String str, float f2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "stringToFloat str is empty");
            return f2;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "Exception parsing float: " + str, e2.getMessage());
            return f2;
        }
    }

    public static long m(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "stringToLong str is empty");
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "Exception e = ", e2.getMessage());
            return 0L;
        }
    }

    public static boolean r(Context context, String str) throws Throwable {
        JarFile jarFile;
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifyApkSignature null");
            return false;
        }
        JarFile jarFile2 = null;
        JarFile jarFile3 = null;
        try {
            try {
                PublicKey[] publicKeyArrS = s(context, context.getPackageName());
                if (publicKeyArrS != null && publicKeyArrS.length != 0) {
                    jarFile = new JarFile(str);
                    try {
                        JarEntry jarEntry = jarFile.getJarEntry("classes.dex");
                        Certificate[] certificateArrC = jarEntry != null ? c(jarFile, jarEntry) : null;
                        if (certificateArrC != null && certificateArrC.length > 0) {
                            for (Certificate certificate : certificateArrC) {
                                PublicKey publicKey = certificate.getPublicKey();
                                for (PublicKey publicKey2 : publicKeyArrS) {
                                    if (publicKey.equals(publicKey2)) {
                                        try {
                                            jarFile.close();
                                            return true;
                                        } catch (IOException unused) {
                                            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifySignature finaLLY IOException:");
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            jarFile.close();
                            return false;
                        } catch (IOException unused2) {
                            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifySignature finaLLY IOException:");
                            return false;
                        }
                    } catch (IOException unused3) {
                        jarFile3 = jarFile;
                        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifySignature IOException:");
                        if (jarFile3 != null) {
                            try {
                                jarFile3.close();
                            } catch (IOException unused4) {
                                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifySignature finaLLY IOException:");
                            }
                        }
                        return false;
                    } catch (Exception unused5) {
                        jarFile2 = jarFile;
                        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifySignature Exception:");
                        if (jarFile2 != null) {
                            try {
                                jarFile2.close();
                            } catch (IOException unused6) {
                                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifySignature finaLLY IOException:");
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (jarFile != null) {
                            try {
                                jarFile.close();
                            } catch (IOException unused7) {
                                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifySignature finaLLY IOException:");
                            }
                        }
                        throw th;
                    }
                }
                Log.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "verifySignature (installedAppPubKeys == null) || (installedAppPubKeys.length == 0)");
                return false;
            } catch (Throwable th2) {
                th = th2;
                jarFile = null;
            }
        } catch (IOException unused8) {
        } catch (Exception unused9) {
        }
    }

    private static PublicKey[] s(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.versionName == null) {
                return null;
            }
            return a(packageInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Exception unused2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getInstalledAppPublicKey Exception:");
            return null;
        }
    }

    private static PublicKey[] a(PackageInfo packageInfo) throws Throwable {
        PublicKey[] publicKeyArr;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                if (packageInfo.signatures != null && packageInfo.signatures.length != 0) {
                    publicKeyArr = new PublicKey[packageInfo.signatures.length];
                    try {
                        Signature[] signatureArr = packageInfo.signatures;
                        int length = signatureArr.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            byte[] byteArray = signatureArr[i2].toByteArray();
                            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                            byteArrayInputStream = new ByteArrayInputStream(byteArray);
                            try {
                                publicKeyArr[i3] = ((X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream)).getPublicKey();
                                i2++;
                                i3++;
                                byteArrayInputStream2 = byteArrayInputStream;
                            } catch (CertificateException e2) {
                                e = e2;
                                byteArrayInputStream2 = byteArrayInputStream;
                                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getPublicKey CertificateException:", e.getMessage());
                                IoUtils.c(byteArrayInputStream2);
                                return publicKeyArr;
                            } catch (Exception unused) {
                                byteArrayInputStream2 = byteArrayInputStream;
                                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getPublicKey Exception:");
                                IoUtils.c(byteArrayInputStream2);
                                return publicKeyArr;
                            } catch (Throwable th) {
                                th = th;
                                IoUtils.c(byteArrayInputStream);
                                throw th;
                            }
                        }
                        IoUtils.c(byteArrayInputStream2);
                        return publicKeyArr;
                    } catch (CertificateException e3) {
                        e = e3;
                    } catch (Exception unused2) {
                    }
                }
                IoUtils.c(null);
                return null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream = null;
            }
        } catch (CertificateException e4) {
            e = e4;
            publicKeyArr = null;
        } catch (Exception unused3) {
            publicKeyArr = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private static Certificate[] c(JarFile jarFile, JarEntry jarEntry) throws Throwable {
        IOException e2;
        InputStream inputStream;
        ?? r4 = 0;
        try {
            try {
                byte[] bArr = new byte[2048];
                inputStream = jarFile.getInputStream(jarEntry);
                do {
                    try {
                    } catch (IOException e3) {
                        e2 = e3;
                        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "loadCertificates Exception:", e2.getMessage());
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "loadCertificates Exception:", e4.getMessage());
                            }
                        }
                        return null;
                    }
                } while (inputStream.read(bArr, 0, 2048) != -1);
                Certificate[] certificates = jarEntry.getCertificates();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return certificates;
                    } catch (IOException e5) {
                        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "loadCertificates Exception:", e5.getMessage());
                    }
                }
                return certificates;
            } catch (Throwable th) {
                r4 = jarFile;
                th = th;
                if (r4 != 0) {
                    try {
                        r4.close();
                    } catch (IOException e6) {
                        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "loadCertificates Exception:", e6.getMessage());
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            e2 = e7;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
    }

    public static long x(String str) {
        try {
            return Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "parseLongByRadix exception");
            return -1L;
        }
    }

    public static int v(String str) {
        return b(str, 16);
    }

    public static int b(String str, int i2) {
        try {
            return Integer.parseInt(str, i2);
        } catch (NumberFormatException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "parseIntByRadix exception, input is : ", str);
            return -1;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getAppVersion null");
            return 0;
        }
        return l(context.getPackageName());
    }

    public static int l(String str) {
        int i2;
        try {
            PackageInfo packageInfo = BaseApplication.getContext().getPackageManager().getPackageInfo(str, 0);
            i2 = packageInfo != null ? packageInfo.versionCode : 1;
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getAppVersion() Exception=", e2.getMessage());
        }
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getAppVersion() return=", Integer.valueOf(i2));
        return i2;
    }

    public static boolean ab(Context context) {
        return NetworkUtil.i();
    }

    public static void t(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "goToNetWorkSettingPage null");
        } else {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static String c(Context context) {
        return "and_health_" + a(context);
    }

    public static String a(Context context) {
        return EnvironmentUtils.a();
    }

    public static int e(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        int length = 0;
        for (int i2 = 0; i2 < iMin; i2++) {
            length = strArrSplit[i2].length() - strArrSplit2[i2].length();
            if (length != 0 || (length = strArrSplit[i2].compareTo(strArrSplit2[i2])) != 0) {
                break;
            }
        }
        return length != 0 ? length : strArrSplit.length - strArrSplit2.length;
    }

    public static int h(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            int phoneType = ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getDeviceType() deviceType = ", Integer.valueOf(phoneType));
            return phoneType;
        } catch (SecurityException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getDeviceType() SecurityException ");
            return -1;
        } catch (Exception unused2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getDeviceType() Exception");
            return -1;
        }
    }

    public static String ah() {
        if (av() || bc()) {
            boolean z = BaseApplication.getContext().getPackageManager().checkPermission("com.huawei.android.permission.GET_DEVICE_INFO", BaseApplication.getContext().getPackageName()) == 0;
            ReleaseLogUtil.c("getSnToEmuiAddonsOrSystemProperties  isEmui110 || isHarmony is true, hasPermission is ", Boolean.valueOf(z));
            if (z) {
                return HwDeviceInfoEx.getDeviceInfo(1);
            }
        }
        ReleaseLogUtil.c("getSnToEmuiAddonsOrSystemProperties use ro.boot.serialno get sn", new Object[0]);
        return SystemProperties.d("ro.boot.serialno");
    }

    public static String n(Context context) {
        if (context == null) {
            return "";
        }
        String string = BaseApplication.getContext().getSharedPreferences("login_data", 0).getString(com.huawei.health.messagecenter.model.CommonUtil.IMEI, "");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getImei from SP");
        return string;
    }

    public static boolean ai(Context context) {
        return a("com.huawei.hwservicesmgr.PhoneService", context);
    }

    public static boolean a(String str, Context context) {
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isServiceRunning null");
            return false;
        }
        try {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(30);
            if (runningServices != null && runningServices.size() > 0) {
                Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (it.next().service.getClassName().equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isServiceRunning() Exception");
        }
    }

    public static boolean bd() {
        return SystemInfo.j();
    }

    public static boolean bh() {
        return bd() || bg();
    }

    public static boolean as() {
        return EmuiBuild.f36544b;
    }

    public static boolean bj() {
        return MagicBuild.f36615a && MagicBuild.f36616b >= 33;
    }

    public static boolean aj() {
        return MagicBuild.f36615a && MagicBuild.f36616b >= 35;
    }

    public static boolean cs() {
        return EnvironmentInfo.e("ro.radio.noril", false);
    }

    public static boolean cb() {
        if (!bg()) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isSupportGms is not huawei system");
            return true;
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "gmsversion ", EnvironmentInfo.d("ro.com.google.gmsversion"));
        if (TextUtils.isEmpty(EnvironmentInfo.d("ro.com.google.gmsversion"))) {
            return ai("com.google.android.gms");
        }
        return true;
    }

    public static String ab() {
        return EnvironmentInfo.d("ro.miui.ui.version.name");
    }

    public static String aa() {
        return EnvironmentInfo.d("ro.miui.ui.version.code");
    }

    public static boolean bm() {
        int i2;
        String strAb = ab();
        String strAa = aa();
        try {
            i2 = Integer.parseInt(strAa);
        } catch (NumberFormatException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isMiui10 string2Int e=", e2.getMessage());
            i2 = 0;
        }
        LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isMiui10 name:", strAb, " code:", strAa, " versionCode:", Integer.valueOf(i2));
        return i2 >= 8;
    }

    public static boolean bk() {
        int i2;
        String strAb = ab();
        String strAa = aa();
        try {
            i2 = Integer.parseInt(strAa);
        } catch (NumberFormatException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isMiui13 string2Int e=", e2.getMessage());
            i2 = 0;
        }
        LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isMiui13 name:", strAb, " code:", strAa, " versionCode:", Integer.valueOf(i2));
        return i2 >= 13;
    }

    public static String f() {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("private_data", 0);
        String string = sharedPreferences.getString("cpuPlatform", "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strD = EnvironmentInfo.d("ro.board.platform");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("cpuPlatform", strD);
        editorEdit.apply();
        return strD;
    }

    private static boolean ai(String str) {
        try {
            PackageInfo packageInfo = BaseApplication.getContext().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return false;
            }
            return c(packageInfo) || d(packageInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "package not exist");
            return false;
        }
    }

    public static boolean bl() {
        boolean zEquals = "true".equals(EnvironmentInfo.b("ro.build.hw_emui_lite.enable", ""));
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isLite : ", Boolean.valueOf(zEquals));
        return zEquals;
    }

    public static String p() {
        return EmuiBuild.f36543a;
    }

    public static boolean bg() {
        return EmuiBuild.f36544b || HarmonyBuild.e;
    }

    public static boolean bw() {
        return Build.MODEL.toLowerCase().startsWith("pixel");
    }

    public static boolean bc() {
        return HarmonyBuild.e;
    }

    public static boolean bq() {
        return Build.BRAND.toLowerCase(Locale.ENGLISH).contains("nubia");
    }

    public static boolean bz() {
        return SystemProperties.c("hw_sc.sub_screen_shape", 0) == 1;
    }

    public static String ag() {
        if (!bg()) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getSystemVersion the system is not huawei system");
            return "default";
        }
        if (bc()) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getSystemVersion the system is harmony system");
            return HarmonyBuild.f36561a;
        }
        return EmuiBuild.f36543a;
    }

    public static int ae() {
        if (!bg()) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getSystemVersionCode the system is not huawei system");
            return -1;
        }
        return EmuiBuild.e;
    }

    public static boolean by() {
        String strB = EnvironmentInfo.b("ro.hardware", "");
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isSupportCpuForHiAiFace cpuInfo ", strB);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isSupportCpuForHiAiFace cpuInfo is empty");
            return false;
        }
        try {
            List listAsList = Arrays.asList(BaseApplication.getContext().getResources().getStringArray(R.array.smile_support_cpu));
            if (CollectionUtils.isEmpty(listAsList)) {
                LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isSupportCpuForHiAiFace cpuList is empty");
                return false;
            }
            return listAsList.contains(strB);
        } catch (Resources.NotFoundException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isSupportCpuForHiAiFace notFoundException ", ExceptionUtils.c(e2));
            return false;
        }
    }

    public static int o(Context context) {
        if (context == null) {
            ReleaseLogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetEnvironment context is null");
            return -1;
        }
        ReleaseLogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetEnvironment Build.VERSION.SDK_INT:", Integer.valueOf(Build.VERSION.SDK_INT));
        int iAp = ap(context);
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetEnvironment networkType:", Integer.valueOf(iAp));
        return (iAp == 1 || iAp == -3 || iAp == -2) ? iAp : d(iAp);
    }

    private static int ap(Context context) {
        if (!NetworkUtil.h()) {
            ReleaseLogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetEnvironmentInner network isn't connect");
            return -3;
        }
        if (NetworkUtil.k()) {
            ReleaseLogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetEnvironmentInner net work type is wifi");
            return 1;
        }
        if (NetworkUtil.f()) {
            if (Build.VERSION.SDK_INT >= 30 && !PermissionUtil.b(context, new String[]{"android.permission.READ_PHONE_STATE"})) {
                ReleaseLogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetEnvironmentInner READ_PHONE_STATE is not GRANTED");
                return -2;
            }
            return ar(context);
        }
        ReleaseLogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetEnvironmentInner is other net work type");
        return -1;
    }

    private static int ar(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return telephonyManager.getDataNetworkType();
            } catch (SecurityException e2) {
                ReleaseLogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getDataNetworkType exception:", LogUtil.c(e2));
                return -1;
            }
        }
        return telephonyManager.getNetworkType();
    }

    public static boolean ah(Context context) {
        return NetworkUtil.f();
    }

    private static int d(int i2) {
        int i3;
        ReleaseLogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetworkClassByType-start");
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                i3 = 2;
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                i3 = 3;
                break;
            case 13:
            case 18:
                i3 = 4;
                break;
            case 19:
            default:
                i3 = -1;
                break;
            case 20:
                i3 = 5;
                break;
        }
        ReleaseLogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getNetworkClassByType-end");
        return i3;
    }

    public static boolean cl() {
        return BuildTypeConfig.i();
    }

    public static boolean cc() {
        return cl() || ao();
    }

    public static boolean ap() {
        return com.huawei.hwlogsmodel.common.LogConfig.b();
    }

    public static boolean ar() {
        return CompileParameterUtil.c("IS_BETA_PAY_VERSION", false);
    }

    public static boolean aq() {
        return BuildConfigProperties.a("IS_HTY_VERSION", false);
    }

    public static boolean bu() {
        return com.huawei.hwlogsmodel.common.LogConfig.f();
    }

    public static boolean ba() {
        return CompileParameterUtil.c("IS_GREEN_VERSION", false);
    }

    public static long d() {
        return ad("2026/01/01 00:00:00");
    }

    public static long an() {
        return d();
    }

    public static long am() {
        return b() + 7776000000L;
    }

    public static long b() {
        return ad("2027/01/01 00:00:00");
    }

    private static long ad(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(str).getTime();
        } catch (ParseException e2) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "ParseException exception = ", e2.getMessage());
            return 0L;
        }
    }

    public static String b(int i2) {
        return EnvironmentUtils.b(i2);
    }

    public static void d(String str, String str2) {
        synchronized (CommonUtil.class) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            LogUtil.b(str, str2, " cost(ms): ", Long.valueOf(jElapsedRealtime - e));
            e = jElapsedRealtime;
        }
    }

    public static void u(String str) {
        d(str, "");
    }

    public static double e(double d2, int i2) {
        if (i2 < 0) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "round, parameter ERROR!");
            i2 = 0;
        }
        return new BigDecimal(Double.toString(d2)).divide(new BigDecimal("1"), i2, 4).doubleValue();
    }

    public static String e() {
        return BaseApplication.getContext().getResources().getConfiguration().locale.getCountry();
    }

    public static String u() {
        return l(BaseApplication.getContext());
    }

    public static String z() {
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        String strL = l(BaseApplication.getContext());
        String country = configuration.locale.getCountry();
        if (MLAsrConstants.LAN_ZH.equalsIgnoreCase(strL)) {
            String script = configuration.locale.getScript();
            if ("Hans".equalsIgnoreCase(script) || TextUtils.isEmpty(script)) {
                return strL + Constants.LINK + country;
            }
            if (!"TW".equalsIgnoreCase(country) && !"HK".equalsIgnoreCase(country)) {
                return "zh-CHT";
            }
        }
        return strL + Constants.LINK + country;
    }

    public static String ai() {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getScript() enter");
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        if (configuration.getLocales().isEmpty()) {
            return "";
        }
        Locale locale = configuration.getLocales().get(0);
        if (locale == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "locale is null");
            return "";
        }
        return locale.getScript();
    }

    public static boolean i(Context context, String str) {
        Activity activityJ;
        if (context == null || TextUtils.isEmpty(str) || (activityJ = com.huawei.haf.application.BaseApplication.j()) == null) {
            return false;
        }
        ComponentName componentName = activityJ.getComponentName();
        if (componentName == null || TextUtils.isEmpty(componentName.getClassName())) {
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isForeground getClassName is empty");
            return false;
        }
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isForeground getClassName = ", componentName.getClassName());
        return str.equals(componentName.getClassName());
    }

    public static boolean y(String str) {
        return !TextUtils.isEmpty(str) && str.length() > 5000;
    }

    public static boolean q(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null || (runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Context context, String str) {
        if (context != null && str != null) {
            try {
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(30);
                if (runningTasks == null || runningTasks.size() <= 0) {
                    LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isActivityInStack activityManager.getRunningTasks(1) is null.");
                    return false;
                }
                Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
                while (it.hasNext()) {
                    ComponentName componentName = it.next().topActivity;
                    if (componentName != null && str.equals(componentName.getClassName()) && "com.huawei.health".equals(componentName.getPackageName())) {
                        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "Activity in stack:", str);
                        return true;
                    }
                }
                LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "Activity not found:", str);
                return false;
            } catch (SecurityException e2) {
                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isActivityInStack exception:", ExceptionUtils.c(e2));
            }
        }
        return false;
    }

    public static boolean ae(Context context) {
        if (context == null || !(context.getSystemService("activity") instanceof ActivityManager)) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return activityManager.getRunningTasks(1) != null && activityManager.getRunningTasks(1).size() > 0 && activityManager.getRunningTasks(1).get(0) != null && activityManager.getRunningTasks(1).get(0).numActivities == 1;
    }

    public static boolean b(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "checkHuaweiAppMarketIsInstall null");
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.huawei.appmarket", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean d(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "checkAppIsInstall null");
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static void a(Context context, String str) {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "downloadApkByPackageName");
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "downloadApkByPackageName null");
            return;
        }
        try {
            Uri uri = Uri.parse("market://details?id=" + str);
            if (uri != null) {
                LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "downloadApkByPackageName startActivity");
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "uri is null!");
        } catch (ActivityNotFoundException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "ActivityNotFoundException e = ", e2.getMessage());
        } catch (Exception unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "downloadApkByPackageName Exception e = ");
        }
    }

    public static void b(Context context, String str) {
        if (h(context, "com.android.vending")) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isInstalled");
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + str));
                intent.setPackage("com.android.vending");
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "jumpToGooglePlay ActivityNotFoundException");
                return;
            }
        }
        String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.google_play_store_apps_url);
        context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(((stringArray == null || stringArray.length != 1) ? "" : stringArray[0]) + str)));
    }

    public static boolean h(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isInstalled param is null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isInstalled,PackageManager is null");
            return false;
        }
        try {
            return packageManager.getPackageInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isInstalled fail ", e2.getMessage());
        }
    }

    public static void ak(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "toggleNotificationListenerService null");
            return;
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "toggleNotificationListenerService enter");
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"), 2, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"), 1, 1);
    }

    public static String m(Context context) {
        String strK = com.huawei.hwlogsmodel.common.LogConfig.k();
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "pathPre = ", strK);
        return strK;
    }

    public static void d(Context context, String[] strArr) {
        for (String str : strArr) {
            k(context, str);
        }
    }

    public static void k(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "setPermissionFirstRes null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("permissionList", 0).edit();
        editorEdit.putBoolean(str, false);
        editorEdit.apply();
    }

    public static void o(Context context, String str) {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "setPermissionFirstTrue() in permissionName = ", str);
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "setPermissionFirstRes null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("permissionList", 0).edit();
        editorEdit.putBoolean(str, true);
        editorEdit.apply();
    }

    public static boolean e(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getPermissionFirstRes null");
            return true;
        }
        return context.getSharedPreferences("permissionList", 0).getBoolean(str, true);
    }

    public static void am(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "startRemoteService context is null");
            return;
        }
        Intent intent = new Intent("com.huawei.hihealth.action_receive_push_restart");
        intent.setPackage("com.huawei.bone");
        intent.setFlags(32);
        context.sendBroadcast(intent);
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "startRemoteService");
    }

    public static boolean u(Context context) throws Throwable {
        ZipFile zipFile;
        if (context == null) {
            return false;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(context.getApplicationInfo().sourceDir);
                try {
                    if (zipFile.getEntry("META-INF/HUAWEI.CER") != null) {
                        FileUtils.a(zipFile);
                        return false;
                    }
                    FileUtils.a(zipFile);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    zipFile2 = zipFile;
                    LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isApplicationNotSigned IOException 1 = ", e.getMessage());
                    FileUtils.a(zipFile2);
                } catch (Throwable th) {
                    th = th;
                    FileUtils.a(zipFile);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile = zipFile2;
        }
    }

    public static boolean v(Context context) {
        String strD = EnvironmentInfo.d("ro.product.locale.region");
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isChinaRom():productRegion = ", strD);
        if (!TextUtils.isEmpty(strD)) {
            return "cn".equalsIgnoreCase(strD);
        }
        String strD2 = EnvironmentInfo.d(SystemPropertyValues.PROP_LOCALE_KEY);
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isChinaRom():productLocal = ", strD2);
        if (!TextUtils.isEmpty(strD2)) {
            return strD2.toLowerCase(Locale.ENGLISH).contains("cn");
        }
        String country = Locale.getDefault().getCountry();
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isChinaRom():localCountry = ", country);
        if (TextUtils.isEmpty(country)) {
            return false;
        }
        return "cn".equalsIgnoreCase(country);
    }

    public static boolean bx() {
        return ProductConfigUtil.b();
    }

    public static boolean d(String str, String str2, boolean z) {
        String strC = c(str);
        String strC2 = c(str2);
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strC2)) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "copyFile source file is empty or destFileName is empty");
            return false;
        }
        File file = new File(strC);
        if (!file.exists()) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "source file is not exit");
            return false;
        }
        if (!file.isFile()) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "srcFile is not a file");
            return false;
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "srcFile is exists");
        File file2 = new File(strC2);
        if (file2.exists()) {
            if (z) {
                try {
                    if (!new File(strC2).delete()) {
                        return false;
                    }
                } catch (SecurityException unused) {
                    LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "delete SecurityException");
                } catch (Exception unused2) {
                    LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "delete exception");
                }
            }
        } else if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            return false;
        }
        return c(file, file2);
    }

    private static boolean c(File file, File file2) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 != -1) {
                            fileOutputStream2.write(bArr, 0, i2);
                        } else {
                            IoUtils.c(fileOutputStream2);
                            IoUtils.c(fileInputStream);
                            return true;
                        }
                    }
                } catch (FileNotFoundException | IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    IoUtils.c(fileOutputStream);
                    IoUtils.c(fileInputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    IoUtils.c(fileOutputStream);
                    IoUtils.c(fileInputStream);
                    throw th;
                }
            } catch (FileNotFoundException | IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException | IOException unused3) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public static boolean e(File file, String str) throws IOException {
        if (file == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "validateFileName null");
            return false;
        }
        String canonicalPath = file.getCanonicalPath();
        if (Normalizer.normalize(canonicalPath, Normalizer.Form.NFKC).startsWith(Normalizer.normalize(new File(str).getCanonicalPath(), Normalizer.Form.NFKC))) {
            return true;
        }
        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "File is outside extraction target directory.");
        return false;
    }

    public static final boolean af(Context context) {
        return bu();
    }

    public static String ac(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return JsonSanitizer.sanitize(str);
    }

    public static boolean x(Context context) {
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isBackground packageName : ", packageName);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isBackground (appProcesses == null) || (appProcesses.size() <= 0)");
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isBackground appProcess : ", runningAppProcessInfo.processName);
            if (packageName.equals(runningAppProcessInfo.processName)) {
                LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isBackground appProcess packageName.equals  ", Integer.valueOf(runningAppProcessInfo.importance));
                if (runningAppProcessInfo.importance != 100) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ag(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isNotificationListenerRunning null");
            return false;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(30);
        if (runningServices != null) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "serivce is :", runningServiceInfo.service.getClassName());
                if ("com.huawei.bone.ui.setting.NotificationPushListener".equals(runningServiceInfo.service.getClassName())) {
                    LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "serivce is running!!!");
                    return true;
                }
            }
        }
        return false;
    }

    public static int p(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getRunningServicesSize context is null");
            return 0;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(30);
        if (runningServices == null || runningServices.isEmpty()) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getRunningServicesSize runningServiceInfos is empty");
            return 0;
        }
        return runningServices.size();
    }

    public static boolean ck() {
        return CompileParameterUtil.c("IS_SUPPORT_WEAR", false);
    }

    public static boolean ac(Context context) {
        boolean zD;
        boolean zB;
        if (context == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("60.0.3112.116");
        arrayList.add("60.0.3112.107");
        arrayList.add("60.0.3112.78");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            zD = d(packageInfo);
            try {
                zB = b(packageInfo);
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isErrorWebView: e=", e.getMessage());
                zB = false;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            zD = false;
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, " isSystemUpdateApp : ", Boolean.valueOf(zD), "isUserApp : ", Boolean.valueOf(zB));
        String strC = c(context, "com.google.android.webview");
        if (!arrayList.contains(strC)) {
            return false;
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "listErrorVersion.contains(webviewVersion)");
        return zD || zB || "60.0.3112.107".equals(strC);
    }

    public static String c(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getVersion null");
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "NameNotFoundException exception");
            return "";
        } catch (Exception unused2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getVersion Exception");
            return "";
        }
    }

    public static boolean c(PackageInfo packageInfo) {
        return (packageInfo.applicationInfo.flags & 1) != 0;
    }

    public static boolean d(PackageInfo packageInfo) {
        return (packageInfo.applicationInfo.flags & 128) != 0;
    }

    public static boolean b(PackageInfo packageInfo) {
        return (c(packageInfo) || d(packageInfo)) ? false : true;
    }

    public static void p(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "uninstallApk null");
            return;
        }
        context.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)));
    }

    public static boolean al(Context context) {
        if (context == null) {
            return false;
        }
        int iA = new PackageManagerHelper(context.getApplicationContext()).a("com.huawei.bone");
        boolean z = iA >= 210000375;
        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "versionCode:", Integer.valueOf(iA), "  res:", Boolean.valueOf(z));
        return z;
    }

    public static void aj(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "runWearApp null");
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.bone", 0);
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(packageInfo.packageName);
            ResolveInfo next = context.getPackageManager().queryIntentActivities(intent, 0).iterator().next();
            if (next != null) {
                String str = next.activityInfo.packageName;
                String str2 = next.activityInfo.name;
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setComponent(new ComponentName(str, str2));
                intent2.setFlags(270532608);
                intent2.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                context.startActivity(intent2);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "Exception e = ", e2.getMessage());
        }
    }

    public static boolean s(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !str.contains(":") || str.length() <= 16;
    }

    public static String g(Context context) {
        String[] stringArray;
        String networkOperator;
        String strSubstring;
        String strTrim = "";
        if (context == null || (stringArray = context.getResources().getStringArray(R.array.CountryCodes)) == null) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            networkOperator = "";
        } else {
            networkOperator = telephonyManager.getNetworkOperator();
        }
        if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 3) {
            strSubstring = "";
        } else {
            strSubstring = networkOperator.substring(0, 3);
        }
        for (String str : stringArray) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit != null && strArrSplit[0].trim().equals(strSubstring.trim())) {
                strTrim = strArrSplit[1].trim();
                break;
            }
        }
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "result = ", strTrim);
        return strTrim;
    }

    public static String j(Context context) {
        String[] stringArray;
        String networkOperator;
        String strSubstring;
        String strTrim = "";
        if (context == null || (stringArray = context.getResources().getStringArray(R.array.CountryCodes)) == null) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            networkOperator = "";
        } else {
            networkOperator = telephonyManager.getNetworkOperator();
        }
        if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 3) {
            strSubstring = "";
        } else {
            strSubstring = networkOperator.substring(0, 3);
        }
        for (String str : stringArray) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit != null && strArrSplit.length >= 2 && strArrSplit[0].trim().equals(strSubstring.trim())) {
                strTrim = strArrSplit[1].trim();
                break;
            }
        }
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "result = ", strTrim);
        return strTrim;
    }

    public static String e(String str, String str2, int i2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str.split(str2);
            if (i2 >= 0 && i2 < strArrSplit.length) {
                return strArrSplit[i2];
            }
            return "";
        }
        return "";
    }

    public static String r(String str) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("/");
            if (strArrSplit.length > 3 && (iIndexOf = str.indexOf(strArrSplit[3])) != -1) {
                return str.substring(iIndexOf);
            }
            return "";
        }
        return "";
    }

    public static String k(Context context) {
        String strAn;
        String str;
        if (!bg()) {
            strAn = "";
            str = "-1";
        } else {
            strAn = q();
            str = "9";
        }
        if (TextUtils.isEmpty(strAn)) {
            strAn = an(context);
            str = "21";
        }
        if (!TextUtils.isEmpty(strAn)) {
            f = str;
        }
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getDeviceId():", strAn);
        return strAn;
    }

    public static String d(Context context, boolean z) {
        String strAn;
        String str;
        if (!bg()) {
            strAn = "";
            str = "-1";
        } else {
            strAn = q();
            if (!z) {
                str = "9";
            } else if (strAn == null) {
                strAn = n(context);
                str = "0";
            } else {
                LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "deviceId is not null but equals failed");
                str = "9";
            }
        }
        if (TextUtils.isEmpty(strAn)) {
            strAn = an(context);
            str = "21";
        }
        if (!TextUtils.isEmpty(strAn)) {
            f = str;
        }
        LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getDeviceId():", strAn);
        return strAn;
    }

    public static String q() {
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.BuildEx");
            String str = (String) cls.getMethod("getUDID", new Class[0]).invoke(null, new Object[0]);
            if (health.compact.a.utils.StringUtils.g(str) && bc()) {
                str = (String) cls.getMethod("getHarmonyUDID", new Class[0]).invoke(null, new Object[0]);
            }
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getEmuiDeviceUdid = ", str);
            return str;
        } catch (ClassNotFoundException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getEmuiDeviceUdid(),ClassNotFoundException,", e2.getMessage());
            return null;
        } catch (NoSuchMethodException e3) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getEmuiDeviceUdid(),NoSuchMethodException,", e3.getMessage());
            return null;
        } catch (InvocationTargetException e4) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getEmuiDeviceUdid(),InvocationTargetException,", e4.getMessage());
            return "";
        } catch (Exception unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getEmuiDeviceUdid(),others:");
            return "";
        }
    }

    public static String al() {
        try {
            String strG = g();
            if (!TextUtils.isEmpty(strG) && !"unknown".equals(strG)) {
                return HEXUtils.a(Sha256.c(strG.getBytes(StandardCharsets.UTF_8)));
            }
            return "";
        } catch (Exception unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getUdidBySn Exception");
            return "";
        }
    }

    public static String g() {
        int iOrdinal = g.ordinal();
        if (iOrdinal == 0) {
            return ct();
        }
        if (iOrdinal == 2) {
            if (PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.READ_PHONE_STATE"})) {
                return ct();
            }
            return i;
        }
        return i;
    }

    private static String ct() {
        i = "unknown";
        g = CommonUtil$SnStatus.FAIL_PERMISSION_DENIED;
        return i;
    }

    public static boolean bt() {
        boolean z;
        if (!bg()) {
            z = false;
        } else if (TextUtils.isEmpty(q())) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "deviceId is null or empty");
            z = false;
        } else {
            z = true;
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isPhoneSupportUdid: ", Boolean.valueOf(z));
        return z;
    }

    public static String d(double d2, String str) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern(str);
        return decimalFormat.format(d2);
    }

    public static HashMap<String, Double> s(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getTrafficRxTx null");
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.clear();
        ArrayList<NetworkStats.Bucket> arrayListB = b(timeInMillis, jCurrentTimeMillis, context, 1);
        ArrayList<NetworkStats.Bucket> arrayListB2 = b(timeInMillis, jCurrentTimeMillis, context, 0);
        long rxBytes = 0;
        long rxBytes2 = 0;
        long txBytes = 0;
        for (NetworkStats.Bucket bucket : arrayListB) {
            rxBytes2 += bucket.getRxBytes();
            txBytes += bucket.getTxBytes();
        }
        long txBytes2 = 0;
        for (NetworkStats.Bucket bucket2 : arrayListB2) {
            rxBytes += bucket2.getRxBytes();
            txBytes2 += bucket2.getTxBytes();
        }
        HashMap<String, Double> map = new HashMap<>(16);
        map.put("wifi_rx", Double.valueOf(rxBytes2 / 1048576.0d));
        map.put("wifi_tx", Double.valueOf(txBytes / 1048576.0d));
        map.put("mobile_rx", Double.valueOf(rxBytes / 1048576.0d));
        map.put("mobile_tx", Double.valueOf(txBytes2 / 1048576.0d));
        return map;
    }

    private static ArrayList<NetworkStats.Bucket> b(long j2, long j3, Context context, int i2) {
        ArrayList<NetworkStats.Bucket> arrayList = new ArrayList<>(16);
        NetworkStats networkStats = null;
        try {
            try {
                try {
                    NetworkStatsManager networkStatsManager = (NetworkStatsManager) context.getSystemService("netstats");
                    if (networkStatsManager != null) {
                        int i3 = context.getPackageManager().getApplicationInfo("com.huawei.health", 1).uid;
                        NetworkStats networkStatsQuerySummary = networkStatsManager.querySummary(i2, null, j2, j3);
                        if (networkStatsQuerySummary != null) {
                            while (networkStatsQuerySummary.hasNextBucket()) {
                                NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                                if (networkStatsQuerySummary.getNextBucket(bucket) && bucket.getUid() == i3) {
                                    arrayList.add(bucket);
                                }
                            }
                            if (networkStatsQuerySummary != null) {
                                networkStatsQuerySummary.close();
                                return arrayList;
                            }
                        } else if (networkStatsQuerySummary != null) {
                            networkStatsQuerySummary.close();
                            return arrayList;
                        }
                    }
                } catch (RemoteException unused) {
                    LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "RemoteException");
                    if (0 != 0) {
                        networkStats.close();
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "NameNotFoundException");
                if (0 != 0) {
                    networkStats.close();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                networkStats.close();
            }
            throw th;
        }
    }

    public static boolean ao() {
        return com.huawei.hwlogsmodel.common.LogConfig.a();
    }

    public static boolean c(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        long jI = i(str);
        if (j2 < jI) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jI);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        if (length <= 2) {
            return "*" + str.charAt(length - 1);
        }
        if (length <= 4) {
            return e(str, 1, 1);
        }
        if (length <= 8) {
            return e(str, 1, (length / 3) - 1);
        }
        return e(str, 3, 4);
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        if (length <= 2) {
            return "**";
        }
        if (length <= 8) {
            return e(str, 1, (length / 3) - 1);
        }
        return e(str, 3, 4);
    }

    private static String e(String str, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        if (i2 >= 0 && i3 >= 0 && length > i2 + i3) {
            StringBuilder sb = new StringBuilder(str);
            StringBuilder sb2 = new StringBuilder(16);
            for (int i4 = 0; i4 < (length - i2) - i3; i4++) {
                sb2.append("*");
            }
            sb.replace(i2, length - i3, sb2.toString());
            return sb.toString();
        }
        return "***";
    }

    public static boolean cp() {
        return EmuiBuild.e > 11;
    }

    public static boolean ay() {
        return EmuiBuild.e > 15;
    }

    public static boolean bp() {
        return EmuiBuild.e > 14;
    }

    public static boolean aw() {
        return EmuiBuild.e >= 14;
    }

    public static boolean bb() {
        return EmuiBuild.e >= 19;
    }

    public static boolean ci() {
        return l("com.huawei.synergy") >= 910010;
    }

    public static boolean cq() {
        return EmuiBuild.e > 17;
    }

    public static boolean at() {
        return EmuiBuild.e >= 21;
    }

    public static boolean ax() {
        return EmuiBuild.e >= 23;
    }

    public static boolean bf() {
        return EmuiBuild.e == 23;
    }

    public static boolean av() {
        return EmuiBuild.e >= 25;
    }

    public static boolean ch() {
        return EmuiBuild.e > 25;
    }

    public static boolean cm() {
        return EmuiBuild.e >= 27;
    }

    public static boolean au() {
        return EmuiBuild.e >= 11;
    }

    public static boolean co() {
        return EmuiBuild.e >= 9;
    }

    public static boolean cn() {
        return EmuiBuild.e >= 12;
    }

    public static boolean c(String[] strArr) {
        if ("huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
            return d(strArr);
        }
        return false;
    }

    public static boolean d(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String upperCase = Build.MODEL.toUpperCase(Locale.ENGLISH);
            for (String str : strArr) {
                if (upperCase.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean bn() {
        String str = Build.MANUFACTURER;
        String upperCase = Build.MODEL.toUpperCase(Locale.ENGLISH);
        return "huawei".equalsIgnoreCase(str) && (upperCase.contains("FRO") || upperCase.contains("NEY") || upperCase.contains("ANA") || upperCase.contains("ELS"));
    }

    public static boolean bv() {
        String str = Build.MANUFACTURER;
        String upperCase = Build.MODEL.toUpperCase(Locale.ENGLISH);
        if ("huawei".equalsIgnoreCase(str)) {
            return upperCase.contains("DUK") || upperCase.contains("LON") || upperCase.contains("MHA") || upperCase.contains("STF") || upperCase.contains("VKY") || upperCase.contains("VTR");
        }
        return false;
    }

    public static boolean bi() {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isModelCanUseIndoorEquip, isHuaweiSystem:", Boolean.valueOf(bg()), "isLargerThanAndroid6:", true, "isLargerThanAndroid8:", true);
        return true;
    }

    public static boolean d(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("BaseApplication".equals(str)) {
            h.put("HomeFragment", Integer.valueOf(i2));
            h.put("SportEntranceFragment", Integer.valueOf(i2));
            h.put("DiscoverFragment", Integer.valueOf(i2));
            return false;
        }
        Integer num = h.get(str);
        if (num == null) {
            h.put(str, Integer.valueOf(i2));
            return false;
        }
        if (Math.abs(i2 - num.intValue()) <= 1000) {
            return false;
        }
        h.put(str, Integer.valueOf(i2));
        return true;
    }

    public static File f(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        File externalStorageDirectory = null;
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            if (PermissionUtil.a()) {
                externalStorageDirectory = context.getExternalFilesDir(null);
            } else {
                externalStorageDirectory = Environment.getExternalStorageDirectory();
            }
        }
        if (externalStorageDirectory != null) {
            return externalStorageDirectory;
        }
        LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getExternalFilesDirectory:innerContext.getFilesDir");
        return context.getFilesDir();
    }

    public static boolean cd() {
        return bg() && Build.VERSION.SDK_INT > 28;
    }

    public static boolean cf() {
        if (!bg()) {
            return false;
        }
        Context context = BaseApplication.getContext();
        String string = Settings.Secure.getString(context.getContentResolver(), "permission_reason_policy");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        if ("NO_RESTRICTED".equals(string)) {
            return true;
        }
        return Arrays.asList(string.split(";")).contains(context.getPackageName());
    }

    public static boolean y(Context context) {
        return context != null && Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 1;
    }

    public static boolean e(File file) {
        if (file == null) {
            return false;
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            if (canonicalPath == null) {
                return false;
            }
            return canonicalPath.equals(e(canonicalPath));
        } catch (IOException unused) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isFilePathValid, IOException");
            return false;
        }
    }

    private static String an(Context context) {
        try {
            Object objE = ReflectionUtils.e(ReflectionUtils.e(ReflectionUtils.e("com.huawei.utils.FoundationCommonUtil"), "getAndroidId", (Class<?>[]) new Class[]{Context.class}), (Object) null, context);
            return objE instanceof String ? (String) objE : "";
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getAndroidId ", e2.getClass().getSimpleName());
            return "";
        }
    }

    public static String af() {
        if (ah("com.huawei.photos")) {
            return "com.huawei.photos";
        }
        return "com.android.gallery3d";
    }

    public static String ac() {
        if (ah("com.huawei.music")) {
            return "com.huawei.music";
        }
        return "com.android.mediacenter";
    }

    public static String ad() {
        if (ah(Constants.MAGEZINE_PKG_NAME)) {
            return Constants.MAGEZINE_PKG_NAME;
        }
        return "com.android.keyguard";
    }

    private static boolean ah(String str) {
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getPackageInfo(str, 0) != null) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, ExceptionUtils.c(e2));
            }
        }
        return false;
    }

    public static boolean ad(Context context) {
        if (context == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isKeyguardLocked context is null");
            return false;
        }
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardLocked();
        }
        return false;
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace('*', '0').matches("^((\\+86)|(86)|(0086))?[1][1-9]\\d{9}$") ? Pattern.compile("^((\\+86)|(86)|(0086))").matcher(str).replaceAll("").trim() : str;
    }

    public static boolean cg() {
        if (!bg()) {
            return false;
        }
        if (!ax() && au()) {
            return true;
        }
        String strD = EnvironmentInfo.d("hsdf.keyguard.disable_musicsport_style");
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "disable_musicsport_style", strD);
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        return "false".equals(strD);
    }

    public static boolean bo() {
        if (bg()) {
            return !cg();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.FileInputStream, java.io.InputStream] */
    public static String k(String str) throws Throwable {
        ?? fileInputStream;
        Object obj = "getFileSha256 IOException";
        String strC = c(str);
        ?? r4 = 0;
        ?? r5 = 0;
        if (TextUtils.isEmpty(strC)) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getFileSha256 safePath is null");
            return null;
        }
        if (!new File(str).exists()) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getFileSha256 file length is too long.");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                fileInputStream = new FileInputStream(strC);
                try {
                    byte[] bArrE = e((InputStream) fileInputStream);
                    int length = bArrE.length;
                    for (byte b2 : bArrE) {
                        int i2 = b2 & 255;
                        if (i2 < 16) {
                            sb.append('0');
                        }
                        sb.append(Integer.toHexString(i2));
                    }
                    try {
                        fileInputStream.close();
                        obj = obj;
                        r4 = length;
                    } catch (IOException unused) {
                        Object[] objArr = {"getFileSha256 IOException"};
                        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, objArr);
                        obj = objArr;
                        r4 = length;
                    }
                } catch (FileNotFoundException unused2) {
                    r5 = fileInputStream;
                    LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getFileSha256 FileNotFoundException");
                    obj = obj;
                    r4 = r5;
                    if (r5 != 0) {
                        try {
                            r5.close();
                            obj = obj;
                            r4 = r5;
                        } catch (IOException unused3) {
                            Object[] objArr2 = {"getFileSha256 IOException"};
                            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, objArr2);
                            obj = objArr2;
                            r4 = r5;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, obj);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = r4;
            }
        } catch (FileNotFoundException unused5) {
        }
        return sb.toString();
    }

    private static byte[] e(InputStream inputStream) {
        if (inputStream == null) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "digestBytes input is null");
            return new byte[0];
        }
        byte[] bArr = new byte[4096];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest != null) {
                return bArrDigest;
            }
        } catch (IOException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "digestBytes IOException");
        } catch (NoSuchAlgorithmException unused2) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "digestBytes NoSuchAlgorithmException");
        }
        return new byte[0];
    }

    public static boolean z(Context context) {
        if (bg()) {
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isHmsLiteEnable is Emui");
            return false;
        }
        if (EnvironmentUtils.d() && cv()) {
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isHmsLiteEnable is from sp");
            return true;
        }
        int i2 = i(context);
        if (i2 == 0) {
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isInstallHmsPackage false");
            cr();
            return true;
        }
        if (Build.VERSION.SDK_INT < 29) {
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isHmsLiteEnable Build.VERSION.SDK_INT < Build.VERSION_CODES.Q");
            return false;
        }
        if (bd() && i2 < 50010000) {
            cr();
            return true;
        }
        if (!EnvironmentUtils.d()) {
            String strD = ThirdLoginFreshAccessToken.d();
            LogUtil.c(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isHmsLiteEnable liteLogout = ", strD);
            return "false".equals(strD);
        }
        if (i2 > 30003300) {
            return false;
        }
        cr();
        return true;
    }

    private static boolean cv() {
        return BaseApplication.getContext().getSharedPreferences("hmslite", 0).getBoolean("use-status", false);
    }

    public static void cr() {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "updateHmsUsableStatus");
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("hmslite", 0).edit();
        editorEdit.putBoolean("use-status", true);
        editorEdit.commit();
    }

    public static int i(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        int i2 = 0;
        try {
            String strX = x();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(strX, 0);
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isInstallHmsPackage packageInfo=", packageInfo, " packageName:", strX);
            if (packageInfo == null) {
                return 0;
            }
            int i3 = packageInfo.versionCode;
            try {
                LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "Package hms version code: ", Integer.valueOf(i3));
                return i3;
            } catch (PackageManager.NameNotFoundException unused) {
                i2 = i3;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isInstallHmsPackage NameNotFoundException");
        return i2;
    }

    public static String x() {
        return HMSPackageManager.getInstance(BaseApplication.getContext()).getHMSPackageName();
    }

    public static boolean be() {
        int iA = new PackageManagerHelper(BaseApplication.getContext()).a(x());
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "versionCode:" + iA);
        if (iA <= 0) {
            return false;
        }
        boolean z = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(BaseApplication.getContext()) == 0;
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isHmsAvailable: " + z);
        return z;
    }

    public static int c(int i2, long j2) {
        if (j2 == 0) {
            return 0;
        }
        return Math.round((i2 / ((j2 * 1.0f) / 1000.0f)) * 60.0f);
    }

    public static String ak() {
        StringBuilder sb = new StringBuilder(10);
        String str = new SimpleDateFormat("Z", Locale.ENGLISH).format(Calendar.getInstance().getTime());
        sb.append("GMT");
        if (!TextUtils.isEmpty(str) && str.length() >= 5) {
            LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getTimezone gmtStr =", str);
            int i2 = 0;
            while (i2 < 3) {
                int i3 = i2 + 1;
                String strSubstring = str.substring(i2, i3);
                if (Constants.LINK.equals(strSubstring)) {
                    sb.append(Constants.LINK);
                } else if (Marker.ANY_NON_NULL_MARKER.equals(strSubstring)) {
                    sb.append(Marker.ANY_NON_NULL_MARKER);
                } else if (i2 != 1 || !"0".equals(strSubstring)) {
                    sb.append(strSubstring);
                }
                i2 = i3;
            }
        } else {
            sb.append("+8");
        }
        return sb.toString();
    }

    public static String q(String str) throws Throwable {
        FileInputStream fileInputStream;
        String str2 = "";
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    str2 = fileInputStream.read(bArr) > 0 ? new String(bArr, StandardCharsets.UTF_8) : "";
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getStringFile e is ", e2.getMessage());
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileInputStream2 = fileInputStream;
                    LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getStringFile e is ", e.getMessage());
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e4) {
                            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getStringFile e is ", e4.getMessage());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e5) {
                            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getStringFile e is ", e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
            return str2;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    public static String p(String str) {
        if ("my".equals(str) && a(Locale.getDefault(), Locale.getDefault(), false).contains("Zawgyi")) {
            return "rZG";
        }
        if ("bo".equals(str)) {
            return "rCN";
        }
        return null;
    }

    public static String a(Locale locale, Locale locale2, boolean z) {
        if (locale == null || locale2 == null) {
            return Locale.getDefault().getDisplayName();
        }
        if (ax()) {
            return LocaleHelperEx.getDisplayName(locale, locale2, z);
        }
        return Locale.getDefault().getDisplayName();
    }

    public static String a(Locale locale, Locale locale2) {
        if (locale == null || locale2 == null) {
            return Locale.getDefault().getDisplayCountry();
        }
        if (ax()) {
            return LocaleHelperEx.getDisplayCountry(locale, locale2);
        }
        return Locale.getDefault().getDisplayCountry();
    }

    public static boolean b(double d2) {
        return Math.abs(d2) <= 1.0E-6d;
    }

    public static final String c(Object obj) {
        try {
            return new Gson().toJson(obj);
        } catch (IllegalArgumentException e2) {
            ReleaseLogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "IllegalArgumentException with ", ExceptionUtils.c(e2));
            return "";
        }
    }

    public static int[] c(List<Integer> list) {
        if (list == null) {
            return new int[0];
        }
        int[] iArr = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        return iArr;
    }

    public static void c() {
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "enter createMaintenanceLogTemp");
        String str = null;
        try {
            str = f((Context) null).getCanonicalPath() + "/huaweisystem/com.huawei.health/MaintenanceLogTemp";
        } catch (IOException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "createMaintenanceLogTemp() IOException");
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "createMaintenanceLogTemp :", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(com.huawei.health.messagecenter.model.CommonUtil.TAG, "path is null");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "createMaintenanceLogTemp :", Boolean.valueOf(file.mkdirs()));
    }

    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "packageName is null.");
            return false;
        }
        String strA = HsfSignValidator.a(BaseApplication.getContext(), str);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "signature is null.");
            return false;
        }
        if ("com.android.mediacenter".equals(str) && "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equals(strA)) {
            return true;
        }
        return "com.huawei.music".equals(str) && "3E13F630C77618DE3A580DBBAFFE0AC04A16444633CC0253AFB088D3E3AB6EFE".equals(strA);
    }

    public static boolean d(long j2) {
        return System.currentTimeMillis() - j2 < 86400000;
    }

    public static String t(String str) {
        if (str == null) {
            return "";
        }
        try {
            return aej.a(new BigDecimal(str)).toPlainString();
        } catch (ArithmeticException | NumberFormatException unused) {
            LogUtil.d(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getStripedNumber exception num: ", str);
            return "";
        }
    }

    public static int c(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return 0;
        }
        try {
            return jSONObject.getInt(str);
        } catch (JSONException e2) {
            ReleaseLogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getJsonObjectIntValue exception, e is: ", e2.getMessage());
            return 0;
        }
    }

    public static double d(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return 0.0d;
        }
        try {
            return jSONObject.getDouble(str);
        } catch (JSONException e2) {
            ReleaseLogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "getJsonObjectDoubleValue exception, e is: ", e2.getMessage());
            return 0.0d;
        }
    }

    public static boolean bs() {
        try {
            TelephonyManager telephonyManagerS = s();
            if (telephonyManagerS == null) {
                LogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isPhoning telephonyManager is null");
                return false;
            }
            int callState = telephonyManagerS.getCallState();
            return (callState == 2) | (callState == 1);
        } catch (SecurityException e2) {
            ReleaseLogUtil.b(com.huawei.health.messagecenter.model.CommonUtil.TAG, "isPhoning exception is: ", ExceptionUtils.c(e2), " hasPhoneStatePermission = ", Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.READ_PHONE_STATE"})));
            return false;
        }
    }

    public static String h() {
        return f;
    }

    public static String a() {
        if (cl()) {
            return BleConstants.WEIGHT_KEY;
        }
        if (ao()) {
            return "debug";
        }
        return (!bu() && ap()) ? "beta" : "release";
    }

    public static String l(Context context) {
        Locale locale;
        if (context == null) {
            return "";
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (!configuration.getLocales().isEmpty()) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        return e(locale);
    }

    public static String e(Locale locale) {
        if (locale == null) {
            return "";
        }
        String language = locale.getLanguage();
        if ("id".equalsIgnoreCase(language)) {
            return "in";
        }
        return "he".equalsIgnoreCase(language) ? "iw" : language;
    }
}
