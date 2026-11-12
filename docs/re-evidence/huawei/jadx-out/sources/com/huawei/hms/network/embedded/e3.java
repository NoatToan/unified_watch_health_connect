package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes34.dex */
public class e3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14718c = "ConnectionInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<y8> f14720b;

    public boolean isHealthy(boolean z) {
        y8 y8Var;
        WeakReference<y8> weakReference = this.f14720b;
        if (weakReference == null || (y8Var = weakReference.get()) == null) {
            return false;
        }
        if (y8Var.a(z)) {
            Logger.v(f14718c, "the host is : %s,and the connection is healthy!", this.f14719a);
            return true;
        }
        Logger.v(f14718c, "the host is : %s,but the connection is unhealthy!", this.f14719a);
        return false;
    }

    public String getHost() {
        return this.f14719a;
    }

    public e3(String str, y8 y8Var) {
        this.f14719a = str;
        this.f14720b = new WeakReference<>(y8Var);
    }
}
