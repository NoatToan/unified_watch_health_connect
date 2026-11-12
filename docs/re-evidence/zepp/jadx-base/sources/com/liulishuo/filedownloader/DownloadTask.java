package com.liulishuo.filedownloader;

import android.text.TextUtils;
import android.util.SparseArray;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadStatus;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadTask implements BaseDownloadTask, BaseDownloadTask.IRunningTask, DownloadTaskHunter.a {
    public static final int DEFAULT_CALLBACK_PROGRESS_MIN_INTERVAL_MILLIS = 10;
    private final ITaskHunter a;
    private final ITaskHunter.IMessageHandler b;
    private int c;
    private ArrayList<BaseDownloadTask.FinishListener> d;
    private final String e;
    private String f;
    private String g;
    private boolean h;
    private FileDownloadHeader i;
    private FileDownloadListener j;
    private SparseArray<Object> k;
    private Object l;
    private final Object u;
    private int m = 0;
    private boolean n = false;
    private boolean o = false;
    private int p = 100;
    private int q = 10;
    private boolean r = false;
    public volatile int s = 0;
    private boolean t = false;
    private final Object v = new Object();
    private volatile boolean w = false;

    public static final class b implements BaseDownloadTask.InQueueTask {
        private final DownloadTask a;

        @Override // com.liulishuo.filedownloader.BaseDownloadTask.InQueueTask
        public int enqueue() {
            int id = this.a.getId();
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "add the task[%d] to the queue", Integer.valueOf(id));
            }
            FileDownloadList.getImpl().b(this.a);
            return id;
        }

        private b(DownloadTask downloadTask) {
            this.a = downloadTask;
            downloadTask.t = true;
        }
    }

    public DownloadTask(String str) {
        this.e = str;
        Object obj = new Object();
        this.u = obj;
        DownloadTaskHunter downloadTaskHunter = new DownloadTaskHunter(this, obj);
        this.a = downloadTaskHunter;
        this.b = downloadTaskHunter;
    }

    private void b() {
        if (this.i == null) {
            synchronized (this.v) {
                if (this.i == null) {
                    this.i = new FileDownloadHeader();
                }
            }
        }
    }

    private int c() {
        if (!isUsing()) {
            if (!isAttached()) {
                setAttachKeyDefault();
            }
            this.a.intoLaunchPool();
            return getId();
        }
        if (isRunning()) {
            throw new IllegalStateException(FileDownloadUtils.formatString("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(getId())));
        }
        throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.a.toString());
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask addFinishListener(BaseDownloadTask.FinishListener finishListener) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        if (!this.d.contains(finishListener)) {
            this.d.add(finishListener);
        }
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask addHeader(String str, String str2) {
        b();
        this.i.add(str, str2);
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask.InQueueTask asInQueueTask() {
        return new b();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean cancel() {
        return pause();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public void free() {
        this.a.free();
        if (FileDownloadList.getImpl().k(this)) {
            this.w = false;
        }
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public int getAttachKey() {
        return this.s;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getAutoRetryTimes() {
        return this.m;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getCallbackProgressMinInterval() {
        return this.q;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getCallbackProgressTimes() {
        return this.p;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getDownloadId() {
        return getId();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public Throwable getErrorCause() {
        return this.a.getErrorCause();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public String getEtag() {
        return this.a.getEtag();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public Throwable getEx() {
        return getErrorCause();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public String getFilename() {
        return this.g;
    }

    @Override // com.liulishuo.filedownloader.DownloadTaskHunter.a
    public ArrayList<BaseDownloadTask.FinishListener> getFinishListenerList() {
        return this.d;
    }

    @Override // com.liulishuo.filedownloader.DownloadTaskHunter.a
    public FileDownloadHeader getHeader() {
        return this.i;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getId() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.e)) {
            return 0;
        }
        int iGenerateId = FileDownloadUtils.generateId(this.e, this.f, this.h);
        this.c = iGenerateId;
        return iGenerateId;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public long getLargeFileSoFarBytes() {
        return this.a.getSofarBytes();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public long getLargeFileTotalBytes() {
        return this.a.getTotalBytes();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public FileDownloadListener getListener() {
        return this.j;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public ITaskHunter.IMessageHandler getMessageHandler() {
        return this.b;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public BaseDownloadTask getOrigin() {
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public String getPath() {
        return this.f;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public Object getPauseLock() {
        return this.u;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getRetryingTimes() {
        return this.a.getRetryingTimes();
    }

    @Override // com.liulishuo.filedownloader.DownloadTaskHunter.a
    public BaseDownloadTask.IRunningTask getRunningTask() {
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getSmallFileSoFarBytes() {
        if (this.a.getSofarBytes() > ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.a.getSofarBytes();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getSmallFileTotalBytes() {
        if (this.a.getTotalBytes() > ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.a.getTotalBytes();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getSoFarBytes() {
        return getSmallFileSoFarBytes();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getSpeed() {
        return this.a.getSpeed();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public byte getStatus() {
        return this.a.getStatus();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public Object getTag() {
        return this.l;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public String getTargetFilePath() {
        return FileDownloadUtils.getTargetFilePath(getPath(), isPathAsDirectory(), getFilename());
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int getTotalBytes() {
        return getSmallFileTotalBytes();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public String getUrl() {
        return this.e;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public boolean is(int i) {
        return getId() == i;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isAttached() {
        return this.s != 0;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public boolean isContainFinishListener() {
        ArrayList<BaseDownloadTask.FinishListener> arrayList = this.d;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isContinue() {
        return isResuming();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isForceReDownload() {
        return this.r;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isLargeFile() {
        return this.a.isLargeFile();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public boolean isMarkedAdded2List() {
        return this.w;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public boolean isOver() {
        return FileDownloadStatus.isOver(getStatus());
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isPathAsDirectory() {
        return this.h;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isResuming() {
        return this.a.isResuming();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isReusedOldFile() {
        return this.a.isReusedOldFile();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isRunning() {
        if (FileDownloader.getImpl().a().isInWaitingList(this)) {
            return true;
        }
        return FileDownloadStatus.isIng(getStatus());
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isSyncCallback() {
        return this.n;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isUsing() {
        return this.a.getStatus() != 0;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean isWifiRequired() {
        return this.o;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public void markAdded2List() {
        this.w = true;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean pause() {
        boolean zPause;
        synchronized (this.u) {
            zPause = this.a.pause();
        }
        return zPause;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int ready() {
        return asInQueueTask().enqueue();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask removeAllHeaders(String str) {
        if (this.i == null) {
            synchronized (this.v) {
                if (this.i == null) {
                    return this;
                }
            }
        }
        this.i.removeAll(str);
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean removeFinishListener(BaseDownloadTask.FinishListener finishListener) {
        ArrayList<BaseDownloadTask.FinishListener> arrayList = this.d;
        return arrayList != null && arrayList.remove(finishListener);
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public boolean reuse() {
        if (isRunning()) {
            FileDownloadLog.w(this, "This task[%d] is running, if you want start the same task, please create a new one by FileDownloader#create", Integer.valueOf(getId()));
            return false;
        }
        this.s = 0;
        this.t = false;
        this.w = false;
        this.a.reset();
        return true;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public void setAttachKeyByQueue(int i) {
        this.s = i;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public void setAttachKeyDefault() {
        this.s = getListener() != null ? getListener().hashCode() : hashCode();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setAutoRetryTimes(int i) {
        this.m = i;
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setCallbackProgressIgnored() {
        return setCallbackProgressTimes(-1);
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setCallbackProgressMinInterval(int i) {
        this.q = i;
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setCallbackProgressTimes(int i) {
        this.p = i;
        return this;
    }

    @Override // com.liulishuo.filedownloader.DownloadTaskHunter.a
    public void setFileName(String str) {
        this.g = str;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setFinishListener(BaseDownloadTask.FinishListener finishListener) {
        addFinishListener(finishListener);
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setForceReDownload(boolean z) {
        this.r = z;
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setListener(FileDownloadListener fileDownloadListener) {
        this.j = fileDownloadListener;
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "setListener %s", fileDownloadListener);
        }
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setMinIntervalUpdateSpeed(int i) {
        this.a.setMinIntervalUpdateSpeed(i);
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setPath(String str) {
        return setPath(str, false);
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setSyncCallback(boolean z) {
        this.n = z;
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setTag(Object obj) {
        this.l = obj;
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "setTag %s", obj);
        }
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setWifiRequired(boolean z) {
        this.o = z;
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public int start() {
        if (this.t) {
            throw new IllegalStateException("If you start the task manually, it means this task doesn't belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn't belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that's all. In other words, If this task doesn't belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically.");
        }
        return c();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public void startTaskByQueue() {
        c();
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public void startTaskByRescue() {
        c();
    }

    public String toString() {
        return FileDownloadUtils.formatString("%d@%s", Integer.valueOf(getId()), super.toString());
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public Object getTag(int i) {
        SparseArray<Object> sparseArray = this.k;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask.IRunningTask
    public boolean is(FileDownloadListener fileDownloadListener) {
        return getListener() == fileDownloadListener;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setPath(String str, boolean z) {
        this.f = str;
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "setPath %s", str);
        }
        this.h = z;
        if (z) {
            this.g = null;
        } else {
            this.g = new File(str).getName();
        }
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask addHeader(String str) {
        b();
        this.i.add(str);
        return this;
    }

    @Override // com.liulishuo.filedownloader.BaseDownloadTask
    public BaseDownloadTask setTag(int i, Object obj) {
        if (this.k == null) {
            this.k = new SparseArray<>(2);
        }
        this.k.put(i, obj);
        return this;
    }
}
