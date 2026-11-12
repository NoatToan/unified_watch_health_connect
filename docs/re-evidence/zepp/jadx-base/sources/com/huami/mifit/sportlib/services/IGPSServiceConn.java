package com.huami.mifit.sportlib.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.huami.mifit.sportlib.logkit.LogKit;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IGPSServiceConn implements ServiceConnection {
    public WeakReference<Context> a;
    public IServiceStateListener b = null;
    private final IBinder.DeathRecipient c = new a();

    public interface IServiceStateListener {
        void onServerStateChanged(ServiceState serviceState);

        void onServiceConnected();

        void onServiceDisConnected();
    }

    public enum ServiceState {
        DEFAULT,
        BINDING_SERVICE,
        SERVICE_READY,
        LOCATION_ERROR,
        SERVICE_UNBIND,
        SERVICE_DIED
    }

    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            IServiceStateListener iServiceStateListener = IGPSServiceConn.this.b;
            if (iServiceStateListener != null) {
                iServiceStateListener.onServerStateChanged(ServiceState.SERVICE_DIED);
            }
        }
    }

    public IGPSServiceConn(Context context) {
        this.a = null;
        this.a = new WeakReference<>(context);
    }

    public void connect() {
        Context context = this.a.get();
        context.bindService(new Intent(context, (Class<?>) SubGPSSportService.class), this, 1);
    }

    public void destroy(Context context) {
        context.unbindService(this);
        if (this.b != null) {
            this.b = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            iBinder.linkToDeath(this.c, 0);
        } catch (RemoteException e) {
            LogKit.e("Run", e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void setServiceStateListener(IServiceStateListener iServiceStateListener) {
        this.b = iServiceStateListener;
    }
}
