package xl;

import java.util.Comparator;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b((DateTime) ((p) t7).f128594a, (DateTime) ((p) t14).f128594a);
    }
}
