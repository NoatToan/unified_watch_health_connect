package v01;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class r<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f174515a;

    public r(Comparator comparator) {
        this.f174515a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Integer num = 1;
        int iCompare = this.f174515a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        g21.o oVar = (g21.o) t7;
        Integer num2 = (oVar.f75467e != null || oVar.f75464b.equals(b11.c.SNACKS.f14250a)) ? num : 0;
        g21.o oVar2 = (g21.o) t14;
        if (oVar2.f75467e == null && !oVar2.f75464b.equals(b11.c.SNACKS.f14250a)) {
            num = 0;
        }
        return r13.a.b(num2, num);
    }
}
