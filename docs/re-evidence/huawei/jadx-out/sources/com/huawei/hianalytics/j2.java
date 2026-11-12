package com.huawei.hianalytics;

import android.content.Context;
import android.os.UserManager;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f11561b = new j2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11562a = false;

    public final boolean a() {
        if (this.f11562a) {
            return true;
        }
        Context appContext = EnvUtils.getAppContext();
        if (appContext == null) {
            return false;
        }
        try {
            UserManager userManager = (UserManager) appContext.getSystemService("user");
            if (userManager != null) {
                this.f11562a = userManager.isUserUnlocked();
            } else {
                this.f11562a = false;
            }
        } catch (Exception unused) {
            this.f11562a = false;
            HiLog.e("UserManagerPro", "user locked exception");
        }
        return this.f11562a;
    }
}
