package com.weibo.ssosdk;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class WeiboSsoSdk {
    public static final String SDK_VERSION_CODE = "2.0";
    private static final String e = "https://login.sina.com.cn/visitor/signin";
    private static final int f = 1;
    private static final int g = 2;
    private static final String h = "WeiboSsoSdk";
    private static final int i = 1;
    private static final String j = "weibo_sso_sdk_aid";
    private static final String k = "weibo_sso_sdk_init";
    private static WeiboSsoSdk l;
    private static WeiboSsoSdkConfig m;
    private volatile ReentrantLock a = new ReentrantLock(true);
    private boolean b = true;
    private VisitorLoginInfo c;
    private int d;

    public static final class VisitorLoginInfo {
        private String a = "";
        private String b = "";

        public static VisitorLoginInfo b(String str) throws Exception {
            VisitorLoginInfo visitorLoginInfo = new VisitorLoginInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("retcode", "");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (strOptString.equals("20000000") && jSONObject2 != null) {
                    visitorLoginInfo.a = jSONObject2.optString("aid", "");
                    visitorLoginInfo.b = jSONObject2.optString("sub", "");
                    return visitorLoginInfo;
                }
                throw new Exception("error： " + strOptString + " msg:" + jSONObject.optString("msg", ""));
            } catch (Exception e) {
                throw e;
            }
        }

        public final VisitorLoginInfo a() {
            VisitorLoginInfo visitorLoginInfo = new VisitorLoginInfo();
            visitorLoginInfo.a = this.a;
            visitorLoginInfo.b = this.b;
            return visitorLoginInfo;
        }

        public final String getAid() {
            return this.a;
        }

        public final String getVisitorSub() {
            return this.b;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Thread.sleep(86400000L);
                    WeiboSsoSdk.getInstance().o((WeiboSsoSdk.this.c == null || TextUtils.isEmpty(WeiboSsoSdk.this.c.getAid())) ? WeiboSsoSdk.this.l() : WeiboSsoSdk.this.c.getAid(), 2);
                } catch (Exception unused) {
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(60000L);
                if (WeiboSsoSdk.this.b) {
                    WeiboSsoSdk.this.o((WeiboSsoSdk.this.c == null || TextUtils.isEmpty(WeiboSsoSdk.this.c.getAid())) ? WeiboSsoSdk.this.l() : WeiboSsoSdk.this.c.getAid(), 2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WeiboSsoSdk.this.o((WeiboSsoSdk.this.c == null || TextUtils.isEmpty(WeiboSsoSdk.this.c.getAid())) ? WeiboSsoSdk.this.l() : WeiboSsoSdk.this.c.getAid(), 2);
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WeiboSsoSdk.this.o("", 1);
            } catch (Exception unused) {
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ VisitorLoginListener a;

        public e(VisitorLoginListener visitorLoginListener) {
            this.a = visitorLoginListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WeiboSsoSdk.this.o("", 1);
            } catch (Exception unused) {
            }
            if (WeiboSsoSdk.this.c == null) {
                WeiboSsoSdk.this.c = new VisitorLoginInfo();
            }
            this.a.handler(WeiboSsoSdk.this.c);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WeiboSsoSdk.this.o("", 1);
            } catch (Exception unused) {
            }
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ AidListener a;

        public g(AidListener aidListener) {
            this.a = aidListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WeiboSsoSdk.this.o("", 1);
            } catch (Exception unused) {
            }
            if (WeiboSsoSdk.this.c == null) {
                WeiboSsoSdk.this.c = new VisitorLoginInfo();
            }
            this.a.handler(WeiboSsoSdk.this.c.getAid());
        }
    }

    static {
        System.loadLibrary("sharewind");
    }

    private WeiboSsoSdk() throws Exception {
        WeiboSsoSdkConfig weiboSsoSdkConfig = m;
        if (weiboSsoSdkConfig == null || !weiboSsoSdkConfig.verify()) {
            throw new Exception("config error");
        }
        this.d = 0;
        new Thread(new a()).start();
        new Thread(new b()).start();
    }

    private static void a(String str) {
    }

    private static void b(String str) {
    }

    public static synchronized WeiboSsoSdk getInstance() {
        if (l == null) {
            l = new WeiboSsoSdk();
        }
        return l;
    }

    private synchronized void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(j(1));
            try {
                fileOutputStream2.write(str.getBytes());
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            } catch (Exception unused2) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String i(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(e).openConnection()));
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setConnectTimeout(1000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.flush();
            if (httpURLConnection.getResponseCode() != 200) {
                return null;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    inputStream.close();
                    byteArrayOutputStream.close();
                    return new String(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized boolean initConfig(WeiboSsoSdkConfig weiboSsoSdkConfig) {
        if (weiboSsoSdkConfig == null) {
            return false;
        }
        if (!weiboSsoSdkConfig.verify()) {
            return false;
        }
        if (m != null) {
            return false;
        }
        WeiboSsoSdkConfig weiboSsoSdkConfig2 = (WeiboSsoSdkConfig) weiboSsoSdkConfig.clone();
        m = weiboSsoSdkConfig2;
        MfpBuilder.init(weiboSsoSdkConfig2.getApplicationContext());
        return true;
    }

    private File j(int i2) {
        return new File(m.getApplicationContext().getFilesDir(), j.concat(String.valueOf(i2)));
    }

    private File k() {
        return new File(m.getApplicationContext().getFilesDir(), k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l() throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(j(1));
            try {
                byte[] bArr = new byte[fileInputStream2.available()];
                fileInputStream2.read(bArr);
                String str = new String(bArr);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (Exception unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return "";
                }
                try {
                    fileInputStream.close();
                    return "";
                } catch (IOException unused3) {
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String m() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = new FileInputStream(k());
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String str = new String(bArr);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    private synchronized void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(k());
            try {
                fileOutputStream2.write(str.getBytes());
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            } catch (Exception unused2) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str, int i2) throws Exception {
        String strEncode;
        if (TextUtils.isEmpty(m.getAppKey(false))) {
            return;
        }
        if (!this.a.tryLock()) {
            this.a.lock();
            this.a.unlock();
            return;
        }
        boolean userChoise = m.getUserChoise();
        boolean isWifiInfors = m.getIsWifiInfors();
        this.b = false;
        String mfp = MfpBuilder.getMfp(m.getApplicationContext(), userChoise ? 1 : 0, isWifiInfors ? 1 : 0);
        try {
            strEncode = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            strEncode = "";
        }
        String strI = i(riseWind(m.getAppKey(true), m.getApplicationContext().getPackageName(), strEncode, mfp, m.getFrom(true), m.getOldWm(true), m.getWm(true), m.getSub(true), m.getSmid(true), m.getExtraString(true), i2, this.d, userChoise ? 1 : 0));
        this.d++;
        if (strI == null) {
            this.a.unlock();
            throw new Exception("network error.");
        }
        try {
            VisitorLoginInfo visitorLoginInfoB = VisitorLoginInfo.b(strI);
            if (visitorLoginInfoB != null && !TextUtils.isEmpty(visitorLoginInfoB.getAid())) {
                h(visitorLoginInfoB.getAid());
            }
            if (i2 == 1) {
                this.c = visitorLoginInfoB;
            }
            this.a.unlock();
        } catch (Exception e2) {
            this.a.unlock();
            throw e2;
        }
    }

    private native String riseWind(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, int i3, int i4);

    public String getAid() throws Exception {
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            return strL;
        }
        VisitorLoginInfo visitorLoginInfo = this.c;
        if (visitorLoginInfo == null || TextUtils.isEmpty(visitorLoginInfo.getAid())) {
            Thread thread = new Thread(new f());
            thread.start();
            thread.join(3000L);
            VisitorLoginInfo visitorLoginInfo2 = this.c;
            if (visitorLoginInfo2 == null || TextUtils.isEmpty(visitorLoginInfo2.getAid())) {
                throw new Exception("visitor login failed");
            }
        }
        return this.c.getAid();
    }

    public void updateSub(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m.setSub(str);
        String visitorSub = this.c.getVisitorSub();
        if (TextUtils.isEmpty(visitorSub) || !visitorSub.equals(str)) {
            new Thread(new c()).start();
        }
    }

    public VisitorLoginInfo visitorLogin() throws Exception {
        VisitorLoginInfo visitorLoginInfo = this.c;
        if (visitorLoginInfo == null || TextUtils.isEmpty(visitorLoginInfo.getAid()) || TextUtils.isEmpty(this.c.getVisitorSub())) {
            Thread thread = new Thread(new d());
            thread.start();
            thread.join(3000L);
            VisitorLoginInfo visitorLoginInfo2 = this.c;
            if (visitorLoginInfo2 == null || TextUtils.isEmpty(visitorLoginInfo2.getAid()) || TextUtils.isEmpty(this.c.getVisitorSub())) {
                throw new Exception("visitor login failed");
            }
        }
        return this.c;
    }

    public void getAid(AidListener aidListener) throws Throwable {
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            aidListener.handler(strL);
        }
        VisitorLoginInfo visitorLoginInfo = this.c;
        if (visitorLoginInfo != null && !TextUtils.isEmpty(visitorLoginInfo.getAid())) {
            aidListener.handler(this.c.getAid());
        } else {
            Executors.newSingleThreadExecutor().execute(new g(aidListener));
        }
    }

    public void visitorLogin(VisitorLoginListener visitorLoginListener) {
        VisitorLoginInfo visitorLoginInfo = this.c;
        if (visitorLoginInfo != null && !TextUtils.isEmpty(visitorLoginInfo.getAid()) && !TextUtils.isEmpty(this.c.getVisitorSub())) {
            visitorLoginListener.handler(this.c);
        } else {
            Executors.newSingleThreadExecutor().execute(new e(visitorLoginListener));
        }
    }
}
