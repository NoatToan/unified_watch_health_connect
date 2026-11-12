package com.liulishuo.filedownloader;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseArray;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class e implements IQueuesHandler {
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final SparseArray<Handler> a = new SparseArray<>();

    public static class b implements BaseDownloadTask.FinishListener {
        private final WeakReference<c> a;
        private int b;

        public BaseDownloadTask.FinishListener a(int i) {
            this.b = i;
            return this;
        }

        @Override // com.liulishuo.filedownloader.BaseDownloadTask.FinishListener
        public void over(BaseDownloadTask baseDownloadTask) {
            WeakReference<c> weakReference = this.a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a.get().c(this.b);
        }

        private b(WeakReference<c> weakReference) {
            this.a = weakReference;
        }
    }

    public class c implements Handler.Callback {
        private Handler a;
        private List<BaseDownloadTask.IRunningTask> b;
        private int c = 0;
        private b d = new b(new WeakReference(this));

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i) {
            Handler handler = this.a;
            if (handler == null || this.b == null) {
                FileDownloadLog.w(this, "need go next %d, but params is not ready %s %s", Integer.valueOf(i), this.a, this.b);
                return;
            }
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.arg1 = i;
            if (FileDownloadLog.NEED_LOG) {
                Object[] objArr = new Object[2];
                List<BaseDownloadTask.IRunningTask> list = this.b;
                FileDownloadListener listener = null;
                if (list != null && list.get(0) != null) {
                    listener = this.b.get(0).getOrigin().getListener();
                }
                objArr[0] = listener;
                objArr[1] = Integer.valueOf(messageObtainMessage.arg1);
                FileDownloadLog.d(c.class, "start next %s %s", objArr);
            }
            this.a.sendMessage(messageObtainMessage);
        }

        public void b() {
            this.b.get(this.c).getOrigin().removeFinishListener(this.d);
            this.a.removeCallbacksAndMessages(null);
        }

        public void d(Handler handler) {
            this.a = handler;
        }

        public void e(List<BaseDownloadTask.IRunningTask> list) {
            this.b = list;
        }

        public void f() {
            c(this.c);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (message.arg1 < this.b.size()) {
                    int i2 = message.arg1;
                    this.c = i2;
                    BaseDownloadTask.IRunningTask iRunningTask = this.b.get(i2);
                    synchronized (iRunningTask.getPauseLock()) {
                        if (iRunningTask.getOrigin().getStatus() == 0 && !FileDownloadList.getImpl().k(iRunningTask)) {
                            iRunningTask.getOrigin().addFinishListener(this.d.a(this.c + 1));
                            iRunningTask.startTaskByQueue();
                        }
                        if (FileDownloadLog.NEED_LOG) {
                            FileDownloadLog.d(c.class, "direct go next by not contains %s %d", iRunningTask, Integer.valueOf(message.arg1));
                        }
                        c(message.arg1 + 1);
                        return true;
                    }
                }
                synchronized (e.this.a) {
                    e.this.a.remove(this.b.get(0).getAttachKey());
                }
                Handler handler = this.a;
                FileDownloadListener listener = null;
                if (handler != null && handler.getLooper() != null) {
                    this.a.getLooper().quit();
                    this.a = null;
                    this.b = null;
                    this.d = null;
                }
                if (FileDownloadLog.NEED_LOG) {
                    Object[] objArr = new Object[2];
                    List<BaseDownloadTask.IRunningTask> list = this.b;
                    if (list != null && list.get(0) != null) {
                        listener = this.b.get(0).getOrigin().getListener();
                    }
                    objArr[0] = listener;
                    objArr[1] = Integer.valueOf(message.arg1);
                    FileDownloadLog.d(c.class, "final serial %s %d", objArr);
                }
                return true;
            }
            if (i == 2) {
                b();
            } else if (i == 3) {
                f();
            }
            return true;
        }
    }

    private void b(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    private boolean c(int i, List<BaseDownloadTask.IRunningTask> list, FileDownloadListener fileDownloadListener, boolean z) {
        if (FileDownloadMonitor.isValid()) {
            FileDownloadMonitor.getMonitor().onRequestStart(list.size(), true, fileDownloadListener);
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(FileDownloader.class, "start list attachKey[%d] size[%d] listener[%s] isSerial[%B]", Integer.valueOf(i), Integer.valueOf(list.size()), fileDownloadListener, Boolean.valueOf(z));
        }
        if (list != null && !list.isEmpty()) {
            return false;
        }
        FileDownloadLog.w(FileDownloader.class, "Tasks with the listener can't start, because can't find any task with the provided listener, maybe tasks instance has been started in the past, so they are all are inUsing, if in this case, you can use [BaseDownloadTask#reuse] to reuse theme first then start again: [%s, %B]", fileDownloadListener, Boolean.valueOf(z));
        return true;
    }

    private void d(Handler handler) {
        handler.sendEmptyMessage(3);
    }

    @Override // com.liulishuo.filedownloader.IQueuesHandler
    public boolean contain(int i) {
        return this.a.get(i) != null;
    }

    @Override // com.liulishuo.filedownloader.IQueuesHandler
    public void freezeAllSerialQueues() {
        for (int i = 0; i < this.a.size(); i++) {
            b(this.a.get(this.a.keyAt(i)));
        }
    }

    @Override // com.liulishuo.filedownloader.IQueuesHandler
    public int serialQueueSize() {
        return this.a.size();
    }

    @Override // com.liulishuo.filedownloader.IQueuesHandler
    public boolean startQueueParallel(FileDownloadListener fileDownloadListener) {
        int iHashCode = fileDownloadListener.hashCode();
        List<BaseDownloadTask.IRunningTask> listC = FileDownloadList.getImpl().c(iHashCode, fileDownloadListener);
        if (c(iHashCode, listC, fileDownloadListener, false)) {
            return false;
        }
        Iterator<BaseDownloadTask.IRunningTask> it2 = listC.iterator();
        while (it2.hasNext()) {
            it2.next().startTaskByQueue();
        }
        return true;
    }

    @Override // com.liulishuo.filedownloader.IQueuesHandler
    public boolean startQueueSerial(FileDownloadListener fileDownloadListener) {
        c cVar = new c();
        int iHashCode = cVar.hashCode();
        List<BaseDownloadTask.IRunningTask> listC = FileDownloadList.getImpl().c(iHashCode, fileDownloadListener);
        if (c(iHashCode, listC, fileDownloadListener, true)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread(FileDownloadUtils.formatString("filedownloader serial thread %s-%d", fileDownloadListener, Integer.valueOf(iHashCode)));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), cVar);
        cVar.d(handler);
        cVar.e(listC);
        cVar.c(0);
        synchronized (this.a) {
            this.a.put(iHashCode, handler);
        }
        return true;
    }

    @Override // com.liulishuo.filedownloader.IQueuesHandler
    public void unFreezeSerialQueues(List<Integer> list) {
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            d(this.a.get(it2.next().intValue()));
        }
    }
}
