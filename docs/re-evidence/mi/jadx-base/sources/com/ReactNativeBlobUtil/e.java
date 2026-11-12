package com.ReactNativeBlobUtil;

import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.cmh;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public class b implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static void a(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", "warn");
        writableMapCreateMap.putString("detail", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) ReactNativeBlobUtil.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilMessage", writableMapCreateMap);
    }

    public static String b(String str) {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
                messageDigest.update(str.getBytes());
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(String.format(Locale.ROOT, "%02x", Integer.valueOf(b2 & 255)));
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static OkHttpClient.Builder c(OkHttpClient okHttpClient) {
        try {
            a aVar = new a();
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, new TrustManager[]{aVar}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            builderNewBuilder.sslSocketFactory(socketFactory, aVar);
            builderNewBuilder.hostnameVerifier(new b());
            return builderNewBuilder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean d(String str) {
        return str != null && str.startsWith("bundle-assets://");
    }

    public static boolean e(String str) {
        return str != null && str.startsWith("content://");
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("\\w+\\:.*")) {
            return str;
        }
        if (str.startsWith("file://")) {
            return str.replace("file://", "");
        }
        return str.startsWith("bundle-assets://") ? str : cmh.c(ReactNativeBlobUtil.RCTContext, Uri.parse(str));
    }

    public static byte[] g(String str, String str2) {
        if (str2.equalsIgnoreCase("ascii")) {
            return str.getBytes(Charset.forName("US-ASCII"));
        }
        if (str2.toLowerCase(Locale.ROOT).contains(ViewShot.Results.BASE_64)) {
            return Base64.decode(str, 2);
        }
        return str2.equalsIgnoreCase("utf8") ? str.getBytes(Charset.forName("UTF-8")) : str.getBytes(Charset.forName("US-ASCII"));
    }
}
