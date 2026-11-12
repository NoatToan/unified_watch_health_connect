package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.util.Pair;
import com.huawei.basichealthmodel.HealthModelH5ProService;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.basichealthmodel.service.SyncService;
import com.huawei.basichealthmodel.ui.dialog.HealthLifeTaskDialog;
import com.huawei.basichealthmodel.ui.view.SleepTaskShareView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.healthmodel.HealthLifeApi;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.hihealth.api.SyncApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.util.HealthSyncUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.taskplatform.api.TaskPlatformApi;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes23.dex */
@ApiDefine(uri = HealthLifeApi.class)
@Singleton
public class bus implements HealthLifeApi {
    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void onDestroy() {
        jyc.d();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void resetCache() {
        ReleaseLogUtil.c("HL_HealthLifeImpl", "resetCache");
        ccy.e();
        jyc.c().o();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public boolean isAgreeProtocol() {
        boolean zX = cbg.x();
        LogUtil.a("HL_HealthLifeImpl", "isAgreeProtocol isAgreeProtocol ", Boolean.valueOf(zX));
        return zX;
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public boolean isJoinHealthModel() {
        boolean zAc = cbg.ac();
        LogUtil.a("HL_HealthLifeImpl", "isJoinHealthModel isJoinHealthModel ", Boolean.valueOf(zAc));
        return zAc;
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public int getJoinTime() {
        int iR = cbg.r();
        LogUtil.a("HL_HealthLifeImpl", "getJoinTime joinTime ", Integer.valueOf(iR));
        return iR;
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public ArrayList<Integer> getBloodPressurePlanIdList() {
        return cbg.a();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public List<dfl> getBloodPressureAlarmInfoList() {
        return cbg.d();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void queryInterventionPlanInfo(String str, ResponseCallback<ffq> responseCallback) {
        LogUtil.a("HL_HealthLifeImpl", "queryInterventionPlanInfo source ", str, " callback ", responseCallback);
        bwk.d().c(responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void getHealthLifeConDays(int i, ResponseCallback<ffe> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeImpl", "getHealthLifeConDays callback is null date ", Integer.valueOf(i));
            return;
        }
        ffe ffeVarC = cgc.c();
        if (ffeVarC != null && ffeVarC.e() == i) {
            ReleaseLogUtil.c("HL_HealthLifeImpl", "getHealthLifeConDays date ", Integer.valueOf(i));
            responseCallback.onResponse(0, ffeVarC);
            return;
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        int iJ = CommonUtils.j(ccy.c("flush_data_time"));
        long jA = ccy.a("update_cloud_data_time");
        int iA2 = DateFormatUtil.a(jA);
        ReleaseLogUtil.c("R_HL_HealthLifeImpl", "getHealthLifeConDays today ", Integer.valueOf(iA), " flushDate ", Integer.valueOf(iJ), " todayUpdateCloudDataTime ", Long.valueOf(jA), " todayUpdateCloudDataDate ", Integer.valueOf(iA2));
        if (iA == iJ && iA == iA2) {
            bwk.d().e(ffv.j(), responseCallback);
        } else {
            responseCallback.onResponse(-1, new ffe());
        }
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void setHealthLifeTaskConsInfoCache(ffe ffeVar) {
        LogUtil.a("HL_HealthLifeImpl", "setHealthLifeTaskConsInfoCache consInfo ", ffeVar);
        cgc.c(ffeVar);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void setSmallShownIdsCache(List<Integer> list) {
        LogUtil.a("HL_HealthLifeImpl", "setSmallShownIdsCache ids ", list);
        cgc.b(list);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void setHealthLifeSwitch(String str, boolean z) {
        ReleaseLogUtil.c("HL_HealthLifeImpl", "setHealthLifeSwitch: key ", str);
        LogUtil.a("HL_HealthLifeImpl", "value ", Boolean.valueOf(z));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ccy.e(str, z);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public boolean getHealthLifeSwitch(String str, boolean z) {
        ReleaseLogUtil.c("HL_HealthLifeImpl", "getHealthLifeSwitch: key ", str);
        boolean zC = ccy.c(str, z);
        LogUtil.a("HL_HealthLifeImpl", "value ", Boolean.valueOf(zC));
        return zC;
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public List<Integer> getSmallShownIdsCache(int i) {
        LogUtil.a("HL_HealthLifeImpl", "getHealthLifeTaskConsInfoCache");
        return cgc.c(i);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void getHealthLifeChallenge(String str, ResponseCallback<ffd> responseCallback) {
        ccq.a(str, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public ArrayList<Integer> subscribeHiHealthData(String str, HiSubscribeListener hiSubscribeListener) {
        return cgc.c(str, hiSubscribeListener);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void unSubscribeHiHealthData(String str, List<Integer> list, HiUnSubscribeListener hiUnSubscribeListener) {
        cgc.d(str, list, hiUnSubscribeListener);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void refreshTask(int i) {
        byu.c().b(i);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public int getCloverComplete(int i, int i2) {
        HealthLifeBean healthLifeBeanC = bxc.c(i, i2, cbg.q());
        if (cbg.h(healthLifeBeanC)) {
            return healthLifeBeanC.getComplete();
        }
        return 0;
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public List<HealthLifeBean> queryHealthLifeBeanList(long j, long j2) {
        return bxc.b(DateFormatUtil.a(j), DateFormatUtil.a(j2), cbg.q());
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void initHealthLife() {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bux
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1183b.initHealthLife();
                }
            });
            return;
        }
        kad.c((ResponseCallback<Boolean>) null);
        jyc.c().i();
        boolean zAi = cbg.ai();
        LogUtil.a("HL_HealthLifeImpl", "initHealthModel isUseNewHealthModel ", Boolean.valueOf(zAi));
        if (zAi) {
            return;
        }
        ccl.d().c("HL_HealthLifeImpl");
        bxe.d().c();
        bxp.b().g();
        if (!Utils.l()) {
            LogUtil.j("HL_HealthLifeImpl", "initHealthModel isSupportHealthModel false");
            return;
        }
        if (!ffv.t()) {
            LogUtil.j("HL_HealthLifeImpl", "initHealthModel is not SupportHealthLife");
            cfv.e().a(new ResponseCallback() { // from class: bva
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("HL_HealthLifeImpl", "initHealthModel errorCode=", Integer.valueOf(i));
                }
            }, "cloverLife");
        }
        try {
            e eVar = new e();
            HealthSyncUtil.a(eVar);
            HealthSyncUtil.c(eVar);
        } catch (IllegalArgumentException e2) {
            LogUtil.j("HL_HealthLifeImpl", "initHealthModel exception ", LogAnonymous.b(e2));
        }
        SyncService.a();
        bxp.b().o();
        cfu.c(cbg.q());
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public Object getCardReader(Context context, Object obj) {
        if (obj instanceof CardConfig) {
            return new cba(context, (CardConfig) obj);
        }
        return null;
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void setBinder() {
        cdy.b();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void initDeviceManager() {
        bxp.b().e();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void registerH5ProService() {
        ddv.b().initH5Pro();
        H5ProClient.getServiceManager().registerService(HealthModelH5ProService.class);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public String getSubscriptionData(int i) {
        SparseArray<HealthLifeBean> sparseArrayC = byu.c().c(cbg.q(), i, false);
        if (sparseArrayC == null || sparseArrayC.size() <= 0) {
            LogUtil.j("HL_HealthLifeImpl", "getSubscriptionData sparseArray ", sparseArrayC);
            return "";
        }
        String strD = cdf.d(sparseArrayC);
        LogUtil.a("HL_HealthLifeImpl", "getSubscriptionData json ", strD);
        return TextUtils.isEmpty(strD) ? "" : strD;
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void refreshLastDayRecordListCache(List<HealthLifeBean> list) {
        cgc.d(list);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public List<HealthLifeTaskBean> getLastDayRecordListCache() {
        return cgc.a(cgc.e());
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public List<HealthLifeTaskBean> getDayRecordListCache() {
        if (!cbg.ac()) {
            return Collections.EMPTY_LIST;
        }
        return cgc.a(cgc.d());
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    /* JADX INFO: renamed from: getDayRecordList, reason: merged with bridge method [inline-methods] */
    public void a(final int i, final ResponseCallback<List<HealthLifeTaskBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_HealthLifeImpl", "getDayRecordList callback is null");
            return;
        }
        if (!cbg.ac()) {
            responseCallback.onResponse(-1, Collections.EMPTY_LIST);
        } else if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: buz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1185a.a(i, responseCallback);
                }
            });
        } else {
            byu.c().b(i, new TaskDayDataListener() { // from class: bus.5
                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onDataChange(int i2, HealthLifeBean healthLifeBean) {
                }

                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onAllDataChange(int i2, List<HealthLifeBean> list) {
                    if (njy.e(list)) {
                        LogUtil.j("HL_HealthLifeImpl", "getDayRecordList onAllTaskDataChange lifeBeanList ", list);
                        responseCallback.onResponse(i2, Collections.EMPTY_LIST);
                    } else {
                        responseCallback.onResponse(i2, cgc.a(list));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void queryWeekHealthReport(int i, ResponseCallback<ffc> responseCallback) {
        cbg.c(i, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void updateBloodPressureTarget(List<dfl> list) {
        if (njy.e(list)) {
            LogUtil.j("HL_HealthLifeImpl", "updateBloodPressureTarget bloodPressureAlarmInfoList ", list);
            return;
        }
        int size = list.size();
        cbq.e(String.valueOf(size), cbg.q());
        ccy.d("bloodPressureMeasurePlan", HiJsonUtil.d(list));
        ccy.d("bloodPressureMeasurePlanSaveTime", String.valueOf(System.currentTimeMillis()));
        dfl dflVar = list.get(0);
        if (dflVar != null) {
            ccy.d("blood_pressure_day_of_week", String.valueOf(dflVar.a()));
        }
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public List<HealthLifeTaskBean> getTaskDayRecordList(List<Integer> list) {
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        cgc.e(DateFormatUtil.a(System.currentTimeMillis()), list, (ResponseCallback<List<HealthLifeTaskBean>>) new ResponseCallback() { // from class: buy
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                bus.d(arrayList, countDownLatch, i, (List) obj);
            }
        });
        cbg.b(countDownLatch, "getDayRecordArray");
        return arrayList;
    }

    static /* synthetic */ void d(List list, CountDownLatch countDownLatch, int i, List list2) {
        list.addAll(list2);
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void showTaskDialog(Context context, HealthLifeTaskBean healthLifeTaskBean, String str, ResponseCallback<HealthLifeTaskBean> responseCallback) {
        if ("inputSleepDialog".equals(str)) {
            new cdi(context, healthLifeTaskBean, responseCallback).b();
            return;
        }
        HealthLifeTaskDialog healthLifeTaskDialogD = new HealthLifeTaskDialog.Builder(context, healthLifeTaskBean, str, responseCallback).d();
        healthLifeTaskDialogD.setCancelable(true);
        healthLifeTaskDialogD.show();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public float getCloverScale(List<HealthLifeBean> list, int i) {
        return cbg.c(list, i, cbg.w());
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public boolean isPerfectClover(List<HealthLifeBean> list, float f, float f2, float f3) {
        return cbg.d(list, f, f2, f3);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public int getActiveTaskId(List<HealthLifeBean> list, int i) {
        return cbg.a(list, i);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void syncUpdateHealthGoal(List<HealthLifeBean> list, ResponseCallback<List<HealthLifeBean>> responseCallback, String str) {
        cfv.e().c(list, responseCallback, str);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public List<ImageBean> getTaskDialogImageList(String str) {
        return ccl.d().a(str);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void setAboutEvent(int i, Context context) {
        cfp.e(i, context);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void shareSleepTask(int i, int i2, Bitmap bitmap) {
        SleepTaskShareView sleepTaskShareView = new SleepTaskShareView(BaseApplication.b());
        sleepTaskShareView.setTaskBenefit(i);
        sleepTaskShareView.setTaskText(i, i2);
        sleepTaskShareView.measure(-2, -2);
        sleepTaskShareView.layout(0, 0, sleepTaskShareView.getMeasuredWidth(), sleepTaskShareView.getMeasuredHeight());
        sleepTaskShareView.setBackground(bitmap);
        sleepTaskShareView.e();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void sendDeviceTaskData() {
        bxp.b().n();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public int getPlayType() {
        return cbg.k();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public Pair<Integer, String> getRemindTipMap(List<HealthLifeBean> list) {
        return cfb.a(list);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public Calendar getHourAndMinute(String str) {
        return cbg.i(str);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void getSleepData(HealthLifeBean healthLifeBean, final ResponseCallback<Object> responseCallback) {
        if (healthLifeBean == null || responseCallback == null) {
            ReleaseLogUtil.c("HL_HealthLifeImpl", "getSleepData data null");
        } else {
            cfj.d(healthLifeBean, new TaskDayDataListener() { // from class: bus.3
                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onAllDataChange(int i, List<HealthLifeBean> list) {
                }

                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onDataChange(int i, HealthLifeBean healthLifeBean2) {
                    if (healthLifeBean2 == null) {
                        ReleaseLogUtil.d("HL_HealthLifeImpl", "getSleepData errorCode ", Integer.valueOf(i));
                        responseCallback.onResponse(-1, "");
                    } else {
                        String result = healthLifeBean2.getResult();
                        LogUtil.a("HL_HealthLifeImpl", "getSleepData bedTime", result);
                        responseCallback.onResponse(i, result);
                    }
                }
            });
        }
    }

    static class e implements SyncApi<Void> {
        private e() {
        }

        @Override // com.huawei.hihealth.api.SyncApi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void syncCloud() {
            ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).uploadSnapshots();
            SyncService.a();
            return null;
        }

        @Override // com.huawei.hihealth.api.SyncApi
        public void cleanCloud(boolean z, Object obj) {
            if (obj instanceof ResponseCallback) {
                ccu.d(z, true, (ResponseCallback) obj);
            }
        }

        @Override // com.huawei.hihealth.api.SyncApi
        public String getLabel() {
            return SyncApi.HEALTH_LIFE;
        }
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public boolean isSupportHealthLife() {
        return jzl.g();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public boolean isHealthLife() {
        return jyc.c().f();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void isHealthLife(ResponseCallback<Boolean> responseCallback) {
        kad.c(responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public int getShowGuidePageCount() {
        return jzl.i();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void setShowGuidePageCount(int i) {
        jzl.b(i);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public String getHealthLifePlanId() {
        return jyc.c().b();
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void setHealthLifeVersion(int i, ResponseCallback<String> responseCallback) {
        jzj.c(i, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void queryHealthLifeVersion(int i, int i2, ResponseCallback<List<fer>> responseCallback) {
        jzj.c(i, i2, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void createPlan(qex qexVar, ResponseCallback<qey> responseCallback) {
        kbg.b(qexVar, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void queryPlan(qev qevVar, ResponseCallback<List<qey>> responseCallback) {
        jyc.c().b(qevVar, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void createTask(qfv qfvVar, ResponseCallback<qgc> responseCallback) {
        kbg.d(qfvVar, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public qfj querySchedule(List<String> list, ResponseCallback<qfj> responseCallback) {
        return jyc.c().b(list, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public qfj querySchedule(List<String> list, qfn qfnVar, ResponseCallback<qfj> responseCallback) {
        return jyc.c().a("HL_HealthLifeImpl", list, null, qfnVar, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public qfj querySchedule(String str, List<String> list, qfn qfnVar, ResponseCallback<qfj> responseCallback) {
        return jyc.c().a(str, list, null, qfnVar, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void drinkWater(int i, ResponseCallback<qfr> responseCallback) {
        kbg.b(i, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public List<nrh> getLeafProgress(int i, int i2, ResponseCallback<List<nrh>> responseCallback) {
        return jyc.c().a(i, i2, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void updateDietRecord(String str, String str2, ResponseCallback<String> responseCallback) {
        jyc.c().b(str, str2, responseCallback);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public void refreshLastQuerySchedulesResp(qfj qfjVar) {
        jzl.e(qfjVar);
    }

    @Override // com.huawei.health.healthmodel.HealthLifeApi
    public qfj getLastQuerySchedulesResp() {
        return jzl.e();
    }
}
