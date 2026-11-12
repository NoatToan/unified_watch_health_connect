package com.huami.sky.ui.intro;

import android.app.Activity;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/ui/intro/SkyInitActivityManager;", "", "Landroid/app/Activity;", "activity", "", "addActivity", "removeActivity", "finishInitActivities", "Ljava/util/Stack;", "a", "Ljava/util/Stack;", "activities", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyInitActivityManager {

    @NotNull
    public static final SkyInitActivityManager INSTANCE = new SkyInitActivityManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Stack<Activity> activities = new Stack<>();

    private SkyInitActivityManager() {
    }

    public final void addActivity(@NotNull Activity activity) {
        activities.add(activity);
    }

    public final void finishInitActivities() {
        Iterator<T> it2 = activities.iterator();
        while (it2.hasNext()) {
            ((Activity) it2.next()).finish();
        }
    }

    public final void removeActivity(@NotNull Activity activity) {
        activities.remove(activity);
    }
}
