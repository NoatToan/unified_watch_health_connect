package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
final class e extends c<Subscription> {
    private static final long serialVersionUID = -707001650852963139L;

    public e(Subscription subscription) {
        super(subscription);
    }

    @Override // io.reactivex.disposables.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NonNull Subscription subscription) {
        subscription.cancel();
    }
}
