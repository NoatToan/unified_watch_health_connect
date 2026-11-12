package gh2;

import android.util.Pair;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class e<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b((String) ((Pair) t7).first, (String) ((Pair) t14).first);
    }
}
