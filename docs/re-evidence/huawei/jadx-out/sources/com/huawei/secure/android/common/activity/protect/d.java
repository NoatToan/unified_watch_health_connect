package com.huawei.secure.android.common.activity.protect;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes42.dex */
public class d implements IActivityProtect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22744a = "d";

    private void a(Message message) {
        try {
            Object obj = message.obj;
            Field declaredField = obj.getClass().getDeclaredField("arg1");
            declaredField.setAccessible(true);
            a((IBinder) declaredField.get(obj));
        } catch (Throwable unused) {
            com.huawei.secure.android.common.activity.a.a(f22744a, "finishLaunchActivity exception ");
        }
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishLaunchActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f22744a, "finishLaunchActivity: ");
        try {
            Object obj = message.obj;
            Field declaredField = obj.getClass().getDeclaredField("token");
            declaredField.setAccessible(true);
            a((IBinder) declaredField.get(obj));
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f22744a, "finishLaunchActivity exception ");
        }
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishPauseActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f22744a, "finishPauseActivity: ");
        a(message);
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishResumeActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f22744a, "finishResumeActivity: ");
        a(message);
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishStopActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f22744a, "finishStopActivity: ");
        a(message);
    }

    private void a(IBinder iBinder) throws Exception {
        Object objInvoke = ActivityManager.class.getDeclaredMethod("getService", null).invoke(null, null);
        Class<?> cls = objInvoke.getClass();
        Class cls2 = Integer.TYPE;
        Method declaredMethod = cls.getDeclaredMethod("finishActivity", IBinder.class, cls2, Intent.class, cls2);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(objInvoke, iBinder, 0, null, 0);
    }
}
