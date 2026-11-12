package com.huawei.secure.android.common.activity.protect;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes42.dex */
public class a implements IActivityProtect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22741a = "a";

    private void a(IBinder iBinder) throws Exception {
        Object objInvoke = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", null).invoke(null, null);
        objInvoke.getClass().getDeclaredMethod("finishActivity", IBinder.class, Integer.TYPE, Intent.class).invoke(objInvoke, iBinder, 0, null);
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishLaunchActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f22741a, "finishLaunchActivity: ");
        try {
            Object obj = message.obj;
            Field declaredField = obj.getClass().getDeclaredField("token");
            declaredField.setAccessible(true);
            a((IBinder) declaredField.get(obj));
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f22741a, "finishLaunchActivity exception ");
        }
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishPauseActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f22741a, "finishPauseActivity: ");
        try {
            a((IBinder) message.obj);
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f22741a, "finishPauseActivity exception ");
        }
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishResumeActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f22741a, "finishResumeActivity: ");
        try {
            a((IBinder) message.obj);
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f22741a, "finishResumeActivity exception ");
        }
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishStopActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f22741a, "finishStopActivity: ");
        try {
            a((IBinder) message.obj);
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f22741a, "finishStopActivity exception ");
        }
    }
}
