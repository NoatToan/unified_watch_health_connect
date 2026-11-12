package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.bean.ChallengeConfigBean;
import com.huawei.basichealthmodel.bean.ConfigBean;
import com.huawei.basichealthmodel.bean.TaskConfigBean;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class byu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile byu f1329c;
    private static final Object e = new Object();
    private ArrayList<Integer> d;
    private ConfigBean f;
    private boolean g;
    private boolean i;
    private byn j;
    private int o;
    private SparseArray<HealthLifeBean> h = new SparseArray<>();
    private SparseArray<TaskConfigBean> m = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SparseArray<ChallengeConfigBean> f1331b = null;
    private final SparseArray<HealthLifeBean> l = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<bxw> f1330a = new SparseArray<>();

    private byu() {
        g();
    }

    public static byu c() {
        if (f1329c == null) {
            synchronized (e) {
                if (f1329c == null) {
                    f1329c = new byu();
                }
            }
        }
        return f1329c;
    }

    private static void d(HealthLifeBean healthLifeBean) {
        healthLifeBean.setComplete(4);
        healthLifeBean.setSyncStatus(0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
        healthLifeBean.setTimestamp(jCurrentTimeMillis);
        cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
    }

    private void g() {
        ConfigBean configBeanD;
        this.o = DateFormatUtil.a(lsl.c(System.currentTimeMillis(), -60));
        this.i = Utils.o();
        this.g = Utils.h();
        LogUtil.a("HL_TaskManager", "initTask mIsOversea= ", Boolean.valueOf(this.i));
        if (this.j == null) {
            this.j = new byn();
        }
        if (this.f == null) {
            this.f = this.j.a(this.i, this.g);
        }
        if (this.f != null && (configBeanD = this.j.d(this.i)) != null) {
            this.f.setChallengeList(configBeanD.getChallengeList());
            this.f.setChallengeMotivationImage(configBeanD.getChallengeMotivationImage());
        }
        this.m = byn.c(this.f);
        this.f1331b = byn.b(this.f);
        j();
    }

    private void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: byy
            @Override // java.lang.Runnable
            public final void run() {
                this.e.f();
            }
        });
    }

    /* synthetic */ void f() {
        e(c(cbg.q(), DateFormatUtil.a(System.currentTimeMillis()), Utils.l()));
    }

    private void a(HealthLifeBean healthLifeBean) {
        boolean z = false;
        if (healthLifeBean == null) {
            cbg.b(false);
            return;
        }
        cbg.m(healthLifeBean.getDataSource());
        String target = healthLifeBean.getTarget();
        if (TextUtils.isEmpty(target)) {
            cbg.b(false);
            return;
        }
        for (String str : target.split(",")) {
            if (String.valueOf(12).equals(str)) {
                z = true;
                break;
            }
        }
        cbg.b(z);
        LogUtil.a("HL_TaskManager", "setIsSubscribeBloodPressure cloverBean ", healthLifeBean, " target ", target, " isSubscribeBloodPressure ", Boolean.valueOf(z));
    }

    public void c(boolean z) {
        cbg.b(z);
    }

    public ArrayList<Integer> a() {
        if (njy.e(this.d)) {
            LogUtil.j("HL_TaskManager", "getBasicTaskIdList default basicIdList");
            this.d = cbg.c();
        }
        return this.d;
    }

    private void e(int i, SparseArray<HealthLifeBean> sparseArray) {
        if (sparseArray == null) {
            LogUtil.j("HL_TaskManager", "getBasicTaskIdFormCloud default basicIdList");
            this.d = cbg.c();
            return;
        }
        HealthLifeBean healthLifeBean = sparseArray.get(1);
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        if (healthLifeBean != null) {
            if (iA == i) {
                a(healthLifeBean);
            }
            iA = healthLifeBean.getRecordDay();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(i2);
            if (healthLifeBeanValueAt != null && healthLifeBeanValueAt.getTaskType() == 1 && healthLifeBeanValueAt.getRecordDay() == iA) {
                arrayList.add(Integer.valueOf(healthLifeBeanValueAt.getId()));
            }
        }
        cbg.c(this.o <= iA, "HL_TaskManager", "upDateBasicTaskIdList basicIdList ", arrayList.toString());
        if (arrayList.size() >= 3) {
            this.d = arrayList;
        } else {
            this.d = cbg.c();
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final int i, final TaskDayDataListener taskDayDataListener) {
        int iIndexOfKey;
        if (taskDayDataListener == null) {
            LogUtil.j("HL_TaskManager", "getTaskList listener is null recordDay ", Integer.valueOf(i));
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bza
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(i, taskDayDataListener);
                }
            });
            return;
        }
        String strQ = cbg.q();
        int iA = a(i);
        SparseArray<HealthLifeBean> sparseArrayE = cgc.e(d(iA, c(strQ, iA, false), strQ));
        sparseArrayE.remove(1);
        int size = sparseArrayE.size();
        LogUtil.a("HL_TaskManager", "getTaskList recordDay ", Integer.valueOf(iA), " size ", Integer.valueOf(size));
        if (size <= 0) {
            taskDayDataListener.onAllDataChange(-1, new ArrayList());
            return;
        }
        byx byxVar = new byx(size, iA, new TaskDayDataListener() { // from class: byu.1
            @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
            public void onDataChange(int i2, HealthLifeBean healthLifeBean) {
            }

            @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
            public void onAllDataChange(int i2, List<HealthLifeBean> list) {
                cgc.e(list);
                byu.this.h = cfu.a(list);
                cgc.c(list);
                taskDayDataListener.onAllDataChange(i2, list);
            }
        });
        int size2 = this.f1330a.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArrayE.keyAt(i2);
            bxw bxwVarE = (size2 <= 0 || (iIndexOfKey = this.f1330a.indexOfKey(iKeyAt)) < 0 || iIndexOfKey >= size2) ? null : this.f1330a.get(iKeyAt);
            if (bxwVarE == null) {
                bxwVarE = e(iKeyAt);
            }
            if (bxwVarE == null) {
                LogUtil.j("HL_TaskManager", "getTaskList manager is null taskId ", Integer.valueOf(iKeyAt));
            } else {
                bxwVarE.d(sparseArrayE.get(iKeyAt), byxVar);
            }
        }
    }

    public int a(int i) {
        int iR = cbg.r();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = lsl.a(jCurrentTimeMillis, 2, 30);
        boolean zAf = cbg.af();
        boolean zC = cfu.c();
        cbg.c(this.o <= i, "HL_TaskManager", "getRecordDay recordDay ", Integer.valueOf(i), " isSubscribeBloodPressure ", Boolean.valueOf(zAf), " isSubscriptionSleep ", Boolean.valueOf(zC));
        if (i <= iR) {
            return i;
        }
        if (!zAf && !zC) {
            return i;
        }
        if (!zAf) {
            return cfu.c(i);
        }
        if (jCurrentTimeMillis >= jA) {
            return i;
        }
        long jI = CommonUtil.i(ccy.c("bloodPressureMeasurePlanSaveTime"));
        if (DateFormatUtil.a(jI) == i && jI < jA) {
            LogUtil.a("HL_TaskManager", "getRecordDay time ", Long.valueOf(jI), " recordDay ", Integer.valueOf(i));
            return zC ? cfu.c(i) : i;
        }
        List<dfl> listA = cbg.a(ccy.c("bloodPressureMeasurePlan"));
        if (njy.e(listA)) {
            return zC ? cfu.c(i) : i;
        }
        return a(zC, listA, i);
    }

    private int a(boolean z, List<dfl> list, int i) {
        dfl dflVar = null;
        dfl dflVar2 = null;
        for (dfl dflVar3 : list) {
            if (dflVar3 != null) {
                int iD = dflVar3.d();
                if (iD == 0) {
                    dflVar = dflVar3;
                } else if (iD != 9) {
                    LogUtil.d("HL_TaskManager", "getRecordDay alarmId ", Integer.valueOf(iD));
                } else {
                    dflVar2 = dflVar3;
                }
            }
        }
        if (dflVar != null && dflVar2 != null) {
            if (dflVar.c() > dflVar2.c()) {
                return DateFormatUtil.a(lsl.u(DateFormatUtil.d(i)));
            }
            if (z) {
                return cfu.c(i);
            }
        } else if (z) {
            return cfu.c(i);
        }
        return i;
    }

    private SparseArray<HealthLifeBean> d(int i, SparseArray<HealthLifeBean> sparseArray, String str) {
        List<HealthLifeBean> listE = e(i, cfu.a(i, i, str).get(i), sparseArray);
        LogUtil.a("HL_TaskManager", "initHealthTaskBean healthTaskRecordDbBeans ", listE.toString());
        return d(listE);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(final int i) {
        SparseArray<HealthLifeBean> sparseArrayD;
        HealthLifeBean healthLifeBean;
        String strE;
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bzc
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(i);
                }
            });
            return;
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        int iA2 = a(iA);
        if (iA != iA2) {
            ReleaseLogUtil.c("HL_TaskManager", "refreshTask currentDay ", Integer.valueOf(iA), " recordDay ", Integer.valueOf(iA2));
            return;
        }
        SparseArray<HealthLifeBean> sparseArray = this.h;
        int i2 = 1;
        if (sparseArray != null && sparseArray.get(1) != null && iA2 == this.h.get(1).getRecordDay()) {
            LogUtil.a("HL_TaskManager", "refreshTask mHealthTaskBeanList");
            sparseArrayD = this.h;
        } else {
            String strQ = cbg.q();
            sparseArrayD = d(iA2, c(strQ, iA2, false), strQ);
        }
        LogUtil.a("HL_TaskManager", "refreshTask recordDay ", Integer.valueOf(iA2), " sparseArray ", sparseArrayD);
        if (sparseArrayD == null || (healthLifeBean = sparseArrayD.get(i)) == null) {
            return;
        }
        if (i == 5) {
            strE = String.valueOf(CommonUtils.j(healthLifeBean.getResult()) + 1);
        } else {
            strE = cbg.e(healthLifeBean);
            i2 = 2;
        }
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HL_TaskManager", "refreshTask result ", strE);
        } else {
            e(i2, strE, healthLifeBean, new TaskDayDataListener() { // from class: byu.4
                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onAllDataChange(int i3, List<HealthLifeBean> list) {
                }

                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onDataChange(int i3, HealthLifeBean healthLifeBean2) {
                    LogUtil.a("HL_TaskManager", "refreshTask result", Integer.valueOf(i3), " healthTaskBean ", healthLifeBean2);
                    if (healthLifeBean2 == null || byu.this.h == null) {
                        return;
                    }
                    byu.this.h.append(healthLifeBean2.getId(), healthLifeBean2);
                }
            });
        }
    }

    public void e(int i, String str, HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        LogUtil.a("HL_TaskManager", "refreshTaskById enter");
        if (healthLifeBean == null || taskDayDataListener == null) {
            if (taskDayDataListener != null) {
                taskDayDataListener.onDataChange(-1, null);
            }
            LogUtil.j("HL_TaskManager", "triggerHealthTaskManager healthTaskBean or taskSubscriptionListener is null");
        } else {
            if (i == 1 || i == 2) {
                bxw bxwVar = this.f1330a.get(healthLifeBean.getId());
                if (bxwVar == null) {
                    bxwVar = new bxw();
                }
                bxwVar.a(i, str, healthLifeBean, new TaskDayDataListener() { // from class: byu.2
                    @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                    public void onAllDataChange(int i2, List<HealthLifeBean> list) {
                    }

                    @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                    public void onDataChange(int i2, HealthLifeBean healthLifeBean2) {
                        if (i2 == 0 && byu.this.h != null && healthLifeBean2 != null) {
                            byu.this.h.append(healthLifeBean2.getId(), healthLifeBean2);
                        }
                        taskDayDataListener.onDataChange(i2, healthLifeBean2);
                        bxp.b().h();
                        if (healthLifeBean2 != null) {
                            int recordDay = healthLifeBean2.getRecordDay();
                            bys.c().b(cbg.q(), recordDay, recordDay, 4);
                        }
                    }
                });
                return;
            }
            b(i, str, healthLifeBean, taskDayDataListener);
        }
    }

    public void b(final boolean z, final String str, final ResponseCallback<Object> responseCallback) {
        int i;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_TaskManager", "rewardTaskIds ids is empty ");
            if (responseCallback != null) {
                responseCallback.onResponse(-1, "");
                return;
            }
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: bze
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1350b.e(z, str, responseCallback);
                }
            });
            return;
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        String strQ = cbg.q();
        List<HealthLifeBean> listC = c(str.split(","), iA, strQ);
        if (z) {
            Iterator<HealthLifeBean> it = listC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 1;
                    break;
                }
                HealthLifeBean next = it.next();
                if (next != null && next.getComplete() == 4) {
                    i = 4;
                    break;
                }
            }
            listC.add(cfu.a(str, iA, i, 1, strQ));
            listC.add(cfu.a(str, iA, 1, 100001, strQ));
        }
        LogUtil.d("HL_TaskManager", "rewardTaskIds beanList ", listC.toString());
        long jA = bxc.a(listC, strQ);
        LogUtil.a("HL_TaskManager", "rewardTaskIds insertTaskList codeInsert ", Long.valueOf(jA), " codeDelete ", Long.valueOf((!z || jA < 0) ? -1L : cfu.a(strQ, iA, str)));
        bys.c().b(strQ, iA, iA, 4);
        if (responseCallback != null) {
            responseCallback.onResponse(0, "");
        }
    }

    /* synthetic */ void e(boolean z, String str, ResponseCallback responseCallback) {
        b(z, str, (ResponseCallback<Object>) responseCallback);
    }

    private List<HealthLifeBean> c(String[] strArr, int i, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            int iJ = CommonUtil.j(str2);
            if (iJ > 0) {
                HealthLifeBean healthLifeBeanC = bxc.c(iJ, i, str);
                if (cbg.h(healthLifeBeanC)) {
                    if (healthLifeBeanC.getComplete() < 1) {
                        LogUtil.d("HL_TaskManager", "healthTaskRecordDbBean id ", Integer.valueOf(healthLifeBeanC.getId()));
                        d(healthLifeBeanC);
                        arrayList.add(healthLifeBeanC);
                    }
                } else {
                    HealthLifeBean healthLifeBean = new HealthLifeBean();
                    healthLifeBean.setId(iJ);
                    healthLifeBean.setRecordDay(i);
                    healthLifeBean.setResult("");
                    d(healthLifeBean);
                    SparseArray<TaskConfigBean> sparseArrayB = b();
                    if (sparseArrayB == null || sparseArrayB.get(iJ) == null) {
                        LogUtil.j("HL_TaskManager", "rewardTaskIds mTaskConfigList or healthTaskConfig is null");
                        arrayList.add(healthLifeBean);
                    } else {
                        TaskConfigBean taskConfigBean = sparseArrayB.get(iJ);
                        healthLifeBean.setType(taskConfigBean.getType());
                        if (iJ == 11 || iJ == 12) {
                            healthLifeBean.setTarget(String.valueOf(0));
                        } else {
                            healthLifeBean.setTarget(taskConfigBean.getDefaultGoal());
                        }
                        arrayList.add(healthLifeBean);
                    }
                }
            }
        }
        return arrayList;
    }

    private void b(int i, String str, final HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        int complete = healthLifeBean.getComplete();
        if (i == 3) {
            if (complete <= 0) {
                complete = 2;
            }
            healthLifeBean.setRest(1);
        } else {
            if (i != 4) {
                return;
            }
            if (complete <= 0) {
                complete = 3;
            }
            healthLifeBean.setResult(str);
        }
        if (healthLifeBean.getComplete() <= 0) {
            cbk.c(healthLifeBean.getId(), complete);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        healthLifeBean.setComplete(complete);
        healthLifeBean.setSyncStatus(0);
        healthLifeBean.setTimestamp(jCurrentTimeMillis);
        healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
        cbg.c(ThreadPoolManager.c(), "HealthModelRefreshTask", new Runnable() { // from class: bzd
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(healthLifeBean, taskDayDataListener);
            }
        });
    }

    /* synthetic */ void a(HealthLifeBean healthLifeBean, TaskDayDataListener taskDayDataListener) {
        if (bxc.a(healthLifeBean, cbg.q()) < 0) {
            taskDayDataListener.onDataChange(-1, healthLifeBean);
            return;
        }
        SparseArray<HealthLifeBean> sparseArray = this.h;
        if (sparseArray != null) {
            sparseArray.append(healthLifeBean.getId(), healthLifeBean);
        }
        taskDayDataListener.onDataChange(0, healthLifeBean);
        bxp.b().h();
        bys.c().b(cbg.q(), healthLifeBean.getRecordDay(), healthLifeBean.getRecordDay(), 4);
    }

    public ConfigBean e() {
        ConfigBean configBeanD;
        if (this.f == null) {
            this.f = new byn().a(this.i, this.g);
        }
        ConfigBean configBean = this.f;
        if (configBean != null && njy.e(configBean.getChallengeList()) && (configBeanD = this.j.d(this.i)) != null) {
            this.f.setChallengeList(configBeanD.getChallengeList());
            this.f.setChallengeMotivationImage(configBeanD.getChallengeMotivationImage());
        }
        return this.f;
    }

    public SparseArray<TaskConfigBean> b() {
        AtomicBoolean atomicBooleanC = byn.c();
        if (this.m == null || (atomicBooleanC != null && atomicBooleanC.get())) {
            LogUtil.a("HL_TaskManager", "getHealthTaskConfigList load task mIsOversea=", Boolean.valueOf(this.i));
            ConfigBean configBeanA = this.j.a(this.i, this.g);
            this.f = configBeanA;
            this.m = byn.c(configBeanA);
        }
        return this.m;
    }

    public SparseArray<TaskConfigBean> d(boolean z) {
        SparseArray<TaskConfigBean> sparseArray;
        b();
        boolean zD = ccg.d();
        boolean isLogined = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
        LogUtil.a("HL_TaskManager", "getGoalPagerTaskConfigList isJoin=", Boolean.valueOf(zD), ",isLogin=", Boolean.valueOf(isLogined));
        if (!isLogined || zD || !z || (sparseArray = this.m) == null || sparseArray.size() == 0) {
            return this.m;
        }
        SparseArray<TaskConfigBean> sparseArray2 = new SparseArray<>();
        a();
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.m.keyAt(i);
            if (this.d.contains(Integer.valueOf(iKeyAt)) || iKeyAt == 1 || iKeyAt == 100001) {
                sparseArray2.put(iKeyAt, this.m.get(iKeyAt));
            }
        }
        return sparseArray2;
    }

    public SparseArray<ChallengeConfigBean> d() {
        if (this.f1331b == null) {
            this.f1331b = byn.b(this.j.d(this.i));
        }
        return this.f1331b;
    }

    public ChallengeConfigBean c(int i) {
        SparseArray<ChallengeConfigBean> sparseArrayD = d();
        if (sparseArrayD == null) {
            LogUtil.j("HL_TaskManager", "challengeList is null");
            return null;
        }
        return sparseArrayD.get(i);
    }

    public void a(final String str, final int i, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_TaskManager", "getTaskSubscriptionListFromCloud callback is null.");
        } else {
            final int iR = cbg.r();
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bzb
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(iR, str, i, responseCallback);
                }
            });
        }
    }

    /* synthetic */ void e(int i, String str, int i2, ResponseCallback responseCallback) {
        boolean z;
        if (i == 0 || !this.g) {
            LogUtil.a("HL_TaskManager", "getTaskSubscriptionListFromCloud from config");
            z = false;
        } else {
            z = true;
        }
        responseCallback.onResponse(0, c(str, i2, z));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(final String str, final int i, final TaskDataListener taskDataListener) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bzg
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(str, i, taskDataListener);
                }
            });
        } else {
            int iA = a(i);
            d(str, iA, cbg.j(iA), taskDataListener);
        }
    }

    private void d(String str, int i, List<Integer> list, TaskDataListener taskDataListener) {
        if (njy.e(list) || list.size() != 7) {
            LogUtil.j("HL_TaskManager", "getWeekTaskRecords weekDayList ", list);
            return;
        }
        int iR = cbg.r();
        int iIntValue = list.get(0).intValue();
        if (iR > iIntValue) {
            iIntValue = iR;
        }
        if (iR <= 0) {
            iIntValue = i;
        }
        int iIntValue2 = list.get(6).intValue();
        int iA = a(DateFormatUtil.a(System.currentTimeMillis()));
        if (iIntValue2 > iA) {
            iIntValue2 = iA;
        }
        cbg.c(this.o <= i, "HL_TaskManager", "getWeekTaskRecords weekStartDay ", Integer.valueOf(iIntValue), " weekEndDay ", Integer.valueOf(iIntValue2), " currentDay ", Integer.valueOf(iA), " recordDay ", Integer.valueOf(i));
        SparseArray<SparseArray<HealthLifeBean>> sparseArrayA = cfu.a(iIntValue, iIntValue2, str);
        SparseArray<List<HealthLifeBean>> sparseArray = new SparseArray<>();
        long jD = DateFormatUtil.d(iIntValue);
        int iE = e(list, iIntValue2);
        for (int i2 = 0; i2 <= iE; i2++) {
            int iA2 = DateFormatUtil.a(lsl.c(jD, i2));
            if (iA2 <= iA) {
                sparseArray.append(iA2, e(iA2, sparseArrayA.get(iA2), c(str, iA2, false)));
            }
        }
        c(str, i, a(sparseArray), taskDataListener);
    }

    public SparseArray<List<HealthLifeBean>> b(String str, int i, int i2) {
        List<Integer> listA = lsl.a(i, i2);
        if (CollectionUtils.a(listA)) {
            ReleaseLogUtil.d("HL_TaskManager", "getRecordSparseArray dateList ", listA);
            return new SparseArray<>();
        }
        SparseArray<SparseArray<HealthLifeBean>> sparseArrayA = cfu.a(i, i2, str);
        SparseArray<List<HealthLifeBean>> sparseArray = new SparseArray<>();
        for (Integer num : listA) {
            if (num != null) {
                sparseArray.append(num.intValue(), e(num.intValue(), sparseArrayA.get(num.intValue()), c(str, num.intValue(), false)));
            }
        }
        return sparseArray;
    }

    private int e(List<Integer> list, int i) {
        if (njy.e(list)) {
            return 0;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).intValue() == i) {
                return i2;
            }
        }
        return 0;
    }

    private List<HealthLifeBean> e(int i, SparseArray<HealthLifeBean> sparseArray, SparseArray<HealthLifeBean> sparseArray2) {
        ArrayList arrayList = new ArrayList();
        if (sparseArray2.size() == 0) {
            LogUtil.j("HL_TaskManager", "subscriptionDbBeans is null in day: ", Integer.valueOf(i));
            return arrayList;
        }
        SparseArray<TaskConfigBean> sparseArrayB = b();
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            int iKeyAt = sparseArray2.keyAt(i2);
            HealthLifeBean healthLifeBean = sparseArray2.get(iKeyAt);
            if (healthLifeBean == null) {
                LogUtil.j("HL_TaskManager", "subscriptionDbBean is null in id: ", Integer.valueOf(iKeyAt));
            } else if (iKeyAt == 1 || healthLifeBean.getAddStatus() == 1) {
                HealthLifeBean healthLifeBean2 = sparseArray != null ? sparseArray.get(iKeyAt) : null;
                if (healthLifeBean2 == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    HealthLifeBean healthLifeBean3 = new HealthLifeBean();
                    healthLifeBean3.setTimeZone(lsl.q(jCurrentTimeMillis));
                    healthLifeBean3.setTimestamp(jCurrentTimeMillis);
                    healthLifeBean3.setRecordDay(i);
                    healthLifeBean3.setId(iKeyAt);
                    healthLifeBean2 = healthLifeBean3;
                }
                healthLifeBean2.setChallengeId(healthLifeBean.getChallengeId());
                healthLifeBean2.setTaskType(healthLifeBean.getTaskType());
                healthLifeBean2.setDataSource(healthLifeBean.getDataSource());
                healthLifeBean2.setIsUpdated(true);
                if (iKeyAt == 1) {
                    arrayList.add(healthLifeBean2);
                } else if (sparseArrayB == null || sparseArrayB.get(iKeyAt) == null) {
                    a(healthLifeBean, healthLifeBean2, arrayList);
                } else {
                    TaskConfigBean taskConfigBean = sparseArrayB.get(iKeyAt);
                    if (iKeyAt != 11 && iKeyAt != 12) {
                        healthLifeBean2.setTarget(taskConfigBean.getDefaultGoal());
                    }
                    healthLifeBean2.setType(taskConfigBean.getType());
                    a(healthLifeBean, healthLifeBean2, arrayList);
                }
            }
        }
        return arrayList;
    }

    private void a(HealthLifeBean healthLifeBean, HealthLifeBean healthLifeBean2, List<HealthLifeBean> list) {
        String target = healthLifeBean.getTarget();
        if (!TextUtils.isEmpty(target)) {
            healthLifeBean2.setTarget(target);
        }
        list.add(healthLifeBean2);
    }

    private SparseArray<List<HealthLifeBean>> a(SparseArray<List<HealthLifeBean>> sparseArray) {
        ArrayList<HealthLifeBean> arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.addAll(sparseArray.get(sparseArray.keyAt(i)));
        }
        SparseArray<List<HealthLifeBean>> sparseArray2 = new SparseArray<>();
        for (HealthLifeBean healthLifeBean : arrayList) {
            List<HealthLifeBean> arrayList2 = sparseArray2.get(healthLifeBean.getId());
            if (njy.e(arrayList2)) {
                arrayList2 = new ArrayList<>();
            }
            arrayList2.add(healthLifeBean);
            sparseArray2.append(healthLifeBean.getId(), arrayList2);
        }
        return sparseArray2;
    }

    private SparseArray<HealthLifeBean> d(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            LogUtil.j("HL_TaskManager", "convertListToSparseArray healthTaskRecordDbBeans is empty.");
            return new SparseArray<>();
        }
        SparseArray<HealthLifeBean> sparseArray = new SparseArray<>(list.size());
        for (HealthLifeBean healthLifeBean : list) {
            sparseArray.append(healthLifeBean.getId(), healthLifeBean);
        }
        return sparseArray;
    }

    private void c(String str, int i, SparseArray<List<HealthLifeBean>> sparseArray, TaskDataListener taskDataListener) {
        cbg.c(this.o <= i, "HL_TaskManager", "triggerUpdateWeekData sparseArrayIdList ", sparseArray);
        byt bytVar = new byt(str, i, taskDataListener, sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            bxw bxwVarE = e(iKeyAt);
            List<HealthLifeBean> list = sparseArray.get(iKeyAt);
            SparseArray<HealthLifeBean> sparseArray2 = new SparseArray<>(list.size());
            for (HealthLifeBean healthLifeBean : list) {
                sparseArray2.append(healthLifeBean.getRecordDay(), healthLifeBean);
            }
            if (bxwVarE != null) {
                bxwVarE.getRecord(sparseArray2, bytVar);
            }
        }
    }

    public void e(ArrayList<HealthLifeBean> arrayList, ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        a(false, "", arrayList, responseCallback);
    }

    public void a(final boolean z, final String str, final ArrayList<HealthLifeBean> arrayList, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelUpdateSubscriptionList", new Runnable() { // from class: byz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1341a.c(z, str, arrayList, responseCallback);
                }
            });
            return;
        }
        if (responseCallback == null) {
            LogUtil.j("HL_TaskManager", "updateTaskSubscriptionList callback is null.");
            return;
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HL_TaskManager", "updateTaskSubscriptionList subscriptionDbBeans is null.");
            responseCallback.onResponse(-1, null);
            return;
        }
        if (ccy.d() <= 0) {
            e(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<HealthLifeBean> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cdf.c(it.next()));
        }
        if (!this.g) {
            b(z, str, arrayList, responseCallback);
        } else {
            bwk.d().c(z, arrayList2, new IBaseResponseCallback() { // from class: bzf
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f1354c.a(responseCallback, z, str, arrayList, i, obj);
                }
            });
        }
    }

    /* synthetic */ void c(boolean z, String str, ArrayList arrayList, ResponseCallback responseCallback) {
        a(z, str, (ArrayList<HealthLifeBean>) arrayList, (ResponseCallback<SparseArray<HealthLifeBean>>) responseCallback);
    }

    /* synthetic */ void a(ResponseCallback responseCallback, boolean z, String str, ArrayList arrayList, int i, Object obj) {
        if (i == -1) {
            LogUtil.j("HL_TaskManager", "updateTaskSubscriptionList addHealthLifeConfig onFailure ");
            responseCallback.onResponse(-1, null);
        } else {
            if (!(obj instanceof bwi)) {
                LogUtil.j("HL_TaskManager", "updateTaskSubscriptionList onSuccess data is null");
                responseCallback.onResponse(-1, null);
                return;
            }
            int iB = ((bwi) obj).b();
            if (iB != 0) {
                LogUtil.j("HL_TaskManager", "updateTaskSubscriptionList onSuccess resultCode is ", Integer.valueOf(iB));
                responseCallback.onResponse(iB, null);
            } else {
                b(z, str, (ArrayList<HealthLifeBean>) arrayList, (ResponseCallback<SparseArray<HealthLifeBean>>) responseCallback);
            }
        }
    }

    private void e(ArrayList<HealthLifeBean> arrayList) {
        if (cbg.v()) {
            LogUtil.a("HL_TaskManager", "compatibleOldVersion basic changed");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HealthLifeBean healthLifeBean = null;
        int i = 0;
        HealthLifeBean healthLifeBean2 = null;
        for (HealthLifeBean healthLifeBean3 : arrayList) {
            if (healthLifeBean3 != null) {
                int challengeId = healthLifeBean3.getChallengeId();
                if (i == 0 && challengeId > 0) {
                    i = challengeId;
                }
                if (healthLifeBean3.getId() == 1) {
                    if (healthLifeBean3.getRecordDay() == DateFormatUtil.a(jCurrentTimeMillis)) {
                        healthLifeBean = healthLifeBean3;
                    } else {
                        healthLifeBean2 = healthLifeBean3;
                    }
                }
            }
        }
        a(arrayList, healthLifeBean, healthLifeBean2, i);
    }

    private void a(ArrayList<HealthLifeBean> arrayList, HealthLifeBean healthLifeBean, HealthLifeBean healthLifeBean2, int i) {
        if (healthLifeBean == null || healthLifeBean2 == null) {
            LogUtil.j("HL_TaskManager", "compatibleOldVersion todayCloverBean or tomorrowCloverBean is null");
            return;
        }
        String target = healthLifeBean2.getTarget();
        if (TextUtils.isEmpty(target)) {
            LogUtil.j("HL_TaskManager", "compatibleOldVersion target is empty");
            return;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(target.split(",")));
        if (njy.e(arrayList2)) {
            LogUtil.j("HL_TaskManager", "compatibleOldVersion targetList is empty");
            return;
        }
        List<Integer> listG = g(i);
        SparseArray<TaskConfigBean> sparseArrayB = b();
        if (sparseArrayB == null || sparseArrayB.size() == 0) {
            LogUtil.j("HL_TaskManager", "compatibleOldVersion taskConfigList is empty");
            return;
        }
        int recordDay = healthLifeBean.getRecordDay();
        TimeZone timeZoneA = lsl.a(healthLifeBean.getTimeZone());
        int iA = DateFormatUtil.a(lsl.t(DateFormatUtil.c(recordDay, timeZoneA), timeZoneA), timeZoneA);
        boolean z = false;
        for (Integer num : listG) {
            int iIntValue = num.intValue();
            if (!arrayList2.contains(String.valueOf(iIntValue))) {
                arrayList2.add(String.valueOf(iIntValue));
                TaskConfigBean taskConfigBean = sparseArrayB.get(iIntValue);
                e(arrayList, taskConfigBean, iIntValue, recordDay, i);
                e(arrayList, taskConfigBean, iIntValue, iA, i);
                LogUtil.a("HL_TaskManager", "compatibleOldVersion basicId ", num);
                z = true;
            }
        }
        if (z) {
            String strReplace = arrayList2.toString().replace("[", "").replace("]", "").replace(" ", "");
            healthLifeBean.setLastTarget(healthLifeBean2.getTarget());
            healthLifeBean2.setLastTarget(strReplace);
            healthLifeBean.setTarget(strReplace);
            healthLifeBean2.setTarget(strReplace);
        }
    }

    private void e(ArrayList<HealthLifeBean> arrayList, TaskConfigBean taskConfigBean, int i, int i2, int i3) {
        boolean z = false;
        for (HealthLifeBean healthLifeBean : arrayList) {
            if (healthLifeBean != null && healthLifeBean.getId() == i && healthLifeBean.getRecordDay() == i2) {
                z = true;
                healthLifeBean.setTaskType(1);
                healthLifeBean.setChallengeId(i3);
            }
        }
        if (z) {
            return;
        }
        arrayList.add(e(taskConfigBean, i, i2, i3));
    }

    private HealthLifeBean e(TaskConfigBean taskConfigBean, int i, int i2, int i3) {
        HealthLifeBean healthLifeBean = new HealthLifeBean();
        healthLifeBean.setId(i);
        healthLifeBean.setRecordDay(i2);
        healthLifeBean.setTaskType(1);
        long jD = DateFormatUtil.d(i2);
        healthLifeBean.setTimeZone(lsl.q(jD));
        healthLifeBean.setTimestamp(jD);
        healthLifeBean.setChallengeId(i3);
        if (taskConfigBean != null) {
            healthLifeBean.setTarget(taskConfigBean.getDefaultGoal());
        }
        LogUtil.a("HL_TaskManager", "compatibleOldVersion lack lifeBean = ", healthLifeBean.toString());
        return healthLifeBean;
    }

    private List<Integer> g(int i) {
        ArrayList<Integer> arrayListA = a();
        ArrayList<Integer> arrayListA2 = cbg.a();
        if (njy.b(arrayListA2) && arrayListA2.contains(Integer.valueOf(i))) {
            arrayListA.clear();
            for (Integer num : cbg.e()) {
                if (num.intValue() != 2) {
                    arrayListA.add(num);
                }
            }
            LogUtil.a("HL_TaskManager", "handleBasicTask basicIdList=", arrayListA);
        }
        return arrayListA;
    }

    private void b(boolean z, String str, ArrayList<HealthLifeBean> arrayList, ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (z) {
            LogUtil.a("HL_TaskManager", "insertTaskComplete result ", Integer.valueOf(bxd.a(DateFormatUtil.a(System.currentTimeMillis()))));
        }
        d(str, arrayList, responseCallback);
    }

    private void e(SparseArray<HealthLifeBean> sparseArray) {
        bxw bxwVarE;
        if (sparseArray == null || sparseArray.size() == 0 || sparseArray.get(1) == null) {
            LogUtil.j("HL_TaskManager", "updateSubscriptionList bean is null or not valid");
            return;
        }
        this.l.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            HealthLifeBean healthLifeBean = sparseArray.get(iKeyAt);
            this.l.append(iKeyAt, healthLifeBean);
            if (healthLifeBean != null && healthLifeBean.getAddStatus() == 1 && (bxwVarE = e(iKeyAt)) != null) {
                this.f1330a.append(iKeyAt, bxwVarE);
            }
        }
        LogUtil.a("HL_TaskManager", "updateSubscriptionList mAddedTaskManagerMap size:", Integer.valueOf(this.f1330a.size()));
    }

    private void d(String str, ArrayList<HealthLifeBean> arrayList, ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        int recordDay;
        if (njy.e(arrayList)) {
            LogUtil.j("HL_TaskManager", "insertTaskSubscriptionList subscriptionDbBeans is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        String strQ = cbg.q();
        long jA = bxd.a(arrayList, strQ);
        if (jA <= -1) {
            LogUtil.j("HL_TaskManager", "insertTaskSubscriptionList subscriptionDbBeans result:", Long.valueOf(jA));
            responseCallback.onResponse(-1, null);
            return;
        }
        SparseArray<HealthLifeBean> sparseArray = new SparseArray<>(arrayList.size());
        for (HealthLifeBean healthLifeBean : arrayList) {
            sparseArray.append(healthLifeBean.getId(), healthLifeBean);
        }
        if (sparseArray.get(1) != null) {
            recordDay = sparseArray.get(1).getRecordDay();
            if (bxc.a(strQ, recordDay) != 0) {
                LogUtil.j("HL_TaskManager", "deleteAfter fail, day is ", Integer.valueOf(recordDay));
            }
        } else {
            recordDay = 0;
        }
        if (recordDay > 0) {
            SparseArray<HealthLifeBean> sparseArrayD = d(recordDay, sparseArray, strQ);
            ArrayList arrayList2 = new ArrayList(10);
            for (int i = 0; i < sparseArrayD.size(); i++) {
                arrayList2.add(sparseArrayD.valueAt(i));
            }
            bxc.a(arrayList2, strQ);
        }
        if (!qgr.b(com.huawei.haf.application.BaseApplication.b()) && !"UPDATE_GOAL".equals(str) && !"cloverLife".equals(str) && !"EXIT_HEALTH_GOAL".equals(str)) {
            LogUtil.a("HL_TaskManager", "insertTaskSubscriptionList from ", str);
            b(sparseArray);
        }
        responseCallback.onResponse(0, sparseArray);
    }

    private void b(SparseArray<HealthLifeBean> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HL_TaskManager", "refreshMotionGoal sparseArray is empty");
            return;
        }
        HealthLifeBean healthLifeBean = sparseArray.get(2);
        HealthLifeBean healthLifeBean2 = sparseArray.get(3);
        if (healthLifeBean == null || healthLifeBean2 == null) {
            LogUtil.j("HL_TaskManager", "refreshMotionGoal stepBean or intensityBean is null");
            return;
        }
        final int iJ = CommonUtils.j(healthLifeBean.getTarget());
        final int iJ2 = CommonUtils.j(healthLifeBean2.getTarget());
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("900200006");
        arrayList.add("900200008");
        qgm.a(arrayList, new IBaseResponseCallback() { // from class: bzh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                byu.b(iJ, iJ2, i, obj);
            }
        });
    }

    static /* synthetic */ void b(int i, int i2, int i3, Object obj) {
        if (!(obj instanceof Map)) {
            LogUtil.j("HL_TaskManager", "refreshMotionGoal onResponse object instanceof Map false");
            return;
        }
        HashMap map = (HashMap) obj;
        int iD = qgm.d(map, "900200006", 0);
        int iD2 = qgm.d(map, "900200008", 0);
        LogUtil.a("HL_TaskManager", "refreshMotionGoal onResponse stepTarget ", Integer.valueOf(i), " intensityTarget ", Integer.valueOf(i2), " stepGoal ", Integer.valueOf(iD), " intensityGoal ", Integer.valueOf(iD2));
        if (i > 0 && i != iD) {
            qgm.b("900200006", i);
        }
        if (i2 <= 0 || i2 == iD2) {
            return;
        }
        qgm.b("900200008", i2);
    }

    private bxw e(int i) {
        switch (i) {
            case 2:
                return new byr();
            case 3:
                return new bym();
            case 4:
                return new bzl();
            case 5:
                return new bya();
            case 6:
                return new bzk();
            case 7:
                return new byq();
            case 8:
            case 9:
                return new bxw();
            case 10:
                return new byj();
            case 11:
                return new byl();
            case 12:
                return new bxz();
            case 13:
                return new bye();
            case 14:
                return new bzm();
            default:
                LogUtil.d("HL_TaskManager", "getBaseHealthTaskById id ", Integer.valueOf(i));
                if (i >= 1) {
                    return new bxw();
                }
                return null;
        }
    }

    public SparseArray<HealthLifeBean> c(String str, int i, boolean z) {
        List<HealthLifeBean> listE;
        SparseArray<TaskConfigBean> sparseArrayB = b();
        if (z && CommonUtil.ab(BaseApplication.getContext())) {
            String url = GRSManager.c(BaseApplication.getContext()).getUrl("achievementUrl");
            bws bwsVarD = bwh.b().d(url, i, i);
            cbg.c(this.o <= i, "HL_TaskManager", "getHealthTaskSubscriptionList host ", url, " result ", bwsVarD);
            if (bwsVarD == null || bwsVarD.b() != 0 || njy.e(bwsVarD.d())) {
                LogUtil.j("HL_TaskManager", "getHealthTaskSubscriptionList getHealthLifeConfigSync result is empty");
                listE = bxd.e(str, i, sparseArrayB, false);
            } else {
                SparseArray<HealthLifeBean> sparseArrayE = cfu.e(str, bwsVarD, sparseArrayB);
                if (sparseArrayE.size() <= 3) {
                    listE = bxd.e(str, i, sparseArrayB, false);
                } else {
                    c(sparseArrayE);
                    e(i, sparseArrayE);
                    return sparseArrayE;
                }
            }
        } else {
            listE = bxd.e(str, i, sparseArrayB, false);
        }
        cbg.c(this.o <= i, "HL_TaskManager", "getHealthTaskSubscriptionList recordDay ", Integer.valueOf(i), " isFromCloud ", Boolean.valueOf(z), " taskSubscriptionList ", listE);
        SparseArray<HealthLifeBean> sparseArrayC = cdf.c(listE);
        e(i, sparseArrayC);
        return sparseArrayC;
    }

    private void c(SparseArray<HealthLifeBean> sparseArray) {
        HealthLifeBean healthLifeBean = sparseArray.get(1);
        if (healthLifeBean == null) {
            LogUtil.a("HL_TaskManager", "handleDoctorCloudData cloverBean is null");
            return;
        }
        int recordDay = healthLifeBean.getRecordDay();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(i);
            if (healthLifeBeanValueAt != null && healthLifeBeanValueAt.getRecordDay() != recordDay) {
                healthLifeBeanValueAt.setTaskType(0);
                healthLifeBeanValueAt.setChallengeId(0);
                healthLifeBeanValueAt.setDataSource(0);
            }
        }
    }
}
