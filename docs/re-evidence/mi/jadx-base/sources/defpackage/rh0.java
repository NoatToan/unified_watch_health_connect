package defpackage;

import com.xiaomi.har.entity.ActivityEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes10.dex */
public class rh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Double> f32533a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Long> f32534b = new b();
    public static final Map<Integer, Long> c = new c();
    public static final Map<Integer, Long> d = new d();
    public static final Map<Integer, Long> e = new e();
    public static final Map<Integer, List<Integer>> f = new f();

    public static class a extends HashMap<Integer, Double> {
        public a() {
            Double dValueOf = Double.valueOf(0.8d);
            put(4, dValueOf);
            put(1, dValueOf);
            put(2, dValueOf);
            put(3, Double.valueOf(1.0d));
        }
    }

    public static class b extends HashMap<Integer, Long> {
        public b() {
            put(4, 300000L);
            put(1, 300000L);
            put(2, 180000L);
            put(3, 60000L);
        }
    }

    public static class c extends HashMap<Integer, Long> {
        public c() {
            put(4, 120000L);
            put(1, 120000L);
            put(2, 120000L);
            put(3, 20000L);
        }
    }

    public static class d extends HashMap<Integer, Long> {
        public d() {
            put(4, 180000L);
            put(1, 180000L);
            put(2, 180000L);
            put(3, 60000L);
        }
    }

    public static class e extends HashMap<Integer, Long> {
        public e() {
            put(4, 20000L);
            put(1, 10000L);
            put(2, 0L);
            put(3, 0L);
        }
    }

    public static class f extends HashMap<Integer, List<Integer>> {
        public f() {
            put(4, Arrays.asList(3, 2));
            put(2, Collections.singletonList(3));
        }
    }

    public static boolean h(List<ActivityEntity> list, List<ActivityEntity> list2, Long l, ActivityEntity activityEntity) {
        if (activityEntity.getContinued().longValue() < c.get(activityEntity.getActType()).longValue() || l.longValue() - activityEntity.getEnd() < d.get(activityEntity.getActType()).longValue()) {
            return false;
        }
        if (list2.size() == 0) {
            list.add(activityEntity);
            return true;
        }
        ActivityEntity activityEntity2 = list2.get(list2.size() - 1);
        if (dfp.a(activityEntity.getStart().longValue(), activityEntity.getEnd(), activityEntity2.getStart().longValue(), activityEntity2.getEnd())) {
            return false;
        }
        list.add(activityEntity);
        return true;
    }

    public static void i(Map<Integer, ActivityEntity> map, List<ActivityEntity> list, List<ActivityEntity> list2, long j) {
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, Comparator.comparingInt(new ToIntFunction() { // from class: qh0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return rh0.r((ActivityEntity) obj);
            }
        }));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h(list2, list, Long.valueOf(j), (ActivityEntity) it.next());
        }
    }

    public static void j(Map<Integer, ActivityEntity> map, ActivityEntity activityEntity) {
        Map<Integer, List<Integer>> map2 = f;
        if (map2.containsKey(activityEntity.getActType())) {
            for (Integer num : map2.get(activityEntity.getActType())) {
                if (map.containsKey(num)) {
                    for (ActivityEntity activityEntity2 : map.get(num).getChildActivity()) {
                        if (activityEntity2.getStart().longValue() >= activityEntity.getStart().longValue() && activityEntity2.getEnd() <= activityEntity.getEnd()) {
                            activityEntity.addChildActivity(activityEntity2);
                        }
                    }
                }
            }
        }
        activityEntity.updatetContinued();
        Collections.sort(activityEntity.getChildActivity(), Comparator.comparingInt(new ToIntFunction() { // from class: mh0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return rh0.s((ActivityEntity) obj);
            }
        }));
    }

    public static boolean k(Map<Integer, ActivityEntity> map, List<ActivityEntity> list, List<ActivityEntity> list2, ActivityEntity activityEntity) {
        if (map.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, Comparator.comparingInt(new ToIntFunction() { // from class: oh0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return rh0.t((ActivityEntity) obj);
            }
        }));
        return activityEntity.getActType().equals(((ActivityEntity) arrayList.get(arrayList.size() - 1)).getActType()) && l(activityEntity, list, list2, map);
    }

    public static boolean l(ActivityEntity activityEntity, List<ActivityEntity> list, List<ActivityEntity> list2, Map<Integer, ActivityEntity> map) {
        double dLongValue = activityEntity.getContinued().longValue();
        Map<Integer, Long> map2 = f32534b;
        if (dLongValue < map2.get(activityEntity.getActType()).longValue() * f32533a.get(activityEntity.getActType()).doubleValue()) {
            return false;
        }
        if (list2.size() == 0) {
            j(map, activityEntity);
            if (activityEntity.getContinued().longValue() >= map2.get(activityEntity.getActType()).longValue()) {
                list2.add(activityEntity);
            } else {
                list.add(activityEntity);
            }
            return true;
        }
        ActivityEntity activityEntity2 = list2.get(list2.size() - 1);
        if (dfp.a(activityEntity.getStart().longValue(), activityEntity.getEnd(), activityEntity2.getStart().longValue(), activityEntity2.getEnd())) {
            return false;
        }
        j(map, activityEntity);
        if (activityEntity.getContinued().longValue() >= map2.get(activityEntity.getActType()).longValue()) {
            list2.add(activityEntity);
        } else {
            list.add(activityEntity);
        }
        return true;
    }

    public static boolean m(Map<Integer, ActivityEntity> map, List<ActivityEntity> list, List<ActivityEntity> list2) {
        if (map.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, Comparator.comparingInt(new ToIntFunction() { // from class: nh0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return rh0.u((ActivityEntity) obj);
            }
        }));
        return l((ActivityEntity) arrayList.get(arrayList.size() - 1), list, list2, map);
    }

    public static void n(List<ActivityEntity> list, ActivityEntity activityEntity) {
        if (list.size() <= 0 || !list.get(list.size() - 1).getActType().equals(activityEntity.getActType()) || activityEntity.getStart().longValue() - list.get(list.size() - 1).getEnd() > d.get(activityEntity.getActType()).longValue()) {
            list.add(activityEntity);
            return;
        }
        long jLongValue = list.get(list.size() - 1).getContinued().longValue() + activityEntity.getContinued().longValue();
        list.get(list.size() - 1).setEnd(activityEntity.getEnd());
        list.get(list.size() - 1).setPressureEnd(activityEntity.getPressureEnd());
        list.get(list.size() - 1).setContinuedTime(jLongValue);
        list.get(list.size() - 1).addAllChildActivity(activityEntity.getChildActivity());
    }

    public static i71 o(List<ActivityEntity> list, List<ActivityEntity> list2, Map<Integer, ActivityEntity> map, Long l, hfo hfoVar, List<ActivityEntity> list3) {
        ArrayList arrayList = new ArrayList();
        for (ActivityEntity activityEntity : list3) {
            if (!list.contains(activityEntity)) {
                arrayList.add(activityEntity);
            }
        }
        for (ActivityEntity activityEntity2 : list) {
            if (activityEntity2.getContinued().longValue() >= f32534b.get(activityEntity2.getActType()).longValue() * f32533a.get(activityEntity2.getActType()).doubleValue()) {
                activityEntity2.setStepEntities(hfoVar.getStepsCount(activityEntity2.getStart(), Long.valueOf(activityEntity2.getEnd())));
                activityEntity2.updateStepCount();
                activityEntity2.setDisplay(true);
                arrayList.add(activityEntity2);
            }
        }
        for (ActivityEntity activityEntity3 : list2) {
            activityEntity3.setStepEntities(hfoVar.getStepsCount(activityEntity3.getStart(), Long.valueOf(activityEntity3.getEnd())));
            activityEntity3.updateStepCount();
            if (l.longValue() - activityEntity3.getEnd() < d.get(activityEntity3.getActType()).longValue()) {
                activityEntity3.setComplete(false);
            } else {
                activityEntity3.setComplete(true);
            }
            activityEntity3.setDisplay(true);
            activityEntity3.setConfidence(true);
            arrayList.add(activityEntity3);
        }
        if (map.size() != 0) {
            for (ActivityEntity activityEntity4 : map.values()) {
                activityEntity4.setStepEntities(hfoVar.getStepsCount(activityEntity4.getStart(), Long.valueOf(activityEntity4.getEnd())));
                activityEntity4.updateStepCount();
                long jLongValue = l.longValue() - activityEntity4.getEnd();
                j(map, activityEntity4);
                long jLongValue2 = activityEntity4.getContinued().longValue();
                Map<Integer, Long> map2 = f32534b;
                if (jLongValue2 >= map2.get(activityEntity4.getActType()).longValue()) {
                    activityEntity4.setDisplay(true);
                    activityEntity4.setConfidence(true);
                }
                if (jLongValue <= d.get(activityEntity4.getActType()).longValue()) {
                    activityEntity4.setComplete(false);
                    arrayList.add(activityEntity4);
                } else if (activityEntity4.getContinued().longValue() >= c.get(activityEntity4.getActType()).longValue()) {
                    arrayList.add(activityEntity4);
                }
                if (activityEntity4.getContinued().longValue() >= map2.get(activityEntity4.getActType()).longValue() * f32533a.get(activityEntity4.getActType()).doubleValue() && activityEntity4.isComplete()) {
                    activityEntity4.setDisplay(true);
                }
            }
        }
        Collections.sort(arrayList, Comparator.comparingInt(new ToIntFunction() { // from class: ph0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return rh0.v((ActivityEntity) obj);
            }
        }));
        xo0.b(arrayList);
        return new i71(arrayList);
    }

    public static i71 p(List<ActivityEntity> list, Long l, hfo hfoVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        for (ActivityEntity activityEntity : list) {
            if (activityEntity.getContinued().longValue() >= e.get(activityEntity.getActType()).longValue()) {
                activityEntity.setChildActivity();
                long jLongValue = activityEntity.getContinued().longValue();
                Map<Integer, Long> map2 = f32534b;
                if (jLongValue >= map2.get(activityEntity.getActType()).longValue()) {
                    if (map.containsKey(activityEntity.getActType())) {
                        ActivityEntity activityEntity2 = (ActivityEntity) map.get(activityEntity.getActType());
                        if (activityEntity.getStart().longValue() - activityEntity2.getEnd() <= d.get(activityEntity.getActType()).longValue()) {
                            long jLongValue2 = activityEntity2.getContinued().longValue() + activityEntity.getContinued().longValue();
                            activityEntity2.setEnd(activityEntity.getEnd());
                            activityEntity2.setPressureEnd(activityEntity.getPressureEnd());
                            activityEntity2.setContinuedTime(jLongValue2);
                            activityEntity2.addChildActivity(activityEntity.getChildActivity().get(0));
                            n(arrayList3, activityEntity2);
                        } else {
                            n(arrayList3, activityEntity);
                        }
                    } else {
                        n(arrayList3, activityEntity);
                    }
                    j(map, (ActivityEntity) arrayList3.get(arrayList3.size() - 1));
                    m(map, arrayList2, arrayList3);
                    i(map, arrayList3, arrayList, l.longValue());
                    map.clear();
                } else {
                    if (arrayList3.size() > 0) {
                        ActivityEntity activityEntity3 = (ActivityEntity) arrayList3.get(arrayList3.size() - 1);
                        if (activityEntity3.getActType().equals(activityEntity.getActType()) && activityEntity.getStart().longValue() - activityEntity3.getEnd() <= d.get(activityEntity.getActType()).longValue()) {
                            long jLongValue3 = activityEntity3.getContinued().longValue() + activityEntity.getContinued().longValue();
                            activityEntity3.setEnd(activityEntity.getEnd());
                            activityEntity3.setPressureEnd(activityEntity.getPressureEnd());
                            activityEntity3.setContinuedTime(jLongValue3);
                            activityEntity3.addChildActivity(activityEntity.getChildActivity().get(0));
                            j(map, (ActivityEntity) arrayList3.get(arrayList3.size() - 1));
                            i(map, arrayList3, arrayList, l.longValue());
                            map.clear();
                        }
                    }
                    if (map.containsKey(activityEntity.getActType())) {
                        final ActivityEntity activityEntity4 = (ActivityEntity) map.get(activityEntity.getActType());
                        if (activityEntity.getStart().longValue() - activityEntity4.getEnd() <= d.get(activityEntity.getActType()).longValue()) {
                            long jLongValue4 = activityEntity4.getContinued().longValue() + activityEntity.getContinued().longValue();
                            activityEntity4.setEnd(activityEntity.getEnd());
                            activityEntity4.setPressureEnd(activityEntity.getPressureEnd());
                            activityEntity4.setContinuedTime(jLongValue4);
                            activityEntity4.addChildActivity(activityEntity.getChildActivity().get(0));
                            if (jLongValue4 >= map2.get(activityEntity.getActType()).longValue()) {
                                n(arrayList3, activityEntity4);
                                j(map, (ActivityEntity) arrayList3.get(arrayList3.size() - 1));
                                i(map, arrayList3, arrayList, l.longValue());
                                map.clear();
                            }
                        } else {
                            if (k(map, arrayList2, arrayList3, activityEntity4)) {
                                map.entrySet().removeIf(new Predicate() { // from class: kh0
                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        return rh0.w(activityEntity4, (Map.Entry) obj);
                                    }
                                });
                            } else if (h(arrayList, arrayList3, l, activityEntity4)) {
                                map.entrySet().removeIf(new Predicate() { // from class: lh0
                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        return rh0.x(activityEntity4, (Map.Entry) obj);
                                    }
                                });
                            }
                            map.put(activityEntity.getActType(), activityEntity);
                        }
                    } else {
                        map.put(activityEntity.getActType(), activityEntity);
                    }
                }
            }
        }
        return o(arrayList2, arrayList3, map, l, hfoVar, arrayList);
    }

    public static List<ActivityEntity> q(List<ActivityEntity> list, long j) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (ActivityEntity activityEntity : list) {
                if (j - activityEntity.getEnd() < d.get(activityEntity.getActType()).longValue()) {
                    ActivityEntity activityEntityM661clone = activityEntity.m661clone();
                    activityEntityM661clone.setChildActivity();
                    arrayList.add(activityEntityM661clone);
                } else if (activityEntity.getContinued().longValue() >= f32534b.get(activityEntity.getActType()).longValue() * f32533a.get(activityEntity.getActType()).doubleValue()) {
                    ActivityEntity activityEntityM661clone2 = activityEntity.m661clone();
                    activityEntityM661clone2.setChildActivity();
                    activityEntityM661clone2.setComplete(true);
                    activityEntityM661clone2.setDisplay(true);
                    arrayList.add(activityEntityM661clone2);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ int r(ActivityEntity activityEntity) {
        return activityEntity.getContinued().intValue();
    }

    public static /* synthetic */ int s(ActivityEntity activityEntity) {
        return activityEntity.getStart().intValue();
    }

    public static /* synthetic */ int t(ActivityEntity activityEntity) {
        return activityEntity.getContinued().intValue();
    }

    public static /* synthetic */ int u(ActivityEntity activityEntity) {
        return activityEntity.getContinued().intValue();
    }

    public static /* synthetic */ int v(ActivityEntity activityEntity) {
        return activityEntity.getStart().intValue();
    }

    public static /* synthetic */ boolean w(ActivityEntity activityEntity, Map.Entry entry) {
        return dfp.a(((ActivityEntity) entry.getValue()).getStart().longValue(), ((ActivityEntity) entry.getValue()).getEnd(), activityEntity.getStart().longValue(), activityEntity.getEnd());
    }

    public static /* synthetic */ boolean x(ActivityEntity activityEntity, Map.Entry entry) {
        return dfp.a(((ActivityEntity) entry.getValue()).getStart().longValue(), ((ActivityEntity) entry.getValue()).getEnd(), activityEntity.getStart().longValue(), activityEntity.getEnd());
    }

    public static List<ActivityEntity> y(List<wtl> list) {
        int i;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= list.size() - 1) {
                break;
            }
            wtl wtlVar = list.get(i2);
            if (arrayList.size() == 0) {
                arrayList.add(wtlVar);
            } else {
                if (wtlVar.a() != ((wtl) arrayList.get(arrayList.size() - 1)).a()) {
                    arrayList.add(wtlVar);
                }
            }
            i2++;
        }
        arrayList.add(list.get(list.size() - 1));
        ArrayList arrayList2 = new ArrayList();
        for (i = 1; i < arrayList.size(); i++) {
            wtl wtlVar2 = (wtl) arrayList.get(i);
            wtl wtlVar3 = (wtl) arrayList.get(i - 1);
            ActivityEntity activityEntity = new ActivityEntity(Integer.valueOf(wtlVar3.a()), wtlVar3.c(), wtlVar2.c(), wtlVar3.b(), wtlVar2.b());
            activityEntity.setPressureDiff(wtlVar2.b() - wtlVar3.b());
            arrayList2.add(activityEntity);
        }
        return arrayList2;
    }
}
