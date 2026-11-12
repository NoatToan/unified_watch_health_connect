package com.huami.ai.speech.xiaoai.event;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.entity.alert.Alarm;
import com.huami.ai.entity.alert.Alert;
import com.huami.ai.entity.alert.Reminder;
import com.huami.ai.speech.api.CronExpressionParse;
import com.huami.ai.speech.xiaoai.utils.AlertUtilsKt;
import com.huami.ai.uitls.AlertUtilKt;
import com.huami.ai.uitls.ISO8601DateFormatterKt;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.api.Alerts;
import com.xiaomi.ai.api.common.EventPayload;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J \u0010\u0017\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0014\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¨\u0006 "}, d2 = {"Lcom/huami/ai/speech/xiaoai/event/StoreAlertsEvent;", "Lcom/huami/ai/speech/xiaoai/event/UploadEvent;", "Lcom/huami/ai/entity/alert/Alert;", "alert", "Lcom/xiaomi/ai/api/Alerts$AlertItem;", "e", "Lcom/huami/ai/entity/alert/Alarm;", "alarm", "c", "Lcom/huami/ai/entity/alert/Reminder;", NotificationCompat.CATEGORY_REMINDER, "f", "alertItem", "", "days", "", "dataTime", "", "b", "", "circle", "cron", GoogleApiAvailabilityLight.a, "a", "", "alerts", "Lcom/xiaomi/ai/api/common/EventPayload;", "storeAlertsPayload", "Lcom/xiaomi/ai/android/core/Engine;", "engine", "<init>", "(Lcom/xiaomi/ai/android/core/Engine;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class StoreAlertsEvent extends UploadEvent {
    public StoreAlertsEvent(@NotNull Engine engine) {
        super(engine);
    }

    private final void a(Alerts.AlertItem alertItem, int days, String dataTime) {
        alertItem.setCircle(Alerts.AlertCircleType.WEEKLY);
        Calendar calendarIso0860ToCalendar = ISO8601DateFormatterKt.iso0860ToCalendar(dataTime);
        Integer numValueOf = calendarIso0860ToCalendar == null ? null : Integer.valueOf(calendarIso0860ToCalendar.get(11));
        if (numValueOf == null) {
            throw new IllegalArgumentException("获取闹钟的时间不正确");
        }
        String strStringPlus = "0 0 " + numValueOf.intValue() + " ? * ";
        if ((days & 1) == 1) {
            strStringPlus = Intrinsics.stringPlus(strStringPlus, "1,");
        }
        if ((days & 2) == 2) {
            strStringPlus = Intrinsics.stringPlus(strStringPlus, "2,");
        }
        int i = days & 4;
        if (i == 4) {
            strStringPlus = Intrinsics.stringPlus(strStringPlus, "3,");
        }
        if (i == 8) {
            strStringPlus = Intrinsics.stringPlus(strStringPlus, "4,");
        }
        if ((days & 16) == 16) {
            strStringPlus = Intrinsics.stringPlus(strStringPlus, "5,");
        }
        if ((days & 32) == 32) {
            strStringPlus = Intrinsics.stringPlus(strStringPlus, "6,");
        }
        if ((days & 64) == 64) {
            strStringPlus = Intrinsics.stringPlus(strStringPlus, "7,");
        }
        alertItem.setCircleExtra(Intrinsics.stringPlus(StringsKt___StringsKt.dropLast(strStringPlus, 1), " *"));
    }

    private final void b(Alerts.AlertItem alertItem, int days, String dataTime) {
        if (days == 0) {
            alertItem.setCircle(Alerts.AlertCircleType.ONCE);
            return;
        }
        if (days == 31) {
            alertItem.setCircle(Alerts.AlertCircleType.MONDAY_TO_FRIDAY);
            return;
        }
        if (days == 96) {
            alertItem.setCircle(Alerts.AlertCircleType.WEEKEND);
        } else if (days != 127) {
            a(alertItem, days, dataTime);
        } else {
            alertItem.setCircle(Alerts.AlertCircleType.EVERYDAY);
        }
    }

    private final Alerts.AlertItem c(Alarm alarm) {
        Alerts.AlertItem alertItem = new Alerts.AlertItem();
        alertItem.setId(alarm.getToken());
        alertItem.setType(Alerts.AlertType.ALARM);
        alertItem.setStatus(AlertUtilsKt.convertToXiaoAiStatus(alarm.getStatus()));
        alertItem.setDatetime(alarm.getScheduledTime());
        b(alertItem, alarm.getDays(), alertItem.getDatetime());
        return alertItem;
    }

    private final void d(Alerts.AlertItem alertItem, short circle, String cron) {
        if (circle == 8192) {
            alertItem.setCircle(Alerts.AlertCircleType.YEARLY);
            return;
        }
        if (circle == 4096) {
            alertItem.setCircle(Alerts.AlertCircleType.MONTHLY);
            return;
        }
        if (circle == 4064) {
            alertItem.setCircle(Alerts.AlertCircleType.EVERYDAY);
            return;
        }
        if (circle == 0) {
            alertItem.setCircle(Alerts.AlertCircleType.ONCE);
            return;
        }
        if (circle == AlertUtilKt.getWorkingDay_HMReminderInfo()) {
            alertItem.setCircle(Alerts.AlertCircleType.MONDAY_TO_FRIDAY);
            return;
        }
        if (circle == AlertUtilKt.getWeekend_HMReminderInfo()) {
            alertItem.setCircle(Alerts.AlertCircleType.WEEKEND);
        } else {
            if (TextUtils.isEmpty(new CronExpressionParse(cron).getDayOfWeek())) {
                throw new RuntimeException("未覆盖到的逻辑");
            }
            alertItem.setCircle(Alerts.AlertCircleType.WEEKLY);
            alertItem.setCircleExtra(cron);
        }
    }

    private final Alerts.AlertItem e(Alert alert) {
        if (alert instanceof Alarm) {
            return c((Alarm) alert);
        }
        if (alert instanceof Reminder) {
            return f((Reminder) alert);
        }
        throw new UnsupportedOperationException("小米运动，暂不支持倒计时存储");
    }

    private final Alerts.AlertItem f(Reminder reminder) {
        Alerts.AlertItem alertItem = new Alerts.AlertItem();
        alertItem.setId(reminder.getToken());
        alertItem.setType(Alerts.AlertType.ALARM);
        alertItem.setStatus(AlertUtilsKt.convertToXiaoAiStatus(reminder.getStatus()));
        alertItem.setDatetime(reminder.getScheduledTime());
        alertItem.setReminder(reminder.getLabel());
        d(alertItem, reminder.getCircle(), reminder.getCron());
        return alertItem;
    }

    @NotNull
    public final EventPayload storeAlertsPayload(@NotNull List<? extends Alert> alerts) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(alerts, 10));
        Iterator<T> it2 = alerts.iterator();
        while (it2.hasNext()) {
            arrayList.add(e((Alert) it2.next()));
        }
        return new Alerts.StoreAlerts(arrayList);
    }
}
