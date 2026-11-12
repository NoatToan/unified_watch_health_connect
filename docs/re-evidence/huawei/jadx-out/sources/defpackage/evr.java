package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.featuremarketing.rules.activityinfo.ActivityInfo;
import com.huawei.health.featuremarketing.rules.activityinfo.ActivityInfoApi;
import com.huawei.health.featuremarketing.rules.activityinfo.ActivityInfoFactory;
import com.huawei.health.featuremarketing.rules.activityinfo.ActivityInfoReq;
import com.huawei.health.marketing.datatype.TriggerEventBase;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class evr {
    public static boolean e(int i, Map<String, ?> map, List<TriggerEventBase> list) {
        if (njy.e(list)) {
            LogUtil.b("MarketingEventsMgr", "no triggerEvent found in cloud resource, match in default");
            return true;
        }
        TriggerEventBase triggerEventBaseC = c(i, list, map);
        StringBuilder sb = new StringBuilder("isMatch: ");
        sb.append(triggerEventBaseC != null);
        sb.append(", eventType: ");
        sb.append(i);
        sb.append(", triggerEventParams: ");
        sb.append(map);
        sb.append(", triggerEventBases: ");
        sb.append(list);
        LogUtil.b("MarketingEventsMgr", sb.toString());
        return triggerEventBaseC != null;
    }

    public static int a(int i, Map<String, ?> map, List<TriggerEventBase> list) {
        LogUtil.b("MarketingEventsMgr", "matching and delay... eventType:" + i + ", triggerEventParams: " + map + ", triggerEvent:" + list);
        if (njy.e(list)) {
            LogUtil.b("MarketingEventsMgr", "no triggerEvent found in cloud resource, match in default");
            return 0;
        }
        TriggerEventBase triggerEventBaseC = c(i, list, map);
        if (triggerEventBaseC == null) {
            LogUtil.b("MarketingEventsMgr", "isMatchAndDelay eventBase is null.");
            return -1;
        }
        return triggerEventBaseC.getDelay();
    }

    private static TriggerEventBase c(int i, List<TriggerEventBase> list, Map<String, ?> map) {
        if (i == 2) {
            return b(list, 2);
        }
        if (i == 34) {
            return e(list, map);
        }
        if (i == 45) {
            return b(list, 45);
        }
        if (i == 61) {
            return c(list, map);
        }
        if (i == 100) {
            return d(list, map, 6, 7, "intensity_total_time");
        }
        if (i == 200) {
            return a(list, map);
        }
        if (i == 300) {
            return d(list, map, 14, 15, "sleep_score");
        }
        if (i == 400) {
            return d(list, map);
        }
        switch (i) {
            case 49:
                return b(list, map);
            case 50:
                return b(list, 50);
            case 51:
                return e(list, 51);
            case 52:
                return a(list, 52);
            default:
                return d(list, i);
        }
    }

    private static TriggerEventBase d(List<TriggerEventBase> list, int i) {
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null && triggerEventBase.getEventType() == i) {
                return triggerEventBase;
            }
        }
        return null;
    }

    private static TriggerEventBase a(List<TriggerEventBase> list, Map<String, ?> map) {
        float f;
        LogUtil.b("MarketingEventsMgr", "get Running Distance Event.");
        if (map == null) {
            LogUtil.b("MarketingEventsMgr", "keyValue is null.");
            return null;
        }
        try {
            f = Float.parseFloat(String.valueOf(map.get("running_distance_data")));
        } catch (NumberFormatException e) {
            LogUtil.d("MarketingEventsMgr", "set runningDistance exception", e.getMessage());
            f = 0.0f;
        }
        LogUtil.b("MarketingEventsMgr", "runningDistance: ", Float.valueOf(f));
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null) {
                int eventType = triggerEventBase.getEventType();
                if (eventType == 29 || eventType == 32) {
                    LogUtil.b("MarketingEventsMgr", "RUNNING_FINISH_SHORT_TYPE. EventValue: ", triggerEventBase.getEventValue());
                    if (f < Integer.parseInt(triggerEventBase.getEventValue())) {
                        return triggerEventBase;
                    }
                } else if (eventType == 28 || eventType == 31) {
                    try {
                        LogUtil.b("MarketingEventsMgr", "RUNNING_FINISH_LONG_TYPE. EventValue: ", triggerEventBase.getEventValue());
                        if (f > Integer.parseInt(triggerEventBase.getEventValue())) {
                            return triggerEventBase;
                        }
                    } catch (NumberFormatException unused) {
                        LogUtil.d("MarketingEventsMgr", "runningDistance: ", Float.valueOf(f));
                    }
                }
            }
        }
        return null;
    }

    private static TriggerEventBase d(List<TriggerEventBase> list, Map<String, ?> map, int i, int i2, String str) {
        if (map == null) {
            LogUtil.b("MarketingEventsMgr", "keyValue is null.");
            return null;
        }
        try {
            int i3 = Integer.parseInt(String.valueOf(map.get(str)));
            for (TriggerEventBase triggerEventBase : list) {
                if (triggerEventBase != null) {
                    int eventType = triggerEventBase.getEventType();
                    if (eventType == i2) {
                        if (i3 < Integer.parseInt(triggerEventBase.getEventValue())) {
                            return triggerEventBase;
                        }
                    } else if (eventType == i && i3 > Integer.parseInt(triggerEventBase.getEventValue())) {
                        return triggerEventBase;
                    }
                }
            }
        } catch (NumberFormatException e) {
            LogUtil.d("MarketingEventsMgr", "parseInt exception", e.getMessage());
        }
        return null;
    }

    private static TriggerEventBase d(List<TriggerEventBase> list, Map<String, ?> map) {
        if (map == null) {
            LogUtil.b("MarketingEventsMgr", "getFitnessCourseFinishedEvent, triggerEventParams is null, will not show");
            return null;
        }
        String str = (String) map.get("fitness_finish_training");
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null) {
                int eventType = triggerEventBase.getEventType();
                if (eventType == 33) {
                    LogUtil.b("MarketingEventsMgr", "getFitnessCourseFinishedEvent 33, will show to workoutID: ", str);
                    return triggerEventBase;
                }
                if (eventType == 34) {
                    LogUtil.b("MarketingEventsMgr", "getFitnessCourseFinishedEvent, whiteListEventBase ");
                    if (triggerEventBase.getEventValue() == null || str == null || !triggerEventBase.getEventValue().contains(str)) {
                        return null;
                    }
                    LogUtil.b("MarketingEventsMgr", "getFitnessCourseFinishedEvent 44, will show to workoutID: ", str);
                    return triggerEventBase;
                }
                if (eventType == 61) {
                    LogUtil.b("MarketingEventsMgr", "getFitnessCourseFinishedEvent, blackListEventBase ");
                    String eventValue = triggerEventBase.getEventValue();
                    if (eventValue != null && str != null && eventValue.contains(str)) {
                        LogUtil.b("MarketingEventsMgr", "hide to specific, matched! will hide to: " + str);
                        return null;
                    }
                } else {
                    continue;
                }
            }
        }
        return new TriggerEventBase.Builder().build();
    }

    private static TriggerEventBase e(List<TriggerEventBase> list, Map<String, ?> map) {
        if (map == null) {
            LogUtil.b("MarketingEventsMgr", "show to specific, triggerEventParams is null, will not show");
            return null;
        }
        String str = (String) map.get("fitness_finish_training");
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null && triggerEventBase.getEventType() == 34 && triggerEventBase.getEventValue() != null && str != null && triggerEventBase.getEventValue().contains(str)) {
                LogUtil.b("MarketingEventsMgr", "show to specific, will show to workoutID: ", str);
                return triggerEventBase;
            }
        }
        LogUtil.b("MarketingEventsMgr", "show to specific, will NOT show to workoutID: ", str);
        return null;
    }

    private static TriggerEventBase c(List<TriggerEventBase> list, Map<String, ?> map) {
        if (map == null) {
            LogUtil.b("MarketingEventsMgr", "hide to specific, triggerEventParams is null, will show...");
            return null;
        }
        String str = (String) map.get("fitness_finish_training");
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null && triggerEventBase.getEventType() == 61) {
                String eventValue = triggerEventBase.getEventValue();
                if (eventValue != null && str != null && eventValue.contains(str)) {
                    LogUtil.b("MarketingEventsMgr", "hide to specific, matched! will hide to: " + str);
                    return null;
                }
                LogUtil.b("MarketingEventsMgr", "hide to specific, found but NOT matched! will not hide to: " + str);
                return new TriggerEventBase.Builder().build();
            }
        }
        LogUtil.b("MarketingEventsMgr", "hide to specific, no rule found, nothing to hide");
        return null;
    }

    private static TriggerEventBase b(List<TriggerEventBase> list, int i) {
        LogUtil.b("MarketingEventsMgr", "enter getDataFinishEvent");
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null && triggerEventBase.getEventType() == i) {
                String eventValue = triggerEventBase.getEventValue();
                String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
                if (!TextUtils.isEmpty(eventValue) && accountInfo != null) {
                    return a(triggerEventBase);
                }
            }
        }
        return null;
    }

    private static TriggerEventBase a(TriggerEventBase triggerEventBase) {
        String eventValue = triggerEventBase.getEventValue();
        ActivityInfoReq activityInfoReq = new ActivityInfoReq();
        activityInfoReq.setActivityId(eventValue);
        ActivityInfoApi activityInfoApi = (ActivityInfoApi) oet.d().e(ActivityInfoApi.class);
        ActivityInfoFactory activityInfoFactory = new ActivityInfoFactory(BaseApplication.b());
        try {
            Map<String, String> headers = activityInfoFactory.getHeaders();
            if (headers.get("x-huid") == null) {
                LogUtil.d("MarketingEventsMgr", "getActivityInfo fail, x-huid is null");
                return null;
            }
            Response<ActivityInfo> responseExecute = activityInfoApi.getActivityInfo(activityInfoReq.getUrl(), headers, ofe.c(activityInfoFactory.getBody(activityInfoReq))).execute();
            if (responseExecute.isOK()) {
                LogUtil.b("MarketingEventsMgr", "response is OK.");
                ActivityInfo body = responseExecute.getBody();
                LogUtil.b("MarketingEventsMgr", "activityInfo.getResultCode(): ", body.getResultCode());
                if (body.getResultCode().equals("0")) {
                    int joinStatus = body.getUserActivityInfo().getJoinStatus();
                    LogUtil.b("MarketingEventsMgr", "joinStatus: ", Integer.valueOf(joinStatus));
                    return e(triggerEventBase, joinStatus);
                }
            }
            return null;
        } catch (IOException e) {
            LogUtil.d("MarketingEventsMgr", "getActivityInfo fail, ", e.getMessage());
        }
    }

    private static TriggerEventBase e(TriggerEventBase triggerEventBase, int i) {
        int eventType = triggerEventBase.getEventType();
        if (eventType == 50) {
            if (i < 0 || i > 5) {
                return null;
            }
            LogUtil.b("MarketingEventsMgr", "EventType ", Integer.valueOf(triggerEventBase.getEventType()), ",joinStatus is ", Integer.valueOf(i));
            return triggerEventBase;
        }
        if (eventType != 2 && eventType != 45) {
            LogUtil.e("MarketingEventsMgr", "Other EventType ", Integer.valueOf(triggerEventBase.getEventType()), ",joinStatus is ", Integer.valueOf(i));
            return null;
        }
        if (i != 1) {
            return null;
        }
        LogUtil.b("MarketingEventsMgr", "EventType ", Integer.valueOf(triggerEventBase.getEventType()), ",joinStatus is ", Integer.valueOf(i));
        return triggerEventBase;
    }

    private static TriggerEventBase b(List<TriggerEventBase> list, Map<String, ?> map) {
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null) {
                String eventValue = triggerEventBase.getEventValue();
                if (!TextUtils.isEmpty(eventValue) && triggerEventBase.getEventType() == 49 && Arrays.asList(eventValue.split(",")).contains(String.valueOf(map.get("open_specific_page")))) {
                    return triggerEventBase;
                }
            }
        }
        return null;
    }

    private static TriggerEventBase e(List<TriggerEventBase> list, int i) {
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null && triggerEventBase.getEventType() == i) {
                return e(triggerEventBase);
            }
        }
        return null;
    }

    private static TriggerEventBase a(List<TriggerEventBase> list, int i) {
        for (TriggerEventBase triggerEventBase : list) {
            if (triggerEventBase != null) {
                int eventType = triggerEventBase.getEventType();
                triggerEventBase.getEventValue();
                if (eventType == i) {
                    return c(triggerEventBase);
                }
            }
        }
        return null;
    }

    private static TriggerEventBase e(TriggerEventBase triggerEventBase) {
        String strB = b(BaseApplication.b(), "_week_report_no_genera_flag");
        String strD = DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_S);
        LogUtil.b("MarketingEventsMgr", "reportPop getFinishWeekReportEvent popTime ", strB, " currentDate ", strD);
        if (strD.equals(strB)) {
            return triggerEventBase;
        }
        return null;
    }

    private static TriggerEventBase c(TriggerEventBase triggerEventBase) {
        String strB = b(BaseApplication.b(), "_month_report_no_genera_flag");
        String strD = DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_YEAR_MONTH_S);
        LogUtil.b("MarketingEventsMgr", "reportPop getFinishMonthReportEvent popTime ", strB, " currentDate ", strD);
        if (strD.equals(strB)) {
            return triggerEventBase;
        }
        return null;
    }

    private static String b(Context context, String str) {
        if (str == null) {
            return "";
        }
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.b("SharedPreferenceUtil", "getSharedPreference huid null");
            return "";
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(20003), accountInfo + str);
        return TextUtils.isEmpty(strE) ? "" : strE;
    }
}
