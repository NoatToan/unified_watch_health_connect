package com.ingenic.iwds.remotedevice;

import android.content.Context;
import android.content.pm.PackageStats;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteDeviceServiceManager extends ServiceManagerContext {
    private IRemoteDeviceService a;
    private e b;
    private b c;
    private c d;
    private d e;
    private String f;

    public class a extends ServiceManagerContext.ServiceClientProxy {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public IBinder getBinder() {
            return RemoteDeviceServiceManager.this.a.asBinder();
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceConnected(IBinder iBinder) {
            RemoteDeviceServiceManager.this.a = IRemoteDeviceService.Stub.asInterface(iBinder);
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceDisconnected(boolean z) {
        }
    }

    public class b extends IRemoteDeviceAppCallback.Stub {
        private static final int m = 0;
        private static final int n = 1;
        private RemoteDeviceAppListener j;
        private Handler k = new a();

        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                    case 1:
                        b.this.j.onResponseClearAppDataOrCache((String) message.obj, message.arg1, message.arg2);
                        break;
                    case 2:
                        C0723b c0723b = (C0723b) message.obj;
                        b.this.j.onResponseClearAllAppDataAndCache(c0723b.a, c0723b.b, c0723b.c, c0723b.d, c0723b.e);
                        break;
                    case 3:
                        b.this.j.onRemoteAppInfoListAvailable(((RemoteApplicationInfoList) message.obj).a());
                        break;
                    case 4:
                        b.this.j.onRemoteStorageInfoAvailable((RemoteStorageInfo) message.obj);
                        break;
                    case 5:
                        String str = (String) message.obj;
                        int i = message.arg1;
                        int i2 = message.arg2;
                        if (i != 0) {
                            b.this.j.onSendFileProgressForInstall(str, i2);
                        } else {
                            b.this.j.onDoneInstallApp(str, i2);
                        }
                        break;
                    case 6:
                    default:
                        IwdsAssert.dieIf((Object) this, true, "Implement me.");
                        break;
                    case 7:
                        b.this.j.onDoneDeleteApp((String) message.obj, message.arg1);
                        break;
                    case 8:
                        PackageStats packageStats = (PackageStats) message.obj;
                        int i3 = message.arg1;
                        IwdsLog.i(this, " TYPE_PKG_SIZE_INFO stats " + packageStats);
                        b.this.j.onResponsePkgSizeInfo(packageStats, i3);
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: com.ingenic.iwds.remotedevice.RemoteDeviceServiceManager$b$b, reason: collision with other inner class name */
        public class C0723b {
            public int a;
            public int b;
            public String c;
            public int d;
            public int e;

            public C0723b(int i, int i2, String str, int i3, int i4) {
                this.a = i;
                this.b = i2;
                this.c = str;
                this.d = i3;
                this.e = i4;
            }
        }

        public b(RemoteDeviceAppListener remoteDeviceAppListener) {
            this.j = remoteDeviceAppListener;
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
        public void onDoneDeleteApp(String str, int i) throws RemoteException {
            Message messageObtain = Message.obtain(this.k, 7, str);
            messageObtain.arg1 = i;
            messageObtain.sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
        public void onDoneInstallApp(String str, int i) throws RemoteException {
            Message messageObtain = Message.obtain(this.k, 5, str);
            messageObtain.arg1 = 0;
            messageObtain.arg2 = i;
            messageObtain.sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
        public void onRemoteAppInfoListAvailable(RemoteApplicationInfoList remoteApplicationInfoList) throws RemoteException {
            Message.obtain(this.k, 3, remoteApplicationInfoList).sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
        public void onRemoteStorageInfoAvailable(RemoteStorageInfo remoteStorageInfo) throws RemoteException {
            Message.obtain(this.k, 4, remoteStorageInfo).sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
        public void onResponseClearAllAppDataAndCache(int i, int i2, String str, int i3, int i4) throws RemoteException {
            Message.obtain(this.k, 2, new C0723b(i, i2, str, i3, i4)).sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
        public void onResponseClearAppDataOrCache(String str, int i, int i2) throws RemoteException {
            Message messageObtain = Message.obtain(this.k, i, str);
            messageObtain.arg1 = i;
            messageObtain.arg2 = i2;
            messageObtain.sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
        public void onResponsePkgSizeInfo(RemotePackageStats remotePackageStats, int i) throws RemoteException {
            PackageStats packageStatsA = remotePackageStats.a();
            IwdsLog.d(this, " ===localStats " + packageStatsA);
            Message messageObtain = Message.obtain(this.k, 8, packageStatsA);
            messageObtain.arg1 = i;
            messageObtain.sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
        public void onSendFileProgressForInstall(String str, int i) throws RemoteException {
            Message messageObtain = Message.obtain(this.k, 5, str);
            messageObtain.arg1 = 1;
            messageObtain.arg2 = i;
            messageObtain.sendToTarget();
        }
    }

    public class c extends IRemoteDeviceProcessCallback.Stub {
        private RemoteDeviceProcessListener e;
        private Handler f = new a();

        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 9:
                        b bVar = (b) message.obj;
                        c.this.e.onResponseSystemMemoryInfo(bVar.a, bVar.b);
                        break;
                    case 10:
                        c.this.e.onResponseRunningAppProcessInfo(((RemoteProcessInfoList) message.obj).a);
                        break;
                    case 11:
                        c.this.e.onDoneKillProcess((String) message.obj);
                        break;
                }
            }
        }

        public class b {
            public long a;
            public long b;

            public b(long j, long j2) {
                this.a = j;
                this.b = j2;
            }
        }

        public c(RemoteDeviceProcessListener remoteDeviceProcessListener) {
            this.e = remoteDeviceProcessListener;
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceProcessCallback
        public void onDoneKillProcess(String str) throws RemoteException {
            Message.obtain(this.f, 11, str).sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceProcessCallback
        public void onResponseRunningAppProcessInfo(RemoteProcessInfoList remoteProcessInfoList) throws RemoteException {
            Message.obtain(this.f, 10, remoteProcessInfoList).sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceProcessCallback
        public void onResponseSystemMemoryInfo(long j, long j2) throws RemoteException {
            Message.obtain(this.f, 9, new b(j, j2)).sendToTarget();
        }
    }

    public class d extends IRemoteDeviceSettingCallback.Stub {
        private RemoteDeviceSettingListener d;
        private Handler e = new a();

        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.arg1;
                int i2 = message.arg2;
                int i3 = message.what;
                if (i3 == 12) {
                    d.this.d.onDoneSetting(i, i2);
                } else {
                    if (i3 != 13) {
                        return;
                    }
                    d.this.d.onGetSetting(i, i2);
                }
            }
        }

        public d(RemoteDeviceSettingListener remoteDeviceSettingListener) {
            this.d = remoteDeviceSettingListener;
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceSettingCallback
        public void onDoneSetting(int i, int i2) throws RemoteException {
            Message.obtain(this.e, 12, i, i2).sendToTarget();
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceSettingCallback
        public void onGetSetting(int i, int i2) throws RemoteException {
            Message.obtain(this.e, 13, i, i2).sendToTarget();
        }
    }

    public class e extends IRemoteDeviceStatusCallback.Stub {
        private static final int f = 0;
        private RemoteDeviceStatusListener c;
        private Handler d = new a();

        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 0) {
                    return;
                }
                e.this.c.onRemoteDeviceReady(((Boolean) message.obj).booleanValue());
            }
        }

        public e(RemoteDeviceStatusListener remoteDeviceStatusListener) {
            this.c = remoteDeviceStatusListener;
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceStatusCallback
        public void onRemoteDeviceReady(boolean z) throws RemoteException {
            Message.obtain(this.d, 0, Boolean.valueOf(z)).sendToTarget();
        }
    }

    public RemoteDeviceServiceManager(Context context) {
        super(context);
        this.f = UUID.randomUUID().toString();
        this.m_serviceClientProxy = new a();
    }

    public boolean registerAppListener(RemoteDeviceAppListener remoteDeviceAppListener) {
        IwdsAssert.dieIf(this, remoteDeviceAppListener == null, "Listener is null.");
        if (this.c != null) {
            IwdsLog.e(this, "Unable to register listener: Do you forget to call unregisterAppListener?");
            return false;
        }
        b bVar = new b(remoteDeviceAppListener);
        this.c = bVar;
        try {
            return this.a.registerAppListener(this.f, bVar);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in registerAppListener: " + e2.toString());
            return false;
        }
    }

    public boolean registerProcessListener(RemoteDeviceProcessListener remoteDeviceProcessListener) {
        IwdsAssert.dieIf(this, remoteDeviceProcessListener == null, "Listener is null.");
        if (this.d != null) {
            IwdsLog.e(this, "Unable to register listener: Do you forget to call unregisterProcessListener?");
            return false;
        }
        c cVar = new c(remoteDeviceProcessListener);
        this.d = cVar;
        try {
            return this.a.registerProcessListener(this.f, cVar);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in registerProcessListener: " + e2.toString());
            return false;
        }
    }

    public boolean registerSettingListener(RemoteDeviceSettingListener remoteDeviceSettingListener) {
        IwdsAssert.dieIf(this, remoteDeviceSettingListener == null, "Listener is null.");
        if (this.e != null) {
            IwdsLog.e(this, "Unable to register listener: Do you forget to call unregisterSettingListener?");
            return false;
        }
        d dVar = new d(remoteDeviceSettingListener);
        this.e = dVar;
        try {
            return this.a.registerSettingListener(this.f, dVar);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in registerSettingListener: " + e2.toString());
            return false;
        }
    }

    public boolean registerStatusListener(RemoteDeviceStatusListener remoteDeviceStatusListener) {
        IwdsAssert.dieIf(this, remoteDeviceStatusListener == null, "Listener is null.");
        if (this.b != null) {
            IwdsLog.e(this, "Unable to register listener: Do you forget to call unregisterStatusListener?");
        } else {
            this.b = new e(remoteDeviceStatusListener);
        }
        try {
            return this.a.registerStatusListener(this.f, this.b);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in registerStatusListener: " + e2.toString());
            return false;
        }
    }

    public void requestClearAllAppDataAndCache() {
        try {
            this.a.requestClearAllAppDataAndCache(this.f);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestClearAllAppDataAndCache: " + e2.toString());
        }
    }

    public void requestClearAppDataOrCache(String str, int i) {
        try {
            this.a.requestClearAppDataOrCache(this.f, str, i);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestClearAppDataOrCache: " + e2.toString());
        }
    }

    public void requestDeleteApp(String str) {
        try {
            this.a.requestDeleteApp(this.f, str);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestDeleteApp: " + e2.toString());
        }
    }

    public void requestDoSetting(int i, int i2) {
        try {
            this.a.requestDoSetting(this.f, i, i2);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestSetting: " + e2.toString());
        }
    }

    public void requestGetAppList() {
        try {
            this.a.requestGetAppList(this.f);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestGetAppList: " + e2.toString());
        }
    }

    public void requestGetSetting(int i) {
        try {
            this.a.requestGetSetting(this.f, i);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestGetSetting: " + e2.toString());
        }
    }

    public void requestGetStorageInfo() {
        try {
            this.a.requestGetStorageInfo(this.f);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestGetStorageInfo: " + e2.toString());
        }
    }

    public void requestInstallApp(String str, boolean z) {
        try {
            this.a.requestInstallApp(this.f, str, z);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestInstallApp: " + e2.toString());
        }
    }

    public void requestKillProcess(String str) {
        try {
            this.a.requestKillProcess(this.f, str);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestKillProcess: " + e2.toString());
        }
    }

    public void requestPkgSizeInfo(String str) {
        try {
            this.a.requestPkgSizeInfo(this.f, str);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestPkgSizeInfo: " + e2.toString());
        }
    }

    public void requestRunningAppProcessInfo() {
        try {
            this.a.requestRunningAppProcessInfo(this.f);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestRunningAppProcessInfo: " + e2.toString());
        }
    }

    public void requestSystemMemoryInfo() {
        try {
            this.a.requestSystemMemoryInfo(this.f);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in requestSystemMemoryInfo: " + e2.toString());
        }
    }

    public void unregisterAppListener() {
        b bVar = this.c;
        if (bVar == null) {
            return;
        }
        try {
            this.a.unregisterAppListener(bVar);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in unregisterAppListener: " + e2.toString());
        }
        this.c = null;
    }

    public void unregisterProcessListener() {
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        try {
            this.a.unregisterProcessListener(cVar);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in unregisterProcessListener: " + e2.toString());
        }
        this.d = null;
    }

    public void unregisterSettingListener() {
        d dVar = this.e;
        if (dVar == null) {
            return;
        }
        try {
            this.a.unregisterSettingListener(dVar);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in unregisterSettingListener: " + e2.toString());
        }
        this.e = null;
    }

    public void unregisterStatusListener() {
        e eVar = this.b;
        if (eVar == null) {
            return;
        }
        try {
            this.a.unregisterStatusListener(eVar);
        } catch (RemoteException e2) {
            IwdsLog.e(this, "Exception in unregisterStatusListener: " + e2.toString());
        }
        this.b = null;
    }
}
