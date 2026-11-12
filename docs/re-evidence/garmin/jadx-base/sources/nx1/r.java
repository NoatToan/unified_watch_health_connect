package nx1;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class r<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        kx1.a aVar = (kx1.a) t7;
        String str = aVar.f107118c;
        if (str == null) {
            str = aVar.f107116a;
        }
        kx1.a aVar2 = (kx1.a) t14;
        String str2 = aVar2.f107118c;
        if (str2 == null) {
            str2 = aVar2.f107116a;
        }
        return r13.a.b(str, str2);
    }
}
