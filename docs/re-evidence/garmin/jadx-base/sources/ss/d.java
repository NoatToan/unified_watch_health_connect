package ss;

import java.util.Comparator;
import p005kotlin.Metadata;
import ps.q1;
import ps.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        q1 summaryDTO = ((r) t7).getSummaryDTO();
        Long lValueOf = Long.valueOf(summaryDTO != null ? summaryDTO.c5() : 0L);
        q1 summaryDTO2 = ((r) t14).getSummaryDTO();
        return r13.a.b(lValueOf, Long.valueOf(summaryDTO2 != null ? summaryDTO2.c5() : 0L));
    }
}
