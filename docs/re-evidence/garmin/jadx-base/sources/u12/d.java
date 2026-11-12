package u12;

import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f167772a;

    public d(Map map) {
        this.f167772a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        String str = ((ip.a) t7).f94639a.f4358a;
        Map map = this.f167772a;
        Integer num = (Integer) map.get(str);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        Integer num2 = (Integer) map.get(((ip.a) t14).f94639a.f4358a);
        return r13.a.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
