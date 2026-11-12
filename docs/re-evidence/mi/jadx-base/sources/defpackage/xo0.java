package defpackage;

import com.amap.api.maps.utils.SpatialRelationUtil;
import com.xiaomi.har.entity.ActivityEntity;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes10.dex */
public class xo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Integer> f39298a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Integer> f39299b = new b();

    public static class a extends HashMap<Integer, Integer> {
        public a() {
            put(4, 40);
            put(1, 0);
            put(2, 70);
            put(3, 30);
        }
    }

    public static class b extends HashMap<Integer, Integer> {
        public b() {
            Integer numValueOf = Integer.valueOf(HMSedentaryConfig.INGORE_START_INDEX);
            put(4, numValueOf);
            put(1, numValueOf);
            put(2, numValueOf);
            put(3, Integer.valueOf(SpatialRelationUtil.A_CIRCLE_DEGREE));
        }
    }

    public static void b(List<ActivityEntity> list) {
        list.removeIf(new Predicate() { // from class: wo0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return xo0.f((ActivityEntity) obj);
            }
        });
        for (ActivityEntity activityEntity : list) {
            if (activityEntity.isDisplay() && d(activityEntity)) {
                e(activityEntity);
            }
        }
    }

    public static boolean c(ActivityEntity activityEntity) {
        if (!activityEntity.getActType().equals(3) || (Math.abs(activityEntity.getUpHeight()) * 1000.0f) / activityEntity.getContinued().longValue() >= 0.15f) {
            return true;
        }
        activityEntity.setDisplay(false);
        activityEntity.setConfidence(false);
        return false;
    }

    public static boolean d(ActivityEntity activityEntity) {
        if (((((double) activityEntity.getStepCount()) * 1.0d) / (activityEntity.getEnd() - activityEntity.getStart().longValue())) * 60000.0d >= f39298a.get(activityEntity.getActType()).intValue()) {
            return true;
        }
        activityEntity.setConfidence(false);
        activityEntity.setDisplay(false);
        return false;
    }

    public static boolean e(ActivityEntity activityEntity) {
        if (activityEntity.getEnd() - activityEntity.getStart().longValue() < ((long) f39299b.get(activityEntity.getActType()).intValue()) * 60000) {
            return true;
        }
        activityEntity.setConfidence(false);
        return false;
    }

    public static /* synthetic */ boolean f(ActivityEntity activityEntity) {
        return !c(activityEntity);
    }
}
