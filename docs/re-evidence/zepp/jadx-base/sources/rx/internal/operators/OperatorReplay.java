package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.internal.util.OpenHashSet;
import rx.observables.ConnectableObservable;
import rx.schedulers.Timestamped;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorReplay<T> extends ConnectableObservable<T> implements Subscription {
    public static final Func0 e = new a();
    public final Observable<? extends T> b;
    public final AtomicReference<l<T>> c;
    public final Func0<? extends k<T>> d;

    public static class a implements Func0 {
        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public Object call() {
            return new o(16);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class b<R> implements Observable.OnSubscribe<R> {
        public final /* synthetic */ Func0 a;
        public final /* synthetic */ Func1 b;

        public class a implements Action1<Subscription> {
            public final /* synthetic */ Subscriber a;

            public a(Subscriber subscriber) {
                this.a = subscriber;
            }

            @Override // rx.functions.Action1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Subscription subscription) {
                this.a.add(subscription);
            }
        }

        public b(Func0 func0, Func1 func1) {
            this.a = func0;
            this.b = func1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super R> subscriber) {
            try {
                ConnectableObservable connectableObservable = (ConnectableObservable) this.a.call();
                ((Observable) this.b.call(connectableObservable)).subscribe((Subscriber) subscriber);
                connectableObservable.connect(new a(subscriber));
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber);
            }
        }
    }

    public static class c implements Observable.OnSubscribe<T> {
        public final /* synthetic */ Observable a;

        public class a extends Subscriber<T> {
            public final /* synthetic */ Subscriber f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Subscriber subscriber, Subscriber subscriber2) {
                super(subscriber);
                this.f = subscriber2;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.f.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.f.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                this.f.onNext(t);
            }
        }

        public c(Observable observable) {
            this.a = observable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            this.a.unsafeSubscribe(new a(subscriber, subscriber));
        }
    }

    public static class d extends ConnectableObservable<T> {
        public final /* synthetic */ ConnectableObservable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Observable.OnSubscribe onSubscribe, ConnectableObservable connectableObservable) {
            super(onSubscribe);
            this.b = connectableObservable;
        }

        @Override // rx.observables.ConnectableObservable
        public void connect(Action1<? super Subscription> action1) {
            this.b.connect(action1);
        }
    }

    public static class e implements Func0<k<T>> {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k<T> call() {
            return new n(this.a);
        }
    }

    public static class f implements Func0<k<T>> {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Scheduler c;

        public f(int i, long j, Scheduler scheduler) {
            this.a = i;
            this.b = j;
            this.c = scheduler;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k<T> call() {
            return new m(this.a, this.b, this.c);
        }
    }

    public static class g implements Observable.OnSubscribe<T> {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ Func0 b;

        public g(AtomicReference atomicReference, Func0 func0) {
            this.a = atomicReference;
            this.b = func0;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            l lVar;
            l lVar2;
            do {
                lVar = (l) this.a.get();
                if (lVar == null) {
                    lVar2 = new l((k) this.b.call());
                    lVar2.d();
                }
                i<T> iVar = new i<>(lVar, subscriber);
                lVar.b(iVar);
                subscriber.add(iVar);
                lVar.f.b(iVar);
                subscriber.setProducer(iVar);
            } while (!this.a.compareAndSet(lVar, lVar2));
            lVar = lVar2;
            i<T> iVar2 = new i<>(lVar, subscriber);
            lVar.b(iVar2);
            subscriber.add(iVar2);
            lVar.f.b(iVar2);
            subscriber.setProducer(iVar2);
        }
    }

    public static class h<T> extends AtomicReference<j> implements k<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public j a;
        public int b;
        public long c;

        public h() {
            j jVar = new j(null, 0L);
            this.a = jVar;
            set(jVar);
        }

        @Override // rx.internal.operators.OperatorReplay.k
        public final void a(T t) {
            Object objF = f(NotificationLite.next(t));
            long j = this.c + 1;
            this.c = j;
            c(new j(objF, j));
            o();
        }

        @Override // rx.internal.operators.OperatorReplay.k
        public final void b(i<T> iVar) {
            Subscriber<? super T> subscriber;
            j jVar;
            synchronized (iVar) {
                if (iVar.e) {
                    iVar.f = true;
                    return;
                }
                iVar.e = true;
                while (!iVar.isUnsubscribed()) {
                    j jVarG = (j) iVar.b();
                    if (jVarG == null) {
                        jVarG = g();
                        iVar.c = jVarG;
                        iVar.a(jVarG.b);
                    }
                    if (iVar.isUnsubscribed() || (subscriber = iVar.b) == null) {
                        return;
                    }
                    long j = iVar.get();
                    long j2 = 0;
                    while (j2 != j && (jVar = jVarG.get()) != null) {
                        Object objJ = j(jVar.a);
                        try {
                            if (NotificationLite.accept(subscriber, objJ)) {
                                iVar.c = null;
                                return;
                            }
                            j2++;
                            if (iVar.isUnsubscribed()) {
                                return;
                            } else {
                                jVarG = jVar;
                            }
                        } catch (Throwable th) {
                            iVar.c = null;
                            Exceptions.throwIfFatal(th);
                            iVar.unsubscribe();
                            if (NotificationLite.isError(objJ) || NotificationLite.isCompleted(objJ)) {
                                return;
                            }
                            subscriber.onError(OnErrorThrowable.addValueAsLastCause(th, NotificationLite.getValue(objJ)));
                            return;
                        }
                    }
                    if (j2 != 0) {
                        iVar.c = jVarG;
                        if (j != Long.MAX_VALUE) {
                            iVar.c(j2);
                        }
                    }
                    synchronized (iVar) {
                        if (!iVar.f) {
                            iVar.e = false;
                            return;
                        }
                        iVar.f = false;
                    }
                }
            }
        }

        public final void c(j jVar) {
            this.a.set(jVar);
            this.a = jVar;
            this.b++;
        }

        @Override // rx.internal.operators.OperatorReplay.k
        public final void complete() {
            Object objF = f(NotificationLite.completed());
            long j = this.c + 1;
            this.c = j;
            c(new j(objF, j));
            p();
        }

        public final void e(Collection<? super T> collection) {
            j jVarG = g();
            while (true) {
                jVarG = jVarG.get();
                if (jVarG == null) {
                    return;
                }
                Object objJ = j(jVarG.a);
                if (NotificationLite.isCompleted(objJ) || NotificationLite.isError(objJ)) {
                    return;
                } else {
                    collection.add((Object) NotificationLite.getValue(objJ));
                }
            }
        }

        @Override // rx.internal.operators.OperatorReplay.k
        public final void error(Throwable th) {
            Object objF = f(NotificationLite.error(th));
            long j = this.c + 1;
            this.c = j;
            c(new j(objF, j));
            p();
        }

        public Object f(Object obj) {
            return obj;
        }

        public j g() {
            return get();
        }

        public boolean h() {
            Object obj = this.a.a;
            return obj != null && NotificationLite.isCompleted(j(obj));
        }

        public boolean i() {
            Object obj = this.a.a;
            return obj != null && NotificationLite.isError(j(obj));
        }

        public Object j(Object obj) {
            return obj;
        }

        public final void k() {
            j jVar = get().get();
            if (jVar == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.b--;
            n(jVar);
        }

        public final void m(int i) {
            j jVar = get();
            while (i > 0) {
                jVar = jVar.get();
                i--;
                this.b--;
            }
            n(jVar);
        }

        public final void n(j jVar) {
            set(jVar);
        }

        public void o() {
        }

        public void p() {
        }
    }

    public static final class i<T> extends AtomicLong implements Producer, Subscription {
        public static final long g = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        public final l<T> a;
        public Subscriber<? super T> b;
        public Object c;
        public final AtomicLong d = new AtomicLong();
        public boolean e;
        public boolean f;

        public i(l<T> lVar, Subscriber<? super T> subscriber) {
            this.a = lVar;
            this.b = subscriber;
        }

        public void a(long j) {
            long j2;
            long j3;
            do {
                j2 = this.d.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!this.d.compareAndSet(j2, j3));
        }

        public <U> U b() {
            return (U) this.c;
        }

        public long c(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j3 = j2 - j;
                if (j3 < 0) {
                    throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Producer
        public void request(long j) {
            long j2;
            long j3;
            if (j < 0) {
                return;
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
                if (j2 >= 0 && j == 0) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j2, j3));
            a(j);
            this.a.f(this);
            this.a.f.b(this);
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.a.g(this);
            this.a.f(this);
            this.b = null;
        }
    }

    public static final class j extends AtomicReference<j> {
        private static final long serialVersionUID = 245354315435971818L;
        public final Object a;
        public final long b;

        public j(Object obj, long j) {
            this.a = obj;
            this.b = j;
        }
    }

    public interface k<T> {
        void a(T t);

        void b(i<T> iVar);

        void complete();

        void error(Throwable th);
    }

    public static final class l<T> extends Subscriber<T> implements Subscription {
        public static final i[] u = new i[0];
        public static final i[] v = new i[0];
        public final k<T> f;
        public boolean g;
        public volatile boolean h;
        public volatile long k;
        public long l;
        public boolean n;
        public boolean o;
        public long p;
        public long q;
        public volatile Producer r;
        public List<i<T>> s;
        public boolean t;
        public final OpenHashSet<i<T>> i = new OpenHashSet<>();
        public i<T>[] j = u;
        public final AtomicBoolean m = new AtomicBoolean();

        public class a implements Action0 {
            public a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                if (l.this.h) {
                    return;
                }
                synchronized (l.this.i) {
                    if (!l.this.h) {
                        l.this.i.terminate();
                        l.this.k++;
                        l.this.h = true;
                    }
                }
            }
        }

        public l(k<T> kVar) {
            this.f = kVar;
            request(0L);
        }

        public boolean b(i<T> iVar) {
            Objects.requireNonNull(iVar);
            if (this.h) {
                return false;
            }
            synchronized (this.i) {
                if (this.h) {
                    return false;
                }
                this.i.add(iVar);
                this.k++;
                return true;
            }
        }

        public i<T>[] c() {
            i<T>[] iVarArr;
            synchronized (this.i) {
                i<T>[] iVarArrValues = this.i.values();
                int length = iVarArrValues.length;
                iVarArr = new i[length];
                System.arraycopy(iVarArrValues, 0, iVarArr, 0, length);
            }
            return iVarArr;
        }

        public void d() {
            add(Subscriptions.create(new a()));
        }

        public void e(long j, long j2) {
            long j3 = this.q;
            Producer producer = this.r;
            long j4 = j - j2;
            if (j4 == 0) {
                if (j3 == 0 || producer == null) {
                    return;
                }
                this.q = 0L;
                producer.request(j3);
                return;
            }
            this.p = j;
            if (producer == null) {
                long j5 = j3 + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.q = j5;
                return;
            }
            if (j3 == 0) {
                producer.request(j4);
            } else {
                this.q = 0L;
                producer.request(j3 + j4);
            }
        }

        public void f(i<T> iVar) {
            long jMax;
            List<i<T>> list;
            boolean z;
            long jMax2;
            if (isUnsubscribed()) {
                return;
            }
            synchronized (this) {
                if (this.n) {
                    if (iVar != null) {
                        List arrayList = this.s;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.s = arrayList;
                        }
                        arrayList.add(iVar);
                    } else {
                        this.t = true;
                    }
                    this.o = true;
                    return;
                }
                this.n = true;
                long j = this.p;
                if (iVar != null) {
                    jMax = Math.max(j, iVar.d.get());
                } else {
                    long jMax3 = j;
                    for (i<T> iVar2 : c()) {
                        if (iVar2 != null) {
                            jMax3 = Math.max(jMax3, iVar2.d.get());
                        }
                    }
                    jMax = jMax3;
                }
                e(jMax, j);
                while (!isUnsubscribed()) {
                    synchronized (this) {
                        if (!this.o) {
                            this.n = false;
                            return;
                        }
                        this.o = false;
                        list = this.s;
                        this.s = null;
                        z = this.t;
                        this.t = false;
                    }
                    long j2 = this.p;
                    if (list != null) {
                        Iterator<i<T>> it2 = list.iterator();
                        jMax2 = j2;
                        while (it2.hasNext()) {
                            jMax2 = Math.max(jMax2, it2.next().d.get());
                        }
                    } else {
                        jMax2 = j2;
                    }
                    if (z) {
                        for (i<T> iVar3 : c()) {
                            if (iVar3 != null) {
                                jMax2 = Math.max(jMax2, iVar3.d.get());
                            }
                        }
                    }
                    e(jMax2, j2);
                }
            }
        }

        public void g(i<T> iVar) {
            if (this.h) {
                return;
            }
            synchronized (this.i) {
                if (this.h) {
                    return;
                }
                this.i.remove(iVar);
                if (this.i.isEmpty()) {
                    this.j = u;
                }
                this.k++;
            }
        }

        public void h() {
            i<T>[] iVarArr = this.j;
            if (this.l != this.k) {
                synchronized (this.i) {
                    iVarArr = this.j;
                    i<T>[] iVarArrValues = this.i.values();
                    int length = iVarArrValues.length;
                    if (iVarArr.length != length) {
                        iVarArr = new i[length];
                        this.j = iVarArr;
                    }
                    System.arraycopy(iVarArrValues, 0, iVarArr, 0, length);
                    this.l = this.k;
                }
            }
            k<T> kVar = this.f;
            for (i<T> iVar : iVarArr) {
                if (iVar != null) {
                    kVar.b(iVar);
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.g) {
                return;
            }
            this.g = true;
            try {
                this.f.complete();
                h();
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.g) {
                return;
            }
            this.g = true;
            try {
                this.f.error(th);
                h();
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.g) {
                return;
            }
            this.f.a(t);
            h();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (this.r != null) {
                throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
            }
            this.r = producer;
            f(null);
            h();
        }
    }

    public static final class m<T> extends h<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final Scheduler d;
        public final long e;
        public final int f;

        public m(int i, long j, Scheduler scheduler) {
            this.d = scheduler;
            this.f = i;
            this.e = j;
        }

        @Override // rx.internal.operators.OperatorReplay.h
        public Object f(Object obj) {
            return new Timestamped(this.d.now(), obj);
        }

        @Override // rx.internal.operators.OperatorReplay.h
        public j g() {
            j jVar;
            long jNow = this.d.now() - this.e;
            j jVar2 = get();
            j jVar3 = jVar2.get();
            while (true) {
                j jVar4 = jVar3;
                jVar = jVar2;
                jVar2 = jVar4;
                if (jVar2 == null) {
                    break;
                }
                Object obj = jVar2.a;
                Object objJ = j(obj);
                if (NotificationLite.isCompleted(objJ) || NotificationLite.isError(objJ) || ((Timestamped) obj).getTimestampMillis() > jNow) {
                    break;
                }
                jVar3 = jVar2.get();
            }
            return jVar;
        }

        @Override // rx.internal.operators.OperatorReplay.h
        public Object j(Object obj) {
            return ((Timestamped) obj).getValue();
        }

        @Override // rx.internal.operators.OperatorReplay.h
        public void o() {
            j jVar;
            long jNow = this.d.now() - this.e;
            j jVar2 = get();
            j jVar3 = jVar2.get();
            int i = 0;
            while (true) {
                j jVar4 = jVar3;
                jVar = jVar2;
                jVar2 = jVar4;
                if (jVar2 != null) {
                    int i2 = this.b;
                    if (i2 <= this.f) {
                        if (((Timestamped) jVar2.a).getTimestampMillis() > jNow) {
                            break;
                        }
                        i++;
                        this.b--;
                        jVar3 = jVar2.get();
                    } else {
                        i++;
                        this.b = i2 - 1;
                        jVar3 = jVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                n(jVar);
            }
        }

        @Override // rx.internal.operators.OperatorReplay.h
        public void p() {
            j jVar;
            long jNow = this.d.now() - this.e;
            j jVar2 = get();
            j jVar3 = jVar2.get();
            int i = 0;
            while (true) {
                j jVar4 = jVar3;
                jVar = jVar2;
                jVar2 = jVar4;
                if (jVar2 == null || this.b <= 1 || ((Timestamped) jVar2.a).getTimestampMillis() > jNow) {
                    break;
                }
                i++;
                this.b--;
                jVar3 = jVar2.get();
            }
            if (i != 0) {
                n(jVar);
            }
        }
    }

    public static final class n<T> extends h<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int d;

        public n(int i) {
            this.d = i;
        }

        @Override // rx.internal.operators.OperatorReplay.h
        public void o() {
            if (this.b > this.d) {
                k();
            }
        }
    }

    public static final class o<T> extends ArrayList<Object> implements k<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int a;

        public o(int i) {
            super(i);
        }

        @Override // rx.internal.operators.OperatorReplay.k
        public void a(T t) {
            add(NotificationLite.next(t));
            this.a++;
        }

        @Override // rx.internal.operators.OperatorReplay.k
        public void b(i<T> iVar) {
            synchronized (iVar) {
                if (iVar.e) {
                    iVar.f = true;
                    return;
                }
                iVar.e = true;
                while (!iVar.isUnsubscribed()) {
                    int i = this.a;
                    Integer num = (Integer) iVar.b();
                    int iIntValue = num != null ? num.intValue() : 0;
                    Subscriber<? super T> subscriber = iVar.b;
                    if (subscriber == null) {
                        return;
                    }
                    long j = iVar.get();
                    long j2 = 0;
                    while (j2 != j && iIntValue < i) {
                        Object obj = get(iIntValue);
                        try {
                            if (NotificationLite.accept(subscriber, obj) || iVar.isUnsubscribed()) {
                                return;
                            }
                            iIntValue++;
                            j2++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            iVar.unsubscribe();
                            if (NotificationLite.isError(obj) || NotificationLite.isCompleted(obj)) {
                                return;
                            }
                            subscriber.onError(OnErrorThrowable.addValueAsLastCause(th, NotificationLite.getValue(obj)));
                            return;
                        }
                    }
                    if (j2 != 0) {
                        iVar.c = Integer.valueOf(iIntValue);
                        if (j != Long.MAX_VALUE) {
                            iVar.c(j2);
                        }
                    }
                    synchronized (iVar) {
                        if (!iVar.f) {
                            iVar.e = false;
                            return;
                        }
                        iVar.f = false;
                    }
                }
            }
        }

        @Override // rx.internal.operators.OperatorReplay.k
        public void complete() {
            add(NotificationLite.completed());
            this.a++;
        }

        @Override // rx.internal.operators.OperatorReplay.k
        public void error(Throwable th) {
            add(NotificationLite.error(th));
            this.a++;
        }
    }

    private OperatorReplay(Observable.OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<l<T>> atomicReference, Func0<? extends k<T>> func0) {
        super(onSubscribe);
        this.b = observable;
        this.c = atomicReference;
        this.d = func0;
    }

    public static <T> ConnectableObservable<T> c(Observable<? extends T> observable, Func0<? extends k<T>> func0) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new g(atomicReference, func0), observable, atomicReference, func0);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        return c(observable, e);
    }

    public static <T, U, R> Observable<R> multicastSelector(Func0<? extends ConnectableObservable<U>> func0, Func1<? super Observable<U>, ? extends Observable<R>> func1) {
        return Observable.unsafeCreate(new b(func0, func1));
    }

    public static <T> ConnectableObservable<T> observeOn(ConnectableObservable<T> connectableObservable, Scheduler scheduler) {
        return new d(new c(connectableObservable.observeOn(scheduler)), connectableObservable);
    }

    @Override // rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        l<T> lVar;
        while (true) {
            lVar = this.c.get();
            if (lVar != null && !lVar.isUnsubscribed()) {
                break;
            }
            l<T> lVar2 = new l<>(this.d.call());
            lVar2.d();
            if (this.c.compareAndSet(lVar, lVar2)) {
                lVar = lVar2;
                break;
            }
        }
        boolean z = !lVar.m.get() && lVar.m.compareAndSet(false, true);
        action1.call(lVar);
        if (z) {
            this.b.unsafeSubscribe(lVar);
        }
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        l<T> lVar = this.c.get();
        return lVar == null || lVar.isUnsubscribed();
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.c.lazySet(null);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, int i2) {
        return i2 == Integer.MAX_VALUE ? create(observable) : c(observable, new e(i2));
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return create(observable, j2, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, long j2, TimeUnit timeUnit, Scheduler scheduler, int i2) {
        return c(observable, new f(i2, timeUnit.toMillis(j2), scheduler));
    }
}
