package com.xiaomi.fitness.stand.reminder;

import android.app.ActivityOptions;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.notice.NoticeUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.stand.StandDetectConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.goi;
import defpackage.h1j;
import defpackage.njh;
import defpackage.wwg;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/stand/reminder/StandReminderHelper;", "", "Landroid/content/Context;", "ctx", "", "action", "", "textId", "", "time", "Lwwg$a;", "makeAction", "(Landroid/content/Context;Ljava/lang/String;IJ)Lwwg$a;", "context", "Lnjh;", "getNoticeText", "(Landroid/content/Context;J)Lnjh;", "", "createAndShow", "(Landroid/content/Context;J)V", "reason", BroadcastsKt.SILENT_PUSHING_CANCEL, "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "CHANNEL_ID_STAND_REMINDER", "NOTIFICATION_ID_STAND_REMINDER", "I", "REQUEST_CODE_STAND", "", "REMIND_TITLE_RES_1", "[I", "REMIND_TITLE_RES_2", "<init>", "()V", "stand-detect_release"}, k = 1, mv = {2, 0, 0})
public final class StandReminderHelper {

    @NotNull
    private static final String CHANNEL_ID_STAND_REMINDER = "channel:stand_reminder";
    private static final int NOTIFICATION_ID_STAND_REMINDER = 300;
    private static final int REQUEST_CODE_STAND = 1;

    @NotNull
    private static final String TAG = "StandDetector";

    @NotNull
    public static final StandReminderHelper INSTANCE = new StandReminderHelper();

    @NotNull
    private static final int[] REMIND_TITLE_RES_1 = {h1j.g, h1j.h, h1j.i, h1j.j};

    @NotNull
    private static final int[] REMIND_TITLE_RES_2 = {h1j.f19578k, h1j.l};

    private StandReminderHelper() {
    }

    private final njh<String, String> getNoticeText(Context context, long time) {
        String string;
        String string2;
        Random random = new Random(System.currentTimeMillis());
        if (random.nextInt(2) == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(time);
            calendar.set(12, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(11, 1);
            long timeInMillis2 = calendar.getTimeInMillis();
            String string3 = context.getString(h1j.n);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            string = context.getString(h1j.e, TimeUtils.formatDate(string3, Long.valueOf(timeInMillis)), TimeUtils.formatDate(string3, Long.valueOf(timeInMillis2)));
            int[] iArr = REMIND_TITLE_RES_1;
            string2 = context.getString(iArr[random.nextInt(iArr.length)]);
        } else {
            string = context.getString(h1j.f);
            int[] iArr2 = REMIND_TITLE_RES_2;
            string2 = context.getString(iArr2[random.nextInt(iArr2.length)]);
        }
        return new njh<>(string2, string);
    }

    private final wwg.a makeAction(Context ctx, String action, int textId, long time) {
        Intent intent = new Intent(UIUtils.getSafeContext(ctx), (Class<?>) StandDetectReceiver.class);
        intent.setAction(action);
        wwg.a aVarA = new wwg.a.C1141a(0, ctx.getString(textId), PendingIntentExtKt.getBroadcastPendingIntent$default(ctx, 300, intent, 0, 4, null)).a();
        Intrinsics.checkNotNullExpressionValue(aVarA, "build(...)");
        return aVarA;
    }

    public final void cancel(@NotNull Context context, @Nullable String reason) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.i("StandDetector", "cancel stand notice, reason = " + reason);
        Object systemService = UIUtils.getSafeContext(context).getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(300);
    }

    public final void createAndShow(@NotNull Context context, long time) {
        PendingIntent activityPendingIntent$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Context safeContext = UIUtils.getSafeContext(context);
        NoticeUtils noticeUtils = NoticeUtils.INSTANCE;
        String string = safeContext.getString(h1j.f19576a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = safeContext.getString(h1j.c);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        noticeUtils.createChannelIfNeed(safeContext, CHANNEL_ID_STAND_REMINDER, string, string2, 4);
        Intent standPageIntent$default = IHealthPage.DefaultImpls.getStandPageIntent$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), null, 1, null);
        if (Build.VERSION.SDK_INT >= 34) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            activityOptionsMakeBasic.setPendingIntentCreatorBackgroundActivityStartMode(1);
            Bundle bundle = activityOptionsMakeBasic.toBundle();
            Intrinsics.checkNotNullExpressionValue(bundle, "toBundle(...)");
            activityPendingIntent$default = PendingIntentExtKt.getActivityPendingIntent$default(safeContext, 1, standPageIntent$default, bundle, 0, 8, (Object) null);
        } else {
            activityPendingIntent$default = PendingIntentExtKt.getActivityPendingIntent$default(safeContext, 1, standPageIntent$default, 0, 4, null);
        }
        njh<String, String> noticeText = getNoticeText(safeContext, time);
        Logger.i("StandDetector", "show stand notice : " + noticeText + " for %tT", Long.valueOf(time));
        wwg.e eVarT = new wwg.e(safeContext, CHANNEL_ID_STAND_REMINDER).u(goi.f19189a).k(noticeText.f27979a).j(noticeText.f27980b).p(CHANNEL_ID_STAND_REMINDER).i(activityPendingIntent$default).g(true).t(1);
        Intrinsics.checkNotNullExpressionValue(eVarT, "setPriority(...)");
        StandDetectConstants standDetectConstants = StandDetectConstants.INSTANCE;
        wwg.a aVarMakeAction = makeAction(safeContext, standDetectConstants.getACTION_STAND_RECORD(), h1j.f19577b, time);
        wwg.a aVarMakeAction2 = makeAction(safeContext, standDetectConstants.getACTION_STAND_STOP_REMIND_TODAY(), h1j.d, time);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(NoticeUtils.KEY_SHOW_BUTTON, true);
        eVarT.n(bundle2);
        eVarT.b(aVarMakeAction);
        eVarT.b(aVarMakeAction2);
        eVarT.y(TimeUnit.MINUTES.toMillis(10L));
        Notification notificationD = eVarT.d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        Object systemService = safeContext.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(300, notificationD);
    }
}
