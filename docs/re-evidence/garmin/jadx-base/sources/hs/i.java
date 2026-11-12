package hs;

import java.util.Comparator;
import nr.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Integer.valueOf(((r) t7).f127311a.getSortOrder()), Integer.valueOf(((r) t14).f127311a.getSortOrder()));
    }
}
