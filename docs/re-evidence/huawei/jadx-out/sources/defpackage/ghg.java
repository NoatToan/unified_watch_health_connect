package defpackage;

import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.health.plan.model.intplan.IntActionBean;
import com.huawei.pluginfitnessadvice.FitWorkout;

/* JADX INFO: loaded from: classes29.dex */
public class ghg implements IntAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35109a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitWorkout f35111c;
    private int d;
    private IntAction.ActionType e;
    private long f;
    private long g;
    private int h;
    private String i;
    private pds j;

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public pds getActionInfo() {
        return this.j;
    }

    public void b(pds pdsVar) {
        this.j = pdsVar;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public long getTimePeriod() {
        return this.g;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public IntAction.ActionType getActionType() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public String getActionId() {
        return this.f35110b;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public int getPunchFlag() {
        return this.h;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public long getPunchTime() {
        return this.f;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public String getRecordId() {
        return this.i;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public int getFeedback() {
        return this.d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public boolean isCanQueryForCloud() {
        return this.f35109a;
    }

    public void e(boolean z) {
        this.f35109a = z;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntAction
    public FitWorkout getCustomFitWorkout() {
        return this.f35111c;
    }

    public void c(FitWorkout fitWorkout) {
        this.f35111c = fitWorkout;
    }

    public void e(long j) {
        this.g = j;
    }

    public void c(IntAction.ActionType actionType) {
        this.e = actionType;
    }

    public void a(int i) {
        this.h = i;
    }

    public void d(long j) {
        this.f = j;
    }

    public void e(String str) {
        this.f35110b = str;
    }

    public void b(String str) {
        this.i = str;
    }

    public void d(int i) {
        this.d = i;
    }

    public ghg c(IntActionBean intActionBean) {
        if (intActionBean != null) {
            e(intActionBean.getActionId());
            c(IntAction.ActionType.getActionType(intActionBean.getActionType()));
            a(intActionBean.getPunchFlag());
            d(intActionBean.getPunchTime());
            b(intActionBean.getRecordId());
            d(intActionBean.getFeedback());
            b(intActionBean.getActionInfo());
        }
        return this;
    }
}
