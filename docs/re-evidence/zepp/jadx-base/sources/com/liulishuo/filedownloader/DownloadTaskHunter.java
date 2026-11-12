package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshotTaker;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadStatus;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadTaskHunter implements ITaskHunter, ITaskHunter.IStarter, ITaskHunter.IMessageHandler, BaseDownloadTask.LifeCycleCallback {
    private d a;
    private final Object b;
    private final a c;
    private final IDownloadSpeed.Monitor f;
    private final IDownloadSpeed.Lookup g;
    private long h;
    private long i;
    private int j;
    private boolean k;
    private boolean l;
    private String m;
    private volatile byte d = 0;
    private Throwable e = null;
    private boolean n = false;

    public interface a {
        ArrayList<BaseDownloadTask.FinishListener> getFinishListenerList();

        FileDownloadHeader getHeader();

        BaseDownloadTask.IRunningTask getRunningTask();

        void setFileName(String str);
    }

    public DownloadTaskHunter(a aVar, Object obj) {
        this.b = obj;
        this.c = aVar;
        DownloadSpeedMonitor downloadSpeedMonitor = new DownloadSpeedMonitor();
        this.f = downloadSpeedMonitor;
        this.g = downloadSpeedMonitor;
        this.a = new com.liulishuo.filedownloader.a(aVar.getRunningTask(), this);
    }

    private int a() {
        return this.c.getRunningTask().getOrigin().getId();
    }

    private void b() throws IOException {
        File file;
        BaseDownloadTask origin = this.c.getRunningTask().getOrigin();
        if (origin.getPath() == null) {
            origin.setPath(FileDownloadUtils.getDefaultSaveFilePath(origin.getUrl()));
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "save Path is null to %s", origin.getPath());
            }
        }
        if (origin.isPathAsDirectory()) {
            file = new File(origin.getPath());
        } else {
            String parent = FileDownloadUtils.getParent(origin.getPath());
            if (parent == null) {
                throw new InvalidParameterException(FileDownloadUtils.formatString("the provided mPath[%s] is invalid, can't find its directory", origin.getPath()));
            }
            file = new File(parent);
        }
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new IOException(FileDownloadUtils.formatString("Create parent directory failed, please make sure you have permission to create file or directory on the path: %s", file.getAbsolutePath()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(MessageSnapshot messageSnapshot) {
        BaseDownloadTask origin = this.c.getRunningTask().getOrigin();
        byte status = messageSnapshot.getStatus();
        this.d = status;
        this.k = messageSnapshot.isLargeFile();
        if (status == -4) {
            this.f.reset();
            int iF = FileDownloadList.getImpl().f(origin.getId());
            if (iF + ((iF > 1 || !origin.isPathAsDirectory()) ? 0 : FileDownloadList.getImpl().f(FileDownloadUtils.generateId(origin.getUrl(), origin.getTargetFilePath()))) <= 1) {
                byte status2 = FileDownloadServiceProxy.getImpl().getStatus(origin.getId());
                FileDownloadLog.w(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(origin.getId()), Integer.valueOf(status2));
                if (FileDownloadStatus.isIng(status2)) {
                    this.d = (byte) 1;
                    this.i = messageSnapshot.getLargeTotalBytes();
                    long largeSofarBytes = messageSnapshot.getLargeSofarBytes();
                    this.h = largeSofarBytes;
                    this.f.start(largeSofarBytes);
                    this.a.a(((MessageSnapshot.IWarnMessageSnapshot) messageSnapshot).turnToPending());
                    return;
                }
            }
            FileDownloadList.getImpl().remove(this.c.getRunningTask(), messageSnapshot);
            return;
        }
        if (status == -3) {
            this.n = messageSnapshot.isReusedDownloadedFile();
            this.h = messageSnapshot.getLargeTotalBytes();
            this.i = messageSnapshot.getLargeTotalBytes();
            FileDownloadList.getImpl().remove(this.c.getRunningTask(), messageSnapshot);
            return;
        }
        if (status == -1) {
            this.e = messageSnapshot.getThrowable();
            this.h = messageSnapshot.getLargeSofarBytes();
            FileDownloadList.getImpl().remove(this.c.getRunningTask(), messageSnapshot);
            return;
        }
        if (status == 1) {
            this.h = messageSnapshot.getLargeSofarBytes();
            this.i = messageSnapshot.getLargeTotalBytes();
            this.a.a(messageSnapshot);
            return;
        }
        if (status == 2) {
            this.i = messageSnapshot.getLargeTotalBytes();
            this.l = messageSnapshot.isResuming();
            this.m = messageSnapshot.getEtag();
            String fileName = messageSnapshot.getFileName();
            if (fileName != null) {
                if (origin.getFilename() != null) {
                    FileDownloadLog.w(this, "already has mFilename[%s], but assign mFilename[%s] again", origin.getFilename(), fileName);
                }
                this.c.setFileName(fileName);
            }
            this.f.start(this.h);
            this.a.m(messageSnapshot);
            return;
        }
        if (status == 3) {
            this.h = messageSnapshot.getLargeSofarBytes();
            this.f.update(messageSnapshot.getLargeSofarBytes());
            this.a.d(messageSnapshot);
        } else if (status != 5) {
            if (status != 6) {
                return;
            }
            this.a.b(messageSnapshot);
        } else {
            this.h = messageSnapshot.getLargeSofarBytes();
            this.e = messageSnapshot.getThrowable();
            this.j = messageSnapshot.getRetryingTimes();
            this.f.reset();
            this.a.l(messageSnapshot);
        }
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter.IStarter
    public boolean equalListener(FileDownloadListener fileDownloadListener) {
        return this.c.getRunningTask().getOrigin().getListener() == fileDownloadListener;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public void free() {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "free the task %d, when the status is %d", Integer.valueOf(a()), Byte.valueOf(this.d));
        }
        this.d = (byte) 0;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public Throwable getErrorCause() {
        return this.e;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public String getEtag() {
        return this.m;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter.IMessageHandler
    public d getMessenger() {
        return this.a;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public int getRetryingTimes() {
        return this.j;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public long getSofarBytes() {
        return this.h;
    }

    @Override // com.liulishuo.filedownloader.IDownloadSpeed.Lookup
    public int getSpeed() {
        return this.g.getSpeed();
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public byte getStatus() {
        return this.d;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public long getTotalBytes() {
        return this.i;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public void intoLaunchPool() {
        boolean z;
        synchronized (this.b) {
            if (this.d != 0) {
                FileDownloadLog.w(this, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(a()), Byte.valueOf(this.d));
                return;
            }
            this.d = (byte) 10;
            BaseDownloadTask.IRunningTask runningTask = this.c.getRunningTask();
            BaseDownloadTask origin = runningTask.getOrigin();
            if (FileDownloadMonitor.isValid()) {
                FileDownloadMonitor.getMonitor().onRequestStart(origin);
            }
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.v(this, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", origin.getUrl(), origin.getPath(), origin.getListener(), origin.getTag());
            }
            try {
                b();
                z = true;
            } catch (Throwable th) {
                FileDownloadList.getImpl().a(runningTask);
                FileDownloadList.getImpl().remove(runningTask, prepareErrorMessage(th));
                z = false;
            }
            if (z) {
                c.d().e(this);
            }
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.v(this, "the task[%d] has been into the launch pool.", Integer.valueOf(a()));
            }
        }
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public boolean isLargeFile() {
        return this.k;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public boolean isResuming() {
        return this.l;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public boolean isReusedOldFile() {
        return this.n;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.LifeCycleCallback
    public void onBegin() {
        if (FileDownloadMonitor.isValid()) {
            FileDownloadMonitor.getMonitor().onTaskBegin(this.c.getRunningTask().getOrigin());
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.LifeCycleCallback
    public void onIng() {
        if (FileDownloadMonitor.isValid() && getStatus() == 6) {
            FileDownloadMonitor.getMonitor().onTaskStarted(this.c.getRunningTask().getOrigin());
        }
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.LifeCycleCallback
    public void onOver() {
        BaseDownloadTask origin = this.c.getRunningTask().getOrigin();
        if (FileDownloadMonitor.isValid()) {
            FileDownloadMonitor.getMonitor().onTaskOver(origin);
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
        this.f.end(this.h);
        if (this.c.getFinishListenerList() != null) {
            ArrayList arrayList = (ArrayList) this.c.getFinishListenerList().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((BaseDownloadTask.FinishListener) arrayList.get(i)).over(origin);
            }
        }
        FileDownloader.getImpl().a().taskWorkFine(this.c.getRunningTask());
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public boolean pause() {
        if (FileDownloadStatus.isOver(getStatus())) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "High concurrent cause, Already is over, can't pause again, %d %d", Byte.valueOf(getStatus()), Integer.valueOf(this.c.getRunningTask().getOrigin().getId()));
            }
            return false;
        }
        this.d = (byte) -2;
        BaseDownloadTask.IRunningTask runningTask = this.c.getRunningTask();
        BaseDownloadTask origin = runningTask.getOrigin();
        c.d().b(this);
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(this, "the task[%d] has been expired from the launch pool.", Integer.valueOf(a()));
        }
        if (FileDownloader.getImpl().isServiceConnected()) {
            FileDownloadServiceProxy.getImpl().pause(origin.getId());
        } else if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "request pause the task[%d] to the download service, but the download service isn't connected yet.", Integer.valueOf(origin.getId()));
        }
        FileDownloadList.getImpl().a(runningTask);
        FileDownloadList.getImpl().remove(runningTask, MessageSnapshotTaker.catchPause(origin));
        FileDownloader.getImpl().a().taskWorkFine(runningTask);
        return true;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter.IMessageHandler
    public MessageSnapshot prepareErrorMessage(Throwable th) {
        this.d = (byte) -1;
        this.e = th;
        return MessageSnapshotTaker.catchException(a(), getSofarBytes(), th);
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter
    public void reset() {
        this.e = null;
        this.m = null;
        this.l = false;
        this.j = 0;
        this.n = false;
        this.k = false;
        this.h = 0L;
        this.i = 0L;
        this.f.reset();
        if (FileDownloadStatus.isOver(this.d)) {
            this.a.g();
            this.a = new com.liulishuo.filedownloader.a(this.c.getRunningTask(), this);
        } else {
            this.a.e(this.c.getRunningTask(), this);
        }
        this.d = (byte) 0;
    }

    @Override // com.liulishuo.filedownloader.IDownloadSpeed.Lookup
    public void setMinIntervalUpdateSpeed(int i) {
        this.g.setMinIntervalUpdateSpeed(i);
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter.IStarter
    public void start() {
        if (this.d != 10) {
            FileDownloadLog.w(this, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(a()), Byte.valueOf(this.d));
            return;
        }
        BaseDownloadTask.IRunningTask runningTask = this.c.getRunningTask();
        BaseDownloadTask origin = runningTask.getOrigin();
        ILostServiceConnectedHandler iLostServiceConnectedHandlerA = FileDownloader.getImpl().a();
        try {
            if (iLostServiceConnectedHandlerA.dispatchTaskStart(runningTask)) {
                return;
            }
            synchronized (this.b) {
                if (this.d != 10) {
                    FileDownloadLog.w(this, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(a()), Byte.valueOf(this.d));
                    return;
                }
                this.d = (byte) 11;
                FileDownloadList.getImpl().a(runningTask);
                if (FileDownloadHelper.inspectAndInflowDownloaded(origin.getId(), origin.getTargetFilePath(), origin.isForceReDownload(), true)) {
                    return;
                }
                boolean zStart = FileDownloadServiceProxy.getImpl().start(origin.getUrl(), origin.getPath(), origin.isPathAsDirectory(), origin.getCallbackProgressTimes(), origin.getCallbackProgressMinInterval(), origin.getAutoRetryTimes(), origin.isForceReDownload(), this.c.getHeader(), origin.isWifiRequired());
                if (this.d == -2) {
                    FileDownloadLog.w(this, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(a()));
                    if (zStart) {
                        FileDownloadServiceProxy.getImpl().pause(a());
                        return;
                    }
                    return;
                }
                if (zStart) {
                    iLostServiceConnectedHandlerA.taskWorkFine(runningTask);
                    return;
                }
                if (iLostServiceConnectedHandlerA.dispatchTaskStart(runningTask)) {
                    return;
                }
                MessageSnapshot messageSnapshotPrepareErrorMessage = prepareErrorMessage(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                if (FileDownloadList.getImpl().k(runningTask)) {
                    iLostServiceConnectedHandlerA.taskWorkFine(runningTask);
                    FileDownloadList.getImpl().a(runningTask);
                }
                FileDownloadList.getImpl().remove(runningTask, messageSnapshotPrepareErrorMessage);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            FileDownloadList.getImpl().remove(runningTask, prepareErrorMessage(th));
        }
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter.IMessageHandler
    public boolean updateKeepAhead(MessageSnapshot messageSnapshot) {
        if (FileDownloadStatus.isKeepAhead(getStatus(), messageSnapshot.getStatus())) {
            c(messageSnapshot);
            return true;
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.d), Byte.valueOf(getStatus()), Integer.valueOf(a()));
        }
        return false;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter.IMessageHandler
    public boolean updateKeepFlow(MessageSnapshot messageSnapshot) {
        byte status = getStatus();
        byte status2 = messageSnapshot.getStatus();
        if (-2 == status && FileDownloadStatus.isIng(status2)) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(a()));
            }
            return true;
        }
        if (FileDownloadStatus.isKeepFlow(status, status2)) {
            c(messageSnapshot);
            return true;
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.d), Byte.valueOf(getStatus()), Integer.valueOf(a()));
        }
        return false;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter.IMessageHandler
    public boolean updateMoreLikelyCompleted(MessageSnapshot messageSnapshot) {
        if (!FileDownloadStatus.isMoreLikelyCompleted(this.c.getRunningTask().getOrigin())) {
            return false;
        }
        c(messageSnapshot);
        return true;
    }

    @Override // com.liulishuo.filedownloader.ITaskHunter.IMessageHandler
    public boolean updateSameFilePathTaskRunning(MessageSnapshot messageSnapshot) {
        if (!this.c.getRunningTask().getOrigin().isPathAsDirectory() || messageSnapshot.getStatus() != -4 || getStatus() != 2) {
            return false;
        }
        c(messageSnapshot);
        return true;
    }
}
