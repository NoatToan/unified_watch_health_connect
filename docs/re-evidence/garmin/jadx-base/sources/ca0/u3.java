package ca0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class u3 extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public u3(Object obj) {
        super(0, obj, kb0.r.class, "onEditSleepWindowSaved", "onEditSleepWindowSaved()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        b63.v vVar;
        b63.v vVar2;
        Object value;
        mb0.f fVar;
        Object value2;
        mb0.f fVar2;
        Object value3;
        mb0.f fVar3;
        kb0.r rVar = (kb0.r) this.receiver;
        r53.p2 p2Var = rVar.f103807a;
        mb0.d dVar = ((mb0.f) p2Var.getValue()).f117732c;
        z80.j jVar = dVar.f117723a;
        if (jVar != null && (vVar = dVar.f117725c) != null && (vVar2 = dVar.f117726d) != null) {
            List<mb0.b> list = dVar.f117724b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((mb0.b) obj).f117716b == mb0.c.SELECTED) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((mb0.b) it.next()).f117715a);
            }
            ArrayList arrayListD1 = p13.h0.d1(((mb0.f) p2Var.getValue()).f117731b.f117712c);
            Iterator it3 = arrayListD1.iterator();
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i15 = -1;
                    break;
                }
                if (((z80.j) it3.next()).f203062a.equals(jVar.f203062a)) {
                    break;
                }
                i15++;
            }
            if (i15 != -1) {
                if (arrayList2.isEmpty()) {
                    arrayListD1.remove(i15);
                    do {
                        value3 = p2Var.getValue();
                        fVar3 = (mb0.f) value3;
                    } while (!p2Var.b(value3, mb0.f.a(fVar3, null, mb0.a.a(fVar3.f117731b, 0, 0, arrayListD1, null, false, 27), null, null, null, 29)));
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayListD1) {
                        int i16 = i14 + 1;
                        if (i14 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        if (i14 != i15) {
                            arrayList3.add(obj2);
                        }
                        i14 = i16;
                    }
                    if (kb0.r.A4(arrayList3, arrayList2, vVar, vVar2)) {
                        do {
                            value2 = p2Var.getValue();
                            fVar2 = (mb0.f) value2;
                        } while (!p2Var.b(value2, mb0.f.a(fVar2, null, mb0.a.a(fVar2.f117731b, 0, 0, null, null, true, 15), null, null, null, 29)));
                    } else {
                        arrayListD1.set(i15, new z80.j(arrayList2, vVar, vVar2));
                        do {
                            value = p2Var.getValue();
                            fVar = (mb0.f) value;
                        } while (!p2Var.b(value, mb0.f.a(fVar, null, mb0.a.a(fVar.f117731b, 0, 0, rVar.C4(arrayListD1), null, false, 27), null, null, null, 29)));
                    }
                }
                rVar.y4();
            } else {
                rVar.y4();
            }
        }
        return Unit.INSTANCE;
    }
}
