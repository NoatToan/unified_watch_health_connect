package com.huawei.basichealthmodel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealthmodel.HealthModelH5ProService;
import com.huawei.basichealthmodel.bean.ChallengeConfigBean;
import com.huawei.basichealthmodel.bean.ConfigDetailBean;
import com.huawei.basichealthmodel.callback.HealthModelH5ProCallback;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.trade.PayApi;
import defpackage.bxc;
import defpackage.byu;
import defpackage.cbg;
import defpackage.ccb;
import defpackage.ccy;
import defpackage.cdg;
import defpackage.cfh;
import defpackage.cfp;
import defpackage.cfu;
import defpackage.cgi;
import defpackage.ffc;
import defpackage.ffd;
import defpackage.ffv;
import defpackage.iov;
import defpackage.iun;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qgr;
import defpackage.qhb;
import defpackage.qhq;
import defpackage.qpx;
import defpackage.qrf;
import defpackage.vgo;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "HealthModel", users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class HealthModelH5ProService {
    private static final String TAG = "HL_HealthModelH5ProService";

    private HealthModelH5ProService() {
    }

    private static Context getContext() {
        Activity activityJ = BaseApplication.j();
        if (activityJ != null) {
            return activityJ;
        }
        LogUtil.j(TAG, "getContext activity is null");
        return BaseApplication.b();
    }

    @H5ProMethod(name = "jumpH5ProApp")
    public static void jumpH5ProApp(String str, String str2) {
        LogUtil.a(TAG, "jumpH5ProApp packageName ", str, " path ", str2);
        cbg.e(getContext(), str, str2);
    }

    @H5ProMethod(name = "jumpUrl")
    public static void jumpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "jumpUrl url is ", str);
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.j(TAG, "jumpUrl api is null url ", str);
        } else {
            marketRouterApi.router(str);
            LogUtil.a(TAG, "jumpUrl url ", str);
        }
    }

    @H5ProMethod(name = "jumpMindfulness")
    public static void jumpMindfulness() {
        ConfigDetailBean detailEntity = cbg.d(byu.c(), 9).getDetailEntity();
        if (detailEntity == null) {
            LogUtil.j(TAG, "jumpMindfulness healthTaskDetailEntity is null");
            return;
        }
        String uri = detailEntity.getUri();
        if (TextUtils.isEmpty(uri)) {
            jumpUrl(detailEntity.getUrl());
        } else {
            iov.d(getContext(), new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(uri)));
        }
        LogUtil.a(TAG, "jumpMindfulness");
    }

    @H5ProMethod(name = "jumpSleep")
    public static void jumpSleep(boolean z) {
        AppRouter.c("/Main/KnitSleepDetailActivity").a("from", 9).b(getContext());
        LogUtil.a(TAG, "jumpSleep isDetail ", Boolean.valueOf(z));
    }

    @H5ProMethod(name = "jumpGoalManager")
    public static void jumpGoalManager() {
        Activity activity;
        String simpleName;
        Context context = getContext();
        if (!(context instanceof Activity)) {
            activity = null;
            simpleName = "";
        } else {
            activity = (Activity) context;
            simpleName = activity.getClass().getSimpleName();
        }
        Activity activity2 = activity;
        String str = simpleName;
        if (activity2 != null && "HealthModelActivity".equals(str)) {
            AppRouter.c("/PluginHealthModel/HealthModelGoalManagerActivity").b(activity2, 2000);
        } else {
            AppRouter.c("/PluginHealthModel/HealthModelGoalManagerActivity").b(context);
        }
        LogUtil.a(TAG, "jumpGoalManager context ", context, " activity ", activity2, " simpleName ", str);
    }

    @H5ProMethod(name = "jumpGuide")
    public static void jumpGuide(String str, String str2, String str3, String str4) {
        LogUtil.a(TAG, "jumpGuide idListText=", str, ",basicIdText=", str2, ",goalIdListText=", str3, ",goalIdText=", str4);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return;
        }
        try {
            ArrayList<String> arrayList = (ArrayList) HiJsonUtil.d(str, new TypeToken<ArrayList<String>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.1
            }.getType());
            ArrayList<String> arrayList2 = (ArrayList) HiJsonUtil.d(str2, new TypeToken<ArrayList<String>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.2
            }.getType());
            ArrayList<String> arrayList3 = (ArrayList) HiJsonUtil.d(str3, new TypeToken<ArrayList<String>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.3
            }.getType());
            ArrayList arrayList4 = (ArrayList) HiJsonUtil.d(str4, new TypeToken<ArrayList<String>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.4
            }.getType());
            if (!njy.e(arrayList) && !njy.e(arrayList2) && !njy.e(arrayList3) && !njy.e(arrayList4)) {
                Bundle bundle = new Bundle();
                bundle.putInt("goalId", CommonUtil.j((String) arrayList4.get(0)));
                bundle.putStringArrayList("idList", arrayList);
                bundle.putStringArrayList("basicIdList", arrayList2);
                bundle.putStringArrayList("goalIdList", arrayList3);
                AppRouter.c("/PluginHealthModel/HealthModelGuideActivity").d(bundle).b(getContext());
                return;
            }
            LogUtil.j(TAG, "jumpGuide taskId convert error");
        } catch (JsonParseException e) {
            LogUtil.e(TAG, "jumpGuide exception=", LogAnonymous.b(e));
        }
    }

    @H5ProMethod(name = "jumpInputWeight")
    public static void jumpInputWeight() {
        iun.c(getContext());
        LogUtil.a(TAG, "jumpInputWeight");
    }

    @H5ProMethod(name = "getJoinTime")
    public static String getJoinTime() {
        int iR = cbg.r();
        LogUtil.a(TAG, "getJoinTime joinTime ", Integer.valueOf(iR));
        if (iR <= 0) {
            return "";
        }
        return String.valueOf(iR);
    }

    @H5ProMethod(name = "getUpgradeTime")
    public static String getUpgradeTime() {
        int iW = cbg.w();
        LogUtil.a(TAG, "getUpgradeTime upgradeTime ", Integer.valueOf(iW));
        if (iW <= 0) {
            return "";
        }
        return String.valueOf(iW);
    }

    @H5ProMethod(name = "getChallengeId")
    public static String getChallengeId() {
        String strC = ccy.c("health_model_challenge_id");
        LogUtil.a(TAG, "getChallengeId challengeId ", strC);
        return (TextUtils.isEmpty(strC) || strC.equals(String.valueOf(AwarenessConstants.ERROR_NO_PERMISSION_CODE))) ? "" : strC;
    }

    @H5ProMethod(name = "getChallengeIdList")
    public static String getChallengeIdList() {
        int challengeId;
        List<ChallengeConfigBean> listC = cfu.c(byu.c().e().getChallengeList());
        LogUtil.a(TAG, "getChallengeIdList list ", listC);
        if (njy.e(listC)) {
            return "";
        }
        ArrayList<Integer> arrayListJ = ffv.j();
        ArrayList arrayList = new ArrayList();
        for (Integer num : arrayListJ) {
            int iIntValue = num.intValue();
            if (iIntValue > 1 && iIntValue != 11) {
                arrayList.add(num);
            }
        }
        HashMap map = new HashMap();
        for (ChallengeConfigBean challengeConfigBean : listC) {
            if (challengeConfigBean != null && (challengeId = challengeConfigBean.getChallengeId()) != 200001) {
                map.put(Integer.valueOf(challengeId), arrayList);
            }
        }
        String strD = HiJsonUtil.d(map);
        LogUtil.a(TAG, "getChallengeIdList json ", strD);
        return strD;
    }

    @H5ProMethod(name = "getTaskIdList")
    public static String getTaskIdList() {
        ArrayList<Integer> arrayListJ = ffv.j();
        ArrayList arrayList = new ArrayList();
        for (Integer num : arrayListJ) {
            int iIntValue = num.intValue();
            if (iIntValue > 1 && iIntValue != 11) {
                arrayList.add(num);
            }
        }
        String strD = HiJsonUtil.d(arrayList);
        LogUtil.a(TAG, "getTaskIdList taskIdList ", arrayListJ, " json ", strD);
        return strD;
    }

    @H5ProMethod(name = "isBloodPressurePlan")
    public static boolean isBloodPressurePlan() {
        boolean zV = cbg.v();
        LogUtil.a(TAG, "isBloodPressurePlan isBloodPressurePlan ", Boolean.valueOf(zV));
        return zV;
    }

    @H5ProMethod(name = "isIntensityRestDoubleToday")
    public static boolean isIntensityRestDoubleToday() {
        boolean zB = cgi.b();
        LogUtil.a(TAG, "isIntensityRestDoubleToday isIntensityRestDoubleToday ", Boolean.valueOf(zB));
        return zB;
    }

    private static String getBenefitOrSuggestion(String str, String str2, boolean z) {
        String strD;
        LogUtil.a(TAG, "getBenefitOrSuggestion taskIdText ", str, " challengeIdText ", str2, " isBenefit ", Boolean.valueOf(z));
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        if (iJ > 0 && iJ2 > 0) {
            if (z) {
                strD = cfp.d(iJ, iJ2, false);
            } else {
                ArrayList<String> arrayListE = cfh.e(cfh.e(iJ, iJ2).e(), (HashMap<String, String>) null);
                if (njy.e(arrayListE)) {
                    LogUtil.j(TAG, "getBenefitOrSuggestion stringList ", arrayListE);
                    return "";
                }
                strD = arrayListE.get(qrf.d(arrayListE.size()));
            }
            LogUtil.a(TAG, "getBenefitOrSuggestion text ", strD);
            return strD;
        }
        return "";
    }

    @H5ProMethod(name = "getBenefit")
    public static String getBenefit(String str, String str2) {
        return getBenefitOrSuggestion(str, str2, true);
    }

    @H5ProMethod(name = "getSuggestion")
    public static String getSuggestion(String str, String str2) {
        return getBenefitOrSuggestion(str, str2, false);
    }

    /* JADX INFO: renamed from: com.huawei.basichealthmodel.HealthModelH5ProService$19, reason: invalid class name */
    /* JADX INFO: loaded from: classes23.dex */
    public class AnonymousClass19 extends HandlerThread {
        final /* synthetic */ HealthModelH5ProCallback e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass19(String str, HealthModelH5ProCallback healthModelH5ProCallback) {
            super(str);
            this.e = healthModelH5ProCallback;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            if (this.e == null) {
                LogUtil.j(HealthModelH5ProService.TAG, "getTaskTip callback is null");
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final StringBuilder sb = new StringBuilder();
            HealthModelH5ProService.getTextForTaskTip(new ResponseCallback() { // from class: bwf
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    HealthModelH5ProService.AnonymousClass19.a(sb, countDownLatch, i, (String) obj);
                }
            });
            CountDownTimer countDownTimer = new CountDownTimer(2000L, 2000L) { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.19.1
                @Override // android.os.CountDownTimer
                public void onTick(long j) {
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    LogUtil.a(HealthModelH5ProService.TAG, "getTaskTip onFinish");
                    cancel();
                    countDownLatch.countDown();
                }
            };
            countDownTimer.start();
            cbg.b(countDownLatch, "getTaskTip");
            countDownTimer.cancel();
            String string = sb.toString();
            HealthModelH5ProCallback healthModelH5ProCallback = this.e;
            if (TextUtils.isEmpty(string)) {
                string = BaseApplication.b().getResources().getString(R.string.IDS_task_tip);
            }
            healthModelH5ProCallback.onSuccess(string);
        }

        public static /* synthetic */ void a(StringBuilder sb, CountDownLatch countDownLatch, int i, String str) {
            LogUtil.a(HealthModelH5ProService.TAG, "getTaskTip result ", Integer.valueOf(i), " text ", str);
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            countDownLatch.countDown();
        }
    }

    @H5ProMethod(name = "getTaskTip")
    public static void getTaskTip(HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        new AnonymousClass19("getTaskTip", healthModelH5ProCallback).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getTextForTaskTip(final ResponseCallback<String> responseCallback) {
        byu.c().b(DateFormatUtil.a(System.currentTimeMillis()), new TaskDayDataListener() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.20
            @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
            public void onDataChange(int i, HealthLifeBean healthLifeBean) {
            }

            @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
            public void onAllDataChange(int i, List<HealthLifeBean> list) {
                LogUtil.a(HealthModelH5ProService.TAG, "getTextForTaskTip result ", Integer.valueOf(i), " healthTaskBeanList ", list);
                ArrayList idListForTaskTip = HealthModelH5ProService.getIdListForTaskTip(list);
                if (njy.e(idListForTaskTip)) {
                    responseCallback.onResponse(-1, "");
                    return;
                }
                ArrayList<String> arrayListE = cfh.e(cfh.c("", ((Integer) idListForTaskTip.get(qrf.d(idListForTaskTip.size()))).intValue()).e(), (HashMap<String, String>) null);
                if (njy.e(arrayListE)) {
                    LogUtil.j(HealthModelH5ProService.TAG, "getTextForTaskTip tipList ", arrayListE);
                    responseCallback.onResponse(-1, "");
                    return;
                }
                String str = arrayListE.get(qrf.d(arrayListE.size()));
                LogUtil.a(HealthModelH5ProService.TAG, "getTextForTaskTip text ", str);
                if (TextUtils.isEmpty(str)) {
                    responseCallback.onResponse(-1, "");
                } else {
                    responseCallback.onResponse(0, str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<Integer> getIdListForTaskTip(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            return new ArrayList<>();
        }
        ArrayList<Integer> arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                if (cbg.b(id) && id > 1 && id < 11) {
                    arrayList.add(Integer.valueOf(id));
                    if (healthLifeBean.getComplete() <= 0) {
                        arrayList2.add(Integer.valueOf(id));
                    }
                }
            }
        }
        if (njy.e(arrayList)) {
            return new ArrayList<>();
        }
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        if (njy.b(arrayList2)) {
            for (Integer num : arrayList2) {
                if (!njy.e(cfh.c("", num.intValue()).e())) {
                    arrayList3.add(num);
                }
            }
        }
        if (!njy.b(arrayList3)) {
            for (Integer num2 : arrayList) {
                if (!njy.e(cfh.c("", num2.intValue()).e())) {
                    arrayList3.add(num2);
                }
            }
        }
        return arrayList3;
    }

    @H5ProMethod(name = "getRewardsComplete")
    public static void getRewardsComplete(final String str, final String str2, final HealthModelH5ProCallback<Integer> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvp
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getRewardsComplete(str, str2, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getRewardsComplete callback is null");
            return;
        }
        LogUtil.a(TAG, "getRewardsComplete ", str, str2);
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        if (iJ <= 0 || iJ2 <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
            return;
        }
        List<HealthLifeBean> listB = bxc.b(iJ, iJ2, cbg.q());
        if (njy.e(listB)) {
            LogUtil.j(TAG, "getRewardsComplete list ", listB);
            healthModelH5ProCallback.onFailure(-1, "getRewardsComplete list is empty");
        } else {
            int iB = cbg.b(listB);
            LogUtil.a(TAG, "getRewardsComplete rewardsCompleted ", Integer.valueOf(iB));
            healthModelH5ProCallback.onSuccess(Integer.valueOf(iB));
        }
    }

    @H5ProMethod(name = "getCompleteForTask")
    public static void getCompleteForTask(final String str, final String str2, final String str3, final HealthModelH5ProCallback<Integer> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bwa
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getCompleteForTask(str, str2, str3, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getCompleteForTask callback is null");
            return;
        }
        LogUtil.a(TAG, "getCompleteForTask ", str, str2, " taskIdText ", str3);
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        int iJ3 = CommonUtils.j(str3);
        if (iJ <= 0 || iJ2 <= 0 || !cbg.b(iJ3)) {
            healthModelH5ProCallback.onFailure(-1, "");
            return;
        }
        int iB = bxc.b(iJ, iJ2, iJ3);
        LogUtil.a(TAG, "getCompleteForTask completedTask ", Integer.valueOf(iB));
        healthModelH5ProCallback.onSuccess(Integer.valueOf(iB));
    }

    @H5ProMethod(name = "getCompleteArray")
    public static void getCompleteArray(final String str, final String str2, final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        int iB;
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvl
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getCompleteArray(str, str2, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getCompleteArray callback is null");
            return;
        }
        LogUtil.a(TAG, "getCompleteArray ", str, str2);
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        if (iJ <= 0 || iJ2 <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
            return;
        }
        ArrayList<Integer> arrayListJ = ffv.j();
        HashMap map = new HashMap();
        for (Integer num : arrayListJ) {
            int iIntValue = num.intValue();
            if (cbg.b(iIntValue) && iIntValue > 1 && iIntValue != 11 && (iB = bxc.b(iJ, iJ2, iIntValue)) > 0) {
                map.put(num, Integer.valueOf(iB));
            }
        }
        String strD = HiJsonUtil.d(map);
        LogUtil.a(TAG, "getCompleteArray json ", strD);
        healthModelH5ProCallback.onSuccess(strD);
    }

    @H5ProMethod(name = "getComplete")
    public static void getComplete(final String str, final String str2, final HealthModelH5ProCallback<Integer> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvy
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getComplete(str, str2, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getComplete callback is null");
            return;
        }
        LogUtil.a(TAG, "getComplete ", str, str2);
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        if (iJ <= 0 || iJ2 <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
            return;
        }
        int i = cbg.a(iJ, iJ2).get(0);
        LogUtil.a(TAG, "getComplete completeNumber ", Integer.valueOf(i));
        healthModelH5ProCallback.onSuccess(Integer.valueOf(i));
    }

    @H5ProMethod(name = "getClover")
    public static void getClover(final String str, final String str2, final HealthModelH5ProCallback<Integer> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvx
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getClover(str, str2, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getClover callback is null");
            return;
        }
        LogUtil.a(TAG, "getClover ", str, str2);
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        if (iJ <= 0 || iJ2 <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
            return;
        }
        int i = cbg.a(iJ, iJ2).get(1);
        LogUtil.a(TAG, "getClover completeNumber ", Integer.valueOf(i));
        healthModelH5ProCallback.onSuccess(Integer.valueOf(i));
    }

    @H5ProMethod(name = "getTaskSubscriptionList")
    public static void getTaskSubscriptionList(final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvw
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getTaskSubscriptionList(healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getTaskSubscriptionList callback is null");
            return;
        }
        SparseArray<HealthLifeBean> sparseArrayC = byu.c().c(cbg.q(), DateFormatUtil.a(lsl.w(System.currentTimeMillis())), false);
        int size = sparseArrayC.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArrayC.keyAt(i);
            if (cbg.b(iKeyAt) && iKeyAt > 1) {
                arrayList.add(sparseArrayC.get(iKeyAt));
            }
        }
        String strE = HiJsonUtil.e(arrayList, new TypeToken<ArrayList<HealthLifeBean>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.7
        }.getType());
        LogUtil.a(TAG, "getTaskSubscriptionList json ", strE);
        healthModelH5ProCallback.onSuccess(strE);
    }

    @H5ProMethod(name = "updateTaskSubscriptionList")
    public static void updateTaskSubscriptionList(final String str, final String str2, final HealthModelH5ProCallback<Integer> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvg
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.updateTaskSubscriptionList(str, str2, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "updateTaskSubscriptionList callback is null");
            return;
        }
        LogUtil.a(TAG, "updateTaskSubscriptionList taskIdText ", str, " targetText ", str2);
        final int iJ = CommonUtils.j(str);
        final int iJ2 = CommonUtils.j(str2);
        if (!cbg.b(iJ) || iJ2 < 0) {
            healthModelH5ProCallback.onFailure(-1, "");
        } else {
            if (!CommonUtil.ab(BaseApplication.b())) {
                String string = BaseApplication.b().getResources().getString(com.huawei.health.servicesui.R.string.IDS_hw_show_set_about_privacy_connectting_error);
                qpx.e(getContext(), string);
                healthModelH5ProCallback.onFailure(-1, string);
                return;
            }
            byu.c().e(getUpdateList(byu.c().c(cbg.q(), DateFormatUtil.a(lsl.w(System.currentTimeMillis())), false), iJ, iJ2), new ResponseCallback() { // from class: bvc
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    HealthModelH5ProService.lambda$updateTaskSubscriptionList$7(iJ, iJ2, healthModelH5ProCallback, i, (SparseArray) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$updateTaskSubscriptionList$7(int i, int i2, HealthModelH5ProCallback healthModelH5ProCallback, int i3, SparseArray sparseArray) {
        LogUtil.a(TAG, "updateTaskSubscriptionList resultCode ", Integer.valueOf(i3), " taskId ", Integer.valueOf(i), " target ", Integer.valueOf(i2));
        processTaskResult(i3, i, healthModelH5ProCallback);
    }

    private static void processTaskResult(int i, int i2, HealthModelH5ProCallback<Integer> healthModelH5ProCallback) {
        if (i == 0) {
            cdg.a(i2);
            healthModelH5ProCallback.onSuccess(0);
            return;
        }
        if (i != 1003) {
            if (i == 12030008) {
                cdg.d();
                healthModelH5ProCallback.onFailure(i, "");
                return;
            } else if (i != 12030010) {
                cdg.a();
                healthModelH5ProCallback.onFailure(i, "");
                return;
            }
        }
        cdg.b();
        healthModelH5ProCallback.onFailure(i, "");
    }

    private static ArrayList<HealthLifeBean> getUpdateList(SparseArray<HealthLifeBean> sparseArray, int i, int i2) {
        LogUtil.a(TAG, "getUpdateList sparseArray ", sparseArray, " taskId ", Integer.valueOf(i), " target ", Integer.valueOf(i2));
        if (sparseArray == null) {
            return new ArrayList<>();
        }
        int size = sparseArray.size();
        ArrayList<HealthLifeBean> arrayList = new ArrayList<>();
        int iA = DateFormatUtil.a(lsl.w(System.currentTimeMillis()));
        for (int i3 = 0; i3 < size; i3++) {
            HealthLifeBean healthLifeBean = sparseArray.get(sparseArray.keyAt(i3));
            if (healthLifeBean != null) {
                healthLifeBean.setRecordDay(iA);
                int id = healthLifeBean.getId();
                if (id == 1) {
                    healthLifeBean.setLastTarget(healthLifeBean.getTarget());
                    arrayList.add(healthLifeBean);
                } else {
                    if (id == i && ((i == 2 || i == 3) && i2 > 0)) {
                        healthLifeBean.setLastTarget(healthLifeBean.getTarget());
                        healthLifeBean.setTarget(String.valueOf(i2));
                        arrayList.add(healthLifeBean);
                    }
                    if (!arrayList.contains(healthLifeBean)) {
                        healthLifeBean.setLastTarget(healthLifeBean.getTarget());
                        arrayList.add(healthLifeBean);
                    }
                }
            }
        }
        return arrayList;
    }

    @H5ProMethod(name = "updateHealthLifeChallenge")
    public static void updateHealthLifeChallenge(final String str, final HealthModelH5ProCallback<Integer> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvv
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.updateHealthLifeChallenge(str, healthModelH5ProCallback);
                }
            });
        } else if (healthModelH5ProCallback == null || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "updateHealthLifeChallenge callback ", healthModelH5ProCallback, " challengeIdText ", str);
        } else {
            LogUtil.a(TAG, "updateHealthLifeChallenge challengeIdText ", str);
            ccb.d().b(CommonUtil.j(str), new ResponseCallback() { // from class: bve
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    HealthModelH5ProService.lambda$updateHealthLifeChallenge$9(healthModelH5ProCallback, i, (String) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$updateHealthLifeChallenge$9(HealthModelH5ProCallback healthModelH5ProCallback, int i, String str) {
        LogUtil.a(TAG, "updateHealthLifeChallenge errorCode ", Integer.valueOf(i), " object ", str);
        if (i == 0) {
            healthModelH5ProCallback.onSuccess(0);
            return;
        }
        if (str == null) {
            str = "";
        }
        healthModelH5ProCallback.onFailure(i, str);
    }

    @H5ProMethod(name = "updateSubscriptionList")
    public static void updateSubscriptionList(final String str, final String str2, final String str3, final String str4, final HealthModelH5ProCallback<Integer> healthModelH5ProCallback) {
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "updateSubscriptionList callback is null");
            return;
        }
        if (!HandlerExecutor.c()) {
            LogUtil.a(TAG, "updateSubscriptionList subscriptionIdListText ", str, " basicIdListText ", str2, " challengeIdListText ", str3, " challengeIdText ", str4);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                healthModelH5ProCallback.onFailure(-1, "");
                return;
            }
            try {
                List<String> list = (List) HiJsonUtil.d(str, new TypeToken<List<String>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.8
                }.getType());
                List<String> list2 = (List) HiJsonUtil.d(str2, new TypeToken<List<String>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.9
                }.getType());
                List<String> list3 = (List) HiJsonUtil.d(str3, new TypeToken<List<String>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.10
                }.getType());
                List list4 = (List) HiJsonUtil.d(str4, new TypeToken<List<String>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.11
                }.getType());
                if (!njy.e(list) && !njy.e(list2) && !njy.e(list3) && !njy.e(list4)) {
                    ccb.d().d(list, list2, list3, CommonUtil.j((String) list4.get(0)), new ResponseCallback() { // from class: bvm
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i, Object obj) {
                            HealthModelH5ProService.lambda$updateSubscriptionList$11(healthModelH5ProCallback, i, (String) obj);
                        }
                    });
                    return;
                }
                LogUtil.j(TAG, "updateSubscriptionList taskId convert error");
                healthModelH5ProCallback.onFailure(-1, "");
                return;
            } catch (JsonParseException e) {
                LogUtil.e(TAG, "updateSubscriptionList exception ", LogAnonymous.b(e));
                healthModelH5ProCallback.onFailure(-1, "");
                return;
            }
        }
        cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvq
            @Override // java.lang.Runnable
            public final void run() {
                HealthModelH5ProService.updateSubscriptionList(str, str2, str3, str4, healthModelH5ProCallback);
            }
        });
    }

    public static /* synthetic */ void lambda$updateSubscriptionList$11(HealthModelH5ProCallback healthModelH5ProCallback, int i, String str) {
        LogUtil.a(TAG, "updateSubscriptionList errorCode ", Integer.valueOf(i), " object ", str);
        if (i == 0 || i == 12030009) {
            healthModelH5ProCallback.onSuccess(0);
        } else {
            healthModelH5ProCallback.onFailure(i, str);
        }
    }

    @H5ProMethod(name = "getTaskList")
    public static void getTaskList(final String str, final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvz
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getTaskList(str, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getTaskList callback is null");
            return;
        }
        LogUtil.a(TAG, "getTaskList dateText ", str);
        int iJ = CommonUtils.j(str);
        if (iJ <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
        } else {
            byu.c().b(iJ, new TaskDayDataListener() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.5
                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onDataChange(int i, HealthLifeBean healthLifeBean) {
                }

                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onAllDataChange(int i, List<HealthLifeBean> list) {
                    String strD = HiJsonUtil.d(list);
                    LogUtil.a(HealthModelH5ProService.TAG, "getTaskList json ", strD);
                    if (njy.e(list)) {
                        healthModelH5ProCallback.onFailure(-1, strD);
                    } else {
                        healthModelH5ProCallback.onSuccess(strD);
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "getWeekRecordList")
    public static void getWeekRecordList(final String str, final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvk
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getWeekRecordList(str, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getWeekRecordList callback is null");
            return;
        }
        LogUtil.a(TAG, "getWeekRecordList dateText ", str);
        int iJ = CommonUtils.j(str);
        if (iJ <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
        } else {
            byu.c().e(cbg.q(), iJ, new TaskDataListener() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.6
                @Override // com.huawei.basichealthmodel.listener.TaskDataListener
                public void onDataChange(int i, SparseArray<HealthLifeBean> sparseArray) {
                }

                @Override // com.huawei.basichealthmodel.listener.TaskDataListener
                public void onAllDataChange(int i, SparseArray<List<HealthLifeBean>> sparseArray) {
                    if (sparseArray == null) {
                        LogUtil.j(HealthModelH5ProService.TAG, "getWeekRecordList listSparseArray is null");
                        healthModelH5ProCallback.onFailure(-1, "");
                        return;
                    }
                    int size = sparseArray.size();
                    if (size <= 0) {
                        LogUtil.j(HealthModelH5ProService.TAG, "getWeekRecordList size ", Integer.valueOf(size));
                        healthModelH5ProCallback.onFailure(-1, "");
                        return;
                    }
                    HashMap map = new HashMap();
                    for (int i2 = 0; i2 < size; i2++) {
                        int iKeyAt = sparseArray.keyAt(i2);
                        map.put(Integer.valueOf(iKeyAt), sparseArray.get(iKeyAt));
                    }
                    String strD = HiJsonUtil.d(map);
                    LogUtil.a(HealthModelH5ProService.TAG, "getWeekRecordList json ", strD);
                    healthModelH5ProCallback.onSuccess(strD);
                }
            });
        }
    }

    @H5ProMethod(name = "getIntensityStatusList")
    public static void getIntensityStatusList(final String str, final String str2, final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvr
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getIntensityStatusList(str, str2, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getIntensityStatusList callback is null");
            return;
        }
        LogUtil.a(TAG, "getIntensityStatusList startDateText ", str, " endDateText ", str2);
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        if (iJ <= 0 || iJ2 <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
        } else {
            cbg.b(str, str2, new HiAggregateListener() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.13
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    if (njy.e(list)) {
                        healthModelH5ProCallback.onSuccess("");
                        return;
                    }
                    HashMap map = new HashMap();
                    for (HiHealthData hiHealthData : list) {
                        if (hiHealthData != null) {
                            map.put(Integer.valueOf(cbg.d(hiHealthData)), Integer.valueOf(cbg.a(hiHealthData)));
                        }
                    }
                    String strD = HiJsonUtil.d(map);
                    LogUtil.a(HealthModelH5ProService.TAG, "getIntensityStatusList json ", strD);
                    healthModelH5ProCallback.onSuccess(strD);
                }
            });
        }
    }

    @H5ProMethod(name = "getDietRecord")
    public static void getDietRecord(final String str, final String str2, final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvj
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getDietRecord(str, str2, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getDietRecord callback is null");
            return;
        }
        LogUtil.a(TAG, "getDietRecord startDateText ", str, " endDateText ", str2);
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        if (iJ <= 0 || iJ2 <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
        } else {
            iun.c(iJ, iJ2, new ResponseCallback() { // from class: bvh
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    HealthModelH5ProService.lambda$getDietRecord$16(healthModelH5ProCallback, i, (List) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$getDietRecord$16(HealthModelH5ProCallback healthModelH5ProCallback, int i, List list) {
        String strD = HiJsonUtil.d(list);
        List<vgo> list2 = (List) HiJsonUtil.d(strD, new TypeToken<List<vgo>>() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.15
        }.getType());
        if (njy.e(list2)) {
            ReleaseLogUtil.e(TAG, "getDietRecord errorCode ", Integer.valueOf(i), " list ", list, " json ", strD, " resultList ", list2);
            healthModelH5ProCallback.onSuccess(strD);
            return;
        }
        for (vgo vgoVar : list2) {
            if (vgoVar != null) {
                vgoVar.a(lsl.d(DateFormatUtil.d(vgoVar.c()), TimeZone.getDefault()));
                vgoVar.j();
            }
        }
        String strD2 = HiJsonUtil.d(list2);
        LogUtil.a(TAG, "getDietRecord errorCode ", Integer.valueOf(i), " list ", list, " json ", strD, "resultJson ", strD2, " resultList ", list2);
        healthModelH5ProCallback.onSuccess(strD2);
    }

    @H5ProMethod(name = "queryWeekHealthReport")
    public static void queryWeekHealthReport(final String str, final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvu
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.queryWeekHealthReport(str, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "queryWeekHealthReport callback is null");
            return;
        }
        LogUtil.a(TAG, "queryWeekHealthReport startDateText ", str);
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j(TAG, "queryWeekHealthReport isNetworkConnected false");
            healthModelH5ProCallback.onFailure(-1, "");
            return;
        }
        int iJ = CommonUtils.j(str);
        if (iJ <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
        } else {
            cbg.c(iJ, (ResponseCallback<ffc>) new ResponseCallback() { // from class: bvt
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    HealthModelH5ProService.lambda$queryWeekHealthReport$18(healthModelH5ProCallback, i, (ffc) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$queryWeekHealthReport$18(HealthModelH5ProCallback healthModelH5ProCallback, int i, ffc ffcVar) {
        if (ffcVar == null) {
            healthModelH5ProCallback.onFailure(i, "");
            return;
        }
        String strD = HiJsonUtil.d(ffcVar);
        LogUtil.a(TAG, "queryWeekHealthReport json ", strD);
        healthModelH5ProCallback.onSuccess(strD);
    }

    @H5ProMethod(name = "queryBenefitInfo")
    public static void queryBenefitInfo(final String str, final String str2, final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvf
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.queryBenefitInfo(str, str2, healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "queryBenefitInfo callback is null");
            return;
        }
        LogUtil.a(TAG, "queryBenefitInfo resourceTypeText ", str, " resourceId ", str2);
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j(TAG, "queryBenefitInfo isNetworkConnected false");
            healthModelH5ProCallback.onFailure(-1, "");
            return;
        }
        int iJ = CommonUtils.j(str);
        if (iJ <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
            return;
        }
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j(TAG, "queryBenefitInfo payApi is null");
            healthModelH5ProCallback.onFailure(-1, "");
        } else {
            payApi.queryBenefitInfo(iJ, str2, new IBaseResponseCallback() { // from class: bvi
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    HealthModelH5ProService.lambda$queryBenefitInfo$20(healthModelH5ProCallback, i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$queryBenefitInfo$20(HealthModelH5ProCallback healthModelH5ProCallback, int i, Object obj) {
        String strD = obj == null ? "" : HiJsonUtil.d(obj);
        LogUtil.a(TAG, "queryBenefitInfo errorCode ", Integer.valueOf(i), " object ", obj, " json ", strD);
        if (i == 0) {
            healthModelH5ProCallback.onSuccess(strD);
        } else {
            healthModelH5ProCallback.onFailure(-1, strD);
        }
    }

    @H5ProMethod(name = "isThreeCircle")
    public static boolean isThreeCircle() {
        boolean zA = qgr.a(BaseApplication.b());
        LogUtil.a(TAG, "isThreeCircle isThreeCircleCard ", Boolean.valueOf(zA));
        return zA;
    }

    @H5ProMethod(name = "getThreeCircleProgress")
    public static void getThreeCircleProgress(final long j, final long j2, final int i, final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        LogUtil.a(TAG, "getThreeCircleProgress startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2), " type:", Integer.valueOf(i));
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvn
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getThreeCircleProgress(j, j2, i, healthModelH5ProCallback);
                }
            });
        } else if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getThreeCircleProgress callback is null");
        } else {
            qhb.c().c(lsl.r(j), lsl.c(j2), new ResponseCallback() { // from class: bvs
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    HealthModelH5ProService.lambda$getThreeCircleProgress$22(healthModelH5ProCallback, i, i2, (List) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$getThreeCircleProgress$22(HealthModelH5ProCallback healthModelH5ProCallback, int i, int i2, List list) {
        if (njy.e(list)) {
            LogUtil.j(TAG, "getThreeCircleProgress dataList isEmpty!");
            healthModelH5ProCallback.onFailure(-1, "task list is empty!");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HiHealthData hiHealthData = (HiHealthData) it.next();
            if (hiHealthData != null) {
                HashMap map = new HashMap(16);
                putThreeCircleData(hiHealthData, map, i);
                arrayList.add(map);
            }
        }
        String strD = HiJsonUtil.d(arrayList);
        LogUtil.a(TAG, "getThreeCircleProgress json: ", strD);
        healthModelH5ProCallback.onSuccess(strD);
    }

    private static void putThreeCircleData(HiHealthData hiHealthData, Map<String, Object> map, int i) {
        int i2 = hiHealthData.getInt("calorieGoalValue");
        int i3 = hiHealthData.getInt("calorieUserValue");
        int i4 = i3 >= i2 ? 1 : 0;
        int i5 = hiHealthData.getInt("durationGoalValue");
        int i6 = hiHealthData.getInt("durationUserValue");
        if (i6 >= i5) {
            i4++;
        }
        int i7 = hiHealthData.getInt("activeGoalValue");
        int i8 = hiHealthData.getInt("activeUserValue");
        if (i8 >= i7) {
            i4++;
        }
        int i9 = hiHealthData.getInt("stepGoalValue");
        int i10 = hiHealthData.getInt("stepUserValue");
        if (i == 0) {
            map.put("totalTaskNum", 3);
            map.put("completedTaskNum", Integer.valueOf(i4));
            return;
        }
        map.put("day", Long.valueOf(hiHealthData.getDay()));
        map.put("startTime", Long.valueOf(hiHealthData.getStartTime()));
        map.put("calorieGoalValue", Integer.valueOf(i2));
        map.put("calorieUserValue", Integer.valueOf(i3));
        map.put("durationGoalValue", Integer.valueOf(i5));
        map.put("durationUserValue", Integer.valueOf(i6));
        map.put("activeGoalValue", Integer.valueOf(i7));
        map.put("activeUserValue", Integer.valueOf(i8));
        map.put("stepGoalValue", Integer.valueOf(i9));
        map.put("stepUserValue", Integer.valueOf(i10));
    }

    @H5ProMethod(name = "showClover")
    public static void showClover() {
        Context contextB = BaseApplication.b();
        boolean zB = qgr.b(contextB);
        boolean zC = qgr.c(contextB);
        LogUtil.a(TAG, "showClover isStepCard ", Boolean.valueOf(zB), " isThreeLeafCard ", Boolean.valueOf(zC));
        if (zB || zC) {
            return;
        }
        ObserverManagerUtil.e("cloverLife", new Object[0]);
    }

    @H5ProMethod(name = "getTodayTaskStatus")
    public static void getTodayTaskStatus(final HealthModelH5ProCallback<String> healthModelH5ProCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bvd
                @Override // java.lang.Runnable
                public final void run() {
                    HealthModelH5ProService.getTodayTaskStatus(healthModelH5ProCallback);
                }
            });
            return;
        }
        if (healthModelH5ProCallback == null) {
            LogUtil.j(TAG, "getTodayTaskStatus callback is null");
            return;
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        LogUtil.a(TAG, "getTodayTaskStatus -> " + iA);
        if (iA <= 0) {
            healthModelH5ProCallback.onFailure(-1, "");
        } else {
            byu.c().b(iA, new TaskDayDataListener() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.12
                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onDataChange(int i, HealthLifeBean healthLifeBean) {
                }

                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onAllDataChange(int i, List<HealthLifeBean> list) {
                    LogUtil.a(HealthModelH5ProService.TAG, "getTodayTaskStatus: onAllDataChange -> " + i);
                    if (!njy.e(list)) {
                        healthModelH5ProCallback.onSuccess(HiJsonUtil.d(HealthModelH5ProService.getTaskStatus(list)));
                    } else {
                        healthModelH5ProCallback.onFailure(i, "task list is empty");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject getTaskStatus(List<HealthLifeBean> list) {
        Iterator<HealthLifeBean> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getComplete() > 0) {
                i++;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalTaskNum", list.size());
            jSONObject.put("completedTaskNum", i);
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e(TAG, "getTaskStatus: exception -> " + e.getMessage());
            return jSONObject;
        }
    }

    @H5ProMethod(name = "getSwitchState")
    public static void getSwitchState(final String str, final HealthModelH5ProCallback healthModelH5ProCallback) {
        final boolean z;
        String str2;
        final String str3;
        ReleaseLogUtil.d(TAG, "getSwitchState buttonKey:", str);
        if ("healthLifeThreeLeafState".equals(str)) {
            str2 = "900300020";
            str3 = "healthLifeThreeLeafSwitch";
            z = true;
        } else if ("healthLifeWeekReportState".equals(str)) {
            z = !TextUtils.isEmpty(ccy.c("week_report_remind_switch"));
            str2 = "900300021";
            str3 = "healthLifeWeekReportSwitch";
        } else {
            ReleaseLogUtil.e(TAG, "no such keys");
            healthModelH5ProCallback.onFailure(-1, "no such keys");
            return;
        }
        LogUtil.a(TAG, "state is ", Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str2);
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.14
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d(HealthModelH5ProService.TAG, "onResult errorCode: ", Integer.valueOf(i), " buttonKey:", str);
                LogUtil.a(HealthModelH5ProService.TAG, "onResult errorCode: ", Integer.valueOf(i), " buttonKey:", str, " data: ", obj);
                if (njy.b(obj, HiSampleConfig.class)) {
                    List list = (List) obj;
                    if (!njy.e(list)) {
                        HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                        healthModelH5ProCallback.onSuccess(Boolean.valueOf("1".equals(ffv.a(hiSampleConfig.getConfigData(), str3))));
                        LogUtil.a(HealthModelH5ProService.TAG, "key :", str, " value:", hiSampleConfig.getConfigData());
                        return;
                    }
                }
                LogUtil.j(HealthModelH5ProService.TAG, "isListTypeMatch false or list is empty");
                healthModelH5ProCallback.onSuccess(Boolean.valueOf(z));
            }
        });
    }

    @H5ProMethod(name = "updateSwitchState")
    public static void updateSwitchState(String str, boolean z, final HealthModelH5ProCallback healthModelH5ProCallback) {
        String str2;
        String str3;
        ReleaseLogUtil.d(TAG, "updateSwitchState buttonKey:", str);
        if ("healthLifeThreeLeafState".equals(str)) {
            str2 = "900300020";
            str3 = "healthLifeThreeLeafSwitch";
        } else if ("healthLifeWeekReportState".equals(str)) {
            str2 = "900300021";
            str3 = "healthLifeWeekReportSwitch";
        } else {
            ReleaseLogUtil.e(TAG, "no such keys");
            healthModelH5ProCallback.onSuccess(false);
            return;
        }
        qhq.d(MatterDataContans.TYPE_HEALTH, str2, ffv.e(str3, z ? "1" : "0"), new HiDataOperateListener() { // from class: com.huawei.basichealthmodel.HealthModelH5ProService.18
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d(HealthModelH5ProService.TAG, "setSampleConfig errorCode: ", Integer.valueOf(i));
                if (i == 0) {
                    healthModelH5ProCallback.onSuccess(true);
                } else {
                    healthModelH5ProCallback.onSuccess(false);
                }
            }
        }, System.currentTimeMillis());
    }

    @H5ProMethod(name = "getHealthLifeChallenge")
    public static void getHealthLifeChallenge(final HealthModelH5ProCallback healthModelH5ProCallback) {
        ReleaseLogUtil.d(TAG, "getHealthLifeChallenge ");
        if (healthModelH5ProCallback == null) {
            ReleaseLogUtil.e(TAG, "getHealthLifeChallenge callback is null");
        } else {
            ffv.c(TAG, (ResponseCallback<ffd>) new ResponseCallback() { // from class: bvo
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    HealthModelH5ProService.lambda$getHealthLifeChallenge$24(healthModelH5ProCallback, i, (ffd) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$getHealthLifeChallenge$24(HealthModelH5ProCallback healthModelH5ProCallback, int i, ffd ffdVar) {
        ReleaseLogUtil.d(TAG, "getHealthLifeChallenge resultCode ", Integer.valueOf(i), " data is null:", Boolean.valueOf(ffdVar == null));
        if (ffdVar != null) {
            healthModelH5ProCallback.onSuccess(HiJsonUtil.d(ffdVar));
        } else {
            healthModelH5ProCallback.onSuccess("");
        }
    }
}
