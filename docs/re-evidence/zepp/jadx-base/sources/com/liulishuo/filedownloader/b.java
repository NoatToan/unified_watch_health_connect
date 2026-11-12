package com.liulishuo.filedownloader;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FDServiceSharedHandler;
import com.liulishuo.filedownloader.services.FileDownloadService;
import com.liulishuo.filedownloader.util.DownloadServiceNotConnectedHelper;
import com.liulishuo.filedownloader.util.ExtraKeys;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class b implements IFileDownloadServiceProxy, FDServiceSharedHandler.FileDownloadServiceSharedConnection {
    private static final Class<?> d = FileDownloadService.SharedMainProcessService.class;
    private boolean a = false;
    private final ArrayList<Runnable> b = new ArrayList<>();
    private FDServiceSharedHandler c;

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void bindStartByContext(Context context) {
        bindStartByContext(context, null);
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void clearAllTaskData() {
        if (isConnected()) {
            this.c.clearAllTaskData();
        } else {
            DownloadServiceNotConnectedHelper.clearAllTaskData();
        }
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean clearTaskData(int i) {
        return !isConnected() ? DownloadServiceNotConnectedHelper.clearTaskData(i) : this.c.clearTaskData(i);
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public long getSofar(int i) {
        return !isConnected() ? DownloadServiceNotConnectedHelper.getSofar(i) : this.c.getSofar(i);
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public byte getStatus(int i) {
        return !isConnected() ? DownloadServiceNotConnectedHelper.getStatus(i) : this.c.getStatus(i);
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public long getTotal(int i) {
        return !isConnected() ? DownloadServiceNotConnectedHelper.getTotal(i) : this.c.getTotal(i);
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean isConnected() {
        return this.c != null;
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean isDownloading(String str, String str2) {
        return !isConnected() ? DownloadServiceNotConnectedHelper.isDownloading(str, str2) : this.c.checkDownloading(str, str2);
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean isIdle() {
        return !isConnected() ? DownloadServiceNotConnectedHelper.isIdle() : this.c.isIdle();
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean isRunServiceForeground() {
        return this.a;
    }

    @Override // com.liulishuo.filedownloader.services.FDServiceSharedHandler.FileDownloadServiceSharedConnection
    public void onConnected(FDServiceSharedHandler fDServiceSharedHandler) {
        this.c = fDServiceSharedHandler;
        List list = (List) this.b.clone();
        this.b.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        FileDownloadEventPool.getImpl().asyncPublishInNewThread(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, d));
    }

    @Override // com.liulishuo.filedownloader.services.FDServiceSharedHandler.FileDownloadServiceSharedConnection
    public void onDisconnected() {
        this.c = null;
        FileDownloadEventPool.getImpl().asyncPublishInNewThread(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.disconnected, d));
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean pause(int i) {
        return !isConnected() ? DownloadServiceNotConnectedHelper.pause(i) : this.c.pause(i);
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void pauseAllTasks() {
        if (isConnected()) {
            this.c.pauseAllTasks();
        } else {
            DownloadServiceNotConnectedHelper.pauseAllTasks();
        }
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean setMaxNetworkThreadCount(int i) {
        return !isConnected() ? DownloadServiceNotConnectedHelper.setMaxNetworkThreadCount(i) : this.c.setMaxNetworkThreadCount(i);
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean start(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!isConnected()) {
            return DownloadServiceNotConnectedHelper.start(str, str2, z);
        }
        this.c.start(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
        return true;
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void startForeground(int i, Notification notification) {
        if (isConnected()) {
            this.c.startForeground(i, notification);
        } else {
            DownloadServiceNotConnectedHelper.startForeground(i, notification);
        }
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void stopForeground(boolean z) {
        if (!isConnected()) {
            DownloadServiceNotConnectedHelper.stopForeground(z);
        } else {
            this.c.stopForeground(z);
            this.a = false;
        }
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void unbindByContext(Context context) {
        context.stopService(new Intent(context, d));
        this.c = null;
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void bindStartByContext(Context context, Runnable runnable) {
        if (runnable != null && !this.b.contains(runnable)) {
            this.b.add(runnable);
        }
        Intent intent = new Intent(context, d);
        boolean zNeedMakeServiceForeground = FileDownloadUtils.needMakeServiceForeground(context);
        this.a = zNeedMakeServiceForeground;
        intent.putExtra(ExtraKeys.IS_FOREGROUND, zNeedMakeServiceForeground);
        if (!this.a) {
            context.startService(intent);
            return;
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }
}
