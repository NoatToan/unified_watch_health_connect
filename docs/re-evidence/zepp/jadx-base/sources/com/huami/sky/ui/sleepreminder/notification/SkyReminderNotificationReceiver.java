package com.huami.sky.ui.sleepreminder.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.analytic.SkyReminderEventKt;
import com.huami.sky.ui.ext.SkyNotificationExtKt;
import com.huami.sky.ui.play.SkyPlayConstant;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.sky.ui.utils.Constant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderNotification;", "a", "Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderNotification;", "skyReminderNotification", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyReminderNotificationReceiver extends BroadcastReceiver {

    @NotNull
    private static final String b = "SkyReminderNotificationReceiver";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SkyReminderNotification skyReminderNotification;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "入睡通知提醒的更新: " + System.currentTimeMillis();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "入睡通知提醒的更新: 切换了系统时区";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "入睡通知提醒的更新: 修改了系统时间";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        String action;
        SkyReminderNotification skyReminderNotification;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case 498595530:
                if (action.equals(Constant.SKY_REMINDER_NOTIFICATION_ACTION)) {
                    HMLog.info(b, a.a);
                    SkyPlayEventKt.recordEvent(SkyReminderEventKt.AIMUSIC_SLEEP_PUSH_SUCCESS_V);
                    if (SkyReminderNotificationManager.INSTANCE.isNotificationEnable(context)) {
                        SkyPlayEventKt.recordEvent(SkyReminderEventKt.AIMUSIC_SLEEP_PUSH_V);
                    }
                    String string = context.getResources().getString(R.string.sky_reminder_popup_title);
                    String string2 = context.getResources().getString(R.string.sky_reminder_popup_detail);
                    SkyReminderNotification skyReminderNotification2 = new SkyReminderNotification(context);
                    this.skyReminderNotification = skyReminderNotification2;
                    skyReminderNotification2.notifyNotification(string, string2, SkyNotificationExtKt.getReminderClickPendingIntent(context));
                    SkyReminderAlarmManager.updateAlarm$default(SkyReminderAlarmManager.INSTANCE.getInstance(), context, 0, 2, null);
                    break;
                }
                break;
            case 502473491:
                if (action.equals("android.intent.action.TIMEZONE_CHANGED")) {
                    HMLog.info(b, b.a);
                    SkyServiceHelperKt.getSkyNotificationService().startSleepReminderAlarm();
                    break;
                }
                break;
            case 505380757:
                if (action.equals("android.intent.action.TIME_SET")) {
                    HMLog.info(b, c.a);
                    SkyServiceHelperKt.getSkyNotificationService().startSleepReminderAlarm();
                    break;
                }
                break;
            case 1574734093:
                if (action.equals(SkyPlayConstant.SKY_LOGOUT_ACTION) && (skyReminderNotification = this.skyReminderNotification) != null) {
                    skyReminderNotification.cancelNotification();
                }
                break;
        }
    }
}
