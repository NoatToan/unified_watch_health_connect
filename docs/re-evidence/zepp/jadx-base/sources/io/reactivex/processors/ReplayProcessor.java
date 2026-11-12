package io.reactivex.processors;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {
    private static final Object[] e = new Object[0];
    public static final c[] f = new c[0];
    public static final c[] g = new c[0];
    public final b<T> b;
    public boolean c;
    public final AtomicReference<c<T>[]> d = new AtomicReference<>(f);

    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T a;

        public a(T t) {
            this.a = t;
        }
    }

    public interface b<T> {
        void a(T t);

        void b();

        T[] c(T[] tArr);

        void complete();

        void d(c<T> cVar);

        void error(Throwable th);

        Throwable getError();

        @Nullable
        T getValue();

        boolean isDone();

        int size();
    }

    public static final class c<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        public final Subscriber<? super T> a;
        public final ReplayProcessor<T> b;
        public Object c;
        public final AtomicLong d = new AtomicLong();
        public volatile boolean e;
        public long f;

        public c(Subscriber<? super T> subscriber, ReplayProcessor<T> replayProcessor) {
            this.a = subscriber;
            this.b = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.b.g(this);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.d, j);
                this.b.b.d(this);
            }
        }
    }

    public static final class d<T> implements b<T> {
        public final int a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler d;
        public int e;
        public volatile f<T> f;
        public f<T> g;
        public Throwable h;
        public volatile boolean i;

        public d(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = ObjectHelper.verifyPositive(i, SDKConstants.PARAM_CONTEXT_MAX_SIZE);
            this.b = ObjectHelper.verifyPositive(j, "maxAge");
            this.c = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.d = (Scheduler) ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            f<T> fVar = new f<>(null, 0L);
            this.g = fVar;
            this.f = fVar;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void a(T t) {
            f<T> fVar = new f<>(t, this.d.now(this.c));
            f<T> fVar2 = this.g;
            this.g = fVar;
            this.e++;
            fVar2.set(fVar);
            g();
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void b() {
            if (this.f.a != null) {
                f<T> fVar = new f<>(null, 0L);
                fVar.lazySet(this.f.get());
                this.f = fVar;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public T[] c(T[] tArr) {
            f<T> fVarE = e();
            int iF = f(fVarE);
            if (iF != 0) {
                if (tArr.length < iF) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iF));
                }
                for (int i = 0; i != iF; i++) {
                    fVarE = fVarE.get();
                    tArr[i] = fVarE.a;
                }
                if (tArr.length > iF) {
                    tArr[iF] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void complete() {
            h();
            this.i = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = cVar.a;
            f<T> fVarE = (f) cVar.c;
            if (fVarE == null) {
                fVarE = e();
            }
            long j = cVar.f;
            int iAddAndGet = 1;
            do {
                long j2 = cVar.d.get();
                while (j != j2) {
                    if (cVar.e) {
                        cVar.c = null;
                        return;
                    }
                    boolean z = this.i;
                    f<T> fVar = fVarE.get();
                    boolean z2 = fVar == null;
                    if (z && z2) {
                        cVar.c = null;
                        cVar.e = true;
                        Throwable th = this.h;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(fVar.a);
                    j++;
                    fVarE = fVar;
                }
                if (j == j2) {
                    if (cVar.e) {
                        cVar.c = null;
                        return;
                    }
                    if (this.i && fVarE.get() == null) {
                        cVar.c = null;
                        cVar.e = true;
                        Throwable th2 = this.h;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                cVar.c = fVarE;
                cVar.f = j;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public f<T> e() {
            f<T> fVar;
            f<T> fVar2 = this.f;
            long jNow = this.d.now(this.c) - this.b;
            f<T> fVar3 = fVar2.get();
            while (true) {
                f<T> fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || fVar2.b > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void error(Throwable th) {
            h();
            this.h = th;
            this.i = true;
        }

        public int f(f<T> fVar) {
            int i = 0;
            while (i != Integer.MAX_VALUE && (fVar = fVar.get()) != null) {
                i++;
            }
            return i;
        }

        public void g() {
            int i = this.e;
            if (i > this.a) {
                this.e = i - 1;
                this.f = this.f.get();
            }
            long jNow = this.d.now(this.c) - this.b;
            f<T> fVar = this.f;
            while (true) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    this.f = fVar;
                    return;
                } else {
                    if (fVar2.b > jNow) {
                        this.f = fVar;
                        return;
                    }
                    fVar = fVar2;
                }
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public Throwable getError() {
            return this.h;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        @Nullable
        public T getValue() {
            f<T> fVar = this.f;
            while (true) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    break;
                }
                fVar = fVar2;
            }
            if (fVar.b < this.d.now(this.c) - this.b) {
                return null;
            }
            return fVar.a;
        }

        public void h() {
            long jNow = this.d.now(this.c) - this.b;
            f<T> fVar = this.f;
            while (true) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    if (fVar.a != null) {
                        this.f = new f<>(null, 0L);
                        return;
                    } else {
                        this.f = fVar;
                        return;
                    }
                }
                if (fVar2.b > jNow) {
                    if (fVar.a == null) {
                        this.f = fVar;
                        return;
                    }
                    f<T> fVar3 = new f<>(null, 0L);
                    fVar3.lazySet(fVar.get());
                    this.f = fVar3;
                    return;
                }
                fVar = fVar2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public boolean isDone() {
            return this.i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public int size() {
            return f(e());
        }
    }

    public static final class e<T> implements b<T> {
        public final int a;
        public int b;
        public volatile a<T> c;
        public a<T> d;
        public Throwable e;
        public volatile boolean f;

        public e(int i) {
            this.a = ObjectHelper.verifyPositive(i, SDKConstants.PARAM_CONTEXT_MAX_SIZE);
            a<T> aVar = new a<>(null);
            this.d = aVar;
            this.c = aVar;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void a(T t) {
            a<T> aVar = new a<>(t);
            a<T> aVar2 = this.d;
            this.d = aVar;
            this.b++;
            aVar2.set(aVar);
            e();
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void b() {
            if (this.c.a != null) {
                a<T> aVar = new a<>(null);
                aVar.lazySet(this.c.get());
                this.c = aVar;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public T[] c(T[] tArr) {
            a<T> aVar = this.c;
            a<T> aVar2 = aVar;
            int i = 0;
            while (true) {
                aVar2 = aVar2.get();
                if (aVar2 == null) {
                    break;
                }
                i++;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                aVar = aVar.get();
                tArr[i2] = aVar.a;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void complete() {
            b();
            this.f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = cVar.a;
            a<T> aVar = (a) cVar.c;
            if (aVar == null) {
                aVar = this.c;
            }
            long j = cVar.f;
            int iAddAndGet = 1;
            do {
                long j2 = cVar.d.get();
                while (j != j2) {
                    if (cVar.e) {
                        cVar.c = null;
                        return;
                    }
                    boolean z = this.f;
                    a<T> aVar2 = aVar.get();
                    boolean z2 = aVar2 == null;
                    if (z && z2) {
                        cVar.c = null;
                        cVar.e = true;
                        Throwable th = this.e;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(aVar2.a);
                    j++;
                    aVar = aVar2;
                }
                if (j == j2) {
                    if (cVar.e) {
                        cVar.c = null;
                        return;
                    }
                    if (this.f && aVar.get() == null) {
                        cVar.c = null;
                        cVar.e = true;
                        Throwable th2 = this.e;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                cVar.c = aVar;
                cVar.f = j;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void e() {
            int i = this.b;
            if (i > this.a) {
                this.b = i - 1;
                this.c = this.c.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void error(Throwable th) {
            this.e = th;
            b();
            this.f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public Throwable getError() {
            return this.e;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public T getValue() {
            a<T> aVar = this.c;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    return aVar.a;
                }
                aVar = aVar2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public boolean isDone() {
            return this.f;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public int size() {
            a<T> aVar = this.c;
            int i = 0;
            while (i != Integer.MAX_VALUE && (aVar = aVar.get()) != null) {
                i++;
            }
            return i;
        }
    }

    public static final class f<T> extends AtomicReference<f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T a;
        public final long b;

        public f(T t, long j) {
            this.a = t;
            this.b = j;
        }
    }

    public static final class g<T> implements b<T> {
        public final List<T> a;
        public Throwable b;
        public volatile boolean c;
        public volatile int d;

        public g(int i) {
            this.a = new ArrayList(ObjectHelper.verifyPositive(i, "capacityHint"));
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void a(T t) {
            this.a.add(t);
            this.d++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void b() {
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public T[] c(T[] tArr) {
            int i = this.d;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.a;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void complete() {
            this.c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.a;
            Subscriber<? super T> subscriber = cVar.a;
            Integer num = (Integer) cVar.c;
            int iIntValue = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                cVar.c = 0;
            }
            long j = cVar.f;
            int iAddAndGet = 1;
            do {
                long j2 = cVar.d.get();
                while (j != j2) {
                    if (cVar.e) {
                        cVar.c = null;
                        return;
                    }
                    boolean z = this.c;
                    int i = this.d;
                    if (z && iIntValue == i) {
                        cVar.c = null;
                        cVar.e = true;
                        Throwable th = this.b;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (iIntValue == i) {
                        break;
                    }
                    subscriber.onNext(list.get(iIntValue));
                    iIntValue++;
                    j++;
                }
                if (j == j2) {
                    if (cVar.e) {
                        cVar.c = null;
                        return;
                    }
                    boolean z2 = this.c;
                    int i2 = this.d;
                    if (z2 && iIntValue == i2) {
                        cVar.c = null;
                        cVar.e = true;
                        Throwable th2 = this.b;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                cVar.c = Integer.valueOf(iIntValue);
                cVar.f = j;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public void error(Throwable th) {
            this.b = th;
            this.c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public Throwable getError() {
            return this.b;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        @Nullable
        public T getValue() {
            int i = this.d;
            if (i == 0) {
                return null;
            }
            return this.a.get(i - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public boolean isDone() {
            return this.c;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public int size() {
            return this.d;
        }
    }

    public ReplayProcessor(b<T> bVar) {
        this.b = bVar;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create() {
        return new ReplayProcessor<>(new g(16));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithSize(int i) {
        return new ReplayProcessor<>(new e(i));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplayProcessor<>(new d(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTimeAndSize(long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return new ReplayProcessor<>(new d(i, j, timeUnit, scheduler));
    }

    public static <T> ReplayProcessor<T> f() {
        return new ReplayProcessor<>(new e(Integer.MAX_VALUE));
    }

    public void cleanupBuffer() {
        this.b.b();
    }

    public boolean e(c<T> cVar) {
        c<T>[] cVarArr;
        c<T>[] cVarArr2;
        do {
            cVarArr = this.d.get();
            if (cVarArr == g) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!this.d.compareAndSet(cVarArr, cVarArr2));
        return true;
    }

    public void g(c<T> cVar) {
        c<T>[] cVarArr;
        c<T>[] cVarArr2;
        do {
            cVarArr = this.d.get();
            if (cVarArr == g || cVarArr == f) {
                return;
            }
            int length = cVarArr.length;
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (cVarArr[i2] == cVar) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cVarArr2 = f;
            } else {
                c<T>[] cVarArr3 = new c[length - 1];
                System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                cVarArr2 = cVarArr3;
            }
        } while (!this.d.compareAndSet(cVarArr, cVarArr2));
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        b<T> bVar = this.b;
        if (bVar.isDone()) {
            return bVar.getError();
        }
        return null;
    }

    public T getValue() {
        return this.b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = e;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    public int h() {
        return this.b.size();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        b<T> bVar = this.b;
        return bVar.isDone() && bVar.getError() == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.d.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        b<T> bVar = this.b;
        return bVar.isDone() && bVar.getError() != null;
    }

    public boolean hasValue() {
        return this.b.size() != 0;
    }

    public int i() {
        return this.d.get().length;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.c) {
            return;
        }
        this.c = true;
        b<T> bVar = this.b;
        bVar.complete();
        for (c<T> cVar : this.d.getAndSet(g)) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.c) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.c = true;
        b<T> bVar = this.b;
        bVar.error(th);
        for (c<T> cVar : this.d.getAndSet(g)) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.c) {
            return;
        }
        b<T> bVar = this.b;
        bVar.a(t);
        for (c<T> cVar : this.d.get()) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.c) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        c<T> cVar = new c<>(subscriber, this);
        subscriber.onSubscribe(cVar);
        if (e(cVar) && cVar.e) {
            g(cVar);
        } else {
            this.b.d(cVar);
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create(int i) {
        return new ReplayProcessor<>(new g(i));
    }

    public T[] getValues(T[] tArr) {
        return this.b.c(tArr);
    }
}
