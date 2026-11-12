package defpackage;

import com.xiaomi.har.entity.ActivityEntity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class x61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Integer> f38739a = new a();

    public static class a extends HashMap<Integer, Integer> {
        public a() {
            put(3, 10);
            put(1, 20);
            put(2, 20);
            put(4, 20);
            put(0, 60);
        }
    }

    public static void a(ActivityEntity activityEntity) {
        List<o7i> pressures = activityEntity.getPressures();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 1; i < pressures.size(); i++) {
            double dA = pressures.get(i).a() - pressures.get(i - 1).a();
            if (dA > 0.0d) {
                f = (float) (((double) f) + dA);
            } else {
                f2 = (float) (((double) f2) + dA);
            }
        }
        activityEntity.setTotalUpAltitude(f);
        activityEntity.setTotalDownAltitude(f2);
    }

    public static void b(List<ActivityEntity> list) {
        Iterator<ActivityEntity> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public static float c(float f) {
        return (float) ((1.0d - Math.pow(f / 1013.25f, 0.1902587519025875d)) * 44300.0d);
    }
}
