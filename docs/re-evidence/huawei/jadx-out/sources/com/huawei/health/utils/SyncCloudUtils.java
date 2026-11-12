package com.huawei.health.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.C;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.request.CustomConfigFactory;
import com.huawei.health.marketing.request.RespSetCustomConfig;
import com.huawei.health.marketing.request.SetCustomConfigApi;
import com.huawei.health.marketing.request.SetCustomConfigReq;
import com.huawei.health.utils.SyncCloudUtils;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.SyncApi;
import com.huawei.hihealth.util.HealthSyncUtil;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.lon;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class SyncCloudUtils {

    public enum AppStartType {
        COLD_START,
        HOT_START
    }

    private SyncCloudUtils() {
    }

    public static void e(int i, int i2, int i3) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncAction(i);
        hiSyncOption.setSyncDataType(i2);
        hiSyncOption.setPushAction(i3);
        LogUtil.a("syncCloudUtils", "syncCloud!");
        HiHealthManager.d(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public static void e(int i, List<Integer> list, int i2) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncAction(i);
        hiSyncOption.setSyncDataTypes(list);
        hiSyncOption.setPushAction(i2);
        LogUtil.a("syncCloudUtils", "syncCloud!");
        HiHealthManager.d(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public static void a(AppStartType appStartType) {
        synchronized (SyncCloudUtils.class) {
            if (!LoginInit.getInstance(BaseApplication.getContext()).getIsLogined()) {
                ReleaseLogUtil.d("syncCloudUtils", "syncCloud isLogouted, return!");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iD = HiDateUtil.d(jCurrentTimeMillis);
            if (appStartType == AppStartType.COLD_START) {
                d(jCurrentTimeMillis, iD);
            } else {
                b(jCurrentTimeMillis, iD);
            }
        }
    }

    private static void d(long j, int i) {
        long jD = SharedPreferenceManager.d(Integer.toString(10000), "health_app_cold_start_last_execute_time", 0L);
        int i2 = 0;
        int iC = SharedPreferenceManager.c(Integer.toString(10000), "health_app_cold_start_last_execute_date", 0);
        int iC2 = SharedPreferenceManager.c(Integer.toString(10000), "health_app_cold_start_today_execute_count", 0);
        if (i != iC) {
            SharedPreferenceManager.d(Integer.toString(10000), "health_app_cold_start_last_execute_date", i);
            SharedPreferenceManager.d(Integer.toString(10000), "health_app_cold_start_today_execute_count", 0);
        } else {
            i2 = iC2;
        }
        if (j - jD <= 1800000 || i2 >= 20) {
            LogUtil.a("syncCloudUtils", "sync is too frequent,last=", Long.valueOf(jD), ",todayCount=", Integer.valueOf(i2));
            return;
        }
        LogUtil.a("syncCloudUtils", "Cold start: full data incremental sync (fitness included), count: " + i2);
        a();
        SharedPreferenceManager.c(Integer.toString(10000), "health_app_cold_start_last_execute_time", j);
        SharedPreferenceManager.d(Integer.toString(10000), "health_app_cold_start_today_execute_count", i2 + 1);
    }

    private static void b(long j, int i) {
        if (j - SharedPreferenceManager.d(Integer.toString(10000), "health_app_hot_start_last_execute_time", 0L) > 600000) {
            LogUtil.a("syncCloudUtils", "Hot start: full data incremental sync (fitness included)");
            a();
            SharedPreferenceManager.c(Integer.toString(10000), "health_app_hot_start_last_execute_time", j);
        } else {
            LogUtil.a("syncCloudUtils", "Hot start: core data incremental sync (daily activity only)");
            e(0, new ArrayList<Integer>() { // from class: com.huawei.health.utils.SyncCloudUtils.4
                {
                    add(1);
                    add(10004);
                }
            }, 0);
        }
    }

    private static void a() {
        e(0, 20000, 0);
        try {
            HealthSyncUtil.b(SyncApi.FITNESS);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("syncCloudUtils", "FitnessAdvice syncData failed");
        }
        try {
            HealthSyncUtil.b(SyncApi.HEALTH_LIFE);
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("syncCloudUtils", "HealthLifeModel syncData failed");
        }
    }

    public static void d(final Handler handler) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iqw
                @Override // java.lang.Runnable
                public final void run() {
                    SyncCloudUtils.d(handler);
                }
            });
            return;
        }
        if (handler == null) {
            LogUtil.a("syncCloudUtils", "handler is null!");
            return;
        }
        if (Utils.o()) {
            return;
        }
        Context context = BaseApplication.getContext();
        int iE = CommonUtil.e(SharedPreferenceManager.e(context, Integer.toString(10000), "syncTime"), 0);
        if (iE < CommonUtil.e(lon.c().d("app_hot_start_max_sync_times"), 10)) {
            HiBroadcastUtil.h(context);
            handler.sendEmptyMessageDelayed(15, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            SharedPreferenceManager.e(context, Integer.toString(10000), "syncTime", Integer.toString(iE + 1), null);
        }
        int iD = HiDateUtil.d(System.currentTimeMillis());
        if (CommonUtil.e(SharedPreferenceManager.e(context, Integer.toString(10000), "oldDay"), 0) != iD) {
            SharedPreferenceManager.e(context, Integer.toString(10000), "syncTime", Integer.toString(0), null);
            SharedPreferenceManager.e(context, Integer.toString(10000), "oldDay", Integer.toString(iD), null);
        }
    }

    public static void c(long j) {
        LogUtil.a("syncCloudUtils", "enter updateSyncFinishTime: ", Long.valueOf(j));
        HashMap map = new HashMap(1);
        map.put("syncFinishTime", String.valueOf(j));
        c cVar = new c();
        cVar.e(map);
        SetCustomConfigReq setCustomConfigReq = new SetCustomConfigReq();
        SetCustomConfigApi setCustomConfigApi = (SetCustomConfigApi) oet.d().e(SetCustomConfigApi.class);
        CustomConfigFactory customConfigFactory = new CustomConfigFactory(BaseApplication.getContext());
        setCustomConfigApi.setCustomConfig(setCustomConfigReq.getUrl(), customConfigFactory.getHeaders(), ofe.c(customConfigFactory.getBody(cVar))).enqueue(new ResultCallback<RespSetCustomConfig>() { // from class: com.huawei.health.utils.SyncCloudUtils.2
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(Response<RespSetCustomConfig> response) {
                LogUtil.a("syncCloudUtils", "updateSyncFinishTime result: ", Boolean.valueOf(response.isOK()));
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("syncCloudUtils", "updateSyncFinishTime response is error.");
            }
        });
    }

    /* JADX INFO: loaded from: classes32.dex */
    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName(WatchFaceConstant.INSTALL_CUSTOM_CONFIG_KEY)
        private Map<String, String> f10402c;

        private c() {
        }

        public void e(Map<String, String> map) {
            this.f10402c = map;
        }

        public String toString() {
            return "CustomConfigReq{customConfig=" + this.f10402c + '}';
        }
    }
}
