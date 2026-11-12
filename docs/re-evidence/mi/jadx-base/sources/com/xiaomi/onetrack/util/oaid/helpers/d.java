package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.onetrack.util.p;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class d {
    private static final String c = "HWDeviceIDHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f13967a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ServiceConnection f13968b = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.HWDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f13953a.f13967a.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e) {
                p.a("HWDeviceIDHelper", e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public String a(Context context) {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        String strA = "";
        if (context.bindService(intent, this.f13968b, 1)) {
            try {
                try {
                    try {
                        IBinder iBinderPoll = this.f13967a.poll(1L, TimeUnit.SECONDS);
                        if (iBinderPoll == null) {
                            try {
                                context.unbindService(this.f13968b);
                            } catch (Exception e) {
                                p.a(c, e.getMessage());
                            }
                            return "";
                        }
                        strA = new com.xiaomi.onetrack.util.oaid.a.b.a(iBinderPoll).a();
                        context.unbindService(this.f13968b);
                    } catch (Exception e2) {
                        p.a(c, e2.getMessage());
                        context.unbindService(this.f13968b);
                    }
                } catch (Exception e3) {
                    p.a(c, e3.getMessage());
                }
            } catch (Throwable th) {
                try {
                    context.unbindService(this.f13968b);
                } catch (Exception e4) {
                    p.a(c, e4.getMessage());
                }
                throw th;
            }
        }
        return strA;
    }
}
