package com.xiaomi.fitness.statistics.page;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackConstant;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001d\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/statistics/page/ActivityPageLifecycleCallback;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "fragmentLifecycleCallbacks", "Lcom/xiaomi/fitness/statistics/page/FragmentPageLifecycleCallback;", "onActivityCreated", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "getPageName", "", "kotlin.jvm.PlatformType", "(Landroid/app/Activity;)Ljava/lang/String;", "onActivityStarted", "onActivityResumed", "onActivityVisibleChanged", "visible", "", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "outState", "onActivityDestroyed", "getActivityStringValue", "key", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityPageLifecycleCallback implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final FragmentPageLifecycleCallback fragmentLifecycleCallbacks = new FragmentPageLifecycleCallback();

    private final String getActivityStringValue(String key, Activity activity) {
        Intent intent = activity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(key) : null;
        if (stringExtra != null) {
            return stringExtra;
        }
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            return data.getQueryParameter(key);
        }
        return null;
    }

    private final String getPageName(Activity activity) {
        return activity instanceof BaseActivity ? ((BaseActivity) activity).pageName() : activity.getClass().getName();
    }

    private final void onActivityVisibleChanged(Activity activity, boolean visible) {
        if (activity instanceof FragmentActivity) {
            String pageName = getPageName(activity);
            Intrinsics.checkNotNullExpressionValue(pageName, "getPageName(...)");
            if (StringsKt__StringsKt.isBlank(pageName)) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(StatConstants.KEY_ACTIVITY_NAME, pageName);
            linkedHashMap.put("tip", OneTrackConstant.VALUE_AUTO_TRACK_TIP);
            if (visible) {
                linkedHashMap.put(StatConstants.KEY_PAGE_EVENT_TYPE, StatConstants.PARAM_START);
                String activityStringValue = getActivityStringValue("type", activity);
                String activityStringValue2 = getActivityStringValue("origin", activity);
                if (activityStringValue != null) {
                    linkedHashMap.put(StatConstants.KEY_PAGE_CUSTOM_TYPE, activityStringValue);
                }
                if (activityStringValue2 != null) {
                    linkedHashMap.put("origin", activityStringValue2);
                }
                AutoTrackPageManager autoTrackPageManager = AutoTrackPageManager.INSTANCE;
                String currentActPageName = autoTrackPageManager.getCurrentActPageName();
                if (currentActPageName != null) {
                    if (Intrinsics.areEqual(currentActPageName, pageName)) {
                        currentActPageName = "self";
                    }
                    linkedHashMap.put(StatConstants.KEY_ACTIVITY_REFERRER, currentActPageName);
                }
                autoTrackPageManager.setCurrentActPageName(pageName);
                autoTrackPageManager.onPageVisible(pageName, System.currentTimeMillis() / ((long) 1000));
            } else {
                linkedHashMap.put(StatConstants.KEY_PAGE_EVENT_TYPE, StatConstants.PARAM_END);
                AutoTrackPageManager autoTrackPageManager2 = AutoTrackPageManager.INSTANCE;
                Long pageVisibleTimeSec = autoTrackPageManager2.getPageVisibleTimeSec(pageName);
                if (pageVisibleTimeSec != null) {
                    linkedHashMap.put("duration_sec", Long.valueOf((System.currentTimeMillis() / ((long) 1000)) - pageVisibleTimeSec.longValue()));
                }
                autoTrackPageManager2.onPageInvisible(pageName);
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(OneTrackConstant.EVENT_AUTO_TRACK, linkedHashMap);
            Logger.i("AutoPageTrack-Activity", "onActivity " + (visible ? "visible" : "invisible") + " stat " + linkedHashMap);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof FragmentActivity) {
            String pageName = getPageName(activity);
            Intrinsics.checkNotNullExpressionValue(pageName, "getPageName(...)");
            if (StringsKt__StringsKt.isBlank(pageName)) {
                return;
            }
            ((FragmentActivity) activity).getSupportFragmentManager().p1(this.fragmentLifecycleCallbacks, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof FragmentActivity) {
            String pageName = getPageName(activity);
            Intrinsics.checkNotNullExpressionValue(pageName, "getPageName(...)");
            if (StringsKt__StringsKt.isBlank(pageName)) {
                return;
            }
            Logger.i("AutoPageTrack-Activity", "onActivityDestroyed " + pageName);
            ((FragmentActivity) activity).getSupportFragmentManager().I1(this.fragmentLifecycleCallbacks);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        onActivityVisibleChanged(activity, false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        onActivityVisibleChanged(activity, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
