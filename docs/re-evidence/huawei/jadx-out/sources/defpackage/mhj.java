package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceManagerCommonConfigApi;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.OnlineImUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = DeviceManagerCommonConfigApi.class)
public class mhj implements DeviceManagerCommonConfigApi {
    private static final String d = File.separator + "device_manager_common_config.json";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<mhm> f41678b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41679c = new Object();

    @Override // com.huawei.health.device.api.DeviceManagerCommonConfigApi
    public void downLoadCommonConfig() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: mhk
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("DeviceManagerCommonConfigImpl", "downLoadConfigResource enter");
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("DeviceManagerCommonConfigImpl", "downloadScaleOffsetResource network error");
            return;
        }
        try {
            String str = BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "commonResource";
            FileUtils.c(new File(str));
            long jD = SharedPreferenceManager.d("device_manager_common_config_imp", "key_query_time", 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jD < 86400000) {
                LogUtil.a("DeviceManagerCommonConfigImpl", "downLoadConfigResource not update interval, lastQueryTime:", Long.valueOf(jD));
                return;
            }
            fcz fczVarD = fdy.d("com.huawei.health_common_config", b());
            if (fczVarD == null || njy.e(fczVarD.a())) {
                ReleaseLogUtil.d("R_DeviceManagerCommonConfigImpl", "downLoadConfigResource response null or getFileList isEmpty");
                return;
            }
            for (fcw fcwVar : fczVarD.a()) {
                if (Objects.equals(fcwVar.c(), "device_manager_common_config")) {
                    String strB = SharedPreferenceManager.b("device_manager_common_config_imp", "key_device_manager_common_config_version", "");
                    String strE = fcwVar.e();
                    LogUtil.a("DeviceManagerCommonConfigImpl", "downLoadConfigResource oldVersion:", strB, " currentVersion:", strE);
                    if (TextUtils.isEmpty(strE)) {
                        return;
                    }
                    SharedPreferenceManager.c("device_manager_common_config_imp", "key_query_time", jCurrentTimeMillis);
                    String str2 = str + d;
                    boolean zExists = new File(str2).exists();
                    LogUtil.a("DeviceManagerCommonConfigImpl", "downLoadConfigResource exists:", Boolean.valueOf(zExists));
                    if (!zExists) {
                        d(str2, strE);
                        return;
                    } else {
                        if (Objects.equals(strB, strE)) {
                            return;
                        }
                        d(str2, strE);
                        return;
                    }
                }
            }
        } catch (IOException unused) {
            LogUtil.j("DeviceManagerCommonConfigImpl", "downLoadConfigResource getFilesDir IOException");
        }
    }

    private void d(final String str, final String str2) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        fdy.d(b(), "device_manager_common_config", new DownloadCallback<File>() { // from class: mhj.3
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str3) {
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                ReleaseLogUtil.c("DeviceManagerCommonConfigImpl", "startToDownload size:", Long.valueOf(file.length()), " costTime: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                try {
                    FileUtils.e(file, new File(str));
                    SharedPreferenceManager.c("device_manager_common_config_imp", "key_device_manager_common_config_version", str2);
                    mhj.this.refreshCommonConfigSupportInfo();
                    OnlineImUtil.parseOnlineConfig();
                } catch (IOException unused) {
                    LogUtil.e("DeviceManagerCommonConfigImpl", "startToDownload copy json file error");
                    SharedPreferenceManager.c("device_manager_common_config_imp", "key_query_time", 0L);
                }
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                SharedPreferenceManager.c("device_manager_common_config_imp", "key_query_time", 0L);
                ReleaseLogUtil.b("R_DeviceManagerCommonConfigImpl", "startToDownload, errorCode:", Integer.valueOf(i), "throwable:", ExceptionUtils.c(th));
            }
        });
    }

    private fda b() {
        HashMap map = new HashMap();
        map.put("resources", "home_page_resources");
        return new fda("com.huawei.health_common_config", map);
    }

    @Override // com.huawei.health.device.api.DeviceManagerCommonConfigApi
    public boolean refreshCommonConfigSupportInfo() {
        synchronized (f41679c) {
            try {
                try {
                    File file = new File(BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "commonResource" + d);
                    if (!file.exists()) {
                        LogUtil.a("DeviceManagerCommonConfigImpl", "refreshCommonConfigSupportInfo file not exist");
                        a();
                        return false;
                    }
                    String strA = FileUtils.a(file, file.length());
                    if (TextUtils.isEmpty(strA)) {
                        LogUtil.a("DeviceManagerCommonConfigImpl", "refreshCommonConfigSupportInfo allJsonConfig is empty");
                        a();
                        return false;
                    }
                    SharedPreferenceManager.c("device_manager_common_config_imp", "key_device_manager_common_config", strA);
                    JSONArray jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray("featureList");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        List<mhm> list = (List) new Gson().fromJson(jSONArrayOptJSONArray.toString(), new TypeToken<List<mhm>>() { // from class: com.huawei.hwdevice.outofprocess.mgr.feature.DeviceManagerCommonConfigImpl$2
                        }.getType());
                        if (njy.e(list)) {
                            LogUtil.a("DeviceManagerCommonConfigImpl", "refreshCommonConfigSupportInfo typeInfoList is empty");
                            return false;
                        }
                        f41678b = list;
                        LogUtil.a("DeviceManagerCommonConfigImpl", "refreshCommonConfigSupportInfo supportInfoList size:", Integer.valueOf(list.size()));
                        return true;
                    }
                    LogUtil.a("DeviceManagerCommonConfigImpl", "refreshCommonConfigSupportInfo jsonArray is empty");
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                LogUtil.e("DeviceManagerCommonConfigImpl", "refreshCommonConfigSupportInfo exception", ExceptionUtils.c(e));
                return false;
            } catch (JSONException e2) {
                e = e2;
                LogUtil.e("DeviceManagerCommonConfigImpl", "refreshCommonConfigSupportInfo exception", ExceptionUtils.c(e));
                return false;
            }
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerCommonConfigApi
    public boolean isSupportFeature(String str, String str2) {
        LogUtil.a("DeviceManagerCommonConfigImpl", "isSupportFeature enter ", str, " countryCode:", str2);
        mhm mhmVarB = b(str);
        if (mhmVarB == null) {
            ReleaseLogUtil.d("R_DeviceManagerCommonConfigImpl", "isSupportFeature not in support list");
            return false;
        }
        return c(str2, mhmVarB);
    }

    private static boolean c(String str, mhm mhmVar) {
        boolean z = mhmVar.e() == 1;
        boolean zContains = mhmVar.a().contains(str);
        if (z) {
            return zContains;
        }
        return !zContains;
    }

    @Override // com.huawei.health.device.api.DeviceManagerCommonConfigApi
    public boolean hasFutureConfig(String str) {
        return Objects.nonNull(b(str));
    }

    @Override // com.huawei.health.device.api.DeviceManagerCommonConfigApi
    public <T> T getConfig(String str, Class<T> cls) {
        try {
            String strB = SharedPreferenceManager.b("device_manager_common_config_imp", "key_device_manager_common_config", "");
            if (TextUtils.isEmpty(strB)) {
                strB = CommonUtil.q(BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "commonResource" + d);
                LogUtil.d("DeviceManagerCommonConfigImpl", "getConfigString allJsonConfig = ", strB);
                if (TextUtils.isEmpty(strB)) {
                    LogUtil.a("DeviceManagerCommonConfigImpl", "getConfigString allJsonConfig is empty");
                    return null;
                }
                SharedPreferenceManager.c("device_manager_common_config_imp", "key_device_manager_common_config", strB);
            }
            Object objOpt = new JSONObject(strB).opt(str);
            if (objOpt == null) {
                return null;
            }
            return (T) HiJsonUtil.d(objOpt.toString(), (Class) cls);
        } catch (IOException | JSONException e) {
            LogUtil.e("DeviceManagerCommonConfigImpl", "refreshCommonConfigSupportInfo exception", ExceptionUtils.c(e));
            return null;
        }
    }

    private mhm b(final String str) {
        if (njy.e(f41678b) && !refreshCommonConfigSupportInfo()) {
            LogUtil.a("DeviceManagerCommonConfigImpl", "findSupportFeature supportInfoList is empty");
            return null;
        }
        LogUtil.a("DeviceManagerCommonConfigImpl", "findSupportFeature supportInfoList size:", Integer.valueOf(f41678b.size()));
        return f41678b.stream().filter(new Predicate() { // from class: mhn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.equals(str, ((mhm) obj).c());
            }
        }).findFirst().orElse(null);
    }

    private void a() {
        SharedPreferenceManager.c("device_manager_common_config_imp", "key_query_time", 0L);
        SharedPreferenceManager.c("device_manager_common_config_imp", "key_device_manager_common_config_version", "");
    }
}
