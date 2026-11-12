package com.liulishuo.filedownloader.notification;

import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.FileDownloadList;
import com.liulishuo.filedownloader.FileDownloadListener;

/* JADX INFO: loaded from: classes18.dex */
public abstract class FileDownloadNotificationListener extends FileDownloadListener {
    private final FileDownloadNotificationHelper a;

    public FileDownloadNotificationListener(FileDownloadNotificationHelper fileDownloadNotificationHelper) {
        if (fileDownloadNotificationHelper == null) {
            throw new IllegalArgumentException("helper must not be null!");
        }
        this.a = fileDownloadNotificationHelper;
    }

    public void addNotificationItem(int i) {
        BaseDownloadTask.IRunningTask iRunningTask;
        if (i == 0 || (iRunningTask = FileDownloadList.getImpl().get(i)) == null) {
            return;
        }
        addNotificationItem(iRunningTask.getOrigin());
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void blockComplete(BaseDownloadTask baseDownloadTask) {
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void completed(BaseDownloadTask baseDownloadTask) {
        destroyNotification(baseDownloadTask);
    }

    public abstract BaseNotificationItem create(BaseDownloadTask baseDownloadTask);

    public void destroyNotification(BaseDownloadTask baseDownloadTask) {
        if (disableNotification(baseDownloadTask)) {
            return;
        }
        this.a.showIndeterminate(baseDownloadTask.getId(), baseDownloadTask.getStatus());
        BaseNotificationItem baseNotificationItemRemove = this.a.remove(baseDownloadTask.getId());
        if (interceptCancel(baseDownloadTask, baseNotificationItemRemove) || baseNotificationItemRemove == null) {
            return;
        }
        baseNotificationItemRemove.cancel();
    }

    public boolean disableNotification(BaseDownloadTask baseDownloadTask) {
        return false;
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void error(BaseDownloadTask baseDownloadTask, Throwable th) {
        destroyNotification(baseDownloadTask);
    }

    public FileDownloadNotificationHelper getHelper() {
        return this.a;
    }

    public boolean interceptCancel(BaseDownloadTask baseDownloadTask, BaseNotificationItem baseNotificationItem) {
        return false;
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void paused(BaseDownloadTask baseDownloadTask, int i, int i2) {
        destroyNotification(baseDownloadTask);
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void pending(BaseDownloadTask baseDownloadTask, int i, int i2) {
        addNotificationItem(baseDownloadTask);
        showIndeterminate(baseDownloadTask);
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void progress(BaseDownloadTask baseDownloadTask, int i, int i2) {
        showProgress(baseDownloadTask, i, i2);
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void retry(BaseDownloadTask baseDownloadTask, Throwable th, int i, int i2) {
        super.retry(baseDownloadTask, th, i, i2);
        showIndeterminate(baseDownloadTask);
    }

    public void showIndeterminate(BaseDownloadTask baseDownloadTask) {
        if (disableNotification(baseDownloadTask)) {
            return;
        }
        this.a.showIndeterminate(baseDownloadTask.getId(), baseDownloadTask.getStatus());
    }

    public void showProgress(BaseDownloadTask baseDownloadTask, int i, int i2) {
        if (disableNotification(baseDownloadTask)) {
            return;
        }
        this.a.showProgress(baseDownloadTask.getId(), baseDownloadTask.getSmallFileSoFarBytes(), baseDownloadTask.getSmallFileTotalBytes());
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void started(BaseDownloadTask baseDownloadTask) {
        super.started(baseDownloadTask);
        showIndeterminate(baseDownloadTask);
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    public void warn(BaseDownloadTask baseDownloadTask) {
    }

    public void addNotificationItem(BaseDownloadTask baseDownloadTask) {
        BaseNotificationItem baseNotificationItemCreate;
        if (disableNotification(baseDownloadTask) || (baseNotificationItemCreate = create(baseDownloadTask)) == null) {
            return;
        }
        this.a.add(baseNotificationItemCreate);
    }
}
