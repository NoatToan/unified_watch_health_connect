package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class szr {
    public static void e(Context context) {
        if (context == null) {
            LogUtil.e("Track_SportRemindUtils", "readDataAndRegisterReminder() context is null");
            return;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "sport_remind_reminder_time");
        int i = 0;
        int iJ = !TextUtils.isEmpty(strE) ? CommonUtils.j(strE) : 0;
        int i2 = iJ / 3600;
        int i3 = (iJ % 3600) / 60;
        String strE2 = SharedPreferenceManager.e(context, Integer.toString(20002), "sport_remind_reminder_period");
        LogUtil.a("Track_SportRemindUtils", "readDataAndRegisterReminder() remindPeriodStr: ", strE2, ", remindTime: ", Integer.valueOf(iJ));
        if (TextUtils.isEmpty(strE2)) {
            LogUtil.e("Track_SportRemindUtils", "readDataAndRegisterReminder() remindPeriodStr is null or empty");
            return;
        }
        boolean[] zArr = new boolean[7];
        if (strE2.length() == 1) {
            int iJ2 = CommonUtils.j(strE2);
            for (int i4 = 0; i4 < 7; i4++) {
                if (i4 == iJ2) {
                    zArr[i4] = true;
                } else {
                    zArr[i4] = false;
                }
            }
        } else {
            for (String str : strE2.split("_")) {
                zArr[CommonUtils.j(str) - 1] = true;
            }
        }
        while (i < 7) {
            int i5 = i + 1;
            if (zArr[i]) {
                e(i5, i2, i3);
            } else {
                vym.c(i + 1001);
            }
            i = i5;
        }
    }

    public static void e(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        int i4 = (i + 1) % 7;
        LogUtil.a("Track_SportRemindUtils", "handleSelectedPeriodDay() selectArrayDay: ", Integer.valueOf(i), ", dayOfWeek: ", Integer.valueOf(i4));
        calendar.set(7, i4);
        calendar.set(11, i2);
        calendar.set(12, i3);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("Track_SportRemindUtils", "handleSelectedPeriodDay() selectTime: ", Long.valueOf(timeInMillis), " -> ", ltb.e(timeInMillis), ", currentTime: ", Long.valueOf(jCurrentTimeMillis), " -> ", ltb.e(jCurrentTimeMillis));
        if (jCurrentTimeMillis > timeInMillis) {
            calendar.add(5, 7);
            timeInMillis = calendar.getTimeInMillis();
        }
        int i5 = i + 1000;
        LogUtil.a("Track_SportRemindUtils", "handleSelectedPeriodDay() registerRepeatingReminder remindId: ", Integer.valueOf(i5), ", selectTime: ", ltb.e(timeInMillis));
        vym.a(i5, timeInMillis, 604800000L);
    }

    public static void b(String str, boolean[] zArr) {
        for (String str2 : str.split("_")) {
            zArr[CommonUtils.e(str2, 1) - 1] = true;
        }
    }

    public static void a(String str, int i, boolean[] zArr) {
        int iJ = CommonUtils.j(str);
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = true;
            if (i2 != iJ - 1) {
                z = false;
            }
            zArr[i2] = z;
        }
    }

    public static void d(final Map<String, String> map) {
        LogUtil.a("Track_SportRemindUtils", "setRemindPeriod ", map);
        lsy.a(new Runnable() { // from class: szt
            @Override // java.lang.Runnable
            public final void run() {
                szr.a(map);
            }
        });
    }

    static /* synthetic */ void a(Map map) {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.sport_remind_config");
        hiUserPreference.setValue(peh.c(map));
        boolean userPreference = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference, true);
        if (userPreference) {
            HiSyncOption hiSyncOption = new HiSyncOption();
            hiSyncOption.setSyncModel(2);
            hiSyncOption.setSyncAction(0);
            hiSyncOption.setSyncDataType(10026);
            hiSyncOption.setSyncScope(1);
            hiSyncOption.setSyncMethod(2);
            HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
        }
        ReleaseLogUtil.d("Track_SportRemindUtils", "setRemindData sync data cloud ", Boolean.valueOf(userPreference));
    }

    public static void e(final UiCallback<Map<String, String>> uiCallback) {
        LogUtil.a("Track_SportRemindUtils", "initDialogPreference enter ");
        lsy.a(new Runnable() { // from class: szs
            @Override // java.lang.Runnable
            public final void run() {
                szr.a(uiCallback);
            }
        });
    }

    static /* synthetic */ void a(UiCallback uiCallback) {
        HashMap map = new HashMap();
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.sport_remind_config");
        if (userPreference != null) {
            Map<String, String> mapB = peh.b(userPreference.getValue());
            map.put("sport_remind_switch_status", mapB.get("sport_remind_switch_status"));
            map.put("sport_remind_period", mapB.get("sport_remind_period"));
            map.put("sport_remind_time", mapB.get("sport_remind_time"));
            LogUtil.a("Track_SportRemindUtils", "remindData after ", map.toString());
            uiCallback.onSuccess(map);
            ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).donateBySportRemind(map);
            return;
        }
        uiCallback.onFailure(0, "hiUserPreference == null");
    }
}
