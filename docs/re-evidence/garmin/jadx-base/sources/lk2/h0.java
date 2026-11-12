package lk2;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class h0 extends p005kotlin.jvm.internal.q implements e23.p<Long, Long, Unit> {
    public h0(Object obj) {
        super(2, obj, c0.class, "onProgress", "onProgress(JJ)V", 0);
    }

    @Override // e23.p
    public final Unit invoke(Long l14, Long l15) {
        long jLongValue = l14.longValue();
        long jLongValue2 = l15.longValue();
        c0 c0Var = (c0) this.receiver;
        Iterator<e23.p<Long, Long, Unit>> it = c0Var.f113174l.iterator();
        it.getClass();
        while (it.hasNext()) {
            try {
                it.next().invoke(Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
            } catch (Exception e4) {
                ds.e0.v("Progress listener threw exception: ", e4.getMessage(), c0Var.f113167e);
            }
        }
        return Unit.INSTANCE;
    }
}
