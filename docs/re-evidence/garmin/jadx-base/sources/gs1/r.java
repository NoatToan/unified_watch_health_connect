package gs1;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class r<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b((Long) ((List) t7).get(0), (Long) ((List) t14).get(0));
    }
}
