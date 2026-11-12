package com.liulishuo.filedownloader.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.liulishuo.filedownloader.BaseDownloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadSerialQueue {
    public static final int ID_INVALID = 0;
    private static final int i = 1;
    private final HandlerThread d;
    private final Handler e;
    public volatile BaseDownloadTask f;
    public final b g;
    private final Object a = new Object();
    private final BlockingQueue<BaseDownloadTask> b = new LinkedBlockingQueue();
    private final List<BaseDownloadTask> c = new ArrayList();
    public volatile boolean h = false;

    public static class b implements BaseDownloadTask.FinishListener {
        private final WeakReference<FileDownloadSerialQueue> a;

        public b(WeakReference<FileDownloadSerialQueue> weakReference) {
            this.a = weakReference;
        }

        @Override // com.liulishuo.filedownloader.BaseDownloadTask.FinishListener
        public synchronized void over(BaseDownloadTask baseDownloadTask) {
            baseDownloadTask.removeFinishListener(this);
            WeakReference<FileDownloadSerialQueue> weakReference = this.a;
            if (weakReference == null) {
                return;
            }
            FileDownloadSerialQueue fileDownloadSerialQueue = weakReference.get();
            if (fileDownloadSerialQueue == null) {
                return;
            }
            fileDownloadSerialQueue.f = null;
            if (fileDownloadSerialQueue.h) {
                return;
            }
            fileDownloadSerialQueue.c();
        }
    }

    public class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            try {
                if (FileDownloadSerialQueue.this.h) {
                    return false;
                }
                FileDownloadSerialQueue fileDownloadSerialQueue = FileDownloadSerialQueue.this;
                fileDownloadSerialQueue.f = (BaseDownloadTask) fileDownloadSerialQueue.b.take();
                FileDownloadSerialQueue.this.f.addFinishListener(FileDownloadSerialQueue.this.g).start();
                return false;
            } catch (InterruptedException unused) {
                return false;
            }
        }
    }

    public FileDownloadSerialQueue() {
        HandlerThread handlerThread = new HandlerThread(FileDownloadUtils.getThreadPoolName("SerialDownloadManager"));
        this.d = handlerThread;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper(), new c());
        this.g = new b(new WeakReference(this));
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.e.sendEmptyMessage(1);
    }

    public void enqueue(BaseDownloadTask baseDownloadTask) {
        synchronized (this.g) {
            if (this.h) {
                this.c.add(baseDownloadTask);
                return;
            }
            try {
                this.b.put(baseDownloadTask);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getWaitingTaskCount() {
        return this.b.size() + this.c.size();
    }

    public int getWorkingTaskId() {
        if (this.f != null) {
            return this.f.getId();
        }
        return 0;
    }

    public void pause() {
        synchronized (this.g) {
            if (this.h) {
                FileDownloadLog.w(this, "require pause this queue(remain %d), but it has already been paused", Integer.valueOf(this.b.size()));
                return;
            }
            this.h = true;
            this.b.drainTo(this.c);
            if (this.f != null) {
                this.f.removeFinishListener(this.g);
                this.f.pause();
            }
        }
    }

    public void resume() {
        synchronized (this.g) {
            if (!this.h) {
                FileDownloadLog.w(this, "require resume this queue(remain %d), but it is still running", Integer.valueOf(this.b.size()));
                return;
            }
            this.h = false;
            this.b.addAll(this.c);
            this.c.clear();
            if (this.f == null) {
                c();
            } else {
                this.f.addFinishListener(this.g);
                this.f.start();
            }
        }
    }

    public List<BaseDownloadTask> shutdown() {
        ArrayList arrayList;
        synchronized (this.g) {
            if (this.f != null) {
                pause();
            }
            arrayList = new ArrayList(this.c);
            this.c.clear();
            this.e.removeMessages(1);
            this.d.interrupt();
            this.d.quit();
        }
        return arrayList;
    }
}
