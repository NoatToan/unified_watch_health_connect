package com.liulishuo.filedownloader.download;

import android.os.Process;
import com.liulishuo.filedownloader.IThreadPoolMonitor;
import com.liulishuo.filedownloader.connection.FileDownloadConnection;
import com.liulishuo.filedownloader.database.FileDownloadDatabase;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.ConnectionModel;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.stream.FileDownloadOutputStream;
import com.liulishuo.filedownloader.util.FileDownloadExecutors;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadProperties;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadLaunchRunnable implements Runnable, ProcessCallback {
    private static final int B = 416;
    private static final int C = -1;
    private static final ThreadPoolExecutor D = FileDownloadExecutors.newFixedThreadPool("ConnectionBlock");
    private long A;
    private final DownloadStatusCallback a;
    private final int b;
    private final FileDownloadModel c;
    private final FileDownloadHeader d;
    private final boolean e;
    private final boolean f;
    private final FileDownloadDatabase g;
    private final IThreadPoolMonitor h;
    private boolean i;
    public int j;
    private boolean k;
    private final boolean l;
    private final ArrayList<DownloadRunnable> m;
    private DownloadRunnable n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final AtomicBoolean s;
    private volatile boolean t;
    private volatile boolean u;
    private volatile Exception v;
    private String w;
    private long x;
    private long y;
    private long z;

    public static class Builder {
        private FileDownloadModel a;
        private FileDownloadHeader b;
        private IThreadPoolMonitor c;
        private Integer d;
        private Integer e;
        private Boolean f;
        private Boolean g;
        private Integer h;

        public DownloadLaunchRunnable build() {
            if (this.a == null || this.c == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null) {
                throw new IllegalArgumentException();
            }
            return new DownloadLaunchRunnable(this.a, this.b, this.c, this.d.intValue(), this.e.intValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.intValue());
        }

        public Builder setCallbackProgressMaxCount(Integer num) {
            this.e = num;
            return this;
        }

        public Builder setForceReDownload(Boolean bool) {
            this.f = bool;
            return this;
        }

        public Builder setHeader(FileDownloadHeader fileDownloadHeader) {
            this.b = fileDownloadHeader;
            return this;
        }

        public Builder setMaxRetryTimes(Integer num) {
            this.h = num;
            return this;
        }

        public Builder setMinIntervalMillis(Integer num) {
            this.d = num;
            return this;
        }

        public Builder setModel(FileDownloadModel fileDownloadModel) {
            this.a = fileDownloadModel;
            return this;
        }

        public Builder setThreadPoolMonitor(IThreadPoolMonitor iThreadPoolMonitor) {
            this.c = iThreadPoolMonitor;
            return this;
        }

        public Builder setWifiRequired(Boolean bool) {
            this.g = bool;
            return this;
        }
    }

    public class b extends Throwable {
        public b() {
        }
    }

    public class c extends Throwable {
        public c() {
        }
    }

    private int a(long j) {
        if (j()) {
            return this.p ? this.c.getConnectionCount() : CustomComponentHolder.getImpl().determineConnectionCount(this.c.getId(), this.c.getUrl(), this.c.getPath(), j);
        }
        return 1;
    }

    private void b() throws b, c {
        int id = this.c.getId();
        if (this.c.isPathAsDirectory()) {
            String targetFilePath = this.c.getTargetFilePath();
            int iGenerateId = FileDownloadUtils.generateId(this.c.getUrl(), targetFilePath);
            if (FileDownloadHelper.inspectAndInflowDownloaded(id, targetFilePath, this.e, false)) {
                this.g.remove(id);
                this.g.removeConnections(id);
                throw new b();
            }
            FileDownloadModel fileDownloadModelFind = this.g.find(iGenerateId);
            if (fileDownloadModelFind != null) {
                if (FileDownloadHelper.inspectAndInflowDownloading(id, fileDownloadModelFind, this.h, false)) {
                    this.g.remove(id);
                    this.g.removeConnections(id);
                    throw new b();
                }
                List<ConnectionModel> listFindConnectionModel = this.g.findConnectionModel(iGenerateId);
                this.g.remove(iGenerateId);
                this.g.removeConnections(iGenerateId);
                FileDownloadUtils.deleteTargetFile(this.c.getTargetFilePath());
                if (FileDownloadUtils.isBreakpointAvailable(iGenerateId, fileDownloadModelFind)) {
                    this.c.setSoFar(fileDownloadModelFind.getSoFar());
                    this.c.setTotal(fileDownloadModelFind.getTotal());
                    this.c.setETag(fileDownloadModelFind.getETag());
                    this.c.setConnectionCount(fileDownloadModelFind.getConnectionCount());
                    this.g.update(this.c);
                    if (listFindConnectionModel != null) {
                        for (ConnectionModel connectionModel : listFindConnectionModel) {
                            connectionModel.setId(id);
                            this.g.insertConnectionModel(connectionModel);
                        }
                    }
                    throw new c();
                }
            }
            if (FileDownloadHelper.inspectAndInflowConflictPath(id, this.c.getSoFar(), this.c.getTempFilePath(), targetFilePath, this.h)) {
                this.g.remove(id);
                this.g.removeConnections(id);
                throw new b();
            }
        }
    }

    private void c() throws FileDownloadGiveUpRetryException {
        if (this.f && !FileDownloadUtils.checkPermission("android.permission.ACCESS_NETWORK_STATE")) {
            throw new FileDownloadGiveUpRetryException(FileDownloadUtils.formatString("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.c.getId()), "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.f && FileDownloadUtils.isNetworkNotOnWifiType()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    public static DownloadLaunchRunnable d(DownloadStatusCallback downloadStatusCallback, FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, IThreadPoolMonitor iThreadPoolMonitor, int i, int i2, boolean z, boolean z2, int i3) {
        return new DownloadLaunchRunnable(downloadStatusCallback, fileDownloadModel, fileDownloadHeader, iThreadPoolMonitor, i, i2, z, z2, i3);
    }

    private int e() {
        return 5;
    }

    private void f(List<ConnectionModel> list, long j) throws InterruptedException {
        int id = this.c.getId();
        String eTag = this.c.getETag();
        String url = this.w;
        if (url == null) {
            url = this.c.getUrl();
        }
        String tempFilePath = this.c.getTempFilePath();
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(id), Long.valueOf(j));
        }
        boolean z = this.p;
        long j2 = 0;
        long currentOffset = 0;
        for (ConnectionModel connectionModel : list) {
            long currentOffset2 = connectionModel.getEndOffset() == -1 ? j - connectionModel.getCurrentOffset() : (connectionModel.getEndOffset() - connectionModel.getCurrentOffset()) + 1;
            currentOffset += connectionModel.getCurrentOffset() - connectionModel.getStartOffset();
            if (currentOffset2 != j2) {
                DownloadRunnable downloadRunnableBuild = new DownloadRunnable.Builder().setId(id).setConnectionIndex(Integer.valueOf(connectionModel.getIndex())).setCallback(this).setUrl(url).setEtag(z ? eTag : null).setHeader(this.d).setWifiRequired(this.f).setConnectionModel(ConnectionProfile.ConnectionProfileBuild.buildConnectionProfile(connectionModel.getStartOffset(), connectionModel.getCurrentOffset(), connectionModel.getEndOffset(), currentOffset2)).setPath(tempFilePath).build();
                if (FileDownloadLog.NEED_LOG) {
                    FileDownloadLog.d(this, "enable multiple connection: %s", connectionModel);
                }
                if (downloadRunnableBuild == null) {
                    throw new IllegalArgumentException("the download runnable must not be null!");
                }
                this.m.add(downloadRunnableBuild);
            } else if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(connectionModel.getId()), Integer.valueOf(connectionModel.getIndex()));
            }
            j2 = 0;
        }
        if (currentOffset != this.c.getSoFar()) {
            FileDownloadLog.w(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.c.getSoFar()), Long.valueOf(currentOffset));
            this.c.setSoFar(currentOffset);
        }
        ArrayList arrayList = new ArrayList(this.m.size());
        for (DownloadRunnable downloadRunnable : this.m) {
            if (this.t) {
                downloadRunnable.pause();
            } else {
                arrayList.add(Executors.callable(downloadRunnable));
            }
        }
        if (this.t) {
            this.c.setStatus((byte) -2);
            return;
        }
        List<Future> listInvokeAll = D.invokeAll(arrayList);
        if (FileDownloadLog.NEED_LOG) {
            for (Future future : listInvokeAll) {
                FileDownloadLog.d(this, "finish sub-task for [%d] %B %B", Integer.valueOf(id), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    private void g(long j, String str) throws IllegalAccessException, IOException {
        FileDownloadOutputStream fileDownloadOutputStreamCreateOutputStream = null;
        if (j != -1) {
            try {
                fileDownloadOutputStreamCreateOutputStream = FileDownloadUtils.createOutputStream(this.c.getTempFilePath());
                long length = new File(str).length();
                long j2 = j - length;
                long freeSpaceBytes = FileDownloadUtils.getFreeSpaceBytes(str);
                if (freeSpaceBytes < j2) {
                    throw new FileDownloadOutOfSpaceException(freeSpaceBytes, j2, length);
                }
                if (!FileDownloadProperties.getImpl().fileNonPreAllocation) {
                    fileDownloadOutputStreamCreateOutputStream.setLength(j);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    fileDownloadOutputStreamCreateOutputStream.close();
                }
                throw th;
            }
        }
        if (fileDownloadOutputStreamCreateOutputStream != null) {
            fileDownloadOutputStreamCreateOutputStream.close();
        }
    }

    private void h(Map<String, List<String>> map, ConnectTask connectTask, FileDownloadConnection fileDownloadConnection) throws c, FileDownloadSecurityException, IOException, IllegalArgumentException {
        boolean z;
        int id = this.c.getId();
        int responseCode = fileDownloadConnection.getResponseCode();
        this.q = FileDownloadUtils.isAcceptRange(responseCode, fileDownloadConnection);
        boolean z2 = responseCode == 200 || responseCode == 201 || responseCode == 0;
        long jFindInstanceLengthForTrial = FileDownloadUtils.findInstanceLengthForTrial(fileDownloadConnection);
        String eTag = this.c.getETag();
        String strFindEtag = FileDownloadUtils.findEtag(id, fileDownloadConnection);
        if (responseCode != 412 && ((eTag == null || eTag.equals(strFindEtag) || !(z2 || this.q)) && !(responseCode == 201 && connectTask.f()))) {
            if (responseCode == 416) {
                if (!this.q || jFindInstanceLengthForTrial < 0) {
                    if (this.c.getSoFar() > 0) {
                        FileDownloadLog.w(this, "get 416, precondition failed and just retry", new Object[0]);
                    } else if (!this.k) {
                        this.k = true;
                        FileDownloadLog.w(this, "get 416, precondition failed and need to retry with discarding range", new Object[0]);
                    }
                    z = true;
                } else {
                    FileDownloadLog.w(this, "get 416 but the Content-Range is returned, no need to retry", new Object[0]);
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.w = connectTask.e();
            if (!this.q && !z2) {
                throw new FileDownloadHttpException(responseCode, map, fileDownloadConnection.getResponseHeaderFields());
            }
            String strFindFilename = this.c.isPathAsDirectory() ? FileDownloadUtils.findFilename(fileDownloadConnection, this.c.getUrl()) : null;
            this.r = jFindInstanceLengthForTrial == -1;
            this.a.m(this.p && this.q, jFindInstanceLengthForTrial, strFindEtag, strFindFilename);
            return;
        }
        if (this.p) {
            FileDownloadLog.w(this, "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response code is %d", Integer.valueOf(id), eTag, strFindEtag, Integer.valueOf(responseCode));
        }
        this.g.removeConnections(this.c.getId());
        FileDownloadUtils.deleteTaskFiles(this.c.getTargetFilePath(), this.c.getTempFilePath());
        this.p = false;
        if (eTag != null && eTag.equals(strFindEtag)) {
            FileDownloadLog.w(this, "the old etag[%s] is the same to the new etag[%s], but the response status code is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!", eTag, strFindEtag, Integer.valueOf(responseCode), Integer.valueOf(id));
            strFindEtag = null;
        }
        this.c.setSoFar(0L);
        this.c.setTotal(0L);
        this.c.setETag(strFindEtag);
        this.c.resetConnectionCount();
        this.g.updateOldEtagOverdue(id, this.c.getETag(), this.c.getSoFar(), this.c.getTotal(), this.c.getConnectionCount());
        throw new c();
    }

    private boolean j() {
        return (!this.p || this.c.getConnectionCount() > 1) && this.q && this.l && !this.r;
    }

    private void k(long j, int i) throws InterruptedException {
        long j2 = j / ((long) i);
        int id = this.c.getId();
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i2 = 0;
        while (i2 < i) {
            long j4 = i2 == i + (-1) ? -1L : (j3 + j2) - 1;
            ConnectionModel connectionModel = new ConnectionModel();
            connectionModel.setId(id);
            connectionModel.setIndex(i2);
            connectionModel.setStartOffset(j3);
            connectionModel.setCurrentOffset(j3);
            connectionModel.setEndOffset(j4);
            arrayList.add(connectionModel);
            this.g.insertConnectionModel(connectionModel);
            j3 += j2;
            i2++;
        }
        this.c.setConnectionCount(i);
        this.g.updateConnectionCount(id, i);
        f(arrayList, j);
    }

    private void l(int i, List<ConnectionModel> list) throws InterruptedException {
        if (i <= 1 || list.size() != i) {
            throw new IllegalArgumentException();
        }
        f(list, this.c.getTotal());
    }

    private void m(long j) throws IllegalAccessException, IOException {
        ConnectionProfile connectionProfileBuildToEndConnectionProfile;
        if (this.q) {
            connectionProfileBuildToEndConnectionProfile = ConnectionProfile.ConnectionProfileBuild.buildToEndConnectionProfile(this.c.getSoFar(), this.c.getSoFar(), j - this.c.getSoFar());
        } else {
            this.c.setSoFar(0L);
            connectionProfileBuildToEndConnectionProfile = ConnectionProfile.ConnectionProfileBuild.buildBeginToEndConnectionProfile(j);
        }
        this.n = new DownloadRunnable.Builder().setId(this.c.getId()).setConnectionIndex(-1).setCallback(this).setUrl(this.c.getUrl()).setEtag(this.c.getETag()).setHeader(this.d).setWifiRequired(this.f).setConnectionModel(connectionProfileBuildToEndConnectionProfile).setPath(this.c.getTempFilePath()).build();
        this.c.setConnectionCount(1);
        this.g.updateConnectionCount(this.c.getId(), 1);
        if (!this.t) {
            this.n.run();
        } else {
            this.c.setStatus((byte) -2);
            this.n.pause();
        }
    }

    private void n() throws IllegalAccessException, c, FileDownloadSecurityException, IOException {
        FileDownloadConnection fileDownloadConnectionC = null;
        try {
            ConnectTask connectTaskA = new ConnectTask.b().c(this.c.getId()).f(this.c.getUrl()).d(this.c.getETag()).e(this.d).b(this.k ? ConnectionProfile.ConnectionProfileBuild.buildTrialConnectionProfileNoRange() : ConnectionProfile.ConnectionProfileBuild.buildTrialConnectionProfile()).a();
            fileDownloadConnectionC = connectTaskA.c();
            h(connectTaskA.getRequestHeader(), connectTaskA, fileDownloadConnectionC);
        } finally {
            if (fileDownloadConnectionC != null) {
                fileDownloadConnectionC.ending();
            }
        }
    }

    public int getId() {
        return this.c.getId();
    }

    public String getTempFilePath() {
        return this.c.getTempFilePath();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public void i(List<ConnectionModel> list) {
        long soFar;
        int connectionCount = this.c.getConnectionCount();
        String tempFilePath = this.c.getTempFilePath();
        String targetFilePath = this.c.getTargetFilePath();
        boolean z = connectionCount > 1;
        if (this.k || ((z && !this.l) || !FileDownloadUtils.isBreakpointAvailable(this.c.getId(), this.c))) {
            soFar = 0;
        } else if (!this.l) {
            soFar = new File(tempFilePath).length();
        } else if (!z) {
            soFar = this.c.getSoFar();
        } else if (connectionCount != list.size()) {
            soFar = 0;
        } else {
            soFar = ConnectionModel.getTotalOffset(list);
        }
        this.c.setSoFar(soFar);
        boolean z2 = soFar > 0;
        this.p = z2;
        if (z2) {
            return;
        }
        this.g.removeConnections(this.c.getId());
        FileDownloadUtils.deleteTaskFiles(targetFilePath, tempFilePath);
    }

    public boolean isAlive() {
        return this.s.get() || this.a.isAlive();
    }

    @Override // com.liulishuo.filedownloader.download.ProcessCallback
    public boolean isRetry(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int code = ((FileDownloadHttpException) exc).getCode();
            if (this.o && code == 416 && !this.i) {
                FileDownloadUtils.deleteTaskFiles(this.c.getTargetFilePath(), this.c.getTempFilePath());
                this.i = true;
                return true;
            }
        }
        return this.j > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // com.liulishuo.filedownloader.download.ProcessCallback
    public void onCompleted(DownloadRunnable downloadRunnable, long j, long j2) {
        if (this.t) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.c.getId()));
                return;
            }
            return;
        }
        int i = downloadRunnable.h;
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.c.getTotal()));
        }
        if (!this.o) {
            synchronized (this.m) {
                this.m.remove(downloadRunnable);
            }
        } else {
            if (j == 0 || j2 == this.c.getTotal()) {
                return;
            }
            FileDownloadLog.e(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.c.getTotal()), Integer.valueOf(this.c.getId()));
        }
    }

    @Override // com.liulishuo.filedownloader.download.ProcessCallback
    public void onError(Exception exc) {
        this.u = true;
        this.v = exc;
        if (this.t) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.c.getId()));
            }
        } else {
            for (DownloadRunnable downloadRunnable : (ArrayList) this.m.clone()) {
                if (downloadRunnable != null) {
                    downloadRunnable.discard();
                }
            }
        }
    }

    @Override // com.liulishuo.filedownloader.download.ProcessCallback
    public void onProgress(long j) {
        if (this.t) {
            return;
        }
        this.a.q(j);
    }

    @Override // com.liulishuo.filedownloader.download.ProcessCallback
    public void onRetry(Exception exc) {
        if (this.t) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.c.getId()));
            }
        } else {
            int i = this.j;
            int i2 = i - 1;
            this.j = i2;
            if (i < 0) {
                FileDownloadLog.e(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i2), Integer.valueOf(this.c.getId()));
            }
            this.a.r(exc, this.j);
        }
    }

    public void pause() {
        this.t = true;
        DownloadRunnable downloadRunnable = this.n;
        if (downloadRunnable != null) {
            downloadRunnable.pause();
        }
        for (DownloadRunnable downloadRunnable2 : (ArrayList) this.m.clone()) {
            if (downloadRunnable2 != null) {
                downloadRunnable2.pause();
            }
        }
    }

    public void pending() {
        i(this.g.findConnectionModel(this.c.getId()));
        this.a.onPending();
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01c1 A[Catch: all -> 0x01f6, TryCatch #11 {all -> 0x01f6, blocks: (B:3:0x0003, B:6:0x0012, B:8:0x001a, B:10:0x001e, B:11:0x0030, B:24:0x008d, B:26:0x0091, B:27:0x0096, B:29:0x009a, B:31:0x009e, B:42:0x00c6, B:44:0x00e2, B:55:0x0100, B:69:0x0136, B:71:0x013a, B:85:0x015f, B:87:0x0163, B:88:0x0167, B:90:0x0170, B:91:0x0174, B:92:0x0178, B:93:0x018b, B:94:0x018c, B:117:0x01bb, B:119:0x01c1, B:120:0x01c6), top: B:156:0x0003, inners: #14, #14, #11 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    /* JADX WARN: Code duplicated, block: B:165:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            Process.setThreadPriority(10);
            if (this.c.getStatus() != 1) {
                if (this.c.getStatus() != -2) {
                    onError(new RuntimeException(FileDownloadUtils.formatString("Task[%d] can't start the download runnable, because its status is %d not %d", Integer.valueOf(this.c.getId()), Byte.valueOf(this.c.getStatus()), (byte) 1)));
                } else if (FileDownloadLog.NEED_LOG) {
                    FileDownloadLog.d(this, "High concurrent cause, start runnable but already paused %d", Integer.valueOf(this.c.getId()));
                }
                this.a.b();
                if (this.t) {
                    this.a.p();
                } else if (this.u) {
                    this.a.n(this.v);
                } else {
                    try {
                        this.a.l();
                    } catch (IOException e) {
                        e = e;
                        this.a.n(e);
                    }
                }
            } else {
                if (!this.t) {
                    this.a.s();
                }
                while (true) {
                    if (this.t) {
                        if (FileDownloadLog.NEED_LOG) {
                            FileDownloadLog.d(this, "High concurrent cause, start runnable but already paused %d", Integer.valueOf(this.c.getId()));
                        }
                        this.a.b();
                        if (this.t) {
                            this.a.p();
                        } else if (this.u) {
                            this.a.n(this.v);
                        } else {
                            try {
                                this.a.l();
                            } catch (IOException e2) {
                                e = e2;
                                this.a.n(e);
                            }
                        }
                    } else {
                        try {
                            c();
                            n();
                            b();
                            List<ConnectionModel> listFindConnectionModel = this.g.findConnectionModel(this.c.getId());
                            i(listFindConnectionModel);
                            if (this.t) {
                                this.c.setStatus((byte) -2);
                                this.a.b();
                                if (this.t) {
                                    this.a.p();
                                } else if (this.u) {
                                    this.a.n(this.v);
                                } else {
                                    try {
                                        this.a.l();
                                    } catch (IOException e3) {
                                        e = e3;
                                        this.a.n(e);
                                    }
                                }
                            } else {
                                long total = this.c.getTotal();
                                g(total, this.c.getTempFilePath());
                                int iA = a(total);
                                if (iA <= 0) {
                                    throw new IllegalAccessException(FileDownloadUtils.formatString("invalid connection count %d, the connection count must be larger than 0", Integer.valueOf(iA)));
                                }
                                if (total == 0) {
                                    this.a.b();
                                    if (this.t) {
                                        this.a.p();
                                    } else if (this.u) {
                                        this.a.n(this.v);
                                    } else {
                                        try {
                                            this.a.l();
                                        } catch (IOException e4) {
                                            e = e4;
                                            this.a.n(e);
                                        }
                                    }
                                } else {
                                    if (!this.t) {
                                        boolean z = iA == 1;
                                        this.o = z;
                                        if (z) {
                                            m(total);
                                        } else {
                                            this.a.o();
                                            if (this.p) {
                                                l(iA, listFindConnectionModel);
                                            } else {
                                                k(total, iA);
                                            }
                                        }
                                        this.a.b();
                                        if (this.t) {
                                            this.a.p();
                                        } else if (this.u) {
                                            this.a.n(this.v);
                                        } else {
                                            try {
                                                this.a.l();
                                            } catch (IOException e5) {
                                                this.a.n(e5);
                                            }
                                        }
                                        this.s.set(false);
                                        return;
                                    }
                                    this.c.setStatus((byte) -2);
                                    this.a.b();
                                    if (this.t) {
                                        this.a.p();
                                    } else if (this.u) {
                                        this.a.n(this.v);
                                    } else {
                                        try {
                                            this.a.l();
                                        } catch (IOException e6) {
                                            e = e6;
                                            this.a.n(e);
                                        }
                                    }
                                }
                            }
                        } catch (b unused) {
                            this.a.b();
                            if (!this.t) {
                                if (this.u) {
                                    this.a.n(this.v);
                                } else {
                                    try {
                                        this.a.l();
                                    } catch (IOException e7) {
                                        e = e7;
                                        this.a.n(e);
                                    }
                                }
                            }
                        } catch (c unused2) {
                            this.c.setStatus((byte) 5);
                        } catch (FileDownloadGiveUpRetryException e8) {
                            e = e8;
                            if (isRetry(e)) {
                                onRetry(e);
                            } else {
                                onError(e);
                            }
                        } catch (FileDownloadSecurityException e9) {
                            e = e9;
                            if (isRetry(e)) {
                                onRetry(e);
                            } else {
                                onError(e);
                            }
                        } catch (IOException e10) {
                            e = e10;
                            if (isRetry(e)) {
                                onRetry(e);
                            } else {
                                onError(e);
                            }
                        } catch (IllegalAccessException e11) {
                            e = e11;
                            if (isRetry(e)) {
                                onRetry(e);
                            } else {
                                onError(e);
                            }
                        } catch (IllegalArgumentException e12) {
                            e = e12;
                            if (isRetry(e)) {
                                onRetry(e);
                            } else {
                                onError(e);
                            }
                        } catch (InterruptedException e13) {
                            e = e13;
                            if (isRetry(e)) {
                                onRetry(e);
                            } else {
                                onError(e);
                            }
                        }
                    }
                }
            }
            this.s.set(false);
        } catch (Throwable th) {
            this.a.b();
            if (this.t) {
                this.a.p();
            } else if (this.u) {
                this.a.n(this.v);
            } else {
                try {
                    this.a.l();
                } catch (IOException e14) {
                    this.a.n(e14);
                }
            }
            this.s.set(false);
            throw th;
        }
    }

    @Override // com.liulishuo.filedownloader.download.ProcessCallback
    public void syncProgressFromCache() {
        this.g.updateProgress(this.c.getId(), this.c.getSoFar());
    }

    private DownloadLaunchRunnable(FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, IThreadPoolMonitor iThreadPoolMonitor, int i, int i2, boolean z, boolean z2, int i3) {
        this.b = 5;
        this.k = false;
        this.m = new ArrayList<>(5);
        this.x = 0L;
        this.y = 0L;
        this.z = 0L;
        this.A = 0L;
        this.s = new AtomicBoolean(true);
        this.t = false;
        this.i = false;
        this.c = fileDownloadModel;
        this.d = fileDownloadHeader;
        this.e = z;
        this.f = z2;
        this.g = CustomComponentHolder.getImpl().getDatabaseInstance();
        this.l = CustomComponentHolder.getImpl().isSupportSeek();
        this.h = iThreadPoolMonitor;
        this.j = i3;
        this.a = new DownloadStatusCallback(fileDownloadModel, i3, i, i2);
    }

    private DownloadLaunchRunnable(DownloadStatusCallback downloadStatusCallback, FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, IThreadPoolMonitor iThreadPoolMonitor, int i, int i2, boolean z, boolean z2, int i3) {
        this.b = 5;
        this.k = false;
        this.m = new ArrayList<>(5);
        this.x = 0L;
        this.y = 0L;
        this.z = 0L;
        this.A = 0L;
        this.s = new AtomicBoolean(true);
        this.t = false;
        this.i = false;
        this.c = fileDownloadModel;
        this.d = fileDownloadHeader;
        this.e = z;
        this.f = z2;
        this.g = CustomComponentHolder.getImpl().getDatabaseInstance();
        this.l = CustomComponentHolder.getImpl().isSupportSeek();
        this.h = iThreadPoolMonitor;
        this.j = i3;
        this.a = downloadStatusCallback;
    }
}
