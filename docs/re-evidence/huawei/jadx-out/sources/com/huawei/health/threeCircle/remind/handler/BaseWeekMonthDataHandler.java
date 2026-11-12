package com.huawei.health.threeCircle.remind.handler;

import android.content.res.Resources;
import androidx.media3.common.C;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.threeCircle.remind.model.DeviceEventData;
import com.huawei.health.threeCircle.remind.model.ThreeCircleRemindData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.plugindaemon.R;
import com.huawei.threecircle.api.ThreeCircleApi;
import defpackage.ikp;
import defpackage.ikx;
import defpackage.peh;
import defpackage.qgt;
import defpackage.qgv;
import defpackage.qhc;
import defpackage.qhd;
import defpackage.qhe;
import defpackage.qhf;
import defpackage.qhl;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseWeekMonthDataHandler {
    private static final int ACHIEVE_DAY_FIVE = 5;
    private static final int ACHIEVE_DAY_FOUR = 4;
    private static final int ACHIEVE_DAY_ONE = 1;
    private static final int ACHIEVE_DAY_THREE = 3;
    private static final int ACHIEVE_DAY_TWO = 2;

    public abstract String getLogTag();

    public abstract String getQueryType();

    public void acquireEncourageData(final Map<String, Integer> map, final int i, final ikp ikpVar) {
        if (ikpVar == null) {
            LogUtil.c(getLogTag(), "acquireEncourageData remindDataCallback == null");
            return;
        }
        ThreeCircleApi threeCircleApi = (ThreeCircleApi) Services.b("DailyActivity", ThreeCircleApi.class);
        if (threeCircleApi == null) {
            LogUtil.d(getLogTag(), "acquireEncourageData threeCircleApi == null");
            return;
        }
        ReleaseLogUtil.d(getLogTag(), "acquireEncourageData date:", Integer.valueOf(i));
        if (!validRequest()) {
            ReleaseLogUtil.d(getLogTag(), "current time error");
        } else {
            threeCircleApi.queryEncourage(getQueryType(), i, new UiCallback<qhd>() { // from class: com.huawei.health.threeCircle.remind.handler.BaseWeekMonthDataHandler.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                    ReleaseLogUtil.e(BaseWeekMonthDataHandler.this.getLogTag(), "acquireEncourageData errorCode:", Integer.valueOf(i2), "errorInfo:", str);
                    ikpVar.onResponse(-1, null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(qhd qhdVar) {
                    if (qhdVar == null) {
                        ReleaseLogUtil.e(BaseWeekMonthDataHandler.this.getLogTag(), "onTrigger data == null");
                        ikpVar.onResponse(0, null);
                        return;
                    }
                    LogUtil.a(BaseWeekMonthDataHandler.this.getLogTag(), "onSuccess:", peh.c(qhdVar));
                    qhe goalAchieveEncourage = BaseWeekMonthDataHandler.this.getGoalAchieveEncourage(qhdVar);
                    if (goalAchieveEncourage == null) {
                        ReleaseLogUtil.e(BaseWeekMonthDataHandler.this.getLogTag(), "acquireEncourageData goalInfo == null");
                        return;
                    }
                    ReleaseLogUtil.d(BaseWeekMonthDataHandler.this.getLogTag(), "acquireEncourageData encourageType:", Integer.valueOf(goalAchieveEncourage.a()), "achieveDays:", Integer.valueOf(goalAchieveEncourage.e()));
                    ikpVar.onResponse(0, BaseWeekMonthDataHandler.this.getThreeCircleRemindData(goalAchieveEncourage, map, i));
                }
            });
        }
    }

    private boolean validRequest() {
        if ("weekEncourage".equals(getQueryType())) {
            return ikx.a();
        }
        if ("monthEncourage".equals(getQueryType())) {
            return ikx.c();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ThreeCircleRemindData getThreeCircleRemindData(qhe qheVar, Map<String, Integer> map, int i) {
        ThreeCircleRemindData.d dVar = new ThreeCircleRemindData.d();
        String encourageRemindType = getEncourageRemindType(qheVar.a());
        dVar.a(encourageRemindType);
        dVar.a(getPriority(map, encourageRemindType));
        String encourageSubRemindType = getEncourageSubRemindType(qheVar, i);
        dVar.d(encourageSubRemindType);
        ReleaseLogUtil.d(getLogTag(), "acquireEncourageData remindType:", encourageRemindType, " subRemindType:", encourageSubRemindType);
        setDeviceEventData(qheVar, dVar);
        dVar.e(getRemindText(encourageRemindType, encourageSubRemindType, qheVar.b(), qheVar.e()));
        return dVar.c();
    }

    private void setDeviceEventData(qhe qheVar, ThreeCircleRemindData.d dVar) {
        if (qheVar.a() == 3) {
            DeviceEventData.c cVar = new DeviceEventData.c();
            cVar.a(qheVar.e());
            cVar.j(qheVar.b());
            cVar.h(3);
            cVar.e(System.currentTimeMillis() / 1000);
            dVar.e(cVar.a());
        }
    }

    private String getRemindText(String str, String str2, int i, int i2) {
        String dayString;
        ThreeCircleApi threeCircleApi = (ThreeCircleApi) Services.b("DailyActivity", ThreeCircleApi.class);
        qhl qhlVarQueryRules = threeCircleApi.queryRules(str, str2);
        if (qhlVarQueryRules == null) {
            ReleaseLogUtil.e(getLogTag(), "getRemindText bean == null remindType:", str, " subRemindType:", str2);
            return "";
        }
        if ("Zero".equals(str2) && "ActiveWeek".equals(str)) {
            dayString = String.valueOf(i);
        } else {
            dayString = getDayString(i);
        }
        String dayString2 = getDayString(i2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : qhlVarQueryRules.b()) {
            if ("remainActiveDay".equals(str3)) {
                linkedHashMap.put(str3, dayString);
            } else if ("reachGoalDay".equals(str3)) {
                linkedHashMap.put(str3, dayString2);
            }
        }
        return threeCircleApi.getPromptMessage(qhlVarQueryRules, linkedHashMap);
    }

    private String getDayString(int i) {
        Resources resources = BaseApplication.b().getResources();
        if (resources == null) {
            LogUtil.a(getLogTag(), "getDayString resources == null");
            return String.valueOf(i);
        }
        return resources.getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, i, Integer.valueOf(i));
    }

    private int getPriority(Map<String, Integer> map, String str) {
        Integer num;
        if (map == null || (num = map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    private String getEncourageSubRemindType(qhe qheVar, int i) {
        int iA = qheVar.a();
        if (iA == 3) {
            return "Perfect";
        }
        int iE = qheVar.e();
        String perfectWeekSubRemindType = getPerfectWeekSubRemindType(qheVar, i, iA, iE);
        if (perfectWeekSubRemindType != null) {
            return perfectWeekSubRemindType;
        }
        if (iA == 1) {
            return getActiveWeekSubRemindType(qheVar, iE, i);
        }
        return "";
    }

    private String getPerfectWeekSubRemindType(qhe qheVar, int i, int i2, int i3) {
        if (i2 != 2) {
            return null;
        }
        if (isQueryFriday(i)) {
            if (i3 != 5) {
                if (i3 == 4 && qheVar.d()) {
                    return "Five";
                }
                return null;
            }
            return "Five";
        }
        if (i3 != 3) {
            if (i3 == 2 && qheVar.d()) {
                return "Three";
            }
            return null;
        }
        return "Three";
    }

    private String getActiveWeekSubRemindType(qhe qheVar, int i, int i2) {
        if (i == 3) {
            return "Three";
        }
        if (i == 2 && qheVar.d()) {
            return "Three";
        }
        if (isQueryWednesday(i2) && i == 2) {
            return "Two";
        }
        if (isQueryWednesday(i2) && i == 1) {
            return "One";
        }
        if (isQueryWednesday(i2) && i == 0 && qheVar.d()) {
            return "Zero";
        }
        return "";
    }

    private String getEncourageRemindType(int i) {
        if (i == 1) {
            return "ActiveWeek";
        }
        if (i == 2) {
            return "PerfectWeek";
        }
        if (i == 3) {
            return "PerfectMonth";
        }
        ReleaseLogUtil.e(getLogTag(), "getRemindType other encourageType:", Integer.valueOf(i));
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qhe getGoalAchieveEncourage(qhd qhdVar) {
        if ("monthEncourage".equals(getQueryType())) {
            return qhdVar.a();
        }
        if ("weekEncourage".equals(getQueryType())) {
            qhe qheVarD = qhdVar.d();
            return qheVarD == null ? qhdVar.e() : qheVarD;
        }
        LogUtil.d(getLogTag(), "getGoalAchieveEncourage error queryType");
        return null;
    }

    private boolean isQueryWednesday(int i) {
        Integer weekDay = getWeekDay(i);
        if (weekDay == null) {
            return false;
        }
        ReleaseLogUtil.e(getLogTag(), "isQueryWednesday:", Boolean.valueOf(weekDay.intValue() == 4));
        return weekDay.intValue() == 4;
    }

    private Integer getWeekDay(int i) {
        Date dateD;
        try {
            dateD = DateFormatUtil.d(String.valueOf(i), DateFormatUtil.DateFormatType.DATE_FORMAT_8);
        } catch (ParseException e) {
            LogUtil.c(getLogTag(), "getWeekDay ParseException currentTime:", Integer.valueOf(i), "-----", LogAnonymous.b(e));
            dateD = null;
        }
        if (dateD == null) {
            ReleaseLogUtil.e(getLogTag(), "getWeekDay date == null");
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateD);
        return Integer.valueOf(calendar.get(7));
    }

    private boolean isQueryFriday(int i) {
        Integer weekDay = getWeekDay(i);
        if (weekDay == null) {
            return false;
        }
        ReleaseLogUtil.e(getLogTag(), "isQueryFriday:", Boolean.valueOf(weekDay.intValue() == 6));
        return weekDay.intValue() == 6;
    }

    public void acquireSummaryData(final Map<String, Integer> map, final ikp ikpVar, int i) {
        ThreeCircleApi threeCircleApi = (ThreeCircleApi) Services.b("DailyActivity", ThreeCircleApi.class);
        if (threeCircleApi == null) {
            LogUtil.d(getLogTag(), "acquireSummaryData threeCircleApi == null");
        } else {
            ReleaseLogUtil.d(getLogTag(), "acquireSummaryData date:", Integer.valueOf(i));
            threeCircleApi.querySummary(getQueryType(), i, new UiCallback<qhf>() { // from class: com.huawei.health.threeCircle.remind.handler.BaseWeekMonthDataHandler.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                    ReleaseLogUtil.e(BaseWeekMonthDataHandler.this.getLogTag(), "acquireSummaryData errorCode:", Integer.valueOf(i2), "errorInfo:", str);
                    ikpVar.onResponse(i2, null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(qhf qhfVar) {
                    if (qhfVar == null) {
                        ReleaseLogUtil.e(BaseWeekMonthDataHandler.this.getLogTag(), "acquireSummaryData data == null");
                        ikpVar.onResponse(0, null);
                        return;
                    }
                    qhc qhcVarC = qhfVar.c();
                    if (qhcVarC == null) {
                        ReleaseLogUtil.e(BaseWeekMonthDataHandler.this.getLogTag(), "acquireSummaryData summary == null");
                    } else {
                        LogUtil.a(BaseWeekMonthDataHandler.this.getLogTag(), "onSuccess.", peh.c(qhfVar));
                        BaseWeekMonthDataHandler.this.responseThreeCircleRemind(map, qhcVarC, ikpVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void responseThreeCircleRemind(Map<String, Integer> map, qhc qhcVar, ikp ikpVar) {
        String summaryRemindType = getSummaryRemindType();
        String summarySubRemindType = getSummarySubRemindType(qhcVar.e());
        ReleaseLogUtil.d(getLogTag(), "responseThreeCircleRemind type:", summaryRemindType, "subRemindType:", summarySubRemindType);
        ThreeCircleRemindData.d dVarD = new ThreeCircleRemindData.d().a(summaryRemindType).a(getPriority(map, summaryRemindType)).d(summarySubRemindType);
        if ("monthReport".equals(getQueryType())) {
            ikpVar.onResponse(0, dVarD.c());
        } else {
            dVarD.e(getWeekSummaryDeviceEventData(qhcVar));
            ikpVar.onResponse(0, dVarD.c());
        }
    }

    private DeviceEventData getWeekSummaryDeviceEventData(qhc qhcVar) {
        DeviceEventData.c cVar = new DeviceEventData.c();
        cVar.a(qhcVar.e());
        cVar.j(Math.max(7 - qhcVar.e(), 0));
        cVar.d(qhcVar.a());
        cVar.c(qhcVar.d());
        cVar.h(1);
        cVar.e(qhcVar.b());
        cVar.e(System.currentTimeMillis() / 1000);
        int smartRecommendCaloriesValue = getSmartRecommendCaloriesValue();
        if (smartRecommendCaloriesValue != 0) {
            cVar.f(smartRecommendCaloriesValue);
        }
        return cVar.a();
    }

    private int getSmartRecommendCaloriesValue() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicInteger atomicInteger = new AtomicInteger();
        qgv.a((List<String>) Collections.singletonList("900200007"), 1, new IBaseResponseCallback() { // from class: ikb
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.m1241x5260e7e1(countDownLatch, atomicInteger, i, obj);
            }
        });
        try {
            if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                LogUtil.d(getLogTag(), "getRecommendGoal wait timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.c(getLogTag(), "interrupted while waiting for getRecommendGoal");
        }
        return atomicInteger.intValue();
    }

    /* JADX INFO: renamed from: lambda$getSmartRecommendCaloriesValue$0$com-huawei-health-threeCircle-remind-handler-BaseWeekMonthDataHandler, reason: not valid java name */
    public /* synthetic */ void m1241x5260e7e1(CountDownLatch countDownLatch, AtomicInteger atomicInteger, int i, Object obj) {
        if (!(obj instanceof HashMap)) {
            countDownLatch.countDown();
            return;
        }
        qgt qgtVar = (qgt) ((HashMap) obj).get("900200007");
        if (qgtVar == null) {
            LogUtil.d(getLogTag(), "recommendGoalModel == null.");
            countDownLatch.countDown();
            return;
        }
        LogUtil.a(getLogTag(), "getRecommendGoal:", Integer.valueOf(qgtVar.d()), " state:", Integer.valueOf(qgtVar.c()));
        if (qgtVar.c() == 0) {
            atomicInteger.set(Integer.MAX_VALUE);
        } else {
            atomicInteger.set(qgtVar.d());
        }
        countDownLatch.countDown();
    }

    private String getSummaryRemindType() {
        if ("weekReport".equals(getQueryType())) {
            return "WeekSummary";
        }
        if ("monthReport".equals(getQueryType())) {
            return "MonthSummary";
        }
        return "";
    }

    private String getSummarySubRemindType(int i) {
        if ("monthReport".equals(getQueryType())) {
            return "";
        }
        if (i == 7) {
            return "PerfectWeek";
        }
        if (i >= 5 && i < 7) {
            return "ActiveWeek";
        }
        if (i > 0 && i < 5) {
            return "LessFive";
        }
        return "Zero";
    }
}
