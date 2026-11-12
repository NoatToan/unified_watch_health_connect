package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class LostServiceConnectedHandler extends FileDownloadConnectListener implements ILostServiceConnectedHandler {
    private final ArrayList<BaseDownloadTask.IRunningTask> b = new ArrayList<>();

    @Override // com.liulishuo.filedownloader.FileDownloadConnectListener
    public void connected() {
        IQueuesHandler iQueuesHandlerB = FileDownloader.getImpl().b();
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.b) {
            List<BaseDownloadTask.IRunningTask> list = (List) this.b.clone();
            this.b.clear();
            ArrayList arrayList = new ArrayList(iQueuesHandlerB.serialQueueSize());
            for (BaseDownloadTask.IRunningTask iRunningTask : list) {
                int attachKey = iRunningTask.getAttachKey();
                if (iQueuesHandlerB.contain(attachKey)) {
                    iRunningTask.getOrigin().asInQueueTask().enqueue();
                    if (!arrayList.contains(Integer.valueOf(attachKey))) {
                        arrayList.add(Integer.valueOf(attachKey));
                    }
                } else {
                    iRunningTask.startTaskByRescue();
                }
            }
            iQueuesHandlerB.unFreezeSerialQueues(arrayList);
        }
    }

    @Override // com.liulishuo.filedownloader.FileDownloadConnectListener
    public void disconnected() {
        if (getConnectStatus() != DownloadServiceConnectChangedEvent.ConnectStatus.lost) {
            if (FileDownloadList.getImpl().l() > 0) {
                FileDownloadLog.w(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(FileDownloadList.getImpl().l()));
                return;
            }
            return;
        }
        IQueuesHandler iQueuesHandlerB = FileDownloader.getImpl().b();
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(FileDownloadList.getImpl().l()));
        }
        if (FileDownloadList.getImpl().l() > 0) {
            synchronized (this.b) {
                FileDownloadList.getImpl().g(this.b);
                Iterator<BaseDownloadTask.IRunningTask> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().free();
                }
                iQueuesHandlerB.freezeAllSerialQueues();
            }
            try {
                FileDownloader.getImpl().bindService();
            } catch (IllegalStateException unused) {
                FileDownloadLog.w(this, "restart service failed, you may need to restart downloading manually when the app comes back to foreground", new Object[0]);
            }
        }
    }

    @Override // com.liulishuo.filedownloader.ILostServiceConnectedHandler
    public boolean dispatchTaskStart(BaseDownloadTask.IRunningTask iRunningTask) {
        if (!FileDownloader.getImpl().isServiceConnected()) {
            synchronized (this.b) {
                if (!FileDownloader.getImpl().isServiceConnected()) {
                    if (FileDownloadLog.NEED_LOG) {
                        FileDownloadLog.d(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(iRunningTask.getOrigin().getId()));
                    }
                    FileDownloadServiceProxy.getImpl().bindStartByContext(FileDownloadHelper.getAppContext());
                    if (!this.b.contains(iRunningTask)) {
                        iRunningTask.free();
                        this.b.add(iRunningTask);
                    }
                    return true;
                }
            }
        }
        taskWorkFine(iRunningTask);
        return false;
    }

    @Override // com.liulishuo.filedownloader.ILostServiceConnectedHandler
    public boolean isInWaitingList(BaseDownloadTask.IRunningTask iRunningTask) {
        return !this.b.isEmpty() && this.b.contains(iRunningTask);
    }

    @Override // com.liulishuo.filedownloader.ILostServiceConnectedHandler
    public void taskWorkFine(BaseDownloadTask.IRunningTask iRunningTask) {
        if (this.b.isEmpty()) {
            return;
        }
        synchronized (this.b) {
            this.b.remove(iRunningTask);
        }
    }
}
