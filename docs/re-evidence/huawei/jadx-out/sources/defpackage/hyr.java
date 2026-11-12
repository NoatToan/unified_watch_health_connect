package defpackage;

import androidx.core.util.Consumer;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.callback.UiPagingCallback;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class hyr {
    private int d = -1;

    public void e(final Consumer<Plan> consumer) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hys
            @Override // java.lang.Runnable
            public final void run() {
                this.f37348c.f(consumer);
            }
        });
    }

    public void d(final Consumer<Plan> consumer) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hza
            @Override // java.lang.Runnable
            public final void run() {
                this.f37359a.j(consumer);
            }
        });
    }

    public void b(final Consumer<PlanStatistics> consumer, final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hyv
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(consumer, i);
            }
        });
    }

    public void c(final Consumer<List<PlanInfo>> consumer) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hyu
            @Override // java.lang.Runnable
            public final void run() {
                this.f37351a.a(consumer);
            }
        });
    }

    public void b(final Consumer<List<pdl>> consumer) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hyt
            @Override // java.lang.Runnable
            public final void run() {
                this.f37350b.g(consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void f(Consumer<Plan> consumer) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanModel", "getMyFitnessPlansInfo, getCurrentPlan : planApi is null.");
            return;
        }
        final ArrayList arrayList = new ArrayList(1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        planApi.getCurrentIntPlan(new UiPagingCallback<IntPlan>() { // from class: hyr.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccessFirst(IntPlan intPlan) {
                if (intPlan != null && intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
                    arrayList.add(intPlan.getCompatiblePlan());
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            public void onFailureFirst(int i, String str) {
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_PlanModel", "getIntelligentRunPlan wait timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_PlanModel", "interrupted while waiting for getDietRecordList");
        }
        Plan plan = arrayList.isEmpty() ? null : (Plan) arrayList.get(0);
        if (consumer != null) {
            consumer.accept(plan);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(Consumer<Plan> consumer) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanModel", "getMyFitnessPlansInfo, getCurrentPlan : planApi is null.");
            return;
        }
        final ArrayList arrayList = new ArrayList(1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        planApi.getCurrentIntPlan(new UiPagingCallback<IntPlan>() { // from class: hyr.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccessFirst(IntPlan intPlan) {
                if (intPlan != null && (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN))) {
                    arrayList.add(intPlan.getCompatiblePlan());
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            public void onFailureFirst(int i, String str) {
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_PlanModel", "getIntelligentRunPlan wait timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_PlanModel", "interrupted while waiting for getDietRecordList");
        }
        Plan plan = arrayList.isEmpty() ? null : (Plan) arrayList.get(0);
        if (consumer != null) {
            consumer.accept(plan);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(final Consumer<PlanStatistics> consumer, final int i) {
        if (consumer == null) {
            LogUtil.j("Suggestion_PlanModel", "queryPlanStatistics consumer = null");
        } else {
            hcg.e().a(i, new UiCallback<Map>() { // from class: hyr.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                    LogUtil.j("Suggestion_PlanModel", "queryPlanStatistics errorCode = ", Integer.valueOf(i2));
                    consumer.accept(null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map map) {
                    if (map == null) {
                        LogUtil.j("Suggestion_PlanModel", "queryPlanStatistics Success but value = null");
                        consumer.accept(null);
                        return;
                    }
                    LogUtil.a("Suggestion_PlanModel", "queryPlanStatistics Success");
                    PlanStatistics planStatistics = new PlanStatistics();
                    planStatistics.saveDuration(map.get("duration") == null ? 0L : ((Long) map.get("duration")).longValue());
                    planStatistics.saveCalorie(map.get("calorie") != null ? ((Long) map.get("calorie")).longValue() : 0L);
                    planStatistics.saveTotalPlan(map.get("totalPlan") == null ? 0 : ((Integer) map.get("totalPlan")).intValue());
                    planStatistics.setTotalDistance(map.get(BleConstants.TOTAL_DISTANCE) == null ? 0.0d : ((Double) map.get(BleConstants.TOTAL_DISTANCE)).doubleValue());
                    planStatistics.saveType(i);
                    consumer.accept(planStatistics);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(final Consumer<List<PlanInfo>> consumer) {
        d();
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanModel", "refreshFitnessPlan, getRecommendPlans : planApi is null.");
        } else {
            planApi.setPlanType(3);
            planApi.getRecommedPlans(this.d, new UiCallback<List<PlanInfo>>() { // from class: hyr.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_PlanModel", "onFailure errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<PlanInfo> list) {
                    LogUtil.a("Suggestion_PlanModel", "refreshFitnessPlan mCurrentPlan is onSuccess");
                    if (njy.e(list)) {
                        LogUtil.j("Suggestion_PlanModel", "refreshFitnessPlan data is null");
                        return;
                    }
                    LogUtil.d("Suggestion_PlanModel", "refreshFitnessPlan List<PlanInfo>", Integer.valueOf(list.size()));
                    Consumer consumer2 = consumer;
                    if (consumer2 != null) {
                        consumer2.accept(list);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void g(final Consumer<List<pdl>> consumer) {
        LogUtil.a("Suggestion_PlanModel", "refreshRunPlan getAllPlans enter!");
        final ArrayList arrayList = new ArrayList(10);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanModel", "refreshRunPlan, getCurrentPlan : planApi is null.");
        } else {
            planApi.getAllPlans(0, new UiCallback<pdn>() { // from class: hyr.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_PlanModel", "getAllPlans onFailure");
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(pdn pdnVar) {
                    hyr.this.a(pdnVar, arrayList, consumer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(pdn pdnVar, List<pdl> list, Consumer<List<pdl>> consumer) {
        LogUtil.a("Suggestion_PlanModel", "refreshRunPlan getAllPlans success!");
        list.clear();
        if (pdnVar == null) {
            LogUtil.e("Suggestion_PlanModel", "getAllPlans onSuccess data is null.");
            return;
        }
        if (njy.e(pdnVar.a())) {
            LogUtil.e("Suggestion_PlanModel", "getRunRecommendPlan getAllPlans onSuccess data.list is null.");
            return;
        }
        HashSet<String> hashSet = new HashSet<>();
        for (pcp pcpVar : pdnVar.a()) {
            if (pcpVar != null) {
                hashSet.add(b(pcpVar.d()));
            }
        }
        if (njy.e(hashSet)) {
            LogUtil.j("Suggestion_PlanModel", "PlanRunViewHolder init RunPlanInfo null");
            return;
        }
        d(pdnVar, hashSet, list);
        if (njy.e(list)) {
            LogUtil.j("Suggestion_PlanModel", "refreshFitnessPlan data is null");
        } else if (consumer != null) {
            consumer.accept(list);
        }
    }

    private void d(pdn pdnVar, HashSet<String> hashSet, List<pdl> list) {
        for (String str : hashSet) {
            ArrayList arrayList = new ArrayList(hashSet.size());
            for (pcp pcpVar : pdnVar.a()) {
                if (str == null || pcpVar == null) {
                    LogUtil.e("Suggestion_PlanModel", "getRunRecommendPlan name == null || info == null");
                } else if (str.equals(b(pcpVar.d()))) {
                    arrayList.add(pcpVar);
                }
            }
            pdl pdlVar = new pdl();
            pdlVar.b(str);
            pdlVar.d(arrayList);
            pdlVar.a(arrayList.get(0).d());
            if (!list.contains(pdlVar)) {
                list.add(pdlVar);
            }
        }
    }

    private String b(int i) {
        if (i == 777) {
            return gzx.c(BaseApplication.b(), R.string.IDS_runingplan_planname2_3, new Object[0]);
        }
        if (i == 888) {
            return gzx.c(BaseApplication.b(), R.string.IDS_runingplan_planname2_2, new Object[0]);
        }
        if (i == 999) {
            return gzx.c(BaseApplication.b(), R.string.IDS_runingplan_planname2_1, new Object[0]);
        }
        return "";
    }

    private void d() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.e("Suggestion_PlanModel", "getUserInfo : userProfileMgrApi is null.");
        } else {
            userProfileMgrApi.getUserInfo(new BaseResponseCallback() { // from class: hyz
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f37356c.e(i, (UserInfomation) obj);
                }
            });
        }
    }

    /* synthetic */ void e(int i, UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("Suggestion_PlanModel", "requestDailyData getUserInfo failed");
        } else if (userInfomation.isGenderValid()) {
            this.d = userInfomation.getGender();
        }
    }
}
