package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Scheduler;
import rx.Single;
import rx.SingleSubscriber;
import rx.functions.Action0;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleTimeout<T> implements Single.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final Single.OnSubscribe<? extends T> e;

    public static final class a<T> extends SingleSubscriber<T> implements Action0 {
        public final SingleSubscriber<? super T> b;
        public final AtomicBoolean c = new AtomicBoolean();
        public final Single.OnSubscribe<? extends T> d;

        /* JADX INFO: renamed from: rx.internal.operators.SingleTimeout$a$a, reason: collision with other inner class name */
        public static final class C1259a<T> extends SingleSubscriber<T> {
            public final SingleSubscriber<? super T> b;

            public C1259a(SingleSubscriber<? super T> singleSubscriber) {
                this.b = singleSubscriber;
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                this.b.onError(th);
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(T t) {
                this.b.onSuccess(t);
            }
        }

        public a(SingleSubscriber<? super T> singleSubscriber, Single.OnSubscribe<? extends T> onSubscribe) {
            this.b = singleSubscriber;
            this.d = onSubscribe;
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.c.compareAndSet(false, true)) {
                try {
                    Single.OnSubscribe<? extends T> onSubscribe = this.d;
                    if (onSubscribe == null) {
                        this.b.onError(new TimeoutException());
                    } else {
                        C1259a c1259a = new C1259a(this.b);
                        this.b.add(c1259a);
                        onSubscribe.call(c1259a);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            if (!this.c.compareAndSet(false, true)) {
                RxJavaHooks.onError(th);
                return;
            }
            try {
                this.b.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            if (this.c.compareAndSet(false, true)) {
                try {
                    this.b.onSuccess(t);
                } finally {
                    unsubscribe();
                }
            }
        }
    }

    public SingleTimeout(Single.OnSubscribe<T> onSubscribe, long j, TimeUnit timeUnit, Scheduler scheduler, Single.OnSubscribe<? extends T> onSubscribe2) {
        this.a = onSubscribe;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = onSubscribe2;
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
    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber, this.e);
        Scheduler.Worker workerCreateWorker = this.d.createWorker();
        aVar.add(workerCreateWorker);
        singleSubscriber.add(aVar);
        workerCreateWorker.schedule(aVar, this.b, this.c);
        this.a.call(aVar);
    }
}
