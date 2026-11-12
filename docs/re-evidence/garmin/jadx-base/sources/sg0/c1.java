package sg0;

import java.util.Comparator;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        String lowerCase;
        String fullName = ((ue0.l) t7).getFullName();
        String lowerCase2 = null;
        if (fullName != null) {
            lowerCase = fullName.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        String fullName2 = ((ue0.l) t14).getFullName();
        if (fullName2 != null) {
            lowerCase2 = fullName2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
        }
        return r13.a.b(lowerCase, lowerCase2);
    }
}
