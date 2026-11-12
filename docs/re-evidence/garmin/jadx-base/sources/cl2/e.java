package cl2;

import java.util.Comparator;
import p005kotlin.Metadata;
import pk2.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class e<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Integer.valueOf(((x) t7).f138496a.ordinal()), Integer.valueOf(((x) t14).f138496a.ordinal()));
    }
}
