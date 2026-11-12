package com.huami.femalehealth.uilib.manager;

import android.app.Activity;
import com.huami.watch.notification.TransportUri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/femalehealth/uilib/manager/FemaleHealthActivityManager;", "", "Landroid/app/Activity;", "activity", "", TransportUri.ACTION_ADD, "remove", "finishAllActivity", "", "a", "Ljava/util/List;", "activityList", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthActivityManager {

    @NotNull
    public static final FemaleHealthActivityManager INSTANCE = new FemaleHealthActivityManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<Activity> activityList = new ArrayList();

    private FemaleHealthActivityManager() {
    }

    public final void add(@NotNull Activity activity) {
        List<Activity> list = activityList;
        if (list.contains(activity)) {
            return;
        }
        list.add(activity);
    }

    public final void finishAllActivity() {
        Iterator<T> it2 = activityList.iterator();
        while (it2.hasNext()) {
            ((Activity) it2.next()).finish();
        }
        activityList.clear();
    }

    public final void remove(@NotNull Activity activity) {
        List<Activity> list = activityList;
        if (list.contains(activity)) {
            list.remove(activity);
        }
    }
}
