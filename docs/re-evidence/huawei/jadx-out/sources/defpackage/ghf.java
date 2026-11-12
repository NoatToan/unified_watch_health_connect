package defpackage;

import com.huawei.basefitnessadvice.model.Introduction;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.Goal;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.PlanInputInfo;
import com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo;
import com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo;
import com.huawei.basefitnessadvice.model.intplan.StatInfo;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.health.plan.model.intplan.GoalBean;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.health.plan.model.intplan.IntWeekPlanBean;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class ghf implements IntPlan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ghm f35106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ghn f35107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Plan f35108c;
    public ghh d;
    private String e;
    private double h;
    private Introduction j;
    private UserFitnessPlanInfo k;
    private int l;
    private double m;
    private int n;
    private String p;
    private String s;
    private List<ghe> q = new ArrayList();
    private Map<String, ghd> g = new HashMap();
    private Map<String, ghj> r = new HashMap();
    private volatile boolean i = false;
    private int o = SmartPlanTypeEnum.SMART_NA_PLAN.getValue();
    private boolean f = false;

    @Override // com.huawei.operation.utils.TodoTaskInterface
    public int getIconId() {
        return 0;
    }

    @Override // com.huawei.operation.utils.TodoTaskInterface
    public String getProgress() {
        return null;
    }

    private ghf() {
    }

    public static ghf c() {
        return new ghf();
    }

    public static ghf c(IntPlanBean intPlanBean) {
        return new ghf().b(intPlanBean);
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public IntPlan.PlanType getPlanType() {
        return this.f35107b.getPlanType();
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public String getPlanId() {
        return this.f35107b.getPlanId();
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public String getPlanTempId() {
        return this.f35107b.getPlanTempId();
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public String getTimeZone() {
        return this.p;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public PlanMetaInfo getMetaInfo() {
        return this.f35107b;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public PlanTimeInfo getPlanTimeInfo() {
        return this.f35106a;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public PlanInputInfo getPlanInputInfo() {
        return this.d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public IntWeekPlan getWeekInfoByIdx(int i) {
        List<ghe> list = this.q;
        if (list != null && i >= 0 && i < list.size()) {
            return this.q.get(i);
        }
        return null;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public IntWeekPlan getWeekInfoByOrder(int i) {
        List<ghe> list = this.q;
        if (list == null) {
            return null;
        }
        for (ghe gheVar : list) {
            if (gheVar.getWeekOrder() == i) {
                return gheVar;
            }
        }
        return null;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public IntDayPlan getDayInfo(int i, int i2) {
        List<ghe> list = this.q;
        if (list == null) {
            return null;
        }
        for (ghe gheVar : list) {
            if (gheVar.getWeekOrder() == i) {
                return gheVar.getDayByOrder(i2);
            }
        }
        return null;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public String getWeekReport() {
        return this.s;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public String getFinalReport() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public Goal getGoal(String str) {
        return this.g.get(str);
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public StatInfo getStat(String str) {
        return this.r.get(str);
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public Plan getCompatiblePlan() {
        return this.f35108c;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public int getTransactionStatus() {
        return this.n;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public Introduction getIntroduction() {
        return this.j;
    }

    public void c(ghn ghnVar) {
        this.f35107b = ghnVar;
    }

    public void e(ghm ghmVar) {
        this.f35106a = ghmVar;
    }

    public void d(String str) {
        this.p = str;
    }

    public int a() {
        return this.f35107b.getDayCount();
    }

    public List<ghe> b() {
        return this.q;
    }

    public void e(List<ghe> list) {
        this.q = list;
    }

    public void c(ghd ghdVar) {
        this.g.put(ghdVar.getStatType(), ghdVar);
    }

    public void e(ghj ghjVar) {
        this.r.put(ghjVar.getStatType(), ghjVar);
    }

    public void b(Plan plan) {
        this.f35108c = plan;
    }

    public void d(int i) {
        this.n = i;
    }

    public void a(Introduction introduction) {
        this.j = introduction;
    }

    public UserFitnessPlanInfo d() {
        return this.k;
    }

    public void d(UserFitnessPlanInfo userFitnessPlanInfo) {
        this.k = userFitnessPlanInfo;
    }

    private ghf b(IntPlanBean intPlanBean) {
        if (intPlanBean == null) {
            return this;
        }
        this.n = intPlanBean.getTransactionStatus();
        this.p = intPlanBean.getTimeZone();
        this.f35107b = new ghn().d(intPlanBean.getMetaInfo());
        this.d = new ghh().b(intPlanBean.getPlanInput());
        this.f35106a = new ghm().a(intPlanBean.getTimeInfo());
        d(intPlanBean);
        e(intPlanBean);
        gnw.a(this);
        gnw.c(intPlanBean.getStats(), this);
        return this;
    }

    private void d(IntPlanBean intPlanBean) {
        List<IntWeekPlanBean> weekPlans = intPlanBean.getWeekPlans();
        if (njy.e(weekPlans)) {
            return;
        }
        this.q = new ArrayList();
        Iterator<IntWeekPlanBean> it = weekPlans.iterator();
        while (it.hasNext()) {
            this.q.add(new ghe().a(it.next()));
        }
    }

    private void e(IntPlanBean intPlanBean) {
        List<GoalBean> goals = intPlanBean.getGoals();
        if (njy.e(goals)) {
            return;
        }
        Iterator<GoalBean> it = goals.iterator();
        while (it.hasNext()) {
            c(new ghd().c(it.next()));
        }
    }

    public void e() {
        this.i = true;
    }

    public boolean h() {
        return this.i;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public int getSmartTrainPlanType() {
        return this.l;
    }

    public void a(int i) {
        this.l = i;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public int getSmartPlanType() {
        return this.o;
    }

    public void e(int i) {
        this.o = i;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public boolean isTempTrainPlan() {
        return this.f;
    }

    public void c(boolean z) {
        this.f = z;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public double getTargetWeight() {
        return this.m;
    }

    public void a(double d) {
        this.m = d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntPlan
    public double getInitialWeight() {
        return this.h;
    }

    public void d(double d) {
        this.h = d;
    }
}
