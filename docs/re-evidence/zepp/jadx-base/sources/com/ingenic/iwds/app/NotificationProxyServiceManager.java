package com.ingenic.iwds.app;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;

/* JADX INFO: loaded from: classes18.dex */
public class NotificationProxyServiceManager extends ServiceManagerContext {
    private INotificationProxyService a;

    public class a extends ServiceManagerContext.ServiceClientProxy {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public IBinder getBinder() {
            return NotificationProxyServiceManager.this.a.asBinder();
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceConnected(IBinder iBinder) {
            NotificationProxyServiceManager.this.a = INotificationProxyService.Stub.asInterface(iBinder);
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceDisconnected(boolean z) {
        }
    }

    public NotificationProxyServiceManager(Context context) {
        super(context);
        this.m_serviceClientProxy = new a();
    }

    public void cancel(int i) {
        try {
            this.a.cancel(getContext().getPackageName(), i);
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in cancel: " + e.toString());
        }
    }

    public void cancelAll() {
        try {
            this.a.cancelAll(getContext().getPackageName());
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in cancelAll: " + e.toString());
        }
    }

    public boolean notify(int i, Note note) {
        IwdsAssert.dieIf(this, note == null, "note is null");
        try {
            return this.a.notify(getContext().getPackageName(), i, note);
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in notify: " + e.toString());
            return false;
        }
    }

    public boolean registerBackend(NotificationServiceBackend notificationServiceBackend, String str) {
        boolean z = true;
        IwdsAssert.dieIf(this, notificationServiceBackend == null, "backend is null.");
        if (str != null && !str.isEmpty()) {
            z = false;
        }
        IwdsAssert.dieIf(this, z, "uuid is null or empty.");
        try {
            return this.a.registerBackend(notificationServiceBackend.b, getContext().getPackageName(), str);
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in registerBackend: " + e.toString());
            return false;
        }
    }

    public boolean unregisterBackend(String str) {
        IwdsAssert.dieIf(this, str == null || str.isEmpty(), "uuid is null or empty.");
        try {
            return this.a.unregisterBackend(getContext().getPackageName(), str);
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in registerBackend: " + e.toString());
            return true;
        }
    }
}
