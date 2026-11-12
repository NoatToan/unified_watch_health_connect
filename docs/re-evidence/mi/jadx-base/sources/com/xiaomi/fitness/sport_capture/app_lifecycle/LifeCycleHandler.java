package com.xiaomi.fitness.sport_capture.app_lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/app_lifecycle/LifeCycleHandler;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "fgActivityCount", "", "isActivityChangingConfigurations", "", "onActivityCreated", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "outState", "onActivityDestroyed", "Companion", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LifeCycleHandler implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private static final String TAG = "LifeCycleHandler";
    private int fgActivityCount;
    private boolean isActivityChangingConfigurations;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = this.fgActivityCount + 1;
        this.fgActivityCount = i;
        if (i == 1 && !this.isActivityChangingConfigurations) {
            SportCapturePreference.INSTANCE.setAppForeground(true);
        }
        Logger.i(TAG, "onActivityStarted:" + activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = zIsChangingConfigurations;
        int i = this.fgActivityCount - 1;
        this.fgActivityCount = i;
        if (i == 0 && !zIsChangingConfigurations) {
            SportCapturePreference.INSTANCE.setAppForeground(false);
        }
        Logger.i(TAG, "onActivityStopped:" + activity.getClass().getSimpleName());
    }
}
