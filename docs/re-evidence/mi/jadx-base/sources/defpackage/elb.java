package defpackage;

import com.xiaomi.har.entity.ActivityEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class elb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Integer> f16769b = new a();
    public static final Map<Integer, Integer> c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hfo f16770a;

    public static class a extends LinkedHashMap<Integer, Integer> {
        public a() {
            put(0, 0);
            put(4, 45);
            put(2, 140);
        }
    }

    public static class b extends LinkedHashMap<Integer, Integer> {
        public b() {
            put(0, 45);
            put(4, 140);
            put(2, Integer.MAX_VALUE);
        }
    }

    public final Integer a(ActivityEntity activityEntity) {
        double stepCount = ((((double) activityEntity.getStepCount()) * 1.0d) / (activityEntity.getEnd() - activityEntity.getStart().longValue())) * 60000.0d;
        for (Integer num : f16769b.keySet()) {
            Integer num2 = c.get(num);
            Integer num3 = f16769b.get(num);
            if (stepCount < num2.intValue() && stepCount >= num3.intValue()) {
                return num;
            }
        }
        return 0;
    }

    public final List<ActivityEntity> b(List<ActivityEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (ActivityEntity activityEntity : list) {
            activityEntity.setActType(a(activityEntity));
            if (activityEntity.getActType().intValue() != 0) {
                arrayList.add(activityEntity);
                activityEntity.setChildActivity();
                activityEntity.updatetContinued();
            }
        }
        return arrayList;
    }

    public i71 c(long j, long j2, List<ActivityEntity> list) {
        List<ActivityEntity> actsByTime = this.f16770a.getActsByTime(Long.valueOf(j), Long.valueOf(j2));
        if (actsByTime == null || actsByTime.size() == 0) {
            return null;
        }
        List<ActivityEntity> listB = b(actsByTime);
        if (listB.size() == 0) {
            return null;
        }
        List<ActivityEntity> listQ = rh0.q(list, listB.get(0).getStart().longValue());
        listQ.addAll(listB);
        return rh0.p(listQ, Long.valueOf(j2), this.f16770a);
    }

    public void d(hfo hfoVar) {
        this.f16770a = hfoVar;
    }
}
