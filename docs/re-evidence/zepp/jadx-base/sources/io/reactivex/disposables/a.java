package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes22.dex */
final class a extends c<Action> {
    private static final long serialVersionUID = -8219729196779211169L;

    public a(Action action) {
        super(action);
    }

    @Override // io.reactivex.disposables.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NonNull Action action) {
        try {
            action.run();
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }
}
