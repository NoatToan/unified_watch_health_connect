package wq;

import java.util.Comparator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        DateTime startDateTime = ((x1) t7).getStartDateTime();
        Long lValueOf = Long.valueOf(startDateTime != null ? startDateTime.getMillis() : 0L);
        DateTime startDateTime2 = ((x1) t14).getStartDateTime();
        return r13.a.b(lValueOf, Long.valueOf(startDateTime2 != null ? startDateTime2.getMillis() : 0L));
    }
}
