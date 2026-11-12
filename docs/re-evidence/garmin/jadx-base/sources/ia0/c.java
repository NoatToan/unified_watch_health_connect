package ia0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Boolean enabled = ((z80.g) t14).getEnabled();
        if (enabled == null) {
            enabled = Boolean.FALSE;
        }
        Boolean enabled2 = ((z80.g) t7).getEnabled();
        if (enabled2 == null) {
            enabled2 = Boolean.FALSE;
        }
        return r13.a.b(enabled, enabled2);
    }
}
