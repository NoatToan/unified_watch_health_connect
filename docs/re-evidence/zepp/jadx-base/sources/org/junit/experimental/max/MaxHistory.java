package org.junit.experimental.max;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes23.dex */
public class MaxHistory implements Serializable {
    private static final long serialVersionUID = 1;
    private final Map<String, Long> a = new HashMap();
    private final Map<String, Long> b = new HashMap();
    private final File c;

    public final class b extends RunListener {
        private long a;
        private Map<Description, Long> b;

        private b() {
            this.a = System.currentTimeMillis();
            this.b = new HashMap();
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFailure(Failure failure) throws Exception {
            MaxHistory.this.g(failure.getDescription(), this.a);
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFinished(Description description) throws Exception {
            MaxHistory.this.f(description, System.nanoTime() - this.b.get(description).longValue());
        }

        @Override // org.junit.runner.notification.RunListener
        public void testRunFinished(Result result) throws Exception {
            MaxHistory.this.i();
        }

        @Override // org.junit.runner.notification.RunListener
        public void testStarted(Description description) throws Exception {
            this.b.put(description, Long.valueOf(System.nanoTime()));
        }
    }

    public class c implements Comparator<Description> {
        private c() {
        }

        private Long b(Description description) {
            Long lB = MaxHistory.this.b(description);
            if (lB == null) {
                return 0L;
            }
            return lB;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Description description, Description description2) {
            if (MaxHistory.this.e(description)) {
                return -1;
            }
            if (MaxHistory.this.e(description2)) {
                return 1;
            }
            int iCompareTo = b(description2).compareTo(b(description));
            return iCompareTo != 0 ? iCompareTo : MaxHistory.this.c(description).compareTo(MaxHistory.this.c(description2));
        }
    }

    private MaxHistory(File file) {
        this.c = file;
    }

    public static MaxHistory forFolder(File file) {
        if (file.exists()) {
            try {
                return h(file);
            } catch (CouldNotReadCoreException e) {
                e.printStackTrace();
                file.delete();
            }
        }
        return new MaxHistory(file);
    }

    private static MaxHistory h(File file) throws CouldNotReadCoreException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    MaxHistory maxHistory = (MaxHistory) objectInputStream.readObject();
                    objectInputStream.close();
                    fileInputStream.close();
                    return maxHistory;
                } catch (Throwable th) {
                    objectInputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        } catch (Exception e) {
            throw new CouldNotReadCoreException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.c));
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }

    public Long b(Description description) {
        return this.b.get(description.toString());
    }

    public Long c(Description description) {
        return this.a.get(description.toString());
    }

    public boolean e(Description description) {
        return !this.a.containsKey(description.toString());
    }

    public void f(Description description, long j) {
        this.a.put(description.toString(), Long.valueOf(j));
    }

    public void g(Description description, long j) {
        this.b.put(description.toString(), Long.valueOf(j));
    }

    public RunListener listener() {
        return new b();
    }

    public Comparator<Description> testComparator() {
        return new c();
    }
}
