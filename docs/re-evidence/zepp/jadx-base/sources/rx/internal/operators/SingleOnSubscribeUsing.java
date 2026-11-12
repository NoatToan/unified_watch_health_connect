package rx.internal.operators;

import java.util.Arrays;
import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleOnSubscribeUsing<T, Resource> implements Single.OnSubscribe<T> {
    public final Func0<Resource> a;
    public final Func1<? super Resource, ? extends Single<? extends T>> b;
    public final Action1<? super Resource> c;
    public final boolean d;

    public class a extends SingleSubscriber<T> {
        public final /* synthetic */ Object b;
        public final /* synthetic */ SingleSubscriber c;

        public a(Object obj, SingleSubscriber singleSubscriber) {
            this.b = obj;
            this.c = singleSubscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            SingleOnSubscribeUsing.this.a(this.c, this.b, th);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            SingleOnSubscribeUsing singleOnSubscribeUsing = SingleOnSubscribeUsing.this;
            if (singleOnSubscribeUsing.d) {
                try {
                    singleOnSubscribeUsing.c.call((Object) this.b);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.c.onError(th);
                    return;
                }
            }
            this.c.onSuccess(t);
            SingleOnSubscribeUsing singleOnSubscribeUsing2 = SingleOnSubscribeUsing.this;
            if (singleOnSubscribeUsing2.d) {
                return;
            }
            try {
                singleOnSubscribeUsing2.c.call((Object) this.b);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaHooks.onError(th2);
            }
        }
    }

    public SingleOnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        this.a = func0;
        this.b = func1;
        this.c = action1;
        this.d = z;
    }

    public void a(SingleSubscriber<? super T> singleSubscriber, Resource resource, Throwable th) {
        Exceptions.throwIfFatal(th);
        if (this.d) {
            try {
                this.c.call(resource);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                th = new CompositeException(Arrays.asList(th, th2));
            }
        }
        singleSubscriber.onError(th);
        if (this.d) {
            return;
        }
        try {
            this.c.call(resource);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaHooks.onError(th3);
        }
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        try {
            Resource resourceCall = this.a.call();
            try {
                Single<? extends T> singleCall = this.b.call(resourceCall);
                if (singleCall == null) {
                    a(singleSubscriber, resourceCall, new NullPointerException("The single"));
                    return;
                }
                a aVar = new a(resourceCall, singleSubscriber);
                singleSubscriber.add(aVar);
                singleCall.subscribe(aVar);
            } catch (Throwable th) {
                a(singleSubscriber, resourceCall, th);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            singleSubscriber.onError(th2);
        }
    }
}
