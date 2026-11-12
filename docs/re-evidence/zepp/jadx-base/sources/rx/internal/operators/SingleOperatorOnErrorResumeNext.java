package rx.internal.operators;

import java.util.Objects;
import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleOperatorOnErrorResumeNext<T> implements Single.OnSubscribe<T> {
    private final Single<? extends T> a;
    public final Func1<Throwable, ? extends Single<? extends T>> b;

    public static class a implements Func1<Throwable, Single<? extends T>> {
        public final /* synthetic */ Single a;

        public a(Single single) {
            this.a = single;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Single<? extends T> call(Throwable th) {
            return this.a;
        }
    }

    public class b extends SingleSubscriber<T> {
        public final /* synthetic */ SingleSubscriber b;

        public b(SingleSubscriber singleSubscriber) {
            this.b = singleSubscriber;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            try {
                SingleOperatorOnErrorResumeNext.this.b.call(th).subscribe(this.b);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, (SingleSubscriber<?>) this.b);
            }
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.b.onSuccess(t);
        }
    }

    private SingleOperatorOnErrorResumeNext(Single<? extends T> single, Func1<Throwable, ? extends Single<? extends T>> func1) {
        Objects.requireNonNull(single, "originalSingle must not be null");
        Objects.requireNonNull(func1, "resumeFunctionInCaseOfError must not be null");
        this.a = single;
        this.b = func1;
    }

    public static <T> SingleOperatorOnErrorResumeNext<T> withFunction(Single<? extends T> single, Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new SingleOperatorOnErrorResumeNext<>(single, func1);
    }

    public static <T> SingleOperatorOnErrorResumeNext<T> withOther(Single<? extends T> single, Single<? extends T> single2) {
        Objects.requireNonNull(single2, "resumeSingleInCaseOfError must not be null");
        return new SingleOperatorOnErrorResumeNext<>(single, new a(single2));
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        b bVar = new b(singleSubscriber);
        singleSubscriber.add(bVar);
        this.a.subscribe(bVar);
    }
}
