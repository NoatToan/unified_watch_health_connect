package tu1;

import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f166482a;

    public e(Map map) {
        this.f166482a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        q qVar = ((mv1.f) t7).f121192a;
        Map map = this.f166482a;
        Integer num = (Integer) map.get(qVar);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        Integer num2 = (Integer) map.get(((mv1.f) t14).f121192a);
        return r13.a.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
