package gn;

import java.util.Comparator;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        LocalDateTime localDateTime = ((pb2.b.C2596b) t7).f136914a;
        LocalDate localDate = localDateTime != null ? localDateTime.toLocalDate() : null;
        LocalDateTime localDateTime2 = ((pb2.b.C2596b) t14).f136914a;
        return r13.a.b(localDate, localDateTime2 != null ? localDateTime2.toLocalDate() : null);
    }
}
