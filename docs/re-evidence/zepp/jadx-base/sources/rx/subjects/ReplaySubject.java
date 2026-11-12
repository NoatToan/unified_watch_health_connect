package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.internal.operators.BackpressureUtils;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes23.dex */
public final class ReplaySubject<T> extends Subject<T, T> {
    private static final Object[] c = new Object[0];
    public final e<T> b;

    public interface a<T> {
        void a(T t);

        void b(b<T> bVar);

        void complete();

        Throwable error();

        void error(Throwable th);

        boolean isComplete();

        boolean isEmpty();

        T last();

        int size();

        T[] toArray(T[] tArr);
    }

    public static final class b<T> extends AtomicInteger implements Producer, Subscription {
        private static final long serialVersionUID = -5006209596735204567L;
        public final Subscriber<? super T> a;
        public final AtomicLong b = new AtomicLong();
        public final e<T> c;
        public int d;
        public int e;
        public Object f;

        public b(Subscriber<? super T> subscriber, e<T> eVar) {
            this.a = subscriber;
            this.c = eVar;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this.b, j);
                this.c.a.b(this);
            } else {
                if (j >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.c.e(this);
        }
    }

    public static final class e<T> extends AtomicReference<b<T>[]> implements Observable.OnSubscribe<T>, Observer<T> {
        public static final b[] b = new b[0];
        public static final b[] c = new b[0];
        private static final long serialVersionUID = 5952362471246910544L;
        public final a<T> a;

        public e(a<T> aVar) {
            this.a = aVar;
            lazySet(b);
        }

        public boolean a(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = get();
                if (bVarArr == c) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            b<T> bVar = new b<>(subscriber, this);
            subscriber.add(bVar);
            subscriber.setProducer(bVar);
            if (a(bVar) && bVar.isUnsubscribed()) {
                e(bVar);
            } else {
                this.a.b(bVar);
            }
        }

        public boolean c() {
            return get() == c;
        }

        public void e(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = get();
                if (bVarArr == c || bVarArr == b) {
                    return;
                }
                int length = bVarArr.length;
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (bVarArr[i2] == bVar) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = b;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                    System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!compareAndSet(bVarArr, bVarArr2));
        }

