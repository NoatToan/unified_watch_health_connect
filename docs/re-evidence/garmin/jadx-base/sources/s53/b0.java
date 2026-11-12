package s53;

import p005kotlin.Metadata;
import r53.e2;
import r53.o2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls53/b0;", "Lr53/o2;", "", "Lr53/e2;", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 extends e2<Integer> implements o2<Integer> {
    public b0(int i14) {
        super(1, Integer.MAX_VALUE, q53.a.DROP_OLDEST);
        d(Integer.valueOf(i14));
    }

    @Override // r53.o2, r53.z1
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(r().intValue());
        }
        return numValueOf;
    }

    public final void y(int i14) {
        synchronized (this) {
            d(Integer.valueOf(r().intValue() + i14));
        }
    }
}
