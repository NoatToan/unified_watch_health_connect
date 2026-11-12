package com.xiaomi.fitness.training_plan.util;

import android.content.Context;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.net.SportRemindSettings;
import com.xiaomi.fitness.training_plan.net.SportRemindSettingsCalendar;
import com.xiaomi.fitness.training_plan.net.SportRemindSettingsCalendarCourse;
import com.xiaomi.fitness.training_plan.settings.CalendarHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/SportCalendarUtils;", "", "<init>", "()V", "TAG", "", "ONE_DAY_MILL", "", "addLoopSportCalendarEvent", "", "context", "Landroid/content/Context;", "sportPlan", "Lcom/xiaomi/fitness/training_plan/net/SportRemindSettings;", "buildSportCalendarEvent", "", "Lcom/xiaomi/fitness/training_plan/settings/CalendarHelper$CalendarReminderEvent;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportCalendarUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportCalendarUtils.kt\ncom/xiaomi/fitness/training_plan/util/SportCalendarUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1863#2:54\n1863#2,2:55\n1864#2:57\n*S KotlinDebug\n*F\n+ 1 SportCalendarUtils.kt\ncom/xiaomi/fitness/training_plan/util/SportCalendarUtils\n*L\n32#1:54\n35#1:55,2\n32#1:57\n*E\n"})
public final class SportCalendarUtils {

    @NotNull
    public static final SportCalendarUtils INSTANCE = new SportCalendarUtils();
    private static final long ONE_DAY_MILL = 86400000;

    @NotNull
    private static final String TAG = "SportCalendarUtils";

    private SportCalendarUtils() {
    }

    private final List<CalendarHelper.CalendarReminderEvent> buildSportCalendarEvent(SportRemindSettings sportPlan) {
        Iterator it;
        if (sportPlan == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<SportRemindSettingsCalendar> calendars = sportPlan.getCalendars();
        if (calendars != null) {
            Iterator it2 = calendars.iterator();
            while (it2.hasNext()) {
                SportRemindSettingsCalendar sportRemindSettingsCalendar = (SportRemindSettingsCalendar) it2.next();
                long datetamp = sportRemindSettingsCalendar.getDatetamp() * ((long) 1000);
                long j = 86400000 + datetamp;
                Iterator<T> it3 = sportRemindSettingsCalendar.getCourses().iterator();
                while (it3.hasNext()) {
                    try {
                        it = it2;
                        try {
                            arrayList.add(new CalendarHelper.CalendarReminderEvent(((SportRemindSettingsCalendarCourse) it3.next()).getCourseName(), sportPlan.getName(), datetamp, j, ""));
                        } catch (Exception e) {
                            e = e;
                            Logger.e(TAG, "buildCalendarEvent exception", e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        it = it2;
                    }
                    it2 = it;
                }
            }
        }
        return arrayList;
    }

    public final boolean addLoopSportCalendarEvent(@NotNull Context context, @Nullable SportRemindSettings sportPlan) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CalendarHelper.INSTANCE.saveToCalendar(context, buildSportCalendarEvent(sportPlan));
    }
}
