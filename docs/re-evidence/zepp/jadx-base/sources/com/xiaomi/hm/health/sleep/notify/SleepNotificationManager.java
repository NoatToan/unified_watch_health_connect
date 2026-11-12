package com.xiaomi.hm.health.sleep.notify;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.datautil.HMBraceletDateDataUtil;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0016\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/sleep/notify/SleepNotificationManager;", "", "", "checkAndNotify", "Lcom/xiaomi/hm/health/sleep/notify/SleepRecord;", "record", "sendNotification", "", "inBackground", "", "minutes", "isSleepEnd", "", "getBoundDeviceSyncTime", "time", "parseTimeToIntEdit", "", "date", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "notify", PointCategory.INIT, "tag", "Ljava/lang/String;", "SLEEP_END_INTERVAL_MINUTES", LogUtil.I, "todayDateStr", "", "sleepList", "Ljava/util/List;", "Lcom/xiaomi/hm/health/sleep/notify/NotifySleepParser;", "sleepParser$delegate", "Lkotlin/Lazy;", "getSleepParser", "()Lcom/xiaomi/hm/health/sleep/notify/NotifySleepParser;", "sleepParser", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepNotificationManager {
    private static final int SLEEP_END_INTERVAL_MINUTES = 30;

    @NotNull
    private static final String tag = "SleepNotificationManager";

    @NotNull
    public static final SleepNotificationManager INSTANCE = new SleepNotificationManager();

    @NotNull
    private static String todayDateStr = TimeExtKt.getTodayFormatKey();

    @NotNull
    private static final List<SleepRecord> sleepList = new ArrayList();

    /* JADX INFO: renamed from: sleepParser$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy sleepParser = LazyKt__LazyJVMKt.lazy(new Function0<NotifySleepParser>() { // from class: com.xiaomi.hm.health.sleep.notify.SleepNotificationManager$sleepParser$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final NotifySleepParser invoke() {
            return new NotifySleepParser();
        }
    });

    private SleepNotificationManager() {
    }

    private final void checkAndNotify() {
        List<SleepRecord> list = sleepList;
        ArrayList<SleepRecord> arrayList = new ArrayList();
        for (Object obj : list) {
            if (true ^ ((SleepRecord) obj).getNotified()) {
                arrayList.add(obj);
            }
        }
        for (SleepRecord sleepRecord : arrayList) {
            SleepNotificationManager sleepNotificationManager = INSTANCE;
            if (sleepNotificationManager.isSleepEnd(sleepRecord.getEndMinutes())) {
                if (sleepNotificationManager.inBackground()) {
                    sleepNotificationManager.sendNotification(sleepRecord);
                }
                sleepRecord.setNotified(true);
            }
        }
    }

    private final long getBoundDeviceSyncTime() {
        return HMDeviceManager.getInstance().getBoundDeviceSyncTime(HMDeviceManager.getInstance().getMajorDeviceType()).getTimeInMillis();
    }

    private final NotifySleepParser getSleepParser() {
        return (NotifySleepParser) sleepParser.getValue();
    }

    private final boolean inBackground() {
        final boolean z = !BraceletForegroundCallBack.getInstance().isForeground();
        HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.notify.SleepNotificationManager.inBackground.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Background:" + z;
            }
        });
        return z;
    }

    private final boolean isSleepEnd(final int minutes) {
        final int timeToIntEdit = parseTimeToIntEdit(getBoundDeviceSyncTime()) + 1440;
        HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.notify.SleepNotificationManager.isSleepEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "SyncMinutes:" + timeToIntEdit + ",Sleep minute:" + minutes;
            }
        });
        return timeToIntEdit - minutes >= 30;
    }

    private final int parseTimeToIntEdit(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    private final void sendNotification(final SleepRecord record) {
        HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.notify.SleepNotificationManager.sendNotification.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Notify record:" + record;
            }
        });
        if (record.isMain()) {
            AppNotification.showSleepNotification(todayDateStr);
        } else {
            AppNotification.showNapNotification(todayDateStr);
        }
    }

    public final void init() {
        DateData specifyDayData = HMBraceletDateDataUtil.getSpecifyDayData(TimeExtKt.getTodayFormatKey());
        synchronized (this) {
            if (specifyDayData != null) {
                String summary = specifyDayData.getSummary();
                if (!(summary == null || summary.length() == 0)) {
                    List<SleepRecord> list = sleepList;
                    list.clear();
                    list.addAll(INSTANCE.getSleepParser().initNoNeedNotifiedSleep(specifyDayData.getSummary()));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void notify(@NotNull String date, @NotNull SleepInfo sleepInfo) {
        Object next;
        if (!TimeExtKt.isToday(date)) {
            HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.notify.SleepNotificationManager.notify.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Not today sleep info,abort.";
                }
            });
            return;
        }
        synchronized (this) {
            if (!Intrinsics.areEqual(todayDateStr, date)) {
                sleepList.clear();
                todayDateStr = date;
            }
            List<SleepRecord> listConvertToSleepRecord = INSTANCE.getSleepParser().convertToSleepRecord(sleepInfo);
            for (SleepRecord sleepRecord : listConvertToSleepRecord) {
                Iterator<T> it2 = sleepList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(((SleepRecord) next).getStartMinutes() == sleepRecord.getStartMinutes()));
                SleepRecord sleepRecord2 = (SleepRecord) next;
                if (sleepRecord2 != null) {
                    sleepRecord.setNotified(sleepRecord2.getNotified());
                }
            }
            List<SleepRecord> list = sleepList;
            list.clear();
            list.addAll(listConvertToSleepRecord);
        }
        checkAndNotify();
    }
}
