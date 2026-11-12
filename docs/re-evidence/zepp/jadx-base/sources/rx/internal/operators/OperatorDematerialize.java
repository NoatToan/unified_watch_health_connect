package rx.internal.operators;

import rx.Notification;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorDematerialize<T> implements Observable.Operator<T, Notification<T>> {

    public class a extends Subscriber<Notification<T>> {
        public boolean f;
        public final /* synthetic */ Subscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.g = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.g.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.g.onError(th);
        }

        @Override // rx.Observer
        public void onNext(Notification<T> notification) {
            int i = b.a[notification.getKind().ordinal()];
            if (i == 1) {
                if (this.f) {
                    return;
                }
                this.g.onNext(notification.getValue());
            } else {
                if (i == 2) {
                    onError(notification.getThrowable());
                    return;
                }
                if (i == 3) {
                    onCompleted();
                    return;
                }
                onError(new IllegalArgumentException("Unsupported notification type: " + notification));
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Notification.Kind.values().length];
            a = iArr;
            try {
                iArr[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class c {
        public static final OperatorDematerialize<Object> a = new OperatorDematerialize<>();
    }

    public static OperatorDematerialize instance() {
        return c.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super Notification<T>> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
