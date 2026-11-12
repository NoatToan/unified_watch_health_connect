package com.huawei.haf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.huawei.haf.common.os.MemoryUtils;
import com.huawei.haf.common.utils.ViewUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class ActivityMonitor extends ActivityStatusMonitor implements Application.ActivityLifecycleCallbacks, Callable<Activity[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityLeakCheck f5785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<Activity> f5786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5787c;
    private long d;
    private Activity j;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    ActivityMonitor(Application application) {
        super(false);
        this.f5786b = new ArrayList<>();
        this.f5785a = new ActivityLeakCheck("HAF_ActivityMonitor");
        this.d = this.e;
        application.registerActivityLifecycleCallbacks(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.haf.intent.action.CLEAN_ALL_ACTIVITY");
        LocalBroadcastManager.getInstance().registerReceiver(this, intentFilter);
    }

    @Override // com.huawei.haf.application.ActivityStatusMonitor
    Activity e() {
        return this.j;
    }

    @Override // com.huawei.haf.application.ActivityStatusMonitor
    int b() {
        return this.f5787c;
    }

    @Override // com.huawei.haf.application.ActivityStatusMonitor
    void c() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.haf.intent.action.CLEAN_ALL_ACTIVITY");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    @Override // com.huawei.haf.application.ActivityStatusMonitor
    boolean c(long j) {
        return !this.f5786b.isEmpty() || System.currentTimeMillis() - this.d <= j;
    }

    @Override // com.huawei.haf.application.ActivityStatusMonitor
    Activity[] d() {
        try {
            return (Activity[]) HandlerExecutor.c(this);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.huawei.haf.application.ActivityStatusMonitor
    int b(String str) {
        Activity[] activityArrD = d();
        if (activityArrD == null || activityArrD.length <= 0) {
            return -1;
        }
        for (int i = 0; i < activityArrD.length; i++) {
            if (str.equals(activityArrD[i].getClass().getName())) {
                return (activityArrD.length - 1) - i;
            }
        }
        return -1;
    }

    @Override // com.huawei.haf.application.ActivityStatusMonitor, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.huawei.haf.intent.action.CLEAN_ALL_ACTIVITY".equals(intent.getAction())) {
            LogUtil.b("HAF_ActivityMonitor", "finish all activity by app self");
            j();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f5786b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f5787c++;
        if (f()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.c("HAF_ActivityMonitor", "onActivityStarted : ", Long.valueOf(jCurrentTimeMillis));
        a(true, jCurrentTimeMillis);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.j = activity;
        this.f5786b.remove(activity);
        this.f5786b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = this.f5787c - 1;
        this.f5787c = i;
        if (i == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LogUtil.c("HAF_ActivityMonitor", "onActivityStopped : ", Long.valueOf(jCurrentTimeMillis));
            a(false, jCurrentTimeMillis);
            this.e = jCurrentTimeMillis;
            this.j = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Activity activity2;
        this.f5786b.remove(activity);
        if (this.j == activity) {
            if (this.f5786b.isEmpty()) {
                activity2 = null;
            } else {
                ArrayList<Activity> arrayList = this.f5786b;
                activity2 = arrayList.get(arrayList.size() - 1);
            }
            this.j = activity2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f5785a.d(activity, jCurrentTimeMillis, this.f5786b.isEmpty());
        ViewUtils.c(activity);
        ViewUtils.e(activity);
        if (this.f5786b.isEmpty()) {
            this.d = jCurrentTimeMillis;
            this.e = jCurrentTimeMillis;
            MemoryUtils.a();
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Activity[] call() throws Exception {
        return h();
    }

    private Activity[] h() {
        ArrayList<Activity> arrayList = this.f5786b;
        return (Activity[]) arrayList.toArray(new Activity[arrayList.size()]);
    }

    private void j() {
        if (this.f5786b.isEmpty()) {
            return;
        }
        Activity[] activityArrH = h();
        for (int length = activityArrH.length - 1; length >= 0; length--) {
            activityArrH[length].finish();
        }
    }

    private void a(boolean z, long j) {
        b(z, j);
        this.f5785a.c(z);
    }
}
