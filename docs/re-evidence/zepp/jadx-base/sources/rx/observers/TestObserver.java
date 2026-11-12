package rx.observers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Notification;
import rx.Observer;
import rx.exceptions.CompositeException;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class TestObserver<T> implements Observer<T> {
    private static final Observer<Object> e = new a();
    private final Observer<T> a;
    private final List<T> b;
    private final List<Throwable> c;
    private final List<Notification<T>> d;

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

    public TestObserver(Observer<T> observer) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = observer;
    }

    public final void a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int size = this.d.size();
        sb.append(size);
        sb.append(" completion");
        if (size != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.c.isEmpty()) {
            int size2 = this.c.size();
            sb.append(" (+");
            sb.append(size2);
            sb.append(" error");
            if (size2 != 1) {
                sb.append('s');
            }
            sb.append(')');
        }
        AssertionError assertionError = new AssertionError(sb.toString());
        if (this.c.isEmpty()) {
            throw assertionError;
        }
        if (this.c.size() == 1) {
            assertionError.initCause(this.c.get(0));
            throw assertionError;
        }
        assertionError.initCause(new CompositeException(this.c));
        throw assertionError;
    }

    public void assertReceivedOnNext(List<T> list) {
        if (this.b.size() != list.size()) {
            a("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.b.size() + ".\nProvided values: " + list + "\nActual values: " + this.b + "\n");
        }
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            T t2 = this.b.get(i);
            if (t == null) {
                if (t2 != null) {
                    a("Value at index: " + i + " expected to be [null] but was: [" + t2 + "]\n");
                }
            } else if (!t.equals(t2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Value at index: ");
                sb.append(i);
                sb.append(" expected to be [");
                sb.append(t);
                sb.append("] (");
                sb.append(t.getClass().getSimpleName());
                sb.append(") but was: [");
                sb.append(t2);
                sb.append("] (");
                sb.append(t2 != null ? t2.getClass().getSimpleName() : "null");
                sb.append(")\n");
                a(sb.toString());
            }
        }
    }

    public void assertTerminalEvent() {
        if (this.c.size() > 1) {
            a("Too many onError events: " + this.c.size());
        }
        if (this.d.size() > 1) {
            a("Too many onCompleted events: " + this.d.size());
        }
        if (this.d.size() == 1 && this.c.size() == 1) {
            a("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.d.isEmpty() && this.c.isEmpty()) {
            a("No terminal events received.");
        }
    }

    public List<Object> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        return Collections.unmodifiableList(arrayList);
    }

    public List<Notification<T>> getOnCompletedEvents() {
        return Collections.unmodifiableList(this.d);
    }

    public List<Throwable> getOnErrorEvents() {
        return Collections.unmodifiableList(this.c);
    }

    public List<T> getOnNextEvents() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.d.add(Notification.createOnCompleted());
        this.a.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.c.add(th);
        this.a.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.add(t);
        this.a.onNext(t);
    }

    public TestObserver() {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = (Observer<T>) e;
    }
}
