package com.xiaomi.continuity;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.xiaomi.continuity.infra.ServiceConnector;
import com.xiaomi.wearable.CoreExtKt;
import defpackage.jjg;

/* JADX INFO: loaded from: classes7.dex */
public class ContinuityServiceManagerConnector extends ServiceConnector.Impl<a> {
    private static volatile HandlerThread sServiceThread;

    public ContinuityServiceManagerConnector(Context context) {
        super(context, new Intent().setClassName(CoreExtKt.lyraPackageName, "com.xiaomi.continuity.ContinuityServiceManagerService"), jjg.a(), null);
    }

    private static HandlerThread getServiceThread() {
        if (sServiceThread == null) {
            synchronized (ContinuityServiceManagerConnector.class) {
                try {
                    if (sServiceThread == null) {
                        sServiceThread = new HandlerThread("continuity-service-manager-connector", 0);
                        sServiceThread.start();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sServiceThread;
    }

    @Override // com.xiaomi.continuity.infra.ServiceConnector.Impl
    public long getAutoDisconnectTimeoutMs() {
        return -1L;
    }

    @Override // com.xiaomi.continuity.infra.ServiceConnector.Impl
    public Handler getJobHandler() {
        return new Handler(getServiceThread().getLooper());
    }

    @Override // com.xiaomi.continuity.infra.ServiceConnector.Impl
    public a binderAsInterface(IBinder iBinder) {
        return a.AbstractBinderC0351a.s2(iBinder);
    }
}
