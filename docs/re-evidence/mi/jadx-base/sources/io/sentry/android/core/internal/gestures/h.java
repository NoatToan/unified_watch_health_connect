package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Window.Callback f21492b;

    @NotNull
    public final g c;

    @NotNull
    public final GestureDetectorCompat d;

    @Nullable
    public final SentryOptions e;

    @NotNull
    public final b f;

    public class a implements b {
    }

    public interface b {
        @NotNull
        default MotionEvent a(@NotNull MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public h(@NotNull Window.Callback callback, @NotNull Context context, @NotNull g gVar, @Nullable SentryOptions sentryOptions) {
        this(callback, new GestureDetectorCompat(context, gVar), gVar, sentryOptions, new a());
    }

    @NotNull
    public Window.Callback a() {
        return this.f21492b;
    }

    public final void b(@NotNull MotionEvent motionEvent) {
        this.d.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.c.o(motionEvent);
        }
    }

    public void c() {
        this.c.q(SpanStatus.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent motionEventA = this.f.a(motionEvent);
            try {
                b(motionEventA);
            } catch (Throwable th) {
                try {
                    if (this.e != null) {
                        this.e.getLogger().a(SentryLevel.ERROR, "Error dispatching touch event", th);
                    }
                } finally {
                    motionEventA.recycle();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public h(@NotNull Window.Callback callback, @NotNull GestureDetectorCompat gestureDetectorCompat, @NotNull g gVar, @Nullable SentryOptions sentryOptions, @NotNull b bVar) {
        super(callback);
        this.f21492b = callback;
        this.c = gVar;
        this.e = sentryOptions;
        this.d = gestureDetectorCompat;
        this.f = bVar;
    }
}
