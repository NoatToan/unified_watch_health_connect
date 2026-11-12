package com.xiaomi.fitness.common.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u001b\u0010\u001a\u001a\u00020\u001b2\u0010\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u001dH\u0086\u0002J\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010!\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001dJ\u0010\u0010!\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u001e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/common/app/ActivityStack;", "", "<init>", "()V", "ACTIVITIES", "Ljava/util/LinkedHashMap;", "Landroid/app/Activity;", "", "getACTIVITIES", "()Ljava/util/LinkedHashMap;", "sendBroadcast", "", "pid", "", "action", "data", "init", "receiver", "Lcom/xiaomi/fitness/common/app/LifecycleReceiver;", "getActivities", "", "getTopActivity", "getActivity", "uniqueId", "getLifecycle", "act", "contains", "", "cls", "Ljava/lang/Class;", MediaStoreUtil.MediaInfo.SIZE, "getSize", "()I", "finish", LifecycleConstantKt.ACTION_EXIT, "processName", "getUniqueId", LifecycleConstantKt.TYPE_ACTIVITY, "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityStack {

    @NotNull
    public static final ActivityStack INSTANCE = new ActivityStack();

    @NotNull
    private static final LinkedHashMap<Activity, String> ACTIVITIES = new LinkedHashMap<>();

    private ActivityStack() {
    }

    public final boolean contains(@Nullable Class<? extends Activity> cls) {
        return ActivityCache.INSTANCE.contains(cls);
    }

    public final void exit() {
        sendBroadcast(0, LifecycleConstantKt.ACTION_EXIT, null);
    }

    public final void finish(@Nullable Class<? extends Activity> cls) {
        if (cls == null) {
            return;
        }
        sendBroadcast(0, "finish", cls.getName());
    }

    @NotNull
    public final LinkedHashMap<Activity, String> getACTIVITIES() {
        return ACTIVITIES;
    }

    @NotNull
    public final List<Activity> getActivities() {
        ArrayList arrayList = new ArrayList();
        for (Activity activity : ACTIVITIES.keySet()) {
            Intrinsics.checkNotNullExpressionValue(activity, "next(...)");
            arrayList.add(activity);
        }
        return arrayList;
    }

    @Nullable
    public final Activity getActivity(@Nullable String uniqueId) {
        LinkedHashMap<Activity, String> linkedHashMap = ACTIVITIES;
        if (!linkedHashMap.isEmpty() && !TextUtils.isEmpty(uniqueId)) {
            for (Activity activity : linkedHashMap.keySet()) {
                Intrinsics.checkNotNullExpressionValue(activity, "next(...)");
                Activity activity2 = activity;
                if (TextUtils.equals(uniqueId, getUniqueId(activity2))) {
                    return activity2;
                }
            }
        }
        return null;
    }

    @Nullable
    public final String getLifecycle(@Nullable Activity act) {
        if (act == null) {
            return null;
        }
        return ACTIVITIES.get(act);
    }

    public final int getSize() {
        return ActivityCache.INSTANCE.size();
    }

    @Nullable
    public final Activity getTopActivity() {
        LinkedHashMap<Activity, String> linkedHashMap = ACTIVITIES;
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        try {
            Field declaredField = linkedHashMap.getClass().getDeclaredField("tail");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(linkedHashMap);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<*, *>");
            return (Activity) ((Map.Entry) obj).getKey();
        } catch (Exception unused) {
            List<Activity> activities = getActivities();
            return activities.get(activities.size() - 1);
        }
    }

    @Nullable
    public final String getUniqueId(@Nullable Activity activity) {
        if (activity == null) {
            return null;
        }
        return activity.getClass().getName() + ";" + System.identityHashCode(activity) + ";" + Process.myPid();
    }

    public final void init(@NotNull LifecycleReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        if (!ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication())) {
            sendBroadcast(Process.myPid(), "init", null);
        }
        ApplicationExtKt.getApplication().registerActivityLifecycleCallbacks(new ActivityLifecycle(receiver));
    }

    public final void sendBroadcast(int pid, @Nullable String action, @Nullable String data) {
        String str = ApplicationExtKt.getApplication().getPackageName() + ".permission.RECEIVER_PROCESS_MESSAGE";
        Intent intent = new Intent(ApplicationExtKt.getApplication().getPackageName() + ".action.PROCESS_MESSAGE");
        intent.putExtra("type", LifecycleConstantKt.TYPE_ACTIVITY);
        intent.putExtra("pid", pid);
        intent.putExtra("action", action);
        intent.putExtra("data", data);
        ApplicationExtKt.getApplication().sendOrderedBroadcast(intent, str);
    }

    public final int size(int pid) {
        return pid == Process.myPid() ? ACTIVITIES.size() : ActivityCache.INSTANCE.size(pid);
    }

    public final void exit(int pid) {
        sendBroadcast(pid, LifecycleConstantKt.ACTION_EXIT, null);
    }

    public final void finish(@Nullable String uniqueId) {
        if (uniqueId == null || uniqueId.length() == 0) {
            return;
        }
        sendBroadcast(0, "finish", uniqueId);
    }

    @Nullable
    public final String getLifecycle(@Nullable String uniqueId) {
        if (TextUtils.isEmpty(uniqueId)) {
            return null;
        }
        ActivityCache activityCache = ActivityCache.INSTANCE;
        Intrinsics.checkNotNull(uniqueId);
        return activityCache.getLifecycle(uniqueId);
    }

    public final void exit(@Nullable String processName) {
        if (processName == null || processName.length() == 0) {
            return;
        }
        sendBroadcast(0, LifecycleConstantKt.ACTION_EXIT, processName);
    }
}
