package com.huami.watch.util;

import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Timed;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class RxComboClick {
    private static final String d = "Util-RxComboClick";
    private static final long e = 300;
    private static final int f = 2;
    private final long a;
    private final int b;
    private final int c;

    public class a implements Predicate<Integer> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // io.reactivex.functions.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Integer num) {
            Log.d(RxComboClick.d, "Combo : " + num, new Object[0]);
            return num.intValue() >= this.a && num.intValue() <= this.b;
        }
    }

    public class b implements Function<Timed<Integer>, Integer> {
        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(Timed<Integer> timed) {
            return timed.value();
        }
    }

    public class c implements BiFunction<Timed<Integer>, Timed<Integer>, Timed<Integer>> {
        public final /* synthetic */ long a;

        public c(long j) {
            this.a = j;
        }

        @Override // io.reactivex.functions.BiFunction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timed<Integer> apply(Timed<Integer> timed, Timed<Integer> timed2) {
            return timed2.time() - timed.time() <= this.a ? new Timed<>(Integer.valueOf(timed.value().intValue() + 1), timed2.time(), TimeUnit.MILLISECONDS) : new Timed<>(1, timed2.time(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class d implements ObservableOnSubscribe<Integer> {
        private final WeakReference<View> a;

        public class a implements View.OnClickListener {
            public final /* synthetic */ ObservableEmitter a;

            public a(ObservableEmitter observableEmitter) {
                this.a = observableEmitter;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.a.isDisposed()) {
                    return;
                }
                this.a.onNext(1);
            }
        }

        public class b extends MainThreadDisposable {
            public b() {
            }

            @Override // io.reactivex.android.MainThreadDisposable
            public void onDispose() {
                View view = (View) d.this.a.get();
                if (view == null) {
                    return;
                }
                view.setOnClickListener(null);
            }
        }

        public d(View view) {
            this.a = new WeakReference<>(view);
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Integer> observableEmitter) {
            MainThreadDisposable.verifyMainThread();
            View view = this.a.get();
            if (view == null) {
                Log.d(RxComboClick.d, "Target is Null!!", new Object[0]);
            } else {
                view.setOnClickListener(new a(observableEmitter));
                observableEmitter.setDisposable(new b());
            }
        }
    }

    public /* synthetic */ RxComboClick(long j, int i, int i2, a aVar) {
        this(j, i, i2);
    }

    private static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    private static <T> T b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    private static Observable<Integer> c(Observable<Integer> observable, long j, int i, int i2) {
        return observable.timestamp().scan(new c(j)).map(new b()).filter(new a(i, i2));
    }

    public Observable<Integer> start(@NonNull View view) {
        b(view, "target must be non-null");
        return c(Observable.create(new d(view)), this.a, this.b, this.c);
    }

    private RxComboClick(long j, int i, int i2) {
        a(j >= 1, "maxIntervalMillis must >= 1");
        a(i >= 2, "maxIntervalMillis must >= 2");
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public static final class Builder {
        private long a;
        private int b;
        private int c;

        public Builder() {
            this.a = 300L;
            this.b = 2;
        }

        public RxComboClick build() {
            long j = this.a;
            int i = this.b;
            int i2 = this.c;
            return new RxComboClick(j, i, i2 == 0 ? i : i2, null);
        }

        public Builder maxIntervalMillis(@IntRange(from = 1) long j) {
            this.a = j;
            return this;
        }

        public Builder minComboTimesCared(@IntRange(from = 2) int i) {
            this.b = i;
            return this;
        }

        public Builder(@IntRange(from = 1) long j, @IntRange(from = 2) int i) {
            this.a = 300L;
            this.b = 2;
            this.a = j;
            this.b = i;
        }
    }
}
