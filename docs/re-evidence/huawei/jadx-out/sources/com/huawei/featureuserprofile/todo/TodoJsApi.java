package com.huawei.featureuserprofile.todo;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.huawei.featureuserprofile.todo.TodoJsApi;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryCbk;
import com.huawei.wearengine.sensor.DataResult;
import defpackage.czv;
import defpackage.qqe;
import health.compact.a.CommonUtil;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = TodoJsApi.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class TodoJsApi {
    private static final String TAG = "TodoJsApi";

    @H5ProMethod(name = "todoSyncToCalendar")
    public static void todoSyncToCalendar(String str, String str2, String str3, DietDiaryCbk<Boolean> dietDiaryCbk) {
        if (dietDiaryCbk == null) {
            LogUtil.j(TAG, "todoTaskSyncToCalendar callback is null, return");
            return;
        }
        if (!CommonUtil.bg()) {
            LogUtil.j(TAG, "todoTaskSyncToCalendar is not huawei system. todoName = ", str);
            dietDiaryCbk.onFailure(-1, "not huawei system");
        } else if (!qqe.e(BaseApplication.getContext())) {
            LogUtil.j(TAG, "todoTaskSyncToCalendar no calender permission todoName = ", str);
            dietDiaryCbk.onFailure(-1, "no calender permission");
        } else {
            calenderSync(str, str2, str3, dietDiaryCbk);
        }
    }

    private static void calenderSync(final String str, final String str2, final String str3, final DietDiaryCbk<Boolean> dietDiaryCbk) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cyu
            @Override // java.lang.Runnable
            public final void run() {
                TodoJsApi.lambda$calenderSync$0(str, str2, str3, dietDiaryCbk);
            }
        });
    }

    public static /* synthetic */ void lambda$calenderSync$0(String str, String str2, String str3, DietDiaryCbk dietDiaryCbk) {
        ContentValues contentValues = getContentValues(str, str2, str3);
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        if (qqe.a(contentResolver)) {
            contentValues.put("hwext_service_type", "SportsExercise");
            contentValues.put("hwext_service_description", str2);
            contentValues.put("hwext_service_cp_bz_uri", str3);
            Uri uriInsert = contentResolver.insert(Uri.parse("content://com.huawei.calendar/events"), contentValues);
            LogUtil.a(TAG, "insert event into huawei calendar, uri=", uriInsert);
            if (uriInsert == null) {
                LogUtil.a(TAG, "insert event into android calendar, uri=", contentResolver.insert(CalendarContract.Events.CONTENT_URI, getContentValues(str, str2, str3)));
            }
        } else {
            LogUtil.a(TAG, "insert event into android calendar, uri=", contentResolver.insert(CalendarContract.Events.CONTENT_URI, contentValues));
        }
        dietDiaryCbk.onSuccess(true);
    }

    private static ContentValues getContentValues(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventTimezone", String.valueOf(TimeZone.getTimeZone(DataResult.UTC)));
        contentValues.put("allDay", (Integer) 1);
        contentValues.put("title", str);
        contentValues.put("description", str2);
        contentValues.put("eventStatus", (Integer) 1);
        contentValues.put("selfAttendeeStatus", (Integer) 1);
        contentValues.put("dtstart", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("dtend", Long.valueOf(System.currentTimeMillis() + 86400000));
        contentValues.put("hasAlarm", (Integer) 1);
        contentValues.put("calendar_id", Integer.valueOf(qqe.a(BaseApplication.getContext())));
        contentValues.put("guestsCanModify", (Boolean) false);
        contentValues.put("isOrganizer", (Boolean) true);
        contentValues.put("accessLevel", (Integer) 0);
        contentValues.put("guestsCanInviteOthers", (Boolean) false);
        contentValues.put("guestsCanModify", (Boolean) false);
        contentValues.put("customAppUri", str3);
        LogUtil.a(TAG, "todoTaskSyncToCalendar todoName = ", str);
        return contentValues;
    }

    @H5ProMethod(name = "getTodoSwitchStatus")
    public static void getTodoSwitchStatus(final String str, final DietDiaryCbk<String> dietDiaryCbk) {
        if (dietDiaryCbk == null) {
            LogUtil.j(TAG, "getTodoSwitchStatus callback is null, return");
        } else if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getTodoSwitchStatus switchType is empty, return");
            dietDiaryCbk.onFailure(-1, "switch type is empty");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cyy
                @Override // java.lang.Runnable
                public final void run() {
                    TodoJsApi.lambda$getTodoSwitchStatus$1(str, dietDiaryCbk);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$getTodoSwitchStatus$1(String str, DietDiaryCbk dietDiaryCbk) {
        String strB = czv.b(str);
        if (TextUtils.isEmpty(strB)) {
            dietDiaryCbk.onFailure(-1, "switch type error");
        } else {
            dietDiaryCbk.onSuccess(strB);
        }
    }

    @H5ProMethod(name = "changeTodoSwitch")
    public static void changeTodoSwitch(final String str, final boolean z, final int i, final DietDiaryCbk<Boolean> dietDiaryCbk) {
        if (dietDiaryCbk == null) {
            LogUtil.j(TAG, "getTodoSwitchStatus callback is null, return");
        } else if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getTodoSwitchStatus switchType is empty, return");
            dietDiaryCbk.onFailure(-1, "switch type is empty");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cyq
                @Override // java.lang.Runnable
                public final void run() {
                    dietDiaryCbk.onSuccess(Boolean.valueOf(czv.c(str, z, i)));
                }
            });
        }
    }
}
