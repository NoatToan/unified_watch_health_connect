package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.todo.activity.TodoActivtiesResCallBack;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.nps.api.NpsExternalApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.todo.api.TodoDataApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.OperationUtilsApi;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class czq {
    private static volatile czq d;
    private static final List<Integer> e = Arrays.asList(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile AtomicBoolean f31548a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ikw> f31549b = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IBaseResponseCallback> f31550c = new ArrayList(0);
    private cyx i;

    private czq() {
    }

    public static czq b() {
        if (d == null) {
            synchronized (czq.class) {
                if (d == null) {
                    d = new czq();
                }
            }
        }
        return d;
    }

    public List<ikw> c() {
        ArrayList arrayList;
        synchronized (this.f31549b) {
            LogUtil.a("TodoDataManager", "mTodoCardRecyModels size = ", Integer.valueOf(this.f31549b.size()));
            arrayList = new ArrayList(this.f31549b);
        }
        return arrayList;
    }

    public void d(Activity activity, boolean z) {
        synchronized (this) {
            if (this.i == null && activity != null && czv.c(BaseApplication.getContext())) {
                cyx cyxVar = new cyx(activity);
                this.i = cyxVar;
                cyxVar.a();
            }
            cyx cyxVar2 = this.i;
            if (cyxVar2 != null) {
                cyxVar2.b(z);
            }
        }
    }

    public void d() {
        synchronized (this) {
            if (this.i != null) {
                this.i = null;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(final IBaseResponseCallback iBaseResponseCallback) {
        if (ffv.t()) {
            LogUtil.a("TodoDataManager", "getAllTodoData isSupportHealthLife");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        if (HandlerExecutor.c()) {
            LogUtil.a("TodoDataManager", "getAllTodoData isMainTread");
            ThreadPoolManager.c().execute(new Runnable() { // from class: czo
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(iBaseResponseCallback);
                }
            });
            return;
        }
        if (iBaseResponseCallback != null) {
            synchronized (this.f31550c) {
                if (!this.f31550c.contains(iBaseResponseCallback)) {
                    this.f31550c.add(iBaseResponseCallback);
                }
            }
        }
        if (!this.f31548a.getAndSet(false)) {
            LogUtil.j("TodoDataManager", "getPlanData mIsRequestReached:", this.f31548a);
        } else {
            CommonUtil.u("TodoDataManager-getPlanData enter");
            g();
        }
    }

    private void g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CountDownLatch countDownLatch = new CountDownLatch(4);
        c(copyOnWriteArrayList, countDownLatch);
        b(copyOnWriteArrayList, countDownLatch);
        d(copyOnWriteArrayList, countDownLatch);
        a(copyOnWriteArrayList, countDownLatch);
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("TodoDataManager", "getPlanData InterruptedException");
        }
        ikw ikwVarI = i();
        if (ikwVarI != null) {
            copyOnWriteArrayList.add(ikwVarI);
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
        Collections.sort(arrayList, new czx(false));
        LogUtil.a("TodoDataManager", "copyList size = ", Integer.valueOf(arrayList.size()));
        List<ikw> listB = b(new ArrayList<>(arrayList));
        SharedPreferenceManager.d(String.valueOf(10026), "today_todo_count", njy.b(listB) ? listB.size() : 0);
        synchronized (this.f31549b) {
            this.f31549b.clear();
            this.f31549b.addAll(arrayList);
        }
        synchronized (this.f31550c) {
            Iterator<IBaseResponseCallback> it = this.f31550c.iterator();
            while (it.hasNext()) {
                it.next().a(0, new ArrayList(arrayList));
            }
            this.f31550c.clear();
        }
        this.f31548a.getAndSet(true);
    }

    private void b(List<ikw> list, CountDownLatch countDownLatch) {
        CommonUtil.u("TodoDataManagergetFitnessPlanData enter");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("TodoDataManager", "getCurrentFitnessPlan, getCurrentPlan : planApi is null.");
            countDownLatch.countDown();
            return;
        }
        IntPlan currentAllPlan = planApi.getCurrentAllPlan();
        LogUtil.a("TodoDataManager", "getCurrentFitnessPlan intPlan is ", Boolean.valueOf(currentAllPlan == null));
        CommonUtil.u("TodoDataManager-getCurrentFitnessPlan end");
        ikw ikwVarA = a(currentAllPlan);
        if (ikwVarA != null) {
            list.add(ikwVarA);
        }
        countDownLatch.countDown();
    }

    private void d(final List<ikw> list, final CountDownLatch countDownLatch) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class);
        if (Utils.o() && !operationUtilsApi.isOperation(accountInfo)) {
            LogUtil.a("TodoDataManager", "Utils.isOversea() no activity data");
            countDownLatch.countDown();
        } else {
            czj.a().a(0, false, new TodoActivtiesResCallBack() { // from class: czw
                @Override // com.huawei.featureuserprofile.todo.activity.TodoActivtiesResCallBack
                public final void onFinished(Object obj) {
                    this.f31559c.c(list, countDownLatch, (List) obj);
                }
            });
        }
    }

    /* synthetic */ void c(List list, CountDownLatch countDownLatch, List list2) {
        list.addAll(d((List<dlp>) list2));
        countDownLatch.countDown();
    }

    private void c(List<ikw> list, CountDownLatch countDownLatch) {
        boolean zN = ffv.n();
        ReleaseLogUtil.c("R_TodoDataManager", "getHealthLifeTask isJoinHealthModel ", Boolean.valueOf(zN));
        if (!zN) {
            a(e, list, countDownLatch);
        } else {
            e(list, countDownLatch, h());
        }
    }

    private ikw a(IntPlan intPlan) {
        boolean z;
        LogUtil.a("TodoDataManager", "handlerFitnessPlanData");
        if (intPlan == null) {
            LogUtil.j("TodoDataManager", "handlerFitnessPlanData, intPlan is null.");
            return null;
        }
        if (!Utils.j() && intPlan.getPlanType() == IntPlan.PlanType.FIT_PLAN) {
            LogUtil.a("TodoDataManager", "not in chinese or isOversea, filter fitness plan");
            return null;
        }
        IntDayPlan dayInfo = intPlan.getDayInfo(btw.h(intPlan), lsl.o(System.currentTimeMillis()));
        if (dayInfo != null) {
            List<IntAction> listD = d(dayInfo);
            if (!njy.e(listD)) {
                if (intPlan.getPlanType() != IntPlan.PlanType.FIT_PLAN && intPlan.getPlanType() != IntPlan.PlanType.AI_FITNESS_PLAN) {
                    z = true;
                    break;
                }
                Iterator<IntAction> it = listD.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    if (it.next().getPunchFlag() == 0) {
                        z = false;
                        break;
                    }
                }
                return c(intPlan, (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN && dayInfo.getPunchFlag() == 0) ? false : z);
            }
        }
        return null;
    }

    private List<IntAction> d(IntDayPlan intDayPlan) {
        ArrayList arrayList = new ArrayList(10);
        if (intDayPlan != null) {
            for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
                IntAction inPlanAction = intDayPlan.getInPlanAction(i);
                if (inPlanAction != null && inPlanAction.getActionId() != null && (inPlanAction.getActionType() == IntAction.ActionType.RUN || inPlanAction.getActionType() == IntAction.ActionType.WORKOUT)) {
                    arrayList.add(inPlanAction);
                }
            }
        }
        return arrayList;
    }

    private ikw c(IntPlan intPlan, boolean z) {
        ikw ikwVar = new ikw();
        ikwVar.c(intPlan);
        ikwVar.e(intPlan.getMetaInfo().getDescription());
        ikwVar.a(intPlan.getMetaInfo().getName());
        ikwVar.d(intPlan.getMetaInfo().getPlanStatus());
        ikwVar.b(intPlan.getPlanTimeInfo().getCreateTime());
        ikwVar.b(HealthData.BLOODPRESURE);
        ikwVar.c(R.drawable.ic_todo_plan);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("planType", intPlan.getPlanType().getType());
            ikwVar.b(jSONObject.toString());
        } catch (JSONException e2) {
            LogUtil.e("TodoDataManager", ExceptionUtils.c(e2));
        }
        if (z) {
            ikwVar.d(1);
        } else {
            ikwVar.d(0);
        }
        return ikwVar;
    }

    private List<ikw> d(List<dlp> list) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.a("TodoDataManager", "mActivityList is null");
            return arrayList;
        }
        for (dlp dlpVar : list) {
            if (dlpVar != null) {
                arrayList.add(c(dlpVar));
            }
        }
        return arrayList;
    }

    private void e(List<ikw> list, CountDownLatch countDownLatch, List<HealthLifeTaskBean> list2) {
        if (njy.e(list2)) {
            ReleaseLogUtil.d("TodoDataManager", "handleHealthLifeTaskData todoTaskList ", list2);
            a(e, list, countDownLatch);
            return;
        }
        ReleaseLogUtil.c("TodoDataManager", "handleHealthLifeTaskData size ", Integer.valueOf(list2.size()));
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(e);
        for (HealthLifeTaskBean healthLifeTaskBean : list2) {
            if (healthLifeTaskBean != null) {
                arrayList.add(c(healthLifeTaskBean));
                if (arrayList2.contains(Integer.valueOf(healthLifeTaskBean.getId()))) {
                    arrayList2.remove(Integer.valueOf(healthLifeTaskBean.getId()));
                }
            }
        }
        list.addAll(arrayList);
        a(arrayList2, list, countDownLatch);
    }

    private ikw i() {
        NpsExternalApi npsExternalApi = (NpsExternalApi) Services.b("Main", NpsExternalApi.class);
        if (npsExternalApi.isShowNps()) {
            LogUtil.a("TodoDataManager", "showHealthNps");
            ikw ikwVar = new ikw();
            ikwVar.a(BaseApplication.getContext().getResources().getString(R.string.nps_user_survey_title));
            ikwVar.b(2048);
            return ikwVar;
        }
        if (npsExternalApi.isShowDeviceNps()) {
            LogUtil.a("TodoDataManager", "ShowDeviceNps");
            ikw ikwVar2 = new ikw();
            if (npsExternalApi.isWeightDeviceNps()) {
                ikwVar2.a(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_todocard_weight_nps));
            } else {
                ikwVar2.a(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_todocard_wear_nps));
            }
            ikwVar2.b(2304);
            return ikwVar2;
        }
        LogUtil.a("TodoDataManager", "no nps data");
        return null;
    }

    private ikw c(dlp dlpVar) {
        ikw ikwVar = new ikw();
        ikwVar.e(dlpVar.c());
        if (TextUtils.isEmpty(dlpVar.a())) {
            ikwVar.a(dlpVar.c());
        } else {
            ikwVar.a(dlpVar.a());
        }
        ikwVar.b(HealthData.WEIGHT);
        ikwVar.d(dlpVar.m());
        ikwVar.c(R.drawable.ic_todo_activity);
        try {
            ikwVar.b(DateFormatUtil.b(dlpVar.o(), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT, lsl.d()).getTime());
        } catch (ParseException e2) {
            LogUtil.e("TodoDataManager", "parse error:" + e2.getMessage());
        }
        ikwVar.c(dlpVar);
        return ikwVar;
    }

    private ikw c(HealthLifeTaskBean healthLifeTaskBean) {
        ikw ikwVar = new ikw();
        ikwVar.b(256);
        ikwVar.c(healthLifeTaskBean);
        ikwVar.a(healthLifeTaskBean.getName());
        ikwVar.d(healthLifeTaskBean.getComplete() > 0 ? 1 : 0);
        return ikwVar;
    }

    public List<ikw> b(List<ikw> list) {
        if (njy.e(list)) {
            LogUtil.j("TodoDataManager", "todoModels is empty.");
            return list;
        }
        Iterator<ikw> it = list.iterator();
        while (it.hasNext()) {
            ikw next = it.next();
            if (next == null || next.l() == 256 || next.l() == 512 || next.j() == 1) {
                it.remove();
            }
        }
        return list;
    }

    public List<ikw> e() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.addAll(j());
        arrayList.addAll(a());
        ikw ikwVarI = i();
        if (ikwVarI != null) {
            arrayList.add(ikwVarI);
        }
        Collections.sort(arrayList, new czx(false));
        return arrayList;
    }

    private List<ikw> a() {
        final ArrayList arrayList = new ArrayList(10);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class);
        if (Utils.o() && !operationUtilsApi.isOperation(accountInfo)) {
            return arrayList;
        }
        czj.a().d(0, new TodoActivtiesResCallBack() { // from class: czr
            @Override // com.huawei.featureuserprofile.todo.activity.TodoActivtiesResCallBack
            public final void onFinished(Object obj) {
                this.f31554c.e(arrayList, (List) obj);
            }
        });
        return arrayList;
    }

    /* synthetic */ void e(List list, List list2) {
        if (njy.e(list2)) {
            LogUtil.a("TodoDataManager", "mActivityList is null");
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            dlp dlpVar = (dlp) it.next();
            if (dlpVar != null) {
                list.add(c(dlpVar));
            }
        }
    }

    private List<HealthLifeTaskBean> h() {
        List<HealthLifeTaskBean> listB = ffv.b();
        if (njy.e(listB)) {
            ReleaseLogUtil.d("R_TodoDataManager", "getHealthLifeDayRecordCache listCache ", listB);
            return Collections.EMPTY_LIST;
        }
        HealthLifeTaskBean healthLifeTaskBean = listB.get(0);
        int recordDay = healthLifeTaskBean != null ? healthLifeTaskBean.getRecordDay() : 0;
        ReleaseLogUtil.c("R_TodoDataManager", "getHealthLifeDayRecordCache recordDay ", Integer.valueOf(recordDay), " size ", Integer.valueOf(listB.size()));
        return recordDay == DateFormatUtil.a(System.currentTimeMillis()) ? listB : Collections.EMPTY_LIST;
    }

    private List<ikw> j() {
        List<HealthLifeTaskBean> listH = h();
        if (njy.e(listH)) {
            ReleaseLogUtil.d("R_TodoDataManager", "getHealthLifeCache todoTaskList ", listH);
            return Collections.EMPTY_LIST;
        }
        ReleaseLogUtil.c("R_TodoDataManager", "getHealthLifeCache size ", Integer.valueOf(listH.size()));
        ArrayList arrayList = new ArrayList(10);
        for (HealthLifeTaskBean healthLifeTaskBean : listH) {
            if (healthLifeTaskBean != null) {
                ikw ikwVar = new ikw();
                ikwVar.b(256);
                ikwVar.c(healthLifeTaskBean);
                ikwVar.a(healthLifeTaskBean.getName());
                ikwVar.d(healthLifeTaskBean.getComplete() > 0 ? 1 : 0);
                arrayList.add(ikwVar);
            }
        }
        return arrayList;
    }

    private void a(final List<Integer> list, final List<ikw> list2, final CountDownLatch countDownLatch) {
        ReleaseLogUtil.c("R_TodoDataManager", "queryMeasureTask planIdList ", list);
        if (njy.e(list)) {
            countDownLatch.countDown();
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: czu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31556a.c(list2, list, countDownLatch);
                }
            });
        }
    }

    /* synthetic */ void c(List list, List list2, CountDownLatch countDownLatch) {
        list.addAll(a(ffv.c((List<Integer>) list2)));
        countDownLatch.countDown();
    }

    private List<ikw> a(List<HealthLifeTaskBean> list) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_TodoDataManager", "handleMeasureTaskData todoTaskList ", list);
            return arrayList;
        }
        ReleaseLogUtil.c("R_TodoDataManager", "handleMeasureTaskData size ", Integer.valueOf(list.size()));
        for (HealthLifeTaskBean healthLifeTaskBean : list) {
            if (healthLifeTaskBean != null && healthLifeTaskBean.getComplete() == 0) {
                arrayList.add(b(healthLifeTaskBean));
            }
        }
        return arrayList;
    }

    private ikw b(HealthLifeTaskBean healthLifeTaskBean) {
        ikw ikwVar = new ikw();
        ikwVar.b(512);
        ikwVar.c(healthLifeTaskBean);
        ikwVar.e(healthLifeTaskBean.getName());
        ikwVar.a(healthLifeTaskBean.getName());
        ikwVar.d(healthLifeTaskBean.getComplete() > 0 ? 1 : 0);
        return ikwVar;
    }

    private void a(final List<ikw> list, final CountDownLatch countDownLatch) {
        if (!irz.h()) {
            LogUtil.j("TodoDataManager", "is calBalance todo task Operated false ");
            countDownLatch.countDown();
        } else {
            ((TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class)).getTodoListFromCloud(String.valueOf(HealthData.TIMELINE), new IBaseResponseCallback() { // from class: czs
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.c(list, countDownLatch, i, obj);
                }
            });
        }
    }

    /* synthetic */ void c(List list, CountDownLatch countDownLatch, int i, Object obj) {
        if (obj instanceof List) {
            b(list, countDownLatch, (List) obj);
        } else {
            countDownLatch.countDown();
        }
    }

    private void b(List<ikw> list, CountDownLatch countDownLatch, List<ikw> list2) {
        if (njy.e(list2)) {
            countDownLatch.countDown();
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size());
        boolean z = true;
        for (ikw ikwVar : list2) {
            if (!c(ikwVar)) {
                LogUtil.j("TodoDataManager", "not support todo task  = ", ikwVar.o());
            } else {
                arrayList.add(ikwVar);
                if (ikwVar.j() == 0) {
                    z = false;
                }
            }
        }
        LogUtil.a("TodoDataManager", "processCalBalanceTasks isAllTaskFinished = ", Boolean.valueOf(z));
        if (z) {
            list.addAll(arrayList);
            countDownLatch.countDown();
        } else {
            a(list, countDownLatch, arrayList);
        }
    }

    private boolean c(ikw ikwVar) {
        Context context = BaseApplication.getContext();
        int iN = CommonUtil.n(context, czv.a(BleConstants.SPORT_TYPE, ikwVar.k()));
        if (!iku.e.containsKey(Integer.valueOf(iN))) {
            return false;
        }
        ikwVar.a(context.getString(R.string.IDS_hw_todo_cal_balance_title, context.getString(iku.e.get(Integer.valueOf(iN)).intValue())));
        return true;
    }

    private void a(final List<ikw> list, final CountDownLatch countDownLatch, final List<ikw> list2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long jA = DateFormatUtil.a(System.currentTimeMillis());
        hiDataReadOption.setTimeInterval(String.valueOf(jA), String.valueOf(jA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(new int[]{257, 258, 259});
        hiDataReadOption.setSortOrder(0);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: czq.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("TodoDataManager", "checkCalBalanceTaskStatus no sports");
                    list.addAll(list2);
                    countDownLatch.countDown();
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
                    LogUtil.j("TodoDataManager", "checkCalBalanceTaskStatus onResult obj not instanceof List");
                    list.addAll(list2);
                    countDownLatch.countDown();
                    return;
                }
                List list3 = (List) sparseArray.get(i);
                if (njy.e(list3)) {
                    LogUtil.j("TodoDataManager", "checkCalBalanceTaskStatus sport list is null");
                    list.addAll(list2);
                    countDownLatch.countDown();
                } else {
                    LogUtil.a("TodoDataManager", "todoLists list size = ", Integer.valueOf(list3.size()));
                    czq.this.a((List<HiHealthData>) list3, (List<ikw>) list2);
                    list.addAll(list2);
                    countDownLatch.countDown();
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("TodoDataManager", "checkCalBalanceTaskStatus get sport list onResultIntent");
                list.addAll(list2);
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, List<ikw> list2) {
        for (ikw ikwVar : list2) {
            if (njy.e(list)) {
                return;
            }
            if (ikwVar.j() != 1) {
                String strA = ikwVar.a();
                list.removeAll(b(list, ikwVar));
                String strA2 = ikwVar.a();
                if (!TextUtils.isEmpty(strA) && !strA.equals(strA2)) {
                    ((TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class)).updateTodoInfo(ikwVar, new IBaseResponseCallback() { // from class: czp
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public final void a(int i, Object obj) {
                            LogUtil.a("TodoDataManager", "updateTodoInfo resultCode = ", Integer.valueOf(i));
                        }
                    });
                }
            }
        }
    }

    private List<HiHealthData> b(List<HiHealthData> list, ikw ikwVar) {
        ArrayList arrayList = new ArrayList(10);
        long jG = ikwVar.g();
        int iN = CommonUtil.n(BaseApplication.getContext(), ikwVar.h()) * 1000;
        int iN2 = CommonUtil.n(BaseApplication.getContext(), czv.a(BleConstants.SPORT_TYPE, ikwVar.k()));
        int i = 0;
        for (HiHealthData hiHealthData : list) {
            HiTrackMetaData hiTrackMetaDataC = c(JsonSanitizer.sanitize(hiHealthData.getMetaData()));
            if (hiTrackMetaDataC != null) {
                long startTime = hiHealthData.getStartTime();
                int sportType = hiTrackMetaDataC.getSportType();
                int totalCalories = hiTrackMetaDataC.getTotalCalories();
                if (startTime >= jG && iN2 == sportType) {
                    i += totalCalories;
                    arrayList.add(hiHealthData);
                    if (i >= iN) {
                        ikwVar.d(1);
                        i = iN;
                        break;
                    }
                }
            }
        }
        ikwVar.d(String.valueOf(i / 1000));
        e(ikwVar, (iN - i) * 1000);
        return arrayList;
    }

    private HiTrackMetaData c(String str) {
        try {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(str, HiTrackMetaData.class);
            int abnormalTrack = hiTrackMetaData.getAbnormalTrack();
            int duplicated = hiTrackMetaData.getDuplicated();
            int sportDataSource = hiTrackMetaData.getSportDataSource();
            if (abnormalTrack == 0 && duplicated == 0 && sportDataSource != 2) {
                return hiTrackMetaData;
            }
            LogUtil.j("TodoDataManager", "getHiTrackMetaData trackDataIsInvalid!");
            return null;
        } catch (JsonSyntaxException unused) {
            LogUtil.e("TodoDataManager", "trackMetaData is error");
            return null;
        }
    }

    private void e(ikw ikwVar, int i) {
        String strC = ikwVar.c();
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("TodoDataManager", "getNewUrlForCalBalanceTask old linkUrl is empty");
            return;
        }
        StringBuilder sb = new StringBuilder("huaweischeme://healthapp/track?");
        Map<String, String> mapA = AppRouterUtils.a(Uri.parse(strC));
        if (!mapA.containsKey(WorkoutRecord.Extend.COURSE_TARGET_VALUE)) {
            LogUtil.j("TodoDataManager", "getNewUrlForCalBalanceTask no targetValue");
            return;
        }
        if (CommonUtil.n(BaseApplication.getContext(), mapA.get(WorkoutRecord.Extend.COURSE_TARGET_VALUE)) == i) {
            LogUtil.j("TodoDataManager", "getNewUrlForCalBalanceTask targetValue not change");
            return;
        }
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            if (WorkoutRecord.Extend.COURSE_TARGET_VALUE.equals(entry.getKey())) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(i);
                sb.append("&");
            } else {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        LogUtil.a("TodoDataManager", "getNewUrlForCalBalanceTask newTargetValue = ", Integer.valueOf(i));
        LogUtil.d("TodoDataManager", "getNewUrlForCalBalanceTask newLink = ", sb.toString());
        ikwVar.c(sb.toString().substring(0, sb.length() - 1));
    }
}
