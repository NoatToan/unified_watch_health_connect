package org.apache.commons.io.monitor;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class FileAlterationMonitor implements Runnable {
    private final long a;
    private final List<FileAlterationObserver> b;
    private Thread c;
    private ThreadFactory d;
    private volatile boolean e;

    public FileAlterationMonitor() {
        this(10000L);
    }

    public void addObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.b.add(fileAlterationObserver);
        }
    }

    public long getInterval() {
        return this.a;
    }

    public Iterable<FileAlterationObserver> getObservers() {
        return this.b;
    }

    public void removeObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            while (this.b.remove(fileAlterationObserver)) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.e) {
            Iterator<FileAlterationObserver> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().checkAndNotify();
            }
            if (!this.e) {
                return;
            } else {
                try {
                    Thread.sleep(this.a);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public synchronized void setThreadFactory(ThreadFactory threadFactory) {
        this.d = threadFactory;
    }

    public synchronized void start() throws Exception {
        if (this.e) {
            throw new IllegalStateException("Monitor is already running");
        }
        Iterator<FileAlterationObserver> it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next().initialize();
        }
        this.e = true;
        ThreadFactory threadFactory = this.d;
        if (threadFactory != null) {
            this.c = threadFactory.newThread(this);
        } else {
            this.c = new Thread(this);
        }
        this.c.start();
    }

    public synchronized void stop() throws Exception {
        stop(this.a);
    }

    public FileAlterationMonitor(long j) {
        this.b = new CopyOnWriteArrayList();
        this.c = null;
        this.e = false;
        this.a = j;
    }

    public synchronized void stop(long j) throws Exception {
        if (this.e) {
            this.e = false;
            try {
                this.c.join(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            Iterator<FileAlterationObserver> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
            }
        } else {
            throw new IllegalStateException("Monitor is not running");
        }
    }

    public FileAlterationMonitor(long j, FileAlterationObserver... fileAlterationObserverArr) {
        this(j);
        if (fileAlterationObserverArr != null) {
            for (FileAlterationObserver fileAlterationObserver : fileAlterationObserverArr) {
                addObserver(fileAlterationObserver);
            }
        }
    }
}
