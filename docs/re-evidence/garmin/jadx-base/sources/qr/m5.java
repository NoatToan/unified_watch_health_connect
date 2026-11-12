package qr;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m5<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Boolean.valueOf(((nr.p0) t14).f127286e instanceof nr.p0.a.b), Boolean.valueOf(((nr.p0) t7).f127286e instanceof nr.p0.a.b));
    }
}
