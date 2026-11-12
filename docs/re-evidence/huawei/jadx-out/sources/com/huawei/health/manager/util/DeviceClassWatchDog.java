package com.huawei.health.manager.util;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceClassWatchDog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f8140c;
    private int d = 0;
    private boolean e = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f8139b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f8138a = 0;

    public DeviceClassWatchDog(Context context) {
        if (context != null) {
            this.f8140c = context;
        }
    }

    public boolean e() {
        return this.e;
    }

    public boolean c(int i) {
        if (SharedPerferenceUtils.ai(this.f8140c)) {
            LogUtil.b("Step_DeviceClassWatchDog", "ability is one");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && StepCounterSupport.i(this.f8140c) && ContextCompat.checkSelfPermission(this.f8140c, "android.permission.ACTIVITY_RECOGNITION") != 0) {
            ReleaseLogUtil.c("Step_DeviceClassWatchDog", "isEnableChangeClass permission not granted ");
            return false;
        }
        if (this.d != i) {
            this.d = i;
            if (this.f8138a == 0) {
                this.f8139b++;
            } else {
                this.f8138a = 0L;
                this.f8139b = 0L;
            }
            LogUtil.c("Step_DeviceClassWatchDog", "isEnableChangeClass stand : ", Long.valueOf(this.f8139b), " private: ", Long.valueOf(this.f8138a));
            long j = this.f8139b;
            if (j >= 100) {
                LogUtil.b("Step_DeviceClassWatchDog", "isEnableChangeClass stand : ", Long.valueOf(j), " private: ", Long.valueOf(this.f8138a));
                this.e = false;
                return true;
            }
        }
        return false;
    }

    public void d() {
        if (this.e) {
            this.f8138a++;
        }
    }
}
