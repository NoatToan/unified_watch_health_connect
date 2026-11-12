package y80;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class v0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        wi1.l.c.a aVar = wi1.l.c.f185582b;
        String sleepWindowFrequency = ((wi1.l) t7).getSleepWindowFrequency();
        aVar.getClass();
        wi1.l.c cVarA = wi1.l.c.a.a(sleepWindowFrequency);
        Integer numValueOf = Integer.valueOf(cVarA != null ? cVarA.ordinal() : Integer.MAX_VALUE);
        wi1.l.c cVarA2 = wi1.l.c.a.a(((wi1.l) t14).getSleepWindowFrequency());
        return r13.a.b(numValueOf, Integer.valueOf(cVarA2 != null ? cVarA2.ordinal() : Integer.MAX_VALUE));
    }
}
