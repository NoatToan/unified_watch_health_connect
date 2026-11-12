package com.ingenic.iwds.remotebroadcast;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.SimpleIDAlloter;
import com.xmlywind.sdk.common.mta.PointCategory;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteBroadcastManager extends ServiceManagerContext {
    public static final int RESULT_FAILED_CHANNEL_UNAVAILABLE = 1;
    public static final int RESULT_FAILED_IWDS_CRASH = 3;
    public static final int RESULT_FAILED_LINK_DISCONNECTED = 2;
    public static final int RESULT_OK = 0;
    private IRemoteBroadcastService a;
    private Handler b;
    private int c;
    private RemoteBroadcastCallback d;
    private SparseArray<RemoteBroadcastReceiver> e;
    private HandlerThread f;
    private Handler g;
    private SimpleIDAlloter h;

    public interface RemoteBroadcastCallback {
        void onCallerError(int i);

        void onSendResult(Intent intent, String str, int i);
    }

    public class a extends ServiceManagerContext.ServiceClientProxy {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public IBinder getBinder() {
            return RemoteBroadcastManager.this.a.asBinder();
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceConnected(IBinder iBinder) {
            RemoteBroadcastManager.this.e(iBinder);
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceDisconnected(boolean z) {
            RemoteBroadcastManager.this.k(z);
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (RemoteBroadcastManager.this.d != null) {
                    RemoteBroadcastManager.this.d.onCallerError(message.arg1);
                }
            } else {
                if (i == 3) {
                    RemoteBroadcastManager.this.d(message.arg1, (RemoteBroadcastReceiver) message.obj);
                    return;
                }
                if (i == 4) {
                    RemoteBroadcastManager.this.j((RemoteBroadcastReceiver) message.obj);
                } else if (i == 6) {
                    RemoteBroadcastManager.this.o(message.arg1 != 0);
                } else {
                    if (i != 7) {
                        return;
                    }
                    RemoteBroadcastManager.this.m();
                }
            }
        }
    }

    public class c extends IRemoteBroadcastCallback.Stub {
        private c() {
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback
        public void performReceive(int i, Intent intent) {
            RemoteBroadcastManager.this.b.obtainMessage(5, i, -1, intent).sendToTarget();
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback
        public void performSendResult(Intent intent, String str, int i) {
            Message messageObtainMessage = RemoteBroadcastManager.this.b.obtainMessage(2, i, -1, intent);
            Bundle bundle = new Bundle();
            bundle.putString(PointCategory.PERMISSION, str);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }

        public /* synthetic */ c(RemoteBroadcastManager remoteBroadcastManager, a aVar) {
            this();
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i;
            RemoteBroadcastReceiver remoteBroadcastReceiver;
            int i2 = message.what;
            if (i2 == 2) {
                if (RemoteBroadcastManager.this.d != null) {
                    Bundle data = message.getData();
                    RemoteBroadcastManager.this.d.onSendResult((Intent) message.obj, data != null ? data.getString(PointCategory.PERMISSION, null) : null, message.arg1);
                    return;
                }
                return;
            }
            if (i2 == 5 && (i = message.arg1) >= 0 && message.obj != null && (remoteBroadcastReceiver = (RemoteBroadcastReceiver) RemoteBroadcastManager.this.e.get(i)) != null) {
                remoteBroadcastReceiver.onReceive(RemoteBroadcastManager.this.getContext(), (Intent) message.obj);
            }
        }
    }

    public RemoteBroadcastManager(Context context) {
        super(context);
        this.c = 0;
        this.h = SimpleIDAlloter.newInstance();
        this.b = new d(context.getMainLooper());
        this.m_serviceClientProxy = new a();
    }

    private void b() {
        if (this.f == null) {
            this.f = new HandlerThread("RemoteBroadcast");
        }
        this.f.start();
        this.g = new b(this.f.getLooper());
    }

    private void c(int i) {
        SparseArray<RemoteBroadcastReceiver> sparseArray = this.e;
        if (sparseArray == null || i < 0 || i >= sparseArray.size()) {
            return;
        }
        synchronized (this.e) {
            this.e.removeAt(i);
        }
        if (this.e.size() == 0) {
            this.h.initialize();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, RemoteBroadcastReceiver remoteBroadcastReceiver) {
        if (this.e == null) {
            this.e = new SparseArray<>();
        }
        synchronized (this.e) {
            this.e.put(i, remoteBroadcastReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(IBinder iBinder) {
        b();
        IRemoteBroadcastService iRemoteBroadcastServiceAsInterface = IRemoteBroadcastService.Stub.asInterface(iBinder);
        this.a = iRemoteBroadcastServiceAsInterface;
        if (iRemoteBroadcastServiceAsInterface != null) {
            this.c = iRemoteBroadcastServiceAsInterface.registerRemoteBroadcastCallback(new c(this, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(RemoteBroadcastReceiver remoteBroadcastReceiver) {
        int i = this.c;
        if (i <= 0) {
            this.b.obtainMessage(1, i, -1).sendToTarget();
            return;
        }
        SparseArray<RemoteBroadcastReceiver> sparseArray = this.e;
        if (sparseArray == null) {
            this.h.initialize();
            return;
        }
        int iIndexOfValue = sparseArray.indexOfValue(remoteBroadcastReceiver);
        int size = this.e.size();
        if (iIndexOfValue < 0 || iIndexOfValue >= size) {
            return;
        }
        c(iIndexOfValue);
        this.a.unregisterRemoteReceiver(this.c, this.e.keyAt(iIndexOfValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z) {
        this.g.obtainMessage(6, z ? 1 : 0, -1).sendToTarget();
        IRemoteBroadcastService iRemoteBroadcastService = this.a;
        if (iRemoteBroadcastService != null) {
            iRemoteBroadcastService.unregisterRemoteBroadcastCallback(this.c);
        }
        this.g.sendEmptyMessage(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f = null;
        }
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(boolean z) {
        int size;
        SparseArray<RemoteBroadcastReceiver> sparseArray = this.e;
        if (sparseArray == null || (size = sparseArray.size()) <= 0) {
            return;
        }
        if (this.a != null && !z) {
            for (int i = 0; i < size; i++) {
                this.a.unregisterRemoteReceiver(this.c, this.e.keyAt(i));
            }
        }
        synchronized (this.e) {
            this.e.clear();
        }
        if (!z) {
            throw new RuntimeException("Are you missing a call to unregisterRemoteReceiver()?");
        }
    }

    public void registerRemoteBroadcastCallback(RemoteBroadcastCallback remoteBroadcastCallback) {
        this.d = remoteBroadcastCallback;
    }

    public void registerRemoteReceiver(RemoteBroadcastReceiver remoteBroadcastReceiver, IntentFilter intentFilter) {
        registerRemoteReceiver(remoteBroadcastReceiver, intentFilter, null);
    }

    public void sendRemoteBroadcast(Intent intent) {
        sendRemoteBroadcast(intent, null);
    }

    public void unregisterRemoteReceiver(RemoteBroadcastReceiver remoteBroadcastReceiver) {
        this.g.obtainMessage(4, remoteBroadcastReceiver).sendToTarget();
    }

    public void registerRemoteReceiver(RemoteBroadcastReceiver remoteBroadcastReceiver, IntentFilter intentFilter, String str) {
        int i = this.c;
        if (i <= 0) {
            this.b.obtainMessage(1, i, -1).sendToTarget();
            return;
        }
        int iAllocation = this.h.allocation();
        this.a.registerRemoteReceiver(this.c, iAllocation, intentFilter, str);
        this.g.obtainMessage(3, iAllocation, -1, remoteBroadcastReceiver).sendToTarget();
    }

    public void sendRemoteBroadcast(Intent intent, String str) {
        int i = this.c;
        if (i <= 0) {
            this.b.obtainMessage(1, i, -1).sendToTarget();
        } else {
            this.a.sendRemoteBroadcast(i, intent, str);
        }
    }
}
