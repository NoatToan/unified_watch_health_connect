package ca0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class q3 extends p005kotlin.jvm.internal.q implements e23.l<z80.j, Unit> {
    public q3(Object obj) {
        super(1, obj, kb0.r.class, "onEditSleepWindowSelected", "onEditSleepWindowSelected(Lcom/garmin/android/apps/connectmobile/device/setup/data/model/SleepWindowData;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(z80.j jVar) {
        Object value;
        mb0.f fVar;
        b63.v vVar;
        b63.v vVar2;
        ArrayList arrayList;
        z80.j jVar2 = jVar;
        jVar2.getClass();
        kb0.r rVar = (kb0.r) this.receiver;
        rVar.getClass();
        r53.p2 p2Var = rVar.f103807a;
        do {
            value = p2Var.getValue();
            fVar = (mb0.f) value;
            vVar = jVar2.f203063b;
            vVar2 = jVar2.f203064c;
            Set setG1 = p13.h0.g1(jVar2.f203062a);
            List<z80.j> list = ((mb0.f) p2Var.getValue()).f117731b.f117712c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!p005kotlin.jvm.internal.s.g((z80.j) obj, jVar2)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                p13.d0.v(arrayList3, ((z80.j) it.next()).f203062a);
            }
            Set setG2 = p13.h0.g1(arrayList3);
            List<mb0.h> listN0 = p13.h0.N0(mb0.h.f117748m, rVar.f103810d);
            arrayList = new ArrayList(p13.y.r(listN0, 10));
            for (mb0.h hVar : listN0) {
                arrayList.add(new mb0.b(hVar, setG1.contains(hVar) ? mb0.c.SELECTED : setG2.contains(hVar) ? mb0.c.ALREADY_SELECTED_CLICKABLE : mb0.c.UNSELECTED));
            }
        } while (!p2Var.b(value, mb0.f.a(fVar, null, null, new mb0.d(jVar2, arrayList, vVar, vVar2, null, 16, null), null, null, 27)));
        return Unit.INSTANCE;
    }
}
