package services.reminder;

import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.handler.JobHandlerProvider;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.bjk;
import defpackage.cjk;
import defpackage.mjk;
import defpackage.njk;
import defpackage.owg;
import defpackage.qwg;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.reminder.ReminderHelper;
import services.reminder.data.db.ReminderDB;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bF\u0010GJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJC\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010$\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b*\u0010)J7\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010,J?\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010.0-2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010/J/\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u00100JC\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010.0-2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u00101J\u001f\u00102\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u00103J)\u00104\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b4\u0010\tJ\u001f\u00105\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b5\u00103JO\u0010:\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0010\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u0001062\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u0001082\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010.0-¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b<\u0010\u001aJ\u001f\u0010=\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b=\u00103R8\u0010A\u001a&\u0012\f\u0012\n ?*\u0004\u0018\u00010&0& ?*\u0012\u0012\f\u0012\n ?*\u0004\u0018\u00010&0&\u0018\u00010@0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020&0\u00048F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lservices/reminder/ReminderHelper;", "", "Landroid/content/Context;", "safeContext", "", "Lowg;", "notices", "", "insertNotice", "(Landroid/content/Context;[Lowg;)V", "ctx", "", "remindId", "", "timed", "defNoticeId", "remindCallback", "", "remindInterval", "registerOrReplaceTimedReminder", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V", "event", "registerOrReplaceEventReminder", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "context", "checkNoticeCancelable", "(Landroid/content/Context;)V", "Landroid/app/NotificationManager;", "notificationManager", "Lbjk;", "remindNoticeMapping", "currentTimeMills", "Lcjk;", "mappingDao", "Lnjk;", "reminderDao", "cancelNoticeIfNeed", "(Landroid/app/NotificationManager;Lbjk;JLcjk;Lnjk;)V", "Lservices/reminder/NoticeCallback;", "cb", "registerNoticeCallback", "(Lservices/reminder/NoticeCallback;)V", "unregisterNoticeCallback", "noticeId", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Ljava/lang/Class;", "Lservices/reminder/RemindCallback;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;I)V", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Class;J)V", "unregisterReminder", "(Landroid/content/Context;Ljava/lang/String;)V", "registerOrReplaceNotice", "unregisterNotice", "", "deleteReminds", "", "newReminds", "deleteAndReRegisterTimedReminder", "(Landroid/content/Context;Ljava/util/List;Ljava/util/Map;Ljava/lang/Class;)V", "remindNoticeCheck", "deleteNoticeMapping", "", "kotlin.jvm.PlatformType", "", "sNoticeCallbacks", "Ljava/util/Set;", "getNoticeCallbacks", "()[Lservices/reminder/NoticeCallback;", "noticeCallbacks", "<init>", "()V", "reminder_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nReminderHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReminderHelper.kt\nservices/reminder/ReminderHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,273:1\n1#2:274\n37#3:275\n36#3,3:276\n*S KotlinDebug\n*F\n+ 1 ReminderHelper.kt\nservices/reminder/ReminderHelper\n*L\n109#1:275\n109#1:276,3\n*E\n"})
public final class ReminderHelper {

    @NotNull
    public static final ReminderHelper INSTANCE = new ReminderHelper();
    private static final Set<NoticeCallback> sNoticeCallbacks = Collections.newSetFromMap(new WeakHashMap());

    private ReminderHelper() {
    }

    private final void cancelNoticeIfNeed(NotificationManager notificationManager, bjk remindNoticeMapping, long currentTimeMills, cjk mappingDao, njk reminderDao) {
        String strC = remindNoticeMapping.c();
        int iD = remindNoticeMapping.d();
        if (currentTimeMills - remindNoticeMapping.b() >= remindNoticeMapping.a()) {
            mappingDao.a(strC);
            notificationManager.cancel(iD);
            return;
        }
        mjk mjkVarE = reminderDao.e(remindNoticeMapping.e());
        if (mjkVarE == null) {
            mappingDao.a(strC);
            return;
        }
        String str = mjkVarE.e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        RemindEventDispatcher.Companion companion = RemindEventDispatcher.INSTANCE;
        Intrinsics.checkNotNull(str);
        RemindCallback remindCallbackCreateRemindCallback = companion.createRemindCallback(str);
        Intrinsics.checkNotNull(remindCallbackCreateRemindCallback);
        if (remindCallbackCreateRemindCallback != null) {
            Intrinsics.checkNotNull(remindCallbackCreateRemindCallback);
            String str2 = mjkVarE.f26934a;
            Intrinsics.checkNotNull(str2);
            if (remindCallbackCreateRemindCallback.needCancelEventNotice(str2)) {
                mappingDao.a(strC);
                notificationManager.cancel(iD);
            }
        }
    }

