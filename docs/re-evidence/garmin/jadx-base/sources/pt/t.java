package pt;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Number number = (Number) t14;
        Number number2 = (Number) t7;
        return r13.a.b(number != null ? Double.valueOf(number.doubleValue()) : null, number2 != null ? Double.valueOf(number2.doubleValue()) : null);
    }
}
