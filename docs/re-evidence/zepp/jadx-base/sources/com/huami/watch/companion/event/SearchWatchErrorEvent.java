package com.huami.watch.companion.event;

import com.huami.view.basetitle.BaseFragmentActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/watch/companion/event/SearchWatchErrorEvent;", "", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "activity", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "getActivity", "()Lcom/huami/view/basetitle/BaseFragmentActivity;", "Ljava/lang/Runnable;", "positiveRun", "Ljava/lang/Runnable;", "getPositiveRun", "()Ljava/lang/Runnable;", "negativeRun", "getNegativeRun", "<init>", "(Lcom/huami/view/basetitle/BaseFragmentActivity;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class SearchWatchErrorEvent {

    @NotNull
    private final BaseFragmentActivity activity;

    @NotNull
    private final Runnable negativeRun;

    @NotNull
    private final Runnable positiveRun;

    public SearchWatchErrorEvent(@NotNull BaseFragmentActivity baseFragmentActivity, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        this.activity = baseFragmentActivity;
        this.positiveRun = runnable;
        this.negativeRun = runnable2;
    }

    @NotNull
    public final BaseFragmentActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Runnable getNegativeRun() {
        return this.negativeRun;
    }

    @NotNull
    public final Runnable getPositiveRun() {
        return this.positiveRun;
    }
}
