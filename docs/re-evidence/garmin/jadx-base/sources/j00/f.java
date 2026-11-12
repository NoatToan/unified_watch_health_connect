package j00;

import java.util.ArrayList;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj00/f;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f95974a = new f();

    private f() {
    }

    public static ArrayList a(f fVar, DateTime dateTime, DateTime dateTime2, int i14, int i15) {
        if ((i15 & 16) != 0) {
            g.f95975a.getClass();
            i14 = g.a(1, dateTime, dateTime2) + 1;
        }
        fVar.getClass();
        if (i14 <= 0) {
            i14 = 0;
        }
        ArrayList arrayList = new ArrayList(i14);
        for (int i16 = 0; i16 < i14; i16++) {
            arrayList.add(null);
        }
        if (arrayList.size() > 0) {
            g.f95975a.getClass();
            int iA = g.a(1, dateTime, dateTime);
            int iA2 = g.a(1, dateTime, dateTime2);
            if (iA < iA2 && iA <= iA2) {
                while (true) {
                    arrayList.set(iA, dateTime.plusMinutes(iA));
                    if (iA == iA2) {
                        break;
                    }
                    iA++;
                }
            }
        }
        return arrayList;
    }
}
