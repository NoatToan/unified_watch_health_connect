package com.xiaomi.fitness.training_plan.util;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.settings.CalendarHelper;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.training_plan_export.utils.UIDataUtils;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.cyi;
import defpackage.k1j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0014J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/HabitCalendarUtils;", "", "<init>", "()V", "TAG", "", "ONE_DAY_MILL", "", "HALF_ONE_DAY_MILL", "ONE_WEEK_MILL", "ONE_HOUR_MILL", "", "DAYS", "", "addNoneLoopHabitCalendarEvent", "", "Lcom/xiaomi/fitness/training_plan/settings/CalendarHelper$CalendarReminderEvent;", "habitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "addLoopHabitCalendarEvent", "", "context", "Landroid/content/Context;", "loopFromNextWeek", "buildHabitCalendarEvent", "daysOfWeek", "distance", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHabitCalendarUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitCalendarUtils.kt\ncom/xiaomi/fitness/training_plan/util/HabitCalendarUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1#2:120\n1863#3,2:121\n1863#3,2:123\n*S KotlinDebug\n*F\n+ 1 HabitCalendarUtils.kt\ncom/xiaomi/fitness/training_plan/util/HabitCalendarUtils\n*L\n53#1:121,2\n99#1:123,2\n*E\n"})
public final class HabitCalendarUtils {
    private static final long HALF_ONE_DAY_MILL = 43200000;
    private static final long ONE_DAY_MILL = 86400000;
    private static final int ONE_HOUR_MILL = 3600000;
    private static final long ONE_WEEK_MILL = 604800000;

    @NotNull
    private static final String TAG = "HabitCalendarUtils";

    @NotNull
    public static final HabitCalendarUtils INSTANCE = new HabitCalendarUtils();

    @NotNull
    private static final Map<Integer, String> DAYS = MapsKt__MapsKt.mapOf(TuplesKt.to(1, "MO"), TuplesKt.to(2, "TU"), TuplesKt.to(3, "WE"), TuplesKt.to(4, "TH"), TuplesKt.to(5, ServerConstants.FR_COUNTRY_CODE), TuplesKt.to(6, "SA"), TuplesKt.to(7, "SU"));

    private HabitCalendarUtils() {
    }

    public static /* synthetic */ boolean addLoopHabitCalendarEvent$default(HabitCalendarUtils habitCalendarUtils, Context context, HabitPlan habitPlan, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return habitCalendarUtils.addLoopHabitCalendarEvent(context, habitPlan, z);
    }

    private final List<CalendarHelper.CalendarReminderEvent> buildHabitCalendarEvent(List<Integer> daysOfWeek, float distance, boolean loopFromNextWeek) {
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int iCalcCurDayOfWeek = CalendarUtils.INSTANCE.calcCurDayOfWeek();
        calendar.set(i, i2, i3, 0, 0, 0);
        long j = 1000;
        long timeInMillis = (calendar.getTimeInMillis() / j) * j;
        Iterator<T> it = daysOfWeek.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            long j2 = (loopFromNextWeek ? (((long) (iIntValue - iCalcCurDayOfWeek)) * 86400000) + timeInMillis + 604800000 : (((long) (iIntValue - iCalcCurDayOfWeek)) * 86400000) + timeInMillis) + ((long) 28800000);
            String str = "FREQ=WEEKLY;WKST=SU;BYDAY=" + ((Object) DAYS.get(Integer.valueOf(iIntValue))) + ";";
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(cyi.f14869r, (int) distance, UIDataUtils.INSTANCE.calcFloatNumber(distance));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            arrayList.add(new CalendarHelper.CalendarReminderEvent(quantityString, ResourceExtKt.getString(k1j.c1), j2, j2 + ((long) 28800000), str));
        }
        return arrayList;
    }

    public static /* synthetic */ List buildHabitCalendarEvent$default(HabitCalendarUtils habitCalendarUtils, List list, float f, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return habitCalendarUtils.buildHabitCalendarEvent(list, f, z);
    }

    public final boolean addLoopHabitCalendarEvent(@NotNull Context context, @Nullable HabitPlan habitPlan, boolean loopFromNextWeek) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNull(habitPlan);
        return CalendarHelper.INSTANCE.saveToCalendar(context, buildHabitCalendarEvent(habitPlan.getDayOfWeek(), habitPlan.getDistance(), loopFromNextWeek));
    }

    @Nullable
    public final List<CalendarHelper.CalendarReminderEvent> addNoneLoopHabitCalendarEvent(@Nullable HabitPlan habitPlan) {
        if (habitPlan == null) {
            Logger.d(TAG, "buildHabitCalendarEvent with empty habit plan!!");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int iCalcCurDayOfWeek = CalendarUtils.INSTANCE.calcCurDayOfWeek();
        calendar.set(i, i2, i3, 0, 0, 0);
        long j = 1000;
        long timeInMillis = (calendar.getTimeInMillis() / j) * j;
        Date date2 = new Date(timeInMillis);
        Logger.d(TAG, "curDayStartTimeStamp:" + timeInMillis + " - " + iCalcCurDayOfWeek);
        Iterator<T> it = habitPlan.getDayOfWeek().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue >= iCalcCurDayOfWeek) {
                long time = date2.getTime() + (((long) (iIntValue - iCalcCurDayOfWeek)) * 86400000);
                arrayList.add(new CalendarHelper.CalendarReminderEvent(ResourceExtKt.getString(k1j.D0), ResourceExtKt.getString(k1j.c1), time, time + 86400000, ""));
            }
        }
        return arrayList;
    }
}
