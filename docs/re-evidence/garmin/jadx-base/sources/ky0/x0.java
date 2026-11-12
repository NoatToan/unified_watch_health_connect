package ky0;

import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class x0<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b((Long) ((Map.Entry) t14).getValue(), (Long) ((Map.Entry) t7).getValue());
    }
}
