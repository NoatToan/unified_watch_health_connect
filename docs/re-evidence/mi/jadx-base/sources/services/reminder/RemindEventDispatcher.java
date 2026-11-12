package services.reminder;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckSettingConfig;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.bjk;
import defpackage.cjk;
import defpackage.mjk;
import defpackage.njk;
import defpackage.owg;
import defpackage.qwg;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.reminder.RemindEventDispatcher;
import services.reminder.data.db.ReminderDB;
import services.reminder.notification.PopNotificationTask;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B\u0011\u0012\b\u0010.\u001a\u0004\u0018\u00010'¢\u0006\u0004\b/\u00100J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J%\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,¨\u00062"}, d2 = {"Lservices/reminder/RemindEventDispatcher;", "", "", "Lmjk;", "reminders", "Lservices/reminder/RemindEvent;", "remindEvent", "", "inflateNoticeInfo", "(Ljava/util/List;Lservices/reminder/RemindEvent;)V", "performReminder", "(Ljava/util/List;)V", "updateLastRemindTime", "getValidReminders", "(Ljava/util/List;)Ljava/util/List;", "", "", "assortByChannel", "(Ljava/util/List;)Ljava/util/Map;", "onTimedEventChange", "()V", "cancelAllTimedWork", "Lnjk;", "dao", "registerNextTimedEvent", "(Lnjk;Ljava/util/List;)V", "", "timedValue", "", "delay", "enqueueTimedWork", "(IJ)V", HealthCheckSettingConfig.KEY_REMINDER, "Lservices/reminder/RemindCallback;", PluginDeviceInfo.FICONON, "performRemindCallback", "(Lmjk;Lservices/reminder/RemindCallback;Lservices/reminder/RemindEvent;)Ljava/lang/String;", "onDispatchRemindEvent", "(Lservices/reminder/RemindEvent;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mTimedEventChanged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mHandleTimedEventChange", "ctx", "<init>", "(Landroid/content/Context;)V", "Companion", "reminder_release"}, k = 1, mv = {2, 0, 0})
public final class RemindEventDispatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "MiHealth:RemindEventDispatcher";

    @NotNull
    private final Context mContext;

    @NotNull
    private final AtomicBoolean mTimedEventChanged = new AtomicBoolean(false);

    @NotNull
    private final AtomicBoolean mHandleTimedEventChange = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lservices/reminder/RemindEventDispatcher$Companion;", "", "<init>", "()V", "TAG", "", "createRemindCallback", "Lservices/reminder/RemindCallback;", "clz", "reminder_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRemindEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemindEventDispatcher.kt\nservices/reminder/RemindEventDispatcher$Companion\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,249:1\n108#2:250\n80#2,22:251\n*S KotlinDebug\n*F\n+ 1 RemindEventDispatcher.kt\nservices/reminder/RemindEventDispatcher$Companion\n*L\n228#1:250\n228#1:251,22\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final RemindCallback createRemindCallback(@NotNull String clz) {
            Intrinsics.checkNotNullParameter(clz, "clz");
            int length = clz.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) clz.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string = clz.subSequence(i, length + 1).toString();
            if (string.length() == 0) {
                return null;
            }
            try {
                return (RemindCallback) Class.forName(string).asSubclass(RemindCallback.class).newInstance();
            } catch (ReflectiveOperationException e) {
                Logger.e(RemindEventDispatcher.TAG, "create remind callback fail, " + string + "," + e);
                return null;
            }
        }
    }

    public RemindEventDispatcher(@Nullable Context context) {
        Intrinsics.checkNotNull(context);
        this.mContext = UIUtils.getSafeContext(context);
        LiveData<List<mjk>> liveDataG = ReminderDB.g(context).j().g(0);
        Intrinsics.checkNotNull(liveDataG);
        liveDataG.observeForever(new RemindEventDispatcher$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ajk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RemindEventDispatcher._init_$lambda$3(this.f1103a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(final RemindEventDispatcher this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExecutorHelper.runInBackground(new Runnable() { // from class: zik
            @Override // java.lang.Runnable
            public final void run() {
                RemindEventDispatcher.lambda$3$lambda$2(this.f41321a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<String, mjk> assortByChannel(List<? extends mjk> reminders) {
        int i;
        ArrayMap arrayMap = new ArrayMap();
        for (mjk mjkVar : reminders) {
            owg owgVarA = mjkVar.a();
            if (owgVarA != null && (i = owgVarA.e) >= 0 && i <= 10) {
                owg.b bVar = owgVarA.c;
                Intrinsics.checkNotNull(bVar);
                String str = bVar.f29767a;
                mjk mjkVar2 = (mjk) arrayMap.get(str);
                if (mjkVar2 != null) {
                    owg owgVarA2 = mjkVar2.a();
                    Intrinsics.checkNotNull(owgVarA2);
                    if (owgVarA2.e <= i) {
                    }
                }
                Intrinsics.checkNotNull(str);
                arrayMap.put(str, mjkVar);
            }
        }
        return arrayMap;
    }

    private final void cancelAllTimedWork() {
        PendingIntent broadcastPendingIntent$default = PendingIntentExtKt.getBroadcastPendingIntent$default(this.mContext, 0, new Intent(this.mContext, (Class<?>) TimedBroadcastReceiver.class), 0, 4, null);
        Object systemService = this.mContext.getSystemService(DialWidgetType.ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(broadcastPendingIntent$default);
    }

    private final void enqueueTimedWork(int timedValue, long delay) {
        Intent intent = new Intent(this.mContext, (Class<?>) TimedBroadcastReceiver.class);
        intent.putExtra(TimedBroadcastReceiver.KEY_TIMELINE, timedValue);
        PendingIntent broadcastPendingIntent$default = PendingIntentExtKt.getBroadcastPendingIntent$default(this.mContext, 0, intent, 0, 4, null);
        long jCurrentTimeMillis = System.currentTimeMillis() + delay;
        AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(this.mContext, jCurrentTimeMillis, broadcastPendingIntent$default, 0, 4, null);
        Logger.i(TAG, "Set next timed event at:" + TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(jCurrentTimeMillis / ((long) 1000), false, 2, null));
    }

    private final List<mjk> getValidReminders(List<? extends mjk> reminders) {
        ArrayList arrayList = new ArrayList(reminders);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((mjk) it.next()).a() == null) {
                it.remove();
            }
        }
        return arrayList;
    }

    private final void inflateNoticeInfo(List<? extends mjk> reminders, RemindEvent remindEvent) {
        String strPerformRemindCallback;
        qwg qwgVarI = ReminderDB.g(this.mContext).i();
        Intrinsics.checkNotNullExpressionValue(qwgVarI, "noticeDao(...)");
        for (mjk mjkVar : reminders) {
            String str = mjkVar.e;
            if (TextUtils.isEmpty(str)) {
                strPerformRemindCallback = mjkVar.f;
            } else {
                Companion companion = INSTANCE;
                Intrinsics.checkNotNull(str);
                strPerformRemindCallback = performRemindCallback(mjkVar, companion.createRemindCallback(str), remindEvent);
            }
            mjkVar.b(strPerformRemindCallback != null ? qwgVarI.c(strPerformRemindCallback) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(RemindEventDispatcher this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTimedEventChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDispatchRemindEvent$lambda$0(RemindEventDispatcher this$0, RemindEvent remindEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(remindEvent, "$remindEvent");
        this$0.onDispatchRemindEvent(remindEvent);
    }

    private final void onTimedEventChange() {
        List<mjk> listH;
        Logger.i("MiHealth", "RemindEventDispatcher onTimedEventChange..");
        if (this.mTimedEventChanged.compareAndSet(false, true)) {
            njk njkVarJ = null;
            if (this.mHandleTimedEventChange.compareAndSet(false, true)) {
                listH = null;
                while (this.mTimedEventChanged.compareAndSet(true, false)) {
                    try {
                        njkVarJ = ReminderDB.g(this.mContext).j();
                        listH = njkVarJ.h(0, 1);
                    } catch (Throwable th) {
                        this.mHandleTimedEventChange.set(false);
                        throw th;
                    }
                }
                this.mHandleTimedEventChange.set(false);
            } else {
                listH = null;
            }
            if (njkVarJ == null || listH == null) {
                return;
            }
            registerNextTimedEvent(njkVarJ, listH);
        }
    }

    private final String performRemindCallback(mjk reminder, RemindCallback c, RemindEvent remindEvent) {
        if (c != null) {
            try {
                String reminderId = reminder.f26934a;
                Intrinsics.checkNotNullExpressionValue(reminderId, "reminderId");
                bjk bjkVarOnPreRemind = c.onPreRemind(this.mContext, reminderId, remindEvent);
                if (bjkVarOnPreRemind != null) {
                    bjkVarOnPreRemind.h(reminderId);
                    if (bjkVarOnPreRemind.f()) {
                        cjk cjkVarH = ReminderDB.g(this.mContext).h();
                        Intrinsics.checkNotNullExpressionValue(cjkVarH, "getRemindMappingDao(...)");
                        bjkVarOnPreRemind.g(System.currentTimeMillis());
                        cjkVarH.b(bjkVarOnPreRemind);
                        return bjkVarOnPreRemind.c();
                    }
                    Logger.e(TAG, "mapping is invalid:" + bjkVarOnPreRemind);
                }
            } catch (Exception e) {
                Logger.e(TAG, "performRemindCallback fail:" + e);
            }
        }
        return null;
    }

    private final void performReminder(List<? extends mjk> reminders) {
        if (reminders.isEmpty()) {
            Logger.INSTANCE.v(TAG, "performReminder, but is empty");
        } else {
            ExecutorHelper.runInBackground(new PopNotificationTask(this.mContext, reminders, null));
        }
    }

    private final void registerNextTimedEvent(njk dao, List<? extends mjk> reminders) {
        if (reminders == null || reminders.isEmpty()) {
            cancelAllTimedWork();
            return;
        }
        mjk mjkVar = reminders.get(0);
        Calendar calendar = Calendar.getInstance();
        List<mjk> listH = dao.h((calendar.get(11) * 100) + calendar.get(12), 1);
        if (listH == null || listH.isEmpty()) {
            calendar.add(5, 1);
        } else {
            mjk mjkVar2 = listH.get(0);
            Intrinsics.checkNotNull(mjkVar2);
            mjkVar = mjkVar2;
        }
        calendar.set(11, mjkVar.d / 100);
        calendar.set(12, mjkVar.d % 100);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis() - System.currentTimeMillis();
        if (timeInMillis < 0) {
            Logger.w(TAG, "set next timed event but delay < 0");
        } else {
            enqueueTimedWork(mjkVar.d, timeInMillis);
        }
    }

    private final void updateLastRemindTime(final List<? extends mjk> reminders) {
        if (reminders.isEmpty()) {
            return;
        }
        final njk njkVarJ = ReminderDB.g(this.mContext).j();
        Intrinsics.checkNotNullExpressionValue(njkVarJ, "reminderDao(...)");
        ExecutorHelper.runInBackground(new Runnable() { // from class: yik
            @Override // java.lang.Runnable
            public final void run() {
                RemindEventDispatcher.updateLastRemindTime$lambda$1(reminders, njkVarJ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateLastRemindTime$lambda$1(List reminders, njk reminderDao) {
        Intrinsics.checkNotNullParameter(reminders, "$reminders");
        Intrinsics.checkNotNullParameter(reminderDao, "$reminderDao");
        Iterator it = reminders.iterator();
        while (it.hasNext()) {
            mjk mjkVar = (mjk) it.next();
            mjkVar.i = System.currentTimeMillis();
            reminderDao.d(mjkVar);
        }
    }

    public final void onDispatchRemindEvent(@NotNull final RemindEvent remindEvent) {
        List<mjk> listI;
        Intrinsics.checkNotNullParameter(remindEvent, "remindEvent");
        if (UIUtils.INSTANCE.isInMainThread()) {
            ExecutorHelper.runInBackground(new Runnable() { // from class: xik
                @Override // java.lang.Runnable
                public final void run() {
                    RemindEventDispatcher.onDispatchRemindEvent$lambda$0(this.f39162a, remindEvent);
                }
            });
            return;
        }
        njk njkVarJ = ReminderDB.g(this.mContext).j();
        Intrinsics.checkNotNullExpressionValue(njkVarJ, "reminderDao(...)");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (remindEvent instanceof TimedEvent) {
            listI = njkVarJ.c(((TimedEvent) remindEvent).getTimeline(), jCurrentTimeMillis);
            onTimedEventChange();
        } else {
            listI = njkVarJ.i(remindEvent.getEventType(), jCurrentTimeMillis);
        }
        if (listI == null || listI.isEmpty()) {
            return;
        }
        inflateNoticeInfo(listI, remindEvent);
        updateLastRemindTime(listI);
        performReminder(getValidReminders(listI));
    }
}
