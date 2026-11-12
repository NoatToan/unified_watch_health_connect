package com.huawei.haf.language;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.security.SecurityConstant;
import health.compact.a.ProcessUtil;

/* JADX INFO: loaded from: classes.dex */
final class LanguageMonitor extends BroadcastReceiver implements ComponentCallbacks, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5968b = true;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    LanguageMonitor(boolean z) {
        Application applicationF = BaseApplication.f();
        applicationF.registerComponentCallbacks(this);
        applicationF.registerActivityLifecycleCallbacks(this);
        if (z) {
            return;
        }
        BroadcastManager.f(this);
    }

    void a() {
        this.f5968b = false;
    }

    static void e() {
        Intent intent = new Intent("com.huawei.haf.intent.action.UPDATE_LANGUAGE_READY");
        intent.setPackage(BaseApplication.d());
        intent.putExtra("sendProcess", ProcessUtil.c());
        BaseApplication.b().sendBroadcast(intent, SecurityConstant.e);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.huawei.haf.intent.action.UPDATE_LANGUAGE_READY".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("sendProcess");
            if (TextUtils.isEmpty(stringExtra) || ProcessUtil.c().equals(stringExtra)) {
                return;
            }
            LanguageManager.a(context);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f5968b) {
            LanguageManager.d(configuration, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        LanguageManager.a(activity);
    }
}
