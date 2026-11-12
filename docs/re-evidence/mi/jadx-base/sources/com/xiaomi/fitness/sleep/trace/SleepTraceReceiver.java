package com.xiaomi.fitness.sleep.trace;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.util.BackgroundRestrictionUtil;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R(\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \b*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "mAcceptActions", "", "", "", "kotlin.jvm.PlatformType", "Ljava/util/List;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12904a = 0;
    private final List<String> mAcceptActions = Collections.unmodifiableList(new LinkedList<String>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceReceiver$mAcceptActions$1
        {
            add("android.intent.action.BOOT_COMPLETED");
            add("android.intent.action.TIME_SET");
            add("android.intent.action.TIMEZONE_CHANGED");
            add("android.intent.action.DATE_CHANGED");
            add("android.intent.action.EVENT_REMINDER");
            add("com.android.deskclock.ALARM_ALERT");
            add("com.android.deskclock.ALARM_ARRIVING");
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return contains((String) obj);
            }
            return false;
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return indexOf((String) obj);
            }
            return -1;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return lastIndexOf((String) obj);
            }
            return -1;
        }

        @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final /* bridge */ String remove(int i) {
            return removeAt(i);
        }

        public /* bridge */ String removeAt(int i) {
            return (String) super.remove(i);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ int size() {
            return getSize();
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }

        public /* bridge */ int indexOf(String str) {
            return super.indexOf((Object) str);
        }

        public /* bridge */ int lastIndexOf(String str) {
            return super.lastIndexOf((Object) str);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return remove((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean remove(String str) {
            return super.remove((Object) str);
        }
    });

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        SleepTraceUtil sleepTraceUtil = SleepTraceUtil.INSTANCE;
        sleepTraceUtil.sleepTrace("Device receive, ", new Object[0]);
        SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
        if (companion.isEnable(context)) {
            String action = intent.getAction();
            sleepTraceUtil.sleepTrace("Device receive, " + action, new Object[0]);
            BackgroundRestrictionUtil backgroundRestrictionUtil = BackgroundRestrictionUtil.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            String packageName = ApplicationExtKt.getApplication().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            int iQueryRestrictionLevel = backgroundRestrictionUtil.queryRestrictionLevel(application, packageName);
            Logger.i("SleepTraceService is create at restrictionLevel " + iQueryRestrictionLevel, new Object[0]);
            int i = Build.VERSION.SDK_INT;
            if (i > 34 && iQueryRestrictionLevel == 3) {
                Logger.i("SleepTraceReceiver Build VERSION " + i, new Object[0]);
                return;
            }
            if (action != null) {
                if (action.equals(ApplicationExtKt.getApplication().getPackageName() + ".action.PROCESS_MESSAGE")) {
                    String stringExtra = intent.getStringExtra("data");
                    if (stringExtra == null || !StringsKt__StringsKt.contains$default((CharSequence) stringExtra, (CharSequence) LifecycleConstantKt.ON_RESUME, false, 2, (Object) null)) {
                        return;
                    }
                    int iRequireSleepState = UserSleepModel.INSTANCE.getInstance().requireSleepState(context, System.currentTimeMillis());
                    PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
                    if (permissionsUtil.checkPermission("android.permission.RECORD_AUDIO") && iRequireSleepState != 0) {
                        Logger.i("SleepTraceReceiver state " + iRequireSleepState, new Object[0]);
                        SleepTraceActionHelper.INSTANCE.dispatchActionDeviceActive(context, true);
                        return;
                    }
                    Logger.i("SleepTraceReceiver " + permissionsUtil.checkPermission("android.permission.RECORD_AUDIO") + " + state " + iRequireSleepState, new Object[0]);
                    return;
                }
            }
            if (this.mAcceptActions.contains(action) && !companion.isTestMode()) {
                SleepTraceActionHelper.INSTANCE.dispatchActionDeviceActive(context, false);
            } else if (Intrinsics.areEqual("android.intent.action.USER_PRESENT", action)) {
                SleepTraceActionHelper.INSTANCE.dispatchActionDeviceActive(context, true);
            }
        }
    }
}
