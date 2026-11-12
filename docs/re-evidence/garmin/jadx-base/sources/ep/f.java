package ep;

import c22.l3;
import java.util.List;
import org.joda.time.DateTimeConstants;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Integer> f64816a = x.k(1, 2, 5, 10, 20, 30, 60, 120, 300, 600, 1200, 1800, Integer.valueOf(DateTimeConstants.SECONDS_PER_HOUR), 7200, 18000);

    public static final String a(float f14, boolean z14) {
        if (z14) {
            String str = l3.f23125c.format(Float.valueOf(f14));
            str.getClass();
            return str;
        }
        l3.f23124b.getClass();
        String str2 = l3.f23131i.format(Float.valueOf(f14));
        str2.getClass();
        return str2;
    }
}
