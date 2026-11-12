package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Runnable f21576b;

    public f(@NotNull Window.Callback callback, @NotNull Runnable runnable) {
        super(callback);
        this.f21576b = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f21576b.run();
    }
}
