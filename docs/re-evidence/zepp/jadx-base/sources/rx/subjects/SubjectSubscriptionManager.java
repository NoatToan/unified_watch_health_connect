package rx.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.internal.operators.NotificationLite;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
final class SubjectSubscriptionManager<T> extends AtomicReference<State<T>> implements Observable.OnSubscribe<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    public volatile Object a;
    public boolean b;
    public Action1<SubjectObserver<T>> c;
    public Action1<SubjectObserver<T>> d;
    public Action1<SubjectObserver<T>> e;

    public static final class State<T> {
        public static final SubjectObserver[] c;
        public static final State d;
        public static final State e;
        public final boolean a;
        public final SubjectObserver[] b;

        static {
            SubjectObserver[] subjectObserverArr = new SubjectObserver[0];
            c = subjectObserverArr;
            d = new State(true, subjectObserverArr);
            e = new State(false, subjectObserverArr);
        }

        public State(boolean z, SubjectObserver[] subjectObserverArr) {
            this.a = z;
            this.b = subjectObserverArr;
        }

        public State add(SubjectObserver subjectObserver) {
            SubjectObserver[] subjectObserverArr = this.b;
            int length = subjectObserverArr.length;
            SubjectObserver[] subjectObserverArr2 = new SubjectObserver[length + 1];
            System.arraycopy(subjectObserverArr, 0, subjectObserverArr2, 0, length);
            subjectObserverArr2[length] = subjectObserver;
            return new State(this.a, subjectObserverArr2);
        }

        public State remove(SubjectObserver subjectObserver) {
            SubjectObserver[] subjectObserverArr = this.b;
            int length = subjectObserverArr.length;
            if (length == 1 && subjectObserverArr[0] == subjectObserver) {
                return e;
            }
            if (length == 0) {
                return this;
            }
            int i = length - 1;
            SubjectObserver[] subjectObserverArr2 = new SubjectObserver[i];
            int i2 = 0;
            for (SubjectObserver subjectObserver2 : subjectObserverArr) {
                if (subjectObserver2 != subjectObserver) {
                    if (i2 == i) {
                        return this;
                    }
                    subjectObserverArr2[i2] = subjectObserver2;
                    i2++;
                }
            }
            if (i2 == 0) {
                return e;
            }
            if (i2 < i) {
                SubjectObserver[] subjectObserverArr3 = new SubjectObserver[i2];
                System.arraycopy(subjectObserverArr2, 0, subjectObserverArr3, 0, i2);
                subjectObserverArr2 = subjectObserverArr3;
            }
            return new State(this.a, subjectObserverArr2);
        }
    }

    public static final class SubjectObserver<T> implements Observer<T> {
        public final Subscriber<? super T> a;
        public boolean b = true;
        public boolean c;
        public List<Object> d;
        public boolean e;
        public volatile boolean f;
        private volatile Object g;

        public SubjectObserver(Subscriber<? super T> subscriber) {
            this.a = subscriber;
        }

        public void a(Object obj) {
            if (obj != null) {
                NotificationLite.accept(this.a, obj);
            }
        }

        public void b(Object obj) throws Throwable {
            synchronized (this) {
                if (this.b && !this.c) {
                    this.b = false;
                    this.c = obj != null;
                    if (obj != null) {
                        c(null, obj);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0038  */
        /* JADX WARN: Code duplicated, block: B:43:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void c(List<Object> list, Object obj) throws Throwable {
            boolean z = true;
            boolean z2 = true;
            while (true) {
                if (list != null) {
                    try {
                        Iterator<Object> it2 = list.iterator();
                        while (it2.hasNext()) {
                            a(it2.next());
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.c = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z2) {
                    a(obj);
                    z2 = false;
                }
                try {
                    synchronized (this) {
                        try {
                            list = this.d;
                            this.d = null;
                            if (list == null) {
                                this.c = false;
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z = false;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    if (!z) {
                        synchronized (this) {
                            this.c = false;
                        }
                    }
                    throw th;
                }
            }
        }

        public void d(Object obj) {
            if (!this.e) {
                synchronized (this) {
                    this.b = false;
                    if (this.c) {
                        if (this.d == null) {
                            this.d = new ArrayList();
                        }
                        this.d.add(obj);
                        return;
                    }
                    this.e = true;
                }
            }
            NotificationLite.accept(this.a, obj);
        }

        public Observer<? super T> e() {
            return this.a;
        }

        public <I> I index() {
            return (I) this.g;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.onNext(t);
        }

        public void index(Object obj) {
            this.g = obj;
        }
    }

    public class a implements Action0 {
        public final /* synthetic */ SubjectObserver a;

        public a(SubjectObserver subjectObserver) {
            this.a = subjectObserver;
        }

        @Override // rx.functions.Action0
        public void call() {
            SubjectSubscriptionManager.this.h(this.a);
        }
    }

    public SubjectSubscriptionManager() {
        super(State.e);
        this.b = true;
        this.c = Actions.empty();
        this.d = Actions.empty();
        this.e = Actions.empty();
    }

    public boolean a(SubjectObserver<T> subjectObserver) {
        State<T> state;
        do {
            state = get();
            if (state.a) {
                this.e.call(subjectObserver);
                return false;
            }
        } while (!compareAndSet(state, state.add(subjectObserver)));
        this.d.call(subjectObserver);
        return true;
    }

    public void b(Subscriber<? super T> subscriber, SubjectObserver<T> subjectObserver) {
        subscriber.add(Subscriptions.create(new a(subjectObserver)));
    }

    @Override // rx.functions.Action1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void call(Subscriber<? super T> subscriber) {
        SubjectObserver<T> subjectObserver = new SubjectObserver<>(subscriber);
        b(subscriber, subjectObserver);
        this.c.call(subjectObserver);
        if (!subscriber.isUnsubscribed() && a(subjectObserver) && subscriber.isUnsubscribed()) {
            h(subjectObserver);
        }
    }

    public Object e() {
        return this.a;
    }

    public SubjectObserver<T>[] f(Object obj) {
        i(obj);
        return get().b;
    }

    public SubjectObserver<T>[] g() {
        return get().b;
    }

    public void h(SubjectObserver<T> subjectObserver) {
        State<T> state;
        State<T> stateRemove;
        do {
            state = get();
            if (state.a || (stateRemove = state.remove(subjectObserver)) == state) {
                return;
            }
        } while (!compareAndSet(state, stateRemove));
    }

    public void i(Object obj) {
        this.a = obj;
    }

    public SubjectObserver<T>[] j(Object obj) {
        i(obj);
        this.b = false;
        return get().a ? State.c : getAndSet(State.d).b;
    }
}
