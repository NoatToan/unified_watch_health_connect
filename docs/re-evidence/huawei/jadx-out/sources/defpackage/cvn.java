package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.huawei.featureuserprofile.healthrecord.js.HealthRecordsJsApi;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.pressure.PressureApi;
import com.huawei.health.userprofilemgr.model.HealthRecordCbk;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.wearengine.sensor.DataResult;
import health.compact.a.Services;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class cvn {
    private static cvp d;

    public static void e(Intent intent, cvp cvpVar, HealthRecordCbk<String> healthRecordCbk) {
        d = cvpVar;
        int iB = cvpVar.b();
        LogUtil.a("HealthRecordRemindHelper", " registerRemind remindTime: " + d.f() + " requestCode:" + iB);
        intent.putExtra(JsbMapKeyNames.H5_USER_ID, d.j());
        intent.putExtra("physicalExaminationId", iB);
        if (d.g()) {
            b(iB, intent, healthRecordCbk);
        }
        xjk.d(iB, intent, 201326592, 0, d.f());
        healthRecordCbk.onSuccess("registerRemind success");
        LogUtil.a("HealthRecordRemindHelper", "registerRemind success");
        if (a()) {
            d();
        }
    }

    public static void b(int i, Intent intent, HealthRecordCbk<String> healthRecordCbk) {
        LogUtil.a("HealthRecordRemindHelper", " cancelRemind requestCode:" + i);
        xjk.d(i, intent, 201326592);
        healthRecordCbk.onSuccess("cancelRemind success");
        if (a()) {
            e();
        }
    }

    private static boolean a() {
        if (TextUtils.isEmpty(d.a())) {
            LogUtil.j("HealthRecordRemindHelper", "checkCalendarPermission name is null, return");
            return false;
        }
        if (qqe.e(BaseApplication.getContext())) {
            return true;
        }
        LogUtil.j("HealthRecordRemindHelper", "checkCalendarPermission no calender permission name = ", d.a());
        return false;
    }

    private static void d() {
        if (d.e() == 0 || TextUtils.isEmpty(d.a())) {
            LogUtil.j("HealthRecordRemindHelper", "addCalenderEvent examinationDate or recordName is null ");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cvo
                @Override // java.lang.Runnable
                public final void run() {
                    cvn.c();
                }
            });
        }
    }

    static /* synthetic */ void c() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventTimezone", String.valueOf(TimeZone.getTimeZone(DataResult.UTC)));
        contentValues.put("allDay", (Integer) 1);
        contentValues.put("title", d.a());
        contentValues.put("description", d.d());
        contentValues.put("eventLocation", d.c());
        contentValues.put("eventStatus", (Integer) 1);
        contentValues.put("selfAttendeeStatus", (Integer) 1);
        contentValues.put("dtstart", Long.valueOf(d.e()));
        LogUtil.a("HealthRecordRemindHelper", "addCalenderEvent DTSTART = ", Long.valueOf(d.e()));
        contentValues.put("dtend", Long.valueOf(d.e() + 86400000));
        contentValues.put("hasAlarm", (Integer) 1);
        contentValues.put("calendar_id", Integer.valueOf(qqe.a(BaseApplication.getContext())));
        contentValues.put("guestsCanModify", (Boolean) false);
        contentValues.put("isOrganizer", (Boolean) true);
        contentValues.put("accessLevel", (Integer) 0);
        contentValues.put("guestsCanInviteOthers", (Boolean) false);
        contentValues.put("guestsCanModify", (Boolean) false);
        contentValues.put("customAppUri", "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-record&from=healthRecord&type=1&examinationId=" + d.b());
        LogUtil.a("HealthRecordRemindHelper", "calenderSync name = ", d.a(), " calenderSync id = ", Integer.valueOf(d.b()));
        LogUtil.a("HealthRecordRemindHelper", "insert event into android calendar, uri=" + BaseApplication.getContext().getContentResolver().insert(CalendarContract.Events.CONTENT_URI, contentValues));
    }

    private static void e() {
        final ContentResolver contentResolver = btx.c().getContentResolver();
        final String str = "(customAppUri = ?)";
        ThreadPoolManager.c().execute(new Runnable() { // from class: cvr
            @Override // java.lang.Runnable
            public final void run() {
                LogUtil.a("HealthRecordRemindHelper", "deleteCalendar success " + contentResolver.delete(CalendarContract.Events.CONTENT_URI, str, new String[]{"huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-record&from=healthRecord&type=1&examinationId=" + cvn.d.b()}) + " events of the invalid plan");
            }
        });
    }

    public static void c(Context context, String str, String str2) {
        LogUtil.a("HealthRecordRemindHelper", "gotoHealthRecordH5Page enter examinationId = ", str);
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.e("HealthRecordRemindHelper", "gotoHealthRecordH5Page context|path|healthRecordId is null.");
            return;
        }
        PressureApi pressureApi = (PressureApi) Services.b("Main", PressureApi.class);
        BloodPressureApi bloodPressureApi = (BloodPressureApi) Services.b("Main", BloodPressureApi.class);
        String str3 = "0".equals(str) ? "2" : "1";
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().setImmerse().showStatusBar().setNeedSoftInputAdapter().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("PressureNewJsApi", pressureApi.getPressureNewJsApi()).addCustomizeArg("examinationId", str).addPath("#/?from=" + str3 + "&cardType=" + str2).build();
        H5ProClient.getServiceManager().registerService(HealthRecordsJsApi.class);
        H5ProClient.getServiceManager().registerService((Class<?>) pressureApi.getPressureJsApi());
        H5ProClient.getServiceManager().registerService((Class<?>) bloodPressureApi.getBloodPressureJsApi());
        H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.health-record", h5ProLaunchOptionBuild);
        LogUtil.a("HealthRecordRemindHelper", "gotoHealthRecordH5Page success");
    }
}
