package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class t3 extends p005kotlin.jvm.internal.q implements e23.l<mb0.b, Unit> {
    public t3(Object obj) {
        super(1, obj, kb0.r.class, "onEditDayOfWeekItemStateChanged", "onEditDayOfWeekItemStateChanged(Lcom/garmin/android/apps/connectmobile/device/setup/presentation/profile/sleep/model/DayOfWeekItem;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(mb0.b bVar) {
        Object value;
        mb0.f fVar;
        mb0.b bVar2 = bVar;
        bVar2.getClass();
        kb0.r rVar = (kb0.r) this.receiver;
        rVar.getClass();
        mb0.h hVar = bVar2.f117715a;
        int i14 = kb0.r.a.f103812a[bVar2.f117716b.ordinal()];
        if (i14 == 1) {
            rVar.G4(hVar, mb0.c.SELECTED);
        } else if (i14 == 2) {
            rVar.G4(hVar, mb0.c.UNSELECTED);
        } else if (i14 == 3) {
            r53.p2 p2Var = rVar.f103807a;
            do {
                value = p2Var.getValue();
                fVar = (mb0.f) value;
            } while (!p2Var.b(value, mb0.f.a(fVar, null, null, mb0.d.a(fVar.f117732c, null, null, null, hVar, 15), null, null, 27)));
        } else if (i14 != 4) {
            lc.u0.r();
            return null;
        }
        return Unit.INSTANCE;
    }
}
