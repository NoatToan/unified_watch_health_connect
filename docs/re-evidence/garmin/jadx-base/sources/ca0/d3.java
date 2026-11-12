package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class d3 extends p005kotlin.jvm.internal.q implements e23.l<b63.v, Unit> {
    public d3(Object obj) {
        super(1, obj, kb0.r.class, "onSimpleBedTimeChanged", "onSimpleBedTimeChanged(Lkotlinx/datetime/LocalTime;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(b63.v vVar) {
        Object value;
        mb0.f fVar;
        int secondOfDay;
        int i14;
        b63.v vVar2 = vVar;
        vVar2.getClass();
        kb0.r rVar = (kb0.r) this.receiver;
        rVar.getClass();
        r53.p2 p2Var = rVar.f103807a;
        do {
            value = p2Var.getValue();
            fVar = (mb0.f) value;
            mb0.e eVar = fVar.f117730a;
            secondOfDay = vVar2.f16219a.toSecondOfDay();
            i14 = eVar.f117729b;
            eVar.getClass();
        } while (!p2Var.b(value, mb0.f.a(fVar, new mb0.e(secondOfDay, i14), null, null, null, null, 30)));
        return Unit.INSTANCE;
    }
}
