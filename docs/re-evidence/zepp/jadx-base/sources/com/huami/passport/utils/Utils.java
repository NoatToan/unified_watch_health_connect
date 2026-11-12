package com.huami.passport.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.passport.Configs;
import com.huami.passport.Keeper;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.entity.AppInfo;
import com.huami.passport.entity.Device;
import com.huami.passport.entity.SingInfo;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.smartplay.HuamiOSAlarmActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.Typography;
import org.acra.ACRAConstants;
import org.cybergarage.upnp.device.ST;

/* JADX INFO: loaded from: classes12.dex */
public class Utils {
    private static AppInfo appInfo;
    private static Device device;
    private static volatile String serverDate;

    /* JADX INFO: renamed from: com.huami.passport.utils.Utils$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ String val$url;
        public final /* synthetic */ VolleyError val$volleyError;

        public AnonymousClass2(String str, VolleyError volleyError) {
            this.val$url = str;
            this.val$volleyError = volleyError;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$0(String str) {
            return "NoConnectionError uri:" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$1(String str, NetworkResponse networkResponse, String str2) {
            return "DebugInfo IP:" + str + "statusCode:" + networkResponse.statusCode + "Header:" + Utils.encodeParameters(networkResponse.headers) + " Body:" + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$2(Uri.Builder builder) {
            return "uri:" + builder.toString();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Uri uri = Uri.parse(this.val$url);
                if (this.val$volleyError instanceof NoConnectionError) {
                    final String str = this.val$url;
                    HMLog.error(new Function0() { // from class: com.huami.passport.utils.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Utils.AnonymousClass2.lambda$run$0(str);
                        }
                    });
                    String host = uri.getHost();
                    HttpDnsCache.deleteAccountHost(host);
                    HttpDnsCache.deleteIdHost(host);
                }
                final Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str2 : queryParameterNames) {
                        if (!TextUtils.equals("login_token", str2) && !TextUtils.equals(Configs.Params.APP_TOKEN, str2)) {
                            builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
                        }
                    }
                }
                final String hostAddress = InetAddress.getByName(this.val$url).getHostAddress();
                final NetworkResponse networkResponse = this.val$volleyError.networkResponse;
                if (networkResponse != null) {
                    final String str3 = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
                    HMLog.error(new Function0() { // from class: com.huami.passport.utils.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Utils.AnonymousClass2.lambda$run$1(hostAddress, networkResponse, str3);
                        }
                    });
                }
                HMLog.error(new Function0() { // from class: com.huami.passport.utils.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Utils.AnonymousClass2.lambda$run$2(builderClearQuery);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String assets2String(Context context, String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            throw new IOException("file name is null");
        }
        return inputStream2String(context.getResources().getAssets().open(str));
    }

