package com.liulishuo.filedownloader.services;

import android.text.TextUtils;
import com.liulishuo.filedownloader.IThreadPoolMonitor;
import com.liulishuo.filedownloader.PauseAllMarker;
import com.liulishuo.filedownloader.database.FileDownloadDatabase;
import com.liulishuo.filedownloader.download.CustomComponentHolder;
import com.liulishuo.filedownloader.download.DownloadLaunchRunnable;
import com.liulishuo.filedownloader.model.ConnectionModel;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.model.FileDownloadStatus;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class a implements IThreadPoolMonitor {
    private final FileDownloadDatabase a;
    private final b b;

    public a() {
        CustomComponentHolder impl = CustomComponentHolder.getImpl();
        this.a = impl.getDatabaseInstance();
        this.b = new b(impl.getMaxNetworkThreadCount());
    }

    public void a() {
        this.a.clear();
    }

    public boolean b(int i) {
        if (i == 0) {
            FileDownloadLog.w(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i));
            return false;
        }
        if (f(i)) {
            FileDownloadLog.w(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i));
            return false;
        }
        this.a.remove(i);
        this.a.removeConnections(i);
        return true;
    }

    public long c(int i) {
        FileDownloadModel fileDownloadModelFind = this.a.find(i);
        if (fileDownloadModelFind == null) {
            return 0L;
        }
        int connectionCount = fileDownloadModelFind.getConnectionCount();
        if (connectionCount <= 1) {
            return fileDownloadModelFind.getSoFar();
        }
        List<ConnectionModel> listFindConnectionModel = this.a.findConnectionModel(i);
        if (listFindConnectionModel == null || listFindConnectionModel.size() != connectionCount) {
            return 0L;
        }
        return ConnectionModel.getTotalOffset(listFindConnectionModel);
    }

    public byte d(int i) {
        FileDownloadModel fileDownloadModelFind = this.a.find(i);
        if (fileDownloadModelFind == null) {
            return (byte) 0;
        }
        return fileDownloadModelFind.getStatus();
    }

    public long e(int i) {
        FileDownloadModel fileDownloadModelFind = this.a.find(i);
        if (fileDownloadModelFind == null) {
            return 0L;
        }
        return fileDownloadModelFind.getTotal();
    }

    public boolean f(int i) {
        return isDownloading(this.a.find(i));
    }

    @Override // com.liulishuo.filedownloader.IThreadPoolMonitor
    public int findRunningTaskIdBySameTempPath(String str, int i) {
        return this.b.e(str, i);
    }

    public boolean g(String str, String str2) {
        return f(FileDownloadUtils.generateId(str, str2));
    }

    public boolean h() {
        return this.b.b() <= 0;
    }

    public boolean i(int i) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "request pause the task %d", Integer.valueOf(i));
        }
        FileDownloadModel fileDownloadModelFind = this.a.find(i);
        if (fileDownloadModelFind == null) {
            return false;
        }
        fileDownloadModelFind.setStatus((byte) -2);
        this.b.a(i);
        return true;
    }

    @Override // com.liulishuo.filedownloader.IThreadPoolMonitor
    public boolean isDownloading(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            return false;
        }
        boolean zG = this.b.g(fileDownloadModel.getId());
        if (FileDownloadStatus.isOver(fileDownloadModel.getStatus())) {
            if (!zG) {
                return false;
            }
        } else if (!zG) {
            FileDownloadLog.e(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(fileDownloadModel.getId()), Byte.valueOf(fileDownloadModel.getStatus()));
            return false;
        }
        return true;
    }

    public void j() {
        List<Integer> listF = this.b.f();
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "pause all tasks %d", Integer.valueOf(listF.size()));
        }
        Iterator<Integer> it2 = listF.iterator();
        while (it2.hasNext()) {
            i(it2.next().intValue());
        }
    }

    public synchronized boolean k(int i) {
        return this.b.h(i);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0185 A[Catch: all -> 0x01d0, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0022, B:10:0x0034, B:12:0x0044, B:14:0x004e, B:16:0x0052, B:17:0x0065, B:21:0x0072, B:23:0x0078, B:25:0x007c, B:29:0x008d, B:31:0x0096, B:33:0x009f, B:35:0x00a3, B:40:0x00b6, B:43:0x00bf, B:45:0x00c8, B:47:0x00d7, B:49:0x00db, B:51:0x00ed, B:55:0x00fb, B:57:0x0102, B:59:0x0109, B:61:0x010f, B:63:0x0116, B:65:0x011c, B:67:0x0122, B:69:0x013c, B:70:0x0140, B:72:0x0146, B:81:0x0185, B:82:0x018a, B:73:0x0155, B:75:0x015f, B:77:0x0165, B:78:0x016b, B:44:0x00c4, B:30:0x0092), top: B:88:0x0009 }] */
    public synchronized void l(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        FileDownloadModel fileDownloadModel;
        List<ConnectionModel> listFindConnectionModel;
        boolean z4 = false;
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "request start the task with url(%s) path(%s) isDirectory(%B)", str, str2, Boolean.valueOf(z));
        }
        PauseAllMarker.clearMarker();
        int iGenerateId = FileDownloadUtils.generateId(str, str2, z);
        FileDownloadModel fileDownloadModelFind = this.a.find(iGenerateId);
        if (z || fileDownloadModelFind != null) {
            fileDownloadModel = fileDownloadModelFind;
            listFindConnectionModel = null;
        } else {
            int iGenerateId2 = FileDownloadUtils.generateId(str, FileDownloadUtils.getParent(str2), true);
            FileDownloadModel fileDownloadModelFind2 = this.a.find(iGenerateId2);
            if (fileDownloadModelFind2 == null || !str2.equals(fileDownloadModelFind2.getTargetFilePath())) {
                listFindConnectionModel = null;
            } else {
                if (FileDownloadLog.NEED_LOG) {
                    FileDownloadLog.d(this, "task[%d] find model by dirCaseId[%d]", Integer.valueOf(iGenerateId), Integer.valueOf(iGenerateId2));
                }
                listFindConnectionModel = this.a.findConnectionModel(iGenerateId2);
            }
            fileDownloadModel = fileDownloadModelFind2;
        }
        if (FileDownloadHelper.inspectAndInflowDownloading(iGenerateId, fileDownloadModel, this, true)) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "has already started download %d", Integer.valueOf(iGenerateId));
            }
            return;
        }
        String targetFilePath = fileDownloadModel != null ? fileDownloadModel.getTargetFilePath() : FileDownloadUtils.getTargetFilePath(str2, z, null);
        if (FileDownloadHelper.inspectAndInflowDownloaded(iGenerateId, targetFilePath, z2, true)) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "has already completed downloading %d", Integer.valueOf(iGenerateId));
            }
            return;
        }
        if (FileDownloadHelper.inspectAndInflowConflictPath(iGenerateId, fileDownloadModel != null ? fileDownloadModel.getSoFar() : 0L, fileDownloadModel != null ? fileDownloadModel.getTempFilePath() : FileDownloadUtils.getTempPath(targetFilePath), targetFilePath, this)) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "there is an another task with the same target-file-path %d %s", Integer.valueOf(iGenerateId), targetFilePath);
            }
            if (fileDownloadModel != null) {
                this.a.remove(iGenerateId);
                this.a.removeConnections(iGenerateId);
            }
            return;
        }
        if (fileDownloadModel == null || !(fileDownloadModel.getStatus() == -2 || fileDownloadModel.getStatus() == -1 || fileDownloadModel.getStatus() == 1 || fileDownloadModel.getStatus() == 6 || fileDownloadModel.getStatus() == 2)) {
            if (fileDownloadModel == null) {
                fileDownloadModel = new FileDownloadModel();
            }
            fileDownloadModel.setUrl(str);
            fileDownloadModel.setPath(str2, z);
            fileDownloadModel.setId(iGenerateId);
            fileDownloadModel.setSoFar(0L);
            fileDownloadModel.setTotal(0L);
            fileDownloadModel.setStatus((byte) 1);
            fileDownloadModel.setConnectionCount(1);
        } else {
            if (fileDownloadModel.getId() == iGenerateId) {
                if (!TextUtils.equals(str, fileDownloadModel.getUrl())) {
                    fileDownloadModel.setUrl(str);
                }
                if (z4) {
                    this.a.update(fileDownloadModel);
                }
                this.b.c(new DownloadLaunchRunnable.Builder().setModel(fileDownloadModel).setHeader(fileDownloadHeader).setThreadPoolMonitor(this).setMinIntervalMillis(Integer.valueOf(i2)).setCallbackProgressMaxCount(Integer.valueOf(i)).setForceReDownload(Boolean.valueOf(z2)).setWifiRequired(Boolean.valueOf(z3)).setMaxRetryTimes(Integer.valueOf(i3)).build());
            }
            this.a.remove(fileDownloadModel.getId());
            this.a.removeConnections(fileDownloadModel.getId());
            fileDownloadModel.setId(iGenerateId);
            fileDownloadModel.setPath(str2, z);
            if (listFindConnectionModel != null) {
                for (ConnectionModel connectionModel : listFindConnectionModel) {
                    connectionModel.setId(iGenerateId);
                    this.a.insertConnectionModel(connectionModel);
                }
            }
        }
        z4 = true;
        if (z4) {
            this.a.update(fileDownloadModel);
        }
        this.b.c(new DownloadLaunchRunnable.Builder().setModel(fileDownloadModel).setHeader(fileDownloadHeader).setThreadPoolMonitor(this).setMinIntervalMillis(Integer.valueOf(i2)).setCallbackProgressMaxCount(Integer.valueOf(i)).setForceReDownload(Boolean.valueOf(z2)).setWifiRequired(Boolean.valueOf(z3)).setMaxRetryTimes(Integer.valueOf(i3)).build());
    }
}
