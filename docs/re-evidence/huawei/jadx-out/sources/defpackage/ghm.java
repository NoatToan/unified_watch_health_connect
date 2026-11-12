package defpackage;

import com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo;
import com.huawei.health.plan.model.intplan.PlanTimeInfoBean;

/* JADX INFO: loaded from: classes29.dex */
public class ghm implements PlanTimeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f35125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35127c;
    private long d;
    private long e;
    private long f;
    private long i;

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo
    public long getCreateTime() {
        return this.f35126b;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo
    public long getFinishTime() {
        return this.f35125a;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo
    public long getModifyTime() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo
    public long getRemindTime() {
        return this.f;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo
    public long getBeginDate() {
        return this.d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo
    public long getEndDate() {
        return this.f35127c;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo
    public long getReportTime() {
        return this.i;
    }

    public void a(long j) {
        this.f35126b = j;
    }

    public void c(long j) {
        this.e = j;
    }

    public void e(long j) {
        this.f = j;
    }

    public void b(long j) {
        this.d = j;
    }

    public void d(long j) {
        this.f35127c = j;
    }

    public void g(long j) {
        this.i = j;
    }

    public ghm a(PlanTimeInfoBean planTimeInfoBean) {
        if (planTimeInfoBean != null) {
            b(planTimeInfoBean.getBeginDate());
            a(planTimeInfoBean.getCreateTime());
            d(planTimeInfoBean.getEndDate());
            e(planTimeInfoBean.getRemindTime());
            g(planTimeInfoBean.getReportTime());
        }
        return this;
    }
}
