package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadStatus;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes18.dex */
class a implements d {
    private BaseDownloadTask.IRunningTask a;
    private BaseDownloadTask.LifeCycleCallback b;
    private Queue<MessageSnapshot> c;
    private boolean d = false;

    public a(BaseDownloadTask.IRunningTask iRunningTask, BaseDownloadTask.LifeCycleCallback lifeCycleCallback) {
        q(iRunningTask, lifeCycleCallback);
    }

    private void q(BaseDownloadTask.IRunningTask iRunningTask, BaseDownloadTask.LifeCycleCallback lifeCycleCallback) {
        this.a = iRunningTask;
        this.b = lifeCycleCallback;
        this.c = new LinkedBlockingQueue();
    }

    private void r(int i) {
        if (FileDownloadStatus.isOver(i)) {
            if (!this.c.isEmpty()) {
                MessageSnapshot messageSnapshotPeek = this.c.peek();
                FileDownloadLog.w(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(messageSnapshotPeek.getId()), Integer.valueOf(this.c.size()), Byte.valueOf(messageSnapshotPeek.getStatus()));
            }
            this.a = null;
        }
    }

    private void s(MessageSnapshot messageSnapshot) {
        BaseDownloadTask.IRunningTask iRunningTask = this.a;
        if (iRunningTask == null) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(messageSnapshot.getStatus()));
            }
        } else {
            if (!this.d && iRunningTask.getOrigin().getListener() != null) {
                this.c.offer(messageSnapshot);
                FileDownloadMessageStation.getImpl().e(this);
                return;
            }
            if ((FileDownloadMonitor.isValid() || this.a.isContainFinishListener()) && messageSnapshot.getStatus() == 4) {
                this.b.onOver();
            }
            r(messageSnapshot.getStatus());
        }
    }

    @Override // com.liulishuo.filedownloader.d
    public void a(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify pending %s", this.a);
        }
        this.b.onIng();
        s(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.d
    public void b(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify started %s", this.a);
        }
        this.b.onIng();
        s(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.d
    public void c(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify paused %s", this.a);
        }
        this.b.onOver();
        s(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.d
    public void d(MessageSnapshot messageSnapshot) {
        BaseDownloadTask origin = this.a.getOrigin();
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify progress %s %d %d", origin, Long.valueOf(origin.getLargeFileSoFarBytes()), Long.valueOf(origin.getLargeFileTotalBytes()));
        }
        if (origin.getCallbackProgressTimes() > 0) {
            this.b.onIng();
            s(messageSnapshot);
        } else if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify progress but client not request notify %s", this.a);
        }
    }

    @Override // com.liulishuo.filedownloader.d
    public void e(BaseDownloadTask.IRunningTask iRunningTask, BaseDownloadTask.LifeCycleCallback lifeCycleCallback) {
        if (this.a != null) {
            throw new IllegalStateException(FileDownloadUtils.formatString("the messenger is working, can't re-appointment for %s", iRunningTask));
        }
        q(iRunningTask, lifeCycleCallback);
    }

    @Override // com.liulishuo.filedownloader.d
    public boolean f() {
        return this.c.peek().getStatus() == 4;
    }

    @Override // com.liulishuo.filedownloader.d
    public void g() {
        this.d = true;
    }

    @Override // com.liulishuo.filedownloader.d
    public void h() {
        if (this.d) {
            return;
        }
        com.liulishuo.filedownloader.message.a aVar = (MessageSnapshot) this.c.poll();
        byte status = aVar.getStatus();
        BaseDownloadTask.IRunningTask iRunningTask = this.a;
        if (iRunningTask == null) {
            throw new IllegalArgumentException(FileDownloadUtils.formatString("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(status), Integer.valueOf(this.c.size())));
        }
        BaseDownloadTask origin = iRunningTask.getOrigin();
        FileDownloadListener listener = origin.getListener();
        ITaskHunter.IMessageHandler messageHandler = iRunningTask.getMessageHandler();
        r(status);
        if (listener == null || listener.isInvalid()) {
            return;
        }
        if (status == 4) {
            try {
                listener.blockComplete(origin);
                k(((BlockCompleteMessage) aVar).transmitToCompleted());
                return;
            } catch (Throwable th) {
                j(messageHandler.prepareErrorMessage(th));
                return;
            }
        }
        FileDownloadLargeFileListener fileDownloadLargeFileListener = listener instanceof FileDownloadLargeFileListener ? (FileDownloadLargeFileListener) listener : null;
        if (status == -4) {
            listener.warn(origin);
            return;
        }
        if (status == -3) {
            listener.completed(origin);
            return;
        }
        if (status == -2) {
            if (fileDownloadLargeFileListener != null) {
                fileDownloadLargeFileListener.paused(origin, aVar.getLargeSofarBytes(), aVar.getLargeTotalBytes());
                return;
            } else {
                listener.paused(origin, aVar.getSmallSofarBytes(), aVar.getSmallTotalBytes());
                return;
            }
        }
        if (status == -1) {
            listener.error(origin, aVar.getThrowable());
            return;
        }
        if (status == 1) {
            if (fileDownloadLargeFileListener != null) {
                fileDownloadLargeFileListener.pending(origin, aVar.getLargeSofarBytes(), aVar.getLargeTotalBytes());
                return;
            } else {
                listener.pending(origin, aVar.getSmallSofarBytes(), aVar.getSmallTotalBytes());
                return;
            }
        }
        if (status == 2) {
            if (fileDownloadLargeFileListener != null) {
                fileDownloadLargeFileListener.connected(origin, aVar.getEtag(), aVar.isResuming(), origin.getLargeFileSoFarBytes(), aVar.getLargeTotalBytes());
                return;
            } else {
                listener.connected(origin, aVar.getEtag(), aVar.isResuming(), origin.getSmallFileSoFarBytes(), aVar.getSmallTotalBytes());
                return;
            }
        }
        if (status == 3) {
            if (fileDownloadLargeFileListener != null) {
                fileDownloadLargeFileListener.progress(origin, aVar.getLargeSofarBytes(), origin.getLargeFileTotalBytes());
                return;
            } else {
                listener.progress(origin, aVar.getSmallSofarBytes(), origin.getSmallFileTotalBytes());
                return;
            }
        }
        if (status != 5) {
            if (status != 6) {
                return;
            }
            listener.started(origin);
        } else if (fileDownloadLargeFileListener != null) {
            fileDownloadLargeFileListener.retry(origin, aVar.getThrowable(), aVar.getRetryingTimes(), aVar.getLargeSofarBytes());
        } else {
            listener.retry(origin, aVar.getThrowable(), aVar.getRetryingTimes(), aVar.getSmallSofarBytes());
        }
    }

    @Override // com.liulishuo.filedownloader.d
    public boolean i() {
        return this.a.getOrigin().isSyncCallback();
    }

    @Override // com.liulishuo.filedownloader.d
    public void j(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            BaseDownloadTask.IRunningTask iRunningTask = this.a;
            FileDownloadLog.d(this, "notify error %s %s", iRunningTask, iRunningTask.getOrigin().getErrorCause());
        }
        this.b.onOver();
        s(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.d
    public void k(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify completed %s", this.a);
        }
        this.b.onOver();
        s(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.d
    public void l(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            BaseDownloadTask origin = this.a.getOrigin();
            FileDownloadLog.d(this, "notify retry %s %d %d %s", this.a, Integer.valueOf(origin.getAutoRetryTimes()), Integer.valueOf(origin.getRetryingTimes()), origin.getErrorCause());
        }
        this.b.onIng();
        s(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.d
    public void m(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify connected %s", this.a);
        }
        this.b.onIng();
        s(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.d
    public boolean n() {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify begin %s", this.a);
        }
        if (this.a == null) {
            FileDownloadLog.w(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.c.size()));
            return false;
        }
        this.b.onBegin();
        return true;
    }

    @Override // com.liulishuo.filedownloader.d
    public void o(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify warn %s", this.a);
        }
        this.b.onOver();
        s(messageSnapshot);
    }

    @Override // com.liulishuo.filedownloader.d
    public void p(MessageSnapshot messageSnapshot) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify block completed %s %s", this.a, Thread.currentThread().getName());
        }
        this.b.onIng();
        s(messageSnapshot);
    }

    public String toString() {
        Object[] objArr = new Object[2];
        BaseDownloadTask.IRunningTask iRunningTask = this.a;
        objArr[0] = Integer.valueOf(iRunningTask == null ? -1 : iRunningTask.getOrigin().getId());
        objArr[1] = super.toString();
        return FileDownloadUtils.formatString("%d:%s", objArr);
    }
}
