package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f13969a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ServiceConnection f13970b = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.LenovoDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f13954a.f13969a.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public String a(Context context) {
        context.getPackageName();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        String strA = "";
        if (context.bindService(intent, this.f13970b, 1)) {
            try {
                try {
                    IBinder iBinderPoll = this.f13969a.poll(1L, TimeUnit.SECONDS);
                    if (iBinderPoll == null) {
                        return "";
                    }
                    strA = new com.xiaomi.onetrack.util.oaid.a.c.a.C0834a(iBinderPoll).a();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    context.unbindService(this.f13970b);
                } catch (Exception unused) {
                }
            }
        }
        return strA;
    }
}
