package com.huami.wallet.ui.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveDataReactiveStreams {

    public static class PublisherLiveData<T> extends LiveData<T> {
        private final Publisher<T> a;
        public final AtomicReference<PublisherLiveData<T>.a> b = new AtomicReference<>();

        public final class a extends AtomicReference<Subscription> implements Subscriber<T> {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void c(Throwable th) {
                throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
            }

            public void b() {
                Subscription subscription = get();
                if (subscription != null) {
                    subscription.cancel();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                PublisherLiveData.this.b.compareAndSet(this, null);
            }

            @Override // org.reactivestreams.Subscriber
            @SuppressLint({"RestrictedApi"})
            public void onError(final Throwable th) {
                PublisherLiveData.this.b.compareAndSet(this, null);
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: com.huami.wallet.ui.utils.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveDataReactiveStreams.PublisherLiveData.a.c(th);
                    }
                });
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(T t) {
                PublisherLiveData.this.setValue(t);
            }

            @Override // org.reactivestreams.Subscriber
            public void onSubscribe(Subscription subscription) {
                if (compareAndSet(null, subscription)) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.cancel();
                }
            }
        }

        public PublisherLiveData(@NonNull Publisher<T> publisher) {
            this.a = Flowable.fromPublisher(publisher).observeOn(AndroidSchedulers.mainThread());
        }

        @Override // androidx.p008lifecycle.LiveData
        public void onActive() {
            super.onActive();
            PublisherLiveData<T>.a aVar = new a();
            this.b.set(aVar);
            this.a.subscribe(aVar);
        }

        @Override // androidx.p008lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            PublisherLiveData<T>.a andSet = this.b.getAndSet(null);
            if (andSet != null) {
                andSet.b();
            }
        }

        public void refresh() {
            onInactive();
            onActive();
        }
    }

    public static final class a<T> implements Publisher<T> {
        public final LifecycleOwner a;
        public final LiveData<T> b;

        /* JADX INFO: renamed from: com.huami.wallet.ui.utils.LiveDataReactiveStreams$a$a, reason: collision with other inner class name */
        public static final class C0647a<T> implements Subscription, Observer<T> {
            public final Subscriber<? super T> a;
            public final LifecycleOwner b;
            public final LiveData<T> c;
            public volatile boolean d;
            public boolean e;
            public long f;

            @Nullable
            public T g;

            public C0647a(Subscriber<? super T> subscriber, LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
                this.a = subscriber;
                this.b = lifecycleOwner;
                this.c = liveData;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void c() {
                if (this.e) {
                    this.c.removeObserver(this);
                    this.e = false;
                }
                this.g = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void d(long j) {
                if (this.d) {
                    return;
                }
                if (j <= 0) {
                    this.d = true;
                    if (this.e) {
                        this.c.removeObserver(this);
                        this.e = false;
                    }
                    this.g = null;
                    this.a.onError(new IllegalArgumentException("Non-positive request"));
                    return;
                }
                long j2 = this.f;
                this.f = j2 + j >= j2 ? j2 + j : Long.MAX_VALUE;
                if (!this.e) {
                    this.e = true;
                    this.c.observe(this.b, this);
                    return;
                }
                T t = this.g;
                if (t != null) {
                    onChanged(t);
                    this.g = null;
                }
            }

            @Override // org.reactivestreams.Subscription
            @SuppressLint({"RestrictedApi"})
            public void cancel() {
                if (this.d) {
                    return;
                }
                this.d = true;
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: com.huami.wallet.ui.utils.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }

            @Override // androidx.p008lifecycle.Observer
            public void onChanged(@Nullable T t) {
                if (this.d) {
                    return;
                }
                if (this.f <= 0) {
                    this.g = t;
                    return;
                }
                this.g = null;
                this.a.onNext(t);
                long j = this.f;
                if (j != Long.MAX_VALUE) {
                    this.f = j - 1;
                }
            }

            @Override // org.reactivestreams.Subscription
            @SuppressLint({"RestrictedApi"})
            public void request(final long j) {
                if (this.d) {
                    return;
                }
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: com.huami.wallet.ui.utils.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d(j);
                    }
                });
            }
        }

        public a(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
            this.a = lifecycleOwner;
            this.b = liveData;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
            subscriber.onSubscribe(new C0647a(subscriber, this.a, this.b));
        }
    }

    private LiveDataReactiveStreams() {
    }

    @NonNull
    public static <T> PublisherLiveData<T> fromPublisher(@NonNull Publisher<T> publisher) {
        return new PublisherLiveData<>(publisher);
    }

    @NonNull
    public static <T> Publisher<T> toPublisher(@NonNull LifecycleOwner lifecycleOwner, @NonNull LiveData<T> liveData) {
        return new a(lifecycleOwner, liveData);
    }
}
