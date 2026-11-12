package rx.observers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import rx.Notification;
import rx.Observer;
import rx.Subscriber;
import rx.exceptions.CompositeException;

/* JADX INFO: loaded from: classes23.dex */
public class TestSubscriber<T> extends Subscriber<T> {
    private static final Observer<Object> m = new a();
    private final Observer<T> f;
    private final List<T> g;
    private final List<Throwable> h;
    private int i;
    private final CountDownLatch j;
    private volatile int k;
    private volatile Thread l;

    public static class a implements Observer<Object> {
        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
        }
    }

    public TestSubscriber(long j) {
        this(m, j);
    }

    private void b(T t, int i) {
        T t2 = this.g.get(i);
        if (t == null) {
            if (t2 != null) {
                c("Value at index: " + i + " expected: [null] but was: [" + t2 + "]\n");
                return;
            }
            return;
        }
        if (t.equals(t2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Value at index: ");
        sb.append(i);
        sb.append(" expected: [");
        sb.append(t);
        sb.append("] (");
        sb.append(t.getClass().getSimpleName());
        sb.append(") but was: [");
        sb.append(t2);
        sb.append("] (");
        sb.append(t2 != null ? t2.getClass().getSimpleName() : "null");
        sb.append(")\n");
        c(sb.toString());
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public void assertCompleted() {
        int i = this.i;
        if (i == 0) {
            c("Not completed!");
        } else if (i > 1) {
            c("Completed multiple times: " + i);
        }
    }

    public void assertError(Class<? extends Throwable> cls) {
        List<Throwable> list = this.h;
        if (list.isEmpty()) {
            c("No errors");
            return;
        }
        if (list.size() > 1) {
            AssertionError assertionError = new AssertionError("Multiple errors: " + list.size());
            assertionError.initCause(new CompositeException(list));
            throw assertionError;
        }
        if (cls.isInstance(list.get(0))) {
            return;
        }
        AssertionError assertionError2 = new AssertionError("Exceptions differ; expected: " + cls + ", actual: " + list.get(0));
        assertionError2.initCause(list.get(0));
        throw assertionError2;
    }

    public void assertNoErrors() {
        if (getOnErrorEvents().isEmpty()) {
            return;
        }
        c("Unexpected onError events");
    }

    public void assertNoTerminalEvent() {
        List<Throwable> list = this.h;
        int i = this.i;
        if (!list.isEmpty() || i > 0) {
            if (list.isEmpty()) {
                c("Found " + list.size() + " errors and " + i + " completion events instead of none");
                return;
            }
            if (list.size() == 1) {
                c("Found " + list.size() + " errors and " + i + " completion events instead of none");
                return;
            }
            c("Found " + list.size() + " errors and " + i + " completion events instead of none");
        }
    }

    public void assertNoValues() {
        int size = this.g.size();
        if (size != 0) {
            c("No onNext events expected yet some received: " + size);
        }
    }

    public void assertNotCompleted() {
        int i = this.i;
        if (i == 1) {
            c("Completed!");
        } else if (i > 1) {
            c("Completed multiple times: " + i);
        }
    }

    public void assertReceivedOnNext(List<T> list) {
        if (this.g.size() != list.size()) {
            c("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.g.size() + ".\nProvided values: " + list + "\nActual values: " + this.g + "\n");
        }
        for (int i = 0; i < list.size(); i++) {
            b(list.get(i), i);
        }
    }

    public void assertTerminalEvent() {
        if (this.h.size() > 1) {
            c("Too many onError events: " + this.h.size());
        }
        if (this.i > 1) {
            c("Too many onCompleted events: " + this.i);
        }
        if (this.i == 1 && this.h.size() == 1) {
            c("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.i == 0 && this.h.isEmpty()) {
            c("No terminal events received.");
        }
    }

    public void assertUnsubscribed() {
        if (isUnsubscribed()) {
            return;
        }
        c("Not unsubscribed.");
    }

    public void assertValue(T t) {
        assertReceivedOnNext(Collections.singletonList(t));
    }

    public void assertValueCount(int i) {
        int size = this.g.size();
        if (size != i) {
            c("Number of onNext events differ; expected: " + i + ", actual: " + size);
        }
    }

    public void assertValues(T... tArr) {
        assertReceivedOnNext(Arrays.asList(tArr));
    }

    public final void assertValuesAndClear(T t, T... tArr) {
        assertValueCount(tArr.length + 1);
        int i = 0;
        b(t, 0);
        while (i < tArr.length) {
            T t2 = tArr[i];
            i++;
            b(t2, i);
        }
        this.g.clear();
    }

    public void awaitTerminalEvent() {
        try {
            this.j.await();
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted", e);
        }
    }

    public void awaitTerminalEventAndUnsubscribeOnTimeout(long j, TimeUnit timeUnit) {
        try {
            if (this.j.await(j, timeUnit)) {
                return;
            }
            unsubscribe();
        } catch (InterruptedException unused) {
            unsubscribe();
        }
    }

    public final boolean awaitValueCount(int i, long j, TimeUnit timeUnit) {
        while (j != 0 && this.k < i) {
            try {
                timeUnit.sleep(1L);
                j--;
            } catch (InterruptedException e) {
                throw new IllegalStateException("Interrupted", e);
            }
        }
        return this.k >= i;
    }

    public final void c(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int i = this.i;
        sb.append(i);
        sb.append(" completion");
        if (i != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.h.isEmpty()) {
            int size = this.h.size();
            sb.append(" (+");
            sb.append(size);
            sb.append(" error");
            if (size != 1) {
                sb.append('s');
            }
            sb.append(')');
        }
        AssertionError assertionError = new AssertionError(sb.toString());
        if (this.h.isEmpty()) {
            throw assertionError;
        }
        if (this.h.size() == 1) {
            assertionError.initCause(this.h.get(0));
            throw assertionError;
        }
        assertionError.initCause(new CompositeException(this.h));
        throw assertionError;
    }

    public final int getCompletions() {
        return this.i;
    }

    public Thread getLastSeenThread() {
        return this.l;
    }

    @Deprecated
    public List<Notification<T>> getOnCompletedEvents() {
        int i = this.i;
        ArrayList arrayList = new ArrayList(i != 0 ? i : 1);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Notification.createOnCompleted());
        }
        return arrayList;
    }

    public List<Throwable> getOnErrorEvents() {
        return this.h;
    }

    public List<T> getOnNextEvents() {
        return this.g;
    }

    public final int getValueCount() {
        return this.k;
    }

    @Override // rx.Observer
    public void onCompleted() {
        try {
            this.i++;
            this.l = Thread.currentThread();
            this.f.onCompleted();
        } finally {
            this.j.countDown();
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        try {
            this.l = Thread.currentThread();
            this.h.add(th);
            this.f.onError(th);
        } finally {
            this.j.countDown();
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.l = Thread.currentThread();
        this.g.add(t);
        this.k = this.g.size();
        this.f.onNext(t);
    }

    public void requestMore(long j) {
        request(j);
    }

    public TestSubscriber(Observer<T> observer, long j) {
        this.j = new CountDownLatch(1);
        Objects.requireNonNull(observer);
        this.f = observer;
        if (j >= 0) {
            request(j);
        }
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    public static <T> TestSubscriber<T> create(long j) {
        return new TestSubscriber<>(j);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer, long j) {
        return new TestSubscriber<>(observer, j);
    }

    public void awaitTerminalEvent(long j, TimeUnit timeUnit) {
        try {
            this.j.await(j, timeUnit);
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted", e);
        }
    }

    public static <T> TestSubscriber<T> create(Subscriber<T> subscriber) {
        return new TestSubscriber<>((Subscriber) subscriber);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer) {
        return new TestSubscriber<>(observer);
    }

    public TestSubscriber(Subscriber<T> subscriber) {
        this(subscriber, -1L);
    }

    public TestSubscriber(Observer<T> observer) {
        this(observer, -1L);
    }

    public TestSubscriber() {
        this(-1L);
    }

    public void assertError(Throwable th) {
        List<Throwable> list = this.h;
        if (list.isEmpty()) {
            c("No errors");
            return;
        }
        if (list.size() > 1) {
            c("Multiple errors");
            return;
        }
        if (th.equals(list.get(0))) {
            return;
        }
        c("Exceptions differ; expected: " + th + ", actual: " + list.get(0));
    }
}
