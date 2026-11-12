package com.ingenic.iwds.remotewakelock;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.SimpleIDAlloter;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteWakeLockManager extends ServiceManagerContext {
    public static final int RESULT_FAILED_CHANNEL_UNAVAILABLE = 1;
    public static final int RESULT_FAILED_IWDS_CRASH = 3;
    public static final int RESULT_FAILED_LINK_DISCONNECTED = 2;
    public static final int RESULT_OK = 0;
    private IRemoteWakeLockService a;
    private RemoteWakeLockCallback b;
    private IRemoteWakeLockCallback c;
    private Handler d;
    private Handler e;
    private HandlerThread f;
    private int g;
    private SparseArray<RemoteWakeLock> h;
    private SimpleIDAlloter i;

    public final class RemoteWakeLock {
        private int a;
        private String b;
        private boolean c;

        public RemoteWakeLock(int i, String str) {
            this.a = i;
            this.b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(boolean z) {
            this.c = z;
            if (RemoteWakeLockManager.this.e.hasMessages(5, this)) {
                RemoteWakeLockManager.this.e.removeMessages(5, this);
            }
        }

        public void acquire() {
            acquire(-1L);
        }

        public boolean isHeld() {
            return this.c;
        }

        public void release() {
            RemoteWakeLockManager.this.e.obtainMessage(3, this).sendToTarget();
            c(false);
        }

        public void acquire(long j) {
            Message messageObtainMessage = RemoteWakeLockManager.this.e.obtainMessage(2, this);
            Bundle bundle = new Bundle();
            bundle.putLong("timeout", j);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public interface RemoteWakeLockCallback {
        void onAcquireResult(RemoteWakeLock remoteWakeLock, long j, int i);
    }

    public class a extends ServiceManagerContext.ServiceClientProxy {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public IBinder getBinder() {
            return RemoteWakeLockManager.this.a.asBinder();
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceConnected(IBinder iBinder) {
            RemoteWakeLockManager.this.g(iBinder);
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceDisconnected(boolean z) {
            RemoteWakeLockManager.this.q(z);
        }
    }

    public class b extends IRemoteWakeLockCallback.Stub {
        private b() {
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback
        public void performAcquireResult(int i, int i2, long j) {
            RemoteWakeLockManager.this.e.obtainMessage(4, i, i2, Long.valueOf(j)).sendToTarget();
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback
        public void performAvailableChanged(boolean z) {
            if (z || RemoteWakeLockManager.this.h == null) {
                return;
            }
            int size = RemoteWakeLockManager.this.h.size();
            for (int i = 0; i < size; i++) {
                RemoteWakeLock remoteWakeLock = (RemoteWakeLock) RemoteWakeLockManager.this.h.valueAt(i);
                if (RemoteWakeLockManager.this.e.hasMessages(5, remoteWakeLock)) {
                    RemoteWakeLockManager.this.e.removeMessages(5, remoteWakeLock);
                }
                RemoteWakeLockManager.this.e.obtainMessage(5, remoteWakeLock).sendToTarget();
            }
        }

        public /* synthetic */ b(RemoteWakeLockManager remoteWakeLockManager, a aVar) {
            this();
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 4) {
                return;
            }
            RemoteWakeLockManager.this.j((RemoteWakeLock) message.obj, message.getData().getLong("timeout"), message.arg1);
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    RemoteWakeLockManager.this.h((RemoteWakeLock) message.obj);
                    break;
                case 2:
                    RemoteWakeLockManager.this.i((RemoteWakeLock) message.obj, message.getData().getLong("timeout", -1L));
                    break;
                case 3:
                    RemoteWakeLockManager.this.u((RemoteWakeLock) message.obj);
                    break;
                case 4:
                    RemoteWakeLockManager.this.d(message.arg1, message.arg2, ((Long) message.obj).longValue());
                    break;
                case 5:
                    RemoteWakeLockManager.this.y((RemoteWakeLock) message.obj);
                    break;
                case 6:
                    RemoteWakeLockManager.this.C();
                    break;
                case 7:
                    RemoteWakeLockManager.this.A();
                    break;
            }
        }
    }

    public RemoteWakeLockManager(Context context) {
        super(context);
        this.c = new b(this, null);
        this.i = SimpleIDAlloter.newInstance();
        this.d = new c(context.getMainLooper());
        this.m_serviceClientProxy = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f = null;
        }
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        SparseArray<RemoteWakeLock> sparseArray = this.h;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                IRemoteWakeLockService iRemoteWakeLockService = this.a;
                if (iRemoteWakeLockService == null) {
                    break;
                }
                iRemoteWakeLockService.destroyRemoteWakeLock(this.g, this.h.keyAt(i));
            }
            synchronized (this.h) {
                this.h.clear();
            }
        }
    }

    private static <T> int a(SparseArray<T> sparseArray, T t) {
        int iIndexOfValue;
        if (t == null || sparseArray == null || (iIndexOfValue = sparseArray.indexOfValue(t)) < 0) {
            return -1;
        }
        return sparseArray.keyAt(iIndexOfValue);
    }

    private void c() {
        HandlerThread handlerThread = new HandlerThread("RemoteWakeLock");
        this.f = handlerThread;
        handlerThread.start();
        this.e = new d(this.f.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2, long j) {
        RemoteWakeLock remoteWakeLock = this.h.get(i);
        if (remoteWakeLock == null) {
            return;
        }
        Message messageObtainMessage = this.d.obtainMessage(4, i2, -1, remoteWakeLock);
        Bundle bundle = new Bundle();
        bundle.putLong("timeout", j);
        messageObtainMessage.setData(bundle);
        messageObtainMessage.sendToTarget();
        if (i2 != 0) {
            remoteWakeLock.c(false);
            return;
        }
        remoteWakeLock.c(true);
        if (j > 0) {
            this.e.sendMessageDelayed(this.e.obtainMessage(5, remoteWakeLock), j);
        }
    }

    private void e(int i, RemoteWakeLock remoteWakeLock) {
        if (this.h == null) {
            this.h = new SparseArray<>();
        }
        synchronized (this.h) {
            this.h.put(i, remoteWakeLock);
        }
    }

    private static void f(int i, String str) {
        int i2 = i & 65535;
        if (i2 != 1 && i2 != 6 && i2 != 10 && i2 != 26 && i2 != 32) {
            throw new IllegalArgumentException("Must specify a valid wake lock level.");
        }
        if (str == null) {
            throw new IllegalArgumentException("The tag must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(IBinder iBinder) {
        c();
        IRemoteWakeLockService iRemoteWakeLockServiceAsInterface = IRemoteWakeLockService.Stub.asInterface(iBinder);
        this.a = iRemoteWakeLockServiceAsInterface;
        if (iRemoteWakeLockServiceAsInterface != null) {
            this.g = iRemoteWakeLockServiceAsInterface.registerRemoteWakeLockCallback(this.c);
        }
        IwdsAssert.dieIf(this, this.g == 0, "Caller is invalid.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(RemoteWakeLock remoteWakeLock) {
        e(r(remoteWakeLock.a, remoteWakeLock.b), remoteWakeLock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(RemoteWakeLock remoteWakeLock, long j) {
        int iA = a(this.h, remoteWakeLock);
        if (iA < 0) {
            return;
        }
        this.a.acquireWakeLock(this.g, iA, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(RemoteWakeLock remoteWakeLock, long j, int i) {
        RemoteWakeLockCallback remoteWakeLockCallback = this.b;
        if (remoteWakeLockCallback != null) {
            remoteWakeLockCallback.onAcquireResult(remoteWakeLock, j, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(boolean z) {
        x();
        IRemoteWakeLockService iRemoteWakeLockService = this.a;
        if (iRemoteWakeLockService != null) {
            iRemoteWakeLockService.unregisterRemoteWakeLockCallback(this.g);
        }
        t();
    }

    private int r(int i, String str) {
        int iAllocation = this.i.allocation();
        this.a.newRemoteWakeLock(this.g, iAllocation, i, str);
        return iAllocation;
    }

    private void t() {
        this.e.sendEmptyMessage(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(RemoteWakeLock remoteWakeLock) {
        int iA = a(this.h, remoteWakeLock);
        if (iA < 0) {
            return;
        }
        this.a.releaseWakeLock(this.g, iA);
    }

    private void x() {
        this.e.sendEmptyMessage(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(RemoteWakeLock remoteWakeLock) {
        if (remoteWakeLock != null) {
            remoteWakeLock.c(false);
        }
    }

    public RemoteWakeLock newRemoteWakeLock(int i, String str) {
        f(i, str);
        RemoteWakeLock remoteWakeLock = new RemoteWakeLock(i, str);
        this.e.obtainMessage(1, remoteWakeLock).sendToTarget();
        return remoteWakeLock;
    }

    public void registerRemoteWakeLockCallback(RemoteWakeLockCallback remoteWakeLockCallback) {
        this.b = remoteWakeLockCallback;
    }
}
