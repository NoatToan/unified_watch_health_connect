package com.ingenic.iwds.remotedevice;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageDeleteObserver;
import android.content.pm.IPackageInstallObserver;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.net.Uri;
import android.os.Environment;
import android.os.RemoteException;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.common.api.ConnectFailedReason;
import com.ingenic.iwds.common.api.ServiceClient;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.devicemanager.DeviceManagerServiceManager;
import com.ingenic.iwds.utils.IwdsLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public class DeviceManagerProxy {
    public static final String CLEAR_APP_DATA_ACTION_TEMPLATE = "ingenic.intent.action.%s_DATA_CLEARED";
    private static String i = "C3554F59-EA68-84F1-8C79-96907EF327D6";
    private static DeviceManagerProxy j;
    private DataTransactor a;
    private ServiceClient b;
    private DeviceManagerServiceManager c;
    private PackageManager d;
    private ActivityManager e;
    private HashMap<String, Boolean> f;
    private ServiceClient.ConnectionCallbacks g = new a();
    private DataTransactor.DataTransactorCallback h = new b();
    public Context mContext;

    public class a implements ServiceClient.ConnectionCallbacks {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
        public void onConnectFailed(ServiceClient serviceClient, ConnectFailedReason connectFailedReason) {
            IwdsLog.e(this, "Failed to connect to device management service: " + connectFailedReason.toString());
        }

        @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
        public void onConnected(ServiceClient serviceClient) {
            DeviceManagerProxy deviceManagerProxy = DeviceManagerProxy.this;
            deviceManagerProxy.c = (DeviceManagerServiceManager) deviceManagerProxy.b.getServiceManagerContext();
            DeviceManagerProxy.this.s(true);
        }

        @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
        public void onDisconnected(ServiceClient serviceClient, boolean z) {
            IwdsLog.i(this, "device management service disconnected");
            DeviceManagerProxy.this.s(false);
        }
    }

    public class b implements DataTransactor.DataTransactorCallback {
        public b() {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onChannelAvailable(boolean z) {
            if (z) {
                DeviceManagerProxy.this.b.connect();
            } else {
                DeviceManagerProxy.this.b.disconnect();
            }
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onDataArrived(Object obj) {
            if (obj instanceof File) {
                DeviceManagerProxy.this.t((File) obj);
            }
            RemoteDeviceManagerInfo.a aVar = (RemoteDeviceManagerInfo.a) obj;
            switch (aVar.b) {
                case 0:
                case 1:
                    DeviceManagerProxy.this.w(aVar);
                    break;
                case 2:
                    DeviceManagerProxy.this.u();
                    break;
                case 3:
                    DeviceManagerProxy.this.y();
                    break;
                case 4:
                    DeviceManagerProxy.this.A();
                    break;
                case 5:
                    DeviceManagerProxy.this.B(aVar);
                    break;
                case 7:
                    DeviceManagerProxy.this.v(aVar.a);
                    break;
                case 8:
                    DeviceManagerProxy.this.D(aVar.a);
                    break;
                case 9:
                    DeviceManagerProxy.this.F();
                    break;
                case 10:
                    DeviceManagerProxy.this.E();
                    break;
                case 11:
                    DeviceManagerProxy.this.C(aVar.a);
                    break;
                case 12:
                    DeviceManagerProxy.this.x(aVar.c, aVar.d);
                    break;
                case 13:
                    DeviceManagerProxy.this.z(aVar.c);
                    break;
            }
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onRecvFileProgress(int i) {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onSendFileProgress(int i) {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
            if (dataTransactResult.getResultCode() != 0) {
                IwdsLog.e(this, "send failed, error code " + dataTransactResult.getResultCode());
            }
        }
    }

    public class c extends IPackageDataObserver.Stub {
        private int a;
        private int b = 0;

        public c(List<PackageInfo> list) {
            this.a = list.size() * 2;
        }

        public void a(String str, boolean z) throws RemoteException {
            int i = z ? 0 : RemoteDeviceManagerInfo.REQUEST_REMOTE_FAILED;
            int i2 = this.b + 1;
            this.b = i2;
            int i3 = (i2 & 1) != 1 ? 1 : 0;
            RemoteDeviceManagerInfo.ClearAllAppDataCacheResponse clearAllAppDataCacheResponse = new RemoteDeviceManagerInfo.ClearAllAppDataCacheResponse(this.a, this.b, str, i3, i);
            if (i3 == 0) {
                DeviceManagerProxy.this.G(str);
            }
            DeviceManagerProxy.this.a.send(clearAllAppDataCacheResponse);
        }
    }

    public class d extends IPackageDataObserver.Stub {
        private d() {
        }

        public void a(String str, boolean z) throws RemoteException {
            DeviceManagerProxy.this.a.send(new RemoteDeviceManagerInfo.ResponseWithName(str, 1, z ? 0 : RemoteDeviceManagerInfo.REQUEST_REMOTE_FAILED));
        }

        public /* synthetic */ d(DeviceManagerProxy deviceManagerProxy, a aVar) {
            this();
        }
    }

    public class e extends IPackageDataObserver.Stub {
        private e() {
        }

        public void a(String str, boolean z) throws RemoteException {
            RemoteDeviceManagerInfo.ResponseWithName responseWithName = new RemoteDeviceManagerInfo.ResponseWithName(str, 0, z ? 0 : RemoteDeviceManagerInfo.REQUEST_REMOTE_FAILED);
            DeviceManagerProxy.this.G(str);
            DeviceManagerProxy.this.a.send(responseWithName);
        }

        public /* synthetic */ e(DeviceManagerProxy deviceManagerProxy, a aVar) {
            this();
        }
    }

    public class f extends IPackageDeleteObserver.Stub {
        private f() {
        }

        public void a(String str, int i) {
            IwdsLog.d(this, " package: " + str + " deletion return code = " + i);
            if (i != 1) {
                i = RemoteDeviceManagerInfo.a(i);
            }
            DeviceManagerProxy.this.a.send(new RemoteDeviceManagerInfo.ResponseWithName(str, 7, i));
        }

        public /* synthetic */ f(DeviceManagerProxy deviceManagerProxy, a aVar) {
            this();
        }
    }

    public class g extends IPackageInstallObserver.Stub {
        private g() {
        }

        public void a(String str, int i) {
            IwdsLog.d(this, " package: " + str + " installation return code = " + i);
            DeviceManagerProxy.this.a.send(new RemoteDeviceManagerInfo.ResponseWithName(str, 5, i));
        }

        public /* synthetic */ g(DeviceManagerProxy deviceManagerProxy, a aVar) {
            this();
        }
    }

    public class h extends IPackageStatsObserver.Stub {
        private h() {
        }

        public void a(PackageStats packageStats, boolean z) throws RemoteException {
            String str = packageStats.packageName;
            IwdsLog.d(this, " package: " + str + " get pkgSizeInfo isSucceeded?  " + z);
            RemotePackageStats remotePackageStats = new RemotePackageStats(packageStats);
            RemoteDeviceManagerInfo.PkgInfoResponse pkgInfoResponse = new RemoteDeviceManagerInfo.PkgInfoResponse(str, z ? 0 : RemoteDeviceManagerInfo.REQUEST_REMOTE_FAILED);
            pkgInfoResponse.d = remotePackageStats;
            DeviceManagerProxy.this.a.send(pkgInfoResponse);
        }

        public /* synthetic */ h(DeviceManagerProxy deviceManagerProxy, a aVar) {
            this();
        }
    }

    private DeviceManagerProxy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        long totalSpace;
        File dataDirectory = Environment.getDataDirectory();
        long freeSpace = dataDirectory.getFreeSpace();
        long totalSpace2 = dataDirectory.getTotalSpace();
        File file = new File("/storage/sdcard1");
        boolean zIsDirectory = file.isDirectory();
        long freeSpace2 = 0;
        if (zIsDirectory) {
            freeSpace2 = file.getFreeSpace();
            totalSpace = file.getTotalSpace();
        } else {
            totalSpace = 0;
        }
        this.a.send(new RemoteDeviceManagerInfo.StorageInfoResponse(new RemoteStorageInfo(freeSpace, totalSpace2, zIsDirectory, freeSpace2, totalSpace)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(RemoteDeviceManagerInfo.a aVar) {
        long usableSpace = Environment.getExternalStorageDirectory().getUsableSpace();
        long j2 = aVar.g;
        String str = aVar.e;
        int i2 = usableSpace < j2 ? -4 : 1;
        IwdsLog.d(this, "usableSpace: " + usableSpace + " bytes, requiredSize: " + j2 + " bytes, errorCode: " + i2);
        this.f.put(str.substring(str.lastIndexOf(47) + 1), Boolean.valueOf(aVar.f));
        this.a.send(new RemoteDeviceManagerInfo.ConfirmInstallResponse(aVar.a, str, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(String str) {
        IwdsLog.d(this, " on request to kill " + str);
        this.e.forceStopPackage(str);
        this.a.send(new RemoteDeviceManagerInfo.ResponseWithName(str, 11, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str) {
        IwdsLog.d(this, " on request to get " + str + " sizeInfo");
        this.d.getPackageSizeInfo(str, new h(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        RemoteProcessInfoList remoteProcessInfoList = new RemoteProcessInfoList();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : this.e.getRunningAppProcesses()) {
            int i2 = runningAppProcessInfo.pid;
            int i3 = runningAppProcessInfo.uid;
            String str = runningAppProcessInfo.processName;
            int totalPss = this.e.getProcessMemoryInfo(new int[]{i2})[0].getTotalPss();
            IwdsLog.d(this, "processName: " + str + "  pid: " + i2 + " uid:" + i3 + " memorySize is -->" + totalPss + "kB");
            remoteProcessInfoList.a(new RemoteProcessInfo(str, i2, i3, totalPss));
            String[] strArr = runningAppProcessInfo.pkgList;
            StringBuilder sb = new StringBuilder();
            sb.append("process id is ");
            sb.append(i2);
            sb.append(" has ");
            sb.append(strArr.length);
            IwdsLog.d(this, sb.toString());
            for (String str2 : strArr) {
                IwdsLog.d(this, " packageName " + str2 + " in process id is -->" + i2);
            }
        }
        this.a.send(new RemoteDeviceManagerInfo.ProcessInfoResponse(remoteProcessInfoList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.e.getMemoryInfo(memoryInfo);
        this.a.send(new RemoteDeviceManagerInfo.SysMemResponse(memoryInfo.availMem, memoryInfo.totalMem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(String str) {
        this.mContext.sendBroadcast(new Intent(String.format(CLEAR_APP_DATA_ACTION_TEMPLATE, str.replace(".", "_").toUpperCase(Locale.getDefault()))));
    }

    public static DeviceManagerProxy getInstance() {
        if (j == null) {
            j = new DeviceManagerProxy();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(boolean z) {
        this.a.send(new RemoteDeviceManagerInfo.RemoteResponse(z ? 20 : 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(File file) {
        IwdsLog.d(this, file + " received for installation. size: " + file.length());
        this.d.installPackage(Uri.fromFile(file), new g(this, null), this.f.remove(file.getName()).booleanValue() ? 10 : 18, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        List<PackageInfo> installedPackages = this.d.getInstalledPackages(8192);
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : installedPackages) {
            String str = packageInfo.packageName;
            if (str.contains("com.ingenic") && !str.equals("com.ingenic.iwds.device") && !str.equals("com.ingenic.launcher")) {
                arrayList.add(packageInfo);
            }
        }
        IPackageDataObserver cVar = new c(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = ((PackageInfo) it2.next()).packageName;
            this.d.deleteApplicationCacheFiles(str2, cVar);
            this.e.clearApplicationUserData(str2, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        IwdsLog.d(this, " on request to delete " + str);
        this.d.deletePackage(str, new f(this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(RemoteDeviceManagerInfo.a aVar) {
        String str = aVar.a;
        a aVar2 = null;
        if (aVar.b == 0) {
            IwdsLog.d(this, " on request to clear user data of " + str);
            this.e.clearApplicationUserData(str, new e(this, aVar2));
            return;
        }
        IwdsLog.d(this, " on request to clear cache of " + str);
        this.d.deleteApplicationCacheFiles(str, new d(this, aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i2, int i3) {
        if (i2 == 0) {
            this.c.setWearOnRightHand(i3 == 1);
        }
        this.a.send(new RemoteDeviceManagerInfo.SettingResponse(12, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        IwdsLog.d(this, " received request to get app list.");
        this.a.send(new RemoteDeviceManagerInfo.AppListResponse(new RemoteApplicationInfoList(this.d, this.d.getInstalledPackages(8192))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i2) {
        int i3;
        if (i2 != 0) {
            i3 = RemoteDeviceManagerInfo.REQUEST_REMOTE_FAILED;
        } else {
            i3 = this.c.isWearOnRightHand() ? 1 : 2;
        }
        this.a.send(new RemoteDeviceManagerInfo.SettingResponse(13, i2, i3));
    }

    public void initialize(Context context) {
        IwdsLog.d(this, "initialize");
        this.a = new DataTransactor(context, this.h, i);
        this.mContext = context;
        this.d = context.getPackageManager();
        this.e = (ActivityManager) context.getSystemService("activity");
        this.b = new ServiceClient(context, ServiceManagerContext.SERVICE_DEVICE_MANAGER, this.g);
        this.f = new HashMap<>();
    }

    public void start() {
        IwdsLog.i(this, "start");
        this.a.start();
    }
}
