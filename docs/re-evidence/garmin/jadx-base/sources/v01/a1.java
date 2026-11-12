package v01;

import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a1<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f174211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f174212b;

    public a1(Comparator comparator, Map map) {
        this.f174211a = comparator;
        this.f174212b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Integer num = Integer.MAX_VALUE;
        int iCompare = this.f174211a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        String str = ((qd1.a) t7).f144476b;
        Map map = this.f174212b;
        Integer num2 = (Integer) map.get(str);
        if (num2 == null) {
            num2 = num;
        }
        Integer num3 = (Integer) map.get(((qd1.a) t14).f144476b);
        return r13.a.b(num2, num3 != null ? num3 : Integer.MAX_VALUE);
    }
}
