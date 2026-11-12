package com.huami.watch.transport.httpsupport.global;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.AnalysisStage;
import com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor;
import com.huami.watch.transport.httpsupport.control.assist.WearHttpCompanion;
import com.huami.watch.transport.httpsupport.control.service.HttpTransportManager;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.transporter.server.DuplexDataExchangeService;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.lang.ref.WeakReference;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class GlobalDataSyncKicker {
    public static final int KICK_CODE_APP_2_SRV = 1;
    public static final int KICK_CODE_ASSIST_2_CLOUD = 8;
    public static final int KICK_CODE_ASSIST_2_WATCH = 16;
    public static final int KICK_CODE_ASSIST_SYNC_DATA = 64;
    public static final int KICK_CODE_OF_ALL = 125;
    public static final int KICK_CODE_SRV_2_APP = 32;
    public static final int KICK_CODE_SRV_2_ASSIST = 4;
    private static final boolean c = GlobalDefine.IS_WATCH;
    private static GlobalDataSyncKicker d;
    private static WeakReference<TaskManager> e;
    private HttpHealthGetManager a;
    private TaskManager b = null;

    public static class HttpHealthGetManager {
        public static final String TAG = "GET_HEALTH_SYNC";
        private static final String b = "/latestEffectiveUpdateTime";
        private static final boolean c = false;
        private static final String d = "/users/";
        private static final String e = "https://api-watch.huami.com";
        private static final String f = "https://api-watch-staging.huami.com";
        public OkHttpClient a;

        /* JADX INFO: Access modifiers changed from: private */
        public String b(Context context) {
            try {
                Request.Builder builder = new Request.Builder();
                PublicParamsBuilder publicParamsBuilder = WearHttpCompanion.getInstance().getHttpTransporter().getPublicParamsBuilder();
                publicParamsBuilder.fillPublicHeader(context, null, builder);
                builder.url(getCurrentEffectiveMinutesUrl(publicParamsBuilder.getUserId()));
                Request requestBuild = builder.build();
                if (this.a == null) {
                    this.a = new OkHttpClient();
                }
                Log.i(TAG, "request:" + requestBuild.toString());
                SolidLogger.getInstance().with(TAG, "request:" + requestBuild.toString());
                Response responseExecute = this.a.newCall(requestBuild).execute();
                String strString = responseExecute.body().string();
                Log.i(TAG, "response:" + responseExecute.toString() + "--body--" + strString);
                SolidLogger.getInstance().with(TAG, "response:" + responseExecute.toString() + "--body--" + strString);
                JSONObject jSONObject = new JSONObject(strString);
                String strOptString = jSONObject.optString("lastSyncTime");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(strOptString, "0")) {
                    return strOptString;
                }
                long jOptLong = jSONObject.optLong("effectiveTime") * 1000;
                long offset = jOptLong - ((long) TimeZone.getDefault().getOffset(jOptLong));
                Log.i(TAG, "effectiveTime UTC:" + offset);
                return String.valueOf(offset);
            } catch (Exception e2) {
                e2.printStackTrace();
                SolidLogger.getInstance().with(TAG, "Exception:" + e2.toString());
                return EcgData.DEFAULT_DIGIT_VALUE;
            }
        }

        public String getCurrentEffectiveMinutesUrl(String str) {
            return getHost() + d + str + b;
        }

        public String getHost() {
            return "https://api-watch.huami.com";
        }
    }

    public class a extends Task {
        public final /* synthetic */ Context g;
        public final /* synthetic */ ProcessStateMonitor.Jack h;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task.RunningStatus runningStatus, Context context, ProcessStateMonitor.Jack jack, boolean z) {
            super(runningStatus);
            this.g = context;
            this.h = jack;
            this.i = z;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            GlobalDataSyncKicker.this.f(this.g, this.h, this.i, GlobalDataSyncKicker.this.a.b(this.g));
            Log.i(HttpHealthGetManager.TAG, "kicked for health");
            SolidLogger.getInstance().with(HttpHealthGetManager.TAG, "kicked for health");
            return null;
        }
    }

    private GlobalDataSyncKicker() {
    }

    private void c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (GlobalDefine.DEBUG_COMPANION) {
            try {
                Log.i(GlobalDefine.TAG_COMPANION, "****handleAssist2Cloud 同步，当前: mobile:" + connectivityManager.getNetworkInfo(0).isConnected() + "\nwifi:" + connectivityManager.getNetworkInfo(1).isConnected() + "\nactive:" + activeNetworkInfo.getTypeName());
            } catch (Exception unused) {
            }
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "****handleAssist2Cloud 同步，当前: mobile:" + networkInfo.isConnected() + "\nwifi:" + networkInfo2.isConnected() + "\nactive:" + activeNetworkInfo.getTypeName());
        } catch (Exception unused2) {
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        WearHttpCompanion wearHttpCompanion = WearHttpCompanion.getInstance();
        if (wearHttpCompanion != null) {
            wearHttpCompanion.tryProcessCachedRequestWhileNetWorkAvalible();
            return;
        }
        if (GlobalDefine.DEBUG_SRV) {
            Log.i(GlobalDefine.TAG_SRV, "***同步 WearHttpCompanion(请求网络用的哟) 初始化失败 !*");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "***WearHttpCompanion(请求网络用的哟) 同步 初始化失败 !*");
    }

    private void d() {
        WearHttpCompanion wearHttpCompanion = WearHttpCompanion.getInstance();
        if (wearHttpCompanion == null) {
            return;
        }
        wearHttpCompanion.tryProcessCachedResponseWhileChannelAvalible();
    }

    private void e(Context context) {
        g(context, new Intent());
        boolean z = Settings.System.getInt(context.getContentResolver(), "com.huami.watch.extra.DEVICE_CONNECTION_STATUS", 0) > 0 || Settings.System.getInt(context.getContentResolver(), "com.huami.watch.extra.conn.ctrl", 0) > 0;
        if (GlobalDefine.DEBUG_BLT) {
            StringBuilder sb = new StringBuilder();
            sb.append("****handleSrv2Assist 同步，当前: ");
            sb.append(z ? "已连接" : "断开了");
            Log.i(GlobalDefine.TAG_BLT, sb.toString());
        }
        SolidLogger solidLogger = SolidLogger.getInstance();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("****handleSrv2Assist 同步，当前: ");
        sb2.append(z ? "已连接" : "断开了");
        solidLogger.with(GlobalDefine.TAG_BLT, sb2.toString());
        if (z) {
            HttpTransportManager httpTransportManager = HttpTransportManager.getInstance(context);
            if (httpTransportManager == null) {
                if (GlobalDefine.DEBUG_SRV) {
                    Log.i(GlobalDefine.TAG_SRV, "***Http Transport Manager 初始化失败 !*");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "***Http Transport Manager 初始化失败 !*");
            } else {
                if (GlobalDefine.DEBUG_SRV) {
                    Log.i(GlobalDefine.TAG_SRV, "handleSrv2Assist===> 即将出发缓存任务");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "handleSrv2Assist===> 即将出发缓存任务");
                httpTransportManager.tryProcessCachedRequestWhilePhoneAvalible(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, ProcessStateMonitor.Jack jack, boolean z, String str) {
        ProcessStateMonitor processStateMonitorFindProcessStateMonitor = AnalysisStage.getInstance().findProcessStateMonitor(jack.targetAtPackage());
        if (processStateMonitorFindProcessStateMonitor == null) {
            processStateMonitorFindProcessStateMonitor = new ProcessStateMonitor();
            processStateMonitorFindProcessStateMonitor.inJack(jack);
            AnalysisStage.getInstance().addReportArrivalListener(processStateMonitorFindProcessStateMonitor);
        } else {
            processStateMonitorFindProcessStateMonitor.inJack(jack);
        }
        AnalysisStage.getInstance().beginNewSync(context, processStateMonitorFindProcessStateMonitor, str);
        WearHttpCompanion.getInstance().tryProcessCachedRequestWhileNetWorkAvalible();
        WearHttpCompanion.getInstance().tryProcessCachedResponseWhileChannelAvalible();
    }

    private void g(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) DuplexDataExchangeService.class);
        intent2.setAction(intent.getAction());
        intent2.putExtras(intent);
        context.startService(intent2);
    }

    public static GlobalDataSyncKicker getInstance() {
        GlobalDataSyncKicker globalDataSyncKicker;
        synchronized (GlobalDataSyncKicker.class) {
            if (d == null) {
                d = new GlobalDataSyncKicker();
            }
            globalDataSyncKicker = d;
        }
        return globalDataSyncKicker;
    }

    public DataItem genInternalEnumCollectAction(String str, String str2, String str3) {
        DataItem dataItem;
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                str = "*";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "*";
            }
            dataItem = new DataItem(null, str3, str, null);
            dataItem.setData(DataItem.PREFIX_COMPRESS);
            dataItem.addFlags(8192);
            dataItem.setState(0);
            dataItem.addExtraPair("target", str + UpdateUtils.CMD_FILTER + str2);
        }
        return dataItem;
    }

    public DataItem genInternalSyncAction(String str, String str2) {
        DataItem dataItem;
        synchronized (this) {
            dataItem = new DataItem(null, str2, str, null);
            dataItem.addFlags(8192);
            dataItem.setState(0);
            dataItem.addExtraPair("new-sync", "1");
        }
        return dataItem;
    }

    public void kick(Context context, int i) {
        synchronized (this) {
            if (c) {
                if ((i & 1) != 0) {
                    if (GlobalDefine.DEBUG_BLT) {
                        Log.i(GlobalDefine.TAG_BLT, "[KICK]----> CODE_APP_2_SRV not implement ====> ");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "[KICK]----> CODE_APP_2_SRV not implement ====> ");
                }
                if ((i & 4) != 0) {
                    if (GlobalDefine.DEBUG_BLT) {
                        Log.i(GlobalDefine.TAG_BLT, "[KICK]----> KICK_CODE_SRV_2_ASSIST  ====> ");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "[KICK]----> KICK_CODE_SRV_2_ASSIST ====> ");
                    e(context);
                }
            } else {
                if ((i & 8) != 0) {
                    if (GlobalDefine.DEBUG_BLT) {
                        Log.i(GlobalDefine.TAG_BLT, "[KICK]----> KICK_CODE_ASSIST_2_CLOUD  ====> ");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "[KICK]----> KICK_CODE_ASSIST_2_CLOUD ====> ");
                    c(context);
                }
                if ((i & 16) != 0) {
                    if (GlobalDefine.DEBUG_BLT) {
                        Log.i(GlobalDefine.TAG_BLT, "[KICK]----> KICK_CODE_ASSIST_2_WATCH  ====> ");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "[KICK]----> KICK_CODE_ASSIST_2_WATCH ====> ");
                    d();
                }
                if ((i & 64) != 0) {
                    if (GlobalDefine.DEBUG_BLT) {
                        Log.i(GlobalDefine.TAG_BLT, "[KICK]----> KICK_CODE_ASSIST_SYNC_DATA  ====> ");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "[KICK]----> KICK_CODE_ASSIST_SYNC_DATA ====> ");
                }
            }
        }
    }

    public void kick(Context context, ProcessStateMonitor.Jack jack, boolean z) {
        synchronized (this) {
            if (jack.targetAtPackage().equalsIgnoreCase("com.huami.watch.health")) {
                if (this.b == null) {
                    this.b = new TaskManager("assist-trans-load");
                }
                if (this.a == null) {
                    this.a = new HttpHealthGetManager();
                }
                this.b.next(new a(Task.RunningStatus.WORK_THREAD, context, jack, z)).execute();
            } else {
                f(context, jack, z, null);
                Log.i(HttpHealthGetManager.TAG, "kicked for other" + jack.targetAtPackage());
                SolidLogger.getInstance().with(HttpHealthGetManager.TAG, "kicked for other" + jack.targetAtPackage());
            }
        }
    }
}
