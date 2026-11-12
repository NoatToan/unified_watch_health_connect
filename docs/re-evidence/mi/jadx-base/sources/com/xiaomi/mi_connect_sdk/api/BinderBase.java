package com.xiaomi.mi_connect_sdk.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.mi_connect_service.IMiConnect;
import com.xiaomi.wearable.CoreExtKt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BinderBase {
    private static final String TAG = "IDMBinderBase";
    private static volatile boolean sIsBinding = false;
    private static volatile boolean sPendingUnbind = false;
    public static IMiConnect sService = null;
    protected static int sServiceApiVersion = -1;
    private final Context mContext;
    private volatile boolean mIsBound = false;
    protected MiAppCallback mMiAppCallback;
    protected IMiConnect mService;
    private static final Object sServiceLock = new Object();
    private static final Object sSetLock = new Object();
    private static final Set<BinderBase> sMiConnectApiSet = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final ServiceConnection mConnection = new ServiceConnection() { // from class: com.xiaomi.mi_connect_sdk.api.BinderBase.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IMiConnect iMiConnectAsInterface;
            int code;
            if (BinderBase.sPendingUnbind) {
                BinderBase.unbindAll();
                return;
            }
            synchronized (BinderBase.sServiceLock) {
                iMiConnectAsInterface = IMiConnect.Stub.asInterface(iBinder);
                BinderBase.sService = iMiConnectAsInterface;
            }
            try {
                BinderBase.sServiceApiVersion = iMiConnectAsInterface.getServiceApiVersion();
                StringBuilder sb = new StringBuilder();
                sb.append("get service api version: ");
                sb.append(BinderBase.sServiceApiVersion);
                code = 0;
            } catch (RemoteException e) {
                e.getMessage();
                code = ResultCode.SERVICE_ERROR.getCode();
            }
            if (BinderBase.sServiceApiVersion == -1) {
                code = ResultCode.PERMISSION_DENNY.getCode();
            }
            for (BinderBase binderBase : BinderBase.sMiConnectApiSet) {
                if (code != 0) {
                    binderBase.mMiAppCallback.onServiceError(code);
                } else if (binderBase.isVersionSatisfied()) {
                    binderBase.mService = BinderBase.sService;
                    binderBase.onServiceConnected();
                    binderBase.mMiAppCallback.onServiceBind();
                    binderBase.mIsBound = true;
                } else {
                    BinderBase.sMiConnectApiSet.remove(binderBase);
                    binderBase.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
                }
            }
            boolean unused = BinderBase.sIsBinding = false;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            BinderBase.unbindAll();
        }
    };

    public BinderBase(Context context, MiAppCallback miAppCallback) {
        if (context == null) {
            throw new IllegalArgumentException("context should not be null");
        }
        this.mContext = context.getApplicationContext();
        this.mMiAppCallback = miAppCallback;
    }

    private static boolean serviceAvailableInner() {
        boolean z;
        synchronized (sServiceLock) {
            try {
                IMiConnect iMiConnect = sService;
                z = iMiConnect != null && iMiConnect.asBinder().isBinderAlive();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void unbindAll() {
        HashSet hashSet;
        sPendingUnbind = true;
        synchronized (sSetLock) {
            try {
                Set<BinderBase> set = sMiConnectApiSet;
                hashSet = new HashSet(set);
                Context context = hashSet.iterator().hasNext() ? ((BinderBase) hashSet.iterator().next()).mContext : null;
                set.clear();
                if (serviceAvailableInner() && context != null) {
                    context.unbindService(mConnection);
                }
                synchronized (sServiceLock) {
                    sService = null;
                }
                sIsBinding = false;
                sPendingUnbind = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BinderBase) it.next()).mMiAppCallback.onServiceUnbind();
        }
    }

    public void bindService() {
        synchronized (sSetLock) {
            sMiConnectApiSet.add(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bindService: sIsBinding = ");
        sb.append(sIsBinding);
        sb.append(", sIsPendingUnbind = ");
        sb.append(sPendingUnbind);
        sb.append("mIsBound = ");
        sb.append(this.mIsBound);
        if (!serviceAvailableInner()) {
            if (sIsBinding) {
                return;
            }
            sIsBinding = true;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.mi_connect_service.MiConnectService");
            intent.setComponent(new ComponentName(CoreExtKt.lyraPackageName, "com.xiaomi.mi_connect_service.MiConnectService"));
            try {
                this.mContext.startService(intent);
            } catch (SecurityException e) {
                e.getMessage();
                this.mMiAppCallback.onServiceError(ResultCode.SERVICE_NOT_INIT_YET.getCode());
            }
            if (this.mContext.bindService(intent, mConnection, 1)) {
                return;
            }
            this.mMiAppCallback.onServiceError(ResultCode.BIND_SERVICE_FAILED.getCode());
            sIsBinding = false;
            return;
        }
        if (sServiceApiVersion == -1) {
            try {
                sServiceApiVersion = sService.getServiceApiVersion();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Checking sServiceApiVersion = ");
                sb2.append(sServiceApiVersion);
            } catch (RemoteException e2) {
                e2.getMessage();
                this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
                return;
            }
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return;
        }
        this.mService = sService;
        onServiceConnected();
        this.mMiAppCallback.onServiceBind();
        this.mIsBound = true;
    }

    public void destroy() {
        doDestroy();
        unbindService();
    }

    public void doDestroy() {
    }

    public abstract int getMinVersion();

    public void init() {
        bindService();
    }

    public boolean isVersionSatisfied() {
        boolean z = sServiceApiVersion >= getMinVersion();
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Service Api version too low:\n   required min version: ");
            sb.append(getMinVersion());
            sb.append("\n   current version: ");
            sb.append(sServiceApiVersion);
        }
        return z;
    }

    public void onServiceConnected() {
    }

    public boolean serviceAvailable() {
        return serviceAvailableInner() && this.mService != null;
    }

    public void unbindService() {
        if (this.mIsBound) {
            unbindService(this);
            this.mIsBound = false;
        }
    }

    private static void unbindService(BinderBase binderBase) {
        synchronized (sSetLock) {
            try {
                Set<BinderBase> set = sMiConnectApiSet;
                set.remove(binderBase);
                binderBase.mService = null;
                if (set.isEmpty()) {
                    if (serviceAvailableInner()) {
                        sPendingUnbind = true;
                        binderBase.mContext.unbindService(mConnection);
                    }
                    synchronized (sServiceLock) {
                        sService = null;
                    }
                    sIsBinding = false;
                    sPendingUnbind = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        binderBase.mMiAppCallback.onServiceUnbind();
    }
}
