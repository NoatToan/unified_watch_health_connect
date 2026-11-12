package com.huawei.openalliance.ad.download.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.rc;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bu;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18578a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18579b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static k f18580c;
    private Context d;
    private Map<String, AppDownloadTask> e = new ConcurrentHashMap();
    private long f = 3600000;
    private String g = Constants.TIMEOUT_TASK_ID + hashCode();
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.download.app.k.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            SafeIntent safeIntent = new SafeIntent(intent);
            String dataString = safeIntent.getDataString();
            if (TextUtils.isEmpty(dataString)) {
                hw.c("GPDownloadManager", "itRer dataString is empty");
                return;
            }
            String strSubstring = dataString.substring(8);
            try {
                if ("android.intent.action.PACKAGE_ADDED".equals(safeIntent.getAction())) {
                    k.this.a(strSubstring);
                }
            } catch (Throwable th) {
                hw.c("GPDownloadManager", "itRer: %s", th.getClass().getSimpleName());
            }
        }
    };

    public void a(String str, AppDownloadTask appDownloadTask) {
        synchronized (f18579b) {
            hw.a("GPDownloadManager", "task size before: %s", Integer.valueOf(this.e.size()));
            for (Map.Entry entry : new ConcurrentHashMap(this.e).entrySet()) {
                hw.a("GPDownloadManager", "entry key: %s time: %s", entry.getKey(), Long.valueOf(((AppDownloadTask) entry.getValue()).R()));
                if (System.currentTimeMillis() - ((AppDownloadTask) entry.getValue()).R() > PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
                    this.e.remove(entry.getKey());
                }
            }
            this.e.put(str, appDownloadTask);
            hw.b("GPDownloadManager", "task size after: %s, packageName: %s time: %s", Integer.valueOf(this.e.size()), str, this.e.get(str) != null ? Long.valueOf(this.e.get(str).R()) : null);
        }
    }

    public void a() {
        hw.b("GPDownloadManager", "registerAppInstReceiver");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        as.a(this.d, this.h, intentFilter);
        d();
    }

    private void d() {
        bu.a(this.g);
        bu.a(new a(), this.g, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        hw.b("GPDownloadManager", "unRegisterAppInstReceiver");
        this.d.unregisterReceiver(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ContentRecord contentRecordA;
        hw.b("GPDownloadManager", "dealWithAdd");
        synchronized (f18579b) {
            if (this.e.containsKey(str)) {
                AppDownloadTask appDownloadTask = this.e.get(str);
                this.e.remove(str);
                hw.b("GPDownloadManager", "task size after remove: %s", Integer.valueOf(this.e.size()));
                rc rcVarC = appDownloadTask.C();
                if (rcVarC != null && (contentRecordA = rcVarC.a()) != null && contentRecordA.ag() != null) {
                    rcVarC.a(Integer.valueOf(appDownloadTask.D()), appDownloadTask.F(), appDownloadTask.P(), contentRecordA.ag().u(), appDownloadTask.G());
                    new com.huawei.openalliance.ad.analysis.c(this.d).a(contentRecordA, contentRecordA.ag().u(), (AppDownloadTask) null);
                }
            }
        }
    }

    static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (k.f18580c == null) {
                return;
            }
            k.f18580c.c();
        }

        private a() {
        }
    }

    public static k a(Context context) {
        k kVar;
        synchronized (f18578a) {
            if (f18580c == null) {
                f18580c = new k(context);
            }
            kVar = f18580c;
        }
        return kVar;
    }

    private k(Context context) {
        this.d = context.getApplicationContext();
    }
}
