package ca0;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class o3 extends p005kotlin.jvm.internal.q implements e23.l<mb0.h, Unit> {
    public o3(Object obj) {
        super(1, obj, kb0.r.class, "onReassignDayConfirmed", "onReassignDayConfirmed(Lcom/garmin/android/apps/connectmobile/device/setup/presentation/profile/sleep/model/Weekday;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(mb0.h hVar) {
        Object value;
        mb0.f fVar;
        Object value2;
        mb0.f fVar2;
        mb0.h hVar2 = hVar;
        hVar2.getClass();
        kb0.r rVar = (kb0.r) this.receiver;
        rVar.getClass();
        r53.p2 p2Var = rVar.f103807a;
        ArrayList arrayListD1 = p13.h0.d1(((mb0.f) p2Var.getValue()).f117731b.f117712c);
        Iterator it = arrayListD1.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (((z80.j) it.next()).f203062a.contains(hVar2)) {
                break;
            }
            i14++;
        }
        if (i14 != -1) {
            z80.j jVar = (z80.j) arrayListD1.get(i14);
            if (jVar.f203062a.size() == 1) {
                arrayListD1.remove(i14);
            } else {
                arrayListD1.set(i14, z80.j.a(jVar, p13.h0.y0(jVar.f203062a, hVar2)));
            }
            do {
                value2 = p2Var.getValue();
                fVar2 = (mb0.f) value2;
            } while (!p2Var.b(value2, mb0.f.a(fVar2, null, mb0.a.a(fVar2.f117731b, 0, 0, arrayListD1, null, false, 27), null, null, null, 29)));
        }
        rVar.G4(hVar2, mb0.c.SELECTED);
        do {
            value = p2Var.getValue();
            fVar = (mb0.f) value;
        } while (!p2Var.b(value, mb0.f.a(fVar, null, null, mb0.d.a(fVar.f117732c, null, null, null, null, 15), null, null, 27)));
        return Unit.INSTANCE;
    }
}
