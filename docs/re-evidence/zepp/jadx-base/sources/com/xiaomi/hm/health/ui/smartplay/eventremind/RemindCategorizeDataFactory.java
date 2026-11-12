package com.xiaomi.hm.health.ui.smartplay.eventremind;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.collections.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0011\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0016\u0010\t\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007R\u001d\u0010\u000e\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/eventremind/RemindCategorizeDataFactory;", "", "", "a", "Lcom/xiaomi/hm/health/ui/smartplay/eventremind/ComparableReminder;", NotificationCompat.CATEGORY_REMINDER, "c", "", "reminders", "categorizeReminders", "Lcom/xiaomi/hm/health/ui/smartplay/eventremind/ReminderCategoryHelper;", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/ui/smartplay/eventremind/ReminderCategoryHelper;", "mReminderCategoryHelper", "", "<set-?>", "Ljava/util/List;", "getMTodayReminders", "()Ljava/util/List;", "mTodayReminders", "getMTomorrowReminders", "mTomorrowReminders", GoogleApiAvailabilityLight.a, "getMLaterReminders", "mLaterReminders", "e", "getMEndedReminders", "mEndedReminders", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class RemindCategorizeDataFactory {

    @NotNull
    private static final String f = "CategorizeRemindHelper";

    @NotNull
    private static final String g = "yyyy-MM-dd HH:mm";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mReminderCategoryHelper = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<ComparableReminder> mTodayReminders = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<ComparableReminder> mTomorrowReminders = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<ComparableReminder> mLaterReminders = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<ComparableReminder> mEndedReminders = new ArrayList();

    @NotNull
    private static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "illegal dayThen: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "categorizeReminders exception: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/eventremind/ReminderCategoryHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ReminderCategoryHelper> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReminderCategoryHelper invoke() {
            return new ReminderCategoryHelper();
        }
    }

    private final void a() {
        this.mTodayReminders.clear();
        this.mTomorrowReminders.clear();
        this.mLaterReminders.clear();
        this.mEndedReminders.clear();
    }

    private final ReminderCategoryHelper b() {
        return (ReminderCategoryHelper) this.mReminderCategoryHelper.getValue();
    }

    private final void c(ComparableReminder reminder) {
        if (reminder == null) {
            return;
        }
        int remindType = reminder.getRemindType();
        if (remindType == -1) {
            this.mEndedReminders.add(reminder);
            return;
        }
        if (remindType == 0) {
            this.mTodayReminders.add(reminder);
        } else if (remindType == 1) {
            this.mTomorrowReminders.add(reminder);
        } else {
            if (remindType != 2) {
                return;
            }
            this.mLaterReminders.add(reminder);
        }
    }

    public final synchronized void categorizeReminders(@Nullable List<? extends ComparableReminder> reminders) {
        ComparableReminder comparableReminderCategorizeDaily;
        if (reminders == null) {
            try {
                reminders = new ArrayList<>();
            } catch (Throwable th) {
                throw th;
            }
        }
        a();
        try {
            for (ComparableReminder comparableReminder : reminders) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(13, 0);
                calendar.set(14, 0);
                Calendar calendar2 = Calendar.getInstance();
                Date date = h.parse(comparableReminder.getReminder().getStartDate());
                if (date != null) {
                    calendar2.setTime(date);
                    int i = calendar2.get(5);
                    if (i > 31) {
                        HMLog.info(f, new a(i));
                        throw new IllegalArgumentException("illegal dayThen: " + i);
                    }
                    String loop = comparableReminder.getReminder().getLoop();
                    if (loop != null) {
                        int iHashCode = loop.hashCode();
                        if (iHashCode != 48) {
                            if (iHashCode != 1567) {
                                if (iHashCode != 56) {
                                    comparableReminderCategorizeDaily = (iHashCode == 57 && loop.equals("9")) ? b().categorizeYearly(calendar, comparableReminder) : b().categorizeWeekly(calendar, comparableReminder);
                                } else if (loop.equals("8")) {
                                    comparableReminderCategorizeDaily = b().categorizeMonthly(calendar, comparableReminder);
                                }
                            } else if (loop.equals("10")) {
                                comparableReminderCategorizeDaily = b().categorizeOnce(calendar, comparableReminder);
                            }
                        } else if (loop.equals("0")) {
                            comparableReminderCategorizeDaily = b().categorizeDaily(calendar, comparableReminder);
                        }
                    }
                    c(comparableReminderCategorizeDaily);
                }
            }
            g.sort(this.mTodayReminders);
            g.sort(this.mTomorrowReminders);
            g.sort(this.mLaterReminders);
            g.sort(this.mEndedReminders);
            j.reverse(this.mEndedReminders);
        } catch (Exception e) {
            HMLog.info(f, new b(e));
            e.printStackTrace();
        }
    }

    @NotNull
    public final List<ComparableReminder> getMEndedReminders() {
        return this.mEndedReminders;
    }

    @NotNull
    public final List<ComparableReminder> getMLaterReminders() {
        return this.mLaterReminders;
    }

    @NotNull
    public final List<ComparableReminder> getMTodayReminders() {
        return this.mTodayReminders;
    }

    @NotNull
    public final List<ComparableReminder> getMTomorrowReminders() {
        return this.mTomorrowReminders;
    }
}
