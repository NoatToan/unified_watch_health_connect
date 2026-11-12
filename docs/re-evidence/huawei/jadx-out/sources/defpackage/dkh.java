package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes26.dex */
public class dkh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f31847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dkh f31848b = new dkh();
    private static List<String> d = new ArrayList();
    private Map<String, Integer> e = new ConcurrentHashMap();

    private dkh() {
        try {
            String str = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "otaCountryCode";
            f31847a = str + File.separator + "countryCode.json";
            FileUtils.c(new File(str));
        } catch (IOException e) {
            ReleaseLogUtil.a("R_DownloadCountryCodeManager", "DownloadCountryCodeManager createDirectory IOException:", ExceptionUtils.c(e));
        }
    }

    public static dkh e() {
        return f31848b;
    }

    public static List<String> a() {
        return d;
    }

    public void e(final ResponseCallback<List<String>> responseCallback) {
        LogUtil.a("DownloadCountryCodeManager", "downloadCountryCodeListConfig enter.");
        ThreadPoolManager.c().a("DownloadCountryCodeManager", new Runnable() { // from class: dkh.4
            @Override // java.lang.Runnable
            public void run() {
                dkh.this.c(responseCallback);
            }
        });
    }

    public void c(final ResponseCallback<List<String>> responseCallback) {
        File file = new File(f31847a);
        if (file.exists() && !b()) {
            LogUtil.a("DownloadCountryCodeManager", "downloadCountryCodeListConfig from local cache");
            dkd dkdVarA = a(file);
            if (dkdVarA == null) {
                responseCallback.onResponse(-1, null);
                return;
            }
            List<String> listA = dkdVarA.a();
            d = listA;
            responseCallback.onResponse(0, listA);
            return;
        }
        LogUtil.a("DownloadCountryCodeManager", "downloadCountryCodeListConfig from cloud");
        f31848b.e("not_support_ota_auto_update_country_code", new ResponseCallback() { // from class: dkj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f31865c.a(responseCallback, i, (File) obj);
            }
        });
    }

    /* synthetic */ void a(ResponseCallback responseCallback, int i, File file) {
        if (i != 0) {
            responseCallback.onResponse(i, null);
            return;
        }
        try {
            FileUtils.e(file, new File(f31847a));
        } catch (IOException e) {
            ReleaseLogUtil.a("R_DownloadCountryCodeManager", "downloadHealthCloudCountryCodeConfig copy json file error:", ExceptionUtils.c(e));
        }
        dkd dkdVarA = a(file);
        if (dkdVarA == null) {
            responseCallback.onResponse(-1, null);
            return;
        }
        List<String> listA = dkdVarA.a();
        d = listA;
        responseCallback.onResponse(0, listA);
    }

    private void e(final String str, final ResponseCallback<File> responseCallback) {
        LogUtil.a("DownloadCountryCodeManager", "downloadHealthCloudCountryCodeConfig enter ", str);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final Integer num = this.e.get(str);
        fdy.d(d(), str, new DownloadCallback<File>() { // from class: dkh.3
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str2) {
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                ReleaseLogUtil.d("R_DownloadCountryCodeManager", "downloadCallback ", str, " finish size:", Long.valueOf(file.length()), " cost: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                Integer num2 = num;
                if (num2 != null) {
                    LogUtil.a("DownloadCountryCodeManager", "downloadCallback file update to:", num2);
                    SharedPreferenceManager.d("ota_country_code", str, num.intValue());
                }
                responseCallback.onResponse(0, file);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a("R_DownloadCountryCodeManager", "downloadHealthCloudCountryCodeConfig ", str, " error:", Integer.valueOf(i));
                responseCallback.onResponse(-1, null);
            }
        });
    }

    private dkd a(File file) {
        try {
            String strA = FileUtils.a(file, file.length());
            if (TextUtils.isEmpty(strA)) {
                ReleaseLogUtil.a("R_DownloadCountryCodeManager", "covertToCountryCodeConfig config json is empty");
                return null;
            }
            LogUtil.a("DownloadCountryCodeManager", "covertToCountryCodeConfig file: " + strA);
            dkd dkdVar = (dkd) peh.b(strA, dkd.class);
            if (dkdVar == null) {
                ReleaseLogUtil.a("R_DownloadCountryCodeManager", "covertToCountryCodeConfig json loads error");
                return null;
            }
            LogUtil.a("DownloadCountryCodeManager", "covertToCountryCodeConfig success");
            return dkdVar;
        } catch (IOException e) {
            ReleaseLogUtil.a("R_DownloadCountryCodeManager", "covertToCountryCodeConfig read app list io error:", ExceptionUtils.c(e));
            return null;
        }
    }

    private boolean b() {
        if (!j()) {
            return false;
        }
        int iC = c();
        Integer num = this.e.get("not_support_ota_auto_update_country_code");
        return num != null && num.intValue() > iC;
    }

    private boolean j() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - SharedPreferenceManager.d("not_support_ota_auto_update_country_code", "key_query_time", 0L) < 86400000) {
            ReleaseLogUtil.d("R_DownloadCountryCodeManager", "updateFileLatestVersion skip version update");
            return false;
        }
        fcz fczVarD = fdy.d("com.huawei.health_common_config", d());
        SharedPreferenceManager.c("not_support_ota_auto_update_country_code", "key_query_time", jElapsedRealtime);
        ReleaseLogUtil.d("R_DownloadCountryCodeManager", "updateFileLatestVersion get version info");
        if (fczVarD == null) {
            ReleaseLogUtil.e("R_DownloadCountryCodeManager", "updateFileLatestVersion response is null");
            return false;
        }
        List<fcw> listA = fczVarD.a();
        if (coq.d(listA)) {
            ReleaseLogUtil.e("R_DownloadCountryCodeManager", "updateFileLatestVersion fileList is empty.");
            return false;
        }
        for (fcw fcwVar : listA) {
            String strC = fcwVar.c();
            if ("not_support_ota_auto_update_country_code".equals(strC)) {
                try {
                    int i = Integer.parseInt(fcwVar.e());
                    this.e.put(strC, Integer.valueOf(i));
                    ReleaseLogUtil.d("R_DownloadCountryCodeManager", "updateFileLatestVersion ", strC, " version:", Integer.valueOf(i));
                    return true;
                } catch (NumberFormatException unused) {
                    ReleaseLogUtil.a("R_DownloadCountryCodeManager", "updateFileLatestVersion err");
                }
            }
        }
        return false;
    }

    private int c() {
        int iC = SharedPreferenceManager.c("ota_country_code", "not_support_ota_auto_update_country_code", Integer.MIN_VALUE);
        LogUtil.a("DownloadCountryCodeManager", "getResourceVersion ", "not_support_ota_auto_update_country_code", " version:", Integer.valueOf(iC));
        return iC;
    }

    private fda d() {
        HashMap map = new HashMap();
        map.put("resources", "home_page_resources");
        return new fda("com.huawei.health_common_config", map);
    }
}
