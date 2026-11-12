package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f1 extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public f1(Object obj) {
        super(0, obj, i21.d.class, "onNavigateToHelp", "onNavigateToHelp()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        Object value;
        Object value2;
        Integer num;
        Integer num2;
        Integer num3;
        i21.d dVar = (i21.d) this.receiver;
        r53.p2 p2Var = dVar.f87285q;
        x01.e eVar = (x01.e) dVar.f87281m.getValue();
        if ((eVar != null ? eVar.f188254c : null) == x01.f.ACTIVE) {
            g21.k kVar = dVar.f87283o;
            int iIntValue = 0;
            int iIntValue2 = (kVar == null || (num3 = kVar.f75442a) == null) ? 0 : num3.intValue();
            g21.k kVar2 = dVar.f87283o;
            int iIntValue3 = (kVar2 == null || (num2 = kVar2.f75444c) == null) ? 0 : num2.intValue();
            int i14 = iIntValue3 + iIntValue2;
            g21.k kVar3 = dVar.f87283o;
            if (kVar3 != null && (num = kVar3.f75443b) != null) {
                iIntValue = num.intValue();
            }
            int i15 = iIntValue;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, i21.c.a((i21.c) value2, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, new g21.j(true, iIntValue2, i15, iIntValue3, i14 - i15, i14), null, 3145727)));
        } else {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, i21.c.a((i21.c) value, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, true, null, null, 3670015)));
        }
        return Unit.INSTANCE;
    }
}
