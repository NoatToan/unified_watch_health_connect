package com.weibo.ssosdk.oaid.impl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.OAIDException;

/* JADX INFO: loaded from: classes18.dex */
class OAIDService implements ServiceConnection {
    private final Context a;
    private final IGetter b;
    private final RemoteCaller c;

    @FunctionalInterface
    public interface RemoteCaller {
        String callRemoteInterface(IBinder iBinder);
    }

    private OAIDService(Context context, IGetter iGetter, RemoteCaller remoteCaller) {
        if (context instanceof Application) {
            this.a = context;
        } else {
            this.a = context.getApplicationContext();
        }
        this.b = iGetter;
        this.c = remoteCaller;
    }

    public static void a(Context context, Intent intent, IGetter iGetter, RemoteCaller remoteCaller) {
        new OAIDService(context, iGetter, remoteCaller).b(intent);
    }

    private void b(Intent intent) {
        try {
            if (this.a.bindService(intent, this, 1)) {
            } else {
                throw new OAIDException("Service binding failed");
            }
        } catch (Exception e) {
            this.b.onOAIDGetError(e);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            try {
                String strCallRemoteInterface = this.c.callRemoteInterface(iBinder);
                if (strCallRemoteInterface == null || strCallRemoteInterface.length() == 0) {
                    throw new OAIDException("OAID/AAID acquire failed");
                }
                this.b.onOAIDGetComplete(strCallRemoteInterface);
                try {
                    this.a.unbindService(this);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                try {
                    this.a.unbindService(this);
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (Exception e) {
            this.b.onOAIDGetError(e);
            try {
                this.a.unbindService(this);
            } catch (Exception unused3) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
