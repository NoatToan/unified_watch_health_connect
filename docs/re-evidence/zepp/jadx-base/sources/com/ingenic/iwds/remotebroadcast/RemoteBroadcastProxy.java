package com.ingenic.iwds.remotebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.content.RemoteIntent;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.utils.IwdsLog;
import com.ingenic.iwds.utils.IwdsUtils;
import com.ingenic.iwds.utils.SimpleIDAlloter;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteBroadcastProxy {
    private static RemoteBroadcastProxy l;
    private final Context a;
    private final DataTransactor b;
    private final c c;
    private SparseArray<IRemoteBroadcastCallback> d;
    private SparseArray<SparseArray<BroadcastReceiver>> e;
    private SparseArray<SparseArray<RemoteIntentFilterInfo>> f;
    private SparseArray<SparseArray<RemoteIntentFilterInfo>> g;
    private HandlerThread i;
    private b j;
    private volatile boolean h = false;
    private SimpleIDAlloter k = SimpleIDAlloter.newInstance();

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    RemoteBroadcastProxy.this.i(message.arg1, (IRemoteBroadcastCallback) message.obj);
                    break;
                case 2:
                    RemoteBroadcastProxy.this.L((RemoteIntentFilterInfo) message.obj);
                    break;
                case 3:
                    RemoteBroadcastProxy.this.G(message.arg1, message.arg2);
                    break;
                case 4:
                    RemoteBroadcastProxy.this.M();
                    break;
                case 5:
                    RemoteBroadcastProxy.this.J();
                    break;
                case 6:
                    RemoteBroadcastProxy.this.A();
                    break;
                case 7:
                    RemoteBroadcastProxy.this.n((DataTransactor.DataTransactResult) message.obj);
                    break;
                case 8:
                    RemoteBroadcastProxy.this.x(message.obj);
                    break;
                case 9:
                    RemoteBroadcastProxy.this.F();
                    break;
                case 10:
                    RemoteBroadcastProxy.this.c();
                    break;
            }
        }
    }

    public class c implements DataTransactor.DataTransactorCallback {
        private c() {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onChannelAvailable(boolean z) {
            RemoteBroadcastProxy.this.h = z;
            if (z) {
                RemoteBroadcastProxy.this.j.sendEmptyMessage(5);
            } else {
                RemoteBroadcastProxy.this.j.sendEmptyMessage(4);
                RemoteBroadcastProxy.this.j.sendEmptyMessage(6);
            }
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onDataArrived(Object obj) {
            RemoteBroadcastProxy.this.j.obtainMessage(8, obj).sendToTarget();
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
            RemoteBroadcastProxy.this.j.obtainMessage(7, dataTransactResult).sendToTarget();
        }
    }

    public class d extends BroadcastReceiver {
        private int a;
        private int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getBooleanExtra("is_remote_broadcast", false)) {
                return;
            }
            RemoteBroadcastProxy.this.b.send(new RemoteIntentInfo(this.a, this.b, RemoteIntent.fromIntent(intent)));
        }
    }

    private RemoteBroadcastProxy(Context context) {
        this.a = context;
        c cVar = new c();
        this.c = cVar;
        this.b = new DataTransactor(context, cVar, "94D8C7BC-0AFC-E5D4-D10A-1D381DF2CD72");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        SparseArray<SparseArray<BroadcastReceiver>> sparseArray = this.e;
        if (sparseArray == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            SparseArray<BroadcastReceiver> sparseArrayValueAt = this.e.valueAt(i);
            int size2 = sparseArrayValueAt.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.a.unregisterReceiver(sparseArrayValueAt.valueAt(size2));
            }
            synchronized (this.e) {
                sparseArrayValueAt.clear();
            }
        }
        synchronized (this.e) {
            this.e.clear();
        }
    }

    private void B(int i, int i2) {
        SparseArray<BroadcastReceiver> sparseArray;
        BroadcastReceiver broadcastReceiver;
        SparseArray<SparseArray<BroadcastReceiver>> sparseArray2 = this.e;
        if (sparseArray2 == null || (sparseArray = sparseArray2.get(i)) == null || (broadcastReceiver = sparseArray.get(i2)) == null) {
            return;
        }
        synchronized (this.e) {
            sparseArray.delete(i2);
            if (sparseArray.size() == 0) {
                this.e.delete(i);
            }
        }
        this.a.unregisterReceiver(broadcastReceiver);
    }

    private void C(RemoteBroadcast remoteBroadcast) {
        RemoteIntent remoteIntentB = remoteBroadcast.b();
        Intent intent = remoteIntentB != null ? remoteIntentB.toIntent() : null;
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("is_remote_broadcast", true);
        String strC = remoteBroadcast.c();
        boolean zE = remoteBroadcast.e();
        boolean zD = remoteBroadcast.d();
        if (zE && zD) {
            IwdsLog.e(this, "Unsupport to send broadcast with sticky & ordered!");
            return;
        }
        if (zE) {
            this.a.sendStickyBroadcast(intent);
        } else if (zD) {
            this.a.sendOrderedBroadcast(intent, strC);
        } else {
            this.a.sendBroadcast(intent, strC);
        }
    }

    private void D(RemoteIntentFilterInfo remoteIntentFilterInfo) {
        if (this.f == null) {
            this.f = new SparseArray<>();
        }
        IwdsUtils.addInArray(this.f, remoteIntentFilterInfo.a(), remoteIntentFilterInfo.b(), remoteIntentFilterInfo);
    }

    private void E(RemoteIntentInfo remoteIntentInfo) {
        v(remoteIntentInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        SparseArray<SparseArray<RemoteIntentFilterInfo>> sparseArray = this.f;
        if (sparseArray != null) {
            synchronized (sparseArray) {
                this.f.clear();
            }
        }
        SparseArray<SparseArray<RemoteIntentFilterInfo>> sparseArray2 = this.g;
        if (sparseArray2 != null) {
            synchronized (sparseArray2) {
                this.g.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(int i, int i2) {
        IwdsUtils.deleteInArray(this.g, i, i2);
        IwdsUtils.deleteInArray(this.f, i, i2);
    }

    private void I(RemoteIntentFilterInfo remoteIntentFilterInfo) {
        if (this.h) {
            this.b.send(remoteIntentFilterInfo);
        } else {
            this.j.obtainMessage(2, remoteIntentFilterInfo).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        SparseArray<SparseArray<RemoteIntentFilterInfo>> sparseArray = this.g;
        if (sparseArray == null) {
            return;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            SparseArray<RemoteIntentFilterInfo> sparseArrayValueAt = this.g.valueAt(size);
            for (int size2 = sparseArrayValueAt.size() - 1; size2 >= 0; size2--) {
                if (!this.h) {
                    return;
                }
                this.b.send(sparseArrayValueAt.valueAt(size2));
                synchronized (this.g) {
                    sparseArrayValueAt.removeAt(size2);
                    if (sparseArrayValueAt.size() == 0) {
                        this.g.removeAt(size);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(RemoteIntentFilterInfo remoteIntentFilterInfo) {
        if (this.g == null) {
            this.g = new SparseArray<>();
        }
        IwdsUtils.addInArray(this.g, remoteIntentFilterInfo.a(), remoteIntentFilterInfo.b(), remoteIntentFilterInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.f == null) {
            return;
        }
        if (this.g == null) {
            this.g = new SparseArray<>();
        }
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.f.keyAt(i);
            SparseArray<RemoteIntentFilterInfo> sparseArrayValueAt = this.f.valueAt(i);
            synchronized (this.g) {
                this.g.put(iKeyAt, sparseArrayValueAt);
            }
        }
        synchronized (this.f) {
            this.f.clear();
        }
    }

    private void O(RemoteIntentFilterInfo remoteIntentFilterInfo) {
        u(remoteIntentFilterInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        HandlerThread handlerThread = this.i;
        if (handlerThread != null) {
            handlerThread.quit();
            this.i = null;
        }
        this.j = null;
    }

    private void f(int i, int i2, Intent intent) {
        IRemoteBroadcastCallback iRemoteBroadcastCallback;
        SparseArray<IRemoteBroadcastCallback> sparseArray = this.d;
        if (sparseArray == null || (iRemoteBroadcastCallback = sparseArray.get(i)) == null) {
            return;
        }
        iRemoteBroadcastCallback.performReceive(i2, intent);
    }

    public static synchronized RemoteBroadcastProxy getInstance(Context context) {
        if (l == null) {
            l = new RemoteBroadcastProxy(context);
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i, IRemoteBroadcastCallback iRemoteBroadcastCallback) {
        if (iRemoteBroadcastCallback == null) {
            return;
        }
        if (this.d == null) {
            this.d = new SparseArray<>();
        }
        synchronized (this.d) {
            this.d.put(i, iRemoteBroadcastCallback);
        }
    }

    private void j(int i, RemoteBroadcast remoteBroadcast) {
        IRemoteBroadcastCallback iRemoteBroadcastCallback = this.d.get(remoteBroadcast.a());
        if (iRemoteBroadcastCallback != null) {
            RemoteIntent remoteIntentB = remoteBroadcast.b();
            iRemoteBroadcastCallback.performSendResult(remoteIntentB != null ? remoteIntentB.toIntent() : null, remoteBroadcast.c(), i);
        }
    }

    private void k(int i, RemoteIntentFilterInfo remoteIntentFilterInfo) {
        if (i == 0) {
            D(remoteIntentFilterInfo);
        } else {
            L(remoteIntentFilterInfo);
        }
    }

    private void l(int i, RemoteIntentInfo remoteIntentInfo) {
        if (i != 0) {
            IwdsLog.e(this, "Local broadcast has received.But send to remote failed: " + i);
        }
    }

    private void m(int i, UnregisterInfo unregisterInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(DataTransactor.DataTransactResult dataTransactResult) {
        int resultCode = dataTransactResult.getResultCode();
        Object transferedObject = dataTransactResult.getTransferedObject();
        if (transferedObject instanceof RemoteBroadcast) {
            j(resultCode, (RemoteBroadcast) transferedObject);
            return;
        }
        if (transferedObject instanceof RemoteIntentFilterInfo) {
            k(resultCode, (RemoteIntentFilterInfo) transferedObject);
        } else if (transferedObject instanceof RemoteIntentInfo) {
            l(resultCode, (RemoteIntentInfo) transferedObject);
        } else if (transferedObject instanceof UnregisterInfo) {
            m(resultCode, (UnregisterInfo) transferedObject);
        }
    }

    private void u(RemoteIntentFilterInfo remoteIntentFilterInfo) {
        if (remoteIntentFilterInfo == null) {
            return;
        }
        if (this.e == null) {
            this.e = new SparseArray<>();
        }
        int iA = remoteIntentFilterInfo.a();
        int iB = remoteIntentFilterInfo.b();
        d dVar = new d(iA, iB);
        IwdsUtils.addInArray(this.e, iA, iB, dVar);
        this.a.registerReceiver(dVar, remoteIntentFilterInfo.c(), remoteIntentFilterInfo.d(), null);
    }

    private void v(RemoteIntentInfo remoteIntentInfo) {
        RemoteIntent remoteIntentC = remoteIntentInfo.c();
        f(remoteIntentInfo.a(), remoteIntentInfo.b(), remoteIntentC != null ? remoteIntentC.toIntent() : null);
    }

    private void w(UnregisterInfo unregisterInfo) {
        B(unregisterInfo.a(), unregisterInfo.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj) {
        if (obj instanceof RemoteBroadcast) {
            C((RemoteBroadcast) obj);
            return;
        }
        if (obj instanceof RemoteIntentFilterInfo) {
            O((RemoteIntentFilterInfo) obj);
        } else if (obj instanceof RemoteIntentInfo) {
            E((RemoteIntentInfo) obj);
        } else if (obj instanceof UnregisterInfo) {
            w((UnregisterInfo) obj);
        }
    }

    public int a(IRemoteBroadcastCallback iRemoteBroadcastCallback) {
        if (iRemoteBroadcastCallback == null) {
            return 0;
        }
        int iAllocation = this.k.allocation();
        this.j.obtainMessage(1, iAllocation, -1, iRemoteBroadcastCallback).sendToTarget();
        return iAllocation;
    }

    public void d(int i) {
        SparseArray<IRemoteBroadcastCallback> sparseArray = this.d;
        if (sparseArray == null) {
            this.k.initialize();
            return;
        }
        synchronized (sparseArray) {
            this.d.delete(i);
        }
        if (this.d.size() == 0) {
            this.k.initialize();
        }
    }

    public void e(int i, int i2) {
        this.b.send(new UnregisterInfo(i, i2));
        this.j.obtainMessage(3, i, i2).sendToTarget();
    }

    public void finalize() throws Throwable {
        this.j.sendEmptyMessage(9);
        stopTransaction();
        super.finalize();
    }

    public void g(int i, int i2, IntentFilter intentFilter, String str) {
        I(new RemoteIntentFilterInfo(i, i2, intentFilter, str));
    }

    public void h(int i, Intent intent, String str) {
        o(new RemoteBroadcast(i, intent, str));
    }

    public void o(RemoteBroadcast remoteBroadcast) {
        this.b.send(remoteBroadcast);
    }

    public void startTransaction() {
        DataTransactor dataTransactor = this.b;
        if (dataTransactor != null && !dataTransactor.isStarted()) {
            this.b.start();
        }
        HandlerThread handlerThread = new HandlerThread("RemoteBroadcast");
        this.i = handlerThread;
        handlerThread.start();
        this.j = new b(this.i.getLooper());
    }

    public void stopTransaction() {
        DataTransactor dataTransactor = this.b;
        if (dataTransactor != null && dataTransactor.isStarted()) {
            this.b.stop();
        }
        this.j.sendEmptyMessage(10);
    }
}
