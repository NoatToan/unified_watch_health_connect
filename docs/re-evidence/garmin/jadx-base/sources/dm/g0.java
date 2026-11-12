package dm;

import java.util.Comparator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        DateTime startTimeGMT;
        DateTime startTimeGMT2;
        com.garmin.android.apps.connectmobile.activities.newmodel.f0 split = ((com.garmin.android.apps.connectmobile.activities.newmodel.c0) t7).getSplit();
        long millis = -1;
        Long lValueOf = Long.valueOf((split == null || (startTimeGMT2 = split.getStartTimeGMT()) == null) ? -1L : startTimeGMT2.getMillis());
        com.garmin.android.apps.connectmobile.activities.newmodel.f0 split2 = ((com.garmin.android.apps.connectmobile.activities.newmodel.c0) t14).getSplit();
        if (split2 != null && (startTimeGMT = split2.getStartTimeGMT()) != null) {
            millis = startTimeGMT.getMillis();
        }
        return r13.a.b(lValueOf, Long.valueOf(millis));
    }
}
