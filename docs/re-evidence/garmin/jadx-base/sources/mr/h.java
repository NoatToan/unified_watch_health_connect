package mr;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/h;", "Lmr/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements a {
    @Override // mr.a
    public final List<jr.f> a(jr.d dVar) {
        Object next;
        Iterator<T> it = dVar.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((jr.u) next).d() != jr.v.CHARTS);
        jr.u uVar = (jr.u) next;
        if (uVar != null) {
            return uVar.a();
        }
        return null;
    }
}
