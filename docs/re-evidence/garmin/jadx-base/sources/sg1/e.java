package sg1;

import java.util.Comparator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        DateTime date = ((qg1.b) t14).getDate();
        Long lValueOf = date != null ? Long.valueOf(date.getMillis()) : null;
        DateTime date2 = ((qg1.b) t7).getDate();
        return r13.a.b(lValueOf, date2 != null ? Long.valueOf(date2.getMillis()) : null);
    }
}