    private final void checkNoticeCancelable(Context context) {
        Context safeContext = UIUtils.getSafeContext(context);
        ReminderDB reminderDBG = ReminderDB.g(safeContext);
        Intrinsics.checkNotNullExpressionValue(reminderDBG, "get(...)");
        njk njkVarJ = reminderDBG.j();
        Intrinsics.checkNotNullExpressionValue(njkVarJ, "reminderDao(...)");
        cjk cjkVarH = reminderDBG.h();
        Intrinsics.checkNotNullExpressionValue(cjkVarH, "getRemindMappingDao(...)");
        List<bjk> listC = cjkVarH.c();
        if (listC == null || listC.isEmpty()) {
            return;
        }
        Object systemService = safeContext.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (bjk bjkVar : listC) {
            Intrinsics.checkNotNull(bjkVar);
            cancelNoticeIfNeed(notificationManager, bjkVar, jCurrentTimeMillis, cjkVarH, njkVarJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteAndReRegisterTimedReminder$lambda$8(Context ctx, List list, Map map, Class remindCallback) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        Intrinsics.checkNotNullParameter(remindCallback, "$remindCallback");
        INSTANCE.deleteAndReRegisterTimedReminder(ctx, list, map, remindCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteNoticeMapping$lambda$11(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "$context");
        cjk cjkVarH = ReminderDB.g(context).h();
        Intrinsics.checkNotNullExpressionValue(cjkVarH, "getRemindMappingDao(...)");
        cjkVarH.a(str);
    }

    private final void insertNotice(Context safeContext, owg[] notices) {
        qwg qwgVarI = ReminderDB.g(safeContext).i();
        Intrinsics.checkNotNullExpressionValue(qwgVarI, "noticeDao(...)");
        for (owg owgVar : notices) {
            if (owgVar.f29762b != null) {
                owgVar.m();
                qwgVarI.b(owgVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerOrReplaceEventReminder$lambda$7(Context ctx, String remindId, String event, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        Intrinsics.checkNotNullParameter(remindId, "$remindId");
        Intrinsics.checkNotNullParameter(event, "$event");
        INSTANCE.registerOrReplaceEventReminder(ctx, remindId, event, str, str2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerOrReplaceNotice$lambda$3(Context safeContext, owg[] notices) {
        Intrinsics.checkNotNullParameter(safeContext, "$safeContext");
        Intrinsics.checkNotNullParameter(notices, "$notices");
        INSTANCE.insertNotice(safeContext, (owg[]) Arrays.copyOf(notices, notices.length));
    }

    public static /* synthetic */ void registerOrReplaceTimedReminder$default(ReminderHelper reminderHelper, Context context, String str, int i, Class cls, long j, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            j = 0;
        }
        reminderHelper.registerOrReplaceTimedReminder(context, str, i, cls, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerOrReplaceTimedReminder$lambda$6(Context ctx, String remindId, int i, String str, String str2, long j) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        Intrinsics.checkNotNullParameter(remindId, "$remindId");
        INSTANCE.registerOrReplaceTimedReminder(ctx, remindId, i, str, str2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void remindNoticeCheck$lambda$9(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        INSTANCE.checkNoticeCancelable(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterReminder$lambda$2(Context safeContext, String str) {
        Intrinsics.checkNotNullParameter(safeContext, "$safeContext");
        njk njkVarJ = ReminderDB.g(safeContext).j();
        Intrinsics.checkNotNullExpressionValue(njkVarJ, "reminderDao(...)");
        njkVarJ.a(str);
    }

    public final void deleteAndReRegisterTimedReminder(@NotNull final Context ctx, @Nullable final List<String> deleteReminds, @Nullable final Map<String, Integer> newReminds, @NotNull final Class<? extends RemindCallback> remindCallback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(remindCallback, "remindCallback");
        if (UIUtils.INSTANCE.isInMainThread()) {
            ExecutorHelper.runInBackground(new Runnable() { // from class: dkk
                @Override // java.lang.Runnable
                public final void run() {
                    ReminderHelper.deleteAndReRegisterTimedReminder$lambda$8(ctx, deleteReminds, newReminds, remindCallback);
                }
            });
            return;
        }
        ReminderDB reminderDBG = ReminderDB.g(ctx);
        Intrinsics.checkNotNullExpressionValue(reminderDBG, "get(...)");
        njk njkVarJ = reminderDBG.j();
        Intrinsics.checkNotNullExpressionValue(njkVarJ, "reminderDao(...)");
        if (deleteReminds != null && (!deleteReminds.isEmpty())) {
            Iterator<String> it = deleteReminds.iterator();
            while (it.hasNext()) {
                njkVarJ.a(it.next());
            }
        }
        if (newReminds == null || !(!newReminds.isEmpty())) {
            return;
        }
        for (Map.Entry<String, Integer> entry : newReminds.entrySet()) {
            registerOrReplaceTimedReminder$default(this, ctx, entry.getKey(), entry.getValue().intValue(), remindCallback, 0L, 16, null);
        }
    }

    public final void deleteNoticeMapping(@NotNull final Context context, @Nullable final String noticeId) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExecutorHelper.runInBackground(new Runnable() { // from class: ekk
            @Override // java.lang.Runnable
            public final void run() {
                ReminderHelper.deleteNoticeMapping$lambda$11(context, noticeId);
            }
        });
    }

    @NotNull
    public final NoticeCallback[] getNoticeCallbacks() {
        NoticeCallback[] noticeCallbackArr;
        Set<NoticeCallback> sNoticeCallbacks2 = sNoticeCallbacks;
        Intrinsics.checkNotNullExpressionValue(sNoticeCallbacks2, "sNoticeCallbacks");
        synchronized (sNoticeCallbacks2) {
            Intrinsics.checkNotNullExpressionValue(sNoticeCallbacks2, "sNoticeCallbacks");
            noticeCallbackArr = (NoticeCallback[]) sNoticeCallbacks2.toArray(new NoticeCallback[0]);
        }
        return noticeCallbackArr;
    }

    public final void registerNoticeCallback(@NotNull NoticeCallback cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        Set<NoticeCallback> sNoticeCallbacks2 = sNoticeCallbacks;
        Intrinsics.checkNotNullExpressionValue(sNoticeCallbacks2, "sNoticeCallbacks");
        synchronized (sNoticeCallbacks2) {
            Objects.requireNonNull(cb);
            sNoticeCallbacks2.add(cb);
        }
    }

    public final void registerOrReplaceEventReminder(@NotNull Context ctx, @NotNull String remindId, @NotNull String event, @Nullable String noticeId, int remindInterval) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(remindId, "remindId");
        Intrinsics.checkNotNullParameter(event, "event");
        registerOrReplaceEventReminder(UIUtils.getSafeContext(ctx), remindId, event, noticeId, null, remindInterval);
    }

    public final void registerOrReplaceNotice(@NotNull Context ctx, @NotNull final owg... notices) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(notices, "notices");
        final Context safeContext = UIUtils.getSafeContext(ctx);
        ExecutorHelper.runInBackground(new Runnable() { // from class: zjk
            @Override // java.lang.Runnable
            public final void run() {
                ReminderHelper.registerOrReplaceNotice$lambda$3(safeContext, notices);
            }
        });
    }

    @JvmOverloads
    public final void registerOrReplaceTimedReminder(@NotNull Context ctx, @NotNull String remindId, int i, @NotNull Class<? extends RemindCallback> remindCallback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(remindId, "remindId");
        Intrinsics.checkNotNullParameter(remindCallback, "remindCallback");
        registerOrReplaceTimedReminder$default(this, ctx, remindId, i, remindCallback, 0L, 16, null);
    }

    public final void remindNoticeCheck(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JobHandlerProvider.newJobHandler$default(JobHandlerProvider.INSTANCE, null, 1, null).newJob().postDelayed(new Runnable() { // from class: akk
            @Override // java.lang.Runnable
            public final void run() {
                ReminderHelper.remindNoticeCheck$lambda$9(context);
            }
        }, VibrateModeProgressBar.sLongToLong);
    }

    public final void unregisterNotice(@NotNull Context ctx, @Nullable String noticeId) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        qwg qwgVarI = ReminderDB.g(UIUtils.getSafeContext(ctx)).i();
        Intrinsics.checkNotNullExpressionValue(qwgVarI, "noticeDao(...)");
        qwgVarI.a(noticeId);
    }

    public final void unregisterNoticeCallback(@NotNull NoticeCallback cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        Set<NoticeCallback> sNoticeCallbacks2 = sNoticeCallbacks;
        Intrinsics.checkNotNullExpressionValue(sNoticeCallbacks2, "sNoticeCallbacks");
        synchronized (sNoticeCallbacks2) {
            Objects.requireNonNull(cb);
            sNoticeCallbacks2.remove(cb);
        }
    }

    public final void unregisterReminder(@NotNull Context ctx, @Nullable final String remindId) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        final Context safeContext = UIUtils.getSafeContext(ctx);
        ExecutorHelper.runInBackground(new Runnable() { // from class: bkk
            @Override // java.lang.Runnable
            public final void run() {
                ReminderHelper.unregisterReminder$lambda$2(safeContext, remindId);
            }
        });
    }

    public final void registerOrReplaceTimedReminder(@NotNull Context ctx, @NotNull String remindId, int timed, @Nullable String noticeId) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(remindId, "remindId");
        registerOrReplaceTimedReminder(UIUtils.getSafeContext(ctx), remindId, timed, noticeId, null, 0L);
    }

    public final void registerOrReplaceEventReminder(@NotNull Context ctx, @NotNull String remindId, @NotNull String event, @NotNull Class<? extends RemindCallback> remindCallback, int remindInterval) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(remindId, "remindId");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(remindCallback, "remindCallback");
        Context safeContext = UIUtils.getSafeContext(ctx);
        Objects.requireNonNull(remindCallback);
        registerOrReplaceEventReminder(safeContext, remindId, event, null, remindCallback.getName(), remindInterval);
    }

    @JvmOverloads
    public final void registerOrReplaceTimedReminder(@NotNull Context ctx, @NotNull String remindId, int timed, @NotNull Class<? extends RemindCallback> remindCallback, long remindInterval) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(remindId, "remindId");
        Intrinsics.checkNotNullParameter(remindCallback, "remindCallback");
        Context safeContext = UIUtils.getSafeContext(ctx);
        Objects.requireNonNull(remindCallback);
        registerOrReplaceTimedReminder(safeContext, remindId, timed, null, remindCallback.getName(), remindInterval);
    }

    private final void registerOrReplaceEventReminder(final Context ctx, final String remindId, final String event, final String defNoticeId, final String remindCallback, final int remindInterval) {
        if (UIUtils.INSTANCE.isInMainThread()) {
            ExecutorHelper.runInBackground(new Runnable() { // from class: ckk
                @Override // java.lang.Runnable
                public final void run() {
                    ReminderHelper.registerOrReplaceEventReminder$lambda$7(ctx, remindId, event, defNoticeId, remindCallback, remindInterval);
                }
            });
            return;
        }
        njk njkVarJ = ReminderDB.g(ctx).j();
        Intrinsics.checkNotNullExpressionValue(njkVarJ, "reminderDao(...)");
        mjk mjkVarJ = njkVarJ.j(event, remindId);
        if (mjkVarJ == null) {
            mjkVarJ = new mjk();
        }
        mjkVarJ.f26934a = remindId;
        mjkVarJ.f26935b = 1;
        mjkVarJ.c = event;
        mjkVarJ.e = remindCallback;
        mjkVarJ.f = defNoticeId;
        mjkVarJ.h = remindInterval;
        njkVarJ.b(mjkVarJ);
    }

    private final void registerOrReplaceTimedReminder(final Context ctx, final String remindId, final int timed, final String defNoticeId, final String remindCallback, final long remindInterval) {
        if (UIUtils.INSTANCE.isInMainThread()) {
            ExecutorHelper.runInBackground(new Runnable() { // from class: fkk
                @Override // java.lang.Runnable
                public final void run() {
                    ReminderHelper.registerOrReplaceTimedReminder$lambda$6(ctx, remindId, timed, defNoticeId, remindCallback, remindInterval);
                }
            });
            return;
        }
        njk njkVarJ = ReminderDB.g(ctx).j();
        Intrinsics.checkNotNullExpressionValue(njkVarJ, "reminderDao(...)");
        mjk mjkVarF = njkVarJ.f(timed, remindId);
        if (mjkVarF == null) {
            mjkVarF = new mjk();
        }
        mjkVarF.f26934a = remindId;
        mjkVarF.f26935b = 2;
        mjkVarF.d = timed;
        mjkVarF.e = remindCallback;
        mjkVarF.f = defNoticeId;
        mjkVarF.h = remindInterval;
        njkVarJ.b(mjkVarF);
    }
}
