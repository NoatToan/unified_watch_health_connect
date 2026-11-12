package sr1;

import java.util.Comparator;
import m92.h0;
import m92.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Float.valueOf(i0.b((h0.e.c) t7)), Float.valueOf(i0.b((h0.e.c) t14)));
    }
}
