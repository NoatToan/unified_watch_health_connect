package qm0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class l extends p005kotlin.jvm.internal.q implements e23.l<d0, Unit> {
    public l(Object obj) {
        super(1, obj, d.class, "onRemoveActivityVideoEvent", "onRemoveActivityVideoEvent(Lcom/garmin/android/apps/connectmobile/group/details/feed/RemoveVideoEvent;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(d0 d0Var) {
        d0 d0Var2 = d0Var;
        d0Var2.getClass();
        d dVar = (d) this.receiver;
        d.a aVar = d.E;
        p pVarD7 = dVar.d7();
        long j8 = d0Var2.f145509a;
        pVarD7.getClass();
        wg0.a aVarA4 = pVarD7.A4(String.valueOf(j8));
        if (aVarA4 != null) {
            wg0.l lVar = aVarA4.f185059r;
            pVarD7.H4(wg0.a.b(aVarA4, null, lVar != null ? wg0.l.b(lVar, lVar.f185102a, lVar.f185103b, 24) : null, null, null, null, 536739839));
        }
        return Unit.INSTANCE;
    }
}
