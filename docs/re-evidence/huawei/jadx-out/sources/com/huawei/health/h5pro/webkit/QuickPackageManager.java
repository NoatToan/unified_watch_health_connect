package com.huawei.health.h5pro.webkit;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.h5pro.ext.H5ProResidentExtManager;
import com.huawei.health.h5pro.ext.interceptor.H5ProInterceptor;
import com.huawei.health.h5pro.ext.version.H5ProVersionUpgradeExtApi;
import com.huawei.health.h5pro.utils.AppInfoUtil;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5AppLockUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.h5pro.vengine.H5ProPackageManager;
import com.huawei.health.h5pro.vengine.H5ProVersionMeta;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatus;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatusListener;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.exw;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class QuickPackageManager implements H5ProPackageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H5ProInstallDirCleanTask f7032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<H5ProInstanceStatusListener> f7033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7034c;
    private final Object d = new Object();
    private volatile H5ProAppInfo e;
    private WeakReference<Context> f;
    private volatile String i;

    interface DownloadCbk {
        void onFailure(int i, String str);

        void onNewVersion();

        void onSuccess();
    }

    private boolean g(String str) {
        return false;
    }

    public QuickPackageManager(Context context) {
        File externalFilesDir;
        this.f = new WeakReference<>(context);
        if (WebKitUtil.b()) {
            externalFilesDir = context.getFilesDir();
        } else {
            externalFilesDir = context.getExternalFilesDir("");
        }
        File file = new File(externalFilesDir, "h5pro");
        if (!file.exists()) {
            boolean zMkdirs = file.mkdirs();
            LogUtil.i(b("QuickPackageManager"), "isMkdirs -> " + zMkdirs);
        }
        this.f7034c = file.getAbsolutePath();
        this.f7032a = new H5ProInstallDirCleanTask(context);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProPackageManager
    public void setInstanceStatusListener(H5ProInstanceStatusListener h5ProInstanceStatusListener) {
        this.f7033b = new WeakReference<>(h5ProInstanceStatusListener);
    }

    private boolean i(String str) {
        if (!new File(o(str)).exists()) {
            return false;
        }
        try {
            return new File(l(str)).exists();
        } catch (FileNotFoundException e) {
            LogUtil.e(b(str), "isInstalled: exception -> " + e.getMessage());
            return false;
        }
    }

    private String o(String str) {
        return this.f7034c + "/" + str + "/" + str + ".installed";
    }

    private String m(String str) throws FileNotFoundException {
        return l(str) + "/manifest.json";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        return LogUtil.getTag(str, "PkgMgr");
    }

    private long c(String str, String str2, String str3) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strB = b(str3);
        boolean zEndsWith = str.endsWith("hpk");
        LogUtil.i(strB, String.format(Locale.ENGLISH, "download(isHpk->%b): start", Boolean.valueOf(zEndsWith)));
        LogUtil.d(strB, String.format(Locale.ENGLISH, "download %s to %s", str, str2));
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(2000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("Charset", StandardCharsets.UTF_8.name());
        LogUtil.i(strB, String.format(Locale.ENGLISH, "download(isHpk->%b): connect", Boolean.valueOf(zEndsWith)));
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        LogUtil.i(strB, String.format(Locale.ENGLISH, "download(isHpk->%b): responseCode: %d", Boolean.valueOf(zEndsWith), Integer.valueOf(responseCode)));
        if (responseCode != 200) {
            throw new IOException("error response code: " + responseCode);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                byte[] bArr = new byte[1048576];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.close();
                        bufferedInputStream.close();
                        LogUtil.i(strB, String.format(Locale.ENGLISH, "download(isHpk->%b): end", Boolean.valueOf(zEndsWith)));
                        return System.currentTimeMillis() - jCurrentTimeMillis;
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    private String p(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            String string = sb.toString();
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                            return string;
                        }
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamReader.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                fileInputStream.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    private void e(String str, DownloadCbk downloadCbk) {
        Exception e;
        boolean zI;
        LogUtil.i(b(str), "downloadHpk: start");
        try {
            zI = i(str);
            try {
                long jC = c(s(str), q(str), str);
                H5ProVersionMeta h5ProVersionMeta = new H5ProVersionMeta(p(q(str)));
                if (!b(zI, str, h5ProVersionMeta)) {
                    downloadCbk.onSuccess();
                    return;
                }
                H5ProLoadingRecordManager.d.recordDownloadTime(str, jC + c(a(str, h5ProVersionMeta.getLatestVersion()), n(str), str));
                downloadCbk.onNewVersion();
                LogUtil.i(b(str), "downloadHpk: end");
            } catch (exw e2) {
                e = e2;
                LogUtil.e(b(str), String.format(Locale.ENGLISH, "downloadHpk Exception: %s", e.getMessage()));
                if (!TextUtils.isEmpty(null)) {
                    FileDownloadManager.deleteFiles((String) null, false);
                }
                if (zI) {
                    downloadCbk.onSuccess();
                    return;
                }
                downloadCbk.onFailure(-1, e.getMessage());
            } catch (IOException e3) {
                e = e3;
                LogUtil.e(b(str), String.format(Locale.ENGLISH, "downloadHpk Exception: %s", e.getMessage()));
                if (!TextUtils.isEmpty(null)) {
                    FileDownloadManager.deleteFiles((String) null, false);
                }
                if (zI) {
                    downloadCbk.onSuccess();
                    return;
                }
                downloadCbk.onFailure(-1, e.getMessage());
            } catch (JSONException e4) {
                e = e4;
                LogUtil.e(b(str), String.format(Locale.ENGLISH, "downloadHpk Exception: %s", e.getMessage()));
                if (!TextUtils.isEmpty(null)) {
                    FileDownloadManager.deleteFiles((String) null, false);
                }
                if (zI) {
                    downloadCbk.onSuccess();
                    return;
                }
                downloadCbk.onFailure(-1, e.getMessage());
            }
        } catch (exw | IOException | JSONException e5) {
            e = e5;
            zI = false;
        }
    }

    private String l(String str) throws FileNotFoundException {
        return this.f7034c + "/" + str + "/" + d(str);
    }

    private String n(String str) {
        return this.f7034c + "/" + str + "/" + str + ".hpk";
    }

    private String a(String str, String str2) {
        return EnvironmentHelper.getInstance().getUrl(str) + str + "/" + str + Constants.LINK + str2 + ".hpk";
    }

    private String q(String str) {
        return this.f7034c + "/" + str + "/" + str + "-version.json";
    }

    private String s(String str) {
        return EnvironmentHelper.getInstance().getUrl(str) + str + "/" + str + "-version.json";
    }

    private boolean j(String str) throws IOException {
        long time;
        InstalledMeta installedMeta = new InstalledMeta(p(o(str)));
        try {
            time = new Date().getTime() - installedMeta.getInstallTime();
        } catch (NumberFormatException unused) {
            LogUtil.e(b(str), "lastInstallTime: NumberFormatException");
            time = 0;
        }
        EnvironmentHelper.BuildType buildType = EnvironmentHelper.getInstance().getBuildType();
        long j = (buildType == EnvironmentHelper.BuildType.RELEASE || buildType == EnvironmentHelper.BuildType.BETA) ? 1800000L : 60000L;
        if (time <= 0 || time > j || buildType != installedMeta.getBuildType()) {
            LogUtil.i(b(str), "force update h5 app.");
            HpkManager.e.updateInstalledFile(this.f.get(), str);
            return true;
        }
        LogUtil.i(b(str), "lastInstalledMeta: " + installedMeta.toJson());
        return false;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProPackageManager
    public void installApp(final String str, final H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk) {
        new Thread(new Runnable() { // from class: com.huawei.health.h5pro.webkit.QuickPackageManager.3
            @Override // java.lang.Runnable
            public void run() {
                if (!H5AppLockUtil.lock(str, 30000L)) {
                    LogUtil.e(QuickPackageManager.b(str), "installApp: can not get lock");
                    h5ProPreloadCbk.onFailure(-1, "Installation failed: can not get lock, appName=" + str);
                    return;
                }
                LogUtil.i(QuickPackageManager.b(str), "installApp: got a lock");
                try {
                    QuickPackageManager.this.a(str, h5ProPreloadCbk);
                } catch (IOException e) {
                    LogUtil.e(QuickPackageManager.b(str), "installApp: exception -> ", e.getMessage());
                    h5ProPreloadCbk.onFailure(-1, e.getMessage());
                } finally {
                    H5AppLockUtil.unLock(str);
                }
            }
        }, "thread-H5ProAppInstall").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk) throws IOException {
        c(str);
        if (i(str)) {
            c(H5ProInstanceStatus.CONFIG_PREPARED);
            H5ProResidentExtManager.getVersionInterceptor().intercept(str, new H5ProInterceptor.InterceptCallback<String>() { // from class: com.huawei.health.h5pro.webkit.QuickPackageManager.5
                @Override // com.huawei.health.h5pro.ext.interceptor.H5ProInterceptor.InterceptCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onIntercepted(String str2) {
                    LogUtil.i(QuickPackageManager.b(str), "installHpk: onIntercepted -> " + str2);
                    if (TextUtils.isEmpty(str2) || !HpkManager.e.versionMatches(str2) || !"".equals(QuickPackageManager.this.e(str, str2))) {
                        onNotIntercepted();
                    } else {
                        h5ProPreloadCbk.onSuccess();
                    }
                }

                @Override // com.huawei.health.h5pro.ext.interceptor.H5ProInterceptor.InterceptCallback
                public void onNotIntercepted() {
                    LogUtil.i(QuickPackageManager.b(str), "installHpk: onNotIntercepted");
                    try {
                        QuickPackageManager.this.d(str, h5ProPreloadCbk);
                    } catch (IOException e) {
                        LogUtil.e(QuickPackageManager.b(str), "installHpk: exception -> " + e.getMessage());
                        h5ProPreloadCbk.onFailure(-1, e.getMessage());
                    }
                }
            });
            return;
        }
        if (g(str)) {
            h5ProPreloadCbk.onSuccess();
            return;
        }
        LogUtil.i(b(str), "installHpk: first");
        this.f7032a.execute(str);
        if (HpkManager.e.isDownloadedHpk(this.f.get(), str)) {
            LogUtil.i(b(str), "installHpk: downloaded, just begin to unzip.");
            if (f(str)) {
                h5ProPreloadCbk.onSuccess();
                return;
            }
        }
        b(str, h5ProPreloadCbk, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk) throws IOException {
        if (HpkManager.e.isDownloadedHpk(this.f.get(), str)) {
            LogUtil.i(b(str), "doIfInstalled: downloaded, just begin to unzip.");
            if (f(str)) {
                LogUtil.i(b(str), "doIfInstalled: unzip-load");
                h5ProPreloadCbk.onSuccess();
                return;
            }
            if (HpkManager.e.isAsyncUpgradeHpk(this.f.get(), str)) {
                LogUtil.i(b(str), "doIfInstalled: unzip fail -> async upgrade Hpk");
                h5ProPreloadCbk.onSuccess();
                h5ProPreloadCbk = null;
            }
            b(str, h5ProPreloadCbk, true);
            return;
        }
        if (j(str)) {
            LogUtil.i(b(str), "doIfInstalled: forceUpdate");
            if (HpkManager.e.isAsyncUpgradeHpk(this.f.get(), str)) {
                LogUtil.i(b(str), "doIfInstalled: forceUpdate -> async upgrade Hpk");
                h5ProPreloadCbk.onSuccess();
                h5ProPreloadCbk = null;
            }
            b(str, h5ProPreloadCbk, true);
            return;
        }
        h5ProPreloadCbk.onSuccess();
    }

    private void b(final String str, final H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk, final boolean z) {
        e(str, new DownloadCbk() { // from class: com.huawei.health.h5pro.webkit.QuickPackageManager.1
            @Override // com.huawei.health.h5pro.webkit.QuickPackageManager.DownloadCbk
            public void onNewVersion() {
                LogUtil.i(QuickPackageManager.b(str), "downloadHpk: onNewVersion -> " + z);
                HpkManager.e.setAsyncUpgradeHpkFlag((Context) QuickPackageManager.this.f.get(), str);
                if (h5ProPreloadCbk == null) {
                    LogUtil.i(QuickPackageManager.b(str), "downloadHpk: onNewVersion -> async upgrade Hpk");
                    return;
                }
                if (!QuickPackageManager.this.f(str)) {
                    LogUtil.i(QuickPackageManager.b(str), "downloadHpk: onNewVersion -> hpk installation failed");
                    h5ProPreloadCbk.onFailure(-1, "hpk installation failed");
                } else {
                    if (!z) {
                        QuickPackageManager.this.c(H5ProInstanceStatus.CONFIG_PREPARED);
                    }
                    h5ProPreloadCbk.onSuccess();
                }
            }

            @Override // com.huawei.health.h5pro.webkit.QuickPackageManager.DownloadCbk
            public void onSuccess() {
                LogUtil.i(QuickPackageManager.b(str), "downloadHpk: onSuccess");
                HpkManager.e.setAsyncUpgradeHpkFlag((Context) QuickPackageManager.this.f.get(), str);
                H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk2 = h5ProPreloadCbk;
                if (h5ProPreloadCbk2 == null) {
                    LogUtil.i(QuickPackageManager.b(str), "downloadHpk: onSuccess -> async upgrade Hpk");
                } else {
                    h5ProPreloadCbk2.onSuccess();
                }
            }

            @Override // com.huawei.health.h5pro.webkit.QuickPackageManager.DownloadCbk
            public void onFailure(int i, String str2) {
                LogUtil.e(QuickPackageManager.b(str), "downLoadHpk: onFailure -> errCode: " + i + ", errMsg: " + str2);
                H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk2 = h5ProPreloadCbk;
                if (h5ProPreloadCbk2 == null) {
                    LogUtil.w(QuickPackageManager.b(str), "downloadHpk: onFailure -> async upgrade Hpk");
                } else if (z) {
                    LogUtil.w(QuickPackageManager.b(str), "downloadHpk: Forced update failed");
                    h5ProPreloadCbk.onSuccess();
                } else {
                    h5ProPreloadCbk2.onFailure(i, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(String str) {
        boolean zInstallDownloadedHpk;
        synchronized (this.d) {
            LogUtil.i(b(str), "installDownloadedHpk");
            zInstallDownloadedHpk = HpkManager.e.installDownloadedHpk(this.f.get(), str);
        }
        return zInstallDownloadedHpk;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProPackageManager
    public String joinUrl(String str) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            this.e = getAppInfo(str);
        }
        if (TextUtils.isEmpty(this.e.getBaseUrl())) {
            this.e.setPkgName(str);
            this.e.setBaseUrl(AppInfoUtil.getInstance().getBaseUrl(str));
        }
        sb.append(this.e.getBaseUrl());
        sb.append("/h5pro/");
        sb.append(str);
        sb.append("/");
        sb.append(d(str));
        sb.append("/entry/index.html");
        return sb.toString();
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProPackageManager
    public H5ProAppInfo getAppInfo(String str) {
        if (this.e != null) {
            return this.e;
        }
        H5ProAppInfo h5ProAppInfo = new H5ProAppInfo();
        h5ProAppInfo.setPkgName(str);
        h5ProAppInfo.setH5ProAppType(H5ProAppInfo.H5ProAppType.H5_MINI_PROGRAM);
        try {
            JSONObject jSONObject = new JSONObject(readManifestJson(str));
            h5ProAppInfo.setAppId(jSONObject.optString("app_id"));
            h5ProAppInfo.setCertPrint(jSONObject.optString("cert_print"));
            h5ProAppInfo.setAppName(jSONObject.optString("app_name"));
            h5ProAppInfo.setPkgName(jSONObject.optString(com.tencent.connect.common.Constants.PARAM_PKG_NAME));
            h5ProAppInfo.setVersion(jSONObject.optString("version"));
            h5ProAppInfo.setBaseUrl(AppInfoUtil.getInstance().getBaseUrl(str));
            this.e = h5ProAppInfo;
            return this.e;
        } catch (IOException e) {
            LogUtil.e(b(str), "getAppInfo==>readFileContent error", e.getMessage());
            return new H5ProAppInfo();
        } catch (JSONException e2) {
            LogUtil.e(b(str), "getAppInfo==>json parse error", e2.getMessage());
            return new H5ProAppInfo();
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProPackageManager
    public boolean preInstallHpk(final String str) {
        final boolean[] zArr = {false};
        if (H5AppLockUtil.lock(str, 0L)) {
            try {
                try {
                    a(str, new H5ProAppLoader.H5ProPreloadCbk() { // from class: com.huawei.health.h5pro.webkit.QuickPackageManager.4
                        @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
                        public void onSuccess() {
                            zArr[0] = true;
                            LogUtil.i(QuickPackageManager.b(str), "preInstallHpk: onSuccess");
                        }

                        @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
                        public void onFailure(int i, String str2) {
                            LogUtil.e(QuickPackageManager.b(str), "preInstallHpk: onFailure -> " + str2);
                        }
                    });
                } catch (IOException e) {
                    LogUtil.e(b(str), "preInstallHpk: exception -> " + e.getMessage());
                }
            } finally {
                H5AppLockUtil.unLock(str);
            }
        }
        return zArr[0];
    }

    private String k(String str) {
        return h(str) + "/init.em";
    }

    private String h(String str) {
        return this.f7034c + "/" + str;
    }

    private void c(String str) throws IOException {
        File file = new File(k(str));
        LogUtil.i(b(str), "createIfNotExistInitFile -> " + file.exists());
        if (file.exists()) {
            return;
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
    }

    private String e(String str) throws FileNotFoundException {
        File file = new File(k(str));
        if (!file.exists()) {
            if (file.getParentFile().exists()) {
                FileDownloadManager.deleteFiles(h(str), true);
            }
            LogUtil.e(b(str), "init.em not created!");
            throw new FileNotFoundException("init.em not created");
        }
        return String.valueOf(file.lastModified());
    }

    private String d(String str) throws FileNotFoundException {
        return HpkManager.e.getInstallDirNamePrefix(e(str)) + EnvironmentHelper.getInstance().getUserFlag();
    }

    public String readManifestJson(String str) throws IOException {
        String str2;
        synchronized (this.d) {
            if (TextUtils.isEmpty(this.i)) {
                this.i = p(m(str));
            }
            str2 = this.i;
        }
        return str2;
    }

    private String t(String str) throws FileNotFoundException {
        return l(str) + "/preRequests.json";
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProPackageManager
    public String readPreRequestsJson(String str) {
        String strP;
        synchronized (this.d) {
            try {
                try {
                    LogUtil.i(b(str), "readPreRequestsJson enter");
                    strP = p(t(str));
                } catch (FileNotFoundException unused) {
                    return "";
                } catch (IOException e) {
                    LogUtil.e(b(str), "readPreRequestsJson IOException: " + e.getMessage());
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(H5ProInstanceStatus h5ProInstanceStatus) {
        H5ProInstanceStatusListener h5ProInstanceStatusListener;
        WeakReference<H5ProInstanceStatusListener> weakReference = this.f7033b;
        if (weakReference == null || (h5ProInstanceStatusListener = weakReference.get()) == null) {
            return;
        }
        h5ProInstanceStatusListener.onStatusChanged(h5ProInstanceStatus);
    }

    private boolean b(boolean z, String str, H5ProVersionMeta h5ProVersionMeta) throws JSONException, IOException {
        String latestVersion = h5ProVersionMeta.getLatestVersion();
        if (z) {
            String strE = e(str, latestVersion);
            if ("".equals(strE)) {
                return false;
            }
            if (strE == null) {
                LogUtil.w(b(str), true, "[RELEASE]isDownloadHpk: parse fail, latestVersion -> " + latestVersion);
                return true;
            }
            String minH5Version = h5ProVersionMeta.getMinH5Version();
            if (!TextUtils.isEmpty(strE) && !TextUtils.isEmpty(minH5Version)) {
                LogUtil.i(b(str), true, "[RELEASE]isDownloadHpk: minH5Version -> " + minH5Version);
                if (HpkManager.e.versionCompare(strE, minH5Version) < 0) {
                    return true;
                }
            }
            return e(h5ProVersionMeta, str);
        }
        LogUtil.i(b(str), true, "[RELEASE]isDownloadHpk: isInstalled -> false, latestVersion -> " + latestVersion);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            String strOptString = new File(m(str)).exists() ? new JSONObject(readManifestJson(str)).optString("version", null) : null;
            if (!TextUtils.isEmpty(strOptString) && HpkManager.e.versionCompare(strOptString, str2) == 0) {
                LogUtil.i(b(str), true, "[RELEASE]isDownloadHpk: currentVersion -> " + strOptString);
                return "";
            }
            LogUtil.i(b(str), true, "[RELEASE]isDownloadHpk: currentVersion -> " + strOptString + ", latestVersion -> " + str2);
            return strOptString;
        } catch (IOException | JSONException e) {
            LogUtil.w(b(str), true, "[RELEASE]isDownloadHpk: exception -> " + e.getMessage());
            return null;
        }
    }

    private boolean e(H5ProVersionMeta h5ProVersionMeta, String str) {
        H5ProVersionUpgradeExtApi versionUpgradeExtApi = H5ProResidentExtManager.getVersionUpgradeExtApi();
        if (versionUpgradeExtApi == null) {
            return true;
        }
        boolean zIsSupportUpgrade = versionUpgradeExtApi.isSupportUpgrade(h5ProVersionMeta);
        if (!zIsSupportUpgrade) {
            LogUtil.i(b(str), true, "[RELEASE]isHostAppSupportUpgrade: false, minAppVersion=" + h5ProVersionMeta.getMinAppVersion());
        }
        return zIsSupportUpgrade;
    }
}