        @Override // rx.Observer
        public void onCompleted() {
            a<T> aVar = this.a;
            aVar.complete();
            for (b<T> bVar : getAndSet(c)) {
                aVar.b(bVar);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            a<T> aVar = this.a;
            aVar.error(th);
            ArrayList arrayList = null;
            for (b<T> bVar : getAndSet(c)) {
                try {
                    aVar.b(bVar);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            a<T> aVar = this.a;
            aVar.a(t);
            for (b<T> bVar : get()) {
                aVar.b(bVar);
            }
        }
    }

    public ReplaySubject(e<T> eVar) {
        super(eVar);
        this.b = eVar;
    }

    public static <T> ReplaySubject<T> c() {
        return new ReplaySubject<>(new e(new d(Integer.MAX_VALUE)));
    }

    public static <T> ReplaySubject<T> create() {
        return create(16);
    }

    public static <T> ReplaySubject<T> createWithSize(int i) {
        return new ReplaySubject<>(new e(new d(i)));
    }

    public static <T> ReplaySubject<T> createWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return createWithTimeAndSize(j, timeUnit, Integer.MAX_VALUE, scheduler);
    }

    public static <T> ReplaySubject<T> createWithTimeAndSize(long j, TimeUnit timeUnit, int i, Scheduler scheduler) {
        return new ReplaySubject<>(new e(new c(i, timeUnit.toMillis(j), scheduler)));
    }

    public static <T> ReplaySubject<T> d() {
        return new ReplaySubject<>(new e(new c(Integer.MAX_VALUE, Long.MAX_VALUE, Schedulers.immediate())));
    }

    public int e() {
        return this.b.get().length;
    }

    public Throwable getThrowable() {
        if (this.b.c()) {
            return this.b.a.error();
        }
        return null;
    }

    public T getValue() {
        return this.b.a.last();
    }

    public T[] getValues(T[] tArr) {
        return this.b.a.toArray(tArr);
    }

    public boolean hasAnyValue() {
        return !this.b.a.isEmpty();
    }

    public boolean hasCompleted() {
        return this.b.c() && this.b.a.error() == null;
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.b.c() && this.b.a.error() != null;
    }

    public boolean hasValue() {
        return hasAnyValue();
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.b.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.onNext(t);
    }

    public int size() {
        return this.b.a.size();
    }

    public static final class d<T> implements a<T> {
        public final int a;
        public volatile a<T> b;
        public a<T> c;
        public int d;
        public volatile boolean e;
        public Throwable f;

        public static final class a<T> extends AtomicReference<a<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            public final T a;

            public a(T t) {
                this.a = t;
            }
        }

        public d(int i) {
            this.a = i;
            a<T> aVar = new a<>(null);
            this.c = aVar;
            this.b = aVar;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(T t) {
            a<T> aVar = new a<>(t);
            this.c.set(aVar);
            this.c = aVar;
            int i = this.d;
            if (i == this.a) {
                this.b = this.b.get();
            } else {
                this.d = i + 1;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public void b(b<T> bVar) {
            if (bVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = bVar.a;
            int iAddAndGet = 1;
            do {
                long j = bVar.b.get();
                a<T> aVar = (a) bVar.f;
                if (aVar == null) {
                    aVar = this.b;
                }
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (subscriber.isUnsubscribed()) {
                        bVar.f = null;
                        return;
                    }
                    boolean z = this.e;
                    a<T> aVar2 = aVar.get();
                    boolean z2 = aVar2 == null;
                    if (z && z2) {
                        bVar.f = null;
                        Throwable th = this.f;
                        if (th != null) {
                            subscriber.onError(th);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(aVar2.a);
                    j2++;
                    aVar = aVar2;
                }
                if (j2 == j) {
                    if (subscriber.isUnsubscribed()) {
                        bVar.f = null;
                        return;
                    }
                    boolean z3 = this.e;
                    boolean z4 = aVar.get() == null;
                    if (z3 && z4) {
                        bVar.f = null;
                        Throwable th2 = this.f;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    BackpressureUtils.produced(bVar.b, j2);
                }
                bVar.f = aVar;
                iAddAndGet = bVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.subjects.ReplaySubject.a
        public void complete() {
            this.e = true;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void error(Throwable th) {
            this.f = th;
            this.e = true;
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean isComplete() {
            return this.e;
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean isEmpty() {
            return this.b.get() == null;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T last() {
            a<T> aVar = this.b;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    return aVar.a;
                }
                aVar = aVar2;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public int size() {
            a<T> aVar = this.b.get();
            int i = 0;
            while (aVar != null && i != Integer.MAX_VALUE) {
                aVar = aVar.get();
                i++;
            }
            return i;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (a<T> aVar = this.b.get(); aVar != null; aVar = aVar.get()) {
                arrayList.add(aVar.a);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // rx.subjects.ReplaySubject.a
        public Throwable error() {
            return this.f;
        }
    }

    public static <T> ReplaySubject<T> create(int i) {
        if (i > 0) {
            return new ReplaySubject<>(new e(new f(i)));
        }
        throw new IllegalArgumentException("capacity > 0 required but it was " + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = c;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    public static final class c<T> implements a<T> {
        public final int a;
        public final long b;
        public final Scheduler c;
        public volatile a<T> d;
        public a<T> e;
        public int f;
        public volatile boolean g;
        public Throwable h;

        public static final class a<T> extends AtomicReference<a<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            public final T a;
            public final long b;

            public a(T t, long j) {
                this.a = t;
                this.b = j;
            }
        }

        public c(int i, long j, Scheduler scheduler) {
            this.a = i;
            a<T> aVar = new a<>(null, 0L);
            this.e = aVar;
            this.d = aVar;
            this.b = j;
            this.c = scheduler;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(T t) {
            a<T> aVar;
            long jNow = this.c.now();
            a<T> aVar2 = new a<>(t, jNow);
            this.e.set(aVar2);
            this.e = aVar2;
            long j = jNow - this.b;
            int i = this.f;
            a<T> aVar3 = this.d;
            if (i == this.a) {
                aVar = aVar3.get();
            } else {
                i++;
                aVar = aVar3;
            }
            while (true) {
                a<T> aVar4 = aVar.get();
                if (aVar4 == null || aVar4.b > j) {
                    break;
                }
                i--;
                aVar = aVar4;
            }
            this.f = i;
            if (aVar != aVar3) {
                this.d = aVar;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public void b(b<T> bVar) {
            if (bVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = bVar.a;
            int iAddAndGet = 1;
            do {
                long j = bVar.b.get();
                a<T> aVarD = (a) bVar.f;
                if (aVarD == null) {
                    aVarD = d();
                }
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (subscriber.isUnsubscribed()) {
                        bVar.f = null;
                        return;
                    }
                    boolean z = this.g;
                    a<T> aVar = aVarD.get();
                    boolean z2 = aVar == null;
                    if (z && z2) {
                        bVar.f = null;
                        Throwable th = this.h;
                        if (th != null) {
                            subscriber.onError(th);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(aVar.a);
                    j2++;
                    aVarD = aVar;
                }
                if (j2 == j) {
                    if (subscriber.isUnsubscribed()) {
                        bVar.f = null;
                        return;
                    }
                    boolean z3 = this.g;
                    boolean z4 = aVarD.get() == null;
                    if (z3 && z4) {
                        bVar.f = null;
                        Throwable th2 = this.h;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    BackpressureUtils.produced(bVar.b, j2);
                }
                bVar.f = aVarD;
                iAddAndGet = bVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void c() {
            long jNow = this.c.now() - this.b;
            a<T> aVar = this.d;
            a<T> aVar2 = aVar;
            while (true) {
                a<T> aVar3 = aVar2.get();
                if (aVar3 == null || aVar3.b > jNow) {
                    break;
                } else {
                    aVar2 = aVar3;
                }
            }
            if (aVar != aVar2) {
                this.d = aVar2;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public void complete() {
            c();
            this.g = true;
        }

        public a<T> d() {
            long jNow = this.c.now() - this.b;
            a<T> aVar = this.d;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null || aVar2.b > jNow) {
                    break;
                }
                aVar = aVar2;
            }
            return aVar;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void error(Throwable th) {
            c();
            this.h = th;
            this.g = true;
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean isComplete() {
            return this.g;
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean isEmpty() {
            return d().get() == null;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T last() {
            a<T> aVarD = d();
            while (true) {
                a<T> aVar = aVarD.get();
                if (aVar == null) {
                    return aVarD.a;
                }
                aVarD = aVar;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public int size() {
            a<T> aVar = d().get();
            int i = 0;
            while (aVar != null && i != Integer.MAX_VALUE) {
                aVar = aVar.get();
                i++;
            }
            return i;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (a<T> aVar = d().get(); aVar != null; aVar = aVar.get()) {
                arrayList.add(aVar.a);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // rx.subjects.ReplaySubject.a
        public Throwable error() {
            return this.h;
        }
    }

    public static final class f<T> implements a<T> {
        public final int a;
        public volatile int b;
        public final Object[] c;
        public Object[] d;
        public int e;
        public volatile boolean f;
        public Throwable g;

        public f(int i) {
            this.a = i;
            Object[] objArr = new Object[i + 1];
            this.c = objArr;
            this.d = objArr;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(T t) {
            if (this.f) {
                return;
            }
            int i = this.e;
            Object[] objArr = this.d;
            if (i == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = t;
                this.e = 1;
                objArr[i] = objArr2;
                this.d = objArr2;
            } else {
                objArr[i] = t;
                this.e = i + 1;
            }
            this.b++;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void b(b<T> bVar) {
            if (bVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = bVar.a;
            int i = this.a;
            int iAddAndGet = 1;
            do {
                long j = bVar.b.get();
                Object[] objArr = (Object[]) bVar.f;
                if (objArr == null) {
                    objArr = this.c;
                }
                int i2 = bVar.e;
                int i3 = bVar.d;
                long j2 = 0;
                while (j2 != j) {
                    if (subscriber.isUnsubscribed()) {
                        bVar.f = null;
                        return;
                    }
                    boolean z = this.f;
                    boolean z2 = i3 == this.b;
                    if (z && z2) {
                        bVar.f = null;
                        Throwable th = this.g;
                        if (th != null) {
                            subscriber.onError(th);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    if (i2 == i) {
                        objArr = (Object[]) objArr[i2];
                        i2 = 0;
                    }
                    subscriber.onNext(objArr[i2]);
                    j2++;
                    i2++;
                    i3++;
                }
                if (j2 == j) {
                    if (subscriber.isUnsubscribed()) {
                        bVar.f = null;
                        return;
                    }
                    boolean z3 = this.f;
                    boolean z4 = i3 == this.b;
                    if (z3 && z4) {
                        bVar.f = null;
                        Throwable th2 = this.g;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    BackpressureUtils.produced(bVar.b, j2);
                }
                bVar.d = i3;
                bVar.e = i2;
                bVar.f = objArr;
                iAddAndGet = bVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.subjects.ReplaySubject.a
        public void complete() {
            this.f = true;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void error(Throwable th) {
            if (this.f) {
                RxJavaHooks.onError(th);
            } else {
                this.g = th;
                this.f = true;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean isComplete() {
            return this.f;
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean isEmpty() {
            return this.b == 0;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T last() {
            int i = this.b;
            if (i == 0) {
                return null;
            }
            Object[] objArr = this.c;
            int i2 = this.a;
            while (i >= i2) {
                objArr = (Object[]) objArr[i2];
                i -= i2;
            }
            return (T) objArr[i - 1];
        }

        @Override // rx.subjects.ReplaySubject.a
        public int size() {
            return this.b;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T[] toArray(T[] tArr) {
            int i = this.b;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            Object[] objArr = this.c;
            int i2 = this.a;
            int i3 = 0;
            while (true) {
                int i4 = i3 + i2;
                if (i4 >= i) {
                    break;
                }
                System.arraycopy(objArr, 0, tArr, i3, i2);
                objArr = objArr[i2];
                i3 = i4;
            }
            System.arraycopy(objArr, 0, tArr, i3, i - i3);
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // rx.subjects.ReplaySubject.a
        public Throwable error() {
            return this.g;
        }
    }
}
