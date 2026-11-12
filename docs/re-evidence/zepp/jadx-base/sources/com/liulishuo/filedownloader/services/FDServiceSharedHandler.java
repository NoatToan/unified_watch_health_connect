package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.liulishuo.filedownloader.FileDownloadServiceProxy;
import com.liulishuo.filedownloader.i.IFileDownloadIPCCallback;
import com.liulishuo.filedownloader.i.IFileDownloadIPCService;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class FDServiceSharedHandler extends IFileDownloadIPCService.Stub implements c {
    private final a q;
    private final WeakReference<FileDownloadService> r;

    public interface FileDownloadServiceSharedConnection {
        void onConnected(FDServiceSharedHandler fDServiceSharedHandler);

        void onDisconnected();
    }

    public FDServiceSharedHandler(WeakReference<FileDownloadService> weakReference, a aVar) {
        this.r = weakReference;
        this.q = aVar;
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean checkDownloading(String str, String str2) {
        return this.q.g(str, str2);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void clearAllTaskData() {
        this.q.a();
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean clearTaskData(int i) {
        return this.q.b(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public long getSofar(int i) {
        return this.q.c(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public byte getStatus(int i) {
        return this.q.d(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public long getTotal(int i) {
        return this.q.e(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean isIdle() {
        return this.q.h();
    }

    @Override // com.liulishuo.filedownloader.services.c
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.liulishuo.filedownloader.services.c
    public void onDestroy() {
        FileDownloadServiceProxy.getConnectionListener().onDisconnected();
    }

    @Override // com.liulishuo.filedownloader.services.c
    public void onStartCommand(Intent intent, int i, int i2) {
        FileDownloadServiceProxy.getConnectionListener().onConnected(this);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean pause(int i) {
        return this.q.i(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void pauseAllTasks() {
        this.q.j();
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void registerCallback(IFileDownloadIPCCallback iFileDownloadIPCCallback) {
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public boolean setMaxNetworkThreadCount(int i) {
        return this.q.k(i);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void start(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        this.q.l(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void startForeground(int i, Notification notification) {
        WeakReference<FileDownloadService> weakReference = this.r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.r.get().startForeground(i, notification);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void stopForeground(boolean z) {
        WeakReference<FileDownloadService> weakReference = this.r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.r.get().stopForeground(z);
    }

    @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCService
    public void unregisterCallback(IFileDownloadIPCCallback iFileDownloadIPCCallback) {
    }
}
