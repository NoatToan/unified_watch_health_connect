package com.xmlywind.devicehelper.oaId.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xmlywind.logger.SigmobLog;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes22.dex */
public class c {
    public com.xmlywind.devicehelper.oaId.a.c a;
    public final LinkedBlockingQueue<IBinder> b = new LinkedBlockingQueue<>(1);
    public ServiceConnection c = new ServiceConnection() { // from class: com.xmlywind.devicehelper.oaId.helpers.c.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                c.this.b.put(iBinder);
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private Context d;

    public c(Context context) {
        this.d = context;
    }

    private boolean a() {
        try {
            return this.d.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(DevicesIDsHelper.AppIdsUpdater appIdsUpdater) {
        if (a()) {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.d.bindService(intent, this.c, 1)) {
                try {
                    com.xmlywind.devicehelper.oaId.a.c.a.C1058a c1058a = new com.xmlywind.devicehelper.oaId.a.c.a.C1058a(this.b.take());
                    this.a = c1058a;
                    String strA = c1058a.a();
                    if (appIdsUpdater != null) {
                        appIdsUpdater.OnIdsAvalid(strA);
                    }
                } catch (Throwable th) {
                    try {
                        SigmobLog.e(th.getMessage());
                    } finally {
                        this.d.unbindService(this.c);
                    }
                }
            }
        }
    }
}
