package ca0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class l3 extends p005kotlin.jvm.internal.q implements e23.l<mb0.b, Unit> {
    public l3(Object obj) {
        super(1, obj, kb0.r.class, "onSleepWindowDayOfWeekItemStateChanged", "onSleepWindowDayOfWeekItemStateChanged(Lcom/garmin/android/apps/connectmobile/device/setup/presentation/profile/sleep/model/DayOfWeekItem;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(mb0.b bVar) {
        Object value;
        mb0.f fVar;
        mb0.b bVar2 = bVar;
        bVar2.getClass();
        kb0.r rVar = (kb0.r) this.receiver;
        rVar.getClass();
        r53.p2 p2Var = rVar.f103807a;
        List<mb0.b> list = ((mb0.f) p2Var.getValue()).f117731b.f117713d;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (mb0.b bVarA : list) {
            if (bVarA.f117715a == bVar2.f117715a) {
                mb0.c cVar = bVar2.f117716b;
                mb0.c cVar2 = mb0.c.UNSELECTED;
                if (cVar == cVar2) {
                    cVar2 = mb0.c.SELECTED;
                }
                bVarA = mb0.b.a(bVarA, cVar2);
            }
            arrayList.add(bVarA);
        }
        do {
            value = p2Var.getValue();
            fVar = (mb0.f) value;
        } while (!p2Var.b(value, mb0.f.a(fVar, null, mb0.a.a(fVar.f117731b, 0, 0, null, arrayList, false, 23), null, null, null, 29)));
        return Unit.INSTANCE;
    }
}
