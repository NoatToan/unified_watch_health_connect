package org.junit.runner;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes23.dex */
public class Result implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = ObjectStreamClass.lookup(c.class).getFields();
    private static final long serialVersionUID = 1;
    private final AtomicInteger a;
    private final AtomicInteger b;
    private final CopyOnWriteArrayList<Failure> c;
    private final AtomicLong d;
    private final AtomicLong e;
    private c f;

    @RunListener.ThreadSafe
    public class b extends RunListener {
        private b() {
        }

        @Override // org.junit.runner.notification.RunListener
        public void testAssumptionFailure(Failure failure) {
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFailure(Failure failure) throws Exception {
            Result.this.c.add(failure);
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFinished(Description description) throws Exception {
            Result.this.a.getAndIncrement();
        }

        @Override // org.junit.runner.notification.RunListener
        public void testIgnored(Description description) throws Exception {
            Result.this.b.getAndIncrement();
        }

        @Override // org.junit.runner.notification.RunListener
        public void testRunFinished(Result result) throws Exception {
            Result.this.d.addAndGet(System.currentTimeMillis() - Result.this.e.get());
        }

        @Override // org.junit.runner.notification.RunListener
        public void testRunStarted(Description description) throws Exception {
            Result.this.e.set(System.currentTimeMillis());
        }
    }

    public Result() {
        this.a = new AtomicInteger();
        this.b = new AtomicInteger();
        this.c = new CopyOnWriteArrayList<>();
        this.d = new AtomicLong();
        this.e = new AtomicLong();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.f = c.g(objectInputStream);
    }

    private Object readResolve() {
        return new Result(this.f);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        new c(this).h(objectOutputStream);
    }

    public RunListener createListener() {
        return new b();
    }

    public int getFailureCount() {
        return this.c.size();
    }

    public List<Failure> getFailures() {
        return this.c;
    }

    public int getIgnoreCount() {
        return this.b.get();
    }

    public int getRunCount() {
        return this.a.get();
    }

    public long getRunTime() {
        return this.d.get();
    }

    public boolean wasSuccessful() {
        return getFailureCount() == 0;
    }

    public static class c implements Serializable {
        private static final long serialVersionUID = 1;
        private final AtomicInteger a;
        private final AtomicInteger b;
        private final List<Failure> c;
        private final long d;
        private final long e;

        public c(Result result) {
            this.a = result.a;
            this.b = result.b;
            this.c = Collections.synchronizedList(new ArrayList(result.c));
            this.d = result.d.longValue();
            this.e = result.e.longValue();
        }

        public static c g(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            return new c(objectInputStream.readFields());
        }

        public void h(ObjectOutputStream objectOutputStream) throws IOException {
            ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
            putFieldPutFields.put("fCount", this.a);
            putFieldPutFields.put("fIgnoreCount", this.b);
            putFieldPutFields.put("fFailures", this.c);
            putFieldPutFields.put("fRunTime", this.d);
            putFieldPutFields.put("fStartTime", this.e);
            objectOutputStream.writeFields();
        }

        private c(ObjectInputStream.GetField getField) throws IOException {
            this.a = (AtomicInteger) getField.get("fCount", (Object) null);
            this.b = (AtomicInteger) getField.get("fIgnoreCount", (Object) null);
            this.c = (List) getField.get("fFailures", (Object) null);
            this.d = getField.get("fRunTime", 0L);
            this.e = getField.get("fStartTime", 0L);
        }
    }

    private Result(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = new CopyOnWriteArrayList<>(cVar.c);
        this.d = new AtomicLong(cVar.d);
        this.e = new AtomicLong(cVar.e);
    }
}
