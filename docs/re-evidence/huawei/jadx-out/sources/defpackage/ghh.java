package defpackage;

import com.huawei.basefitnessadvice.model.intplan.PlanInputInfo;
import com.huawei.health.plan.model.intplan.PlanInputInfoBean;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class ghh implements PlanInputInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35114c;
    public ghk d;
    private List<Integer> e;
    private int f;

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanInputInfo
    public int getGoalType() {
        return this.f35113b;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanInputInfo
    public List<Integer> getBodyParts() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanInputInfo
    public int getExperience() {
        return this.f35114c;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanInputInfo
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ghk getUserInfo() {
        return this.d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanInputInfo
    public int getIsRunFlag() {
        return this.f35112a;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanInputInfo
    public int getIsSkipRopeFlag() {
        return this.f;
    }

    public void e(int i) {
        this.f35113b = i;
    }

    public void d(List<Integer> list) {
        this.e = list;
    }

    public void c(int i) {
        this.f35114c = i;
    }

    public void d(ghk ghkVar) {
        this.d = ghkVar;
    }

    public void b(int i) {
        this.f35112a = i;
    }

    public void d(int i) {
        this.f = i;
    }

    public ghh b(PlanInputInfoBean planInputInfoBean) {
        if (planInputInfoBean != null) {
            c(planInputInfoBean.getExperience());
            d(planInputInfoBean.getBodyParts());
            e(planInputInfoBean.getGoalType());
            d(new ghk().d(planInputInfoBean.getUserInfo()));
            b(planInputInfoBean.getIsRunFlag());
            d(planInputInfoBean.getIsSkipRopeFlag());
        }
        return this;
    }
}
