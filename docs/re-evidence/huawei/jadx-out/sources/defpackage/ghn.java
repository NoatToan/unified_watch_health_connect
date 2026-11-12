package defpackage;

import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo;
import com.huawei.health.plan.model.intplan.PlanMetaInfoBean;

/* JADX INFO: loaded from: classes29.dex */
public class ghn implements PlanMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35130c;
    private String d;
    private String e;
    private String g;
    private String h;
    private String j;
    private String k;
    private String l;
    private IntPlan.PlanType m;
    private int n;
    private String o;
    private int s;
    private int i = 0;
    private int f = 0;

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public IntPlan.PlanType getPlanType() {
        return this.m;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getPlanId() {
        return this.k;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public int getPlanStatus() {
        return this.n;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getPlanTempId() {
        return this.l;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getName() {
        return this.h;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getPicture() {
        return this.g;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getCardImage() {
        return this.d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getDescription() {
        return this.f35128a;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public int getExeDayNum() {
        return this.f35129b;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getExeDays() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getVersion() {
        return this.o;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public int getDayCount() {
        return this.f35130c;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public int getWeekCount() {
        return this.s;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public int getPlanCategory() {
        return this.i;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public int getDisplayStyle() {
        return this.f;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo
    public String getOpenPageBigImage() {
        return this.j;
    }

    public void d(IntPlan.PlanType planType) {
        this.m = planType;
    }

    public void h(String str) {
        this.k = str;
    }

    public void e(int i) {
        this.n = i;
    }

    public void f(String str) {
        this.l = str;
    }

    public void c(String str) {
        this.h = str;
    }

    public void g(String str) {
        this.g = str;
    }

    public void a(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.f35128a = str;
    }

    public void c(int i) {
        this.f35129b = i;
    }

    public void d(String str) {
        this.e = str;
    }

    public void a(int i) {
        this.f35130c = i;
    }

    public void i(int i) {
        this.s = i;
    }

    public void b(int i) {
        this.i = i;
    }

    public void d(int i) {
        this.f = i;
    }

    public void b(String str) {
        this.j = str;
    }

    public ghn d(PlanMetaInfoBean planMetaInfoBean) {
        if (planMetaInfoBean != null) {
            e(planMetaInfoBean.getDescription());
            c(planMetaInfoBean.getExeDayNum());
            d(planMetaInfoBean.getExeDays());
            c(planMetaInfoBean.getName());
            h(planMetaInfoBean.getPlanId());
            f(planMetaInfoBean.getPlanTempId());
            d(IntPlan.PlanType.getPlanType(planMetaInfoBean.getPlanType()));
            e(planMetaInfoBean.getPlanStatus());
            g(planMetaInfoBean.getPicture());
            a(planMetaInfoBean.getCardImage());
            b(planMetaInfoBean.getOpenPageBigImage());
        }
        return this;
    }
}
