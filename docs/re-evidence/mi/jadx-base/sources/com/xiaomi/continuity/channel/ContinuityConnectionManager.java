package com.xiaomi.continuity.channel;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.continuity.ServiceName;
import defpackage.epq;
import defpackage.etl;
import defpackage.gj4;
import defpackage.ij4;
import defpackage.mqc;
import defpackage.uoe;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
class ContinuityConnectionManager {
    private static final String TAG = "ContinuityConnection.Manager";
    private static ContinuityConnectionManager sInstance;
    private final Context mContext;
    private final String mPackageName;
    private mqc mService;
    private String mApiFeature = null;
    private final HashMap<ServiceName, com.xiaomi.continuity.channel.a> mServerChannelListener = new HashMap<>();

    public class a implements gj4 {
        public a() {
        }

        @Override // defpackage.gj4
        public void h() {
            uoe.e(ContinuityConnectionManager.TAG, "onBinderDied.");
            synchronized (ContinuityConnectionManager.this) {
                ContinuityConnectionManager.this.mService = null;
                ContinuityConnectionManager.this.mApiFeature = null;
            }
            synchronized (ContinuityConnectionManager.this.mServerChannelListener) {
                ContinuityConnectionManager.this.mServerChannelListener.clear();
            }
        }

        @Override // defpackage.gj4
        public void h4(ij4 ij4Var) {
            synchronized (ContinuityConnectionManager.this) {
                ContinuityConnectionManager.this.mService = null;
                ContinuityConnectionManager.this.mApiFeature = null;
            }
            synchronized (ContinuityConnectionManager.this.mServerChannelListener) {
                ContinuityConnectionManager.this.mServerChannelListener.clear();
            }
        }
    }

    public class b extends com.xiaomi.continuity.channel.a {
        public b(int i, ChannelInnerListener channelInnerListener) {
            super(i, channelInnerListener);
        }

        @Override // com.xiaomi.continuity.channel.a, defpackage.gj4
        public void h() {
            super.h();
            q5(ContinuityConnectionManager.this);
        }

        @Override // com.xiaomi.continuity.channel.a, com.xiaomi.continuity.channel.b
        public void onChannelCreateFailed(String str, ServiceName serviceName, int i, int i2) {
            super.onChannelCreateFailed(str, serviceName, i, i2);
            q5(ContinuityConnectionManager.this);
        }

        @Override // com.xiaomi.continuity.channel.a, com.xiaomi.continuity.channel.b
        public void onChannelRelease(int i, int i2) {
            super.onChannelRelease(i, i2);
            q5(ContinuityConnectionManager.this);
        }
    }

    public class c extends com.xiaomi.continuity.channel.a {
        public c(int i, ChannelInnerListener channelInnerListener) {
            super(i, channelInnerListener);
        }

        @Override // com.xiaomi.continuity.channel.a, defpackage.gj4
        public void h() {
            super.h();
            q5(ContinuityConnectionManager.this);
        }

        @Override // com.xiaomi.continuity.channel.a, com.xiaomi.continuity.channel.b
        public void onChannelCreateFailed(String str, ServiceName serviceName, int i, int i2) {
            super.onChannelCreateFailed(str, serviceName, i, i2);
            q5(ContinuityConnectionManager.this);
        }

        @Override // com.xiaomi.continuity.channel.a, com.xiaomi.continuity.channel.b
        public void onChannelRelease(int i, int i2) {
            super.onChannelRelease(i, i2);
            q5(ContinuityConnectionManager.this);
        }
    }

    private ContinuityConnectionManager(mqc mqcVar, Context context) {
        this.mService = mqcVar;
        this.mContext = context;
        this.mPackageName = context.getPackageName();
        getApiFeature();
        addServiceListener(new a());
    }

    private boolean checkApiFeatureSupportSdkNegotiation() {
        return epq.b(getApiFeature(), "channel.SDK_SUPPORT_NEGOTIATION");
    }

    private boolean checkApiFeatureUserData() {
        return epq.b(getApiFeature(), "channel.CONFIRM_WITH_USER_DATA");
    }

