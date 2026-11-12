package com.xiaomi.fitness.common.extensions;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.d41;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a$\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a$\u0010\u000b\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a$\u0010\r\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a$\u0010\r\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a.\u0010\r\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002\u001a\n\u0010\u0012\u001a\u00020\u0003*\u00020\f\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\f\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"mAlarmBroadcastReceiver", "Lcom/xiaomi/fitness/common/extensions/AlarmBroadcastReceiver;", "setExactAndAllowWhileIdleCompat", "", "Landroid/app/AlarmManager;", "triggerAtMillis", "", "operation", "Landroid/app/PendingIntent;", "type", "", "setExactAndAllowWhileIdleIfCan", "Landroid/content/Context;", "setExactAndAllowWhileIdle", "Landroidx/fragment/app/FragmentActivity;", "Landroidx/fragment/app/Fragment;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "requestAlarmPermission", "canScheduleExactAlarms", "", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AlarmManagerExtKt {

    @Nullable
    private static AlarmBroadcastReceiver mAlarmBroadcastReceiver;

    public static final boolean canScheduleExactAlarms(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return false;
        }
        return alarmManager.canScheduleExactAlarms();
    }

    public static final void requestAlarmPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        }
    }

    public static final void setExactAndAllowWhileIdle(@NotNull FragmentActivity fragmentActivity, long j, @NotNull PendingIntent operation, int i) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Lifecycle lifecycle = fragmentActivity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        setExactAndAllowWhileIdle(fragmentActivity, lifecycle, j, operation, i);
    }

    public static /* synthetic */ void setExactAndAllowWhileIdle$default(FragmentActivity fragmentActivity, long j, PendingIntent pendingIntent, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        setExactAndAllowWhileIdle(fragmentActivity, j, pendingIntent, i);
    }

    public static final void setExactAndAllowWhileIdleCompat(@NotNull AlarmManager alarmManager, long j, @NotNull PendingIntent operation, int i) {
        Intrinsics.checkNotNullParameter(alarmManager, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (Build.VERSION.SDK_INT < 31 || alarmManager.canScheduleExactAlarms()) {
            d41.a(alarmManager, i, j, operation);
            return;
        }
        if (mAlarmBroadcastReceiver == null) {
            AlarmBroadcastReceiver alarmBroadcastReceiver = new AlarmBroadcastReceiver();
            mAlarmBroadcastReceiver = alarmBroadcastReceiver;
            Intrinsics.checkNotNull(alarmBroadcastReceiver);
            alarmBroadcastReceiver.registerReceiver(ApplicationExtKt.getApplication());
        }
        AlarmBroadcastReceiver alarmBroadcastReceiver2 = mAlarmBroadcastReceiver;
        if (alarmBroadcastReceiver2 != null) {
            alarmBroadcastReceiver2.setAlarmManager(alarmManager);
        }
        AlarmBroadcastReceiver alarmBroadcastReceiver3 = mAlarmBroadcastReceiver;
        if (alarmBroadcastReceiver3 != null) {
            alarmBroadcastReceiver3.setType(i);
        }
        AlarmBroadcastReceiver alarmBroadcastReceiver4 = mAlarmBroadcastReceiver;
        if (alarmBroadcastReceiver4 != null) {
            alarmBroadcastReceiver4.setTriggerAtMillis(Long.valueOf(j));
        }
        AlarmBroadcastReceiver alarmBroadcastReceiver5 = mAlarmBroadcastReceiver;
        if (alarmBroadcastReceiver5 != null) {
            alarmBroadcastReceiver5.setOperation(operation);
        }
        Logger.i("No permission to schedule exact alarm, request permission!", new Object[0]);
        requestAlarmPermission(ApplicationExtKt.getApplication());
    }

    public static /* synthetic */ void setExactAndAllowWhileIdleCompat$default(AlarmManager alarmManager, long j, PendingIntent pendingIntent, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        setExactAndAllowWhileIdleCompat(alarmManager, j, pendingIntent, i);
    }

    public static final void setExactAndAllowWhileIdleIfCan(@NotNull Context context, long j, @NotNull PendingIntent operation, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            d41.a(alarmManager, i, j, operation);
        } else if (!alarmManager.canScheduleExactAlarms()) {
            Logger.w("No permission to schedule exact alarm, break!", new Object[0]);
        } else {
            alarmManager.cancel(operation);
            d41.a(alarmManager, i, j, operation);
        }
    }

    public static /* synthetic */ void setExactAndAllowWhileIdleIfCan$default(Context context, long j, PendingIntent pendingIntent, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        setExactAndAllowWhileIdleIfCan(context, j, pendingIntent, i);
    }

    public static final void setExactAndAllowWhileIdle(@NotNull Fragment fragment, long j, @NotNull PendingIntent operation, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Context context = fragment.getContext();
        if (context != null) {
            Lifecycle lifecycle = fragment.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            setExactAndAllowWhileIdle(context, lifecycle, j, operation, i);
        }
    }

    public static /* synthetic */ void setExactAndAllowWhileIdle$default(Fragment fragment, long j, PendingIntent pendingIntent, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        setExactAndAllowWhileIdle(fragment, j, pendingIntent, i);
    }

    private static final void setExactAndAllowWhileIdle(final Context context, final Lifecycle lifecycle, long j, PendingIntent pendingIntent, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
            final AlarmBroadcastReceiver alarmBroadcastReceiver = new AlarmBroadcastReceiver();
            lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.xiaomi.fitness.common.extensions.AlarmManagerExtKt.setExactAndAllowWhileIdle.1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    super.onDestroy(owner);
                    context.unregisterReceiver(alarmBroadcastReceiver);
                    lifecycle.removeObserver(this);
                }
            });
            alarmBroadcastReceiver.registerReceiver(context);
            alarmBroadcastReceiver.setAlarmManager(alarmManager);
            alarmBroadcastReceiver.setType(i);
            alarmBroadcastReceiver.setTriggerAtMillis(Long.valueOf(j));
            alarmBroadcastReceiver.setOperation(pendingIntent);
            Logger.i("No permission to schedule exact alarm, request permission!", new Object[0]);
            requestAlarmPermission(context);
            return;
        }
        d41.a(alarmManager, i, j, pendingIntent);
    }

    public static /* synthetic */ void setExactAndAllowWhileIdle$default(Context context, Lifecycle lifecycle, long j, PendingIntent pendingIntent, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        setExactAndAllowWhileIdle(context, lifecycle, j, pendingIntent, i);
    }
}
