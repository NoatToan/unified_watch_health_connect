package co;

import am.x0;
import am.z0;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        z0.f4390a.getClass();
        ?? r14 = z0.f4391b;
        Integer num = (Integer) r14.get((x0) t7);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        Integer num2 = (Integer) r14.get((x0) t14);
        return r13.a.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
