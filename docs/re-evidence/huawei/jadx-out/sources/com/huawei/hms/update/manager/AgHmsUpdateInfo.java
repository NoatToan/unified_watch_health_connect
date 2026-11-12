package com.huawei.hms.update.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.update.http.HttpWiseContentHelper;
import com.huawei.hms.update.http.WiseContentUrlHelper;
import com.huawei.hms.utils.AgHmsUpdateState;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class AgHmsUpdateInfo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AgHmsUpdateInfo f16710c = new AgHmsUpdateInfo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f16711a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16712b;

    static class CheckTimeoutRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AgHmsUpdateInfo f16716a;

        public CheckTimeoutRunnable(AgHmsUpdateInfo agHmsUpdateInfo) {
            this.f16716a = agHmsUpdateInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.w("CheckAgHmsUpdateInfo", "updateSDK check timeout, set NOT_NEED_UPDATE");
            this.f16716a.a(HmsCheckedState.NOT_NEED_UPDATE, 0);
        }
    }

    private AgHmsUpdateInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(Context context) {
        if (context == null) {
            HMSLog.e("CheckAgHmsUpdateInfo", "<getHmsAuth> context is null");
            return "false";
        }
        String strSyncGetUrl = WiseContentUrlHelper.syncGetUrl(context);
        if (TextUtils.isEmpty(strSyncGetUrl)) {
            HMSLog.e("CheckAgHmsUpdateInfo", "<getHmsAuth> get url failed.");
            return "false";
        }
        HMSLog.i("CheckAgHmsUpdateInfo", "<getHmsAuth> get url successful.");
        String strSyncGetContent = HttpWiseContentHelper.syncGetContent(context, strSyncGetUrl);
        if (TextUtils.isEmpty(strSyncGetContent)) {
            HMSLog.e("CheckAgHmsUpdateInfo", "<getHmsAuth> download h5 config failed.");
            return "false";
        }
        HMSLog.i("CheckAgHmsUpdateInfo", "<getHmsAuth> download h5 config successful.");
        return a(strSyncGetContent);
    }

    public static AgHmsUpdateInfo getInstance() {
        return f16710c;
    }

    public void checkHmsAuthAndUpdateInfo(final Context context) {
        Exception e;
        String str;
        HMSLog.i("CheckAgHmsUpdateInfo", "<checkHmsAuthAndUpdateInfo> enter");
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.huawei.hms.update.manager.AgHmsUpdateInfo.1
            @Override // java.util.concurrent.Callable
            public String call() {
                return AgHmsUpdateInfo.this.b(context);
            }
        });
        try {
            Executors.newSingleThreadExecutor().execute(futureTask);
            str = (String) futureTask.get(10000L, TimeUnit.MILLISECONDS);
            try {
                HMSLog.i("CheckAgHmsUpdateInfo", "authTask get recommendV3: " + str);
            } catch (InterruptedException e2) {
                e = e2;
                futureTask.cancel(true);
                HMSLog.w("CheckAgHmsUpdateInfo", "authTask get result has exception: " + e.getMessage());
            } catch (CancellationException e3) {
                e = e3;
                futureTask.cancel(true);
                HMSLog.w("CheckAgHmsUpdateInfo", "authTask get result has exception: " + e.getMessage());
            } catch (ExecutionException e4) {
                e = e4;
                futureTask.cancel(true);
                HMSLog.w("CheckAgHmsUpdateInfo", "authTask get result has exception: " + e.getMessage());
            } catch (RejectedExecutionException e5) {
                e = e5;
                futureTask.cancel(true);
                HMSLog.w("CheckAgHmsUpdateInfo", "authTask get result has exception: " + e.getMessage());
            } catch (TimeoutException e6) {
                e = e6;
                futureTask.cancel(true);
                HMSLog.w("CheckAgHmsUpdateInfo", "authTask get result has exception: " + e.getMessage());
            }
        } catch (InterruptedException | CancellationException | ExecutionException | RejectedExecutionException | TimeoutException e7) {
            e = e7;
            str = "false";
        }
        if ("false".equalsIgnoreCase(str)) {
            AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
            HMSLog.w("CheckAgHmsUpdateInfo", "not need to check update, recommendV3: " + str);
            return;
        }
        this.f16712b = false;
        this.f16711a.postDelayed(new CheckTimeoutRunnable(this), 10000L);
        a(context);
    }

    private String a(String str) {
        String str2 = "false";
        try {
            String string = new JSONObject(str).getJSONObject("hmscoreAuth").getString("recommendV3");
            str2 = ("true".equalsIgnoreCase(string) || "false".equalsIgnoreCase(string)) ? string : "false";
            HMSLog.i("CheckAgHmsUpdateInfo", "<parseHmsAuthJson> parse H5 config successful, recommendV3: " + str2);
            return str2;
        } catch (RuntimeException e) {
            HMSLog.e("CheckAgHmsUpdateInfo", "parse H5 config RuntimeException: " + e.getMessage());
            return str2;
        } catch (JSONException e2) {
            HMSLog.e("CheckAgHmsUpdateInfo", "parse H5 config JSONException: " + e2.getMessage());
            return str2;
        }
    }

    private void a(Context context) {
        UpdateSdkAPI.checkTargetAppUpdate(context.getApplicationContext(), "com.huawei.hwid", new CheckUpdateCallBack() { // from class: com.huawei.hms.update.manager.AgHmsUpdateInfo.2
            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketInstallInfo(Intent intent) {
                HMSLog.i("CheckAgHmsUpdateInfo", "<onMarketInstallInfo> intent: ".concat(intent == null ? "is null" : "not null"));
                AgHmsUpdateInfo.this.a(HmsCheckedState.NOT_NEED_UPDATE, 0);
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketStoreError(int i) {
                HMSLog.e("CheckAgHmsUpdateInfo", "<onMarketStoreError> responseCode: " + i);
                AgHmsUpdateInfo.this.a(HmsCheckedState.NOT_NEED_UPDATE, 0);
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateInfo(Intent intent) {
                HMSLog.i("CheckAgHmsUpdateInfo", "<onUpdateInfo> intent: ".concat(intent == null ? "is null" : "not null"));
                AgHmsUpdateInfo.this.a(intent);
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateStoreError(int i) {
                HMSLog.e("CheckAgHmsUpdateInfo", "<onUpdateStoreError> responseCode: " + i);
                AgHmsUpdateInfo.this.a(HmsCheckedState.NOT_NEED_UPDATE, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        try {
            int intExtra = safeIntent.getIntExtra("status", -99);
            HMSLog.i("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> status is " + intExtra);
            String stringExtra = safeIntent.getStringExtra(UpdateKey.FAIL_REASON);
            if (!TextUtils.isEmpty(stringExtra)) {
                HMSLog.e("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> reason is " + stringExtra);
            }
            if (intExtra != 7) {
                if (intExtra == 3) {
                    HMSLog.e("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> UpdateStatusCode.NO_UPGRADE_INFO");
                    a(HmsCheckedState.NOT_NEED_UPDATE, 0);
                    return;
                } else {
                    HMSLog.e("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> other CHECK_FAILURE");
                    a(HmsCheckedState.NOT_NEED_UPDATE, 0);
                    return;
                }
            }
            Serializable serializableExtra = safeIntent.getSerializableExtra(UpdateKey.INFO);
            if (serializableExtra instanceof ApkUpgradeInfo) {
                StringBuilder sb = new StringBuilder("HMS new version code: ");
                ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializableExtra;
                sb.append(apkUpgradeInfo.getVersionCode_());
                HMSLog.i("CheckAgHmsUpdateInfo", sb.toString());
                a(HmsCheckedState.NEED_UPDATE, apkUpgradeInfo.getVersionCode_());
            }
        } catch (Throwable th) {
            HMSLog.e("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> intent has some error" + th.getMessage());
            a(HmsCheckedState.NOT_NEED_UPDATE, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HmsCheckedState hmsCheckedState, int i) {
        synchronized (this) {
            if (this.f16712b) {
                return;
            }
            AgHmsUpdateState.getInstance().setCheckedState(hmsCheckedState);
            AgHmsUpdateState.getInstance().setTargetVersionCode(i);
            a();
            this.f16712b = true;
        }
    }

    private void a() {
        this.f16711a.removeCallbacksAndMessages(null);
    }
}
