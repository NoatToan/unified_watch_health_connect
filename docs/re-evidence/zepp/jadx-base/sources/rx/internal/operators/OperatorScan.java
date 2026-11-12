package rx.internal.operators;

import defpackage.a04;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func2;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorScan<R, T> implements Observable.Operator<R, T> {
    private static final Object c = new Object();
    private final Func0<R> a;
    public final Func2<R, ? super T, R> b;

    public class a implements Func0<R> {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public R call() {
            return (R) this.a;
        }
    }

    public class b extends Subscriber<T> {
        public boolean f;
        public R g;
        public final /* synthetic */ Subscriber h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.h = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.h.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.h.onError(th);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // rx.Observer
        public void onNext(T t) {
            if (this.f) {
                try {
                    t = OperatorScan.this.b.call(this.g, t);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this.h, t);
                    return;
                }
            } else {
                this.f = true;
            }
            this.g = (R) t;
            this.h.onNext(t);
        }
    }

    public class c extends Subscriber<T> {
        private R f;
        public final /* synthetic */ Object g;
        public final /* synthetic */ d h;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, d dVar) {
            this.g = obj;
            this.h = dVar;
            this.f = obj;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.h.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.h.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                R rCall = OperatorScan.this.b.call(this.f, t);
                this.f = rCall;
                this.h.onNext(rCall);
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this, t);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.h.setProducer(producer);
        }
    }

    public static final class d<R> implements Producer, Observer<R> {
        public final Subscriber<? super R> a;
        public final Queue<Object> b;
        public boolean c;
        public boolean d;
        public long e;
        public final AtomicLong f;
        public volatile Producer g;
        public volatile boolean h;
        public Throwable i;

        public d(R r, Subscriber<? super R> subscriber) {
            this.a = subscriber;
            Queue<Object> spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new SpscLinkedAtomicQueue<>();
            this.b = spscLinkedQueue;
            spscLinkedQueue.offer(NotificationLite.next(r));
            this.f = new AtomicLong();
        }

        public boolean a(boolean z, boolean z2, Subscriber<? super R> subscriber) {
            if (subscriber.isUnsubscribed()) {
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.i;
            if (th != null) {
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        public void b() {
            synchronized (this) {
                if (this.c) {
                    this.d = true;
                } else {
                    this.c = true;
                    c();
                }
            }
        }

        public void c() {
            Subscriber<? super R> subscriber = this.a;
            Queue<Object> queue = this.b;
            AtomicLong atomicLong = this.f;
            long jProduced = atomicLong.get();
            while (!a(this.h, queue.isEmpty(), subscriber)) {
                long j = 0;
                while (j != jProduced) {
                    boolean z = this.h;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (a(z, z2, subscriber)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    a04 a04Var = (Object) NotificationLite.getValue(objPoll);
                    try {
                        subscriber.onNext(a04Var);
                        j++;
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, subscriber, a04Var);
                        return;
                    }
                }
                if (j != 0 && jProduced != Long.MAX_VALUE) {
                    jProduced = BackpressureUtils.produced(atomicLong, j);
                }
                synchronized (this) {
                    if (!this.d) {
                        this.c = false;
                        return;
                    }
                    this.d = false;
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.h = true;
            b();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.i = th;
            this.h = true;
            b();
        }

        @Override // rx.Observer
        public void onNext(R r) {
            this.b.offer(NotificationLite.next(r));
            b();
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
            if (j != 0) {
                BackpressureUtils.getAndAddRequest(this.f, j);
                Producer producer = this.g;
                if (producer == null) {
                    synchronized (this.f) {
                        producer = this.g;
                        if (producer == null) {
                            this.e = BackpressureUtils.addCap(this.e, j);
                        }
                    }
                }
                if (producer != null) {
                    producer.request(j);
                }
                b();
            }
        }

        public void setProducer(Producer producer) {
            long j;
            Objects.requireNonNull(producer);
            synchronized (this.f) {
                if (this.g != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                j = this.e;
                if (j != Long.MAX_VALUE) {
                    j--;
                }
                this.e = 0L;
                this.g = producer;
            }
            if (j > 0) {
                producer.request(j);
            }
            b();
        }
    }

    public OperatorScan(R r, Func2<R, ? super T, R> func2) {
        this((Func0) new a(r), (Func2) func2);
    }

    public OperatorScan(Func0<R> func0, Func2<R, ? super T, R> func2) {
        this.a = func0;
        this.b = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        R rCall = this.a.call();
        if (rCall == c) {
            return new b(subscriber, subscriber);
        }
        d dVar = new d(rCall, subscriber);
        c cVar = new c(rCall, dVar);
        subscriber.add(cVar);
        subscriber.setProducer(dVar);
        return cVar;
    }

    public OperatorScan(Func2<R, ? super T, R> func2) {
        this(c, func2);
    }
}
