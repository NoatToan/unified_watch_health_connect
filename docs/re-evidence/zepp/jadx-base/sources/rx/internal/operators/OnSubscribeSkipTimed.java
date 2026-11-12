package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeSkipTimed<T> implements Observable.OnSubscribe<T> {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;
    public final Observable<T> d;

    public static final class a<T> extends Subscriber<T> implements Action0 {
        public final Subscriber<? super T> f;
        public volatile boolean g;

        public a(Subscriber<? super T> subscriber) {
            this.f = subscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            this.g = true;
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                this.f.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            try {
                this.f.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.g) {
                this.f.onNext(t);
            }
        }
    }

    public OnSubscribeSkipTimed(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.d = observable;
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
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
    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.c.createWorker();
        a aVar = new a(subscriber);
        aVar.add(workerCreateWorker);
        subscriber.add(aVar);
        workerCreateWorker.schedule(aVar, this.a, this.b);
        this.d.unsafeSubscribe(aVar);
    }
}
