package com.xiaomi.fitness.common.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.log.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/common/app/ActivityLifecycle;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "mReceiver", "Lcom/xiaomi/fitness/common/app/LifecycleReceiver;", "<init>", "(Lcom/xiaomi/fitness/common/app/LifecycleReceiver;)V", "mFragmentLifecycle", "Lcom/xiaomi/fitness/common/app/FragmentLifecycle;", "mForegroundActivityCount", "", "onActivityPreCreated", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityCreated", "onActivityPostCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "outState", "onActivityDestroyed", "putLifecycleEvent", "act", "event", "", "getData", "isAppForeground", "", "()Z", "registerFragmentCallbacks", "logi", "string", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityLifecycle implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private static final String TAG = "ActivityLifecycle";
    private int mForegroundActivityCount;

    @Nullable
    private FragmentLifecycle mFragmentLifecycle;

    @NotNull
    private final LifecycleReceiver mReceiver;

    public ActivityLifecycle(@NotNull LifecycleReceiver mReceiver) {
        Intrinsics.checkNotNullParameter(mReceiver, "mReceiver");
        this.mReceiver = mReceiver;
    }

    private final String getData(Activity act) {
        ActivityStack activityStack = ActivityStack.INSTANCE;
        return activityStack.getUniqueId(act) + LifecycleConstantKt.DATA_DELIMITER + ((Object) activityStack.getACTIVITIES().get(act));
    }

    private final void logi(String string) {
        Logger.i(TAG, string);
    }

    private final void putLifecycleEvent(Activity act, String event) {
        ActivityStack activityStack = ActivityStack.INSTANCE;
        activityStack.getACTIVITIES().put(act, event);
        String data = getData(act);
        this.mReceiver.handleAction(LifecycleConstantKt.ACTION_PUT, data);
        activityStack.sendBroadcast(0, LifecycleConstantKt.ACTION_PUT, data);
    }

    private final void registerFragmentCallbacks(Activity activity) {
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            List<Fragment> listY0 = fragmentActivity.getSupportFragmentManager().y0();
            Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
            listY0.isEmpty();
            if (this.mFragmentLifecycle == null) {
                this.mFragmentLifecycle = new FragmentLifecycle();
            }
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            FragmentLifecycle fragmentLifecycle = this.mFragmentLifecycle;
            Intrinsics.checkNotNull(fragmentLifecycle);
            supportFragmentManager.p1(fragmentLifecycle, true);
        }
    }

    public final boolean isAppForeground() {
        return this.mForegroundActivityCount > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        logi("onActivityCreated->" + activity);
        putLifecycleEvent(activity, LifecycleConstantKt.ON_CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        logi("onActivityDestroyed->" + activity);
        ActivityStack activityStack = ActivityStack.INSTANCE;
        activityStack.getACTIVITIES().remove(activity);
        activityStack.sendBroadcast(0, "remove", activityStack.getUniqueId(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        logi("onActivityPaused->" + activity);
        this.mForegroundActivityCount = this.mForegroundActivityCount + (-1);
        putLifecycleEvent(activity, LifecycleConstantKt.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityPostCreated(activity, savedInstanceState);
        logi("onActivityPostCreated->" + activity);
        putLifecycleEvent(activity, LifecycleConstantKt.ON_POST_CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityPreCreated(activity, savedInstanceState);
        logi("onActivityPreCreated->" + activity);
        putLifecycleEvent(activity, LifecycleConstantKt.ON_PRE_CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppManager.INSTANCE.getInstance().setCurrentActivity(activity);
        this.mForegroundActivityCount++;
        logi("onActivityResumed->" + activity);
        putLifecycleEvent(activity, LifecycleConstantKt.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        logi("onActivityStarted->" + activity);
        putLifecycleEvent(activity, LifecycleConstantKt.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppManager.Companion companion = AppManager.INSTANCE;
        if (companion.getInstance().getCurrentActivity() == activity) {
            companion.getInstance().setCurrentActivity(null);
        }
        logi("onActivityStopped->" + activity);
        putLifecycleEvent(activity, LifecycleConstantKt.ON_STOP);
    }
}
