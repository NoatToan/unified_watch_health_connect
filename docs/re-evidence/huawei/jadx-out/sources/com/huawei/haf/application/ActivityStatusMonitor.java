package com.huawei.haf.application;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.watchface.api.HwWatchFaceApi;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;

/* JADX INFO: loaded from: classes.dex */
class ActivityStatusMonitor extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f5788c;
    protected long e = System.currentTimeMillis();

    int b() {
        return 0;
    }

    int b(String str) {
        return -1;
    }

    void c() {
    }

    boolean c(long j) {
        return false;
    }

    Activity[] d() {
        return null;
    }

    Activity e() {
        return null;
    }

    ActivityStatusMonitor(boolean z) {
        if (z) {
            BroadcastManager.d(this);
        } else {
            this.f5788c = Boolean.FALSE;
        }
    }

    final boolean f() {
        if (this.f5788c == null) {
            this.f5788c = Boolean.valueOf(ProcessUtil.e());
        }
        return this.f5788c.booleanValue();
    }

    final boolean e(long j) {
        return b() == 0 && System.currentTimeMillis() - this.e > j;
    }

    protected final void b(boolean z, long j) {
        this.f5788c = Boolean.valueOf(z);
        Intent intent = new Intent(HwWatchFaceApi.ACTION_FOREGROUND_STATUS);
        intent.setPackage(BaseApplication.d());
        intent.putExtra("isForeground", z);
        intent.putExtra("time", j);
        BaseApplication.b().sendBroadcast(intent, SecurityConstant.f5920a);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction())) {
            Boolean bool = this.f5788c;
            this.f5788c = Boolean.valueOf(b(intent, bool == null ? true : bool.booleanValue()));
            this.e = a(intent, this.e);
            LogUtil.b("HAF_ActivityMonitor", "action=", intent.getAction(), ", isForeground=", Boolean.valueOf(f()));
        }
    }

    private boolean b(Intent intent, boolean z) {
        try {
            return intent.getBooleanExtra("isForeground", z);
        } catch (RuntimeException e) {
            LogUtil.d("HAF_ActivityMonitor", "readIsForeground ex=", LogUtil.c(e));
            return z;
        }
    }

    private long a(Intent intent, long j) {
        try {
            return intent.getLongExtra("time", j);
        } catch (RuntimeException e) {
            LogUtil.d("HAF_ActivityMonitor", "readTime ex=", LogUtil.c(e));
            return j;
        }
    }
}
