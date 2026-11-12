package fb1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfb1/l;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<cx0.a<ww0.b>> f70260a = new y0<>();

    public final y0 x4(LocalDate localDate, ww0.b bVar, db1.a aVar, int i14) {
        if (bVar == null) {
            ww0.b.f187523n.getClass();
            bVar = ww0.b.a.a(localDate);
        }
        List<db1.a> listD = bVar.d();
        ArrayList arrayList = listD != null ? new ArrayList(p13.h0.Z(listD)) : new ArrayList();
        if (aVar != null) {
            if (i14 >= 0 && i14 < arrayList.size()) {
                arrayList.set(i14, aVar);
            } else if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
        } else if (i14 >= 0 && i14 < arrayList.size()) {
            arrayList.remove(i14);
        }
        bVar.r(arrayList);
        ge1.b.T(v1.a(this), null, null, new k(localDate, bVar, this, null), 3);
        return this.f70260a;
    }
}
