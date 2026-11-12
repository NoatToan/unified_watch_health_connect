package com.ingenic.iwds.remotedevice;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.SparseArray;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteDeviceService extends Service {
    private static String w = "C3554F59-EA68-84F1-8C79-96907EF327D6";
    private d a;
    private DataTransactor b;
    private e c;
    private HandlerThread d;
    private b e;
    private RemoteCallbackList<IRemoteDeviceAppCallback> f;
    private RemoteCallbackList<IRemoteDeviceStatusCallback> g;
    private RemoteCallbackList<IRemoteDeviceProcessCallback> h;
    private RemoteCallbackList<IRemoteDeviceSettingCallback> i;
    private c j;
    private LinkedList<String> k;
    private LinkedList<String> l;
    private LinkedList<String> m;
    private LinkedHashMap<String, String> n;
    private LinkedHashMap<String, String> o;
    private HashMap<String, String> p;
    private HashMap<String, String> q;
    private LinkedList<String> r;
    private LinkedList<String> s;
    private LinkedList<String> t;
    private LinkedList<String> u;
    private LinkedList<String> v;

    public class b implements DataTransactor.DataTransactorCallback {
        private b() {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onChannelAvailable(boolean z) {
            RemoteDeviceService.this.c.H(z);
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onDataArrived(Object obj) {
            if (obj instanceof RemoteDeviceManagerInfo.RemoteResponse) {
                RemoteDeviceService.this.c.G((RemoteDeviceManagerInfo.RemoteResponse) obj);
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
            RemoteDeviceService.this.c.I(i);
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
            if (!(dataTransactResult.getTransferedObject() instanceof File) || dataTransactResult.getResultCode() == 0) {
                return;
            }
            RemoteDeviceService.this.c.G(new RemoteDeviceManagerInfo.ResponseWithName(5, -105));
        }
    }

    public class c {
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;
        public static final int f = 3;
        public SparseArray<HashMap<IInterface, String>> a;

        public c() {
            SparseArray<HashMap<IInterface, String>> sparseArray = new SparseArray<>();
            this.a = sparseArray;
            sparseArray.put(0, new HashMap<>());
            this.a.put(1, new HashMap<>());
            this.a.put(2, new HashMap<>());
            this.a.put(3, new HashMap<>());
        }

        public void a(int i, String str, IInterface iInterface) {
            this.a.get(i).put(iInterface, str);
        }

        public boolean b(int i, IInterface iInterface) {
            return this.a.get(i).containsKey(iInterface);
        }

        public String c(int i, IInterface iInterface) {
            return this.a.get(i).remove(iInterface);
        }
    }

    public class d extends IRemoteDeviceService.Stub {
        private d() {
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public boolean registerAppListener(String str, IRemoteDeviceAppCallback iRemoteDeviceAppCallback) throws RemoteException {
            synchronized (RemoteDeviceService.this.j) {
                RemoteDeviceService.this.c.J(str, iRemoteDeviceAppCallback);
                while (!RemoteDeviceService.this.j.b(1, iRemoteDeviceAppCallback)) {
                    try {
                        RemoteDeviceService.this.j.wait();
                    } catch (InterruptedException unused) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public boolean registerProcessListener(String str, IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback) throws RemoteException {
            synchronized (RemoteDeviceService.this.j) {
                RemoteDeviceService.this.c.K(str, iRemoteDeviceProcessCallback);
                while (!RemoteDeviceService.this.j.b(2, iRemoteDeviceProcessCallback)) {
                    try {
                        RemoteDeviceService.this.j.wait();
                    } catch (InterruptedException unused) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public boolean registerSettingListener(String str, IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback) throws RemoteException {
            synchronized (RemoteDeviceService.this.j) {
                RemoteDeviceService.this.c.L(str, iRemoteDeviceSettingCallback);
                while (!RemoteDeviceService.this.j.b(3, iRemoteDeviceSettingCallback)) {
                    try {
                        RemoteDeviceService.this.j.wait();
                    } catch (InterruptedException unused) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public boolean registerStatusListener(String str, IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback) throws RemoteException {
            synchronized (RemoteDeviceService.this.j) {
                RemoteDeviceService.this.c.M(str, iRemoteDeviceStatusCallback);
                while (!RemoteDeviceService.this.j.b(0, iRemoteDeviceStatusCallback)) {
                    try {
                        RemoteDeviceService.this.j.wait();
                    } catch (InterruptedException unused) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestClearAllAppDataAndCache(String str) throws RemoteException {
            RemoteDeviceService.this.c.N(str);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestClearAppDataOrCache(String str, String str2, int i) throws RemoteException {
            RemoteDeviceService.this.c.O(str, str2, i);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestDeleteApp(String str, String str2) throws RemoteException {
            RemoteDeviceService.this.c.P(str, str2);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestDoSetting(String str, int i, int i2) throws RemoteException {
            RemoteDeviceService.this.c.Q(str, i, i2);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestGetAppList(String str) throws RemoteException {
            IwdsLog.d(this, " request to get AppList, uuid " + str);
            RemoteDeviceService.this.c.R(str);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestGetSetting(String str, int i) throws RemoteException {
            RemoteDeviceService.this.c.S(str, i);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestGetStorageInfo(String str) throws RemoteException {
            RemoteDeviceService.this.c.T(str);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestInstallApp(String str, String str2, boolean z) throws RemoteException {
            RemoteDeviceService.this.c.U(str, str2, z);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestKillProcess(String str, String str2) throws RemoteException {
            RemoteDeviceService.this.c.V(str, str2);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestPkgSizeInfo(String str, String str2) throws RemoteException {
            RemoteDeviceService.this.c.W(str, str2);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestRunningAppProcessInfo(String str) throws RemoteException {
            RemoteDeviceService.this.c.X(str);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void requestSystemMemoryInfo(String str) throws RemoteException {
            RemoteDeviceService.this.c.Y(str);
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void unregisterAppListener(IRemoteDeviceAppCallback iRemoteDeviceAppCallback) throws RemoteException {
            synchronized (RemoteDeviceService.this.j) {
                RemoteDeviceService.this.c.Z(iRemoteDeviceAppCallback);
                while (RemoteDeviceService.this.j.b(1, iRemoteDeviceAppCallback)) {
                    try {
                        RemoteDeviceService.this.j.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void unregisterProcessListener(IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback) throws RemoteException {
            synchronized (RemoteDeviceService.this.j) {
                RemoteDeviceService.this.c.a0(iRemoteDeviceProcessCallback);
                while (RemoteDeviceService.this.j.b(2, iRemoteDeviceProcessCallback)) {
                    try {
                        RemoteDeviceService.this.j.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void unregisterSettingListener(IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback) throws RemoteException {
            synchronized (RemoteDeviceService.this.j) {
                RemoteDeviceService.this.c.b0(iRemoteDeviceSettingCallback);
                while (RemoteDeviceService.this.j.b(3, iRemoteDeviceSettingCallback)) {
                    try {
                        RemoteDeviceService.this.j.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
        public void unregisterStatusListener(IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback) throws RemoteException {
            synchronized (RemoteDeviceService.this.j) {
                RemoteDeviceService.this.c.c0(iRemoteDeviceStatusCallback);
                while (RemoteDeviceService.this.j.b(0, iRemoteDeviceStatusCallback)) {
                    try {
                        RemoteDeviceService.this.j.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public RemoteDeviceService() {
        this.a = new d();
        this.e = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(String str) {
        G(this.k, str);
        G(this.l, str);
        G(this.m, str);
        H(this.n, str);
        H(this.o, str);
        H(this.p, str);
        H(this.q, str);
    }

    private void B() {
        this.r.clear();
        this.s.clear();
        this.t.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(String str) {
        G(this.r, str);
        G(this.s, str);
        G(this.t, str);
    }

    private void D() {
        this.u.clear();
        this.v.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(String str) {
        G(this.u, str);
        G(this.v, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F(HashMap<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        IwdsAssert.dieIf(this, map.size() != 1, "the map should contain only one element");
        return map.entrySet().iterator().next().getKey();
    }

    private void G(LinkedList<String> linkedList, Object obj) {
        while (linkedList.contains(obj)) {
            linkedList.remove(obj);
        }
    }

    private void H(HashMap<String, String> map, Object obj) {
        Collection<String> collectionValues = map.values();
        while (collectionValues.contains(obj)) {
            collectionValues.remove(obj);
        }
    }

    private void y() {
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.p.clear();
        this.q.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        y();
        B();
        D();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IwdsLog.d(this, "onBind");
        this.b.start();
        return this.a;
    }

    @Override // android.app.Service
    public void onCreate() {
        IwdsLog.d(this, "onCreate");
        super.onCreate();
        if (this.b == null) {
            this.b = new DataTransactor(this, this.e, w);
        }
        HandlerThread handlerThread = new HandlerThread("RemoteDeviceService");
        this.d = handlerThread;
        handlerThread.start();
        this.c = new e(this.d.getLooper());
        this.g = new RemoteCallbackList<>();
        this.f = new RemoteCallbackList<>();
        this.h = new RemoteCallbackList<>();
        this.i = new RemoteCallbackList<>();
        this.j = new c();
        this.k = new LinkedList<>();
        this.l = new LinkedList<>();
        this.m = new LinkedList<>();
        this.n = new LinkedHashMap<>();
        this.o = new LinkedHashMap<>();
        this.p = new HashMap<>();
        this.q = new HashMap<>();
        this.r = new LinkedList<>();
        this.s = new LinkedList<>();
        this.t = new LinkedList<>();
        this.v = new LinkedList<>();
        this.u = new LinkedList<>();
    }

    @Override // android.app.Service
    public void onDestroy() {
        IwdsLog.d(this, "onDestroy");
        super.onDestroy();
        this.b = null;
        this.d.quit();
        try {
            this.d.join();
        } catch (InterruptedException unused) {
        }
        this.d = null;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IwdsLog.d(this, "onUnbind");
        this.b.stop();
        return super.onUnbind(intent);
    }

    public class e extends Handler {
        private static final int A = 42;
        private static final int B = 43;
        private static final int C = 44;
        private static final int D = 45;
        private static final int E = 46;
        private static final int F = 47;
        private static final int G = 48;
        private static final int H = 49;
        private static final int I = 50;
        private static final int J = 51;
        private static final int K = 52;
        private static final int L = 53;
        private static final int M = 54;
        private static final int N = 60;
        private static final int d = 0;
        private static final int e = 1;
        private static final int f = 2;
        private static final int g = 3;
        private static final int h = 4;
        private static final int i = 10;
        private static final int j = 11;
        private static final int k = 12;
        private static final int l = 13;
        private static final int m = 20;
        private static final int n = 21;
        private static final int o = 22;
        private static final int p = 23;
        private static final int q = 24;
        private static final int r = 25;
        private static final int s = 26;
        private static final int t = 27;
        private static final int u = 28;
        private static final int v = 29;
        private static final int w = 30;
        private static final int x = 31;
        private static final int y = 40;
        private static final int z = 41;
        private boolean a;
        private boolean b;

        public class a<T> {
            public String a;
            public T b;

            public a(String str, T t) {
                this.a = str;
                this.b = t;
            }
        }

        public e(Looper looper) {
            super(looper);
            this.a = false;
            this.b = false;
        }

        private void A(int i2) {
            if (RemoteDeviceService.this.n.isEmpty()) {
                return;
            }
            RemoteDeviceService remoteDeviceService = RemoteDeviceService.this;
            String strF = remoteDeviceService.F(remoteDeviceService.n);
            String str = (String) RemoteDeviceService.this.n.get(strF);
            int iBeginBroadcast = RemoteDeviceService.this.f.beginBroadcast();
            for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                if (str.equals(RemoteDeviceService.this.f.getBroadcastCookie(i3))) {
                    try {
                        ((IRemoteDeviceAppCallback) RemoteDeviceService.this.f.getBroadcastItem(i3)).onSendFileProgressForInstall(strF, i2);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.f.finishBroadcast();
        }

        private void B(RemoteDeviceManagerInfo.StorageInfoResponse storageInfoResponse) {
            if (RemoteDeviceService.this.l.isEmpty()) {
                return;
            }
            l((String) RemoteDeviceService.this.l.removeLast(), storageInfoResponse.c);
        }

        private void C(String str, String str2, int i2) {
            if (RemoteDeviceService.this.q.get(str2) != null || !RemoteDeviceService.this.m.isEmpty()) {
                h(str, str2, i2, -200);
                return;
            }
            RemoteDeviceService.this.q.put(str2, str);
            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(str2, i2));
        }

        private void D(String str, String str2) {
            if (!RemoteDeviceService.this.o.isEmpty()) {
                c(str, str2, -200);
                return;
            }
            RemoteDeviceService.this.o.put(str2, str);
            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(str2, 7));
        }

        private void E(String str, String str2, boolean z2) {
            if (!new File(str2).isFile()) {
                d(str, str2, -3);
                return;
            }
            PackageInfo packageArchiveInfo = RemoteDeviceService.this.getPackageManager().getPackageArchiveInfo(str2, 0);
            if (packageArchiveInfo == null) {
                d(str, str2, -2);
                return;
            }
            String str3 = packageArchiveInfo.packageName;
            IwdsLog.d(this, " request to install app " + str3 + ", uuid " + str);
            if (!RemoteDeviceService.this.n.isEmpty()) {
                d(str, str3, -200);
                return;
            }
            RemoteDeviceService.this.n.put(str3, str);
            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(str3, 5, str2, new File(str2).length(), z2));
        }

        private void F(String str, String str2) {
            if (RemoteDeviceService.this.p.get(str2) != null) {
                i(str, new RemotePackageStats(str2), -200);
                return;
            }
            RemoteDeviceService.this.p.put(str2, str);
            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(str2, 8));
        }

        private void a(String str, RemoteApplicationInfoList remoteApplicationInfoList) {
            int iBeginBroadcast = RemoteDeviceService.this.f.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                if (str.equals(RemoteDeviceService.this.f.getBroadcastCookie(i2))) {
                    try {
                        ((IRemoteDeviceAppCallback) RemoteDeviceService.this.f.getBroadcastItem(i2)).onRemoteAppInfoListAvailable(remoteApplicationInfoList);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.f.finishBroadcast();
        }

        private void b(String str, RemoteDeviceManagerInfo.ClearAllAppDataCacheResponse clearAllAppDataCacheResponse) {
            int i2 = clearAllAppDataCacheResponse.d;
            int i3 = clearAllAppDataCacheResponse.e;
            String str2 = clearAllAppDataCacheResponse.c;
            int i4 = clearAllAppDataCacheResponse.f;
            int i5 = clearAllAppDataCacheResponse.b;
            int iBeginBroadcast = RemoteDeviceService.this.f.beginBroadcast();
            for (int i6 = 0; i6 < iBeginBroadcast; i6++) {
                if (str.equals(RemoteDeviceService.this.f.getBroadcastCookie(i6))) {
                    try {
                        ((IRemoteDeviceAppCallback) RemoteDeviceService.this.f.getBroadcastItem(i6)).onResponseClearAllAppDataAndCache(i2, i3, str2, i4, i5);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.f.finishBroadcast();
        }

        private void c(String str, String str2, int i2) {
            int iBeginBroadcast = RemoteDeviceService.this.f.beginBroadcast();
            for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                if (str.equals(RemoteDeviceService.this.f.getBroadcastCookie(i3))) {
                    try {
                        ((IRemoteDeviceAppCallback) RemoteDeviceService.this.f.getBroadcastItem(i3)).onDoneDeleteApp(str2, i2);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.f.finishBroadcast();
        }

        private void d(String str, String str2, int i2) {
            int iBeginBroadcast = RemoteDeviceService.this.f.beginBroadcast();
            for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                if (str.equals(RemoteDeviceService.this.f.getBroadcastCookie(i3))) {
                    try {
                        ((IRemoteDeviceAppCallback) RemoteDeviceService.this.f.getBroadcastItem(i3)).onDoneInstallApp(str2, i2);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.f.finishBroadcast();
        }

        private void e(String str, String str2) {
            int iBeginBroadcast = RemoteDeviceService.this.h.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                if (str.equals(RemoteDeviceService.this.h.getBroadcastCookie(i2))) {
                    try {
                        ((IRemoteDeviceProcessCallback) RemoteDeviceService.this.h.getBroadcastItem(i2)).onDoneKillProcess(str2);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.h.finishBroadcast();
        }

        private void f(String str, int i2, int i3) {
            int iBeginBroadcast = RemoteDeviceService.this.i.beginBroadcast();
            for (int i4 = 0; i4 < iBeginBroadcast; i4++) {
                if (str.equals(RemoteDeviceService.this.i.getBroadcastCookie(i4))) {
                    try {
                        ((IRemoteDeviceSettingCallback) RemoteDeviceService.this.i.getBroadcastItem(i4)).onDoneSetting(i2, i3);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.i.finishBroadcast();
        }

        private void g(String str, int i2, int i3) {
            int iBeginBroadcast = RemoteDeviceService.this.i.beginBroadcast();
            for (int i4 = 0; i4 < iBeginBroadcast; i4++) {
                if (str.equals(RemoteDeviceService.this.i.getBroadcastCookie(i4))) {
                    try {
                        ((IRemoteDeviceSettingCallback) RemoteDeviceService.this.i.getBroadcastItem(i4)).onGetSetting(i2, i3);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.i.finishBroadcast();
        }

        private void h(String str, String str2, int i2, int i3) {
            int iBeginBroadcast = RemoteDeviceService.this.f.beginBroadcast();
            for (int i4 = 0; i4 < iBeginBroadcast; i4++) {
                if (str.equals(RemoteDeviceService.this.f.getBroadcastCookie(i4))) {
                    try {
                        ((IRemoteDeviceAppCallback) RemoteDeviceService.this.f.getBroadcastItem(i4)).onResponseClearAppDataOrCache(str2, i2, i3);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.f.finishBroadcast();
        }

        private void i(String str, RemotePackageStats remotePackageStats, int i2) {
            int iBeginBroadcast = RemoteDeviceService.this.f.beginBroadcast();
            for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                if (str.equals(RemoteDeviceService.this.f.getBroadcastCookie(i3))) {
                    try {
                        IwdsLog.d(this, " callbackResponsePkgSizeInfo stats " + remotePackageStats + " name " + remotePackageStats.a + " N " + iBeginBroadcast + " i " + i3);
                        ((IRemoteDeviceAppCallback) RemoteDeviceService.this.f.getBroadcastItem(i3)).onResponsePkgSizeInfo(remotePackageStats, i2);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.f.finishBroadcast();
        }

        private void j(String str, RemoteProcessInfoList remoteProcessInfoList) {
            int iBeginBroadcast = RemoteDeviceService.this.h.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                if (str.equals(RemoteDeviceService.this.h.getBroadcastCookie(i2))) {
                    try {
                        ((IRemoteDeviceProcessCallback) RemoteDeviceService.this.h.getBroadcastItem(i2)).onResponseRunningAppProcessInfo(remoteProcessInfoList);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.h.finishBroadcast();
        }

        private void k(String str, long j2, long j3) {
            int iBeginBroadcast = RemoteDeviceService.this.h.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                if (str.equals(RemoteDeviceService.this.h.getBroadcastCookie(i2))) {
                    try {
                        ((IRemoteDeviceProcessCallback) RemoteDeviceService.this.h.getBroadcastItem(i2)).onResponseSystemMemoryInfo(j2, j3);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.h.finishBroadcast();
        }

        private void l(String str, RemoteStorageInfo remoteStorageInfo) {
            int iBeginBroadcast = RemoteDeviceService.this.f.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                if (str.equals(RemoteDeviceService.this.f.getBroadcastCookie(i2))) {
                    try {
                        ((IRemoteDeviceAppCallback) RemoteDeviceService.this.f.getBroadcastItem(i2)).onRemoteStorageInfoAvailable(remoteStorageInfo);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.f.finishBroadcast();
        }

        private void m(RemoteDeviceManagerInfo.AppListResponse appListResponse) {
            if (RemoteDeviceService.this.k.isEmpty()) {
                return;
            }
            a((String) RemoteDeviceService.this.k.removeLast(), appListResponse.c);
        }

        private void n(RemoteDeviceManagerInfo.ConfirmInstallResponse confirmInstallResponse) {
            if (RemoteDeviceService.this.n.isEmpty()) {
                return;
            }
            int i2 = confirmInstallResponse.b;
            File file = new File(confirmInstallResponse.d);
            IwdsLog.d(this, "installation confirm, returnCode " + i2);
            RemoteDeviceService remoteDeviceService = RemoteDeviceService.this;
            String strF = remoteDeviceService.F(remoteDeviceService.n);
            boolean z2 = i2 != 1;
            boolean zIsFile = file.isFile();
            if (!z2 && zIsFile) {
                RemoteDeviceService.this.b.send(file);
                return;
            }
            if (!z2) {
                i2 = -3;
            }
            p(new RemoteDeviceManagerInfo.ResponseWithName(strF, 5, i2));
        }

        private void o(RemoteDeviceManagerInfo.ResponseWithName responseWithName) {
            if (RemoteDeviceService.this.o.isEmpty()) {
                return;
            }
            int i2 = responseWithName.b;
            RemoteDeviceService remoteDeviceService = RemoteDeviceService.this;
            String strF = remoteDeviceService.F(remoteDeviceService.o);
            String str = (String) RemoteDeviceService.this.o.remove(strF);
            IwdsLog.d(this, strF + " deletion done, return code: " + i2 + " uuid " + str);
            c(str, strF, i2);
        }

        private void p(RemoteDeviceManagerInfo.ResponseWithName responseWithName) {
            if (RemoteDeviceService.this.n.isEmpty()) {
                return;
            }
            int i2 = responseWithName.b;
            RemoteDeviceService remoteDeviceService = RemoteDeviceService.this;
            String strF = remoteDeviceService.F(remoteDeviceService.n);
            String str = (String) RemoteDeviceService.this.n.remove(strF);
            IwdsLog.d(this, strF + " installation done, return code: " + i2 + " uuid " + str);
            d(str, strF, i2);
        }

        private void q(RemoteDeviceManagerInfo.SettingResponse settingResponse) {
            if (RemoteDeviceService.this.u.isEmpty()) {
                return;
            }
            f((String) RemoteDeviceService.this.u.removeLast(), settingResponse.c, settingResponse.b);
        }

        private void r(RemoteDeviceManagerInfo.SettingResponse settingResponse) {
            if (RemoteDeviceService.this.v.isEmpty()) {
                return;
            }
            g((String) RemoteDeviceService.this.v.removeLast(), settingResponse.c, settingResponse.b);
        }

        private void s(RemoteDeviceManagerInfo.ResponseWithName responseWithName) {
            if (RemoteDeviceService.this.t.isEmpty()) {
                return;
            }
            e((String) RemoteDeviceService.this.t.removeLast(), responseWithName.c);
        }

        private void t(String str, boolean z2) {
            int iBeginBroadcast = RemoteDeviceService.this.g.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                if (str.equals(RemoteDeviceService.this.g.getBroadcastCookie(i2))) {
                    try {
                        ((IRemoteDeviceStatusCallback) RemoteDeviceService.this.g.getBroadcastItem(i2)).onRemoteDeviceReady(z2);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
            }
            RemoteDeviceService.this.g.finishBroadcast();
        }

        private void u(boolean z2) {
            if (!z2) {
                RemoteDeviceService.this.z();
            }
            int iBeginBroadcast = RemoteDeviceService.this.g.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    ((IRemoteDeviceStatusCallback) RemoteDeviceService.this.g.getBroadcastItem(i2)).onRemoteDeviceReady(z2);
                } catch (RemoteException unused) {
                }
            }
            RemoteDeviceService.this.g.finishBroadcast();
        }

        private void v(RemoteDeviceManagerInfo.ClearAllAppDataCacheResponse clearAllAppDataCacheResponse) {
            if (RemoteDeviceService.this.m.isEmpty()) {
                return;
            }
            String str = (String) RemoteDeviceService.this.m.getLast();
            if (clearAllAppDataCacheResponse.e == clearAllAppDataCacheResponse.d) {
                RemoteDeviceService.this.m.removeLast();
            }
            b(str, clearAllAppDataCacheResponse);
        }

        private void w(RemoteDeviceManagerInfo.ResponseWithName responseWithName) {
            String str = responseWithName.c;
            String str2 = (String) RemoteDeviceService.this.q.remove(str);
            if (str2 == null) {
                return;
            }
            h(str2, str, responseWithName.a, responseWithName.b);
        }

        private void x(RemoteDeviceManagerInfo.PkgInfoResponse pkgInfoResponse) {
            RemotePackageStats remotePackageStats = pkgInfoResponse.d;
            String str = remotePackageStats.a;
            IwdsLog.d(this, " doOnResponsePkgSizeInfo packageName" + str);
            String str2 = (String) RemoteDeviceService.this.p.remove(str);
            if (str2 == null) {
                return;
            }
            i(str2, remotePackageStats, pkgInfoResponse.b);
        }

        private void y(RemoteDeviceManagerInfo.ProcessInfoResponse processInfoResponse) {
            if (RemoteDeviceService.this.s.isEmpty()) {
                return;
            }
            j((String) RemoteDeviceService.this.s.removeLast(), processInfoResponse.c);
        }

        private void z(RemoteDeviceManagerInfo.SysMemResponse sysMemResponse) {
            if (RemoteDeviceService.this.r.isEmpty()) {
                return;
            }
            k((String) RemoteDeviceService.this.r.removeLast(), sysMemResponse.c, sysMemResponse.d);
        }

        public void G(RemoteDeviceManagerInfo.RemoteResponse remoteResponse) {
            Message messageObtain = Message.obtain(this);
            messageObtain.obj = remoteResponse;
            int i2 = remoteResponse.a;
            if (i2 == 20) {
                messageObtain.what = 51;
            } else if (i2 != 21) {
                switch (i2) {
                    case 0:
                    case 1:
                        messageObtain.what = 45;
                        break;
                    case 2:
                        messageObtain.what = 49;
                        break;
                    case 3:
                        messageObtain.what = 40;
                        break;
                    case 4:
                        messageObtain.what = 48;
                        break;
                    case 5:
                        messageObtain.what = 42;
                        break;
                    case 6:
                        messageObtain.what = 41;
                        break;
                    case 7:
                        messageObtain.what = 43;
                        break;
                    case 8:
                        messageObtain.what = 44;
                        break;
                    case 9:
                        messageObtain.what = 46;
                        break;
                    case 10:
                        messageObtain.what = 47;
                        break;
                    case 11:
                        messageObtain.what = 50;
                        break;
                    case 12:
                        messageObtain.what = 53;
                        break;
                    case 13:
                        messageObtain.what = 54;
                        break;
                }
            } else {
                messageObtain.what = 52;
            }
            messageObtain.sendToTarget();
        }

        public void H(boolean z2) {
            Message messageObtain = Message.obtain(this, 0);
            messageObtain.arg1 = z2 ? 1 : 0;
            messageObtain.sendToTarget();
        }

        public void I(int i2) {
            Message messageObtain = Message.obtain(this, 60);
            messageObtain.arg1 = i2;
            messageObtain.sendToTarget();
        }

        public void J(String str, IRemoteDeviceAppCallback iRemoteDeviceAppCallback) {
            Message.obtain(this, 2, new a(str, iRemoteDeviceAppCallback)).sendToTarget();
        }

        public void K(String str, IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback) {
            Message.obtain(this, 3, new a(str, iRemoteDeviceProcessCallback)).sendToTarget();
        }

        public void L(String str, IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback) {
            Message.obtain(this, 4, new a(str, iRemoteDeviceSettingCallback)).sendToTarget();
        }

        public void M(String str, IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback) {
            Message.obtain(this, 1, new a(str, iRemoteDeviceStatusCallback)).sendToTarget();
        }

        public void N(String str) {
            Message.obtain(this, 29, str).sendToTarget();
        }

        public void O(String str, String str2, int i2) {
            Message messageObtain = Message.obtain(this, 24, new b(str, str2));
            messageObtain.arg1 = i2;
            messageObtain.sendToTarget();
        }

        public void P(String str, String str2) {
            Message.obtain(this, 22, new b(str, str2)).sendToTarget();
        }

        public void Q(String str, int i2, int i3) {
            Message.obtain(this, 30, i2, i3, str).sendToTarget();
        }

        public void R(String str) {
            Message.obtain(this, 20, str).sendToTarget();
        }

        public void S(String str, int i2) {
            Message messageObtain = Message.obtain(this, 31, str);
            messageObtain.arg1 = i2;
            messageObtain.sendToTarget();
        }

        public void T(String str) {
            Message.obtain(this, 28, str).sendToTarget();
        }

        public void U(String str, String str2, boolean z2) {
            Message.obtain(this, 21, new b(str, str2, z2)).sendToTarget();
        }

        public void V(String str, String str2) {
            Message.obtain(this, 26, new b(str, str2)).sendToTarget();
        }

        public void W(String str, String str2) {
            Message.obtain(this, 23, new b(str, str2)).sendToTarget();
        }

        public void X(String str) {
            Message.obtain(this, 27, str).sendToTarget();
        }

        public void Y(String str) {
            Message.obtain(this, 25, str).sendToTarget();
        }

        public void Z(IRemoteDeviceAppCallback iRemoteDeviceAppCallback) {
            Message.obtain(this, 11, iRemoteDeviceAppCallback).sendToTarget();
        }

        public void a0(IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback) {
            Message.obtain(this, 12, iRemoteDeviceProcessCallback).sendToTarget();
        }

        public void b0(IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback) {
            Message.obtain(this, 13, iRemoteDeviceSettingCallback).sendToTarget();
        }

        public void c0(IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback) {
            Message.obtain(this, 10, iRemoteDeviceStatusCallback).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String strC;
            String strC2;
            String strC3;
            int i2 = message.what;
            if (i2 == 0) {
                boolean z2 = message.arg1 == 1;
                if (!z2) {
                    this.b = false;
                }
                u(z2);
                this.a = z2;
                return;
            }
            if (i2 == 1) {
                a aVar = (a) message.obj;
                String str = aVar.a;
                IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback = (IRemoteDeviceStatusCallback) aVar.b;
                synchronized (RemoteDeviceService.this.j) {
                    RemoteDeviceService.this.g.register(iRemoteDeviceStatusCallback, str);
                    RemoteDeviceService.this.j.a(0, str, iRemoteDeviceStatusCallback);
                    RemoteDeviceService.this.j.notifyAll();
                }
                t(str, this.a);
                return;
            }
            if (i2 == 2) {
                a aVar2 = (a) message.obj;
                String str2 = aVar2.a;
                IRemoteDeviceAppCallback iRemoteDeviceAppCallback = (IRemoteDeviceAppCallback) aVar2.b;
                synchronized (RemoteDeviceService.this.j) {
                    RemoteDeviceService.this.f.register(iRemoteDeviceAppCallback, str2);
                    IwdsLog.d(this, "register app " + str2);
                    RemoteDeviceService.this.j.a(1, str2, iRemoteDeviceAppCallback);
                    RemoteDeviceService.this.j.notifyAll();
                }
                return;
            }
            if (i2 == 3) {
                a aVar3 = (a) message.obj;
                String str3 = aVar3.a;
                IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback = (IRemoteDeviceProcessCallback) aVar3.b;
                synchronized (RemoteDeviceService.this.j) {
                    RemoteDeviceService.this.h.register(iRemoteDeviceProcessCallback, str3);
                    IwdsLog.d(this, "register process " + str3);
                    RemoteDeviceService.this.j.a(2, str3, iRemoteDeviceProcessCallback);
                    RemoteDeviceService.this.j.notifyAll();
                }
                return;
            }
            if (i2 == 4) {
                a aVar4 = (a) message.obj;
                String str4 = aVar4.a;
                IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback = (IRemoteDeviceSettingCallback) aVar4.b;
                synchronized (RemoteDeviceService.this.j) {
                    RemoteDeviceService.this.i.register(iRemoteDeviceSettingCallback, str4);
                    IwdsLog.d(this, "register sensor listener " + str4);
                    RemoteDeviceService.this.j.a(3, str4, iRemoteDeviceSettingCallback);
                    RemoteDeviceService.this.j.notifyAll();
                }
                return;
            }
            if (i2 == 60) {
                A(message.arg1);
                return;
            }
            switch (i2) {
                case 10:
                    IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback2 = (IRemoteDeviceStatusCallback) message.obj;
                    synchronized (RemoteDeviceService.this.j) {
                        RemoteDeviceService.this.g.unregister(iRemoteDeviceStatusCallback2);
                        RemoteDeviceService.this.j.c(0, iRemoteDeviceStatusCallback2);
                        RemoteDeviceService.this.j.notifyAll();
                        break;
                    }
                    return;
                case 11:
                    IRemoteDeviceAppCallback iRemoteDeviceAppCallback2 = (IRemoteDeviceAppCallback) message.obj;
                    synchronized (RemoteDeviceService.this.j) {
                        RemoteDeviceService.this.f.unregister(iRemoteDeviceAppCallback2);
                        strC = RemoteDeviceService.this.j.c(1, iRemoteDeviceAppCallback2);
                        RemoteDeviceService.this.j.notifyAll();
                        break;
                    }
                    RemoteDeviceService.this.A(strC);
                    return;
                case 12:
                    IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback2 = (IRemoteDeviceProcessCallback) message.obj;
                    synchronized (RemoteDeviceService.this.j) {
                        RemoteDeviceService.this.h.unregister(iRemoteDeviceProcessCallback2);
                        strC2 = RemoteDeviceService.this.j.c(2, iRemoteDeviceProcessCallback2);
                        RemoteDeviceService.this.j.notifyAll();
                        break;
                    }
                    RemoteDeviceService.this.C(strC2);
                    return;
                case 13:
                    IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback2 = (IRemoteDeviceSettingCallback) message.obj;
                    synchronized (RemoteDeviceService.this.j) {
                        RemoteDeviceService.this.i.unregister(iRemoteDeviceSettingCallback2);
                        strC3 = RemoteDeviceService.this.j.c(3, iRemoteDeviceSettingCallback2);
                        RemoteDeviceService.this.j.notifyAll();
                        break;
                    }
                    RemoteDeviceService.this.E(strC3);
                    return;
                default:
                    switch (i2) {
                        case 20:
                            RemoteDeviceService.this.k.addFirst((String) message.obj);
                            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(3));
                            return;
                        case 21:
                            b bVar = (b) message.obj;
                            E(bVar.a, bVar.b, bVar.d);
                            return;
                        case 22:
                            b bVar2 = (b) message.obj;
                            D(bVar2.a, bVar2.c);
                            return;
                        case 23:
                            b bVar3 = (b) message.obj;
                            F(bVar3.a, bVar3.c);
                            return;
                        case 24:
                            b bVar4 = (b) message.obj;
                            C(bVar4.a, bVar4.c, message.arg1);
                            return;
                        case 25:
                            RemoteDeviceService.this.r.addFirst((String) message.obj);
                            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(9));
                            return;
                        case 26:
                            b bVar5 = (b) message.obj;
                            RemoteDeviceService.this.t.addFirst(bVar5.a);
                            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(bVar5.c, 11));
                            return;
                        case 27:
                            RemoteDeviceService.this.s.addFirst((String) message.obj);
                            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(10));
                            return;
                        case 28:
                            RemoteDeviceService.this.l.addFirst((String) message.obj);
                            RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(4));
                            return;
                        case 29:
                            String str5 = (String) message.obj;
                            if (!RemoteDeviceService.this.m.isEmpty() || !RemoteDeviceService.this.q.isEmpty()) {
                                b(str5, new RemoteDeviceManagerInfo.ClearAllAppDataCacheResponse(-200));
                                return;
                            } else {
                                RemoteDeviceService.this.m.addFirst(str5);
                                RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(2));
                                return;
                            }
                        case 30:
                            String str6 = (String) message.obj;
                            int i3 = message.arg1;
                            int i4 = message.arg2;
                            if (!this.b) {
                                f(str6, i3, -201);
                                return;
                            } else {
                                RemoteDeviceService.this.u.addFirst(str6);
                                RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(12, i3, i4));
                                return;
                            }
                        case 31:
                            String str7 = (String) message.obj;
                            int i5 = message.arg1;
                            if (!this.b) {
                                g(str7, i5, -201);
                                return;
                            } else {
                                RemoteDeviceService.this.v.addFirst(str7);
                                RemoteDeviceService.this.b.send(new RemoteDeviceManagerInfo.a(13, i5));
                                return;
                            }
                        default:
                            switch (i2) {
                                case 40:
                                    m((RemoteDeviceManagerInfo.AppListResponse) message.obj);
                                    return;
                                case 41:
                                    n((RemoteDeviceManagerInfo.ConfirmInstallResponse) message.obj);
                                    return;
                                case 42:
                                    p((RemoteDeviceManagerInfo.ResponseWithName) message.obj);
                                    return;
                                case 43:
                                    o((RemoteDeviceManagerInfo.ResponseWithName) message.obj);
                                    return;
                                case 44:
                                    x((RemoteDeviceManagerInfo.PkgInfoResponse) message.obj);
                                    return;
                                case 45:
                                    w((RemoteDeviceManagerInfo.ResponseWithName) message.obj);
                                    return;
                                case 46:
                                    z((RemoteDeviceManagerInfo.SysMemResponse) message.obj);
                                    return;
                                case 47:
                                    y((RemoteDeviceManagerInfo.ProcessInfoResponse) message.obj);
                                    return;
                                case 48:
                                    B((RemoteDeviceManagerInfo.StorageInfoResponse) message.obj);
                                    return;
                                case 49:
                                    v((RemoteDeviceManagerInfo.ClearAllAppDataCacheResponse) message.obj);
                                    return;
                                case 50:
                                    s((RemoteDeviceManagerInfo.ResponseWithName) message.obj);
                                    return;
                                case 51:
                                    this.b = true;
                                    return;
                                case 52:
                                    this.b = false;
                                    return;
                                case 53:
                                    q((RemoteDeviceManagerInfo.SettingResponse) message.obj);
                                    return;
                                case 54:
                                    r((RemoteDeviceManagerInfo.SettingResponse) message.obj);
                                    return;
                                default:
                                    return;
                            }
                    }
            }
        }

        public class b {
            public String a;
            public String b;
            public String c;
            public boolean d;

            public b(String str, String str2, boolean z) {
                this.a = str;
                this.b = str2;
                this.d = z;
            }

            public b(String str, String str2) {
                this.a = str;
                this.c = str2;
            }
        }
    }
}
