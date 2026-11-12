package com.xiaomi.hm.health.utils;

import android.app.Activity;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\u0003R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/utils/HMActivityManager;", "", "Ljava/util/Stack;", "Landroid/app/Activity;", "getActivityStack", "activity", "", "addActivity", "removeActivity", "getCurrentActivity", "a", "Ljava/util/Stack;", "getActivities", "()Ljava/util/Stack;", "activities", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HMActivityManager {

    @NotNull
    public static final HMActivityManager INSTANCE = new HMActivityManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Stack<Activity> activities = new Stack<>();

    private HMActivityManager() {
    }

    public final void addActivity(@NotNull Activity activity) {
        activities.add(activity);
    }

    @NotNull
    public final Stack<Activity> getActivities() {
        return activities;
    }

    @NotNull
    public final Stack<Activity> getActivityStack() {
        return activities;
    }

    @Nullable
    public final Activity getCurrentActivity() {
        try {
            return activities.lastElement();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public final void removeActivity(@NotNull Activity activity) {
        activities.remove(activity);
    }
}
