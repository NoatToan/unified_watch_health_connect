package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.liulishuo.filedownloader.i.IFileDownloadIPCCallback;
import com.liulishuo.filedownloader.i.IFileDownloadIPCService;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshotFlow;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class FDServiceSeparateHandler extends IFileDownloadIPCService.Stub implements MessageSnapshotFlow.MessageReceiver, c {
    private final RemoteCallbackList<IFileDownloadIPCCallback> q = new RemoteCallbackList<>();
    private final a r;
    private final WeakReference<FileDownloadService> s;

    public FDServiceSeparateHandler(WeakReference<FileDownloadService> weakReference, a aVar) {
        this.s = weakReference;
        this.r = aVar;
        MessageSnapshotFlow.getImpl().setReceiver(this);
    }

    private synchronized int a(MessageSnapshot messageSnapshot) {
        int iBeginBroadcast;
        RemoteCallbackList<IFileDownloadIPCCallback> remoteCallbackList;
        iBeginBroadcast = this.q.beginBroadcast();
        for (int i = 0; i < iBeginBroadcast; i++) {
            try {
                try {
                    ((IFileDownloadIPCCallback) this.q.getBroadcastItem(i)).callback(messageSnapshot);
                } catch (Throwable th) {
                    this.q.finishBroadcast();
                    throw th;
                }
            } catch (RemoteException e) {
                FileDownloadLog.e(this, e, "callback error", new Object[0]);
                remoteCallbackList = this.q;
                remoteCallbackList.finishBroadcast();
                return iBeginBroadcast;
            }
        }
        remoteCallbackList = this.q;
        remoteCallbackList.finishBroadcast();
        return iBeginBroadcast;
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean checkDownloading(String str, String str2) throws RemoteException {
        return this.r.g(str, str2);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void clearAllTaskData() throws RemoteException {
        this.r.a();
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean clearTaskData(int i) throws RemoteException {
        return this.r.b(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public long getSofar(int i) throws RemoteException {
        return this.r.c(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public byte getStatus(int i) throws RemoteException {
        return this.r.d(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public long getTotal(int i) throws RemoteException {
        return this.r.e(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean isIdle() throws RemoteException {
        return this.r.h();
    }

    @Override // com.liulishuo.filedownloader.services.c
    public IBinder onBind(Intent intent) {
        return this;
    }

    @Override // com.liulishuo.filedownloader.services.c
    public void onDestroy() {
        MessageSnapshotFlow.getImpl().setReceiver(null);
    }

    @Override // com.liulishuo.filedownloader.services.c
    public void onStartCommand(Intent intent, int i, int i2) {
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean pause(int i) throws RemoteException {
        return this.r.i(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void pauseAllTasks() throws RemoteException {
        this.r.j();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshotFlow.MessageReceiver
    public void receive(MessageSnapshot messageSnapshot) {
        a(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void registerCallback(IFileDownloadIPCCallback iFileDownloadIPCCallback) throws RemoteException {
        this.q.register(iFileDownloadIPCCallback);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean setMaxNetworkThreadCount(int i) throws RemoteException {
        return this.r.k(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void start(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException {
        this.r.l(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void startForeground(int i, Notification notification) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.s.get().startForeground(i, notification);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void stopForeground(boolean z) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.s.get().stopForeground(z);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void unregisterCallback(IFileDownloadIPCCallback iFileDownloadIPCCallback) throws RemoteException {
        this.q.unregister(iFileDownloadIPCCallback);
    }
}
