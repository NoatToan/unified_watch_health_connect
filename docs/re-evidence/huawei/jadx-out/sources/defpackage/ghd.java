package defpackage;

import com.huawei.basefitnessadvice.model.intplan.Goal;
import com.huawei.health.plan.model.intplan.GoalBean;

/* JADX INFO: loaded from: classes29.dex */
public class ghd implements Goal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f35101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f35103c;
    private Object d;
    private Object e;

    @Override // com.huawei.basefitnessadvice.model.intplan.Goal
    public String getStatType() {
        return this.f35102b;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.Goal
    public Object getGoalSrc() {
        return this.d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.Goal
    public Object getGoalDst() {
        return this.f35101a;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.Goal
    public Object getGoalEstimate() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.Goal
    public Object getGoalActual() {
        return this.f35103c;
    }

    public void e(String str) {
        this.f35102b = str;
    }

    public void d(Object obj) {
        this.f35101a = obj;
    }

    public ghd c(GoalBean goalBean) {
        if (goalBean != null) {
            e(goalBean.getType());
            d(goalBean.getValue());
        }
        return this;
    }
}
