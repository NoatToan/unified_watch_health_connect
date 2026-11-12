package t70;

import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f162931a;

    public m0(Map map) {
        this.f162931a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iIntValue;
        o70.r rVar = ((c1.b) t7).f162822b;
        boolean z14 = rVar instanceof o70.o;
        int iIntValue2 = Integer.MAX_VALUE;
        Map map = this.f162931a;
        if (z14) {
            iIntValue = Integer.MIN_VALUE;
        } else {
            if (!(rVar instanceof o70.c)) {
                lc.u0.r();
                return 0;
            }
            Integer num = (Integer) map.get(((o70.c) rVar).d());
            iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        o70.r rVar2 = ((c1.b) t14).f162822b;
        if (rVar2 instanceof o70.o) {
            iIntValue2 = Integer.MIN_VALUE;
        } else {
            if (!(rVar2 instanceof o70.c)) {
                lc.u0.r();
                return 0;
            }
            Integer num2 = (Integer) map.get(((o70.c) rVar2).d());
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
        }
        return r13.a.b(numValueOf, Integer.valueOf(iIntValue2));
    }
}
