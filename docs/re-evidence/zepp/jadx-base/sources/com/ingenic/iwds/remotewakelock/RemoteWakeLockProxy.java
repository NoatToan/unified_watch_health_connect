package com.ingenic.iwds.remotewakelock;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.util.SparseArray;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.utils.IwdsLog;
import com.ingenic.iwds.utils.IwdsUtils;
import com.ingenic.iwds.utils.SimpleIDAlloter;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteWakeLockProxy {
    private static RemoteWakeLockProxy l;
    private final PowerManager a;
    private final c b;
    private final DataTransactor c;
    private volatile boolean d;
    private SimpleIDAlloter e = SimpleIDAlloter.newInstance();
    private HandlerThread f;
    private Handler g;
    private SparseArray<IRemoteWakeLockCallback> h;
    private SparseArray<SparseArray<PowerManager.WakeLock>> i;
    private SparseArray<SparseArray<CreateInfo>> j;
    private SparseArray<SparseArray<CreateInfo>> k;

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    RemoteWakeLockProxy.this.o(message.arg1, (IRemoteWakeLockCallback) message.obj);
                    break;
                case 2:
                    RemoteWakeLockProxy.this.D(message.arg1);
                    break;
                case 3:
                    RemoteWakeLockProxy.this.G((CreateInfo) message.obj);
                    break;
                case 4:
                    RemoteWakeLockProxy.this.M((CreateInfo) message.obj);
                    break;
                case 5:
                    RemoteWakeLockProxy.this.p((DataTransactor.DataTransactResult) message.obj);
                    break;
                case 6:
                    RemoteWakeLockProxy.this.z(message.obj);
                    break;
                case 7:
                    RemoteWakeLockProxy.this.K();
                    break;
                case 8:
                    RemoteWakeLockProxy.this.O();
                    break;
                case 9:
                    RemoteWakeLockProxy.this.L(message.arg1, message.arg2);
                    break;
                case 10:
                    RemoteWakeLockProxy.this.S();
                    break;
                case 11:
                    RemoteWakeLockProxy.this.U();
                    break;
                case 12:
                    RemoteWakeLockProxy.this.A(((Boolean) message.obj).booleanValue());
                    break;
            }
        }
    }

    public class c implements DataTransactor.DataTransactorCallback {
        private c() {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onChannelAvailable(boolean z) {
            RemoteWakeLockProxy.this.d = z;
            if (z) {
                RemoteWakeLockProxy.this.g.sendEmptyMessage(8);
            } else {
                RemoteWakeLockProxy.this.g.sendEmptyMessage(7);
                RemoteWakeLockProxy.this.g.sendEmptyMessage(10);
            }
            RemoteWakeLockProxy.this.g.obtainMessage(12, Boolean.valueOf(z)).sendToTarget();
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onDataArrived(Object obj) {
            RemoteWakeLockProxy.this.g.obtainMessage(6, obj).sendToTarget();
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
            RemoteWakeLockProxy.this.g.obtainMessage(5, dataTransactResult).sendToTarget();
        }
    }

    private RemoteWakeLockProxy(Context context) {
        this.a = (PowerManager) context.getSystemService("power");
        c cVar = new c();
        this.b = cVar;
        this.c = new DataTransactor(context, cVar, "5B354F08-DE47-7918-B0C1-13280E013FEE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z) {
        SparseArray<IRemoteWakeLockCallback> sparseArray = this.h;
        if (sparseArray == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            this.h.valueAt(i).performAvailableChanged(z);
        }
    }

    private void C() {
        this.g.sendEmptyMessage(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i) {
        SparseArray<IRemoteWakeLockCallback> sparseArray = this.h;
        if (sparseArray == null) {
            this.e.initialize();
            return;
        }
        synchronized (sparseArray) {
            this.h.delete(i);
        }
        if (this.h.size() == 0) {
            this.e.initialize();
        }
    }

    private void F(int i, int i2, long j) {
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) c(this.i, i, i2);
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        if (j < 0) {
            wakeLock.acquire();
        } else {
            wakeLock.acquire(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(CreateInfo createInfo) {
        if (this.j == null) {
            this.j = new SparseArray<>();
        }
        IwdsUtils.addInArray(this.j, createInfo.a(), createInfo.b(), createInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        if (this.k == null) {
            return;
        }
        if (this.j == null) {
            this.j = new SparseArray<>();
        }
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.k.keyAt(i);
            SparseArray<CreateInfo> sparseArrayValueAt = this.k.valueAt(i);
            synchronized (this.j) {
                this.j.put(iKeyAt, sparseArrayValueAt);
            }
        }
        synchronized (this.k) {
            this.k.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(int i, int i2) {
        IwdsUtils.deleteInArray(this.j, i, i2);
        IwdsUtils.deleteInArray(this.k, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(CreateInfo createInfo) {
        if (this.k == null) {
            this.k = new SparseArray<>();
        }
        IwdsUtils.addInArray(this.k, createInfo.a(), createInfo.b(), createInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        SparseArray<SparseArray<CreateInfo>> sparseArray = this.j;
        if (sparseArray == null) {
            return;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            SparseArray<CreateInfo> sparseArrayValueAt = this.j.valueAt(size);
            for (int size2 = sparseArrayValueAt.size() - 1; size2 >= 0; size2--) {
                if (!this.d) {
                    return;
                }
                CreateInfo createInfoValueAt = sparseArrayValueAt.valueAt(size2);
                synchronized (this.j) {
                    sparseArrayValueAt.removeAt(size2);
                    if (sparseArrayValueAt.size() == 0) {
                        this.j.removeAt(size);
                    }
                }
                this.c.send(createInfoValueAt);
            }
        }
    }

    private void P(int i, int i2) {
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) c(this.i, i, i2);
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    private void Q(CreateInfo createInfo) {
        k(createInfo.a(), createInfo.b(), this.a.newWakeLock(createInfo.c(), createInfo.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        SparseArray<SparseArray<PowerManager.WakeLock>> sparseArray = this.i;
        if (sparseArray == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            SparseArray<PowerManager.WakeLock> sparseArrayValueAt = this.i.valueAt(i);
            if (sparseArrayValueAt != null) {
                int size2 = sparseArrayValueAt.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PowerManager.WakeLock wakeLockValueAt = sparseArrayValueAt.valueAt(i2);
                    if (wakeLockValueAt.isHeld()) {
                        wakeLockValueAt.release();
                    }
                }
            }
        }
        synchronized (this.i) {
            this.i.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f = null;
        }
        this.g = null;
    }

    private static <T> T c(SparseArray<SparseArray<T>> sparseArray, int i, int i2) {
        SparseArray<T> sparseArray2;
        if (sparseArray == null || (sparseArray2 = sparseArray.get(i)) == null) {
            return null;
        }
        return sparseArray2.get(i2);
    }

    private void d() {
        HandlerThread handlerThread = new HandlerThread("RemoteWakeLock");
        this.f = handlerThread;
        handlerThread.start();
        this.g = new b(this.f.getLooper());
    }

    private void g(int i, int i2, int i3) {
        if (i != 0) {
            IwdsLog.e(this, "Release remote wakelock: " + i3 + " of caller: " + i2 + " failed.Result code: " + i);
        }
    }

    public static synchronized RemoteWakeLockProxy getInstance(Context context) {
        if (l == null) {
            l = new RemoteWakeLockProxy(context);
        }
        return l;
    }

    private void h(int i, int i2, int i3, long j) {
        IRemoteWakeLockCallback iRemoteWakeLockCallback;
        SparseArray<IRemoteWakeLockCallback> sparseArray = this.h;
        if (sparseArray == null || (iRemoteWakeLockCallback = sparseArray.get(i2)) == null) {
            return;
        }
        iRemoteWakeLockCallback.performAcquireResult(i3, i, j);
    }

    private void k(int i, int i2, PowerManager.WakeLock wakeLock) {
        if (this.i == null) {
            this.i = new SparseArray<>();
        }
        IwdsUtils.addInArray(this.i, i, i2, wakeLock);
    }

    private void l(int i, CMDInfo cMDInfo) {
        int iC = cMDInfo.c();
        if (iC == 1) {
            h(i, cMDInfo.a(), cMDInfo.b(), cMDInfo.d());
        } else if (iC == 0) {
            g(i, cMDInfo.a(), cMDInfo.b());
        }
    }

    private void m(int i, CreateInfo createInfo) {
        if (i == 0) {
            this.g.obtainMessage(4, createInfo).sendToTarget();
        } else {
            this.g.obtainMessage(3, createInfo).sendToTarget();
        }
    }

    private void n(int i, DeleteInfo deleteInfo) {
        if (i != 0) {
            IwdsLog.e(this, "Delete remote wakelock: " + deleteInfo.b() + "of caller: " + deleteInfo.a() + " failed.Result code: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i, IRemoteWakeLockCallback iRemoteWakeLockCallback) {
        if (this.h == null) {
            this.h = new SparseArray<>();
        }
        synchronized (this.h) {
            this.h.put(i, iRemoteWakeLockCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(DataTransactor.DataTransactResult dataTransactResult) {
        int resultCode = dataTransactResult.getResultCode();
        Object transferedObject = dataTransactResult.getTransferedObject();
        if (transferedObject instanceof CreateInfo) {
            m(resultCode, (CreateInfo) transferedObject);
        } else if (transferedObject instanceof CMDInfo) {
            l(resultCode, (CMDInfo) transferedObject);
        } else if (transferedObject instanceof DeleteInfo) {
            n(resultCode, (DeleteInfo) transferedObject);
        }
    }

    private void q(CMDInfo cMDInfo) {
        int iC = cMDInfo.c();
        if (iC == 1) {
            F(cMDInfo.a(), cMDInfo.b(), cMDInfo.d());
        } else if (iC == 0) {
            P(cMDInfo.a(), cMDInfo.b());
        }
    }

    private void r(CreateInfo createInfo) {
        if (this.d) {
            this.c.send(createInfo);
        } else {
            this.g.obtainMessage(3, createInfo).sendToTarget();
        }
    }

    private void s(DeleteInfo deleteInfo) {
        int iA;
        SparseArray<PowerManager.WakeLock> sparseArray;
        int iB;
        PowerManager.WakeLock wakeLock;
        if (this.i == null || (sparseArray = this.i.get((iA = deleteInfo.a()))) == null || (wakeLock = sparseArray.get((iB = deleteInfo.b()))) == null) {
            return;
        }
        if (wakeLock.isHeld()) {
            wakeLock.release();
        }
        synchronized (this.i) {
            sparseArray.delete(iB);
            if (sparseArray.size() == 0) {
                this.i.delete(iA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Object obj) {
        if (obj instanceof CreateInfo) {
            Q((CreateInfo) obj);
        } else if (obj instanceof CMDInfo) {
            q((CMDInfo) obj);
        } else if (obj instanceof DeleteInfo) {
            s((DeleteInfo) obj);
        }
    }

    public void E(int i, int i2) {
        if (this.d) {
            this.c.send(new CMDInfo(i, i2));
        } else {
            IwdsLog.w(this, "DataTransactor is invailable.Donot need to release.");
        }
    }

    public int a(IRemoteWakeLockCallback iRemoteWakeLockCallback) {
        int iAllocation = this.e.allocation();
        this.g.obtainMessage(1, iAllocation, -1, iRemoteWakeLockCallback).sendToTarget();
        return iAllocation;
    }

    public void e(int i) {
        this.g.obtainMessage(2, i, -1).sendToTarget();
    }

    public void f(int i, int i2) {
        this.g.obtainMessage(9, i, i2);
        if (this.d) {
            this.c.send(new DeleteInfo(i, i2));
        }
    }

    public void finalize() throws Throwable {
        stopTransaction();
        super.finalize();
    }

    public void i(int i, int i2, int i3, String str) {
        r(new CreateInfo(i, i2, i3, str));
    }

    public void j(int i, int i2, long j) {
        if (!this.d) {
            h(1, i, i2, j);
        } else {
            this.c.send(new CMDInfo(i, i2, 1, j));
        }
    }

    public void startTransaction() {
        DataTransactor dataTransactor = this.c;
        if (dataTransactor != null && !dataTransactor.isStarted()) {
            this.c.start();
        }
        d();
    }

    public void stopTransaction() {
        DataTransactor dataTransactor = this.c;
        if (dataTransactor != null && dataTransactor.isStarted()) {
            this.c.stop();
        }
        C();
    }
}
