package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.observers.Subscribers;
import rx.subjects.PublishSubject;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorDelayWithSelector<T, V> implements Observable.Operator<T, T> {
    public final Observable<? extends T> a;
    public final Func1<? super T, ? extends Observable<V>> b;

    public class a extends Subscriber<T> {
        public final /* synthetic */ PublishSubject f;
        public final /* synthetic */ SerializedSubscriber g;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorDelayWithSelector$a$a, reason: collision with other inner class name */
        public class C1245a implements Func1<V, T> {
            public final /* synthetic */ Object a;

            public C1245a(Object obj) {
                this.a = obj;
            }

            @Override // rx.functions.Func1
            public T call(V v) {
                return (T) this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, PublishSubject publishSubject, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.f = publishSubject;
            this.g = serializedSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            try {
                this.f.onNext(OperatorDelayWithSelector.this.b.call(t).take(1).defaultIfEmpty(null).map(new C1245a(t)));
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this);
            }
        }
    }

    public OperatorDelayWithSelector(Observable<? extends T> observable, Func1<? super T, ? extends Observable<V>> func1) {
        this.a = observable;
        this.b = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        PublishSubject publishSubjectCreate = PublishSubject.create();
        subscriber.add(Observable.merge(publishSubjectCreate).unsafeSubscribe(Subscribers.from(serializedSubscriber)));
        return new a(subscriber, publishSubjectCreate, serializedSubscriber);
    }
}
