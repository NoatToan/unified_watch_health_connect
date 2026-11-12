package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.provider.CalendarContract;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class hvl {
    public static int b(Context context) {
        int iC = c(context);
        if (iC < 0) {
            return 1;
        }
        LogUtil.a("CalendarEventUtil", "current id of CalendarAccount：" + iC);
        return iC;
    }

    private static int c(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, null, null, null, null);
            try {
                if (cursorQuery == null) {
                    LogUtil.a("CalendarEventUtil", "userCursor null in checking CalendarAccount");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToFirst();
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return i;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
                return 1;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException unused) {
            LogUtil.e("CalendarEventUtil", "checkCalendarAccount error");
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context, boolean z, long j, Workout workout, String str) {
        ContentValues contentValuesE = e(context, workout.acquireName(), str, j);
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (z) {
                contentValuesE.put("hwext_service_type", "SportsExercise");
                String strM = ped.m(workout.acquireDuration());
                FitWorkout fitWorkoutD = pea.d(workout);
                String str2 = iec.c(fitWorkoutD.acquireDifficulty()) + " " + strM + BaseApplication.getContext().getString(R.string.sug_unit_MIN);
                contentValuesE.put("hwext_service_description", str2);
                String strAcquireId = workout.acquireId();
                String strAccquireVersion = fitWorkoutD.accquireVersion();
                LogUtil.e("CalendarEventUtil", "courseVersion = " + strAccquireVersion);
                contentValuesE.put("hwext_service_cp_bz_uri", "huaweischeme://healthapp/fitnesspage?skip_type=train_details&id=" + strAcquireId + Constants.VERSION + strAccquireVersion);
                LogUtil.a("CalendarEventUtil", "extDescription = ", str2, "cid=", strAcquireId, Constants.VERSION, strAccquireVersion);
                Uri uriInsert = contentResolver.insert(Uri.parse("content://com.huawei.calendar/events"), contentValuesE);
                LogUtil.a("CalendarEventUtil", "insert event into huawei calendar, uri=", uriInsert);
                if (uriInsert == null) {
                    LogUtil.a("CalendarEventUtil", "insert event into android calendar, uri=", contentResolver.insert(CalendarContract.Events.CONTENT_URI, e(context, workout.acquireName(), str, j)));
                    return;
                }
                return;
            }
            LogUtil.a("CalendarEventUtil", "insert event into android calendar, uri=", contentResolver.insert(CalendarContract.Events.CONTENT_URI, contentValuesE));
        } catch (IllegalArgumentException e) {
            LogUtil.c("CalendarEventUtil", "insertEvents exception:", LogAnonymous.b(e));
        }
    }

    private static void e(Context context, boolean z, long j, pds pdsVar, String str) {
        if (pdsVar == null) {
            return;
        }
        ContentValues contentValuesE = e(context, pdsVar.b(), str, j);
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (z) {
                contentValuesE.put("hwext_service_type", "SportsExercise");
                String strD = pdsVar.d();
                long jE = pdsVar.e();
                if (strD != null && !"Race".equals(strD)) {
                    if (jE >= 60) {
                        contentValuesE.put("hwext_service_description", ped.m(jE) + BaseApplication.getContext().getString(R.string.sug_unit_MIN));
                    }
                    contentValuesE.put("hwext_service_cp_bz_uri", "huaweischeme://healthapp/fitnesspage?skip_type=train_details&id=" + strD + "&version=2.0");
                    Uri uriInsert = contentResolver.insert(Uri.parse("content://com.huawei.calendar/events"), contentValuesE);
                    LogUtil.a("CalendarEventUtil", "insertEventsForIntPlan insert event into huawei calendar, uri=" + uriInsert);
                    if (uriInsert == null) {
                        LogUtil.a("CalendarEventUtil", "insertEventsForIntPlan into android calendar, uri=" + contentResolver.insert(CalendarContract.Events.CONTENT_URI, e(context, pdsVar.b(), str, j)));
                        return;
                    }
                    return;
                }
                ReleaseLogUtil.d("CalendarEventUtil", "insertEventsForIntPlan ", strD);
                return;
            }
            LogUtil.e("CalendarEventUtil", "insertEventsForIntPlan insert event into android calendar, uri=" + contentResolver.insert(CalendarContract.Events.CONTENT_URI, contentValuesE));
        } catch (IllegalArgumentException e) {
            LogUtil.c("CalendarEventUtil", "insertEventsForIntPlan exception:", LogAnonymous.b(e));
        }
    }

    private static ContentValues e(Context context, String str, String str2, long j) {
        ContentValues contentValues = new ContentValues();
        String id = TimeZone.getDefault().getID();
        LogUtil.a("CalendarEventUtil", "timezone:", id, " startTime:", Long.valueOf(j), " courseName:", str);
        contentValues.put("eventTimezone", id);
        contentValues.put("eventEndTimezone", id);
        contentValues.put("allDay", (Integer) 1);
        contentValues.put("title", str);
        contentValues.put("description", str2);
        contentValues.put("eventStatus", (Integer) 1);
        contentValues.put("selfAttendeeStatus", (Integer) 1);
        contentValues.put("dtstart", Long.valueOf(j));
        contentValues.put("dtend", Long.valueOf(j + 86400000));
        contentValues.put("hasAlarm", (Integer) 1);
        contentValues.put("calendar_id", Integer.valueOf(b(context)));
        contentValues.put("guestsCanModify", (Boolean) false);
        contentValues.put("isOrganizer", (Boolean) true);
        contentValues.put("accessLevel", (Integer) 0);
        contentValues.put("guestsCanInviteOthers", (Boolean) false);
        contentValues.put("guestsCanModify", (Boolean) false);
        contentValues.put("customAppUri", "huaweischeme://healthapp/fitnesspage?skip_type=main_page&fitness_type=2");
        contentValues.put("exdate", "huaweischeme://healthapp/fitnesspage?skip_type=main_page&fitness_type=2");
        return contentValues;
    }

    public static boolean c(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return false;
        }
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient("com.huawei.calendar");
        try {
            LogUtil.a("CalendarEventUtil", "isSupportHWCalendarService:", Boolean.valueOf(contentProviderClientAcquireUnstableContentProviderClient != null));
            boolean z = contentProviderClientAcquireUnstableContentProviderClient != null;
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            return z;
        } catch (Throwable th) {
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void e(Context context, String str, IntPlan.PlanType planType) {
        if (planType != null) {
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("type", Integer.valueOf(planType.getType()));
            lmf.d().c(context, AnalyticsValue.INT_PLAN_1120041.value(), map, 0);
        }
        final ContentResolver contentResolver = context.getContentResolver();
        final String str2 = "(customAppUri = ? OR exdate = ?)";
        lsy.a(new Runnable() { // from class: hvs
            @Override // java.lang.Runnable
            public final void run() {
                hvl.a(contentResolver, str2);
            }
        });
    }

    static /* synthetic */ void a(ContentResolver contentResolver, String str) {
        try {
            ReleaseLogUtil.c("CalendarEventUtil", "delete " + contentResolver.delete(CalendarContract.Events.CONTENT_URI, str, new String[]{"huaweischeme://healthapp/fitnesspage?skip_type=main_page&fitness_type=2", "huaweischeme://healthapp/fitnesspage?skip_type=main_page&fitness_type=2"}) + " events of the invalid plan");
        } catch (IllegalArgumentException e) {
            ReleaseLogUtil.b("CalendarEventUtil", "deleteCalendarEvent exception:", LogAnonymous.b(e));
        }
    }

    public static boolean d(Context context) {
        if (context == null) {
            return false;
        }
        return PermissionUtil.b(context, PermissionUtil.c(PermissionUtil.PermissionType.CALENDAR));
    }

    public static void e(final IntPlan intPlan, final Context context, int i) {
        if (intPlan == null) {
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", Integer.valueOf(intPlan.getPlanType().getType()));
        map.put("from", Integer.valueOf(i));
        lmf.d().c(context, AnalyticsValue.INT_PLAN_1120040.value(), map, 0);
        String strE = buh.e("ai_plan_sync");
        String strE2 = buh.e("ai_plan_sync_name");
        if (strE != null && !strE.equals(intPlan.getPlanId())) {
            e(context, strE2, (IntPlan.PlanType) null);
            buh.c("ai_plan_sync_name");
            buh.c("ai_plan_sync");
        }
        buh.d("ai_plan_sync", intPlan.getPlanId());
        buh.d("ai_plan_sync_name", intPlan.getMetaInfo().getName());
        final int weekCount = intPlan.getMetaInfo().getWeekCount();
        final ContentResolver contentResolver = context.getContentResolver();
        lsy.a(new Runnable() { // from class: hvr
            @Override // java.lang.Runnable
            public final void run() {
                hvl.d(intPlan, context, weekCount, hvl.c(contentResolver));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(IntPlan intPlan, Context context, int i, boolean z) {
        long beginDate = intPlan.getPlanTimeInfo().getBeginDate() * 1000;
        LogUtil.a("CalendarEventUtil", "planStartTime = ", Long.valueOf(beginDate));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(beginDate);
        int iB = ift.b(calendar.get(7));
        int i2 = calendar.get(15);
        int i3 = calendar.get(16);
        calendar.add(14, i2 + i3);
        long timeInMillis = calendar.getTimeInMillis();
        LogUtil.a("CalendarEventUtil", "zoneOffset:", Integer.valueOf(i2), " dstOffset:", Integer.valueOf(i3), " planStartTimeUtc:", Long.valueOf(timeInMillis), "dayOrder:", Integer.valueOf(iB));
        int i4 = 0;
        while (i4 < i) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i4);
            if (weekInfoByIdx != null) {
                for (int i5 = 0; i5 < weekInfoByIdx.getDayCount(); i5++) {
                    IntDayPlan dayByIdx = weekInfoByIdx.getDayByIdx(i5);
                    if (dayByIdx != null) {
                        int i6 = i4 == 0 ? i5 : (8 - iB) + ((i4 - 1) * 7) + i5;
                        long j = timeInMillis + (((long) i6) * 86400000);
                        String name = intPlan.getMetaInfo().getName();
                        LogUtil.a("CalendarEventUtil", "insertEventsForIntPlan: extraDay = ", Integer.valueOf(i6), " eventStartTime=", Long.valueOf(j), "planName = ", name);
                        if (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN || intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
                            c(context, z, dayByIdx, j, name);
                        } else {
                            a(context, z, dayByIdx, j, name);
                        }
                    }
                }
            }
            i4++;
        }
    }

    private static void a(final Context context, final boolean z, IntDayPlan intDayPlan, final long j, final String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            if (inPlanAction != null) {
                arrayList.add(new gzl.a(inPlanAction.getActionId()).c());
            }
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.c("CalendarEventUtil", "courseApi is null.");
        } else {
            courseApi.getCourseByIds(arrayList, false, new UiCallback<List<FitWorkout>>() { // from class: hvl.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str2) {
                    LogUtil.c("CalendarEventUtil", "getCourseByIds fail: ", str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list) {
                    if (list == null || list.size() == 0) {
                        LogUtil.a("CalendarEventUtil", "getCourseByIds: null.");
                        return;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        hvl.a(context, z, j, list.get(i2), str);
                    }
                }
            });
        }
    }

    private static void c(Context context, boolean z, IntDayPlan intDayPlan, long j, String str) {
        for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            if (inPlanAction != null) {
                e(context, z, j, inPlanAction.getActionInfo(), str);
            }
        }
    }

    public static long e(IntPlan intPlan, int i, int i2) {
        if (intPlan == null) {
            ReleaseLogUtil.d("CalendarEventUtil", "getPlanTimeMillis intPlan is null");
            return 0L;
        }
        PlanTimeInfo planTimeInfo = intPlan.getPlanTimeInfo();
        if (planTimeInfo == null) {
            ReleaseLogUtil.d("CalendarEventUtil", "getPlanTimeMillis planTimeInfo is null mIntPlan ", intPlan);
            return 0L;
        }
        return ift.b(planTimeInfo.getBeginDate() * 1000, i, i2);
    }
}
