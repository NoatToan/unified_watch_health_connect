package org.apache.commons.io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class FileCleaningTracker {
    public ReferenceQueue<Object> a = new ReferenceQueue<>();
    public final Collection<b> b = Collections.synchronizedSet(new HashSet());
    public final List<String> c = Collections.synchronizedList(new ArrayList());
    public volatile boolean d = false;
    public Thread e;

    public final class a extends Thread {
        public a() {
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                if (FileCleaningTracker.this.d && FileCleaningTracker.this.b.size() <= 0) {
                    return;
                }
                try {
                    b bVar = (b) FileCleaningTracker.this.a.remove();
                    FileCleaningTracker.this.b.remove(bVar);
                    if (!bVar.a()) {
                        FileCleaningTracker.this.c.add(bVar.b());
                    }
                    bVar.clear();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static final class b extends PhantomReference<Object> {
        private final String a;
        private final FileDeleteStrategy b;

        public b(String str, FileDeleteStrategy fileDeleteStrategy, Object obj, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.a = str;
            this.b = fileDeleteStrategy == null ? FileDeleteStrategy.NORMAL : fileDeleteStrategy;
        }

        public boolean a() {
            return this.b.deleteQuietly(new File(this.a));
        }

        public String b() {
            return this.a;
        }
    }

    private synchronized void a(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        if (this.d) {
            throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
        }
        if (this.e == null) {
            a aVar = new a();
            this.e = aVar;
            aVar.start();
        }
        this.b.add(new b(str, fileDeleteStrategy, obj, this.a));
    }

    public synchronized void exitWhenFinished() {
        this.d = true;
        Thread thread = this.e;
        if (thread != null) {
            synchronized (thread) {
                this.e.interrupt();
            }
        }
    }

    public List<String> getDeleteFailures() {
        return this.c;
    }

    public int getTrackCount() {
        return this.b.size();
    }

    public void track(File file, Object obj) {
        track(file, obj, (FileDeleteStrategy) null);
    }

    public void track(File file, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        Objects.requireNonNull(file, "The file must not be null");
        a(file.getPath(), obj, fileDeleteStrategy);
    }

    public void track(String str, Object obj) {
        track(str, obj, (FileDeleteStrategy) null);
    }

    public void track(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        Objects.requireNonNull(str, "The path must not be null");
        a(str, obj, fileDeleteStrategy);
    }
}
