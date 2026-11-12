package com.huawei.agconnect.common.aaid;

import android.content.Context;
import com.huawei.agconnect.common.api.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class HMSInstanceIdWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4805b = "HMSInstanceIdWrapper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f4806a;

    public String d() {
        try {
            Logger.d(f4805b, "call hms wrapper : getId");
            return (String) this.f4806a.getClass().getDeclaredMethod("getId", new Class[0]).invoke(this.f4806a, new Object[0]);
        } catch (Throwable unused) {
            Logger.e(f4805b, "get id fail");
            return null;
        }
    }

    public long c() {
        try {
            Logger.d(f4805b, "call hms wrapper : getCreationTime");
            return ((Long) this.f4806a.getClass().getDeclaredMethod("getCreationTime", new Class[0]).invoke(this.f4806a, new Object[0])).longValue();
        } catch (Throwable unused) {
            Logger.e(f4805b, "get create time fail");
            return 0L;
        }
    }

    public void b() {
        try {
            Logger.d(f4805b, "call hms wrapper : deleteAAID");
            this.f4806a.getClass().getDeclaredMethod("deleteAAID", new Class[0]).invoke(this.f4806a, new Object[0]);
        } catch (Throwable unused) {
            Logger.e(f4805b, "delete aaid fail");
        }
    }

    public boolean a() {
        return this.f4806a != null;
    }

    public HMSInstanceIdWrapper(Context context) {
        try {
            this.f4806a = Class.forName("com.huawei.hms.aaid.HmsInstanceId").getDeclaredMethod("getInstance", Context.class).invoke(null, context);
        } catch (Throwable unused) {
            Logger.w(f4805b, "not find package HmsInstanceId");
        }
    }
}
