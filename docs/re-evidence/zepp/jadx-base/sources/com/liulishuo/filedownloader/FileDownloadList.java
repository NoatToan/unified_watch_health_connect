package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshotTaker;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadList {
    private final ArrayList<BaseDownloadTask.IRunningTask> a;

    public static final class b {
        private static final FileDownloadList a = new FileDownloadList();

        private b() {
        }
    }

    public static FileDownloadList getImpl() {
        return b.a;
    }

    public void a(BaseDownloadTask.IRunningTask iRunningTask) {
        if (!iRunningTask.getOrigin().isAttached()) {
            iRunningTask.setAttachKeyDefault();
        }
        if (iRunningTask.getMessageHandler().getMessenger().n()) {
            b(iRunningTask);
        }
    }

    public void b(BaseDownloadTask.IRunningTask iRunningTask) {
        if (iRunningTask.isMarkedAdded2List()) {
            return;
        }
        synchronized (this.a) {
            if (this.a.contains(iRunningTask)) {
                FileDownloadLog.w(this, "already has %s", iRunningTask);
            } else {
                iRunningTask.markAdded2List();
                this.a.add(iRunningTask);
                if (FileDownloadLog.NEED_LOG) {
                    FileDownloadLog.v(this, "add list in all %s %d %d", iRunningTask, Byte.valueOf(iRunningTask.getOrigin().getStatus()), Integer.valueOf(this.a.size()));
                }
            }
        }
    }

    public List<BaseDownloadTask.IRunningTask> c(int i, FileDownloadListener fileDownloadListener) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            for (BaseDownloadTask.IRunningTask iRunningTask : this.a) {
                if (iRunningTask.getOrigin().getListener() == fileDownloadListener && !iRunningTask.getOrigin().isAttached()) {
                    iRunningTask.setAttachKeyByQueue(i);
                    arrayList.add(iRunningTask);
                }
            }
        }
        return arrayList;
    }

    public List<BaseDownloadTask.IRunningTask> d(FileDownloadListener fileDownloadListener) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            for (BaseDownloadTask.IRunningTask iRunningTask : this.a) {
                if (iRunningTask.is(fileDownloadListener)) {
                    arrayList.add(iRunningTask);
                }
            }
        }
        return arrayList;
    }

    public BaseDownloadTask.IRunningTask[] e() {
        BaseDownloadTask.IRunningTask[] iRunningTaskArr;
        synchronized (this.a) {
            iRunningTaskArr = (BaseDownloadTask.IRunningTask[]) this.a.toArray(new BaseDownloadTask.IRunningTask[this.a.size()]);
        }
        return iRunningTaskArr;
    }

    public int f(int i) {
        int i2;
        synchronized (this.a) {
            Iterator<BaseDownloadTask.IRunningTask> it2 = this.a.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (it2.next().is(i)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    public void g(List<BaseDownloadTask.IRunningTask> list) {
        synchronized (this.a) {
            for (BaseDownloadTask.IRunningTask iRunningTask : this.a) {
                if (!list.contains(iRunningTask)) {
                    list.add(iRunningTask);
                }
            }
            this.a.clear();
        }
    }

    public BaseDownloadTask.IRunningTask get(int i) {
        synchronized (this.a) {
            for (BaseDownloadTask.IRunningTask iRunningTask : this.a) {
                if (iRunningTask.is(i)) {
                    return iRunningTask;
                }
            }
            return null;
        }
    }

    public List<BaseDownloadTask.IRunningTask> h(int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            for (BaseDownloadTask.IRunningTask iRunningTask : this.a) {
                if (iRunningTask.is(i) && !iRunningTask.isOver()) {
                    arrayList.add(iRunningTask);
                }
            }
        }
        return arrayList;
    }

    public List<BaseDownloadTask.IRunningTask> i(int i) {
        byte status;
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            for (BaseDownloadTask.IRunningTask iRunningTask : this.a) {
                if (iRunningTask.is(i) && !iRunningTask.isOver() && (status = iRunningTask.getOrigin().getStatus()) != 0 && status != 10) {
                    arrayList.add(iRunningTask);
                }
            }
        }
        return arrayList;
    }

    public boolean j() {
        return this.a.isEmpty();
    }

    public boolean k(BaseDownloadTask.IRunningTask iRunningTask) {
        return this.a.isEmpty() || !this.a.contains(iRunningTask);
    }

    public int l() {
        return this.a.size();
    }

    public boolean remove(BaseDownloadTask.IRunningTask iRunningTask, MessageSnapshot messageSnapshot) {
        boolean zRemove;
        byte status = messageSnapshot.getStatus();
        synchronized (this.a) {
            zRemove = this.a.remove(iRunningTask);
            if (zRemove && this.a.size() == 0 && FileDownloadServiceProxy.getImpl().isRunServiceForeground()) {
                FileDownloader.getImpl().stopForeground(true);
            }
        }
        if (FileDownloadLog.NEED_LOG && this.a.size() == 0) {
            FileDownloadLog.v(this, "remove %s left %d %d", iRunningTask, Byte.valueOf(status), Integer.valueOf(this.a.size()));
        }
        if (zRemove) {
            d messenger = iRunningTask.getMessageHandler().getMessenger();
            if (status == -4) {
                messenger.o(messageSnapshot);
            } else if (status == -3) {
                messenger.p(MessageSnapshotTaker.takeBlockCompleted(messageSnapshot));
            } else if (status == -2) {
                messenger.c(messageSnapshot);
            } else if (status == -1) {
                messenger.j(messageSnapshot);
            }
        } else {
            FileDownloadLog.e(this, "remove error, not exist: %s %d", iRunningTask, Byte.valueOf(status));
        }
        return zRemove;
    }

    private FileDownloadList() {
        this.a = new ArrayList<>();
    }
}
