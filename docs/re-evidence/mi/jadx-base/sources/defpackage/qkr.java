package defpackage;

import com.xiaomi.har.entity.ActivityEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class qkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Double> f31612a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Long> f31613b = new b();

    public static class a extends HashMap<Integer, Double> {
        public a() {
            put(4, Double.valueOf(0.7d));
            Double dValueOf = Double.valueOf(0.8d);
            put(1, dValueOf);
            put(2, dValueOf);
            put(3, Double.valueOf(0.6d));
        }
    }

    public static class b extends HashMap<Integer, Long> {
        public b() {
            put(4, 10000L);
            put(1, 0L);
            put(2, 0L);
            put(3, 0L);
        }
    }

    public static class c implements Comparator<Map.Entry<Integer, Long>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<Integer, Long> entry, Map.Entry<Integer, Long> entry2) {
            return -entry.getValue().compareTo(entry2.getValue());
        }
    }

    public static void a(List<ActivityEntity> list, ActivityEntity activityEntity) {
        if (list.size() <= 0) {
            list.add(activityEntity);
            return;
        }
        ActivityEntity activityEntity2 = list.get(list.size() - 1);
        if (activityEntity2.getActType().equals(activityEntity.getActType())) {
            if (activityEntity.getStart().longValue() - activityEntity2.getEnd() >= 60000) {
                list.add(activityEntity);
                return;
            } else {
                activityEntity2.setEnd(activityEntity.getEnd());
                activityEntity2.setPressureEnd(activityEntity.getPressureEnd());
                return;
            }
        }
        if (activityEntity2.getContinued().longValue() >= 10000 || list.size() <= 1 || !list.get(list.size() - 2).getActType().equals(activityEntity.getActType())) {
            list.add(activityEntity);
            return;
        }
        list.remove(list.size() - 1);
        if (activityEntity.getStart().longValue() - list.get(list.size() - 1).getEnd() >= 60000) {
            list.add(activityEntity);
        } else {
            list.get(list.size() - 1).setEnd(activityEntity.getEnd());
            list.get(list.size() - 1).setPressureEnd(activityEntity.getPressureEnd());
        }
    }

    public static List<ActivityEntity> b(List<ActivityEntity> list) {
        ArrayList arrayList = new ArrayList();
        int size = 0;
        while (size < list.size()) {
            ActivityEntity activityEntity = list.get(size);
            if (!rh0.f32534b.containsKey(activityEntity.getActType()) || activityEntity.getContinued().longValue() < 30000) {
                List<ActivityEntity> listD = d(list, size);
                if (listD.size() > 1) {
                    size += listD.size() - 1;
                }
                List<Map.Entry<Integer, Long>> listC = c(listD);
                if (listC != null) {
                    Integer key = listC.get(0).getKey();
                    float fE = e(listD);
                    ActivityEntity activityEntity2 = new ActivityEntity(key, activityEntity.getStart().longValue(), list.get(size).getEnd(), activityEntity.getPressureStart(), list.get(size).getPressureEnd());
                    activityEntity2.setPressureDiff(fE);
                    if (xo0.c(activityEntity2)) {
                        a(arrayList, activityEntity2);
                    } else if (listC.size() == 2 && listC.get(1).getKey().equals(4)) {
                        activityEntity2.setActType(4);
                        a(arrayList, activityEntity2);
                    }
                }
            } else if (xo0.c(activityEntity)) {
                a(arrayList, activityEntity);
            } else {
                activityEntity.setActType(4);
                a(arrayList, activityEntity);
            }
            size++;
        }
        return arrayList;
    }

    public static List<Map.Entry<Integer, Long>> c(List<ActivityEntity> list) {
        if (list.size() == 0) {
            return null;
        }
        Long lValueOf = 0L;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (ActivityEntity activityEntity : list) {
            f(map, activityEntity);
            if (map2.containsKey(activityEntity.getActType())) {
                map2.put(activityEntity.getActType(), Integer.valueOf(((Integer) map2.get(activityEntity.getActType())).intValue() + 1));
            } else {
                map2.put(activityEntity.getActType(), 1);
            }
            lValueOf = Long.valueOf(lValueOf.longValue() + activityEntity.getContinued().longValue());
        }
        List<Map.Entry<Integer, Long>> listG = g(map);
        Integer key = listG.get(0).getKey();
        Long value = listG.get(0).getValue();
        Map<Integer, Double> map3 = f31612a;
        if (!map3.containsKey(key) || value.longValue() < Math.max(map3.get(key).doubleValue() * lValueOf.longValue(), f31613b.getOrDefault(key, 0L).longValue()) || value.longValue() / ((long) ((Integer) map2.get(key)).intValue()) <= 1500) {
            return null;
        }
        return listG;
    }

    public static List<ActivityEntity> d(List<ActivityEntity> list, int i) {
        long jLongValue = list.get(i).getStart().longValue();
        ArrayList arrayList = new ArrayList();
        while (i < list.size()) {
            ActivityEntity activityEntity = list.get(i);
            if (activityEntity.getEnd() > 30000 + jLongValue) {
                break;
            }
            arrayList.add(activityEntity);
            i++;
        }
        return arrayList;
    }

    public static float e(List<ActivityEntity> list) {
        Iterator<ActivityEntity> it = list.iterator();
        float pressureDiff = 0.0f;
        while (it.hasNext()) {
            pressureDiff += it.next().getPressureDiff();
        }
        return pressureDiff;
    }

    public static void f(Map<Integer, Long> map, ActivityEntity activityEntity) {
        if (map.containsKey(activityEntity.getActType())) {
            map.put(activityEntity.getActType(), Long.valueOf(map.get(activityEntity.getActType()).longValue() + activityEntity.getContinued().longValue()));
        } else {
            map.put(activityEntity.getActType(), activityEntity.getContinued());
        }
    }

    public static List<Map.Entry<Integer, Long>> g(Map<Integer, Long> map) {
        LinkedList linkedList = new LinkedList(map.entrySet());
        Collections.sort(linkedList, new c());
        return linkedList;
    }
}
