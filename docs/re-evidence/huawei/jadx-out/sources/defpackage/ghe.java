package defpackage;

import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.health.plan.model.intplan.DayPlanBean;
import com.huawei.health.plan.model.intplan.IntWeekPlanBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class ghe implements IntWeekPlan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35104a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ghi> f35105c = new ArrayList();
    private String d;
    private String e;

    @Override // com.huawei.basefitnessadvice.model.intplan.IntWeekPlan
    public String getWeekDesc() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntWeekPlan
    public String getWeekPeriod() {
        return this.d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntWeekPlan
    public int getWeekOrder() {
        return this.f35104a;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntWeekPlan
    public int getDayCount() {
        return this.f35105c.size();
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntWeekPlan
    public IntDayPlan getDayByIdx(int i) {
        List<ghi> list = this.f35105c;
        if (list != null && i >= 0 && i < list.size()) {
            return this.f35105c.get(i);
        }
        return null;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntWeekPlan
    public IntDayPlan getDayByOrder(int i) {
        List<ghi> list = this.f35105c;
        if (list == null) {
            return null;
        }
        for (ghi ghiVar : list) {
            if (ghiVar.getDayOrder() == i) {
                return ghiVar;
            }
        }
        return null;
    }

    public List<ghi> e() {
        return this.f35105c;
    }

    public void e(String str) {
        this.e = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void a(int i) {
        this.f35104a = i;
    }

    public void e(List<ghi> list) {
        this.f35105c = list;
    }

    public ghe a(IntWeekPlanBean intWeekPlanBean) {
        if (intWeekPlanBean != null) {
            a(intWeekPlanBean.getWeekOrder());
            e(intWeekPlanBean.getWeekDesc());
            b(intWeekPlanBean.getWeekPeriod());
            e(intWeekPlanBean);
        }
        return this;
    }

    private void e(IntWeekPlanBean intWeekPlanBean) {
        List<DayPlanBean> dayPlans = intWeekPlanBean.getDayPlans();
        if (njy.e(dayPlans)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<DayPlanBean> it = dayPlans.iterator();
        while (it.hasNext()) {
            arrayList.add(new ghi().c(it.next()));
        }
        e(arrayList);
    }
}
