package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.work.PeriodicWorkRequest;
import com.huawei.datatype.NotificationData;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.common.base.BaseNotification;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.awarenessdonate.AwarenessDonateApi;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class uce {
    public static void b(final long j, final long j2, final int i) {
        if (lug.c() != null) {
            d(j, j2, i);
        } else {
            ReleaseLogUtil.e("BTSYNC_CoreSleepEventHandler", "pushSleepNotifyMessage binder is null");
            lug.e(BaseApplication.getContext());
            new Timer("CoreSleepEventHandler").schedule(new TimerTask() { // from class: uce.4
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "pushSleepNotifyMessage start");
                    uce.d(j, j2, i);
                }
            }, 2000L);
        }
        ThreadPoolManager.c().a("CoreSleepEventHandler", new Runnable() { // from class: ucd
            @Override // java.lang.Runnable
            public final void run() {
                uce.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        ddt.b bVar = new ddt.b(System.currentTimeMillis() + PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, System.currentTimeMillis() + 4500000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        ddt ddtVarA = new ddt.d().g("featurePrediction").f(UUID.randomUUID().toString()).e(Build.MODEL).a("phone").d(Build.BRAND + " " + Build.MODEL).e(0).n(TimeZone.getDefault().getDisplayName(false, 0)).d(System.currentTimeMillis()).e(((ddt.b) arrayList.get(0)).b()).a(((ddt.b) arrayList.get(arrayList.size() - 1)).d()).c(FaCardAgdsApi.FA_CARD_PACKAGE_NAME).l(FaCardAgdsApi.SLEEP_FA_CARD).b("com.huawei.ohos.healthservice.sleep.SleepDataFormAbility").h("sleep_data_mini").i("1*2").j("haveGoodSleep").e(arrayList).a();
        AwarenessDonateApi awarenessDonateApi = (AwarenessDonateApi) Services.d("HWSmartInteractMgr", AwarenessDonateApi.class);
        if (awarenessDonateApi == null || !awarenessDonateApi.isSupportDonate()) {
            return;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "invoking awarenessDonateApi donateFeature Interface");
        awarenessDonateApi.donateFeature(ddtVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(long j, long j2, int i) {
        if (VersionControlUtil.isSupportSleepManagement()) {
            e(j, j2);
        } else if (new SecureRandom().nextInt(10) < 7 || i == 0) {
            d(j, j2);
        } else {
            e(j, j2, i);
        }
    }

    private static void e(long j, long j2, int i) {
        LogUtil.a("CoreSleepEventHandler", "pushSleepScoreMsg fallAsleepTime ", Long.valueOf(j), "wakeTime ", Long.valueOf(j2), " score ", Integer.valueOf(i));
        SecureRandom secureRandom = new SecureRandom();
        Resources resources = BaseApplication.getContext().getResources();
        d(j, j2, resources.getString(R.string.IDS_hw_show_notifications_to_sleep_details_title), String.format(Locale.ENGLISH, new String[]{resources.getString(R.string.IDS_notification_sleep_msg_one), resources.getString(R.string.IDS_notification_sleep_msg_two), resources.getString(R.string.IDS_notification_sleep_msg_three)}[secureRandom.nextInt(3)], Integer.valueOf(i)));
    }

    private static void d(final long j, final long j2) {
        final ujk ujkVar = new ujk();
        final Date date = new Date();
        date.setTime(j2);
        String strE = wud.e(j);
        String strE2 = wud.e(j2);
        LogUtil.a("CoreSleepEventHandler", "pushSleepAdviceMsg fallAsleepTime ", strE, " wakeTime ", strE2);
        ujkVar.c(strE);
        ujkVar.a(strE2);
        ujkVar.d(ltb.m(date), new CommonUiBaseResponse() { // from class: uci
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public final void onResponse(int i, Object obj) {
                uce.c(ujkVar, date, j, j2, i, obj);
            }
        });
    }

    static /* synthetic */ void c(final ujk ujkVar, Date date, final long j, final long j2, int i, Object obj) {
        LogUtil.a("CoreSleepEventHandler", "pushSleepAdviceMsg errorCode ", Integer.valueOf(i));
        if (i != 0) {
            return;
        }
        ujkVar.e(date, 7, new CommonUiBaseResponse() { // from class: ucj
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public final void onResponse(int i2, Object obj2) {
                uce.d(ujkVar, j, j2, i2, obj2);
            }
        });
    }

    static /* synthetic */ void d(ujk ujkVar, long j, long j2, int i, Object obj) {
        LogUtil.a("CoreSleepEventHandler", "pushSleepAdviceMsg error ", Integer.valueOf(i));
        if (i == 0) {
            d(j, j2, BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_notifications_to_sleep_details_title), ujkVar.f() + d());
        }
    }

    private static void e(final long j, final long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.DAILY_SLEEP_PROBLEM.value(), DicDataTypeUtil.DataType.DAILY_SLEEP_INTERPRET.value()});
        hiDataReadOption.setStartTime(ieg.c(System.currentTimeMillis()));
        hiDataReadOption.setEndTime(ieg.e(System.currentTimeMillis()));
        hiDataReadOption.setSortOrder(1);
        ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "readHiHealthDataPro start");
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: uce.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                JSONObject jSONObject;
                ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "readHiHealthDataPro errorCode is ", Integer.valueOf(i));
                if (i != 0) {
                    return;
                }
                SparseArray sparseArray = new SparseArray();
                if (obj instanceof SparseArray) {
                    sparseArray = (SparseArray) obj;
                }
                List list = (List) sparseArray.get(DicDataTypeUtil.DataType.DAILY_SLEEP_INTERPRET.value());
                List list2 = (List) sparseArray.get(DicDataTypeUtil.DataType.DAILY_SLEEP_PROBLEM.value());
                if (njy.e(list)) {
                    ReleaseLogUtil.e("BTSYNC_CoreSleepEventHandler", "dailySleepInterpretList is null or empty");
                    return;
                }
                int intValue = 0;
                String metaData = ((HiHealthData) list.get(0)).getMetaData();
                LogUtil.a("CoreSleepEventHandler", "interpret is ", metaData);
                try {
                    jSONObject = new JSONObject(metaData);
                } catch (JSONException unused) {
                    ReleaseLogUtil.a("BTSYNC_CoreSleepEventHandler", "interpretJson error");
                    jSONObject = null;
                }
                JSONObject jSONObject2 = jSONObject;
                if (njy.b(list2)) {
                    intValue = ((HiHealthData) list2.get(0)).getIntValue();
                } else {
                    ReleaseLogUtil.e("BTSYNC_CoreSleepEventHandler", "problemList is null or empty");
                }
                uce.a(j, j2, jSONObject2, intValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final long j, final long j2, final JSONObject jSONObject, final int i) {
        ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "getDescriptionInMainThread enter");
        final int iJ = j(jSONObject);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: uce.5
            @Override // java.lang.Runnable
            public void run() {
                String strA;
                ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "getDescriptionInMainThread loadResources before");
                AppBundle.e().loadResources(BaseApplication.getContext());
                ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "getDescriptionInMainThread loadResources after");
                if (uce.i(jSONObject) && new SecureRandom().nextInt(10) <= 7) {
                    strA = qre.a(R.string.IDS_three_parts, uce.c(iJ), uce.d(jSONObject), uce.b(i));
                } else {
                    strA = qre.a(R.string.IDS_three_parts, uce.c(iJ), uce.b(jSONObject), uce.b(i));
                }
                String strReplace = strA.replace("<b>", "").replace("</b>", "");
                LogUtil.a("CoreSleepEventHandler", "description is ", strReplace);
                uce.d(j, j2, BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_notifications_to_sleep_details_title), strReplace);
            }
        });
    }

    private static int j(JSONObject jSONObject) {
        String string;
        if (jSONObject == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleepEventHandler", "getDailyQualityDesc interpretJson null");
            return -1;
        }
        try {
            string = jSONObject.getString("dailyQualityDesc");
        } catch (JSONException unused) {
            ReleaseLogUtil.a("BTSYNC_CoreSleepEventHandler", "getDailyQualityDescId json error");
            string = null;
        }
        int iB = uix.b(string);
        LogUtil.a("CoreSleepEventHandler", "dailyQualityDescIndex is ", string);
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(int i) {
        if (i == -1) {
            ReleaseLogUtil.e("BTSYNC_CoreSleepEventHandler", "getDailyQualityDesc resId is ", Integer.valueOf(i));
            return "";
        }
        String string = BaseApplication.getContext().getString(i);
        LogUtil.a("CoreSleepEventHandler", "getDailyQualityDesc is ", string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(JSONObject jSONObject) {
        String string;
        if (jSONObject == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleepEventHandler", "interpretJson null");
            return "";
        }
        String string2 = null;
        try {
            string = jSONObject.getString("dailyProblemDescInput");
            try {
                string2 = jSONObject.getString("dailyProblemDesc");
            } catch (JSONException unused) {
                ReleaseLogUtil.a("BTSYNC_CoreSleepEventHandler", "getDailyProblemDesc json error");
            }
        } catch (JSONException unused2) {
            string = null;
        }
        String strA = uix.a(peh.c(string, gwk[].class), string2);
        LogUtil.a("CoreSleepEventHandler", "dailyProblemDescInputStr is ", string, ", DailyProblemDesc is ", strA);
        return strA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(JSONObject jSONObject) {
        String string;
        if (jSONObject == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleepEventHandler", "getDailyFactorDesc interpretJson null");
            return "";
        }
        String string2 = null;
        try {
            string = jSONObject.getString("dailyFactorDescInput");
            try {
                string2 = jSONObject.getString("dailyFactorDesc");
            } catch (JSONException unused) {
                ReleaseLogUtil.a("BTSYNC_CoreSleepEventHandler", "getDailyFactorDesc json error");
            }
        } catch (JSONException unused2) {
            string = null;
        }
        return uix.e((List<gwi>) peh.c(string, gwi[].class), string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i) {
        LogUtil.a("CoreSleepEventHandler", "dailyProblem is ", Integer.valueOf(i));
        return i != 0 ? BaseApplication.getContext().getResources().getString(R.string.IDS_improvement_detail_in_app) : BaseApplication.getContext().getResources().getString(R.string.IDS_check_detail_in_app);
    }

    private static String d() {
        int iNextInt = new SecureRandom().nextInt(3);
        Resources resources = BaseApplication.getContext().getResources();
        return new String[]{resources.getString(R.string.IDS_msg_sleep_advice_one), resources.getString(R.string.IDS_msg_sleep_advice_two), resources.getString(R.string.IDS_msg_sleep_advice_three)}[iNextInt];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(long j, long j2, String str, String str2) {
        ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "start sendSleepNotification");
        HashMap map = new HashMap();
        map.put("startTime", String.valueOf(j));
        map.put("endTime", String.valueOf(j2));
        final NotificationData notificationDataB = miy.b("sleepDetail", map, str, str2);
        mhs.a().getSwitchSetting("core_sleep_switch_status", new IBaseResponseCallback() { // from class: uch
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                uce.d(notificationDataB, i, obj);
            }
        });
    }

    static /* synthetic */ void d(NotificationData notificationData, int i, Object obj) {
        ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "sendSleepNotification errorCode ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            if (lsk.a(String.valueOf(obj), 10) == 1) {
                c(notificationData, "huaweischeme://healthapp/router/sleepDetail?from=3", lsb.d());
                return;
            } else {
                LogUtil.a("CoreSleepEventHandler", "sendSleepNotification sleepSwitch closed");
                return;
            }
        }
        c(notificationData, "huaweischeme://healthapp/router/sleepDetail?from=3", lsb.d());
    }

    private static void c(NotificationData notificationData, String str, BaseNotification baseNotification) {
        ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "start notifyMsg");
        but butVar = new but();
        butVar.j(notificationData.getTitle());
        butVar.d(notificationData.getDescription());
        Resources resources = BaseApplication.getContext().getResources();
        String string = resources.getString(R.string.IDS_notification_open_app);
        String string2 = resources.getString(R.string.IDS_notification_ignore);
        butVar.b(string);
        butVar.e(string2);
        butVar.c(str);
        butVar.a("huaweischeme://healthapp/router/sleepDetail?from=4");
        buu.a().c(butVar, new AnonymousClass3(notificationData, baseNotification));
    }

    /* JADX INFO: renamed from: uce$3, reason: invalid class name */
    class AnonymousClass3 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseNotification f49921c;
        final /* synthetic */ NotificationData d;

        AnonymousClass3(NotificationData notificationData, BaseNotification baseNotification) {
            this.d = notificationData;
            this.f49921c = baseNotification;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("BTSYNC_CoreSleepEventHandler", "notifyMsg errorCode:", Integer.valueOf(i));
            if (i != 100) {
                Handler handler = new Handler(Looper.getMainLooper());
                final NotificationData notificationData = this.d;
                final BaseNotification baseNotification = this.f49921c;
                handler.post(new Runnable() { // from class: ucl
                    @Override // java.lang.Runnable
                    public final void run() {
                        miy.e(BaseApplication.getContext()).d(notificationData, baseNotification);
                    }
                });
            } else {
                Handler handler2 = new Handler(Looper.getMainLooper());
                final NotificationData notificationData2 = this.d;
                final BaseNotification baseNotification2 = this.f49921c;
                handler2.post(new Runnable() { // from class: ucm
                    @Override // java.lang.Runnable
                    public final void run() {
                        miy.e(BaseApplication.getContext()).b(notificationData2, true, baseNotification2);
                    }
                });
            }
            buu.a().c();
        }
    }

    public static void c(txt.a aVar) {
        if (aVar == null) {
            LogUtil.j("CoreSleepEventHandler", "msHolder is null");
        } else {
            c(miy.a(System.currentTimeMillis(), System.currentTimeMillis(), aVar.d(), aVar.c(), aVar.e()), aVar.a(), lsb.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i(JSONObject jSONObject) {
        if (jSONObject == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleepEventHandler", "hasDailyFactorDesc interpretJson null");
            return false;
        }
        if (!jSONObject.has("dailyFactorDesc")) {
            return false;
        }
        try {
            return !TextUtils.isEmpty(jSONObject.getString("dailyFactorDesc"));
        } catch (JSONException unused) {
            ReleaseLogUtil.a("BTSYNC_CoreSleepEventHandler", "hasDailyFactorDesc json error");
            return false;
        }
    }
}
