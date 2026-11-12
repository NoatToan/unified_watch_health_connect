package defpackage;

import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public class lir implements Comparator<HealthDetail>, Serializable {
    private static final long serialVersionUID = 537036553028345437L;

    public static lir b() {
        return d.f40312b;
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final lir f40312b = new lir();
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(HealthDetail healthDetail, HealthDetail healthDetail2) {
        if (healthDetail == null || healthDetail2 == null) {
            return 0;
        }
        int iD = d(Long.valueOf(healthDetail.getVersion()), Long.valueOf(healthDetail2.getVersion()));
        return iD != 0 ? iD : d(healthDetail.getStartTime(), healthDetail2.getStartTime());
    }

    private int d(Long l, Long l2) {
        long jLongValue = l == null ? 0L : l.longValue();
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        if (jLongValue > jLongValue2) {
            return 1;
        }
        return jLongValue < jLongValue2 ? -1 : 0;
    }
}
