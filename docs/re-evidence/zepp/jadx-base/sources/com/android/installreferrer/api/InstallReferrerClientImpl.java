package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {
    private static final String e = "InstallReferrerClient";
    private static final int f = 80837300;
    private static final String g = "com.android.vending";
    private static final String h = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final String i = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private int a = 0;
    private final Context b;
    private IGetInstallReferrerService c;
    private ServiceConnection d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class b implements ServiceConnection {
        private final InstallReferrerStateListener a;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose(InstallReferrerClientImpl.e, "Install Referrer service connected.");
            InstallReferrerClientImpl.this.c = IGetInstallReferrerService.Stub.asInterface(iBinder);
            InstallReferrerClientImpl.this.a = 2;
            this.a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn(InstallReferrerClientImpl.e, "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.c = null;
            InstallReferrerClientImpl.this.a = 0;
            this.a.onInstallReferrerServiceDisconnected();
        }

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.a = installReferrerStateListener;
        }
    }

    public InstallReferrerClientImpl(@NonNull Context context) {
        this.b = context.getApplicationContext();
    }

    private boolean c() {
        try {
            return this.b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= f;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.a = 3;
        if (this.d != null) {
            InstallReferrerCommons.logVerbose(e, "Unbinding from service.");
            this.b.unbindService(this.d);
            this.d = null;
        }
        this.c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.b.getPackageName());
        try {
            return new ReferrerDetails(this.c.getInstallReferrer(bundle));
        } catch (RemoteException e2) {
            InstallReferrerCommons.logWarn(e, "RemoteException getting install referrer information");
            this.a = 0;
            throw e2;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.a != 2 || this.c == null || this.d == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(@NonNull InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose(e, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i2 = this.a;
        if (i2 == 1) {
            InstallReferrerCommons.logWarn(e, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i2 == 3) {
            InstallReferrerCommons.logWarn(e, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose(e, "Starting install referrer service setup.");
        this.d = new b(installReferrerStateListener);
        Intent intent = new Intent(i);
        intent.setComponent(new ComponentName("com.android.vending", h));
        List<ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.a = 0;
            InstallReferrerCommons.logVerbose(e, "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !c()) {
            InstallReferrerCommons.logWarn(e, "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        } else {
            if (this.b.bindService(new Intent(intent), this.d, 1)) {
                InstallReferrerCommons.logVerbose(e, "Service was bonded successfully.");
                return;
            }
            InstallReferrerCommons.logWarn(e, "Connection to service is blocked.");
            this.a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        }
    }
}
