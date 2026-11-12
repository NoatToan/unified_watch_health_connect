package defpackage;

import com.xiaomi.har.entity.ActivityEntity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class q7i {
    public static int a(List<o7i> list, ActivityEntity activityEntity, int i) {
        long jLongValue = activityEntity.getStart().longValue();
        long end = activityEntity.getEnd();
        for (int i2 = i; i2 < list.size(); i2++) {
            o7i o7iVar = list.get(i2);
            if (o7iVar.c() >= jLongValue && o7iVar.c() <= end) {
                o7iVar.d(x61.c(o7iVar.b()));
                if (activityEntity.getPressures().size() <= 0 || activityEntity.getPressures().get(activityEntity.getPressures().size() - 1).c() < o7iVar.c()) {
                    activityEntity.getPressures().add(o7iVar);
                }
            }
            if (o7iVar.c() > end) {
                return i2;
            }
        }
        return i;
    }

    public static void b(List<o7i> list, List<ActivityEntity> list2) {
        Iterator<ActivityEntity> it = list2.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA = a(list, it.next(), iA);
        }
    }
}
