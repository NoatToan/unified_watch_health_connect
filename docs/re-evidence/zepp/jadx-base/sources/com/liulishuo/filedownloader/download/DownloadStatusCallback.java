package com.liulishuo.filedownloader.download;

import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.liulishuo.filedownloader.database.FileDownloadDatabase;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.message.MessageSnapshotFlow;
import com.liulishuo.filedownloader.message.MessageSnapshotTaker;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.services.FileDownloadBroadcastHandler;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadProperties;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadStatusCallback implements Handler.Callback {
    private static final int q = 1;
    private static final int r = 5;
    private static final int s = -1;
    private static final String t = "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.";
    private final FileDownloadModel a;
    private final ProcessParams c;
    private final int d;
    private final int e;
    private final int f;
    private long g;
    private Handler h;
    private HandlerThread i;
    private volatile Thread k;
    private volatile boolean j = false;
    private volatile long l = 0;
    private final AtomicLong m = new AtomicLong();
    private final AtomicBoolean n = new AtomicBoolean(false);
    private final AtomicBoolean o = new AtomicBoolean(false);
    private final AtomicBoolean p = new AtomicBoolean(true);
    private final FileDownloadDatabase b = CustomComponentHolder.getImpl().getDatabaseInstance();

    public static class ProcessParams {
        private boolean a;
        private Exception b;
        private int c;

        public void a(Exception exc) {
            this.b = exc;
        }

        public void b(boolean z) {
            this.a = z;
        }

        public void c(int i) {
            this.c = i;
        }

        public Exception getException() {
            return this.b;
        }

        public int getRetryingTimes() {
            return this.c;
        }

        public boolean isResuming() {
            return this.a;
        }
    }

    public DownloadStatusCallback(FileDownloadModel fileDownloadModel, int i, int i2, int i3) {
        this.a = fileDownloadModel;
        this.e = i2 < 5 ? 5 : i2;
        this.f = i3;
        this.c = new ProcessParams();
        this.d = i;
    }

    private static long a(long j, long j2) {
        if (j2 <= 0) {
            return -1L;
        }
        if (j == -1) {
            return 1L;
        }
        long j3 = j / j2;
        if (j3 <= 0) {
            return 1L;
        }
        return j3;
    }

    private Exception c(Exception exc) {
        long length;
        String tempFilePath = this.a.getTempFilePath();
        if ((!this.a.isChunked() && !FileDownloadProperties.getImpl().fileNonPreAllocation) || !(exc instanceof IOException) || !new File(tempFilePath).exists()) {
            return exc;
        }
        long freeSpaceBytes = FileDownloadUtils.getFreeSpaceBytes(tempFilePath);
        if (freeSpaceBytes > 4096) {
            return exc;
        }
        File file = new File(tempFilePath);
        if (file.exists()) {
            length = file.length();
        } else {
            FileDownloadLog.e(this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
            length = 0;
        }
        return Build.VERSION.SDK_INT >= 9 ? new FileDownloadOutOfSpaceException(freeSpaceBytes, 4096L, length, exc) : new FileDownloadOutOfSpaceException(freeSpaceBytes, 4096L, length);
    }

    private void d() throws Throwable {
        u();
        this.a.setStatus((byte) -3);
        this.b.updateCompleted(this.a.getId(), this.a.getTotal());
        this.b.removeConnections(this.a.getId());
        t((byte) -3);
        if (FileDownloadProperties.getImpl().broadcastCompleted) {
            FileDownloadBroadcastHandler.sendCompletedBroadcast(this.a);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void e(Exception exc) {
        SQLiteFullException sQLiteFullException;
        Exception excC = c(exc);
        if (excC instanceof SQLiteFullException) {
            i((SQLiteFullException) excC);
            sQLiteFullException = excC;
        } else {
            try {
                this.a.setStatus((byte) -1);
                this.a.setErrMsg(exc.toString());
                this.b.updateError(this.a.getId(), excC, this.a.getSoFar());
                sQLiteFullException = excC;
            } catch (SQLiteFullException e) {
                SQLiteFullException sQLiteFullException2 = e;
                i(sQLiteFullException2);
                sQLiteFullException = sQLiteFullException2;
            }
        }
        this.c.a(sQLiteFullException);
        t((byte) -1);
    }

    private void f() {
        this.a.setStatus((byte) -2);
        this.b.updatePause(this.a.getId(), this.a.getSoFar());
        t((byte) -2);
    }

    private void g() {
        if (this.a.getSoFar() == this.a.getTotal()) {
            this.b.updateProgress(this.a.getId(), this.a.getSoFar());
            return;
        }
        if (this.o.compareAndSet(true, false)) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.i(this, "handleProgress update model's status with progress", new Object[0]);
            }
            this.a.setStatus((byte) 3);
        }
        if (this.n.compareAndSet(true, false)) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.i(this, "handleProgress notify user progress status", new Object[0]);
            }
            t((byte) 3);
        }
    }

    private void h(Exception exc, int i) {
        Exception excC = c(exc);
        this.c.a(excC);
        this.c.c(this.d - i);
        this.a.setStatus((byte) 5);
        this.a.setErrMsg(excC.toString());
        this.b.updateRetry(this.a.getId(), excC);
        t((byte) 5);
    }

    private void i(SQLiteFullException sQLiteFullException) {
        int id = this.a.getId();
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(id), sQLiteFullException.toString());
        }
        this.a.setErrMsg(sQLiteFullException.toString());
        this.a.setStatus((byte) -1);
        this.b.remove(id);
        this.b.removeConnections(id);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    private void j(long j) {
        boolean z;
        if (this.p.compareAndSet(true, false)) {
            z = true;
        } else {
            long j2 = j - this.l;
            if (this.g == -1 || this.m.get() < this.g || j2 < this.e) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z && this.n.compareAndSet(false, true)) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.i(this, "inspectNeedCallbackToUser need callback to user", new Object[0]);
            }
            this.l = j;
            this.m.set(0L);
        }
    }

    private boolean k() {
        if (this.a.isChunked()) {
            FileDownloadModel fileDownloadModel = this.a;
            fileDownloadModel.setTotal(fileDownloadModel.getSoFar());
        } else if (this.a.getSoFar() != this.a.getTotal()) {
            n(new FileDownloadGiveUpRetryException(FileDownloadUtils.formatString("sofar[%d] not equal total[%d]", Long.valueOf(this.a.getSoFar()), Long.valueOf(this.a.getTotal()))));
            return true;
        }
        return false;
    }

    private void t(byte b) {
        if (b != -2) {
            MessageSnapshotFlow.getImpl().inflow(MessageSnapshotTaker.take(b, this.a, this.c));
        } else if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.a.getId()));
        }
    }

    private void u() throws Throwable {
        boolean z;
        String tempFilePath = this.a.getTempFilePath();
        String targetFilePath = this.a.getTargetFilePath();
        File file = new File(tempFilePath);
        try {
            File file2 = new File(targetFilePath);
            if (file2.exists()) {
                long length = file2.length();
                if (!file2.delete()) {
                    throw new IOException(FileDownloadUtils.formatString("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", targetFilePath, Long.valueOf(length)));
                }
                FileDownloadLog.w(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", targetFilePath, Long.valueOf(length), Long.valueOf(file.length()));
            }
            z = !file.renameTo(file2);
            if (!z) {
                if (z && file.exists() && !file.delete()) {
                    FileDownloadLog.w(this, "delete the temp file(%s) failed, on completed downloading.", tempFilePath);
                    return;
                }
                return;
            }
            try {
                throw new IOException(FileDownloadUtils.formatString("Can't rename the  temp downloaded file(%s) to the target file(%s)", tempFilePath, targetFilePath));
            } catch (Throwable th) {
                th = th;
                if (z && file.exists() && !file.delete()) {
                    FileDownloadLog.w(this, "delete the temp file(%s) failed, on completed downloading.", tempFilePath);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
    }

    private synchronized void v(Message message) {
        if (!this.i.isAlive()) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, t, Integer.valueOf(message.what));
            }
            return;
        }
        try {
            this.h.sendMessage(message);
        } catch (IllegalStateException e) {
            if (this.i.isAlive()) {
                throw e;
            }
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, t, Integer.valueOf(message.what));
            }
        }
    }

    public void b() {
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.i.quit();
            this.k = Thread.currentThread();
            while (this.j) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.k = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        this.j = true;
        int i = message.what;
        try {
            if (i != 3) {
                if (i == 5) {
                    h((Exception) message.obj, message.arg1);
                }
                this.j = false;
                if (this.k != null) {
                    LockSupport.unpark(this.k);
                }
                return true;
            }
            g();
            this.j = false;
            if (this.k != null) {
                LockSupport.unpark(this.k);
            }
            return true;
        } catch (Throwable th) {
            this.j = false;
            if (this.k != null) {
                LockSupport.unpark(this.k);
            }
            throw th;
        }
    }

    public boolean isAlive() {
        HandlerThread handlerThread = this.i;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void l() throws Throwable {
        if (k()) {
            return;
        }
        d();
    }

    public void m(boolean z, long j, String str, String str2) throws IllegalArgumentException {
        String eTag = this.a.getETag();
        if (eTag != null && !eTag.equals(str)) {
            throw new IllegalArgumentException(FileDownloadUtils.formatString("callback onConnected must with precondition succeed, but the etag is changes(%s != %s)", str, eTag));
        }
        this.c.b(z);
        this.a.setStatus((byte) 2);
        this.a.setTotal(j);
        this.a.setETag(str);
        this.a.setFilename(str2);
        this.b.updateConnected(this.a.getId(), j, str, str2);
        t((byte) 2);
        this.g = a(j, this.f);
        this.o.compareAndSet(false, true);
    }

    public void n(Exception exc) {
        e(exc);
    }

    public void o() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback");
        this.i = handlerThread;
        handlerThread.start();
        this.h = new Handler(this.i.getLooper(), this);
    }

    public void onPending() {
        this.a.setStatus((byte) 1);
        this.b.updatePending(this.a.getId());
        t((byte) 1);
    }

    public void p() {
        f();
    }

    public void q(long j) {
        this.m.addAndGet(j);
        this.a.increaseSoFar(j);
        j(SystemClock.elapsedRealtime());
        if (this.h == null) {
            g();
        } else if (this.n.get()) {
            v(this.h.obtainMessage(3));
        }
    }

    public void r(Exception exc, int i) {
        this.m.set(0L);
        Handler handler = this.h;
        if (handler == null) {
            h(exc, i);
        } else {
            v(handler.obtainMessage(5, i, 0, exc));
        }
    }

    public void s() {
        this.a.setStatus((byte) 6);
        t((byte) 6);
        this.b.onTaskStart(this.a.getId());
    }
}
