package defpackage;

import com.xiaomi.har.entity.ActivityEntity;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class zg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hfo f41237a;

    public i71 a(List<wtl> list, List<ActivityEntity> list2, long j, long j2, List<o7i> list3) {
        List<ActivityEntity> listY;
        if (list.size() <= 1 || (listY = rh0.y(list)) == null || listY.size() == 0) {
            return null;
        }
        List<ActivityEntity> listB = qkr.b(listY);
        if (listB.size() == 0) {
            return null;
        }
        List<ActivityEntity> listQ = rh0.q(list2, j);
        listQ.addAll(listB);
        i71 i71VarP = rh0.p(listQ, Long.valueOf(j2), this.f41237a);
        if (list3 != null && list3.size() >= 2) {
            q7i.b(list3, i71VarP.b());
            x61.b(i71VarP.b());
        }
        return i71VarP;
    }

    public void b(hfo hfoVar) {
        this.f41237a = hfoVar;
    }
}
