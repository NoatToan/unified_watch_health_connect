package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final v0 f21599b = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f21600a;

    public static v0 c() {
        return f21599b;
    }

    public void a() {
        this.f21600a = null;
    }

    public Activity b() {
        WeakReference<Activity> weakReference = this.f21600a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference<Activity> weakReference = this.f21600a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f21600a = new WeakReference<>(activity);
        }
    }
}
