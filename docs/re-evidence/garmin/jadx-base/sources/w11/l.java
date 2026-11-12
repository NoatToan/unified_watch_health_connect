package w11;

import androidx.room.a0;
import c2.x2;
import i3.i7;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class l implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v11.b f181233a;

    public l(v11.b bVar) {
        this.f181233a = bVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            u4.d dVar = ((v11.b.a) this.f181233a).f174669b;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            i7.b(dVar, null, x2.q(aVar, j92.b.f97901d.f97904c), a0.c(mVar2), mVar2, 48, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
