package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.AssemblyStackTraceException;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeOnAssemblySingle<T> implements Single.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;
    public final Single.OnSubscribe<T> a;
    public final String b = OnSubscribeOnAssembly.a();

    public static final class a<T> extends SingleSubscriber<T> {
        public final SingleSubscriber<? super T> b;
        public final String c;

        public a(SingleSubscriber<? super T> singleSubscriber, String str) {
            this.b = singleSubscriber;
            this.c = str;
            singleSubscriber.add(this);
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            new AssemblyStackTraceException(this.c).attachTo(th);
            this.b.onError(th);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.b.onSuccess(t);
        }
    }

    public OnSubscribeOnAssemblySingle(Single.OnSubscribe<T> onSubscribe) {
        this.a = onSubscribe;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        this.a.call((T) new a(singleSubscriber, this.b));
    }
}