    public static synchronized ContinuityConnectionManager getInstance(Context context) {
        try {
            if (sInstance == null) {
                sInstance = new ContinuityConnectionManager(getSystemService(context), context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    private RuntimeException getRuntimeException(RemoteException remoteException) {
        return Build.VERSION.SDK_INT >= 30 ? remoteException.rethrowFromSystemServer() : new RuntimeException(remoteException);
    }

    private synchronized mqc getService() {
        try {
            mqc mqcVar = this.mService;
            if (mqcVar == null || !mqcVar.asBinder().isBinderAlive() || !this.mService.asBinder().pingBinder()) {
                this.mService = getSystemService(this.mContext);
            }
            if (this.mService == null) {
                uoe.b(TAG, "get Service binder fail");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mService;
    }

    private static mqc getSystemService(Context context) {
        IBinder iBinderD = ij4.e(context).d("continuity_connection");
        if (iBinderD != null) {
            return mqc.a.s2(iBinderD);
        }
        uoe.b(TAG, "getSystemService fail");
        return null;
    }

    public void addServiceListener(gj4 gj4Var) {
        ij4.e(this.mContext).c(gj4Var);
    }

    public int confirmChannel(int i, int i2, ChannelConfirmOptions channelConfirmOptions) {
        mqc service = getService();
        try {
            if (service == null) {
                uoe.b(TAG, "Cannot confirm channel because service not bind.");
                return 1101000;
            }
            if (checkApiFeatureSupportSdkNegotiation()) {
                service.P3(i, i2, channelConfirmOptions);
                return 0;
            }
            if (checkApiFeatureUserData()) {
                service.V2(i, i2, channelConfirmOptions.getUserData());
                return 0;
            }
            service.z2(i, i2);
            return 0;
        } catch (RemoteException e) {
            uoe.c(TAG, "confirmChannel:", e);
            return 1101000;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r8 = -3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int createChannel(com.xiaomi.continuity.netbus.LinkAddress r8, com.xiaomi.continuity.ServiceName r9, com.xiaomi.continuity.channel.ClientChannelOptionsV2 r10, com.xiaomi.continuity.channel.ChannelInnerListener r11, java.util.concurrent.Executor r12) {
        /*
            r7 = this;
            java.lang.String r0 = "deviceId must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "serviceName must not be null"
            java.util.Objects.requireNonNull(r9, r0)
            java.lang.String r0 = "options must not be null"
            java.util.Objects.requireNonNull(r10, r0)
            java.lang.String r0 = "listener must not be null"
            java.util.Objects.requireNonNull(r11, r0)
            java.lang.String r0 = "executor must not be null"
            java.util.Objects.requireNonNull(r12, r0)
            com.xiaomi.continuity.channel.ContinuityConnectionManager$c r12 = new com.xiaomi.continuity.channel.ContinuityConnectionManager$c
            int r0 = r10.getTrustLevel()
            r12.<init>(r0, r11)
            r12.p5(r7)     // Catch: android.os.RemoteException -> L3c
            mqc r1 = r7.getService()     // Catch: android.os.RemoteException -> L3c
            if (r1 == 0) goto L53
            boolean r11 = r7.checkApiFeatureUserData()     // Catch: android.os.RemoteException -> L3c
            if (r11 == 0) goto L3e
            java.lang.String r2 = r7.mPackageName     // Catch: android.os.RemoteException -> L3c
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r12
            int r8 = r1.g0(r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L3c
            goto L54
        L3c:
            r8 = move-exception
            goto L4c
        L3e:
            java.lang.String r2 = r7.mPackageName     // Catch: android.os.RemoteException -> L3c
            com.xiaomi.continuity.channel.ClientChannelOptions r5 = r10.toClientChannelOptions()     // Catch: android.os.RemoteException -> L3c
            r3 = r8
            r4 = r9
            r6 = r12
            int r8 = r1.i4(r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L3c
            goto L54
        L4c:
            java.lang.String r9 = "ContinuityConnection.Manager"
            java.lang.String r10 = "createChannel:"
            defpackage.uoe.c(r9, r10, r8)
        L53:
            r8 = -3
        L54:
            if (r8 >= 0) goto L59
            r12.q5(r7)
        L59:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.continuity.channel.ContinuityConnectionManager.createChannel(com.xiaomi.continuity.netbus.LinkAddress, com.xiaomi.continuity.ServiceName, com.xiaomi.continuity.channel.ClientChannelOptionsV2, com.xiaomi.continuity.channel.ChannelInnerListener, java.util.concurrent.Executor):int");
    }

    public int destroyChannel(int i) {
        mqc service = getService();
        try {
            if (service != null) {
                service.Q1(i);
                return 1102000;
            }
            uoe.b(TAG, "Cannot destroy channel because service not bind.");
            return 1101000;
        } catch (RemoteException e) {
            uoe.c(TAG, "destroyChannel:", e);
            return 1101000;
        }
    }

    public String getApiFeature() {
        mqc service;
        if (this.mApiFeature == null && (service = getService()) != null) {
            try {
                this.mApiFeature = service.m0();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return this.mApiFeature;
    }

    public Bundle getChannelInfoExt(int i, int i2) {
        mqc service = getService();
        if (service != null) {
            try {
                return service.E3(i, i2);
            } catch (RemoteException e) {
                uoe.c(TAG, "getChannelInfoExt:", e);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("result", 1101000);
        return bundle;
    }

    public void notifyChannelServerConnected(ServiceName serviceName, int i) {
        mqc service = getService();
        try {
            if (service == null) {
                uoe.b(TAG, "Cannot notify channel connected success because service not bind.");
            } else if (epq.b(getApiFeature(), "channel.NOTIFY_SERVER_CONNECTED")) {
                service.J0(serviceName, i);
            }
        } catch (RemoteException e) {
            uoe.c(TAG, "notifyChannelServerConnected:", e);
        }
    }

    public void notifyChannelServerCreateFailed(int i) {
        mqc service = getService();
        try {
            if (service != null) {
                service.w3(i, 0);
            } else {
                uoe.b(TAG, "Cannot notify channel created failed because service not bind.");
            }
        } catch (RemoteException e) {
            uoe.c(TAG, "notifyChannelServerCreateFailed:", e);
        }
    }

    public void notifyChannelServerCreated(int i, int i2) {
        if (i2 <= 0 || i2 > 65535) {
            uoe.b(TAG, "invalid port = " + i2);
            notifyChannelServerCreateFailed(i);
            return;
        }
        mqc service = getService();
        try {
            if (service != null) {
                service.w3(i, i2);
            } else {
                uoe.b(TAG, "Cannot notify channel created success because service not bind.");
            }
        } catch (RemoteException e) {
            uoe.c(TAG, "notifyChannelServerCreated:", e);
        }
    }

    public int registerChannelListener(ServiceName serviceName, ServerChannelOptions serverChannelOptions, ChannelInnerListener channelInnerListener, Executor executor) {
        Objects.requireNonNull(serviceName, "serviceName must not be null");
        Objects.requireNonNull(serverChannelOptions, "options must not be null");
        Objects.requireNonNull(channelInnerListener, "listener must not be null");
        Objects.requireNonNull(executor, "executor must not be null");
        try {
            synchronized (this.mServerChannelListener) {
                try {
                    if (this.mServerChannelListener.get(serviceName) != null) {
                        throw new RuntimeException("already register");
                    }
                    com.xiaomi.continuity.channel.a aVar = new com.xiaomi.continuity.channel.a(serverChannelOptions.getTrustLevel(), channelInnerListener);
                    aVar.p5(this);
                    this.mServerChannelListener.put(serviceName, aVar);
                    mqc service = getService();
                    if (service == null) {
                        return 1101000;
                    }
                    return service.U0(this.mPackageName, serviceName, serverChannelOptions, aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RemoteException e) {
            uoe.c(TAG, "RemoteException registerChannelListener:", e);
            return 1101000;
        }
    }

    public void removeServiceListener(gj4 gj4Var) {
        ij4.e(this.mContext).g(gj4Var);
    }

    public int send(int i, byte[] bArr, Bundle bundle, SendResultCallback sendResultCallback, Executor executor) {
        Objects.requireNonNull(bArr, "data must not be null");
        Objects.requireNonNull(sendResultCallback);
        Objects.requireNonNull(executor);
        mqc service = getService();
        try {
            if (service != null) {
                return service.F1(i, bArr, bundle, new etl(sendResultCallback, executor));
            }
            uoe.b(TAG, "Cannot send data because service not bind.");
            return 3;
        } catch (RemoteException e) {
            uoe.c(TAG, "send:", e);
            return 3;
        }
    }

    public void unbindService() {
        if (this.mService != null) {
            uoe.e(TAG, "unbind Connection Service");
            ij4.e(this.mContext).h("continuity_connection");
            synchronized (this) {
                this.mService = null;
            }
        }
    }

    public int unregisterChannelListener(ServiceName serviceName) {
        Objects.requireNonNull(serviceName, "serviceName must not be null");
        try {
            synchronized (this.mServerChannelListener) {
                try {
                    com.xiaomi.continuity.channel.a aVarRemove = this.mServerChannelListener.remove(serviceName);
                    if (aVarRemove == null) {
                        uoe.b(TAG, "Cannot unregister channel listener because it is never registered.");
                        return 1103000;
                    }
                    aVarRemove.q5(this);
                    mqc service = getService();
                    if (service != null) {
                        return service.D4(serviceName);
                    }
                    uoe.b(TAG, "Cannot unregister channel listener because service not bind.");
                    return 1101000;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RemoteException e) {
            uoe.c(TAG, "unregisterChannelListener:", e);
            return 1101000;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r8 = -3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int createChannel(java.lang.String r8, com.xiaomi.continuity.ServiceName r9, com.xiaomi.continuity.channel.ClientChannelOptionsV2 r10, com.xiaomi.continuity.channel.ChannelInnerListener r11, java.util.concurrent.Executor r12) {
        /*
            r7 = this;
            java.lang.String r0 = "deviceId must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "serviceName must not be null"
            java.util.Objects.requireNonNull(r9, r0)
            java.lang.String r0 = "options must not be null"
            java.util.Objects.requireNonNull(r10, r0)
            java.lang.String r0 = "listener must not be null"
            java.util.Objects.requireNonNull(r11, r0)
            java.lang.String r0 = "executor must not be null"
            java.util.Objects.requireNonNull(r12, r0)
            com.xiaomi.continuity.channel.ContinuityConnectionManager$b r12 = new com.xiaomi.continuity.channel.ContinuityConnectionManager$b
            int r0 = r10.getTrustLevel()
            r12.<init>(r0, r11)
            r12.p5(r7)     // Catch: android.os.RemoteException -> L3c
            mqc r1 = r7.getService()     // Catch: android.os.RemoteException -> L3c
            if (r1 == 0) goto L53
            boolean r11 = r7.checkApiFeatureUserData()     // Catch: android.os.RemoteException -> L3c
            if (r11 == 0) goto L3e
            java.lang.String r2 = r7.mPackageName     // Catch: android.os.RemoteException -> L3c
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r12
            int r8 = r1.b5(r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L3c
            goto L54
        L3c:
            r8 = move-exception
            goto L4c
        L3e:
            java.lang.String r2 = r7.mPackageName     // Catch: android.os.RemoteException -> L3c
            com.xiaomi.continuity.channel.ClientChannelOptions r5 = r10.toClientChannelOptions()     // Catch: android.os.RemoteException -> L3c
            r3 = r8
            r4 = r9
            r6 = r12
            int r8 = r1.G3(r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L3c
            goto L54
        L4c:
            java.lang.String r9 = "ContinuityConnection.Manager"
            java.lang.String r10 = "createChannel:"
            defpackage.uoe.c(r9, r10, r8)
        L53:
            r8 = -3
        L54:
            if (r8 >= 0) goto L59
            r12.q5(r7)
        L59:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.continuity.channel.ContinuityConnectionManager.createChannel(java.lang.String, com.xiaomi.continuity.ServiceName, com.xiaomi.continuity.channel.ClientChannelOptionsV2, com.xiaomi.continuity.channel.ChannelInnerListener, java.util.concurrent.Executor):int");
    }
}
