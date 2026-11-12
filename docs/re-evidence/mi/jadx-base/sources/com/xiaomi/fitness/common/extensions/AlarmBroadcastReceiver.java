package com.xiaomi.fitness.common.extensions;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.d41;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\u0010\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001eH\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/common/extensions/AlarmBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "alarmManager", "Landroid/app/AlarmManager;", "getAlarmManager", "()Landroid/app/AlarmManager;", "setAlarmManager", "(Landroid/app/AlarmManager;)V", "type", "", "getType", "()I", "setType", "(I)V", "triggerAtMillis", "", "getTriggerAtMillis", "()Ljava/lang/Long;", "setTriggerAtMillis", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "operation", "Landroid/app/PendingIntent;", "getOperation", "()Landroid/app/PendingIntent;", "setOperation", "(Landroid/app/PendingIntent;)V", "mContext", "Landroid/content/Context;", "onReceive", "", "context", "intent", "Landroid/content/Intent;", "registerReceiver", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlarmBroadcastReceiver extends BroadcastReceiver {

    @Nullable
    private AlarmManager alarmManager;

    @Nullable
    private Context mContext;

    @Nullable
    private PendingIntent operation;

    @Nullable
    private Long triggerAtMillis;
    private int type;

    @Nullable
    public final AlarmManager getAlarmManager() {
        return this.alarmManager;
    }

    @Nullable
    public final PendingIntent getOperation() {
        return this.operation;
    }

    @Nullable
    public final Long getTriggerAtMillis() {
        return this.triggerAtMillis;
    }

    public final int getType() {
        return this.type;
    }

    @Override // android.content.BroadcastReceiver
    @RequiresApi(31)
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        AlarmManager alarmManager = this.alarmManager;
        if (alarmManager == null || !alarmManager.canScheduleExactAlarms()) {
            Logger.e("AlarmBroadcastReceiver", "cannot schedule exact alarms");
        } else {
            AlarmManager alarmManager2 = this.alarmManager;
            Intrinsics.checkNotNull(alarmManager2);
            int i = this.type;
            Long l = this.triggerAtMillis;
            Intrinsics.checkNotNull(l);
            long jLongValue = l.longValue();
            PendingIntent pendingIntent = this.operation;
            Intrinsics.checkNotNull(pendingIntent);
            d41.a(alarmManager2, i, jLongValue, pendingIntent);
        }
        Context context2 = this.mContext;
        if (context2 != null) {
            context2.unregisterReceiver(this);
        }
    }

    @RequiresApi(31)
    public final void registerReceiver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED");
        context.registerReceiver(this, intentFilter);
    }

    public final void setAlarmManager(@Nullable AlarmManager alarmManager) {
        this.alarmManager = alarmManager;
    }

    public final void setOperation(@Nullable PendingIntent pendingIntent) {
        this.operation = pendingIntent;
    }

    public final void setTriggerAtMillis(@Nullable Long l) {
        this.triggerAtMillis = l;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
