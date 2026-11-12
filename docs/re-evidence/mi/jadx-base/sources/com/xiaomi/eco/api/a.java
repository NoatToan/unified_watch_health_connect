package com.xiaomi.eco.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.common.connect.IEcoMassDataCallback;
import com.xiaomi.eco.connection.Connection;
import com.xiaomi.eco.connection.EcoRealConnection;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.av7;
import defpackage.d6f;
import defpackage.dsf;
import defpackage.qm5;
import defpackage.u7r;
import defpackage.wrc;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<C extends EcoRealConnection> extends com.xiaomi.eco.common.connect.a.AbstractBinderC0357a implements p {
    private static final int DEFAULT_TIMEOUT = 8000;
    private static final int MSG_TIMEOUT = 0;
    protected static final String TAG = "EcoApiCall";
    private static volatile boolean mIsBinding = false;
    protected wrc mCallback;
    private volatile boolean mConnected;
    protected C mConnection;
    private final String mCoreId;
    private String mDid;

    @GuardedBy("mRunningLock")
    protected volatile com.xiaomi.eco.api.b mRunningApiTask;
    private volatile boolean mBindAbandon = false;
    private final Object mApiTasksLock = new Object();

    @GuardedBy("mApiTasksLock")
    private final List<com.xiaomi.eco.api.b> mPendingApiTasks = new ArrayList();
    private final List<com.xiaomi.eco.api.b> mWaitingResponseApiTasks = new ArrayList();
    protected final Object mRunningLock = new Object();
    private final AtomicInteger mCommonCallID = new AtomicInteger(0);
    private boolean isCurrent = false;
    protected wrc mCallbackProxy = (wrc) Proxy.newProxyInstance(wrc.class.getClassLoader(), new Class[]{wrc.class}, new c());
    private final Handler mMainHandler = new HandlerC0353a(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.xiaomi.eco.api.a$a, reason: collision with other inner class name */
    public class HandlerC0353a extends Handler {
        public HandlerC0353a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                com.xiaomi.eco.api.b bVar = (com.xiaomi.eco.api.b) message.obj;
                synchronized (a.this.mApiTasksLock) {
                    try {
                        if (a.this.mPendingApiTasks.contains(bVar)) {
                            bVar.o(-1);
                        } else if (a.this.mWaitingResponseApiTasks.contains(bVar)) {
                            bVar.m();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class b implements av7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IEcoMassDataCallback f11238a;

        public b(IEcoMassDataCallback iEcoMassDataCallback) {
            this.f11238a = iEcoMassDataCallback;
        }

        @Override // defpackage.av7
        public void onComplete() {
            Logger.d(a.TAG, "onComplete() called");
            try {
                this.f11238a.onComplete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.av7
        public void onFail(int i, String str) {
            Logger.d(a.TAG, "onFail() called with: errorCode = [" + i + "], errorMsg = [" + str + "]");
            try {
                this.f11238a.onFail(i, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.av7
        public void onProgress(int i, int i2) {
            Logger.i(a.TAG, "onProgress() called with: sentCount = [" + i + "], totalCount = [" + i2 + "]");
            try {
                if (this.f11238a.asBinder().isBinderAlive() && this.f11238a.asBinder().pingBinder()) {
                    this.f11238a.onProgress(i, i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class c implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            wrc wrcVar = a.this.mCallback;
            if (wrcVar != null && wrcVar.asBinder() != null && a.this.mCallback.asBinder().isBinderAlive()) {
                try {
                    return method.invoke(a.this.mCallback, objArr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ExtUtilsKt.getBasicValue(method.getReturnType());
        }

        public c() {
        }
    }

    public a(String str, String str2, wrc wrcVar) {
        this.mDid = str;
        this.mCoreId = str2;
        this.mCallback = wrcVar;
    }

    private com.xiaomi.eco.api.b call(int i, u7r u7rVar, byte[] bArr, boolean z, p.a aVar, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("timeout should larger than 0");
        }
        if (u7rVar != null) {
            Logger.i("EcoApiCall type : " + u7rVar.e + ", id : " + u7rVar.f, new Object[0]);
        } else {
            Logger.i("EcoApiCall package is null", new Object[0]);
        }
        com.xiaomi.eco.api.b bVar = new com.xiaomi.eco.api.b(this.mCommonCallID.getAndIncrement(), this, i, u7rVar, bArr, z, aVar, i2, -1);
        if (this.mConnected) {
            enqueue(bVar);
        } else {
            Logger.i(TAG, "call() mConnect = false, did = " + this.mDid + " , call = " + this);
            bVar.j();
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: callbackClient, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$callWithData$1(com.xiaomi.eco.common.connect.b bVar, EcoApiResult ecoApiResult) {
        try {
            bVar.onCallback(ecoApiResult);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private String getDeviceName() {
        try {
            String name = getName();
            return name == null ? "" : name;
        } catch (RemoteException e) {
            e.printStackTrace();
            return "";
        }
    }

    private void notifyDataReceiver(int i, byte[] bArr) {
    }

    @Override // com.xiaomi.eco.common.connect.a
    public void bindV2(String str, String str2, String str3, String str4, String str5, String str6, boolean z) throws RemoteException {
    }

    public final com.xiaomi.eco.api.b callTimeout(u7r u7rVar, boolean z, p.a aVar, int i) {
        int i2 = (u7rVar == null || u7rVar.e != 1 || u7rVar.f < 17) ? 101 : 100;
        Logger.i(TAG, "callTimeout type =  " + i2);
        return call(i2, u7rVar, null, z, aVar, i);
    }

    @Override // com.xiaomi.eco.common.connect.a
    public int callTimeoutWithData(int i, byte[] bArr, boolean z, final com.xiaomi.eco.common.connect.b bVar, int i2) throws RemoteException {
        return callTimeout(i, bArr, z, new p.a() { // from class: bd7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f4079a.lambda$callTimeoutWithData$3(bVar, ecoApiResult);
            }
        }, i2).c();
    }

    @Override // com.xiaomi.eco.common.connect.a
    public int callWithData(int i, byte[] bArr, boolean z, final com.xiaomi.eco.common.connect.b bVar) throws RemoteException {
        return call(i, bArr, z, new p.a() { // from class: cd7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f5207a.lambda$callWithData$1(bVar, ecoApiResult);
            }
        }).c();
    }

    @Override // com.xiaomi.eco.common.connect.a
    public final void cancel(int i) {
        com.xiaomi.eco.api.b next;
        synchronized (this.mApiTasksLock) {
            try {
                Iterator<com.xiaomi.eco.api.b> it = this.mPendingApiTasks.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.c() != i);
                if (next == null) {
                    for (com.xiaomi.eco.api.b bVar : this.mWaitingResponseApiTasks) {
                        if (bVar.c() == i) {
                            next = bVar;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (next != null) {
            next.a();
        }
        if (next != null) {
            next.a();
        }
    }

    @Override // com.xiaomi.eco.common.connect.a
    public void cancelTasks(int i) throws RemoteException {
        if (isIDLE()) {
            Logger.i(TAG, "cancelPriorityTask: idle return");
            return;
        }
        Logger.i(TAG, "cancelTasks() called with: priority = [" + i + "]");
        synchronized (this.mApiTasksLock) {
            try {
                Logger.i(TAG, "cancelTasks: " + this.mPendingApiTasks.size());
                for (com.xiaomi.eco.api.b bVar : this.mPendingApiTasks) {
                    if (bVar.e() <= i) {
                        Logger.i(TAG, "cancelPriorityTask: " + bVar);
                        bVar.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.mRunningLock) {
            try {
                if (this.mRunningApiTask != null && this.mRunningApiTask.e() == i) {
                    this.mRunningApiTask.a();
                    this.mRunningApiTask.o(-5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.xiaomi.eco.common.connect.a
    public void connectV2(String str, byte[] bArr, String str2, String str3, int i) throws RemoteException {
    }

    @Override // com.xiaomi.eco.common.connect.a
    public int connectionType() throws RemoteException {
        return 0;
    }

    @Override // com.xiaomi.eco.common.connect.a
    public void destroy() {
        Logger.d(TAG, "destroy: " + this + ", did = " + this.mDid);
        this.mMainHandler.removeMessages(0);
        synchronized (this.mApiTasksLock) {
            this.mPendingApiTasks.clear();
            this.mWaitingResponseApiTasks.clear();
        }
        if (this.mConnected) {
            onDisconnected();
        }
        C c2 = this.mConnection;
        if (c2 != null) {
            c2.disconnect();
        }
        setCurrent(false);
    }

    public final void dispatchMessage(int i, byte[] bArr) {
        ArrayList arrayList;
        if (bArr == null) {
            return;
        }
        if (i == 102) {
            handleData(102, bArr);
            return;
        }
        if (i == 106) {
            handleVersion(bArr);
            return;
        }
        synchronized (this.mApiTasksLock) {
            arrayList = new ArrayList(this.mWaitingResponseApiTasks);
        }
        Iterator it = arrayList.iterator();
        if (i != 100 && i != 101) {
            while (it.hasNext()) {
                com.xiaomi.eco.api.b bVar = (com.xiaomi.eco.api.b) it.next();
                if (i == bVar.g()) {
                    bVar.l(bArr);
                } else {
                    it.remove();
                }
            }
            handleData(i, bArr);
            notifyDataReceiver(i, bArr);
            return;
        }
        try {
            u7r u7rVarY = u7r.y(bArr);
            while (it.hasNext()) {
                com.xiaomi.eco.api.b bVar2 = (com.xiaomi.eco.api.b) it.next();
                if (bVar2.g() != i) {
                    it.remove();
                } else {
                    u7r u7rVarD = bVar2.d();
                    if (u7rVarD.e == u7rVarY.e && u7rVarD.f == u7rVarY.f) {
                        bVar2.k((!u7rVarY.w() || u7rVarY.q() == 0) ? 0 : u7rVarY.q(), u7rVarY);
                    } else {
                        it.remove();
                    }
                }
            }
            if (i == 101) {
                handlePacket(i, u7rVarY.e, u7rVarY);
            }
        } catch (InvalidProtocolBufferNanoException e) {
            Logger.d(TAG, "dispatchMessage() called with: type = [" + i + "], data = [" + ByteUtil.byteToString(bArr) + "]");
            e.printStackTrace();
        }
    }

    public void doOnConnectedBeforeCallBack() {
    }

    public void enqueue(com.xiaomi.eco.api.b bVar) {
        synchronized (this.mApiTasksLock) {
            this.mPendingApiTasks.add(bVar);
        }
    }

    @NotNull
    public wrc getClientCallback() {
        return this.mCallbackProxy;
    }

    public Connection getConnection() {
        return this.mConnection;
    }

    public final String getCoreId() {
        return this.mCoreId;
    }

    public abstract byte[] getData(com.xiaomi.eco.api.b bVar);

    public final String getDid() {
        return this.mDid;
    }

    public boolean handleData(int i, byte[] bArr) {
        try {
            this.mCallbackProxy.handleData(i, bArr);
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean handlePacket(int i, int i2, u7r u7rVar) {
        Logger.i(TAG, "handlePacket  type=" + i + "  ,packet type=" + u7rVar.e + "  ,packet id=" + u7rVar.f);
        try {
            this.mCallbackProxy.P4(i2, dsf.i(u7rVar));
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void handleVersion(byte[] bArr) {
    }

    public boolean isBindAbandon() {
        return this.mBindAbandon;
    }

    public boolean isBinding() {
        return mIsBinding;
    }

    public boolean isConnected() {
        return this.mConnected;
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    @Override // com.xiaomi.eco.common.connect.a
    public boolean isIDLE() throws RemoteException {
        boolean z;
        synchronized (this.mApiTasksLock) {
            try {
                z = this.mPendingApiTasks.isEmpty() && this.mRunningApiTask == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public com.xiaomi.eco.api.b nextApiTask() {
        synchronized (this.mApiTasksLock) {
            try {
                if (this.mPendingApiTasks.isEmpty()) {
                    return null;
                }
                return this.mPendingApiTasks.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnected() {
        Logger.i(TAG, "onConnected() did = " + this.mDid + ", ref = " + this);
        this.mConnected = true;
        doOnConnectedBeforeCallBack();
        try {
            this.mCallbackProxy.onConnected();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onDisconnected() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Logger.i(TAG, "onDisconnected: did = " + this.mDid + ", ref = " + this);
        this.mConnected = false;
        try {
            this.mCallbackProxy.onDisconnected();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        synchronized (this.mApiTasksLock) {
            arrayList = new ArrayList(this.mPendingApiTasks);
            this.mPendingApiTasks.clear();
            arrayList2 = new ArrayList(this.mWaitingResponseApiTasks);
            this.mWaitingResponseApiTasks.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.xiaomi.eco.api.b) it.next()).j();
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((com.xiaomi.eco.api.b) it2.next()).j();
        }
    }

    @Override // com.xiaomi.eco.api.p
    public void onReceiveResponse(com.xiaomi.eco.api.b bVar) {
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseApiTasks.remove(bVar);
        }
        this.mMainHandler.removeMessages(0, bVar);
    }

    @Override // com.xiaomi.eco.api.p
    public void onResponseTimeout(com.xiaomi.eco.api.b bVar) {
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseApiTasks.remove(bVar);
        }
    }

    @Override // com.xiaomi.eco.api.p
    public void onSendFailed(com.xiaomi.eco.api.b bVar, boolean z) {
        synchronized (this.mApiTasksLock) {
            this.mPendingApiTasks.remove(bVar);
        }
        if (z) {
            return;
        }
        this.mMainHandler.removeMessages(0, bVar);
    }

    @Override // com.xiaomi.eco.api.p
    public void onSendSuccess(com.xiaomi.eco.api.b bVar) {
        synchronized (this.mApiTasksLock) {
            try {
                this.mPendingApiTasks.remove(bVar);
                if (bVar.i()) {
                    this.mWaitingResponseApiTasks.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bVar.i()) {
            return;
        }
        this.mMainHandler.removeMessages(0, bVar);
    }

    @Override // com.xiaomi.eco.common.connect.a
    public void readNotificationConfig() throws RemoteException {
    }

    public void registerDataReceiver(int i, p.c cVar) {
    }

    @Override // com.xiaomi.eco.common.connect.a
    public void resetBleManager() throws RemoteException {
    }

    public void run(com.xiaomi.eco.api.b bVar) {
        int iF = bVar.f();
        if (iF > 0) {
            this.mMainHandler.sendMessageDelayed(this.mMainHandler.obtainMessage(0, bVar), iF);
        }
    }

    @Override // com.xiaomi.eco.common.connect.a
    public int sendFile(int i, int i2, String str, int i3, int i4, IEcoMassDataCallback iEcoMassDataCallback) throws RemoteException {
        int andIncrement = this.mCommonCallID.getAndIncrement();
        new d6f(this, i4).h(andIncrement, i, i2, str, i3, new b(iEcoMassDataCallback));
        return andIncrement;
    }

    @Override // com.xiaomi.eco.common.connect.a
    public void sendMessage(String str, String str2, byte[] bArr) throws RemoteException {
    }

    public void setBindAbandon(boolean z) {
        this.mBindAbandon = z;
    }

    @Override // com.xiaomi.eco.common.connect.a
    public final void setCurrent(boolean z) {
        this.isCurrent = z;
    }

    public void setIsBinding(boolean z) {
        mIsBinding = z;
    }

    @Override // com.xiaomi.eco.common.connect.a
    public void setNotificationConfig(List<EcoAppNotificationConfig> list) throws RemoteException {
    }

    public void unregisterDataReceiver(int i, p.c cVar) {
    }

    public final void updateDid(String str) {
        Logger.i(TAG, "updateDid() called with: did = [" + str + "], connection = " + this.mConnection);
        this.mDid = str;
        EcoApiCallManager.get().updateEcoApiCall(str, this);
        C c2 = this.mConnection;
        if (c2 != null) {
            c2.refreshDid(str);
        }
        try {
            this.mCallbackProxy.updateDid(str);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.eco.common.connect.a
    public int callTimeout(byte[] bArr, boolean z, final com.xiaomi.eco.common.connect.b bVar, int i) throws RemoteException {
        return callTimeout(qm5.b(bArr), z, new p.a() { // from class: ed7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f16519a.lambda$callTimeout$2(bVar, ecoApiResult);
            }
        }, i).c();
    }

    public final com.xiaomi.eco.api.b callTimeout(int i, byte[] bArr, boolean z, p.a aVar, int i2) {
        return call(i, null, bArr, z, aVar, i2);
    }

    public final com.xiaomi.eco.api.b callTimeout(int i, byte[] bArr, boolean z, p.a aVar, int i2, int i3, int i4) {
        return call(i, null, bArr, z, aVar, i2, i3, i4);
    }

    private com.xiaomi.eco.api.b call(int i, u7r u7rVar, byte[] bArr, boolean z, p.a aVar, int i2, int i3, int i4) {
        if (i2 > 0) {
            com.xiaomi.eco.api.b bVar = new com.xiaomi.eco.api.b(this.mCommonCallID.getAndIncrement(), this, i, u7rVar, bArr, z, aVar, i2, i3, i4);
            if (!this.mConnected) {
                Logger.i(TAG, "call() mConnect = false, did = " + this.mDid + " , call = " + this);
                bVar.j();
            } else {
                enqueue(bVar);
            }
            return bVar;
        }
        throw new IllegalArgumentException("timeout should larger than 0");
    }

    @Override // com.xiaomi.eco.api.p
    public void cancel(com.xiaomi.eco.api.b bVar) {
        synchronized (this.mApiTasksLock) {
            try {
                if (!this.mPendingApiTasks.remove(bVar)) {
                    this.mWaitingResponseApiTasks.remove(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mMainHandler.removeMessages(0, bVar);
    }

    public final com.xiaomi.eco.api.b call(u7r u7rVar, boolean z, p.a aVar) {
        return callTimeout(u7rVar, z, aVar, 8000);
    }

    @Override // com.xiaomi.eco.common.connect.a
    public int call(byte[] bArr, boolean z, final com.xiaomi.eco.common.connect.b bVar) throws RemoteException {
        Logger.i(TAG, "call() mConnect = false, did = " + this.mDid + " , call = " + this);
        return call(qm5.a(bArr), z, new p.a() { // from class: dd7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f15394a.lambda$call$0(bVar, ecoApiResult);
            }
        }).c();
    }

    public final com.xiaomi.eco.api.b call(int i, byte[] bArr, boolean z, p.a aVar) {
        return callTimeout(i, bArr, z, aVar, 8000);
    }
}
