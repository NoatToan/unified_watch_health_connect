package com.xmlywind.sdk.b.a;

import com.xmlywind.logger.SigmobLog;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
public abstract class e implements com.xmlywind.sdk.b.a.a {
    private final ExecutorService a = Executors.newSingleThreadExecutor();

    public class a implements Callable<Void> {
        private final File b;

        public a(File file) {
            this.b = file;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws IOException {
            e.this.b(this.b);
            return null;
        }
    }

    private void a(List<File> list) {
        long jB = b(list);
        int size = list.size();
        for (File file : list) {
            if (!a(file, jB, size)) {
                long length = file.length();
                if (file.delete()) {
                    jB -= length;
                    SigmobLog.i("Cache file " + file + " is deleted because it exceeds cache limit");
                    size += -1;
                } else {
                    SigmobLog.e("Error deleting file " + file + " for trimming cache");
                }
            }
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
    public void b(File file) throws IOException {
        d.c(file);
        a(d.b(file.getParentFile()));
    }

    @Override // com.xmlywind.sdk.b.a.a
    public void a(File file) {
        this.a.submit(new a(file));
    }

    public abstract boolean a(File file, long j, int i);
}
