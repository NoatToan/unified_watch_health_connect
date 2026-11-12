package com.huawei.health.healthmodel;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.util.Pair;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.ResponseCallback;
import defpackage.dfl;
import defpackage.fer;
import defpackage.ffc;
import defpackage.ffd;
import defpackage.ffe;
import defpackage.ffq;
import defpackage.nrh;
import defpackage.qev;
import defpackage.qex;
import defpackage.qey;
import defpackage.qfj;
import defpackage.qfn;
import defpackage.qfr;
import defpackage.qfv;
import defpackage.qgc;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface HealthLifeApi {
    void createPlan(qex qexVar, ResponseCallback<qey> responseCallback);

    void createTask(qfv qfvVar, ResponseCallback<qgc> responseCallback);

    void drinkWater(int i, ResponseCallback<qfr> responseCallback);

    int getActiveTaskId(List<HealthLifeBean> list, int i);

    List<dfl> getBloodPressureAlarmInfoList();

    ArrayList<Integer> getBloodPressurePlanIdList();

    Object getCardReader(Context context, Object obj);

    int getCloverComplete(int i, int i2);

    float getCloverScale(List<HealthLifeBean> list, int i);

    void getDayRecordList(int i, ResponseCallback<List<HealthLifeTaskBean>> responseCallback);

    List<HealthLifeTaskBean> getDayRecordListCache();

    void getHealthLifeChallenge(String str, ResponseCallback<ffd> responseCallback);

    void getHealthLifeConDays(int i, ResponseCallback<ffe> responseCallback);

    String getHealthLifePlanId();

    boolean getHealthLifeSwitch(String str, boolean z);

    Calendar getHourAndMinute(String str);

    int getJoinTime();

    List<HealthLifeTaskBean> getLastDayRecordListCache();

    qfj getLastQuerySchedulesResp();

    List<nrh> getLeafProgress(int i, int i2, ResponseCallback<List<nrh>> responseCallback);

    int getPlayType();

    Pair<Integer, String> getRemindTipMap(List<HealthLifeBean> list);

    int getShowGuidePageCount();

    void getSleepData(HealthLifeBean healthLifeBean, ResponseCallback<Object> responseCallback);

    List<Integer> getSmallShownIdsCache(int i);

    String getSubscriptionData(int i);

    List<HealthLifeTaskBean> getTaskDayRecordList(List<Integer> list);

    List<ImageBean> getTaskDialogImageList(String str);

    void initDeviceManager();

    void initHealthLife();

    boolean isAgreeProtocol();

    void isHealthLife(ResponseCallback<Boolean> responseCallback);

    boolean isHealthLife();

    boolean isJoinHealthModel();

    boolean isPerfectClover(List<HealthLifeBean> list, float f, float f2, float f3);

    boolean isSupportHealthLife();

    void onDestroy();

    List<HealthLifeBean> queryHealthLifeBeanList(long j, long j2);

    void queryHealthLifeVersion(int i, int i2, ResponseCallback<List<fer>> responseCallback);

    void queryInterventionPlanInfo(String str, ResponseCallback<ffq> responseCallback);

    void queryPlan(qev qevVar, ResponseCallback<List<qey>> responseCallback);

    qfj querySchedule(String str, List<String> list, qfn qfnVar, ResponseCallback<qfj> responseCallback);

    qfj querySchedule(List<String> list, ResponseCallback<qfj> responseCallback);

    qfj querySchedule(List<String> list, qfn qfnVar, ResponseCallback<qfj> responseCallback);

    void queryWeekHealthReport(int i, ResponseCallback<ffc> responseCallback);

    void refreshLastDayRecordListCache(List<HealthLifeBean> list);

    void refreshLastQuerySchedulesResp(qfj qfjVar);

    void refreshTask(int i);

    void registerH5ProService();

    void resetCache();

    void sendDeviceTaskData();

    void setAboutEvent(int i, Context context);

    void setBinder();

    void setHealthLifeSwitch(String str, boolean z);

    void setHealthLifeTaskConsInfoCache(ffe ffeVar);

    void setHealthLifeVersion(int i, ResponseCallback<String> responseCallback);

    void setShowGuidePageCount(int i);

    void setSmallShownIdsCache(List<Integer> list);

    void shareSleepTask(int i, int i2, Bitmap bitmap);

    void showTaskDialog(Context context, HealthLifeTaskBean healthLifeTaskBean, String str, ResponseCallback<HealthLifeTaskBean> responseCallback);

    ArrayList<Integer> subscribeHiHealthData(String str, HiSubscribeListener hiSubscribeListener);

    void syncUpdateHealthGoal(List<HealthLifeBean> list, ResponseCallback<List<HealthLifeBean>> responseCallback, String str);

    void unSubscribeHiHealthData(String str, List<Integer> list, HiUnSubscribeListener hiUnSubscribeListener);

    void updateBloodPressureTarget(List<dfl> list);

    void updateDietRecord(String str, String str2, ResponseCallback<String> responseCallback);
}
