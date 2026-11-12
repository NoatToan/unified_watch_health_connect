package com.danikula.videocache.file;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LruDiskUsage implements DiskUsage {
    private static final Logger b = LoggerFactory.getLogger("LruDiskUsage");
    private final ExecutorService a = Executors.newSingleThreadExecutor();

    public class a implements Callable<Void> {
        private final File a;

        public a(File file) {
            this.a = file;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            LruDiskUsage.this.c(this.a);
            return null;
        }
    }

    private long b(List<File> list) {
        Iterator<File> it2 = list.iterator();
        long length = 0;
        while (it2.hasNext()) {
            length += it2.next().length();
        }
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(File file) throws IOException {
        com.danikula.videocache.file.a.e(file);
        d(com.danikula.videocache.file.a.a(file.getParentFile()));
    }

    private void d(List<File> list) {
        long jB = b(list);
        int size = list.size();
        for (File file : list) {
            if (!accept(file, jB, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    jB -= length;
                    b.info("Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    b.error("Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }

    public abstract boolean accept(File file, long j, int i);

    @Override // com.danikula.videocache.file.DiskUsage
    public void touch(File file) throws IOException {
        this.a.submit(new a(file));
    }
}
