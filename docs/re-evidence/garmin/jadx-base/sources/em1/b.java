package em1;

import c22.t;
import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lem1/b;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f64618a = new b();

    private b() {
    }

    public static float a(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return 2.0f;
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Double.valueOf(Math.abs(((Number) it.next()).doubleValue())));
        }
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            t.g();
            return 0.0f;
        }
        Object next = it3.next();
        if (it3.hasNext()) {
            double dDoubleValue = ((Number) next).doubleValue();
            do {
                Object next2 = it3.next();
                double dDoubleValue2 = ((Number) next2).doubleValue();
                if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                    next = next2;
                    dDoubleValue = dDoubleValue2;
                }
            } while (it3.hasNext());
        }
        return (float) Math.ceil((float) ((Number) next).doubleValue());
    }

    public static Integer b(Long l14, DateTime dateTime, DateTimeZone dateTimeZone) {
        if (l14 == null) {
            return Integer.MIN_VALUE;
        }
        long jLongValue = l14.longValue();
        Long lValueOf = Long.valueOf(jLongValue);
        if (jLongValue <= 0) {
            lValueOf = null;
        }
        DateTime dateTime2 = lValueOf != null ? new DateTime(lValueOf.longValue(), dateTimeZone) : null;
        if (dateTime2 != null) {
            return Integer.valueOf(oc.b.v(dateTime2, dateTime));
        }
        return null;
    }
}
