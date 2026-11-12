package ep0;

import am.x0;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        x0 x0Var = ((y) t14).f64911h;
        x0 x0Var2 = x0.f4346x;
        return r13.a.b(Boolean.valueOf(x0Var != x0Var2), Boolean.valueOf(((y) t7).f64911h != x0Var2));
    }
}
