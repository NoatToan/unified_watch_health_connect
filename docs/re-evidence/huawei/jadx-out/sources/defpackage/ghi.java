package defpackage;

import com.huawei.basefitnessadvice.model.SuggestedReading;
import com.huawei.basefitnessadvice.model.intplan.Goal;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.basefitnessadvice.model.intplan.StatInfo;
import com.huawei.health.plan.model.intplan.DayPlanBean;
import com.huawei.health.plan.model.intplan.IntActionBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes29.dex */
public class ghi implements IntDayPlan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35117c;
    private SuggestedReading d;
    private int e;
    private long h;
    private int i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ghg> f35116b = new CopyOnWriteArrayList();
    private List<ghg> j = new CopyOnWriteArrayList();
    private List<ghl> f = new CopyOnWriteArrayList();
    private Map<String, ghj> g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ghd> f35115a = new HashMap();

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public int getInPlanActionCnt() {
        return this.f35116b.size();
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public IntAction getInPlanAction(int i) {
        List<ghg> list = this.f35116b;
        if (list != null && i >= 0 && i < list.size()) {
            return this.f35116b.get(i);
        }
        return null;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public int getOutPlanActionCnt() {
        return this.j.size();
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public IntAction getOutPlanAction(int i) {
        List<ghg> list = this.j;
        if (list != null && i >= 0 && i < list.size()) {
            return this.j.get(i);
        }
        return null;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public int getRecordDataCnt() {
        return this.f.size();
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public RecordData getRecordData(int i) {
        List<ghl> list = this.f;
        if (list != null && i >= 0 && i < list.size()) {
            return this.f.get(i);
        }
        return null;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public StatInfo getStat(String str) {
        return this.g.get(str);
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public Goal getGoal(String str) {
        return this.f35115a.get(str);
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public int getPunchFlag() {
        return this.i;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public int getDayOrder() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public int getDayStatus() {
        return this.f35117c;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public long getPunchTime() {
        return this.h;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.IntDayPlan
    public SuggestedReading getSuggestReading() {
        return this.d;
    }

    public List<ghg> b() {
        return this.f35116b;
    }

    public List<ghg> a() {
        return this.j;
    }

    public void b(long j) {
        this.h = j;
    }

    public void c(int i) {
        this.i = i;
    }

    public void d(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.f35117c = i;
    }

    public void a(List<ghg> list) {
        this.f35116b.clear();
        this.f35116b.addAll(list);
    }

    public void b(List<ghg> list) {
        this.j.clear();
        this.j.addAll(list);
    }

    public void e(List<ghl> list) {
        this.f.clear();
        this.f.addAll(list);
    }

    public void e(ghj ghjVar) {
        this.g.put(ghjVar.getStatType(), ghjVar);
    }

    public void b(SuggestedReading suggestedReading) {
        this.d = suggestedReading;
    }

    public ghi c(DayPlanBean dayPlanBean) {
        if (dayPlanBean != null) {
            d(dayPlanBean.getDayOrder());
            c(dayPlanBean.getPunchFlag());
            b(dayPlanBean.getPunchTime());
            b(dayPlanBean.getDayStatus());
            b(dayPlanBean);
            d(dayPlanBean);
            e(dayPlanBean);
        }
        return this;
    }

    private void b(DayPlanBean dayPlanBean) {
        List<IntActionBean> scheduledAction = dayPlanBean.getScheduledAction();
        if (njy.e(scheduledAction)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IntActionBean> it = scheduledAction.iterator();
        while (it.hasNext()) {
            arrayList.add(new ghg().c(it.next()));
        }
        a(arrayList);
    }

    private void d(DayPlanBean dayPlanBean) {
        List<IntActionBean> customAction = dayPlanBean.getCustomAction();
        if (njy.e(customAction)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IntActionBean> it = customAction.iterator();
        while (it.hasNext()) {
            arrayList.add(new ghg().c(it.next()));
        }
        b(arrayList);
    }

    private void e(DayPlanBean dayPlanBean) {
        List<pdr> recordData = dayPlanBean.getRecordData();
        if (njy.e(recordData)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<pdr> it = recordData.iterator();
        while (it.hasNext()) {
            arrayList.add(new ghl().d(it.next()));
        }
        e(arrayList);
    }
}
