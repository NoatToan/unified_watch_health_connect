package com.huawei.hms.opendevice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes34.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ServiceConnection f15816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Messenger f15817b = null;

    class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f15818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f15819b;

        a(Bundle bundle, Context context) {
            this.f15818a = bundle;
            this.f15819b = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HMSLog.i("RemoteService", "remote service onConnected");
            k.this.f15817b = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f15818a);
            try {
                k.this.f15817b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.i("RemoteService", "remote service message send failed");
            }
            HMSLog.i("RemoteService", "remote service unbindservice");
            this.f15819b.unbindService(k.this.f15816a);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HMSLog.i("RemoteService", "remote service onDisconnected");
            k.this.f15817b = null;
        }
    }

    public boolean a(Context context, Bundle bundle, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        this.f15816a = new a(bundle, applicationContext);
        HMSLog.i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f15816a, 1);
    }
}