    public static boolean checkBrowser(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void checkTimeConsumingInMainThread() {
        if (Configs.debugTimeConsuming && Looper.myLooper() == Looper.getMainLooper()) {
            throw new RuntimeException("该函数包含耗时操作，不应该在主线程执行");
        }
    }

    public static String encodeParameters(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append(com.alipay.sdk.m.n.a.h);
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                sb.append(Typography.amp);
            }
            sb.append("timestamp=");
            sb.append(System.currentTimeMillis());
            sb.append(Typography.amp);
            return sb.toString();
        } catch (Exception e) {
            HMLog.error(new Function0() { // from class: h88
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return String.valueOf(e);
                }
            });
            return null;
        }
    }

    public static AppInfo getAppInfo(Context context) {
        Bundle bundle;
        AppInfo appInfo2 = appInfo;
        if (appInfo2 != null) {
            return appInfo2;
        }
        try {
            appInfo = new AppInfo();
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
            appInfo.setVersionName(packageInfo.versionName);
            appInfo.setVersionCode(packageInfo.versionCode);
            appInfo.setPackageName(packageInfo.packageName);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(appInfo.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                appInfo.setAppId(bundle.getString("hm_app_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appInfo;
    }

    public static Device getDeviceCache(Context context) {
        if (device == null) {
            device = getDeviceInfo(context);
        }
        return device;
    }

    public static Device getDeviceInfo(Context context) {
        Bundle bundle;
        Device device2 = new Device();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                String string = bundle.getString(HuamiOSAlarmActivity.KEY_DEVICE_TYPE);
                if (!TextUtils.isEmpty(string)) {
                    device2.setDeviceModel(string);
                }
            }
        } catch (Throwable unused) {
            HMLog.error(new Function0() { // from class: j88
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Utils.lambda$getDeviceInfo$0();
                }
            });
        }
        try {
            String deviceUuid = Keeper.readDeviceUuid(context);
            if (!TextUtils.isEmpty(deviceUuid)) {
                device2.setDeviceidType(ST.UUID_DEVICE);
                device2.setDeviceid(deviceUuid);
                return device2;
            }
        } catch (Throwable unused2) {
            HMLog.error(new Function0() { // from class: k88
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Utils.lambda$getDeviceInfo$1();
                }
            });
        }
        device2.setDeviceidType("unknown");
        device2.setDeviceid("unknown");
        return device2;
    }

    public static String getProvider(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.contains("@") ? "huami" : "huami_phone";
    }

    public static synchronized String getServerDate() {
        return serverDate;
    }

    public static SingInfo getSingInfo(Context context) {
        return getSingInfo(context, context.getPackageName());
    }

    public static String getSystemProperties(Context context, String str) throws IllegalArgumentException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getThirdName(Context context, String str) {
        TpaConfig tpaConfigOrNull = getTpaConfigOrNull(context, str);
        if (tpaConfigOrNull != null) {
            return tpaConfigOrNull.getThirdName();
        }
        if ("huami".equals(str)) {
            return "huami";
        }
        if ("huami_phone".equals(str)) {
            return "huami_phone";
        }
        return null;
    }

    public static TpaConfig getTpaConfigOrNull(Context context, String str) {
        try {
            return getTpaConfigs(context).get(str);
        } catch (IOException unused) {
            return null;
        }
    }

    public static Map<String, TpaConfig> getTpaConfigs(Context context) throws IOException {
        return (Map) new GsonBuilder().create().fromJson(assets2String(context, "tpac.json"), new TypeToken<Map<String, TpaConfig>>() { // from class: com.huami.passport.utils.Utils.1
        }.getType());
    }

    public static String inputStream2String(InputStream inputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        String string = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i = inputStream.read();
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(i);
                    } catch (IOException unused) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return string;
                    } catch (Throwable th2) {
                        th = th2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (inputStream == null) {
                            throw th;
                        }
                        try {
                            inputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                }
                string = byteArrayOutputStream.toString();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused5) {
                }
                inputStream.close();
            } catch (IOException unused6) {
            }
        } catch (IOException unused7) {
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            byteArrayOutputStream = null;
            th = th3;
        }
        return string;
    }

    public static boolean isNetworkAvailable(Context context) {
        if (context == null) {
            HMLog.error(new Function0() { // from class: i88
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Utils.lambda$isNetworkAvailable$3();
                }
            });
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isNoMiui(Context context) {
        try {
            return (!TextUtils.isEmpty(getSystemProperties(context, "ro.miui.ui.version.name"))) && (Build.VERSION.SDK_INT <= 18);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getDeviceInfo$0() {
        return "get device model error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getDeviceInfo$1() {
        return "get android id error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isNetworkAvailable$3() {
        return "isNetworkAvailable --> context is null";
    }

    public static void parseNetworkError(VolleyError volleyError, String str) {
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new AnonymousClass2(str, volleyError));
    }

    public static SingInfo parseSignature(byte[] bArr) {
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(ACRAConstants.DEFAULT_CERTIFICATE_TYPE).generateCertificate(new ByteArrayInputStream(bArr));
            String string = x509Certificate.getPublicKey().toString();
            String string2 = x509Certificate.getSerialNumber().toString();
            SingInfo singInfo = new SingInfo();
            singInfo.setSignName(x509Certificate.getSigAlgName());
            singInfo.setPubKey(string);
            singInfo.setSignNumber(string2);
            singInfo.setSubjectDN(x509Certificate.getSubjectDN().toString());
            return singInfo;
        } catch (CertificateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static synchronized void setServerDate(String str) {
        serverDate = str;
    }

    public static boolean verifyParamByTpac(String str, TpaConfig tpaConfig) {
        if (tpaConfig != null && !TextUtils.isEmpty(tpaConfig.getThirdName()) && TextUtils.equals(str, "huami_phone")) {
            return true;
        }
        if ((tpaConfig == null || TextUtils.isEmpty(tpaConfig.getThirdName()) || tpaConfig.getScope() == null || tpaConfig.getScope().size() <= 0) && !TextUtils.equals(str, "line")) {
            return false;
        }
        if (TextUtils.isEmpty(tpaConfig.getRedirectUrl()) && TextUtils.equals(str, "xiaomi")) {
            return false;
        }
        return (TextUtils.isEmpty(tpaConfig.getAppId()) && (TextUtils.equals(str, "xiaomi") || TextUtils.equals(str, "wechat") || TextUtils.equals(str, "google") || TextUtils.equals(str, "line"))) ? false : true;
    }

    public static SingInfo getSingInfo(Context context, String str) {
        try {
            Signature signature = context.getPackageManager().getPackageInfo(str, 64).signatures[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 0);
            SingInfo signature2 = parseSignature(signature.toByteArray());
            signature2.setKeyHash(strEncodeToString.trim());
            return signature2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
