package com.liulishuo.filedownloader.database;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.liulishuo.filedownloader.model.ConnectionModel;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadProperties;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes18.dex */
public class RemitDatabase implements FileDownloadDatabase {
    private static final int h = 0;
    private Handler c;
    private volatile Thread g;
    private final List<Integer> e = new ArrayList();
    private AtomicInteger f = new AtomicInteger();
    private final NoDatabaseImpl a = new NoDatabaseImpl();
    private final SqliteDatabaseImpl b = new SqliteDatabaseImpl();
    private final long d = FileDownloadProperties.getImpl().downloadMinProgressTime;

    public static class Maker implements FileDownloadHelper.DatabaseCustomMaker {
        @Override // com.liulishuo.filedownloader.util.FileDownloadHelper.DatabaseCustomMaker
        public FileDownloadDatabase customMake() {
            return new RemitDatabase();
        }
    }

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                if (RemitDatabase.this.g != null) {
                    LockSupport.unpark(RemitDatabase.this.g);
                    RemitDatabase.this.g = null;
                }
                return false;
            }
            try {
                RemitDatabase.this.f.set(i);
                RemitDatabase.this.h(i);
                RemitDatabase.this.e.add(Integer.valueOf(i));
                return false;
            } finally {
                RemitDatabase.this.f.set(0);
                if (RemitDatabase.this.g != null) {
                    LockSupport.unpark(RemitDatabase.this.g);
                    RemitDatabase.this.g = null;
                }
            }
        }
    }

    public RemitDatabase() {
        HandlerThread handlerThread = new HandlerThread(FileDownloadUtils.getThreadPoolName("RemitHandoverToDB"));
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper(), new a());
    }

    private void f(int i) {
        this.c.removeMessages(i);
        if (this.f.get() != i) {
            h(i);
            return;
        }
        this.g = Thread.currentThread();
        this.c.sendEmptyMessage(0);
        LockSupport.park();
    }

    private boolean g(int i) {
        return !this.e.contains(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "sync cache to db %d", Integer.valueOf(i));
        }
        this.b.update(this.a.find(i));
        List<ConnectionModel> listFindConnectionModel = this.a.findConnectionModel(i);
        this.b.removeConnections(i);
        Iterator<ConnectionModel> it2 = listFindConnectionModel.iterator();
        while (it2.hasNext()) {
            this.b.insertConnectionModel(it2.next());
        }
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void clear() {
        this.a.clear();
        this.b.clear();
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public FileDownloadModel find(int i) {
        return this.a.find(i);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public List<ConnectionModel> findConnectionModel(int i) {
        return this.a.findConnectionModel(i);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void insert(FileDownloadModel fileDownloadModel) {
        this.a.insert(fileDownloadModel);
        if (g(fileDownloadModel.getId())) {
            return;
        }
        this.b.insert(fileDownloadModel);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void insertConnectionModel(ConnectionModel connectionModel) {
        this.a.insertConnectionModel(connectionModel);
        if (g(connectionModel.getId())) {
            return;
        }
        this.b.insertConnectionModel(connectionModel);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public FileDownloadDatabase.Maintainer maintainer() {
        SqliteDatabaseImpl sqliteDatabaseImpl = this.b;
        NoDatabaseImpl noDatabaseImpl = this.a;
        return sqliteDatabaseImpl.maintainer(noDatabaseImpl.a, noDatabaseImpl.b);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void onTaskStart(int i) {
        this.c.sendEmptyMessageDelayed(i, this.d);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public boolean remove(int i) {
        this.b.remove(i);
        return this.a.remove(i);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void removeConnections(int i) {
        this.a.removeConnections(i);
        if (g(i)) {
            return;
        }
        this.b.removeConnections(i);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void update(FileDownloadModel fileDownloadModel) {
        this.a.update(fileDownloadModel);
        if (g(fileDownloadModel.getId())) {
            return;
        }
        this.b.update(fileDownloadModel);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateCompleted(int i, long j) {
        this.a.updateCompleted(i, j);
        if (g(i)) {
            this.c.removeMessages(i);
            if (this.f.get() == i) {
                this.g = Thread.currentThread();
                this.c.sendEmptyMessage(0);
                LockSupport.park();
                this.b.updateCompleted(i, j);
            }
        } else {
            this.b.updateCompleted(i, j);
        }
        this.e.remove(Integer.valueOf(i));
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateConnected(int i, long j, String str, String str2) {
        this.a.updateConnected(i, j, str, str2);
        if (g(i)) {
            return;
        }
        this.b.updateConnected(i, j, str, str2);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateConnectionCount(int i, int i2) {
        this.a.updateConnectionCount(i, i2);
        if (g(i)) {
            return;
        }
        this.b.updateConnectionCount(i, i2);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateConnectionModel(int i, int i2, long j) {
        this.a.updateConnectionModel(i, i2, j);
        if (g(i)) {
            return;
        }
        this.b.updateConnectionModel(i, i2, j);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateError(int i, Throwable th, long j) {
        this.a.updateError(i, th, j);
        if (g(i)) {
            f(i);
        }
        this.b.updateError(i, th, j);
        this.e.remove(Integer.valueOf(i));
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateOldEtagOverdue(int i, String str, long j, long j2, int i2) {
        this.a.updateOldEtagOverdue(i, str, j, j2, i2);
        if (g(i)) {
            return;
        }
        this.b.updateOldEtagOverdue(i, str, j, j2, i2);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updatePause(int i, long j) {
        this.a.updatePause(i, j);
        if (g(i)) {
            f(i);
        }
        this.b.updatePause(i, j);
        this.e.remove(Integer.valueOf(i));
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updatePending(int i) {
        this.a.updatePending(i);
        if (g(i)) {
            return;
        }
        this.b.updatePending(i);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateProgress(int i, long j) {
        this.a.updateProgress(i, j);
        if (g(i)) {
            return;
        }
        this.b.updateProgress(i, j);
    }

    @Override // com.liulishuo.filedownloader.database.FileDownloadDatabase
    public void updateRetry(int i, Throwable th) {
        this.a.updateRetry(i, th);
        if (g(i)) {
            return;
        }
        this.b.updateRetry(i, th);
    }
}
