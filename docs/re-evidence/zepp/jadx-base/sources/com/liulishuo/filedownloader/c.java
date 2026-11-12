package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.message.MessageSnapshotFlow;
import com.liulishuo.filedownloader.util.FileDownloadExecutors;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes18.dex */
class c {
    private final b a = new b();

    public static class a {
        private static final c a = new c();

        static {
            MessageSnapshotFlow.getImpl().setReceiver(new MessageSnapshotGate());
        }

        private a() {
        }
    }

    public static class b {
        private ThreadPoolExecutor a;
        private LinkedBlockingQueue<Runnable> b;

        public b() {
            e();
        }

        private void e() {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.b = linkedBlockingQueue;
            this.a = FileDownloadExecutors.newDefaultThreadPool(3, linkedBlockingQueue, "LauncherTask");
        }

        public void a(ITaskHunter.IStarter iStarter) {
            this.a.execute(new RunnableC0733c(iStarter));
        }

        public void b(FileDownloadListener fileDownloadListener) {
            if (fileDownloadListener == null) {
                FileDownloadLog.w(this, "want to expire by listener, but the listener provided is null", new Object[0]);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Runnable runnable : this.b) {
                RunnableC0733c runnableC0733c = (RunnableC0733c) runnable;
                if (runnableC0733c.b(fileDownloadListener)) {
                    runnableC0733c.a();
                    arrayList.add(runnable);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "expire %d tasks with listener[%s]", Integer.valueOf(arrayList.size()), fileDownloadListener);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.a.remove((Runnable) it2.next());
            }
        }

        public void c(ITaskHunter.IStarter iStarter) {
            this.b.remove(iStarter);
        }

        public void d() {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "expire %d tasks", Integer.valueOf(this.b.size()));
            }
            this.a.shutdownNow();
            e();
        }
    }

    /* JADX INFO: renamed from: com.liulishuo.filedownloader.c$c, reason: collision with other inner class name */
    public static class RunnableC0733c implements Runnable {
        private final ITaskHunter.IStarter a;
        private boolean b = false;

        public RunnableC0733c(ITaskHunter.IStarter iStarter) {
            this.a = iStarter;
        }

        public void a() {
            this.b = true;
        }

        public boolean b(FileDownloadListener fileDownloadListener) {
            ITaskHunter.IStarter iStarter = this.a;
            return iStarter != null && iStarter.equalListener(fileDownloadListener);
        }

        public boolean equals(Object obj) {
            return super.equals(obj) || obj == this.a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b) {
                return;
            }
            this.a.start();
        }
    }

    public static c d() {
        return a.a;
    }

    public synchronized void a(FileDownloadListener fileDownloadListener) {
        this.a.b(fileDownloadListener);
    }

    public synchronized void b(ITaskHunter.IStarter iStarter) {
        this.a.c(iStarter);
    }

    public synchronized void c() {
        this.a.d();
    }

    public synchronized void e(ITaskHunter.IStarter iStarter) {
        this.a.a(iStarter);
    }
}
