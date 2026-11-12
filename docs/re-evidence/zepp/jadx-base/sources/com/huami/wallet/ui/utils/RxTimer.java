package com.huami.wallet.ui.utils;

import com.twitter.sdk.android.tweetcomposer.g;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/wallet/ui/utils/RxTimer;", "", "", "milliseconds", "Lcom/huami/wallet/ui/utils/RxNext;", "rxNext", "interval", "", g.g, "Lio/reactivex/disposables/Disposable;", "a", "Lio/reactivex/disposables/Disposable;", "mDisposable", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RxTimer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Disposable mDisposable;

    public static /* synthetic */ RxTimer interval$default(RxTimer rxTimer, long j, RxNext rxNext, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        if ((i & 2) != 0) {
            rxNext = null;
        }
        return rxTimer.interval(j, rxNext);
    }

    public final void cancel() {
        Disposable disposable;
        Disposable disposable2 = this.mDisposable;
        if ((disposable2 == null ? null : Boolean.valueOf(disposable2.isDisposed())).booleanValue() || (disposable = this.mDisposable) == null) {
            return;
        }
        disposable.dispose();
    }

    @NotNull
    public final RxTimer interval(long milliseconds, @Nullable final RxNext rxNext) {
        Observable.interval(milliseconds, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Long>() { // from class: com.huami.wallet.ui.utils.RxTimer.interval.1
            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onError(@NotNull Throwable e) {
            }

            @Override // io.reactivex.Observer
            public /* bridge */ /* synthetic */ void onNext(Long l) {
                onNext(l.longValue());
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(@NotNull Disposable d) {
                this.mDisposable = d;
            }

            public void onNext(long t) {
                RxNext rxNext2 = rxNext;
                if (rxNext2 == null) {
                    return;
                }
                rxNext2.onNext();
            }
        });
        return this;
    }
}
